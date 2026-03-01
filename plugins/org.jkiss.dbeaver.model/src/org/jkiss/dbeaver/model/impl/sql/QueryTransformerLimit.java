        this(true);
    @Override

*/
        this.supportsOffsetKeyword = supportsOffsetKeyword;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private boolean limitSet;

    @Override

        if (!plainSelect) {
        SQLDialect dialect = SQLUtils.getDialectFromDataSource(query.getDataSource());
 * limitations under the License.
    //private static final Pattern SELECT_PATTERN = Pattern.compile("\\s*(?:select|update|delete|insert).+", Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
                // We can limit only total row number

import org.jkiss.dbeaver.model.sql.SQLQueryType;
 * See the License for the specific language governing permissions and
    public QueryTransformerLimit(boolean supportsExtendedLimit) {
                newQuery = normalizedQuery + "\n" + KEYWORD_LIMIT + " " + length.longValue();
import org.jkiss.dbeaver.model.sql.SQLQuery;
        if (plainSelect) {
package org.jkiss.dbeaver.model.impl.sql;
* Query transformer for LIMIT

        this.offset = (Number) parameters[0];
            if (supportsExtendedLimit) {
            statement.setLimit(offset.longValue(), length.longValue());
import org.jkiss.dbeaver.model.exec.DBCStatement;
    @Override
            }
        }
    public void transformStatement(DBCStatement statement, int parameterIndex) throws DBCException {
 *
        if (!plainSelect && query.getType() == SQLQueryType.UNKNOWN) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public static final Pattern NON_LIMIT_QUERY_PATTERN = Pattern.compile("\\s+(LIMIT|OFFSET|INTO|UPDATE|PROCEDURE|FETCH)\\s+");
    public QueryTransformerLimit() {
import org.jkiss.dbeaver.model.sql.SQLUtils;
            // Not parsed. Try to check with simple matcher
    public static final String KEYWORD_LIMIT = "LIMIT";
        String newQuery;
    }
                }

    public static final String KEYWORD_OFFSET = "OFFSET";
        String testQuery = query.getText().toUpperCase().trim();
            plainSelect = "SELECT".equals(SQLUtils.getFirstKeyword(dialect, testQuery));
                newQuery = normalizedQuery + "\n" + KEYWORD_LIMIT + " " + offset + ", " + length;

 *
    public QueryTransformerLimit(boolean supportsExtendedLimit, boolean supportsOffsetKeyword) {
 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.
}
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        } else {
    private Number offset;
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
    private boolean supportsExtendedLimit;
    public String transformQueryString(SQLQuery query) throws DBCException {
                if (offset.longValue() > 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
                // LIMIT + OFFSET
    }
    }
        }
        this.length = (Number) parameters[1];
            } else {
import org.jkiss.dbeaver.model.exec.DBCException;
import org.jkiss.dbeaver.model.sql.SQLDialect;

                    newQuery += " " + KEYWORD_OFFSET + " " + offset.longValue();
    }
            limitSet = false;
        }
    }
            String normalizedQuery = SQLUtils.removeQueryDelimiter(dialect, query.getText());
 * You may obtain a copy of the License at
/**
public class QueryTransformerLimit implements DBCQueryTransformer {
            } else if (supportsOffsetKeyword) {
        if (!limitSet) {
                newQuery = normalizedQuery + "\n" + KEYWORD_LIMIT + " " + (offset.longValue() + length.longValue());

        this(supportsExtendedLimit, false);
            // Do not use limit if it is not a select or it already has LIMIT or it is SELECT INTO statement
        boolean plainSelect = query.isPlainSelect();
        this.supportsExtendedLimit = supportsExtendedLimit;
 */
    }

    private boolean supportsOffsetKeyword;
            limitSet = supportsExtendedLimit || supportsOffsetKeyword;
        return newQuery;
            plainSelect = !NON_LIMIT_QUERY_PATTERN.matcher(testQuery).find();

            newQuery = query.getText();
import java.util.regex.Pattern;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setParameters(Object... parameters) {
    private Number length;
/*
