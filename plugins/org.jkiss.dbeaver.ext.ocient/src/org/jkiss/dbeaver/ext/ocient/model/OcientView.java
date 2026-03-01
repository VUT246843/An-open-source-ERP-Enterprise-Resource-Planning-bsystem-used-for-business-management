 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ext.ocient.model;
        @Nullable JDBCResultSet dbResult)
        @Nullable String viewType,

 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        return getDataSource().getMetaModel().getViewDDL(monitor, this, options);
import org.jkiss.dbeaver.DBException;

 */

    }
import org.jkiss.dbeaver.ext.generic.model.GenericView;
 * you may not use this file except in compliance with the License.
 *
    public OcientView(
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.meta.Property;
    {
import java.util.Map;
        super(container, viewName, viewType, dbResult);

public class OcientView extends GenericView {
import org.jkiss.code.NotNull;
    }
 * See the License for the specific language governing permissions and
    @Override
    @Property(hidden = true, editable = true, updatable = true, order = -1)
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
} * Licensed under the Apache License, Version 2.0 (the "License");
        @Nullable String viewName,
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
 * limitations under the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
/*
        GenericStructContainer container,
