 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.Log;
    @Override
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    }

    }
        super.loadSettings(runnableContext, store);

 *
 * DBeaver - Universal Database Manager
 *
public class OracleScriptExecuteSettings extends AbstractScriptExecuteSettings<DBSObject> {
}
/*
import org.jkiss.code.NotNull;
    }
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
 *
    }

import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
package org.jkiss.dbeaver.ext.oracle.tasks;
    public DBPNativeClientLocation findNativeClientHome(String clientHomeId) {
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.DBException;
 */
import org.jkiss.dbeaver.tasks.nativetool.AbstractScriptExecuteSettings;
        super.saveSettings(runnableContext, store);
import org.jkiss.dbeaver.ext.oracle.oci.OCIUtils;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
    @Override



    private static final Log log = Log.getLog(OracleScriptExecuteSettings.class);
    public OracleScriptExecuteSettings(@NotNull DBPProject project) {
    public OracleScriptExecuteSettings() {
        super(project);
 * you may not use this file except in compliance with the License.
        return OCIUtils.getOraHome(clientHomeId);
