    
import java.sql.JDBCType;
    REAL(JDBCType.REAL),
    // JDBCType doesn't match
    BYTE("BYTE", Types.BINARY),
 * Unless required by applicable law or agreed to in writing, software
    BIT(JDBCType.BIT), // STRING, CHAR -> {0}
        return null;
    BINARY(JDBCType.BINARY),
        this.name = name;

    private final int jdbcTypeID;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    // char types
    CHAR(JDBCType.CHAR),

 * distributed under the License is distributed on an "AS IS" BASIS,
    INTEGER(JDBCType.INTEGER),
import java.sql.Types;
    NUMERIC(JDBCType.NUMERIC),

    }
    GEOMETRY(AltibaseConstants.TYPE_NAME_GEOMETRY, Types.BINARY); 
    // JDBCType fully compatible

    // binary
    DOUBLE(JDBCType.DOUBLE),
    private final String name;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
/*
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    public String getTypeName() {
                return ft;
        return name;
 */
 * You may obtain a copy of the License at

        this.name = jdbcType.getName();

    BIGINT(JDBCType.BIGINT),
 * you may not use this file except in compliance with the License.
    VARBYTE("VARBYTE", Types.BINARY),


     * Get AltibaseDataTypeDomain by data type id.
    
        }
    NUMBER("NUMBER", Types.NUMERIC),
    }
            if (ft.name.equalsIgnoreCase(typeName)) {
    public int getValueType() {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public static AltibaseDataTypeDomain getByTypeName(String typeName) {
import org.jkiss.dbeaver.ext.altibase.AltibaseConstants;
        for (AltibaseDataTypeDomain ft : values()) {
    VARCHAR(JDBCType.VARCHAR),
    }
public enum AltibaseDataTypeDomain {
    AltibaseDataTypeDomain(JDBCType jdbcType) {

 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
    AltibaseDataTypeDomain(String name, int jdbcType) {
        this.jdbcTypeID = jdbcType.getVendorTypeNumber();
    DATE(JDBCType.DATE.getName(), Types.TIMESTAMP),
    }
    // date & time
    // number types
    NCHAR(JDBCType.NCHAR.getName(), Types.NVARCHAR),
 *
    NVARCHAR(JDBCType.NVARCHAR),
    }
    // encrypted column data type: ECHAR, EVARCHAR should not visible to user.
    /**
    NIBBLE("NIBBLE", Types.VARCHAR),
        this.jdbcTypeID = jdbcType;
            }
    FLOAT(JDBCType.FLOAT),
    VARBIT("VARBIT", Types.BIT),
     */
    CLOB(JDBCType.CLOB),
 * limitations under the License.
    BLOB(JDBCType.BLOB),

}package org.jkiss.dbeaver.ext.altibase.model;
        return jdbcTypeID;
    SMALLINT(JDBCType.SMALLINT),
