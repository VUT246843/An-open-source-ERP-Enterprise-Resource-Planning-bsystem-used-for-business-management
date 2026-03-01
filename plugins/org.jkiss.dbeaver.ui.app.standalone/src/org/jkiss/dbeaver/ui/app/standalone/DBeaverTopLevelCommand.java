import java.io.FileInputStream;
 * You may obtain a copy of the License at
                Properties properties = new Properties();

        if (context.getPostAction() != null) {
    }
import org.jkiss.dbeaver.model.cli.CLIConstants;
    protected DBeaverTopLevelCommand(
            exitAfterExecute = true;
 * DBeaver - Universal Database Manager
            exitAfterExecute = true;

@CommandLine.Command(name = "dbeaver", description = "DBeaver commands")
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
import org.jkiss.dbeaver.Log;
        }

            context.setPostAction(CLIProcessResult.PostAction.START_INSTANCE);
    @CommandLine.Option(names = {"-vars", "-variablesFile"}, description = "Uses a specified configuration file for variable resolving")
        this.instanceController = controller;
        List<String> allFilesToOpen = new ArrayList<>();
    @CommandLine.Option(
    @Nullable

 *
        description = "Hide splash screen on start",
    private boolean quiet;
import java.io.InputStream;
    private final IInstanceController instanceController;
        boolean exitAfterExecute = false;
        description = "Force creating new application instance (do not try to activate already running)"
import org.jkiss.code.NotNull;
            log.trace("Can't process commands because no running instance is present");

            instanceController.closeAllEditors();
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        names = {NOSPASH_OPTION},
            exitAfterExecute = true;
            allFilesToOpen.addAll(filesToOpen);

    @CommandLine.Option(names = {"-con", "-connect", "-ds-spec", "--datasource-specification"}, arity = "1", split = ",",
                instanceController.openDatabaseConnection(con);

 *
    ) {
            context.setPostAction(CLIProcessResult.PostAction.START_INSTANCE);
    @CommandLine.Option(names = {CLIConstants.COMMAND_REUSE_WORKSPACE}, description = "Force workspace reuse (do not show warnings)")
                log.error("Error parsing command line ", e);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
        context.setPostAction(exitAfterExecute ? CLIProcessResult.PostAction.SHUTDOWN : CLIProcessResult.PostAction.START_INSTANCE);
    private boolean disconnectAll;
    // open files via double-click or "Open with DBeaver"
            } catch (Exception e) {
            allFilesToOpen.addAll(filesToOpenParams);
public class DBeaverTopLevelCommand extends AbstractTopLevelCommand {

        }
        scope = CommandLine.ScopeType.INHERIT
    public void run() {
        if (disconnectAll) {
            }

        }

    private boolean noSplash;
import org.jkiss.dbeaver.model.cli.command.AbstractTopLevelCommand;
import org.jkiss.code.Nullable;
            return;
        if (!CommonUtils.isEmpty(connectionSpecs)) {


    )
    private List<String> filesToOpen;
            }
        }
import org.jkiss.dbeaver.ui.app.standalone.rpc.IInstanceController;
    private boolean closeTabs;

        @NotNull CLIRunMeta meta
    private List<String> filesToOpenParams;

            instanceController.executeWorkbenchCommand(ConnectionCommands.CMD_DISCONNECT_ALL);
    @CommandLine.Option(names = {"-q"}, description = "Run quietly (do not print logs)")
        if (closeTabs) {
    @CommandLine.Option(names = {"-disconnectAll"}, description = "Disconnect from all databases")
/*
import picocli.CommandLine;
            try (InputStream stream = new FileInputStream(variablesFile)) {
        if (!CommonUtils.isEmpty(filesToOpenParams)) {
import org.jkiss.dbeaver.model.cli.CLIContextImpl;
        }
import java.util.ArrayList;
 * you may not use this file except in compliance with the License.
            return;
 * See the License for the specific language governing permissions and
                SystemVariablesResolver.setConfiguration(properties);
            instanceController.openExternalFiles(allFilesToOpen.toArray(new String[0]));
        if (instanceController == null) {
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ui.app.standalone;
    @CommandLine.Option(names = {"-newInstance"},
    private static final Log log = Log.getLog(DBeaverTopLevelCommand.class);
    private List<String> connectionSpecs;
        if (!CommonUtils.isEmpty(allFilesToOpen)) {
            return;
import org.jkiss.dbeaver.model.cli.CLIRunMeta;
    private boolean reuseWorkspace;
import org.jkiss.utils.CommonUtils;


            exitAfterExecute = true;

        // Connect
        }
        super(controller, context, meta);
        }

    @Override
    @CommandLine.Option(names = {"-stop", "-quit"}, description = "Stop DBeaver running instance")
        }
        }
        super.run();

    private boolean stop;

    }
import java.util.Properties;
        description = "Connects to a specified database")
    @CommandLine.Option(names = {"-bringToFront"}, description = "Bring DBeaver window on top of other applications")
    private boolean bringToFront;
        if (!CommonUtils.isEmpty(filesToOpen)) {
        if (bringToFront) {
    @CommandLine.Option(names = {"-f", "-file"}, arity = "1", split = ",", description = "Open a file")

            exitAfterExecute = true;
        @NotNull CLIContextImpl context,
            exitAfterExecute = true;
            instanceController.quit();
import org.jkiss.dbeaver.model.cli.CLIProcessResult;
    @CommandLine.Option(names = {"-closeTabs"}, description = "Close all open editors")
    private boolean newInstance;
    // Eclipse cmd for desktop

    @CommandLine.Parameters(index = "0", arity = "0..*", description = "Open files")
                context.setPostAction(CLIProcessResult.PostAction.START_INSTANCE);
        if (!CommonUtils.isEmpty(variablesFile)) {
    )

 * Copyright (C) 2010-2026 DBeaver Corp and others
            instanceController.bringToFront();
 * distributed under the License is distributed on an "AS IS" BASIS,
                properties.load(stream);
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    private String variablesFile;
    
import java.util.List;
        }
        }
 */
import org.jkiss.dbeaver.ui.actions.ConnectionCommands;
        @Nullable IInstanceController controller,
            for (String con : connectionSpecs) {
        if (stop) {
        if (newInstance) {
        }


