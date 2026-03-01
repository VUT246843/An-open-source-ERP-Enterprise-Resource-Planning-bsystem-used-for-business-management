 * Resource handler
    int FEATURE_DELETE          = 2;
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * limitations under the License.

    int FEATURE_RENAME          = 8;
 * You may obtain a copy of the License at
import org.eclipse.core.resources.IResource;
    String getTypeName(@NotNull IResource resource);
public interface DBPResourceHandler {

    @NotNull
/**
 *
import org.eclipse.core.runtime.CoreException;

 * Copyright (C) 2010-2024 DBeaver Corp and others


 * distributed under the License is distributed on an "AS IS" BASIS,

    @NotNull

    List<DBPDataSourceContainer> getAssociatedDataSources(DBNResource resource);
package org.jkiss.dbeaver.model.app;
    void openResource(@NotNull IResource resource) throws CoreException, DBException;
    int FEATURE_OPEN            = 1;
    int getFeatures(IResource resource);
 */
 * you may not use this file except in compliance with the License.

import org.jkiss.dbeaver.DBException;
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
    @Nullable

    DBPImage getResourceIcon(@NotNull IResource resource);
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    String getResourceDescription(@NotNull IResource resource);

import org.jkiss.dbeaver.model.DBPImage;
 *     http://www.apache.org/licenses/LICENSE-2.0

    int FEATURE_MOVE_INTO       = 16;
import java.util.List;
    DBNNode makeNavigatorNode(@NotNull DBNNode parentNode, @NotNull IResource resource) throws CoreException, DBException;
 * Unless required by applicable law or agreed to in writing, software

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *
    int FEATURE_CREATE_FOLDER   = 4;
 */
import org.jkiss.dbeaver.model.navigator.DBNNode;
    @NotNull
    String getResourceNodeName(@NotNull IResource resource);
 *
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.navigator.DBNResource;
/*
}
