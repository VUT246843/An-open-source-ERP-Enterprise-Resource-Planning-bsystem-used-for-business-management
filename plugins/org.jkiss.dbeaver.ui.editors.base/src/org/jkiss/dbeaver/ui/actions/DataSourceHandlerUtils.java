                        }
                public void widgetSelected(SelectionEvent e) {
        }
import org.jkiss.dbeaver.DBException;
            GridData gd = new GridData(GridData.FILL_BOTH);
 * distributed under the License is distributed on an "AS IS" BASIS,
            final Composite composite = super.createDialogArea(parent);
                    }

                DBWorkbench.getPlatformUI().showError(dataSource.getName(), e.getMessage(), e);
                dataSource.resetAllSecrets();
            @Override
        });
        }
                }
            }

            }
                if (onFinish != null) {
import org.jkiss.dbeaver.utils.GeneralUtils;
            this.credentials = credentials;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.eclipse.jface.dialogs.IDialogConstants;
 * Copyright (C) 2010-2024 DBeaver Corp and others

        return true;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (onFinish != null) {
import org.eclipse.swt.widgets.TableItem;
import org.jkiss.dbeaver.model.secret.DBSSecretValue;
        protected Composite createDialogArea(Composite parent) {
            super(UIUtils.getActiveShell(),
 *
                }
import org.eclipse.swt.events.SelectionEvent;
        private DBSSecretValue selected;
            credsTable.addSelectionListener(new SelectionAdapter() {
                    return dialog.selected;
import org.eclipse.core.runtime.Status;
package org.jkiss.dbeaver.ui.actions;

                if (sharedCredentials.size() == 1) {


                @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        private final DBPDataSourceContainer dataSource;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
            return composite;
    public static boolean resolveSharedCredentials(DBPDataSourceContainer dataSource, @Nullable DBRProgressListener onFinish) {
        return UIUtils.syncExec(new RunnableWithResult<>() {
}
            credsTable.setLayoutData(gd);
 *
        if (dataSource.isSharedCredentials() && !dataSource.isSharedCredentialsSelected()) {
                CredentialsSelectorDialog dialog = new CredentialsSelectorDialog(dataSource, credentials);
    }
 *
                        okPressed();
import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
                return null;
            try {
            }
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
                    if (selectedCredentials != null) {
        private final List<DBSSecretValue> credentials;

import org.eclipse.swt.widgets.Composite;
                }
                    if (selected != null) {
                List<DBSSecretValue> sharedCredentials = dataSource.listSharedCredentials();
                if (dialog.open() == IDialogConstants.OK_ID) {
                    selected = (DBSSecretValue) e.item.getData();
    static class CredentialsSelectorDialog extends BaseDialog {
                @Override
                    onFinish.onTaskFinished(GeneralUtils.makeExceptionStatus(e));
 * you may not use this file except in compliance with the License.
                        dataSource.setSelectedSharedCredentials(selectedCredentials);
            UIUtils.createInfoLabel(composite, "There are multiple credentials available for authentication.\nPlease choose credentials you want to use:");
                    // Show credentials selector
    private static DBSSecretValue selectSharedCredentials(DBPDataSourceContainer dataSource, List<DBSSecretValue> credentials) {
            });
            public DBSSecretValue runWithResult() {
import org.jkiss.dbeaver.ui.UIUtils;
                TableItem item = new TableItem(credsTable, SWT.NONE);
                    dataSource.setSelectedSharedCredentials(sharedCredentials.get(0));
import org.eclipse.swt.SWT;

import java.util.List;
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.runtime.RunnableWithResult;
            final Table credsTable = new Table(composite, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
            } catch (DBException e) {
                dataSource.getDriver().getIcon());
import org.eclipse.swt.layout.GridData;
                }
/*
            selected = credentials.get(0);
                    }
                item.setData(sv);
 * limitations under the License.
 * You may obtain a copy of the License at
            this.dataSource = dataSource;
                public void widgetDefaultSelected(SelectionEvent e) {
                item.setText(sv.getDisplayName());
            //gd.widthHint = 50 * UIUtils.getFontHeight(credsTable);
    }
                "'" + dataSource.getName() + "' credentials",
                            onFinish.onTaskFinished(Status.CANCEL_STATUS);
import org.jkiss.code.Nullable;
import org.eclipse.swt.events.SelectionAdapter;

                    DBSSecretValue selectedCredentials = selectSharedCredentials(dataSource, sharedCredentials);
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

                }
                return false;
            credsTable.setSelection(0);

                        return false;
 */
        @Override
public class DataSourceHandlerUtils {
        public CredentialsSelectorDialog(DBPDataSourceContainer dataSource, List<DBSSecretValue> credentials) {
            for (DBSSecretValue sv : credentials) {
                    } else {
import org.eclipse.swt.widgets.Table;

                } else if (!sharedCredentials.isEmpty()) {
    }


