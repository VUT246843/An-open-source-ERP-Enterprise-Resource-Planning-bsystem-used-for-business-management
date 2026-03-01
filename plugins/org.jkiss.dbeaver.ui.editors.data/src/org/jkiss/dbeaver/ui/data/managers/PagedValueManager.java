 *
import org.jkiss.dbeaver.ui.data.dialogs.DefaultValueViewDialog;
 * See the License for the specific language governing permissions and
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
public class PagedValueManager extends BaseValueManager {
import org.jkiss.code.NotNull;
 */
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
                return new DefaultValueViewDialog(controller);
    }
    }
import org.jkiss.code.Nullable;
    public IValueEditor createEditor(@NotNull IValueController controller)

 * Unless required by applicable law or agreed to in writing, software
    @Override
                return null;
            case EDITOR:
            case PANEL:
 * DBeaver - Universal Database Manager
 * Paged value manager
/*
        }
import org.jkiss.dbeaver.ui.data.IValueEditor;

import org.jkiss.dbeaver.ui.data.IValueController;
import org.jkiss.dbeaver.ui.data.editors.PagedPanelEditor;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        switch (controller.getEditType()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        throws DBException
            case INLINE:
 *     http://www.apache.org/licenses/LICENSE-2.0
    public IValueController.EditType[] getSupportedEditTypes() {
 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
            default:
}
import org.jkiss.dbeaver.DBException;
    @Nullable
/**

        return new IValueController.EditType[] {IValueController.EditType.INLINE, IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
 *
                return new PagedPanelEditor(controller);
package org.jkiss.dbeaver.ui.data.managers;
 *
    @NotNull
 */
    @Override
