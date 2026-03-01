    }
 * See the License for the specific language governing permissions and

    public void setUnique(boolean unique) {
    public void addColumn(MySQLTableIndexColumn column)
        String comment,
        return DBUtils.getFullQualifiedName(getDataSource(),
 *
    @NotNull
            this.cardinality = ((MySQLTableIndex)source).cardinality;
    }
        }
        public boolean allowCustomValue() {
    {

    @Override

            return false;

    public boolean isPrimary() {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;
        return MySQLConstants.INDEX_PRIMARY.equals(getName());
import org.jkiss.dbeaver.DBException;
    @Nullable
        return cardinality;
        }
{
    public List<MySQLTableIndexColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor)

import org.jkiss.dbeaver.model.DBUtils;
    {
        boolean nonUnique,

    @Override
    private long cardinality;
    public boolean isUnique()

import org.jkiss.code.Nullable;
        this.nonUnique = !unique;
 *
    }
    }
 * DBeaver - Universal Database Manager
    }
    MySQLTableIndex(DBRProgressMonitor monitor, MySQLTable table, DBSTableIndex source) throws DBException {
            parent,
    @Override

        MySQLTable table,
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
            columns = new ArrayList<>();
    }


 * distributed under the License is distributed on an "AS IS" BASIS,
    public MySQLDataSource getDataSource()
            this.columns = new ArrayList<>(columns.size());
    public String getAdditionalInfo() {

import org.jkiss.dbeaver.model.meta.PropertyLength;
        this.indexComment = source.getDescription();

        return DBUtils.getQuotedIdentifier(getTable()) + "." + DBUtils.getQuotedIdentifier(this);
            return object.getDataSource().supportedIndexTypes().toArray();
    public String getOverloadedName() {


    public String toString() {
    {
    @Override
    @NotNull
    public String getDescription()
    @Override
*/
        return super.getIndexType();
 * limitations under the License.
            getTable(),
        DBSIndexType indexType,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;

 *     http://www.apache.org/licenses/LICENSE-2.0
                this.columns.add(new MySQLTableIndexColumn(monitor, this, sourceColumn));
        this.indexComment = JDBCUtils.safeGetString(dbResult, "INDEX_COMMENT");
 */
            this);
    @Override
    }
    }
    @Property(viewable = true, editable = true, updatable = true, order = 5)
            getTable().getContainer(),
 * MySQLTableIndex
    {
        this.additionalInfo = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_COMMENT);
    @NotNull
            parent.getContainer(),
    }
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
import java.sql.ResultSet;
        }
    private String indexComment;
    }
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;
        }
 *

        return uniqueKey != null;
    }
            }
    {
    }
    }
        this.indexComment = comment;
        return getTable().getDataSource();
    }
            true);
 */
        if (columns != null) {

        }
        super(
 * Copyright (C) 2010-2025 DBeaver Corp and others

    @Property(viewable = true, order = 20)
        boolean persisted)
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
        MySQLTableConstraint uniqueKey = getTable().getUniqueKey(monitor, getName());
        columns.add(column);

        public Object[] getPossibleValues(MySQLTableIndex object) {
    public MySQLTableIndex(
    public MySQLTableIndexColumn getColumn(String columnName)
    public DBSIndexType getIndexType() {
    public MySQLTableIndex(MySQLTable parent, String indexName, DBSIndexType indexType, ResultSet dbResult) {
        this.nonUnique = JDBCUtils.safeGetInt(dbResult, MySQLConstants.COL_NON_UNIQUE) != 0;
        return additionalInfo;
/**

    @Override
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    }
        List<? extends DBSTableIndexColumn> columns = source.getAttributeReferences(monitor);
            for (DBSTableIndexColumn sourceColumn : columns) {
/*
    @Property(viewable = true, editable = true, updatable = true, order = 3, listProvider = IndexTypeModifyListProvider.class)
}
        @Override
    @Property(viewable = false, order = 30)
    void setColumns(List<MySQLTableIndexColumn> columns)
    private List<MySQLTableIndexColumn> columns;
        this.nonUnique = nonUnique;


 * Licensed under the Apache License, Version 2.0 (the "License");
        return columns;

    @Override
import org.jkiss.dbeaver.model.DBPNamedObject2;
    {
        return !nonUnique;
            this.additionalInfo = ((MySQLTableIndex)source).additionalInfo;
    {
package org.jkiss.dbeaver.ext.mysql.model;
            this);
        this.nonUnique = !source.isUnique();
    private String additionalInfo;
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
            indexName,
        return DBUtils.getFullQualifiedName(getDataSource(),
    // Copy constructor
            indexType,
import java.util.List;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableIndex;
        if (columns == null) {
    }
        super(table.getContainer(), table, indexName, indexType, persisted);
    public boolean isUniqueKeyIndex(DBRProgressMonitor monitor) throws DBException {
    }
        return indexComment;
    /*
    public long getCardinality() {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @Nullable
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * you may not use this file except in compliance with the License.
public class MySQLTableIndex extends JDBCTableIndex<MySQLCatalog, MySQLTable> implements DBPNamedObject2//, DBPOverloadedObject
        if (source instanceof MySQLTableIndex) {
    @NotNull
        this.columns = columns;
        this.cardinality = JDBCUtils.safeGetLong(dbResult, "cardinality");
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    }
    {
    private boolean nonUnique;

        String indexName,
import org.jkiss.dbeaver.model.meta.Property;
    }
        @Override
        super(table.getContainer(), table, source, false);
import java.util.ArrayList;
    @Override

    public static class IndexTypeModifyListProvider implements IPropertyValueListProvider<MySQLTableIndex> {
        return DBUtils.findObject(columns, columnName);
    }
    {
