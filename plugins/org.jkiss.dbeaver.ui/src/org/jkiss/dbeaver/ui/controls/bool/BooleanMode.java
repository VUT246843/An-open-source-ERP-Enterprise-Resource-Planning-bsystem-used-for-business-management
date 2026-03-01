        return name;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others

    private final String name;
    private final String description;
}
 *
import org.jkiss.code.NotNull;
        return description;
    }
import org.jkiss.dbeaver.ui.internal.UIMessages;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.controls.bool;
 *
 * You may obtain a copy of the License at
    @NotNull
public enum BooleanMode {
/*
 */
        this.description = description;

    }


        this.name = name;
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
 * DBeaver - Universal Database Manager
    BooleanMode(@NotNull String name, @NotNull String description) {
    public String getDescription() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0

    public String getName() {
    ICON(UIMessages.control_boolean_mode_icon, UIMessages.control_boolean_mode_icon_tip);
    TEXT(UIMessages.control_boolean_mode_text, UIMessages.control_boolean_mode_text_tip),
