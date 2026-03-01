                // ignore
/**
    public void transformStatement(DBCStatement statement, int parameterIndex) throws DBCException {
 */
    @Override
        final Statement statement = query.getStatement();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * See the License for the specific language governing permissions and
                if (statement instanceof PlainSelect selectBody) {
public class QueryTransformerTop implements DBCQueryTransformer, DBCQueryTransformerExt {
import net.sf.jsqlparser.statement.select.PlainSelect;
    }
    }
                    if (selectBody.getTop() == null && CommonUtils.isEmpty(selectBody.getIntoTables())) {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.utils.CommonUtils;
            } catch (Throwable e) {
    public String transformQueryString(SQLQuery query) throws DBCException {
import org.jkiss.dbeaver.model.sql.SQLQuery;
                        return statement.toString();
        if (statement instanceof PlainSelect select) {
        this.offset = (Number) parameters[0];

        }
        return query.getText();
            statement.setLimit(offset.longValue(), length.longValue());
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
    }

}
    private Number offset;
        }
            }
        if (!limitSet) {
*/
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
                }
 *
import net.sf.jsqlparser.statement.select.Top;
    private Number length;
import net.sf.jsqlparser.statement.Statement;
        // and for queries without FROM (See #16526)
            try {
import org.jkiss.dbeaver.model.exec.DBCQueryTransformerExt;
    @Override
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private boolean limitSet;
    @Override
    private static final Log log = Log.getLog(QueryTransformerTop.class);
    public void setParameters(Object... parameters) {
 * Unless required by applicable law or agreed to in writing, software
 *
 * You may obtain a copy of the License at
import net.sf.jsqlparser.expression.LongValue;

        this.length = (Number) parameters[1];

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        selectBody.setTop(top);
                        limitSet = true;
                    }
/*
import org.jkiss.dbeaver.model.exec.DBCException;
        // TOP cannot be used with OFFSET. See #13594

import org.jkiss.dbeaver.Log;
                Statement statement = query.getStatement();
                        Top top = new Top();
        }
 * you may not use this file except in compliance with the License.
* Query transformer for TOP

                        top.setPercentage(false);
package org.jkiss.dbeaver.model.impl.sql;
 * DBeaver - Universal Database Manager
            return query.isPlainSelect() && select.getOffset() == null && select.getFromItem() != null;
    public boolean isApplicableTo(SQLQuery query) {

        if (query.isPlainSelect()) {
                log.debug(e);
        return false;
        limitSet = false;
import org.jkiss.dbeaver.model.exec.DBCStatement;

 *
                        top.setExpression(new LongValue(offset.longValue() + length.longValue()));

