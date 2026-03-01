import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull SMSessionContext context,
/*
 *
 * DBeaver - Universal Database Manager
/**
import org.jkiss.code.Nullable;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 *


 * Session provider service
 *     http://www.apache.org/licenses/LICENSE-2.0

 * You may obtain a copy of the License at

        @NotNull DBRProgressMonitor monitor,
 */
        @NotNull SMAuthSpace space) throws DBException;

public interface SMSessionProviderService {
import org.jkiss.code.NotNull;
}import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
 * Copyright (C) 2010-2024 DBeaver Corp and others
    SMSession acquireSession(
 */
 *
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.auth;
