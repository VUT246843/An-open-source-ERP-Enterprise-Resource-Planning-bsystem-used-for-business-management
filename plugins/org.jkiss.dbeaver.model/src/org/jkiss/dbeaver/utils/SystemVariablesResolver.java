import org.jkiss.dbeaver.model.fs.DBFUtils;
        } catch (Exception e) {
        switch (name) {
 * you may not use this file except in compliance with the License.
            installPath = getPlainPath(Platform.getInstallLocation().getURL());
                if (isResolveSystemVariables()) {
    public String get(@NotNull String name) {
import java.nio.file.Path;
                    if (var != null) {
                return getWorkspacePath();
        return true;
                return GeneralUtils.getProductName();
    public static final String VAR_HOME = "home";
            case VAR_APP_PATH:
    }
        if (installPath == null) {
 * SystemVariablesResolver
    public static String getInstallPath() {
 */
 * You may obtain a copy of the License at
    }

            return file.toAbsolutePath().toString();


    public static final String VAR_LOCAL_IP = "local.ip";
    }
            return url.toString();
 *
    public static final SystemVariablesResolver INSTANCE = new SystemVariablesResolver();
import org.jkiss.code.Nullable;
                }

            case VAR_DBEAVER_HOME:

    public static final String VAR_APP_NAME = "application.name";
                return getInstallPath();
    @NotNull

        }
    @NotNull
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


                return getUserHome();
    }
        } else {
                return null;

                        return o.toString();
    public static final String VAR_DBEAVER_HOME = "dbeaver_home";
 *     http://www.apache.org/licenses/LICENSE-2.0
                    String var = System.getProperty(name);
 * See the License for the specific language governing permissions and

    @NotNull
            case VAR_LOCAL_IP:
package org.jkiss.dbeaver.utils;
                }

    public static String getWorkspacePath() {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Nullable
import org.jkiss.dbeaver.runtime.DBWorkbench;
/*
                        return var;
/**
    }
    protected boolean isResolveSystemVariables() {
        }
                return RuntimeUtils.getLocalHostOrLoopback().getHostAddress();
    @NotNull

        }
 *
            case VAR_APP_VERSION:
            return DBFUtils.convertPathToString(DBWorkbench.getPlatform().getWorkspace().getAbsolutePath());
 * DBeaver - Universal Database Manager
            Path file = RuntimeUtils.getLocalFileFromURL(url);
        }
            default:
    private static String installPath;
            return getPlainPath(Platform.getInstanceLocation().getURL());
    @Override
public class SystemVariablesResolver implements IVariableResolver {
    public static final String VAR_WORKSPACE = "workspace";
        return installPath;
        //name = name.toLowerCase(Locale.ENGLISH);
    public static final String VAR_APP_VERSION = "application.version";
                    // Enable system variables resolve for standalone applications only
        return System.getProperty(StandardConstants.ENV_USER_HOME);
    private static Properties configuration;
import org.eclipse.core.runtime.Platform;
    public static final String VAR_APP_PATH = "application.path";
import org.jkiss.utils.StandardConstants;
import java.net.URL;
    public static void setConfiguration(Properties configuration) {
                    final Object o = configuration.get(name);
 * Unless required by applicable law or agreed to in writing, software
            case VAR_HOME:
 * Licensed under the Apache License, Version 2.0 (the "License");
}
        SystemVariablesResolver.configuration = configuration;
import java.util.Properties;
            case VAR_APP_NAME:
 *
                if (configuration != null) {
    private static String getPlainPath(@NotNull URL url) {
        try {


                    }
                return GeneralUtils.getProductVersion().toString();
                    }
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
            case VAR_WORKSPACE:
    public static String getUserHome() {
        if (DBWorkbench.isPlatformStarted()) {
                    return System.getenv(name);

 */
                    if (o != null) {
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.runtime.IVariableResolver;
    }
