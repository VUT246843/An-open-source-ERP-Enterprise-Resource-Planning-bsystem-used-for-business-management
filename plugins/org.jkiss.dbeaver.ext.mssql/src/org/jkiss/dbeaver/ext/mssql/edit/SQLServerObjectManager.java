

 */
}
import java.util.List;
import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 */
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
/*
            actions.add(new SQLDatabasePersistAction("Set current database ", "USE " + DBUtils.getQuotedIdentifier(defaultDatabase), false)); //$NON-NLS-2$
import org.jkiss.dbeaver.model.DBUtils;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
    extends SQLObjectEditor<OBJECT_TYPE, CONTAINER_TYPE> {

        }
import org.jkiss.dbeaver.ext.mssql.model.SQLServerExecutionContext;
 *

 * SQLServerObjectManager
        }
        if (defaultDatabase != null && defaultDatabase != objDatabase) {
            actions.add(new SQLDatabasePersistAction("Set current database", "USE " + DBUtils.getQuotedIdentifier(objDatabase), false)); //$NON-NLS-2$

 *
public abstract class SQLServerObjectManager<OBJECT_TYPE extends DBSObject, CONTAINER_TYPE extends DBSObject>
 * See the License for the specific language governing permissions and
    protected void addDatabaseSwitchAction2(DBCExecutionContext executionContext, List<DBEPersistAction> actions, SQLServerDatabase objDatabase) {
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDatabase;

package org.jkiss.dbeaver.ext.mssql.edit;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (defaultDatabase != null && defaultDatabase != objDatabase) {

    protected void addDatabaseSwitchAction1(DBCExecutionContext executionContext, List<DBEPersistAction> actions, SQLServerDatabase objDatabase) {
 * Unless required by applicable law or agreed to in writing, software
        SQLServerDatabase defaultDatabase = ((SQLServerExecutionContext) executionContext).getDefaultCatalog();
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
        SQLServerDatabase defaultDatabase = ((SQLServerExecutionContext) executionContext).getDefaultCatalog();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
