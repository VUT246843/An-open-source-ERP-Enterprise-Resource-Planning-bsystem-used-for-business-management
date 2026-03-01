
public interface DBWHandlerRegistry {
    List<? extends DBWHandlerDescriptor> getDescriptors(@NotNull DBPDriver driver);
    @NotNull

    List<? extends DBWHandlerDescriptor> getDescriptors();
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.Nullable;
 */
/**
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
 *
 * limitations under the License.
package org.jkiss.dbeaver.model.net;

    @NotNull
    DBWHandlerDescriptor getDescriptor(@NotNull String id);
/*
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    List<? extends DBWHandlerDescriptor> getDescriptors(@NotNull DBPDataSourceContainer dataSource);
 * You may obtain a copy of the License at

 */

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Network handler registry
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import java.util.List;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.connection.DBPDriver;

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
}
