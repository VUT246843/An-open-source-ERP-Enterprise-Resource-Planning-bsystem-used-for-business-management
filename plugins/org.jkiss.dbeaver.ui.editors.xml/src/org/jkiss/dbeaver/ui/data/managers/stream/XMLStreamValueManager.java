 */
import org.jkiss.code.NotNull;
/**
    public IEditorPart createEditorPart(@NotNull IValueController controller) {

import org.jkiss.code.Nullable;
package org.jkiss.dbeaver.ui.data.managers.stream;
    {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        // Applies to text values
 * See the License for the specific language governing permissions and
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
import org.eclipse.ui.IEditorPart;
    @Override
        return ContentUtils.isXML(value) ? MatchType.PRIMARY : MatchType.APPLIES;
}
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.utils.ContentUtils;
 * You may obtain a copy of the License at
/*
 *

    public MatchType matchesTo(@NotNull DBRProgressMonitor monitor, @NotNull DBSTypedObject attribute, @Nullable DBDContent value) {
        return new XMLEditorPart();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
import org.jkiss.dbeaver.ui.data.IStreamValueManager;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;

import org.jkiss.dbeaver.model.data.DBDContent;
import org.jkiss.dbeaver.ui.data.IValueController;
import org.jkiss.dbeaver.DBException;
 *
    }
        throws DBException
        return new XMLPanelEditor();
    public IStreamValueEditor createPanelEditor(@NotNull final IValueController controller)
 *
    @Override
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
    @Override
public class XMLStreamValueManager implements IStreamValueManager {

 * XML editor manager
import org.jkiss.dbeaver.ui.data.IStreamValueEditor;
    }


