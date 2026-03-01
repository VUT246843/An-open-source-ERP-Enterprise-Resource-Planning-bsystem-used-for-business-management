 * Copyright (C) 2010-2025 DBeaver Corp and others


import org.eclipse.core.runtime.content.IContentType;
 *
/*
import org.jkiss.dbeaver.model.DBPImage;
    String[] getFileExtensions();
 *

    Collection<AbstractDescriptor.ObjectType> getResourceTypes();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0




    String RESOURCE_ROOT_FOLDER_NODE = "resourceRootFolder";
/**



 * DBeaver - Universal Database Manager
}
 * You may obtain a copy of the License at
    @Nullable
    String getDefaultRoot(@Nullable DBPProject project);

 * Licensed under the Apache License, Version 2.0 (the "License");
    boolean isManageable();
 * you may not use this file except in compliance with the License.
 */
package org.jkiss.dbeaver.model.app;
    String getName();
    @Nullable
    @NotNull

import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    Collection<IContentType> getContentTypes();

public interface DBPResourceTypeDescriptor {
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Resource handler info
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software

    DBPImage getIcon();
    @Nullable
 * limitations under the License.
    void setDefaultRoot(@NotNull DBPProject project, @Nullable String rootPath);
 *
    DBPImage getFolderIcon();

import org.jkiss.code.Nullable;

 */
import java.util.Collection;
    String getId();
    @NotNull
import org.jkiss.code.NotNull;
