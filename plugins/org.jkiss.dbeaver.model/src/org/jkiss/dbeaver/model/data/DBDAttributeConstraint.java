        @NotNull String attributeLabel,

        this(attributeName, attributeName, originalVisualPosition);
        return attribute == null ? attributeName : DBUtils.getObjectFullName(attribute, DBPEvaluationContext.DML);
 *
    }
        setAttribute(attribute);
    }
 * See the License for the specific language governing permissions and
import org.jkiss.utils.CommonUtils;
 * DBeaver - Universal Database Manager
    @Nullable
        this.attributeLabel = source.attributeLabel;

        this.attribute = source.attribute;
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
    }

    }

    public DBDAttributeConstraint(@NotNull DBSAttributeBase attribute, int visualPosition) {
        this.attributeName = source.attributeName;
        if (obj instanceof DBDAttributeConstraint) {
    public boolean equals(Object obj) {
 * Unless required by applicable law or agreed to in writing, software
        this.originalVisualPosition = source.originalVisualPosition;
                this.attributeLabel = this.attributeName;
 *
 * You may obtain a copy of the License at
    @NotNull
        String clause = getOperator() == null ?
        return attributeLabel;
    }
    public boolean matches(DBSAttributeBase attr, boolean matchByName) {
        setVisualPosition(originalVisualPosition);

        return attribute;
        return attributeName;
    }
    public static boolean isVisibleByDefault(DBDAttributeBinding binding) {
        setVisualPosition(visualPosition);
    }
    @Override
        super(source);
    private String attributeLabel;
    public int getOriginalVisualPosition() {

            (getCriteria() == null ? "" : getCriteria()) :
    }


        super.reset();
        setVisualPosition(visualPosition);

/**

        int originalVisualPosition
        return super.hasFilter() || // compare visual position only if it explicitly set
    public boolean isPlainNameReference() {


            }
                CommonUtils.equalObjects(this.attribute, source.attribute) &&
import org.jkiss.dbeaver.model.DBPEvaluationContext;
        this.attributeName = attributeName;
        return attribute == attr ||
        this.originalVisualPosition = attribute.getOrdinalPosition();
    }

    public String toString() {

        setAttribute(attribute);
    public DBDAttributeConstraint(@NotNull String attributeName, int originalVisualPosition) {
    public String getAttributeLabel() {
                this.attributeName = this.attribute.getName();
/*
    public void reset() {
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
    }
 *

    public boolean equalFilters(DBDAttributeConstraintBase obj, boolean compareOrders) {
}
    public int hashCode() {
    public String getAttributeName() {
        return this.attributeName.hashCode() + getVisualPosition();
    public boolean hasFilter() {
public class DBDAttributeConstraint extends DBDAttributeConstraintBase {
                CommonUtils.equalObjects(this.attribute, ((DBDAttributeConstraint) obj).attribute) &&
 * Copyright (C) 2010-2024 DBeaver Corp and others
            obj instanceof DBDAttributeConstraint &&
        } else {
    public boolean equalVisibility(DBDAttributeConstraint constraint) {
    public void setPlainNameReference(boolean plainNameReference) {
        this.originalVisualPosition = originalVisualPosition;
        this.originalVisualPosition = originalVisualPosition; // Can be very important for nested attributes without through ordering
        }
//    public static final String FEATURE_HIDDEN = "hidden";
        if (this.attribute instanceof DBDAttributeBindingMeta) {
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.NotNull;
    }
    public String getFullAttributeName() {
        this.attribute = binding;
        this.attributeName = this.attribute.getName();
        return originalVisualPosition;
    private DBSAttributeBase attribute;
 * Attribute constraint

import org.jkiss.code.Nullable;
    @Nullable
    private int originalVisualPosition;
 * limitations under the License.
    }
    ) {

    }
        return isVisible() == constraint.isVisible() && getVisualPosition() == constraint.getVisualPosition() &&

            (getVisualPosition() != NULL_VISUAL_POSITION && originalVisualPosition != getVisualPosition());
    public DBDAttributeConstraint(@NotNull DBDAttributeConstraint source) {
            DBDAttributeConstraint source = (DBDAttributeConstraint) obj;
    }
    void setAttribute(@NotNull DBSAttributeBase binding) {
    @Override
            } else {
    @NotNull
    }
    private String attributeName;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            (isReverseOperator() ? "NOT " : "") + getOperator().getExpression() + " " + getValue();

        setVisualPosition(attribute.getOrdinalPosition());
        this.attributeLabel = attributeLabel;
        }
            if (entityAttribute != null) {
 * Licensed under the Apache License, Version 2.0 (the "License");

            (attribute instanceof DBDAttributeBinding && ((DBDAttributeBinding) attribute).matches(attr, matchByName));
        this.attribute = null;
            }
 */
                this.attributeName = entityAttribute.getName();
        setAttribute(attribute);
            Arrays.equals(getOptions(), constraint.getOptions());
        return !binding.isPseudoAttribute();
    }
    }
            return

    public DBSAttributeBase getAttribute() {
    @Override
    }
import org.jkiss.dbeaver.model.DBUtils;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 */
            return false;
    public DBDAttributeConstraint(@NotNull DBDAttributeBinding attribute) {
                    super.equals(obj);
    private boolean plainNameReference; // Disables ordering by column index
    public DBDAttributeConstraint(@NotNull DBDAttributeBinding attribute, int visualPosition, int originalVisualPosition) {
        this.plainNameReference = plainNameReference;
    @Override
    }
        return attributeName + " " + clause;
    public DBDAttributeConstraint(
    }
import java.util.Arrays;
    // Disables ordering by column index
    @NotNull
            DBSEntityAttribute entityAttribute = ((DBDAttributeBindingMeta) this.attribute).getEntityAttribute();
        @NotNull String attributeName,
        return

 * you may not use this file except in compliance with the License.
        return plainNameReference;
    }

    }


            if (CommonUtils.isEmpty(this.attributeLabel)) {
package org.jkiss.dbeaver.model.data;
            this.attributeLabel = ((DBDAttributeBindingMeta) this.attribute).getLabel();

                super.equalFilters(obj, compareOrders);

