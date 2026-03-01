import org.eclipse.swt.SWT;
                }
        }
    {
        Control ctl = super.createContents(parent);
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.dialogs.IDialogConstants;
package org.jkiss.dbeaver.ui.editors.content;

 *


        infoLabel.setLayoutData(gd);
import org.eclipse.swt.layout.GridData;
        getShell().setText("Choose content editor");
 *
import org.eclipse.swt.events.SelectionAdapter;
 */
    }
                getButton(IDialogConstants.OK_ID).setEnabled(selectedPart != null);
        } else {
        });
 * You may obtain a copy of the License at
        return group;
        combo.addSelectionListener(new SelectionAdapter() {

 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
    }
    protected Control createDialogArea(Composite parent)
    {
        this.dirtyParts = dirtyParts;
        infoLabel.setText("Content was modified in multiple editors. Choose correct one:");
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
import java.util.List;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        group.setLayoutData(gd);

                    selectedPart = dirtyParts.get(combo.getSelectionIndex() - 1);
import org.eclipse.jface.dialogs.Dialog;
            public void widgetSelected(SelectionEvent e)
        Composite group = (Composite) super.createDialogArea(parent);
import org.eclipse.ui.IEditorPart;
                if (combo.getSelectionIndex() >= 1) {
    protected boolean isResizable()
 * SelectContentPartDialog
    protected Control createContents(Composite parent)

 * limitations under the License.
        Label infoLabel = new Label(group, SWT.NONE);

    }
    @Override
}    public IEditorPart getSelectedPart()
        SelectContentPartDialog scDialog = new SelectContentPartDialog(parentShell, dirtyParts);
                } else {
    {
        getButton(IDialogConstants.OK_ID).setEnabled(false);
    private IEditorPart selectedPart;
 * @author Serge Rider
            combo.add(part.getTitle());
        return selectedPart;
    {
import org.eclipse.swt.events.SelectionEvent;
        GridData gd = new GridData(GridData.FILL_BOTH);
    private SelectContentPartDialog(Shell parentShell, List<IEditorPart> dirtyParts)
        for (IEditorPart part : dirtyParts) {
            @Override

 * you may not use this file except in compliance with the License.
    @Override
            return null;
 *
class SelectContentPartDialog extends Dialog {


/**
        if (scDialog.open() == IDialogConstants.OK_ID) {

            return scDialog.getSelectedPart();
    }
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd = new GridData(GridData.FILL_HORIZONTAL);
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static IEditorPart selectContentPart(Shell parentShell, List<IEditorPart> dirtyParts)
        combo.add("");

        return true;
 * Unless required by applicable law or agreed to in writing, software
        return ctl;
            }
            {

    {
    }
    }
        super(parentShell);
 *
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
        final Combo combo = new Combo(group, SWT.READ_ONLY | SWT.DROP_DOWN);
/*
    private List<IEditorPart> dirtyParts;
        combo.setLayoutData(gd);
                    selectedPart = null;
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
    @Override
