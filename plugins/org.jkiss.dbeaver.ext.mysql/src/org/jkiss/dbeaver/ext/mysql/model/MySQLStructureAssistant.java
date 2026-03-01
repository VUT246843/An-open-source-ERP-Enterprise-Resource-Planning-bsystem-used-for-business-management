import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    }
    protected void findObjectsByMask(@NotNull MySQLExecutionContext executionContext, @NotNull JDBCSession session, @NotNull DBSObjectType objectType,
        if (addParentheses) {
            this.from = from;
                            if (tableCatalog == null) {
    }
    private static void fillParameters(@NotNull JDBCPreparedStatement statement, @NotNull ObjectsSearchParams params,

            statement.setString(idx, catalog.getName());
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            if (tableCatalog == null) {
        return dataSource;
        if (!caseSensitive) {
        if (objectType == RelationalObjectType.TYPE_TABLE) {
        @NotNull
        if (!CommonUtils.isEmpty(commentColumnName)) {
        }
                            MySQLCatalog tableCatalog = catalog != null ? catalog : dataSource.getCatalog(catalogName);
        } else if (objectType == RelationalObjectType.TYPE_TABLE_COLUMN) {
            MySQLConstants.META_TABLE_TABLE_CONSTRAINTS
    {
                    objects.add(new AbstractObjectReference<>(columnName, dataSource.getCatalog(catalogName), null, MySQLTableColumn.class, RelationalObjectType.TYPE_TABLE_COLUMN) {
        queryParams.setMaxResults(params.getMaxResults() - objects.size());
            MySQLConstants.META_TABLE_TABLES

        @Nullable
        // Load procedures
        };
        boolean addParentheses = commentColumnName != null || definitionColumnName != null;

                            MySQLTableBase table = tableCatalog.getTableCache().getObject(monitor, tableCatalog, tableName);
            this.select = select;
    }
        return new DBSObjectType[] {
            findConstraintsByMask(session, catalog, params, references);

            sql.append("AND ").append(params.getSchemaColumnName()).append(" = ? ");
                    final String tableName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TABLE_NAME);
    }
            findTableColumnsByMask(session, catalog, params, references);
                }
        private QueryParams(@NotNull String objectNameColumn, @NotNull String select, @NotNull String from) {
        private void setDefinitionColumnName(@Nullable String definitionColumnName) {
        private String getCommentColumnName() {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCStructureAssistant;
        return objectType == RelationalObjectType.TYPE_TABLE
                                        throws SQLException {
    private void findTableColumnsByMask(JDBCSession session, @Nullable final MySQLCatalog catalog, @NotNull ObjectsSearchParams params,
    protected JDBCDataSource getDataSource()

        }
        }
                    });

            this.schemaColumnName = schemaColumnName;
        private void setMaxResults(int maxResults) {
 */
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                while (!monitor.isCanceled() && dbResult.next()) {
                            return constraint;
        return new DBSObjectType[] {
        if (params.isSearchInDefinitions() && hasDefinitionColumn) {
            queryParams.setCommentColumnName("ROUTINE_COMMENT");
            return commentColumnName;
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
        );
        }
                    final String catalogName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TABLE_SCHEMA);
            MySQLConstants.COL_TABLE_NAME,
            addNameWithLikeCondition(sql, commentColumnName, caseSensitive, true);
            queryParams.setCommentColumnName("TABLE_COMMENT");
                    final boolean isCheck = MySQLConstants.CONSTRAINT_CHECK.equals(constrType);
                                throw new DBException("Column '" + columnName + "' not found in table '" + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
                            if (CommonUtils.isEmpty(catalogName) || CommonUtils.isEmpty(tableName) || CommonUtils.isEmpty(columnName)) {
        if (!CommonUtils.isEmpty(definitionColumnName)) {
        private final String select;
                            if (procCatalog == null) {
    }
        sql.append(name);

                            }
        int idx = 2;
        if (params.isSearchInDefinitions()) {
                    objects.add(new AbstractObjectReference<DBSObject>(tableName, dataSource.getCatalog(catalogName), null, MySQLTableBase.class, RelationalObjectType.TYPE_TABLE) {
        private String getSchemaColumnName() {
    private static final class QueryParams {
        @Nullable
        }
        public String getFrom() {
        private boolean isCaseSensitive;

        addNameWithLikeCondition(sql, params.getObjectNameColumn(), caseSensitive, false);

        }
                                throw new DBException("Constraint '" + constrName + "' not found in table '" + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");


        }

                            MySQLCatalog tableCatalog = catalog != null ? catalog : dataSource.getCatalog(catalogName);
import org.jkiss.dbeaver.model.struct.DBSObject;
                        public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
    {
        this.dataSource = dataSource;
                    final String catalogName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TABLE_SCHEMA);
        @Nullable
                            if (isFK) {
        // Load columns
        }
 * limitations under the License.
        }
            RelationalObjectType.TYPE_CONSTRAINT,
            MySQLConstants.COL_TABLE_SCHEMA + "," + MySQLConstants.COL_TABLE_NAME + "," + MySQLConstants.COL_COLUMN_NAME,
    {
    @Override
    public DBSObjectType[] getSupportedObjectTypes()
package org.jkiss.dbeaver.ext.mysql.model;
        @NotNull
        private final String from;
 *
            return definitionColumnName;
                        }
        DBRProgressMonitor monitor = session.getProgressMonitor();
        private String definitionColumnName;
            queryParams.setSchemaColumnName(MySQLConstants.COL_TABLE_SCHEMA);

                                log.debug("Can't find correct column metadata.");
            RelationalObjectType.TYPE_TABLE_COLUMN,
            sql.append(") ");
            fillParameters(dbStat, params, catalog, true, true);
            fillParameters(dbStat, params, catalog, true, true);

            this.objectNameColumn = objectNameColumn;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        String sql = generateQuery(queryParams);
        private int maxResults;
        String sql = generateQuery(queryParams);
            return objectNameColumn;
    @Override
                                throw new DBException("Table name not found in the metadata.");
    }
            sql.append("(");
            }

    private void findTablesByMask(JDBCSession session, @Nullable final MySQLCatalog catalog, @NotNull ObjectsSearchParams params,

            queryParams.setSchemaColumnName(MySQLConstants.COL_ROUTINE_SCHEMA);
                        }
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
            queryParams.setSchemaColumnName(MySQLConstants.COL_TABLE_SCHEMA);
 * you may not use this file except in compliance with the License.
        public boolean isCaseSensitive() {
        return sql.toString();
import java.util.List;
    private void findProceduresByMask(JDBCSession session, @Nullable final MySQLCatalog catalog, @NotNull ObjectsSearchParams params,
                while (!monitor.isCanceled() && dbResult.next()) {
            return from;
import org.jkiss.utils.CommonUtils;
        }

        @NotNull
        queryParams.setCaseSensitive(params.isCaseSensitive());
import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;

        if (catalog != null) {
                    final String tableName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TABLE_NAME);
            return schemaColumnName;
import org.jkiss.dbeaver.DBException;
 * MySQLStructureAssistant
                }
    private void findConstraintsByMask(JDBCSession session, @Nullable final MySQLCatalog catalog, @NotNull ObjectsSearchParams params,
                            }
        public String getSelect() {
    }
                            if (table == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                            }
        }
            }
 * Unless required by applicable law or agreed to in writing, software
        DBRProgressMonitor monitor = session.getProgressMonitor();
            catalog = executionContext.getContextDefaults().getDefaultCatalog();
        private String schemaColumnName;
        statement.setString(1, mask);
                                constraint = table.getUniqueKey(monitor, constrName);
                                throw new DBException("Incorrect metadata for search.");
                            }

                    objects.add(new AbstractObjectReference<>(constrName, dataSource.getCatalog(catalogName), null, isFK ? MySQLTableForeignKey.class : MySQLTableConstraint.class, RelationalObjectType.TYPE_CONSTRAINT) {
                                        List<DBSObjectReference> objects) throws SQLException {
        }
    }
            queryParams.setDefinitionColumnName(MySQLConstants.COL_COLUMN_GENERATION_EXPRESSION);
        } else if (objectType == RelationalObjectType.TYPE_PROCEDURE) {
                                      List<DBSObjectReference> objects) throws SQLException {
        DBRProgressMonitor monitor = session.getProgressMonitor();
        );
    }
        DBRProgressMonitor monitor = session.getProgressMonitor();
                            return table;
                        @NotNull

        QueryParams queryParams = new QueryParams(
        }
                                       List<DBSObjectReference> objects) throws SQLException {
                                throw new DBException("Constraint table '" + tableName + "' not found in catalog '" + tableCatalog.getName() + "'");

    {
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                        }
                while (!monitor.isCanceled() && dbResult.next()) {
                        @Override
                        }
                            if (CommonUtils.isEmpty(tableName)) {
        String sql = generateQuery(queryParams);
            };
            MySQLConstants.META_TABLE_COLUMNS
        );
            return isCaseSensitive;
        }
            return maxResults;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        }
            MySQLConstants.COL_ROUTINE_NAME,
                            }
        sql.append(" LIKE ?");
                                DBUtils.getQuotedIdentifier(dataSource, columnName);
                        @Override
        @Nullable
                            MySQLProcedure procedure = procCatalog.getProcedure(monitor, procName);
        if (catalog != null) {
        }
    {
    }
            }
            this.maxResults = maxResults;
                                throw new DBException("Column table '" + tableName + "' not found in catalog '" + tableCatalog.getName() + "'");
import java.sql.SQLException;
                                throw new DBException("Table '" + tableName + "' not found in catalog '" + catalogName + "'");
        }


                            if (table == null) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (addParentheses) {
            queryParams.setDefinitionColumnName(MySQLConstants.COL_ROUTINE_DEFINITION);
            MySQLConstants.COL_ROUTINE_SCHEMA + "," + MySQLConstants.COL_ROUTINE_NAME,
        }
                            else {

        }
    public DBSObjectType[] getAutoCompleteObjectTypes()
 */
        queryParams.setCaseSensitive(params.isCaseSensitive());
                                  List<DBSObjectReference> objects) throws SQLException {
                    });

                            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        queryParams.setCaseSensitive(params.isCaseSensitive());
        if (catalog != null) {
        QueryParams queryParams = new QueryParams(
                                constraint = table.getCheckConstraint(monitor, constrName);
                                throw new DBException("Procedure '" + procName + "' not found in catalog '" + procCatalog.getName() + "'");
        // Load constraints

        private String getObjectNameColumn() {
                                throw new DBException("Column catalog '" + catalogName + "' not found");
                    final String columnName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_COLUMN_NAME);
        }
            MySQLConstants.META_TABLE_ROUTINES
        QueryParams queryParams = new QueryParams(
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        if (params.isSearchInComments()) {
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {

        @NotNull
            this.definitionColumnName = definitionColumnName;
        }
            || objectType == RelationalObjectType.TYPE_PROCEDURE
            RelationalObjectType.TYPE_PROCEDURE,


                                '.' +
                    final boolean isFK = MySQLConstants.CONSTRAINT_FOREIGN_KEY.equals(constrType);
                            }
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
            this.commentColumnName = commentColumnName;
                    });
import org.jkiss.dbeaver.model.impl.struct.AbstractObjectReference;
        if (params.isSearchInComments()) {
            || objectType == RelationalObjectType.TYPE_TABLE_COLUMN;
        @Nullable
                            if (procedure == null) {

        }


            isCaseSensitive = caseSensitive;
            idx++;
                            return procedure;
            MySQLConstants.COL_COLUMN_NAME,
        }
                            return column;
                            }
            RelationalObjectType.TYPE_TABLE,
    @Override
                            else if (isCheck) {
    public DBSObjectType[] getHyperlinkObjectTypes()
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        }
            RelationalObjectType.TYPE_TABLE,
    }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        }
        }
public class MySQLStructureAssistant extends JDBCStructureAssistant<MySQLExecutionContext> {
        if (catalog != null) {
        // Load tables
            sql.append("UPPER(");
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        }
        private final String objectNameColumn;
        };
        if (catalog != null) {

        if (catalog == null && !params.isGlobalSearch()) {
    }
        String commentColumnName = params.getCommentColumnName();

    }
                            if (tableCatalog == null) {
/**
import java.util.Locale;
                            if (constraint == null) {
/*
        private String commentColumnName;
        }
        }

        QueryParams queryParams = new QueryParams(
                            }
            sql.append(")");
        queryParams.setMaxResults(params.getMaxResults() - objects.size());
            idx++;

                            DBSObject constraint;
        public void setCaseSensitive(boolean caseSensitive) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        String sql = generateQuery(queryParams);
import org.jkiss.dbeaver.model.DBUtils;
                            MySQLCatalog procCatalog = catalog != null ? catalog : dataSource.getCatalog(catalogName);
                                throw new DBException("Table catalog '" + catalogName + "' not found");
            queryParams.setCommentColumnName("COLUMN_COMMENT");
                    final String procName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ROUTINE_NAME);
            RelationalObjectType.TYPE_TABLE,
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    final String catalogName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_ROUTINE_SCHEMA);
        private void setCommentColumnName(@Nullable String commentColumnName) {
                            }
        }
    @Override
        }

            statement.setString(idx, mask);
            fillParameters(dbStat, params, catalog, true, false);
 * You may obtain a copy of the License at
                            }
                    final String tableName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TABLE_NAME);
            sql.append(" OR ");
                                       @Nullable MySQLCatalog catalog, boolean hasCommentColumn, boolean hasDefinitionColumn) throws SQLException {
            RelationalObjectType.TYPE_PROCEDURE
        String mask = params.isCaseSensitive() ? params.getMask() : params.getMask().toUpperCase(Locale.ENGLISH);
        private void setSchemaColumnName(@Nullable String schemaColumnName) {


import org.jkiss.dbeaver.model.struct.DBSObjectReference;
 *
        } else if (objectType == RelationalObjectType.TYPE_CONSTRAINT) {
    @Override
        private int getMaxResults() {
        if (params.isSearchInComments()) {
        queryParams.setCaseSensitive(params.isCaseSensitive());
        queryParams.setMaxResults(params.getMaxResults() - objects.size());
        MySQLCatalog catalog = params.getParentObject() instanceof MySQLCatalog ? (MySQLCatalog) params.getParentObject() : null;

    @NotNull
                            }
    public MySQLStructureAssistant(MySQLDataSource dataSource)
    public boolean supportsSearchInDefinitionsFor(@NotNull DBSObjectType objectType) {
    private static String generateQuery(@NotNull QueryParams params) {
                            if (CommonUtils.isEmpty(tableName) || CommonUtils.isEmpty(columnName)) {
                            if (column == null) {
        private String getDefinitionColumnName() {
        if (addOR) {
        }
            findTablesByMask(session, catalog, params, references);
                    final String catalogName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_TABLE_SCHEMA);
            RelationalObjectType.TYPE_PROCEDURE,
                    final String constrName = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_CONSTRAINT_NAME);
                }
        @NotNull
                            MySQLTableColumn column = table.getAttribute(monitor, columnName);
            }
                            MySQLCatalog tableCatalog = catalog != null ? catalog : dataSource.getCatalog(catalogName);
        StringBuilder sql = new StringBuilder("SELECT ").append(params.getSelect()).append(" FROM ").append(params.getFrom()).append(" WHERE ");
        try (JDBCPreparedStatement dbStat = session.prepareStatement(sql)) {
                        @Override
        }
        String definitionColumnName = params.getDefinitionColumnName();
        if (params.isSearchInDefinitions()) {
        return objectType == RelationalObjectType.TYPE_PROCEDURE || objectType == RelationalObjectType.TYPE_TABLE_COLUMN;
                            }
            try (JDBCResultSet dbResult = dbStat.executeQuery()) {
 * See the License for the specific language governing permissions and
            queryParams.setSchemaColumnName(MySQLConstants.COL_TABLE_SCHEMA);
                                '.' +
                            MySQLTableBase table = tableCatalog.getTableCache().getObject(monitor, tableCatalog, tableName);
        @NotNull
                                     @NotNull ObjectsSearchParams params, @NotNull List<DBSObjectReference> references)
    @Override
            MySQLConstants.COL_CONSTRAINT_NAME,
            fillParameters(dbStat, params, catalog, false, false);

 * DBeaver - Universal Database Manager
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
                            if (table == null) {
                                return "";
                                DBUtils.getQuotedIdentifier(dataSource, tableName) +
import org.jkiss.code.Nullable;
                    objects.add(new AbstractObjectReference<>(procName, dataSource.getCatalog(catalogName), null, MySQLProcedure.class, RelationalObjectType.TYPE_PROCEDURE) {
                        @Override
                                constraint = table.getAssociation(monitor, constrName);
            findProceduresByMask(session, catalog, params, references);
                        }

        }
                                throw new DBException("Constraint catalog '" + catalogName + "' not found");

        );
    private static void addNameWithLikeCondition(@NotNull StringBuilder sql, @NotNull String name, boolean caseSensitive, boolean addOR) {
    public boolean supportsSearchInCommentsFor(@NotNull DBSObjectType objectType) {
    @NotNull

            addNameWithLikeCondition(sql, definitionColumnName, caseSensitive, true);
import org.jkiss.dbeaver.model.struct.DBSObjectType;
                                throw new DBException("Procedure catalog '" + catalogName + "' not found");
}
    }
                            }
    private final MySQLDataSource dataSource;
        }


        if (params.isSearchInComments() && hasCommentColumn) {
            MySQLConstants.COL_TABLE_SCHEMA + "," + MySQLConstants.COL_TABLE_NAME,
                    });
                            }
                    final String constrType = JDBCUtils.safeGetString(dbResult, MySQLConstants.COL_CONSTRAINT_TYPE);
import org.jkiss.code.NotNull;
        boolean caseSensitive = params.isCaseSensitive();
    }
                }
                        public DBSObject resolveObject(DBRProgressMonitor monitor) throws DBException {
        @Nullable
import org.jkiss.dbeaver.ext.mysql.MySQLConstants;

        sql.append("ORDER BY ").append(params.getObjectNameColumn()).append(" LIMIT ").append(params.getMaxResults());

        if (!caseSensitive) {
                while (!monitor.isCanceled() && dbResult.next()) {
        queryParams.setMaxResults(params.getMaxResults() - objects.size());
                            return DBUtils.getQuotedIdentifier(dataSource, catalogName) +
        }
        return new DBSObjectType[] {
            return select;
 *
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");

                            }
        if (!CommonUtils.isEmpty(params.getSchemaColumnName())) {
            MySQLConstants.COL_TABLE_SCHEMA + "," + MySQLConstants.COL_TABLE_NAME + "," + MySQLConstants.COL_CONSTRAINT_NAME + "," + MySQLConstants.COL_CONSTRAINT_TYPE,
            statement.setString(idx, mask);
                        @Override
                            MySQLTable table = tableCatalog.getTable(monitor, tableName);
        }
