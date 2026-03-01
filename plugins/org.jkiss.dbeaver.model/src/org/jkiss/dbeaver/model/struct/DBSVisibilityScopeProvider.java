}
import org.jkiss.dbeaver.DBException;
 *
public interface DBSVisibilityScopeProvider {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * limitations under the License.
/**
 * you may not use this file except in compliance with the License.
     * Returns additional globally visible scopes, like information_schema
import org.jkiss.code.NotNull;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    List<DBSObjectContainer> getPublicScopes(@NotNull DBRProgressMonitor monitor) throws DBException;
import java.util.List;

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**

    @NotNull

 * Unless required by applicable law or agreed to in writing, software
 * Provides additional globally visible scopes
     */
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
/*
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.model.struct;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
 *
