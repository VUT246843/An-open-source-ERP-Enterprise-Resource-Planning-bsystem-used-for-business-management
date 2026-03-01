    }
        }
 * See the License for the specific language governing permissions and
    ) throws IllegalArgumentException {
            }
            for (IPropertySourceListener listener : listeners) {
            // Notify listeners


/*
            // Check for complex object
        public void redoCommand(@NotNull PropertyChangeCommand command) {
//        }
                final Object[] items = prop.getPossibleValues(editableValue);
        } catch (Throwable e) {
            // Notify listeners

/*
                // Property change for a new object (command list is empty).
                        for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
            // If value should be a named object then try to obtain it from list provider
            for (IPropertySourceListener listener : listeners) {
    @Nullable
        for (IPropertySourceListener listener : listeners) {
//        DBECommandProperty curCommand = objectProps.propValues.get(prop);
                }

    }
                // For collection params convert to array and use first item only.
                List<String> strings = DBUtils.convertArrayStringToList(str);
        @Nullable DBRProgressMonitor monitor,

        if (prop.isNameProperty() && editableValue instanceof DBSObject dbsObject) {
        return (lastCommand != null && lastCommand.property == prop && lastCommand.getObject() == object);
                            if ((items[i] instanceof DBPNamedObject namedObject && value.equals(namedObject.getName())) ||
                    boolean found = false;
        return false;

import org.jkiss.dbeaver.Log;
                    value = strings.getFirst();
            }
//        }
                if (items != null) {
import org.jkiss.code.NotNull;

                                found = true;
//        if (curCommand != null) {
        // To update name-based cache
    private DBECommandContext commandContext;
            managerType);
            }
 * Copyright (C) 2010-2026 DBeaver Corp and others
                commandContext.updateCommand(lastCommand, commandReflector);
                            }
    @Nullable
            listener.handlePropertyChange(editableValue, prop, newValue);
            @NotNull DBEPropertyHandler<DBPObject> propertyHandler,
//        if (compositeCommand != null) {
        return commandContext;
        if (commandContext != null) {
import java.util.List;
            updatePropertyValue(null, command.getObject(), command.property, command.getOldValue(), false);
            editableValue.getClass(),
    }
            && DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(RMConstants.PERMISSION_METADATA_EDITOR);
    private class PropertyChangeCommand extends DBECommandProperty<DBPObject> {
        }
                        }
        @Nullable Object value,
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * PropertySourceEditable
    }

            }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            prop.writeValue(editableValue, value);
    @Override
public class PropertySourceEditable extends PropertySourceAbstract implements DBPObject, IPropertySourceEditable {
        }
    @Override
//        final DBECommandComposite compositeCommand = (DBECommandComposite)getCommandContext().getUserParams().get(obj);
        ObjectPropertyDescriptor property;
            } else if (lastCommand == null || lastCommand.getObject() != editableValue || lastCommand.property != prop || !commandContext.isDirty()) {
                    log.error("Can't obtain object editor for " + getEditableValue());
                // No need to create a new command
import org.jkiss.dbeaver.model.edit.prop.DBECommandProperty;
            return true;
            return null;
            newValue = prop.getValueTransformer().transform(editableValue, newValue);
        for (DBECommand<?> cmd : commandContext.getFinalCommands()) {
            @NotNull ObjectPropertyDescriptor property,
                }
    }
        return objectEditor != null &&
        if (lastCommand != null && lastCommand.property == prop) {
        super(sourceObject, object, true);
                    cache.setCache(cachedObjects);
                return false;
    }
        ) {
    private boolean containCreateCommand(@NotNull DBECommandContext commandContext, @NotNull DBSObject object) {
    {
            }
 *
                                (items[i] instanceof Enum<?> anEnum && value.equals(anEnum.name()))

            if (e instanceof IllegalArgumentException) {
    public void resetPropertyValue(@Nullable DBRProgressMonitor monitor, @NotNull Object object, @NotNull ObjectPropertyDescriptor prop) {
                                break;
import org.jkiss.code.Nullable;
                    }
            if (Collection.class.isAssignableFrom(prop.getDataType()) && value instanceof String str) {
//        final ObjectProps objectProps = getObjectProps(object);
            // Fire object update event
/*
    @Override
        @Nullable DBRProgressMonitor monitor,
    }
*/
        //this.objectManager = editorInput.getObjectManager(DBEObjectEditor.class);
 */
    private boolean updatePropertyValue(
        if (!updatePropertyValue(monitor, editableValue, prop, newValue, false)) {
import org.jkiss.dbeaver.model.edit.*;
                lastCommand.setNewValue(newValue);
        log.warn("Property reset not implemented");
        }
import org.jkiss.utils.CommonUtils;
 * Unless required by applicable law or agreed to in writing, software
    private static final Log log = Log.getLog(PropertySourceEditable.class);
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

                    (DBPObject) editableValue,
            @Nullable Object oldValue,
            return;
                final DBEPropertyHandler<DBPObject> propertyHandler = objectEditor.makePropertyHandler(
                                value = items[i];
    private final CommandReflector commandReflector = new CommandReflector();
import org.jkiss.dbeaver.model.edit.prop.DBEPropertyHandler;


                return true;

        public void updateModel() {
}
 *
        @NotNull ObjectPropertyDescriptor prop,
        }
        // If we perform rename then we should refresh object cache
                    }
            @Nullable Object newValue
                DBSObjectCache cache = objectManager.getObjectsCache(dbsObject);
    @Nullable
        }
        boolean force
                DBUtils.fireObjectUpdate((DBSObject) editableValue, prop);
                        }
*/
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                // Do nothing
    public DBECommandContext getCommandContext()
import org.jkiss.dbeaver.model.struct.cache.DBSObjectCache;
        public PropertyChangeCommand(
            if (editableValue instanceof DBSObject) {
        }
    private <T> T getObjectEditor(@NotNull Class<T> managerType) {
                }
            addChangedProperties(prop, value);
            @NotNull DBPObject editableValue,
                listener.handlePropertyChange(command.getObject(), command.property, command.getOldValue());
        this.commandContext = commandContext;
        if (commandContext == null) {

        }
    }
 */
import org.jkiss.dbeaver.model.struct.DBSObject;
        final Object editableValue = getEditableValue();
                    if (items.length > 0) {
        }
            if (CommonUtils.equalObjects(oldValue, value)) {
                if (objectEditor == null) {
            if (cmd instanceof SQLObjectEditor.ObjectCreateCommand && cmd.getObject() == object) {
        @Override
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
    public boolean isPropertyResettable(@NotNull Object object, @NotNull ObjectPropertyDescriptor prop) {
    private class CommandReflector implements DBECommandReflector<DBPObject, PropertyChangeCommand> {
        final Object oldValue = getPropertyValue(monitor, editableValue, prop, true);
                    if (!found) {
*/
            if (e instanceof InvocationTargetException) {
                if (cache != null && cache.isFullyCached()) {
                if (strings.isEmpty()) {
        @NotNull Object editableValue,
import org.jkiss.dbeaver.model.DBUtils;
import java.lang.reflect.InvocationTargetException;
                final DBEObjectEditor<DBPObject> objectEditor = getObjectEditor(DBEObjectEditor.class);
            updatePropertyValue(null, command.getObject(), command.property, command.getNewValue(), false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                } else {
        @NotNull Object editableValue,
            if (value != null && value.getClass() == String.class) {
                listener.handlePropertyChange(command.getObject(), command.property, command.getNewValue());
    }
        @Nullable Object newValue
                commandContext.addCommand(curCommand, commandReflector);
        @Override
 * limitations under the License.
//            curCommand.resetValue();
    //private final List<IPropertySourceListener> listeners = new ArrayList<IPropertySourceListener>();
        }
        DBEObjectEditor objectEditor = getObjectEditor(DBEObjectEditor.class);
        super(sourceObject, object, true);

            throw new IllegalArgumentException("Can't write property '" + prop.getDisplayName() + "' value", e);

import org.jkiss.dbeaver.model.impl.sql.edit.SQLObjectEditor;
            }

        @Override
                throw (IllegalArgumentException) e;
                    prop);
    public PropertySourceEditable(@Nullable DBECommandContext commandContext, @NotNull Object sourceObject, @NotNull Object object) {
/**
import org.jkiss.dbeaver.model.DBPNamedObject;
            DBEObjectMaker objectManager = getObjectEditor(DBEObjectMaker.class);
            }
            this.property = property;
    }

        // Notify listeners
import java.util.Collection;
                            ) {

            }
//            final Object value = compositeCommand.getProperty(prop.getId());

 * you may not use this file except in compliance with the License.
                lastCommand = curCommand;
                e = ((InvocationTargetException) e).getTargetException();
            }
                PropertyChangeCommand curCommand = new PropertyChangeCommand((DBPObject) editableValue, prop, propertyHandler, oldValue, newValue);
 * You may obtain a copy of the License at
            object instanceof DBPObject po && objectEditor.canEditObject(po)
            } else {
            return true;
/*
                    value = null;
        }
import org.jkiss.dbeaver.model.rm.RMConstants;
                    return;
        return DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(


    }
    ) throws IllegalArgumentException {
    {
    public boolean isEditable(Object object) {
    @Override
                    List<? extends DBSObject> cachedObjects = CommonUtils.copyList(cache.getCachedObjects());
        // Write property value
            final Object oldValue = getPropertyValue(monitor, editableValue, prop, true);
                // FIXME: support all array items search by enum/name (see below)
 * DBeaver - Universal Database Manager
            super(editableValue, propertyHandler, oldValue, newValue);
            super.updateModel();
    public PropertySourceEditable(@NotNull Object sourceObject, @NotNull Object object)
                            value = null;
    private PropertyChangeCommand lastCommand = null;
            setPropertyValue(monitor, object, prop, lastCommand.getOldValue());
import org.jkiss.dbeaver.model.DBPObject;
        if (prop.getValueTransformer() != null) {
        @NotNull ObjectPropertyDescriptor prop,
package org.jkiss.dbeaver.runtime.properties;
                        if (value.getClass() != prop.getDataType()){
            if (editableValue instanceof DBSObject dbo && !dbo.isPersisted() && !containCreateCommand(commandContext, dbo)) {
        if (editableValue == null) {
            }
        }
                // Last command is not applicable (check for isDirty because command queue might be reverted)
 *

        }
        public void undoCommand(@NotNull PropertyChangeCommand command) {
    public void setPropertyValue(
            updatePropertyValue(null, getObject(), property, getNewValue(), true);
            if (objectManager != null) {
        try {
    @SuppressWarnings("unchecked")
