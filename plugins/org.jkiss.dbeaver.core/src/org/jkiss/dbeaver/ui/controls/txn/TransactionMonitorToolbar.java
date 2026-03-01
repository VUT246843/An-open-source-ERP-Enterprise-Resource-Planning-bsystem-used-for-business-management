            TransactionMonitorToolbar toolbar = new TransactionMonitorToolbar(UIUtils.getActiveWorkbenchWindow());
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                @Override
                // Use gradient depending on update count
            if (txnState == null || !txnState.isTransactionMode()) {

            setUser(false);
                if (updateCount >= maxCount) {
        }
            try {
        MonitorPanel(Composite parent) {
            final IEditorPart activeEditor = workbenchWindow.getActivePage().getActiveEditor();
                int minCount = 0, maxCount = 400;
            DBCExecutionContext executionContext = getActiveExecutionContext();
                    TransactionLogDialog.showDialog(getShell(), getActiveExecutionContext());

        @Override

import org.eclipse.swt.events.MouseEvent;
import org.jkiss.dbeaver.model.exec.DBExecUtils;

    }
        private void updateToolTipText() {
        @Override
            refreshMonitor();
                count = "N/A";
        @Override
        public void handleStatementExecuteEnd(@NotNull DBCStatement statement, long rows, Throwable error) {
        @Override
                bg = UIStyles.getDefaultTextBackground();
            }
        @Nullable
        }

            });
import org.jkiss.dbeaver.model.DBPContextProvider;
    private static final int MONITOR_UPDATE_DELAY = 250;

        }
            if (!monitorPanel.isDisposed()) {
                final RGB COLOR_EMPTY = colorCommitted == null ? RGB_DARK_GREEN : colorCommitted.getRGB();

                return null;
                if (part instanceof DBPContextProvider) {

            addDisposeListener(e -> {
                setToolTipText(toolTip);
                executionContext = ((DBPContextProvider) activeEditor).getExecutionContext();

                Color colorCommitted = QueryLogThemeSettings.instance.colorUncommitted;
            }

                QMUtils.unregisterHandler(qmHandler);
            DBExecUtils.recoverSmartCommit(context);
            return executionContext;
            UIUtils.asyncExec(() -> {
            return Status.OK_STATUS;
import org.jkiss.dbeaver.ui.*;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Override
        final IPartListener partListener = new AbstractPartListener() {
    private class MonitorPanel extends Composite {
    }
*/
    private Control createControl(Composite parent) {
            this.monitorPanel = monitorPanel;
            final Point textSize = e.gc.textExtent(count);
import org.eclipse.core.runtime.IProgressMonitor;
                count = "None";


        RefreshJob(MonitorPanel monitorPanel) {
import org.eclipse.ui.*;

import org.eclipse.swt.SWT;
            }
            return toolbar.createControl(parent);
            }
 * See the License for the specific language governing permissions and
    private static final RGB RGB_DARK_YELLOW = new RGB (128, 128, 0);
        @NotNull
            int panelWidth = fontHeight * 8;
        }
            monitorPanel.addDisposeListener(e -> activePage.removePartListener(partListener));
            refreshMonitor();
        public synchronized void handleTransactionCommit(@NotNull DBCExecutionContext context) {


        private void refreshMonitor() {
                    monitorPanel.refresh();

        @Override
        }
        }
            } else if (updateCount == 0) {
import org.eclipse.swt.graphics.Point;
                redraw();
        protected IStatus run(final IProgressMonitor monitor) {
                public void mouseUp(MouseEvent e) {


        public synchronized void handleTransactionRollback(@NotNull DBCExecutionContext context, DBCSavepoint savepoint) {
        }
            Point point = super.computeSize(wHint, hHint, changed);
            Color bg;
                    ((System.currentTimeMillis() - txnState.getTransactionStartTime()) / 1000) + 1 : 0;
    public static class ToolbarContribution extends WorkbenchWindowControlContribution {

    }
            final int updateCount = txnState == null ? 0 : txnState.getUpdateCount();

            if (workbenchWindow == null || workbenchWindow.getActivePage() == null) {
        private RefreshJob refreshJob;
        final IWorkbenchPage activePage = this.workbenchWindow.getActivePage();
import org.eclipse.swt.events.MouseAdapter;
            qmHandler = new QMEventsHandler(this);
        public void handleContextOpen(@NotNull DBCExecutionContext context, boolean transactional) {
 *


import org.jkiss.dbeaver.core.CoreMessages;
                final long txnUptime = txnState.getTransactionStartTime() > 0 ?
 * DataSource Toolbar
                log.debug("Error updating transaction info: " + e.getMessage());
    private static final RGB RGB_DARK_GREEN = new RGB (0, 255, 0);
            QMUtils.registerHandler(qmHandler);
            @Override
    }
 * Unless required by applicable law or agreed to in writing, software
        private DBCExecutionContext getActiveExecutionContext() {
 *
            }
            }

        }
            refreshMonitor();
 * you may not use this file except in compliance with the License.

                    bg = sharedColors.getColor(rgb);
            } else if (updateCount > 0) {
import org.eclipse.swt.widgets.Composite;
            monitor.beginTask("Extract active transaction info", 1);
            monitor.done();
        }
import org.jkiss.dbeaver.model.runtime.DefaultProgressMonitor;
                count = "Auto";
            final int fontHeight = UIUtils.getFontHeight(this);
            } else if (txnState.isTransactionMode()) {
 */
                count = String.valueOf(updateCount);
            @Override
            setSystem(true);
        }
                updateToolTipText();

            }
            super(IActionConstants.TOOLBAR_TXN);
import org.eclipse.swt.widgets.Control;

            super.setToolTipText(string);
        public void refresh() {
            super(parent, SWT.BORDER);
            this.monitorPanel = monitorPanel;
            public void partActivated(IWorkbenchPart part) {
        @Override

                monitorPanel.refresh();
                if (txnUptime > 0) {
 * You may obtain a copy of the License at
        @Override
import org.jkiss.dbeaver.model.qm.QMTransactionState;
        public Point computeSize(int wHint, int hHint, boolean changed) {

            }
                //monitorPanel.refresh();
            addPaintListener(this::paint);
                int ratio = ((updateCount - minCount) * 100) / (maxCount - minCount);
import org.jkiss.code.NotNull;
        }
                }
            activePage.addPartListener(partListener);
        public synchronized void handleStatementExecuteBegin(@NotNull DBCStatement statement) {
        }
        }
            if (txnState == null) {
import org.jkiss.dbeaver.ui.actions.ConnectionCommands;
import org.jkiss.dbeaver.model.messages.ModelMessages;
                setToolTipText(ModelMessages.error_not_connected_to_database);
            DBCExecutionContext executionContext = null;
        public void setToolTipText(String string) {

                }
        }
            addMouseListener(new MouseAdapter() {
            return QMEventsHandler.class.getName();
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static class QMEventsHandler extends DefaultExecutionHandler {

            e.gc.setForeground(UIStyles.getDefaultTextForeground());
                String toolTip = String.valueOf(txnState.getExecuteCount()) + " total statements\n" +

        };
                }
import org.jkiss.dbeaver.ui.controls.querylog.QueryLogThemeSettings;
import org.eclipse.swt.graphics.RGB;


            this.txnState = executionContext == null ? null : QMUtils.getTransactionState(executionContext);
import org.jkiss.dbeaver.runtime.qm.DefaultExecutionHandler;
                    toolTip += "\n" + String.valueOf(txnUptime) + " seconds uptime";

/*
        this.workbenchWindow = workbenchWindow;
        }
            if (txnState == null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            refreshMonitor();


        private final MonitorPanel monitorPanel;
import org.jkiss.dbeaver.model.exec.DBCSavepoint;
                } else {
                }
/*
    private class RefreshJob extends Job {
        public ToolbarContribution() {
            // Update UI
package org.jkiss.dbeaver.ui.controls.txn;
        protected Control createControl(Composite parent) {

                }
            if (point.x < panelWidth) {
                    final RGB rgb = UIUtils.blend(COLOR_FULL, COLOR_EMPTY, ratio);
                Color colorReverted = QueryLogThemeSettings.instance.colorReverted;
            return point;
        @Override
    private static final Log log = Log.getLog(TransactionMonitorToolbar.class);

import org.jkiss.dbeaver.model.qm.QMUtils;
                    String.valueOf(txnState.getUpdateCount()) + " modifying statements";
            String count;
        }
        public synchronized void handleTransactionAutocommit(@NotNull DBCExecutionContext context, boolean autoCommit) {
import org.jkiss.dbeaver.model.exec.DBCStatement;
            super("Refresh transaction monitor");
        private void paint(PaintEvent e) {
        }
            e.gc.setBackground(bg);
            setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
            e.gc.fillRectangle(bounds.x, bounds.y, bounds.width, bounds.height);

import org.eclipse.core.runtime.jobs.Job;
    }
        }


                ISharedTextColors sharedColors = UIUtils.getSharedTextColors();
import org.jkiss.dbeaver.Log;
        @Override
        }
            setToolTipText(CoreMessages.monitor_panel_transaction_monitor_tip);
 * limitations under the License.

                    return;

            } else {

            e.gc.drawString(count, bounds.x + (bounds.width - textSize.x) / 2 - 2, bounds.y + (bounds.height - textSize.y) / 2 - 1);
import org.eclipse.swt.events.PaintEvent;
        return monitorPanel;
            });
import org.eclipse.core.runtime.Status;
                    bg = sharedColors.getColor(COLOR_FULL);
            if (activeEditor instanceof DBPContextProvider) {
}
import org.eclipse.jface.text.source.ISharedTextColors;
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
    }
            refreshMonitor();
    private IWorkbenchWindow workbenchWindow;
                monitorPanel.updateTransactionsInfo(new DefaultProgressMonitor(monitor));
                if (isDisposed()) {
                ActionUtils.fireCommandRefresh(ConnectionCommands.CMD_TOGGLE_AUTOCOMMIT);
                final RGB COLOR_FULL = colorReverted == null ? RGB_DARK_YELLOW : colorReverted.getRGB();
 */
        private QMTransactionState txnState;
            Rectangle bounds = getBounds();
            } else {
            }
            refreshMonitor();
import org.jkiss.code.Nullable;
        private QMEventsHandler qmHandler;
    private TransactionMonitorToolbar(IWorkbenchWindow workbenchWindow) {
        public String getHandlerName() {

            refreshMonitor();
                bg = QueryLogThemeSettings.instance.colorTransaction;
        if (activePage != null) {
        public void handleContextClose(@NotNull DBCExecutionContext context) {
                setToolTipText(CoreMessages.action_menu_transactionMonitor_autocommitMode);
        @Override
            } catch (Throwable e) {


            DBExecUtils.recoverSmartCommit(context);
            refreshJob = new RefreshJob(this);
            } else if (!txnState.isTransactionMode()) {
            public void partDeactivated(IWorkbenchPart part) {
        private final MonitorPanel monitorPanel;
        @Override
import org.eclipse.swt.graphics.Color;
/**
        final MonitorPanel monitorPanel = new MonitorPanel(parent);
import org.eclipse.swt.graphics.Rectangle;
        }
import org.eclipse.core.runtime.IStatus;
            });
        QMEventsHandler(MonitorPanel monitorPanel) {
 * Licensed under the Apache License, Version 2.0 (the "License");
public class TransactionMonitorToolbar {
            } else {
        }
 * DBeaver - Universal Database Manager
            refreshJob.schedule(MONITOR_UPDATE_DELAY);
        }
        void updateTransactionsInfo(DBRProgressMonitor monitor) {
                qmHandler = null;

            }
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;

            setCursor(parent.getDisplay().getSystemCursor(SWT.CURSOR_HAND));
                point.x = panelWidth;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
