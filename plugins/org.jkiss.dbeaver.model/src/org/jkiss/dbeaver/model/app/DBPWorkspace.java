    /**
 *

    String getWorkspaceId();
    @NotNull
}
import org.jkiss.dbeaver.model.auth.SMSession;

     * Disposes workspace caches.
/*
 * You may obtain a copy of the License at
    SMSessionContext getAuthContext();

    void initializeProjects();
    @NotNull
import org.jkiss.code.Nullable;
    Path getAbsolutePath();
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
     */
public interface DBPWorkspace extends SMAuthSpace, DBAPermissionRealm {
     * Initializes workspace state.
 * Licensed under the Apache License, Version 2.0 (the "License");
    DBPProject getActiveProject();


import org.jkiss.dbeaver.model.access.DBAPermissionRealm;

 * DBeaver - Universal Database Manager
 */

 * Operates with projects, resources and user session.
 * *
    /**

        return getAuthContext().findSpaceSession(this);

package org.jkiss.dbeaver.model.app;
    }
    DBPImage getResourceIcon(DBPAdaptable resourceAdapter);
 *
    String METADATA_FOLDER = ".metadata";
     */
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.auth.SMSessionContext;
    @NotNull
import org.jkiss.code.NotNull;

 */

    DBPProject getProjectById(@NotNull String projectId);
    /**
import java.util.List;
    List<? extends DBPProject> getProjects();
    @Nullable
import org.jkiss.dbeaver.model.DBPImage;
        return hasRealmPermission(RMConstants.PERMISSION_PROJECT_ADMIN);

    DBPProject createProject(@NotNull String name, @Nullable String description) throws DBException;
import org.jkiss.dbeaver.model.auth.SMAuthSpace;
    DBPProject getProject(@NotNull String projectName);
    }
    /**
     */
     * Called once during workspace instantiation. Mustn't be called directly by user.
    Path getMetadataFolder();
    }
    @NotNull

import java.nio.file.Path;
    void deleteProject(@NotNull DBPProject project) throws DBException;
 * Unless required by applicable law or agreed to in writing, software
    @Nullable
import org.jkiss.dbeaver.model.rm.RMConstants;


    @NotNull
 * limitations under the License.

 * Copyright (C) 2010-2026 DBeaver Corp and others
     */
    void dispose();
    default boolean canManageProjects() {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
     * Finds project by ID
/**
    @Nullable

        return true;
    DBPPlatform getPlatform();
    void renameProject(@NotNull DBPProject project, @NotNull String newName) throws DBException;
    default boolean isEnabledSecretProviders() {

import org.jkiss.dbeaver.model.DBPAdaptable;
    boolean isActive();
     * Mustn't be called directly by user.

    @Nullable
 * you may not use this file except in compliance with the License.
 * User workspace.
import org.jkiss.dbeaver.DBException;
    default SMSession getWorkspaceSession() {
     * Workspace auth context

