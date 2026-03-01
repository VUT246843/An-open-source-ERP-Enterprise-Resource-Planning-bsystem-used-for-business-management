    }
                boolean attrNodesCached = false;
                            break;
import org.jkiss.dbeaver.model.DBUtils;
        }
                            if (!isInIdentifier) {

                        continue;
                            if (!keyColumns.contains(attribute)) {

                    erdEntity.sortAttributes(DBUtils.nameComparatorIgnoreCase(), false);
                    keyColumns.addAll(DBUtils.getEntityAttributes(monitor, (DBSEntityReferrer) constraint));
        return erdAssociation;
    }
        @NotNull ERDDiagram diagram,
            } catch (DBException e) {
    public ERDAssociation createAutoAssociation(ERDContainer diagram, 
                    if (!isAttributeVisible(erdEntity, attribute)) {
        }
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.DBPObjectWithLazyDescription;
        if (DBUtils.isHiddenObject(attribute) || DBUtils.isInheritedObject(attribute)) {
            }
        } catch (DBException e) {

                    ERDEntityAttribute c1 = new ERDEntityAttribute(attribute, inPrimaryKey);
            try {
        @NotNull ERDEntity erdEntity
    }
            } catch (DBException e) {
                for (DBSEntityAttribute attribute : attributes) {
import org.jkiss.dbeaver.model.exec.DBCException;
        erdAssociation.addCondition(sourceAttribute, targetAttribute);
import org.jkiss.dbeaver.model.virtual.DBVUtils;
    }
    ) throws DBCException {
                    }
        fillEntityFromObject(monitor, diagram, otherEntities, erdEntity, new ERDAttributeSettings(ERDAttributeVisibility.ALL, false));
    }
        // Allow all auto-associations
    @Override
            }



import org.jkiss.code.NotNull;
    @Override
        @NotNull ERDEntity targetEntity,
                }
                        default:
                        // It may be needed later because all ERD objects can be adapted to navigator
        boolean reflect
                        case KEYS:
                            }
                    if (columnFilter != null && !columnFilter.matches(attribute.getName())) {
        @NotNull List<ERDEntity> otherEntities,
                        // Pre-load navigator node as well.
                }
                            break;
            // usual thing in some systems like WMI/CIM model
        }
        DBSEntity entity = erdEntity.getObject();
        return keyColumns;
    }

    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/**

                keyColumns.addAll(idColumns);
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.navigator.DBNUtils;
 *
                    switch (settings.getVisibility()) {
        @NotNull DBSEntityAssociation association,
    }
                idColumns = ERDUtils.getBestTableIdentifier(monitor, entity);
                log.error("Error reading table identifier", e);
    private final Map<String, Object> attributes = new HashMap<>();
                if (CommonUtils.isEmpty(attributes)) {
        @NotNull ERDDiagram diagram,
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.model.erd;
 * ERD content provider
                        DBNUtils.getNodeByObject(monitor, attribute, false);
    public void fillEntityFromObject(
 * See the License for the specific language governing permissions and
    protected boolean isAttributeVisible(ERDEntity erdEntity, DBSEntityAttribute attribute) {
                DBSObjectFilter columnFilter = entity.getDataSource().getContainer().getObjectFilter(firstAttr.getClass(), entity, false);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        attributes.put(name, value);
            log.warn(e);
    public <T> T getAttribute(String name) {
        erdAssociation.resolveAttributes();
                    boolean inPrimaryKey = idColumns != null && idColumns.contains(attribute);
                                continue;
                        // Show only visible attributes
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
        if (attribute instanceof DBSEntityAssociation) {
    private static final boolean READ_LAZY_DESCRIPTIONS = false;
    }
        @NotNull ERDAttributeSettings settings
        @NotNull ERDEntityAttribute targetAttribute,
 * Licensed under the Apache License, Version 2.0 (the "License");

    }
            // Skip hidden attributes
        return true;
import org.jkiss.dbeaver.Log;
                ((DBPObjectWithLazyDescription) entity).getDescription(monitor);
            return false;
import org.jkiss.dbeaver.model.struct.*;
 * DBeaver - Universal Database Manager
                log.debug("Can't load table '" + entity.getName() + "'attributes", e);
 *     http://www.apache.org/licenses/LICENSE-2.0


    public void fillEntityFromObject(
    }
import java.util.*;
 *
    public boolean allowEntityDuplicates() {
        try {
        boolean reflect) {
 *
                }
    @Override
                    erdEntity.addAttribute(c1, false);
    ) {
 * you may not use this file except in compliance with the License.
        return erdAssociation;
        }
                        case PRIMARY:
            for (DBSEntityConstraint constraint : DBVUtils.getAllConstraints(monitor, entity)) {
public class ERDContentProviderDefault implements ERDContentProvider {
            try {

        Set<DBSEntityAttribute> keyColumns = new HashSet<>();
/*
                        attrNodesCached = true;
            }
                                continue;

                        continue;
        ERDContainer diagram,
        return false;
    @Override
                List<? extends DBSEntityAttribute> attributes = entity.getAttributes(monitor);

            }
import org.jkiss.utils.CommonUtils;
}
        @NotNull ERDEntity sourceEntity,
    private static final Log log = Log.getLog(ERDContentProviderDefault.class);
                        // nodes.
 */
                // just skip this problematic attributes
                if (assoc instanceof DBSEntityReferrer) {
                    }
                    if (!attrNodesCached) {
            } catch (DBException e) {
                    boolean isInIdentifier = idColumns != null && idColumns.contains(attribute);

        @NotNull ERDEntity sourceEntity, 
    protected Set<DBSEntityAttribute> getAllKeys(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity){
    @Override
        @NotNull ERDEntityAttribute sourceAttribute,
                }
                if (settings.isAlphabeticalOrder()) {
        @NotNull ERDEntity erdEntity,
    public void setAttribute(String name, Object value) {
        }
    @Override
                }
            Set<DBSEntityAttribute> keyColumns = getAllKeys(monitor, entity);
        @NotNull DBSEntityAssociation association,
        if (READ_LAZY_DESCRIPTIONS && entity instanceof DBPObjectWithLazyDescription) {

                    return;
        return (T) attributes.get(name);
                if (constraint instanceof DBSEntityReferrer) {
                    }
            for (DBSEntityAssociation assoc : DBVUtils.getAllAssociations(monitor, entity)) {
                DBSEntityAttribute firstAttr = attributes.getFirst();
            }
    public ERDContentProviderDefault() {
        ERDAssociation erdAssociation = new ERDAssociation(association, sourceEntity, targetEntity, reflect);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
                            }
            // skip attributes which are associations
            Collection<? extends DBSEntityAttribute> idColumns = null;
            try {
        @NotNull List<ERDEntity> otherEntities,

            return false;
                    keyColumns.addAll(DBUtils.getEntityAttributes(monitor, (DBSEntityReferrer) assoc));
                    }
    ) {
                log.warn("Unable to load lazy description when filling ERDEntity from object");
                            break;
        @NotNull ERDEntity targetEntity,
import org.jkiss.dbeaver.DBException;
        if (settings.getVisibility() != ERDAttributeVisibility.NONE) {
    public ERDAssociation createAssociation(
 * limitations under the License.
        ERDAssociation erdAssociation = new ERDAssociation(association, sourceEntity, targetEntity, reflect);
