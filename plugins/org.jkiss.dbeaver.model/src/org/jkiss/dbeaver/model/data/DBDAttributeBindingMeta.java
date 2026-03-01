        if (entityAttribute != null) {
                    CommonUtils.equalObjects(metaAttribute.getTypeName(), cmpMeta.getTypeName())
    }
    public void lateBinding(@NotNull DBCSession session, List<Object[]> rows) throws DBException {
        DBSEntityAttribute entityAttribute = getEntityAttribute();
     */
 *
        this.rowIdentifier = rowIdentifier;
     * Meta attribute (obtained from result set)
    }
    }
 * Unless required by applicable law or agreed to in writing, software
    }
    public String getName() {

     */
        return false;
    /**
            CommonUtils.notEmpty(metaAttribute.getEntityName()).hashCode() +
 * See the License for the specific language governing permissions and
    }
    @Override
        return getAttribute().getDataKind();
    }
        return getAttribute().getPrecision();
     *
    public long getTypeModifiers() {
    public DBDRowIdentifier getRowIdentifier() {
        return dataContainer;
     * Attribute index in result set
    public DBDAttributeBindingMeta(
        return rowIdentifierStatus;
        return entityAttribute;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return pseudoAttribute != null;
    private DBSEntityAttribute entityAttribute;

     * @return attribute index (zero based)
                    metaAttribute.getTypeID() == cmpMeta.getTypeID() &&
    }
     * Attribute name
    private boolean showLabel;
    @NotNull
            CommonUtils.notEmpty(metaAttribute.getLabel()).hashCode() +
            metaAttribute.getOrdinalPosition() +
    public DBDPseudoAttribute getPseudoAttribute() {
    @Override
 *
    }
    @Nullable
            metaAttribute.getTypeID() +
    @Override

     */
        } else {
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * Sets entity attribute
    public void setShowLabel(boolean showLabel) {

        super.lateBinding(session, rows);
    }
    @NotNull

        }
import org.jkiss.code.Nullable;
    @NotNull
 */
    public boolean setEntityAttribute(@Nullable DBSEntityAttribute entityAttribute, boolean updateHandler) {
        this.rowIdentifierStatus = rowIdentifierStatus;
import org.jkiss.code.NotNull;
     *
    }
    }

    public String getTypeName() {

        this.pseudoAttribute = pseudoAttribute;
        this.entityAttribute = entityAttribute;
        showLabel = dataSource == null || !dataSource.getContainer().getPreferenceStore().getBoolean(ModelPreferences.RESULT_SET_IGNORE_COLUMN_LABEL);
        }
    @Nullable
        return getAttribute().getScale();
            CommonUtils.notEmpty(metaAttribute.getName()).hashCode() +
    }
                // Change value handler only if it ws real
    @Override
        return pseudoAttribute;
    private final DBCAttributeMetaData metaAttribute;
        return dataContainer == null ? null : dataContainer.getDataSource();


import org.jkiss.dbeaver.model.exec.DBCAttributeMetaData;

        this.dataContainer = dataContainer;
        DBPDataSource dataSource = dataContainer == null ? null : dataContainer.getDataSource();
        return showLabel;
    }
    @Nullable
    @Nullable
    }
        return getAttribute().getMaxLength();
        }

     */
    }
    @Override
    public void setPseudoAttribute(@Nullable DBDPseudoAttribute pseudoAttribute) {
    @Override
        }
 * limitations under the License.
        return
                valueHandler = newValueHandler;
        return metaAttribute.getOrdinalPosition();

    private String rowIdentifierStatus;
        return metaAttribute;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
            referrers = DBUtils.getAttributeReferrers(session.getProgressMonitor(), entityAttribute, true);
            object1.getTypeName() != null && object1.getTypeName().equalsIgnoreCase(object2.getTypeName());
    @Override


    }


    }

 * DBeaver - Universal Database Manager
        return rowIdentifier;
        return referrers;
    @Override

    }
    }
            return true;
    private List<DBSEntityReferrer> referrers;
    @Nullable
            // Return name if label is ignored
    @Override
    @NotNull
        if (!showLabel) {
    @Nullable
    public String getFullTypeName() {
    }
            CommonUtils.notEmpty(metaAttribute.getTypeName()).hashCode();

            DBDValueHandler newValueHandler = DBUtils.findValueHandler(getDataSource(), entityAttribute);
    public DBSEntityAttribute getEntityAttribute() {
        @NotNull DBCSession session,
        return false;
                CommonUtils.equalObjects(metaAttribute.getName(), cmpMeta.getName()) &&
    @Nullable

 *     http://www.apache.org/licenses/LICENSE-2.0

import java.util.List;
            return
    public String getRowIdentifierStatus() {
import org.jkiss.dbeaver.model.exec.DBCSession;

            return DBUtils.getFullTypeName(getDataSource(), metaAttribute);
                ;
                    CommonUtils.equalObjects(metaAttribute.getEntityName(), cmpMeta.getEntityName()) &&
    }
        if (obj instanceof DBDAttributeBindingMeta) {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
        return metaAttribute.getName();
    }
    @Nullable
    @Nullable
    @Override
    public static boolean haveEqualsTypes(DBSTypedObject object1, DBSTypedObject object2) {
import org.jkiss.dbeaver.model.exec.DBCException;
    @NotNull

    @Override
    /**
        }
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.metaAttribute = metaAttribute;
    public void setRowIdentifier(@Nullable DBDRowIdentifier rowIdentifier) {
/*
    }

    @Override
        @Nullable DBSDataContainer dataContainer,
        return getAttribute().getTypeID();
    @Nullable
    public boolean equals(Object obj) {
        return getAttribute().isRequired();
    private DBDPseudoAttribute pseudoAttribute;
     * Attribute label

            object1.getDataKind() == object2.getDataKind() &&
    @NotNull

                    metaAttribute.getOrdinalPosition() == cmpMeta.getOrdinalPosition() &&
    @Nullable
    @NotNull
     * Entity attribute (may be null)
    @Override
    public DBDAttributeBinding getParentObject() {
    }
 * Attribute value binding info
        return metaAttribute.toString();
    }
import org.jkiss.dbeaver.model.DBUtils;
    /**
            return getName();
            DBCAttributeMetaData cmpMeta = ((DBDAttributeBindingMeta) obj).metaAttribute;

    }
    public DBCAttributeMetaData getMetaAttribute() {
import org.jkiss.dbeaver.model.DBPDataKind;
    public Object extractNestedValue(@NotNull Object ownerValue, int itemIndex) throws DBCException {
import org.jkiss.dbeaver.model.struct.DBSEntityReferrer;

     */
    private final DBSDataContainer dataContainer;
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
    public int hashCode() {
}
    public int getTypeID() {
    public Integer getPrecision() {
     */
    public List<DBSEntityReferrer> getReferrers() {
    /**

    }
    }
package org.jkiss.dbeaver.model.data;
     * Row identifier (may be null)


    public boolean isShowLabel() {
    @Override
            // Resolve full type name using explicit datasource
    public boolean isAutoGenerated() {
            if (newValueHandler != getDataSource().getContainer().getDefaultValueHandler()) {
import org.jkiss.utils.CommonUtils;
    public DBPDataKind getDataKind() {
    }
    @NotNull
    public long getMaxLength() {

    @Override
    }
import org.jkiss.dbeaver.ModelPreferences;
    }
public class DBDAttributeBindingMeta extends DBDAttributeBinding {

    public boolean isRequired() {
    }
    @Override
    @Nullable
                    CommonUtils.equalObjects(metaAttribute.getLabel(), cmpMeta.getLabel()) &&

 * You may obtain a copy of the License at
    @Override
            }

 * you may not use this file except in compliance with the License.
        super(DBUtils.findValueHandler(session, metaAttribute));
    public void setRowIdentifierStatus(@Nullable String rowIdentifierStatus) {
    @Nullable
        if (updateHandler && entityAttribute != null && !haveEqualsTypes(metaAttribute, entityAttribute)) {
/**
    /**
        return getAttribute().isAutoGenerated();
    public DBSDataContainer getDataContainer() {
    /**
    public String toString() {
    private DBDRowIdentifier rowIdentifier;
    }
    public boolean isPseudoAttribute() {
    }
        return getAttribute().getTypeName();
            return entityAttribute.getFullTypeName();
import org.jkiss.dbeaver.model.DBPDataSource;
    @Override

     */

 */
        @NotNull DBCAttributeMetaData metaAttribute) {
    @Override
    @Override
    @Nullable
    }
    public DBPDataSource getDataSource() {
    @Override
        return getAttribute().getTypeModifiers();
 *
        if (entityAttribute != null) {
    public int getOrdinalPosition() {
        throw new DBCException("Meta binding doesn't support nested values");


import org.jkiss.dbeaver.model.struct.DBSDataContainer;
    public Integer getScale() {
        return object1.getTypeID() == object2.getTypeID() &&

     * @return true if attribute type differs from meta attribute type.
        this.showLabel = showLabel;
        return metaAttribute.getLabel();
    }
    public String getLabel() {
        return null;
