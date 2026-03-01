import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * distributed under the License is distributed on an "AS IS" BASIS,
public interface DBFRemoteFileStore extends IFileStore {
/*
 * you may not use this file except in compliance with the License.
     * Refreshes this file store
import org.jkiss.dbeaver.DBException;

package org.jkiss.dbeaver.model.fs;
     * @throws DBException if an error occurred during refresh
import org.eclipse.core.filesystem.IFileStore;
     *
     * @param monitor progress monitor for tracking refresh progress
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager

import org.jkiss.code.NotNull;

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * limitations under the License.
 */
/**
 * See the License for the specific language governing permissions and
    void refresh(@NotNull DBRProgressMonitor monitor) throws DBException;
     */
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * You may obtain a copy of the License at
    /**

 * An {@link IFileStore} that supports explicit refresh.
 * Unless required by applicable law or agreed to in writing, software
