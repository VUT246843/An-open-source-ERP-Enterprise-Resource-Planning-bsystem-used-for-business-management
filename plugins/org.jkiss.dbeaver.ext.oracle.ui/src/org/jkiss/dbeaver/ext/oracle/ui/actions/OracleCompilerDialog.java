            compileLog.info(""); //$NON-NLS-1$
            unitTable = new TableViewer(unitsGroup, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);
            try {
            gd.verticalIndent = 0;
    {
            } catch (InterruptedException e) {
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
                getButton(COMPILE_ID).setEnabled(!selection.isEmpty());
                @Override
    {
import org.eclipse.swt.widgets.Table;



                    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
            unitTable.setInput(compileUnits);
            });
    }
 *
        return composite;
            IDialogConstants.CLOSE_LABEL, false);
                    if (node != null) {


            toCompile = ((IStructuredSelection) unitTable.getSelection()).toList();
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
            gd.horizontalIndent = 0;
            gd.widthHint = 250;
                {
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        } else {
import org.jkiss.dbeaver.ext.oracle.model.source.OracleSourceObject;
import org.eclipse.jface.viewers.ViewerCell;
        }
            gd.widthHint = 400;
import org.jkiss.dbeaver.ui.controls.ObjectCompilerLogViewer;
            columnController.addColumn(OracleUIMessages.views_oracle_compiler_dialog_column_type, null, SWT.NONE, true, true, new CellLabelProvider() {
            Composite infoGroup = new Composite(composite, SWT.NONE);
            columnController.addColumn(OracleUIMessages.views_oracle_compiler_dialog_column_name, null, SWT.NONE, true, true, new CellLabelProvider() {
 * limitations under the License.
                public void update(ViewerCell cell)
                }
import java.util.List;
    @Override

 *
            gd.heightHint = 200;
    }
            try {
        final List<OracleSourceObject> toCompile;
import org.jkiss.dbeaver.DBException;
    private void performCompilation(DBRProgressMonitor monitor, List<OracleSourceObject> units)
 * DBeaver - Universal Database Manager

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    DBSObject unit = (DBSObject) cell.getElement();
                }
    private static final int COMPILE_ALL_ID = 1001;
 * you may not use this file except in compliance with the License.
    }
            }
            unitTable.addDoubleClickListener(event -> {
                    NavigatorHandlerObjectOpen.openEntityEditor(unit);
    private java.util.List<OracleSourceObject> compileUnits;
                IStructuredSelection selection = (IStructuredSelection) event.getSelection();

        }

            compileLog.info(message);
                public void update(ViewerCell cell)
        composite.setLayout(new GridLayout(2, false));
                    if (node != null) {
            ViewerColumnController columnController = new ViewerColumnController("OracleCompilerDialog", unitTable);
            infoGroup.setLayoutData(gd);
                    final DBNDatabaseNode node = DBNUtils.getNodeByObject(unit);
            unitTable.setContentProvider(new ListContentProvider());
    {
package org.jkiss.dbeaver.ext.oracle.ui.actions;
    @Override
            unitsGroup.setLayoutData(gd);
                        cell.setImage(DBeaverIcons.getImage(node.getNodeIconDefault()));
            gd = new GridData(GridData.FILL_BOTH);
import org.eclipse.swt.layout.GridData;
import java.lang.reflect.InvocationTargetException;
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));

            unitsGroup.setLayout(new GridLayout(1, false));
 * Unless required by applicable law or agreed to in writing, software

        for (OracleSourceObject unit : units) {
}
            });

        Composite composite = new Composite(parent, SWT.NONE);
import org.jkiss.dbeaver.ui.UIUtils;
            toCompile = compileUnits;
    {
import org.eclipse.swt.widgets.Composite;

import org.eclipse.swt.layout.GridLayout;
        createButton(parent, COMPILE_ID, OracleUIMessages.views_oracle_compiler_dialog_button_compile, false).setEnabled(false);
                table.setHeaderVisible(true);
import org.jkiss.dbeaver.ui.controls.ViewerColumnController;
		// create OK and Cancel buttons by default
        if (!CommonUtils.isEmpty(toCompile)) {
            });
                    }
    }
    @Override
            {
        compileLog.layoutLog();
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
            } catch (InvocationTargetException e) {
            unitTable.addSelectionChangedListener(event -> {
    {
                // do nothing
            super.buttonPressed(buttonId);

import org.jkiss.dbeaver.model.navigator.DBNUtils;
                break;

                IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                    DBSObject unit = (DBSObject) cell.getElement();
                UIUtils.runInProgressService(monitor -> performCompilation(monitor, toCompile));
        } else if (buttonId == COMPILE_ALL_ID) {
                DBWorkbench.getPlatformUI().showError("Compile error", null, e.getTargetException());
                if (!selection.isEmpty()) {
		createButton(parent, IDialogConstants.CANCEL_ID,
                table.setLinesVisible(true);
        super.okPressed();
            compileLog.info(!success ? OracleUIMessages.views_oracle_compiler_dialog_message_compilation_error : OracleUIMessages.views_oracle_compiler_dialog_message_compilation_success);
 * You may obtain a copy of the License at

        return true;

                success = CompileHandler.compileUnit(monitor, compileLog, unit);
            boolean success = false;
/**
            columnController.createColumns();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
            } catch (DBException e) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        if (buttonId == COMPILE_ID) {
        } else {
            gd.heightHint = 200;
        }
        {
            Composite unitsGroup = new Composite(composite, SWT.NONE);
        super(shell, OracleUIMessages.views_oracle_compiler_dialog_title, null);
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.model.struct.DBSObject;
        GridData gd;
                    final DBNDatabaseNode node = DBNUtils.getNodeByObject(unit);
            final String message = NLS.bind(OracleUIMessages.views_oracle_compiler_dialog_message_compile_unit, unit.getSourceType().name(), unit.getName());
/*
                        cell.setText(unit.toString());
            gd.verticalIndent = 0;
    {
            if (monitor.isCanceled()) {
public class OracleCompilerDialog extends BaseDialog
            }

                }
import org.eclipse.jface.viewers.TableViewer;
import org.jkiss.dbeaver.Log;
 */
            }
import org.eclipse.swt.widgets.Shell;
    private TableViewer unitTable;
import org.eclipse.jface.viewers.CellLabelProvider;
            toCompile = null;
            infoGroup.setLayout(new GridLayout(1, false));
 * See the License for the specific language governing permissions and
            });
    protected Composite createDialogArea(Composite parent)

            gd = new GridData(GridData.FILL_BOTH);
 * OracleCompilerDialog
    public OracleCompilerDialog(Shell shell, java.util.List<OracleSourceObject> compileUnits)
    {
                        cell.setText(node.getNodeTypeLabel());
                final Table table = unitTable.getTable();
            gd.horizontalIndent = 0;
import org.eclipse.jface.viewers.IStructuredSelection;

                @Override
        this.compileUnits = compileUnits;
 */
                    } else {
            }
                log.error("Compile error", e);
            compileLog = new ObjectCompilerLogViewer(infoGroup, null, true);
    private ObjectCompilerLogViewer compileLog;
                        cell.setText(node.getNodeDisplayName());
import org.jkiss.utils.CommonUtils;
        {
                table.setLayoutData(new GridData(GridData.FILL_BOTH));
    protected void createButtonsForButtonBar(Composite parent)
                        cell.setText("???"); //$NON-NLS-1$
{
 *
    private static final int COMPILE_ID = 1000;
                    } else {
    protected void okPressed()
    @Override
import org.eclipse.osgi.util.NLS;
        }
    private static final Log log = Log.getLog(OracleCompilerDialog.class);
    }
                {



 * Copyright (C) 2010-2025 DBeaver Corp and others
		createButton(parent, COMPILE_ALL_ID, OracleUIMessages.views_oracle_compiler_dialog_button_compile_all, true);
import org.eclipse.swt.SWT;
                    OracleSourceObject unit = (OracleSourceObject) selection.getFirstElement();
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected void buttonPressed(int buttonId)
    protected boolean isResizable()
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    }

