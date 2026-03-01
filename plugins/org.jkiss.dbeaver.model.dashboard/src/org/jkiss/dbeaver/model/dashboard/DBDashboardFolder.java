 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.dashboard;
    @Nullable
    List<DashboardItemConfiguration> loadDashboards(@NotNull DBRProgressMonitor monitor, @NotNull DBDashboardContext context)

 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPImage;
    DBPImage getIcon();

/*
    List<DBDashboardFolder> loadSubFolders(@NotNull DBRProgressMonitor monitor, @NotNull DBDashboardContext context)


import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
 *
    @NotNull

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
}
    boolean containsDashboards();
    @NotNull
    String getDescription();

    String getName();
    String getId();
import org.jkiss.dbeaver.model.DBPNamedObject;
 *
import org.jkiss.dbeaver.DBException;
/**
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
        throws DBException;
 * Dashboard folder

 *
 */
        throws DBException;
    @Nullable
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 */

import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
import java.util.List;
 * limitations under the License.
    @Nullable



public interface DBDashboardFolder extends DBPNamedObject {


    @NotNull
 * See the License for the specific language governing permissions and
    DBDashboardFolder getParent();
