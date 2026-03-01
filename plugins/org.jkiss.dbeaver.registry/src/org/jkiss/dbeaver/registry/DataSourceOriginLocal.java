 *
    }

    public Map<String, Object> getDataSourceConfiguration() {
        return "Local";
    @Nullable

 * DataSourceOriginProviderLocal
        return Collections.emptyMap();
 * you may not use this file except in compliance with the License.
import java.util.Collections;
    @Override

 * See the License for the specific language governing permissions and

    private DataSourceOriginLocal() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override


/**
import org.jkiss.dbeaver.DBException;
    }
import org.jkiss.code.NotNull;
        return null;
 */
 *     http://www.apache.org/licenses/LICENSE-2.0

        return DBIcon.TREE_FILE;

    @NotNull
package org.jkiss.dbeaver.registry;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return false;
 * DBeaver - Universal Database Manager
{

    public boolean isDynamic() {
        return ORIGIN_ID;
    public String getDisplayName() {
    }
    public String getType() {
        return getType();
    public String toString() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
public class DataSourceOriginLocal implements DBPDataSourceOrigin
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
    @Override
 *
    @NotNull

import org.jkiss.dbeaver.model.*;
    public static final String ORIGIN_ID = "local";
import org.jkiss.code.Nullable;
    @Nullable
    }
    @Nullable
    @Override
import org.jkiss.dbeaver.model.auth.SMSessionContext;

 *

    public DBPObject getObjectDetails(@NotNull DBRProgressMonitor monitor, @NotNull SMSessionContext sessionContext, @NotNull DBPDataSourceContainer dataSource) throws DBException {
    }
    @Override
    }
    public static final DBPDataSourceOrigin INSTANCE = new DataSourceOriginLocal();
    @Override
 * You may obtain a copy of the License at
}

import java.util.Map;
    @Override
/*
    public DBPImage getIcon() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * limitations under the License.
 */

    }
 * Unless required by applicable law or agreed to in writing, software
    public String getSubType() {
    }
    @Override
    }
