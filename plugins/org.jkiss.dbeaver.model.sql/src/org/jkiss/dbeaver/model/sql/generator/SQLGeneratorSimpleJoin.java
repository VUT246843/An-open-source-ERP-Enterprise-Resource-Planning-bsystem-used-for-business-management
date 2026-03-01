 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSEntity;
 * See the License for the specific language governing permissions and
}
 * you may not use this file except in compliance with the License.
                        hasCond = true;
                        foundJoin = true;
                if (i > 0) sql.append(", ");
import org.jkiss.dbeaver.model.sql.SQLDialect;
                        sql.append(getLineSeparator()).append("\t");
                aliases.add(alias);
                for (int k = 0; k < i; k++) {
 * distributed under the License is distributed on an "AS IS" BASIS,
                boolean foundJoin = false;
            for (int i = 0; i < objects.size(); i++) {
 * You may obtain a copy of the License at
public class SQLGeneratorSimpleJoin extends SQLGenerator<DBSEntity> {
    @Override

import org.jkiss.dbeaver.model.sql.SQLUtils;
        // Do nothing for each individual table
 * Unless required by applicable law or agreed to in writing, software
                }
                if (!foundJoin) {
                    String tableJoin = SQLUtils.generateTableJoin(
    public void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBSEntity object) {
/*
        SQLDialect sqlDialect = objects.get(0).getDataSource().getSQLDialect();
    }
    public void run(DBRProgressMonitor monitor) throws InvocationTargetException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.ArrayList;
            for (int i = 1; i < objects.size(); i++) {
                        monitor, objects.get(k), aliases.get(k), objects.get(i), aliases.get(i));
            sql.append("SELECT ");
            sql.append(getLineSeparator()).append("FROM ");
        result = sql.toString();
            sql.append(getLineSeparator()).append("WHERE ");
                    || aliases.contains(s));
import java.lang.reflect.InvocationTargetException;
                    }
                sql.append(getEntityName(objects.get(i))).append(" ").append(aliases.get(i));
        final List<String> aliases = new ArrayList<>();
    }
                        if (hasCond) sql.append("AND ");
 *
                    if (tableJoin != null) {
            throw new InvocationTargetException(e);
    @Override
 * limitations under the License.
                    sql.append("\n-- Can't determine condition to join table ").append(DBUtils.getQuotedIdentifier(objects.get(i)));
            for (int i = 0; i < objects.size(); i++) {
        StringBuilder sql = new StringBuilder(100);
 *
                sql.append(alias).append(".*");
            }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBUtils;
        }

            }
                        break;
            }
 */
                }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

package org.jkiss.dbeaver.model.sql.generator;
                if (i > 0) sql.append(", ");
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Exception e) {
import java.util.List;
        try {
 *
                        sql.append(tableJoin);
                String alias = SQLUtils.generateEntityAlias(objects.get(i), s -> sqlDialect.getKeywordType(s) != null
            boolean hasCond = false;

 * Licensed under the Apache License, Version 2.0 (the "License");
