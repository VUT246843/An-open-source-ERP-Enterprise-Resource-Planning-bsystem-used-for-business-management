 *
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        return super.createEditor(controller);
 * Object value manager.

        }
    public IValueEditor createEditor(@NotNull final IValueController controller)
import org.jkiss.dbeaver.ui.data.dialogs.CursorViewDialog;
 * limitations under the License.
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    return new CursorPanelEditor(controller);
    {
            switch (controller.getEditType()) {
import org.jkiss.dbeaver.DBException;

}import org.jkiss.dbeaver.model.data.DBDCursor;
 *
 *
        final Object value = controller.getValue();
package org.jkiss.dbeaver.ui.data.managers;
                case PANEL:
 */
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.ui.data.IValueEditor;

 * Unless required by applicable law or agreed to in writing, software
 */
        if (value instanceof DBDCursor) {
/*

 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws DBException
                    return new CursorViewDialog(controller);
/**
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.data.editors.CursorPanelEditor;
    }
public class ObjectValueManager extends StringValueManager {
                case EDITOR:
import org.jkiss.dbeaver.ui.data.IValueController;
            }
