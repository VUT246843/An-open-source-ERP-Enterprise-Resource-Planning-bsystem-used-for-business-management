
    }
        return title;
    }
    {
 * DBeaver - Universal Database Manager
    public String getScript()
 */
    }
 * Direct persist action implementation
 * limitations under the License.
        this.type = type;
    {
    public boolean isComplex() {
/**
 * See the License for the specific language governing permissions and
 *


 *
package org.jkiss.dbeaver.model.impl.edit;
    {

    @Override
        return false;
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.exec.DBCSession;
    {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.title = title;


    private final String title;
 * You may obtain a copy of the License at
    public DirectDatabasePersistAction(String title, ActionType type)
 * Unless required by applicable law or agreed to in writing, software
    }
    }

    {
    public String getTitle()



    private final ActionType type;
/*
    }
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
        this(title, ActionType.NORMAL);
    @Override

 */
    public DirectDatabasePersistAction(String title)
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
    }
import org.jkiss.dbeaver.model.exec.DBCException;
        return type;

    public ActionType getType()
public abstract class DirectDatabasePersistAction implements DBEPersistAction {
    public void beforeExecute(DBCSession session) throws DBCException {
 * Licensed under the Apache License, Version 2.0 (the "License");
}
        return null;
