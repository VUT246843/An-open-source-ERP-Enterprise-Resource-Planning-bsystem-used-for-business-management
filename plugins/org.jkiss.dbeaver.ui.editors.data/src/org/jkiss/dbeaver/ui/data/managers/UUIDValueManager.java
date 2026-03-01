                    return ContentEditor.openEditor(controller);
/**
                        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return new ContentPanelEditor(controller) {
 * you may not use this file except in compliance with the License.
                    @Override
    public IValueEditor createEditor(@NotNull IValueController controller) throws DBException {
                            }
                return new StringInlineEditor(controller) {
                    @Override
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        switch (controller.getEditType()) {
                        }
                        return strValue;
import org.jkiss.dbeaver.ui.data.IValueEditor;

                            } catch (Exception e) {
                            try {
                                return UUID.fromString((String) strValue);
        return new IValueController.EditType[] {IValueController.EditType.INLINE, IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
                };
import org.jkiss.dbeaver.ui.data.editors.StringInlineEditor;
                };
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
    }
                                throw new DBCException("Bad UUID value [" + strValue + "]");
                            try {
                    }
    }

            case EDITOR:
                            }
                                throw new DBCException("Bad UUID value [" + strValue + "]");
                                return null;
    @Override
import org.jkiss.dbeaver.ui.editors.content.ContentEditor;
        }
package org.jkiss.dbeaver.ui.data.managers;

    @Override
 * DBeaver - Universal Database Manager

 * limitations under the License.
                    return new TextViewDialog(controller);
    @NotNull
 *
 * Unless required by applicable law or agreed to in writing, software
            case PANEL:
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
                    public Object extractEditorValue() throws DBCException {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                        if (strValue instanceof String) {

import org.jkiss.code.NotNull;
import java.util.UUID;
                                return null;
import org.jkiss.dbeaver.model.exec.DBCException;
 * See the License for the specific language governing permissions and
                    }
                return null;
                    public Object extractEditorValue() throws DBException {

}
                        Object strValue = super.extractEditorValue();
                        if (strValue instanceof String) {
                            if (((String) strValue).isEmpty()) {
                            }
/*
public class UUIDValueManager extends ContentValueManager {
    public IValueController.EditType[] getSupportedEditTypes() {
                }
                                return UUID.fromString((String) strValue);
                            } catch (Exception e) {
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.data.dialogs.TextViewDialog;
 */
            case INLINE:
                            }
 *
 * UUID value manager
                        Object strValue = super.extractEditorValue();
                } else {
            default:
import org.jkiss.dbeaver.ui.data.IValueController;
import org.jkiss.dbeaver.ui.data.editors.ContentPanelEditor;
                            if (((String) strValue).isEmpty()) {
                if (controller.getExecutionContext().getDataSource().getContainer().getPreferenceStore().getBoolean(ResultSetPreferences.RESULT_SET_STRING_USE_CONTENT_EDITOR)) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
                        return strValue;
