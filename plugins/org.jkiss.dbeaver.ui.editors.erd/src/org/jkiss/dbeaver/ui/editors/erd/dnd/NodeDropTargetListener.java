import org.jkiss.dbeaver.model.DBPNamedObject;
            public Object getObjectType()
        CreateRequest request = new CreateRequest();
                    UIUtils.runInProgressService(collector);
                } catch (InvocationTargetException e) {
import java.util.List;
public class NodeDropTargetListener extends AbstractTransferDropTargetListener {
/*
                if (objects == null) {
                    return null;
import org.eclipse.gef.requests.CreateRequest;
    protected void updateTargetRequest()

import java.lang.reflect.InvocationTargetException;
    {
    }
 * limitations under the License.
                return RequestConstants.REQ_CREATE;
            {
                        result = DiagramObjectCollector.generateEntityList(
/*
 */
import org.jkiss.dbeaver.model.erd.ERDEntity;
                ERDEditorPart editor = ((DiagramPart) getViewer().getRootEditPart().getContents()).getEditor();
                }
                    @Override
                    for (String error : errorMessages) {

    public NodeDropTargetListener(EditPartViewer viewer)

import org.eclipse.gef.requests.CreationFactory;
                    DBWorkbench.getPlatformUI().showError("Entity collect error", "Error during diagram entities collect", e);
 */
    @Override
                DBRRunnableWithResult<List<ERDEntity>> collector = new DBRRunnableWithResult<List<ERDEntity>>() {
                        new MultiStatus(ERDUIActivator.PLUGIN_ID, 0, statuses.toArray(new IStatus[0]), null, null)
 * Unless required by applicable law or agreed to in writing, software
                            editor.getDiagramProject(),
                Collection<DBPNamedObject> objects = DatabaseObjectTransfer.getInstance().getObject();

 *
            }
                final List<String> errorMessages = editor.getDiagram().getErrorMessages();
import org.eclipse.gef.dnd.AbstractTransferDropTargetListener;
import org.eclipse.gef.EditPartViewer;
        super(viewer, DatabaseObjectTransfer.getInstance());
                        "Error(s) occurred during diagram request. If these errors are recoverable then fix errors and then repeat request",
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithResult;
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
                }
            @Override

                } catch (InterruptedException e) {
                            editor.getDiagram(),
                            monitor,

 * you may not use this file except in compliance with the License.
                }
import java.util.ArrayList;
 * You may obtain a copy of the License at
                    DBWorkbench.getPlatformUI().showError(
import org.eclipse.gef.RequestConstants;
import java.util.Collection;
    {
            @Override
                        "Diagram request error",
import org.eclipse.core.runtime.MultiStatus;
                try {
                    final List<Status> statuses = new ArrayList<>(errorMessages.size());
import org.jkiss.dbeaver.ui.UIUtils;
    }
                if (!errorMessages.isEmpty()) {
 *
    }
    protected Request createTargetRequest()
        request.setFactory(new CreationFactory() {
 */
/**

                    public void run(DBRProgressMonitor monitor) {
                    }
import org.jkiss.dbeaver.ui.editors.erd.model.DiagramCollectSettingsDefault;
            {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    );
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
                            editor.isERD());
    {
 *
}
                    }
        return request;
 * See the License for the specific language governing permissions and
                    editor.getDiagram().clearErrorMessages();
import org.eclipse.gef.Request;

import org.jkiss.dbeaver.model.erd.DiagramObjectCollector;
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
            }
                    // ignore
    @Override
 * Provides a listener for dropping nodes onto the editor drawing

import org.eclipse.core.runtime.Status;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors.erd.dnd;
                            new DiagramCollectSettingsDefault(),
        });

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * distributed under the License is distributed on an "AS IS" BASIS,
        request.setLocation(getDropLocation());
import org.eclipse.core.runtime.IStatus;
            public Object getNewObject()
                };
 * DBeaver - Universal Database Manager
 * Created on Jul 14, 2004
                        statuses.add(new Status(Status.ERROR, ERDUIActivator.PLUGIN_ID, error));
                            true,
                            objects,
import org.jkiss.dbeaver.ui.dnd.DatabaseObjectTransfer;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                return collector.getResult();

