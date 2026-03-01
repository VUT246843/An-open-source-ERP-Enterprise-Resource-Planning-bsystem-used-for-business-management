    public Integer getPort() {
        return port;
    @CommandLine.Option(names = {"--url"}, arity = "1", description = "Database url(e.g. JDBC url)")
    )
    public String getAuthModel() {
        return authModel;
 * Unless required by applicable law or agreed to in writing, software
    private String dataSourceName;

    private String dbName;
    @CommandLine.Option(names = {"--database"}, arity = "1", description = "Database name")
 *
    public String getDatasourceName() {

    public String getDbName() {

    @Nullable
        return url;
    }
    @Nullable

        return host;
 * limitations under the License.
    }
        names = {"--save-password"},
    @Nullable


    }
    @CommandLine.Option(names = {"--auth-model"}, arity = "1", description = "Database auth model")

public class DataSourceOptions {
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
    public String getServer() {
}
    @Nullable
    @CommandLine.Option(names = {"--host"}, arity = "1", description = "Database host")
    private boolean savePassword;
 * See the License for the specific language governing permissions and
    @CommandLine.Option(names = {"--name"}, arity = "1", description = "Connection name")
    @CommandLine.Option(names = {"--folder"}, arity = "1", description = "Connection folder")
    private String host;
    @Nullable
    @Nullable
 * Copyright (C) 2010-2026 DBeaver Corp and others
        arity = "1",
    public String getHost() {
import picocli.CommandLine;
    public boolean isSavePassword() {




 * distributed under the License is distributed on an "AS IS" BASIS,


    @Nullable
package org.jkiss.dbeaver.model.cli.model.option;
    @Nullable
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    @CommandLine.Option(names = {"--port"}, arity = "1", description = "Database port")

    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
    private String server;
    public String getUrl() {
    @Nullable
        defaultValue = "true",
    private String folder;
 *
    }
    @CommandLine.Option(names = {"--server"}, arity = "1", description = "Database server")
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    private String authModel;
    @Nullable
    @Nullable
    @CommandLine.Option(
        return dbName;
        return folder;
    private String url;
import org.jkiss.code.Nullable;
    private Integer port;
    }
        return savePassword;
    }
 *

        description = "Save password"
 * DBeaver - Universal Database Manager
    @Nullable
    }

 */
    public String getFolder() {
    @Nullable
        return dataSourceName;
    }

        return server;
    @Nullable
    @Nullable
