/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
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

package com.ibm.websphere.sib.exception;

/**
 * SIDataGraphException is thrown when there is a condition which prevents an
 * SDO DataGraph from being created by the SIDataGraphFactory.
 * <p>
 * The context and root cause of the problem are detailed in the chain of linked
 * Exceptions contained by the SIDataGraphException.
 *
 * @ibm-was-base
 * @ibm-api
 */
public class SIDataGraphException extends SIException {

  private static final long serialVersionUID = -3461309841760131370L;

  public SIDataGraphException() {
    super();
  }

  /**
   * Constructor for when the Exception is to be thrown because another
   * Exception has been caught during the copy.
   *
   * @param cause The original Throwable which has caused this to be thrown.
   */
  public SIDataGraphException(Throwable cause) {
    super(cause);
  }

  /**
   * Constructor for when the Exception is to be thrown for a reason other than
   * that an Exception has been caught during the copy.
   *
   * @param message A String giving information about the problem which caused this to be thrown.
   */
  public SIDataGraphException(String message) {
    super(message);
  }

  /**
   * Constructor for when the Exception is to be thrown because another
   * Exception has been caught during the copy and additional information is
   * to be included.
   *
   * @param message A String giving information about the problem which caused this to be thrown.
   * @param cause The original Throwable which has caused this to be thrown.
   */
  public SIDataGraphException(String message, Throwable cause) {
    super(message, cause);
  }
}
