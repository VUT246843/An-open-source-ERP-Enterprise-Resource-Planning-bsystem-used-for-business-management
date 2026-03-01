    public IValueController.EditType[] getSupportedEditTypes() {
        throws DBException
    @Override
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            case INLINE -> new StringInlineEditor(controller);
 *
 * limitations under the License.
            case EDITOR -> new DefaultValueViewDialog(controller);
import org.jkiss.dbeaver.ui.data.editors.StringInlineEditor;
        return new IValueController.EditType[] {IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
 *
            default -> null;
            case PANEL -> new ComplexValueInlineEditor(controller);

 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.data.IValueEditor;
 * Complex value manager.

 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
import org.jkiss.dbeaver.ui.data.IValueController;
import org.jkiss.dbeaver.ui.data.dialogs.DefaultValueViewDialog;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public IValueEditor createEditor(@NotNull final IValueController controller)

}public abstract class ComplexValueManager extends BaseValueManager {
    @Override
        };
import org.jkiss.code.NotNull;
 */
 */
 *
        return switch (controller.getEditType()) {
package org.jkiss.dbeaver.ui.data.managers;
/*

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.data.editors.ComplexValueInlineEditor;
/**
    @NotNull
import org.jkiss.dbeaver.DBException;
    }
