    public static final String DEBUG_LAUNCH_GROUP_ID = "org.jkiss.dbeaver.debug.launchGroup";
 * See the License for the specific language governing permissions and
        return new Status(IStatus.ERROR, BUNDLE_SYMBOLIC_NAME, message);
            return editorInput.getAdapter(DBSObject.class);
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
            IEditorInput editorInput = editor.getEditorInput();
import org.eclipse.ui.IEditorInput;

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (advisor != null) {
    }

import org.jkiss.dbeaver.model.struct.DBSObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    public static final String BUNDLE_SYMBOLIC_NAME = "org.jkiss.dbeaver.debug.ui"; //$NON-NLS-1$
    }
    public static DBGEditorAdvisor findEditorAdvisor(DBPDataSourceContainer dataSourceContainer) {
        return null;
import org.eclipse.core.runtime.IStatus;
        return null;
public class DebugUI {
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IEditorPart;
import org.jkiss.dbeaver.utils.GeneralUtils;

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
    public static IStatus createError(String message) {
 *
package org.jkiss.dbeaver.debug.ui;
 * Copyright (C) 2010-2024 DBeaver Corp and others

        if (editor != null) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        DBGEditorAdvisor advisor = GeneralUtils.adapt(dataSourceContainer, DBGEditorAdvisor.class);
 * you may not use this file except in compliance with the License.

 *
    public static DBSObject extractDatabaseObject(IEditorPart editor) {


}
 *
        }
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*

 * DBeaver - Universal Database Manager
            return advisor;
 * limitations under the License.
    public static final String DEBUG_OPEN_CONFIGURATION_COMMAND_ID = "org.jkiss.dbeaver.debug.ui.command.debugConfigurationMenu"; //$NON-NLS-1$
