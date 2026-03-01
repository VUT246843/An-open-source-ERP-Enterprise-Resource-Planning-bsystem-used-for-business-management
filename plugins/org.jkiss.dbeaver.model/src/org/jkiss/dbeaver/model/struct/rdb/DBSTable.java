     * @param monitor progress monitor
     *
 *
 */
 *
 *
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.Nullable;
 * See the License for the specific language governing permissions and
    /**
import org.jkiss.dbeaver.DBException;
 * DBeaver - Universal Database Manager
     * @throws DBException on any DB error
}
package org.jkiss.dbeaver.model.struct.rdb;
    List<? extends DBSTrigger> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException;
import java.util.Collection;
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.DBPQualifiedObject;
 * limitations under the License.
import java.util.List;
     * Foreign keys can be obtained with {@link #getReferences(org.jkiss.dbeaver.model.runtime.DBRProgressMonitor)}
     * @return list of indices
     * @param monitor progress monitor


public interface DBSTable extends DBSEntity, DBPQualifiedObject {
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @throws DBException on any DB error

 * Unless required by applicable law or agreed to in writing, software

    /**
    @Nullable
     */

     *
     * @throws DBException on any DB error
     * @return foreign keys list
     */
    Collection<? extends DBSTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException;
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * @return list of constraints
 */
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
    boolean isView();
    Collection<? extends DBSTableConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException;

import org.jkiss.dbeaver.model.struct.DBSEntity;
/**
    @Override
     * Gets foreign keys which refers this table
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 * Table
     * Keys are: primary keys and unique keys.
     * @param monitor progress monitor
     *
 * You may obtain a copy of the License at
     * Table indices
     */
    @Nullable

