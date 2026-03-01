    String getAutoIncrementKeyword();
import org.jkiss.code.NotNull;
    @NotNull
     * Gets blob data type.
     * @return the clob data type
     *

     */
        return "TEXT";
     * @return the big integer type
 * limitations under the License.
     * Supports create if exists boolean.
     * Gets big integer type.

     * @return the blob data type
     * Checks if sql dialect supports COLUMN key word for alter column.

     * Gets uuid data type.
    default String getNClobDataType() {

     */
    @NotNull

 *
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
}
 * you may not use this file except in compliance with the License.
    /**
     */
/*
     */
     * Gets auto increment keyword.
    @NotNull
/**
    /**

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
    String getClobDataType();
 * You may obtain a copy of the License at
    /**
    @Nullable

     * Gets boolean data type.
     */
 * DBeaver - Universal Database Manager
     */
 * Unless required by applicable law or agreed to in writing, software
     * @return the uuid data type

    String getAlterColumnOperation();
    }
public interface SQLDialectDDLExtension extends SQLDialect {

 * Copyright (C) 2010-2026 DBeaver Corp and others

     */
    /**
    /**
     * @return the timestamp type
    }
     *
    boolean supportsAlterColumnSet();
    /**
    String getBooleanDataType();
     * Checks if sql dialect supports SET key word for alter column.
     *
     * @return the auto increment keyword
    /**
     *
    boolean supportsCreateIfExists();
     *
package org.jkiss.dbeaver.model.sql;
    String getTimestampDataType();
     *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
     * @return the boolean data type
     * Gets timestamp type.
    @NotNull
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
    default String getNVarCharDataType() {
    String getUuidDataType();
        return getTextDataType();
     * Gets clob data type.

     *

 *
 */
     *
    /**
    String getBlobDataType();
    /**
     * Gets alter column operation.
        return "VARCHAR";
import org.jkiss.code.Nullable;

     * @return true or false
 * Sql dialect ddl extension.
    default String getTextDataType() {
    boolean supportsNoActionIndex();
     */
    /**

    boolean supportsAlterHasColumn();
 * See the License for the specific language governing permissions and
     */

    @NotNull

    /**
    }
     */
    String getBigIntegerType();
 *
