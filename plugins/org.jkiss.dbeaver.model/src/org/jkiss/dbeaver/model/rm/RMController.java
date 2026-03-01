     * Resource metainfo
    /**
     * Update a shared project information.
    RMProject[] listAccessibleProjects() throws DBException;
    @NotNull
    @NotNull
    /**
     * Reads project information
    /**
     * Sets all resource properties
    /**
     * Reads resources by path
    void deleteProjectDataSourceFolders(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    ) throws DBException;

    /**
        @NotNull String resourcePath,
     * Creates new empty resource
    RMResource[] getResourcePath(


    @NotNull
 * Resource manager API.
     * Delete project datasource folders.

        @NotNull String propertyName,
 * you may not use this file except in compliance with the License.
    String moveResource(
     */
     */
        @NotNull String newPath
     * Creates new shared project
        @Nullable String nameMask,
     * Reads single project property
    /**
    void setProjectProperty(@NotNull String projectId, @NotNull String propName, @Nullable Object propValue) throws DBException;
    /**
     * Writes resource data
 * Unless required by applicable law or agreed to in writing, software
    void deleteProjectDataSources(@NotNull String projectId, @NotNull String[] dataSourceIds) throws DBException;
public interface RMController extends DBPObjectController, DBPPingController {
        @NotNull String folderPath
 *
     * @param dropContents the drop contents
     */
 * DBeaver - Universal Database Manager
    RMResource[] listResources(

 * Licensed under the Apache License, Version 2.0 (the "License");
    String setResourceProperty(
     * Deletes shared project
package org.jkiss.dbeaver.model.rm;

     *
     */
        boolean readProperties,
        @NotNull String oldResourcePath,
        @NotNull String configuration,
     * Reads resource data
    /**
     */
    void createProjectDataSourceFolder(
        @NotNull String projectId,
    ////////////////////////////////////////////
    void createProjectDataSources(
     * Save datasources. Note: it only updates existing datasources.
        @NotNull String resourcePath) throws DBException;
        boolean recursive) throws DBException;
 * limitations under the License.

     */
    /**
    void deleteResource(
     * Moves resource to another folder
    @NotNull
 * You may obtain a copy of the License at
    @NotNull
 */
     */
    /**
     */
     */
    String createResource(
        @NotNull Map<String, Object> properties
     */
    @NotNull
     */
    boolean updateProjectDataSources(
 * Copyright (C) 2010-2025 DBeaver Corp and others

        @NotNull String projectId,
    /**
        @NotNull String newResourcePath) throws DBException;
    ) throws DBException;
     * Returns list of all projects accessible to calling user

        @NotNull String resourcePath,
    ) throws DBException;
        boolean readHistory,
    /**
    @Nullable

        @NotNull String projectId,

 * See the License for the specific language governing permissions and
     */
     * @param configuration configuration in modern format.
    byte[] getResourceContents(
        @NotNull String projectId,

    ) throws DBException;
import org.jkiss.code.NotNull;
    ////////////////////////////////////////////
     * @throws DBException the db exception
     * @param oldPath old path of the moving folder
    Object getProjectProperty(@NotNull String projectId, @NotNull String propName) throws DBException;
     * @param folderPaths  the folder paths
        @NotNull String projectId,
        @NotNull String projectId,
    RMProject updateProject(@NotNull String projectId, @NotNull RMProjectInfo projectInfo) throws DBException;
        @Nullable List<String> dataSourceIds) throws DBException;

 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
     * Save datasources. Note: it only adds datasources.
     */

     * Sets resource property
        @Nullable String folder,
    @NotNull
     * Deletes resource by path

     */

    // Projects
     *
     *
    String getProjectsDataSources(@NotNull String projectId, @Nullable String[] dataSourceIds) throws DBException;
    /**
     */
    @Nullable
    ) throws DBException;
        @NotNull String resourcePath,
    String setResourceContents(
        @NotNull String projectId,
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
    ////////////////////////////////////////////
     * @param newPath new path of the moving folder
 *
        boolean isFolder) throws DBException;
        @Nullable List<String> dataSourceIds) throws DBException;
import java.util.Map;
        @NotNull String projectId,
    String setResourceProperties(
    /**
    // DataSources
     */
import org.jkiss.dbeaver.DBException;


    void moveProjectDataSourceFolder(
    /**
        @NotNull String projectId,
    @NotNull

    /**

 *
    RMProject[] listAllSharedProjects() throws DBException;
    /**
     * Resources hierarchy
        boolean recursive) throws DBException;

        @NotNull String projectId,
        @NotNull String resourcePath
}
    @Nullable
        @Nullable Object propertyValue) throws DBException;
    RMProject createProject(@NotNull String name, @Nullable String description) throws DBException;
    /**

        @NotNull String projectId,
     */
     */
        @NotNull String projectId,
     */
/**

     * Returns list of all shared projects
     */

import java.util.List;

        boolean dropContents
        @NotNull String[] folderPaths,
     *
    /**



     * @param projectId  id of the project
        @NotNull String projectId,
    RMProject getProject(@NotNull String projectId, boolean readResources, boolean readProperties) throws DBException;
     * @param projectId    the project id
    /**
    ) throws DBException;
     */
     */
        @NotNull String resourcePath,

     * Sets project property
 */
        boolean forceOverwrite) throws DBException;
import org.jkiss.code.Nullable;
        @NotNull String projectId,
        @NotNull String oldPath,
    @NotNull
     * @param configuration configuration in modern format.
     * Delete datasource by Ids

    // Resources


import org.jkiss.dbeaver.model.DBPObjectController;
/*
import org.jkiss.dbeaver.model.app.DBPPingController;
     * Moves project datasource folder
        @NotNull byte[] data,
     * Returns datasources configuration in modern format
        @NotNull String projectId,
    /**

        @NotNull String resourcePath
    RMResource getResource(
    /**

        @NotNull String configuration,
    void deleteProject(@NotNull String projectId) throws DBException;
    /**
     */
        @NotNull String resourcePath,
