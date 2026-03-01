            } finally {
        }
            // fact be another -arg.
        } catch (Exception e) {
import javax.net.ssl.SSLContext;
     */
            System.setProperty(PROP_FRAMEWORK, url.toExternalForm());
    /**
            // look for the development mode and class path entries.
                return;
     * from most specific to most generic. So, in the FR_fr locale, it will return
            }
        try (ZipFile file = new ZipFile(jarPath)) {
        boolean hasAppParams = hasAppParameters(passThruArgs);
                return macConfiguration;
    private boolean protectBase = false;
     *
            CommandLineExecuteResult commandLineExecuteResult = processCommandLineAsClient(passThruArgs, dbeaverDataDir);

            } else
        protected String findLibrary(String name) {
    private static URL buildURL(String spec, boolean trailingSlash) {
    private static boolean isCompatibleWindowsVersion() {
                String destinationClasspath = System.getProperty(PROP_CLASSPATH);
                break;
                if (debug) {
                System.out.println("Install location is null, cannot load " + PRODUCT_SITE_MARKER);
            return null;
        if (source == null)
        }
                    //After all we are not in a shared configuration setup.
        if (debug) {
        if (osgiOs != null) {
            try {
            }
                continue;
        //build list of suffixes for loading resource bundles
            // look for the startup jar used
            if (args[i - 1].equalsIgnoreCase(FRAMEWORK)) {
                return super.findLibrary(name);
            // look for the command to use to show the splash screen
            if (debug) {
    }

        if (result != null)

    /**
    private static final String INSTALL = "-install"; //$NON-NLS-1$
        }
            return configurationLocation;
            return new CommandLineExecuteResult(cliMode);
            String fragmentOS = getOS();

            os = osgiOs;
            // same value as each other.
            } catch (MalformedURLException e1) {
    // command line args
                """

                    path = path.substring(5);
        }
    }
    }
                String appId = props.getProperty(PRODUCT_SITE_ID);
    private static final String ARG_DATA = "-data"; //$NON-NLS-1$
        if (obj instanceof Throwable) {
            short exitCode = -1;
                    """,
        if (osName.equals(Constants.OS_AIX))
     * Returns a files system path for an area in the user.home region related to the
        // remove all the arguments consumed by this argument parsing
            return;
    private static String[] buildNLVariants(String locale) {
        return name;
            log(e);
            }
        //as the argument, so only use it if it isn't a number and the file exists.
            }
            }
                    devClassPath = devClassPathProps.getProperty(OSGI);
                    buf.append("%2B"); //$NON-NLS-1$
            }
        //add the empty suffix last (most general)
            }
                write(obj);
    private Object[] getVersionElements(String version) {
            System.out.println("Framework classpath:"); //$NON-NLS-1$
                System.err.println("An exception occurred while logging to the console:"); //$NON-NLS-1$
                // dev path is relative, combine with base location
    private CommandLineExecuteResult processCommandLineAsClient(String[] args, Path dbeaverDataDir) throws Exception {

            else
                // the leading / on if necessary)
                File toAdjust = new File(spec);
            return arch;
        String[] nlVariants = buildNLVariants(locale);
            boolean found = false;
        buffer.add(PLUGIN_ID).add(fragmentWS).add(fragmentOS);
                System.setProperty(PROP_EXITCODE, Integer.toString(commandLineExecuteResult.exitCode()));
     * Sets up the JNI bridge to native calls
            }
    }
                    throw new RuntimeException("The location cannot start with '" + INSTALL_HASH_PLACEHOLDER + "': " + location); //$NON-NLS-1$ //$NON-NLS-2$
            // not same protocol
        try {
                continue;
    protected String ws = null;
    private void addDevEntries(URL base, List<URL> result, String symbolicName) throws MalformedURLException {
                    protectBase = true;
     * given required version.
import java.util.concurrent.Executors;
    protected String os = null;
            }
            return ws;
                libPath = getLibraryFromFragment(fragment);
                System.out.println("Error during calling DBeaver server: " + e.getMessage());
    private void write(Object obj) throws IOException {

                    if (inDevelopmentMode) {
    private static final String WS = "-ws"; //$NON-NLS-1$
    private static final String PROP_FRAMEWORK_SHAPE = "osgi.framework.shape"; //$NON-NLS-1$
     * Processes the command line arguments.  The general principle is to NOT
    private static final String PRODUCT_SITE_MARKER = ".eclipseproduct"; //$NON-NLS-1$
            String goodWorkingDir = dataHome + "/" + defaultWorkspaceLocation;
            // see if we can get a splash given the splash path
    private static final String PROP_LOG_INCLUDE_COMMAND_LINE = "eclipse.log.include.commandline"; //$NON-NLS-1$
        if (splashLocation != null && !Character.isDigit(splashLocation.charAt(0)) && new File(splashLocation).exists()) {
        appendPaddedInt(c.get(Calendar.YEAR), 4, sb).append('-');
                try {
        }
     */
            return false;
            return;
     *
                if (appId == null || appId.trim().isEmpty()) {
        // for the user configuration area
    private static final String OS = "-os"; //$NON-NLS-1$
            }
        File eclipseProduct = new File(installURL.getFile(), PRODUCT_SITE_MARKER);
                addDevEntries(extensionURL, result, name);
     */
        }

                result = load(url, CONFIG_FILE_TEMP_SUFFIX); // check for failures on save
                    destinationClasspath = destinationClasspath + sourceClasspath;

                String appId = props.getProperty(PRODUCT_SITE_ID);
     * Returns the result of converting a list of comma-separated tokens into an array
        } catch (IOException ioe) {
            if (e.getMessage() != null) {
        if (bridge == null || (bridge.isLibraryLoadedByJava() && exitData == null))
                        fragment = searchFor(fragmentName, devDir);
        }
                else
            Path outputFile = splash.toPath();

                //launcher = arg;
            // This is done only in the case of shared install where we have already set the user values
        configArgIndex = 0;
        if (prop == null || prop.trim().isEmpty()) //$NON-NLS-1$
            String[] entries = getArrayFromList(splashPath);
    private URL getInstallLocation() {

        return new BufferedWriter(new OutputStreamWriter(output, StandardCharsets.UTF_8));
 * you may not use this file except in compliance with the License.
                configArgs[configArgIndex++] = i - 1;
                System.out.println("Response is not expected json: " + responseData);
            String key = (String) e.nextElement();
        String value = System.getenv(prop); // $NON-NLS-1$

        Calendar c = Calendar.getInstance();
        }
            //find our fragment name
        // Now we know where the base configuration is supposed to be.  Go ahead and load
        }


                    log("Using data configuration location: " + location); //$NON-NLS-1$
        String cache = jarFile.getName();
    }
        if (os != null)
        return null;
            }
            log.write(e.getMessage());
                    sharedConfigURL = new URL(getInstallLocation(), CONFIG_DIR);
            // minor numbers are equivalent so check service
    private static final Set<String> INCOMPATIBLE_WINDOWS_VERSIONS = Set.of(
        }
                char c = urlString.charAt(i);
    private static final String PROTECT = "-protect"; //$NON-NLS-1$
                logFile = new File(logFileProp);
                found = true;
                if (location != null && System.getProperty(PROP_INSTALL_AREA) == null)
        // run without splash if we are initializing or nosplash
            "splash.gif", //$NON-NLS-1$
            return true; //underscore at the end of target (foo_1.0.0.v1_123 case)
        } catch (MalformedURLException e) {
        boolean isGreaterEqualTo(Identifier minimum) {
            }
                    args[i] = null;
        appendPaddedInt(c.get(Calendar.SECOND), 2, sb).append('.');
            properties.load(in);
            urlString = buf.toString();
     * After running the application <code>System.exit(N)</code> is executed.
    private static final String STARTUP = "-startup"; //$NON-NLS-1$
            if (args[i - 1].equalsIgnoreCase(CONFIGURATION)) {
            log("Exception opening JAR file: " + fragment); //$NON-NLS-1$
        if (inDevelopmentMode && devClassPathProps != null) {
        return null;
                debug = true;
            return new CommandLineExecuteResult(cliMode);

        }

        // sorry, could not find splash image
            return false;
        } else {
            super(urls, parent, factory);
    }
                        String devDir = dir + "/" + PLUGIN_ID + "/fragments"; //$NON-NLS-1$ //$NON-NLS-2$
            String appData = System.getenv("AppData");
 * See the License for the specific language governing permissions and
    private static final String CONFIG_FILE_TEMP_SUFFIX = ".tmp"; //$NON-NLS-1$
        String osgiWs = System.getProperty(PROP_WS);
            if (debug)
            File child = new File(target);
        // if the instance location is not set, predict where the workspace will be and
            System.setProperty(PROP_FRAMEWORK, urlString);
        }
            //Load a property file of the extension, merge its content, and in case of dev mode add the bin entries
     * Returns the <code>URL</code>-based class path describing where the boot classes
            } catch (MalformedURLException e1) {
            // look for the framework to run
        }
        if (externalForm.endsWith(".jar")) { //$NON-NLS-1$
    private static final long NO_TIMESTAMP = -1;
            lastUnderscore = candidate.lastIndexOf('_', lastUnderscore - 1);
            return;
                if (devClassPathProps != null) {
    }

     * @return result of comparison, as integer;
     * qualifier). Note, that returning anything else will cause exceptions in the caller.
            if (minor < minimum.minor)
        boolean varStarted = false; // indicates we are processing a var subtitute
                    System.setProperty(PROP_CONFIG_AREA, location);
                passThruArgs[j++] = args[i];
                framework = arg;

                    return libFile.getAbsolutePath();
    private void openLogFile() throws IOException {
     * There are a few args which are directed towards main() and a few others
     * We pass a handler (Runnable) to the platform which is called as a result of the
        ArrayList<String> result = new ArrayList<>(4);
            if (debug) {
        URL locationURL;
                    System.setProperty(key, value);
     * If we are unable to parse the full version, remaining elements are initialized

                .uri(URI.create("http://localhost:" + properties.port() + "/handleCommandLine"))
        if (debug) {
            }
                String lib = extractFromJAR(fragment, entry);
                vm = arg;
    private static final String DBEAVER_CONFIG_FOLDER = "settings";
            }
        if (!eclipseProduct.exists()) {
     * In all other cases, N = 0.
    private static final String PROP_EXITDATA = "eclipse.exitdata"; //$NON-NLS-1$
            if (debug) {
    /**
            }
            return null;
        if (result != 0)
            if (debug) {
            hashCode = installDir.getAbsolutePath().hashCode();
        IOException originalException;
            // -showsplash command that might be present.
        } catch (Exception e) {

    }
        for (String location : locations) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
        final String EXT_OVERRIDE_USER = ".override.user"; //$NON-NLS-1$
            return searchFor(fileLocation.getName(), fileLocation.getParentFile().getAbsolutePath());
                found = true;
        }
                } else if (location.startsWith(USER_DIR)) {
            return;
            if (arg.equals(PRODUCT) || arg.equals(DEV) ||
                    for (int i = SESSION.length() + timestamp.length(); i < 78; i++)
                    buf.append(tok); // the token is not part of a var
     */
        if (locationPath.startsWith("/")) //$NON-NLS-1$
                }
            // look for and consume the nosplash directive.  This supercedes any
            } catch (Exception e2) {
        return properties;
                    // the config area is not set and the base config area is not set (or is bogus).
        // on the command line or was the one in the install dir.
            log.write(' ');
            log("Configuration area not set yet. Unable to extract " + jarEntry + " from JAR'd plug-in: " + jarPath); //$NON-NLS-1$ //$NON-NLS-2$
    }
    private static final String SHOWSPLASH = "-showsplash"; //$NON-NLS-1$
            result = source.getLocation();
     * Retuns the default file system path for the configuration location.
        // configuration has changed since the user configuration has been written.
    private static final String PROP_NL = "osgi.nl"; //$NON-NLS-1$
     * Do a locale-sensitive lookup of splash image
                    .replace("\\\\t", "\t")
     * The extra development time class path entries for the framework.
            if (extensionPaths == null)
        }
        if (installURL == null) {
            return;
     * Load the given configuration file
            }
            if (path.isAbsolute())
        try {
     * The location of the configuration information in the install root
            super(urls);
            Path basePath = Paths.get(base, DBEAVER_INSTALL_FOLDER, productPath);

     *
    private static final String PROP_LAUNCHER_NAME = "eclipse.launcher.name"; //$NON-NLS-1$
        if (endSplash != null) {
            url = new URL(url, CONFIG_FILE);

                    log("Invalid splash path entry: " + e); //$NON-NLS-1$
            originalException = e1;
            for (String extensionPath : extensionPaths) {
            }
    private void setupJNI(URL[] defaultPath) {
        return result.replaceFirst("^~", System.getProperty(PROP_USER_HOME));
                    long lastKnownBaseTimestamp = getLastKnownConfigIniBaseTimestamp();
    }
            // property is not a valid URL
                major = Integer.parseInt(tokenizer.nextToken());
            }
        // preparing for Java 9
            HttpResponse.BodyHandler<String> stringBodyHandler =
            if (args[i - 1].equalsIgnoreCase(NL)) {
        if (target.startsWith(REFERENCE_SCHEME)) {
        } catch (IOException e) {
    //    private String launcher = null; // The full path to the launcher
                log.flush();
            return new CommandLineExecuteResult(false, (short) -1);
            }
        checkCompatibleWindowsVersion();
    protected String decode(String urlString) {
                inDevelopmentMode = true;
            }
     * @return a boolean indicating whether the checking passed
        } catch (Throwable e) {

            String[] keyringParams =  { ARG_ECLIPSE_KEYRING, secretStoragePath.toString() };
            if (folder != null)
     *

            return buildURL(productConfigurationLocation, true);
                found = true;
                // JavaSE's boot classpath are only available from the extension path in Java 9 b62.
            result = load(url, null); // try to load config file
                productPath = appId + File.separator + appVersion;
    private static final String NO_DEFAULT = "@noDefault"; //$NON-NLS-1$
                } else {
            System.out.println("Configuration location:\n    " + configurationLocation); //$NON-NLS-1$
        if (productName.isEmpty()) {
            } else {
            if (installLocation == null)
            result = searchForSplash(path.toArray(new String[0]));
    }
                found = true;
        URL installURL = getInstallLocation();
        }
        }
        if (propertyValue == null)
            try {
            log.write(ENTRY);
            result.add(url);
                continue;
        try {
    }
     *
                    break;


        if (protectBase && Constants.OS_MACOSX.equals(os)) {
                output = "Error processing command line as client: " + output;
                if (logFile == null)
     */
    private static final String PROP_EXTENSIONS = "osgi.framework.extensions"; //$NON-NLS-1$
            if (debug)
        if (library != null) {
    private String getFragmentString(String fragmentOS, String fragmentWS, String fragmentArch) {
                try {
        }
                        fragment = searchFor(fragmentName, dir);
        }
    /**
            fwkPath = new String(chars);
     * @param base the base location
            String productConfigurationLocation = basePath.toFile().getAbsolutePath();
            properties.load(is);
                devClassPathProps = processDevArg(arg);
            return Constants.ARCH_X86_64;
                URL url;
        System.setProperty(PROP_EXITCODE, Integer.toString(result));
                arch = arg;
                "Incompatible OS",
                    // we have found the end of a var
                    // if the parent we are about to read is the same as the base config we read above,
    //    private String name = null; // The name to brand the launcher
    private static final String PROP_COMMANDS = "eclipse.commands"; //$NON-NLS-1$
            log.write(String.valueOf(obj));

        File splash = new File(configURL.getPath(), PLUGIN_ID);
                throw error;
            for (int i = 0; i < len; i++) {
    /**

        StringTokenizer tokens = new StringTokenizer(prop, ","); //$NON-NLS-1$
        String fwkPath = new File(new File(base.getFile()).getParent()).getAbsolutePath();
        return result;
     * If that does not work, look for a default splash.  Currently the splash must be in the file system
        return list.isEmpty() ? new String[0] : list.toArray(new String[0]);
     */
                found = true;
     * case of portable distribution (tar/zip) location used current location:
            // TODO consider logging here

        } catch (IOException e) {
        }
     */
            if (!Boolean.getBoolean(PROP_NOSHUTDOWN) || result == 23)
            if (nlProperty == null || nlProperty.isBlank()) {
            if (args[i - 1].equalsIgnoreCase(WS)) {
        if (install.getProtocol().equals("file")) { //$NON-NLS-1$
                System.setProperty(PROP_LAUNCHER_NAME, arg);
                // ignore the minor and service qualifiers in that case and default to 0
            try {
        if (!hasAppParams) {
                if (tokenizer.hasMoreTokens())
        } else {
                    result = i;

    private final Thread splashHandler = new SplashHandler();

    // Placeholder of program configuration data, depends on OS
    }
            System.out.println("Loading product properties from " + eclipseProduct);
            vmargs = Arrays.copyOf(vmargs, vmargs.length + 1);
        // need to ensure that getInstallLocation is called at least once to initialize the value.
        if (url == null)
            if (minor > minimum.minor)

                System.exit(result);

            }
        }

            String qualifiedPath;
            return Constants.OS_SOLARIS;
            }
            if (debug)

     * The -endsplash argument is longer used and has the same result as -nosplash
                        buf.append(prop);

            version = version.substring(0, version.length() - 4);
        String customWorkspacePath = null;
                if (entry != null && entry.startsWith(FILE_SCHEME)) {

            if (appData == null) {
                    if (debug)
    private static final String DBEAVER_PROP_LANGUAGE = "nl";
        for (int i = 0; i < candidates.length; i++) {
     * product and the given appendage
            String name = (candidates[i] != null) ? candidates[i] : ""; //$NON-NLS-1$
                boolean shouldOverride = System.getProperty(overrideKey) != null || source.getProperty(overrideKey) != null;
    private static final String PARENT_CLASSLOADER_CURRENT = "current"; //$NON-NLS-1$
                    String base = substituteVar(location, XDG_DATA_HOME, PROP_XDG_DATA_HOME_UNIX);
            System.out.println("Processed command line arguments: " + Arrays.toString(passThruArgs));
            fragment = fragment.substring(5);
    private static final String PROP_CONFIG_CASCADED = "osgi.configuration.cascaded"; //$NON-NLS-1$
            return null;
    /**

        } catch (MalformedURLException e1) {
        try {
        } finally {
            return new URL(spec);
            System.setProperty(PROP_CONFIG_AREA, configurationLocation.toExternalForm());
                    .replace("\\\\n", "\n")
        // check if we are running without a splash screen
        if (File.separatorChar == '\\')
            if (outputMatcher.find()) {
        try {
        if (args.length == 0)
                    result = load(url, CONFIG_FILE_BAK_SUFFIX); // check for failures on save
        splashLocation = getSplashLocation(defaultPath);
        return installLocation;

            if (debug) {
        //Only handle "reference:file:" urls, and not simple "file:" because we will be using the jar wherever it is.
        if (osName.regionMatches(true, 0, Constants.INTERNAL_OS_MACOSX, 0, Constants.INTERNAL_OS_MACOSX.length()))
                type = PARENT_CLASSLOADER_EXT;
                //Ignore
            return null;
     * @param base the base location
                dataHome = System.getProperty(PROP_USER_HOME) + "/.local/share";

                return result;
        if (vm != null)
    private String exitData = null;
                System.out.println(" loaded"); //$NON-NLS-1$
                    System.clearProperty(PROP_SHARED_CONFIG_AREA);
                    appVersion = ""; //$NON-NLS-1$
            libPath = getLibraryPath(getFragmentString(fragmentOS, fragmentWS, fragmentArch), defaultPath);

        }
    private static final String APPEND_VMARGS = "--launcher.appendVmargs"; //$NON-NLS-1$

            // If the version string was in a format that we don't understand, continue and
    /*
        if (libPath == null) {
    protected synchronized void log(Object obj) {
     * Build an array of path suffixes based on the given NL which is suitable
            }
        //    is unique for each local user, and <application-id> is the one
        }
            return;
                System.setProperty(PROP_LAUNCHER, arg);
            return null;
            if (!new File(goodWorkingDir).exists() && new File(badWorkingDir).exists()) {
    }
    public static void main(String[] args) {
                return findClass(name);
                arg.equals(ARG_ECLIPSE_KEYRING) || arg.equals(LAUNCHER)) {
            String output = null;
                installArea = installArea.replace(LAUNCHER_DIR, new File(launcher).getParent());
            return null;
                        System.out.println("Timestamps found: \n\t config.ini in the base: " + sharedConfigTimestamp + "\n\t remembered " + lastKnownBaseTimestamp); //$NON-NLS-1$ //$NON-NLS-2$
        String osName = (System.getProperty("os.name")).toUpperCase();
        if (frag.isDirectory())
            return Constants.WS_GTK;
import java.lang.reflect.Method;
        try {
        if (osgiArch != null) {
    public static String substituteVars(String path) {
    /**
    }
        String installArea = System.getProperty(PROP_INSTALL_AREA);
            String productPath = getProductProperties();
                openLogFile();
            // this constant and display a message to the user telling them that
        }

        }
                .map(arg -> "\"" + LauncherUtils.escape(arg) + "\"")

                // since we don't have gson and don't deserialize the response, remove escaping for cleaner output
        } catch (MalformedURLException e) {
                    service = Integer.parseInt(tokenizer.nextToken());

        if (!candidate.startsWith(target + "_")) //$NON-NLS-1$
                        //ignore
        String appName = "." + ECLIPSE; //$NON-NLS-1$
        while (st.hasMoreElements()) {
        private int major, minor, service;
        //NOTE: we only remove .zip and .jar extensions because we still need to accept libraries with
            bootLocation = urlString;
    protected String[] processCommandLine(String[] args) {
                if (debug)
        } catch (Exception e) {
        // if -endsplash is specified, use it and ignore any -showsplash command
                if (appVersion == null || appVersion.trim().isEmpty()) {
            if (args[i - 1].equalsIgnoreCase(STARTUP)) {

        if (!frag.exists())
    public static final String SPLASH_HANDLE = "org.eclipse.equinox.launcher.splash.handle"; //$NON-NLS-1$
                    clean = true;
    private static final String APPLICATION = "-application";
            return Constants.OS_OS400;
            }
                if (output.startsWith("[") && output.endsWith("]")) {
    protected void addEntry(URL url, List<URL> result) {
            if (bridge != null && !splashDown) {
                    result[i++] = Integer.valueOf(token);
     */
            if (args[i - 1].equalsIgnoreCase(VM)) {
        }
        ExecutorService httpExecutor = Executors.newSingleThreadExecutor();
    private void mergeWithSystemProperties(Properties source, Properties userConfiguration) {
            // if we are running with -clean then delete the cached splash file
            log.write(' ');
                    // leave sharedConfigurationLocation null
    private static final String VM = "-vm"; //$NON-NLS-1$
        String devPathList = devClassPathProps.getProperty(symbolicName);
        if (logFileProp != null) {
     */
     * Candidate names are defined in SPLASH_IMAGES and include splash.png, splash.jpg, etc.
            // property value is absolute
            }
        if (data == null)
        }
            if (args[i - 1].equalsIgnoreCase(LAUNCHER)) {
            }
        // locate boot plugin (may return -dev mode variations)
        }
            for (String command : commands) {
        ) {
        } catch (IOException e) {
        String osName = getOS();
        return searchFor(target, start);

                    }
                }
            // In case something weird happens, just dump stack - logging is not available at this point
                    }
                }
                return installationUrl;
        /**
            // If the version string was in a format that we don't understand, continue and
        int targetLength = target.length();
        //    exist, use "eclipse" as the application-id.
    private static final String PRODUCT_SITE_VERSION = "version"; //$NON-NLS-1$
import java.util.*;
     *
                .executor(httpExecutor)
        return new File(userHome, appName + "/" + pathAppendage).getAbsolutePath(); //$NON-NLS-1$


            }
    private String resolveLocation(String source, String var, String location) {
                        libPath = getLibraryFromFragment(fragment);
            if (appCL != null)

        } else if (productName.startsWith(Constants.PRODUCT_CLOUDBEAVER)) {
     * area for caching purposes.
                // major, minor or service ... numeric values
            // In order to distinguish the request for a restart, do a System.exit(23)
        for (Enumeration<?> eKeys = result.keys(); eKeys.hasMoreElements(); ) {


    private String[] commands = null;
            String arg = args[++i];
            String arg = args[i];
                    } else {
        @Override
                url = new URL(url.getProtocol(), url.getHost(), url.getPort(), path);
                chars[0] = Character.toLowerCase(chars[0]);
        setupJNI(bootPath);
            bridge = new JNIBridge(library);
        if (debug)
     * Return hash code identifying an absolute installation path
import java.security.KeyStore;
        // trying to find a base config area.  This is either defined in a system property or
        }
        }
                    // Note that we do not extract any version information.

     */
                qualifiedPath += ", " + FILE_SCHEME + path + entry; //$NON-NLS-1$
                File toAdjust = LauncherUtils.toFileURL(spec);
    }
     * init custom ssl context to avoid default trust store initialization before an application starts
     */
            return;
        InstanceServerProperties properties = readDBeaverServerInfo(workspacePath);
            }
     * The extra development time class path entries for all bundles.
                    long sharedConfigTimestamp = getCurrentConfigIniBaseTimestamp(sharedConfigURL);

                log("Could not find extension: " + extension); //$NON-NLS-1$
     * Load the configuration
            if (PRODUCT.equals(arg)) {
            return NO_TIMESTAMP;
            }
                System.setProperty(PROP_CLASSPATH, destinationClasspath);
            if (LauncherUtils.canWrite(installDir))
        }
    private static final String READ_ONLY_AREA_SUFFIX = ".readOnly"; //$NON-NLS-1$
        }
            if (exitCodeMatcher.find()) {
        // is computed relative to the install location.
                continue;
            if (debug) {
     * Indicates which OS was passed in with -os
                return false;
                }
                return null;
            Matcher exitCodeMatcher = CommandLineConstants.EXIT_CODE_PATTERN.matcher(responseData);
        //We found where the fwk is, remember it and its shape
                    if (debug)

                configArgs[configArgIndex++] = i++;
        long handle = bridge.getSplashHandle();
                // passed thru this arg (i.e., do not set found = true)
        if (name.equalsIgnoreCase(Constants.INTERNAL_AMD64))
        if (osName.equals(Constants.OS_QNX))
            if (args[i - 1].equalsIgnoreCase(LIBRARY)) {
            }
                // minor
        }
            try (FileInputStream inStream = new FileInputStream(eclipseProduct)) {
        return false;
        //The jars from the base always need to be added, even when running in dev mode (bug 46772)

                    var = null;
     * @throws Exception thrown if a problem occurs during the launch
            }
    }
    protected int findMax(String prefix, String[] candidates) {
            }
     */
            log.write(String.valueOf(ERROR));
            // if the parent location is different from the config location, read it too.
            // found a case of $var at the end of the path with no trailing $; just append it as is.
        }
            Properties properties = loadEclipseProductProperties();
            return Path.of(DEFAULT_SECURE_STORAGE_FILENAME);
                os = arg;
            }
     */
        // value is not set so compute the default and set the value
    }
                return false;
        }
            // Linux
    }
        if (debug) {
    private static final String USER_DIR = "@user.dir"; //$NON-NLS-1$
            URL url = buildURL(urlString, true);
        if (!(fragmentOS.equals(Constants.OS_MACOSX) && !Constants.ARCH_X86_64.equals(fragmentArch))) {
                if (newSession) {
            }
        String workingDirectory;
            if (args[i].equalsIgnoreCase(DEBUG)) {
                System.out.println("Computation of Mac specific configuration folder failed."); //$NON-NLS-1$
            workingDirectory = appData + "\\" + defaultWorkspaceLocation;
            spec = spec.trim();
                // any non-zero value should do it - 14 used to be used for version incompatibility in Eclipse 2.1
            if (isFile) {
            "splash.bmp", //$NON-NLS-1$
                }
                return null;
    //Get the timestamp that has been remembered. The BASE_TIMESTAMP_FILE_CONFIGINI is written at provisioning time by fwkAdmin.
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        configurationLocation = buildLocation(PROP_CONFIG_AREA, null, ""); //$NON-NLS-1$
                customWorkspacePath = args[++i];
        private static final String DELIM = ". _-"; //$NON-NLS-1$

            return;
    private static final String FRAMEWORK = "-framework"; //$NON-NLS-1$

    }
        buffer.append(value);
        if (library != null)
        }
            // check for args with parameters. If we are at the last argument or if the next one
        //first encode '+' characters, because URLDecoder incorrectly converts

        //ensure minimum Java version, do this after JNI is set up so that we can write an error message
     * Clients wishing to run the platform without a following <code>System.exit</code>
        if (System.getProperty(PROP_FRAMEWORK) == null)
                try {
                char lastChar = location.charAt(location.length() - 1);
    private void readFrameworkExtensions(URL base, ArrayList<URL> result) throws IOException {
                    //now merge the base configuration
        for (String other : INCOMPATIBLE_WINDOWS_VERSIONS) {
                    .replace("\\\\\\\"", "\"")
    private static final String PROTECT_BASE = "base"; //$NON-NLS-1$
    private boolean checkConfigurationLocation(URL locationUrl) {
                System.out.println("App folder provided by MacOS is: " + folder); //$NON-NLS-1$

                System.out.println("Can not read product properties. " + e.getMessage()); //$NON-NLS-1$
            }
            return Constants.OS_WIN32;
            }
            ));
                String value = result.getProperty((String) key);
    private boolean initialize = false;
        try {
    }
    private static final String NONE = "@none"; //$NON-NLS-1$

        if (arg == null)
                    String result = extractFromJAR(path, nlVariant);
            return properties;

        if (Boolean.parseBoolean(System.getProperty(PROP_CONFIG_AREA + READ_ONLY_AREA_SUFFIX))) {

                    break;
    }
     */
     * The location of the install root
            Identifier required = new Identifier(requiredVersion);
            return new String[0];
            if (name.startsWith(other.toLowerCase(Locale.ROOT))) {
            if (debug) {
        String urlString = System.getProperty(PROP_FRAMEWORK, null);
                    entry = zipEntry.getName();
                args[i] = null;
        if (debug)

        // try to load saved configuration file (watch for failed prior save())
        Class<?> clazz = loader.loadClass(STARTER);
        String[] baseJars = getArrayFromList(baseJarList);
            StringTokenizer tokenizer = new StringTokenizer(versionString, DELIM);
            initializeBridgeEarly();
            .resolve(Constants.DBEAVER_INSTANCE_PROPS);
            "splash.jpeg", //$NON-NLS-1$
            if (!responseData.startsWith("{") || !responseData.endsWith("}")) {
        CodeSource source = null;
    //splash screen system properties
                if (!getOS().equals("win32")) { //$NON-NLS-1$
        if (debug) {
        }
                libPath = searchFor("eclipse", lib.getAbsolutePath()); //$NON-NLS-1$
                found = true;
            }
    /**
        } else {
            buffer.append('0');
 * You may obtain a copy of the License at
     */
    private Path detectDefaultWorkspaceLocation(String[] args, Path dbeaverDataDir) {
        }
    // for variable substitution
            ClassLoader appCL = ClassLoader.getSystemClassLoader();
        return buffer;
    // Placeholder for hashcode of installation directory
            handleSplash(bootPath);
        if (Files.exists(file)) {
                // this is a "normal" RFC 101 framework extension bundle just put the base path on the classpath
        try {
                    return LauncherUtils.adjustTrailingSlash(toAdjust.toURL(), trailingSlash);
                    splash.delete();

        StringBuilder sb = new StringBuilder();
                } else {
            try {
            String baseLocation = System.getProperty(PROP_BASE_CONFIG_AREA);
    private static final String DBEAVER_INSTALL_FOLDER = "install-data";
    }
        String externalForm = url.toExternalForm();
    private static final String PROP_EXITCODE = "eclipse.exitcode"; //$NON-NLS-1$
                    configurationLocation = buildURL(computeDefaultConfigurationLocation(), true);
                    if (fragment == null)
                if (value != null) {
     * @throws MalformedURLException if a problem occurs computing the class path
     */
     * If the system property "osgi.configuration.area.readOnly" is set
     */
    // constants: System property keys and/or configuration file elements
    }


     */
            return buffer.append(value);
            Object key = eKeys.nextElement();
            else if (e.getTargetException() instanceof Exception exception)
        //Set up the JNI bridge.  We need to know the install location to find the shared library
                found = true;
                return toAdjust.toURL();
            if (args[i - 1].equalsIgnoreCase(OS)) {
            }
                    // We assume the extension is located in the workspace in a project
            }
            }
            url = getInstallLocation();
            props.load(is);
        String configLocation = System.getProperty(PROP_CONFIG_AREA);
            for (String e : entries) {
            if (installArea != null) {

                return null;
                configArgs[configArgIndex++] = i;
import java.util.regex.Matcher;
        return urlString;
                    // that has the same name as the BSN.
            return ""; //$NON-NLS-1$
            return true;
        //    exist, use "eclipse" as the application-id.
        // If on Windows then canonicalize the drive letter to be lowercase.
     * <li>~/.local/share - Unix
            // fall back to absolute path
        } catch (SecurityException | NumberFormatException e) {
                try {
            if (args[i].equalsIgnoreCase(DEV) && ((i + 1 == args.length) || ((i + 1 < args.length) && (args[i + 1].startsWith("-"))))) { //$NON-NLS-1$
                // Do nothing if we get an exception.  We will default to a standard location
            // done checking for args.  Remember where an arg was found
            URL[] urls = defaultPath;
        while (padding > value && padding > 1) {
                // create a file URL (via File) to normalize the form (e.g., put
            if (debug)
            String extensionClassPath = null;
import javax.net.ssl.TrustManagerFactory;
            String tok = st.nextToken();
            urlString = resolve(urlString);
            return Constants.OS_MACOSX;
         * Returns true if this id is considered to be greater than or equal to the given baseline.
            return super.findLibrary(name);
                    localPath
                System.out.println("Install location:\n    " + installLocation); //$NON-NLS-1$
            appName += File.separator + installDirHash;
            if (sharedConfigURL != null) {
        } else {
                if (isJAR(path)) {
        return Path.of(getWorkingDirectory(DBEAVER_DATA_FOLDER));
                found = true;
     */
        StringTokenizer t = new StringTokenizer(version, "."); //$NON-NLS-1$
     * area relative to the current product.
            if (userConfiguration != null && !key.endsWith(EXT_OVERRIDE_USER)) {
        if (bridge != null)
        if (debug) {
            URL absoluteURL = new URL(installURL, locationPath);

    /**
                    System.out.println("Error parsing exit code: " + e.getMessage());
     * @return the location where target directory was found, <code>null</code> otherwise
            urlString = url.toExternalForm();
            return;

            // always try putting down the splash screen just in case the application failed to do so
        }
    }
            return arch;
            // removed once the splash screen has been taken down.
            }
                maxVersion = currentVersion;
         * do deep reflection to add URLs on Java 9.
        if (configurationLocation != null)
        try {
                    destinationClasspath = sourceClasspath;
        try {
        int lastSeparator;
        /**
                vmargs = new String[args.length - i];
        } else {
        String value = System.getProperty(prop, ""); //$NON-NLS-1$
    private static final String DEFAULT_SECURE_STORAGE_FILENAME = ".eclipse/org.eclipse.equinox.security/secure_storage"; //$NON-NLS-1$
            final Properties config = readGlobalConfiguration();
        if (configURL == null)
    // log file handling
        // was specified (splashdown = true)

            if (System.getProperty(PROP_CLASSPATH) == null)

                extensionURL = new File(path).toURL();
            return new CommandLineExecuteResult(cliMode);
                if (string.startsWith(FILE_SCHEME))
            return buffer.append(value);
        } catch (Throwable t) {
            if (found) {

    private Properties loadProperties(URL url) throws IOException {
                if (zipEntry.getName().startsWith("eclipse_")) { //$NON-NLS-1$
        }
                //startup = arg;
                found = true;
            String pluginsLocation = new File(url.getFile(), "plugins").toString(); //$NON-NLS-1$
            else {

    protected static final String SESSION = "!SESSION"; //$NON-NLS-1$
     * @see #run(String[])
            return null;
            if (args[i].equalsIgnoreCase(APPEND_VMARGS) || args[i].equalsIgnoreCase(OVERRIDE_VMARGS)) {
    }
                log("Are you trying to start an 64/32-bit Eclipse on a 32/64-JVM? These must be the same, as Eclipse uses native code.");
        }
                output = outputMatcher.group(1);
    private String searchForSplash(String[] searchPath) {
        } catch (Exception e) {
                    String prop = null;
        if (osName.equals(Constants.OS_HPUX))
                else
        while (lastUnderscore > lastDot)
        if (debug)
            lastSeparator = nl.lastIndexOf('_');
     */
     */
        String nl = locale;
            // check if debug should be enabled for the entire platform
        while (t.hasMoreTokens() && i < 4) {
                // property is not already set.
                .build()
            System.setProperty(SPLASH_HANDLE, String.valueOf(handle));
            return; // do nothing
    private static final String[] SPLASH_IMAGES = {"splash.png", //$NON-NLS-1$
        }
            if (javaVersion != null && new Identifier(javaVersion).isGreaterEqualTo(new Identifier("1.9"))) { //$NON-NLS-1$
            return NO_TIMESTAMP;
                    message += " and could not be logged: \n" + e.getMessage(); //$NON-NLS-1$
            splashDown = true;
        return result;
 * Unless required by applicable law or agreed to in writing, software
    protected static final String JAR_SCHEME = "jar:"; //$NON-NLS-1$
                    break;
        String token;
                    .replace("\\n", "\n")
     *
            } catch (MalformedURLException e) {
        URL installURL = null;
                    url = new URL(base, location);
            if (tokenizer.hasMoreTokens())
        boolean isFile = spec.startsWith(FILE_SCHEME);
            if (!token.isEmpty()) {
            // the arg was not a URL so use it as is.
        return passThruArgs;
            httpExecutor.shutdown();

                productName = properties.getProperty(Constants.PROPERTY_ECLIPSE_PRODUCT_ID);
    /*
        if (value == null) {
        }
            String path = searchFor(framework, pluginsLocation);
        if (osName.regionMatches(true, 0, Constants.OS_WIN32, 0, 3))
    private boolean showSplash = false;
                int idx = location.indexOf(INSTALL_HASH_PLACEHOLDER);
            String responseData = response.body();
        setMultiValueProperty(PROP_VMARGS, vmargs);
    private static final String VMARGS = "-vmargs"; //$NON-NLS-1$
            configuration.remove(PROP_SHARED_CONFIG_AREA);

        } catch (SecurityException | NumberFormatException e) {
    }
        logFile = new File(base.getPath(), System.currentTimeMillis() + ".log"); //$NON-NLS-1$
            } catch (IOException e) {
        }
            }
        if (splashPath != null) {
            return splash.exists() ? splash.getAbsolutePath() : null;
                } else {
                    if (!sharedConfigURL.equals(baseConfigurationLocation)) {
            }
     */
        }
        URL installURL = getInstallLocation();
     */
        }
                // if the string is a file: URL then *carefully* construct the

    /*
        } catch (InvocationTargetException e) {
        else if (PARENT_CLASSLOADER_EXT.equalsIgnoreCase(type)) {
    protected boolean debug = false;
            System.setProperty(property, result.toString());
            buffer.add(fragmentArch);
        @SuppressWarnings("resource")
            log(e);
    private String endSplash = null;
                    File result = new File(path);
            if (path == null)
            showSplash = false;
            if (!target.startsWith(FILE_SCHEME))
            // look for the command to use to end the splash screen
    }
            String location = install.getFile();
        }
        } else if (osName.contains("MAC")) {
            }
            log.newLine();

                System.out.println("Can not read product properties. " + e.getMessage()); //$NON-NLS-1$
     * <p>Will set PROP_EXITCODE/PROP_EXITDATA accordingly if check fails.</p>
     * Resolve the given file against  osgi.install.area.
        library = libPath;
            }
            // look for the new instance arg
    /**
                continue;
                    .replace("\\\"{", "{")
                found = true;
        getInstallLocation();
            }
            Properties result = new Properties();
        }
        File configDir = new File(locationUrl.getFile()).getAbsoluteFile();
        if (initialize || splashDown || bridge == null) {
            bridge.setExitData(exitData, data);
    }
        final Properties properties = new Properties();
     * <code>>0</code> if left > right;
        try {
                if (logFile == null) {
        if (splashDown || bridge == null) // splash is already down

            log.newLine();
        if (installLocation != null)
            }
                if (CLEAN.equalsIgnoreCase(command)) {
        // compute the base location and then append the name of the log file
/*
        Properties baseConfiguration = null;
    // Suffix for location properties - see LocationManager.
            // Consume the arg here to ensure that the launcher and Eclipse get the
        if (var != null)
        // Do this AFTER processing the configuration to allow the configuration to set

         * 1.2.9 >= 1.3.1 -> false
                return null;
            log.write(String.valueOf(0));
        System.setProperty("eclipse.startTime", Long.toString(System.currentTimeMillis())); //$NON-NLS-1$
            }
 * from the command line. To launch Eclipse programmatically, use
     * Indicates whether this instance is running in development mode.

        if (spec == null)
                    Properties sharedConfiguration = baseConfiguration;

    private static final String PROP_FRAMEWORK_SYSPATH = "osgi.syspath"; //$NON-NLS-1$
            if (!Files.exists(localPath)) {
        ArrayList<String> matches = new ArrayList<>(2);
            return installLocation;
            if (!configDir.exists()) {
        log.newLine();
        String osName = System.getProperty("os.name"); //$NON-NLS-1$
            if (url.getProtocol().equals("file")) //$NON-NLS-1$
            }
                    // invalid number format - use default numbers (0) for the rest

            return new CommandLineExecuteResult(cliMode);
            // couldn't show the splash screen for some reason
            log.write(PLUGIN_ID);
        } finally {
            target = target.substring(FILE_SCHEME.length());
        try {
        return ssl;
     * If osgi.install.area is not set, or the file is not relative, then

            try {
        if (configuration != null && "false".equalsIgnoreCase(configuration.getProperty(PROP_CONFIG_CASCADED))) { //$NON-NLS-1$
                break;
            if (debug)
import org.eclipse.equinox.launcher.JNIBridge;
                //consume optional parameter for showsplash
                new File(logFile.getParent()).mkdirs();
                // Make English the default language
                url = new File(path).toURL();
        boolean fwkIsDirectory = fwkFile.isDirectory();
    }
                } else
        try {
        String name = System.getProperty("os.name").toLowerCase(Locale.ROOT);
            // This is *really* unlikely to happen - run() takes care of exceptional situations.
        } catch (MalformedURLException e) {
                // this will allow us to tolerate other non-conventional version numbers
        }
        String base = getWorkingDirectory(DBEAVER_DATA_FOLDER);
import java.net.http.HttpResponse;
                log.close();

    }
    }
        // if the config or parent we are about to read is the same as the base config we read above,
        String parent = new File(base.getFile()).getParent();
            return Path.of(userHome, DEFAULT_SECURE_STORAGE_FILENAME);
            HttpResponse<String> response = client.send(request, stringBodyHandler);

        configArgs[0] = -1; // need to initialize the first element to something that could not be an index.
                    
    // Verifies that args has any non-standard parameters
            if (bridge != null)
                    }
        String userHome = System.getProperty(PROP_USER_HOME);
        if (fwkIsDirectory) {
        return new File(path).isFile();
                String appVersion = props.getProperty(PRODUCT_SNAPSHOT_VERSION);
     * If the application's return value is an <code>Integer</code>, N is this value.
                    break;
     *
                if (appVersion == null || appVersion.trim().isEmpty())
    protected File logFile = null;
            return result;
        }
                }
     * @return the url-based class path
import java.util.List;
        }
     * Look for the specified spash file in the given JAR and extract it to the config
        if (protectBase && (System.getProperty(PROP_SHARED_CONFIG_AREA) == null)) {
    private String getSplashLocation(URL[] bootPath) {
    private InputStream getStream(URL location) throws IOException {
            if (args[i].equalsIgnoreCase(VMARGS)) {
     * are located when running in development mode.
        if (secretStoragePath != null) {
    private String getOS() {
        for (int i = 0; i < args.length; i++) {
                File libFile = new File(extensionPath, libName);
            }
        }
        }
                // make sure we always terminate the VM
                System.setProperty(PROP_CONFIG_AREA, arg);
            File f = new File(location.getPath());
                if (value != null)
        }
                    // need to extract the BSN from the path

                found = true;
        String location = System.getProperty(property);
import java.awt.*;
     * @see "http://openjdk.java.net/jeps/223 for information on the JavaSE-9 version JEP 223"
            super(urls, parent);
    private String computeDefaultConfigurationLocation() {
            try {


    private static final String ARCH = "-arch"; //$NON-NLS-1$
            workingDirectory = System.getProperty(PROP_USER_HOME) + "/Library/" + defaultWorkspaceLocation;
            System.setProperty(PROP_VM, vm);
                throw exception;
    private static final String PARENT_CLASSLOADER_EXT = "ext"; //$NON-NLS-1$
            return;
    public class StartupClassLoader extends URLClassLoader {
    }
        // it and merge into the System properties.  Then, if cascaded, read the parent configuration.
            URL location = new URL(arg);
        try {
                    system, or upgrade your operating system to a newer version.
            String exitCode = System.getProperty(PROP_EXITCODE);
                configArgs[configArgIndex++] = i;
            if (extensionProperties != null)
        if (devClassPathProps == null)
                }
        if (installArea != null) {
        }
    }
     */
    }

        }
                        Runtime.getRuntime().exec(new String[]{"chmod", "755", lib}).waitFor(); //$NON-NLS-1$ //$NON-NLS-2$
    private static final String PROP_SPLASHLOCATION = "osgi.splashLocation"; //$NON-NLS-1$
            }
        public StartupClassLoader(URL[] urls, ClassLoader parent) {
                    varStarted = false;
    private void computeLogFileLocation() {
            try (Reader reader = Files.newBufferedReader(file)) {
        ArrayList<String> list = new ArrayList<>();
                Path storagePath =
        // Note that File.list only gives you file names not the complete path from start

        URLConnection connection;
            if (args[i].equalsIgnoreCase(INITIALIZE)) {
    private static final String PROP_USER_DIR = "user.dir"; //$NON-NLS-1$
 * on this class are not API.
    /*
                    output = output.substring(1, output.length() - 1);
/**
                    .replace("\\r", "")
     * @return an array of size 4; first three elements are of type Integer (representing
            }
        return false; //another underscore between target and version (foo_64_1.0.0.v1_123 case)
            // look for explicitly set install root
        String result = System.getProperty(PROP_SPLASHLOCATION);
        if (obj == null)

                // if the base sets the install area then use that value if the property is not already set.
                    if (prop == null) {

            parent = this.getClass().getClassLoader();

    private void ensureAbsolute(String locationProperty) {
                else
                String location = baseConfiguration.getProperty(PROP_CONFIG_AREA);
                i++;
            if (args[i].equalsIgnoreCase(SHOWSPLASH)) {
            return null;
        if (base == null)
        }
            try {
                }
        if (configurationLocation == null) {
                // here the base config cannot have any symbolic (e..g, @xxx) entries.  It must just
    private long getCurrentConfigIniBaseTimestamp(URL url) {
                    }
}
     */
            //Ignore
        if (osName.equalsIgnoreCase(Constants.INTERNAL_OS_OS390))
            addEntry(url, result);
                // only set the value if the user specified the override property and if the
        try {
        return buf.toString();
    }
        } catch (IOException e) {
        if (handle != 0 && handle != -1) {
                }
                i++;
                        log.write('-');
                    url = new URL(base, location + "/"); //$NON-NLS-1$
        if (splash.exists()) {
                    name = new File(path).getName();
     * Compares version strings.
            System.setProperty(SPLASH_LOCATION, splashLocation);
                // will never happen.  The path is straight from a URL.
            shutdownApplication = "SHUTDOWN".equals(action);
        return result;
    }
        }
    private static final String DEBUG = "-debug"; //$NON-NLS-1$
     * @throws MalformedURLException if a problem occurs computing the class path
            return Constants.WS_GTK;
                result = i;
            }
            if (System.getProperty(key) == null)
                bridge.updateSplash();

    private Properties loadConfiguration(URL url) {
            return true;
            basicRun(args);
         */
        }
                properties.load(reader);

                    throw originalException; // we tried, but no config here ...
            takeDownSplash();
        // TODO need a better test for windows
                workingDirectory = badWorkingDir;
            System.out.println(data);
            return Constants.WS_PHOTON;
            }
            return null;
    protected boolean newSession = true;

    private static final String PROP_VMARGS = "eclipse.vmargs"; //$NON-NLS-1$
                throw new IllegalStateException("Install location is invalid: " + installArea); //$NON-NLS-1$
    private static final String XDG_DATA_HOME = "@data.home"; //$NON-NLS-1$
     * @return the arguments to pass through to the launched application
                output = output
    protected String devClassPath = null;

            if (debug)
            }
    private static final String LAUNCHER = "-launcher"; //$NON-NLS-1$
                return null;

                    version is Windows 10 (1607) or Windows Server 2016.
            locale = Locale.getDefault().toString();
        return result;
                newInstance = true;
     *
        }
            if (path == null) {
    private String computeDefaultUserAreaLocation(String pathAppendage) {
                .POST(HttpRequest.BodyPublishers.ofString(json));
        appendPaddedInt(c.get(Calendar.MILLISECOND), 3, sb);
            HttpRequest request = builder.build();
            String fragmentWS = getWS();
     * Checks whether the given location can be created and is writable.
    }
        //simple versions (e.g. eclipse_1234.dll)
        try {
                found = true;
import javax.swing.*;
        if (eclipseProduct.exists()) {
                        base = substituteVar(location, XDG_DATA_HOME, PROP_XDG_DATA_HOME_WIN);
                //consume next parameter
        File frag = new File(fragment);
        if (vmargs != null && Stream.of(vmargs).noneMatch(arg -> arg.startsWith("-D" + PROP_LOG_INCLUDE_COMMAND_LINE))) {
            for (String path : searchPath) {
                        prop = System.getProperty(var);
                return null;
            if (installLocation.getProtocol().equals("file")) { //$NON-NLS-1$
     */
        if (osName.equalsIgnoreCase(Constants.INTERNAL_OS_SUNOS))
     * Return path of the splash image to use.  First search the defined splash path.
     * in InternalBootLoader
            return true;
                }
            }
        String splashPath = System.getProperty(PROP_SPLASHPATH);
        appendPaddedInt(c.get(Calendar.MINUTE), 2, sb).append(':');
            // debug can be specified as system property as well
    protected String parentConfigurationLocation = null;
                initialize = true;


                System.out.println(output);
    private static final String CONFIG_FILE_BAK_SUFFIX = ".bak"; //$NON-NLS-1$
            return os;
            if (major > minimum.major)
        try {

                // do not mark the arg as found so it will be passed through

            else
                System.out.println("CodeSource location is null. Defaulting the install location to file:startup.jar"); //$NON-NLS-1$
     * Runs the platform with the given arguments.  The arguments must identify

            "splash.jpg", //$NON-NLS-1$
                    url = new URL(string);
                addEntry(new URL(base, string), result);
        if (locale == null)
            URL installationUrl = new URL(getInstallLocation(), CONFIG_DIR);
        }

        //    is unique for each local user, and <application-id> is the one
    private static final String PROP_ECLIPSESECURITY = "eclipse.security"; //$NON-NLS-1$
            hashCode = installDir.getCanonicalPath().hashCode();
        try (ZipFile fragmentJar = new ZipFile(frag)) {

            if (locations.length > 0) {
            // If the security manager won't allow us to get the system property, continue for
        } catch (MalformedURLException e) {
        processConfiguration();
            // actually some additional development time class path entries.  This will be processed below.
            // EclipseStarter (i.e., if the exitCode is not 13)
        }
        invokeFramework(passThruArgs, bootPath);
        }
                        Files.createFile(storagePath);
import java.nio.charset.StandardCharsets;
                        buf.append(VARIABLE_DELIM_CHAR);
            if (macConfiguration != null) {
            } else {
            if (debug)
    private boolean isMatchingCandidate(String target, String candidate, File root) {
                result = new URL("file:startup.jar"); //$NON-NLS-1$
        if (!LauncherUtils.canWrite(configDir)) {
            }
                    try {
                // on a 64/32 bit Eclipse
     * location in<br> 
                addEntry(url, result);
     */
                workingDirectory = goodWorkingDir;
            System.out.println("Has application parameters: " + hasAppParams);
        }
            }

        return toAdjust;
        }
        if (Character.isUpperCase(fwkPath.charAt(0))) {

        return workingDirectory;

            }
            // Disable logging of command line by default if it's not explicitly set
     * Handle splash screen.

    private int compareVersion(Object[] left, Object[] right) {
    private long getLastKnownConfigIniBaseTimestamp() {
                result[i++] = token;
        } catch (Throwable e) {
            fragment = searchFor(fragmentName, location);
        return result;
        if (requiredVersion == null || availableVersion == null)
     */
                Files.createDirectories(localPath);
            return computeDefaultUserAreaLocation(CONFIG_DIR);
                } catch (Exception e) {
    }
                System.setProperty(key, value);
import java.util.stream.Collectors;
            log("Unable to read global configuration file: " + e.getMessage());
                return storagePath;
    }
        return result.toArray(new URL[0]);
        String locationPath = locationURL.getPath();
        String[] locations = getArrayFromList(devPathList);
        } finally {
                }
    public static final String SPLASH_LOCATION = "org.eclipse.equinox.launcher.splash.location"; //$NON-NLS-1$
                result = 17;
    protected static final String REFERENCE_SCHEME = "reference:"; //$NON-NLS-1$
        }
    /**
            if (lib.isDirectory()) {
     * <code><0</code> if left < right;
            return splashLocation;
    }
            }
        for (Enumeration<?> e = source.keys(); e.hasMoreElements(); ) {
                else
    private static final String PROP_USER_HOME = "user.home"; //$NON-NLS-1$
 * DBeaver - Universal Database Manager
            }
        int result;
    }
            extensionProperties.put(PROP_CLASSPATH, qualifiedPath);
        if (values != null) {
            addDevEntries(base, result, OSGI);
         * 1.3.1 >= 1.3.1 -> true
                } catch (MalformedURLException e) {
 */

        // 2) If this directory is read-only
                continue;
                e2.printStackTrace(System.err);

 *
            return Constants.OS_ZOS;
            System.out.println("Loading timestamp file from:\n\t " + getConfigurationLocation() + "   " + BASE_TIMESTAMP_FILE_CONFIGINI); //$NON-NLS-1$ //$NON-NLS-2$
            // now and let things fail later on their own if necessary.
            // this is done to handle URLs with invalid syntax in the path
            if (debug) {
                System.setProperty(PROP_SPLASHLOCATION, result);

     * JNIBridge.takeDownSplash and the native code will close the splash screen.
        //include the name of the jar in the cache location
        if (eclipseProduct.exists()) {
        } finally {
        ArrayList<String> extensionResults = new ArrayList<>(extensions.length);
            setSystemPropertyIfNotSet(PROP_NL, nlProperty);
    };
                    .replace("\\\\\\\\t", "\t")
                Runtime.getRuntime().addShutdownHook(splashHandler);
                    var = tok; // the token is the var key; save the key to process when we find the end token
        }
        String userHome = System.getProperty(PROP_USER_HOME);
     * @param locationUrl configuration area URL, may be <code>null</code>


                    System.setProperty(PROP_SHARED_CONFIG_AREA, sharedConfigURL.toExternalForm());
                if (sharedConfigURL.equals(getConfigurationLocation())) {
                // JavaSE-9's extension path in Java 9-ea+108. The identifier "1.9" could be changed to "9", but "1.9" works just as well.

        } finally {
                    // but it will likely be complicated and error prone.
        Properties result;
                    appVersion = props.getProperty(PRODUCT_SITE_VERSION);
            else if (name.startsWith(prefix + "_")) //$NON-NLS-1$
     * call should use <code>run()</code>.
        return value + source.substring(var.length());
        try {
    }
    private static final String FILE_SCHEME = "file:"; //$NON-NLS-1$
        String[] candidates = root.list();
            return null;
        }
            return;
                }
        int lastDot = candidate.lastIndexOf('.');
            buf.append(VARIABLE_DELIM_CHAR).append(var);

        File installDir = new File(installURL.getFile());
        //with exitdata if we fail.
        }
    private static final String PROP_FRAMEWORK_PARENT_CLASSLOADER = "osgi.frameworkParentClassloader"; //$NON-NLS-1$
    /**
            // if the next element is a -arg as the thing following -vmargs may in
                throw e;
            if (lastSeparator == -1)
                return new URL(JAR_SCHEME + url + "!/" + name); //$NON-NLS-1$
     * <li>~/user/APP_DATA - WinOS
        "Windows 7",
            url = new URL(url.getProtocol(), url.getHost(), url.getPort(), url.getFile() + suffix);
        if (configurationLocation != null)
                fileLocation = new File(parent, child.getPath());
         * 1.3.0 >= 1.3.1 -> false

            // TODO Very unlikely case.  log here.
     */
            boolean addNoSplash = true;
        try {
        if (path.toLowerCase().endsWith(".jar")) //$NON-NLS-1$
                if (!varStarted)
    static class Identifier {

                    }
                    // In this case we compute based on the install location.
        File fwkFile = new File(base.getFile());
import java.nio.file.Path;
        String fragment = null;
                continue;
            return null;


    URL constructURL(URL url, String name) {
         * @throws NumberFormatException if cannot parse the major and minor version components


        if (path.toLowerCase().endsWith("/plugins/")) //$NON-NLS-1$
                return lib;
                continue;
            if (debug) {
     * Returns a string representation of the given URL String.  This converts
            System.out.println("Detected DBeaver server port: " + properties.port());
    private void closeLogFile() throws IOException {
            return null;
                    // get the value of the var from system properties

            String arg = args[i];
         * e.g.
        try {
        }
    private String library = null;

            location += "/plugins/"; //$NON-NLS-1$
            // Register the endSplashHandler to be run at VM shutdown. This hook will be
     * <code>0</code> if left == right;
                log = logForStream(System.err);
                    // we have a file or a directory
    }
    }

        return buffer.toString();
            method.invoke(clazz, passThruArgs, splashHandler);
        File eclipseProduct = new File(installDir, PRODUCT_SITE_MARKER);
                //not doing anything with this right now, but still consume it
            System.setProperty(PROP_INSTALL_AREA, installLocation.toExternalForm());
        //    we store the state in <user.home>/.eclipse/<application-id>_<version> where <user.home>
                libPath = lib.getAbsolutePath();
        public void updateSplash() {
                    closeLogFile();
            super();
    }
    }
            File fileLocation = child;
        return null;
    /**
            String entry = null;
 *
            }
            // if we failed and it is a file spec, there is nothing more we can do
            }
    /**
    private String getArch() {
            } else {
                log(e);
                list.add(token);

            return result;
                if (args[i].equalsIgnoreCase(PROTECT_MASTER) || args[i].equalsIgnoreCase(PROTECT_BASE)) {
            if (output != null && !output.isEmpty()) {
        URL configURL = buildURL(configLocation, false);
        if (debug)
                arg.equals(STARTUP) ||
            if (dataHome == null) {
        }
    private void handleSplash(URL[] defaultPath) {

        if (urlString.indexOf('+') >= 0) {


                qualifiedPath = ""; //$NON-NLS-1$
            return true;
            if ("ERROR".equals(action)) {
    private void setupVMProperties() {
                    System.out.println("\t" + ECLIPSE_PROPERTIES + " not found"); //$NON-NLS-1$ //$NON-NLS-2$

        String osgiArch = System.getProperty(PROP_ARCH);
            if (major < minimum.major)
     *
     *  was displayed by the launcher, we invoke JNIBridge.showSplash() and the
            URL install = getInstallLocation();
                .sslContext(initCustomSslContext())
                System.out.println("    " + devPath.toExternalForm()); //$NON-NLS-1$
        //them to spaces on certain class library implementations.
     */
        }
            return true;
                        sharedConfiguration = loadConfiguration(sharedConfigURL);
        if (installURL == null) {
        System.clearProperty(SPLASH_HANDLE);
        File installDir = new File(installURL.getFile());
            //we failed to write, so dump log entry to console instead
        }

     * <p>
        while (tokens.hasMoreTokens()) {
                if (string.equals(".")) { //$NON-NLS-1$
                    appId = ECLIPSE;
        String name = System.getProperty("os.arch");//$NON-NLS-1$
                extensionClassPath = extensionProperties.getProperty(PROP_CLASSPATH);
            }
            System.setProperty(locationProperty, absoluteURL.toExternalForm());
            File path = new File(location);
                        libPath = getLibraryFromFragment(fragment);
        }
                log("Exception opening splash: " + entry.getName() + " in JAR file: " + jarPath); //$NON-NLS-1$ //$NON-NLS-2$
     * @param locationProperty the key for a system property containing a URL
                        Files.copy(defaultLocation, storagePath, StandardCopyOption.REPLACE_EXISTING);
            e.printStackTrace(System.err);
            }
                    fragment = searchFor(fragmentName, dir);
            passThruArgs = Stream.concat(Arrays.stream(passThruArgs), Arrays.stream(keyringParams)).toArray(String[]::new);
            try {
            try {
        if (debug)
            return null;
        if (domain != null)
                    Path defaultLocation = getDefaultSecretStorageLocation();

            return compatible;
                if (debug) {
        if (System.getProperty(PROP_CONFIG_AREA) == null) {
                if (configurationLocation == null) {
    /*
                inDevelopmentMode = true;
    protected static final String PROP_FRAMEWORK = "osgi.framework"; //$NON-NLS-1$
                        System.setProperty(PROP_IGNORE_USER_CONFIGURATION, Boolean.TRUE.toString());
            String passwordProperty = properties.getProperty(InstanceServerProperties.PROPERTY_PASSWORD);
                if (name.startsWith(REFERENCE_SCHEME)) {

                appData = System.getProperty(PROP_USER_HOME);
            }
                    
            } catch (ClassNotFoundException e) {
                    File entryFile = new File(urls[i].getFile());
    private Properties loadEclipseProductProperties() {
            System.out.println("Install location:\n    " + installLocation); //$NON-NLS-1$

                nlProperty = "en";
                    path += nlVariant;
     *
                    //merge user configuration since the base has not changed.
                JOptionPane.ERROR_MESSAGE
            }
            return dbeaverDataDir.resolve(Constants.TEAM_WORKSPACE);
                    baseConfigurationLocation = new URL(getInstallLocation(), CONFIG_DIR);
            if (urls != null && urls.length > 0) {
            // major
        }
        String data = System.getProperty(PROP_EXITDATA);


        URL installURL = getInstallLocation();
            //nothing todo.
    protected boolean inDevelopmentMode = false;
            //ensure that the install location is set before resolving framework
    //currently the only level of protection we care about.
    }
        if (osName.equalsIgnoreCase(Constants.INTERNAL_OS_QNX))
            return true;
        } catch (IOException e) {
    private static final String DEV = "-dev"; //$NON-NLS-1$
    private static final String PROP_CONFIG_AREA_DEFAULT = "osgi.configuration.area.default"; //$NON-NLS-1$
            chars[0] = Character.toLowerCase(chars[0]);
        }
        }
            Runtime.getRuntime().removeShutdownHook(splashHandler);

        if (fragment.startsWith(FILE_SCHEME))
            if (installArea.startsWith(LAUNCHER_DIR)) {
    }
        ProtectionDomain domain = DBeaverLauncher.class.getProtectionDomain();
                    // there is no shared config value so compute one
        String locale = System.getProperty(PROP_NL);
    }
            log.write(' ');
        } else {
            if (i == configArgs[configArgIndex])
            if (actionMatcher.find()) {
        }
                String launcher = System.getProperty(PROP_LAUNCHER);
            Properties props = new Properties();

     *
            System.out.println("Splash location:\n    " + splashLocation); //$NON-NLS-1$
            if (debug) {
    }
        if (urlString.startsWith(REFERENCE_SCHEME))
    public static final char VARIABLE_DELIM_CHAR = '$';
                if (compareVersion((Object[]) maxVersion, (Object[]) currentVersion) < 0) {
            }
            try {
     * </p>
                //not doing anything with this right now, but still consume it
     * Checks whether the given available version is greater or equal to the
    // List of incompatible Windows versions for those which we want to show a warning dialog
            ws = osgiWs;
     * absolute URLs by taking the install URL as reference.
                url = path.toURL();
    /**
            // add the hash to help prevent collisions
    private static final String PLATFORM_URL = "platform:/base/"; //$NON-NLS-1$
        try {
    private void initializeBridgeEarly() {
                //could be a subclass of Throwable!
    private Properties processDevArg(String arg) {
                continue;
            Identifier available = new Identifier(availableVersion);
        if (osName.equalsIgnoreCase(Constants.INTERNAL_OS_LINUX))
            if (location == null)
                exitData = arg;
        // Note that the config info read here is only used to determine a value
     * If the application's return value is an <code>Integer</code>, N is this value.
    protected void basicRun(String[] args) throws Exception {

        StringJoiner buffer = new StringJoiner("."); //$NON-NLS-1$
    }
     * major, minor and service) and the fourth element is of type String (representing
            return ws;
        if (splashLocation == null)
                } catch (IOException e3) {
    }
                System.out.println("DBeaver properties file not found: " + dbeaverProperties);
    private boolean hasAppParameters(String[] args) {

                throw new IOException("Unable to initialize " + PROP_CLASSPATH); //$NON-NLS-1$
    }
            log(e);
            return Constants.OS_AIX;
    private static final String PROP_REQUIRED_JAVA_VERSION = "osgi.requiredJavaVersion"; //$NON-NLS-1$
                System.setProperty(PROP_INSTALL_AREA, arg);
            Properties extensionProperties = null;

        Object maxVersion = null;
                extensionURL = new URL(installLocation.getProtocol(), installLocation.getHost(), installLocation.getPort(), path);
            if (Files.exists(localPath)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                // check all levels to see if the "override" property was set
    // types of parent classloaders the framework can have
            if (maxVersion == null) {
     * an application to run (e.g., <code>-application com.example.application</code>).
            if (isMatchingCandidate(target, candidate, root)) {
        setupVMProperties();
    }
            }
                    // We could add more logic here to support versions in project folder names
 * distributed under the License is distributed on an "AS IS" BASIS,
            //just consume the --launcher.overrideVmargs and --launcher.appendVmargs
                System.setProperty(PROP_NOSHUTDOWN, "true"); //$NON-NLS-1$
    }
 * The launcher for Eclipse.
    /**
        return true;
                    exitCode = Short.parseShort(exitCodeMatcher.group(1));
                    .replace("\\\"", "\"")
        if (candidateFile.isFile() && (candidate.endsWith(".jar") || candidate.endsWith(".zip"))) { //$NON-NLS-1$//$NON-NLS-2$
     *
            ensureAbsolute(PROP_SHARED_CONFIG_AREA);
                if (toAdjust.isDirectory())
        if (!locationURL.getProtocol().equals(installURL.getProtocol()))
                continue;
    private static final String PROP_PARENT_CLASSLOADER = "osgi.parentClassloader"; //$NON-NLS-1$

        //    we store the state in <user.home>/.eclipse/<application-id>_<version> where <user.home>
                passThruArgs = Stream.concat(Arrays.stream(passThruArgs), Arrays.stream(new String[] {NOSPLASH}))
        Path dbeaverProperties = workspacePath
        return location.openStream();
        if (osName.equalsIgnoreCase(Constants.INTERNAL_OS_OS400))
        // 1) We store the config state relative to the 'eclipse' directory if possible
        String baseJarList = System.getProperty(PROP_CLASSPATH);

            endSplash = null;
            else if (location.equalsIgnoreCase(NONE))
        }
            System.clearProperty(PROP_SHARED_CONFIG_AREA);
        String logFileProp = System.getProperty(PROP_LOGFILE);
        if (inDevelopmentMode)

    protected URL installLocation = null;
                if (!varStarted) {
    }
     */
        public void addURL(URL url) {

                found = true;
            return;
        //if (!checkConfigurationLocation(configurationLocation))
            }
        int[] configArgs = new int[args.length];
            System.setProperty(key, value);

    private static final String LIBRARY = "--launcher.library"; //$NON-NLS-1$
    private InstanceServerProperties readDBeaverServerInfo(Path workspacePath) {
        } catch (Exception ignored) {
            if (entry == null)
        for (int i = 0; i < args.length; i++) {
                result = buildURL(location, true);
        Object[] result = {0, 0, 0, ""}; //$NON-NLS-1$
            }
            String badWorkingDir = dataHome + "/." + defaultWorkspaceLocation;
        if (osName.equals(Constants.OS_LINUX))
                }
    }
        if (debug) {
            log.write(' ');
import java.io.*;
            // OK to ignore this, happens when the VM is already shutting down
            // there is information in their log file.
    private static final String PRODUCT_SITE_ID = "id"; //$NON-NLS-1$
            }
            return null;
            locationURL = new URL(propertyValue);
    private Properties devClassPathProps = null;
            return installLocation;
        String path = decode(result.getFile());
     * @see "http://www.oracle.com/technetwork/java/javase/versioning-naming-139433.html for information on valid version strings"
        }

        File jarFile = new File(jarPath);
    }
            }
            }
     * Take down the splash screen.
    }
        URLClassLoader loader = new StartupClassLoader(bootPath, parent);
            }
            // look for the configuration to use.
        }
            } catch (NumberFormatException nfe) {
    private static final String PROP_SPLASHPATH = "osgi.splashPath"; //$NON-NLS-1$
                // service
        if (debug) {
     *
        factory.init(KeyStore.getInstance(KeyStore.getDefaultType()));
    /*
                    location = new File(base, userDefaultAppendage).getAbsolutePath();
            super.addURL(url);
        int result = findMax(target, names);
        splash = new File(splash, jarEntry);
            if (key instanceof String) {
        if (PARENT_CLASSLOADER_APP.equalsIgnoreCase(type))
        "Windows Server 2012"
            // simply enable development mode.  Otherwise, assume that that the following arg is
            String devPathList = devClassPathProps.getProperty(PLUGIN_ID);
            }
        }
        // try to load saved configuration file
            configuration = loadConfiguration(getConfigurationLocation());
        System.setProperty(PROP_FRAMEWORK_SYSPATH, fwkPath);
        if (baseJarList == null) {
        } catch (IOException e) {
    }
        return props;
        Properties properties = new Properties();
     */
        return true;
                File location = new File(locations[0]);
            System.out.println("Invoking parameters: " + Arrays.toString(passThruArgs));
        if (installURL == null)
     * NOTE: due to class visibility there is a copy of this method
        // verify configuration location is writable
                throw new IllegalArgumentException("Bundle URL is invalid: " + target); //$NON-NLS-1$
        } catch (IOException e) {
                found = true;
                    // leave baseConfigurationLocation null
     * candidates in "nl/fr/FR/", then "nl/fr/", and finally in the root.
        }
            StringBuilder buf = new StringBuilder(len);
    private static final String PROP_BASE_CONFIG_AREA = "osgi.baseConfiguration.area"; //$NON-NLS-1$
     * with suitable defaults.
     * Return a boolean value indicating whether or not the given
    private boolean newInstance = false;
            if (e.getTargetException() instanceof Error error)
            }
            return Constants.OS_HPUX;
        //url: file:foo/dir/
            for (URL devPath : result) {
     * @param args command-line arguments
        }
                if (i + 1 < args.length && !args[i + 1].startsWith("-")) { //$NON-NLS-1$
        String osgiOs = System.getProperty(PROP_OS);
                }

        if (customWorkspacePath != null) {
     * A structured form for a version identifier.
        return String.valueOf(hashCode);
            // look for the VM location arg
        URL[] bootPath = getBootPath(bootLocation);
            if (debug) {
            String[] locations = getArrayFromList(devPathList);
    }
        int j = 0;
        type = System.getProperty(PROP_FRAMEWORK_PARENT_CLASSLOADER, type);
     * Returns the value returned from running the application.
            System.setProperty(PROP_SPLASHLOCATION, splashLocation);
            // look for the command to use to show the splash screen
     */
        if (args == null || args.length == 0 || newInstance) {
 * org.eclipse.core.runtime.adaptor.EclipseStarter. The fields and methods
         * Must override addURL to make it public so the framework can
        appendPaddedInt(c.get(Calendar.MONTH) + 1, 2, sb).append('-');
                continue;
    private void processGlobalConfiguration() {
    }
        URL result = null;
    public final class SplashHandler extends Thread {
            boolean compatible = available.isGreaterEqualTo(required);

                write(obj);
        public void run() {
    private static final String NOEXIT = "-noExit"; //$NON-NLS-1$
        for (String nlVariant : nlVariants) {
    private void processConfiguration() {
    }
     * Searches for the given target directory starting in the "plugins" subdirectory
                    result.append(value);

                version = name; //webstart just passes in versions
                result = exitCode == null ? 0 : Integer.parseInt(exitCode);

            System.out.println("Detected workspace location: " + workspacePath);

            HttpRequest.Builder builder = HttpRequest.newBuilder()
                props.load(inStream);
    }
        return result;
    private Properties substituteVars(Properties result) {
    private static final String PROP_DEBUG = "osgi.debug"; //$NON-NLS-1$
            t.printStackTrace(System.err);
            return findResource(name);
                }
        final Path file = root.resolve(DBEAVER_CONFIG_FOLDER).resolve(DBEAVER_CONFIG_FILE);
        if (value >= padding)
                baseConfigurationLocation = buildURL(baseLocation, true);

                System.setProperty(PROP_NL, arg);
     * In all other cases, N = 0.
            System.setProperty(PROP_EXITCODE, Integer.toString(14));
            } catch (IOException e2) {
                    String dir = entryFile.getParent();
     * resolve platform:/base/ URLs
        }
            String nlProperty = config.getProperty(DBEAVER_PROP_LANGUAGE);
                extensionProperties = loadProperties(constructURL(extensionURL, ECLIPSE_PROPERTIES));
            }

    protected static final String PLUGIN_ID = "org.eclipse.equinox.launcher"; //$NON-NLS-1$
    protected static final String MESSAGE = "!MESSAGE"; //$NON-NLS-1$
        if (configuration == null || !getConfigurationLocation().equals(baseConfigurationLocation))
        }
    public static final String DBEAVER_DATA_FOLDER = "DBeaverData";
        if (locationUrl == null || !"file".equals(locationUrl.getProtocol())) //$NON-NLS-1$
            System.err.println("An exception occurred while writing to the platform log:"); //$NON-NLS-1$
            return os;
                return true;
                extensionResults.add(path);
        if (osgiWs != null) {
        }
            if (key.equals(PROP_CLASSPATH)) {
    private String resolve(String urlString) {
                char[] chars = path.toCharArray();
     */
                        path.add(entry);
        return result;
            return;
        if (urlString != null) {
            }
        return result.toArray(new String[0]);
    private static final String PROP_XDG_DATA_HOME_UNIX = "XDG_DATA_HOME"; //$NON-NLS-1$
                }
            // Called via reflection by org.eclipse.core.runtime.internal.adaptor.DefaultStartupMonitor.DefaultStartupMonitor
     *
        try {
    private static final String NEW_INSTANCE = "-newInstance"; //$NON-NLS-1$
        public StartupClassLoader(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) {
                // URL. Otherwisejust try to build a URL. In either case, if we fail, use
        return productPath;
    }
     * The location of the configuration information for this instance
            if (baseConfigurationLocation == null)
        if (result == -1)
        if (result == null) {
                found = true;
                    System.setProperty(PROP_INSTALL_AREA, location);
                }
                System.out.println("Loading extension: " + extension); //$NON-NLS-1$
            } catch (MalformedURLException e2) {
            }
            log = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFile.getAbsolutePath(), true), StandardCharsets.UTF_8));
                if (appId == null || appId.trim().isEmpty())
        if (Boolean.parseBoolean(System.getProperty(Constants.DISABLE_REMOTE_CLI))) {
            if (passwordProperty == null || passwordProperty.isBlank()) {
        }
        }
            } catch (IOException e) {
                if (path.startsWith(FILE_SCHEME))
        // put the instance area inside the workspace meta area.
            return new URL(url, name);
    }
    /**
                String appVersion = props.getProperty(PRODUCT_SITE_VERSION);
        if (source == null || domain == null) {
                    // - merge configuration with the system properties
    }
    }
        URL base = buildURL(System.getProperty(PROP_CONFIG_AREA), false);
            return args;
        }
            else if (args[i] != null)
        if (result != 0)
            System.setProperty(PROP_FRAMEWORK_SHAPE, "jar");//$NON-NLS-1$
     * @return the url-based class path
                    if (fragment != null)
            cache = cache.substring(0, cache.length() - 4);
            debug = System.getProperty(PROP_DEBUG) != null;
            System.setProperty(PROP_FRAMEWORK_SHAPE, "folder");//$NON-NLS-1$
                }
        if (source != null)
                ws = arg;
                    if (devClassPath == null)
     */
            ZipEntry entry = file.getEntry(jarEntry.replace(File.separatorChar, '/'));
            return load(location, null);
 * Copied from org.eclipse.equinox.launcher.Main
        }

import java.nio.file.StandardCopyOption;
            if (prefix == null)

        String result = location + source.substring(var.length());
        var ssl = SSLContext.getInstance("TLS");
     */
            // If the return code is 23, that means that Equinox requested a restart.
        appendPaddedInt(c.get(Calendar.DAY_OF_MONTH), 2, sb).append(' ');
        appendPaddedInt(c.get(Calendar.HOUR_OF_DAY), 2, sb).append(':');
            if (properties.containsKey(Constants.PROPERTY_ECLIPSE_PRODUCT_ID)) {
            installURL = getInstallLocation();
                System.setProperty(PROP_EXITDATA, "<title>Incompatible JVM</title>Version " + availableVersion + " of the JVM is not suitable for this product. Version: " + requiredVersion + " or greater is required."); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
            System.out.println("Executing remote command line: " + Arrays.toString(args));
            }
     * for splash path searching.  The returned array contains paths in order
        return ((String) left[3]).compareTo((String) right[3]); // compare qualifier
                    .replace("\\\\\\\\n", "\n")
                return folder + '/' + CONFIG_DIR;
        computeLogFileLocation();
            }
            // no matter of 'osgi.noShutdown' runtime property value.
                toAdjust = resolveFile(toAdjust);
    /**
    private static final String NAME = "-name"; //$NON-NLS-1$
            return Constants.OS_OS390;
                    log.write(' ');
    public static String getWorkingDirectory(String defaultWorkspaceLocation) {
    protected String searchFor(final String target, String start) {
     * @param defaultPath search path for the boot plugin
            return null;
            try {
        // base can define its parent.  The first parent we read was either defined by the user
            }
                // point to the config file.
                appName += File.separator + appId + "_" + appVersion + "_" + installDirHash; //$NON-NLS-1$ //$NON-NLS-2$
     */
            System.out.println("Framework located:\n    " + url.toExternalForm()); //$NON-NLS-1$
        }
     *  The splash screen is displayed natively.  Whether or not the splash screen
            return false;
            if (debug)
                    addNoSplash = false;
            // look for the launcher location
        }
            } catch (IOException e) {
        return result;
    private static final String PROP_CLASSPATH = "osgi.frameworkClassPath"; //$NON-NLS-1$
    }
            else
        appName += '_' + OS_WS_ARCHToString();
        String productPath = "";

     */
                    // just reuse the base
            int len = urlString.length();
        } catch (IOException e1) {
        }
                // if the base sets the install area then use that value if the property.  We know the
                } catch (MalformedURLException e) {
                // consume the -vmargs arg itself
            if (inDevelopmentMode) {
            if (args[i].equalsIgnoreCase(NOEXIT)) {
                found = true;

        }

                    var = ""; //$NON-NLS-1$
            // but want to override them with values from the shared location's config.
        bridge.setLauncherInfo(System.getProperty(PROP_LAUNCHER), System.getProperty(PROP_LAUNCHER_NAME));
            openLogFile();
        if (devPathList == null)
            try {
     *
                    // - remove the property to show that we do not have a parent
            String token = tokens.nextToken().trim();

        for (String extension : extensions) {
        @Override
    /**
 * <b>Note:</b> This class should not be referenced programmatically by

    private static final String CLEAN = "-clean"; //$NON-NLS-1$
                System.out.println("Empty arguments or new instance requested, skipping remote CLI processing.");
            result = load(getConfigurationLocation(), BASE_TIMESTAMP_FILE_CONFIGINI);
        if (hashCode < 0)
    }


                    }
            return;
        }

                }
            result = 13;
    private static File resolveFile(File toAdjust) {
    }

        //    return;
                .cookieHandler(new CookieManager())
        if (System.getProperty(key) == null) {
                System.out.println("Remote CLI processing is disabled by system property.");
            }
     */
            takeDownSplash();
        // EXCEPTION: All mappings of SunOS convert to Solaris
            // search in the root location
        }
                        path += File.separator;
        // compute an install dir hash to prevent configuration area collisions with other eclipse installs
     * Entry point for logging.
        ClassLoader parent = null;
                if (idx == 0) {
        }
            Files.createDirectories(outputFile.getParent());
            }
            System.err.println("Logging to the console instead."); //$NON-NLS-1$
            // major numbers are equivalent so check minor
    protected String arch = null;
    private static final String NOSPLASH = "-nosplash"; //$NON-NLS-1$
            if (args[i].equalsIgnoreCase(PROTECT)) {
    private static final String PARENT_CLASSLOADER_APP = "app"; //$NON-NLS-1$
            token = t.nextToken();
            result.put("*", arg); //$NON-NLS-1$
    protected BufferedWriter log = null;
    protected boolean splashDown = false;
            log.write(MESSAGE);
                if (location != null)
                System.out.println("Not exists " + eclipseProduct);

        if (searchPath == null)
            }
            // Consume the arg here to ensure that the launcher and Eclipse get the
            return searchFor("eclipse", fragment); //$NON-NLS-1$;
            if (VARIABLE_DELIM_STRING.equals(tok)) {
                // do we have a JAR?
        int configArgIndex = 0;
                    .replace("}\\\"", "}")
    private void invokeFramework(String[] passThruArgs, URL[] bootPath) throws Error, Exception {
    public static Path getDefaultSecretStorageLocation() {
                if (location.isAbsolute()) {
        c.setTime(date);

            System.out.println("product name: " + productName);
                    return LauncherUtils.adjustTrailingSlash(toAdjust.toURL(), trailingSlash);

                if (toAdjust.isDirectory())
        return Constants.OS_UNKNOWN;
            String path = urlString.substring(PLATFORM_URL.length());
            if (result != null)
        addBaseJars(base, result);
            vmargs[vmargs.length - 1] = "-D" + PROP_LOG_INCLUDE_COMMAND_LINE + "=false";
        if (debug) {
            mergeWithSystemProperties(extensionProperties, null);
            log.write(' ');
        try {
                if (tokenizer.hasMoreTokens())
            }
                productName = args[++i];
 * Copyright (C) 2010-2026 DBeaver Corp and others
            if (log != null) {

            String fragmentArch = getArch();

                    appId = ECLIPSE;
            return;
            configurationLocation = buildLocation(PROP_CONFIG_AREA_DEFAULT, null, ""); //$NON-NLS-1$
    private static final String PROP_OS = "osgi.os"; //$NON-NLS-1$
        // os.name on Mac OS can be either Mac OS or Mac OS X
            }
        String type = PARENT_CLASSLOADER_BOOT;
     */
            String dataHome = System.getProperty("XDG_DATA_HOME");
            Enumeration<? extends ZipEntry> entries = fragmentJar.entries();
    private static Path getDataDirectory() {
        if (version.endsWith(".jar")) //$NON-NLS-1$
     * path represents a JAR file.

        if (osName.equalsIgnoreCase(Constants.INTERNAL_OS_ZOS))

        File eclipseProduct = new File(installDir, PRODUCT_SITE_MARKER);
            ArrayList<String> path = new ArrayList<>(entries.length);
     */
        if (base != null) {
    }
                else
import java.net.*;
import java.nio.file.Paths;
                // passed thru this arg (i.e., do not set found = true)
                }
                result = buildURL(location, true);
        return dbeaverDataDir.resolve(Constants.WORKSPACE6);
    private URL getConfigurationLocation() {
            if (args[i - 1].equalsIgnoreCase(INSTALL)) {
                    addEntry(base, result);

                // add the hash to help prevent collisions
        //Recognize the following URLs
            String libName = System.mapLibraryName(name);
        String productName = "";
     *  case of installation in system place:
        }
     * @return the default file system path for the configuration information
            return result;
    /**
            // Check to see if we are supposed to override existing values from the user configuraiton.
                    String base = substituteVar(location, USER_DIR, PROP_USER_DIR);
                }
     * <p>Will set PROP_EXITCODE/PROP_EXITDATA accordingly if check fails.</p>
    private Properties load(URL url, String suffix) throws IOException {
    private Path useCustomSecretStorage(Path localPath) {
                // Best effort to register the handler
        //do we have a second '_', version (foo_1.0.0.v1_123) or id (foo.x86_64) ?
            // look for the VM args arg.  We have to do that before looking to see
                }
        int result = -1;
    // constants: configuration file location
                String entry = resolve(e);

            Matcher actionMatcher = CommandLineConstants.ACTION_PATTERN.matcher(responseData);
                return null;
        }
                .header("Content-Type", "application/json")
            if (args[i - 1].equalsIgnoreCase(ARCH)) {
            }
            addEntry(base, result);
                return splash.getAbsolutePath();
         */

        int i = 0;
            showSplash = false;
    private boolean checkVersion(String availableVersion, String requiredVersion) {
            if (ARG_DATA.equals(arg)) {
                return new CommandLineExecuteResult(cliMode);
        }
     * <li>~/Library - MacOS
            if (!child.isAbsolute()) {
            String installArea = System.getProperty(PROP_INSTALL_AREA);
            return;
        } else {
            String javaVersion = System.getProperty("java.version"); //$NON-NLS-1$
        //exitData is a shared memory id, if we loaded the library from java, we need a non-null exitData
    private Properties readGlobalConfiguration() throws IOException {
            URL extensionURL;
                } else if (idx > 0) {
                matches.add(candidate);
        } else if (productName.startsWith(Constants.PRODUCT_TEAM)) {
                    // Suppress splash
                // from the code base.

        if (value == null || value.isBlank()) {

        int result = ((Integer) left[0]).compareTo((Integer) right[0]); // compare major
            try {

            String[] entries = extensionClassPath == null || extensionClassPath.isEmpty() ? new String[]{""} : getArrayFromList(extensionClassPath); //$NON-NLS-1$
        String propertyValue = System.getProperty(locationProperty);
            int extension = candidate.lastIndexOf('.');
            readFrameworkExtensions(base, result);
            // let things fail later on their own if necessary.

        Properties result = null;
                    log.write(SESSION);
         * 2.0.0 >= 1.3.1 -> true
                bridge.uninitialize();
            if (f.exists()) {
    protected String[] getArrayFromList(String prop) {
                    mergeWithSystemProperties(sharedConfiguration, configuration);
            return;
                return null;
        try {
            // same value as each other.
            }
        } catch (IOException e) {
            .resolve(Constants.METADATA)
                if (destinationClasspath == null)
        // add on any dev path elements
        }
            for (String entry : entries) {
                configArgIndex++;
        result = ((Integer) left[1]).compareTo((Integer) right[1]); // compare minor
    private static final String BASE_TIMESTAMP_FILE_CONFIGINI = ".baseConfigIniTimestamp"; //$NON-NLS-1$
        int lastUnderscore = candidate.lastIndexOf('_');
                    String dir = location.getParent();
        }
                splashDown = true;

                for (int i = urls.length - 1; i >= 0 && libPath == null; i--) {
            // splash handling is done here, because the default case needs to know
        }
    /*

        var factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
    private static final String EXITDATA = "-exitdata"; //$NON-NLS-1$
        String[] passThruArgs = new String[args.length - configArgIndex - (vmargs == null ? 0 : vmargs.length + 1)];
        }

                // in the user's home dir.
        processGlobalConfiguration();
     */
        bridge.showSplash(splashLocation);
        File root = resolveFile(new File(start));
                    minor = Integer.parseInt(tokenizer.nextToken());
                if ((location.endsWith(".jar") || (lastChar == '/' || lastChar == '\\'))) //$NON-NLS-1$
    }
    /*
            }
                    System.out.println("DBeaver server password property not found or blank in properties file: " + dbeaverProperties);
    }
            // If the security manager won't allow us to get the system property, continue for

    }
                    Files.createDirectories(storagePath.getParent());
    private String getProductProperties() throws IOException {
        }

        }
    private String getLibraryFromFragment(String fragment) {
     * Returns the <code>URL</code>-based class path describing where the boot classes are located.
        StringBuilder buf = new StringBuilder(path.length());
            } else {
            if (commandLineExecuteResult.shutdown()) {
                return true;
                    if (var != null && !var.isEmpty())
        if (osName.equals(Constants.OS_MACOSX))
public class DBeaverLauncher {
                    newSession = false;
    }
        }
            if (debug)
        if (!configDir.exists()) {
    private static final String PROTECT_MASTER = "master"; //$NON-NLS-1$
                    result.append('\n');
            return;
    private void setExitData() {
            if (!clean)
        String libPath = null;

        return computeDefaultUserAreaLocation(CONFIG_DIR);
            SwingUtilities.invokeAndWait(() -> JOptionPane.showMessageDialog(
            // look for the name to use by the launcher
            for (String name : SPLASH_IMAGES) {
            bridge.updateSplash();
    private static final String DBEAVER_CONFIG_FILE = "global-settings.ini";
                }
    public static final String VARIABLE_DELIM_STRING = "$"; //$NON-NLS-1$
        for (int i = 0; i < args.length; i++) {
            log = null;
        URL baseConfigurationLocation = null;

    private static final String PROP_SHARED_CONFIG_AREA = "osgi.sharedConfiguration.area"; //$NON-NLS-1$
        }
                }
    }
        pad = pad - 1;
                if (c == '+')
            String portProperty = properties.getProperty(InstanceServerProperties.PROPERTY_PORT);
            if (!inDevelopmentMode && new File(base.getFile()).isDirectory())
    private String substituteVar(String source, String var, String prop) {
    /**

            for (String arg : passThruArgs) {
        //Nothing to do.
                try {
    private static final String USER_HOME = "@user.home"; //$NON-NLS-1$
                cliMode = true;
    protected String bootLocation = null;

        Properties result;

        }
     *  native code handles the case of the splash screen already existing.
        }
    /**
        if (protectBase) {
     *

                    log.write(timestamp);

        //java.io used because url may contain spaces and other non escaped chars, and Path.of(URL.toURI()) would fail
            boolean shutdownApplication;
        }
            path = path.substring(0, path.length() - "/plugins/".length()); //$NON-NLS-1$
        Properties properties = new Properties();
            if (found) {
                return installDir.getAbsolutePath() + File.separator + CONFIG_DIR;
                    if (prop != null) {
        protected URL findResource(String moduleName, String name) {
        String[] names = matches.toArray(new String[0]);
            if (isFile)
        try {
    private void addBaseJars(URL base, ArrayList<URL> result) throws IOException {


                else
        }
    protected URL configurationLocation = null;
    private String getInstallDirHash() {
            if (i < 3) {
                    if (entry != null)
                // passed thru this arg
        } catch (IOException e) {
            // user wants readonly config area
        if (GraphicsEnvironment.isHeadless() || isCompatibleWindowsVersion()) {
        if (configLocation == null) {
            return Constants.WS_WIN32;
        while (true) {
    }
                        .resolve(DBEAVER_SECURE_FILE);

     * @return a file system location in the user.home area related the current
                // Workaround for bug 466683. Some org.w3c.dom.* packages that used to be available from

        }
        splash = new File(splash, cache);
        }
                for (int j = 0; i < args.length; i++) {

            // If this is the last arg or there is a following arg (i.e., arg+1 has a leading -),
            try (InputStream input = file.getInputStream(entry)) {
    // splash handling
                System.setProperty(PROP_EXITDATA, message);
        Path secretStoragePath = useCustomSecretStorage(dbeaverDataDir);
                //the last one is most interesting

     */
            if (debug) {
        return Long.parseLong(timestamp);
import java.net.http.HttpClient;
                // string as something to tack on the end of the base.
                log.flush();
        return URLDecoder.decode(urlString, StandardCharsets.UTF_8); //$NON-NLS-1$
        }
            result = new DBeaverLauncher().run(args);
            if (args[i - 1].equalsIgnoreCase(EXITDATA)) {
        // setup the path to the framework

                System.out.println(" not found or not read"); //$NON-NLS-1$
                version = name.substring(prefix.length() + 1); //prefix_version
            }
        if ("file".equalsIgnoreCase(location.getProtocol())) { //$NON-NLS-1$
    private static final String LAUNCHER_DIR = "@launcher.dir"; //$NON-NLS-1$
            Object currentVersion = getVersionElements(version);

        }
                    message += ".  See the log file\n" + logFile.getAbsolutePath(); //$NON-NLS-1$
    }
                    String base = substituteVar(location, USER_HOME, PROP_USER_HOME);
 */
            if (args[i - 1].equalsIgnoreCase(ENDSPLASH)) {

            }
        } catch (MalformedURLException e) {
                    You are using an incompatible operating system version: minimal supported
            return null;
    protected String framework = OSGI;
    private void setMultiValueProperty(String property, String[] values) {
            URL url;
                throw new FileNotFoundException(String.format("Could not find framework under %s", pluginsLocation)); //$NON-NLS-1$
        try (InputStream is = getStream(url)) {
     * Specific method for Dbeaver products group to resolve product configuration
    private static final String KEY_CONFIGINI_TIMESTAMP = "configIniTimestamp"; //$NON-NLS-1$
                        System.out.println("Shared configuration location:\n    " + sharedConfigURL.toExternalForm()); //$NON-NLS-1$
            path = path.substring(0, path.lastIndexOf('/') + 1);
            source = domain.getCodeSource();
        // Map amd64 architecture to x86_64
    private static final String CONFIGURATION = "-configuration"; //$NON-NLS-1$
                // Let's use bad working dir if it exists (#6316)
        String[] passThruArgs = processCommandLine(args);
                //Ignore
            }
            StringBuilder result = new StringBuilder(300);
        if (bridge != null) {
        int hashCode;
    private static final String PARENT_CLASSLOADER_BOOT = "boot"; //$NON-NLS-1$
            }
                    vmargs[j++] = args[i];
     * Executes the launch.
     * if this is writeable.  Otherwise it is located somewhere in the user.home
            nl = nl.substring(0, lastSeparator);
        }
            candidate = candidate.substring(0, extension);
            // check if this is initialization pass
import java.security.ProtectionDomain;
        if (osName.equals(Constants.OS_SOLARIS))
        if (new File(url.getFile()).exists())
        if (debug) {

        return substituteVars(result);
                // This helps in selfhosting cases where you cannot easily compute the install location
            }
    /**
    private static final String PROP_XDG_DATA_HOME_WIN = "APPDATA"; //$NON-NLS-1$
        }
        if (!debug)
        }
     * @param pathAppendage the path segments to add to computed base
     *
            installLocation = new URL(result.getProtocol(), result.getHost(), result.getPort(), path);
        return Constants.WS_UNKNOWN;
                }
     * which we need to know about. Very few should actually be consumed here.
        }
import java.util.concurrent.ExecutorService;
    /**
     *
        }
        try {
 * limitations under the License.
            value = "";
            } else {
                return toAdjust.toURL();
     * @param args the command line arguments

                File parent = resolveFile(new File(start));
     * Indicates whether this instance is running in debug mode.
        }
        public StartupClassLoader(URL[] urls) {
    protected static final int ERROR = 4;
    private static final String OSGI = "org.eclipse.osgi"; //$NON-NLS-1$

        // Return an int exit code and ensure the system property is set.
            }
    /**
    private String vm = null;
    private String[] vmargs = null;
            File lib = new File(library);
    private static final String OVERRIDE_VMARGS = "--launcher.overrideVmargs"; //$NON-NLS-1$
                } catch (NumberFormatException e) {
                }
                    throw new IllegalStateException("Install location depends on launcher, but launcher is not defined"); //$NON-NLS-1$
        if (File.separatorChar == '\\')
                extensionProperties = new Properties();
            String value = source.getProperty(key);
            if (baseLocation != null)
        Path workspacePath = detectDefaultWorkspaceLocation(args, dbeaverDataDir);
                System.out.println("Could not determine install location to load " + PRODUCT_SITE_MARKER + ": " + e.getMessage());
                    if (Constants.OS_WIN32.equals(getOS())) {
        // We can't write in the eclipse install dir so try for some place in the user's home dir
        "Windows 8",
                continue;
                found = true;
                qualifiedPath = "."; //$NON-NLS-1$
        }
            if (i == args.length - 1 || args[i + 1].startsWith("-")) { //$NON-NLS-1$

        //files are assumed to have an extension (zip or jar only), remove it
                if (!Files.exists(storagePath)) {
        if (properties == null) {
        if (Files.notExists(dbeaverProperties)) {
            logFile = null;
     * By default the configuration information is in the installation directory
    private String resolveEnv(String source, String var, String prop) {
                if (appVersion == null || appVersion.isBlank()) {
        // remember that there may be UNC paths
            if (configurationLocation == null) {
    private static final String NL = "-nl"; //$NON-NLS-1$
            connection = url.openConnection();
                if (arg.equals(APPLICATION)) {
                if (!args[i].startsWith("-")) {
        return null;
            for (String value : values) {
        URL[] result = getDevPath(url);
                        configuration = null;
                } else {
                continue;
                final String overrideKey = key + EXT_OVERRIDE_USER;

    }
                System.setProperty(property, result.toExternalForm());
        // FIXME: disable this check for products which run in read-only environment, e.g. cloud based
                return false;
                System.setProperty(PROP_EXITCODE, "14"); //$NON-NLS-1$
            }

            }
                }
     * escaped sequences (%..) in the URL into the appropriate characters.
import java.util.zip.ZipFile;
                    // here we access the install location but this is very early.  This case will only happen if
     * @param start the location to begin searching
        if (osName.contains("WIN")) {
        if (Files.notExists(workspacePath)) {
            if (logFile == null || !logFileProp.equals(logFile.getAbsolutePath())) {
        }
        setMultiValueProperty(PROP_COMMANDS, commands);
        //    defined in .eclipseproduct marker file. If .eclipseproduct does not
        if (osName.equals(Constants.OS_WIN32))
                    if (!path.endsWith(File.separator))
                String message = "An error has occurred"; //$NON-NLS-1$
        try {
            }
                appName += File.separator + installDirHash;
        for (String string : baseJars) {
            return null;
                .collect(Collectors.joining(",", "{\"args\":[", "]}"));
            }
        return getOS() + '_' + getWS() + '_' + getArch();
            // only log the exceptions if they have not been caught by the
                showSplash = true;
     * of the given location.
            return null;

     * consume the arguments and leave them to be processed by Eclipse proper.
     * Returns url of the location this class was loaded from
            return result;
    private static final String PRODUCT = "-product"; //$NON-NLS-1$
                if (installArea.startsWith(FILE_SCHEME))
    private static final String PROP_LOGFILE = "osgi.logfile"; //$NON-NLS-1$
                        buf.append(var == null ? "" : var); //$NON-NLS-1$
        if (ws != null)
                    } else {
            }

    private URL[] getBootPath(String base) throws IOException {
                    log.write(' ');
                    if (fragment != null)
    private static final String DBEAVER_SECURE_DIR = "secure"; //$NON-NLS-1$
        beforeFwkInvocation();
        String libPath = null;
        ssl.init(null, factory.getTrustManagers(), null);
            ensureAbsolute(PROP_BASE_CONFIG_AREA);
        type = System.getProperty(PROP_PARENT_CLASSLOADER, type);
            if (addNoSplash) {
    private String searchForBundle(String target, String start) {
            return Constants.OS_LINUX;
                    buf.append(c);
     *
            boolean clean = false;
            if (debug) {
            result = loadProperties(url);
            devPathList = devClassPathProps.getProperty("*"); //$NON-NLS-1$
    private String getLibraryPath(String fragmentName, URL[] defaultPath) {
package org.jkiss.dbeaver.launcher;
    }
import java.lang.reflect.InvocationTargetException;
            }
                result.add("nl" + File.separatorChar + nl.replace('_', File.separatorChar) + File.separatorChar + name); //$NON-NLS-1$

                    Consider using an older version of DBeaver that supports your operating
        try (FileInputStream in = new FileInputStream(eclipseProduct)) {
    private static final String CONFIG_DIR = "configuration/"; //$NON-NLS-1$
     * @param args the command line arguments
                ZipEntry zipEntry = entries.nextElement();
            if (args[i - 1].equalsIgnoreCase(DEV)) {
        // handle the case where people mistakenly spec a refererence: url.
        commands = args;
            return Constants.WS_GTK;
            while (entries.hasMoreElements()) {
     * so the return value here is the file system path.
                    entry = searchFor(entryFile.getName(), entryFile.getParent());
        StringTokenizer st = new StringTokenizer(path, VARIABLE_DELIM_STRING, true);
        Identifier(String versionString) {
        } catch (MalformedURLException e) {
                // original property wasn't set by a commad-line arg

            ((Throwable) obj).printStackTrace(new PrintWriter(log));

     * the check always succeeds.
    private static final String ENDSPLASH = "-endsplash"; //$NON-NLS-1$
                System.out.println("Workspace not exists: " + workspacePath);
                }
        }
        }
            // done checking for args.  Remember where an arg was found
        }
            }
            // check for args without parameters (i.e., a flag arg)
            if (args[i].equalsIgnoreCase(NOSPLASH)) {
    private StringBuilder appendPaddedInt(int value, int pad, StringBuilder buffer) {
        return configurationLocation;
        } catch (Exception e) {
        } else if (PARENT_CLASSLOADER_CURRENT.equalsIgnoreCase(type))
    }
                String sourceClasspath = source.getProperty(PROP_CLASSPATH);
    private static final String INSTALL_HASH_PLACEHOLDER = "@install.hash"; //$NON-NLS-1$
        if (suffix != null && !suffix.isEmpty()) //$NON-NLS-1$
            return;
            return;
     * @return the array of string tokens
                response -> HttpResponse.BodySubscribers.ofString(StandardCharsets.UTF_8);
        } else {
    }
            log.write(getDate(new Date()));
            try (FileInputStream inStream = new FileInputStream(eclipseProduct)) {

                    url = new File(string.substring(5)).toURL();
            return Constants.WS_COCOA;
            return new CommandLineExecuteResult(shutdownApplication || cliMode, exitCode);
                if (libFile.isFile())
        }
        if (result != 0)
            if (Character.isUpperCase(path.charAt(0))) {
        splashDown = bridge.takeDownSplash();
        if (baseJars.length == 0) {
            HttpClient client = HttpClient.newBuilder()
        new File(logFile.getParent()).mkdirs();
            return;
            // no dots after target, the '_' is not in a version (foo.x86_64 case), not a match
                Files.copy(input, outputFile);
                arg.equals(OS) || arg.equals(WS) || arg.equals(ARCH) ||
                    } catch (Throwable e) {

                }
    /*
        Properties props = new Properties();
            }
    /**

                log(e);
import java.util.zip.ZipEntry;
    //for change detection in the base when running in shared install mode
import java.util.stream.Stream;
                    System.out.println("DBeaver server port property not found or blank in properties file: " + dbeaverProperties);
            Matcher outputMatcher = CommandLineConstants.OUTPUT_PATTERN.matcher(responseData);
        try (var is = Files.newInputStream(dbeaverProperties)) {
    public int run(String[] args) {
                    continue;
        if (libPath == null) {
        return connection.getLastModified();
            return Path.of(Constants.WORKSPACE);
        // determine the splash location
                return new FileInputStream(f);
            }
        try {
                    configArgs[configArgIndex++] = i++;
            }
            }
            String action = null;
    private static final String PROP_IGNORE_USER_CONFIGURATION = "eclipse.ignoreUserConfiguration"; //$NON-NLS-1$
                }
                path = new String(chars);
            // only set the value if it doesn't already exist to preserve ordering (command-line, user config, shared config)
        String timestamp = result.getProperty(KEY_CONFIGINI_TIMESTAMP);
                        prop = System.getenv(var);
    protected void takeDownSplash() {
            return Constants.OS_QNX;
                null,
        } catch (MalformedURLException e) {
        File candidate = new File(start, names[result]);
            target = target.substring(REFERENCE_SCHEME.length());
                    if (log != null)
     * @return a boolean indicating whether the checking passed
     * This should only be called from #log()
    private URL[] getDevPath(URL base) throws IOException {
                        // found a value; use it
            if (!"13".equals(System.getProperty(PROP_EXITCODE))) { //$NON-NLS-1$
        String installDirHash = getInstallDirHash();
                        mergeWithSystemProperties(configuration, null);
        Path dbeaverDataDir = getDataDirectory();
            }
        //get past all '_' that are part of the qualifier

        }
            if (arg.equals("-consoleLog")) {
        if (cache.endsWith(".jar")) //$NON-NLS-1$
        if (arch != null)
                    .toArray(String[]::new);
        // Note that the parent may or may not be the same parent as we read above since the
            getInstallLocation();
                    if (Files.exists(defaultLocation)) {
        // Note that in a cascaded situation, the user configuration may be ignored if the parent
            else
            }

     */
            throw e;
            url = buildURL(base, true);
    private static final String ECLIPSE_PROPERTIES = "eclipse.properties"; //$NON-NLS-1$
        ArrayList<URL> result = new ArrayList<>(5);
            }
            }
                }
    protected boolean cliMode = false;
                    splashDown = true;
     * Runs the platform with the given arguments.  The arguments must identify
        }
            System.setProperty(PROP_INSTALL_AREA, installLocation.toExternalForm());
            String version = ""; //$NON-NLS-1$ // Note: directory with version suffix is always > than directory without version suffix
                found = true;
            else {
                path = new File(path).toURL().getFile();
     * The location of the launcher to run.
        // cache the splash in the equinox launcher sub-dir in the config area
                    String timestamp = new Date().toString();
    private String extractFromJAR(String jarPath, String jarEntry) {
        // Get the splash screen for the specified locale
                    varStarted = true; // we found the start of a var
        //    defined in .eclipseproduct marker file. If .eclipseproduct does not
        if (userHome == null) {
        URL installURL = getInstallLocation();
            // Return "unlucky" 13 as the exit code. The executable will recognize
            String folder = bridge.getOSRecommendedFolder();
    private static final String PRODUCT_SNAPSHOT_VERSION = "snapshot"; //$NON-NLS-1$
    // Data mode constants for user, configuration and data locations.
        }
            }
                }
    private BufferedWriter logForStream(OutputStream output) {
    /**
        if (!showSplash)
            File installDir = new File(install.getFile());
                // Workaround for bug 489958. javax.annotation.* types are only available from
            // let things fail later on their own if necessary.

        // figure out what we will be loading

    private String OS_WS_ARCHToString() {
                endSplash = arg;

            }


                    log.newLine();
    JNIBridge bridge = null;

        // normalize to not have leading / so we can check the form
                return false;
    private static final String ECLIPSE = "eclipse"; //$NON-NLS-1$
        if (!toAdjust.isAbsolute()) {
            } else if (lib.exists()) {
                        log.flush();
     * The -showsplash argument may indicate the bitmap used by the native launcher,
    private static final String PROP_ARCH = "osgi.arch"; //$NON-NLS-1$
        return sb.toString();
    private static final String PROP_VM = "eclipse.vm"; //$NON-NLS-1$
                configurationLocation = buildProductURL();
                location = baseConfiguration.getProperty(PROP_INSTALL_AREA);
        }
    );
    private static final String PROP_INSTALL_AREA = "osgi.install.area"; //$NON-NLS-1$
                }
    /**
                    location = new File(base, userDefaultAppendage).getAbsolutePath();
        return libPath;
            String macConfiguration = computeConfigurationLocationForMacOS();
    public static final String ARG_ECLIPSE_KEYRING = "-eclipse.keyring"; //$NON-NLS-1$
            }
         */
    private static final String STARTER = "org.eclipse.core.runtime.adaptor.EclipseStarter"; //$NON-NLS-1$
                continue;
                    result.put(key, substituteVars(value));

     * The id of the bundle that will contain the framework to run.  Defaults to org.eclipse.osgi.
        if (!checkVersion(System.getProperty("java.version"), System.getProperty(PROP_REQUIRED_JAVA_VERSION))) //$NON-NLS-1$
            }
            if (sharedConfigURL == null)
                    if (result.exists())
     * @return hash code as String
            Properties props = new Properties();
                    location = new File(base, userDefaultAppendage).getAbsolutePath();
                String name = extension;
        // TODO a little dangerous here.  Basically we have to assume that it is a file URL.
            }
            // otherwise, try to make the spec into a file URL.
        }

                    maxVersion = currentVersion;
    }

        //check the path passed in from -showsplash first.  The old launcher passed a timeout value
                }
        File file = new File(path);
            return service >= minimum.service;

            if (args[i].equalsIgnoreCase(Constants.ARG_FORCE_CLI_MODE)) {
                    if (lastKnownBaseTimestamp == sharedConfigTimestamp || lastKnownBaseTimestamp == NO_TIMESTAMP) {
        }
        URL install = getInstallLocation();
        return null;
    private String computeConfigurationLocationForMacOS() {
     * @param args the command line arguments
                }
            hashCode = -(hashCode);
        try (
                System.out.println("Could not load " + PRODUCT_SITE_MARKER + " file: " + e.getMessage());

        if (osName.equalsIgnoreCase(Constants.INTERNAL_OS_AIX))
                    toAdjust = new File(installArea.substring(5), toAdjust.getPath());
        File candidateFile = new File(root, candidate);
        Properties configuration = baseConfiguration;
                    mergeWithSystemProperties(configuration, null);
            if (log == null) {

    /**

            } catch (Throwable ex) {
                props.load(inStream);
        }
import java.security.CodeSource;
            log("Exception looking for " + jarEntry + " in JAR file: " + jarPath); //$NON-NLS-1$ //$NON-NLS-2$

            if (args[i - 1].equalsIgnoreCase(NAME)) {
    }
        } finally {


        extensionPaths = extensionResults.toArray(new String[0]);
    private static void setSystemPropertyIfNotSet(String key, String value) {
                System.out.print("Configuration file:\n    " + url); //$NON-NLS-1$
            configDir.mkdirs();
            url = new URL(url, CONFIG_FILE);

            // property not defined
    }
            padding = padding / 10;
            urlString = urlString.substring(10);
                    }
    /**
            if (fragment != null)
        } else {
                }
     * the file is returned as is.

         * 1.3.2 >= 1.3.1 -> true

        }
            }
                        return result;
                log("Exception launching the Eclipse Platform:"); //$NON-NLS-1$


    private static final String DBEAVER_SECURE_FILE = "secure_storage"; //$NON-NLS-1$
                        // could not find a value append the var; keep delemiters
    private static final String PROP_CONFIG_AREA = "osgi.configuration.area"; //$NON-NLS-1$
        File installDir = new File(installURL.getFile());

            mergeWithSystemProperties(configuration, null);
            parent = ClassLoader.getSystemClassLoader();
            log = null;
     * The value of N is derived from the value returned from running the application.
                System.out.println("Error processing remote command line: " + e.getMessage());
        for (String candidate : candidates) {
    private static final String INITIALIZE = "-initialize"; //$NON-NLS-1$
        if (candidates == null)
 * other Java code. This class exists only for the purpose of launching Eclipse

        Collections.addAll(result, SPLASH_IMAGES);
        //if the bridge is null then we have nothing to send the data to;
                        return result.getAbsolutePath(); // return the first match found [20063]
        }
            else if (location.equalsIgnoreCase(NO_DEFAULT))
                    }
        try {
            log.write(STACK);
    }
            baseJarList = System.getProperty(PROP_CLASSPATH);
        for (int i = 0; i < args.length; i++) {

            }
            } catch (NumberFormatException e) {

import java.net.http.HttpRequest;
        } catch (Exception e) {
        return candidate.getAbsolutePath().replace(File.separatorChar, '/') + (candidate.isDirectory() ? "/" : ""); //$NON-NLS-1$//$NON-NLS-2$
        final Path root = getDataDirectory();
    String[] extensionPaths = null;
            return null;
        if (showSplash || endSplash != null) {
        //url: file:foo/file.jar
     *
    }
                    toAdjust = new File(installArea, toAdjust.getPath());
                library = arg;

            // the location of the boot plugin we are going to use
            } catch (MalformedURLException e) {
                if (launcher == null)
        return properties;

            return new InstanceServerProperties(Integer.parseInt(portProperty), passwordProperty);

    /*
            return getInstallLocation() + path;
            }
            }
        setupJNI(null);
    /*
            }
        /**
        // if the configuration area is not already defined, discover the config area by

    protected static final String ENTRY = "!ENTRY"; //$NON-NLS-1$
                else if (new File(installArea).exists())
     * Ensures the value for a system property is an absolute URL. Relative URLs are translated to
                .header(InstanceServerProperties.HEADER_AUTHORIZATION, InstanceServerProperties.BEARER_PREFIX + properties.password())
     *

        result = ((Integer) left[2]).compareTo((Integer) right[2]); // compare service
    protected void beforeFwkInvocation() {
                    location = location.substring(0, idx) + getInstallDirHash() + location.substring(idx + INSTALL_HASH_PLACEHOLDER.length());
                        .resolve(DBEAVER_SECURE_DIR)
            // check if development mode should be enabled for the entire platform
            return properties;
                    You might experience issues and unexpected behavior when running DBeaver.
            String json = Arrays.stream(args)
                    appVersion = ""; //$NON-NLS-1$
            //look for the nl setting
            // has a '-' as the first character, then we can't have an arg with a parm so continue.
            baseConfiguration = loadConfiguration(baseConfigurationLocation);
     */
        //if the executable loaded the library, then we don't need the exitData id
                ;
    }
                    } else {
        if (pad == 0)
                if (shouldOverride && !userConfiguration.contains(key)) {
        System.clearProperty(property);
        if (libPath == null && bootLocation != null) {
        setExitData();
        } catch (IOException e) {
     * @param prop the initial comma-separated string
    public static final String PROP_LAUNCHER = "eclipse.launcher"; //$NON-NLS-1$
                    File entryFile = new File(entry.substring(5).replace('/', File.separatorChar));
            }

        }
        URL result = null;
    /*
        String var = null; // the current var key
     * <li>./configuration</><br>

    private String getWS() {
                // qualifier ... string value
                if (location.startsWith(USER_HOME)) {
        }
            if (checkConfigurationLocation(installationUrl)) {

        if (lastUnderscore == targetLength)

            URL sharedConfigURL = buildLocation(PROP_SHARED_CONFIG_AREA, null, ""); //$NON-NLS-1$
        }
        // just reuse the base
        try {
    private SSLContext initCustomSslContext() throws Exception {
                    if (result != null)
            String path = searchForBundle(extension, parent);
                parent = appCL.getParent();
            return Constants.WS_GTK;
    }
            if (baseConfiguration != null) {
    protected static final String STACK = "!STACK"; //$NON-NLS-1$
        if (osName.equalsIgnoreCase(Constants.INTERNAL_OS_HPUX))
                action = actionMatcher.group(1);
        } catch (IOException e) {
    protected String getDate(Date date) {
            return result;
            if (portProperty == null || portProperty.isBlank()) {
            if (result != null) {
    /**

            System.err.println("This application is configured to run in a cascaded mode only."); //$NON-NLS-1$
        return value + source.substring(var.length());
                System.out.println("DBeaver server properties not found in workspace: " + workspacePath);
                        buf.append(VARIABLE_DELIM_CHAR);
            }
            }
    private boolean isJAR(String path) {
    private URL buildLocation(String property, URL defaultLocation, String userDefaultAppendage) {
import java.nio.file.Files;
            return Path.of(customWorkspacePath);
    }
    private static final String CONFIG_FILE = "config.ini"; //$NON-NLS-1$
                System.out.println("\tNo timestamp file found"); //$NON-NLS-1$
        Method method = clazz.getDeclaredMethod("run", String[].class, Runnable.class); //$NON-NLS-1$
            if (entry != null) {
     * current product.  The given appendage is added to this base location
     * or the bitmap location may be extracted from the config.ini
     * an application to run (e.g., <code>-application com.example.application</code>).

        if (urlString.startsWith(PLATFORM_URL)) {
        // if we have already extracted this file before, then return
 *
        int padding = (int) Math.pow(10, pad);

                    splashLocation = args[i];
        }
            //Search the extension relatively to the osgi plugin
                .filter(Objects::nonNull)

                result = defaultLocation;
            }
    private URL buildProductURL() {
            }
                }
                        devClassPath = devClassPathProps.getProperty("*"); //$NON-NLS-1$
        else
        @Override
            log(e);
    }
            arch = osgiArch;
        if (candidate.equals(target))

    }
    }
            return NO_TIMESTAMP;

        if (obj == null)
                System.out.println("Loaded eclipse product properties: " + properties);
        }
            // now and let things fail later on their own if necessary.
            // should not happen - the relative URL is known to be valid
     * launched application calling Platform.endSplash(). This handle calls
        if (installURL == null)
    /*
            }
    private void checkCompatibleWindowsVersion() {
        if (lastDot < targetLength) {
     * @return url of location
    static final String PROP_NOSHUTDOWN = "osgi.noShutdown"; //$NON-NLS-1$
        @SuppressWarnings("unused")
        int result = 0;
    private static final String PROP_WS = "osgi.ws"; //$NON-NLS-1$
    private String splashLocation = null;
            }
            if (args[i].equalsIgnoreCase(NEW_INSTANCE)) {
            installLocation = buildURL(installArea, true);
        // the install location.
        protected Class<?> findClass(String moduleName, String name) {
        path = file.toString().replace('\\', '/');
        // preparing for Java 9
                // we have an exit code of 13, in most cases the user tries to start a 32/64 bit Eclipse
        URL url;
        System.setProperty(PROP_LOGFILE, logFile.getAbsolutePath());
            if (!compatible) {
            char[] chars = fwkPath.toCharArray();
                if (location.startsWith(XDG_DATA_HOME)) {
     * Do a quick parse of version identifier so its elements can be correctly compared.
        String[] extensions = getArrayFromList(System.getProperty(PROP_EXTENSIONS));
