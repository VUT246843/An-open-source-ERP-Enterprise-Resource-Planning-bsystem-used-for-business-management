    public IEditorPart createEditorPart(@NotNull IValueController controller) {
import org.jkiss.dbeaver.ui.data.IStreamValueEditor;
    @Override
    }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.utils.ContentUtils;
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
        return new TextEditorPart();
 * Text editor manager
    private static final Log log = Log.getLog(TextStreamValueManager.class);
        // Applies to text values
 * Copyright (C) 2010-2024 DBeaver Corp and others

import org.jkiss.dbeaver.Log;
import org.eclipse.ui.IEditorPart;
import org.jkiss.code.NotNull;
        return new TextPanelEditor();
import org.jkiss.dbeaver.ui.data.IValueController;
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.data.DBDContent;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.

}
    }
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        throws DBException
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    @Override

/**
package org.jkiss.dbeaver.ui.data.managers.stream;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
    {
import org.jkiss.code.Nullable;

public class TextStreamValueManager implements IStreamValueManager {
import org.jkiss.dbeaver.ui.data.IStreamValueManager;

 * limitations under the License.
 */
    public MatchType matchesTo(@NotNull DBRProgressMonitor monitor, @NotNull DBSTypedObject attribute, @Nullable DBDContent value) {
        return ContentUtils.isTextContent(value) ? MatchType.DEFAULT : MatchType.APPLIES;
 * You may obtain a copy of the License at
    public IStreamValueEditor createPanelEditor(@NotNull final IValueController controller)
    @Override

