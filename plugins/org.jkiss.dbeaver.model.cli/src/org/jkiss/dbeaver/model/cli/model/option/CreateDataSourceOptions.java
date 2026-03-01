 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return driver;
    private DataSourceOptions dataSourceOptions;
import picocli.CommandLine;
    }
 */
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
}
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.cli.model.option;
 * you may not use this file except in compliance with the License.
/*

    @CommandLine.Option(names = {"--driver"}, required = true, arity = "1", description = "Database driver")
 * limitations under the License.

    @CommandLine.ArgGroup(exclusive = false)
    @Nullable
 * Copyright (C) 2010-2026 DBeaver Corp and others
    public DataSourceOptions getDataSourceOptions() {

        return dataSourceOptions;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
    private String driver;
    public String getDriver() {
    }
    @NotNull
import org.jkiss.code.NotNull;
public class CreateDataSourceOptions {

 * See the License for the specific language governing permissions and
    //nullable because arg group
    @Nullable

 *
