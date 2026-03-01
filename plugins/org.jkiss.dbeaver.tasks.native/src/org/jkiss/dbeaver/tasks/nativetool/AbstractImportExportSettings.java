import org.jkiss.dbeaver.model.app.DBPProject;
        super.loadSettings(runnableContext, store);
        this.outputFilePattern = outputFilePattern;
    }
    }

        super.saveSettings(runnableContext, preferenceStore);
                    } else {

    public void loadSettingsFromInput(@NotNull List<BASE_OBJECT> inputObjects, @NotNull Map<String, Object> options) {
        super.loadSettingsFromInput(inputObjects, options);
            this.outputFilePattern = "dump-${database}-${timestamp}.sql";
    private static final Log log = Log.getLog(AbstractImportExportSettings.class);
    }
    }

import org.jkiss.dbeaver.Log;
 * Unless required by applicable law or agreed to in writing, software
    private String outputFolderPattern;
 *
                default:
        return GeneralUtils.replaceVariables(pattern, name -> {
            }
/*
package org.jkiss.dbeaver.tasks.nativetool;
    public String getOutputFilePattern() {
import org.jkiss.dbeaver.model.struct.DBSStructContainer;
                }
        this.outputFolderPattern = outputFolderPattern;
 * Licensed under the Apache License, Version 2.0 (the "License");
            switch (name) {
import org.jkiss.dbeaver.model.struct.rdb.DBSSchema;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            this.outputFolderPattern = RuntimeUtils.getUserHomeDir().getAbsolutePath();
        }
        super(project);
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;

    @Override
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore preferenceStore) {
        if (CommonUtils.isEmpty(this.outputFolderPattern)) {
                    }

    public String getOutputFolderPattern() {
                        return iterator.next().getName();
        super();
                    return container.getName();
import org.jkiss.utils.CommonUtils;
                    return container.getDataSource().getContainer().getConnectionConfiguration().getHostName();
        return outputFolderPattern;
        this.outputFolderPattern = CommonUtils.toString(store.getString("export.outputFolder"));

 *
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        });
import org.jkiss.dbeaver.utils.GeneralUtils;
                    if (iterator != null && iterator.hasNext()) {
                    if (iterator != null && iterator.hasNext()) {
    }

    private String outputFilePattern;
        this.outputFilePattern = store.getString("export.outputFilePattern");
                    return RuntimeUtils.getCurrentDate();
                    }
    public void setOutputFilePattern(String outputFilePattern) {

    @Override
import org.jkiss.code.NotNull;
}
                        return "null";
        }
                }
 * You may obtain a copy of the License at



                    final Iterator<? extends DBSSchema> iterator = schemas == null ? null : schemas.iterator();
import org.jkiss.dbeaver.DBException;

                case NativeToolUtils.VARIABLE_TIMESTAMP:
                case NativeToolUtils.VARIABLE_SCHEMA: {
                    return RuntimeUtils.getCurrentTimeStamp();
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) throws DBException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
import java.util.Collection;
import java.util.Iterator;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    } else {
                case NativeToolUtils.VARIABLE_TABLE: {
                        return container instanceof DBSStructContainer ? container.getName() : "null";

                case NativeToolUtils.VARIABLE_HOST:
import org.jkiss.dbeaver.model.struct.DBSObject;
                    final Iterator<? extends DBSTable> iterator = tables == null ? null : tables.iterator();
    protected String resolveVars(@NotNull DBSObjectContainer container, Collection<? extends DBSSchema> schemas, Collection<? extends DBSTable> tables, String pattern) {
                    return container.getDataSource().getContainer().getConnectionConfiguration().getConnectionType().getId();
    }
    public AbstractImportExportSettings() {
    @Override
                case NativeToolUtils.VARIABLE_CONN_TYPE:
    public AbstractImportExportSettings(@NotNull DBPProject project) {
 * you may not use this file except in compliance with the License.
    public void setOutputFolderPattern(String outputFolderPattern) {
                    return NativeToolUtils.replaceVariables(name);
        this.fillExportObjectsFromInput();

    }
 * See the License for the specific language governing permissions and
    }
                case NativeToolUtils.VARIABLE_DATE:
import java.util.List;
                case NativeToolUtils.VARIABLE_DATABASE:
        return outputFilePattern;
public abstract class AbstractImportExportSettings<BASE_OBJECT extends DBSObject> extends AbstractNativeToolSettings<BASE_OBJECT> {
    }
    public void fillExportObjectsFromInput() {

import org.jkiss.dbeaver.utils.RuntimeUtils;
                        return iterator.next().getName();
    }
import java.util.Map;
 * DBeaver - Universal Database Manager
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    
        if (CommonUtils.isEmpty(this.outputFilePattern)) {

        preferenceStore.setValue("export.outputFilePattern", this.outputFilePattern);

        preferenceStore.setValue("export.outputFolder", this.outputFolderPattern);
 * limitations under the License.
