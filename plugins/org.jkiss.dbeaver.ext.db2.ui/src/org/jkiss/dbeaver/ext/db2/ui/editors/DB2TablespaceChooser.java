
        return true;
    public DB2TablespaceChooser(Shell parentShell, List<String> listTablespaceNames)
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    protected Control createDialogArea(Composite parent)

        );
        }

 * See the License for the specific language governing permissions and
}
        });

import org.eclipse.swt.layout.GridData;
            @Override

            }
            tsCombo.add(tablespaceName);
 * Dialog with the list of tablespaces usable for the user to create theExplain tables
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.Shell;
 * DBeaver - Universal Database Manager
        tsCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            public void widgetSelected(SelectionEvent e)
        getShell().setText(DB2Messages.dialog_explain_choose_tablespace);
        this.listTablespaceNames = listTablespaceNames;
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
            selectedTablespace = listTablespaceNames.getFirst();
 */
 * @author Denis Forveille
import org.eclipse.jface.dialogs.Dialog;
    private final List<String> listTablespaceNames;
    {
import org.eclipse.swt.events.SelectionAdapter;
        tsCombo.addSelectionListener(new SelectionAdapter() {
 * You may obtain a copy of the License at
    }
import org.eclipse.swt.events.SelectionEvent;
            GridData.FILL_BOTH
                selectedTablespace = listTablespaceNames.get(tsCombo.getSelectionIndex());
 */
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
/*
        // Add combo box with the tablespaces
        Composite infoGroup = UIUtils.createTitledComposite(
        Composite composite = (Composite) super.createDialogArea(parent);
    @Override
        final Combo tsCombo = new Combo(infoGroup, SWT.DROP_DOWN | SWT.READ_ONLY);
    // Standard Getters
    // ----------------

    // ----------------
    @Override
    protected boolean isResizable()
        super(parentShell);
    {
    {
 *
 * 
public class DB2TablespaceChooser extends Dialog {
import org.eclipse.swt.widgets.Composite;
package org.jkiss.dbeaver.ext.db2.ui.editors;
    }
            1,

        }
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
            {
        return parent;
/**
        tsCombo.setEnabled(true);
 * 
import org.eclipse.swt.widgets.Combo;
 *
    public String getSelectedTablespace()
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.UIUtils;
        return selectedTablespace;
import java.util.List;
    private String selectedTablespace;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
    }
import org.eclipse.swt.SWT;
        for (String tablespaceName : listTablespaceNames) {
import org.jkiss.utils.CommonUtils;
        tsCombo.select(0);
            composite,
            DB2Messages.dialog_explain_choose_tablespace_tablespace,

import org.eclipse.swt.widgets.Control;

 * limitations under the License.

        if(!CommonUtils.isEmpty(listTablespaceNames)){
