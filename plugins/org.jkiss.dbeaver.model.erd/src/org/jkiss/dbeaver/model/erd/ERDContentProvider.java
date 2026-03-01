/*
     *
        @NotNull DBSEntityAssociation association,
}
    ERDAssociation createAssociation(ERDContainer diagram,
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
        @NotNull ERDEntityAttribute targetAttribute,
/**
 */
        @NotNull ERDAttributeSettings settings
        @NotNull List<ERDEntity> otherEntities,

import org.jkiss.dbeaver.model.exec.DBCException;

     *
     * @param targetAttribute - target attribute

     *
     * @param targetEntity - target
     * @param settings      attribute settings
import org.jkiss.code.NotNull;
     */
        @NotNull ERDEntityAttribute sourceAttribute,

     * @param diagram - Diagram
 * Unless required by applicable law or agreed to in writing, software
        @NotNull ERDEntity sourceEntity,
    /**
        @NotNull ERDEntity targetEntity,
    void setAttribute(String name, Object value);
     * @param reflect - additional for pk
     * @param erdEntity     entity to be filled

     * Create default entity attributes according to specified settings.
import java.util.List;
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
     * @param otherEntities list of entities if they are added as a batch
        @NotNull ERDDiagram diagram,

     *
     */
 */
        @NotNull ERDEntity sourceEntity,
     * @param sourceAttribute - source attribute
public interface ERDContentProvider {
        @NotNull DBSEntityAssociation association,

     * @param diagram       Diagram
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    );
 * limitations under the License.
    ERDAssociation createAutoAssociation(ERDContainer diagram,
     * Create default entity attributes according to default settings.
 * ERD content provider
    /**
package org.jkiss.dbeaver.model.erd;
     * Create entity associating according to specified attributes.
        @NotNull ERDEntity targetEntity,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        @NotNull List<ERDEntity> otherEntities,
     * @param sourceEntity - source
     * @param entities the list of entities to evaluate and process; must not be null

import org.jkiss.code.Nullable;

     */
    /**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * You may obtain a copy of the License at
        boolean reflect);
     * Hides any columns in the provided list of entities that are not in use if this option is enabled.
    void fillEntityFromObject(
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
        @NotNull ERDEntity erdEntity,
    ) throws DBCException;
    void fillEntityFromObject(
 * you may not use this file except in compliance with the License.
     */
    @Nullable
        @NotNull DBRProgressMonitor monitor,
     * @param otherEntities list of entities if they are added as a batch
     * @param diagram       Diagram
        @NotNull ERDEntity erdEntity
     * @param association - container
    default void hideUnusedColumns(@NotNull DBRProgressMonitor monitor, @NotNull List<ERDEntity> entities) {}

    @Nullable
        boolean reflect);
 * DBeaver - Universal Database Manager
    boolean allowEntityDuplicates();
     * @param erdEntity     entity to be filled
        @NotNull ERDDiagram diagram,
        @NotNull DBRProgressMonitor monitor,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    <T> T getAttribute(String name);
