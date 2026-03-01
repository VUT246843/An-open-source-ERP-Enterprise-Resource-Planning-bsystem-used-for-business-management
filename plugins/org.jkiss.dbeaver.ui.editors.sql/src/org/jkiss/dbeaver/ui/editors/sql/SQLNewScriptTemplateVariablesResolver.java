import org.jkiss.code.NotNull;

        DBPConnectionConfiguration.CONNECT_VARIABLES,
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final String VAR_USER = "user";

        super(dataSourceContainer, configuration);
import java.util.Date;
    }

    public static final String VAR_DATE = "date";
 * Licensed under the Apache License, Version 2.0 (the "License");
        switch (name) {
    public static final String VAR_TIME = "time";
    @Nullable
            {VAR_DATE, "current date"},
}
        }
 * See the License for the specific language governing permissions and
            case VAR_USER:

                return super.get(name);
    public static final String[][] ALL_VARIABLES_INFO = ArrayUtils.concatArrays(
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public String get(@NotNull String name) {
        new String[][]{
public class SQLNewScriptTemplateVariablesResolver extends DataSourceVariableResolver {
    );
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.utils.ArrayUtils;
 *
                return System.getProperty(StandardConstants.ENV_USER_NAME);
    @Override
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.text.DateFormat;
import org.jkiss.code.Nullable;
                return DateFormat.getTimeInstance().format(new Date());
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 */
    }
    public SQLNewScriptTemplateVariablesResolver(DBPDataSourceContainer dataSourceContainer, DBPConnectionConfiguration configuration) {
            default:
            case VAR_TIME:
 *
        return false;
import org.jkiss.dbeaver.model.connection.DataSourceVariableResolver;
 * limitations under the License.
    public boolean isSecure() {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
    }

import org.jkiss.utils.StandardConstants;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            {VAR_USER, "OS user name"},
            case VAR_DATE:
                return DateFormat.getDateInstance().format(new Date());

        }
package org.jkiss.dbeaver.ui.editors.sql;
 * you may not use this file except in compliance with the License.
    @Override
            {VAR_TIME, "current time"},
