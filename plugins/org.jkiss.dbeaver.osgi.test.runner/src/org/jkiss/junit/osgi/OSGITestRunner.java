 * You may obtain a copy of the License at
        }
                    Matcher matcher = pluginNamePattern.matcher(testClassPath);
            //use UTF-8 for run
                Arrays.stream(runnerProxy.getClass().getMethods()).filter(it -> it.getName().equals("run")).findFirst().orElseThrow()
import org.junit.runner.manipulation.NoTestsRemainException;

                Bundle bundle = context.installBundle(bundleFile);
            this.frameworkProperties = annotation.properties();
        } catch (Throwable throwable) {
    private Bundle loadAndStartBundles(BundleContext context) throws Exception {
                log.error("Bundle not resolved: " + bundleIntegerPair.getFirst().getSymbolicName());
 *     If OSGI environment is already running, it will not start a new one.
            launcher.start(appRegistryName, args);
                    String testClassPath = resource.toString();
            if (matcher.find()) {
    private static final boolean DEBUG_BUNDLE_LAUNCH = false;
import org.eclipse.osgi.service.runnable.ApplicationLauncher;
    private Bundle testBundle;

            config.put("org.osgi.framework.debug.loader", "true");

import org.junit.runner.notification.RunNotifier;
        @NotNull Class<? extends IAsyncApplication> testClass
        Map<String, String> config = new HashMap<>();
    }
            config.put("org.osgi.framework.debug.resolver", "true");
                return workPath.relativize(potentialWorkspaceDir);
            if (installed.contains(bundleFile) || bundleFile.contains("org.eclipse.osgi_")) {
    private static final Log log = Log.getLog(OSGITestRunner.class);
 * Copyright (C) 2010-2026 DBeaver Corp and others
            } catch (Exception e) {
        }

                    Pattern pluginNamePattern = Pattern.compile(".+/([\\w.]+)/target/");
import java.util.regex.Pattern;
    ) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {

        TestLauncher launcher = new TestLauncher(context);
            this.appRegistryName = annotation.registryName();
        throw new IllegalStateException("dbeaver-workspace/products directory not found");
            return Integer.compare(firstStart, secondStart);
    private String testBundleName;
                    boolean setUpIsDone = false;
            ServiceReference<EnvironmentInfo> configRef = context.getServiceReference(EnvironmentInfo.class);
            Object osgiListener = osgiListenerClass.getConstructor(Object.class).newInstance(notifier);
        return "app".equals(this.getClass().getClassLoader().getName());
import java.io.File;
    @Override
    private String[] args;
        if (args != null) {
    }

            throw new IllegalArgumentException("Application not found");
            log.debug(e);
        loadAndStartBundles(context);
                    String hostBundleHeader = headers.get("Fragment-Host");
        }
            }
                framework.waitForStop(0);
import java.nio.file.Paths;
                        }
            this.productPath = findProduct();
                runnerProxy.getClass().getMethod("filter", Filter.class).invoke(runnerProxy, filter);
        if (isRunFromIDEA()) {
 * DBeaver - Universal Database Manager
        if (isRunFromIDEA()) {
            .getClassLoader()
            }
import org.jkiss.junit.osgi.annotation.RunWithApplication;
        // Load and start all bundles
        // Install all bundles from the directory

                URL resource = testClass.getClassLoader().getResource(testClass.getName().replace('.', '/') + ".class");
 *     <li>{@link RunnerProxy} to specify the runner which should be executed in OSGI environment.</li>
                // Determine name of test bundle

 * <p>
        props.load(new FileInputStream(bundleDir));
 */
        // Specify the directory where the bundles are located
import org.junit.runner.manipulation.Filter;
        } catch (Throwable e) {
                }
                    }
            if (
        if (DEBUG_BUNDLE_LAUNCH) {
    private String[] vmArgs;

        while (currentPath != null) {
            } else {
import org.eclipse.equinox.internal.app.CommandLineArgs;
        // Enable boot delegation, to avoid class loading issues for some classes
            .loadClass(testClass.getAnnotation(RunnerProxy.class).value().getName())
                if (resource != null) {
                continue;
public class OSGITestRunner extends BlockJUnit4ClassRunner {
    public OSGITestRunner(
    @NotNull
            );
            try {
                Constructor<?> constructor = testBundle.loadClass(ProxyFilter.class.getName()).getConstructors()[0];
    }
import org.eclipse.osgi.util.ManifestElement;
                if (startLevel != 0 || bundle.getSymbolicName().equals(testBundleName)) {
 *
import org.osgi.framework.BundleException;
    public static final Pattern startLevel = Pattern.compile("@(\\d+):start");
            this.args = annotation.args();
            Method addListenerMethod = Arrays.stream(newOsgiNotifier.getClass().getMethods())
            startFramework();
        } finally {
            RunWithProduct annotation = testClass.getAnnotation(RunWithProduct.class);
        if (IAsyncApplication.class.isAssignableFrom(testClass)) {
 */

 * </p>

import org.jkiss.code.NotNull;
            int startLevel = 0;

            if (isRunFromIDEA()) {
import org.osgi.framework.Bundle;

        config.put("org.osgi.framework.storage.clean", "onFirstInit");
    private Path productPath;
            .map(Bundle::getLocation)
        }
            this.vmArgs = annotation.vmArgs();
                    try {
        Properties props = new Properties();
                // All test bundles are compiled and classes are in <bundle-path>/target
                        if (!setUpIsDone) {

            Bundle bundle = bundleWithStartLevel.getFirst();
        super(testClass);
import java.io.FileInputStream;
                    }
            if (testClass.getAnnotation(RunnerProxy.class) != null) {
                log.error(e);
                    long endTime = 0;
        // Start all installed bundles
        framework.start();
    }
                    }
    public void run(RunNotifier notifier) {
            config.put("org.osgi.framework.debug", "true");
            Thread thread = new Thread(() -> launcher.start(appRegistryName, args));
            ) {
        context.registerService(ApplicationLauncher.class.getName(), launcher,
        } else {
/*
        try {
            }
    private static Path findWorkspaceDir() {
                    bundle = hostBundle;
        } catch (Throwable throwable) {
 *     <br>
            }
            thread.start();
            if (bundle.getState() != Bundle.ACTIVE) {
                Object proxyNotifier = createProxyNotifier(notifier);
        config.put("osgi.compatibility.bootdelegation", "true");
        // find appBundleContainingClassname app bundle
                framework.stop();
            return workspace.resolve(product);
    private String appRegistryName;
        }
        );
            Path workspace = Path.of(findWorkspaceDir().toString());

 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
                }
        if (testClass.getAnnotation(RunWithApplication.class) != null) {
                    while (!setUpIsDone && endTime < 300000) {
                String key = vmArgs[i];
                bundleFile.contains(".app")
        for (String bundleFile : ManifestElement.getArrayFromList(props.getProperty("osgi.bundles"))) {
                    } catch (ClassNotFoundException e) {
        try {
        EquinoxConfiguration equinoxConfig = null;
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void getAppBundleFromAnnotation() {
            getAppBundleFromAnnotation();
        try {
        // Start the OSGi framework
            Integer firstStart = v1.getSecond();
        if (equinoxConfig != null) {
            throw new IllegalArgumentException("RunnerProxy annotation not found");
        }
    }
                            .invoke(runningClass.getConstructor().newInstance());
            String product = annotation.value();
    }
                        }
        } else {
            config.put("osgi.debug", "file:" + productPath.toAbsolutePath().resolve("debug_config").normalize());
        }
            try {
                runnerProxy.getClass().getMethod("filter", testBundle.loadClass(Filter.class.getName())).invoke(runnerProxy, filterProxy);
            }
            processCommandLine.setAccessible(true);
    }
        Path workPath = Paths.get("").toAbsolutePath();
                                break;
        return newOsgiNotifier;
                    bundle.start();
        if (testClass.getAnnotation(RunWithProduct.class) != null) {
    private void createProxyInTheBundleClassloader(
            this.framework = initializeFramework();
                log.error("Error initializing bundle message", e);
        }
    private Framework framework;
import java.net.URL;
import java.lang.reflect.Constructor;
        } else {
                try {
        framework.init();
            Matcher matcher = startLevel.matcher(bundleFile);
 *
        }
        } else {
            .value()
            }

    private Framework initializeFramework() {
import org.jkiss.junit.osgi.launcher.TestLauncher;
 *
        Constructor<?> proxy = testBundle.loadClass(testClass.getAnnotation(RunnerProxy.class)
                }
                        log.error("Error starting bundle message", e);
                    if (!e.getMessage().contains("Invalid operation on a fragment")) {
            if (bundle.getSymbolicName().contains(this.appBundleName)) {

}
 * limitations under the License.
import java.util.regex.Matcher;
    private void runInsideOSGI(RunNotifier notifier) {
 * you may not use this file except in compliance with the License.
                    bundlesByStartLevel.add(new Pair<>(bundle, startLevel));
        }
import org.junit.runners.BlockJUnit4ClassRunner;
            for (int i = 0; i < vmArgs.length; i += 2) {
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
        }
                        bundle.loadClass(testClass.getName());

    }
    @NotNull
            launchInExistingOSGI(notifier);
            .getName()).getConstructor(Class.class);
            Path potentialWorkspaceDir = currentPath.resolve("dbeaver-workspace/products");
        for (Bundle bundle : context.getBundles()) {
    private Path findProduct() {
        }
                        endTime = System.currentTimeMillis() - startTime;
    private Object runnerProxy = null;
import org.eclipse.osgi.internal.framework.EquinoxBundle;
import java.lang.reflect.Method;
        for (RunWithApplication.Property frameworkProperty : frameworkProperties) {
import java.nio.file.Path;
        } catch (Exception e) {
                    && !bundleFile.contains("org.eclipse")
                        testBundle = bundle;
                    if (hostBundleHeader != null) {
                log.error("Error stopping framework", e);
        }

            log.error("An error occurred while running the test", throwable);
            this.appBundleName = annotation.bundleName();
import org.jkiss.dbeaver.Log;
            processCommandLine.invoke(null, equinoxConfig);
            addListenerMethod.invoke(newOsgiNotifier, osgiListener);
            }
        Object newOsgiNotifier = testBundle.loadClass(RunNotifier.class.getName()).getConstructor().newInstance();
                        testBundleName = matcher.group(1);
    private void startFramework() throws Exception {
            createProxyInTheBundleClassloader(testBundle.loadClass(testClass.getName()));
                    long startTime = System.currentTimeMillis();
    ) throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
    private String appBundleName;
 *     <li>{@link RunWithApplication} to specify the application to run the test in.</li>
            }
                if (IAsyncApplication.class.isAssignableFrom(testClass)) {
        if (vmArgs != null && vmArgs.length > 1 && vmArgs.length % 2 == 0) {
                    .invoke(runnerProxy, notifier);
                        // ignore, expected

            }
    }
                // For that we also check that test bundle is a fragment.
                Bundle hostBundle = null;
            Class<?> osgiListenerClass = testBundle.loadClass(OSGITestRunListener.class.getName());
            log.error("Error applying filter to proxy", e);
            equinoxConfig.setAllArgs(args);
                }
import org.jkiss.utils.Pair;

                                hostBundle = b;
                            }
 *     It does by starting the OSGi framework and loading all the required bundles.
        }
            if (testClass.getAnnotation(RunnerProxy.class) != null) {
        BundleContext context = framework.getBundleContext();
        Path currentPath = workPath.toAbsolutePath();
    private void createProxyInSameClassloader(
        for (Pair<Bundle, Integer> bundleIntegerPair : bundlesByStartLevel) {
 * <h2>OSGITestRunner</h2>
                    if (matcher.find()) {
                runMethod.invoke(runnerProxy, proxyNotifier);
import org.eclipse.osgi.internal.framework.EquinoxConfiguration;
        }
    }
            }
        RunNotifier notifier
    private Object createProxyNotifier(
                }
                continue;
            throw new IllegalArgumentException("Product not found");
            try {
            if (bundle instanceof EquinoxBundle eb && eb.isFragment()) {
                // Analyze classpath, we don't have other way because we are not in OSGI container yet
            }
            }
    private Set<String> forceDependencies;

        config.put("org.osgi.framework.storage", "osgi-cache");
                            if (b.getSymbolicName().equals(hostBundleHeader)) {
    ) throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {

/**
        runnerProxy = constructor.newInstance(testClass);
            .collect(Collectors.toSet());
            equinoxConfig = (EquinoxConfiguration) context.getService(configRef);
                if (bundle.getSymbolicName().equals(testBundleName)) {
        } else {
            }
        File bundleDir = productPath.resolve("config.ini").toFile();
            }
                        for (Bundle b : context.getBundles()) {
                .filter(method -> method.getName().equals("addListener")).findFirst().orElseThrow();
            null
        }
import org.jkiss.junit.osgi.behaviors.IAsyncApplication;
                //TODO research why app bundles skipped
                // In this case we activate fragment host instead of main bundle
                "processCommandLine",
 *     Should allow debugging of the tests in the IDEA.
        }
                Method runMethod = Arrays.stream(runnerProxy.getClass().getMethods()).filter(it -> it.getName().equals("run"))

    ) throws Exception {
            createProxyInSameClassloader();
                if (hostBundle != null) {
                        setUpIsDone = (boolean) runningClass.getMethod("verifyLaunched")
                    log.debug("Started bundle: " + bundle.getSymbolicName());
                EnvironmentInfo.class
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
        // Specify the directory where the dev.properties file is located
import org.jkiss.junit.osgi.annotation.RunnerProxy;

        Constructor<?> constructor = testClass
                } catch (BundleException e) {
        try {
        PriorityQueue<Pair<Bundle, Integer>> bundlesByStartLevel = new PriorityQueue<>((v1, v2) -> {
                appBundle = bundle;
            Integer secondStart = v2.getSecond();

        config.put("osgi.dev", "file:" + productPath.toAbsolutePath().resolve("dev.properties").normalize());
        return frameworkFactory.newFramework(config);
    public void filter(Filter filter) throws NoTestsRemainException {
    }
import org.eclipse.osgi.service.environment.EnvironmentInfo;
import org.jkiss.junit.osgi.delegate.ProxyFilter;
                    && !bundleFile.contains(appBundleName)
        Set<String> installed = Arrays.stream(framework.getBundleContext().getBundles())
            } catch (BundleException e) {
                    .findFirst().orElseThrow();
        @NotNull Class<?> runningClass
        }

                    Dictionary<String, String> headers = bundle.getHeaders();
        });
                bundleFile = bundleFile.substring(0, bundleFile.lastIndexOf('@'));
    }
                    }
 *     The class is responsible for running the OSGi tests inside IDEA.
    @Override
import java.util.stream.Collectors;
        this.testClass = testClass;
    private final Class<?> testClass;
                Object filterProxy = constructor.newInstance(filter);
    private void launchInExistingOSGI(RunNotifier notifier) {

                            Thread.sleep(100);
            Method processCommandLine = CommandLineArgs.class.getDeclaredMethod(
            if (bundleIntegerPair.getFirst().adapt(BundleWiring.class) == null) {
        }
            RunWithApplication annotation = testClass.getAnnotation(RunWithApplication.class);
import org.osgi.framework.ServiceReference;
    }

import org.osgi.framework.launch.Framework;
                Class<?> runningClass = testBundle.loadClass(testClass.getName());
                System.setProperty(key, value);
import org.osgi.framework.wiring.BundleWiring;
            equinoxConfig.setAppArgs(args);
            this.forceDependencies = Arrays.stream(annotation.forceDependencies()).collect(Collectors.toSet());
        runnerProxy = proxy.newInstance(runningClass);
    private boolean isRunFromIDEA() {
            runInsideOSGI(notifier);
    }
        for (Pair<Bundle, Integer> bundleWithStartLevel : bundlesByStartLevel) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        super.filter(filter);
            currentPath = currentPath.getParent();
        return appBundle;
            config.put(frameworkProperty.name(), frameworkProperty.value());
    private RunWithApplication.Property[] frameworkProperties;

            if (bundleFile.lastIndexOf('@') >= 0) {
import org.osgi.framework.BundleContext;
        }
                }

                startLevel = Integer.parseInt(matcher.group(1));
            log.error("An error occurred while running the test", throwable);
 *     <li>{@link RunWithProduct} annotation to specify the product to run the test in.</li>
            if (Files.exists(potentialWorkspaceDir)) {
import org.osgi.framework.launch.FrameworkFactory;
    }
import java.util.*;
                break;
                    && forceDependencies.stream().noneMatch(bundleFile::contains)
                        //log.error(e);
                // We need to activate main test bundle (it has to be in the list of auto-activation bundles)
        if (testClass.getAnnotation(RunnerProxy.class) == null) {
package org.jkiss.junit.osgi;
                String value = vmArgs[i + 1];
        Bundle appBundle = null;
            } catch (Exception e) {
        FrameworkFactory frameworkFactory = ServiceLoader.load(FrameworkFactory.class).iterator().next();
import org.jkiss.junit.osgi.annotation.RunWithProduct;
            .getConstructor(Class.class);
                    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
