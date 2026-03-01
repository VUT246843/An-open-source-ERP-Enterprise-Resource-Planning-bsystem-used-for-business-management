        SQLServerTableBase parent,
    {

    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                "       AND C.column_id = IC1.column_id    \n" +
import org.jkiss.dbeaver.model.DBUtils;
 */
import org.jkiss.dbeaver.model.struct.rdb.DBSIndexType;
    // Index DDL gen script taken from MS technet

        String needToInsertUnique = unique ? "    'UNIQUE ' +\n" : "";
        return getTable().getDatabase();
    @Override
                "    ORDER BY MAX(IC1.key_ordinal)  \n" +
                "    SELECT IC2.object_id , IC2.index_id ,   \n" +
            databaseNamePrefix = "'" + database.getName() + ".' +";
                "    CASE WHEN I.ignore_dup_key = 1 THEN ' IGNORE_DUP_KEY = ON ' ELSE ' IGNORE_DUP_KEY = OFF ' END + ','  + \n" +
import org.jkiss.dbeaver.model.struct.DBSObjectWithScript;
    implements SQLServerObject, DBSTableConstraint, DBPNamedObject2, DBSObjectWithScript
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (!isPersisted() || SQLServerUtils.isDriverBabelfish(getDataSource().getContainer().getDriver())) {
    {
                "    WHERE IC1.object_id = IC2.object_id   \n" +
                "   --WHERE IC2.Object_id = object_id('Person.Address') --Comment for all tables   \n" +
                " JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "filegroups") + " FG ON I.data_space_id=FG.data_space_id   \n" +
        this.unique = unique;
    }
        List<? extends DBSTableIndexColumn> columns = source.getAttributeReferences(monitor);
            //this.cardinality = ((SQLServerTableIndex)source).cardinality;
    public SQLServerTableIndexColumn getColumn(String columnName)
        boolean unique,
            return null;
        columns.add(column);
            ddl = readIndexDefinition(monitor);
        String sql =
        boolean persisted)
                "       AND IC1.is_included_column = 0  \n" +
        this.primary = source.isPrimary();
                " JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "data_spaces") + " DS ON I.data_space_id=DS.data_space_id   \n" +
        String databaseNamePrefix = "";
        return isColumnStore;

        super(table.getContainer(), table, indexName, indexType, persisted);
                "        STUFF((SELECT ' , ' + C.name + CASE WHEN MAX(CONVERT(INT,IC1.is_descending_key)) = 1 THEN ' DESC ' ELSE ' ASC ' END \n" +
                "       ON C.object_id = IC1.object_id   \n" +

 * Licensed under the Apache License, Version 2.0 (the "License");

import java.util.ArrayList;
        return primary;

                "    JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "columns") + " C    \n" +
        String indexName,
 */
        SQLServerTableBase table,
                " JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "tables") + " T ON T.Object_id = I.Object_id    \n" +
        }
                "ON tmp2.object_id = I.object_id AND tmp2.index_id = I.index_id   \n" +
    }
        }
        this.indexComment = indexComment;
    @NotNull

                "    -- default value  \n" +
    @Property(viewable = false, order = 50)
    ) {
            parent.getContainer(),
        }
    }
import java.sql.SQLException;
    public SQLServerTableIndex(
                "WHERE I.Object_id = " + getTable().getObjectId() + "\n" +
    private String indexComment;
                "    CASE WHEN I.is_padded = 1 THEN ' PAD_INDEX = ON ' ELSE ' PAD_INDEX = OFF ' END + ','  + \n" +
        this.columns = columns;
                "\n\t ON [' + \n" +
    @Override
                "    FROM " + SQLServerUtils.getSystemTableName(getDatabase(), "index_columns") + " IC2   \n" +

    @Nullable
                "    ISNULL('\n\t INCLUDE ('+IncludedColumns+' ) ','') + \n" +
    public void addColumn(SQLServerTableIndexColumn column)
 * DBeaver - Universal Database Manager
    @NotNull

                " JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "sysindexes") + " SI ON I.Object_id = SI.id AND I.index_id = SI.indid   \n" +
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context)
    SQLServerTableIndex(DBRProgressMonitor monitor, SQLServerTable table, DBSTableIndex source) throws DBException {
    }

        super(
                " JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "stats") + " ST ON ST.object_id = I.object_id AND ST.stats_id = I.index_id   \n" +
    public String getObjectDefinitionText(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException {
    }
    @Property(viewable = true, order = 7)
    private long objectId;
    public void setUnique(boolean unique) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read SQL Server index definition")) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
 *
    private String ddl;
                "       AND IC1.index_id = IC2.index_id   \n" +
    public boolean isColumnStore() {
                "    --WHERE IC2.Object_id = object_id('Person.Address') --Comment for all tables  \n" +
        this.unique = unique;
 * you may not use this file except in compliance with the License.
    }
        String indexName = DBUtils.getQuotedIdentifier(this);
            this.columns = new ArrayList<>(columns.size());
    void setColumns(List<SQLServerTableIndexColumn> columns)
        if (database != null) {
            this);
        String indexName,
    }
        return unique;
        return columns;
    public long getObjectId() {
        String comment,
    public boolean isPrimary() {
import java.util.Map;

//                "    ' DROP_EXISTING = ON '  + ','  + \n" +
                "    'FILLFACTOR = '+CONVERT(CHAR(5),CASE WHEN I.Fill_factor = 0 THEN 100 ELSE I.Fill_factor END) + ','  + \n" +

        return objectId;
        boolean isColumnStore
    }
    }
        DBSIndexType indexType,

    public List<SQLServerTableIndexColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor)
                "    GROUP BY IC1.object_id,C.name,index_id  \n" +
    public SQLServerDataSource getDataSource()

    private boolean primary;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableIndex;
        this.unique = JDBCUtils.safeGetInt(dbResult, "is_unique") != 0;
                "       AND C.column_id = IC1.column_id   \n" +
    public SQLServerDatabase getDatabase() {
            "SELECT ' CREATE ' + \n" +
                "    WHERE IC1.object_id = IC2.object_id    \n" +
 *
 * See the License for the specific language governing permissions and
        return indexComment;
            getTable().getContainer(),
                "   GROUP BY IC2.object_id ,IC2.index_id) tmp1   \n" +
    {


import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
            for (DBSTableIndexColumn sourceColumn : columns) {
    // https://gallery.technet.microsoft.com/scriptcenter/SQL-Server-Generate-Index-fa790441
    @Property(viewable = true, editable = true, updatable = true, order = 5)
    }
                "    JOIN " + SQLServerUtils.getSystemTableName(getDatabase(), "columns") + " C   \n" +
//                "    -- default value  \n" +

    {
import org.jkiss.dbeaver.model.DBPNamedObject2;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    }
        this.objectId = JDBCUtils.safeGetLong(dbResult, "index_id");
    {
            indexName,
        this.indexComment = source.getDescription();
                "    KeyColumns + ' )  ' + \n" +
        this.indexComment = comment;
    }
                "AND I.name = '" + SQLUtils.escapeString(getDataSource(), getName()) + "'";
                "   FROM " + SQLServerUtils.getSystemTableName(getDatabase(), "index_columns") + " IC2    \n" +
        this.primary = JDBCUtils.safeGetInt(dbResult, "is_primary_key") != 0;
                "    ISNULL('\n\t WHERE  '+I.Filter_definition,'') + '\n\t WITH ( ' + \n" +

                " JOIN (SELECT * FROM (  \n" +
        if (ddl == null) {
    private boolean isColumnStore;
import org.jkiss.dbeaver.ext.mssql.SQLServerUtils;
                "       ON C.object_id = IC1.object_id    \n" +
    private String readIndexDefinition(DBRProgressMonitor monitor) throws DBCException {
    {
 *
        return DBUtils.findObject(columns, columnName);
            throw new DBCException("Error reading index definition", e);

                "    FROM " + SQLServerUtils.getSystemTableName(getDatabase(), "index_columns") + " IC1   \n" +
}
    @Override
    }
                "       FOR XML PATH('')), 1, 2, '') IncludedColumns    \n" +
                "    GROUP BY IC1.object_id,C.name,index_id   \n" +

import org.jkiss.code.NotNull;
        if (columns != null) {
import org.jkiss.code.Nullable;

                this.columns.add(new SQLServerTableIndexColumn(monitor, this, sourceColumn));
    {
        } catch (SQLException e) {
    @Property(viewable = true, length = PropertyLength.MULTILINE, order = 100)
 * You may obtain a copy of the License at
/*
        ResultSet dbResult,
    public void setDescription(String indexComment) {
            return JDBCUtils.queryString(session, sql);
                "        STUFF((SELECT ' , ' + C.name  \n" +
        }
    @Override
        boolean primary,
/**
    @Override
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
                "   WHERE IncludedColumns IS NOT NULL ) tmp2    \n" +
import org.jkiss.dbeaver.DBException;
    public void setObjectDefinitionText(String source) {

        }
            indexType,
        if (source instanceof SQLServerTableIndex) {
        return DBUtils.getFullQualifiedName(getDataSource(),
 * Copyright (C) 2010-2025 DBeaver Corp and others

            columns = new ArrayList<>();
    @Override
                "   CASE WHEN I.allow_page_locks = 1 THEN ' ALLOW_PAGE_LOCKS = ON ' ELSE ' ALLOW_PAGE_LOCKS = OFF ' END  + ' )" +
public class SQLServerTableIndex extends JDBCTableIndex<SQLServerSchema, SQLServerTableBase>
        return getTable().getDataSource();
        this.isColumnStore = isColumnStore;
                "    I.type_desc COLLATE DATABASE_DEFAULT +' INDEX ' +   \n" +
    @Override
    @Property(viewable = false, order = 6)
    }
                "    FROM " + SQLServerUtils.getSystemTableName(getDatabase(), "index_columns") + " IC1  \n" +
import org.jkiss.dbeaver.model.meta.PropertyLength;
    {
    public SQLServerTableIndex(
        DBSIndexType indexType,
    public boolean isUnique()
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndexColumn;
        ddl = null;
                "    'SORT_IN_TEMPDB = OFF '  + ','  + \n" +
 * Unless required by applicable law or agreed to in writing, software
    {
{
    }
        super(table.getContainer(), table, source, false);
    }
                "  ON I.object_id = tmp4.object_id AND I.Index_id = tmp4.index_id  \n" +
                "   CASE WHEN I.allow_row_locks = 1 THEN ' ALLOW_ROW_LOCKS = ON ' ELSE ' ALLOW_ROW_LOCKS = OFF ' END + ','  + \n" +
                "    CASE WHEN ST.no_recompute = 0 THEN ' STATISTICS_NORECOMPUTE = OFF ' ELSE ' STATISTICS_NORECOMPUTE = ON ' END + ','  + \n" +

                needToInsertUnique +
package org.jkiss.dbeaver.ext.mssql.model;
    private List<SQLServerTableIndexColumn> columns;
                "    '" + indexName + "' + ' ON '  +  \n" +
                "    SELECT IC2.object_id , IC2.index_id ,  \n" +
 * SQLServerTableIndex
                "    -- default value \n" +
                " LEFT JOIN (SELECT * FROM (   \n" +
 * limitations under the License.
    }
                "       AND IC1.index_id = IC2.index_id    \n" +
                "   DS.name + ' ] '  [CreateIndexScript] \n" +
        if (columns == null) {
import org.jkiss.dbeaver.model.exec.DBCException;
import java.sql.ResultSet;
            true);
        this.primary = primary;
    }
                "    GROUP BY IC2.object_id ,IC2.index_id) tmp3 )tmp4   \n" +
                "   " + databaseNamePrefix + "Schema_name(T.Schema_id)+'.'+T.name + ' ( ' + \n" +
                "       FOR XML PATH('')), 1, 2, '') KeyColumns   \n" +
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Override
    @Override
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.model.meta.Property;
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                "       AND IC1.is_included_column = 1   \n" +
        }
import org.jkiss.dbeaver.model.struct.rdb.DBSTableConstraint;
                "    ' ONLINE = OFF '  + ','  + \n" +
    private boolean unique;
    }
    // Copy constructor
    public String getDescription()
            }
            parent,
        return ddl;
                "FROM " + SQLServerUtils.getSystemTableName(getDatabase(), "indexes") + " I   \n" +

    @NotNull
        this.unique = source.isUnique();
        SQLServerDatabase database = this.getContainer().getDatabase();
