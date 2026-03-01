    @CommandLine.Option(names = {CLIConstants.COMMAND_REUSE_WORKSPACE}, hidden = true)
 */
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others

 */
 * DBeaver - Universal Database Manager
}
 * some properties were hidden and exists to avoid unmatched options error
    @CommandLine.Option(names = {"-nl"}, hidden = true, arity = "1", description = "Default locale")
    // Eclipse options do nothing in our code
import org.jkiss.dbeaver.model.cli.CLIConstants;
 *
/*
    private String nl;
 * See the License for the specific language governing permissions and
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * limitations under the License.
public class HiddenOptionsForSubcommands extends HiddenOptions {
    private boolean reuseWorkspace;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Eclipse options, we do not process them,
 *
 * Unless required by applicable law or agreed to in writing, software
import picocli.CommandLine;
package org.jkiss.dbeaver.model.cli.model.option;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private String data;
    @CommandLine.Option(names = {"-data"}, hidden = true, arity = "1", description = "Workspace location")
