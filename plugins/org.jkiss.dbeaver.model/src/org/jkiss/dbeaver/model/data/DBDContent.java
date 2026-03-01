
public interface DBDContent extends DBDValue {

package org.jkiss.dbeaver.model.data;
     * Update contents
 * See the License for the specific language governing permissions and
     * Content type (MIME).
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,

/*
    @NotNull
    String getDisplayString(@NotNull DBDDisplayFormat format);
 * limitations under the License.
     * @throws DBException
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
 *
}
 *

    String getContentType();
 * you may not use this file except in compliance with the License.
    DBDContentStorage getContents(@NotNull DBRProgressMonitor monitor) throws DBCException;
        @NotNull DBDContentStorage storage)

/**
     * Resets contents changes back to original
     */
     */
     */
    /**
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @param storage storage
 * DBeaver - Universal Database Manager

    void resetContents();
     * @param monitor monitor


    long getContentLength() throws DBCException;
     */
     * Content length in bytes.
    @NotNull
    @Nullable
import org.jkiss.dbeaver.model.DBPDataSource;
    boolean updateContents(
    DBPDataSource getDataSource();
     * @return content type
     * @return true if implementation acquires passed storage object.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.jkiss.dbeaver.model.exec.DBCException;
     *   false if implementation copies storage.

     * @throws DBCException
 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.code.Nullable;
 */
    /**
 * Content value (LOB).
    /**
        throws DBException;
 * @author Serge Rider
 */
 *
import org.jkiss.dbeaver.DBException;
     * @return length

