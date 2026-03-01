        "dictGetOrNull",
        "notILike",
        "parseDateTimeOrNull",
        super.initDriverSettings(session, dataSource, metaData);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

        "hasAll",
        "notEmpty",
        "isNull",
        "quantileExact",
        "toDateTimeOrNull",
        "dictGetDescendant",
        "geohashDecode",
        "toUInt256",

                return true;
        "arraySort",
        "toDate32OrZero",
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        "trimRight",
    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
    public boolean supportsSubqueries() {
        "notLike",
    }
            return null;
        "toDate32OrNull",
        "decrypt",
        "L2Norm",
        return super.mustBeQuoted(str, forceCaseSensitive);
        "formatRow",
 *
        "geohashesInBox",

        "mapContains",
        super("Clickhouse SQL", "clickhouse");
            } else if (ClickhouseConstants.DATA_TYPE_IPV6.equals(lowerTypeName)) {
    public char getStringEscapeCharacter() {
        "stochasticLinearRegression",
        for (String word : CLICKHOUSE_NONKEYWORDS) {
        "JSONExtractKeysAndValues",
        "visitParamHas",
        "parseDateTimeInJodaSyntax",
    }

        "dictGetOrDefault",
            removeSQLKeyword(word);
        "arraySum",
        "L1Normalize",
            { "\"", "\"" },
        "mapKeys",
        "parseDateTimeInJodaSyntaxOrNull",
        "L2Distance",
    @Override
        "ifNull",
    }
    public boolean supportsNestedComments() {
        "extractURLParameter",
        "parseDateTimeBestEffort",
        "toStartOfMonth",
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    @Override

        "now",
        "mapAdd",
        "isNotNull",
    }
    @Override
        "divide",
package org.jkiss.dbeaver.ext.clickhouse.model;
        "greatCircleAngle",
    };
        "parseDateTimeOrZero",
    }
/*
        if (isInCondition && CommonUtils.isNotEmpty(typeName)) {
    @NotNull
        "snowflakeToDateTime64",
        "isValidJSON",
        "COMMENT",
        "UUIDNumToString",
        "pointInPolygon",
        "toStartOfFiveMinute",
        return SQLUtils.isLatinLetter(c) || Character.isDigit(c) || c == '_' || (quoted && validCharacters.indexOf(c) != -1);

        "uniq",
    public boolean isEscapeBackslash() {
        "s2ToGeo",
        "toString",
        "assumeNotNull",
    @Override
        return false;
    }
        for (String word : CLICKHOUSE_NONKEYWORDS) {
        "greatCircleDistance",
        "translate",
        "arrayAvg",
        "dateTimeToSnowflake",
        "arrayReverseSort",
        "toInt64",
        }
        return '\\';
        "REPLACE",
        "LinfNorm",
        "toInt128",

        "bitCount",
        "regexpExtract",
        "SHOW"
    }
public class ClickhouseSQLDialect extends GenericSQLDialect {
        "L2Normalize",
        return super.getColumnTypeModifiers(dataSource, column, typeName, dataKind);
        "aes_encrypt_mysql",
        "queryStringAndFragment",
        "mapKeys",

        "arrayElement",
        "formatRow",
 * DBeaver - Universal Database Manager
        "dictGetChildren",
    @Override
        "LinfDistance",
import java.util.Arrays;
        "dateTime64ToSnowflake",
    public String getTypeCastClause(@NotNull DBSTypedObject attribute, String expression, boolean isInCondition) {
        "toInt32",
 * distributed under the License is distributed on an "AS IS" BASIS,
        "toNullable",
import org.jkiss.dbeaver.model.DBPDataSource;
        "toDate32",
        "replaceAll",
        "toStartOfInterval",
        "mapFilter",
            if (word.equalsIgnoreCase(str)) {
        "JSONHas",

        "toDateTime64",
        String typeName = attribute.getTypeName();
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        "JSONExtractString",
        "indexOf",
        "mapValues",
        "IPv4StringToNum",
        "splitByWhitespace",
            }
        "dictGetHierarchy",
        "quantile",
    @Override
        "randConstant",
        "translateUTF8",
        "trimBoth",
        "greatCircleDistance",
    @Override
import org.jkiss.dbeaver.ext.clickhouse.ClickhouseConstants;
        "timezoneOf",
    public ClickhouseSQLDialect() {

        "divideDecimal",
        return super.getTypeCastClause(attribute, expression, isInCondition);
        "IPv6StringToNum",
 *
        "toDateTimeOrZero",
        "parseDateTime",
        "L1Distance",
        "toTimezone",
        "aes_decrypt_mysql",
        "mapFromArrays",
        }
        "arrayMax",
import org.jkiss.dbeaver.model.DBPDataKind;
 *
        "dictGet",
            }
        "timeZone",
        "DEFAULT",
 * See the License for the specific language governing permissions and
        "hasAny",
        "empty",
        "encrypt",

        "SYSTEM"
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
import org.jkiss.code.NotNull;
        "toDate",
        setIdentifierQuoteString(new String[][]{
        "endsWith",
    //We should quote keywords which is not keywords for clickhouse, otherwise JSQLParser can't parse statements
        "parseDateTimeInJodaSyntaxOrZero",
        "dictHas",
        "JSONLength",
        "formatDateTime",
        "toDateOrDefault",

        "ENGINE",

        "toUInt64",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return true;
 * Unless required by applicable law or agreed to in writing, software
 */
            { "`", "`" },
        "mapValues",
import org.jkiss.dbeaver.model.sql.SQLUtils;
        "LpDistance",
        });
        "arrayMin",

        "bitmapBuild",
        "hasAny",
    private static final String[] CLICKHOUSE_FUNCTIONS = {

        "nullIf",
        "toUInt128",
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
    };
        "geoToS2",

        "emptyArrayString",
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
}
        "tryDecrypt",
        "replaceOne",
        "toLowCardinality",
    public boolean validIdentifierStart(char c) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
    public boolean supportsAliasInSelect() {
        addFunctions(Arrays.asList(CLICKHOUSE_FUNCTIONS));
        "splitByChar",
    @Override

import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
    }
        return c == '_' || SQLUtils.isLatinLetter(c);
        "cosineDistance"
        "concat",
        "greatCircleAngle",
        addSQLKeywords(Arrays.asList(CLICKHOUSE_KEYWORDS));
        "geohashEncode",
        "arrayConcat",
        "snowflakeToDateTime",
        "dictIsIn",
    }
        "toDate32OrDefault",
    private static final String[] CLICKHOUSE_KEYWORDS = {
        "toDateOrNull",
    public String getColumnTypeModifiers(@NotNull DBPDataSource dataSource, @NotNull DBSTypedObject column, @NotNull String typeName, @NotNull DBPDataKind dataKind) {
        "javaHash",
    private static final String[] CLICKHOUSE_NONKEYWORDS = {
        "geoDistance",
 * You may obtain a copy of the License at

    @Override
        "JSONArrayLength",
        "stochasticLogisticRegression",
        "L1Norm",
        if (typeName.equals("String")) {
        "multiply",
    }
        "LpNorm",
        "UUIDStringToNum",
        "minus",
        "arrayJoin",
    }
        "toDateTimeOrDefault",
        return true;
        return true;
    public boolean supportsOrderByIndex() {
            if (ClickhouseConstants.DATA_TYPE_IPV4.equals(lowerTypeName)) {
        "hasAll",
        "trimLeft",
        "LinfNormalize",
 * limitations under the License.
        "toStartOfFifteenMinutes",
        "pointInEllipses",
        "arrayConcat",
    }
        return true;
        "evalMLMethod",
        "plus",
        "startsWith",
        "multiIf",
        "JSONExtract",
        "toDateTime",
    public boolean validIdentifierPart(char c, boolean quoted) {

    };
    @Override
            String lowerTypeName = typeName.toLowerCase();
    }
    public boolean mustBeQuoted(@NotNull String str, boolean forceCaseSensitive) {
        "toJSONString",
        "sleep",
        "arrayStringConcat",
                return "IPv4StringToNum(" + expression + ")";
                return "IPv6StringToNum(" + expression + ")";
        "LpNormalize",
