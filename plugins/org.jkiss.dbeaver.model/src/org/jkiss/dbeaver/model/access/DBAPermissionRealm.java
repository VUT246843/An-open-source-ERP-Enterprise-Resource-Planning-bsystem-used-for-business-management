     */

    /**
 * Permission realm
     * Access to private resources (e.g. private project)

     */


/**
 */
    String PERMISSION_ADMIN = "admin";

}
    /**
 * you may not use this file except in compliance with the License.
 *

 * DBeaver - Universal Database Manager
 *
    String PERMISSION_PUBLIC = "public";
    /**
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at

public interface DBAPermissionRealm {
     * Access to all public API for authorized users
    boolean hasRealmPermission(@NotNull String permission);
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
    boolean supportsRealmFeature(@NotNull String feature);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String PERMISSION_PRIVATE_OWNER = "private";
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
 */
/*
 * See the License for the specific language governing permissions and
     * Admin access to all API
package org.jkiss.dbeaver.model.access;
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
