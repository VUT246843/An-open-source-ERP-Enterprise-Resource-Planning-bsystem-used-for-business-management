 * JSON editor manager

        throws DBException
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return new JSONEditorPart();
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.data.IStreamValueEditor;
import org.jkiss.code.Nullable;
 */
        return new JSONPanelEditor();
 *
public class JSONStreamValueManager implements IStreamValueManager {
 * DBeaver - Universal Database Manager
    }

 * limitations under the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }


import org.jkiss.dbeaver.ui.data.IValueController;
    public IEditorPart createEditorPart(@NotNull IValueController controller) {
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
/*
}
 */
import org.eclipse.ui.IEditorPart;
 *
    public MatchType matchesTo(@NotNull DBRProgressMonitor monitor, @NotNull DBSTypedObject attribute, @Nullable DBDContent value) {
import org.jkiss.dbeaver.model.data.DBDContent;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
    {
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * See the License for the specific language governing permissions and
    }
package org.jkiss.dbeaver.ui.data.managers.stream;
    public IStreamValueEditor createPanelEditor(@NotNull final IValueController controller)
import org.jkiss.dbeaver.ui.data.IStreamValueManager;
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
/**
        return ContentUtils.isJSON(value) ? MatchType.PRIMARY : MatchType.APPLIES;
        // Applies to text values
import org.jkiss.dbeaver.utils.ContentUtils;
