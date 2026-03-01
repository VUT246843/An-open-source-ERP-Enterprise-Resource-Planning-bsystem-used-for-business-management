        String toolUserPassword = settings.getToolUserPassword();
                return new SimpleDateFormat("MM").format(new Date());
    }
        VARIABLE_MINUTE,
    public static final String VARIABLE_DATE = "date";
        VARIABLE_HOUR,
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            !CommonUtils.isEmpty(userPassword) && string.endsWith(userPassword);
    public static final String VARIABLE_YEAR = "year";
        } else {
        DBPConnectionConfiguration connectionInfo = dataSourceContainer.getActualConnectionConfiguration();
        VARIABLE_HOUR,

package org.jkiss.dbeaver.tasks.nativetool;
    public static void addHostAndPortParamsToCmd(@NotNull DBPDataSourceContainer dataSourceContainer, @NotNull List<String> cmd) {
     * Appends {@code --host} and {@code --port} parameters from connection settings to the list of command parameters
                    port = String.valueOf(uri.getPort());
        VARIABLE_CONN_TYPE
        VARIABLE_YEAR,
                return new SimpleDateFormat("HH").format(new Date());
        String hostname = "";
            }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            String sampleUrl = dataSourceContainer.getDriver().getSampleURL();
                    URI uri = URI.create(url);
import java.util.Date;
            default:
 *

    public static final String VARIABLE_TIMESTAMP = "timestamp";
            case NativeToolUtils.VARIABLE_DAY:
        VARIABLE_YEAR,
    };
            if (sampleUrl != null) {
 * you may not use this file except in compliance with the License.
 *
 * You may obtain a copy of the License at
                    log.error("Can't parse connection URL", e);
 *
                }
}
public abstract class NativeToolUtils {
        VARIABLE_TABLE,
            port = connectionInfo.getHostPort();
    }
                }
        String userPassword = settings.getDataSourceContainer().getActualConnectionConfiguration().getUserPassword();
        switch (name) {

        if (connectionInfo.getConfigurationType().equals(DBPDriverConfigurationType.MANUAL)) {
            case NativeToolUtils.VARIABLE_YEAR:

                return new SimpleDateFormat("dd").format(new Date());
import java.net.URI;
            hostname = connectionInfo.getHostName();
 * Copyright (C) 2010-2025 DBeaver Corp and others
        VARIABLE_MONTH,
    public static final String VARIABLE_TABLE = "table";
        VARIABLE_DATABASE,
import org.jkiss.dbeaver.model.DatabaseURL;
 * distributed under the License is distributed on an "AS IS" BASIS,
            } else {
    public static final String VARIABLE_HOST = DBPConnectionConfiguration.VARIABLE_HOST;
    public static final String VARIABLE_MONTH = "month";
    public static boolean isSecureString(AbstractNativeToolSettings settings, String string) {
                    hostname = config.getHostName();
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.Log;
        VARIABLE_SCHEMA,
        VARIABLE_TIMESTAMP,
        String port = "";

 * limitations under the License.
        VARIABLE_DAY,
                return new SimpleDateFormat("yyyy").format(new Date());
                return new SimpleDateFormat("mm").format(new Date());
            cmd.add("--port=" + port);
        }
        VARIABLE_HOST,
    /**
            case NativeToolUtils.VARIABLE_MINUTE:
    @NotNull
    public static final String VARIABLE_HOUR = "hour";
import org.jkiss.utils.CommonUtils;
        VARIABLE_DATE,
    public static final String VARIABLE_SCHEMA = "schema";
 */
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.RuntimeUtils;
        VARIABLE_MINUTE,
    
    public static final String VARIABLE_CONN_TYPE = DBPConnectionConfiguration.VARIABLE_CONN_TYPE;
    
    public static final String VARIABLE_MINUTE = "minute";
     */
        VARIABLE_CONN_TYPE
        }

                    hostname = uri.getHost();
            case NativeToolUtils.VARIABLE_DATE:
import org.jkiss.dbeaver.model.connection.DBPDriverConfigurationType;

    }
/*
            String url = connectionInfo.getUrl();
        cmd.add("--host=" + hostname);
 * Licensed under the Apache License, Version 2.0 (the "License");
        VARIABLE_DATABASE,
            case NativeToolUtils.VARIABLE_HOUR:
    public static final String[] LIMITED_VARIABLES = {
                    port = config.getHostPort();
    public static final String[] ALL_VARIABLES = {
        }
    private static final Log log = Log.getLog(NativeToolUtils.class);
                DBPConnectionConfiguration config = DatabaseURL.extractConfigurationFromUrl(sampleUrl, url);
 * DBeaver - Universal Database Manager
        VARIABLE_DATE,
    public static final String VARIABLE_DATABASE = DBPConnectionConfiguration.VARIABLE_DATABASE;
        return !CommonUtils.isEmpty(toolUserPassword) && string.endsWith(toolUserPassword) ||
import java.util.List;
        if (!CommonUtils.isEmpty(port)) {
        VARIABLE_TIMESTAMP,
            case NativeToolUtils.VARIABLE_MONTH:
    public static String replaceVariables(@NotNull String name) {
                try {
        VARIABLE_MONTH,
import java.text.SimpleDateFormat;
    };
                } catch (Exception e) {
                return RuntimeUtils.getCurrentDate();
        VARIABLE_DAY,
                return System.getProperty(name);
import org.jkiss.code.NotNull;
                if (config != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public static final String VARIABLE_DAY = "day";
        VARIABLE_HOST,
 * See the License for the specific language governing permissions and
