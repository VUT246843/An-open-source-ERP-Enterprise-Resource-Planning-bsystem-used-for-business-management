import org.jkiss.dbeaver.model.navigator.DBNEvent;
                    } catch (Exception e) {
    private Font boldFont;
                        if (grant.canHighlightTable(selectedDatabase.name, tb)) {
                @Override
        }
        String tb = "";
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.layout.GridLayoutFactory;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            activatePart();
                IoTDBUiMessages.editors_user_editor_privileges_service_load_privileges,

                }
    private void highlightTables() {

                    }
            item.setImage(DBeaverIcons.getImage(DBIcon.TREE_DATABASE));
                    }
        pageControl = new PageControl(parent);
        highlightDatabases();
        });
            super(parent);
 * limitations under the License.
    protected void processGrants(List<IoTDBGrant> grantsTmp) {
                UIUtils.dispose(boldFont);
        if (executionContext == null) {
                        return Collections.emptyList();
                item.setFont(null);
    @Override
        tablePrivilegesTable.addListener(SWT.Modify, new Listener() {
    /**

                item = new TableItem(databasesTable, SWT.NONE);

            db = selectedDatabase.name.equals("(ALL)") ? "*" : selectedDatabase.name;

    private Table databasesTable;

        leftPane.setLayoutData(new GridData(GridData.FILL_BOTH));
 * DBeaver - Universal Database Manager
            };
        boldFont = UIUtils.makeBoldFont(parent.getFont());
                public List<String> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
            return new ProgressVisualizer<List<String>>() {
                    if (selectedDatabase == null) {
                    tablesTable.removeAll();;
                    if (!selectedDatabase.name.equals("(ALL)")) {
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBPrivilege;
            for (TableItem item : databasesTable.getItems()) {
        LoadingJob.createService(
                        return tables;
                    tablePrivilegesTable.fillPrivileges(privileges);
                if (grants != null) {
                }
import org.eclipse.swt.SWT;
                    }
            }
                    } else {

            item.setData(getDatabaseObject().getDatabaseAll());
    private PageControl pageControl;
        parent.addDisposeListener(new DisposeListener() {
        tablePrivilegesTable.fillGrants(currentGrants);
            TableItem item = new TableItem(databasesTable, SWT.NONE);
            databasesTable = new Table(databaseGroup, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
        CustomSashForm sash = new CustomSashForm(pageControl, SWT.HORIZONTAL);
            UIUtils.packColumns(databasesTable);

    private class PageControl extends UserPageControl {
    }
        this.grants = new ArrayList<>(grantsTmp);
            }
            tablesTable.addSelectionListener(new SelectionAdapter() {
        List<IoTDBGrant> currentGrants = new ArrayList<>();
                    }
                        @Override
                        return null;

    @Override
        if (tablesTable != null && !tablesTable.isDisposed()) {
                }
                }
                if (tb.equals("(ALL)")) {
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                final String tb = selectedTable;
            public void widgetDisposed(DisposeEvent e) {
    private volatile List<IoTDBGrant> grants;
            ) {
            isLoaded = false;
            tablesTable.setHeaderVisible(true);
     * Highlight tables with granted privileges
        public PageControl(Composite parent) {
        // databases

                            item.setImage(DBeaverIcons.getImage(DBIcon.TREE_TABLE));
        }

                        @Override
 * You may obtain a copy of the License at
/*
        for (IoTDBGrant grant : grants) {
import org.eclipse.swt.events.SelectionAdapter;
                            item.setData(table);
                    List<String> tables = new ArrayList<>();
import org.jkiss.dbeaver.ext.iotdb.ui.internal.IoTDBUiMessages;
                    }
            public void handleEvent(Event event) {

                    showDatabaseTables();
        });
import org.eclipse.swt.widgets.*;
                    for (IoTDBGrant grant : grants) {
                @Override
        {
            return;
                item.setData(db);
                    int selIndex = databasesTable.getSelectionIndex();
            tablePrivilegesTable.setLayoutData(gd);

 *


            @Override

            return RefreshResult.REFRESHED;
import org.jkiss.dbeaver.ui.controls.CustomSashForm;
            databasesTable.addSelectionListener(new SelectionAdapter() {
import org.eclipse.swt.layout.GridData;
            @Override
                if (grants != null) {
                addChangeCommand(

                executionContext
                String db = item.getText();
                            item.setText(table);
import org.jkiss.dbeaver.ui.DBeaverIcons;
 *
        sash.setSashBorders(new boolean[]{false, false});
                            // no-op
                    if (selIndex < 0) {
                            break;
    @Override
    public RefreshResult refreshPart(Object source, boolean force) {
                    if (user == null) {
    }
            pageControl.createPrivilegesLoadVisualizer()

                    }
            gd = new GridData(GridData.FILL_BOTH);
                            TableItem item = new TableItem(tablesTable, SWT.NONE);
                            break;

            databasesTable.setHeaderVisible(true);
 * Licensed under the Apache License, Version 2.0 (the "License");
            UIUtils.packColumns(tablesTable);
                    return user.getDataSource().getPrivilegesByKind(false);
                    IoTDBUiMessages.editors_user_editor_privileges_service_load_tables, getExecutionContext()) {
                        tables.addAll(selectedDatabase.tables);
    private void showDatabaseTables() {

            Composite databaseGroup = UIUtils.createTitledComposite(leftPane, "Databases", 1, GridData.FILL_BOTH);
        return pageControl;
        }
}
        ).schedule();
        }
                    for (IoTDBGrant grant : grants) {
 *

                        isLoaded = false;
     */
 * Copyright (C) 2010-2026 DBeaver Corp and others
    @Override
                        highlightTables();
                        return;
import java.lang.reflect.InvocationTargetException;
                        for (String table : tables) {
    private Table tablesTable;
                    loadGrants();
        return RefreshResult.IGNORED;
        if (isLoaded) {
                    showGrants();
                    new IoTDBCommandGrantPrivilege(getDatabaseObject(), tp, db, tb, privilege),
            pageControl.createTablesLoadVisualizer()
            tablesTable.setLayoutData(gd);
        GridData gd = new GridData(GridData.FILL_BOTH);
    public void createPartControl(Composite parent) {
        DBCExecutionContext executionContext = getExecutionContext();
        {
import org.jkiss.code.NotNull;
            new DatabaseLoadService<List<String>>(
                @Override
    @Override
    private String selectedTable;
        sash.setLayoutData(gd);
                    }
                @Override
                        selectedDatabase = (IoTDBRelationalUser.IoTDBDatabase) databasesTable.getItem(selIndex).getData();
            gd = new GridData(GridData.FILL_BOTH);
                }
                item.setText(db.name);
            tablesTable = new Table(tablesGroup, SWT.BORDER | SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL);
            !isLoaded) {
        public ProgressVisualizer<List<String>> createTablesLoadVisualizer() {
        showDatabaseTables();

                    return null;
        rightPane.setLayoutData(new GridData(GridData.FILL_BOTH));
            gd = new GridData(GridData.FILL_BOTH);
    }
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBRelationalUser;
    private static Log log = Log.getLog(IoTDBUserEditorPrivileges.class);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.util.Collections;
import org.eclipse.swt.events.SelectionEvent;
        ).schedule();


                }
        }
            Composite tablesGroup = UIUtils.createTitledComposite(leftPane, "Tables", 1, GridData.FILL_BOTH);
    /**
                item.setImage(DBeaverIcons.getImage(DBIcon.TREE_DATABASE));
        if (databasesTable != null && !databasesTable.isDisposed()) {
    protected PageControl getPageControl() {
    }

                    UIUtils.packColumns(tablesTable);
                final int tp = event.detail;
                currentGrants.add(grant);
import org.eclipse.swt.graphics.Font;
    }
                        log.error("Error loading tables", e);
 * you may not use this file except in compliance with the License.
        Composite leftPane = UIUtils.createPlaceholder(sash, 2);
                String tb = item.getText();
            },
                    IoTDBRelationalUser user = getDatabaseObject();
        }
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBGrant;
                @Override

            (source instanceof DBNEvent && ((DBNEvent) source).getSource() == DBNEvent.UPDATE_ON_SAVE) ||
                @Override

            });
                public void widgetSelected(SelectionEvent e) {
                    }
                        selectedDatabase = null;
        }
        leftPane.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
import org.eclipse.swt.events.DisposeEvent;
import org.jkiss.dbeaver.model.DBIcon;
                final String db = selectedDatabase.name;
    private PrivilegeTableControl tablePrivilegesTable;
            }
            tablePrivilegesTable = new PrivilegeTableControl(rightPane, "Table Privileges");
                    });
                public void widgetSelected(SelectionEvent e) {
                    tb = "*";
            item.setText("(ALL)");
                if (db.equals("(ALL)")) {
    }
     */
                        public void redoCommand(@NotNull IoTDBCommandGrantPrivilege command) {
        String db = "";
            new DatabaseLoadService<>(
        pageControl.createProgressPanel();
                        tables.add("(ALL)");
            return;
import org.jkiss.dbeaver.ui.LoadingJob;
        // left side
        }
                    int selIndex = tablesTable.getSelectionIndex();
 *     http://www.apache.org/licenses/LICENSE-2.0
            UIUtils.createTableColumn(databasesTable, SWT.LEFT, "Database");
        LoadingJob.createService(
                        selectedTable = tablesTable.getItem(selIndex).getText();
            return new ProgressVisualizer<List<IoTDBPrivilege>>() {
        Composite rightPane = UIUtils.createPlaceholder(sash, 1);
    private boolean isLoaded = false;
                    if (tables != null) {
                            item.setFont(boldFont);
                    }
                    db = "*";
                        }
        }
                    }
                        }
 * See the License for the specific language governing permissions and
                public void completeLoading(List<String> tables) {
            databasesTable.setLayoutData(gd);
                        public void undoCommand(@NotNull IoTDBCommandGrantPrivilege command) {
                    super.completeLoading(tables);
            }
                }
    public synchronized void activatePart() {
                public List<IoTDBPrivilege> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    new DBECommandReflector<IoTDBRelationalUser, IoTDBCommandGrantPrivilege>() {
        public ProgressVisualizer<List<IoTDBPrivilege>> createPrivilegesLoadVisualizer() {
        {
            if (grant.matches(db, tb)) {
    }
            UIUtils.createTableColumn(tablesTable, SWT.LEFT, "Table");
    private IoTDBRelationalUser.IoTDBDatabase selectedDatabase;
     * Highlight databases with granted privileges
        // tables
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
                    } else {

            return;
import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
    }
                }
        // right side
                        }

            for (IoTDBRelationalUser.IoTDBDatabase db : getDatabaseObject().getDatabases()) {
                    try {
public class IoTDBUserEditorPrivileges extends IoTDBUserEditorAbstract {
                item.setFont(null);
                    super.completeLoading(privileges);
                        selectedTable = null;
                    if (tablesTable.isDisposed()) {
                public void completeLoading(List<IoTDBPrivilege> privileges) {
import java.util.List;
                        }
    private void highlightDatabases() {
import org.jkiss.dbeaver.ext.iotdb.ui.config.IoTDBCommandGrantPrivilege;
            }
        if (grants == null) {
            });
                            item.setFont(boldFont);
import java.util.ArrayList;

                final IoTDBPrivilege privilege = (IoTDBPrivilege) event.data;
 */
        // table privileges
                        }
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
        }
import org.eclipse.swt.events.DisposeListener;
import org.jkiss.dbeaver.ui.UIUtils;
        showGrants();
                        if (grant.canHighlightDatabase(db)) {
            tb = selectedTable.equals("(ALL)") ? "*" : selectedTable;
                    if (selIndex < 0) {
        if (force ||
        }
package org.jkiss.dbeaver.ext.iotdb.ui.editors;
                }
            },
import org.jkiss.dbeaver.ext.iotdb.ui.controls.PrivilegeTableControl;
                            // no-op
    }
    private void showGrants() {

        }
            }

            for (TableItem item : tablesTable.getItems()) {
            };
    }
        isLoaded = true;
