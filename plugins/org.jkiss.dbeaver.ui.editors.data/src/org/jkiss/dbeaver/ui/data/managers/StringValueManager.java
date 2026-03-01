import org.jkiss.dbeaver.ui.data.IValueEditor;
                    return new ContentPanelEditor(controller);
                    ContentUtils.isTextValue(((DBDContentCached) value).getCachedValue()))
                }
                if (dataKind == DBPDataKind.ARRAY && !(value instanceof Collection)) {
 *
                    return new ContentInlineEditor(controller);

 */
                Object value = controller.getValue();

                {
        DBPDataKind dataKind = controller.getValueType().getDataKind();
import org.jkiss.dbeaver.model.data.DBDContentCached;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.data.IValueController;
 * you may not use this file except in compliance with the License.
        throws DBException
 * DBeaver - Universal Database Manager
                    return ContentEditor.openEditor(controller);
                if (controller.getExecutionContext().getDataSource().getContainer().getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_STRING_USE_CONTENT_EDITOR)) {
import java.util.Collection;
                } else {
import org.jkiss.dbeaver.utils.ContentUtils;
import org.jkiss.dbeaver.DBException;
                    dataKind = DBPDataKind.OBJECT;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    {

 * limitations under the License.
} * You may obtain a copy of the License at
                // Open inline/panel editor
                }
                if (dataKind == DBPDataKind.STRING || dataKind == DBPDataKind.NUMERIC || dataKind == DBPDataKind.DATETIME || dataKind == DBPDataKind.BOOLEAN || dataKind == DBPDataKind.OBJECT) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            case PANEL:
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
                long maxLength = controller.getValueType().getMaxLength();
                }
                return null;
    private static final long PLAIN_STRING_MAX_LENGTH = 32;

import org.jkiss.dbeaver.ui.data.editors.ContentInlineEditor;
            case EDITOR:
    @Override
/*
                if (dataKind == DBPDataKind.NUMERIC || dataKind == DBPDataKind.DATETIME || dataKind == DBPDataKind.BOOLEAN || (maxLength > 0 && maxLength < PLAIN_STRING_MAX_LENGTH)) {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.data.editors.ContentPanelEditor;
import org.jkiss.dbeaver.ui.editors.content.ContentEditor;
                } else if (value instanceof DBDContentCached &&
                    return null;
 *
import org.jkiss.dbeaver.ui.data.dialogs.TextViewDialog;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
                } else {
    public IValueController.EditType[] getSupportedEditTypes() {
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
import org.jkiss.dbeaver.ui.data.editors.StringInlineEditor;
        switch (controller.getEditType()) {
    public IValueEditor createEditor(@NotNull IValueController controller)

package org.jkiss.dbeaver.ui.data.managers;
                    return new TextViewDialog(controller);
                }

            default:
import org.jkiss.dbeaver.model.DBPDataKind;
                    return new StringInlineEditor(controller);
public class StringValueManager extends ContentValueManager {
    }
                    return new StringInlineEditor(controller);
    @Override
 * String value manager
            case INLINE:
    }
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
        return new IValueController.EditType[] {IValueController.EditType.INLINE, IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
                } else {
