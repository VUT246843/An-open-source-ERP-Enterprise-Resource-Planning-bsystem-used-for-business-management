
 * distributed under the License is distributed on an "AS IS" BASIS,
                return true;
        }
        StringTokenizer st = new StringTokenizer(cmd);
            log.debug("Error opening file in explorer", e);
import java.io.*;

 */
            final Writer writer = new StringWriter();
                process = Runtime.getRuntime().exec(splitCommand(cmd));
 * DBeaver - Universal Database Manager
            } else {
        // prevent constructing utility class
        }
     */
    public static boolean openExternalFile(@NotNull Path path) {

            final String cmd = formShowInSystemExplorerCommand(file);
                try {
            }
        showInSystemExplorer(new File(path));
    private static String quotePath(@NotNull String path) {
    private ShellUtils() {
            if (Util.isLinux() || Util.isMac()) {
            }
    }
        String command = IDEWorkbenchPlugin.getDefault().getPreferenceStore().getString(IDEInternalPreferences.WORKBENCH_SYSTEM_EXPLORER);
    @NotNull
            } else {
    }
            ca[i] = st.nextToken();
 * You may obtain a copy of the License at
    @NotNull
import java.nio.file.Path;
        return ca;
import org.jkiss.utils.IOUtils;
                return true;

            }
            // Windows: Can't quote, since explorer.exe has a very special command line parsing strategy.
    /**
            // Quote for usage inside "", man sh, topic QUOTING:
 */
     */
    }
        try {
     * @return {@code true} on success, {@code false} on failure if the file can't be opened
    }
import org.eclipse.swt.program.Program;
    private static String[] splitCommand(@NotNull String cmd) {
        command = Util.replaceAll(command, "${selected_resource_uri}", path.getCanonicalFile().toURI().toString());
            log.error("Unable to open external file", e);
        File parent = path.getParentFile();
}
            if (RuntimeUtils.isMacOS()) {
     */

        for (int i = 0; st.hasMoreTokens(); i++) {
            IOUtils.copyText(reader, writer);
    }
        }
                executeWithReturnCodeCheck("xdg-open", path.toAbsolutePath().toString());
package org.jkiss.dbeaver.ui;
    }
        return command;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    // as it doesn't know how to deal with them. So probe the latter first, and fall back to the former. If both fail, show an error.
        return Program.launch(path);
        if (Util.isLinux() || Util.isMac()) {
        }
    /**
     * Opens a file under the given {@code path} using preferred for the current platform application.
 * limitations under the License.

 * See the License for the specific language governing permissions and
        if (code != 0) {
        }
            command = Util.replaceAll(command, "${selected_resource_parent_loc}", quotePath(parent.getCanonicalPath()));
    private static final Log log = Log.getLog(ShellUtils.class);
            throw new IOException("Process ended with code " + code + ": " + writer);

     * Adopted from {@link org.eclipse.ui.internal.ide.handlers.ShowInSystemExplorerHandler}
                log.debug("Execution of '" + cmd + "' failed with return code: " + code);
        } catch (IOException e) {
    public static boolean launchProgram(@NotNull String path) {
import org.eclipse.jface.util.Util;
    public static void showInSystemExplorer(@NotNull File file) {
            }
        String[] ca = new String[st.countTokens()];

     *

            Desktop.getDesktop().open(path.toFile());
 * Unless required by applicable law or agreed to in writing, software

        final int code = process.waitFor();
 *
                    executeWithReturnCodeCheck("open", "-a", "Finder.app", path.toAbsolutePath().toString());
    public static void showInSystemExplorer(@NotNull String path) {
    /**
     * @param path path to a file to open
    private static String formShowInSystemExplorerCommand(@NotNull File path) throws IOException {
        }
import java.awt.*;
import org.jkiss.dbeaver.utils.RuntimeUtils;
                }
            DBWorkbench.getPlatformUI()
 *
    private static void executeWithReturnCodeCheck(@NotNull String... cmd) throws IOException, InterruptedException {
        final Process process = Runtime.getRuntime().exec(cmd);
     * @param path of a file to highlight
                } catch (IOException e) {
            if (code != 0 && !Util.isWindows()) {
                launchProgram(file.getAbsolutePath());

     *
 *
import java.util.StringTokenizer;
            int code = process.waitFor();
            return path.replaceAll("[\"$`]", "\\\\$0");
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
     * Opens the default file system explorer and highlights the supplied file.
                launchProgram(file.getParent());
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (file.isDirectory()) {
 * Utilities for interacting with the OS shell
import org.jkiss.dbeaver.Log;
     *

            return path;
        } catch (IOException | InterruptedException e) {
                process = Runtime.getRuntime().exec(new String[]{"/bin/sh", "-c", cmd}); //$NON-NLS-1$
        try {
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    executeWithReturnCodeCheck("open", path.toAbsolutePath().toString());
    }
    }
    @NotNull
/*
            final Reader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        }
        } catch (IOException | InterruptedException e) {
        if (parent != null) {
            log.debug("Unable to open external program in a platform-specific way: " + e.getMessage());
     */
/**
        try {


            final Process process;
        command = Util.replaceAll(command, "${selected_resource_loc}", quotePath(path.getCanonicalPath()));
                    // In recent versions of macOS, open -a Finder.app <path> no longer works for known file associations,
                .showError("Unable to open external program", "Unable to open external program in a platform-specific way", e);
                    // so we have to rely on open <path>, but we can't use it for unknown associations either,

            return false;
public final class ShellUtils {
    /**
     * Opens the default file system explorer and highlights the file denoted by the supplied path.
    /**
     */
     * Adopted from {@link org.eclipse.ui.internal.ide.handlers.ShowInSystemExplorerHandler}

            return true;

            } else if (RuntimeUtils.isLinux()) {
    }
        } else {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.code.NotNull;


import org.eclipse.ui.internal.ide.IDEInternalPreferences;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
     * @param file to highlight
