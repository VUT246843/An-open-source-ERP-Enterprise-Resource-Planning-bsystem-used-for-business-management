    @Override
    public void updateButtons() {

 * Licensed under the Apache License, Version 2.0 (the "License");
        preferencePage.setContainer(this);
        return preferencePage.getControl();
    protected Control createDialogArea(Composite parent) {
        if (preferencePage.performOk()) {
import org.eclipse.jface.preference.IPreferenceStore;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

        preferencePage.performCancel();

    }

    }
        this.preferencePage = preferencePage;
    protected void cancelPressed() {
    @Override

    }
 */
/*
import org.eclipse.swt.widgets.Control;

    public void updateTitle() {
        super(parentShell);
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.widgets.Composite;

    }
public class PreferencePageDialog extends Dialog implements IPreferencePageContainer {
    @Override
        }
    }
        super.cancelPressed();

    private final PreferencePage preferencePage;
package org.jkiss.dbeaver.ui.dialogs;
    @Override

    }
import org.eclipse.swt.widgets.Shell;
 *
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }

            super.okPressed();
    @Override
 *
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
    }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        preferencePage.createControl(parent);
import org.eclipse.jface.preference.IPreferencePageContainer;
    public IPreferenceStore getPreferenceStore() {
 * DBeaver - Universal Database Manager
    public void updateMessage() {
import org.eclipse.jface.dialogs.Dialog;

    public PreferencePageDialog(Shell parentShell, PreferencePage preferencePage) {

    protected void okPressed() {
 *
        return preferencePage.getPreferenceStore();

    @Override

