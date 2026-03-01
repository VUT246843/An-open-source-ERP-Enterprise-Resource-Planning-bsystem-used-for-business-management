import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
            : Path.of(USER_HOME_PATH_STRING, "AppData", "Local");

 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.runtime.IEnvironmentPathMapper;

        
import org.jkiss.utils.StandardConstants;

package org.jkiss.dbeaver.winstore;
 *
    }
        realVirtualizedRoot = localAppDataPath.resolve("Packages")

    private static final String WINDOWS_APP_LOCAL_DATA_PACKAGE = "DBeaverCorp.DBeaverCE_1b7tdvn0p0f9y";
    private static final String APP_DATA_ROAMING_PATH_STRING = System.getenv("AppData");
    public boolean isApplicable(@NotNull String localEnvPath) {
 *
        Path remappedPath = realVirtualizedRoot.resolve(Path.of(APP_DATA_ROAMING_PATH_STRING).relativize(Path.of(localEnvPath)));

    
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
    public String map(@NotNull String localEnvPath) {
import java.nio.file.Path;
    
            .resolve(WINDOWS_APP_LOCAL_DATA_PACKAGE).resolve("LocalCache").resolve("Roaming");
            ? Path.of(LOCAL_APP_DATA_PATH_STRING)
        Path localAppDataPath = LOCAL_APP_DATA_PATH_STRING != null
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
}
        String resultPath = remappedPath.toString();
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
 * See the License for the specific language governing permissions and
    @Override
    private static final Log log = Log.getLog(WinStoreEnvPathMapper.class);
    @Override
 * you may not use this file except in compliance with the License.
 */
import org.jkiss.dbeaver.utils.RuntimeUtils;
        
        return resultPath;
    @NotNull
public class WinStoreEnvPathMapper implements IEnvironmentPathMapper {
    private static final String USER_HOME_PATH_STRING = System.getProperty(StandardConstants.ENV_USER_HOME);
        log.debug("Remapping file path [" + localEnvPath + "] to [" + resultPath + "]");

    public WinStoreEnvPathMapper() {
        return RuntimeUtils.isWindowsStoreApplication() && localEnvPath.startsWith(APP_DATA_ROAMING_PATH_STRING);
 *
    private final Path realVirtualizedRoot;
/*
    private static final String LOCAL_APP_DATA_PATH_STRING = System.getenv("LOCALAPPDATA");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.Log;

