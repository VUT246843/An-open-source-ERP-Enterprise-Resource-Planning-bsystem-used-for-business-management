 *
            log.error("Selected node's object is not an attribute");
                break;
        } catch (InvocationTargetException e) {
            return null;
    static void createNewObject(@NotNull DBEObjectMaker<?, ?> maker, DBECommandContext commandContext,

            return null;
        if (columnObjectConcreteType == null) {
        DBECommandContext commandContext;
        }
        DBSObject entityObject = attributeObject.getParentObject();
        DBNNode node = NavigatorHandlerObjectCreateNew.getNodeFromSelection(HandlerUtil.getCurrentSelection(event));
            log.error("Unable to find appropriate child type and it's maker");
    private static final Log log = Log.getLog(NavigatorHandlerCreateColumnObjectBase.class);
            log.error("Selected node is not a database item");
                    maker.createNewObject(monitor, commandContext, entityObject, null, Collections.emptyMap());

        if (!(attributeObject instanceof DBSEntityAttribute)) {
        try {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
import org.jkiss.dbeaver.model.struct.DBSEntity;
        }
        for (Class<?> childType: structEditor.getChildTypes()) {
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * you may not use this file except in compliance with the License.

            throw dbExceptions[0];
                    dbExceptions[0] = e;
            //ignore

import org.jkiss.dbeaver.Log;
        DBNNode containerNode = node.getParentNode();
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
            }
        } catch (DBException e) {
package org.jkiss.dbeaver.ui.navigator.actions;
        if (structEditor == null) {
        }
        if (!(node instanceof DBNDatabaseItem)) {
import org.eclipse.ui.handlers.HandlerUtil;
            createNewObject(maker, commandContext, entityObject);
            log.error("Selected node has no parent");
 * Unless required by applicable law or agreed to in writing, software
        }
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
                columnObjectConcreteType = childType;
    static Object createColumnObject(@NotNull ExecutionEvent event, @NotNull Class<?> columnObjectSuperType) {
        }
        } catch (InterruptedException e) {
        DBEStructEditor<?> structEditor = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(entityObject.getClass(), DBEStructEditor.class);
            maker = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(childType, DBEObjectMaker.class);
        }
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            log.error("No struct editor exists for entity");
        return null;
            UIUtils.getDefaultRunnableContext().run(false, false, monitor -> {

import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.edit.DBEStructEditor;
        }
        }
import org.eclipse.core.commands.ExecutionEvent;
        if (dbExceptions[0] != null) {
        Class<?> columnObjectConcreteType = null;

 *
import org.jkiss.dbeaver.model.navigator.DBNDatabaseItem;
        DBEObjectMaker<?, ?> maker = null;
 *
                                        DBSObject entityObject) throws DBException {
        DBSObject attributeObject = ((DBNDatabaseItem) node).getObject();
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
import java.util.Collections;
            return null;
        }
                } catch (DBException e) {
        try {
                }
            log.warn("Unable to create object of type " + columnObjectConcreteType.getName(), e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            log.warn("Unexpected invocation target exception while creating new object", e);
            });
 * limitations under the License.
public abstract class NavigatorHandlerCreateColumnObjectBase extends NavigatorHandlerObjectBase {
            commandContext = getCommandTarget(HandlerUtil.getActiveWorkbenchWindow(event), containerNode, null, columnObjectConcreteType, false).getContext();
    }
import org.jkiss.dbeaver.ui.UIUtils;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return null;
                try {
import org.jkiss.dbeaver.model.edit.DBEObjectMaker;
            return null;
/*
import java.lang.reflect.InvocationTargetException;
            return null;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (containerNode == null) {

}
            if (maker != null && maker.canCreateObject(entityObject) && columnObjectSuperType.isAssignableFrom(childType)) {
        if (!(entityObject instanceof DBSEntity)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            log.error("Selected node's attribute has no parent");
        DBException[] dbExceptions = new DBException[]{null};
import org.jkiss.code.NotNull;
