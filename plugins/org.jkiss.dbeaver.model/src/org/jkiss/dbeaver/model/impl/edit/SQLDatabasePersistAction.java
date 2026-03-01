    {
        this.complex = complex;

    public void afterExecute(DBCSession session, Throwable error)
    private final ActionType type;
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    @Override
    private final boolean complex;
    {
    public SQLDatabasePersistAction(String title, String script, ActionType type)
    }

    }
    }
 * DBeaver - Universal Database Manager
    {
    }
    public void beforeExecute(DBCSession session) throws DBCException {
        this.title = title;

 * Object persist action implementation

import org.jkiss.code.NotNull;
        return script;
    {
    }
    {
 * See the License for the specific language governing permissions and
    public SQLDatabasePersistAction(String title, String script, boolean complex)
        return title;
    public ActionType getType()
    }
    public SQLDatabasePersistAction(String script)
/*
    private final String title;
 */
    @Override

 *

        this.type = type;
import org.jkiss.dbeaver.model.exec.DBCStatement;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public boolean isComplex() {
        this(title, script, ActionType.NORMAL, complex);
}

 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getTitle()
package org.jkiss.dbeaver.model.impl.edit;
 * You may obtain a copy of the License at
    }
    }
        afterExecute(session, error);




    @Override
    @Override
        return type;
 *
import org.jkiss.dbeaver.model.exec.DBCSession;
    {
    public String getScript()
        this(title, script, ActionType.NORMAL, false);
public class SQLDatabasePersistAction implements DBEPersistAction {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
        this.script = script;
    public SQLDatabasePersistAction(String title, String script)
    }
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    public SQLDatabasePersistAction(String title, String script, ActionType type, boolean complex)
    {
    {
 * Unless required by applicable law or agreed to in writing, software
    @Override
    {
    @Override
    }
        throws DBCException
    }
import org.jkiss.code.Nullable;
        return complex;

/**
    public void afterExecute(@NotNull DBCSession session, @Nullable DBCStatement stmt, @Nullable Throwable error) throws DBException {
        this("", script, ActionType.NORMAL);

 *
        // do nothing
import org.jkiss.dbeaver.model.exec.DBCException;
        this(title, script, type, false);
import org.jkiss.dbeaver.DBException;
    }
        // do nothing
    private final String script;


