 * You may obtain a copy of the License at
 * Copyright (C) 2010-2025 DBeaver Corp and others


package org.jkiss.dbeaver.model.struct;
 * DBSDocumentLocator
/**
public interface DBSDocumentLocator extends DBSDocumentContainer
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.data.DBDDocument;
 *

    boolean isDocumentValid(@NotNull DBDDocument documentId) throws DBException;
     * Find document by key attributes
/*
{
        @NotNull DBCSession session,

import java.util.Map;
     *
 *
 * you may not use this file except in compliance with the License.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
}
 */
        @Nullable Map<String, Object> metaData
 * limitations under the License.
        @NotNull Map<String, Object> key,
import org.jkiss.dbeaver.model.exec.DBCSession;
     */
     * @param session session
 * Licensed under the Apache License, Version 2.0 (the "License");
    /**
    ) throws DBException;

     * @throws DBException on any DB error
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
 * Unless required by applicable law or agreed to in writing, software

 *
 * See the License for the specific language governing permissions and
    DBDDocument findDocument(
import org.jkiss.code.NotNull;
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
