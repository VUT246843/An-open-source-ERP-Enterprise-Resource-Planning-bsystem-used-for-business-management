    @Nullable
    @NotNull
     * @param attributeName column name  @return column or null



     * Gets this entity attributes
     * @return reference association list

     * Gets this entity constraints
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
     * @return attribute list

    DBSEntityType getEntityType();
    @Nullable
     * @param monitor progress monitor

     * @param monitor       progress monitor
     */
     * Gets this entity associations
import java.util.List;
     *

import java.util.Collection;
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param monitor progress monitor
     * Retrieve attribute by it's name (case insensitive)
    /**
     * @throws org.jkiss.dbeaver.DBException on any DB error
     */
     *
 * limitations under the License.
 *
     * Gets associations which refers this entity
     */
     * @return association list
     * Entity type
 * DBSEntity
 */
    /**
    /**
     *
/**
}
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     * @param monitor progress monitor
public interface DBSEntity extends DBSObject {
    /**
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
 *
 * See the License for the specific language governing permissions and
/*
     * @return entity type
    List<? extends DBSEntityAttribute> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException;
 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     */
     *
    DBSEntityAttribute getAttribute(@NotNull DBRProgressMonitor monitor, @NotNull String attributeName) throws DBException;
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @throws DBException on any DB error
 * DBeaver - Universal Database Manager
     * @return association list
package org.jkiss.dbeaver.model.struct;
    Collection<? extends DBSEntityAssociation> getAssociations(@NotNull DBRProgressMonitor monitor) throws DBException;

    @Nullable
import org.jkiss.code.NotNull;
     * @throws org.jkiss.dbeaver.DBException on any DB error
     * @param monitor progress monitor
     *
import org.jkiss.code.Nullable;
     */
     * @throws org.jkiss.dbeaver.DBException on any DB error
     */
    Collection<? extends DBSEntityAssociation> getReferences(@NotNull DBRProgressMonitor monitor) throws DBException;

 * Unless required by applicable law or agreed to in writing, software
     * @throws DBException on any DB error
    Collection<? extends DBSEntityConstraint> getConstraints(@NotNull DBRProgressMonitor monitor) throws DBException;
    /**
     *
 */
    @Nullable
