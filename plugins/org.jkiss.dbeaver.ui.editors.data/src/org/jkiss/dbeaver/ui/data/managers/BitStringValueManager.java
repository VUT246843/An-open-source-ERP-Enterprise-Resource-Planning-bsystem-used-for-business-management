

import org.jkiss.dbeaver.ui.data.editors.BitStringInlineEditor;
            default:
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
        switch (controller.getEditType()) {
 *
    }
}    public IValueController.EditType[] getSupportedEditTypes() {
 * you may not use this file except in compliance with the License.
            case INLINE:
import org.jkiss.dbeaver.DBException;
                return null;
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.data.managers;

    public IValueEditor createEditor(@NotNull IValueController controller)
        throws DBException
                return new DefaultValueViewDialog(controller);
 * limitations under the License.
 * See the License for the specific language governing permissions and
 *
/**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Bit string value handler
 *
 */
                return new BitStringInlineEditor(controller);
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
            case PANEL:
            case EDITOR:
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.data.IValueController;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
        return new IValueController.EditType[] {IValueController.EditType.INLINE, IValueController.EditType.PANEL, IValueController.EditType.EDITOR};

import org.jkiss.dbeaver.ui.data.dialogs.DefaultValueViewDialog;
import org.jkiss.code.NotNull;
    @NotNull
 */

    @Nullable
public class BitStringValueManager extends BaseValueManager {
/*
import org.jkiss.dbeaver.ui.data.IValueEditor;
    @Override
