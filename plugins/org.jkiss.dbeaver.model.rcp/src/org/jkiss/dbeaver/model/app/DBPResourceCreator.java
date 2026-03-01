
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
import org.eclipse.core.resources.IFolder;
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 */


    @NotNull
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.resources.IResource;
 * distributed under the License is distributed on an "AS IS" BASIS,
/*

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
    int FEATURE_CREATE_FILE     = 32;
 *
import org.jkiss.code.NotNull;
 * limitations under the License.
package org.jkiss.dbeaver.model.app;
 * Licensed under the Apache License, Version 2.0 (the "License");

 */
 * See the License for the specific language governing permissions and
}
    IResource createResource(@NotNull IFolder folder) throws CoreException, DBException;
 *
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

public interface DBPResourceCreator extends DBPResourceHandler {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Resource creator
