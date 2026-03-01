 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.mysql.model.plan.MySQLPlanAbstract;
 */
    private static final String[] FIRST_KEYWORD_BLOCK_LIST = new String[]{

    public MySQLPlanAbstract explain(JDBCSession session, String query) throws DBCException {
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
            throw new DBCException("This statement could not produce execution plan");
    private static boolean block(String firstKeyword) {
package org.jkiss.dbeaver.ext.tidb.model.plan;
 * Unless required by applicable law or agreed to in writing, software

        final SQLDialect dialect = SQLUtils.getDialectFromObject(this.dataSource);
        for (String blockWord : FIRST_KEYWORD_BLOCK_LIST) {
    }
        final String plainQuery = SQLUtils.stripComments(dialect, query).toUpperCase();
            }
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.model.exec.DBCException;

    private TiDBMySQLDataSource dataSource;
 *
        return true;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.sql.SQLUtils;

        }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.sql.SQLDialect;
 *
            if (!blockWord.equalsIgnoreCase(firstKeyword)) {
        return new TiDBPlainClassic(session, query);
public class TiDBPlanAnalyzer extends MySQLPlanAnalyser {
    @Override
    };
                return false;
/*
        if (TiDBPlanAnalyzer.block(firstKeyword)) {


 * Copyright (C) 2010-2022 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.tidb.mysql.model.TiDBMySQLDataSource;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
    }
        super(dataSource);
        final String firstKeyword = SQLUtils.getFirstKeyword(dialect, plainQuery);
        this.dataSource = dataSource;

        "DESC", "SET", "EXPLAIN"

import org.jkiss.dbeaver.ext.mysql.model.plan.MySQLPlanAnalyser;
    public TiDBPlanAnalyzer(TiDBMySQLDataSource dataSource) {
