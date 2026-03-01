    @Nullable
/**
 */
{
     * @param monitor progress monitor

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.struct;
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    /**
public interface DBSDocumentContainer extends DBSEntity
 *
 * you may not use this file except in compliance with the License.

import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
     */
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2024 DBeaver Corp and others
    DBSEntityAttribute getDocumentAttribute(@NotNull DBRProgressMonitor monitor) throws DBException;
 *

 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBSDocumentContainer
/*
     * @throws DBException on any DB error
 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * Unless required by applicable law or agreed to in writing, software
}
     * Retrieve document attribute

