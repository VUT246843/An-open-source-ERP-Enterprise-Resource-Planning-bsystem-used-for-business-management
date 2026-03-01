     * Flushes the list of recent workspaces from Eclipse preferences to DBeaver's {@code .workspaces} file.
        }
            if (workspaces.size() == RECENT_MAX_LENGTH) {
    @NotNull
                // Bug in 22.0.5
     * @return a list of recent workspace paths
import org.jkiss.dbeaver.Log;
        ChooseWorkspaceData data = new ChooseWorkspaceData(location.getDefault());
        var workspaces = Stream.of(data.getRecentWorkspaces())
            workspaces = backedUpWorkspaces;
            return Collections.emptyList();
            data.setRecentWorkspaces(workspaces.toArray(new String[RECENT_MAX_LENGTH]));
        saveWorkspacesToBackup(application, workspaces);

        }

    /**
    }
            .toList();
                Files.delete(path);
            log.debug("Unable to save backed up workspaces", e); //$NON-NLS-1$
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
     * The first entry in the list is the active workspace.
/*
 */
    }
        if (!backedUpWorkspaces.isEmpty()) {

    /**
            .filter(Objects::nonNull)
import java.nio.file.Files;
import java.io.IOException;
import org.jkiss.code.NotNull;
import java.util.List;
        List<String> backedUpWorkspaces = getBackedUpWorkspaces(application);


    static List<String> fetchRecentWorkspaces(@NotNull DBeaverApplication application, @NotNull Location location) {
     * @param location    instance location of the application
 * you may not use this file except in compliance with the License.

            .limit(RECENT_MAX_LENGTH)
    private static void saveWorkspacesToBackup(@NotNull DBeaverApplication application, @NotNull List<String> workspaces) {
     * @param application application for which recent workspaces must be flushed
    private static final int RECENT_MAX_LENGTH = 10;
     * @param location    instance location of the application
import java.nio.file.StandardOpenOption;
    private static List<String> getBackedUpWorkspaces(@NotNull DBeaverApplication application) {
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (!Files.exists(path) || Files.isDirectory(path)) {
            Path path = application.getWorkspacesFile();
        List<String> eclipseWorkspaces = Stream.of(data.getRecentWorkspaces())
            // We have our .workspaces file, prioritize it
            workspaces = eclipseWorkspaces;
        try {
        if (!backedUpWorkspaces.equals(workspaces)) {
            .distinct()
}
    }
import java.util.stream.Collectors;
            return Files.readAllLines(path);
 * You may obtain a copy of the License at

import java.nio.file.Path;
final class DBeaverWorkspaces {
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    private DBeaverWorkspaces() {
import java.util.stream.Stream;
        }
     */
    private static final Log log = Log.getLog(DBeaverWorkspaces.class);
        workspaces = workspaces.stream()
            log.debug("Unable to read backed up workspaces", e); //$NON-NLS-1$
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
            saveWorkspacesToBackup(application, workspaces);
    static void flushRecentWorkspaces(@NotNull DBeaverApplication application, @NotNull Location location) {

            return Collections.emptyList();
            }
     *
                Files.createDirectories(path.getParent());
 * A utility class that helps managing workspaces.
            Files.write(path, workspaces, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
 * limitations under the License.
        }

import org.eclipse.ui.internal.ide.ChooseWorkspaceData;
        List<String> workspaces;
        }
        try {

    }
        Path path = application.getWorkspacesFile();
        return workspaces;
 *
 *
     * <p>
 * Copyright (C) 2010-2025 DBeaver Corp and others
                workspaces.removeLast();

import java.util.Collections;
     *
    @NotNull
        } catch (IOException e) {
    // See org.eclipse.ui.internal.ide.ChooseWorkspaceData.RECENT_MAX_LENGTH
import java.util.Objects;
            // Otherwise, grab workspaces Eclipse knows about
    }
     * @param application application to retrieve workspaces work
import org.eclipse.osgi.service.datalocation.Location;
            }

            } else if (Files.isDirectory(path)) {
            if (!Files.exists(path.getParent())) {

        if (!workspaces.contains(workingFolder)) {
     * Fetches the list of recent workspaces and updates Eclipse preferences, if needed.
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (!eclipseWorkspaces.equals(workspaces)) {
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.app.standalone;

        String workingFolder = application.getDefaultWorkingFolder().toString();
            .toList();
/**
        }

            data.writePersistedData();
 * See the License for the specific language governing permissions and
 */
        } else {
        var data = new ChooseWorkspaceData(location.getDefault());
        } catch (IOException e) {
        }

            workspaces.addFirst(workingFolder);
