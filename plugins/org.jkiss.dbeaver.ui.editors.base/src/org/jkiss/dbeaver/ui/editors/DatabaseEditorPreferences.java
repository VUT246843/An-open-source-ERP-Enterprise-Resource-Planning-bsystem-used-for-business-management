 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
        @NotNull
        @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

                case "IN_EDITORS" -> IN_EDITORS;
 * You may obtain a copy of the License at
    public static final String PROP_KEEP_EDITORS_ON_DISCONNECT = "ui.editors.keep-editors-on-disconnect"; //$NON-NLS-1$
            };
                case "HIDDEN", "false" -> HIDDEN;

        }
}
/*
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and

        IN_EDITORS,
            return switch (CommonUtils.notEmpty(value)) {
    public enum BreadcrumbLocation {
    public static final String PROP_DISCONNECT_ON_EDITORS_CLOSE = "ui.editors.disconnect-on-editors-close"; //$NON-NLS-1$
        @NotNull
    public static final String UI_STATUS_BAR_SHOW_BREADCRUMBS = "ui.statusBar.show.breadcrumbs"; //$NON-NLS-1$
    public static final String PROP_TITLE_SHOW_FULL_NAME = "navigator.editor.full-name"; //$NON-NLS-1$
 * limitations under the License.
    public static final String PROP_SAVE_EDITORS_STATE = "ui.editors.reopen-after-restart"; //$NON-NLS-1$
            return get(store.getString(UI_STATUS_BAR_SHOW_BREADCRUMBS));
public class DatabaseEditorPreferences {
        public static BreadcrumbLocation getDefault(@NotNull DBPPreferenceStore store) {
import org.jkiss.code.NotNull;
        HIDDEN;
        private static BreadcrumbLocation get(@Nullable String value) {

 * DBeaver - Universal Database Manager
        }

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * you may not use this file except in compliance with the License.
import org.jkiss.utils.CommonUtils;
/**
            return get(store.getDefaultString(UI_STATUS_BAR_SHOW_BREADCRUMBS));
        public static BreadcrumbLocation get(@NotNull DBPPreferenceStore store) {
                default -> IN_STATUS_BAR;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DatabaseEditorPreferences
 * Unless required by applicable law or agreed to in writing, software
 *
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors;
 *
import org.jkiss.code.Nullable;
        IN_STATUS_BAR,
