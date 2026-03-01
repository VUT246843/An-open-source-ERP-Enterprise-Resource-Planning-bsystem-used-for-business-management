    /**
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
     * Get additional object information.

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    @Nullable
 * Object with detailed info.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 *
     */
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * See the License for the specific language governing permissions and
    DBPObject getObjectDetails(@NotNull DBRProgressMonitor monitor, @NotNull SMSessionContext sessionContext, @NotNull OBJECT dataSource) throws DBException;
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
public interface DBPObjectWithDetails<OBJECT> extends DBPObject {
 */
/*
     * Although this function required progress monitor it mustn't establish any remote database connections or require additional authentication.
 * distributed under the License is distributed on an "AS IS" BASIS,

 * DBeaver - Universal Database Manager
/**

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.auth.SMSessionContext;

package org.jkiss.dbeaver.model;
 */
import org.jkiss.code.Nullable;
 *
