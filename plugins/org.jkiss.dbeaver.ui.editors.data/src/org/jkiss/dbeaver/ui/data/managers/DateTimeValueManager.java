 * See the License for the specific language governing permissions and
            default:
 * distributed under the License is distributed on an "AS IS" BASIS,
            case PANEL:
    public IValueController.EditType[] getSupportedEditTypes() {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
        return new IValueController.EditType[] {IValueController.EditType.INLINE, IValueController.EditType.PANEL, IValueController.EditType.EDITOR};
public class DateTimeValueManager extends BaseValueManager {
import org.jkiss.code.NotNull;
    @Override
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;
 * DBeaver - Universal Database Manager
    {

} *
import org.jkiss.dbeaver.model.exec.DBCException;
            case INLINE:
import org.jkiss.code.Nullable;
 *
/*
        throws DBCException
        super.contributeActions(manager, controller, activeEditor);
 * Date/time value handler
        throws DBException
    protected static final Log log = Log.getLog(DateTimeValueManager.class);
 * You may obtain a copy of the License at
                return new DateTimeStandaloneEditor(controller);

 */
package org.jkiss.dbeaver.ui.data.managers;
                return null;

        switch (controller.getEditType()) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    {
    }
import org.jkiss.dbeaver.ui.data.editors.DateTimeInlineEditor;
 * Unless required by applicable law or agreed to in writing, software
    }
            case EDITOR:

 *
    @NotNull
 * limitations under the License.
/**
                return new DateTimeInlineEditor(controller);
    @Override
 */

import org.jkiss.dbeaver.DBException;
    public void contributeActions(@NotNull IContributionManager manager, @NotNull final IValueController controller, @Nullable IValueEditor activeEditor)
    public IValueEditor createEditor(@NotNull IValueController controller)
import org.jkiss.dbeaver.ui.data.IValueEditor;

import org.jkiss.dbeaver.ui.data.editors.DateTimeStandaloneEditor;
        }
import org.eclipse.jface.action.IContributionManager;
import org.jkiss.dbeaver.ui.data.IValueController;

