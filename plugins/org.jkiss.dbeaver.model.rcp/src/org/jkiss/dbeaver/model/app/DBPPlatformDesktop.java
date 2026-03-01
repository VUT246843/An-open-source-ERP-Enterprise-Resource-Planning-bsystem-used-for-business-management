    static DBPPlatformDesktop getInstance() {
     * like dialogs during plugins activation and may lead to UI deadlocks.
 * limitations under the License.
    }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * Copyright (C) 2010-2025 DBeaver Corp and others
     */
    @NotNull
    DBPExternalFileManager getExternalFileManager();

    /**
 * Unless required by applicable law or agreed to in writing, software
/**
 * DBPPlatform
 */

     * Workbench is started when main workbench window is fully initialized.

/*


 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPExternalFileManager;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.app;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface DBPPlatformDesktop extends DBPPlatform, DBPPlatformEventManager, DBPPlatformLanguageManager {
 *
    boolean isWorkbenchStarted();
        return DBWorkbench.getPlatform(DBPPlatformDesktop.class);
 */
    DBPWorkspaceDesktop getWorkspace();
     * This check was added because Eclipse plugins may trigger some UI actions
    @NotNull
 * you may not use this file except in compliance with the License.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

}
 *     http://www.apache.org/licenses/LICENSE-2.0

 * DBeaver - Universal Database Manager
