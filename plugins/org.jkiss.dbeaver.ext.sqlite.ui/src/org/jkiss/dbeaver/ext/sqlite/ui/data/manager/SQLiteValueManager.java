        }
package org.jkiss.dbeaver.ext.sqlite.ui.data.manager;
        return (dataKind == DBPDataKind.BINARY || dataKind == DBPDataKind.CONTENT);
 */
import org.jkiss.code.NotNull;
        } else {
import org.jkiss.dbeaver.model.DBPDataKind;
    @Override

public class SQLiteValueManager extends StringValueManager {
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.exec.DBCException;
    }
        return super.createEditor(controller);
import org.jkiss.dbeaver.ui.data.IValueEditor;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.ui.data.managers.StringValueManager;
 * limitations under the License.
import org.jkiss.code.Nullable;
            super.contributeActions(manager, controller, activeEditor);

        DBPDataKind dataKind = controller.getValueType().getDataKind();
            new ContentValueManager().contributeActions(manager, controller, activeEditor);
 * DBeaver - Universal Database Manager
import org.eclipse.jface.action.IContributionManager;
    private static boolean isBinary(@NotNull IValueController controller) {
 */
/**
 *

import org.jkiss.dbeaver.ui.data.managers.ContentValueManager;

        }

import org.jkiss.dbeaver.ui.data.IValueController;
}
 * SQLiteValueHandler
    public IValueEditor createEditor(@NotNull IValueController controller) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    @Override
 *
 * You may obtain a copy of the License at

 *
    public void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller, @Nullable IValueEditor activeEditor) throws DBCException {
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
        if (isBinary(controller)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return new ContentValueManager().createEditor(controller);
        if (isBinary(controller)) {
 * See the License for the specific language governing permissions and
