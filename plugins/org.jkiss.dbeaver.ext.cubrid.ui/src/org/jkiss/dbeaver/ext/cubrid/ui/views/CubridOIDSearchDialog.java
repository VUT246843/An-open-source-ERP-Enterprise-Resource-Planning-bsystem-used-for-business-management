
    protected Composite createDialogArea(Composite parent) {
 *
    }
    @Override
    }
import org.jkiss.dbeaver.ext.cubrid.ui.internal.CubridMessages;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        Point calculatedSize = super.getInitialSize();
        title.setFont(boldFont);
        Label title = new Label(container, SWT.NONE);
        });
 *
    protected void createButtonsForButtonBar(Composite parent) {
        Label oidLabel = new Label(inputArea, SWT.NONE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Composite;
        Composite container = (Composite) super.createDialogArea(parent);
        Label desc = new Label(container, SWT.NONE);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Button;

        separator.setLayoutData(sepLayout);

        });
        GridData treeLayout = new GridData(GridData.FILL_BOTH);
            fd.setStyle(SWT.BOLD);
        title.setText(CubridMessages.cubrid_oid_search_navigator_title);


    @Override
        inputArea.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

            public void widgetSelected(SelectionEvent event) {
        resultTree.setLayoutData(treeLayout);
        super(parentShell, CubridMessages.cubrid_oid_search_navigator_title, cubridIcon);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
}
        findButton.setEnabled(false);
        for (FontData fd : fD) {
import org.eclipse.swt.widgets.Label;
        boldFont = new Font(container.getDisplay(), fD);
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
            }
    public boolean close() {
        }
        oidValueText = new Text(inputArea, SWT.LEFT | SWT.BORDER);
            findButton.setEnabled(!oidValueText.getText().trim().isEmpty());
                oidSearch.searchOID(oidValueText.getText(), resultTree);
    private Button findButton;
 * You may obtain a copy of the License at
        Label separator = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
public class CubridOIDSearchDialog extends BaseDialog {

        FontData[] fD = title.getFont().getFontData();
import org.eclipse.swt.layout.GridData;

    protected Point getInitialSize() {
        return container;
import org.eclipse.swt.graphics.Point;
        treeLayout.heightHint = 150;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        GridData buttonLayout = new GridData(SWT.FILL, SWT.CENTER, false, false);
    @Override
        return calculatedSize;
    private Font boldFont;
import org.jkiss.dbeaver.model.DBIcon;
        findButton.setText(CubridMessages.cubrid_oid_search_find);
package org.jkiss.dbeaver.ext.cubrid.ui.views;
        this.oidSearch = new CubridOIDSearch(session);
        findButton = new Button(inputArea, SWT.PUSH);
 * Unless required by applicable law or agreed to in writing, software
    @Override
        findButton.addSelectionListener(new SelectionAdapter() {
/*
        buttonLayout.widthHint = 80;
 * DBeaver - Universal Database Manager
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Text;
        calculatedSize.x = 500;
    private CubridOIDSearch oidSearch;
import org.eclipse.swt.events.SelectionEvent;
    private static DBIcon cubridIcon = new DBIcon("platform:/plugin/org.jkiss.dbeaver.ext.cubrid/icons/cubrid_icon.png");

                resultTree.removeAll();
    }
 * limitations under the License.
        return super.close();
    private Text oidValueText;
    }
 */
    public CubridOIDSearchDialog(Shell parentShell, JDBCSession session) {

 *


    private Tree resultTree;
        treeLayout.horizontalSpan = 2;
        oidValueText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        findButton.setLayoutData(buttonLayout);
    }
        oidValueText.addModifyListener(e -> {
        boldFont.dispose();
import org.eclipse.swt.graphics.FontData;




        inputArea.setLayout(new GridLayout(3, false));
import org.eclipse.jface.dialogs.IDialogConstants;
        oidLabel.setText(CubridMessages.cubrid_oid_search_value_label + ":");


        desc.setText(CubridMessages.cubrid_oid_search_navigator_desc);
            fd.setHeight(10);
        GridData sepLayout = new GridData(GridData.FILL_HORIZONTAL);
        resultTree = new Tree(container, SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL);
import org.eclipse.swt.events.SelectionAdapter;
        Composite inputArea = new Composite(container, SWT.NONE);
