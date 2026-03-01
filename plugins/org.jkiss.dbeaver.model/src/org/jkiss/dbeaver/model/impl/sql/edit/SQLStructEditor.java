        nestedCommands.sort((o1, o2) -> {
            return objectCommands;
    }
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
                        //((StructCreateCommand)createCommand).aggregateCommand(childCreateCommand);
            if (!CommonUtils.isEmpty(children)) {
 *
                Class<?> childType = childTypes[i];
                return 1;
            }
        return true;
 * Unless required by applicable law or agreed to in writing, software
            final DBPObject object1 = o1.getObject();

            if (object1 == structCommand.getObject()) {
 * DBeaver - Universal Database Manager
            objectCommands.clear();
        }
                }
            objectCommands.put(getObject(), this);
        }
    @Override


    @Override

    }
                return -1;
                    for (DBSObject child : children) {
            } else if (object2 == structCommand.getObject()) {
                if (childType.isAssignableFrom(object1.getClass())) {
        @Override
        List<NestedObjectCommand> nestedCommands = new ArrayList<>(structCommand.getObjectCommands().values());

                SQLObjectEditor<DBSObject, ?> nestedEditor = getObjectEditor(editorsRegistry, childType);
                        }
        final Class<? extends T> childType = getChildType(type);
            return order1 - order2;
            Class<?>[] childTypes = getChildTypes();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        return new StructCreateCommand(object, ModelMessages.model_jdbc_create_new_object, options);
        }
        for (Class<? extends DBSObject> childType : getChildTypes()) {
 * You may obtain a copy of the License at
                        ObjectCreateCommand childCreateCommand = (ObjectCreateCommand) nestedEditor.makeCreateCommand(child, createCommand.getOptions());
import org.jkiss.dbeaver.model.edit.*;
            return actions.toArray(new DBEPersistAction[0]);
                final DBPObject object = command.getObject();
    {
 */

            addObjectExtraActions(monitor, executionContext, actions, this, options);
 */
        return nestedCommands;
        });
 * Licensed under the Apache License, Version 2.0 (the "License");
        OBJECT_TYPE object = createCommand.getObject();
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.code.NotNull;
        {
    }

                if (childType.isAssignableFrom(object2.getClass())) {
    {
/**

            List<DBEPersistAction> actions = new ArrayList<>();
            Collection<? extends DBSObject> children = getChildObjects(monitor, object, childType);
                            // E.g. primary key indexes

    protected Collection<NestedObjectCommand> getNestedOrderedCommands(final StructCreateCommand structCommand)

                        if (!isIncludeChildObjectReference(monitor, child)) {
{
                return (Class<? extends T>) childType;
                if (nestedEditor != null) {
    }
    @Override
    protected abstract void addStructObjectCreateActions(DBRProgressMonitor monitor, DBCExecutionContext executionContext, List<DBEPersistAction> actions, StructCreateCommand command, Map<String, Object> options) throws DBException;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                    order1 = i;
            super(object, table, options);
    }
    protected final void addObjectCreateActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull List<DBEPersistAction> actions, @NotNull ObjectCreateCommand objectChangeCommand, @NotNull Map<String, Object> options) {
    }
 *
package org.jkiss.dbeaver.model.impl.sql.edit;
            }

                    order2 = i;
        for (Class<? extends DBSObject> childType : getChildTypes()) {
    public class StructCreateCommand extends ObjectCreateCommand
/*
    }
            return false;
        return childType == null ? null : editorsRegistry.getObjectManager(childType, SQLObjectEditor.class);
        public void resetAggregatedCommands()

import java.util.*;
        {
                if (object instanceof DBSObject && DBUtils.isParentOf((DBSObject) object, getObject())) {


            if (command instanceof NestedObjectCommand) {

}
                }

        {
 * distributed under the License is distributed on an "AS IS" BASIS,
public abstract class SQLStructEditor<OBJECT_TYPE extends DBSObject, CONTAINER_TYPE extends DBSObject>
        return null;
            }

                        commandContext.addCommand(childCreateCommand, null, false);
import org.jkiss.dbeaver.model.messages.ModelMessages;
                    objectCommands.put(object, (NestedObjectCommand<?, ?>) command);
        @NotNull
                }
    public StructCreateCommand makeCreateCommand(OBJECT_TYPE object, Map<String, Object> options)
        @Override

    extends SQLObjectEditor<OBJECT_TYPE, CONTAINER_TYPE>
                    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        {
        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) throws DBException {

            int order1 = -1, order2 = 1;
        public boolean aggregateCommand(DBECommand<?> command)
            objectCommands.put(getObject(), this);
import org.jkiss.dbeaver.model.DBUtils;
            addStructObjectCreateActions(monitor, executionContext, actions, this, options);
    implements DBEStructEditor<OBJECT_TYPE>
        return null;
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.struct.DBSObject;
                            // We need to skip some objects as they are automatically created by main commands.
    public Collection<? extends DBSObject> getChildObjects(DBRProgressMonitor monitor, OBJECT_TYPE object, Class<? extends DBSObject> childType) throws DBException {
        implements DBECommandAggregator<OBJECT_TYPE> {
 * See the License for the specific language governing permissions and
 * limitations under the License.
import org.jkiss.dbeaver.DBException;

            }
 * JDBC struct editor

        public Map<DBPObject, NestedObjectCommand<?, ?>> getObjectCommands()
import org.jkiss.dbeaver.model.DBPObject;
    }
    protected void createObjectReferences(DBRProgressMonitor monitor, DBECommandContext commandContext, ObjectCreateCommand createCommand) throws DBException {
        }
    protected  <T extends DBSObject> SQLObjectEditor<T, OBJECT_TYPE> getObjectEditor(DBERegistry editorsRegistry, Class<? extends T> type) {
        @Override
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;


            for (int i = 0, childTypesLength = childTypes.length; i < childTypesLength; i++) {
        }
        }
                }
                    return true;
    protected <T> Class<? extends T> getChildType(Class<T> type) {
                            continue;

        public StructCreateCommand(OBJECT_TYPE object, String table, Map<String, Object> options)
        private final Map<DBPObject, NestedObjectCommand<?, ?>> objectCommands = new LinkedHashMap<>();
        final DBERegistry editorsRegistry = DBWorkbench.getPlatform().getEditorsRegistry();
            if (type.isAssignableFrom(childType)) {
        throw new IllegalStateException("addObjectCreateActions should never be called in struct editor");
            final DBPObject object2 = o2.getObject();
    protected boolean isIncludeChildObjectReference(DBRProgressMonitor monitor, DBSObject childObject) throws DBException {
