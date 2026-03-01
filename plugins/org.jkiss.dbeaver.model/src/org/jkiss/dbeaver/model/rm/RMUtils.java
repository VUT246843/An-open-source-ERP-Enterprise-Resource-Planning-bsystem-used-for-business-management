            case SHARED:

     * Different types of project have different location on the workspace. Method returns path to the project.

            case GLOBAL -> getRootPath();
     */
    @NotNull

import java.nio.file.Path;
 * You may obtain a copy of the License at

        }
    @NotNull
        }
        switch (RMProjectType.getByPrefix(prefix)) {
 *
 */
        int divPos = projectId.indexOf("_");
     * @param projectId project name or other identifier
        }
            default:
            case SHARED -> getSharedProjectsPath();
        RMProject project = new RMProject("anonymous");
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull
        return DBWorkbench.getPlatform().getWorkspace().getAbsolutePath();
    @NotNull
    @NotNull
        return getRootPath().resolve(USER_PROJECTS_FOLDER);
    }
    }
/*
     *
        if (divPos <= 0) {
     * @return path to the project based on the name of projects and prefixes that it contains
}
 * DBeaver - Universal Database Manager
    }
                    throw new DBException("Global projects are not supported");

 *     http://www.apache.org/licenses/LICENSE-2.0
    public static Path getProjectPath(@NotNull RMProject project) {
    }
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        project.setId("anonymous");
        Path folder = switch (project.getType()) {
                if (CommonUtils.isEmpty(defaultProjectName)) {
        int divPos = projectId.indexOf("_");

    public static Path getUserProjectsPath() {
    }
 *
    public static Path getProjectPathById(@NotNull String projectId) throws DBException {
        project.setProjectPermissions(RMProjectPermission.DATA_SOURCES_EDIT.getAllPermissions().toArray(new String[0]));
        String projectName = projectId.substring(divPos + 1);
    public static Path getSharedProjectsPath() {
            throw new DBException("Bad project ID");
                return getRootPath().resolve(defaultProjectName);
                }
        return projectId.substring(divPos + 1);

    public static RMProject createAnonymousProject() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

public class RMUtils {
    @NotNull
import org.jkiss.code.NotNull;
        String projectName = path.getFileName().toString();
        return type.getPrefix() + "_" + projectName;
    /**
            default -> getUserProjectsPath();
 * limitations under the License.
        return folder.resolve(project.getName());
import org.jkiss.utils.CommonUtils;
    }

            throw new DBException("Bad project ID");

 * See the License for the specific language governing permissions and

    public static Path getRootPath() {
                return getSharedProjectsPath().resolve(projectName);
        String prefix = projectId.substring(0, divPos);
                String defaultProjectName = DBWorkbench.getPlatform().getApplication().getDefaultProjectName();
    @NotNull
        return getRootPath().resolve(SHARED_PROJECTS_FOLDER);
        if (divPos <= 0) {
package org.jkiss.dbeaver.model.rm;
        project.setType(RMProjectType.USER);
    public static final String SHARED_PROJECTS_FOLDER = "shared-projects";
    public static final String USER_PROJECTS_FOLDER = "user-projects";
    public static String getProjectName(@NotNull String projectId) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public static String makeProjectIdFromPath(@NotNull Path path, @NotNull RMProjectType type) {
 * you may not use this file except in compliance with the License.
                return getUserProjectsPath().resolve(projectName);

            case GLOBAL:

        };
import org.jkiss.dbeaver.runtime.DBWorkbench;
    @NotNull
import org.jkiss.dbeaver.DBException;

        return project;
    }
 * Unless required by applicable law or agreed to in writing, software
