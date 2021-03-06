/*
 *   Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.carbon.identity.application.authentication.framework;

import org.wso2.carbon.identity.application.authentication.framework.exception.UserSessionException;

import java.util.List;

/**
 * This is an interface used to define the session management service operations.
 */
public interface UserSessionManagementService {

    /**
     * This method is used to terminate all the active sessions of a given user.
     *
     * @param sessionIdList         name of the user
     * @return
     * @throws UserSessionException
     */
    boolean terminateSession(List<String> sessionIdList) throws UserSessionException;

    /**
     *
     * @param sessionId
     * @return
     * @throws UserSessionException
     */
    boolean terminateASession(String sessionId) throws UserSessionException;

}