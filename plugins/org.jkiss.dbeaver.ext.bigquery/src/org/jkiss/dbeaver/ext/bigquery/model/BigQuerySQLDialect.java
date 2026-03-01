
 * you may not use this file except in compliance with the License.
        {"REPEAT", SQLConstants.BLOCK_END + " REPEAT"}
public class BigQuerySQLDialect extends GenericSQLDialect {
        {"WHILE", SQLConstants.BLOCK_END + " WHILE"},

 * You may obtain a copy of the License at

 *
 *
    public char getStringEscapeCharacter() {
 *

    public BigQuerySQLDialect() {
    private static final String[][] BIGQUERY_BEGIN_END_BLOCK = new String[][]{
            ProjectionAliasVisibilityScope.ORDER_BY
import org.jkiss.code.NotNull;
    @Override
/*
        return MultiValueInsertMode.GROUP_ROWS;
            ProjectionAliasVisibilityScope.HAVING,
        return BIGQUERY_BEGIN_END_BLOCK;
/**
    }
    @Override
        {SQLConstants.BLOCK_BEGIN, SQLConstants.BLOCK_END},


    @Override
 * limitations under the License.
        {"IF", SQLConstants.BLOCK_END + " IF"},
        );
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public String[] getExecuteKeywords() {
    @Override

            ProjectionAliasVisibilityScope.GROUP_BY,
    };
        return EXEC_KEYWORDS;
        {SQLConstants.KEYWORD_CASE, SQLConstants.BLOCK_END + SQLConstants.KEYWORD_CASE},
 * See the License for the specific language governing permissions and
 * BigQuery SQL dialect
import org.jkiss.dbeaver.ext.generic.model.GenericSQLDialect;

    private static final String[] EXEC_KEYWORDS = {"CALL"};
    public EnumSet<ProjectionAliasVisibilityScope> getProjectionAliasVisibilityScope() {
}
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String[][] getBlockBoundStrings() {
    }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    }
    }
        {"FOR", SQLConstants.BLOCK_END + " FOR"},
        return EnumSet.of(
import org.jkiss.dbeaver.model.sql.SQLConstants;
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        {"LOOP", SQLConstants.BLOCK_END + " LOOP"},
        super("BigQuery", "google_bigquery");

package org.jkiss.dbeaver.ext.bigquery.model;

        return '\\';
        // column alias of is not visible in WHERE, but visible in other projection clauses

 */
 * Unless required by applicable law or agreed to in writing, software
    public MultiValueInsertMode getDefaultMultiValueInsertMode() {
import java.util.EnumSet;
 */
