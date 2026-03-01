 * distributed under the License is distributed on an "AS IS" BASIS,
 * Data source provider descriptor

 * you may not use this file except in compliance with the License.
    boolean matchesId(String id);
import org.jkiss.dbeaver.model.DBPNamedObject;

 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @Nullable
 * DBeaver - Universal Database Manager
    List<? extends DBPDriver> getDrivers();


/**
    // Returns true if this provider or one of parent providers has specified ID
    List<DBPDataSourceProviderDescriptor> getChildrenProviders();

 */
 * You may obtain a copy of the License at
    DBPDataSourceProviderDescriptor getParentProvider();
 *     http://www.apache.org/licenses/LICENSE-2.0
    DBPImage getIcon();
    @NotNull
import java.util.List;
}


    String getDescription();
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeDescriptor;
import org.jkiss.dbeaver.model.DBPImage;
    String getPluginId();
 *
    List<? extends DBPDriver> getEnabledDrivers();

    boolean isDriversManageable();

public interface DBPDataSourceProviderDescriptor extends DBPNamedObject {
    DBPDriver getDriver(@NotNull String id);
package org.jkiss.dbeaver.model.connection;


import org.jkiss.code.Nullable;
 * limitations under the License.
    boolean isTemporary();
 * See the License for the specific language governing permissions and

 *
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 */
 *

    @NotNull

    SQLDialectMetadata getScriptDialect();
    DBXTreeDescriptor getTreeDescriptor();
    String getId();

import org.jkiss.code.NotNull;

 * Copyright (C) 2010-2025 DBeaver Corp and others
