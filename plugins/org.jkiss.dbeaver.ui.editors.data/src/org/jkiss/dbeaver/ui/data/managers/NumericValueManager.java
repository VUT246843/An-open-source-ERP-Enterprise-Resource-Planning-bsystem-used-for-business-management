        return new IValueController.EditType[] {IValueController.EditType.INLINE, IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
 *
                return null;
 * Licensed under the Apache License, Version 2.0 (the "License");
                } else {

        switch (controller.getEditType()) {
import org.jkiss.dbeaver.ui.data.editors.BitInlineEditor;
    public IValueEditor createEditor(@NotNull IValueController controller)

 * limitations under the License.
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
}    @Override
 */
 *
public class NumericValueManager extends BaseValueManager {
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.data.managers;
                return new DefaultValueViewDialog(controller);
    }
    @Override
/*
        }

 * DBeaver - Universal Database Manager
                }
import org.jkiss.dbeaver.ui.data.dialogs.DefaultValueViewDialog;
 * distributed under the License is distributed on an "AS IS" BASIS,
            case EDITOR:
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    public IValueController.EditType[] getSupportedEditTypes() {
 * Number value handler
/**
import org.jkiss.dbeaver.ui.data.editors.NumberInlineEditor;

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.data.IValueController;
 *
import org.jkiss.dbeaver.model.DBPDataKind;
    }
    @NotNull
import org.jkiss.dbeaver.ui.data.IValueEditor;
import org.jkiss.code.Nullable;
            case PANEL:
    {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
        throws DBException
                    return new NumberInlineEditor(controller);

                if (controller.getValueType().getDataKind() == DBPDataKind.BOOLEAN) {
            case INLINE:
                    return new BitInlineEditor(controller);
            default:
 */
