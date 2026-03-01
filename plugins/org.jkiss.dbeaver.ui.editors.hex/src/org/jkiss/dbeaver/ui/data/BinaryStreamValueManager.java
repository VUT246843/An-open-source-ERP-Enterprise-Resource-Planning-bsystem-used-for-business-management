        return new BinaryEditorPart();
 *
public class BinaryStreamValueManager implements IStreamValueManager {
        return new BinaryPanelEditor();

 * You may obtain a copy of the License at
/**
        if (value != null && MimeTypes.OCTET_STREAM.equals(value.getContentType())) {
    {
    }
import org.jkiss.dbeaver.Log;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
    }
import org.jkiss.code.Nullable;



        throws DBException
    @Override
import org.jkiss.dbeaver.utils.MimeTypes;
    private static final Log log = Log.getLog(BinaryStreamValueManager.class);
            return MatchType.DEFAULT;
    public IEditorPart createEditorPart(@NotNull IValueController controller) {
 * you may not use this file except in compliance with the License.
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * DBeaver - Universal Database Manager
    public MatchType matchesTo(@NotNull DBRProgressMonitor monitor, @NotNull DBSTypedObject attribute, @Nullable DBDContent value) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *

 * See the License for the specific language governing permissions and
        // Applies to any values
package org.jkiss.dbeaver.ui.data;
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.IEditorPart;
        }
 * limitations under the License.
    public IStreamValueEditor createPanelEditor(@NotNull final IValueController controller)
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.data.DBDContent;

 */
        return MatchType.APPLIES;
    @Override
 * Hex editor manager
import org.jkiss.dbeaver.DBException;
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
