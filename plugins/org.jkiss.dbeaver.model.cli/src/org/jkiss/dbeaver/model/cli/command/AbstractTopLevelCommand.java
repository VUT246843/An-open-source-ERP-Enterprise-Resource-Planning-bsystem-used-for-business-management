 */
 * See the License for the specific language governing permissions and

    @Override
    @Override
            }
    @Nullable
    }
    @CommandLine.Option(
                return;
    @CommandLine.Option(names = {"-dump"},
    @NotNull
    }
import org.jkiss.dbeaver.model.cli.model.option.EclipseOptions;
    public CLIRunMeta getMeta() {

    @NotNull
    )
            code = CLIConstants.EXIT_CODE_ERROR;
    @CommandLine.Option(
    public int getExitCode() {
        usageHelp = true,
    @NotNull
    private boolean debugLogs;
}

    @Nullable
        names = {"-h", "-help", HELP_OPTION},
        scope = CommandLine.ScopeType.INHERIT
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        @NotNull CLIContext context,

        scope = CommandLine.ScopeType.INHERIT
    }
            if (traceLogs) {
 *
    private int code = CLIConstants.EXIT_CODE_OK;
    public CLIContext context() {
import org.jkiss.code.NotNull;
                context.setPostAction(CLIProcessResult.PostAction.SHUTDOWN);
    @NotNull
    public static final String NOSPASH_OPTION = "-nosplash";
    }
    private HiddenOptions hiddenOptions;

            }
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.meta = meta;

    public ApplicationInstanceController getController() {
    private final Log log = Log.getLog(getClass());
                    return;
                String threadDump = controller.getThreadDump();
        versionHelp = true,
    @CommandLine.Option(names = {TRACE_LOGS_OPTION},
    )
    }
                if (controller == null) {

 *
    @CommandLine.Mixin
import picocli.CommandLine;
    @CommandLine.Mixin
        description = "Show this help message and exit.",

    public CommandLineAuthenticator getAuthenticator() {
            log.error("Error executing command", e);
        }
        scope = CommandLine.ScopeType.INHERIT
    )
public abstract class AbstractTopLevelCommand extends CLIAbstractCommand implements CommandLine.IExitCodeGenerator {
    public void run() {
 * distributed under the License is distributed on an "AS IS" BASIS,


        return context;
        try {
import org.jkiss.dbeaver.model.cli.model.option.HiddenOptions;
        description = "Print instance thread dump.")

                    context.setPostAction(CLIProcessResult.PostAction.SHUTDOWN);
        description = "Print version information and exit.",
    protected final ApplicationInstanceController controller;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final String DEBUG_LOGS_OPTION = "--debug-logs";
 * You may obtain a copy of the License at

import org.jkiss.code.Nullable;
                context.addResult(threadDump);
            Log.setLogHandler(null);
        hidden = true
        this.context = context;

        @Nullable ApplicationInstanceController controller,
        if (debugLogs || traceLogs) {
        return null;

    private boolean dump;
    }
    protected final CLIRunMeta meta;
        this.controller = controller;
        description = "Enable debug logging.",
import org.jkiss.dbeaver.Log;
    @Nullable
                Log.enableTraceLogs(true);
        } catch (Exception e) {
 * you may not use this file except in compliance with the License.
        return controller;
    ) {
        }
    private boolean version;
package org.jkiss.dbeaver.model.cli.command;
        return meta;
 *
                }

import org.jkiss.dbeaver.model.cli.*;

        names = {"-V", "--version"},
        return code;
        @NotNull CLIRunMeta meta
    )
        scope = CommandLine.ScopeType.INHERIT,
 * Copyright (C) 2010-2026 DBeaver Corp and others
    private boolean help;
 * DBeaver - Universal Database Manager
        description = "Enable trace logging.",
    @CommandLine.Option(names = {DEBUG_LOGS_OPTION},
            if (dump) {
    public static final String TRACE_LOGS_OPTION = "--trace-logs";
import org.jkiss.dbeaver.model.cli.model.CommandLineAuthenticator;

 * Unless required by applicable law or agreed to in writing, software
/*


    protected final CLIContext context;
    protected AbstractTopLevelCommand(
                    log.debug("Can't process commands because no running instance is present");
    public static final String HELP_OPTION = "--help";
    }
    private EclipseOptions eclipseOptions;
    private boolean traceLogs;
