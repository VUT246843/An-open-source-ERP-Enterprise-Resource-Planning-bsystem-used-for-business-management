        Button finishButton = getButton(IDialogConstants.FINISH_ID);
 * limitations under the License.
import org.eclipse.swt.widgets.Button;
}
public class CompareWizardDialog extends ActiveWizardDialog

import org.eclipse.jface.dialogs.IDialogConstants;
 * See the License for the specific language governing permissions and

import org.eclipse.jface.wizard.IWizard;
        finishButton.setText(CompareUIMessages.compare_objects_wizard_dialog_button_compare);
import org.jkiss.dbeaver.ui.dialogs.ActiveWizardDialog;
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.tools.compare.simple.ui.internal.CompareUIMessages;
        super.createButtonsForButtonBar(parent);
package org.jkiss.dbeaver.tools.compare.simple.ui;
 * Licensed under the Apache License, Version 2.0 (the "License");
    public CompareWizardDialog(IWorkbenchWindow window, IWizard wizard)
import org.eclipse.ui.IWorkbenchWindow;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected void createButtonsForButtonBar(Composite parent)
    {
    {
{
 *
/*
 *
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Composite;
    }
        //setTitleImage(DBIcon.COMPARE.getImage());
/**
    }
 * Unless required by applicable law or agreed to in writing, software

 */
 */

    @Override
 * Compare wizard dialog
        super(window, wizard);
 * You may obtain a copy of the License at
