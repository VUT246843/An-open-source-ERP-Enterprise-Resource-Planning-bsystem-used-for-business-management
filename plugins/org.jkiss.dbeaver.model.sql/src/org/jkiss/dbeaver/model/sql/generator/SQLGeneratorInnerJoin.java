        StringBuilder sql = new StringBuilder(100);
                        monitor, objects.get(k), aliases.get(k), objects.get(i), aliases.get(i));
 * See the License for the specific language governing permissions and
 */
            sql.append("SELECT ");
public class SQLGeneratorInnerJoin extends SQLGenerator<DBSEntity> {
    }
                boolean foundJoin = false;
                    }
 * distributed under the License is distributed on an "AS IS" BASIS,


 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    || aliases.contains(s));
        result = sql.toString();
                    sql.append("\n-- Can't determine condition to join table ").append(DBUtils.getQuotedIdentifier(objects.get(i)));
    }
                if (i > 0) sql.append(", ");
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
            sql.append(getLineSeparator()).append("FROM ");
                sql.append(alias).append(".*");
import java.util.List;
        } catch (Exception e) {
import org.jkiss.dbeaver.model.struct.DBSEntity;
                for (int k = 0; k < i; k++) {
                        break;
        try {
            for (int i = 0; i < objects.size(); i++) {
 *
    @Override
        SQLDialect sqlDialect = objects.get(0).getDataSource().getSQLDialect();
                        sql.append(tableJoin);
    public void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSEntity object) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
    @Override
 * DBeaver - Universal Database Manager
        final List<String> aliases = new ArrayList<>();
                    if (tableJoin != null) {
                        foundJoin = true;
import java.lang.reflect.InvocationTargetException;
            }

                if (!foundJoin) {
                            .append(aliases.get(i)).append(" ON ");
package org.jkiss.dbeaver.model.sql.generator;
                }
            throw new InvocationTargetException(e);
                }
/*
                    String tableJoin = SQLUtils.generateTableJoin(
        // Do nothing for each individual table
                aliases.add(alias);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.ArrayList;
            for (int i = 1; i < objects.size(); i++) {
                        sql.append(getLineSeparator()).append("\tJOIN ").append(objects.get(i)).append(" ")
import org.jkiss.dbeaver.model.DBUtils;
            }
}
        }
 *
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
            sql.append(getEntityName(objects.get(0))).append(" ").append(aliases.get(0));
import org.jkiss.dbeaver.model.sql.SQLDialect;
                String alias = SQLUtils.generateEntityAlias(objects.get(i), s -> sqlDialect.getKeywordType(s) != null
 *     http://www.apache.org/licenses/LICENSE-2.0
