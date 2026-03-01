                    } else {
                updateLocalData(privilege, isGrant, withGrantOption, curCatalog, curTable);
        GridData gd = new GridData(GridData.FILL_BOTH);
        highlightTables();
                        log.error(e);
 * See the License for the specific language governing permissions and
    private MySQLTableBase selectedTable;
                        {
    @Override
import org.jkiss.dbeaver.ext.mysql.model.*;

                withGrantOption);
            }
            MySQLGrant grant = new MySQLGrant(
        sash.setSashBorders(new boolean[]{false, false});
    {
    }

                1,
                        @Override
                    tablePrivilegesTable.fillPrivileges(tablePrivs);
            @Override
        }
        isLoaded = true;
                        }

            };
                                privTable.checkPrivilege(privilege, !isGrant);
                        return;

                final boolean isGrant = event.detail >= 1;
                final MySQLTableBase curTable = selectedTable;
                if (grants != null) {
                            if (!privTable.isDisposed() && curCatalog == selectedCatalog && curTable == selectedTable) {
            grants.add(grant);
                    });
    }
    {
    }
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
    private void updateLocalData(MySQLPrivilege privilege, boolean isGrant, boolean withGrantOption, MySQLCatalog curCatalog, MySQLTableBase curTable)
            return new ProgressVisualizer<Collection<MySQLTableBase>>() {
import org.eclipse.swt.graphics.Font;
            List<MySQLPrivilege> privileges = new ArrayList<>();
        otherPrivilegesTable.setLayoutData(gd);
                        {
    @Override
            for (TableItem item : tablesTable.getItems()) {

        privTable.addListener(SWT.Modify, new Listener() {
import org.jkiss.dbeaver.Log;
                    }
            .schedule();
            new DatabaseLoadService<Collection<MySQLTableBase>>(MySQLUIMessages.editors_user_editor_privileges_service_load_tables, getExecutionContext()) {
            return;
        tablePrivilegesTable.setLayoutData(gd);
        // Highlight granted catalogs
    private void highlightCatalogs()
                    }
        }
            catalogsTable.setLayoutData(gd);
                    return null;
import org.jkiss.dbeaver.model.navigator.DBNEvent;
    private void addGrantListener(final PrivilegeTableControl privTable)
            tablesTable.setHeaderVisible(true);
                    showGrants();
            super(parent);

import java.util.List;
                    } else {
 * DBeaver - Universal Database Manager
        }
                        public void redoCommand(@NotNull MySQLCommandGrantPrivilege mySQLCommandGrantPrivilege)
                            break;
                    UIUtils.packColumns(tablesTable);
        }
        } else {
    }
            UIUtils.createTableColumn(tablesTable, SWT.LEFT, MySQLUIMessages.editors_user_editor_privileges_column_table);
                curCatalog == null ? "*" : curCatalog.getName(), //$NON-NLS-1$
 * Unless required by applicable law or agreed to in writing, software
                            continue;
        addGrantListener(otherPrivilegesTable);
                public void widgetSelected(SelectionEvent e) {
            }
                        selectedTable = (MySQLTableBase) tablesTable.getItem(selIndex).getData();
        if (catalogsTable != null && !catalogsTable.isDisposed()) {
                @Override
                item.setText(catalog.getName());
        {
                public void completeLoading(Collection<MySQLTableBase> tables) {
        tablePrivilegesTable.fillGrants(curGrants);
            (source instanceof DBNEvent && ((DBNEvent) source).getSource() == DBNEvent.UPDATE_ON_SAVE) ||
        }
            otherPrivilegesTable.fillGrants(new ArrayList<>(), false);
                    List<MySQLPrivilege> otherPrivs = new ArrayList<>();
import org.jkiss.dbeaver.ui.controls.CustomSashForm;
            return;
                        return selectedCatalog.getTableCache().getAllObjects(monitor, selectedCatalog);
        for (Iterator<MySQLGrant> i = grants.iterator(); i.hasNext();) {
        });
        // Modify local grants (and clear grants cache in user objects)
        return pageControl;
    private PageControl pageControl;
                //} else
            });
            for (MySQLCatalog catalog : getDatabaseObject().getDataSource().getCatalogs()) {
    public synchronized void activatePart()
        leftPane.setLayoutData(new GridData(GridData.FILL_BOTH));
            pageControl.createPrivilegesLoadVisualizer())
        showCatalogTables();
    {
                }
                @Override
                //if (privilege.isGrantOption()) {
            }

            },
                    grant.setGrantOption(withGrantOption);
                    int selIndex = tablesTable.getSelectionIndex();
        {
        LoadingJob.createService(
                    new MySQLCommandGrantPrivilege(
                public Collection<MySQLTableBase> evaluate(@NotNull DBRProgressMonitor monitor)
        }
        sash.setLayoutData(gd);
                    if (selIndex <= 0) {
                TableItem item = new TableItem(catalogsTable, SWT.NONE);
                1,
        }
                        }
                    }
                        selectedCatalog = (MySQLCatalog) catalogsTable.getItem(selIndex).getData();
        for (MySQLGrant grant : grants) {
                if (isGrant) {
                            TableItem item = new TableItem(tablesTable, SWT.NONE);
            if (!grant.isAllPrivileges() && !grant.hasNonAdminPrivileges() && !grant.isGrantOption()) {
                        } else {
                        curCatalog,
                GridData.FILL_BOTH
                        highlightTables();
                MySQLTableBase table = (MySQLTableBase) item.getData();
                }
        CustomSashForm sash = new CustomSashForm(pageControl, SWT.HORIZONTAL);
            tablesTable = new Table(tablesGroup, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
                if (grants != null) {
 * You may obtain a copy of the License at
    @Override
        gd = new GridData(GridData.FILL_BOTH);
        highlightCatalogs();

                item.setFont(null);
            );
                break;
    }
    @Override
        }
        for (MySQLGrant grant : grants) {
        }
import org.eclipse.swt.widgets.*;
                        }
                privileges,
        highlightCatalogs();
                item.setData(catalog);
            catalogsTable = new Table(catalogGroup, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
    private void highlightTables()
                        }
    protected void processGrants(List<MySQLGrant> grantsTmp)
            tablesTable.addSelectionListener(new SelectionAdapter() {
                        item.setText("% (All)"); //$NON-NLS-1$
                }
                    }


        return RefreshResult.IGNORED;
    {
            catalogsTable.setHeaderVisible(true);

    private Table catalogsTable;
        Composite leftPane = UIUtils.createPlaceholder(sash, 2);
                    } catch (DBException e) {
            UIUtils.packColumns(catalogsTable);

            return new ProgressVisualizer<java.util.List<MySQLPrivilege>>() {
import org.eclipse.swt.layout.GridData;
        }
                UIUtils.dispose(boldFont);
            {
                addChangeCommand(
            catalogsTable.addSelectionListener(new SelectionAdapter() {
import org.jkiss.code.NotNull;
            UIUtils.packColumns(tablesTable);
                @Override
                    if (tablesTable.isDisposed()) {
                    tablesTable.removeAll();
                            item.setImage(DBeaverIcons.getImage(table.isView() ? DBIcon.TREE_VIEW : DBIcon.TREE_TABLE));
            }
        public ProgressVisualizer<java.util.List<MySQLPrivilege>> createPrivilegesLoadVisualizer() {
                    }
            {


 *
        getDatabaseObject().clearGrantsCache();
        List<MySQLGrant> curGrants = new ArrayList<>();
 * limitations under the License.
import org.jkiss.dbeaver.model.DBIcon;
    protected PageControl getPageControl()
                    }
 *

            // Privilege table will be grayed. No grants for this table
                        }

                public java.util.List<MySQLPrivilege> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                item.setImage(DBeaverIcons.getImage(DBIcon.TREE_DATABASE));
            .schedule();
        this.grants = new ArrayList<>(grantsTmp);
    }
    private Table tablesTable;
                privileges.add(privilege);
                            updateLocalData(privilege, isGrant, withGrantOption, curCatalog, curTable);
    private boolean isLoaded = false;
                        curTable,
        ph.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                            break;
import org.eclipse.swt.events.SelectionEvent;
        });
                        public void undoCommand(@NotNull MySQLCommandGrantPrivilege mySQLCommandGrantPrivilege)
public class MySQLUserEditorPrivileges extends MySQLUserEditorAbstract
    }
    {
 * MySQLUserEditorPrivileges
            pageControl.createTablesLoadVisualizer())
        gd = new GridData(GridData.FILL_BOTH);
                        grant.addPrivilege(privilege);
            });
        tablePrivilegesTable = new PrivilegeTableControl(ph, MySQLUIMessages.editors_user_editor_privileges_control_table_privileges, false);
                        item.setImage(DBeaverIcons.getImage(DBIcon.TREE_TABLE));

                GridData.FILL_BOTH
            new DatabaseLoadService<java.util.List<MySQLPrivilege>>(MySQLUIMessages.editors_user_editor_privileges_service_load_privileges, getExecutionContext()) {
                MySQLUIMessages.editors_user_editor_privileges_group_catalogs,
            for (TableItem item : catalogsTable.getItems()) {
                    }
                        selectedCatalog = null;
                final boolean withGrantOption = event.detail == 2;
                    if (selectedCatalog == null) {
                        withGrantOption,
 */
            MySQLGrant grant = i.next();
    public RefreshResult refreshPart(Object source, boolean force)
}

            },
                final MySQLPrivilege privilege = (MySQLPrivilege) event.data;
    {
            gd = new GridData(GridData.FILL_BOTH);
                getDatabaseObject(),
                        getDatabaseObject(),
                    if (!ArrayUtils.contains(grant.getPrivileges(), privilege)) {
                    showGrants();
    {
    private MySQLCatalog selectedCatalog;
 */
        showGrants();
package org.jkiss.dbeaver.ext.mysql.ui.editors;
 *
                        }
    private class PageControl extends UserPageControl {
                        return Collections.emptyList();
                    }
                curGrants.add(grant);
        if (tablesTable != null && !tablesTable.isDisposed()) {
                }
                    if (tables != null) {

        public PageControl(Composite parent) {
            }
    private static final Log log = Log.getLog(MySQLUserEditorPrivileges.class);
                @Override
            Composite tablesGroup = UIUtils.createTitledComposite(
            }
                TableItem item = new TableItem(catalogsTable, SWT.NONE);
                }
        }
                    }
                }
    }

import org.jkiss.dbeaver.ui.DBeaverIcons;

import org.jkiss.dbeaver.ext.mysql.ui.config.MySQLCommandGrantPrivilege;
                    throws InvocationTargetException, InterruptedException {
                @Override
        otherPrivilegesTable = new PrivilegeTableControl(ph, MySQLUIMessages.editors_user_editor_privileges_control_other_privileges, false);
        }
            if (grant.matches(curCatalog) && grant.matches(curTable)) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    private PrivilegeTableControl tablePrivilegesTable;
                            tablePrivs.add(priv);
                public void completeLoading(java.util.List<MySQLPrivilege> privs) {
                    grant.removePrivilege(privilege);
                        throw new InvocationTargetException(e);
                @Override
        }
    private void showGrants()
                    loadGrants();
                item.setText("% (All)"); //$NON-NLS-1$
        addGrantListener(tablePrivilegesTable);

                public void widgetSelected(SelectionEvent e) {
        if (!found) {
 *     http://www.apache.org/licenses/LICENSE-2.0

                // Add command
                leftPane,
            activatePart();
        boldFont = UIUtils.makeBoldFont(parent.getFont());
                        if (grant.matches(selectedCatalog) && grant.matches(table) && !grant.isEmpty()) {
                    super.completeLoading(tables);
            Composite catalogGroup = UIUtils.createTitledComposite(
                i.remove();
    private void showCatalogTables()
                        selectedTable = null;
    }
                    for (MySQLPrivilege priv : privs) {
                        return getDatabaseObject().getDataSource().getPrivileges(monitor);
    }
import org.jkiss.dbeaver.model.edit.DBECommandReflector;

                }
                final MySQLCatalog curCatalog = selectedCatalog;
 * Licensed under the Apache License, Version 2.0 (the "License");
                    int selIndex = catalogsTable.getSelectionIndex();
        showCatalogTables();
    @Override
            isLoaded = false;
                        TableItem item = new TableItem(tablesTable, SWT.NONE);
import java.util.*;
            }
        pageControl.createProgressPanel();
                        }
                            updateLocalData(privilege, !isGrant, !withGrantOption, curCatalog, curTable);
/*
                }
                        if (priv.getKind() == MySQLPrivilege.Kind.ADMIN) {
                            if (!privTable.isDisposed() && curCatalog == selectedCatalog && curTable == selectedTable) {
import org.jkiss.dbeaver.ui.UIUtils;
            @Override
    private Font boldFont;
                                privTable.checkPrivilege(privilege, isGrant);


import org.eclipse.jface.layout.GridLayoutFactory;
        if (force ||
            public void handleEvent(Event event)
            }
        leftPane.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
            }
                            item.setFont(boldFont);

/**
    private PrivilegeTableControl otherPrivilegesTable;
    public void createPartControl(Composite parent)
    }
 * you may not use this file except in compliance with the License.
                            item.setText(table.getName());
        }
                        privilege),
                leftPane,
import org.eclipse.swt.SWT;

import org.jkiss.dbeaver.DBException;
                    for (MySQLGrant grant : grants) {
{
        if (grants == null) {
                    }
                        for (MySQLTableBase table : tables) {
                            }
    {
                    }
    {
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
                } else {

            UIUtils.createTableColumn(catalogsTable, SWT.LEFT, MySQLUIMessages.editors_user_editor_privileges_column_catalog);
            gd = new GridData(GridData.FILL_BOTH);
            otherPrivilegesTable.fillGrants(curGrants, true);
                }
        public ProgressVisualizer<Collection<MySQLTableBase>> createTablesLoadVisualizer() {
                            otherPrivs.add(priv);
                false,
                    new DBECommandReflector<MySQLUser, MySQLCommandGrantPrivilege>() {

            if (grant.matches(selectedCatalog) && grant.matches(selectedTable)) {
import org.eclipse.swt.events.SelectionAdapter;
                            item.setData(table);
                    {
                    if (selIndex <= 0) {
        LoadingJob.createService(
        pageControl = new PageControl(parent);
import org.eclipse.swt.events.DisposeEvent;
            public void widgetDisposed(DisposeEvent e)
import org.jkiss.dbeaver.ui.LoadingJob;
                    try {
                MySQLCatalog catalog = (MySQLCatalog)item.getData();
    {

import org.eclipse.swt.events.DisposeListener;
            );

            };
                curTable == null ? "*" : curTable.getName(), //$NON-NLS-1$
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.lang.reflect.InvocationTargetException;
                item.setFont(null);
            }
                            item.setFont(boldFont);
                            }
import org.jkiss.utils.ArrayUtils;
        catalogsTable.setSelection(0);
                        if (priv.getContext().contains("Table")) {
            if (!privilege.isGrantOption()) {

            {
                        @Override

        Composite ph = UIUtils.createPlaceholder(sash, 1);

                        isGrant,
                item.setImage(DBeaverIcons.getImage(DBIcon.TREE_DATABASE));
                    showCatalogTables();
                    List<MySQLPrivilege> tablePrivs = new ArrayList<>();
                    super.completeLoading(privs);
import org.jkiss.dbeaver.ext.mysql.ui.controls.PrivilegeTableControl;
        boolean found = false;
            return RefreshResult.REFRESHED;
    private volatile List<MySQLGrant> grants;
                MySQLUIMessages.editors_user_editor_privileges_group_tables,
                found = true;
        if (isLoaded) {
                    }
                        if (grant.matches(catalog) && !grant.isEmpty()) {
            tablesTable.setLayoutData(gd);
                    } catch (DBException e) {
                    try {
    {
                    otherPrivilegesTable.fillPrivileges(otherPrivs);

                    for (MySQLGrant grant : grants) {
            !isLoaded) {
        if (selectedTable == null) {
        }
    }
        parent.addDisposeListener(new DisposeListener() {
 * Copyright (C) 2010-2026 DBeaver Corp and others

