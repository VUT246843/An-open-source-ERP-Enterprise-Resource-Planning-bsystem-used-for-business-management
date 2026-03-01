


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class DBECommandAbstract<OBJECT_TYPE extends DBPObject> implements DBECommand<OBJECT_TYPE> {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 *
    {
        return ignoreNestedCommands;
        this.ignoreNestedCommands = ignoreNestedCommands;

    public void setDisableSessionLogging(boolean disableSessionLogging) {


    @Override

 *
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) throws DBException
    @Override
    private boolean ignoreNestedCommands;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {

        return object;
import java.util.Map;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.impl.edit;
    @Override
    }
    {
    }
    {
}

    public boolean ignoreNestedCommands() {

    public boolean isDisableSessionLogging() {
 * DBeaver - Universal Database Manager
    private final String title;
    public OBJECT_TYPE getObject()
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public void validateCommand(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
        this.title = title;
        return isDisableSessionLogging;
    public void updateModel()
    }
    }
import org.jkiss.code.Nullable;
    public DBECommand<?> merge(@Nullable DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams)

    public boolean isUndoable()
    @NotNull
 * Abstract object command

    @NotNull
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPObject;
    }
    {
 * limitations under the License.
        // do nothing by default
        this.object = object;
    @Override
    {

 *

    @Override
 * you may not use this file except in compliance with the License.
/**
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    }
import org.jkiss.code.NotNull;
    @Override
    private boolean isDisableSessionLogging = false;
        isDisableSessionLogging = disableSessionLogging;
    public String getTitle()

    {
    }
        return null;
    @NotNull
import org.jkiss.dbeaver.DBException;
    }
    }
/*
    }
    @Override
        return title;
        return this;
import org.jkiss.dbeaver.model.edit.DBECommand;
        return true;
    @Override
    public void setIgnoreNestedCommands(boolean ignoreNestedCommands) {
 * Unless required by applicable law or agreed to in writing, software
    }
    public DBECommandAbstract(OBJECT_TYPE object, String title)
    }

    private final OBJECT_TYPE object;
    {
 */
