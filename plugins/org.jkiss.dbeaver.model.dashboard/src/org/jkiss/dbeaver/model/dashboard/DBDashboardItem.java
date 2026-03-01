import org.jkiss.dbeaver.model.DBPNamedObject;
 *
    @NotNull
}

 */
import org.jkiss.dbeaver.model.dashboard.registry.DashboardProviderDescriptor;

    String getDisplayName();
    String getTitle();
    @NotNull


 *
    String getName();

/**
     */
    @Nullable

    String getDashboardRenderer();
import org.jkiss.code.NotNull;
    boolean isCustom();
 *


 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    String getDescription();
    @Nullable
import org.jkiss.code.Nullable;
public interface DBDashboardItem extends DBPNamedObject {
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
    DashboardProviderDescriptor getDashboardProvider();
 * you may not use this file except in compliance with the License.
    /**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * Dashboard
    String getId();


 */
     * Custom name displayed in chart composite
    @Nullable
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    String getPath();
    @NotNull
/*
    @NotNull

package org.jkiss.dbeaver.model.dashboard;
 *     http://www.apache.org/licenses/LICENSE-2.0

