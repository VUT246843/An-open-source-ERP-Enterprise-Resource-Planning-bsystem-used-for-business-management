import org.eclipse.swt.layout.GridData;

import java.io.File;
 * DBeaver - Universal Database Manager
 *
        super("Script");
            Composite buttonsPanel = UIUtils.createComposite(settingsGroup, 2);
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            UIServiceSQL service = DBWorkbench.getService(UIServiceSQL.class);
    private String scriptText;
        if (service != null) {
                            SQLUtils.generateScript(

            }
import org.jkiss.dbeaver.model.sql.SQLUtils;
        generateScript();
        } catch (InterruptedException e) {
 *
                                dataSource,

        setDescription("Preview script and perform install");
                        monitor.subTask("Generate script");

                    sqlPanel = service.createSQLPanel(
            return;
                    throw new InvocationTargetException(e);
            return;
        return activated && getErrorMessage() == null;
            buttonsPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.eclipse.swt.events.SelectionEvent;
                        monitor.done();
        }

                        getWizard(),
    }

import org.jkiss.dbeaver.runtime.ui.UIServiceSQL;
        super.activatePage();
    @Override

    public boolean isPageComplete()
        }

 * You may obtain a copy of the License at
                } catch (DBException e) {
    {
}
        try {
import org.jkiss.dbeaver.runtime.DBWorkbench;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
    private Object sqlPanel;
    @Override
 * you may not use this file except in compliance with the License.
                }
class PostgreFDWConfigWizardPageFinal extends ActiveWizardPage<PostgreFDWConfigWizard> {
        Composite composite = UIUtils.createComposite(parent, 1);
                    DBExecUtils.tryExecuteRecover(monitor, dataSource, param -> {
 *
            sqlPanelPH.setLayout(new FillLayout());
import org.jkiss.dbeaver.ui.UIUtils;
    }
    }
import org.eclipse.swt.dnd.TextTransfer;
                try {
                        sqlPanelPH,
    @Override
                }


            getWizard().getRunnableContext().run(true, true, monitor -> {
                            DBWorkbench.getPlatformUI().showError("Save scritp to file", "Error saving script to file " + saveFile.getAbsolutePath(), e1);
import org.eclipse.swt.SWT;
            activated = true;

    private void generateScript() {
    private static final Log log = Log.getLog(PostgreFDWConfigWizardPageFinal.class);
 * See the License for the specific language governing permissions and
import org.eclipse.swt.events.SelectionAdapter;
/*
                    final File saveFile = DialogUtils.selectFileForSave(
                        } catch (IOException e1) {
 * limitations under the License.
    }

import org.jkiss.utils.IOUtils;
                        "FDW Script",
            Composite sqlPanelPH = new Composite(settingsGroup, SWT.NONE);
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardPage;
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.io.IOException;

                        monitor.subTask("Read actions");
            UIUtils.createDialogButton(buttonsPanel, "Save ...", new SelectionAdapter() {
                        try {
        scriptText = script.toString();
 *     http://www.apache.org/licenses/LICENSE-2.0

                        UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite(),
            });
import org.eclipse.swt.widgets.Composite;
            log.debug(e.getTargetException());
        }
                }
                    log.debug(e);
        setErrorMessage(null);
    {
        }
                public void widgetSelected(SelectionEvent e) {
            setErrorMessage(e.getTargetException().getMessage());
            Composite settingsGroup = UIUtils.createTitledComposite(composite, "Script", 1, GridData.FILL_BOTH);
    private boolean activated;
            PostgreDataSource dataSource = getWizard().getDatabase().getDataSource();
        setTitle("Foreign wrappers mapping SQL script");
        setWizard(wizard);
    public void createControl(Composite parent)
                } catch (DBException e) {
                }
import org.jkiss.dbeaver.DBException;

            UIUtils.createDialogButton(buttonsPanel, "Copy", new SelectionAdapter() {
import java.lang.reflect.InvocationTargetException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            });
        StringBuilder script = new StringBuilder();
                    });
            sqlPanelPH.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.eclipse.swt.layout.FillLayout;
 */
 * Unless required by applicable law or agreed to in writing, software
                public void widgetSelected(SelectionEvent e) {
                        true,
    }
                                false));
import java.util.List;
            });
        setControl(composite);
                        List<DBEPersistAction> actions = getWizard().generateScript(monitor);
    public void activatePage() {
                        script.append(
                    UIUtils.setClipboardContents(buttonsPanel.getDisplay(), TextTransfer.getInstance(), scriptText);
                    }
        {
package org.jkiss.dbeaver.ext.postgresql.tools.fdw;
                    setErrorMessage(e.getMessage());
    {

                @Override
        if (!activated) {
            if (service != null) {
                        "");
                @Override
        UIServiceSQL service = DBWorkbench.getService(UIServiceSQL.class);
                                actions.toArray(new DBEPersistAction[0]),
import org.jkiss.dbeaver.model.exec.DBExecUtils;
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
import org.jkiss.dbeaver.Log;
 * distributed under the License is distributed on an "AS IS" BASIS,
            service.setSQLPanelText(sqlPanel, scriptText);
                        buttonsPanel.getShell(), "Save SQL script", new String[]{"*.sql", "*.txt", "*", "*.*"}, null);
                        }
                            IOUtils.writeFileFromString(saveFile, scriptText);
                        monitor.beginTask("Generate FDW script", 2);
                    if (saveFile != null) {
        } catch (InvocationTargetException e) {
                try {
 * Copyright (C) 2010-2026 DBeaver Corp and others
    protected PostgreFDWConfigWizardPageFinal(PostgreFDWConfigWizard wizard)
