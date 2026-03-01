import java.util.List;
                    break;
package org.jkiss.dbeaver.ext.cubrid.ui.config;
        actions.add(new SQLDatabasePersistAction("Update User", builder.toString()));
 *
import org.jkiss.dbeaver.model.edit.prop.DBECommandComposite;
import java.util.ArrayList;
            }
import org.jkiss.dbeaver.model.DBUtils;
 * You may obtain a copy of the License at
                    builder.append(" PASSWORD ").append(SQLUtils.quoteString(getObject(), getProperty(key).toString()));
        buildBody(builder);
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) {
    protected CubridCommandHandler(CubridPrivilage object) {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    @NotNull


import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
        for (Object key : getProperties().keySet()) {
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
                case "DESCRIPTION":

            switch (key.toString()) {
        super(object, "Update User");
 *
/*
        }
        List<DBEPersistAction> actions = new ArrayList<>();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;
public class CubridCommandHandler extends DBECommandComposite<CubridPrivilage, CubridPrivilageHandler>
import org.jkiss.dbeaver.model.sql.SQLUtils;
    private void buildBody(StringBuilder builder) {
            builder.append("ALTER USER ");
 *
 * limitations under the License.
    }
}        }
import org.jkiss.dbeaver.ext.cubrid.model.CubridPrivilage;
                    break;
 * you may not use this file except in compliance with the License.
    @Override
    }
                case "PASSWORD":
            builder.append(DBUtils.getQuotedIdentifier(getObject()));
        StringBuilder builder = new StringBuilder();
    }

        if (getObject().isPersisted()) {

 */
        return actions.toArray(new DBEPersistAction[0]);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    builder.append(" COMMENT ").append(SQLUtils.quoteString(getObject(), getProperty(key).toString()));
 * DBeaver - Universal Database Manager
                default:
 * distributed under the License is distributed on an "AS IS" BASIS,
{

