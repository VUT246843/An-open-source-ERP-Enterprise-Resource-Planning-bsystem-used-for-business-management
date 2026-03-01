        Composite eulaArea = new Composite(super.createDialogArea(parent), SWT.BORDER);
        GridData gd = new GridData(GridData.FILL_BOTH);
        super(parentShell, CoreMessages.core_eula_dialog_title, DBIcon.TREE_INFO);
 * You may obtain a copy of the License at
        return eula;


        gd.widthHint = UIUtils.getFontHeight(eulaArea.getFont()) * 50;
    private final String eula;
    public String getEula() {
 *
 *
package org.jkiss.dbeaver.ui.eula;
        GridLayout gl = new GridLayout(1, false);
        eulaArea.setLayout(gl);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.swt.widgets.Shell;
    protected Composite createDialogArea(@NotNull Composite parent) {
    }

        return eulaArea;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        gd.heightHint = UIUtils.getFontHeight(eulaArea.getFont()) * 40;
    @Nullable
public abstract class EULABaseDialog extends BaseDialog {
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
        gl.marginWidth = 0;
        this.eula = eula;
 * Licensed under the Apache License, Version 2.0 (the "License");
        eulaArea.setLayoutData(new GridData(GridData.FILL_BOTH));
 */
        Text eulaText = new Text(eulaArea, SWT.V_SCROLL | SWT.MULTI | SWT.WRAP | SWT.READ_ONLY | SWT.NO_FOCUS);
import org.eclipse.swt.widgets.Composite;
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.code.NotNull;
import org.eclipse.swt.layout.GridLayout;

 * limitations under the License.
 * DBeaver - Universal Database Manager
    }
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.core.CoreMessages;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.SWT;
        gl.marginHeight = 0;
import org.jkiss.dbeaver.model.DBIcon;
    public EULABaseDialog(@NotNull Shell parentShell, @Nullable String eula) {
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;

}

 * you may not use this file except in compliance with the License.

        eulaText.setText(eula == null ? "End-User Agreement not found" : eula);

import org.eclipse.swt.widgets.Text;
        eulaText.setLayoutData(gd);
