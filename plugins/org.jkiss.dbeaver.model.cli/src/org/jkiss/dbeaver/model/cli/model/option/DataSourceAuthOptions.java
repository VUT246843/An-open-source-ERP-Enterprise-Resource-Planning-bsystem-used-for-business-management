    )
public class DataSourceAuthOptions {
 *
    public String getDbUser() {

    @CommandLine.Option(
    @CommandLine.Option(names = {"-p", "--password"}, arity = "1", description = "Database password for username/password authentication")
        exclusive = false
    private List<String> authParams;
        arity = "1",
        return networkHandlerOptions;

        return dbPassword;

}
        return connectionParams;
        return authParams;

    private List<String> connectionParams;
 */
    @CommandLine.Option(
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
    public List<String> getProviderParams() {
        description = "Database connection parameter in the form 'name=value'. May be specified multiple times"
    )
    @Nullable
    @Nullable


        arity = "1",
    private String dbUser;
 *
    }

    public List<String> getAuthParams() {

        return dbUser;
        arity = "1",
        return providerParams;
    @CommandLine.Option(names = {"-u", "--user"}, arity = "1", description = "Database user name for username/password authentication")

    @Nullable
    }
    private List<String> providerParams;
        names = {"-prop", "--property"},
    @Nullable
        names = {"-ext", "--extended-property"},
 * DBeaver - Universal Database Manager

import org.jkiss.code.Nullable;
    }
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * limitations under the License.
    private NetworkHandlerOptions networkHandlerOptions;
 * Unless required by applicable law or agreed to in writing, software
import picocli.CommandLine;
package org.jkiss.dbeaver.model.cli.model.option;
    private String dbPassword;
    @Nullable
        names = {"-auth", "--auth-property"},
    @CommandLine.Option(
    )
 * See the License for the specific language governing permissions and
        description = "Authentication property in the form 'name=value'. May be specified multiple times. "
    }
    @Nullable
    @Nullable
 * You may obtain a copy of the License at
    @Nullable
            + "See '" + ListAuthenticationModelParameterHandler.COMMAND_NAME + "' command for details"
        description = "Database provider parameter in the form 'name=value'. May be specified multiple times"
    @Nullable

    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

    @CommandLine.ArgGroup(
    )

 * Copyright (C) 2010-2026 DBeaver Corp and others
    public NetworkHandlerOptions getNetworkHandlerOptions() {
    public List<String> getConnectionParams() {
    @Nullable
/*
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
import org.jkiss.dbeaver.model.cli.command.ListAuthenticationModelParameterHandler;
    public String getDbPassword() {
