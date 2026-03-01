                    SQLSemanticProcessor.addWhereToSelect(select, "ROWNUM <= " + totalRows);
import org.jkiss.dbeaver.model.exec.DBCQueryTransformer;
    private static final Log log = Log.getLog(QueryTransformerRowNum.class);
                log.debug(e);
 *
    private Number offset;
* Query transformer for ROWNUM
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    return statement.toString();
 */
import org.jkiss.dbeaver.model.exec.DBCStatement;


        if (query.isPlainSelect()) {


    }
                Statement statement = query.getStatement();
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    public void setParameters(Object... parameters) {
                if (statement instanceof PlainSelect select) {
    @Override
        this.offset = (Number) parameters[0];
        }
        this.length = (Number) parameters[1];
    private Number length;
import net.sf.jsqlparser.statement.select.Select;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class QueryTransformerRowNum implements DBCQueryTransformer {
    }

            } catch (Throwable e) {
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
 * limitations under the License.
*/
        long totalRows = offset.longValue() + length.longValue();
package org.jkiss.dbeaver.ext.oracle.data;
import org.jkiss.dbeaver.model.exec.DBCException;
    public String transformQueryString(SQLQuery query) throws DBCException {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.sql.SQLQuery;
    @Override
 * See the License for the specific language governing permissions and
        return query.getText();
        statement.setLimit(offset.longValue(), length.longValue());
}
                }
            }
import net.sf.jsqlparser.statement.Statement;
                // ignore
import net.sf.jsqlparser.statement.select.PlainSelect;
/**
import org.jkiss.dbeaver.Log;

    @Override
            try {
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

/*
 * Unless required by applicable law or agreed to in writing, software
    }
 *
    public void transformStatement(DBCStatement statement, int parameterIndex) throws DBCException {
