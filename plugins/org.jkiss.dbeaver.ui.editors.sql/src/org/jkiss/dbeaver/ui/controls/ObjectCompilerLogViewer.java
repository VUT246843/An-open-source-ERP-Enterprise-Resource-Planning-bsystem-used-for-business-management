                    item.setText(1, String.valueOf(((DBCCompileError) message).getLine()));
                public void run()
        UIUtils.createTableColumn(infoTable, SWT.LEFT, "Pos");
        createContextMenu();
    }
            tdt.toString());
                    item.setText(2, String.valueOf(((DBCCompileError) message).getPosition()));
                    copySelectionToClipboard();
                public void run()
                public void mouseDoubleClick(MouseEvent e) {
    private Table infoTable;
                infoTable.showItem(item);
/*
 *
            if (message instanceof DBCCompileError) {
                error = (DBCCompileError) message;
        menuMgr.setRemoveAllWhenShown(true);
 * You may obtain a copy of the License at
        Menu menu = menuMgr.createContextMenu(infoTable);

import org.eclipse.swt.events.MouseAdapter;
import org.jkiss.dbeaver.ui.UIUtils;
    protected void log(final int type, final Object message, final Throwable t)
    {
                infoTable.getColumn(1).setWidth(50);
        MenuManager menuMgr = new MenuManager();
        if (sourceHost != null) {
                }

                            sourceHost.positionSource(line, position);
        for (TableItem item : selection) {

            //manager.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
                    break;
                }
                    infoTable.selectAll();
import org.eclipse.swt.dnd.TextTransfer;
                    TableItem[] selection = infoTable.getSelection();
import org.eclipse.ui.IWorkbenchCommandConstants;
    private void createContextMenu()
                        TableItem item = selection[0];
                @Override
import org.eclipse.jface.action.Action;
            DBCCompileError error = null;
                    stackItem.setForeground(infoTable.getDisplay().getSystemColor(SWT.COLOR_RED));
                    if (errorMessage == null || errorMessage.equals(prevMessage)) {

                case LOG_LEVEL_TRACE:
            } else {
            int color = -1;
                    TableItem stackItem = new TableItem(infoTable, SWT.NONE);
            manager.add(clearLogAction);
                item.setData(message);
                case LOG_LEVEL_INFO:
                        continue;
                {
        infoTable.setLayoutData(new GridData(GridData.FILL_BOTH));
    {
            }
import org.jkiss.dbeaver.model.exec.compile.DBCCompileLogBase;
    }
        }
        UIUtils.createTableColumn(infoTable, SWT.LEFT, "Message");

    }
            };
 * Unless required by applicable law or agreed to in writing, software
            infoTable.addMouseListener(new MouseAdapter() {
                    color = SWT.COLOR_DARK_YELLOW;
            return;
        final TableItem[] selection = infoTable.getSelection();

            selectAllAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_SELECT_ALL);
import org.jkiss.dbeaver.utils.GeneralUtils;
            }
                    prevMessage = errorMessage;
import org.eclipse.swt.widgets.Menu;
                    break;
    }
            manager.add(copyAction);
        infoTable.setHeaderVisible(true);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super.clearLog();
                @Override
            if (t != null) {
import org.jkiss.utils.ArrayUtils;
                default:
                }

            IAction clearLogAction = new Action(WorkbenchMessages.Workbench_revert) {
                final TableItem item = new TableItem(infoTable, SWT.NONE);
        });
        UIUtils.syncExec(() -> {
 * See the License for the specific language governing permissions and
 */
            copyAction.setActionDefinitionId(IWorkbenchCommandConstants.EDIT_COPY);
                        Object data = item.getData();
import org.eclipse.jface.action.IAction;
        UIUtils.setClipboardContents(
import org.eclipse.swt.widgets.Composite;
                {
        StringBuilder tdt = new StringBuilder();
            IAction selectAllAction = new Action(WorkbenchMessages.Workbench_selectAll) {
import java.util.StringTokenizer;
            String messageStr;
                if (error != null && error.getLine() > 0) {

                            int line = ((DBCCompileError) data).getLine();
                item.setText(0, st.nextToken());
                infoTable.getColumn(0).setWidth(infoTable.getBounds().width - 110);
                            sourceHost.setCompileInfo(((DBCCompileError) data).getMessage(), true);
                        }
import org.eclipse.swt.widgets.TableItem;
package org.jkiss.dbeaver.ui.controls;

 *
        }
 * UI Compiler log
                public void run()

                    stackItem.setText(errorMessage);
                    color = SWT.COLOR_DARK_BLUE;
            }
            tdt.append(item.getText())
            copyAction.setEnabled(infoTable.getSelectionCount() > 0);
            if (!infoTable.isDisposed()) {
            };
            }
                    item.setForeground(infoTable.getDisplay().getSystemColor(color));
                return;

 */
import org.eclipse.swt.SWT;
        infoTable.removeAll();
    {

                for (Throwable ex = t; error != null; ex = ex.getCause()) {
                case LOG_LEVEL_WARN:
    }
                    if (selection.length > 0) {
                    color = SWT.COLOR_DARK_RED;
}

            TextTransfer.getInstance(),
import org.eclipse.ui.internal.WorkbenchMessages;
                }
 *     http://www.apache.org/licenses/LICENSE-2.0
                .append(GeneralUtils.getDefaultLineSeparator());
 * DBeaver - Universal Database Manager
                messageStr = CommonUtils.toString(message);
                    infoTable.showItem(stackItem);
        menuMgr.addMenuListener(manager -> {
    @Override
        });
            });
    public void layoutLog()
        UIUtils.asyncExec(() -> {
            while (st.hasMoreTokens()) {
 * you may not use this file except in compliance with the License.
        infoTable = new Table(parent, SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION | (bordered ? SWT.BORDER : SWT.NONE));
                }
public class ObjectCompilerLogViewer extends DBCCompileLogBase {
        }
            }
        if (ArrayUtils.isEmpty(selection)) {
 * limitations under the License.
import org.eclipse.swt.events.MouseEvent;
            StringTokenizer st = new StringTokenizer(messageStr, "\n"); //$NON-NLS-1$
                case LOG_LEVEL_ERROR:
                infoTable.getColumn(2).setWidth(50);
            infoTable.getDisplay(),
            if (infoTable == null || infoTable.isDisposed()) {
                case LOG_LEVEL_FATAL:
 *
    public void clearLog()
/**
import org.jkiss.dbeaver.model.exec.compile.DBCSourceHost;

                    }
import org.eclipse.swt.widgets.Table;

import org.eclipse.jface.action.MenuManager;
                }
                String prevMessage = null;
        super.log(type, message, t);
    {
        infoTable.setMenu(menu);
    {
                            int position = ((DBCCompileError) data).getPosition();
                    break;
                case LOG_LEVEL_DEBUG:
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    private void copySelectionToClipboard()
                messageStr = error.getMessage();
                        if (data instanceof DBCCompileError) {

            manager.add(selectAllAction);
            switch (type) {
    }
        });
                    final String errorMessage = ex.getMessage();
                    break;
                @Override
                {
            }
import org.jkiss.dbeaver.model.exec.compile.DBCCompileError;
    @Override
                @Override
                    }
import org.jkiss.utils.CommonUtils;
            };

import org.eclipse.swt.layout.GridData;
        infoTable.addDisposeListener(e -> menuMgr.dispose());
        UIUtils.createTableColumn(infoTable, SWT.LEFT, "Line");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    infoTable.removeAll();

    public ObjectCompilerLogViewer(Composite parent, DBCSourceHost sourceHost, boolean bordered)
        super();
                if (color != -1) {
                    break;
    {
                }
            IAction copyAction = new Action(WorkbenchMessages.Workbench_copy) {
