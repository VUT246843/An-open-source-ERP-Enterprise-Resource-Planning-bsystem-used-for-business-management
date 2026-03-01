 * you may not use this file except in compliance with the License.
    enum MatchType {
/**
import org.jkiss.code.NotNull;
        PRIMARY,        // Should be primary editor for this value
 *
 * See the License for the specific language governing permissions and

 *

        APPLIES,        // Supports value edit


}
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
        DEFAULT,        // Should be default editor for this value
public interface IStreamValueManager {
 */
    MatchType matchesTo(@NotNull DBRProgressMonitor monitor, @NotNull DBSTypedObject attribute, @Nullable DBDContent value);

 * Unless required by applicable law or agreed to in writing, software

package org.jkiss.dbeaver.ui.data;
        throws DBException;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.data.DBDContent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        EXCLUSIVE,      // Should be the only editor for this value
        NONE,           // Doesn't support
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * limitations under the License.
 * Stream value manager
    IEditorPart createEditorPart(@NotNull IValueController controller)
    }
        throws DBException;
import org.eclipse.ui.IEditorPart;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
 */
    IStreamValueEditor createPanelEditor(@NotNull IValueController controller)
/*
