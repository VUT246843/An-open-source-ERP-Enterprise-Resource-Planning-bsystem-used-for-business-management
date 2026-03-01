}        parent.setLayoutData(gd);
        return true;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.dialogs.Dialog;
 */
package org.jkiss.dbeaver.ui.dialogs;
 * limitations under the License.
 * See the License for the specific language governing permissions and

 */
/*
import org.eclipse.jface.dialogs.IDialogConstants;
    }

 *
    }
            parent.setBackground(JFaceColors.getBannerBackground(parent.getDisplay()));
    @Override
        super(shell);
import org.eclipse.swt.widgets.Button;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);

    protected boolean isResizable()
    {
import org.eclipse.jface.resource.JFaceColors;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
    }
    }
 *
{

    protected void createButtonsForButtonBar(Composite parent) {
/**
            parent,
 * distributed under the License is distributed on an "AS IS" BASIS,
        gd.horizontalAlignment = GridData.CENTER; 
    protected boolean isBanner() {
 * Information dialog (empty with OK button on the center)
    public InformationDialog(Shell shell)
        return false;
            true);
 * You may obtain a copy of the License at
            IDialogConstants.OK_LABEL,
public class InformationDialog extends Dialog
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
    {
        Button button = createButton(
    @Override
            IDialogConstants.OK_ID,
 * Licensed under the Apache License, Version 2.0 (the "License");
        button.setFocus();
 *
        if (isBanner()) {
        }
