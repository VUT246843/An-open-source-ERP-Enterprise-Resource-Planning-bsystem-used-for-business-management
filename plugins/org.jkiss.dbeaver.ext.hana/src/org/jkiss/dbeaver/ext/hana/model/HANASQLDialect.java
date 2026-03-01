    };
        "TO_BINARY",
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        } else if ((HANAConstants.DATA_TYPE_NAME_ST_POINT.equals(ucTypeName)

        "TO_BLOB",
        "TO_SMALLINT",
import org.jkiss.dbeaver.model.text.parser.TPRuleProvider;

        "TO_DATE",
import org.jkiss.dbeaver.model.exec.DBCException;
        "SERIES_ROUND",
}


        return new TPRule[0];
import org.jkiss.dbeaver.model.sql.SQLConstants;
        "JSON_TABLE",
        "WORKDAYS_BETWEEN",
    @Override
        "WEEKDAY",
    @Nullable
    }
        "INITCAP",
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
            }
        "TRIM_ARRAY",
                || HANAConstants.DATA_TYPE_NAME_ST_GEOMETRY.equals(ucTypeName))
    }
    @Override
        return true;
    }
            }
        "LAST_VALUE",
        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
    @Override
        {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END},
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            HANAConstants.DATA_TYPE_NAME_REAL_VECTOR.equals(ucTypeName)) {
    }
    }

import org.jkiss.dbeaver.model.DBPDataKind;
        "TO_SMALLDECIMAL",
        "ADD_MONTH",
    public String[] getBlockHeaderStrings() {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
import org.jkiss.dbeaver.model.DBPDataSource;
    public String getSearchStringEscape() {
    @Override
import java.util.Locale;
import org.jkiss.dbeaver.model.text.parser.TPRule;
        if (position == RulePosition.FINAL) {
import org.jkiss.dbeaver.model.impl.data.formatters.BinaryFormatterHexString;
 * limitations under the License.
        "CURRENT_TRANSACTION_ISOLATION_LEVEL",
            int c = str.charAt(i);
        "TO_TIME",
        "CONCAT_NAZ",
    @NotNull
        if (HANAConstants.DATA_TYPE_NAME_HALF_VECTOR.equals(ucTypeName) ||
        return super.mustBeQuoted(str, forceCaseSensitive);
import org.jkiss.dbeaver.model.sql.parser.rules.SQLVariableRule;
package org.jkiss.dbeaver.ext.hana.model;
                return true;
    private static String[] HANA_FUNCTIONS = new String[]{
        "JSON_VALUE",
            @NotNull String typeName, @NotNull DBPDataKind dataKind) {

        "MONTHS_BETWEEN",
        "REPLACE_REGEXPR",
 * DBeaver - Universal Database Manager
    @Override

        "TO_BOOLEAN",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return BinaryFormatterHexString.INSTANCE;
     */
        "ADD_YEARS",
        "TO_CLOB",
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
        "TO_TIMESTAMP",
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (int i = 0; i < str.length(); i++) {
        "PLAINTEXT",
        "UNICODE",
        addFunctions(Arrays.asList(HANA_FUNCTIONS));
        "TO_VARCHAR",
        "CURRENT_SCHEMA",
        "SUBSTRING_REGEXPR",
        "TO_NCLOB",
        "SERIES_GENERATE",
        "GREATEST",
        "SUBSTR_BEFORE",
        return "DUMMY";
        {"IF", SQLConstants.BLOCK_END + " IF"},
        {"FOR", SQLConstants.BLOCK_END + " FOR"},
        "CURRENT_CONNECTION",
        "CURRENT_USER_ID",
 */
        "XMLTABLE",
        }
        "XMLEXTRACT",
    }
        "ADD_WORKDAYS",
import java.util.Arrays;
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
        "CURRENT_TIMESTAMP",
    private static final String[][] HANA_BEGIN_END_BLOCK = new String[][]{
    private static final Log log = Log.getLog(HANASQLDialect.class);
        "CONVERT_CURRENCY",
 * you may not use this file except in compliance with the License.
    public HANASQLDialect() {
import org.jkiss.code.Nullable;
 *
    @Override
        super("HANA", "sap_hana");
    @NotNull
        "SESSION_CONTEXT",
 *
            return new TPRule[] { new SQLVariableRule(this) };
    public boolean isStripCommentsBeforeBlocks() {
import org.jkiss.utils.CommonUtils;
    }

 * Unless required by applicable law or agreed to in writing, software
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
        "TO_INTEGER",
            if ((dim > 0) && (dim <= 65000)) {
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    public String[][] getBlockBoundStrings() {
import org.jkiss.dbeaver.model.data.DBDBinaryFormatter;
        "TO_REAL",
    @Override
        "SECONDS_BETWEEN",
        "CONVERT_UNIT",

        "CURRENT_SITE_ID",
        "LEAST",
    public DBDBinaryFormatter getNativeBinaryFormatter() {
    }
 * You may obtain a copy of the License at

                int srid = hanaColumn.getAttributeGeometrySRID(new VoidProgressMonitor());
 * See the License for the specific language governing permissions and
        "JSON_QUERY",
/*
            }
        }
    public String getDualTableName() {
    }
    }
                log.info("Could not determine SRID of column", e);
    }
    @NotNull
     * expression evaluation
        "YEARS_BETWEEN"
        "TO_DECIMAL",
        "TO_NVARCHAR",
        "SUBSTR_AFTER",
            try {
import org.jkiss.dbeaver.Log;
                return "(" + Long.toString(dim) + ")";
                && (column instanceof HANATableColumn)) {
        "TO_TINYINT",
        "DAYS_BETWEEN",

        "GENERATE_PASSWORD",
        "TO_BIGINT",
            return "";
        "ADD_MONTHS_LAST",
    public boolean validIdentifierStart(char c) {
        // https://github.com/dbeaver/dbeaver/issues/9998#issuecomment-805710837
    }
    public TPRule[] extendRules(@Nullable DBPDataSourceContainer dataSource, @NotNull RulePosition position) {
            } catch (DBCException e) {
        return super.validIdentifierStart(c) || c == '_';
public class HANASQLDialect extends GenericSQLDialect implements TPRuleProvider {

        "ESCAPE_DOUBLE_QUOTES",
        "ADD_SECONDS",
        "TO_INT",
            long dim = column.getMaxLength();
        return HANA_BEGIN_END_BLOCK;
        super.initDriverSettings(session, dataSource, metaData);
        "LEAD",
        "XMLEXTRACTVALUE",
    public boolean mustBeQuoted(@NotNull String str, boolean forceCaseSensitive) {
import org.jkiss.code.NotNull;
            HANATableColumn hanaColumn = (HANATableColumn) column;
        "CURRENT_DATE",
        return "\\";

        "TO_JSON_BOOLEAN",
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;


        "TO_SECONDDATE",
        "CURRENT_OBJECT_SCHEMA",

        return super.getColumnTypeModifiers(dataSource, column, ucTypeName, dataKind);
        "TO_DOUBLE",
        return true;
        "ADD_DAYS",
    
    /*
        "CURRENT_TIME",
        "ESCAPE_SINGLE_QUOTES",
        "FIRST_VALUE",
    public String getColumnTypeModifiers(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject column,
            if (Character.isLetter(c) && !(c >= 'a' && c <= 'z') && !(c >= 'A' && c <= 'Z')) {
    public boolean supportsAliasInSelect() {
                return "(" + Integer.toString(srid) + ")";
    @Override

        {"WHILE", SQLConstants.BLOCK_END + " WHILE"}
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override
        "NEXT_DAY",
        "CURRENT_USER",
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        "SUBARRAY",
        }
        return new String[]{"DO"};
    @Override
        String ucTypeName = CommonUtils.notEmpty(typeName).toUpperCase(Locale.ENGLISH);
        "LAST_DAY",
    };
        "TRIM",
