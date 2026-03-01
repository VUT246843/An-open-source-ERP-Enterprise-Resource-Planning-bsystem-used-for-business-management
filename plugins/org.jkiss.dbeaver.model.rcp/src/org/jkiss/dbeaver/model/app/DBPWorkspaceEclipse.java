 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
    @Nullable
}
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.code.NotNull;
    <T extends DBPProject> T getProject(@NotNull IProject project);
 * Desktop eclipse based workspace
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * See the License for the specific language governing permissions and

{
 * you may not use this file except in compliance with the License.
 * limitations under the License.
    @NotNull
public interface DBPWorkspaceEclipse extends DBPWorkspace, DBPProjectManager
    void setActiveProject(@NotNull DBPProject project);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.eclipse.core.resources.IWorkspace;

import org.eclipse.core.resources.IProject;
import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
    IWorkspace getEclipseWorkspace();
/**
 *
 *
package org.jkiss.dbeaver.model.app;
    void save(DBRProgressMonitor monitor) throws DBException;

 */
