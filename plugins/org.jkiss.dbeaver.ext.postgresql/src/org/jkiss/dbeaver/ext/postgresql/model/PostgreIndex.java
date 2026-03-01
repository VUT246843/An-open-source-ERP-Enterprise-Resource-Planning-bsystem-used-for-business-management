    private long indexId;
        }


import org.jkiss.dbeaver.model.DBPEvaluationContext;


        this.columns = columns;


            this.predicateExpression = JDBCUtils.safeGetString(dbResult, "pred_expr");
    @NotNull
    public PostgreAccessMethod getAccessMethod(DBRProgressMonitor monitor) throws DBException {
        return columns;
    @Property(viewable = false, order = 22)
        this.isClustered = JDBCUtils.safeGetBoolean(dbResult, "indisclustered");
    private transient boolean isPrimaryKeyIndex;
            this.indexNumScans = JDBCUtils.safeGetLong(dbResult, "index_num_scans");
 * you may not use this file except in compliance with the License.
    @Property(viewable = false, order = 21)
        return isClustered;
        return predicateExpression;
    }
        this.isValid = srcIndex.isValid;
    }
            } catch (SQLException e) {

import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableIndex;
    private boolean isPrimary; // Primary index - implicit
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    private long amId;

import java.util.Map;
        }
        return description;
    public void setObjectDefinitionText(String sourceText) {
    @Property(viewable = false, order = 29)

    public String toString() {
            this);

        return indexRelSize;
            setName(srcIndex.getName() + "_" + postfix);
            parent,
    public long getObjectId() {
        this.isImmediate = srcIndex.isImmediate;
    public boolean isValid() {
        this.amId = JDBCUtils.safeGetLong(dbResult, "relam");
    }
        isUnique = unique;
    private long indexNumScans;


        this.description = srcIndex.description;
    private boolean isUnique;
            this.indexRelSize = JDBCUtils.safeGetLong(dbResult, "index_rel_size");
    @Property(viewable = false, order = 24)
        return DBUtils.getFullQualifiedName(getDataSource(),
        this.isImmediate = JDBCUtils.safeGetBoolean(dbResult, "indimmediate");
    private boolean isCheckXMin;
    @Override
    }
    public DBSIndexType getIndexType() {
    @Override
    private String predicateExpression;
    @Override
    }

    public boolean isPrimary() {
        if (getDataSource().isServerVersionAtLeast(7, 4)) {
            parent.getContainer().getSchema(),
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        return PostgreUtils.getObjectById(monitor, getTable().getDatabase().accessMethodCache, getTable().getDatabase(), amId);
    @Property(viewable = false, order = 26)
        if (getDataSource().getServerType().supportsRelationSizeCalc()) {
        this.isCheckXMin = srcIndex.isCheckXMin;
public class PostgreIndex extends JDBCTableIndex<PostgreSchema, PostgreTableBase>
    @NotNull
            indexName,
        return super.getIndexType();
    public PostgreIndex(DBRProgressMonitor monitor, PostgreTable owner, PostgreIndex srcIndex) throws DBException {
            }
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

 * See the License for the specific language governing permissions and
/**
    public long getIndexNumScans() {
        return getDatabase().getTablespace(monitor, tablespaceId);

 * DBeaver - Universal Database Manager
    public void addColumn(PostgreIndexColumn column) {
        this.isPrimary = JDBCUtils.safeGetBoolean(dbResult, "indisprimary");
    private long tablespaceId;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
        }

import java.util.ArrayList;
    }
        if (indexDDL == null && isPersisted()) {


    }
    }
import java.sql.ResultSet;


        return isImmediate;
        return isUnique;
    @Nullable
        int postfix = 1;
    public long getIndexRelSize() {
import org.jkiss.code.Nullable;
            PostgreTableConstraintBase ownerConstraint = parent.getConstraint(monitor, getName());
    public String getPredicateExpression() {
        this.isPrimary = srcIndex.isPrimary;
        return getName() + "(" + columns + ")";
    @Nullable
        super(parent.getContainer().getSchema(), parent, name, indexType, false);
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBUtils;
        this.isReady = srcIndex.isReady;
    @Property(viewable = true, order = 31)
        if (amId <= 0) {
import org.jkiss.utils.ByteNumberFormat;
        this.tablespaceId = JDBCUtils.safeGetLong(dbResult, "reltablespace");
    @Property(viewable = true, order = 27)

package org.jkiss.dbeaver.ext.postgresql.model;

    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
            this.columns.add(new PostgreIndexColumn(monitor, this, sourceColumn));
import org.jkiss.dbeaver.model.meta.Property;
    private boolean isValid;
    @Property(hidden = true, editable = true, updatable = true, order = -1)
    @Property(viewable = true, order = 5)
import org.jkiss.dbeaver.model.DBPNamedObject2;
        return getTable().getDatabase();
        this.isReady = JDBCUtils.safeGetBoolean(dbResult, "indisready");
        this.indexId = JDBCUtils.safeGetLong(dbResult, "indexrelid");
    public PostgreIndex(PostgreTableBase parent, String name, DBSIndexType indexType, boolean unique) {
    public boolean isExclusion() {
        }
        super(owner.getSchema(), owner, srcIndex, false);
    }
        return getTable().getDataSource();
        for (PostgreIndexColumn sourceColumn : CommonUtils.safeCollection(srcIndex.getAttributeReferences(monitor))) {

    private transient String indexDDL;
        }
}
    }
    }
    }
    private long indexRelSize;
            if (ownerConstraint != null && ownerConstraint.getConstraintType().isUnique()) {
        return isExclusion;
    @Nullable
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            columns = new ArrayList<>();
import org.jkiss.dbeaver.DBDatabaseException;

    }
        return indexId;
    public boolean isHidden() {
        //return isPrimaryKeyIndex;

    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    public boolean isClustered() {
        this.isCheckXMin = JDBCUtils.safeGetBoolean(dbResult, "indcheckxmin");
    @Override

/*
    }
    }

        return isValid;
    public boolean isUnique() {
        }
        this.isUnique = JDBCUtils.safeGetBoolean(dbResult, "indisunique");
    private List<PostgreIndexColumn> columns = new ArrayList<>();
                indexDDL = JDBCUtils.queryString(session, "SELECT pg_catalog.pg_get_indexdef(?)", indexId);
        return isPrimaryKeyIndex;
        return indexNumScans;
 * Unless required by applicable law or agreed to in writing, software
        if (columns == null) {
        this.isUnique = unique;
import org.jkiss.code.NotNull;
        }
        return isPrimary;

        return false;
            return null;
import org.jkiss.dbeaver.DBException;
    }
        this.isClustered = srcIndex.isClustered;
    }
 */
    @Override


 * limitations under the License.
 *
    }
        return isReady;

        PostgreSchema.IndexCache cache = owner.getSchema().getIndexCache();
    public void setUnique(boolean unique) {
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
    }
    @Override
    }
    @Override

            DBSIndexType.UNKNOWN,
    private boolean isReady;
        this.isExclusion = JDBCUtils.safeGetBoolean(dbResult, "indisexclusion");
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public PostgreDataSource getDataSource() {
        this.isExclusion = srcIndex.isExclusion;
    private String description;
    @Property(viewable = false, order = 20)
    public List<PostgreIndexColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) {
    @Override
    @Property(viewable = true, order = 28, formatter = ByteNumberFormat.class)
        columns.add(column);


    public String getDescription() {
    @Property(viewable = false, order = 25)
        }
            }
        }
        this.description = JDBCUtils.safeGetString(dbResult, "description");
 * Licensed under the Apache License, Version 2.0 (the "License");
    private boolean isImmediate;
import java.util.List;

    @Override

    void setColumns(List<PostgreIndexColumn> columns) {
    public boolean isReady() {
    public PostgreIndexColumn getColumn(String columnName) {
    private boolean isExclusion;
    @Override
        // Unique key indexes (including PK) are implicit. We don't want to show them separately
    }
 * PostgreIndex
    }
            postfix++;
    }

    public PostgreDatabase getDatabase() {
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
    }
    }
    @Property(viewable = false, order = 23)
        return indexDDL;
 *
    public boolean isImmediate() {
    public PostgreTablespace getTablespace(DBRProgressMonitor monitor) throws DBException {
                this.isPrimaryKeyIndex = true;

                throw new DBDatabaseException(e, getDataSource());
        if (this.isUnique) {
import java.sql.SQLException;
    }


    public PostgreIndex(DBRProgressMonitor monitor, PostgreTableBase parent, String indexName, ResultSet dbResult) throws DBException {
        this.isUnique = srcIndex.isUnique;
    private boolean isClustered;
            getTable().getContainer(),
        implements PostgreObject, PostgreScriptObject, DBPHiddenObject, DBPNamedObject2 {
    }
import org.jkiss.utils.CommonUtils;
    @NotNull
            return getDatabase().getDefaultTablespace(monitor);
        while (cache != null && cache.getObject(monitor, owner.getSchema(), getName()) != null) {
    @Property(viewable = true, order = 30)
 * You may obtain a copy of the License at
        if (tablespaceId <= 0) {
        return DBUtils.findObject(columns, columnName);
        this.isValid = JDBCUtils.safeGetBoolean(dbResult, "indisvalid");
import org.jkiss.dbeaver.model.meta.PropertyLength;
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    @Override
        // We show all indexes (#8126)
        super(
import org.jkiss.dbeaver.model.DBPHiddenObject;

    }
    public boolean isPrimaryKeyIndex() {
        return isCheckXMin;
    public boolean isCheckXMin() {
    }
            try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read index definition")) {
        // Make index name unique
 */
    @NotNull

            true);
