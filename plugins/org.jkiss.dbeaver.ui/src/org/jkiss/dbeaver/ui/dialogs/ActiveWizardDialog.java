        if (wizard instanceof IWorkbenchWizard) {
import org.eclipse.swt.widgets.Button;
        if (isModalWizard() || UIUtils.isInDialog()) {
        return SWT.CLOSE | SWT.MAX | SWT.TITLE | SWT.BORDER | SWT.RESIZE | getDefaultOrientation();
    @Override
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.jface.wizard.IWizardPage;
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
import org.eclipse.swt.widgets.Composite;
        // Initialize wizard

        }
    protected void createButtonsForButtonBar(Composite parent) {
    public void setFinishButtonLabel(String finishButtonLabel) {
 *
/*
//                    ((ActiveWizardPage) event.getTargetPage()).activatePage();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.IWorkbenchWizard;
        this(window, wizard, null);
    }
        return UIUtils.getDialogSettings("DBeaver.ActiveWizardDialog." + getWizard().getClass().getSimpleName());
 *
        });
    }


 * You may obtain a copy of the License at
        }
                }
        super.createButtonsForButtonBar(parent);
        this.finishButtonLabel = finishButtonLabel;

import java.util.Set;

    public void showPage(IWizardPage page) {
    }
        this.cancelButtonLabel = cancelButtonLabel;

        return true;
    protected IDialogSettings getDialogBoundsSettings()
 *
 * ActiveWizardDialog
            }
            if (selection == null) {
    @Override
 * DBeaver - Universal Database Manager
    public ActiveWizardDialog(IWorkbenchWindow window, IWizard wizard)
    @Override
    {
 * you may not use this file except in compliance with the License.
            return super.getShellStyle();
 * limitations under the License.
    }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.dialogs.IDialogSettings;
    private String cancelButtonLabel = IDialogConstants.CANCEL_LABEL;
    }
            UIUtils.resizeShell(getWizard().getContainer().getShell());

        Button cancelButton = getButton(IDialogConstants.CANCEL_ID);
        super(window.getShell(), wizard);
/**

 */

        if (adaptContainerSizeToPages && !resizedShells.contains(page.getName())) {
import org.eclipse.ui.IWorkbenchWindow;
        this.adaptContainerSizeToPages = adaptContainerSizeToPages;

                    selection = (IStructuredSelection) selectionService.getSelection();
 */

        finishButton.setText(finishButtonLabel);
import org.eclipse.swt.SWT;
            resizedShells.add(page.getName());
}
    protected boolean isModalWizard() {

//                if (event.getTargetPage() instanceof ActiveWizardPage) {
    private boolean adaptContainerSizeToPages = false;
package org.jkiss.dbeaver.ui.dialogs;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
        Button finishButton = getButton(IDialogConstants.FINISH_ID);

    private final Set<String> resizedShells = new HashSet<>();
        }
            }
    }
//                }

                ((ActiveWizardPage) event.getCurrentPage()).deactivatePage();
import org.eclipse.jface.dialogs.IDialogConstants;
        cancelButton.setText(cancelButtonLabel);
public class ActiveWizardDialog extends WizardDialog {
            ((IWorkbenchWizard)wizard).init(window.getWorkbench(), selection);
        super.showPage(page);
import org.eclipse.jface.wizard.IWizard;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public void setAdaptContainerSizeToPages(boolean adaptContainerSizeToPages) {
 * See the License for the specific language governing permissions and
    private String finishButtonLabel = IDialogConstants.FINISH_LABEL;
                final ISelectionService selectionService = window.getSelectionService();

    {
import org.eclipse.ui.ISelectionService;
import org.jkiss.dbeaver.ui.UIUtils;
import java.util.HashSet;
        addPageChangingListener(event -> {
    public int getShellStyle() {
    }
    public ActiveWizardDialog(IWorkbenchWindow window, IWizard wizard, IStructuredSelection selection)
            if (event.getCurrentPage() instanceof ActiveWizardPage) {
                if (selectionService != null && selectionService.getSelection() instanceof IStructuredSelection) {
import org.eclipse.jface.viewers.IStructuredSelection;


    }
    public void setCancelButtonLabel(String cancelButtonLabel) {
import org.eclipse.jface.wizard.WizardDialog;
