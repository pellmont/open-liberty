/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.testapp.g3store.exception;

/**
 * @author anupag
 *
 */
public class NotFoundException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructor for this exception
     * 
     * @param msg
     */
    public NotFoundException(String msg) {
        super(msg);
    }

    public NotFoundException() {
        super();
    }

    public NotFoundException(Throwable t) {
        super(t);
    }

    public NotFoundException(String msg, Throwable t) {
        super(msg, t);
    }
}
