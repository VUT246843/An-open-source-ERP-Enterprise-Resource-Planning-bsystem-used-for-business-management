import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.sql.SQLConstants;
 *     http://www.apache.org/licenses/LICENSE-2.0
                "TRUNC", "TO_CHAR", "BITAND", "NANVL", "REMAINDER", "TO_BINARY_FLOAT", "TO_BINARY_DOUBLE", "BIN_TO_NUM",
    public DamengSQLDialect() {

    public String[] getExecuteKeywords() {
    public String[][] getBlockBoundStrings() {
                //Number Functions:
                "OCTET_LENGTH", "LOCATE", "LPAD", "LTRIM", "REPEAT", "REPLACE", "REPLICATE", "REVERSE", "RIGHT", "RPAD", "RTRIM",
 */
                "LOG10", "PI", "POWER2", "RADIANS", "RAND", "ROUND", "SIGN", "SIN", "SINH", "TAN", "TANH", "TO_NUMBER",

 *
import java.util.Arrays;
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;
    @NotNull
    private static final String[][] DM_BEGIN_END_BLOCK = new String[][]{
        addFunctions(Arrays.asList(
    }

    }
    public String getDualTableName() {
            {"LOOP", SQLConstants.BLOCK_END + " LOOP"},
import org.jkiss.dbeaver.model.exec.jdbc.JDBCDatabaseMetaData;
                "TEXT_EQUAL", "BLOB_EQUAL", "NLSSORT", "GREATEST", "GREAT", "to_single_byte", "to_multi_byte", "EMPTY_CLOB", "EMPTY_BLOB",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.impl.jdbc.JDBCDataSource;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    @Override
    private static final String[] EXEC_KEYWORDS = new String[]{"CALL"};
        super("Dameng", "dameng");
            {"IF", SQLConstants.BLOCK_END + " IF"},
                "ASCII", "ASCIISTR", "BIT_LENGTH", "CHAR", "CHAR_LENGTH", "CHARACTER_LENGTH", "CHR", "NCHR", "CONCAT", "DIFFERENCE",
    @Override
    }
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
/*

    }
                "INITCAP", "INS", "INSERT", "INSSTR", "INSTR", "INSTRB", "LCASE", "LEFTSTR", "LEN", "LENGTHC", "LENGTH2", "LENGTH4",
 */
                "SOUNDEX", "STRPOSDEC", "STRPOSINC", "STUFF", "SUBSTR", "SUBSTRB", "UCASE", "NLS_UPPER", "NLS_LOWER", "REGEXP",


        super.initDriverSettings(session, dataSource, metaData);
                "UNISTR", "CONCAT_WS", "SUBSTRING_INDEX", "COMPOSE", "FIND_IN_SET", "TRUNC",
 *
                "ACOS", "ASIN", "ATAN", "ATAN2", "COS", "COSH", "COT", "DEGREES", "GREATEST", "GREAT", "LEAST", "LOG",
 * you may not use this file except in compliance with the License.
    @Override
        return DM_BEGIN_END_BLOCK;
                // String function:
 * @author Shengkai Bai

    @Override
        ));
        return EXEC_KEYWORDS;
        return "DUAL";
 *
 * DBeaver - Universal Database Manager

    public void initDriverSettings(JDBCSession session, JDBCDataSource dataSource, JDBCDatabaseMetaData metaData) {
}
    };
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others

package org.jkiss.dbeaver.ext.dameng.model;
/**
        return true;




 * distributed under the License is distributed on an "AS IS" BASIS,
public class DamengSQLDialect extends GenericSQLDialect {
 * See the License for the specific language governing permissions and
 * limitations under the License.
                // Null Function
    }
    public boolean supportsAliasInSelect() {
                "COALESCE", "IFNULL", "ISNULL", "NULLIF", "NVL", "NULL_EQU"
            {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},
            {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END},
