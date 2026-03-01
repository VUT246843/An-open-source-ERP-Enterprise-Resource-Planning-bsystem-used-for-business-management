 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        connectionFolders.add(null);

 * You may obtain a copy of the License at
 *
import org.jkiss.dbeaver.model.DBUtils;
        for (int i = 0; i < level; i++) {
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
        if (registry != null) {
import org.jkiss.dbeaver.ui.internal.UIMessages;
            }
            for (DBPDataSourceFolder folder : DBUtils.makeOrderedObjectList(registry.getRootFolders())) {
 *
    public void setFolder(DBPDataSourceFolder folder) {
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
        } else {
package org.jkiss.dbeaver.ui.controls;
    public ConnectionFolderSelector(Composite parent) {
import org.jkiss.dbeaver.model.app.DBPProject;
import org.eclipse.swt.events.SelectionAdapter;


        connectionFolderCombo.add("");
public class ConnectionFolderSelector {
import org.eclipse.swt.widgets.Combo;
        }
        connectionFolderCombo.removeAll();
import org.eclipse.swt.layout.GridData;
/**
        if (dataSourceFolder != null) {
            prefix.append("   ");
    public boolean isEmpty() {
 * General connection page (common for all connection types)
        connectionFolders.add(folder);
 * limitations under the License.
            connectionFolderCombo.select(connectionFolders.indexOf(dataSourceFolder));
                loadConnectionFolder(0, folder);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
            connectionFolderCombo.select(0);
 */
        return connectionFolders.isEmpty();
        return dataSourceFolder;
        connectionFolderCombo.addSelectionListener(new SelectionAdapter() {
import java.util.List;
import org.eclipse.swt.SWT;

            public void widgetSelected(SelectionEvent e) {
    }
    private final Combo connectionFolderCombo;
        for (DBPDataSourceFolder child : DBUtils.makeOrderedObjectList(folder.getChildren())) {

        DBPDataSourceRegistry registry = project == null ? null : project.getDataSourceRegistry();
        StringBuilder prefix = new StringBuilder();
            loadConnectionFolder(level + 1, child);
    public void loadConnectionFolders(DBPProject project)
    private DBPDataSourceFolder dataSourceFolder;
    }
        }
        connectionFolderCombo.add(prefix + folder.getName());
    {
        UIUtils.createControlLabel(parent, UIMessages.control_label_connection_folder);

import org.jkiss.dbeaver.ui.UIUtils;
        connectionFolderCombo = new Combo(parent, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
        }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
        gd.widthHint = UIUtils.getFontHeight(connectionFolderCombo) * 20;
import java.util.ArrayList;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSourceFolder;
            }

        connectionFolders.clear();
        }
}
    public DBPDataSourceFolder getFolder() {


 */

        connectionFolderCombo.setLayoutData(gd);
            @Override
        dataSourceFolder = folder;
    }
/*
    private final List<DBPDataSourceFolder> connectionFolders = new ArrayList<>();
    private void loadConnectionFolder(int level, DBPDataSourceFolder folder) {
 * DBeaver - Universal Database Manager
    }
        });
import org.jkiss.dbeaver.model.app.DBPDataSourceRegistry;
    }
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
                dataSourceFolder = connectionFolders.get(connectionFolderCombo.getSelectionIndex());

