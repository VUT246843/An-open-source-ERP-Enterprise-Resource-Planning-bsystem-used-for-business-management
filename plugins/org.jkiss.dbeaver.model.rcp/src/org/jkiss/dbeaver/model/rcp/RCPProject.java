 *
}

 * DBeaver - Universal Database Manager
public interface RCPProject extends DBPProject {
import org.jkiss.code.NotNull;
     */
import org.jkiss.dbeaver.model.app.DBPProject;
 */



 */
import org.eclipse.core.resources.IContainer;
    IContainer getRootResource();
//    @NotNull

 * RCP project
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
import org.jkiss.code.Nullable;
import org.eclipse.core.resources.IProject;
 *
    String getResourcePath(@NotNull IResource resource);
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Returns logical resource path
/**
    @Nullable

/*
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Nullable
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
//    DBPWorkspaceDesktop getWorkspace();
    IProject getEclipseProject();
 * Licensed under the Apache License, Version 2.0 (the "License");

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.rcp;
 * limitations under the License.
    /**
import org.eclipse.core.resources.IResource;
 *
 * See the License for the specific language governing permissions and

