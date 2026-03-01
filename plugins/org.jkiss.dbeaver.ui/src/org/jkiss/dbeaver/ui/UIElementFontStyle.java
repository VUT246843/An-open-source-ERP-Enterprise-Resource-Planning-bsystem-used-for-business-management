 *

 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
public enum UIElementFontStyle {
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    BOLD(UIMessages.control_font_bold);
    UIElementFontStyle(@NotNull String label) {
    public String getLabel() {
import org.jkiss.dbeaver.ui.internal.UIMessages;
        this.label = label;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");

 * See the License for the specific language governing permissions and
    }
 * you may not use this file except in compliance with the License.
    private final String label;
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 *
    NORMAL(UIMessages.control_font_normal),
        return label;

    @NotNull
 *
 */

/*
    ITALIC(UIMessages.control_font_italic),
}

