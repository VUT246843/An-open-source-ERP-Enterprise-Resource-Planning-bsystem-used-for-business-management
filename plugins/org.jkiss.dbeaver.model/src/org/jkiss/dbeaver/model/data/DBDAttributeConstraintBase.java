 * DBeaver - Universal Database Manager
public class DBDAttributeConstraintBase {

            }
    }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others


            return
    }
        this.value = null;
    private Object[] options;
        }
        this.reverseOperator = source.reverseOperator;
                (this.operator == null ? 0 : this.operator.hashCode()) +
    // Used to generate expressions
        this.operator = null;
        this.orderPosition = source.orderPosition;
                CommonUtils.equalObjects(this.value, obj.value);
    }
                    this.orderDescending == source.orderDescending &&

                    this.visualPosition == source.visualPosition &&
        }
        return hasFilter() || !visible || !ArrayUtils.isEmpty(options);
    @Nullable
package org.jkiss.dbeaver.model.data;
    @Nullable
        this.options = source.options;
        if (options == null) {

    }
        this.operator = null;
    public Object getValue() {
    public DBCLogicalOperator getOperator() {


    private boolean visible;
        this.visualPosition = visualPosition;

 */
                visualPosition

 * Unless required by applicable law or agreed to in writing, software
    private boolean orderDescending;
                    Arrays.equals(this.options, source.options);
                (this.value == null ? 0 : this.value.hashCode()) +
            }
    public void setOrderDescending(boolean orderDescending) {
    public boolean equalFilters(DBDAttributeConstraintBase obj, boolean compareOrders) {
    public DBDAttributeConstraintBase() {
import java.util.Arrays;
                (orderDescending ? 1 : 0) +
 * Attribute constraint
            return false;
    public static int NULL_VISUAL_POSITION = -1;
        return reverseOperator;
        this.orderDescending = source.orderDescending;
                CommonUtils.equalObjects(this.reverseOperator, obj.reverseOperator) &&
    private int orderPosition;
        this.visible = visible;
    public static final String ATTR_OPTION_PINNED = "pinned";
    }
    public boolean isVisible() {

    }
        return
    public void setEntityAlias(String entityAlias) {


            options = newOptions;
            }
        this.visible = source.visible;
                    CommonUtils.equalObjects(this.value, source.value) &&
    }
    }
import org.jkiss.code.Nullable;
        this.criteria = criteria;
        this.value = null;


        return value;
                return false;
        this.reverseOperator = false;
        return

    }
        for (int i = 0; i < options.length; i += 2) {
        return options;
    }
        this.value = value;

        }
    public void setVisible(boolean visible) {
                return (T) options[i + 1];
}

            if (this.orderPosition != obj.orderPosition ||
    public void setVisualPosition(int visualPosition) {
            return false;
    public boolean hasCondition() {
            return null;
        this.criteria = source.criteria;
    public String getEntityAlias() {
    }
    @Nullable
        for (int i = 0; i < options.length; i += 2) {


    }
        for (int i = 0; i < options.length; i += 2) {
        this.reverseOperator = false;
        return entityAlias;
                (this.criteria == null ? 0 : this.criteria.hashCode()) +
 * You may obtain a copy of the License at


 * limitations under the License.
                this.orderPosition == source.orderPosition &&
    }
    }
    }

    @Nullable
                CommonUtils.equalObjects(this.operator, obj.operator) &&
            orderPosition +
        if (obj instanceof DBDAttributeConstraintBase) {
 *

        this.operator = operator;
                    this.reverseOperator == source.reverseOperator &&
        this.criteria = null;
        this.value = source.value;

                return true;
        return false;
                this.orderDescending != obj.orderDescending) {
                    CommonUtils.equalObjects(this.operator, source.operator) &&

    }
    }
            }
        this.options = options;
    @Nullable
        if (compareOrders) {
        Object[] newOptions = { option, value };
            if (options[i].equals(option)) {
 *
        return null;
        } else {

            options = ArrayUtils.concatArrays(options, newOptions);
    private String entityAlias;
        return hasCondition() || orderPosition > 0;

    }

        this.visualPosition = source.visualPosition;
            if (options[i].equals(option)) {
    @Nullable
    public void setValue(@Nullable Object value) {
        this.visible = true;
        this.entityAlias = entityAlias;
    }

    private boolean reverseOperator;
        return false;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

        if (options == null) {
        this.criteria = null;
     */
                (visible ? 1 : 0) +
        }
        this.options = null;

            CommonUtils.equalObjects(this.criteria, obj.criteria) &&
     * Attribute owner entity alias.
        return orderPosition;
        copyFrom(source);
 *
    }
    public DBDAttributeConstraintBase(@NotNull DBDAttributeConstraintBase source) {
    }
        if (options == null) {
    public void setCriteria(@Nullable String criteria) {
    }
            return false;

                    CommonUtils.equalObjects(this.criteria, source.criteria) &&
                return true;
    public Object[] getOptions() {
        return visible;


    public int getVisualPosition() {

    }
     * Null by default. Can be set by SQL generation routines after entity alias resolution.
    }
    @Override
        return criteria;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void setOptions(@Nullable Object[] options) {
/**
    private int visualPosition;
    }
    /**
    }
        return !CommonUtils.isEmpty(criteria) || operator != null;
        return orderDescending;
        this.orderPosition = orderPosition;
                    options[i + 1] = value;
    public int hashCode() {
        return operator;
        this.criteria = null;
            }
        }

                        ArrayUtils.remove(Object.class, options, i), i);
                    return;
                (reverseOperator ? 1 : 0) +

    public void setOrderPosition(int orderPosition) {
                    this.visible == source.visible &&
        this.orderDescending = orderDescending;

 * See the License for the specific language governing permissions and

        }
    @Nullable
                if (options[i].equals(option)) {
    }
    }

import org.jkiss.utils.ArrayUtils;
    public boolean isDirty() {
    public void copyFrom(@NotNull DBDAttributeConstraintBase source) {
    }
                }
 */
    @Override
    }
            ;
        return visualPosition;
    public boolean hasOption(String option) {
                    ArrayUtils.remove(Object.class,
import org.jkiss.utils.CommonUtils;
    public void setOption(String option, Object value) {
    private String criteria;

    public boolean removeOption(String option) {
 * you may not use this file except in compliance with the License.
    public boolean isOrderDescending() {
    public void reset() {
        }
    public boolean isReverseOperator() {
    @Nullable

/*
    }
    }
            for (int i = 0; i < options.length; i += 2) {
    @Nullable
            if (options[i].equals(option)) {
import org.jkiss.code.NotNull;
        if (options == null) {
        this.orderDescending = false;
    private Object value;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
    public int getOrderPosition() {

        }
    public boolean equals(Object obj) {
        this.operator = source.operator;
                options =
    public String getCriteria() {
        this.reverseOperator = reverseOperator;
 * Licensed under the Apache License, Version 2.0 (the "License");

    public void setReverseOperator(boolean reverseOperator) {
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        this.orderPosition = 0;
    private DBCLogicalOperator operator;
    public <T> T getOption(String option) {
        }

    public void setOperator(@Nullable DBCLogicalOperator operator) {
    public boolean hasFilter() {
            DBDAttributeConstraintBase source = (DBDAttributeConstraintBase) obj;
