import org.jkiss.dbeaver.model.impl.struct.RelationalObjectType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.List;

                            case "i", "I" -> schema.getIndex(monitor, oid);
 * distributed under the License is distributed on an "AS IS" BASIS,
                                schema.getDataTypeCache().getAllObjects(monitor, schema);
                            case "r", "v", "m", "p", "f" -> schema.getTable(monitor, oid);
    };
                        String relKind = JDBCUtils.safeGetString(dbResult, "relkind");
import java.sql.SQLException;
        RelationalObjectType.TYPE_TABLE,
                return true;
        for (DBSObjectType ot : SUPPORTED_TYPES) {
    }

import org.jkiss.dbeaver.model.struct.DBSNamespace;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public DBSObject getObjectByName(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
 *
        }
        this.schema = schema;
                                log.debug("Unknown relkind: " + relKind);
import org.jkiss.dbeaver.DBException;
    @Override
                        return null;
import org.jkiss.dbeaver.model.exec.DBCException;
                        return switch (relKind) {
    @NotNull
import org.jkiss.code.Nullable;
            }
 * PostgreNamespace
            throw new DBCException("Error reading class info", e);
                            case "c" -> {

                    "SELECT oid,'c',oid FROM pg_catalog.pg_type WHERE typnamespace=? AND typname=?")) {
    public PostgreNamespace(@NotNull PostgreSchema schema) {
    @Nullable
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
import org.jkiss.dbeaver.Log;

                dbStat.setString(2, name);
            // enums are (surprise!) are not classes
    }
 */
 * limitations under the License.
                        long reltype = JDBCUtils.safeGetLong(dbResult, "reltype");
                        };
    public static boolean supportsObjectType(DBSObjectType objectType) {
 * DBeaver - Universal Database Manager

    }
                        if (relKind == null) {
    private final PostgreSchema schema;
        RelationalObjectType.TYPE_SEQUENCE
        try (JDBCSession session = DBUtils.openMetaSession(monitor, schema, "Search PG class")) {
import org.jkiss.code.NotNull;
                            }
    }
 *
 * See the License for the specific language governing permissions and
                            log.debug("NULL relkind for class " + name);
 *

/**
                        }
            if (ot == objectType) {
                    }
    @Override
                            case "S" -> schema.getSequence(monitor, name);
        for (DBSObjectType ot : SUPPORTED_TYPES) {
    @NotNull


        return false;
                            default -> {
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        } catch (SQLException e) {
package org.jkiss.dbeaver.ext.postgresql.model;
                    } else {
                dbStat.setString(4, name);
public class PostgreNamespace implements DBSNamespace  {
            return schema.getSequences(monitor);
        }
        } else if (objectType == RelationalObjectType.TYPE_SEQUENCE) {
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    private static final Log log = Log.getLog(PostgreNamespace.class);
    public static final DBSObjectType[] SUPPORTED_TYPES = {
 * you may not use this file except in compliance with the License.
        } else if (objectType == RelationalObjectType.TYPE_DATA_TYPE) {
        {
            return schema.getTables(monitor);

    public List<? extends DBSObject> getObjectsByType(@NotNull DBRProgressMonitor monitor, @NotNull DBSObjectType objectType) throws DBException {
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
        }
                    if (dbResult.next()) {
 * You may obtain a copy of the License at
                            return null;
 */
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
}
                                yield schema.getDataTypeCache().getDataType(reltype);
 * Unless required by applicable law or agreed to in writing, software
        } else if (objectType == RelationalObjectType.TYPE_INDEX) {
import org.jkiss.dbeaver.model.DBUtils;
        throw new DBException("Unsupported object type: " + objectType.getTypeName());
            return schema.getDataTypes(monitor);
            return schema.getIndexes(monitor);
        RelationalObjectType.TYPE_VIEW,
        if (objectType == RelationalObjectType.TYPE_TABLE ||
        RelationalObjectType.TYPE_DATA_TYPE,

/*
            if (ot.isCompatibleWith(objectType)) {
            // To find object we select from both pg_class and pg_type because
                }
                    "UNION ALL\n" +
                            }
                        long oid = JDBCUtils.safeGetLong(dbResult, "oid");
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
            objectType == RelationalObjectType.TYPE_VIEW)
        }
                                yield null;
    public DBSObjectType[] getNamespaceObjectTypes() {

                    "FROM pg_catalog.pg_class WHERE relnamespace=? AND relname=?\n" +
        return SUPPORTED_TYPES;
import org.jkiss.dbeaver.model.struct.DBSObjectType;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                return true;
                dbStat.setLong(1, schema.getObjectId());
                "SELECT oid,relkind," + (schema.getDataSource().isSupportsReltypeColumn() ? "" : "0 as ") + "reltype " +
        RelationalObjectType.TYPE_INDEX,
 * Licensed under the Apache License, Version 2.0 (the "License");
                dbStat.setLong(3, schema.getObjectId());
    }
