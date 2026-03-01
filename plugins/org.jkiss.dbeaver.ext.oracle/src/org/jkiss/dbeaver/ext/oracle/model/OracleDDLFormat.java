
    }
 *
            }
    private OracleDDLFormat(String title, boolean showStorage, boolean showSegments, boolean showTablespace)
    NO_STORAGE("No storage information", false, true, true),
package org.jkiss.dbeaver.ext.oracle.model;
    private final boolean showStorage;
 * See the License for the specific language governing permissions and
    {
        this.showStorage = showStorage;

 * DDL format
    {
 * DBeaver - Universal Database Manager
        return OracleDDLFormat.FULL;
    {

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public enum OracleDDLFormat {

                return OracleDDLFormat.valueOf(ddlFormatString);
        }
        if (!CommonUtils.isEmpty(ddlFormatString)) {
        return showTablespace;
    public boolean isShowTablespace()
/**
 *
    {
        this.showSegments = showSegments;

 * Copyright (C) 2010-2024 DBeaver Corp and others
        return showSegments;
/*
        return title;

 * Unless required by applicable law or agreed to in writing, software
                log.error(e);
        return showStorage;

 * you may not use this file except in compliance with the License.

    }
    }
            } catch (IllegalArgumentException e) {
    FULL("Full DDL", true, true, true),
    private final boolean showSegments;
    }
    public boolean isShowSegments()
 * limitations under the License.
    public static OracleDDLFormat getCurrentFormat(DBPDataSource dataSource) {
        this.showTablespace = showTablespace;
import org.jkiss.utils.CommonUtils;
    private final boolean showTablespace;
    public boolean isShowStorage()
        String ddlFormatString = dataSource.getContainer().getPreferenceStore().getString(OracleConstants.PREF_KEY_DDL_FORMAT);
    private static final Log log = org.jkiss.dbeaver.Log.getLog(OracleDDLFormat.class);

    COMPACT("Compact form", false, false, false);


        this.title = title;
 *     http://www.apache.org/licenses/LICENSE-2.0
    private final String title;
import org.jkiss.dbeaver.Log;
            try {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String getTitle()
    }

 * You may obtain a copy of the License at

}
    {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBPDataSource;
 *
    }
