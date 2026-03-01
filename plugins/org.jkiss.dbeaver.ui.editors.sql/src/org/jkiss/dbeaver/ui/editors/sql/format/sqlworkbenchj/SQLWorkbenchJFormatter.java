    }
 */
    @Override
        } catch (Exception e) {
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 */

            return source;
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors.sql.format.sqlworkbenchj;
            return SQLWorkbenchJManager.getInstance().format(configuration.getDataSource(), source);
            return source;
 * DBeaver - Universal Database Manager

public class SQLWorkbenchJFormatter implements SQLFormatter {
            SQLWorkbenchJManager.initManager(new File(workbenchPath));

 * External SQL formatter

import org.jkiss.dbeaver.Log;
    public String format(String source, SQLFormatterConfiguration configuration) {
        try {

/*
import org.jkiss.dbeaver.model.sql.format.SQLFormatterConfiguration;
 * distributed under the License is distributed on an "AS IS" BASIS,


 * limitations under the License.

 *
        String workbenchPath = CommonUtils.toString(configuration.getPreferenceStore().getString(SQLWorkbenchJConstants.PROP_WORKBENCH_PATH));
} * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.format.SQLFormatter;
 * You may obtain a copy of the License at
            log.error("SQL Workbench/J path not set");
import java.io.File;
        }
/**
        if (CommonUtils.isEmpty(workbenchPath)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private static final Log log = Log.getLog(SQLWorkbenchJFormatter.class);

        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.utils.CommonUtils;
 *
            DBWorkbench.getPlatformUI().showError("Workbench format error", "Error formatting with SQL Workbench/J", e);
