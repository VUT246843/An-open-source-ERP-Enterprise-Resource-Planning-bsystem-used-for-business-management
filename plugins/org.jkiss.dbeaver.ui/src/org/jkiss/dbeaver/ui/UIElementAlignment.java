import org.jkiss.dbeaver.model.DBIcon;

}
 * You may obtain a copy of the License at
        return icon;

    private final String label;

import org.jkiss.code.NotNull;
 *
    @NotNull
    public String getLabel() {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.internal.UIMessages;
        return label;
    private final int style;

 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui;
    CENTER(UIMessages.control_alignment_center, SWT.CENTER, UIIcon.ALIGN_TO_CENTER),
 * limitations under the License.
 *
    private final DBIcon icon;
    LEFT(UIMessages.control_alignment_left, SWT.LEFT, UIIcon.ALIGN_TO_LEFT),
public enum UIElementAlignment {
 * DBeaver - Universal Database Manager
 *
    @NotNull
    }
    }
    }
        this.style = style;
 */
/*
    public DBIcon getIcon() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    UIElementAlignment(@NotNull String label, int style, @NotNull DBIcon icon) {

 * Licensed under the Apache License, Version 2.0 (the "License");
        this.label = label;
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.icon = icon;


import org.eclipse.swt.SWT;
    RIGHT(UIMessages.control_alignment_right, SWT.RIGHT, UIIcon.ALIGN_TO_RIGHT);
    }
    public int getStyle() {
        return style;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
