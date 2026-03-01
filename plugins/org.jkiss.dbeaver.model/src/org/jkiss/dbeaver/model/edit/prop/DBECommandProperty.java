        this.handler = handler;

    public Object getOldValue()
    private Object oldValue;
            ((DBEPropertyReflector<OBJECT_TYPE>)handler).reflectValueChange(getObject(), oldValue, this.newValue);
    {
        }
        this(object, handler);
            // Dunno what to do with it
public class DBECommandProperty<OBJECT_TYPE extends DBPObject> extends DBECommandAbstract<OBJECT_TYPE> {
    private DBEPropertyHandler<OBJECT_TYPE> handler;
        if (handler instanceof DBEPropertyValidator) {
 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.dbeaver.model.DBPObject;


            ((DBEPropertyUpdater<OBJECT_TYPE>)handler).updateModel(getObject(), newValue);
    }
        if (compositeCommand == null) {
    public DBECommandProperty(OBJECT_TYPE object, DBEPropertyHandler<OBJECT_TYPE> handler, Object oldValue, Object newValue)
        this.oldValue = oldValue;
        return handler;
    }
    {
    }
        }
    @NotNull
    @Override
        if (handler instanceof DBEPropertyUpdater) {
        }
        if (handler instanceof DBEPropertyReflector) {
        DBECommandComposite compositeCommand = (DBECommandComposite)userParams.get(getObject());
        return newValue;
            return ((DBEPropertyPersister<OBJECT_TYPE>)handler).getPersistActions(getObject(), newValue);
    private Object newValue;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        if (handler instanceof DBEPropertyPersister) {
import org.jkiss.dbeaver.model.edit.DBECommand;
    @Override

 * Copyright (C) 2010-2024 DBeaver Corp and others
/**


 *

    {
        }
 *
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
 */
    {
        return compositeCommand;
        this.newValue = newValue;
        compositeCommand.addPropertyHandler(handler, newValue);
    public DBEPropertyHandler<OBJECT_TYPE> getHandler()
    //public static final String PROP_COMPOSITE_COMMAND = ".composite";

    }
            ((DBEPropertyValidator<OBJECT_TYPE>)handler).validate(getObject(), newValue);

 * You may obtain a copy of the License at

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options)

    public void setNewValue(Object newValue)
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    public Object getNewValue()
    }
            ((DBEPropertyReflector<OBJECT_TYPE>)handler).reflectValueChange(getObject(), oldValue, this.newValue);
    {

    }
package org.jkiss.dbeaver.model.edit.prop;
        return oldValue;
    public void resetValue()
    }
        super(object, "Property '" + handler + "' change");
    }
    {
    @NotNull
            compositeCommand = handler.createCompositeCommand(getObject());
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    {
import java.util.Map;
    {
    {

 * Abstract object command
 */
 *
import org.jkiss.code.NotNull;
 * limitations under the License.
        return null;
    {
    public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams)
    public void updateModel()
            //return this;
 * DBeaver - Universal Database Manager
    {
        if (!(prevCommand instanceof DBECommandProperty) || prevCommand.getObject() != getObject()) {
    }
    @Override
        this.newValue = this.oldValue;
    public DBECommandProperty(OBJECT_TYPE object, DBEPropertyHandler<OBJECT_TYPE> handler)


import org.jkiss.dbeaver.DBException;
    }
import org.jkiss.dbeaver.model.edit.DBEPersistAction;

        this.newValue = newValue;
    }
 * you may not use this file except in compliance with the License.
            userParams.put(getObject(), compositeCommand);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void validateCommand(@NotNull DBRProgressMonitor monitor, @NotNull Map<String, Object> options) throws DBException
        if (handler instanceof DBEPropertyReflector) {
        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
}
