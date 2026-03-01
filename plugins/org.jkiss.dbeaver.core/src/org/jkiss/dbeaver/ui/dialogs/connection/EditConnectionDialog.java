        if (getCurrentPage() != null) {
 * limitations under the License.
            lastActivePage = getCurrentPage().getName();

        return false;
        return UIUtils.getDialogSettings("DBeaver.EditConnectionDialog");
    @Override
            TreeItem[] items = pagesTree.getItems();
        if (!CommonUtils.isEmpty(activePage)) {
 *
        super.buttonPressed(buttonId);

 * See the License for the specific language governing permissions and
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
    private static final int TEST_BUTTON_ID = 2000;
import org.jkiss.dbeaver.ui.dialogs.MultiPageWizardDialog;


import java.util.IdentityHashMap;
    }
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
            testButton.setEnabled(settings != null && settings.isPageComplete());
        dialog.defaultPageName = defaultPageName;
    @Override
 * <p>
/**
    private static final Map<DBPDataSourceContainer, EditConnectionDialog> openDialogs = Collections.synchronizedMap(new IdentityHashMap<>());
    }
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.core.CoreMessages;

    private static String lastActivePage;
 */

        return contents;
public class EditConnectionDialog extends MultiPageWizardDialog {

        }
        testButton = createButton(parent, TEST_BUTTON_ID, "   " + CoreMessages.dialog_connection_button_test + "   ", false);
        testButton.setEnabled(false);
    public static boolean openEditConnectionDialog(IWorkbenchWindow window, DBPDataSourceContainer dataSource, String defaultPageName) {
        return openEditConnectionDialog(window, dataSource, defaultPageName, null);
        }
    }
    @Override
    private String defaultPageName;
        if (buttonId == TEST_BUTTON_ID) {
        }
    @Override
    private Button testButton;
    private void testConnection() {
    }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

            return;

    protected void buttonPressed(int buttonId) {
        Control contents = super.createContents(parent);
            return dialog.open() == IDialogConstants.OK_ID;
            openDialogs.remove(dataSource);
    @Override
import java.util.function.Consumer;
    @Override

import org.eclipse.ui.IWorkbenchWindow;
 * It is a modeless dialog. But only one instance can be opened for a particular datasource.
package org.jkiss.dbeaver.ui.dialogs.connection;

        if (testButton != null) {
    @Override
    }
        EditConnectionDialog dialog = openDialogs.get(dataSource);
}
        @Nullable String defaultPageName,
    }
        super.updateButtons();

import java.util.Collections;
    protected boolean isShowTreeIcons() {
            }

                items[0].setExpanded(true);
    public void updateButtons() {
import org.jkiss.dbeaver.ui.ConnectionFeatures;

        openDialogs.put(dataSource, dialog);
    protected IDialogSettings getDialogBoundsSettings() {
        return false;
        return true;
            String finalActivePage = activePage;
        }
 */
    protected boolean isDisableControlsOnRun() {
            // Expand first page
        if (false) {
        }


    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
            testConnection();
    }

        }

        dialog = new EditConnectionDialog(window, wizard);
 * you may not use this file except in compliance with the License.
    protected boolean isModalWizard() {
            }
            return true;
    public ConnectionWizard getWizard() {
    public static boolean openEditConnectionDialog(
import org.jkiss.code.NotNull;
        if (dialog != null && dialog.getShell() != null && !dialog.getShell().isDisposed()) {
import org.jkiss.dbeaver.ui.UIUtils;
            Tree pagesTree = getPagesTree();
            UIUtils.asyncExec(() -> getWizard().openSettingsPage(finalActivePage));
 * Copyright (C) 2010-2026 DBeaver Corp and others
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.dialogs.IDialogSettings;


import java.util.Map;
        try {

        }
            wizardConfigurer.accept(wizard);
import org.eclipse.swt.widgets.*;
    @Override
    }
        EditConnectionWizard wizard = new EditConnectionWizard((DataSourceDescriptor) dataSource);
    }
    }

    ) {
            dialog.getShell().forceActive();
        String activePage = defaultPageName;
            ConnectionPageSettings settings = getWizard().getPageSettings();
        @Nullable Consumer<EditConnectionWizard> wizardConfigurer

    public boolean close() {

        getWizard().testConnection();
    }
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBPDataSourceContainer dataSource,
 * NewConnectionDialog.
            activePage = lastActivePage;
import org.jkiss.dbeaver.registry.DataSourceDescriptor;
        }
        return (ConnectionWizard) super.getWizard();
        } finally {
    @Override
            if (defaultPageName != null) {
    private EditConnectionDialog(IWorkbenchWindow window, ConnectionWizard wizard) {
        ConnectionFeatures.CONNECTION_EDIT.use(Map.of("driver", dataSource.getDriver().getPreconfiguredId()));
 *
    }
        }
    protected Control createContents(Composite parent) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (CommonUtils.isEmpty(activePage)) {
                dialog.showPage(defaultPageName);
        @NotNull IWorkbenchWindow window,
/*
        return super.close();

        if (wizardConfigurer != null) {
    }
            if (items.length > 0) {
        super(window, wizard);

    }
import org.eclipse.jface.dialogs.IDialogConstants;
import org.jkiss.utils.CommonUtils;
