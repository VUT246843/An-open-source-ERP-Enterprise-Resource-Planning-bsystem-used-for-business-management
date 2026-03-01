    @Nullable
    String getDescription();
    @NotNull
    void moveResourceProperties(@NotNull String oldResourcePath, @NotNull String newResourcePath);
     * @param key property key

 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    void dispose();
 * you may not use this file except in compliance with the License.
 * limitations under the License.

    String getRuntimeProperty(@NotNull String key);
    DBSValueEncryptor getValueEncryptor() throws DBException;

 *
    Object getResourceProperty(@NotNull String resourcePath, @NotNull String propName);
import org.jkiss.dbeaver.model.task.DBTTaskManager;
    void setResourceProperties(@NotNull String resourcePath, @NotNull Map<String, Object> newProps);
public interface DBPProject extends DBPObject, SMAuthSpace, DBAPermissionRealm {
        throw new IllegalStateException("Task manager is not supported by " + getClass().getSimpleName());
    boolean isUseSecretStorage();
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
 * Project meta information.
    @NotNull
import org.jkiss.dbeaver.model.fs.DBFFileSystemManager;
import org.jkiss.dbeaver.model.secret.DBSValueEncryptor;

    String METADATA_FOLDER = ".dbeaver";

    /**
     */
import org.jkiss.dbeaver.DBException;
    @NotNull

package org.jkiss.dbeaver.model.app;

 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.model.navigator.DBNModel;
/*
    DBPDataSourceRegistry getDataSourceRegistry();
     *


 * Unless required by applicable law or agreed to in writing, software
     */
 */
    DBFFileSystemManager getFileSystemManager();
    String[] findResources(@NotNull Map<String, ?> properties) throws DBException;
     */
    Map<String, Object> getResourceProperties(@NotNull String resourcePath);
import java.util.Map;

    @NotNull
     */
    @NotNull

     * Set the runtime property.
    default DBTTaskManager getTaskManager(boolean create) {
    @Nullable
    /**

    @NotNull
import java.util.UUID;
/**
 * See the License for the specific language governing permissions and
     * @param value property value

    SMSessionContext getSessionContext();
     * Project unique ID.

    // In multi-user environment virtual project is a project owned by user

    void ensureOpen();


        return getSessionContext().findSpaceSession(getWorkspace());
    @NotNull
    boolean isPrivateProject();

    /**
import org.jkiss.dbeaver.model.auth.SMSession;

    // Project with no persistent state
import org.jkiss.dbeaver.model.access.DBAPermissionRealm;
import java.nio.file.Path;
    }
    /**
    void setProjectProperty(@NotNull String propName, @Nullable Object propValue);
    Path getMetadataFolder(boolean create);
import org.jkiss.dbeaver.model.DBPObject;
    default DBTTaskManager getTaskManager() {
    void setProjectProperties(@NotNull Map<String, Object> properties);
 */
    void updateProject(@Nullable String newName, @Nullable String description) throws DBException;
     */
    @Nullable
    String getName();

     */
    @NotNull
    void refreshProject(DBRProgressMonitor monitor);
    /**
    /**


 *
    @Nullable
    @Nullable



    @NotNull
import org.jkiss.dbeaver.model.auth.SMAuthSpace;
     */
     * Otherwise, credentials are stored locally.
    void setRuntimeProperty(@NotNull String key, @Nullable String value);
 *
     * Is secret storage is enabled then all secret credentials are stored there.
    void setResourceProperty(@NotNull String resourcePath, @NotNull String propName, @Nullable Object propValue);
    boolean isVirtual();


    boolean isEncryptedProject();
     * An encryptor that can be used to encrypt and decrypt project data.
    Path getAbsolutePath();


     * Get the runtime property. Runtime property is a property that doesn't be stored and exists only in runtime.
     * @param key   property key
    boolean isRegistryLoaded();
    DBPWorkspace getWorkspace();

     */
     * Finds resources that match the supplied {@code properties} map.
     * @throws DBException if the encryptor is not available
    @Nullable
    @Nullable
     * Project UUID was deprecated. Use getId instead.

    default SMSession getWorkspaceSession() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Nullable
    DBNModel getNavigatorModel();

import org.jkiss.dbeaver.model.auth.SMSessionContext;

 * DBeaver - Universal Database Manager
    String getId();

    boolean isOpen();

import org.jkiss.code.NotNull;
    boolean isInMemory();
     * May start with RMProjectType prefix
     * Encrypted project configuration files are stored in encrypted form

    Object getProjectProperty(String propName);
     * Project auth context
}
    @NotNull

     *
     * close project and all related resources

    @NotNull
import org.jkiss.code.Nullable;
    @NotNull
    /**
    @NotNull
        return getTaskManager();
    /**

    String getDisplayName();

    @Deprecated
    /**
     *
     * @return property value
    }
 * You may obtain a copy of the License at
     */
    UUID getProjectID();
