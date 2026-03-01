        setErrorMessage(errorMessage);
import org.jkiss.dbeaver.ui.UIUtils;
        return showDialog(UIUtils.getActiveWorkbenchShell(), dialogPage);
        EditObjectDialog dialog = new EditObjectDialog(shell, dialogPage);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.dialogs.IDialogPageContainer;
import org.eclipse.jface.dialogs.IDialogConstants;
        Point minSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
        setHelpAvailable(dialogPage instanceof IHelpContextIdProvider hcp && hcp.getHelpContextId() != null);
                return;
    public void updateMessage() {
        if (dialogPage instanceof BaseObjectEditPage oep) {

 * limitations under the License.
        }
            try {
            UIUtils.setHelp(dialogPage.getControl(), hcp.getHelpContextId());
 * DBeaver - Universal Database Manager
        }
    @Override
 */

                DBWorkbench.getPlatformUI().showError("Error saving data", null, e);
        getShell().setText(title);

    }
    }
import org.eclipse.swt.layout.GridLayout;
        if (dialogPage instanceof BaseObjectEditPage) {
        setTitle(dialogPage.getTitle());
    }
        String errorMessage = dialogPage.getErrorMessage();
        if (proposedSize.y < minSize.y) proposedSize.y = minSize.y;
        if (okButton != null) {
    @Override
 *
    protected int getShellStyle() {
 * You may obtain a copy of the License at
        if (this.dialogPage instanceof BaseObjectEditPage editPage) {
        boolean enabled = false;
    protected Control createContents(Composite parent) {

    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    }
 * See the License for the specific language governing permissions and

        updateButtons();
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
    }
import org.eclipse.jface.dialogs.IDialogPage;

    public static boolean showDialog(Shell shell, IDialogPage dialogPage) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        super.okPressed();
class EditObjectDialog extends BaseTitleDialog implements IDialogPageContainer {
        return super.getShellStyle();
        return group;
        return proposedSize;
            editPage.setContainer(this);
    protected Point getInitialSize() {
    public static boolean showDialog(IDialogPage dialogPage) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        super(shell, null);

            }
    protected Composite createDialogArea(Composite parent) {
    @Override
            } catch (Exception e) {
        String title = dialogPage.getTitle();
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (dialogPage instanceof IHelpContextIdProvider hcp) {
import org.eclipse.swt.widgets.Shell;
/*
    }
        }
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.utils.CommonUtils;
            if (object != null) {
    public EditObjectDialog(Shell shell, IDialogPage dialogPage) {
    }
        Composite group = super.createDialogArea(parent);
import org.eclipse.swt.layout.GridData;
                title = DBUtils.getObjectTypeName(object);
 *
        }

        getButton(IDialogConstants.OK_ID).setEnabled(enabled);
    @Override
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
        return contents;
import org.eclipse.swt.graphics.Point;
        composite.setLayout(new GridLayout(1, false));


        return dialog.open() == IDialogConstants.OK_ID;

            DBSObject object = editPage.getObject();
    private final IDialogPage dialogPage;
 *
    }

            okButton.setEnabled(CommonUtils.isEmpty(errorMessage));

        if (dialogPage instanceof BaseObjectEditPage editPage) {
    protected void okPressed() {
import org.jkiss.dbeaver.model.struct.DBSObject;
            enabled = ((BaseObjectEditPage) dialogPage).isPageComplete();
        Control contents = super.createContents(parent);
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        dialogPage.createControl(composite);
import org.eclipse.swt.widgets.Button;
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
        }

        Point proposedSize = super.getInitialSize();
    public void updateButtons() {
        Composite composite = new Composite(group, SWT.NONE);
        if (proposedSize.x < minSize.x) proposedSize.x = minSize.x;
        Button okButton = getButton(IDialogConstants.OK_ID);
        this.dialogPage = dialogPage;
package org.jkiss.dbeaver.ui.editors.object.struct;


import org.eclipse.swt.SWT;
                oep.performFinish();
}
            }
import org.jkiss.dbeaver.ui.dialogs.BaseTitleDialog;
import org.jkiss.dbeaver.ui.IHelpContextIdProvider;
