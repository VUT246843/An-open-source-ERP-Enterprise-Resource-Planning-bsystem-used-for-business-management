
    private void refreshGraph(DBAServerLock selected) {
/*
            contributeToToolbar(getLockManager(), contributionManager);
        @Override
    @Nullable
                "Terminate",
        SashForm sashMain = UIUtils.createPartDivider(part, composite, UIUtils.checkSashStyle(SWT.HORIZONTAL | SWT.SMOOTH));
 *
 * you may not use this file except in compliance with the License.
            itemsViewer.setSelection(new StructuredSelection(lock), true);
            });

    }
        blockedLabel.setFont(boldFont);
                refreshLocks(root);
 * LockManagerViewer
/**
        curLock = lock;
    public void refreshLocks(DBAServerLock selected) {

        public void fillCustomActions(IContributionManager contributionManager) {
    public void dispose() {
import org.eclipse.swt.custom.SashForm;
    private Label blockedLabel;
                NLS.bind("Terminate session?", "Terminate"))) {
        refreshControl = new AutoRefreshControl(parent, lockManager.getClass().getSimpleName(), monitor -> UIUtils.syncExec(() -> refreshLocks(null)));
                @Override
import org.eclipse.swt.layout.GridData;
        gv.drawGraf(selected);
        lockTable = new LockListControl(sash, part.getSite(), lockManager, lockManager.getLocksType());
    private LockTableDetail blockingTable;

    private LockListControl lockTable;
import org.eclipse.osgi.util.NLS;

    private LockGraphicalView gv;


    }
    private DBAServerLock getSelectedLock() {
        gv = new LockGraphicalView(this);
        Composite cBlocked = UIUtils.createPlaceholder(infoSash, 1, 5);

    private class LockListControl extends LockTable {
        blockedTable.setLayoutData(new GridData(GridData.FILL_BOTH));
            this.locksType = locksType;
 * DBeaver - Universal Database Manager
            contributionManager.add(killAction);
        	}
    private DBAServerLock curLock;

        @Override
            itemsViewer.getControl().setRedraw(true);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.jface.viewers.StructuredSelection;
        Composite cBlocking = UIUtils.createPlaceholder(infoSash, 1, 5);
    }
        }
            sb.append(curLock.getHoldBy().getTitle());
}import org.jkiss.code.Nullable;
 *


    public Composite getControl() {
        	if (curLock != null) {
        refreshGraph(curLock);
        curLock = lock;
                public void run() {
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockItem;
        ColumnViewer itemsViewer = lockTable.getItemsViewer();


    private Font boldFont;

        }
        sb.setLength(0);
import org.jkiss.dbeaver.ui.editors.locks.graph.LockGraphicalView;
 * You may obtain a copy of the License at

        }
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.jface.action.Action;

 *
        try {
        blockedTable = new LockTableDetail(cBlocked, SWT.SHEET, part.getSite(), lockManager);
            sb.append("Hold - ");
        if (curLock != null && curLock.getHoldBy() != null) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        UIUtils.dispose(boldFont);
    public Action getKillAction() {
import org.jkiss.dbeaver.ui.editors.locks.table.LockTableDetail;
import org.eclipse.swt.graphics.Font;

        blockedLabel.setText(sb.toString());

        infoSash.setLayoutData(new GridData(GridData.FILL_BOTH));
 * limitations under the License.
    public LockGraphManager getGraphManager() {

            sb.append(curLock.getTitle());
        }
    private Label blockingLabel;
import org.eclipse.jface.action.IContributionManager;
        blockedTable.getOptions().putAll(options);
        boldFont = UIUtils.makeBoldFont(parent.getFont());


    private LockTableDetail blockedTable;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            super(sash, SWT.SHEET, site, lockManager);
    public void setTableLockSelect(DBAServerLock lock) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
    }
        blockedTable.loadData(false);
        lockTable.getItemsViewer().addSelectionChangedListener(event -> onLockSelect(getSelectedLock()));
    }
        SashForm sash = UIUtils.createPartDivider(part, sashMain, UIUtils.checkSashStyle(SWT.VERTICAL | SWT.SMOOTH));
    }
    private AutoRefreshControl refreshControl;



                alterSession();
    }
import org.eclipse.swt.SWT;
        return lockTable.getControl();
                    refreshLocks(curLock);



import org.eclipse.swt.widgets.Label;
    }

        gv.createPartControl(sashMain);
import org.eclipse.ui.IWorkbenchSite;
        refreshControl.scheduleAutoRefresh(false);

    }
        lockTable.disposeControl();
        sash.setLayoutData(new GridData(GridData.FILL_BOTH));
        blockingLabel.setFont(boldFont);
            contributionManager.add(new Separator());

    private Action killAction = new Action(LocksUIMessages.actions_refresh_control_kill_waiting_session, UIUtils.getShardImageDescriptor(ISharedImages.IMG_ELCL_STOP)) {
        itemsViewer.getControl().setRedraw(false);
 */
        public void run() {
            lockTable.createAlterService(curLock, null).schedule();


 * See the License for the specific language governing permissions and
import org.eclipse.jface.viewers.ColumnViewer;
    }

        }
    }

    }
import org.eclipse.ui.ISharedImages;


    }
        } finally {
    private LockGraphManager graphManager;
import java.util.Collection;
public class LockManagerViewer {
        if (UIUtils.confirmAction(
        blockingLabel = new Label(cBlocking, SWT.NULL);
        sashMain.setWeights(new int[]{3, 1});
        @Override
import org.jkiss.dbeaver.ui.controls.autorefresh.AutoRefreshControl;

import org.jkiss.dbeaver.ui.editors.locks.table.LockTable;
 */
import org.jkiss.dbeaver.model.admin.locks.DBAServerLock;
            refreshControl.populateRefreshButton(contributionManager);
        gv.drawGraf(selected);
 * Unless required by applicable law or agreed to in writing, software
        blockingTable.getOptions().putAll(options);
        blockingLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        Composite composite = UIUtils.createPlaceholder(parent, 1);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
                setTableLockSelect(root);        		
    protected void onLockSelect(DBAServerLock lock) {
        lockTable.createProgressPanel(composite);
            return new Class[] { locksType };
    protected LockManagerViewer(IWorkbenchPart part, Composite parent, final DBAServerLockManager<DBAServerLock, DBAServerLockItem> lockManager) {

import org.eclipse.jface.action.Separator;

    };
        if (curLock != null) {
        blockingTable.setLayoutData(new GridData(GridData.FILL_BOTH));
    }
        blockedLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import java.util.Map;

import org.jkiss.dbeaver.ui.editors.locks.LocksUIMessages;
        StringBuilder sb = new StringBuilder("Wait - ");

import org.jkiss.dbeaver.model.impl.admin.locks.LockGraphManager;
        return graphManager;
import org.eclipse.ui.IWorkbenchPart;
                DBAServerLock root = graphManager.getGraph(curLock).getLockRoot();

        this.graphManager = (LockGraphManager) lockManager;
    protected void contributeToToolbar(DBAServerLockManager<DBAServerLock, DBAServerLockItem> sessionManager, IContributionManager contributionManager) {
        }
        return killAction;

package org.jkiss.dbeaver.ui.editors.locks.manage;

        lockTable.loadData(false);
import org.jkiss.dbeaver.ui.UIIcon;
        protected Class<?>[] getListBaseTypes(Collection<DBAServerLock> items) {
        lockTable.loadData();
        blockingTable.getOptions().put(LockGraphManager.keyType, LockGraphManager.typeHold);
    public void alterSession() {
    protected void refreshDetail(Map<String, Object> options) {
        private Class<DBAServerLock> locksType;
        return lockTable.getSuitableSelectedElement(DBAServerLock.class);
            blockingLabel.setText(sb.toString());
                }
        }
        LockListControl(SashForm sash, IWorkbenchSite site, DBAServerLockManager<DBAServerLock, DBAServerLockItem> lockManager, Class<DBAServerLock> locksType) {


        blockedTable.getOptions().put(LockGraphManager.keyType, LockGraphManager.typeWait);
            contributionManager.add(new Action(LocksUIMessages.actions_refresh_control_refresh_locks, DBeaverIcons.getImageDescriptor(UIIcon.REFRESH)) {
        blockingTable = new LockTableDetail(cBlocking, SWT.SHEET, part.getSite(), lockManager);
        @Nullable
import org.jkiss.dbeaver.model.admin.locks.DBAServerLockManager;
        blockingTable.loadData();
import org.eclipse.swt.widgets.Composite;
        blockedLabel = new Label(cBlocked, SWT.NULL);
        sash.setWeights(new int[]{4, 1});
        sashMain.setLayoutData(new GridData(GridData.FILL_BOTH));

 * Licensed under the Apache License, Version 2.0 (the "License");
        SashForm infoSash = UIUtils.createPartDivider(part, sash, UIUtils.checkSashStyle(SWT.HORIZONTAL | SWT.SMOOTH));
