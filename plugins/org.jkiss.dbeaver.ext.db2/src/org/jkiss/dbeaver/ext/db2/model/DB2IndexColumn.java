            return virtualColName;
    @Property(viewable = true, editable = false, order = 5)
    }

    }
            throw new DBDatabaseException(e, db2DataSource);
            // Virtual Column
    @Override
    public DB2Index getIndex()
import java.sql.SQLException;

    public String getName()

    public String getCollationSchema()
    }
            if (viewDep != null) {
    @Override
    // Constructors
                }

    {

                stmtSel.setString(1, indexSchema);
        if ((virtualCol == null) || (virtualCol.isNotVirtual())) {
    @Nullable
    @Override
    public String getcollationName()
package org.jkiss.dbeaver.ext.db2.model;
        String columnName = JDBCUtils.safeGetString(dbResult, "COLNAME");
    {
    private String              virtualColText;
            this.collationName = JDBCUtils.safeGetString(dbResult, "COLLATIONNAME");
    // -----------------
    {
        return colSeq;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Read Index view dependency")) {
    private DB2IndexColVirtual  virtualCol;
    }
        if ((virtualCol == null) || (virtualCol.isNotVirtual())) {
                    String viewName = dbResult.getString("BNAME");
    @Override
    }
        this.colOrder = ascending ? DB2IndexColOrder.A : DB2IndexColOrder.D; // Force Ascending or Descending ..
    private DB2TableColumn      tableColumn;
                    String viewSchema = dbResult.getString("BSCHEMA").trim();
    private static final String I_DEP = "SELECT BSCHEMA,BNAME FROM SYSCAT.INDEXDEP WHERE INDSCHEMA = ? AND INDNAME = ? AND BTYPE = 'V' WITH UR";
    public DB2DataSource getDataSource()
        } catch (SQLException e) {
        } else {
    @Nullable
import org.jkiss.dbeaver.model.DBUtils;

            // Store Virtual col name instead of real table column name
    @Property(viewable = true, editable = false, order = 4, id = "indexType")
 * you may not use this file except in compliance with the License.
    // -----------------
    @Override
    }
    {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            this.virtualColText = JDBCUtils.safeGetStringTrimmed(dbResult, "TEXT");

        if (db2DataSource.isAtLeastV9_5()) {
import org.jkiss.code.NotNull;
    }
    }
        // Look for Table Column if column is not virtual...

    @Override
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_COLLATION)
            // Look for the associated View and get the associtaed column
        this.db2Index = db2Index;
 *
        } else {
    public DB2IndexColOrder getColOrder()
        return db2Index;
    // -----------------
        } else {
            return tableColumn.getName();
            return tableColumn.getDescription();
                JDBCResultSet dbResult = stmtSel.executeQuery();
        return colOrder;
 * Licensed under the Apache License, Version 2.0 (the "License");



import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                stmtSel.setString(2, indexName);
 * limitations under the License.
        }
import org.jkiss.dbeaver.model.meta.Property;
    // col name in index name
        }
    // Business Contract
    private String              collationName;
        return colSeq;
    {
    @Override
    // order in index schema name

 *
                this.tableColumn = viewDep.getAttribute(monitor, columnName);
 * @author Denis Forveille
    private String              collationSchema;
        return db2Index.getDataSource();

    @NotNull
    @Property(viewable = true, order = 1, id = "name")
    // -----------------
import org.jkiss.dbeaver.DBDatabaseException;
                    return null;
import org.jkiss.dbeaver.ext.db2.model.dict.DB2IndexColVirtual;
    public Integer getColSeq()
 * Unless required by applicable law or agreed to in writing, software
            }
        this.tableColumn = tableColumn;
    {
        throws DBException
    // Properties
                throw new DBException("Column '" + columnName + "' not found in table '" + db2Table.getName() + "' for index '"

        if (db2DataSource.isAtLeastV10_1()) {
        }
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

                } else {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private DB2IndexColOrder    colOrder;
                    + db2Index.getName() + "'");
 * DBeaver - Universal Database Manager
    }
    {
    // -----------------
    public String getVirtualColText()
            return virtualCol.getName();
    // -----------------
            }
import org.jkiss.utils.CommonUtils;
    {

    }
    public DB2TableColumn getTableColumn()
        return tableColumn;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
    {

    {
        }
    // Helpers
    @Property(viewable = true, editable = false, order = 2, id = "indSchema")
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.sql.ResultSet;
/*
        return colOrder.isAscending();
            this.virtualColName = columnName;
import org.jkiss.dbeaver.DBException;
    {

    {
    @NotNull
 *
            this.virtualCol = CommonUtils.valueOf(DB2IndexColVirtual.class, JDBCUtils.safeGetString(dbResult, "VIRTUAL"));
import org.jkiss.code.Nullable;
        DB2DataSource db2DataSource = db2Index.getDataSource();
            if (tableColumn == null) {
    public boolean isAscending()
        this.colSeq = JDBCUtils.safeGetInteger(dbResult, "COLSEQ");
public class DB2IndexColumn extends AbstractTableIndexColumn {

        this.colSeq = ordinalPosition;
        return collationName;


 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return virtualCol;
    // -----------------
import org.jkiss.dbeaver.model.impl.struct.AbstractTableIndexColumn;
    public DB2IndexColVirtual getVirtualCol()
            DB2View viewDep = getDependentView(monitor, db2DataSource, db2Index.getIndSchema().getName().trim(),
    @NotNull
        this.db2Index = db2Index;
        this.colOrder = CommonUtils.valueOf(DB2IndexColOrder.class, JDBCUtils.safeGetString(dbResult, "COLORDER"));
    {
/**
        DB2TableBase db2Table = db2Index.getTable();
            this.tableColumn = db2Table.getAttribute(monitor, columnName);
    }
    private String              virtualColName;
 * 
    }


    public DB2Index getParentObject()
    public DB2IndexColumn(DB2Index db2Index, DB2TableColumn tableColumn, int ordinalPosition, boolean ascending)
    {
            }

    }
    private DB2Index            db2Index;
        return db2Index;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;

    }

    private DB2View getDependentView(DBRProgressMonitor monitor, DB2DataSource db2DataSource, String indexSchema, String indexName)
            try (JDBCPreparedStatement stmtSel = session.prepareStatement(I_DEP)) {
 */
    {

import org.jkiss.dbeaver.ext.db2.model.dict.DB2IndexColOrder;
 * distributed under the License is distributed on an "AS IS" BASIS,
            this.collationSchema = JDBCUtils.safeGetStringTrimmed(dbResult, "COLLATIONSCHEMA");

    public int getOrdinalPosition()
        return virtualColText;
}
    @Property(viewable = false, editable = false, category = DB2Constants.CAT_COLLATION)
    private Integer             colSeq;
    {
        this.virtualCol = DB2IndexColVirtual.N; // Force real column...

 * Copyright (C) 2013-2015 Denis Forveille titou10.titou10@gmail.com
        }
                if (dbResult.next()) {
    // -----------------
    {
    public String getDescription()
                    return DB2Utils.findViewBySchemaNameAndName(monitor, db2DataSource, viewSchema, viewName);
    @Property(viewable = true, editable = true, order = 3, id = "table")
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.db2.DB2Utils;

    public DB2IndexColumn(DBRProgressMonitor monitor, DB2Index db2Index, ResultSet dbResult) throws DBException
 * DB2 Index Column


        }

                db2Index.getName());

        if ((virtualCol != null) && (virtualCol.isVirtual())) {
        return collationSchema;
 */
