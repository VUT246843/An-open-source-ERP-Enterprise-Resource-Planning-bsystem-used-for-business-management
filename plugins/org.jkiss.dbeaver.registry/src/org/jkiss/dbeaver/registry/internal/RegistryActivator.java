 * distributed under the License is distributed on an "AS IS" BASIS,
import org.osgi.framework.BundleContext;
import org.eclipse.core.runtime.Plugin;
                                "jna.boot.library.path",
            }
 * DBeaver - Universal Database Manager
                        }
        super.stop(context);
import java.nio.file.Path;
public class RegistryActivator extends Plugin {
                    if (Files.exists(jnaBundlePath)) {
        }

                            osArch = "aarch64";
                    String bundleFolderName = location.substring(divPos + 1);
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.utils.RuntimeUtils;
                .findFirst().orElse(null);

                        } else if (RuntimeUtils.isLinux()) {
import org.jkiss.utils.CommonUtils;
            String installPath = SystemVariablesResolver.getInstallPath();
    }
                    }
 * You may obtain a copy of the License at

                        if (RuntimeUtils.isOSArchAMD64()) {
    public void stop(@NotNull BundleContext context) throws Exception {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        } else if (RuntimeUtils.isOSArchAArch64()) {
 *

 * Licensed under the Apache License, Version 2.0 (the "License");

import java.util.Arrays;
                        String osName = null;
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (jnaBundle != null) {
    public void start(@NotNull BundleContext context) throws Exception {
                            osName = "linux";
            Bundle jnaBundle = Arrays.stream(context.getBundles()).filter(b -> "com.sun.jna".equals(b.getSymbolicName()))
 * See the License for the specific language governing permissions and
                        if (osName != null && osArch != null) {
                        }
        setJnaNativePath(context);

                        if (RuntimeUtils.isMacOS()) {
    }
}

                        String osArch = null;
                        } else if (RuntimeUtils.isWindows()) {
 * Unless required by applicable law or agreed to in writing, software
import java.nio.file.Files;
                }
    }
                            System.setProperty(
                            osName = "win32";
    }
                location = CommonUtils.removeTrailingSlash(location);
                                jnaBundlePath.resolve(osName + "-" + osArch).toAbsolutePath().toString());
    private static void setJnaNativePath(@NotNull BundleContext context) {
        super.start(context);
 * limitations under the License.
    public RegistryActivator() {
            Path pluginsPath = Path.of(installPath).resolve("plugins");
                int divPos = location.lastIndexOf("/");
                    Path jnaBundlePath = pluginsPath.resolve(bundleFolderName).resolve("com/sun/jna");
import org.jkiss.code.NotNull;
                if (divPos != -1) {
package org.jkiss.dbeaver.registry.internal;
import org.jkiss.dbeaver.utils.SystemVariablesResolver;

                        }
 *
        {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.osgi.framework.Bundle;
                            osArch = "x86-64";

/*
    @Override
 *
                            osName = "darwin";
    @Override
                String location = jnaBundle.getLocation();

 */
