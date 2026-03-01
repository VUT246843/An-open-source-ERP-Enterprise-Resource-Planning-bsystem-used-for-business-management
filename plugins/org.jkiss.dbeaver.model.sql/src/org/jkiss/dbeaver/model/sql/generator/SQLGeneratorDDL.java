        }
    }

 *
            } else {
            String extendedDefinitionText = ((DBPScriptObjectExt) object).getExtendedDefinitionText(monitor);
                sql.append("\n");
import java.util.HashMap;
            delimiter =  SQLUtils.getDefaultScriptDelimiter(sqlDialect);
 * DBeaver - Universal Database Manager

    @Override
        }
import java.util.List;
                }
        String delimiter = SQLConstants.DEFAULT_STATEMENT_DELIMITER;
        for (DBPScriptObject object : objects) {
            DBStructUtils.generateTableListDDL(monitor, sql, tableList, options, false);
import org.jkiss.dbeaver.model.struct.DBSObject;

        addOptions(options);
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
    protected void addOptions(Map<String, Object> options) {
 */
public class SQLGeneratorDDL extends SQLGenerator<DBPScriptObject> {
        sql.append("\n");
import org.jkiss.dbeaver.model.sql.SQLUtils;
            }
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        boolean allTables = true;
        }
            sql.append(SQLConstants.DEFAULT_STATEMENT_DELIMITER);
    @Override

        addOptions(options);
            if (!(object instanceof DBSTable)) {
        result = sql.toString().trim();
        if (!definitionText.endsWith(delimiter)) {
        if (!allTables) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Map<String, Object> options = new HashMap<>();

        try {
import org.jkiss.dbeaver.model.DBPScriptObjectExt;
import java.lang.reflect.InvocationTargetException;
 * See the License for the specific language governing permissions and
    }
            sql.append("\n");
 *
                    sql.append(SQLConstants.DEFAULT_STATEMENT_DELIMITER);
        sql.append(definitionText);
import java.util.Map;
        return true;
        if (object instanceof DBPScriptObjectExt) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        options.put(DBPScriptObject.OPTION_REFRESH, true);
import java.util.ArrayList;
import org.jkiss.dbeaver.model.sql.SQLDialect;
            return;
        if (sql.length() > 0) {
            throw new InvocationTargetException(e);
 * Unless required by applicable law or agreed to in writing, software
    public void generateSQL(DBRProgressMonitor monitor, StringBuilder sql, DBPScriptObject object) throws DBException {
                if (!definition2.endsWith(SQLConstants.DEFAULT_STATEMENT_DELIMITER)) {

        if (object instanceof DBSObject) {
    public boolean isDDLOption() {
                tableList.add((DBSTable) object);
                sql.append("\n");
                allTables = false;
import org.jkiss.dbeaver.model.DBPScriptObject;
        StringBuilder sql = new StringBuilder(100);
 * limitations under the License.
package org.jkiss.dbeaver.model.sql.generator;
}
                break;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
        }
    }

        options.put(DBPScriptObject.OPTION_REFRESH, true);
            SQLDialect sqlDialect = ((DBSObject) object).getDataSource().getSQLDialect();
    @Override
    public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
import org.jkiss.dbeaver.DBException;
            super.run(monitor);
        } catch (DBException e) {
                sql.append(definition2);
        String definitionText = CommonUtils.notEmpty(object.getObjectDefinitionText(monitor, options)).trim();
 * you may not use this file except in compliance with the License.
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override

        super.addOptions(options);
            if (CommonUtils.isNotEmpty(extendedDefinitionText)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others

        List<DBSTable> tableList = new ArrayList<>();
        options.put(DBPScriptObject.OPTION_INCLUDE_OBJECT_DROP, true);
                String definition2 = extendedDefinitionText.trim();
import org.jkiss.dbeaver.model.sql.SQLConstants;
import org.jkiss.dbeaver.model.struct.DBStructUtils;
        }
    }
        Map<String, Object> options = new HashMap<>();
