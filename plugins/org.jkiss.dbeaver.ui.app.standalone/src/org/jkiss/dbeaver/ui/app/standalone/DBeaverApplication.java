
 *
        }

                + GeneralUtils.getProductName() + ".");
    private static final Log log = Log.getLog(DBeaverApplication.class);
        if (Files.notExists(actionsPath)) {
        PlatformUI.getPreferenceStore().setDefault(
    @NotNull
                } catch (Exception e) {
    static final String VERSION_PROP_PRODUCT_NAME = "product-name";
        return lastUserActivityTime;
            DBeaverSettingsImporter importer = new DBeaverSettingsImporter(this, getDisplay());

        }
        return isHeadlessMode() ? ConsoleUserInterface.class : DesktopUI.class;

    private String[] preprocessCommandLine() {
        @Override
    private int showMessageBox(@NotNull String title, String message, int style) {


            @NotNull
import org.jkiss.dbeaver.registry.BasePlatformImpl;
    public Path getWorkspacesFile() {
    private void stopDebugWriter() {
        }
        instance = this;
    private OutputStream debugWriter;
                return FileVisitResult.CONTINUE;
            @NotNull
            // Magic with exit codes to let Eclipse starter switcg workspace
        }
        } catch (Exception e) {
    public Object start(IApplicationContext context) {
        this.headlessMode = headlessMode;
import org.jkiss.code.Nullable;

    @Override
                    }
    private PrintStream oldSystemOut;
    }
        try {
        } catch (Throwable e) {
        public void flush() throws IOException {

    @Override
        FILE_WITH_WORKSPACES = Paths.get(workingDirectory, defaultWorkspacesFile); //$NON-NLS-1$
        }
     * Returns path to the {@code .workspaces} file.
        if (stack != ModelPreferences.IPType.AUTO) {

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;

    }
    }

                    initializeApplication();




        } catch (Throwable e) {
                }
    public String getInfoDetails() {
 */
*/

                    showMessageBox("Error initializing application", e.getMessage(), SWT.ICON_ERROR);
                        instanceLoc.lock();
                return FileVisitResult.CONTINUE;
import org.eclipse.swt.widgets.Display;
        }
            showMessageBox("Error initializing platform", CommonUtils.getAllExceptionMessages(e), SWT.ICON_ERROR);
import java.nio.file.*;
    }

                defaultHomePath = RuntimeUtils.getLocalFileFromURL(instanceLoc.getURL());
            return;

        // Custom parameters
                    Files.delete(dir);
            try {
    public static final String POLICY_WD_CHECK_SUPPRESS = "policy.wd.check.disabled"; //$NON-NLS-1$
            if (!properties.isEmpty()) {
    private final Path defaultWorkspacePath;
            }
        return DEFAULT_PROJECT_NAME;
    private boolean headlessMode = false;
            return;
        if (!resetUserPreferences && !resetWorkspaceConfiguration) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.ui.IWorkbenchPreferenceConstants;
            // Copy-pasted from IDEApplication
            oldSystemOut = System.out;
        }
import org.eclipse.swt.widgets.Shell;
        try {
                    return false;
    }
                            SWT.ICON_WARNING | SWT.IGNORE | SWT.RETRY | SWT.ABORT);
    @Override

        }
        }
        return exclusiveMode;
        // Prefs default
            }
    @Override
            this.stdOut = stdOut;
            try {
        return new ApplicationWorkbenchAdvisor(this);

    protected boolean tryMigrateFromPreviousVersion(Path homeDir) {
    protected ApplicationWorkbenchAdvisor createWorkbenchAdvisor() {
import java.lang.reflect.Field;
            }

    @Override
    private void writeWorkspaceInfo() {
        public void write(int b) throws IOException {
        Path defaultHomePath = defaultWorkspacePath;
            // Check for resource leaks


                } else if (instanceLoc.isLocked() && !ideWorkspaceSet && !isExclusiveMode()) {
        if (!Files.exists(metadataFolder)) {
        return reuseWorkspace;
                                return false;


        return false;
                                break;
        try {
                            System.out.println(res);
import org.eclipse.ui.IWorkbench;
        if (resetUserPreferencesOnRestart) {
            return importer.migrateFromPreviousVersion(previousVersionWorkspaceDir.toFile(), homeDir.toFile());
    public void stop() {
        log.debug("Memory available " + (runtime.totalMemory() / (1024 * 1024)) + "Mb/" + (runtime.maxMemory() / (1024 * 1024)) + "Mb");
    }
    private DBeaverInstanceServer instanceServer;
    private PrintStream oldSystemErr;
        log.debug(GeneralUtils.getProductName() + " " + GeneralUtils.getProductVersion() + " is starting"); //$NON-NLS-1$

            return false;
    }

    private boolean setIDEWorkspace(@NotNull Location instanceLoc) {
 *
            log.debug("Internal error in workbench lifecycle", e);

    }
    public static final String DEFAULT_WORKSPACES_FILE = ".workspaces";
                e.printStackTrace();
        if (instanceLoc.isSet()) {
    public static final String DEFAULT_WORKSPACE_FOLDER = "workspace6";
    public boolean isReuseWorkspace() {

        Path defaultHomePath = defaultWorkspacePath;
                Files.delete(actionsPath);
            } catch (IOException e) {
            System.err.println("Can't switch workspace to '" + defaultHomePath + "' - " + e.getMessage());  //$NON-NLS-1$ //$NON-NLS-2$
        Path metadataFolder = defaultDir.resolve(DBPWorkspace.METADATA_FOLDER);
            catch (InterruptedException e) {
            } catch (Exception e) {
import org.jkiss.dbeaver.utils.RuntimeUtils;

            try {
        WORKSPACE_DIR_4,
                log.debug("Can't set IDE workspace to '" + lastWorkspace + "'", e);
        return defaultWorkspacePath;
        for (int event : events) {
        } catch (Exception e) {
                }
    @Override

            // the workbench doesn't support relaunch yet (bug 61809) so
                }
                    } else {


                    log.trace("Unable to delete " + file + ":" + e.getMessage());
            }

        return display;
                    // Lock the workspace
        var args = Platform.getApplicationArgs();

        }
        }
import org.jkiss.utils.CommonUtils;
                final Path relative = path.relativize(dir);
     */
        // Can't lock specified path
        shell.setText(GeneralUtils.getProductTitle());
        }
            log.error("Can't start instance server: " + e.getMessage());
import org.jkiss.dbeaver.ui.app.standalone.update.VersionUpdateDialog;
    }
    private boolean setDefaultWorkspacePath(Location instanceLoc) {
        } finally {
            Resource.setNonDisposeHandler(originStack -> log.warn("SWT resource leak detected", originStack));
import org.eclipse.core.net.proxy.IProxyService;
        return defaultHomePath;
    @Override
        var args = preprocessCommandLine();
        BaseWorkspaceImpl.writeWorkspaceInfo(metadataFolder, props);
            debugWriter = new LogOutputStream(debugLogFile);
    public static final String APPLICATION_PLUGIN_ID = "org.jkiss.dbeaver.ui.app.standalone";
        return true;
    }
            } catch (IOException e) {
    }
    }
    }
import org.jkiss.dbeaver.ui.app.standalone.rpc.IInstanceController;
    @Nullable
                e.printStackTrace();
        // Write version info
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (Throwable e) {
    private void initDebugWriter() {
        // Windows: %AppData%/DBeaverData
            logLocation = GeneralUtils.getMetadataFolder().resolve(DBConstants.DEBUG_LOG_FILE_NAME).toAbsolutePath().toString(); //$NON-NLS-1$
    }
                } else {
            headlessMode = true;
    @Override
            DBWorkbench.addInitializeHook((platform) -> {
                }

import org.eclipse.ui.internal.WindowsDefenderConfigurator;
        // MacOS: ~/Library/DBeaverData
                instanceServer = null;
                }
        if (!props.isEmpty()) {


        }

                log.error("Unable to save startup actions", e);
    }
                e = re.getCause();
            // In shared mode we mustn't run UI
        try {
                    Files.delete(file);
    }
        }
                    return cliProcessResult.getExitCode();
            log.error("Error preprocessing command line", e);
        // Configure proxy
import java.net.URL;
        this.resetWorkspaceConfigurationOnRestart = resetWorkspaceConfigurationOnRestart;
    }
    static boolean WORKSPACE_MIGRATED = false;
            return EXIT_RELAUNCH.equals(Integer.getInteger(PROP_EXIT_CODE)) ? EXIT_RELAUNCH
        try (Stream<Path> list = Files.list(path)) {
                }
     * @return application or null if application wasn't started or was stopped.
            }
        }

            debugWriter.write(b);
        //System.setProperty(StandardConstants.ENV_FILE_ENCODING, GeneralUtils.UTF8_ENCODING);
            newVersion,
        // It sets main windows name and images
            args = DBeaverCommandLine.getInstance().preprocessCommandLine(args);
import java.nio.file.attribute.BasicFileAttributes;

                } else {
        if (location.isSet()) {
import org.jkiss.dbeaver.ui.app.standalone.internal.WorkbenchPatcher;
        ModelPreferences.IPType address = ModelPreferences.IPType.getPreferredAddresses();
import org.jkiss.dbeaver.registry.ApplicationPolicyProvider;
        final boolean resetUserPreferences = actions.contains(RESET_USER_PREFERENCES);
import org.jkiss.dbeaver.registry.SWTBrowserRegistry;
    private void shutdown() {
        dialog.open();
        } catch (Throwable e) {
        if (resetWorkspaceConfigurationOnRestart) {
        return DBeaverActivator.getInstance().getPreferences();
                        // Can't lock specified path
import org.jkiss.dbeaver.runtime.ui.DBPPlatformUI;
        boolean debugNetworkConnections = ModelPreferences.getPreferences().getBoolean(ModelPreferences.PROP_DEBUG_NETWORK_CONNECTIONS);
        } catch (Exception e) {
            display = null;
    }

    public static DBeaverApplication getInstance() {
                log.trace("Deleting " + dir);
            log.error("Error migrating old workspace version", e);

        return true;
            log.debug("Create display");

    private static final String PROP_EXIT_CODE = "eclipse.exitcode"; //$NON-NLS-1$
        try {
                WindowsDefenderConfigurator.savePreference(
     */
                Files.exists(GeneralUtils.getMetadataFolder(oldWorkspaceDir))) {
            stdOut.flush();
        }
            }
            return IApplication.EXIT_OK;

        return primaryInstance && !isHeadlessMode();
    public String getDefaultProjectName() {
            } catch (Exception e) {
        loadStartupActions(instanceLoc);
            System.setErr(new PrintStream(new ProxyPrintStream(debugWriter, oldSystemErr)));
            properties.load(reader);
        try {
        try {

    private boolean reuseWorkspace = false;
    protected DBeaverApplication(String defaultWorkspaceLocation, String defaultAppWorkspaceName, String defaultWorkspacesFile) {
            return list.findAny().isEmpty();
import org.jkiss.dbeaver.core.DBeaverActivator;
    private boolean primaryInstance = true;
        }
        if (!isWorkspaceSwitchingAllowed()) {
        WORKSPACE_DIR_LEGACY};
        // Policy
                                primaryInstance = false;

        // Run instance server
        initializeApplicationServices();
        WorkbenchPatcher.patchWorkbenchXmi(instanceLoc);
import org.jkiss.utils.ArrayUtils;
import org.eclipse.ui.internal.WorkbenchPlugin;
                break;
        try {
            oldDir = GeneralUtils.replaceSystemPropertyVariables(oldDir);
        if (ApplicationPolicyProvider.getInstance().isPolicyEnabled(POLICY_WD_CHECK_SUPPRESS)) {
        if (oldSystemErr != null) System.setErr(oldSystemErr);
            public FileVisitResult preVisitDirectory(Path dir, @NotNull BasicFileAttributes attrs) {
    private static boolean isEmptyFolder(Path path) throws IOException {

    private void processStartupActions(

            display.dispose();

import org.jkiss.dbeaver.model.app.DBPPlatform;
                            case SWT.RETRY:
            } catch (Exception e) {
    private void addIdleListeners() {
    }
        Location instanceLoc = Platform.getInstanceLocation();

        Listener idleListener = event -> lastUserActivityTime = System.currentTimeMillis();
    }
                }
        }
            return IApplication.EXIT_OK;
                // should set the icon and message for this shell to be the
                                break;
    }
            try {
        public void write(@NotNull byte[] b, int off, int len) throws IOException {
        try {
        log.debug("Java version: " + System.getProperty(StandardConstants.ENV_JAVA_VERSION) + " by " + System.getProperty(StandardConstants.ENV_JAVA_VENDOR) + " (" + System.getProperty(StandardConstants.ENV_JAVA_ARCH) + "bit)");
        updateSplashHandler();
            } catch (IOException e) {
import org.jkiss.dbeaver.registry.timezone.TimezoneRegistry;
        // Configure network
        this.resetUserPreferencesOnRestart = resetUserPreferencesOnRestart;
        log.debug("Install path: '" + SystemVariablesResolver.getInstallPath() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
        return true;
                    instanceLoc.set(selectedWorkspaceURL, true);
            ApplicationWorkbenchAdvisor.DBEAVER_SCHEME_NAME);


        for (String oldDir : WORKSPACE_DIR_PREVIOUS) {

    }
        }
            showSkip);
                }
        if (address != ModelPreferences.IPType.AUTO) {
            e.printStackTrace(System.err);
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (oldSystemOut != null) System.setOut(oldSystemOut);

            }

            log.error(e);
import org.jkiss.dbeaver.model.rcp.DesktopApplicationImpl;
            // This doesn't initialize display - just sets default title


    public IInstanceController createInstanceClient() {
        @NotNull Set<String> actions
            }
        }
import org.jkiss.dbeaver.model.DBConstants;
            log.error("Workspace switching is not allowed when participating in the early access program. Exiting "

        MessageBox messageBox = new MessageBox(shell, style);
        if (workbench == null)


            @Override
            stdOut.write(b);
    public void setResetWorkspaceConfigurationOnRestart(boolean resetWorkspaceConfigurationOnRestart) {
    private void updateSplashHandler() {
    @Nullable
        this(BasePlatformImpl.DBEAVER_DATA_DIR, DEFAULT_WORKSPACE_FOLDER, DEFAULT_WORKSPACES_FILE);
    private Display display = null;
        final Runtime runtime = Runtime.getRuntime();
                // same as the chooser dialog - this will be the guy that lives in
    }
import org.jkiss.dbeaver.model.cli.CLIProcessResult;
        props.setProperty(VERSION_PROP_PRODUCT_NAME, GeneralUtils.getProductName());
                args = ArrayUtils.remove(String.class, args, arg);
        Path actionsPath;
    public long getLastUserActivityTime() {

        File debugLogFile = new File(logLocation);
        }
import org.eclipse.swt.widgets.Listener;
        TimezoneRegistry.overrideTimezone();
 * Unless required by applicable law or agreed to in writing, software

                    .executeCommandLineCommands(null, false, false, args);
import org.jkiss.code.NotNull;
                e.printStackTrace();
import org.jkiss.dbeaver.core.DesktopUI;
    private static class ProxyPrintStream extends OutputStream {

                if (dir.endsWith(WORKSPACE_PLUGINS_FOLDER)) {
        } catch (DBException e) {
    @NotNull

    public void setHeadlessMode(boolean headlessMode) {
    }
            debugWriter.write(b, off, len);
            IWorkbenchPreferenceConstants.KEY_CONFIGURATION_ID,
                            "DBeaver - Can't lock workspace",
            try {
    @NotNull
            isReadOnlyField.set(instanceLoc, true);
        if (!isWorkspaceSwitchingAllowed() && !defaultWorkspacePath.equals(defaultHomePath)) {
        } catch (Throwable e) {
        final IWorkbench workbench = PlatformUI.getWorkbench();
            DBPPreferenceStore preferenceStore = DBWorkbench.getPlatform().getPreferenceStore();
    public boolean isHeadlessMode() {

     * Gets singleton instance of DBeaver application
        String lastWorkspace = DBeaverWorkspaces.fetchRecentWorkspaces(this, instanceLoc).getFirst();
        if (!CommonUtils.isEmpty(lastWorkspace)) {
            }
            
        for (String arg : args) {
import org.jkiss.dbeaver.core.DesktopPlatform;
    public boolean isPrimaryInstance() {
            if (!display.isDisposed())
 * DBeaver - Universal Database Manager


                        primaryInstance = false;
            return;
import org.eclipse.equinox.app.IApplicationContext;
            stdOut.write(b);
        // In some places Eclipse reads this property directly.
            instance = null;
        int msgResult = messageBox.open();
            }
                } catch (IOException e) {
import org.eclipse.ui.internal.ide.ChooseWorkspaceDialog;

        final Display display = workbench.getDisplay();
    public void notifyVersionUpgrade(@NotNull Version currentVersion, @NotNull VersionDescriptor newVersion, boolean showSkip) {

        } catch (IOException e) {
            if (server != null) {
            props.setProperty(RESET_WORKSPACE_CONFIGURATION, Boolean.TRUE.toString());
        }
                }
        }
        }
                    final URL selectedWorkspaceURL = lwPath.toUri().toURL();
                    }
        defaultWorkspacePath = Path.of(workingDirectory).resolve(defaultAppWorkspaceName);
                        switch (msgResult) {
                    }
    /**
                        return IApplication.EXIT_OK;
 */
                } catch (IOException e) {

            if (display == null) {
            display.addFilter(event, idleListener);
        if (ArrayUtils.contains(Platform.getApplicationArgs(), "-nosplash")) {
    @Override
            oldSystemErr = System.err;
                previousVersionWorkspaceDir = oldWorkspaceDir;
    private void markLocationReadOnly(Location instanceLoc) {

        }
        saveStartupActions();
                    // Check for locked workspace
            System.setProperty("javax.net.debug", "all");
    }
            // for now restart is used, and exit data properties are checked
}
            props.setProperty(RESET_USER_PREFERENCES, Boolean.TRUE.toString());
                    break;
            }
                            "Can't lock workspace at " + defaultHomePath + ".\n" +

    }

        // Workspace dir

                return EXIT_OK;
        ProxyPrintStream(OutputStream debugWriter, OutputStream stdOut) {
    private static final String RESET_USER_PREFERENCES = "reset_user_preferences";
        props.setProperty(VERSION_PROP_PRODUCT_VERSION, GeneralUtils.getProductVersion().toString());
        return msgResult;
            System.setOut(new PrintStream(new ProxyPrintStream(debugWriter, oldSystemOut)));
import org.eclipse.equinox.app.IApplication;
                log.trace("Deleting " + file);
    }
        try {
    }
    }
    public static final String[] WORKSPACE_DIR_PREVIOUS = {

    public void setReuseWorkspace(boolean reuseWorkspace) {
        Properties props = BaseWorkspaceImpl.readWorkspaceInfo(metadataFolder);
        if (CommonUtils.isEmpty(logLocation)) {
            return;
                return CLIConstants.EXIT_CODE_ERROR;
        System.setProperty(ECLIPSE_EXIT_DATA, "");
    private static final String STARTUP_ACTIONS_FILE = "dbeaver-startup-actions.properties";
            // Set display name at the very beginning (#609)
    public boolean isExclusiveMode() {

    private void saveStartupActions() {

    }
            // Just skip it
            // here to substitute in the relaunch return code if needed
        }
                    if (exclusiveMode || reuseWorkspace) {
            public FileVisitResult visitFile(Path file, @NotNull BasicFileAttributes attrs) {
                        }
            shutdown();
/**
            debugWriter = null;
            @Override
            }
    static DBeaverApplication instance;
            return IApplication.EXIT_OK;
            }
    }
        VersionUpdateDialog dialog = new VersionUpdateDialog(
        @Override
    }
    public boolean isCommunity() {

        writeWorkspaceInfo();


    @Override
    }
    public Class<? extends DBPPlatform> getPlatformClass() {

                processStartupActions(instancePath, properties.stringPropertyNames());

            // return that code now, otherwise this is a normal restart
        try {
                shell.setImages(Window.getDefaultImages());

        Shell shell = new Shell(getDisplay(), SWT.ON_TOP);
import org.jkiss.utils.IOUtils;
        // Register core components
        } finally {
                System.err.println("Error creating metadata folder '" + metadataFolder + "': " + e.getMessage());
            // Error may occur if -data parameter was specified at startup
    public Class<? extends DBPPlatformUI> getPlatformUIClass() {
        }
                : EXIT_RESTART;
        messageBox.setText(title);
        });
            stdOut.write(b, off, len);
                    if (!instanceLoc.isLocked()) {
            instancePath = RuntimeUtils.getLocalPathFromURL(instanceLoc.getURL()).resolve(DBPWorkspace.METADATA_FOLDER);
                display = PlatformUI.createDisplay();
        return FILE_WITH_WORKSPACES;
                    return FileVisitResult.CONTINUE;
        if (debugWriter != null) {
        activateProxyService();
        } finally {
            @NotNull

                    if (!setDefaultWorkspacePath(instanceLoc)) {


        Location location = Platform.getInstanceLocation();
        return args;
            DBeaverWorkspaces.flushRecentWorkspaces(this, location);
            e.printStackTrace(System.err);
            this.debugWriter = debugWriter;
                // the task bar and without these calls you'd have the default icon
 * You may obtain a copy of the License at
        Path defaultDir = getDefaultWorkingFolder();
    }
            Path path = GeneralUtils.getMetadataFolder().resolve(STARTUP_ACTIONS_FILE);
        Path path = instancePath.resolve(WORKSPACE_PLUGINS_FOLDER);
        }

            System.setProperty("java.net.preferIPv4Stack", String.valueOf(stack == ModelPreferences.IPType.IPV4));
        } catch (Throwable e) {
        if (RuntimeUtils.isWindows() && isStandalone()) {
    public Path getDefaultWorkingFolder() {

                return FileVisitResult.SKIP_SUBTREE;
import org.eclipse.swt.graphics.Resource;
import org.jkiss.dbeaver.model.cli.CLIConstants;
                Path lwPath = Path.of(lastWorkspace);
        // Initialize display early
            if (arg.equals(CLIConstants.COMMAND_REUSE_WORKSPACE)) {
    }
            return;
    }
            if (Files.exists(oldWorkspaceDir) &&

            // Lock the workspace
        // Detect default workspace location
        log.debug("Instance path: '" + instanceLoc.getURL() + "'"); //$NON-NLS-1$ //$NON-NLS-2$
        return null;
    private boolean resetUserPreferencesOnRestart, resetWorkspaceConfigurationOnRestart;
                    ConfigurationScope.INSTANCE,
            debugWriter.flush();
                        keepTrying = false;
                log.error("Unable to delete startup actions file: " + e.getMessage());
            try {
        boolean ideWorkspaceSet = setIDEWorkspace(instanceLoc);
            actionsPath = instancePath.resolve(STARTUP_ACTIONS_FILE);
        if (display == null) {


            }
        }
            log.error("Error initializing application", e);
        return true;
        } catch (Throwable e) {
        // Explicitly set UTF-8 as default file encoding
import org.jkiss.dbeaver.*;
            if (RuntimeUtils.isWindows() && preferenceStore.getBoolean(ModelPreferences.PROP_USE_WIN_TRUST_STORE_TYPE)) {
    }
        }
        String logLocation = preferenceStore.getString(DBeaverPreferences.LOGS_DEBUG_LOCATION);
                props.store(writer, "DBeaver startup actions");
import org.osgi.framework.Version;
        String workingDirectory = RuntimeUtils.getWorkingDirectory(defaultWorkspaceLocation);

        getDisplay();
        try (Reader reader = Files.newBufferedReader(actionsPath)) {
            }
        Path previousVersionWorkspaceDir = null;
        {
            }

        }
        initDebugWriter();
            } catch (Exception e) {
    /**
        });
        return instance;
        Path instancePath;

 * This class controls all aspects of the application's execution
                log.error("Error processing command line parameters", e);
                    throw e;
 *
        }
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        try {

    @Override
            if (shell != null) {
    private final Path FILE_WITH_WORKSPACES;
    }
        private final OutputStream stdOut;

import org.jkiss.dbeaver.runtime.ui.console.ConsoleUserInterface;
            while (keepTrying) {
                    if (!CommonUtils.isEmpty(cliProcessResult.getOutput())) {
    }
        }
import java.util.Properties;
        private final OutputStream debugWriter;
            return IApplication.EXIT_OK;
                reuseWorkspace = true;
            return;
    private long lastUserActivityTime = -1;
            }
        display.syncExec(() -> {
import org.eclipse.swt.SWT;
                    if (!setDefaultWorkspacePath(instanceLoc)) {
                                "It seems that you have another DBeaver instance running.\n" +
        }
import org.jkiss.dbeaver.model.app.DBPWorkspace;
            return IApplication.EXIT_OK;
                System.setProperty(GeneralUtils.PROP_TRUST_STORE_TYPE, GeneralUtils.VALUE_TRUST_STORE_TYPE_WINDOWS);
     * May be overrided in implementors
                workbench.close();

                if (!defaultWorkspacePath.equals(lwPath)) {
                        int msgResult = showMessageBox(
    }
    @Override
                try {
            Field isReadOnlyField = instanceLoc.getClass().getDeclaredField("isReadOnly");
            log.debug(e);
        }
            }

            });
            log.debug("DBeaver shutdown completed"); //$NON-NLS-1$
            DBWorkbench.getPlatform();
            DBeaverInstanceServer server = instanceServer;
        Path defaultHomePath = getDefaultInstanceLocation();
import java.io.*;
    @NotNull
        }
                    return FileVisitResult.CONTINUE;
        log.debug("OS: " + System.getProperty(StandardConstants.ENV_OS_NAME) + " " + System.getProperty(StandardConstants.ENV_OS_VERSION) + " (" + System.getProperty(StandardConstants.ENV_OS_ARCH) + ")");
            log.error("Unable to read startup actions", e);
        if (debugNetworkConnections) {
        }
        log.debug("DBeaver is stopping"); //$NON-NLS-1$
    public void setResetUserPreferencesOnRestart(boolean resetUserPreferencesOnRestart) {
    @NotNull
        } finally {

        }
                if (instanceLoc.isLocked() || !instanceLoc.set(defaultHomeURL, true)) {
/*


import org.jkiss.dbeaver.runtime.DBWorkbench;

            // Make URL manually because file.toURI().toURL() produces bad path (with %20).
            }
    }
            try (Writer writer = Files.newBufferedWriter(path)) {
                                "You may ignore it and work without lock but it is recommended to shutdown previous instance otherwise you may corrupt workspace data.",
 * Copyright (C) 2010-2026 DBeaver Corp and others
                        }
            currentVersion,
import org.eclipse.swt.widgets.MessageBox;
    @NotNull
    }
    @Nullable
        }
            try {

import org.eclipse.osgi.service.datalocation.Location;
        if (instanceLoc.isSet()) {
        }
        } catch (DBException e) {
    }
            Display.setAppName(GeneralUtils.getProductName());

                CLIProcessResult cliProcessResult = DBeaverCommandLine.getInstance()
import org.jkiss.dbeaver.model.app.DBPApplicationController;
        @NotNull Path instancePath,
                System.err.println("Unable to resolve workspace location " + instanceLoc);
        public void write(@NotNull byte[] b) throws IOException {
import org.eclipse.core.runtime.Platform;
                                instanceLoc.set(defaultHomeURL, false);
/*
            boolean keepTrying = true;
    @Override
            //stopDebugWriter();
            addIdleListeners();
            if (returnCode != PlatformUI.RETURN_RESTART) {


        }

                shell.setText(ChooseWorkspaceDialog.getWindowTitle());

                    return true;

        @Override
    protected void initializeApplication() throws DBException {
            final Path oldWorkspaceDir = Path.of(oldDir);
 *     http://www.apache.org/licenses/LICENSE-2.0
            log.debug("Proxy service '" + IProxyService.class.getName() + "' loaded");
            // if the exit code property has been set to the relaunch code, then
                RuntimeUtils.runTask(monitor -> server.stopInstanceServer(), "Stop instance server", 1000);
    private static void activateProxyService() {
        // Debug logger
    }

import org.jkiss.dbeaver.utils.SystemVariablesResolver;

        Files.walkFileTree(path, new SimpleFileVisitor<>() {
                // with no message.
        DBPPreferenceStore preferenceStore = DBeaverActivator.getInstance().getPreferences();
 * you may not use this file except in compliance with the License.
            final URL defaultHomeURL = defaultHomePath.toUri().toURL();

                }
                }
        }
        }
                        return IApplication.EXIT_OK;
        }
        @Override

                Job.getJobManager().join(null, new NullProgressMonitor());
        ) {
        // Since 6.1.3 it is different for different OSes
    public static final String WORKSPACE_DIR_LEGACY = "${user.home}/.dbeaver"; //$NON-NLS-1$

            IOUtils.close(debugWriter);
    public DBeaverApplication() {
        final boolean resetWorkspaceConfiguration = actions.contains(RESET_WORKSPACE_CONFIGURATION);
                        instanceLoc.set(defaultHomeURL, false);
                    markLocationReadOnly(instanceLoc);
    public void setExclusiveMode(boolean exclusiveMode) {
        return instanceServer;

                    log.trace("Unable to delete " + dir + ":" + e.getMessage());

            debugWriter.write(b);

        }

        if (isExclusiveMode()) {
            } catch (Exception e) {
                break;
import org.jkiss.dbeaver.ui.app.standalone.rpc.DBeaverInstanceServer;

                try {

import java.util.stream.Stream;
    }
                log.debug(e);

    }
        } catch (Throwable e) {
                    WindowsDefenderConfigurator.PREFERENCE_STARTUP_CHECK_SKIP, "true"); //$NON-NLS-1$
            final Properties properties = new Properties();
 * limitations under the License.
        if (previousVersionWorkspaceDir != null) {
        return headlessMode;

        logLocation = GeneralUtils.replaceVariables(logLocation, new SystemVariablesResolver());

        Location instanceLoc = Platform.getInstanceLocation();

        // Linux: $XDG_DATA_HOME/DBeaverData
            instanceServer = DBeaverInstanceServer.createServer();
                                keepTrying = false;
            }
        }
        }
            // look and see if there's a splash shell we can parent off of
    public DBPPreferenceStore getPreferenceStore() {
    /**
    }

        if (Files.notExists(path) || !Files.isDirectory(path)) {
        }
        }
            log.debug("Run workbench");
            // ignore

        this.reuseWorkspace = reuseWorkspace;
        try {
                    }

    public IInstanceController getInstanceServer() {
        try {
            && CommonUtils.isEmpty(System.getProperty(GeneralUtils.PROP_TRUST_STORE_TYPE))

        shell.dispose();
import org.eclipse.core.runtime.preferences.ConfigurationScope;
                try {
import java.util.Set;
            e.printStackTrace();
        messageBox.setMessage(message);
    public static final String WORKSPACE_DIR_4 = "${user.home}/.dbeaver4"; //$NON-NLS-1$
                if (resetUserPreferences && !relative.startsWith(CORE_RESOURCES_PLUGIN_ID)) {
            System.err.println("Error updating splash shell");
    private void loadStartupActions(@NotNull Location instanceLoc) {
    static final String VERSION_PROP_PRODUCT_VERSION = "product-version";
                    return FileVisitResult.CONTINUE;
        }
                }

                if (!instanceLoc.isSet()) {
import org.jkiss.dbeaver.model.impl.app.BaseWorkspaceImpl;
        if (!preferenceStore.getBoolean(DBeaverPreferences.LOGS_DEBUG_ENABLED)) {
            return false;

            if (e instanceof DBRuntimeException re) {
    private static final String DEFAULT_PROJECT_NAME = "General";


    private static final String RESET_WORKSPACE_CONFIGURATION = "reset_workspace_configuration";
            System.setProperty("java.net.preferIPv6Addresses", String.valueOf(address == ModelPreferences.IPType.IPV6));
            log.debug("Proxy service not found");
        this.exclusiveMode = exclusiveMode;

                            case SWT.IGNORE:
    }
    private Display getDisplay() {
        return DBeaverInstanceServer.createClient(getDefaultInstanceLocation());
            display = Display.getCurrent();
    }
            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
import org.eclipse.jface.window.Window;
            }
                if (cliProcessResult.getPostAction() == CLIProcessResult.PostAction.SHUTDOWN) {
    private boolean exclusiveMode = false;
            int returnCode = PlatformUI.createAndRunWorkbench(display, createWorkbenchAdvisor());
            }
import org.jkiss.dbeaver.registry.updater.VersionDescriptor;
public class DBeaverApplication extends DesktopApplicationImpl implements DBPApplicationController {
import org.eclipse.ui.PlatformUI;
    public Path getDefaultInstanceLocation() {
    ) throws Exception {
    @Override
            SWTBrowserRegistry.overrideBrowser();
                            case SWT.ABORT:
package org.jkiss.dbeaver.ui.app.standalone;
            }
                    }
    public boolean isStandalone() {
     */
        // hide standard Eclipse exit message if exit code is not OK (otherwise it may be confusing)
        return DesktopPlatform.class;
        final Properties props = new Properties();
            headlessMode = false;
            @Override
        ModelPreferences.IPType stack = ModelPreferences.IPType.getPreferredStack();
        int [] events = {SWT.KeyDown, SWT.KeyUp, SWT.MouseDown, SWT.MouseMove, SWT.MouseUp, SWT.MouseWheel};
            isReadOnlyField.setAccessible(true);
                if (isExclusiveMode()) {
            Shell shell = WorkbenchPlugin.getSplashShell(display);

                        for (String res : cliProcessResult.getOutput()) {
import org.jkiss.utils.StandardConstants;

            public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
                Files.createDirectories(metadataFolder);
            return;

            if (!Files.exists(defaultHomePath) || isEmptyFolder(defaultHomePath)) {
        if (CommonUtils.isEmpty(System.getProperty(GeneralUtils.PROP_TRUST_STORE))
                if (resetWorkspaceConfiguration && relative.startsWith(CORE_RESOURCES_PLUGIN_ID)) {
                if (!tryMigrateFromPreviousVersion(defaultHomePath)) {
            try {

            }
 * See the License for the specific language governing permissions and
