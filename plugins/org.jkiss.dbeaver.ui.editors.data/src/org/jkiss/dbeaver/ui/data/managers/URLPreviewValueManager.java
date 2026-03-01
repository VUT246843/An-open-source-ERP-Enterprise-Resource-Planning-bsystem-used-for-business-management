 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
/*
    public IValueEditor createEditor(@NotNull IValueController controller) throws DBException {
        if (controller.getEditType() == IValueController.EditType.PANEL) {
        return super.createEditor(controller);
 */
        }
 *
 * you may not use this file except in compliance with the License.
            return new URLPreviewEditor(controller);
public class URLPreviewValueManager extends StringValueManager {
 * limitations under the License.
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
package org.jkiss.dbeaver.ui.data.managers;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 *
/**
import org.jkiss.dbeaver.ui.data.IValueEditor;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.data.IValueController;
 * URL preview value manager
    }
}

 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.ui.data.editors.URLPreviewEditor;
