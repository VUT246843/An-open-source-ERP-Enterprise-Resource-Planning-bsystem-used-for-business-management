 *     http://www.apache.org/licenses/LICENSE-2.0

 * Copyright (C) 2010-2024 DBeaver Corp and others

    default void handleRegistryReload() {
 * DBeaver - Universal Database Manager

 *
 * See the License for the specific language governing permissions and
public interface DBPRegistryListener {
    }

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.app;

        // do nothing by default
 * DBPRegistryListener
 */
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 */
 * Unless required by applicable law or agreed to in writing, software
    default void handleRegistryLoad(@NotNull DBPDataSourceRegistry registry) {
 * limitations under the License.

    default void handleRegistryUnload(@NotNull DBPDataSourceRegistry registry) {
        // do nothing by default

        // do nothing by default
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
}
    }
 *
    }
/**
 * You may obtain a copy of the License at
