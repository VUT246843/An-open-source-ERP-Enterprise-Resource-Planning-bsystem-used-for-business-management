 * Unless required by applicable law or agreed to in writing, software
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        super.saveSettings(runnableContext, preferenceStore);
    }
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore preferenceStore) {
    }
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Override
        return inputFile;
    }
    public AbstractScriptExecuteSettings(@NotNull DBPProject project) {
    }
import org.jkiss.utils.CommonUtils;
    private String inputFile;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        super.loadSettings(runnableContext, preferenceStore);
package org.jkiss.dbeaver.tasks.nativetool;
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
 */

            inputFile = preferenceStore.getString("inputFile");
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore preferenceStore) throws DBException {



 * limitations under the License.
/*
 * you may not use this file except in compliance with the License.

 *
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        preferenceStore.setValue("inputFile", inputFile);
        }
    }
public class AbstractScriptExecuteSettings<BASE_OBJECT extends DBSObject> extends AbstractNativeToolSettings<BASE_OBJECT> {
        if (CommonUtils.isEmpty(inputFile)) {

 * DBeaver - Universal Database Manager
        super(project);
import org.jkiss.dbeaver.model.app.DBPProject;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.inputFile = inputFile;
    }
    public String getInputFile() {
    public void setInputFile(String inputFile) {


 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * You may obtain a copy of the License at

    public AbstractScriptExecuteSettings() {
import org.jkiss.dbeaver.DBException;
