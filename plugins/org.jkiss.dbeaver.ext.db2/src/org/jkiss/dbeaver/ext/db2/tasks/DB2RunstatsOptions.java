    @NotNull
        this.desc = desc;

 */
                    return option;
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
    @NotNull
    public static DB2RunstatsOptions getOption(String description){
    public String getDdlString() {
        this.ddlString = ddl;
 * limitations under the License.
 *
 * DBeaver - Universal Database Manager
}
import org.jkiss.code.NotNull;
 *
    indexesNo(DB2Messages.dialog_table_tools_runstats_indexes_no, "");  //$NON-NLS-1$
    public String getDesc() {


        if (description != null) {

 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.db2.tasks;
    colsNo(DB2Messages.dialog_table_tools_runstats_cols_no, ""), //$NON-NLS-1$
                }
 *
import org.jkiss.dbeaver.ext.db2.DB2Messages;

    indexesDetailed(DB2Messages.dialog_table_tools_runstats_indexes_detailed, "AND SAMPLED DETAILED INDEXES ALL"), //$NON-NLS-1$
    DB2RunstatsOptions(String desc, String ddl) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return desc;
    private final String desc, ddlString;
            }
 * You may obtain a copy of the License at
    }
public enum DB2RunstatsOptions {
/*
    }
    indexesAll(DB2Messages.dialog_table_tools_runstats_indexes_all, "AND INDEXES ALL"), //$NON-NLS-1$
    }
    }
 * you may not use this file except in compliance with the License.
    colsAllAndDistribution(DB2Messages.dialog_table_tools_runstats_cols_all_and_distribution,"ON ALL COLUMNS WITH DISTRIBUTION ON ALL COLUMNS"), //$NON-NLS-1$

 * Copyright (C) 2010-2024 DBeaver Corp and others

        return null;
    colsAll(DB2Messages.dialog_table_tools_runstats_cols_all, "ON ALL COLUMNS"), //$NON-NLS-1$
            for (DB2RunstatsOptions option : DB2RunstatsOptions.values()) {
 * Unless required by applicable law or agreed to in writing, software

        }
 *     http://www.apache.org/licenses/LICENSE-2.0

        return ddlString;
                if (option.desc.equals(description)){
