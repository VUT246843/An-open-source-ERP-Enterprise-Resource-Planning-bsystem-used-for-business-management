 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface SMAuthCredentialsManager {
 *
    /**
/**
 * Keeps user credentials and provides low-level authentication mechanisms
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    Map<String, Object> getUserCredentials(String userId, String authProviderId) throws DBException;


 * Credentials manager.
     */
 * See the License for the specific language governing permissions and
 */
package org.jkiss.dbeaver.model.auth;

import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 */
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Get user credentials for specified provider
 *
/*
import java.util.Map;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * limitations under the License.
}

