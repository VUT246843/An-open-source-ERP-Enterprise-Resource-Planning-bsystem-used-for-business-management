 * DBPProjectListener

public interface DBPProjectListener
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.model.app;
 * distributed under the License is distributed on an "AS IS" BASIS,

/**


 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    default void handleActiveProjectChange(@NotNull DBPProject oldValue, @NotNull DBPProject newValue) {}
{
 * Unless required by applicable law or agreed to in writing, software
/*
 * limitations under the License.
    default void handleProjectAdd(@NotNull DBPProject project) {}
 */

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */
}
    default void handleProjectRemove(@NotNull DBPProject project) {}
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
 *
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
