 * DBeaver - Universal Database Manager
        }
import org.jkiss.dbeaver.ui.editors.erd.model.DiagramCollectSettingsDefault;
                        // ignore
            }
    public Object execute(ExecutionEvent event) throws ExecutionException {
        return false;
            if (editor != null && !editor.isReadOnly()) {
 *

                                });
            ERDEditorPart editor = ERDEditorAdapter.getEditor(control);
import org.jkiss.dbeaver.ui.dnd.DatabaseObjectTransfer;
                    }

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.commands.ExecutionException;
        }

            return false;
import org.eclipse.draw2d.geometry.Point;
package org.jkiss.dbeaver.ui.editors.erd.action;
import org.eclipse.gef.commands.Command;
                    try {
import java.lang.reflect.InvocationTargetException;
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
        }
                return true;
        final Collection<DBPNamedObject> objects = DatabaseObjectTransfer.getFromClipboard();
                                editor.getDiagramProject(),
                                editor.isERD());

import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
        if (control != null) {
 *
        if (objects == null || CommonUtils.isEmpty(objects)) {
                            if (!CommonUtils.isEmpty(erdEntities)) {

    }
 * You may obtain a copy of the License at
}
                                    editor.getCommandStack().execute(command);
import java.util.Collection;
            if (object instanceof DBSTable || object instanceof DBSObjectContainer) {
        return null;
                    } catch (InvocationTargetException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.erd.ERDEntity;
                                monitor,
 *
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorAdapter;
 */

    @Override
    {
import org.eclipse.ui.handlers.HandlerUtil;
import org.jkiss.dbeaver.model.erd.DiagramObjectCollector;
                        });
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.ui.UIUtils;
                                UIUtils.syncExec(() -> {

                        UIUtils.runInProgressService(monitor -> {
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
        Control control = (Control) HandlerUtil.getVariable(event, ISources.ACTIVE_FOCUS_CONTROL_NAME);
                                new DiagramCollectSettingsDefault(),
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                final Collection<DBPNamedObject> objects = DatabaseObjectTransfer.getInstance().getObject();
                            }
/*
import org.eclipse.core.commands.ExecutionEvent;
                                    Command command = editor.getDiagramPart().createEntityAddCommand(erdEntities, new Point(10, 10));
import org.eclipse.ui.ISources;
                if (!CommonUtils.isEmpty(objects)) {
    public ERDHandlerPaste() {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
                            final List<ERDEntity> erdEntities = DiagramObjectCollector.generateEntityList(
        for (DBPNamedObject object : objects) {
                        DBWorkbench.getPlatformUI().showError("Entity collect error", "Error during diagram entities collect", e);
    public boolean isEnabled()
                    } catch (InterruptedException e) {
 * you may not use this file except in compliance with the License.
public class ERDHandlerPaste extends AbstractHandler {
                                editor.getDiagram(),
import org.jkiss.dbeaver.model.DBPNamedObject;
                                true,
import org.eclipse.core.commands.AbstractHandler;
    }
    @Override
                                objects,
import org.eclipse.swt.widgets.Control;
