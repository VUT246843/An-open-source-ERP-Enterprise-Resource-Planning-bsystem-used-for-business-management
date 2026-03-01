 * DBeaver - Universal Database Manager
        return null;
 * You may obtain a copy of the License at
    }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            indexType = OracleConstants.INDEX_TYPE_NORMAL;
import java.sql.SQLException;
    public void addColumn(OracleTableIndexColumn column) {
        } else if (OracleConstants.INDEX_TYPE_FUNCTION_BASED_NORMAL.getId().equals(indexTypeName)) {
        this.nonUnique = !unique;
    ) {
        return indexDDL;
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read index definition")) {

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.meta.LazyProperty;
        return OracleTablespace.resolveTablespaceReference(monitor, this, null);
                    getName(),

    @Property(viewable = true, order = 10)
    @NotNull
                );

    @Nullable
            }
}
 */
        } else if (OracleConstants.INDEX_TYPE_FUNCTION_BASED_BITMAP.getId().equals(indexTypeName)) {
    @Override
    public Object getTablespace(DBRProgressMonitor monitor) throws DBException {
    @Override
/**
                    getTable().getSchema().getName()
        super(schema, table, indexName, null, true);
        this.nonUnique = !"UNIQUE".equals(JDBCUtils.safeGetString(dbResult, "UNIQUENESS"));
public class OracleTableIndex extends JDBCTableIndex<OracleSchema, OracleTableBase>
        OracleTableBase table,

            columns = new ArrayList<>();
import java.util.ArrayList;
    public OracleDataSource getDataSource() {
    }
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    public OracleTableIndex(OracleSchema schema, OracleTableBase parent, String name, boolean unique, DBSIndexType indexType) {
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
        }
    }
    public String toString() {
 * OracleTableIndex
import org.jkiss.code.Nullable;
        this.nonUnique = !unique;
            indexType = OracleConstants.INDEX_TYPE_FUNCTION_BASED_NORMAL;
            } catch (SQLException e) {
        );
    private Object tablespace;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPScriptObject;
import org.jkiss.dbeaver.DBDatabaseException;
        OracleSchema schema,
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

package org.jkiss.dbeaver.ext.oracle.model;

        return !nonUnique;
        String indexName,

    }

        columns.add(column);
 * you may not use this file except in compliance with the License.
import java.util.Map;
    private boolean nonUnique;
 */
        if (indexDDL == null && isPersisted()) {
    @NotNull
    @Override
import org.jkiss.dbeaver.model.DBPNamedObject2;
        ResultSet dbResult
        return DBUtils.getFullQualifiedName(
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            indexType = OracleConstants.INDEX_TYPE_BITMAP;
import org.jkiss.dbeaver.model.meta.Property;
 *
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else if (OracleConstants.INDEX_TYPE_BITMAP.getId().equals(indexTypeName)) {
    public void setUnique(boolean unique) {

    public boolean isUnique() {

    public String getDescription() {
            indexType = DBSIndexType.OTHER;
    implements DBSObjectLazy, DBPScriptObject, DBPNamedObject2 {

 * See the License for the specific language governing permissions and
    void setColumns(List<OracleTableIndexColumn> columns) {

 * limitations under the License.
                throw new DBDatabaseException(e, getDataSource());

        return getFullyQualifiedName(DBPEvaluationContext.UI);
        String indexTypeName = JDBCUtils.safeGetString(dbResult, "INDEX_TYPE");
    @Nullable
    @Property(viewable = true, order = 5)

            indexType = OracleConstants.INDEX_TYPE_DOMAIN;
        } else if (OracleConstants.INDEX_TYPE_DOMAIN.getId().equals(indexTypeName)) {
 *
    public OracleTableIndex(
            this
import java.util.List;


            getDataSource(),
    @Nullable
    public Object getLazyReference(Object propertyId) {
            getTable().getContainer(),
import org.jkiss.dbeaver.model.DBPEvaluationContext;

    }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
    @Association
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableIndex;
        }

                indexDDL = JDBCUtils.queryString(session, "SELECT DBMS_METADATA.GET_DDL('INDEX', ?, ?) TXT FROM DUAL",

import org.jkiss.dbeaver.model.meta.Association;
 *
    @Override
import org.jkiss.dbeaver.DBException;
        return DBUtils.findObject(columns, columnName);
    private String indexDDL;
    }
        return tablespace;
        this.columns = columns;
            indexType = OracleConstants.INDEX_TYPE_FUNCTION_BASED_BITMAP;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        this.tablespace = JDBCUtils.safeGetString(dbResult, "TABLESPACE_NAME");
    }
    @Override
    @NotNull
import org.jkiss.dbeaver.model.struct.DBSObjectLazy;
    }
        return getTable().getDataSource();
        if (columns == null) {
import org.jkiss.dbeaver.model.DBUtils;
        return columns;
    }
    }
    }
    private List<OracleTableIndexColumn> columns;
        if (OracleConstants.INDEX_TYPE_NORMAL.getId().equals(indexTypeName)) {
    @LazyProperty(cacheValidator = OracleTablespace.TablespaceReferenceValidator.class)
        } else {
    @Override

        super(schema, parent, name, indexType, false);
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
import java.sql.ResultSet;
    public List<OracleTableIndexColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {
    }
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    public OracleTableIndexColumn getColumn(String columnName) {
/*
