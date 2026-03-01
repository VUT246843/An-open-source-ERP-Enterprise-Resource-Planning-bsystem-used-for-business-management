 * DBeaver - Universal Database Manager
    @NotNull
 * limitations under the License.
 *
/**
    IFolder getResourceDefaultRoot(@NotNull DBPProject project, @NotNull Class<? extends DBPResourceHandler> handlerType, boolean forceCreate);
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package org.jkiss.dbeaver.model.app;
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Reloads workspace contents. Creates missing projects, removes unexistent projects
    IFolder getResourceDefaultRoot(@NotNull DBPProject project, @NotNull DBPResourceHandlerDescriptor handler, boolean forceCreate);
import org.jkiss.dbeaver.model.DBPExternalFileManager;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    void refreshWorkspaceContents(@NotNull DBRProgressMonitor monitor) throws DBException;
    DBPProject createProject(@NotNull String name, @Nullable String description) throws DBException;
    DBPResourceHandler getResourceHandler(IResource resource);
    @Nullable
 */
 * You may obtain a copy of the License at
    @Nullable
    /**
    DBPResourceHandlerDescriptor[] getAllResourceHandlers();
    @NotNull
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,


 * Desktop eclipse based workspace
 * Copyright (C) 2010-2024 DBeaver Corp and others
    DBPResourceHandler getDefaultResourceHandler();
import org.jkiss.dbeaver.DBException;

import org.eclipse.core.resources.IFolder;

import org.eclipse.core.resources.IResource;

public interface DBPWorkspaceDesktop extends DBPWorkspaceEclipse, DBPExternalFileManager {
     */

 * you may not use this file except in compliance with the License.
    void deleteProject(@NotNull DBPProject project, boolean deleteContents) throws DBException;
    @Nullable
 * Unless required by applicable law or agreed to in writing, software

