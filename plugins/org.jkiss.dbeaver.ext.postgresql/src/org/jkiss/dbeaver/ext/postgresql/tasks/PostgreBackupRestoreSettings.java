        public String getTitle() {

}


        super.loadSettings(runnableContext, store);
        super(project);
package org.jkiss.dbeaver.ext.postgresql.tasks;
 * You may obtain a copy of the License at
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

        ExportFormat(String id, String title, @NotNull String ext) {
        }

        @NotNull
        DIRECTORY("d", "Directory", ""),
        this.format = CommonUtils.valueOf(ExportFormat.class, store.getString("pg.format"), ExportFormat.CUSTOM);
 *     http://www.apache.org/licenses/LICENSE-2.0
        super.saveSettings(runnableContext, store);
    public PostgreBackupRestoreSettings() {

        TAR("t", "Tar", "tar");
    }
        private final String title;
    }
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.app.DBPProject;
    }
            this.ext = ext;
        }
            return id;
 * See the License for the specific language governing permissions and
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * DBeaver - Universal Database Manager
        PLAIN("p", "Plain", "sql"),
    @Override
        private final String id;
    private ExportFormat format = ExportFormat.CUSTOM;
            return title;
    public void setFormat(ExportFormat format) {
        CUSTOM("c", "Custom", ""),
import org.jkiss.dbeaver.DBException;
            return ext;
import org.jkiss.code.NotNull;
 *
 * limitations under the License.
    public void saveSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) {


        public String getExt() {
 * you may not use this file except in compliance with the License.
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
        public String getId() {
    }
    public enum ExportFormat {
    @Override

            this.title = title;


 */

        @NotNull
    
    public PostgreBackupRestoreSettings(@NotNull DBPProject project) {

        this.format = format;
/*
    public void loadSettings(DBRRunnableContext runnableContext, DBPPreferenceStore store) throws DBException {
import org.jkiss.utils.CommonUtils;
    }

        return format;
import org.jkiss.dbeaver.tasks.nativetool.AbstractImportExportSettings;
        store.setValue("pg.format", format == null ? null : format.name());
public class PostgreBackupRestoreSettings extends AbstractImportExportSettings<DBSObject> {
    public ExportFormat getFormat() {
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
            this.id = id;
    }
import org.jkiss.dbeaver.model.struct.DBSObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        private final String ext;
 *
