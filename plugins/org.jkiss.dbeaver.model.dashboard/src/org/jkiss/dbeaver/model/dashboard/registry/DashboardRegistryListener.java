 */
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;

 *

public interface DashboardRegistryListener {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    void handleItemCreate(@NotNull DashboardItemConfiguration item);
/**
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.dashboard.registry;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.

 * limitations under the License.
/*
 * Dashboard config listener
 *
 * Unless required by applicable law or agreed to in writing, software
 *

    void handleItemDelete(@NotNull DashboardItemConfiguration item);
