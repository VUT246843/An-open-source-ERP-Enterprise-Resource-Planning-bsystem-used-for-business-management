}
    DBFFileSystemDescriptor getFileSystemProvider(@NotNull String id);

 * See the License for the specific language governing permissions and

 *
 * You may obtain a copy of the License at


 * Unless required by applicable law or agreed to in writing, software
/**
/*

 *

 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * you may not use this file except in compliance with the License.
 *
 * Virtual file system registry
 */
    DBFFileSystemDescriptor[] getFileSystemProviders();
public interface DBFRegistry {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 */
    DBFFileSystemDescriptor getFileSystemProviderBySchema(@NotNull String schema);
package org.jkiss.dbeaver.model.fs;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
