            return attrObj.getParentObject() == this.getEntityAttribute().getParentObject() && SQLUtils.compareAliases(
        DBDAttributeBinding p = this;
    public DBDAttributeBinding getTopParent() {
 * Base attribute binding
                }
     * Attribute index in result set
    }
import org.jkiss.utils.CommonUtils;
    public void setNestedBindings(@NotNull List<DBDAttributeBinding> nestedBindings) {
    public DBDValueRenderer getValueRenderer() {
            return this;
            if (p == null) {
    }
 *
                if (!CommonUtils.isEmpty(foreignKeys)) {
    @NotNull
                if (getLevel() != cmpAttr.getLevel() || getOrdinalPosition() != cmpAttr.getOrdinalPosition()) {
    }
     * Should include all parent objects' names and thus uniquely identify this entity within database.
        return nestedBindings;
            DBVEntity vEntity = DBVUtils.getVirtualEntity(attrEntity, false);
            if (hasPrevIdentifier) {

    @NotNull
                // Match all hierarchy names

    private DBSAttributeBase presentationAttribute;
        }

    }
     * Entity full qualified name.
        if (attribute instanceof DBSTypedObjectEx) {
            if (vEntity != null) {
        }
    public DBDAttributeBinding getParent(int grand) {
    private boolean matchesAttributes(@NotNull DBSAttributeBase attr) {
    private List<DBDAttributeBinding> nestedBindings;
        DBSDataContainer dataContainer = getDataContainer();

        DBDAttributeBinding parentObject = getParentObject();
import java.util.List;
            }
 *

import org.jkiss.code.Nullable;
        }
                // Skip pseudo attributes and document attributes (e.g. Mongo root document)
    {
    }

            return true;
        for (int i = 0; i < grand; i++) {
        this.nestedBindings = nestedBindings;
    private boolean transformed;
    public void setTransformHandler(@NotNull DBDValueHandler valueHandler) {
    @Nullable
import org.jkiss.dbeaver.DBException;
            }
        DBSEntityAttribute attribute = getEntityAttribute();
            for (DBDAttributeTransformer transformer : transformers) {
                                if (referrers == null) {
    /**
     */
    public List<DBDAttributeBinding> getNestedBindings() {
    /**
        this.presentationAttribute = presentationAttribute;
        return null;
    }

        return query.toString();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        this.disableTransformers = disableTransformers;
                                    referrers = new ArrayList<>();
    public DBSAttributeBase getAttribute()

    public void lateBinding(@NotNull DBCSession session, List<Object[]> rows) throws DBException {
/*
    /**
        return attr == null ? null : attr.getDescription();
    @Override
        boolean hasPrevIdentifier = false;
            level++;
    /**
    @NotNull
    public DBSAttributeBase getPresentationAttribute() {

                            if (CommonUtils.equalObjects(vfkc.getAttributeName(), getFullyQualifiedName(DBPEvaluationContext.DML))) {
    }
     * @return parent or null
    public abstract String getRowIdentifierStatus();

        return transformed;
    public abstract List<DBSEntityReferrer> getReferrers();
        return getAttribute();
        }
        for (DBDAttributeBinding attribute = this; attribute != null; attribute = attribute.getParentObject()) {
        char structSeparator = dataSource.getSQLDialect().getStructSeparator();
    }

import org.jkiss.dbeaver.model.virtual.DBVEntityForeignKey;

        return SQLUtils.compareAliases(attr.getName(), this.getName());
    @NotNull
import org.jkiss.dbeaver.model.exec.DBCException;
    public boolean isInRowIdentifier() {
    /**
        for (DBDAttributeBinding binding = this; ; binding = binding.getParentObject()) {
    }

            }
     * @return resolved entity attribute or just meta attribute
    public String getFullyQualifiedName(DBPEvaluationContext context, @NotNull DBPAttributeReferencePurpose purpose) {
        DBSEntityAttribute attr = getEntityAttribute();
 * limitations under the License.
                    return false;
            // FIXME: we shouldn't use formatMemberReference here
import org.jkiss.dbeaver.model.exec.DBCSession;

 * See the License for the specific language governing permissions and

     * Usually the same as {@link #getAttribute()} but may be explicitly set by attribute transformers.
     * Attribute value handler
 * Licensed under the Apache License, Version 2.0 (the "License");
     * Custom attributes are client-side objects. They also don't have associated meta attributes.
    public boolean hasNestedBindings() {
    public abstract String getName();
        }
     * It is always null if {@link #lateBinding(DBCSession, List)} wasn't called
 * DBeaver - Universal Database Manager
        }
     * Attribute name
    @NotNull
    }

    public abstract String getLabel();
                        return false;
        return p;
    /**

 * Unless required by applicable law or agreed to in writing, software
    /**
    }

        DBSEntityAttribute attr = getEntityAttribute();
                    }
    public abstract DBDRowIdentifier getRowIdentifier();
}
    @Nullable
        if (searchByName) {
                    if (!SQLUtils.compareAliases(a1.getName(), a2.getName())) {
            DBSEntity attrEntity = (DBSEntity) dataContainer;

        }
            return getName();
     */
            return presentationAttribute;
    @Nullable
    public abstract DBSEntityAttribute getEntityAttribute();
        DBDAttributeBinding parentAttr = getParentObject();
            );
    }
        if (presentationAttribute != null) {
    public String toString() {
        }
        return nestedBindings != null;
    @Nullable
    protected DBDValueHandler valueHandler;


    }
            } else if (attr != null) {
     */
                transformer.transformAttribute(session, this, rows, transformerOptions);

        return parentObject == null ? null : parentObject.getDataContainer();
     * @return full qualified name, never returns null.
        throws DBCException;
            return cba.formatMemberReference(false, null, purpose);
        }
 */
                    List<DBSEntityReferrer> referrers = null;
    @Nullable
     * Entity attribute (may be null).
     */
        }
            }
        int level = 0;
            return parentAttr.getName() + "." + getName();
     */
    @Nullable
        return valueHandler;
public abstract class DBDAttributeBinding implements DBSObject, DBSAttributeBase, DBSTypedObjectEx, DBPQualifiedObject {
     * Attribute label
     * @param grand 0 - self, 1 - direct parent, 2 - grand parent, etc
import org.jkiss.dbeaver.model.virtual.DBVEntityForeignKeyColumn;
     */
    public boolean isPseudoAttribute() {
            }

     */
    /**
     * @return attribute level (depth)
            }
        if (grand == 0) {
/**
import org.jkiss.dbeaver.model.virtual.DBVEntity;
                return matchesAttributes(attr);
        this.transformed = true;

     * Row identifier (may be null)
 *
                return binding;

        if (dataContainer instanceof DBSEntity) {

                                referrers.add(vfk);
        for (DBDAttributeBinding binding = getParentObject(); binding != null; binding = binding.getParentObject()) {
                List<DBVEntityForeignKey> foreignKeys = vEntity.getForeignKeys();

                        }
    @Nullable
    }
import org.jkiss.dbeaver.model.struct.*;
    public abstract Object extractNestedValue(@NotNull Object ownerValue, int itemIndex)

                attr.getName(),
    }
                                }
    public abstract int getOrdinalPosition();
                }
    @Nullable
    public boolean isTransformed() {
     * Most valuable attribute reference.
        DBDRowIdentifier rowIdentifier = getRowIdentifier();
    @Nullable
            return DBUtils.getQuotedIdentifier(dataSource, getName());
            return;
    public void disableTransformers(boolean disableTransformers) {

        if (getParentObject() == null) {
            p = p.getParentObject();
                            }
    }
    @Override
     * Presentation attribute.
    @Nullable

    {
 * You may obtain a copy of the License at
    @NotNull
    public boolean matches(@Nullable DBSAttributeBase attr, boolean searchByName) {
    }
import java.util.ArrayList;


import java.util.Map;

                        for (DBVEntityForeignKeyColumn vfkc : vfk.getAttributes()) {
        return false;
 * distributed under the License is distributed on an "AS IS" BASIS,

    @Override

    @NotNull
    }
        return false;
     */
     */
            query.insert(0, DBUtils.getQuotedIdentifier(dataSource, attribute.getName()));
    }
        return rowIdentifier != null && rowIdentifier.hasAttribute(this);
    @NotNull
    }
            if (attr instanceof DBDAttributeBinding cmpAttr) {
    }
        return attr == null ? getMetaAttribute() : attr;
                    for (DBVEntityForeignKey vfk : foreignKeys) {
    @Override
    public int getLevel() {
        return getFullyQualifiedName(context, DBPAttributeReferencePurpose.UNSPECIFIED);
            return ((DBSTypedObjectEx) attribute).getDataType();

        this.valueHandler = valueHandler;
        return level;
import org.jkiss.code.NotNull;
    public String getFullyQualifiedName(@NotNull DBPEvaluationContext context) {
     * Get parent by level.
        if (this.getEntityAttribute() instanceof DBSContextBoundAttribute cba && purpose != DBPAttributeReferencePurpose.UNSPECIFIED) {
     */
        }
            }

        return null;
    public boolean isPersisted() {
    public abstract DBDAttributeBinding getParentObject();
                this.getName()
    private boolean disableTransformers;

        }
    protected List<DBSEntityReferrer> findVirtualReferrers() {
 *     http://www.apache.org/licenses/LICENSE-2.0

    /**
    @Override


    }
        if (transformers != null) {
import org.jkiss.dbeaver.model.*;
package org.jkiss.dbeaver.model.data;
    @NotNull
        StringBuilder query = new StringBuilder();
        final DBDAttributeTransformer[] transformers = DBVUtils.findAttributeTransformers(this, null);
            return 0;
            hasPrevIdentifier = true;
    @Nullable
     * Attribute level. Zero based
    @Override

        }
    /**
    public String getDescription() {
    }
        if (attr instanceof DBSObject attrObj && this.getEntityAttribute() != null) {
    public DBSDataContainer getDataContainer() {
        if (parentAttr == null) {
    /**
     * @param purpose of name usage
            if (binding.getParentObject() == null) {
        } else {

     */
    public DBDValueHandler getValueHandler() {
    public boolean isCustom() {
                continue;
    /**
        this.valueHandler = valueHandler;
    }

                for (DBDAttributeBinding a1 = cmpAttr, a2 = this; a1 != null && a2 != null; a1 = a1.getParentObject(), a2 = a2.getParentObject()) {
                return true;

    }
     */
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.virtual.DBVUtils;
    public DBSDataType getDataType() {
                    }
        if (attr != null && (this == attr || getMetaAttribute() == attr || getEntityAttribute() == attr)) {
            final Map<String, Object> transformerOptions = DBVUtils.getAttributeTransformersOptions(this);
    }
        }
        return false;
 * you may not use this file except in compliance with the License.
    /**
            if (attribute.isPseudoAttribute() || (attribute.getParentObject() == null && attribute.getDataKind() == DBPDataKind.DOCUMENT)) {
        final DBPDataSource dataSource = getDataSource();
    public void setPresentationAttribute(@Nullable DBSAttributeBase presentationAttribute) {
import org.jkiss.dbeaver.model.sql.SQLUtils;
        if (disableTransformers) {
        }
        if (getParentObject() == null) {
    public abstract DBCAttributeMetaData getMetaAttribute();
    @Nullable
    @Nullable
        return valueHandler;
import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;



    }
        return false;
    }
 */
     * Meta attribute (obtained from result set)
                query.insert(0, structSeparator);
     * @return attribute index (zero based)
    @Override
     */
        }
        }
     * @param context evaluation context
    protected DBDAttributeBinding(@NotNull DBDValueHandler valueHandler)
                    return referrers;
                throw new IllegalArgumentException("Bad parent depth: " + grand);
                }
    }
