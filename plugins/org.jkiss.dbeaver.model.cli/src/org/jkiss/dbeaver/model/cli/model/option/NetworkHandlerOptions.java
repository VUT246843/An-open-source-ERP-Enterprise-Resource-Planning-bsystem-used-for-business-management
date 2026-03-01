    }
 */

 *
package org.jkiss.dbeaver.model.cli.model.option;
        return handlerParams;
import picocli.CommandLine;
        defaultValue = "true"
        description = "Save network handler secure parameters (like passwords). Default true.",
    private List<String> handlerParams;
/*
 * you may not use this file except in compliance with the License.
        names = {"-net-save-pwd", "--network-handler-save-password"},
 * See the License for the specific language governing permissions and
    )
        arity = "1",
 * You may obtain a copy of the License at
    @CommandLine.Option(
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
        names = {"-net", "--network-handler-param"},
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * limitations under the License.
}
    private boolean savePassword;
    public List<String> getHandlerParams() {
    @CommandLine.Option(
 * Copyright (C) 2010-2026 DBeaver Corp and others


import java.util.List;
    public boolean isSavePassword() {
 *     http://www.apache.org/licenses/LICENSE-2.0

public class NetworkHandlerOptions {
 * DBeaver - Universal Database Manager
 *
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    
        arity = "1",
    @Nullable
        description = "Network handler parameter in the form 'name=value'. May be specified multiple times.")
    @Nullable

    }
        return savePassword;

