    }
            ddl = isPersisted() ? getDataSource().getMetaModel().getViewDDL(monitor, this, options) : "";
}
 * limitations under the License.
    }
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
        @Nullable String tableType,
 * DBeaver - Universal Database Manager
    @Override
        super(container, tableName, tableType, dbResult);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.utils.CommonUtils;

 * distributed under the License is distributed on an "AS IS" BASIS,
        ddl = null;

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        return ddl;
import java.util.Map;
        }
    }
package org.jkiss.dbeaver.ext.generic.model;
import org.jkiss.dbeaver.model.DBPScriptObject;
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
    }

        this.ddl = source;
        if (ddl == null) {
    }
 * See the License for the specific language governing permissions and
    public void setObjectDefinitionText(String source) {
/**

        return super.refreshObject(monitor);
        @Nullable JDBCResultSet dbResult)
        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_REFRESH)) {
    public boolean isView()
        return true;
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    public String getDDL() {
 */
    }
    @Override
        }
        GenericStructContainer container,
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

 *
            ddl = null;
public class GenericView extends GenericTableBase implements DBSObjectWithScript, DBSView {


    {
        return ddl;
    private String ddl;
 *
 * You may obtain a copy of the License at

        @Nullable String tableName,
 */

 * Generic view
    @NotNull
import org.jkiss.code.Nullable;
/*
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    {
    public GenericView(
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
