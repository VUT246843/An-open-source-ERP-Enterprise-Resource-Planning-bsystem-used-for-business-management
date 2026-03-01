                    dbObject = ((DBNDatabaseNode) node).getObject();
    private void copySelection(IWorkbenchWindow workbenchWindow, IWorkbenchPart activePart, ISelection selection) {
 * Unless required by applicable law or agreed to in writing, software
                }
                    selectedNodes.add(node);
 * limitations under the License.
import org.eclipse.jface.viewers.ISelection;
                }
    protected abstract CopyMode getCopyMode();
                }
        }
                    buf.append(GeneralUtils.getDefaultLineSeparator());
import org.jkiss.dbeaver.model.navigator.DBNResource;
        Control focusControl = HandlerUtil.getActiveShell(event).getDisplay().getFocusControl();

 */
import org.jkiss.dbeaver.model.navigator.DBNNode;

            }
        if (clipboardData.hasData()) {
                if (dbObject == null) {

import org.jkiss.dbeaver.ui.IClipboardSource;
import org.eclipse.core.commands.AbstractHandler;
        if (selection instanceof IStructuredSelection structSelection && !selection.isEmpty()) {
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0
            {
                    clipboardData.addTransfer(TreeNodeTransfer.getInstance(), selectedNodes);

                DBPNamedObject dbObject = null;
                if (node instanceof DBNDatabaseNode) {
import org.eclipse.swt.widgets.Control;
    }
                }

 * You may obtain a copy of the License at
        final IWorkbenchPart activePart = HandlerUtil.getActivePart(event);
                DBNNode node = RuntimeUtils.getObjectAdapter(object, DBNNode.class);
                if (node != null) {
            for (Object object : structSelection) {
            try {
                if (objectValue == null) {

    @Override
            return;
 * you may not use this file except in compliance with the License.
                }
    protected abstract String getObjectDisplayString(Object object);
 * DBeaver - Universal Database Manager

import org.eclipse.core.runtime.IPath;
            }
                }
import org.eclipse.core.commands.ExecutionEvent;
        }
        ClipboardData clipboardData = new ClipboardData();
                }
import org.jkiss.dbeaver.ui.dnd.TreeNodeTransfer;
                }
        if (!NavigatorHandlerObjectBase.updateUI) {
                    clipboardData.addTransfer(TextTransfer.getInstance(), buf.toString());

        }
            StringBuilder buf = new StringBuilder();
import org.jkiss.utils.BeanUtils;
import org.eclipse.swt.widgets.Composite;
 * See the License for the specific language governing permissions and

        if (focusControl != null && !(focusControl instanceof Composite)) {
import org.jkiss.dbeaver.ui.CopyMode;
                // No copy method
            }
                if (!selectedFiles.isEmpty() && !clipboardData.hasTransfer(FileTransfer.getInstance())) {
public abstract class NavigatorHandlerCopyAbstract extends AbstractHandler implements IElementUpdater {
                    dbObject = RuntimeUtils.getObjectAdapter(object, DBPNamedObject.class);
import org.jkiss.dbeaver.model.DBPNamedObject;
            clipboardData.pushToClipboard(workbenchWindow.getShell().getDisplay());
                if (!buf.isEmpty() && !clipboardData.hasTransfer(TextTransfer.getInstance())) {
import org.eclipse.core.commands.ExecutionException;
                    if (location != null) {
    }
                if (!buf.isEmpty()) {
        final ISelection selection = HandlerUtil.getCurrentSelection(event);
package org.jkiss.dbeaver.ui.navigator.actions;
                if (!selectedObjects.isEmpty() && !clipboardData.hasTransfer(DatabaseObjectTransfer.getInstance())) {

                BeanUtils.invokeObjectMethod(focusControl, "copy");
        }
import java.util.Map;
                    IPath location = file.getLocation();

                }
    protected abstract String getSelectionTitle(IStructuredSelection selection);
import org.eclipse.ui.handlers.HandlerUtil;
    }
            }
                    clipboardData.addTransfer(FileTransfer.getInstance(), selectedFiles.toArray(new String[0]));
            //ObjectPropertyTester.firePropertyChange(ObjectPropertyTester.PROP_CAN_PASTE);
                if (node instanceof DBNResource && ((DBNResource) node).getResource() instanceof IFile file) {
import java.util.List;

import org.eclipse.swt.dnd.TextTransfer;
            copySelection(workbenchWindow, activePart, selection));
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.eclipse.ui.IWorkbenchPart;
    @Override
import org.jkiss.dbeaver.utils.RuntimeUtils;
            List<DBNNode> selectedNodes = new ArrayList<>();
    public Object execute(ExecutionEvent event) throws ExecutionException {

            IClipboardSource clipboardSource = activePart.getAdapter(IClipboardSource.class);
                    selectedObjects.add(dbObject);
                clipboardSource.addClipboardData(getCopyMode(), clipboardData);
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    public void updateElement(UIElement element, Map parameters) {
import org.jkiss.dbeaver.ui.dnd.DatabaseObjectTransfer;
                        selectedFiles.add(location.makeAbsolute().toFile().getAbsolutePath());
} *
                buf.append(objectValue);
                    }

        {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.menus.UIElement;
            List<DBPNamedObject> selectedObjects = new ArrayList<>();
            List<String> selectedFiles = new ArrayList<>();
    }
            if (clipboardSource != null) {
import org.eclipse.core.resources.IFile;
import org.jkiss.dbeaver.ui.UIUtils;
        UIUtils.syncExec(() ->
import org.eclipse.jface.viewers.IStructuredSelection;
                    continue;
import org.jkiss.dbeaver.ui.ClipboardData;


                if (dbObject != null) {
import org.eclipse.ui.IWorkbenchWindow;
        return null;
                String objectValue = getObjectDisplayString(object);
import org.eclipse.ui.commands.IElementUpdater;
            } catch (Throwable throwable) {
 *
                }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                }
                    clipboardData.addTransfer(DatabaseObjectTransfer.getInstance(), selectedObjects);
                if (!selectedNodes.isEmpty() && !clipboardData.hasTransfer(TreeNodeTransfer.getInstance())) {
    NavigatorHandlerCopyAbstract() {
import org.eclipse.swt.dnd.FileTransfer;
                return null;
        final IWorkbenchWindow workbenchWindow = HandlerUtil.getActiveWorkbenchWindow(event);
 * Copyright (C) 2010-2024 DBeaver Corp and others
