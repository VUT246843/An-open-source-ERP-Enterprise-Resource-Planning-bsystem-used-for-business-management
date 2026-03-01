/**

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
 * limitations under the License.
 * You may obtain a copy of the License at

     */

package org.jkiss.dbeaver.model;

import org.jkiss.code.NotNull;
/*
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
    boolean isDefault();
    // Used for secure credentials save/load (it is a prt of credentials file name)
 *
 */
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    String getStorageId();
}

 * you may not use this file except in compliance with the License.
        return getStorageId();
 * DBeaver - Universal Database Manager

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    boolean isVirtual();
public interface DBPDataSourceConfigurationStorage {

 * Unless required by applicable law or agreed to in writing, software
     * Checks if configuration storage is virtual

    @Nullable
    String getStorageSubId();
 * Provided data source configuration storage
    default String getStorageName() {
    boolean isValid();

