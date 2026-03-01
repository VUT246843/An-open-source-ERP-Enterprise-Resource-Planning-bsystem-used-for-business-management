        }


    public static DB2DDLFormat getCurrentFormat(DB2DataSource dataSource)
 *

    {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    private static final Log log = org.jkiss.dbeaver.Log.getLog(DB2DDLFormat.class);
/**

    // Standard Getters
 * Copyright (C) 2010-2024 DBeaver Corp and others
    // ------------
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
    }
    }
    private final String     title;
 * @author Denis Forveille

 * DBeaver - Universal Database Manager

    // ------------
    // ------------
    // ------------

public enum DB2DDLFormat {
 * 
 * DDL format constants
 *
    }
    NO_FORMAT("Raw Text", false);
import org.jkiss.dbeaver.Log;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2013-2017 Denis Forveille (titou10.titou10@gmail.com)

        return DB2DDLFormat.FORMAT;
    // ------------
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.db2.editors;
 * you may not use this file except in compliance with the License.
    {
        if (!CommonUtils.isEmpty(ddlFormatString)) {
 * 
    private DB2DDLFormat(String title, boolean needFormatting)
    FORMAT("Format DDL", true),
            }
        return needsFormatting;
    public String getTitle()
                log.error(e);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Unless required by applicable law or agreed to in writing, software
            } catch (IllegalArgumentException e) {
    private final boolean    needsFormatting;
import org.jkiss.dbeaver.ext.db2.DB2Constants;
        String ddlFormatString = dataSource.getContainer().getPreferenceStore().getString(DB2Constants.PREF_KEY_DDL_FORMAT);
 * limitations under the License.
/*
    {
    // ------------
                return DB2DDLFormat.valueOf(ddlFormatString);
            try {
import org.jkiss.utils.CommonUtils;
    {
 * You may obtain a copy of the License at


}
        this.needsFormatting = needFormatting;
        return title;
 */
    // Helpers
    public boolean needsFormatting()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.title = title;
    // Constructors

