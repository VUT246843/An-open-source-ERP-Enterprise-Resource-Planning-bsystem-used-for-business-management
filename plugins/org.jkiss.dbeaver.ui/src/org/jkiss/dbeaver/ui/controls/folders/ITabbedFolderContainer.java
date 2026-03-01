 * limitations under the License.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
 * You may obtain a copy of the License at
    ITabbedFolder getActiveFolder();
}    void removeFolderListener(ITabbedFolderListener listener);
public interface ITabbedFolderContainer
package org.jkiss.dbeaver.ui.controls.folders;
    @Nullable
 * you may not use this file except in compliance with the License.
import org.jkiss.code.Nullable;
/*

     */



 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *

/**
{
 *


    boolean switchFolder(@Nullable String folderId);

 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * IFolderedPart
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
 * Unless required by applicable law or agreed to in writing, software
    void addFolderListener(ITabbedFolderListener listener);
     * Switch to specified folder ID. If folderId isnull then switches to default (first) folder
