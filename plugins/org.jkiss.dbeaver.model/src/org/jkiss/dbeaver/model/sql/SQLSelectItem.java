 * distributed under the License is distributed on an "AS IS" BASIS,
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * SQL query select item.
        return name;
            table = ((Column) itemExpression).getTable();
    public boolean isPlainColumn() {
public class SQLSelectItem {
        return source.toString();
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.expression.Expression;
    public String getName() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final String name;
 *
            }
            table = atc.getTable();

            if (alias != null) {
 * You may obtain a copy of the License at
                name = item.toString();
        if (table.getAlias() == null && (tableDatabase == null || CommonUtils.isEmpty(tableDatabase.getDatabaseName())) && table.getSchemaName() == null) {
    }
    private final SQLQuery query;
    public DBCEntityMetaData getEntityMetaData() {
            final Alias alias = item.getAlias();
 * you may not use this file except in compliance with the License.
        return plainColumn;
 */
 * Unless required by applicable law or agreed to in writing, software

            table = null;
            // Only name was specified. Probably an alias.
            name = ((Column) itemExpression).getColumnName();

            name = "*";
    SQLSelectItem(SQLQuery query, SelectItem<?> item) {
            }
import net.sf.jsqlparser.statement.select.*;
        if (table == null) {
    }
                if (refTable != null) {
        }
 * Presents in SELECT statements.
            name = "*";
                Table refTable = SQLSemanticProcessor.findTableByNameOrAlias((Select) query.getStatement(), table.getName());
        } else if (itemExpression instanceof AllTableColumns atc) {
import net.sf.jsqlparser.schema.Table;
    }
        Expression itemExpression = item.getExpression();
        }
        this.source = item;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCEntityMetaData;
 * limitations under the License.

 * DBeaver - Universal Database Manager
    private final Table table;
                    return query.createTableMetaData(refTable);
                }
        } else if (itemExpression instanceof AllColumns) {

package org.jkiss.dbeaver.model.sql;
 *
import net.sf.jsqlparser.schema.Database;
 * Licensed under the Apache License, Version 2.0 (the "License");

/*
    private boolean plainColumn;
    private final SelectItem<?> source;
 * See the License for the specific language governing permissions and
            plainColumn = true;
            } else {
        return query.createTableMetaData(table);


        Database tableDatabase = table.getDatabase();
import org.jkiss.utils.CommonUtils;
        if (itemExpression instanceof Column) {
        } else {
    public String toString() {
            if (query.getStatement() instanceof Select) {
    }
            return null;
 */
    }
import net.sf.jsqlparser.expression.Alias;
        this.query = query;
import org.jkiss.dbeaver.model.sql.parser.SQLSemanticProcessor;
}
/**
    @Override
                name = alias.getName();
            table = null;
 *
