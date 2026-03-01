    NULLABILITY(1 << 2, ERDUIMessages.erd_view_style_selection_item_nullability, ERDUIMessages.erd_view_style_selection_item_nullability_action),
    ALPHABETICAL_ORDER(1 << 5, ERDUIMessages.erd_view_style_selection_item_alphabetical_order, ERDUIMessages.erd_view_style_selection_item_alphabetical_order_action);
 * you may not use this file except in compliance with the License.
    @NotNull
    public String getTitle() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 */
        for (ERDViewStyle style : styles) {
 * Licensed under the Apache License, Version 2.0 (the "License");
            return Arrays.stream(attrString.split(","))
 * limitations under the License.

import java.util.StringJoiner;
    public static void setDefaultStyles(@NotNull DBPPreferenceStore store, @NotNull ERDViewStyle[] styles) {
    ICONS(1, ERDUIMessages.erd_view_style_selection_item_icons, ERDUIMessages.erd_view_style_selection_item_icons_action),
 * Copyright (C) 2010-2025 DBeaver Corp and others
        final StringJoiner buffer = new StringJoiner(",");
        this.title = title;
 * Unless required by applicable law or agreed to in writing, software

    COMMENTS(1 << 3, ERDUIMessages.erd_view_style_selection_item_comments, ERDUIMessages.erd_view_style_selection_item_comments_action),
        this.actionTitle = actionTitle;
 *
    private final String title;
import java.util.Arrays;
                .map(x -> CommonUtils.valueOf(ERDViewStyle.class, x))
                .toArray(ERDViewStyle[]::new);
        return actionTitle;
    ERDViewStyle(int value, @NotNull String title, @NotNull String actionTitle) {
    }
    @NotNull
 * See the License for the specific language governing permissions and


        return title;
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
    }
 *

public enum ERDViewStyle {
import org.jkiss.dbeaver.model.erd.ERDConstants;
        return value;
    public int getValue() {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
            buffer.add(style.name());
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    private final String actionTitle;
    ENTITY_FQN(1 << 4, ERDUIMessages.erd_view_style_selection_item_fully_qualified_names, ERDUIMessages.erd_view_style_selection_item_fully_qualified_names_action),
    public static ERDViewStyle[] getDefaultStyles(@NotNull DBPPreferenceStore store) {

        store.setValue(ERDConstants.PREF_ATTR_STYLES, buffer.toString());
    public String getActionTitle() {
}
    }
/**
 *
        this.value = value;
/*
        final String attrString = store.getString(ERDConstants.PREF_ATTR_STYLES);
        }
        }
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.editors.erd.editor;

    private final int value;
    @NotNull

                .filter(Objects::nonNull)
 * Entity attribute presentation



    TYPES(1 << 1, ERDUIMessages.erd_view_style_selection_item_data_types, ERDUIMessages.erd_view_style_selection_item_data_types_action),
import java.util.Objects;
    }
    }
        return new ERDViewStyle[]{ICONS};
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (!CommonUtils.isEmpty(attrString)) {
    }
 */
