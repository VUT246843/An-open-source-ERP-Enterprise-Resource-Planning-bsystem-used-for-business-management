 * you may not use this file except in compliance with the License.
    @Nullable
    }
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;

package org.jkiss.dbeaver.ext.databend;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.DBPDataSource;

    public DatabendDataSourceProvider() {
public class DatabendDataSourceProvider extends GenericDataSourceProvider implements DBPInformationProvider {
        }

            return ((DBPDataSourceContainer) object).getConnectionConfiguration().getServerName();
import org.jkiss.dbeaver.ext.generic.GenericDataSourceProvider;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
            @NotNull DBRProgressMonitor monitor,
 *
import org.jkiss.dbeaver.model.DBPInformationProvider;
    }
 * DBeaver - Universal Database Manager
            @NotNull DBPDataSourceContainer container)
 *     http://www.apache.org/licenses/LICENSE-2.0

 *
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software
    @NotNull
    }

import org.jkiss.dbeaver.ext.databend.model.DatabendDataSource;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return new DatabendDataSource(monitor, container, new DatabendMetaModel());
    public String getObjectInformation(@NotNull DBPObject object, @NotNull String infoType) {
import org.jkiss.dbeaver.ext.databend.model.DatabendMetaModel;
import org.jkiss.dbeaver.model.DBPObject;
    public DBPDataSource openDataSource(
 *
 * See the License for the specific language governing permissions and
            throws DBException {
    @Override
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (object instanceof DBPDataSourceContainer && infoType.equals(INFO_TARGET_ADDRESS)) {
 * distributed under the License is distributed on an "AS IS" BASIS,

/*
    @Override
 */
