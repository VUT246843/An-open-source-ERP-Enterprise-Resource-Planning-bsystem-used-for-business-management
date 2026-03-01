
        super(parentShell, eula);
    @Override
import org.eclipse.swt.widgets.Shell;
package org.jkiss.dbeaver.ui.eula;
 *
 * You may obtain a copy of the License at
 * limitations under the License.
 *
 *
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
}

import org.jkiss.code.NotNull;
    }
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
import org.eclipse.jface.dialogs.IDialogConstants;
/*
 * See the License for the specific language governing permissions and
    public EULAInfoDialog(@NotNull Shell parentShell, @Nullable String eula) {
    protected void createButtonsForButtonBar(@NotNull Composite parent) {

    }
import org.eclipse.swt.widgets.Composite;
 */
public class EULAInfoDialog extends EULABaseDialog {
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager

 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
