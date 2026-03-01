

            GridData.FILL_HORIZONTAL
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    tempTSCombo.setEnabled(true);
import org.jkiss.dbeaver.ext.db2.model.DB2Index;
    {
    {
    }
                    dlgUseTempTS.setEnabled(true);
                    dlgUseTempTS.setEnabled(false);
                    dlgAccesReadWrite.setSelection(false);
import org.eclipse.swt.widgets.Composite;
        dlgAccesReadOnly = new Button(groupRB, SWT.RADIO);
                    dlgAccesNo.setSelection(true);
                    dlgUseLobsTemp.setEnabled(false);
        sb.append("CALL SYSPROC.ADMIN_CMD('");
                    dlgReorgLobsTS.setEnabled(false);
                } else {
        }
        dlgTruncate.setEnabled(false);
        combo.addSelectionListener(new SelectionAdapter() {
                if (dlgUseLobsTemp.getSelection()) {
                    }
        dlgUseLobsTemp.addSelectionListener(new SelectionAdapter() {
            }
            @Override
            }
            }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            if (dlgUseLobsTemp.getSelection() && lobsTablespace != null) {
                if (dlgUseIndex.getSelection()) {
        });
            }
    private Button dlgResetDictionary;
        } catch (InvocationTargetException e) {
        indexName = listIndexNames.isEmpty() ? null : listIndexNames.get(0);
import java.util.ArrayList;
        dlgInplace.addSelectionListener(new SelectionAdapter() {
                @Override

        combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.dbeaver.ext.db2.model.dict.DB2TablespaceDataType;

            });
                    dlgIndexScan.setEnabled(false);
        // INDEXSCAN
            {
            {

            {
                sb.append(" ALLOW READ ACCESS");
                    dlgTruncate.setSelection(true);
            public void widgetSelected(SelectionEvent e)
    }


            if (dlgIndexScan.getSelection()) {
            }
import org.jkiss.dbeaver.ext.db2.model.DB2Table;
        } else {
                if (dlgReorgLobsTS.getSelection()) {

    protected void createControls(Composite parent)

        combo.addSelectionListener(new SelectionAdapter() {
        dlgAccesReadWrite = new Button(groupRB, SWT.RADIO);
        dlgIndexScan.setEnabled(false);
            @Override
                lobsTablespace = listTempTsNames.get(combo.getSelectionIndex());
        dlgAccesReadWrite.setEnabled(false);

                    DB2Table db2Table = selectedTables.iterator().next();

 * DBeaver - Universal Database Manager
        dlgUseIndex = UIUtils.createCheckbox(composite, DB2Messages.dialog_table_tools_reorg_useindex, false);

        dlgUseLobsTemp = UIUtils.createCheckbox(composite, DB2Messages.dialog_table_tools_reorg_reorglobsts, false);
                    dlgTruncate.setSelection(false);
            public void widgetSelected(SelectionEvent e)
                sb.append(" LONGLOBDATA");
import org.eclipse.swt.events.SelectionEvent;
                    } catch (Exception e) {

        tempLobsTSCombo = createLobsTempTablespaceCombo(composite);
        return combo;
    private final List<String> listTempTsNames = new ArrayList<>();

            {
        dlgReorgLobsTS.addSelectionListener(new SelectionAdapter() {
        dlgUseTempTS.addSelectionListener(new SelectionAdapter() {
                updateSQL();
    private Combo tempLobsTSCombo;
package org.jkiss.dbeaver.ext.db2.ui.tools.maintenance;
        // USE INDEX
                updateSQL();
                sb.append(" RESETDICTIONARY");
            combo.add(indexName);
        dlgAccesReadWrite.setText(DB2Messages.dialog_table_tools_reorg_access_readwrite);

            public void widgetSelected(SelectionEvent e)
        createObjectsSelector(parent);
import org.eclipse.swt.SWT;
    private Button dlgAccesReadOnly;
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
        dlgIndexScan = UIUtils.createCheckbox(composite, DB2Messages.dialog_table_tools_reorg_useindexscan, false);

            if (dlgAccesNo.getSelection()) {
    private Combo createLobsTempTablespaceCombo(Composite parent)
                        for (DB2Index db2Index : db2Table.getIndexes(monitor)) {
        dlgReorgLobsTS = UIUtils.createCheckbox(composite, DB2Messages.dialog_table_tools_reorg_reorglobs, false);
                sb.append(" NO TRUNCATE TABLE");
    private String lobsTablespace; // From a list of temp tablespaces
        });
                sb.append(" INDEXSCAN");
            public void widgetSelected(SelectionEvent e)
                } else {
                updateSQL();

        combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

import org.eclipse.swt.widgets.Combo;

                    dlgAccesNo.setEnabled(false);
    private Button dlgInplace;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    dlgIndexScan.setEnabled(true);
import org.jkiss.dbeaver.model.DBPEvaluationContext;
                } else {
        UIUtils.createPlaceholder(composite, 1);

import org.jkiss.dbeaver.runtime.DBWorkbench;
        combo.select(0);
        // Initial setup
        tempLobsTSCombo.setEnabled(false);

            combo.select(0);
    }
    }
 */
}
            @Override
                    dlgAccesReadWrite.setSelection(false);
import org.eclipse.swt.layout.GridLayout;
            sb.append(" INDEX ").append(indexName);
        super(partSite, DB2Messages.dialog_table_tools_reorg_title, selectedTables);
import org.eclipse.swt.layout.GridData;
            }
            }
        });


                    dlgAccesNo.setSelection(false);
                    dlgTruncate.setEnabled(true);
                }
 * You may obtain a copy of the License at
    private String tempTablespace; // From a list of temp tablespaces
        UIUtils.createPlaceholder(composite, 1);
            if (dlgUseTempTS.getSelection() && tempTablespace != null) {
                    dlgUseLobsTemp.setEnabled(true);
                sb.append(" ALLOW NO ACCESS");
            if (dlgResetDictionary.getSelection()) {
    {
        Composite groupRB = new Composite(composite, SWT.NULL);
            public void widgetSelected(SelectionEvent e)
    private Button dlgUseIndex;

                updateSQL();
 * distributed under the License is distributed on an "AS IS" BASIS,
        // REORG LONG AND LOBS
import org.jkiss.dbeaver.ui.UIUtils;
    // Dialog artefacts
                updateSQL();
        dlgUseIndex.addSelectionListener(new SelectionAdapter() {
 *
        for (String indexName : listIndexNames) {
                    dlgAccesReadOnly.setSelection(false);
                indexName = listIndexNames.get(combo.getSelectionIndex());
                        monitor.worked(1);
    private Button dlgUseTempTS;

    private Button dlgUseLobsTemp;
    }
        indexesCombo = createIndexesCombo(composite);
        StringBuilder sb = new StringBuilder(256);
                    dlgAccesReadOnly.setSelection(true);
        }
                    dlgUseLobsTemp.setEnabled(true);
                }
    private Button dlgAccesReadWrite;
    private Combo createIndexesCombo(Composite parent)
        }
 */
                    tempLobsTSCombo.setEnabled(false);
        dlgAccesNo.addSelectionListener(SQL_CHANGE_LISTENER);
        dlgAccesReadOnly.addSelectionListener(SQL_CHANGE_LISTENER);
        );
                    tempLobsTSCombo.setEnabled(true);
        combo.setEnabled(false);
            1,
        tempTablespace = listTempTsNames.isEmpty() ? null : listTempTsNames.get(0);
            public void widgetSelected(SelectionEvent e)
        optionsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        // REORG LONG AND LOBS TEMP TS
            parent,
        }
                        }
        dlgUseTempTS = UIUtils.createCheckbox(composite, DB2Messages.dialog_table_tools_reorg_usetempts, false);
            DBWorkbench.getPlatformUI().showError("Error", "Can't read system info", e.getTargetException());
        final Combo combo = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
    private Combo tempTSCombo;
        dlgAccesReadOnly.setText(DB2Messages.dialog_table_tools_reorg_access_read);
            @Override
                    dlgReorgLobsTS.setEnabled(true);
            if (!(dlgTruncate.getSelection())) {
                            }
        composite.setLayout(new GridLayout(2, false));
import org.eclipse.ui.IWorkbenchPartSite;
    @Override
                    tempLobsTSCombo.setEnabled(false);
    public DB2ReorgTableDialog(IWorkbenchPartSite partSite, final Collection<DB2Table> selectedTables)
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
 * Unless required by applicable law or agreed to in writing, software
                tempTablespace = listTempTsNames.get(combo.getSelectionIndex());
    private String indexName; // From a list of table indexes
        // USE TEMP TS

                        throw new InvocationTargetException(e);
        }
            sb.append(" START");
                updateSQL();
                }
    {
    private Combo indexesCombo;
            }
                        for (DB2Tablespace db2Tablespace : db2DataSource.getTablespaces(monitor)) {
            }
        UIUtils.createPlaceholder(composite, 1);
                }
                    dlgResetDictionary.setEnabled(true);
 *
        });

            @Override
import org.jkiss.dbeaver.ext.db2.model.DB2Tablespace;
            {
        dlgIndexScan.addSelectionListener(SQL_CHANGE_LISTENER);
        dlgAccesNo.setText(DB2Messages.dialog_table_tools_reorg_access_no);
import java.util.List;
                sb.append(" USE ").append(lobsTablespace);
        sb.append("')");
        combo.select(0);
        combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                            listIndexNames.add(db2Index.getFullyQualifiedName(DBPEvaluationContext.DDL));
        dlgTruncate = UIUtils.createCheckbox(composite, DB2Messages.dialog_table_tools_reorg_truncate, false);
public class DB2ReorgTableDialog extends DB2BaseTableToolDialog {
        lobsTablespace = listTempTsNames.isEmpty() ? null : listTempTsNames.get(0);
 * limitations under the License.
            {
import org.eclipse.swt.widgets.Button;
                } else {
                            if (db2Tablespace.getDataType().equals(DB2TablespaceDataType.T)) {
                    dlgUseLobsTemp.setEnabled(false);

        UIUtils.createPlaceholder(composite, 1);
            @Override
            }
        // RESET DICTIONARY
    private Button dlgTruncate;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    dlgAccesReadWrite.setEnabled(false);
                sb.append(" USE ").append(tempTablespace);
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
    {
 * you may not use this file except in compliance with the License.
import java.util.Collection;
        if (dlgInplace.getSelection()) {
    {
        Composite optionsGroup = UIUtils.createTitledComposite(
        dlgResetDictionary.addSelectionListener(SQL_CHANGE_LISTENER);
                    indexesCombo.setEnabled(false);
        final Combo combo = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
    private Button dlgAccesNo;
            // ignore
                        monitor.worked(1);


                    try {
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
            public void widgetSelected(SelectionEvent e)
                if (dlgInplace.getSelection()) {
                    dlgResetDictionary.setEnabled(false);
                    dlgAccesNo.setEnabled(true);

        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
                        }
            @Override
 * See the License for the specific language governing permissions and
            }
        dlgAccesNo = new Button(groupRB, SWT.RADIO);
        });
            }
        // INPLACE
        dlgAccesReadWrite.addSelectionListener(SQL_CHANGE_LISTENER);
        });
            UIUtils.runInProgressService(new DBRRunnableWithProgress() {
            if (dlgAccesReadOnly.getSelection()) {

    }
        lines.add(sb.toString());
    protected void generateObjectCommand(List<String> lines, DB2Table db2Table)
        for (String tablespaceName : listTempTsNames) {
        sb.append("REORG TABLE ").append(db2Table.getFullyQualifiedName(DBPEvaluationContext.DDL));
import org.eclipse.swt.events.SelectionAdapter;

                    dlgTruncate.setEnabled(false);
        dlgInplace = UIUtils.createCheckbox(composite, DB2Messages.dialog_table_tools_reorg_inplace, false);
            if (dlgReorgLobsTS.getSelection()) {

        // TABLE ACCESS
            {
                    dlgAccesReadWrite.setEnabled(true);
                    dlgIndexScan.setEnabled(true);
                    DB2DataSource db2DataSource = db2Table.getDataSource();
                        monitor.beginTask("Read system info", 2);
import java.lang.reflect.InvocationTargetException;
                    dlgIndexScan.setEnabled(false);
        dlgTruncate.addSelectionListener(SQL_CHANGE_LISTENER);

        // Object Selector
            DB2Messages.dialog_table_tools_options,
            combo.add(tablespaceName);
        tempTSCombo = createTempTablespaceCombo(composite);
    private Button dlgIndexScan;
        dlgAccesReadOnly.setSelection(true);
        });
                    indexesCombo.setEnabled(true);
        UIUtils.createPlaceholder(composite, 1);
 *
        return combo;
            @Override

            {
    private Combo createTempTablespaceCombo(Composite parent)
    private final List<String> listIndexNames = new ArrayList<>();
            sb.append(" INPLACE");
                } else {
import org.eclipse.swt.layout.RowLayout;
        dlgResetDictionary = UIUtils.createCheckbox(composite, DB2Messages.dialog_table_tools_reorg_resetdict, false);
        try {
        dlgUseLobsTemp.setEnabled(false);
 * DB2 Table reorg dialog
            public void widgetSelected(SelectionEvent e)

        final Combo combo = new Combo(parent, SWT.DROP_DOWN | SWT.READ_ONLY);
                updateSQL();
    private Button dlgReorgLobsTS;


                {

                if (dlgUseTempTS.getSelection()) {
/*
        if (dlgUseIndex.getSelection() && indexName != null) {
        combo.addSelectionListener(new SelectionAdapter() {
            }

        combo.setEnabled(false);
            }
            combo.add(tablespaceName);
                    tempLobsTSCombo.setEnabled(false);
        combo.setEnabled(false);
        if (!listTempTsNames.isEmpty()) {
        return combo;
        // TRUNCATE
        } catch (InterruptedException e) {
        Composite composite = new Composite(optionsGroup, 2);
        }
    @Override
        });
        // Read TS and indexes
                                listTempTsNames.add(db2Tablespace.getName());
            }
                    tempTSCombo.setEnabled(false);
                public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException

        groupRB.setLayout(new RowLayout());
        UIUtils.createLabel(composite, DB2Messages.dialog_table_tools_reorg_access_title);
                updateSQL();
                }
            }
/**
        }
        for (String tablespaceName : listTempTsNames) {
