    					colList
    	if (table.getPartitions(monitor).size() == 0)
                ") REFERENCES " + DBUtils.getObjectFullName(fk.getAssociatedEntity(), DBPEvaluationContext.DDL) + " (" +
/*
                // column infos
import java.sql.SQLException;
                                             ExasolTable exasolTable) throws DBException {
import org.jkiss.dbeaver.ext.exasol.ExasolConstants;

                ddlOutput.append(CommonUtils.joinStrings(",", columns));
    public static String getPKDdl(ExasolTableUniqueKey pk, DBRProgressMonitor monitor) throws DBException {
 * Unless required by applicable law or agreed to in writing, software
        return "ALTER TABLE " + DBUtils.getObjectFullName(exasolTable, DBPEvaluationContext.DDL) + " ADD CONSTRAINT " + DBUtils.getQuotedIdentifier(pk) + " PRIMARY KEY (" + CommonUtils.joinStrings(",", columns) + ") " + (pk.getEnabled() ? ExasolConstants.KEYWORD_ENABLE : ExasolConstants.KEYWORD_DISABLE);
            refColumns.add(DBUtils.getQuotedIdentifier(c.getAttribute()));
                        columnString.append(" NOT NULL");
    public static String getPartitionDdl(ExasolTable table, DBRProgressMonitor monitor) throws DBException {
        if (exasolSchema == null) {
        ArrayList<String> columns;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;


    public static String getFKDdl(ExasolTableForeignKey fk, DBRProgressMonitor monitor) throws DBException {
                ddlOutput.append("\n);\n");
        for (DBSEntityAttributeRef c : fk.getAttributeReferences(monitor)) {

                    if (columnDefault != null)
        }
            }
 * You may obtain a copy of the License at
        } finally {
                    StringBuilder columnString = new StringBuilder();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                CommonUtils.joinStrings(",", refColumns) + ")" + fk_enabled;
    
            if (pks != null && pks.size() > 0) {
                    String columnDefault = rs.getString("COLUMN_DEFAULT");
    }
        }
            return null;
/**
    }
                if (distKey.size() > 0) {
        }
import org.jkiss.dbeaver.DBDatabaseException;
    }
import org.jkiss.dbeaver.Log;
                            append(" ").append(rs.getString("COLUMN_TYPE"));

    // double single quotes for sql literals  
                List<String> distKey = new ArrayList<>();
        if (fk.getEnabled())
            if (fks != null && fks.size() > 0) {
 * DBeaver - Universal Database Manager
                    columns.add(columnString.toString());
                    // has identity
        int unit = si ? 1000 : 1024;
 * Licensed under the Apache License, Version 2.0 (the "License");


    }
                    // double quotation mark for column as the name could be a
        int exp = (int) (Math.log(bytes) / Math.log(unit));

 * you may not use this file except in compliance with the License.
                //get only first as there is only 1 primary key
 * Copyright (C) 2010-2024 DBeaver Corp and others
    					DBUtils.getObjectFullName(table, DBPEvaluationContext.DDL),
                    // has identity
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    }

            return ExasolTableObjectType.TABLE;
                    if (columnComment != null)
    public static final String SNAPSHOT_EXEC = "/*snapshot execution*/";
package org.jkiss.dbeaver.ext.exasol.tools;
                ddlOutput.append("\n").append(getPKDdl(pk, monitor)).append(";\n");
                    if (bigDecimal != null)
            columns.add("\"" + c.getAttribute().getName() + "\"");
                    String columnComment = rs.getString("COLUMN_COMMENT");
import java.util.stream.Collectors;
        columns = new ArrayList<>();
            //partitioning
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DBRProgressMonitor monitor, ExasolDataSource dataSource,

    private ExasolUtils() {
                        // replace ' to double ' -> escape for SQL
}
                        columnString.append(" DEFAULT ").append(columnDefault);
            }
        if (bytes < unit) return bytes + " B";
        if (con.getUserName() != null) {
                // do we have a distkey?
import org.jkiss.dbeaver.ext.exasol.model.*;
            return ddlOutput.toString();
        return "ALTER TABLE " + DBUtils.getObjectFullName(exasolTable, DBPEvaluationContext.DDL) +
                List<String> columns = new ArrayList<>();

            //primary key
    }
                }
        try {
     * Prepend the comment to an SQL query if you want to enable the mode for the query.
        // Pure utility class, no instanciation allowed
    	
    			(
public class ExasolUtils {

                + "ALTER SCHEMA " + exasolSchema.getName() + " CHANGE OWNER " + exasolSchema.getOwner() + ";\n";
                // distribution key infos


    	return String.format
    }
    // select columns of tables
                " FOREIGN KEY (" + CommonUtils.joinStrings(",", columns) +
        ArrayList<String> columns = new ArrayList<>();

            userInfo = " USER '" + con.getUserName() + "' IDENTIFIED BY '<password>' ";
        StringBuilder ddlOutput = new StringBuilder();
    /**
    			.map(pc -> DBUtils.getQuotedIdentifier(pc))

    	

                    // reserved word
        } catch (Exception e) {
            try (JDBCStatement dbStat = session.createStatement()) {
 * See the License for the specific language governing permissions and
                }
        }
        }
    }
            Collection<ExasolTableForeignKey> fks = exasolTable.getAssociations(monitor);
    }
 *
                JDBCResultSet rs = dbStat.executeQuery(String.format(TABLE_QUERY_COLUMNS, quoteString(exasolTable.getSchema().getName()), quoteString(exasolTable.getName())));




                while (rs.next()) {

 */
    private static final String TABLE_QUERY_COLUMNS = "/*snapshot execution*/ SELECT * FROM EXA_ALL_COLUMNS WHERE COLUMN_SCHEMA='%s' AND COLUMN_TABLE='%s' ORDER BY COLUMN_ORDINAL_POSITION";
        String userInfo = "";
                    // comment


        return exasolSchema.getTable(monitor, exasolTableName);
                for (ExasolTableForeignKey fk : fks) {
            columns.add(DBUtils.getQuotedIdentifier(c.getAttribute()));
import java.util.Collection;
        return "CREATE CONNECTION \"" + con.getName() + "\" to '" + con.getConnectionString() + "'" + userInfo + ";";
 * distributed under the License is distributed on an "AS IS" BASIS,
        ExasolTable exasolTable = fk.getTable();

            Collection<ExasolTableUniqueKey> pks = exasolTable.getConstraints(monitor);
        String fk_enabled = " DISABLE";
        }
    public static String humanReadableByteCount(long bytes, boolean si) {
import java.math.BigDecimal;
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
            String exasolSchemaName, String exasolTableName) throws DBException {




 *

        String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "i");
import java.util.List;
     * This mode is helpful for metadata queries as it allows avoiding transaction conflicts.
    	String colList = String.join(",", cols);



        try (JDBCSession session = DBUtils.openMetaSession(monitor, exasolTable, "Get Table DDL")) {
import java.util.ArrayList;
        return input.replaceAll("'", "''");



 */
 *
                    columnString.append("\n\t\t").append(DBUtils.getQuotedIdentifier(dataSource, CommonUtils.notEmpty(rs.getString("COLUMN_NAME")))).
        }
     * A comment that triggers <a href="https://docs.exasol.com/db/latest/database_concepts/snapshot_mode.htm">the Snapshot Mode</a>.
 * @author Karl Griesser
    public static String generateDDLforTable(DBRProgressMonitor monitor, ExasolDataSource dataSource,


                " ADD CONSTRAINT " + DBUtils.getQuotedIdentifier(fk) +

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
 *     http://www.apache.org/licenses/LICENSE-2.0
    	Collection<String> cols = table.getPartitions(monitor).stream()
        ddlOutput.append("CREATE TABLE ").append(exasolTable.getFullyQualifiedName(DBPEvaluationContext.DDL)).append(" (");


                    // has default value?
                    ddlOutput.append(",\n\t\t DISTRIBUTE BY ").append(CommonUtils.joinStrings(",", distKey));
            //foreign key
                pk = pks.iterator().next();
                    // if distkey add column to distkey
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    			.sorted(Comparator.comparing(ExasolTablePartitionColumn::getOrdinalPosition))

 *

        return "CREATE SCHEMA " + exasolSchema.getName() + ";\n"
    			);


                    ddlOutput.append("\n").append(getFKDdl(fk, monitor)).append(";\n");
    public static ExasolTable findTableBySchemaNameAndName(

            //ddlOutput.append(";\n"); //partition expression has ; already
                }
import java.util.Comparator;
    private static final Log log = Log.getLog(ExasolUtils.class);
    	
        return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
    public static String generateDDLforSchema(DBRProgressMonitor monitor,
                        distKey.add(rs.getString("COLUMN_NAME"));
            ddlOutput.append(getPartitionDdl(exasolTable, monitor));
                    if (rs.getBoolean("COLUMN_IS_DISTRIBUTION_KEY"))
            }
            log.error("Unsupported object table type: " + objectType);
import org.jkiss.dbeaver.ext.exasol.model.security.ExasolTableObjectType;
        ExasolTable exasolTable = pk.getTable();
import org.jkiss.utils.CommonUtils;
                ExasolTableUniqueKey pk;
    		return "";
                        columnString.append(" COMMENT IS '").append(columnComment.replaceAll("'", "''")).append("'");
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)
     */
        ExasolSchema exasolSchema = dataSource.getSchema(monitor, exasolSchemaName);
 * DB2 Utils
    					"ALTER TABLE %s PARTITION BY %s;\n",
            monitor.done();
                        columnString.append(" IDENTITY ").append(bigDecimal.toString());
    public static String quoteString(String input) {
                //look keys
            

    }
        for (DBSEntityAttributeRef c : fk.getReferencedConstraint().getAttributeReferences(monitor)) {
        } catch (SQLException e) {
    public static ExasolTableObjectType getTableObjectType(String objectType) {
        for (DBSEntityAttributeRef c : pk.getAttributeReferences(monitor)) {
                                              ExasolSchema exasolSchema) {
    			.collect(Collectors.toCollection(ArrayList::new));
            fk_enabled = " ENABLE";
            throw new DBDatabaseException(e, dataSource);
import org.jkiss.dbeaver.model.DBUtils;

                    if (!rs.getBoolean("COLUMN_IS_NULLABLE"))
import org.jkiss.dbeaver.model.struct.DBSEntityAttributeRef;

    public static String getConnectionDdl(ExasolConnection con, DBRProgressMonitor monitor) throws DBException {
            return ExasolTableObjectType.valueOf(objectType);
        ArrayList<String> refColumns = new ArrayList<>();
                    BigDecimal bigDecimal = rs.getBigDecimal("COLUMN_IDENTITY");
