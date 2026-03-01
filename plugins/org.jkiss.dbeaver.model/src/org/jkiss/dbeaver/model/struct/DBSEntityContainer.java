 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.List;
        throws DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
}
 * Licensed under the Apache License, Version 2.0 (the "License");



 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
import org.jkiss.code.Nullable;
    DBSEntityTypeMapping[] getNestedEntityTypes();
 * DBSEntityContainer
    List<? extends DBSObject> getEntities(@NotNull DBRProgressMonitor monitor, @Nullable DBSEntityType entityType)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public interface DBSEntityContainer extends DBSObjectContainer {
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
/**
 *
 * Smarter version of DBSObjectContainer

 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.struct;

 */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 *
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.

/*
