import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
                if (dataKind == DBPDataKind.OBJECT || dataKind == DBPDataKind.STRING) {
    @Override

                return new DefaultValueViewDialog(controller);
import org.jkiss.dbeaver.ui.data.IValueEditor;
import org.jkiss.dbeaver.ui.data.dialogs.DefaultValueViewDialog;
            default:
}
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2024 DBeaver Corp and others

    private static final Log log = Log.getLog(GeometryValueManager.class);
 * you may not use this file except in compliance with the License.
 * Geometry value manager
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
                return null;
 *
        switch (controller.getEditType()) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            case INLINE:
/**
    @NotNull
    }
 */
            case PANEL:

import org.jkiss.dbeaver.ui.data.IValueController;
        }
                    return new StringInlineEditor(controller);
import org.jkiss.dbeaver.ui.data.editors.StringInlineEditor;
    public IValueEditor createEditor(@NotNull final IValueController controller) throws DBException {
import org.jkiss.dbeaver.ui.data.managers.BaseValueManager;
                return null;
        DBPDataKind dataKind = controller.getValueType().getDataKind();
    }
 */
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.gis.panel.GISPanelEditor;
 *
 * limitations under the License.
 *
 * DBeaver - Universal Database Manager
    public IValueController.EditType[] getSupportedEditTypes() {
package org.jkiss.dbeaver.ui.gis;
        return new IValueController.EditType[] {IValueController.EditType.INLINE, IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
public class GeometryValueManager extends BaseValueManager {
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
            case EDITOR:
import org.jkiss.dbeaver.model.DBPDataKind;
import org.jkiss.dbeaver.Log;
                return new GISPanelEditor(controller);
 *     http://www.apache.org/licenses/LICENSE-2.0


