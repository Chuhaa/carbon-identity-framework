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

import org.apache.commons.lang.StringUtils;
import org.wso2.carbon.identity.application.authentication.framework.services.SessionManagementService;

import java.util.List;

/**
 * This a service class used to manage user sessions.
 */
public class UserSessionManagementServiceImpl implements UserSessionManagementService {

    private SessionManagementService sessionManagementService = new SessionManagementService();

    @Override
    public boolean terminateSession(List<String> sessionIdList) {
        for (String sessionId : sessionIdList) {
            if (!StringUtils.isBlank(sessionId)) {
                sessionManagementService.removeSession(sessionId);
            }
        }
        return true;
    }

    @Override
    public boolean terminateASession(String sessionId) {
        sessionManagementService.removeSession(sessionId);
        return true;
    }
}