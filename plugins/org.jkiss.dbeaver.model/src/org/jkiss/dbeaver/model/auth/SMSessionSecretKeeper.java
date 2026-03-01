    DBSSecretController getSecretController() throws DBException;
 * Unless required by applicable law or agreed to in writing, software
}
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 *
package org.jkiss.dbeaver.model.auth;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
/**
public interface SMSessionSecretKeeper extends SMSession {
import org.jkiss.dbeaver.DBException;
     * Associated secret controller
import org.jkiss.dbeaver.model.secret.DBSSecretController;



    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
    @Nullable
 */

 * DBeaver - Universal Database Manager
 *
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * Provides access to secret controller
