        this.script = script;
    public void updateModel()
 *
import java.util.Map;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */

package org.jkiss.dbeaver.model.impl.edit;

 * limitations under the License.
    @Override

    @NotNull

 *     http://www.apache.org/licenses/LICENSE-2.0
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options)
        super(object, title);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * You may obtain a copy of the License at
/**
    @Override
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    {
 *
 * DBeaver - Universal Database Manager
        };
    {
 * Unless required by applicable law or agreed to in writing, software
        return new DBEPersistAction[] {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
/*
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
}import org.jkiss.code.NotNull;
    public SQLScriptCommand(OBJECT_TYPE object, String title, String script)
 *
public class SQLScriptCommand<OBJECT_TYPE extends DBSObject> extends DBECommandAbstract<OBJECT_TYPE> {
    }
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                script)
                getTitle(),
    private String script;
 * Script command
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.



import org.jkiss.dbeaver.model.struct.DBSObject;
    }
            new SQLDatabasePersistAction(

