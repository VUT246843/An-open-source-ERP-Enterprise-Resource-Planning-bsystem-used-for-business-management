 */
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;


 * Task type groups similar tasks. Tasks of the same type have the same configurator and are shown in the same category in UI.
    String getName();
    @NotNull
    @NotNull
import org.jkiss.dbeaver.model.DBPImage;
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
 *
/*


    String getId();
 * distributed under the License is distributed on an "AS IS" BASIS,

    DBTTaskCategory[] getChildren();
 * limitations under the License.
    DBTTaskType[] getTaskTypes();
    String getDescription();
    DBPImage getIcon();
 *
    DBTTaskCategory getParent();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Task type descriptor.
 * DBeaver - Universal Database Manager
    @Nullable
package org.jkiss.dbeaver.model.task;
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
    @NotNull


public interface DBTTaskCategory {
 *
 * See the License for the specific language governing permissions and
    @Nullable
}
 *

    @Nullable
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */

