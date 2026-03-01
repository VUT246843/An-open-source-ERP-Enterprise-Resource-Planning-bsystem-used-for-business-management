    }
            @Override
            }
 *
 * See the License for the specific language governing permissions and
        tabs[1] = new TabbedFolderInfo("tab2", "Tab with long-long name", DBIcon.TREE_COLUMNS, "Tooltip 2", false, new TabbedFolderPage() {
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderPage;
 * You may obtain a copy of the License at
        return true;
                new Text(parent, SWT.NONE);
import org.eclipse.swt.layout.GridData;
            @Override
        super(shell);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public TestDialog(Shell shell)

    protected Control createDialogArea(Composite parent)
        tabs[2] = new TabbedFolderInfo("tab3", "Example", DBIcon.PROJECT, "123123", false, new TabbedFolderPage() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            }
        group.setLayoutData(gd);
import org.eclipse.swt.widgets.*;
 *
        Composite group = (Composite) super.createDialogArea(parent);
import org.jkiss.dbeaver.model.DBIcon;
        folderComposite = new TabbedFolderComposite(group, SWT.LEFT | SWT.MULTI);
 * you may not use this file except in compliance with the License.
            public void createControl(Composite parent) {
        tabs[0] = new TabbedFolderInfo("tab1", "Tab 1", DBIcon.TREE_TABLE, "Tooltip 1", false, new TabbedFolderPage() {
        return group;
import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderInfo;

            public void createControl(Composite parent) {
        });
        folderComposite.setLayoutData(gd);

        gd.heightHint = 300;
                new Text(parent, SWT.V_SCROLL | SWT.H_SCROLL);

 * distributed under the License is distributed on an "AS IS" BASIS,
    {

        gd = new GridData(GridData.FILL_BOTH);
import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderComposite;
import org.eclipse.jface.dialogs.TrayDialog;
package org.jkiss.dbeaver.ui.app.devtools.ui;
 */


 *
 * DBeaver - Universal Database Manager
    private TabbedFolderComposite folderComposite;
 * limitations under the License.
/*
    protected boolean isResizable() {
        });
import org.eclipse.swt.SWT;
        tabs = new TabbedFolderInfo[3];
}

            }
        folderComposite.setFolders("TestDialog", tabs);
    }


    }
        GridData gd = new GridData(GridData.FILL_BOTH);
        });
        getShell().setText("Test");
                new Label(parent, SWT.NONE);
        gd.widthHint = 300;
    {
            @Override
    @Override
    @Override
public class TestDialog extends TrayDialog {
    private final TabbedFolderInfo[] tabs;
            public void createControl(Composite parent) {
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
