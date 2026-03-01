
    public Combo getCombo() {
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
    @NotNull
        formatCombo.select(format == DBDDisplayFormat.UI ? 0 : format == DBDDisplayFormat.EDIT ? 1 : 2);
        UIUtils.createControlLabel(parent, DTUIMessages.value_format_selector_value);
            case 0: return DBDDisplayFormat.UI;

    }
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
        formatCombo.add(DTUIMessages.value_format_selector_database_native);
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ValueFormatSelector(@NotNull Composite parent) {
 * You may obtain a copy of the License at
        return formatCombo;
        }
package org.jkiss.dbeaver.ui.controls;
import org.jkiss.code.NotNull;
        formatCombo.add(DTUIMessages.value_format_selector_editable);
import org.eclipse.swt.SWT;
 * See the License for the specific language governing permissions and


import org.eclipse.swt.widgets.Composite;
    public void select(@NotNull DBDDisplayFormat format) {
/*
    }
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
            case 1: return DBDDisplayFormat.EDIT;
        switch (formatCombo.getSelectionIndex()) {
    public DBDDisplayFormat getSelection() {
import org.eclipse.swt.widgets.Combo;

public class ValueFormatSelector {
import org.jkiss.dbeaver.tools.transfer.ui.internal.DTUIMessages;
    private final Combo formatCombo;
        formatCombo = new Combo(parent, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
 * DBeaver - Universal Database Manager
        formatCombo.add(DTUIMessages.value_format_selector_display);
 *
 *
 * limitations under the License.
import org.jkiss.dbeaver.ui.UIUtils;
            default: return DBDDisplayFormat.NATIVE;
    }
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
 */
