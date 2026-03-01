
        return new DBeaverTopLevelCommand(applicationInstanceController, context, runMeta);
            INSTANCE = new DBeaverCommandLine();
        @NotNull CommandLine.ParseResult cliCommand,
import picocli.CommandLine;
    ) {
        }
        CommandLine cmd = super.initCommandLine(applicationInstanceController, context, runMeta);
import org.jkiss.dbeaver.model.cli.registry.CommandLineParameterDescriptor;
 * See the License for the specific language governing permissions and
        @Nullable IInstanceController applicationInstanceController,
 */
        super();
    private static DBeaverCommandLine INSTANCE = null;
import org.jkiss.dbeaver.Log;
    protected CommandLine initCommandLine(
 * Licensed under the Apache License, Version 2.0 (the "License");
    private DBeaverCommandLine() {

import org.jkiss.dbeaver.model.cli.CLIRunMeta;
 * Note:
 *    Otherwise it will start normally (and then will try to process commands in UI)
 * Command line processing.
/**
import org.jkiss.dbeaver.model.cli.CLIContextImpl;
    public synchronized static DBeaverCommandLine getInstance() {
    private static final Log log = Log.getLog(DBeaverCommandLine.class);
import org.jkiss.dbeaver.ui.app.standalone.rpc.IInstanceController;
    protected void preprocessCommandLineParameter(
        @NotNull CLIRunMeta runMeta

        @NotNull CLIContextImpl context,
        return INSTANCE;
 * Unless required by applicable law or agreed to in writing, software
    @Override
public class DBeaverCommandLine extends ApplicationCommandLine<IInstanceController> {
        @NotNull CLIRunMeta runMeta
        return cmd;
            if (DBeaverApplication.instance != null) {

        }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        if (INSTANCE == null) {

import org.jkiss.code.Nullable;
        @Nullable IInstanceController applicationInstanceController,
 * DBeaver - Universal Database Manager
/*
 * 1. On DBeaver start. It tries to find already running DBeaver instance (thru REST API) and make it execute passed commands
    ) {
                DBeaverApplication.instance.setExclusiveMode(true);
        @NotNull CLIContextImpl context,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    @Override
    ) {
    @Override

    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.cli.ApplicationCommandLine;
        boolean uiActivated
}
 * You may obtain a copy of the License at
    }
import org.jkiss.dbeaver.ui.app.standalone.cli.DBeaverMixin;
 */
        @NotNull CommandLineParameterDescriptor descriptor,
    }

import org.jkiss.code.NotNull;
        cmd.addMixin("dbeaver", new DBeaverMixin());
 *    If DBeaver will execute at least one command using remote invocation then application won't start.
        @NotNull CLIContextImpl context,
            }
        super.preprocessCommandLineParameter(descriptor, cliCommand, context, uiActivated);
package org.jkiss.dbeaver.ui.app.standalone;

 * you may not use this file except in compliance with the License.
 * limitations under the License.
 * 2. After DBeaver UI start. It will execute commands directly
 *
 *
    }
    protected DBeaverTopLevelCommand createTopLevelCommand(
        if (!uiActivated && descriptor.isExclusiveMode()) {
 * there are two modes of command line processing:

 *
    }
