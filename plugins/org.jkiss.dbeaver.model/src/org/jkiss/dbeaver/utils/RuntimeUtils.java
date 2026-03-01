                    return Status.OK_STATUS;
            if (appData == null) {
        }

                            state = CommandLineState.NORMAL;
        BundleLocalization location = localizationTracker.current().orElse(null);
    }
            }
    public static <T> T getObjectAdapter(@NotNull Object adapter, @NotNull Class<T> objectType, boolean force) {
    /**
        return null;
        return workingDirectory;
    public static IStatus stripStack(@NotNull IStatus status) {
                see dbeaver#15117
                    Object fieldValue = field.get(object);
        }
            try {
                if (!out.isEmpty()) {
        try {
    @NotNull
            }
                setSystem(hidden);
        return runTask(task, taskName, waitTime, false);
                setUser(!hidden);
             */
    // Returns plugin state folder and do not create it (as default Eclipse function does)
    }
        ServiceReference<T> serviceReference = bundleContext.getServiceReference(theClass);
    }
import org.eclipse.core.internal.runtime.CommonMessages;
                            argument.append(ch);
        @NotNull String binPath,
        volatile boolean finished;
        return monitor.getNestedMonitor();
import org.osgi.framework.*;
    }
import org.jkiss.code.Nullable;
            for (int i = 0; i < children.length; i++) {
    private static void readStringToBuffer(@NotNull InputStream is, @NotNull StringBuilder out) throws IOException {
    public static byte[] getLocalMacAddress() throws IOException {
    @NotNull
    @NotNull
    // Activator.getLocalization became static after 2023-09
    }
        try {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        return service;
    @NotNull
    }
            String[] cmd = args == null ? cmdBin : ArrayUtils.concatArrays(cmdBin, args);
        }

            return out.toString();
                if (out.isEmpty()) {
        if (service == null) {
            }
     *
    @NotNull
                        }


        String userHome = System.getProperty(StandardConstants.ENV_USER_HOME); //$NON-NLS-1$
                throw new DBException(err.toString());
import org.eclipse.core.runtime.jobs.Job;
                Class<?> serviceClass = refAnno.service();
    public static Path getLocalPathFromURL(@NotNull URL fileURL) throws IOException {
                appData = System.getProperty(StandardConstants.ENV_USER_HOME);
            String[] cmdBin = {binPath};
            if (p.exitValue() != 0) {
                    return Status.OK_STATUS;
        Thread.currentThread().setName("DBeaver: " + name);
            return null;

        return isWindows() ? binName + ".exe" : binName;
    @Nullable
    public static void pause(int ms) {
                p.destroy();
            String[] cmdBin = {binPath};
        InetAddress localHost = getLocalHostOrLoopback();
        }
    private RuntimeUtils() {

    public static List<String> splitCommandLine(@NotNull String input, boolean escapesSupported) {
        } catch (Exception ex) {
import org.jkiss.dbeaver.model.connection.DBPNativeClientLocation;
        IS_OS_ARCH_AARCH64 = Platform.ARCH_AARCH64.equals(arch);


                        field.set(object, bundleService);
     *
                }
     * Determines whether the <i>OS</i> ISA is AArch64.
                messagePrefix = status.getException().getClass().getName() + ": ";
    public static String getCurrentTime() {
                return new Status(status.getSeverity(), status.getPlugin(), status.getCode(), messagePrefix + status.getMessage(), null);
    private static final boolean IS_OS_ARCH_AARCH64;
     * @return version of the operating system, or {@link Version#emptyVersion} if the version is unknown
    public static void injectComponentReferences(@NotNull Object object) {
    public static boolean isOSArchAArch64() {
        JobGroup jobGroup = new JobGroup("executeJobsForEach:" + objects, 10, 1);
        }
    ) {
        }
import java.io.*;
    public static String formatExecutionTime(long ms) {
public final class RuntimeUtils {
            IStatus[] children = status.getChildren();
                default:
            }
                            postProcessMethod.setAccessible(true);
        return result;
        for (T object : objects) {
                escaped = false;
    }
 */
     * @param input            input string to be split
            // dbeaver/pro#2157
    private static final byte[] NULL_MAC_ADDRESS = new byte[] {0, 0, 0, 0, 0, 0};
                case SINGLE_QUOTE:
    @NotNull
import org.eclipse.core.runtime.*;
            /*
        try {
                e.getMessage());
    }
     * Checks if current application is shipped from Windows store
            }
                throw dbe;

        }
            throw new DBException("Error executing process " + binPath, ex);
            }
import org.jkiss.dbeaver.Log;
                        argument.append(next);
                File can't accept URI with file authority in it. This created a problem for shared folders.

                        if (bundleService != null && !CommonUtils.isEmpty(refAnno.postProcessMethod())) {

    @NotNull
    }
        return ni == null || ni.getHardwareAddress() == null ? NULL_MAC_ADDRESS : ni.getHardwareAddress();
        if (userHome == null) {
            throw new IOException("Bad local file path: " + fileURL, e);
    public static IProgressMonitor getNestedMonitor(@NotNull DBRProgressMonitor monitor) {

 * DBeaver - Universal Database Manager
        } catch (URISyntaxException e) {
            AbstractJob job = new AbstractJob("Execute for " + object) {
                throw new IllegalStateException("Service '" + theClass.getName() + "' implementation not found");
        return new SimpleDateFormat(GeneralUtils.DEFAULT_DATE_PATTERN, Locale.ENGLISH).format(new Date()); //$NON-NLS-1$
        }
                        } else if (state == CommandLineState.NORMAL) {
                    serviceClass = field.getType();
                try {

            if (entry.getKey().equalsIgnoreCase(key)) {
     *
            }
                "Resource bundle '" + bundle.getSymbolicName() + "' not found for locale " + locale,
        return IS_WINDOWS;
    }
        private MonitoringTask(DBRRunnableWithProgress task) {

            while (!jobGroup.join(50, new NullProgressMonitor())) {
                        }
        NetworkInterface ni = NetworkInterface.getByInetAddress(localHost);
        try {

import java.text.SimpleDateFormat;
                return true;
        }
    private static final boolean IS_MACOS;
    }

        return isLinux() && CommonUtils.isNotEmpty(System.getenv("WAYLAND_DISPLAY"));
            }
                break;
        return false;

    public static <T> T getObjectAdapter(@NotNull Object adapter, @NotNull Class<T> objectType) {
                    StringBuilder err = new StringBuilder();
import java.lang.reflect.InvocationTargetException;
            readStringToBuffer(p.getInputStream(), out);
        }
     */
        return new SimpleDateFormat(GeneralUtils.DEFAULT_TIME_PATTERN, Locale.ENGLISH).format(new Date()); //$NON-NLS-1$
    }
                    } else {
        };
import java.net.*;
                File can't accept URI with file authority in it. This created a problem for shared folders.
        if (result == null)
    public static boolean isTypeSupported(Class<?> type, Class<?>[] supportedTypes) {
        //intentionally left blank
        for (String name : props.stringPropertyNames()) {
        final StringBuilder argument = new StringBuilder();
        IS_LINUX = Platform.OS_LINUX.equals(os);
             */

                workingDirectory = goodWorkingDir;
                            state = CommandLineState.NORMAL;
        } finally {
                return new Version(version);
        return IS_OS_ARCH_AARCH64;
                bundle.getSymbolicName(), ""); //$NON-NLS-1$
        }
                case NORMAL:
    public static Path getPlatformFile(@NotNull String platformURL) throws IOException {
                case NONE:
                            escaped = true;
                readStringToBuffer(p.getInputStream(), out);
                {

        private final DBRRunnableWithProgress task;
import org.jkiss.utils.ArrayUtils;
        String version = System.getProperty("os.version");
    @NotNull
        return property != null && property.equalsIgnoreCase("true");
        }
        try {
    @NotNull
import org.jkiss.dbeaver.model.meta.ComponentReference;
                    if (!monitor.isCanceled()) {

import org.jkiss.code.NotNull;
                StringBuilder out = new StringBuilder();

        } catch (Throwable e) {
 * You may obtain a copy of the License at
        return dumpBinary;
     * @see #isOSVersionAtLeast(int, int, int)
        if (ni == null) {
            throw new DBException("Error executing process " + binPath, ex);

     */
    private static final boolean IS_WINDOWS;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


        final List<String> arguments = new ArrayList<>();
    public static boolean isMacOS() {
    }
                        }
                case DOUBLE_QUOTE:
        return Version.emptyVersion;
                    monitor.done();
            }
        return new SimpleDateFormat(GeneralUtils.DEFAULT_TIMESTAMP_PATTERN, Locale.ENGLISH).format(new Date()); //$NON-NLS-1$
        // Wait for job to finish
        if (force) {
        }
    public static boolean isOSVersionAtLeast(int major, int minor, int micro) {
            @NotNull
                ""); //$NON-NLS-1$
        String os = Platform.getOS();
                log.debug("Error parsing OS version: " + version, e);
    }

    }
}
import org.eclipse.core.internal.runtime.Activator;
            String[] cmd = args == null ? cmdBin : ArrayUtils.concatArrays(cmdBin, args);
    private static final boolean IS_OS_ARCH_AMD64;
     * @return a list of separate, unquoted arguments
        }
        }
    public static boolean isLinux() {
            if (tmp.isAssignableFrom(type)) {
        T service = bundleContext.getService(serviceReference);
                return Path.of(filePath.getSchemeSpecificPart());
            argument.append('\\');
    @Nullable
            this.task = task;
            userHome = ".";
            }
     * @deprecated consider using {@link DurationFormatter#format(Duration, DurationFormat)} instead
                // Let's use bad working dir if it exists (#6316)
    }
            if (refAnno != null) {
     */
            String badWorkingDir = dataHome + "/." + subPath;
 * Licensed under the Apache License, Version 2.0 (the "License");
            return monitor1;

            }
        } catch (Exception ex) {
        Class<?> aClass = object.getClass();
            }
                return Path.of(filePath.getSchemeSpecificPart());
            /*
                        break;
            String messagePrefix;
        } catch (InterruptedException e) {
                String line = input.readLine();
    }
        ResourceBundle result = null;
            Process p = Runtime.getRuntime().exec(cmd);
                            log.debug(e.getTargetException());
    @NotNull

                children[i] = stripStack(children[i]);
            throw new MissingResourceException(
    @NotNull
            }
                }
            }
    }
        return getLocalFileFromURL(fileURL);

    }
        return monitoringTask.finished;
import org.jkiss.utils.StandardConstants;
                DBWorkbench.getPlatformUI().readAndDispatchEvents();
     * Determines whether the <i>OS</i> ISA is AMD64.
        boolean hidden
            workingDirectory = appData + "\\" + subPath;
    }
    public static ResourceBundle getBundleLocalization(@NotNull Bundle bundle, @NotNull String locale) throws MissingResourceException {
        URL url = new URL(platformURL);
        IAdapterManager adapterManager = Platform.getAdapterManager();
    }
    }
    }
        if (monitor instanceof IProgressMonitor monitor1) {
package org.jkiss.dbeaver.utils;
    }
        }
            return Path.of(filePath);
    }

                    }
    }
            }

            }
        }

    private static final Log log = Log.getLog(RuntimeUtils.class);
                }
            if (filePath.getAuthority() != null) {
            if (niEnum.hasMoreElements()) {
    public static File getNativeClientBinary(@NotNull DBPNativeClientLocation home, @Nullable String binFolder, @NotNull String binName) throws IOException {

                            state = CommandLineState.NONE;
                argument.append(ch);
     * Splits command line string into a list of separate arguments,
                @NotNull
                    if (fieldValue == null) {
        for (Field field : aClass.getDeclaredFields()) {
                        } else if (!Character.isWhitespace(ch)) {
        binName = getNativeBinaryName(binName);
        }
    public static boolean isWindows() {
    public static String executeProcessAndCheckResult(
import java.util.*;
        if (status instanceof MultiStatus) {
                if (line == null) {
        @NotNull String taskName,
            arguments.add(argument.toString());
                    }
                        state = CommandLineState.SINGLE_QUOTE;
                    out.append("\n");
        Version actual = getOSVersion();
        @NotNull Collection<? extends T> objects,
            };
            }
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            StringBuilder err = new StringBuilder();
            StringBuilder out = new StringBuilder();
                bundle.getSymbolicName(),
            } else {
            @Override
    public static Path getLocalFileFromURL(@NotNull URL fileURL) throws IOException {
                        if (next != quote && next != '\\') {
    /**
                } catch (InterruptedException e) {
    /**

    private enum CommandLineState {
                    break;


import org.jkiss.dbeaver.DBException;
 *
     *
        Activator activator = Activator.getDefault();
    public static String executeProcess(@NotNull String binPath, @Nullable String... args) throws DBException {
        DOUBLE_QUOTE
    public static boolean isWindowsStoreApplication() {
    private static final boolean IS_LINUX;
        SINGLE_QUOTE,
                return Status.OK_STATUS;
        boolean headlessMode = DBWorkbench.getPlatform().getApplication().isHeadlessMode();
            try {
        Version expected = new Version(major, minor, micro);

            if (status.getException() != null && (CommonUtils.isEmpty(status.getException().getMessage()))) {
        return Platform.getAdapterManager().getAdapter(adapter, objectType);
            localizationTracker = BeanUtils.getFieldValue(activator, "localizationTracker");
        @Override
        pause(10);
                    monitoringTask.run(monitor);
            if (headlessMode || !DBWorkbench.getPlatformUI().readAndDispatchEvents()) {
        Job monitorJob = new AbstractJob(taskName) {
    public static String getCurrentTimeStamp() {
    }
            }
        NORMAL,
                try {
                out.append(line);
    private static class MonitoringTask implements DBRRunnableWithProgress {
            if (escaped) {
import org.jkiss.dbeaver.model.DBConstants;
    ) throws DBException {
            ComponentReference refAnno = field.getAnnotation(ComponentReference.class);
            {
            log.debug("Sleep interrupted", e);
    ) {
     * @return true if shipped from Windows store, false if not.
            } else {
import org.eclipse.osgi.service.localization.BundleLocalization;
import org.jkiss.utils.BeanUtils;
        }
        }

        return actual.compareTo(expected) >= 0;
            return InetAddress.getLocalHost();
import org.jkiss.utils.CommonUtils;
        } catch (URISyntaxException e) {
                    readStringToBuffer(p.getErrorStream(), err);

        } else {
     */
        if (version != null) {
            if (filePath.getAuthority() != null) {
     * @return true if running on Wayland, false otherwise
            if (!new File(goodWorkingDir).exists() && new File(badWorkingDir).exists()) {
                    break;
    }

                monitor.beginTask(getName(), 1);
        // Short pause. Eclipse 2023-12 seems to have an issue which locks readAndDispatchEvents
    /**
            }

                            task.run(monitor, object);

    @NotNull
            } finally {
    @Nullable
        // Escape spaces to avoid URI syntax error
    @NotNull
        String workingDirectory;
                workingDirectory = badWorkingDir;
    public static boolean runTask(@NotNull DBRRunnableWithProgress task, @NotNull String taskName, final long waitTime) {
                throw new IllegalStateException("Service '" + theClass.getName() + "' is not registered");
    public static boolean runTask(
 * RuntimeUtils
 *     http://www.apache.org/licenses/LICENSE-2.0
            adapterManager.loadAdapter(adapter, objectType.getName());
     *
                }
    public static boolean isWayland() {
                }
            result = location.getLocalization(bundle, locale);
    public static String getSystemPropertyIgnoreCase(@NotNull String key) {
            dumpBinary = new File(home.getPath(), binName);
                    if (ch == '\'') {
    public static <T> T getBundleService(@NotNull Class<T> theClass, boolean required) throws IllegalStateException {
        }
        return new File(userHome);
        Bundle bundle = FrameworkUtil.getBundle(theClass);

     * <p>Note that this method is designed to tell the <i>OS</i> ISA, not <i>JVM</i> ISA.
import java.lang.reflect.Method;

            String dataHome = System.getProperty("XDG_DATA_HOME");
    }
     * @param escapesSupported whether escapes using {@code \} are supported or not

        final Map<String, String> env = System.getenv();
                    } else if (ch == '"') {
        boolean escaped = false;
                    log.error(getName() + " - error", e.getTargetException());
                    } else {
 * See the License for the specific language governing permissions and
                    } else if (ch == quote) {
            if (required) {
        }
            throw new IOException("Bad local file path: " + fileURL, e);
                return entry.getValue();
            switch (state) {
    public static boolean isOSArchAMD64() {
                }

        public void run(DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                        final char next = input.charAt(++index);
        return null;
     *
                    if (e instanceof InvocationTargetException ite && ite.getTargetException() instanceof RuntimeException re) {
        long startTime = System.currentTimeMillis();


    }

            final char quote = state == CommandLineState.SINGLE_QUOTE ? '\'' : '"';
            binFolder == null ? binName : binFolder + "/" + binName);
        }
     * @return {@code true} if the OS ISA is AMD64


        IS_OS_ARCH_AMD64 = Platform.ARCH_X86_64.equals(arch);

/**

        if (serviceReference == null) {
                return status;
    }
            if (required) {
        return new DefaultProgressMonitor(monitor);
            }
    @NotNull
 * limitations under the License.
        @NotNull DBRRunnableParametrizedWithProgress<? super T> task
    public static Path getPluginStateLocation(Plugin plugin) {
    }
    static {
            return Path.of(filePath);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.*;
            // ignore
        } else if (isMacOS()) {
            return InetAddress.getLoopbackAddress();
            Process p = Runtime.getRuntime().exec(cmd);
                    setUser(false);
    public static String getNativeBinaryName(String binName) {
    public static DBRProgressMonitor makeMonitor(@NotNull IProgressMonitor monitor) {
    public static void setThreadName(@NotNull String name) {
                protected IStatus run(@NotNull DBRProgressMonitor monitor) {
                        } catch (InterruptedException e) {

 *
        } else {
    /**

     */
            log.debug("Error resolving localhost address: " + e.getMessage());
                            argument.append(ch);
    // Extraction from Eclipse source to support old and new API versions
                    }
     *
     * @return {@code true} if the OS ISA is AArch64
                @Override
                bundle.getSymbolicName(),
    /**
                        argument.append(ch);
import org.eclipse.core.internal.runtime.InternalPlatform;
    }
    @NotNull
        return InternalPlatform.getDefault().getStateLocation(plugin.getBundle(), false).toPath();
                task.run(monitor);
        if (activator == null) {
                } finally {
    public static String getWorkingDirectory(@NotNull String subPath) {
            job.setJobGroup(jobGroup);
        URL fileURL = FileLocator.toFileURL(url);
        return adapterManager.getAdapter(adapter, objectType);
        String arch = Platform.getOSArch();

            if (name.equalsIgnoreCase(key)) {
        if (location != null)


            return new MultiStatus(status.getPlugin(), status.getCode(), children, status.getMessage(), null);
        if (monitor instanceof DBRProgressMonitor monitor1) {
        try (BufferedReader input = new BufferedReader(new InputStreamReader(is))) {
                            postProcessMethod.invoke(bundleService);
                ni = niEnum.nextElement();
            p.waitFor();
 * you may not use this file except in compliance with the License.
        try {
    @NotNull
        } catch (InterruptedException e) {

    public static File getUserHomeDir() {
                    throw new IllegalStateException(e);
            Enumeration<NetworkInterface> niEnum = NetworkInterface.getNetworkInterfaces();
                } catch (InvocationTargetException e) {
            workingDirectory = System.getProperty(StandardConstants.ENV_USER_HOME) + "/Library/" + subPath;
import java.lang.reflect.Field;
                return out.toString();

        try {
            return false;
    public static String getSystemEnvIgnoreCase(@NotNull String key) {
                            argument.setLength(0);

                            arguments.add(argument.toString());
import java.nio.file.Path;
        }
    public static InetAddress getLocalHostOrLoopback() {
            Thread.sleep(ms);


        for (Class<?> tmp : supportedTypes) {
    }
                            Method postProcessMethod = bundleService.getClass().getDeclaredMethod(refAnno.postProcessMethod());
        try {
        @NotNull DBRRunnableWithProgress task,
    /**
            }
            }
            throw new MissingResourceException(CommonMessages.activator_resourceBundleNotStarted,
        return DurationFormatter.format(Duration.ofMillis(ms), DurationFormat.MEDIUM);
 *
            try {
                see dbeaver#15117
            String appData = System.getenv("AppData");
            }
            throw new MissingResourceException(
        return IS_OS_ARCH_AMD64;
        if (!IS_WINDOWS) {
                finished = true;
            // Linux
    }
                    return err.toString();

        final String property = System.getProperty(DBConstants.IS_WINDOWS_STORE_APP);
        if (isWindows()) {
        }
                    setSystem(true);
            RuntimeUtils.injectComponentReferences(service);
                        Object bundleService = getBundleService(serviceClass, refAnno.required());
 * Copyright (C) 2010-2026 DBeaver Corp and others
     * respecting quoted strings and escaped characters, similar to
    }
                }
            } catch (IllegalArgumentException e) {
    }
            job.schedule();
        for (int index = 0; index < input.length(); index++) {
            return false;
     *
     * <p>Note that this method is designed to tell the <i>OS</i> ISA, not <i>JVM</i> ISA.
            for (; ; ) {
        while (!monitoringTask.finished) {
                continue;
                    if (ch == '\\' && escapesSupported) {
                pause(50);
     * Checks if the system is running Linux with the Wayland server.
            if (ex instanceof DBException dbe) {

    }
                            return Status.CANCEL_STATUS;
            }
                    break;


                        state = CommandLineState.DOUBLE_QUOTE;


    @NotNull
        if (type == null || ArrayUtils.isEmpty(supportedTypes)) {
            arguments.add(argument.toString());
        monitorJob.schedule();
 */

        }
                    // do nothing
                        state = CommandLineState.NORMAL;
    }
        } catch (UnknownHostException e) {
        final Properties props = System.getProperties();
    @NotNull
            }
        if (!dumpBinary.exists()) {
    public static String getCurrentDate() {
    }
        NONE,
        @Nullable String... args
                    monitor.subTask("Execute task");
    }
    }


        CommandLineState state = CommandLineState.NONE;
            if (Modifier.isStatic(field.getModifiers())) {
            readStringToBuffer(p.getErrorStream(), err);
        }
                return props.getProperty(key);

                        }
            if (waitTime > 0 && System.currentTimeMillis() - startTime > waitTime) {
        try {
        IS_WINDOWS = Platform.OS_WIN32.equals(os);
                        field.setAccessible(true);
                dataHome = System.getProperty(StandardConstants.ENV_USER_HOME) + "/.local/share";
        } else if (state != CommandLineState.NONE) {
                    }
                        throw re;
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        IS_MACOS = Platform.OS_MACOSX.equals(os);
    public static <T> void executeJobsForEach(
                if (serviceClass == Object.class) {
                    break;

        } else if (status instanceof Status) {
import org.eclipse.core.runtime.jobs.JobGroup;

        for (Map.Entry<String, String> entry : env.entrySet()) {

            }
     * how terminals do that.
    @NotNull
                    }
    }
import java.time.Duration;
        }
    public static String getProcessResults(@NotNull Process p) throws IOException, InterruptedException, DBException {
            p.destroy();
    }
    @NotNull
    }
     */
        if (escaped) {

            return getProcessResults(p);
            }
            if (!dumpBinary.exists()) {
        }
     */
                        } catch (InvocationTargetException e) {
                        if (ch == '\\' && escapesSupported) {
            URI filePath = GeneralUtils.makeURIFromFilePath(fileURL.toString());
        }
        BundleContext bundleContext = bundle.getBundleContext();
    @NotNull
    }
                throw new IOException("Utility '" + binName + "' not found in client home '" + home.getDisplayName() + "' (" + home.getPath().getAbsolutePath() + ")");
/*
            } finally {
            }

        return arguments;
            if (dataHome == null) {
        }
                } catch (Exception e) {
    @Nullable
            String goodWorkingDir = dataHome + "/" + subPath;
        }
        ServiceCaller<BundleLocalization> localizationTracker;
    public static Version getOSVersion() {
                }
            }
                continue;
        return IS_MACOS;
    @Nullable
        return status;
    @NotNull
        File dumpBinary = new File(home.getPath(),
    }
                        try {

    }
        // Escape spaces to avoid URI syntax error
            URI filePath = GeneralUtils.makeURIFromFilePath(fileURL.toString());
     * Retrieves version of the operating system.
        return IS_LINUX;
            final char ch = input.charAt(index);
            return monitor1;
        final long waitTime,
import java.lang.reflect.Modifier;
        }
        final MonitoringTask monitoringTask = new MonitoringTask(task);
                "Resource bundle '" + bundle.getSymbolicName() + "' not found for locale " + locale,
