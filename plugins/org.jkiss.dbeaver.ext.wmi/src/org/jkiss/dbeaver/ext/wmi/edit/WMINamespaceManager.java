import org.jkiss.dbeaver.model.edit.DBECommand;
    @Override
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
import org.jkiss.dbeaver.model.edit.DBEPersistAction;


    }
    public boolean canEditObject(@NotNull WMINamespace object)
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;

 * limitations under the License.
public class WMINamespaceManager extends AbstractObjectManager<WMINamespace> implements DBEObjectEditor<WMINamespace> {


import org.jkiss.dbeaver.model.edit.DBEObjectEditor;
/*
import org.jkiss.dbeaver.ext.wmi.model.WMINamespace;
import org.jkiss.code.NotNull;

    }
    {
    public void executePersistAction(DBCSession session, DBECommand<WMINamespace> wmiNamespaceDBECommand, DBEPersistAction action) throws DBException
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    @Override
package org.jkiss.dbeaver.ext.wmi.edit;
 * DBeaver - Universal Database Manager

/**
 *
import org.jkiss.dbeaver.model.edit.prop.DBEPropertyHandler;
    {
 */
 * See the License for the specific language governing permissions and
 * OracleSchemaManager
 */
    }
import org.jkiss.dbeaver.model.impl.edit.AbstractObjectManager;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCSession;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public DBEPropertyHandler<WMINamespace> makePropertyHandler(@NotNull WMINamespace object, @NotNull DBPPropertyDescriptor property)
}
 *
 * you may not use this file except in compliance with the License.
        return false;
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
