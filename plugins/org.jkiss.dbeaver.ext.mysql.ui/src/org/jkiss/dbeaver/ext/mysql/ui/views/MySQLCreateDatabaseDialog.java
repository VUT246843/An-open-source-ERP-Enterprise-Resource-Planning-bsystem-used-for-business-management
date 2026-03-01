
 * MySQLCreateDatabaseDialog
        }
    @Override
        return collation;
        final Combo charsetCombo = UIUtils.createLabelCombo(group, MySQLUIMessages.dialog_create_database_charset, SWT.BORDER | SWT.DROP_DOWN);

    protected Composite createDialogArea(Composite parent) {

    @Override
import org.eclipse.swt.SWT;
/*
                collation = charset.getDefaultCollation();
    }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        nameText.addModifyListener(e -> {
        collation = database.getDataSource().getDefaultCollation();
        });
        }
        group.setLayoutData(gd);
        for (MySQLCollation col : charset.getCollations()) {
        }
        final Combo collationCombo = UIUtils.createLabelCombo(group, MySQLUIMessages.dialog_create_database_collation, SWT.BORDER | SWT.DROP_DOWN);
        final Composite composite = super.createDialogArea(parent);
 * DBeaver - Universal Database Manager
            name = nameText.getText().trim();
    protected void createButtonsForButtonBar(Composite parent)
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        charsetCombo.setText(charset.getName());
package org.jkiss.dbeaver.ext.mysql.ui.views;
    }
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    public MySQLCollation getCollation() {


}
            collationCombo.add(col.getName());
        final Text nameText = UIUtils.createLabelText(group, MySQLUIMessages.dialog_create_database_database_name, "");
    public static final String DEFAULT_CHARSET_NAME = "utf8";
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
        collationCombo.addModifyListener(e -> collation = charset == null ? null : charset.getCollation(collationCombo.getText()));
        for (MySQLCharset cs : database.getDataSource().getCharsets()) {
import org.eclipse.swt.layout.GridData;
 */
 * you may not use this file except in compliance with the License.
        return name;
 *
    private MySQLCollation collation;
import org.eclipse.swt.widgets.Combo;

            if (charset != null) {
    }
import org.jkiss.dbeaver.ext.mysql.model.MySQLCatalog;
 *
        this.database = database;
    private MySQLCharset charset;

        charsetCombo.addModifyListener(e -> {
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
import org.eclipse.swt.widgets.Composite;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.mysql.model.MySQLCollation;
                UIUtils.setComboSelection(collationCombo, collation.getName());
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
                }
        if (collation != null) {
        });
/**
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.dbeaver.ext.mysql.model.MySQLCharset;
        return composite;
                for (MySQLCollation col : charset.getCollations()) {
            charset = database.getDataSource().getCharset(DEFAULT_CHARSET_NAME);
    }
        charset = database.getDataSource().getDefaultCharset();
public class MySQLCreateDatabaseDialog extends BaseDialog

 *     http://www.apache.org/licenses/LICENSE-2.0
            UIUtils.setComboSelection(collationCombo, collation.getName());
        getButton(IDialogConstants.OK_ID).setEnabled(false);
        super(parentShell, MySQLUIMessages.dialog_create_database_title, null);
        if (charset == null) {
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public MySQLCharset getCharset() {
import org.eclipse.swt.widgets.Text;

    {
    public String getName() {
                    collationCombo.add(col.getName());
            }
        if (collation == null) {
{
            getButton(IDialogConstants.OK_ID).setEnabled(!name.isEmpty());
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);

        return charset;
        super.createButtonsForButtonBar(parent);
            }
            if (collation != null) {
            assert charset != null;
        }
            charsetCombo.add(cs.getName());

            collation = charset.getDefaultCollation();

        final Composite group = UIUtils.createComposite(composite, 2);
    public MySQLCreateDatabaseDialog(Shell parentShell, MySQLCatalog database) {

import org.jkiss.dbeaver.ui.UIUtils;
    private final MySQLCatalog database;
            charset = database.getDataSource().getCharset(charsetCombo.getText());
            collationCombo.removeAll();
    private String name;
 *
    }
import org.eclipse.swt.widgets.Shell;

