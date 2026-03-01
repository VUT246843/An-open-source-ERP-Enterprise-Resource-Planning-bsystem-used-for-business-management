}
     * @return object description or null
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.model;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.DBException;
 *
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
public interface DBPObjectWithLazyDescription extends DBPObjectWithDescription {
 */
    @Nullable
import org.jkiss.code.Nullable;
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
/*

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String getDescription(@NotNull DBRProgressMonitor monitor) throws DBException;
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at

    /**
 *
     *
     */
     * Loads description and returns it.
import org.jkiss.code.NotNull;
