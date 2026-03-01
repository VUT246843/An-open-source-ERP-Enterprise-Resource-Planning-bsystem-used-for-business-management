        sb.append("     , '").append(DB2ObjectType.TABLESPACE.name()).append("' AS OBJ_TYPE");
        case PACKAGE:
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;

        sb.append("     , TABSCHEMA AS OBJ_SCHEMA, TABNAME AS OBJ_NAME");
        case XML_SCHEMA:
        case TABLESPACE:
        sb.append("     , NULL AS OBJ_SCHEMA, CAST(OBJECTID AS VARCHAR(32)) AS OBJ_NAME");
        sb.append("SELECT GRANTOR,GRANTORTYPE");
        sb.append(" WHERE GRANTEETYPE = ?");// 7
        sb.append(" UNION ALL ");


        sb.append("     , SCHEMA AS OBJ_SCHEMA, SPECIFICNAME AS OBJ_NAME");
        sb.append("     , VARSCHEMA AS OBJ_SCHEMA, VARNAME AS OBJ_NAME");
        sb.append("     , '").append(DB2ObjectType.SEQUENCE.name()).append("' AS OBJ_TYPE");
 * DBeaver - Universal Database Manager
            return new DB2AuthModule(monitor, db2Grantee, db2Module, resultSet);

            Long xmlSchemaId = Long.valueOf(objectName);
            }
        }
            return new DB2AuthIndex(monitor, db2Grantee, db2Index, resultSet);
        DB2DataSource db2DataSource = db2Grantee.getDataSource();
 *
        sb.append("     , INDSCHEMA AS OBJ_SCHEMA, INDNAME AS OBJ_NAME");
    private static final String SQL;
    private static final String SQL_WITHOUT_MODULE;
        }
    static {
        switch (objectType) {
        sb3.append(" WITH UR");
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
        sb2.append("SELECT GRANTOR,GRANTORTYPE");
        // PRIVTYPE in ALTERINAUTH
        sb.append("  FROM SYSCAT.XSROBJECTAUTH ");

        StringBuilder sb = new StringBuilder(4096);
            DB2Tablespace db2Tablespace = db2DataSource.getTablespace(monitor, objectName);
        case VARIABLE:
        String userName = db2Grantee.getName();
        // OBJECTID as string in OBJ_NAME



    @Override
        sb.append("     , '").append(DB2ObjectType.VARIABLE.name()).append("' AS OBJ_TYPE");



        sb.append("  FROM SYSCAT.TBSPACEAUTH");

            DB2Variable db2Variable = db2DataSource.getVariable(monitor, objectName);
}import org.jkiss.dbeaver.ext.db2.DB2Utils;
            DB2Index db2Index = DB2Utils.findIndexBySchemaNameAndName(monitor, db2DataSource, objectSchemaName, objectName);
            String columnName = JDBCUtils.safeGetStringTrimmed(resultSet, "USAGEAUTH");
 */
        sb.append("     , READAUTH AS USAGEAUTH, WRITEAUTH AS ALTERINAUTH, NULL, NULL, NULL, NULL");
        sb2.append("   AND GRANTEE = ?");// 22
import org.jkiss.dbeaver.ext.db2.editors.DB2ObjectType;
    }
            case F:
        sb.append("     , NULL, NULL, NULL, NULL, BINDAUTH, EXECUTEAUTH");
            DB2TableBase db2TableBase = DB2Utils.findTableBySchemaNameAndName(monitor, db2DataSource, objectSchemaName, objectName);
        int nbMax;
                throw new DBException(routineType + " is not a valid DB2RoutineType");
                return new DB2AuthProcedure(monitor, db2Grantee, db2Procedure, resultSet);


        sb2.append("     , MODULESCHEMA AS OBJ_SCHEMA, MODULENAME AS OBJ_NAME");
        sb.append("     , NULL AS OBJ_SCHEMA, SCHEMANAME AS OBJ_NAME");
        String userType = db2Grantee.getType().name();
        sb.append("     , PKGSCHEMA AS OBJ_SCHEMA, PKGNAME AS OBJ_NAME");
        sb2.append("     , NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL");
                    return new DB2AuthView(monitor, db2Grantee, db2TableBase, resultSet);
        String sql;
        sb.append("     , NULL AS OBJ_SCHEMA, TBSPACE AS OBJ_NAME");
        String objectSchemaName = JDBCUtils.safeGetStringTrimmed(resultSet, "OBJ_SCHEMA");
                if (db2TableBase != null) {
            throw new DBException(
        StringBuilder sb3 = new StringBuilder(64);
        sb.append(" UNION ALL ");
        return dbStat;
        sb.append("  FROM SYSCAT.INDEXAUTH");
        sb.append(" WHERE GRANTEETYPE = ?");// 5
        sb.append("     , NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL");
                DB2Routine db2Udf = DB2Utils.findUDFBySchemaNameAndName(monitor, db2DataSource, objectSchemaName, objectName);
        sb.append("     , ROUTINETYPE, NULL, NULL, NULL, NULL, EXECUTEAUTH");
        // Auth Columns:

        sb.append("     , USAGEAUTH, NULL , NULL, NULL, NULL, NULL");
        sb.append("     , SEQSCHEMA AS OBJ_SCHEMA, SEQNAME AS OBJ_NAME");
            return new DB2AuthTablespace(monitor, db2Grantee, db2Tablespace, resultSet);
        // READAUTH in USAGEAUTH
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                } else {
        default:
        sb.append("   AND GRANTEE = ?");// 6
            } else {
        sb.append(" WHERE GRANTEETYPE = ?");// 3
        sb.append("     , NULL, ALTERAUTH, NULL, NULL, NULL, NULL, NULL, NULL");

        sb.append("   AND GRANTEE = ?");// 4

/*
 * limitations under the License.
            }
        sb.append("   AND GRANTEE = ?");// 18
            DB2Schema db2Schema = db2DataSource.getSchema(monitor, objectName);
        sb.append("  FROM SYSCAT.SEQUENCEAUTH");
    {
        sb2.append(" WHERE GRANTEETYPE = ?");// 21
        sb.append("     , USAGEAUTH, NULL, NULL, NULL, NULL, NULL");
    @Override
import org.jkiss.dbeaver.ext.db2.model.*;
        for (int i = 1; i <= nbMax;) {
        sb.append(" WHERE GRANTEETYPE = ?");// 15
            // Can be a Function or a Procedure
import org.jkiss.utils.CommonUtils;
                    db2TableBase = DB2Utils.findMQTBySchemaNameAndName(monitor, db2DataSource, objectSchemaName, objectName);
            nbMax = 22;

        sb.append("     , '").append(DB2ObjectType.TABLE.name()).append("' AS OBJ_TYPE");
            return new DB2AuthVariable(monitor, db2Grantee, db2Variable, resultSet);
        sb.append("     , NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL");
        // 6 cols : USAGEAUTH ALTERINAUTH CREATEINAUTH DROPINAUTH BINDAUTH EXECUTEAUTH
    protected DB2AuthBase fetchObject(@NotNull JDBCSession session, @NotNull DB2Grantee db2Grantee,
        // ROUTINETYPE in USAGEAUTH
        // GRANTABLE in CREATEINAUTH
 * @author Denis Forveille
                return new DB2AuthMethod(monitor, db2Grantee, db2Method, resultSet);

                return new DB2AuthTable(monitor, db2Grantee, db2TableBase, resultSet);
        // WRITEAUTH in ALTERINAUTH
        sb.append(" UNION ALL ");
        sb.append("SELECT GRANTOR,GRANTORTYPE");


        sb.append("     , '").append(DB2ObjectType.INDEX.name()).append("' AS OBJ_TYPE");
        sb.append("     , NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL");
        StringBuilder sb2 = new StringBuilder(512);
        case PROCEDURE:

                    objectName);
            DB2Module db2Module = DB2Utils.findModuleBySchemaNameAndName(monitor, db2DataSource, objectSchemaName, objectName);
        sb.append(" WHERE GRANTEETYPE = ?");// 13
        sb.append("   AND GRANTEE = ?"); // 2
 *     http://www.apache.org/licenses/LICENSE-2.0
        sb.append("     , '").append(DB2ObjectType.XML_SCHEMA.name()).append("' AS OBJ_TYPE");
        // COLNAME in USAGEAUTH
            sql = SQL;
            dbStat.setString(i++, userType);
        @NotNull JDBCResultSet resultSet) throws SQLException, DBException
            DB2Sequence db2Sequence = DB2Utils.findSequenceBySchemaNameAndName(monitor, db2DataSource, objectSchemaName,
                return new DB2AuthUDF(monitor, db2Grantee, db2Udf, resultSet);
import org.jkiss.dbeaver.ext.db2.model.dict.DB2RoutineType;
        sb.append("SELECT GRANTOR,GRANTORTYPE");
        sb.append("     , '").append(DB2ObjectType.PROCEDURE.name()).append("' AS OBJ_TYPE"); // PROCEDURE or FUNCTION or METHOD

import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;

        sb.append("  FROM SYSCAT.VARIABLEAUTH");
        sb.append(" UNION ALL ");
    }
        sb.append("SELECT GRANTOR,GRANTORTYPE");
        sb.append("SELECT GRANTOR,GRANTORTYPE");
        sb.append("   AND GRANTEE = ?");// 10
                DB2Routine db2Procedure = DB2Utils.findProcedureBySchemaNameAndName(monitor, db2DataSource, objectSchemaName,
        sb.append(
        sb.append("     , COLNAME, PRIVTYPE, GRANTABLE, NULL, NULL, NULL");
 * Copyright (C) 2010-2024 DBeaver Corp and others
        DB2ObjectType objectType = CommonUtils.valueOf(DB2ObjectType.class, JDBCUtils.safeGetString(resultSet, "OBJ_TYPE"));
        sb.append("     , NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL");
    {
            // Can be a Table, a View or an MQT..
 * Copyright (C) 2013-2017 Denis Forveille (titou10.titou10@gmail.com)
        case MODULE:
                db2TableBase = DB2Utils.findViewBySchemaNameAndName(monitor, db2DataSource, objectSchemaName, objectName);

            case M:
        sb.append(" WHERE GRANTEETYPE = ?");// 11
        sb.append("     , '").append(DB2ObjectType.COLUMN.name()).append("' AS OBJ_TYPE");
public final class DB2GranteeAuthCache extends JDBCObjectCache<DB2Grantee, DB2AuthBase> {

        sb.append(" WHERE GRANTEETYPE = ?");// 19
        sb3.append(" ORDER BY OBJ_SCHEMA, OBJ_NAME, OBJ_TYPE");
            return new DB2AuthXMLSchema(monitor, db2Grantee, db2XmlSchema, resultSet);
        case SEQUENCE:
        sb.append(" WHERE GRANTEETYPE = ?");// 9


            nbMax = 20;
        sb.append("     , TABSCHEMA AS OBJ_SCHEMA, TABNAME AS OBJ_NAME");
        sb.append("     , CONTROLAUTH, NULL, NULL, NULL, NULL, NULL, NULL, NULL");

    }
        sb.append("   AND GRANTEE = ?");// 12
        sb.append("     , NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL");
        sb.append(" UNION ALL ");
                    return new DB2AuthMaterializedQueryTable(monitor, db2Grantee, db2TableBase, resultSet);
 *
        sb.append("     , '").append(DB2ObjectType.PACKAGE.name()).append("' AS OBJ_TYPE");
        sb2.append("     , NULL, NULL, NULL, NULL, NULL, EXECUTEAUTH");
package org.jkiss.dbeaver.ext.db2.model.security;
        }
            DB2TableColumn db2TableColumn = DB2Utils.findColumnBySchemaNameAndTableNameAndName(monitor, db2DataSource,
            dbStat.setString(i++, userName);
        // 8 cols : CONTROLAUTH ALTERAUTH DELETEAUTH INDEXAUTH INSERTAUTH REFAUTH SELECTAUTH UPDATEAUTH
        sb.append("  FROM SYSCAT.PACKAGEAUTH");
            return new DB2AuthPackage(monitor, db2Grantee, db2Package, resultSet);
        sb.append(" UNION ALL ");
        sb.append("     , CONTROLAUTH, ALTERAUTH, DELETEAUTH, INDEXAUTH, INSERTAUTH, REFAUTH, SELECTAUTH, UPDATEAUTH");
 * you may not use this file except in compliance with the License.
        sb.append("SELECT GRANTOR,GRANTORTYPE");


        sb.append("     , USEAUTH, NULL, NULL, NULL, NULL, NULL");

        sb.append(" UNION ALL ");
        sb.append("     , NULL, NULL, NULL, NULL, NULL, NULL");
            sql = SQL_WITHOUT_MODULE;
        sb2.append(" UNION ALL ");
                }
        case SCHEMA:
            DB2RoutineType routineType = CommonUtils.valueOf(DB2RoutineType.class,
                objectSchemaName, objectName, columnName);

        sb.append("   AND GRANTEE = ?");// 20


        sb.append("  FROM SYSCAT.SCHEMAAUTH");
        sb2.append("  FROM SYSCAT.MODULEAUTH");
        DBRProgressMonitor monitor = session.getProgressMonitor();
        sb.append("SELECT GRANTOR,GRANTORTYPE");

        case TABLE:
 * distributed under the License is distributed on an "AS IS" BASIS,

        sb2.append("     , '").append(DB2ObjectType.MODULE.name()).append("' AS OBJ_TYPE");
        } else {

            default:
 * See the License for the specific language governing permissions and
        sb.append("SELECT GRANTOR,GRANTORTYPE");
                objectName);

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 */
    @NotNull
        sb.append("   AND GRANTEE = ?");// 16
        SQL_WITHOUT_MODULE = sb.toString() + sb3.toString();
import java.sql.SQLException;
        SQL = sb.toString() + sb2.toString() + sb3.toString();
            if (db2TableBase != null) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        case INDEX:
            "     , NULL AS USAGEAUTH, NULL AS ALTERINAUTH, NULL AS CREATEINAUTH, NULL AS DROPINAUTH, NULL AS BINDAUTH, NULL AS EXECUTEAUTH");
            DB2Package db2Package = DB2Utils.findPackageBySchemaNameAndName(monitor, db2DataSource, objectSchemaName, objectName);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;


            case P:
        sb.append(" WHERE GRANTEETYPE = ?"); // 1
import org.jkiss.dbeaver.ext.db2.model.module.DB2Module;
        sb.append("SELECT GRANTOR,GRANTORTYPE");
/**
import org.jkiss.code.NotNull;
            switch (routineType) {
        sb.append("     , CONTROLAUTH, NULL, NULL, NULL, NULL, NULL, NULL, NULL");

    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull DB2Grantee db2Grantee)

        sb.append("  FROM SYSCAT.COLAUTH ");

        sb.append("  FROM SYSCAT.ROUTINEAUTH");
        sb.append(" UNION ALL ");
        JDBCPreparedStatement dbStat = session.prepareStatement(sql);
        case COLUMN:
 * 
        if (db2Grantee.getDataSource().isAtLeastV9_7()) {
 * Cache for DB2 Authorisations
        String objectName = JDBCUtils.safeGetStringTrimmed(resultSet, "OBJ_NAME");
                "Programming error: " + objectType + " is not supported yet and the SELECT statement must exclude it");
        sb.append("     , NULL, ALTERINAUTH, CREATEINAUTH, DROPINAUTH, NULL, NULL");
 * Licensed under the Apache License, Version 2.0 (the "License");
        sb.append("SELECT GRANTOR,GRANTORTYPE");
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        sb.append("     , NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL");
 * You may obtain a copy of the License at
        sb.append("   AND GRANTEE = ?");// 8
        sb.append(" WHERE GRANTEETYPE = ?");// 17

                DB2Routine db2Method = DB2Utils.findMethodBySchemaNameAndName(monitor, db2DataSource, objectSchemaName, objectName);
            return new DB2AuthColumn(monitor, db2Grantee, db2TableColumn, resultSet);
                JDBCUtils.safeGetStringTrimmed(resultSet, "USAGEAUTH"));

        sb.append("     , '").append(DB2ObjectType.SCHEMA.name()).append("' AS OBJ_TYPE");
 *
        throws SQLException
        sb.append("  FROM SYSCAT.TABAUTH");
        sb.append(" UNION ALL ");
            return new DB2AuthSequence(monitor, db2Grantee, db2Sequence, resultSet);
        sb.append("   AND GRANTEE = ?");// 14
            DB2XMLSchema db2XmlSchema = DB2Utils.findXMLSchemaByById(monitor, db2DataSource, xmlSchemaId);
            return new DB2AuthSchema(monitor, db2Grantee, db2Schema, resultSet);

