    SQL_HZ380("HZ380", "RDA error: SQL usage violation"),
    SQL_00000("00000", "Success"),
    SQL_HZ090("HZ090", "RDA error: Resource already open"),
    SQL_HY099("HY099", "Nullable type out of range"),
    SQL_07003("07003", "Cursor specification cannot be executed"),
    SQL_25S03("25S03", "Transaction has been rolled back"),
    public static int getCodeFromException(Throwable error) {
    SQL_IM001("IM001", "Driver does not support this function"),
    public static final int ERROR_CODE_NONE = -1;
    private final String code;
    SQL_07008("07008", "Invalid descriptor count"),
    SQL_IM014("IM014", "Invalid name of File DSN"),
    SQL_HY009("HY009", "Invalid use of null pointer"),
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.sql;
    SQL_22001("22001", "String data, right truncation"),
    SQL_HY015("HY015", "No cursor name available"),
    SQL_21S02("21S02", "Degree of derived table does not match column list"),
    SQL_HY095("HY095", "Function type out of range"),
    SQL_01001("01001", "Cursor operation conflict"),
    }
    SQL_42S02("42S02", "Base table or view not found"),
    SQL_HY111("HY111", "Invalid bookmark value"),
    SQL_42000("42000", "Syntax error or access rule violation"),
    SQL_01S00("01S00", "Invalid connection string attribute"),
        return ERROR_CODE_NONE;
    SQL_HY008("HY008", "Operation cancelled"),
 * DBeaver - Universal Database Manager

    SQL_01004("01004", "Data truncated"),
    SQL_HY093("HY093", "Invalid parameter number"),
    SQL_HY011("HY011", "Operation invalid at this time"),
    SQL_21S01("21S01", "Insert value list does not match column list"),
    SQL_IM012("IM012", "DRIVER keyword syntax error"),
    SQL_IM009("IM009", "Unable to load translation DLL"),
        return description;
    SQL_40000("40000", "Commit transaction resulted in rollback transaction"),
    SQL_25S02("25S02", "Transaction is still active"),
    SQL_HY105("HY105", "Invalid parameter type"),
                return sqle.getSQLState();
    SQL_01S02("01S02", "Option value changed"),
    SQL_01006("01006", "Privilege not revoked"),

    SQL_HY097("HY097", "Column type out of range"),

 * See the License for the specific language governing permissions and
    SQL_22003("22003", "Numeric value out of range"),
    SQL_HY103("HY103", "Direction option out of range"),
    SQL_HYT01("HYT01", "Connection timeout expired"),
/*
    SQL_01000("01000", "General warning"),
    SQL_23000("23000", "Integrity constraint violation"),
    }
    SQL_HZ100("HZ100", "RDA error: Resource unknown"),
    SQL_IM004("IM004", "Driver's AllocEnv failed"),
    SQL_28P01("28P01", "Invalid password"),

    SQL_22000("22000", "Data exception"),
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    SQL_IM011("IM011", "Driver name too long"),
    SQL_08900("08900", "Server lookup failed"),
    SQLState(String code, String description) {
    SQL_HY001("HY001", "Storage allocation failure"),

    SQL_IM005("IM005", "Driver's AllocConnect failed"),
    }
            }
    SQL_08002("08002", "Connection already in use"),
    SQL_IM002("IM002", "Data source name not found and no default driver specified"),
    SQL_22012("22012", "Division by zero"),

    SQL_HY018("HY018", "Server declined cancel request"),
    SQL_IM006("IM006", "Driver's SetConnectOption failed"),
 *
}
    SQL_22018("22018", "Error in assignment"),
        }
import java.sql.SQLException;
        return code;
    SQL_HZ010("HZ010", "RDA error: Access control violation"),
    public static String getStateFromException(Throwable error) {
    SQL_IM008("IM008", "Dialog failed"),
    SQL_HZ080("HZ080", "RDA error: Resource not available"),
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    SQL_HYC00("HYC00", "Driver not capable"),
    SQL_42S01("42S01", "Base table or view already exists"),
 * you may not use this file except in compliance with the License.
    SQL_HY104("HY104", "Invalid precision or scale value"),
    private final String description;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    SQL_07004("07004", "Missing parameters"),
    SQL_25P02("25P02", "In failed SQL transaction"),

    SQL_HY002("HY002", "Invalid column number"),
    SQL_42S12("42S12", "Index not found"),
    SQL_34000("34000", "Invalid cursor name"),
    }
    SQL_25000("25000", "Invalid transaction state"),

    SQL_42S11("42S11", "Index already exists"),
    SQL_26000("26000", "Invalid SQL statement identifier"),
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Standard SQL states
    SQL_08000("08000", "Connection exception"),

    SQL_HY108("HY108", "Concurrency option out of range"),
    SQL_44000("44000", "WITH CHECK OPTION violation"),
    SQL_IM010("IM010", "Data source name too long"),
/**
    SQL_21000("21000", "Cardinality violation"),
    SQL_08006("08006", "Connection failure"),
    SQL_HY090("HY090", "Invalid string or buffer length"),

    SQL_HY000("HY000", "General error"),
import org.jkiss.code.Nullable;
    SQL_HY091("HY091", "Descriptor type out of range"),
    SQL_08S01("08S01", "Communication link failure"),
    SQL_42S22("42S22", "Column not found"),
    SQL_HY004("HY004", "Invalid SQL Data type"),
    SQL_IM007("IM007", "No data source or driver specified, dialog prohibited"),
    SQL_25P01("25P01", "No active SQL transaction"),
        this.code = code;

 * limitations under the License.
    SQL_07002("07002", "Mismatching parameters"),
    SQL_08004("08004", "Data source rejected establishment of connection"),
    SQL_HY003("HY003", "Invalid application buffer type"),
    SQL_01002("01002", "Disconnect error"),

    SQL_HY101("HY101", "Accuracy option type out of range"),
                return sqle.getErrorCode();
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    SQL_07005("07005", "Invalid cursor state"),
    SQL_S1009("S1009", "WITH CHECK OPTION violation"),
    public String getDescription() {
    SQL_07006("07006", "Restricted data type attribute violation"),
    @Nullable

        }
        for (Throwable cause = error; cause != null; cause = cause.getCause()) {
    SQL_08001("08001", "Unable to connect to the data source, e.g. invalid license key"),
    SQL_42S23("42S23", "No default for column"),
    SQL_07001("07001", "Wrong number of parameters"),
            if (cause instanceof SQLException sqle) {

        this.description = description;
    SQL_28000("28000", "Invalid authorization specification"),
    SQL_3C000("3C000", "Duplicate cursor name"),
    SQL_01S01("01S01", "Error in row"),
    SQL_HY107("HY107", "Row value out of range"),
    SQL_08003("08003", "Connection not open"),
    }
    SQL_HY092("HY092", "Attribute or Option type out of range"),
    SQL_HYT00("HYT00", "Timeout expired"),
public enum SQLState {
    SQL_HY010("HY010", "Function sequence error"),
    SQL_42S21("42S21", "Column already exists"),
    SQL_IM015("IM015", "Corrupt file data source"),;
    SQL_HY109("HY109", "Invalid cursor position"),
    SQL_08007("08007", "Connection failure during transaction"),
            if (cause instanceof SQLException sqle) {
    SQL_HY012("HY012", "Invalid transaction operation code"),
    SQL_HY100("HY100", "Uniqueness option type out of range"),
    SQL_23505("23505", "Unique value constraint is violated"),

        return null;
    SQL_HY096("HY096", "Information type out of range"),
 * Unless required by applicable law or agreed to in writing, software
    SQL_22007("22007", "Invalid datetime format"),
    SQL_HZ020("HZ020", "RDA error: Bad repetition count"),
 *
            }
        for (Throwable cause = error; cause != null; cause = cause.getCause()) {
    SQL_IM003("IM003", "Specified driver could not be loaded"),
    SQL_22026("22026", "String data, length mismatch"),
    SQL_HY110("HY110", "Invalid driver completion"),
    SQL_40001("40001", "Serialization failure, e.g. timeout or deadlock"),
    SQL_HY098("HY098", "Scope type out of range"),
    SQL_IM013("IM013", "Trace file error"),

    public String getCode() {
    SQL_HY106("HY106", "Fetch type out of range"),
