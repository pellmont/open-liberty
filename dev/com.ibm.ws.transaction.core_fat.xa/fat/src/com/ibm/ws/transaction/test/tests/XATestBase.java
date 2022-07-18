/*******************************************************************************
 * Copyright (c) 2020, 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.transaction.test.tests;

import static org.junit.Assert.assertNotNull;

import com.ibm.tx.jta.ut.util.XAResourceImpl;
import com.ibm.websphere.simplicity.ShrinkHelper;

import componenttest.topology.impl.LibertyServer;
import componenttest.topology.utils.FATServletClient;
import componenttest.topology.utils.HttpUtils;

/**
 *
 */
public class XATestBase {

    LibertyServer _server;
    String _app;
    String _servlet;

    /**
     * @param server
     * @param servletName
     * @param appName
     * @throws Exception
     */
    public XATestBase(LibertyServer server, String appName, String servletName) throws Exception {
        _server = server;
        _app = appName;
        _servlet = servletName;

        ShrinkHelper.defaultApp(_server, _app, "com.ibm.ws.transaction.web.*");

        _server.setServerStartTimeout(300000);
        _server.startServer();
    }

    /**
     * @param server
     * @throws Exception
     */
    public void tearDown() throws Exception {
        _server.stopServer("WTRN0075W", "WTRN0076W"); // Stop the server and indicate the '"WTRN0075W", "WTRN0076W" error messages were expected
        ShrinkHelper.cleanAllExportedArchives();
    }

    /**
     * @param server
     * @param servletName
     * @param testName
     * @throws Exception
     */
    public void testSetTransactionTimeoutReturnsTrue() throws Exception {
        _server.setMarkToEndOfLog();
        HttpUtils.findStringInReadyUrl(_server, FATServletClient.getPathAndQuery(_servlet, "testSetTransactionTimeoutReturnsTrue"), FATServletClient.SUCCESS);
        assertNotNull(_server.waitForStringInLogUsingMark(XAResourceImpl.class.getCanonicalName() + ".setTransactionTimeout\\([0-9]*\\): TRUE"),
                      "setTransactionTimeout() does not seem to have been called");
    }

    /**
     * @param server
     * @param servletName
     * @param testName
     * @throws Exception
     */
    public void testSetTransactionTimeoutReturnsFalse() throws Exception {
        _server.setMarkToEndOfLog();
        HttpUtils.findStringInReadyUrl(_server, FATServletClient.getPathAndQuery(_servlet, "testSetTransactionTimeoutReturnsFalse"), FATServletClient.SUCCESS);
        assertNotNull(_server.waitForStringInLogUsingMark(XAResourceImpl.class.getCanonicalName() + ".setTransactionTimeout\\([0-9]*\\): FALSE"),
                      "setTransactionTimeout() does not seem to have been called");
    }

    /**
     * @param server
     * @param servletName
     * @param testName
     * @throws Exception
     */
    public void testSetTransactionTimeoutThrowsException() throws Exception {
        _server.setMarkToEndOfLog();
        HttpUtils.findStringInReadyUrl(_server, FATServletClient.getPathAndQuery(_servlet, "testSetTransactionTimeoutThrowsException"), FATServletClient.SUCCESS);
        assertNotNull(_server.waitForStringInLogUsingMark(XAResourceImpl.class.getCanonicalName() + ".setTransactionTimeout\\([0-9]*\\): javax.transaction.xa.XAException"),
                      "setTransactionTimeout() does not seem to have been called");
    }
}