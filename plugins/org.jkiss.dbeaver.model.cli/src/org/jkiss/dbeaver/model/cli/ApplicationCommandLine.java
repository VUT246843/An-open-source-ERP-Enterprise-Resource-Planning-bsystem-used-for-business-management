    public CLIProcessResult executeCommandLineCommands(
                    return new CLIProcessResult(CLIProcessResult.PostAction.SHUTDOWN, help);

            .stream().allMatch(CommandLine.Model.ArgSpec::hidden);
        IConfigurationElement[] extElements = er.getConfigurationElementsFor(EXTENSION_ID);
            .stream().allMatch(CommandLine.Model.ArgSpec::hidden);
                    if (transformer.getCommandClass() == null) {
                    cliException.getExitCode()
                continue;
        }
                    CLITransformerDescriptor transformer = new CLITransformerDescriptor(ext);
        var noOptions = commandLine.matchedOptions()
            }
                : CLIProcessResult.PostAction.UNKNOWN_COMMAND;
        }

import org.jkiss.dbeaver.utils.GeneralUtils;
            return true;
                            .add(transformer);
                } catch (Exception e) {
            if (commandForHelp != null) {
                );
                    context,
                Exception executionException = exceptionHandler.getException();
            if (parseResult.isVersionHelpRequested()) {
    ) {

        IExtensionRegistry er = Platform.getExtensionRegistry();
                log.warn("Class is not annotated '" + param.getImplClass().getName() + "'");
public abstract class ApplicationCommandLine<T extends ApplicationInstanceController> {
                log.error(message);
    ) {
            CommandLine.ParseResult parseResult;
        for (var sub : pr.subcommands()) {

    ) {
package org.jkiss.dbeaver.model.cli;
        }
                    false
            var found = findCommand(sub, clazz);


        @NotNull Class<?> implClass
        }
     * @param supportNewInstance whether to support starting new instance, true if called from ApplicationInstanceController
                result = new CLIProcessResult(

    }
            CommandLine.ParseResult parseResult;

            if (commandLineIsEmpty(parseResult)) {
            CommandLine commandLine = initCommandLine(
    protected CommandLine.ParseResult findCommand(@NotNull CommandLine.ParseResult pr, @NotNull Class<?> clazz) {
        for (var sub : parseResult.subcommands()) {

        ExceptionHandler exceptionHandler = new ExceptionHandler();
import org.jkiss.code.NotNull;
                    customParameters.put(parameter.getImplClass(), parameter);
            for (Map.Entry<String, CommandLine> stringCommandLineEntry : commandSpec.subcommands().entrySet()) {
            CLIProcessResult.PostAction action = context.getPostAction() != null
            }
        var topLevel = new CommandLine(topLevelImp);
        }
            }

            var command = findCommandForHelp(sub);
                    return new CLIProcessResult(CLIProcessResult.PostAction.ERROR, e.getMessage());
                }
                    return new CLIProcessResult(CLIProcessResult.PostAction.START_INSTANCE);
        return noArgs && noOptions && CommonUtils.isEmpty(commandLine.subcommands());
                    var updatedCmd = new CommandLine(commandForHelp);
import org.jkiss.dbeaver.model.cli.registry.CommandLineParameterDescriptor;
            }
        boolean uiActivated,
        boolean uiActivated
    static {
                }
                context,
    protected CommandLine initCommandLine(
import java.util.LinkedHashMap;

                CommandLine.ParseResult cliCommand = findCommand(parseResult, descriptor.getImplClass());
            try {
/*
            } catch (CommandLine.MissingParameterException e) {
import org.jkiss.dbeaver.DBException;
                String message;
                controller,
    @Nullable
        return result;
                return new CLIProcessResult(finalAction, context.getResults());
        if (clazz.equals(commandObject.getClass())) {
            for (CommandLineParameterDescriptor descriptor : customParameters.values()) {
}
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
            String output = "Error evaluating cli: " + CommonUtils.getAllExceptionMessages(e);
            }
        var noArgs = commandLine.matchedArgs()
    protected static final Map<Class<?>, List<CLITransformerDescriptor>> commandTransformer = new LinkedHashMap<>();
                        globalTransformers.add(transformer);
                return new CLIProcessResult(CLIProcessResult.PostAction.START_INSTANCE);
        for (IConfigurationElement ext : extElements) {
    }
    @NotNull
                return new CLIProcessResult(CLIProcessResult.PostAction.SHUTDOWN, version);
            }

import org.jkiss.dbeaver.Log;
    protected abstract AbstractTopLevelCommand createTopLevelCommand(

        }
        @NotNull CLIContextImpl context,
        if (!CommonUtils.isEmpty(commandSpec.subcommands())) {
    }
        @NotNull CommandLineParameterDescriptor descriptor,
                context,
            }
                return command;
        }
            }
        @NotNull CLIRunMeta runMeta
                } catch (Exception e) {
                } else {
        return null;

    @NotNull
    }
                    }
        boolean supportNewInstance,
        try (var context = new CLIContextImpl(controller)) {
            }
                if (!CommonUtils.isEmpty(e.getUnmatched())) {
import org.jkiss.code.Nullable;
        // call after adding subcommands, because global transformers can affect all command tree
                    updatedCmd.usage(print);
    protected void preprocessCommandLineParameter(
            // Handle help/version before executing commands,
        } catch (Exception e) {
            }

                    List.of(message),
        topLevel.setExecutionExceptionHandler(exceptionHandler);
 * you may not use this file except in compliance with the License.
            validateCommandLineParameters(parseResult);

    protected static final List<CLITransformerDescriptor> globalTransformers = new ArrayList<>();

                ) {
                try (
                    ? CLIProcessResult.PostAction.SHUTDOWN
            }
        @NotNull CommandLine.ParseResult parseResult
 * DBeaver - Universal Database Manager
        log.trace("Executing command line: " + String.join(" ", args));
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.commandLine";

                );
        @NotNull CommandLine.Model.CommandSpec commandSpec,
            if (commandLineIsEmpty(parseResult)) {
 *
            return parseResult.commandSpec();

            transformCommand(command.getCommandSpec(), param.getImplClass());

        transformCommand(topLevel.getCommandSpec(), topLevelImp.getClass());
import java.util.ArrayList;
                    CLIConstants.EXIT_CODE_ERROR
            }
                }
    protected static final Map<Class<?>, CommandLineParameterDescriptor> customParameters = new LinkedHashMap<>();
                    log.error("Can't load contributed parameter", e);
            return new CLIProcessResult(action);
 *
            parseResult = commandLine.parseArgs(args);
        for (CLITransformerDescriptor transformer : globalTransformers) {
                    String command = e.getCommandLine().getCommandName();
    protected boolean commandLineIsEmpty(@Nullable CommandLine.ParseResult commandLine) {
        return null;
                    message = "Parameter(s) " + String.join(" ", e.getUnmatched()) + " cannot be specified after '" + command + "'";
    public String[] preprocessCommandLine(@NotNull String[] args) throws DBException {
                null,

import org.jkiss.dbeaver.model.cli.command.AbstractTopLevelCommand;
import org.eclipse.core.runtime.Platform;
        }
        @NotNull CLIRunMeta runMeta
                return found;
                ? context.getPostAction()
            CommandLine command = new CommandLine(param.getImplClass());
    protected ApplicationCommandLine() {
 * distributed under the License is distributed on an "AS IS" BASIS,
                transformer.getTransformer().transform(commandSpec);
                new CLIRunMeta(uiActivated, supportNewInstance)
        }

    ) {
            );
                    List.of(e.getMessage()),
            if ("parameter".equals(ext.getName())) {
                result = new CLIProcessResult(

                return new CLIProcessResult(
            } else if ("transformer".equals(ext.getName())) {
        if (parseResult.isUsageHelpRequested()) {
    //transformers for all commands
                }

                return new CLIProcessResult(
            } else {
                    CommandLineParameterDescriptor parameter = new CommandLineParameterDescriptor(ext);
        @NotNull CLIContextImpl context,
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return pr;
            topLevel.addSubcommand(command);
                        commandTransformer.computeIfAbsent(transformer.getCommandClass(), k -> new ArrayList<>())
    }
                }
    //transformers for specific command
            if (found != null) {
 */
    private void transformCommand(
                );
    private static final Log log = Log.getLog(ApplicationCommandLine.class);
        @NotNull CLIContextImpl context,
                    output
                    CLIConstants.EXIT_CODE_ERROR
            for (CommandLineParameterDescriptor descriptor : customParameters.values()) {
        return args;
    }
                if (executionException != null) {

        // Load datasource providers from external plugins
                    CLIProcessResult.PostAction.ERROR,
                    log.error("Can't load contributed transformer", e);
import java.io.StringWriter;
            );
        try (var context = new CLIContextImpl(null)) {

            }
    }
    }
    }
                try {
                String version = GeneralUtils.getLongProductTitle();
                    } else {
                transformCommand(subCommandSpec, subCommandSpec.userObject().getClass());
            transformer.getTransformer().transform(topLevel.getCommandSpec());
 * See the License for the specific language governing permissions and
            for (CLITransformerDescriptor transformer : transformers) {
                );
            // because we don't need to execute/start new instance for this cases
                    throw executionException;
                    descriptor,
                    var out = new StringWriter();
 * Copyright (C) 2010-2026 DBeaver Corp and others
                }
            CommandLine commandLine = initCommandLine(
        @NotNull String[] args
            if (command != null) {
        AbstractTopLevelCommand topLevelImp = createTopLevelCommand(applicationInstanceController, context, runMeta);
                    message = e.getMessage();
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.io.PrintWriter;
import org.jkiss.utils.CommonUtils;
import java.util.List;
                    String help = out.toString();
 *
    );
                new CLIRunMeta(false, false)
        @NotNull CommandLine.ParseResult cliCommand,
                    CLIProcessResult.PostAction.ERROR,
            if (commandLine.getExecutionExceptionHandler() instanceof ExceptionHandler exceptionHandler) {
                var finalAction = action == CLIProcessResult.PostAction.UNKNOWN_COMMAND
                CommandLine.ParseResult cliCommand = findCommand(parseResult, descriptor.getImplClass());
import org.eclipse.core.runtime.IExtensionRegistry;
    }
                parseResult = commandLine.parseArgs(args);
                    List.of(output),
    private static CommandLine.Model.CommandSpec findCommandForHelp(

        @Nullable T applicationInstanceController,

                    : action;
     */
                    CLIProcessResult.PostAction.ERROR,
            }
    protected void validateCommandLineParameters(@NotNull CommandLine.ParseResult parseResult) throws CLIException {
        }
            } catch (CommandLine.UnmatchedArgumentException e) {

            if (param.getImplClass().getAnnotation(CommandLine.Command.class) == null) {
        List<CLITransformerDescriptor> transformers = commandTransformer.get(implClass);
                preprocessCommandLineParameter(
        @Nullable T applicationInstanceController,
                    var print = new PrintWriter(out)
        Object commandObject = pr.commandSpec().userObject();
                helpSpec.header(GeneralUtils.getProductTitle());
            log.error("Error evaluating cli:" + e.getMessage(), e);
        CLIProcessResult result;
        } catch (Exception e) {
                }
                } catch (Exception e) {
                );
    }
                }
                    continue;
            if (!CommonUtils.isEmpty(context.getResults())) {
            log.error("Error preprocessing command line: " + e.getMessage(), e);
import java.util.Map;
                return new String[0];
                if (cliCommand == null) {
        if (commandLine == null) {
import org.jkiss.dbeaver.model.cli.registry.CLITransformerDescriptor;
import org.eclipse.core.runtime.IConfigurationElement;
                if (supportNewInstance && descriptor.isExclusiveMode() && descriptor.isForceNewInstance()) {
            commandLine.execute(args);
                    cliCommand,
        if (!CommonUtils.isEmpty(transformers)) {
                    CLIProcessResult.PostAction.ERROR,
        }
        @Nullable T controller,
                    continue;
    /**
import picocli.CommandLine;
            commandLine.setUnmatchedArgumentsAllowed(true);
        }
    ) throws Exception {
                    log.error("Error handling command line: " + e.getMessage());
            if (e instanceof CLIException cliException) {
                CommandLine.Model.CommandSpec subCommandSpec = stringCommandLineEntry.getValue().getCommandSpec();
            CommandLine.Model.CommandSpec commandForHelp = findCommandForHelp(parseResult);
 * limitations under the License.

 *     http://www.apache.org/licenses/LICENSE-2.0
        return topLevel;
        for (CommandLineParameterDescriptor param : customParameters.values()) {
        topLevel.setExecutionStrategy(new CommandLine.RunAll());
                CommandLine.Model.UsageMessageSpec helpSpec = commandForHelp.usageMessage();
            }
                try {

                if (cliCommand == null) {
