

        try (Reader reader = Files.newBufferedReader(path)) {
        }.schedule(1000);
 * You may obtain a copy of the License at
        return new DBeaverInstanceServer();
    @Nullable

            if (response != payload) {
import org.eclipse.core.runtime.Status;
    @NotNull
                if (!shell.getMinimized()) {
    private static SSLContext initCustomSslContext() {
import org.eclipse.core.runtime.IProgressMonitor;
                workbenchWindow.getShell().forceActive();

            for (File file : filesToConnect) {
import org.jkiss.dbeaver.model.cli.CLIProcessResult;
            return DBeaverCommandLine.getInstance().executeCommandLineCommands(
import org.jkiss.dbeaver.Log;
        }
            return new CLIProcessResult(CLIProcessResult.PostAction.ERROR, "Error executing command: " + e.getMessage());
 * you may not use this file except in compliance with the License.
        return new InstanceServerProperties(Integer.parseInt(port), password);
                shell.setMinimized(false);
import javax.net.ssl.TrustManagerFactory;
            @Override
        }
 * DBeaver instance controller.

            }
import org.jkiss.dbeaver.ui.editors.EditorUtils;
    }

import java.io.IOException;
        return createClient(null);
        final Path path = getConfigPath(workspacePath);
            protected IStatus run(IProgressMonitor monitor) {
import org.jkiss.dbeaver.ui.app.standalone.DBeaverApplication;
            filesToConnect.addAll(paths.stream().map(Path::toFile).toList());
    }
            .setSslContext(initCustomSslContext())
import org.jkiss.dbeaver.model.app.DBPProject;
    public void executeWorkbenchCommand(@NotNull String commandId) {
                true,
import org.jkiss.utils.rest.RestClient;
                return Status.OK_STATUS;
            .builder(URI.create("http://localhost:" + serverProperties.port()), IInstanceController.class)
    @Override
                args
        log.debug("Close all open editor tabs");
import org.jkiss.dbeaver.ui.actions.datasource.DataSourceHandler;
            return null;
        }
            List<Path> paths = EditorUtils.openExternalFiles(fileNames, dataSourceContainer);
            return null;
import org.eclipse.swt.widgets.Shell;
 *



import org.jkiss.dbeaver.ui.ActionUtils;
    }
            final IWorkbenchWindow workbenchWindow = UIUtils.getActiveWorkbenchWindow();
    }
    public void openDatabaseConnection(@NotNull String connectionSpec) {
    /**
import java.net.URI;
        }
import org.eclipse.ui.IWorkbenchWindow;
    }

        }
            var ssl = SSLContext.getInstance("TLS");
import java.util.Map;
    @Override

        if (activeProject == null) {
        }
     * init custom ssl context to avoid default trust store initialization before an application starts

            return null;
        return instance;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2026 DBeaver Corp and others
        InstanceConnectionParameters instanceConParameters = new InstanceConnectionParameters();
            final Shell shell = UIUtils.getActiveShell();
            properties.load(reader);

/*
            final long payload = System.currentTimeMillis();
 *
        if (CommonUtils.isEmptyTrimmed(password)) {
            instanceConParameters.isCreateNewConnection()
 */

import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLNavigatorContext;
            GeneralUtils.replaceVariables(connectionSpec, SystemVariablesResolver.INSTANCE),
        } catch (Exception e) {
        } else if (instanceConParameters.isMakeConnect()) {
import org.jkiss.dbeaver.ui.app.standalone.DBeaverCommandLine;
        if (CommonUtils.isEmptyTrimmed(port)) {
            return ssl;
    private static final Log log = Log.getLog(DBeaverInstanceServer.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
            activeProject,
import java.util.Properties;
            false,
 * limitations under the License.
    @Override
import org.eclipse.core.runtime.jobs.Job;
import org.jkiss.dbeaver.model.cli.InstanceServerProperties;

        new Job("Terminate application") {
            var factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    @Override

    public static IInstanceController createClient(@Nullable Path workspacePath) {
            instanceConParameters,
            DataSourceHandler.connectToDataSource(null, dataSourceContainer, null);

            return null;

 * DBeaver - Universal Database Manager
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        });
        try {
    }
                this,
            return;
            }
    public void bringToFront() {
        InstanceServerProperties serverProperties = deserializeProperties(path);
    @Override
            }
            filesToConnect.clear();

import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerOpenEditor;
 */
    public CLIProcessResult handleCommandLine(@NotNull String[] args) {
import java.io.File;
            final long response = instance.ping(payload);
        UIUtils.syncExec(() -> {
        try {
/**
    }
public class DBeaverInstanceServer extends ApplicationInstanceServer<IInstanceController> implements IInstanceController {
        DBPProject activeProject = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
            IWorkbenchPage page = window.getActivePage();
            return null;

        dataSourceContainer = DataSourceUtils.getDataSourceBySpec(
import java.nio.file.Files;
import org.jkiss.dbeaver.model.cli.ApplicationInstanceServer;
            });
    public void openExternalFiles(@NotNull String[] fileNames) {
            log.error("No port specified for the instance controller to connect to");
                EditorUtils.setFileDataSource(file, new SQLNavigatorContext(dataSourceContainer));
    private final List<File> filesToConnect = new ArrayList<>();

            UIUtils.syncExec(() -> {
            if (shell != null) {
            log.debug("Error accessing instance server: " + e.getMessage());
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    }
import org.eclipse.core.runtime.IStatus;
                shell.setActive();
import javax.net.ssl.SSLContext;
            log.error("No password specified for the instance controller to connect to");
        String port = properties.getProperty(InstanceServerProperties.PROPERTY_PORT);
        } catch (Throwable e) {
import org.jkiss.code.NotNull;
                System.exit(-1);
            }
    }

            .create();
            log.trace("No instance controller is available");
        }
        String password = properties.getProperty(InstanceServerProperties.PROPERTY_PASSWORD);
        }
            log.error("Error reading instance controller configuration: " + e.getMessage());
    @Override
        UIUtils.asyncExec(() -> {
    public static DBeaverInstanceServer createServer() throws IOException {
import org.jkiss.dbeaver.utils.SystemVariablesResolver;
import org.jkiss.utils.CommonUtils;
                }
                page.closeAllEditors(false);
        UIUtils.syncExec(() -> {
        //log.debug("Open external database connection [" + connectionSpec + "]");
            return null;
        Properties properties = new Properties();
        }

 *
import java.io.Reader;
                    shell.setMinimized(true);
}    @Nullable
     */
        final IInstanceController instance = RestClient
                throw new IllegalStateException("Invalid ping response: " + response + ", was expecting " + payload);
    @Nullable
import java.nio.file.Path;
        // Do not log it (#3788)
import java.util.ArrayList;
        ActionUtils.runCommand(commandId, UIUtils.getActiveWorkbenchWindow());
    }
        if (serverProperties == null) {
            .setHeaders(Map.of(HttpConstants.HEADER_AUTHORIZATION, HttpConstants.BEARER_PREFIX + serverProperties.password()))
            return null;
        super(IInstanceController.class);


        }
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.runtime.DBWorkbench;

import java.util.List;

                !DBeaverApplication.getInstance().isHeadlessMode(),
        }
        if (Files.notExists(path)) {
            if (page != null) {
            ssl.init(null, factory.getTrustManagers(), null);
        );
            factory.init(KeyStore.getInstance(KeyStore.getDefaultType()));
    }
import org.eclipse.ui.IWorkbenchPage;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return payload;
    private static InstanceServerProperties deserializeProperties(@NotNull Path path) {
    public void closeAllEditors() {
    @Nullable
                SQLEditorHandlerOpenEditor.openSQLConsole(workbenchWindow, new SQLNavigatorContext(dataSourceContainer), dataSourceContainer.getName(), "");

        if (instanceConParameters.isOpenConsole()) {
            log.error("Error init custom ssl context: " + e.getMessage(), e);
import org.jkiss.utils.HttpConstants;
    @Override
        } catch (IOException e) {
package org.jkiss.dbeaver.ui.app.standalone.rpc;
        });
            return;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        });
    }
        filesToConnect.clear();
        }
import java.security.KeyStore;
    }

        if (!CommonUtils.isEmpty(filesToConnect)) {


        log.debug("Execute workbench command " + commandId);

import org.jkiss.code.Nullable;
    }
        log.info("Program termination requested");
        DBPPlatformDesktop.getInstance().getGlobalEventManager().fireGlobalEvent(eventId, properties);
            );
            return null;
    public void quit() {
import org.jkiss.dbeaver.utils.DataSourceUtils;
    @Override
            log.debug("Can't start instance server because other instance is already running");
            log.error("No active project in workspace");
        try {
    }
 * See the License for the specific language governing permissions and
    public void fireGlobalEvent(@NotNull String eventId, @NotNull Map<String, Object> properties) {
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (createClient() != null) {

    @Nullable
        if (dataSourceContainer == null) {
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;


    private DBPDataSourceContainer dataSourceContainer = null;
        } catch (Exception e) {
    public static IInstanceController createClient() {
            IWorkbenchWindow window = UIUtils.getActiveWorkbenchWindow();
    public long ping(long payload) {
    private DBeaverInstanceServer() throws IOException {
