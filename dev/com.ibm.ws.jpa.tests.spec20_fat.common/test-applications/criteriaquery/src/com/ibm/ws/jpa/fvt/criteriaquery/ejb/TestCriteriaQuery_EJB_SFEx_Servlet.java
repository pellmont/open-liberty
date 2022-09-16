/*******************************************************************************
 * Copyright (c) 2022 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package com.ibm.ws.jpa.fvt.criteriaquery.ejb;

import javax.annotation.PostConstruct;
import javax.servlet.annotation.WebServlet;

import org.junit.Test;

import com.ibm.ws.jpa.fvt.criteriaquery.testlogic.CriteriaQueryTestLogic;
import com.ibm.ws.testtooling.testinfo.JPAPersistenceContext;
import com.ibm.ws.testtooling.testinfo.JPAPersistenceContext.PersistenceContextType;
import com.ibm.ws.testtooling.testinfo.JPAPersistenceContext.PersistenceInjectionType;
import com.ibm.ws.testtooling.vehicle.web.EJBTestVehicleServlet;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/TestCriteriaQuery_EJB_SFEx_Servlet")
public class TestCriteriaQuery_EJB_SFEx_Servlet extends EJBTestVehicleServlet {

    @PostConstruct
    private void initFAT() {
        testClassName = CriteriaQueryTestLogic.class.getName();
        ejbJNDIName = "ejb/CriteriaQuerySFExEJB";

        jpaPctxMap.put("test-jpa-resource-cmex",
                       new JPAPersistenceContext("test-jpa-resource-cmex", PersistenceContextType.CONTAINER_MANAGED_ES, PersistenceInjectionType.JNDI, "java:comp/env/jpa/CRITERIAQUERY_CMEX"));
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_byte_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_byte_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_byte";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_Byte_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_Byte_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_Byte";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_char_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_char_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_char";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_Character_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_Character_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_Character";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_String_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_String_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_String";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_double_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_double_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_double";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_Double_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_Double_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_Double";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_float_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_float_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_float";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_Float_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_Float_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_Float";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_int_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_int_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_int";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_Integer_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_Integer_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_Integer";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_long_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_long_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_long";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_Long_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_Long_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_Long";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_short_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_short_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_short";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_Short_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_Short_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_Short";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_BigDecimal_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_BigDecimal_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_BigDecimal";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_BigInteger_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_BigInteger_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_BigInteger";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_JavaUtilDate_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_JavaUtilDate_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_JavaUtilDate";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }

    @Test
    public void jpa_spec20_criteria_query_testCriteriaQuery_JavaSqlDate_EJB_SFEx_CMTS_Web() throws Exception {
        final String testName = "jpa20_criteria_query_testCriteriaQuery_JavaSqlDate_EJB_SFEx_CMTS_Web";
        final String testMethod = "testCriteriaQuery_JavaSqlDate";
        final String testResource = "test-jpa-resource-cmex";
        executeTest(testName, testMethod, testResource);
    }
}