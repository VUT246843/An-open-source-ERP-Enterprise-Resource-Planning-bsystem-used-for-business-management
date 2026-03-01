                return assoc;
        super();
import org.jkiss.dbeaver.DBException;
        }
                CommonUtils.equalObjects(alias, ((ERDEntity) o).alias);
        return null;
import org.jkiss.code.NotNull;
            throw new IllegalArgumentException("Attribute already present");
        return dataSource != null ? dataSource : getObject().getDataSource();
        } catch (DBCException e) {

 * See the License for the specific language governing permissions and
        if (attributes == null) {
 * Model object representing a relational database Table
                    unresolvedKeys.add(fk);
    public void setPrimary(boolean primary) {
        } catch (DBException e) {
    public boolean isPrimary() {
import java.util.*;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                DBSEntityAttribute attribute = getObject().getAttribute(context.getMonitor(), name);
                            continue;

                        diagram.getContentProvider().createAutoAssociation(diagram, fk, this, targetEntity, reflect);
     * @throws DBException - exception
    public void addAttribute(ERDEntityAttribute attribute, boolean reflect) {
        }


    public Map<String, Object> toMap(@NotNull ERDContext context, boolean fullInfo) {
    public List<ERDEntityAttribute> getCheckedAttributes() {
        return null;
                addAttribute(attr, false);

            }

                attr.fromMap(context, attrMap);
        if (attributes == null) {
                    ERDAssociation erdAssociation = diagram.getContentProvider().createAutoAssociation(diagram, fk, this, refEntity, reflect);
        if (reflect) {
            if (assoc.getObject() == association) {

            entityMap.put("nodeUri", node.getNodeUri());
    }
            }
    public ERDAttributeVisibility getAttributeVisibility() {
            for (Map<String, Object> attrMap : JSONUtils.getObjectList(map, "attributes")) {
    public ERDAssociation getAssociation(DBSEntityAssociation association) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *
        if (!CommonUtils.isEmpty(attributes)) {
import org.jkiss.utils.CommonUtils;

        }
        for (ERDEntityAttribute attr : attributes) {
            }
 * Also includes the bounds of the table so that the diagram can be
        if (association == null) {
        if (attributes != null) {

        }
    }
            if (dbsEntity instanceof DBPQualifiedObject) {
    }
                if (CommonUtils.isEmpty(name)) {
        if (o instanceof ERDEntity) {
    @Override
            firePropertyChange(PROP_CHILD, attribute, null);
        // Make associations
        this.alias = alias;
                ERDEntityAttribute attr = new ERDEntityAttribute(attribute, false);
import org.jkiss.dbeaver.model.data.json.JSONUtils;

                }

            diagram.getContentProvider().fillEntityFromObject(new VoidProgressMonitor(), diagram, Collections.emptyList(), this);
    }
    }
        if (dbsEntity != null && fullInfo) {
                }
    }
    public void setAttributeVisibility(ERDAttributeVisibility attributeVisibility) {
     * @param create  if true then creates all found model association. Otherwise only saves unresolved ones.


                    }
        attributes.add(index, attribute);
    @Override
    public String getAlias() {
        }
    public String getName() {
    public boolean equals(Object o) {
            if (attr.getObject() == attribute) {


            return;
        return result;
                entityMap.put("fqn", ((DBPQualifiedObject) dbsEntity).getFullyQualifiedName(DBPEvaluationContext.UI));
        }
        for (Iterator<DBSEntityAssociation> iter = unresolvedKeys.iterator(); iter.hasNext(); ) {
 * limitations under the License.
        return null;
    public void reloadAttributes(ERDDiagram diagram) {

        this.attributeVisibility = attributeVisibility;
 *
        alias = JSONUtils.getString(map, "alias");
    }
     * This entity will be initialized at the moment of creation within diagram.
                    }
        this.dataSource = dataSource;
            }
public class ERDEntity extends ERDElement<DBSEntity> {
    }
            for (DBSEntityAssociation fk : fks) {
     */
    private List<DBSEntityAssociation> unresolvedKeys;
                return attr;
    public ERDEntityAttribute getAttribute(DBSEntityAttribute attribute) {
import org.jkiss.dbeaver.model.*;
    public void switchAttribute(ERDEntityAttribute attribute, int index, boolean reflect) {
    @Override
    }
                }
                    if (erdAssociation != null) {
    }
import org.jkiss.dbeaver.model.exec.DBCException;
            return null;
            entityMap.put("iconIndex", context.getIconIndex(DBValueFormatting.getObjectImage(dbsEntity)));
        }
        entityMap.put("attributes", this.getAttributes().stream().map(a -> a.toMap(context, fullInfo)).collect(Collectors.toList()));
    public void resolveRelations(ERDContainer diagram, boolean reflect) {
    private ERDAttributeVisibility attributeVisibility;
     */
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
    public void sortAttributes(@NotNull Comparator<ERDEntityAttribute> comparator, boolean reflect) {
            firePropertyChange(PROP_CHILD, null, attribute);
import org.jkiss.dbeaver.model.virtual.DBVUtils;
    }
    @Override
            for (ERDEntityAttribute attribute : this.getAttributes()) {
        }
        this.primary = primary;

    public void removeAttribute(ERDEntityAttribute attribute, boolean reflect) {
        // Mark attribute's fk flag

        if (CommonUtils.isEmpty(unresolvedKeys)) {
        return primary;
        }
        }
        return false;
        if (CommonUtils.isEmpty(attributes)) {
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (assoc.getObject() == association) {
    public ERDEntity(DBPDataSource dataSource) {
                return assoc;
        }
import java.util.stream.Collectors;
    }
    public String toString() {
    }
        entityMap.put("name", this.getName());
     * Resolve and create entity associations.
    public int hashCode() {
        int aliasHC = alias == null ? 0 : alias.hashCode();
                        if (DBUtils.isInheritedObject(fk)) {
    @NotNull
        if (reflect) {
            log.error("Error reading entity attributes", e);

            }
        return CommonUtils.safeList(attributes);
 * Licensed under the Apache License, Version 2.0 (the "License");
                if (refEntity != null) {
/*

            for (ERDEntityAttribute attr : attributes) {
            return null;
            }
 * restored following a serializeDiagram, although ideally this should be
                if (attr.isChecked()) {
            firePropertyChange(PROP_REORDER, this, attribute);
                    fkAttrs.addAll(DBUtils.getEntityAttributes(monitor, (DBSEntityReferrer) fk));

    }

import org.jkiss.dbeaver.model.struct.DBSEntity;

            final DBSEntityAssociation fk = iter.next();
            entityMap.put("nodeId", node.getNodeItemPath());
                    if (unresolvedKeys == null) {
    }
            firePropertyChange(PROP_REORDER, this, null);
        for (ERDAssociation assoc : getReferences()) {
        return entityMap;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param reflect reflect UI
    @Override
 */
        try {
                if (targetEntity == null) {
    }
    public List<ERDEntityAttribute> getAttributes() {
    public void setAlias(String alias) {
            return null;
        if (node != null) {
    public void fromMap(@NotNull ERDContext context, Map<String, Object> map) {
                    continue;
 * You may obtain a copy of the License at

        return (object == null ? 0 : object.hashCode()) + aliasHC;

    private DBPDataSource dataSource;
        attributes.add(attribute);
                }
        List<ERDEntityAttribute> result = new ArrayList<>();

                    DBVUtils.tryGetRealEntity(fk.getReferencedConstraint().getParentObject()));
        }
                }
            return CommonUtils.equalObjects(object, ((ERDEntity) o).object) &&
            return;
        if (attributes.contains(attribute)) {
            entityMap.put("alias", this.getAlias());

        }
        }
        }
        }

                    result.add(attr);
                if (fk instanceof DBSEntityReferrer) {
    }
    @NotNull
 */
        attributes.remove(attribute);
    public ERDAssociation getReferenceAssociation(DBSEntityAssociation association) {
        }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (fk.getReferencedConstraint() != null) {

        }
package org.jkiss.dbeaver.model.erd;
                    }

            return null;
                String name = JSONUtils.getString(attrMap, "name");
        if (!CommonUtils.isEmpty(this.getAlias())) {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        try {
 * Unless required by applicable law or agreed to in writing, software
        return alias;
                ERDEntity targetEntity = diagram.getEntityMap().get(DBVUtils.getRealEntity(monitor, fk.getAssociatedEntity()));

        if (attribute == null) {
        }
        if (association == null) {
        }

                    attribute.setInForeignKey(true);
    }
            }
                        }
                }
     *
    }

                }
    public ERDEntity(DBSEntity entity) {
    @NotNull
        if (reflect) {
    }
    /**
                        iter.remove();
    }
    }
        super(entity);

            attributes = new ArrayList<>();
    @Override

            //TODO: use only node URI after finish migration to the new node path format
            attributes.clear();
        return attributeVisibility;
        if (reflect) {
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;
import org.jkiss.dbeaver.Log;
                if (fkAttrs.contains(attribute.getObject())) {
        }
        Map<String, Object> entityMap = new LinkedHashMap<>();
    /**
}
        }
 *
        }
            }
    public void addModelRelations(DBRProgressMonitor monitor, ERDContainer diagram, boolean create, boolean reflect) throws DBException {
                    continue;
/*

    }
            log.debug("Can't reload attributes", e);

    public DBPDataSource getDataSource() {
        if (fullInfo) {

        Collection<? extends DBSEntityAssociation> fks = DBVUtils.getAllAssociations(monitor, getObject());
    }
        for (ERDAssociation assoc : getAssociations()) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                if (attribute == null) {
 * you may not use this file except in compliance with the License.
        }
 */
        DBSEntity dbsEntity = getObject();
        return getName() + (CommonUtils.isEmpty(alias) ? "" : " " + alias);
        return getObject().getName();
        }
                    log.error("Attribute '" + name + "' not found in entity " + getName());
                    if (create) {
        Set<DBSEntityAttribute> fkAttrs = new HashSet<>();
 * Created on Jul 13, 2004
     * Also caches all unresolved associations (associations with entities which are not present in diagram yet)

    static final Log log = Log.getLog(ERDEntity.class);
/**
                } else {
    private boolean primary = false;
        if (fks != null) {
        if (!fkAttrs.isEmpty()) {
                        unresolvedKeys = new ArrayList<>();
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        attributes.sort(comparator);
     * Special constructor for creating lazy entities.
 * in a separate diagram specific model hierarchy

        entityMap.put("id", context.addElementInfo(this));
    private String alias;
                ERDEntity refEntity = diagram.getEntityMap().get(
        }
     * @param diagram all diagram entities map
        attributes.remove(attribute);
 * DBeaver - Universal Database Manager
        DBNDatabaseNode node = context.getNavigatorModel().getNodeByObject(context.getMonitor(), dbsEntity, true);
    private List<ERDEntityAttribute> attributes;
    }
        }
