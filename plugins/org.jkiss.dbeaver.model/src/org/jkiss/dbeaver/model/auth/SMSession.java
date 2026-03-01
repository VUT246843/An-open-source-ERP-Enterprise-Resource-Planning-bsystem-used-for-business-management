
 * Licensed under the Apache License, Version 2.0 (the "License");
public interface SMSession extends DBPObject {
     * Session start datetime


 * DBeaver - Universal Database Manager
     */

 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    @NotNull
     * Session space


    /**
 * limitations under the License.
    /**
     * Session unique ID
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 *
     */
     * It mustn't throw any errors.
     * Closes session.
     */
    /**
}

    SMSessionContext getSessionContext();
/**
    String getSessionId();

    SMAuthSpace getSessionSpace();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Access session.
 */
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
 * You may obtain a copy of the License at
    SMSessionPrincipal getSessionPrincipal();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
/*

import java.time.LocalDateTime;

 *
import org.jkiss.code.NotNull;
 *
    void close();
     */
 */
    @Nullable
    LocalDateTime getSessionStart();
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPObject;
package org.jkiss.dbeaver.model.auth;
