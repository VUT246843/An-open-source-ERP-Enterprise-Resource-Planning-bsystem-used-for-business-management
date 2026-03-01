        // Modify JNI binaries path
import org.jkiss.dbeaver.runtime.IPluginService;
 * Unless required by applicable law or agreed to in writing, software
    public void activateService() {

    }

 * distributed under the License is distributed on an "AS IS" BASIS,
}
import org.jkiss.dbeaver.model.DBConstants;
 * See the License for the specific language governing permissions and
    @Override
    }

import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class WinStoreService implements IPluginService {
 * You may obtain a copy of the License at
 *
package org.jkiss.dbeaver.winstore;
 *
 * DBeaver - Universal Database Manager
        System.setProperty(DBConstants.IS_WINDOWS_STORE_APP, "true");
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    public void deactivateService() {

 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    private static final Log log = Log.getLog(WinStoreService.class);
/*
 * you may not use this file except in compliance with the License.
    @Override


