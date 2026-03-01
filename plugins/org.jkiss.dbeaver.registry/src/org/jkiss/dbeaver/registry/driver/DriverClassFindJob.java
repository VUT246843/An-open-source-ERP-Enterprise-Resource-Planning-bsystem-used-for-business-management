                    }
        } catch (IOException e) {
import java.io.InputStream;
                return false;
package org.jkiss.dbeaver.registry.driver;
        if (!jarName.endsWith(".jar") && !jarName.endsWith(".zip")) {
                    // Check recursively
                            if (implementsInterface(currentFile, current, 0)) {
                    }
    }
        this.driver = (DriverDescriptor) driver;
                    }
    private final String interfaceName;
        String jarName = libFile.getFileName().toString();
import org.objectweb.asm.Opcodes;
                                driverClassNames.add(className);
 *
 * DBeaver - Universal Database Manager
    private boolean implementsInterface(JarFile currentFile, JarEntry current, int depth) throws IOException {
    private final DriverDescriptor driver;
            } else if (superName != null) {
        findDriverClasses(monitor);
        for (Path libFile : libFiles) {
                }
                JarEntry jarEntry = currentFile.getJarEntry(superName + CLASS_FILE_EXT);
                            return true;
                        }
import org.jkiss.dbeaver.model.connection.DBPDriver;
                        break;
                if (interfaceName.equals(superName)) {
                break;
    public static final String OBJECT_CLASS_NAME = "java/lang/Object";

    }
        return false;
            final String superName = cr.getSuperName();
import java.net.MalformedURLException;
            return;
            if (monitor.isCanceled()) {
        }
}

                findDriverClasses(monitor, findCL, libFile);
                // Superclass
            for (Enumeration<?> e = currentFile.entries(); e.hasMoreElements(); ) {
            int access = cr.getAccess();
        ClassLoader findCL = new URLClassLoader(libURLs.toArray(new URL[0]));
    private final boolean isInterface;

        this.interfaceName = interfaceName.replace(".", "/");
                    if (jarEntry != null) {
                }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        monitor.subTask(className);
    }
            monitor.done();
                        return true;

                        } catch (Throwable e1) {
                if (jarEntry != null) {
                    JarEntry jarEntry = currentFile.getJarEntry(intName + CLASS_FILE_EXT);

            }
    private List<String> driverClassNames = new ArrayList<>();
            ClassReader cr = new ClassReader(classStream);
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void findDriverClasses(DBRProgressMonitor monitor) {

                    JarEntry current = (JarEntry) e.nextElement();
            if (libFile != null && Files.exists(libFile) && !Files.isDirectory(libFile)) {
import java.nio.file.Files;
        return driverClassNames;
                for (String intName : interfaces) {
    public List<String> getDriverClassNames() {
        }
    }
                }
 */
                {
 * Unless required by applicable law or agreed to in writing, software
            // Dummy file type validation
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
 *
    private static final Log log = Log.getLog(DriverClassFindJob.class);
            if (!Files.isDirectory(libFile)) {
 * you may not use this file except in compliance with the License.
import java.util.jar.JarEntry;

import java.util.List;
        java.util.List<URL> libURLs = new ArrayList<>();
    @Override
                try {
    }
/*
                    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                        if (implementsInterface(currentFile, jarEntry, depth + 1)) {
                        String className = fileName.replaceAll("/", ".").replace(CLASS_FILE_EXT, ""); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
                    return true;
        this.isInterface = isInterface;
                    libURLs.add(libFile.toUri().toURL());
            }
    }
                        }
                }
        }
                String[] interfaces = cr.getInterfaces();
import java.util.jar.JarFile;
                        try {
    private void findDriverClasses(DBRProgressMonitor monitor, ClassLoader findCL, Path libFile) {
import org.jkiss.utils.ArrayUtils;
import org.objectweb.asm.ClassReader;
        java.util.List<Path> libFiles = driver.getDefaultDriverLoader().getAllLibraryFiles(monitor);
public class DriverClassFindJob implements DBRRunnableWithProgress {
 * Licensed under the Apache License, Version 2.0 (the "License");
                if (ArrayUtils.contains(interfaces, interfaceName)) {
            if (depth == 0 && ((access & Opcodes.ACC_PUBLIC) == 0 || (access & Opcodes.ACC_ABSTRACT) != 0)) {

    public DriverClassFindJob(DBPDriver driver, String interfaceName, boolean isInterface) {
import java.net.URL;

            }
        for (Path libFile : libFiles) {
                        monitor.worked(1);
                    }
                    if (jarEntry != null) {
                }
            }
                        return implementsInterface(currentFile, jarEntry, depth + 1);
import org.jkiss.utils.CommonUtils;
                    JarEntry jarEntry = currentFile.getJarEntry(superName + CLASS_FILE_EXT);
            }
                    log.debug(e);
import java.net.URLClassLoader;
        }
    public static final String CLASS_FILE_EXT = ".class";

    public void run(DBRProgressMonitor monitor) {
                    if (fileName.endsWith(CLASS_FILE_EXT) && !fileName.contains("$")) { //$NON-NLS-1$ //$NON-NLS-2$
                    if (monitor.isCanceled()) {
import org.jkiss.dbeaver.Log;
 * limitations under the License.
 *

import java.util.ArrayList;
import java.nio.file.Path;
                            }

        try (JarFile currentFile = new JarFile(libFile.toFile(), false)) {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
                    return true;
                }
            if (isInterface) {
                            // do nothing
                } catch (MalformedURLException e) {
                    if (implementsInterface(currentFile, jarEntry, depth + 1)) {
import java.util.Enumeration;
        try (InputStream classStream = currentFile.getInputStream(current)) {

 * You may obtain a copy of the License at
            log.debug(e);

import java.io.IOException;
                } else if (!CommonUtils.isEmpty(superName) && !superName.equals(OBJECT_CLASS_NAME)) {
            monitor.beginTask(jarName, currentFile.size());
                    String fileName = current.getName();
