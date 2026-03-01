    public List<ERDAssociation> getAssociations() {

        return CommonUtils.safeList(associations);
 * you may not use this file except in compliance with the License.
 * Model object representing a relational entity
 */
 * See the License for the specific language governing permissions and
        references.add(table);
/**
    /**
     * @param table the foreign key relationship
    /**

import org.jkiss.code.NotNull;
        if (associations == null) {
/*
}
            }
            for (ERDAssociation association : associations) {
    }
    }
    public ERDElement(OBJECT entity) {
     * Adds relationship where the current object is the primary key table in a relationship
        }
import org.jkiss.utils.CommonUtils;
    }
                }
        super(null);
     * @return Returns the references.
            firePropertyChange(PROP_INPUT, table, null);
     *
     * @param table the foreign key relationship
     */

        super(entity);

    }
    }
 *
     *
        associations.remove(table);
     */

                if (association.getTargetEntity() == this) {
    public boolean hasAssociationsWith(ERDElement entity) {
 * in a separate diagram specific model hierarchy
        associations.add(rel);
     * Removes relationship where the current object is the primary key table in a relationship
     *
    public List<ERDAssociation> getReferences() {
            firePropertyChange(PROP_OUTPUT, null, rel);
     */
    static final Log log = Log.getLog(ERDElement.class);
        }
     * @param table the primary key relationship
    public boolean hasSelfLinks() {
 * Copyright (C) 2010-2025 DBeaver Corp and others

        }
     * This entity will be initialized at the moment of creation within diagram.
     */
    /**
 * Also includes the bounds of the table so that the diagram can be
    /**
     * Special constructor for creating lazy entities.
        return false;
                    return true;
        }
     */
                    return true;
     * @return Returns the associations.
        if (reflect) {
        if (associations != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public void removeAssociation(ERDAssociation table, boolean reflect) {
        if (reflect) {

     */
public abstract class ERDElement<OBJECT> extends ERDObject<OBJECT> {
    }
 */

import java.util.List;

    public void addAssociation(ERDAssociation rel, boolean reflect) {
import java.util.ArrayList;


 * You may obtain a copy of the License at
        if (associations != null) {
        }
        references.remove(table);
            for (ERDAssociation assoc : associations) {
    public void removeReferenceAssociation(ERDAssociation table, boolean reflect) {
 *
    @NotNull
     * Adds relationship where the current object is the foreign key table in a relationship
            firePropertyChange(PROP_OUTPUT, table, null);
        return false;
        }
        return CommonUtils.safeList(references);
    private List<ERDAssociation> references;
    private List<ERDAssociation> associations;


        }
        if (reflect) {

                }
     */
    public ERDElement() {
    }
 * Created on Jul 13, 2004
    /**
 * DBeaver - Universal Database Manager
     * Removes relationship where the current object is the foreign key table in a relationship
/*
    /**
    }
            references = new ArrayList<>();
        if (reflect) {
            firePropertyChange(PROP_INPUT, null, table);
 * Unless required by applicable law or agreed to in writing, software
     * @param rel the primary key relationship

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.dbeaver.Log;
 * limitations under the License.
package org.jkiss.dbeaver.model.erd;
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
     *
    }
    }
                if (assoc.getTargetEntity() == entity) {
 *
 */
    @NotNull
            associations = new ArrayList<>();
    public void addReferenceAssociation(ERDAssociation table, boolean reflect) {
        if (references == null) {
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
 * restored following a serializeDiagram, although ideally this should be
