
        } else {
            }
import java.util.ArrayList;
                } else {
 */
    private SQLQuery wrapSourceQuery(
                    throw new DBException("Can't inject COUNT into query with GROUP BY clause");
        @NotNull SQLQuery query
            SQLDialect sqlDialect = dataSource.getSQLDialect();
 *
import org.jkiss.dbeaver.model.DBPDataSource;
 * SQLQueryTransformerCount.

            if (statement instanceof PlainSelect select) {
                        countFunc.setParameters(new ExpressionList<>(exprs));
            throw new DBException("Can't transform query to SELECT count(*)", e);
import net.sf.jsqlparser.expression.Expression;
                    // Remove distinct
                Function countFunc = new Function();
/*
            }
                }
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
import net.sf.jsqlparser.statement.Statement;
            queryText = query.getText();

            if (!sqlDialect.supportsSubqueries() || (sqlDialect instanceof SQLDialectRelational sdr && sdr.isAmbiguousCountBroken())) {
                    countFunc.setDistinct(true);

 * you may not use this file except in compliance with the License.
                }
            // Inject failed (most likely parser error)
                select.setSelectItems(selectItems);
                    }
                    for (SelectItem<?> item : select.getSelectItems()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
import net.sf.jsqlparser.statement.select.Distinct;
        return wrapSourceQuery(dataSource, syntaxManager, query);
            } else {
                List<SelectItem<?>> selectItems = new ArrayList<>();
import net.sf.jsqlparser.statement.select.PlainSelect;
        try {
                countFunc.setName("count");
    public SQLQuery transformQuery(
        }
        } catch (DBException e) {
    ) throws DBException {
        } catch (Throwable e) {

            Statement statement = SQLSemanticProcessor.parseQuery(query.getText());
                if (selectDistinct != null) {
                    select.setDistinct(null);
*/
import org.jkiss.dbeaver.DBException;
    @Override
                select.setOrderByElements(null);
 *
 *
        }
            throw new DBCException("Cannot calculate row count for non-SELECT statement '" + query.getText() + "'");
                }
                selectItems.add(new SelectItem(countFunc));
import org.jkiss.utils.CommonUtils;
    private SQLQuery tryInjectCount(@NotNull DBPDataSource dataSource, @NotNull SQLQuery query) throws DBException {
import net.sf.jsqlparser.statement.select.SelectItem;
        String queryText = null;
package org.jkiss.dbeaver.model.sql.transformers;
    private static final String COUNT_WRAP_POSTFIX = "\n) dbvrcnt";
import org.jkiss.dbeaver.model.exec.DBCException;
            }
 * limitations under the License.

                if (select.getGroupBy() != null && !CommonUtils.isEmpty(select.getGroupBy().getGroupByExpressionList())) {
        @NotNull DBPDataSource dataSource,
                Distinct selectDistinct = select.getDistinct();
        // Remove orderings (#4652)

        Statement statement = SQLSemanticProcessor.parseQuery(query.getText());
import net.sf.jsqlparser.expression.Function;
                return tryInjectCount(dataSource, query);
    }
            if (!CommonUtils.isEmpty(plainSelect.getOrderByElements())) {
    @NotNull
        if (queryText == null) {
                        exprs.add(item.getExpression());
    }
                    countFunc.setParameters(new ExpressionList<>(new AllColumns()));
                if (selectDistinct != null) {
                }
 * Transforms SQL query into SELECT COUNT(*) query
import org.jkiss.dbeaver.Log;
public class SQLQueryTransformerCount implements SQLQueryTransformer {
                throw new DBException("Query [" + query.getText() + "] can't be modified");
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull SQLSyntaxManager syntaxManager,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.sql.*;
        // Trim query delimiters (#2541)
 * distributed under the License is distributed on an "AS IS" BASIS,
                    if (!exprs.isEmpty()) {
                    }
 * You may obtain a copy of the License at
                    throw new DBException("Can't inject COUNT into query with HAVING clause");
import net.sf.jsqlparser.statement.select.AllColumns;
 * See the License for the specific language governing permissions and
        return new SQLQuery(dataSource, countQuery, query, false);
    @NotNull
                return new SQLQuery(dataSource, select.toString(), query, false);
    }
                plainSelect.setOrderByElements(null);
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
        String countQuery = COUNT_WRAP_PREFIX + srcQuery + COUNT_WRAP_POSTFIX;
    private static final String COUNT_WRAP_PREFIX = "SELECT COUNT(*) FROM (";
                    List<Expression> exprs = new ArrayList<>();
        try {
}
 * Copyright (C) 2010-2026 DBeaver Corp and others
        @NotNull SQLQuery query
    @NotNull
        String srcQuery = SQLUtils.trimQueryStatement(syntaxManager, queryText, true);
import java.util.List;
        }

    static protected final Log log = Log.getLog(SQLQueryTransformerCount.class);
    ) throws DBException {
/**
                queryText = statement.toString();
            log.debug("Error injecting count: " + e.getMessage());
        if (statement instanceof PlainSelect plainSelect) {

        @NotNull SQLSyntaxManager syntaxManager,


 * DBeaver - Universal Database Manager
        @NotNull DBPDataSource dataSource,
                    //countFunc.setAllColumns(true); // We can't use setAllColumns now (since JSQLParser 4.2), it will return COUNT(ALL). Replaced by AllColumns Expression
        }
                if (select.getHaving() != null) {

