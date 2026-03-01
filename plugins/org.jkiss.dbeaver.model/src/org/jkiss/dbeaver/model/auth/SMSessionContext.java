
 * you may not use this file except in compliance with the License.
    @Nullable

     * @param open  if true then new session will be opened if possible
    boolean removeSession(@NotNull SMSession session);

     * Find and opens space session
}
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Holds various auth sessions.
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
 * Session context.
 */

import org.jkiss.dbeaver.DBException;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
     */
import org.jkiss.code.NotNull;

 *
    @Nullable
/**
 * Unless required by applicable law or agreed to in writing, software
    /**

public interface SMSessionContext {
 */
package org.jkiss.dbeaver.model.auth;

     * @param space target space
 * Licensed under the Apache License, Version 2.0 (the "License");

 * distributed under the License is distributed on an "AS IS" BASIS,
    /**
    @Nullable
 *
 * limitations under the License.
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
    void addSession(@NotNull SMSession session);
     * Workaround to determine the correct context in QM
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
    SMSession findSpaceSession(@NotNull SMAuthSpace space);
    SMSession getSpaceSession(@NotNull DBRProgressMonitor monitor, @NotNull SMAuthSpace space, boolean open) throws DBException;
    SMAuthSpace getPrimaryAuthSpace();
