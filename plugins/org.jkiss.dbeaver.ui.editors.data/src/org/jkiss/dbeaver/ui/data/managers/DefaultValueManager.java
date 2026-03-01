    }
    public IValueController.EditType[] getSupportedEditTypes() {
/*
 * limitations under the License.
import org.jkiss.dbeaver.ui.data.dialogs.TextViewDialog;
import org.jkiss.dbeaver.ui.data.IValueEditor;
                return new TextViewDialog(controller);
        switch (controller.getEditType()) {
                return new StringInlineEditor(controller);
import org.jkiss.dbeaver.DBException;
    public IValueEditor createEditor(@NotNull final IValueController controller) throws DBException {
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
                return null;
            default:
/**
 *
package org.jkiss.dbeaver.ui.data.managers;


        }
        return new IValueController.EditType[] {IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
            case EDITOR:
import org.jkiss.dbeaver.ui.data.IValueController;
 * Default value handler

 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    @NotNull

 */
    @Override
    public static final DefaultValueManager INSTANCE = new DefaultValueManager();
            case INLINE:
            case PANEL:
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
public class DefaultValueManager extends BaseValueManager {

 * Unless required by applicable law or agreed to in writing, software
 *
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.data.editors.StringInlineEditor;
    }
