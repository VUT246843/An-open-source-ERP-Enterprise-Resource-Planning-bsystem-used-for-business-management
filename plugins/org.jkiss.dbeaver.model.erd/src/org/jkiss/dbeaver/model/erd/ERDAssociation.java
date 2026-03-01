import org.jkiss.dbeaver.model.DBPEvaluationContext;
            log.error("Cannot find FK table '" + this.getSourceEntity().getName() + "' in info map");


     */

    public void addCondition(@Nullable ERDEntityAttribute sourceAttribute, @Nullable ERDEntityAttribute targetAttribute) {
     * @return Returns the targetEntity.
    }
            if (targetAttributes == null) {

    }

            }

 * 
        }
        assocMap.put("name", association.getName());
        return sourceEntity;
    }
                            ERDEntityAttribute erdSourceAttr = ERDUtils.getAttributeByModel(sourceEntity, sourceAttr);
        }
        }
            if (sourceAttributes == null) {
    /**
 * limitations under the License.
    /**

        if (object instanceof DBSEntityReferrer) {
     */
        return sourceAttributes == null ? Collections.emptyList() : sourceAttributes;
            saveRefAttributes(context.getMonitor(), association.getReferencedConstraint(), assocMap, "foreign-attributes", getTargetAttributes());
        Map<String, Object> assocMap = new LinkedHashMap<>();
                if (be.getLeftExpression() instanceof Column c) {
                    }
            targetAttributes.add(targetAttribute);

        }
        } else {
        super(association);
        try {
        if (pkInfo == -1) {

            log.error("Error reading ref attributes", e);
            saveRefAttributes(context.getMonitor(), association, assocMap, "primary-attributes", getSourceAttributes());
     * @param sourceEntity - source
     * @param targetEntity - target
    private static void saveRefAttributes(DBRProgressMonitor monitor, DBSEntityConstraint association, Map<String, Object> map, String refName, List<ERDEntityAttribute> attributes) throws DBException {
                            sourceAttributes.remove(i);
    public void resolveAttributes() {

     *
            log.error("Error resolving ERD association attributes, object is not a type of DBSEntityReferrer");
     * @param reflect reflect flag
        if (!CommonUtils.isEmpty(attributes)) {
                        ERDEntityAttribute sourceAttribute = sourceAttributes.get(i);
 * distributed under the License is distributed on an "AS IS" BASIS,
            assocMap.put("fqn", ((DBPQualifiedObject) association).getFullyQualifiedName(DBPEvaluationContext.UI));
public class ERDAssociation extends ERDObject<DBSEntityAssociation> {
        int fkInfo = context.getElementInfo(this.getTargetEntity());
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.sourceEntity = sourceEntity;
import org.jkiss.utils.CommonUtils;
    public void fromMap(@NotNull ERDContext context, Map<String, Object> map) {
    @Override
import org.jkiss.dbeaver.model.DBPQualifiedObject;
        } catch (DBException e) {
    public List<ERDEntityAttribute> getSourceAttributes() {

                    if (attrRef instanceof DBSTableForeignKeyColumn) {
}        this.targetEntity.addReferenceAssociation(this, reflect);
    private ERDElement<?> sourceEntity;
                targetAttributes = new ArrayList<>();
            }

        try {
                            return;

    }

            List<? extends DBSEntityAttributeRef> attrRefs = association.getAttributeReferences(new VoidProgressMonitor());
        }
                }
                    for (int i = 0; i < sourceAttributes.size(); i++) {
        this.initBends = bends;
 * Licensed under the Apache License, Version 2.0 (the "License");
            assocMap.put("primary-entity", pkInfo);
    public ERDElement<?> getSourceEntity()
    @NotNull
import net.sf.jsqlparser.expression.BinaryExpression;
    public List<ERDEntityAttribute> getTargetAttributes() {
    public void setSourceEntity(ERDElement<?> sourceForeignKey)
    protected void resetConnections(Expression expression) {
 * DBeaver - Universal Database Manager

 * Copyright (C) 2010-2025 DBeaver Corp and others
        return getObject() instanceof ERDLogicalAssociation;
     * @return Returns the sourceEntity.
                        }
    }
    }
    /**
    private List<int[]> initBends;
                        }
                            if (erdSourceAttr != null || erdTargetAttr != null) {
                        DBSEntityAttribute sourceAttr = attrRef.getAttribute();
    public Map<String, Object> toMap(@NotNull ERDContext context, boolean fullInfo) {
    @Override
                for (DBSEntityAttributeRef attrRef : attrRefs) {
     * Constructor for logical association

    {
            if (expression instanceof BinaryExpression be) {
                            targetAttributes.remove(i);
    }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
    {
    public void setTargetEntity(ERDElement<?> targetPrimaryKey)
    {
                    String leftAttr = DBUtils.getUnQuotedIdentifier(c.getColumnName(), BasicSQLDialect.DEFAULT_IDENTIFIER_QUOTES);

        this.targetEntity = targetEntity;
/**
        DBSEntityAssociation association = this.getObject();
    private List<ERDEntityAttribute> sourceAttributes;
import net.sf.jsqlparser.schema.Column;
            log.error("Error resolving ERD association attributes", e);
     */
        } else {
    }
import org.jkiss.dbeaver.model.struct.*;
        @NotNull ERDEntity sourceEntity,
    /**
    {
        return getObject() + " [" + sourceEntity + "->" + targetEntity + "]";
    {
import org.jkiss.dbeaver.DBException;
        }
            }
        boolean reflect) {
    }
    /**
        @NotNull ERDEntity targetEntity,
    {

            }

                                addCondition(erdSourceAttr, erdTargetAttr);
/*
        int pkInfo = context.getElementInfo(this.getSourceEntity());
    }
        return assocMap;
    }
                            }
    private static final Log log = Log.getLog(ERDAssociation.class);
 * Unless required by applicable law or agreed to in writing, software
     * @param sourceForeignKey the foreign key table you are connecting from
    }
    public void setInitBends(List<int[]> bends)
            assocMap.put("foreign-entity", fkInfo);
    public List<int[]> getInitBends()
        return getObject().getName();
     * @param sourceEntity fk table
     */
            "",
    public void resolveAttributes(DBSEntityReferrer association, ERDEntity sourceEntity, ERDEntity targetEntity) {
            List<String> refAttrList = attributes.stream().map(ERDEntityAttribute::getName).collect(Collectors.toList());
        return targetEntity;

    private List<ERDEntityAttribute> targetAttributes;
 * Relates one table to another
    {
    public ERDAssociation(
    }
                                log.error("Error resolving ERD association attributes (source/target attribute is null)");
     */
                        if (CommonUtils.equalObjects(sourceAttribute.getName(), leftAttr)) {
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKeyColumn;
     * @param association - container
 *
    public ERDElement<?> getTargetEntity()
 */
        }
import net.sf.jsqlparser.expression.Expression;
    private ERDElement<?> targetEntity;
            sourceAttributes.add(sourceAttribute);
    public String getName()
            sourceEntity.getName() + " -> " + targetEntity.getName(),
     * Constructor for physical association
import org.jkiss.dbeaver.model.DBUtils;
        this.targetEntity = targetEntity;
        }

                        DBSEntityAttribute targetAttr = ((DBSTableForeignKeyColumn) attrRef).getReferencedColumn();

import org.jkiss.dbeaver.Log;
                        if (sourceAttr != null && targetAttr != null) {
    @NotNull

        if (association instanceof DBPQualifiedObject) {
    }
        } catch (DBException e) {
        this.targetEntity.addReferenceAssociation(this, reflect);
        this.sourceEntity.addAssociation(this, reflect);
 *
            resolveAttributes((DBSEntityReferrer) object, (ERDEntity) sourceEntity, (ERDEntity) targetEntity);
    }
    @Override
                sourceAttributes = new ArrayList<>();
    }
     * @param targetEntity pk table
            log.error("Cannot find PK table '" + this.getSourceEntity().getName() + "' in info map");
    }
     * @param sourceEntity fk table
 * @author Serge Rider
     * @param association  physical FK
 * you may not use this file except in compliance with the License.
import java.util.*;
                }

            map.put(refName, refAttrList);
     * The method identify associating attributes for entities
    @Override
    public String toString()

    public ERDAssociation(ERDElement<?> sourceEntity, ERDElement<?> targetEntity, boolean reflect) {
import java.util.stream.Collectors;
            if (!CommonUtils.isEmpty(attrRefs)) {
import org.jkiss.code.Nullable;

        if (sourceAttribute != null) {
                    }
        return targetAttributes == null ? Collections.emptyList() : targetAttributes;
    /**

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.sourceEntity = sourceForeignKey;
        }
        return initBends;

     * @param reflect      reflect flag
                            ERDEntityAttribute erdTargetAttr = ERDUtils.getAttributeByModel(targetEntity, targetAttr);
        this.sourceEntity.addAssociation(this, reflect);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        }
import org.jkiss.code.NotNull;
    @NotNull
        assocMap.put("type", association.getConstraintType().getId());
 */
        this.targetEntity = targetPrimaryKey;
                            } else {
        log.warn("Cannot find columns corresponding to expression [" + expression + "]");
    // Bend is array of coordinates (x = [0], y = [1])
        if (sourceEntity != null && sourceAttributes != null) {
        } else {
            sourceEntity,
        if (targetAttribute != null) {
 * See the License for the specific language governing permissions and
    public boolean isLogical() {


    }
    }

            new ERDLogicalPrimaryKey(targetEntity, "Logical primary key", "")));
     */
        this.sourceEntity = sourceEntity;
    {
     * @param targetEntity pk table
 * You may obtain a copy of the License at
    }
        if (fkInfo == -1) {
 *
import org.jkiss.dbeaver.model.impl.sql.BasicSQLDialect;
        DBSEntityAssociation association,
     * 
        super(new ERDLogicalAssociation(
package org.jkiss.dbeaver.model.erd;
