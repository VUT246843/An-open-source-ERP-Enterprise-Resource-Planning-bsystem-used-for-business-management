                default:
                        case PostgreConstants.TYPE_XML:
 *

                                break;
                    }
 *
        int valueType;
            } else if ("e".equals(typType)) {
                    switch (name) {
    public PostgreGenericTypeCache(GenericStructContainer owner) {
            }
                    break;
                    }
public class PostgreGenericTypeCache extends JDBCBasicDataTypeCache<GenericStructContainer, JDBCDataType>
                valueType = Types.DISTINCT;
            }
        }
                typType = JDBCUtils.safeGetString(dbResult, "typtype");
    }
            } else if ("d".equals(typType)) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
                    valueType = Types.NUMERIC;
                    } else {
                valueType = Types.VARCHAR;
                log.debug(e);
                valueType = Types.STRUCT;
        return session.prepareStatement(
import org.jkiss.utils.ArrayUtils;
                        valueType = Types.TIME;
            try {
            } catch (IllegalArgumentException e) {
import org.jkiss.dbeaver.Log;
                "\nORDER by t.oid");
            }
                            valueType = Types.SQLXML;
{
    @NotNull
import org.jkiss.code.NotNull;
/*
                            case 8:
                        case "bytea":
    }
            valueType = Types.VARCHAR;
import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCDataType;
 * See the License for the specific language governing permissions and
                                break;
                    valueType = Types.STRUCT;
                            case 2:
                case P:

import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                    //                }
            if ("c".equals(typType)) {
        String name = JDBCUtils.safeGetString(dbResult, "typname");
                        valueType = Types.DATE;
                case U:
 */
                        valueType = Types.TIMESTAMP;
import org.jkiss.dbeaver.ext.postgresql.PostgreUtils;
                            valueType = Types.BINARY;
                        switch (typeLength) {
                    }
 * You may obtain a copy of the License at
    }
        return new JDBCDataType<>(owner, valueType, name,null,false,true,typeLength,-1,-1);
        }
import org.jkiss.dbeaver.ext.postgresql.PostgreConstants;
                            valueType = Types.OTHER;
                                valueType = Types.DOUBLE;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(owner);
            try {

                    break;
import java.sql.SQLException;
                                valueType = Types.SMALLINT;
    {
                                valueType = Types.INTEGER;
                "AND t.typtype<>'c'" + (supportsCategory ? " AND t.typcategory not in ('A','P')" : "") +
                    if (name.startsWith("float")) {
 * Unless required by applicable law or agreed to in writing, software

                    } else {
                            break;
                                break;
                    return null;
                    break;
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else if (supportsTypeCategory) {

 *     http://www.apache.org/licenses/LICENSE-2.0
            return null;
    @Override
 * DBeaver - Universal Database Manager
                    break;
                    if (name.startsWith("timestamp")) {
                case C:
                                valueType = Types.BIGINT;
        if (supportsTypeCategory) {
@Deprecated
                            case 4:
                case B:
/**
                            break;
        } else {
                case N:
            }
import org.jkiss.utils.CommonUtils;
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer owner) throws SQLException
        boolean supportsTypeCategory = PostgreUtils.supportsTypeCategory(session.getDataSource());
                    valueType = Types.BOOLEAN;
                    valueType = Types.VARCHAR;
            switch (typeCategory) {


                    } else if (name.startsWith("date")) {
                        }
 */
                                break;
                case A:
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
            "SELECT t.oid as typid,tn.nspname typnsname,t.* \n" +

                        default:
                            break;
                        switch (typeLength) {
                    valueType = Types.OTHER;
        }
    {

                    break;
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
        int typeLength = JDBCUtils.safeGetInt(dbResult, "typlen");
    private static String[] OID_TYPES = PostgreDataType.getOidTypes();
            String typType = null;
                    //                    valueType = Types.CLOB;
                            case 4:
                "WHERE tn.oid=t.typnamespace \n" +
                    break;
 * PostgreGenericTypeCache
        boolean supportsCategory = PostgreUtils.supportsTypeCategory(session.getDataSource());
}
                        }
                valueType = Types.OTHER;
                "FROM pg_catalog.pg_type t , pg_catalog.pg_namespace tn\n" +
                    //                if (name.equals("text")) {
    private static final Log log = Log.getLog(PostgreGenericTypeCache.class);
        if (ArrayUtils.contains(OID_TYPES, name) || name.equals(PostgreConstants.TYPE_HSTORE)) {
package org.jkiss.dbeaver.ext.postgresql.model;
                typeCategory = PostgreTypeCategory.valueOf(JDBCUtils.safeGetString(dbResult, "typcategory"));
import java.sql.Types;
 * limitations under the License.
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCBasicDataTypeCache;
                    //                } else {
                                break;
            } catch (IllegalArgumentException e) {
                log.debug(e);
        if (CommonUtils.isEmpty(name)) {
                                valueType = Types.FLOAT;
                    break;

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.impl.jdbc.JDBCUtils;
    @Override
    protected JDBCDataType fetchObject(@NotNull JDBCSession session, @NotNull GenericStructContainer owner, @NotNull JDBCResultSet dbResult) throws SQLException, DBException
        PostgreTypeCategory typeCategory = PostgreTypeCategory.X;
            } else {
                case S:
                case D:
                            case 8:
