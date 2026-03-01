        });
 * DBeaver - Universal Database Manager
    }
/**
    private final IWorkbenchSite site;
 *
 * DatabaseObjectListControl
 * Unless required by applicable law or agreed to in writing, software
                public void run()
                NavigatorHandlerObjectOpen.openEntityEditor((DBSObject) cellValue);
            };
import org.eclipse.jface.viewers.IContentProvider;
    }
    private void createContextMenu() {
        public boolean isHyperlink(Object element, Object cellValue)
            };
import org.eclipse.swt.widgets.Composite;
import org.jkiss.dbeaver.model.DBPObject;
        setFitWidth(true);
            IAction copyAllAction = new Action(ActionUtils.findCommandName(IActionConstants.CMD_COPY_SPECIAL)) {
import org.jkiss.code.Nullable;
 *
 *
                @Override


            manager.add(copyAllAction);

        @NotNull Composite parent,
        if (site == null) {
                public void run()
            manager.add(copyAction);
                {
            fillCustomActions(manager);
        this.site = site;
import org.jkiss.dbeaver.ui.controls.ObjectViewerRenderer;
            }
 * limitations under the License.
            return;
    @Override
    {
import org.eclipse.ui.internal.WorkbenchMessages;
        }
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.ActionUtils;
        @Override
}
            if (cellValue instanceof DBSObject) {
        {
 * distributed under the License is distributed on an "AS IS" BASIS,
        super(parent, style, contentProvider);
import org.eclipse.ui.IWorkbenchSite;
package org.jkiss.dbeaver.ui.navigator.itemlist;
import org.jkiss.dbeaver.model.struct.DBSObject;
public abstract class DatabaseObjectListControl<OBJECT_TYPE extends DBPObject> extends ObjectListControl<OBJECT_TYPE> {
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
                    clipboardData.pushToClipboard(getDisplay());
        @Override
            IAction copyAction = new Action(WorkbenchMessages.Workbench_copy) {

        }
                    addClipboardData(CopyMode.DEFAULT, clipboardData);
 */
                }
        NavigatorUtils.createContextMenu(site, getItemsViewer(), manager -> {
 */
    }
                    ClipboardData clipboardData = new ClipboardData();
        public void navigateHyperlink(Object cellValue)
 * you may not use this file except in compliance with the License.

                {
import org.jkiss.dbeaver.ui.ClipboardData;
import org.eclipse.jface.action.Action;
import org.jkiss.code.NotNull;
    private class ObjectListRenderer extends ViewerRenderer {
            manager.add(new Separator());

import org.eclipse.jface.action.IAction;
                    ClipboardData clipboardData = new ClipboardData();
/*

        }
                @Override
                }

    @Nullable
                    addClipboardData(CopyMode.ADVANCED, clipboardData);
        @Nullable IWorkbenchSite site,

    protected DatabaseObjectListControl(
        createContextMenu();
    protected ObjectViewerRenderer createRenderer() {
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    clipboardData.pushToClipboard(getDisplay());

import org.eclipse.jface.action.Separator;
import org.jkiss.dbeaver.ui.IActionConstants;
        return new ObjectListRenderer();
        {
            return cellValue instanceof DBSObject;
        int style,
 * See the License for the specific language governing permissions and
        @NotNull IContentProvider contentProvider)
    }

    @NotNull
import org.jkiss.dbeaver.ui.CopyMode;
