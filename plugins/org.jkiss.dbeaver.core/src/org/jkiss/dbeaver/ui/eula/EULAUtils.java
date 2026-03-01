            Path installPath = RuntimeUtils.getLocalPathFromURL(Platform.getInstallLocation().getURL());
    public static String getPackageEula() {

            log.debug(e);
 * you may not use this file except in compliance with the License.
            Path eulaPath = installPath.resolve("eula.txt");
    public static final String DBEAVER_EULA = "DBeaver.eula";
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.io.IOException;
    public static String getEulaVersion() {
        }
    public static void showEula(@NotNull Shell shell, boolean needsConfirmation) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
/*
        if (needsConfirmation) {
    }
import java.nio.file.Files;
            if (!Files.exists(eulaPath) && DBWorkbench.getPlatform().getApplication().isCommunity()) {
                eulaPath = installPath.resolve("licenses/dbeaver-community-license.txt");
 *
import org.eclipse.swt.widgets.Shell;
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others


import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software

            if (Files.exists(eulaPath)) {
        } else {
    private static final Log log = Log.getLog(EULAUtils.class);
        EULAConfirmationDialog eulaDialog = new EULAConfirmationDialog(shell, eula);
 * You may obtain a copy of the License at

        return eulaVersion;
    private static void showEulaConfirmationDialog(@NotNull Shell shell, @Nullable String eula) {
    }

public class EULAUtils {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.Log;
    //TODO change hardcoded eula version to something more flexible


    private static final String eulaVersion = "1.0";
            showEulaInfoDialog(shell, eula);
 *
        eulaDialog.open();
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        } catch (IOException e) {
}

    }
 * DBeaver - Universal Database Manager
            }
        EULAInfoDialog eulaDialog = new EULAInfoDialog(shell, eula);
        String eula = EULAUtils.getPackageEula();
    }
import org.jkiss.code.NotNull;
 *
import org.eclipse.core.runtime.Platform;
        try {

        eulaDialog.open();
        return "EULA";
    private static void showEulaInfoDialog(@NotNull Shell shell, @Nullable String eula) {

import java.nio.file.Path;
                return Files.readString(eulaPath);
package org.jkiss.dbeaver.ui.eula;
            showEulaConfirmationDialog(shell, eula);
