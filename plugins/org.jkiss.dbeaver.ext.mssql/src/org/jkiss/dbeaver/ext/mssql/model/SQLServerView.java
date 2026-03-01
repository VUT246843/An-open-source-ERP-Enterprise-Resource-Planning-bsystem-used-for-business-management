        return null;
    @Nullable
                String createOrAlter = getDataSource().isAtLeastV16() ? "CREATE OR ALTER" : "ALTER";

    {
    {
import org.jkiss.dbeaver.model.struct.rdb.DBSView;
        return true;
        return null;
}

 *
    {
    public void setObjectDefinitionText(String source) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;
        super(catalog, dbResult, name);
                return col;
import org.jkiss.dbeaver.model.struct.DBSObject;
    public SQLServerView(SQLServerSchema schema)
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
public class SQLServerView extends SQLServerTableBase implements DBSView {
            if (isPersisted()) {
        this.ddl = source;
            }
    @Override
    public DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
    {
        return columns;
    public SQLServerView(@NotNull SQLServerSchema catalog, @NotNull ResultSet dbResult, @NotNull String name) {
 * limitations under the License.
    {
    public Collection<SQLServerTableForeignKey> getReferences(@NotNull DBRProgressMonitor monitor)
    }

    {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<SQLServerTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor)
    }
        return ddl;
    public SQLServerTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull long columnId)
    }
    boolean supportsTriggers() {
        for (SQLServerTableColumn col : getAttributes(monitor)) {

        throws DBException
        this.ddl = null;
        List<SQLServerTableColumn> columns = new ArrayList<>(childColumns);
        return super.refreshObject(monitor);
    @Override
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    @Association
 * DBeaver - Universal Database Manager
    @Override
            ddl = null;
import org.jkiss.dbeaver.model.DBPScriptObject;
    public Collection<SQLServerTableForeignKey> getAssociations(@NotNull DBRProgressMonitor monitor)

    @NotNull
            } else {
        columns.sort(DBUtils.orderComparator());
        throws DBException
        }
        return null;
/**
 *
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        log.error("Column '" + columnId + "' not found in table '" + getFullyQualifiedName(DBPEvaluationContext.DML) + "'");
        List<SQLServerTableColumn> childColumns = getContainer().getTableCache().getChildren(monitor, getContainer(), this);
        return true;
import org.jkiss.dbeaver.model.meta.Association;
    @Property(hidden = true, editable = true, updatable = true, order = -1)
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * you may not use this file except in compliance with the License.

    }
    public Collection<SQLServerTableUniqueKey> getConstraints(@NotNull DBRProgressMonitor monitor)
    {

        super(schema);

    }
                ddl = createOrAlter + "VIEW " + this.getFullyQualifiedName(DBPEvaluationContext.DDL) + " AS\n";
    @Override
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
    @Override
        }
    @Override
        }
    @Override
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (ddl == null) {
    @Override
    @Override
    {

/*
 *
 */
        return false;
    }


    }
            return Collections.emptyList();
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.utils.CommonUtils;
    }
    }
        return ddl;
        throws DBException
        return getContainer().getTableCache().getChild(monitor, getContainer(), this, attributeName);
package org.jkiss.dbeaver.ext.mssql.model;
                ddl = SQLServerUtils.changeCreateToAlterDDL(getDataSource(), ddl1);
    public boolean supportsObjectDefinitionOption(@NotNull String option) {
        if (childColumns == null) {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.meta.Property;

    private static final Log log = Log.getLog(SQLServerView.class);
            }
    @Override
        throws DBException
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
import java.sql.ResultSet;
 * distributed under the License is distributed on an "AS IS" BASIS,


    {
    public boolean isView()
        return null;
        return null;


import java.util.*;
 */
    public String getDDL() {
        throws DBException
import org.jkiss.dbeaver.DBException;


    private String ddl;
 * SQLServerView
import org.jkiss.code.NotNull;
    }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
            if (col.getObjectId() == columnId) {
    public Collection<SQLServerTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor)

        if (CommonUtils.getOption(options, DBPScriptObject.OPTION_REFRESH)) {
    @Association
    @Association

        }
    public SQLServerTableColumn getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName)
        throws DBException
        throws DBException
    }

                String ddl1 = SQLServerUtils.extractSource(monitor, this);
    }
