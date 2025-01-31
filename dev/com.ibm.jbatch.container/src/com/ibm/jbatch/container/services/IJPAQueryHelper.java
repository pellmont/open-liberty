/*******************************************************************************
 * Copyright (c) 2017 IBM Corporation and others.
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
package com.ibm.jbatch.container.services;

import java.util.Set;

import javax.persistence.TypedQuery;

import com.ibm.jbatch.container.persistence.jpa.JobInstanceEntity;

/**
 * Helper to translate search parameters into usable JPQL
 */
public interface IJPAQueryHelper {

    /**
     * Base Query String
     */
    final String DEFAULT_QUERY = "SELECT x from JobInstanceEntity x ORDER BY x.createTime DESC";

    /**
     * Get the JPQL query string
     */
    String getQuery();

    /**
     * Populate the query parameters
     */
    void setQueryParameters(TypedQuery<JobInstanceEntity> query);

    /**
     * Set a query issuer id to handle authorization
     */
    void setQueryIssuer(String queryIssuer);

    /**
     * @param groupsForSubject
     */
    void setGroups(Set<String> groupsForSubject);

}
