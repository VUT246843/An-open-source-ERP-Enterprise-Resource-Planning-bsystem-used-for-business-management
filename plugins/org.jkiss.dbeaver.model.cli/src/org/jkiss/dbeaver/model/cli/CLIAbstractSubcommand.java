    protected CLIContext context() {
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at

    /**
    @CommandLine.Mixin
    private HiddenOptionsForSubcommands eclipseHiddenOptions;

 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 *
 * Copyright (C) 2010-2026 DBeaver Corp and others
import picocli.CommandLine;
 *
 * limitations under the License.
     * Root command uses as context
        return parent.context();
 *
 * you may not use this file except in compliance with the License.
public abstract class CLIAbstractSubcommand extends CLIAbstractCommand {
 * DBeaver - Universal Database Manager
    private CLIAbstractCommand parent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.cli;
import org.jkiss.dbeaver.model.cli.model.option.HiddenOptionsForSubcommands;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    @CommandLine.ParentCommand
     */
/*
