        UIMessages.control_boolean_state_null,
    @NotNull
        return icon;
    private final String[] presets;
    }
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.internal.UIMessages;

        return id;
 *
    public DBIcon getIcon() {
 * you may not use this file except in compliance with the License.
        UIIcon.CHECK_OFF,
        return label;
    private final String label;
 *

}
    }


        return this == CHECKED ? checked : this == UNCHECKED ? unchecked : none;
    ),
        "checked",
        new String[]{"☐", "[ ]", "no", String.valueOf(false)}
    public <T> T choose(@NotNull T checked, @NotNull T unchecked, @NotNull T none) {
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
public enum BooleanState {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBConstants;
        this.label = label;
    @NotNull
        this.icon = icon;
        this.id = id;
    public String getId() {
 * You may obtain a copy of the License at
        new String[]{"☑", "[v]", "yes", String.valueOf(true)}
/*

        this.presets = presets;
    @NotNull
        "unchecked",
 */

        return presets;
    private final String id;
 *
    }

    public String[] getPresets() {
    }
        "null",
        UIIcon.CHECK_QUEST,
    }
import org.jkiss.dbeaver.ui.UIIcon;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBIcon;


 * limitations under the License.
    @NotNull
package org.jkiss.dbeaver.ui.controls.bool;
    public String getLabel() {
        UIIcon.CHECK_ON,
    BooleanState(@NotNull String id, @NotNull String label, @NotNull DBIcon icon, @NotNull String[] presets) {
    ),
        UIMessages.control_boolean_state_checked,
    NULL(
    @NotNull
    }
    CHECKED(
        UIMessages.control_boolean_state_unchecked,
import org.jkiss.code.NotNull;
        new String[]{"☒", "[?]", DBConstants.NULL_VALUE_LABEL}
    private final DBIcon icon;
    UNCHECKED(
    );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
