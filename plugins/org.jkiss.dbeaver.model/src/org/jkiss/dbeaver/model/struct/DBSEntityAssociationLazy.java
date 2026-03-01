 */
}public interface DBSEntityAssociationLazy extends DBSEntityAssociation {
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
    DBSEntity getAssociatedEntity(@NotNull DBRProgressMonitor monitor) throws DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 *
import org.jkiss.code.Nullable;

import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * DBSEntityAssociationLazy
    @Nullable

 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.struct;
    DBSEntityConstraint getReferencedConstraint(@NotNull DBRProgressMonitor monitor) throws DBException;
/**
 *
 *

