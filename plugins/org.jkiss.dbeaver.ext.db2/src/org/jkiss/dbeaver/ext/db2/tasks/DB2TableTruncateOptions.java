    @NotNull


    private final String desc, ddlString;
 */
public enum DB2TableTruncateOptions {
                if (option.desc.equals(description)){
package org.jkiss.dbeaver.ext.db2.tasks;
 *
        return desc;
 *
 * Unless required by applicable law or agreed to in writing, software
        return ddlString;
    ignoreDeleteTriggers(DB2Messages.dialog_table_tools_truncate_ignore_delete_triggers, "IGNORE DELETE TRIGGERS"), //$NON-NLS-1$
/*
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.desc = desc;
        }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            for (DB2TableTruncateOptions option : DB2TableTruncateOptions.values()) {
 * DBeaver - Universal Database Manager
    public String getDdlString() {
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
        if (description != null) {
    DB2TableTruncateOptions(String desc, String ddl) {
}


    @NotNull
    public String getDesc() {
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
    restrictWhenDeleteTriggers(DB2Messages.dialog_table_tools_truncate_restrict_when_delete_triggers, "RESTRICT WHEN DELETE TRIGGERS"); //$NON-NLS-1$
            }
        this.ddlString = ddl;
                }
                    return option;
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ext.db2.DB2Messages;

 * See the License for the specific language governing permissions and
    reuseStorage(DB2Messages.dialog_table_tools_truncate_reuse_storage, "REUSE STORAGE"), //$NON-NLS-1$
    public static DB2TableTruncateOptions getOption(String description){

    dropStorage(DB2Messages.dialog_table_tools_truncate_drop_storage,"DROP STORAGE"), //$NON-NLS-1$
 * limitations under the License.
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    }

