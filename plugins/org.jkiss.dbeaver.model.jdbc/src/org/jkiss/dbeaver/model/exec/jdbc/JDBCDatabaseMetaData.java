    JDBCResultSet getImportedKeys(String catalog, String schema, String table)

package org.jkiss.dbeaver.model.exec.jdbc;
    JDBCResultSet getVersionColumns(String catalog, String schema, String table)

    @Override
    JDBCResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern)

import org.jkiss.code.NotNull;
 * limitations under the License.
        throws SQLException;
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
        throws SQLException;
    JDBCResultSet getColumns(@Nullable String catalog, @Nullable String schemaPattern, String tableNamePattern,
 * Copyright (C) 2010-2025 DBeaver Corp and others
        throws SQLException;
    JDBCResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern)

        throws SQLException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws SQLException;
    @Override
    @Override
    @Override
        throws SQLException;
        throws SQLException;
        throws SQLException;
    JDBCResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern)

}

        throws SQLException;
        throws SQLException;
        throws SQLException;
    @Override
 *
    JDBCResultSet getTables(@Nullable String catalog, @Nullable String schemaPattern, String tableNamePattern, @Nullable String[] types)
public interface JDBCDatabaseMetaData extends DatabaseMetaData {
 *
    JDBCResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern)
        throws SQLException;


    @Override
        throws SQLException;
 * you may not use this file except in compliance with the License.

    JDBCResultSet getExportedKeys(String catalog, String schema, String table)
        String foreignCatalog, String foreignSchema, String foreignTable)
        throws SQLException;
    @Override
    JDBCResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int[] types)
 * Manageable connection metadata
    @Override
        throws SQLException;
    @Override
import org.jkiss.code.Nullable;
    JDBCResultSet getCatalogs()
    JDBCResultSet getTypeInfo()
        throws SQLException;


 * DBeaver - Universal Database Manager
        throws SQLException;
    @Override
    JDBCResultSet getSchemas(String catalog, String schemaPattern)
        throws SQLException;


    JDBCDataSource getDataSource();
    JDBCResultSet getTableTypes()
 */
import java.sql.SQLException;
/*
 * See the License for the specific language governing permissions and
    JDBCResultSet getSchemas()
    @Override

        throws SQLException;
        throws SQLException;

 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at
    JDBCResultSet getPrimaryKeys(@Nullable String catalog, @Nullable String schema, String table)
        throws SQLException;

 * Licensed under the Apache License, Version 2.0 (the "License");

 */
    @Override

    @Override

    @Override
    JDBCResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope, boolean nullable)

    JDBCResultSet getCrossReference(



        throws SQLException;
    JDBCResultSet getIndexInfo(@Nullable String catalog, @Nullable String schema, String table, boolean unique, boolean approximate)
    @Override
    JDBCResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern)
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
    JDBCResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern)

    @Override
/**
    @NotNull
 *
    @Override
    @Override
    @Override
 * Unless required by applicable law or agreed to in writing, software
    JDBCResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern)

    @Override
import java.sql.DatabaseMetaData;
        throws SQLException;

    JDBCResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern)
    @Override
    JDBCResultSet getProcedureColumns(String catalog, String schemaPattern, String procedureNamePattern, String columnNamePattern)
    @Override
        String parentCatalog, String parentSchema, String parentTable,
        throws SQLException;

                         String columnNamePattern)
    @Override
