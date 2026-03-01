 * you may not use this file except in compliance with the License.
    }

    public boolean matches(@NotNull String attrName, @NotNull DBCLogicalOperator operator, @Nullable Object[] values) {
    public String getColorForeground() {
        this.attributeValues = attributeValues;

    public String getColorBackground2() {
    public DBVColorOverride(DBVColorOverride source) {
    public Object[] getAttributeValues() {

            System.arraycopy(attributeValues, 0, newValue, 0, attributeValues.length);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
        this.operator = operator;
    private boolean isRange;

            attrName.equals(this.attributeName) &&
    }

import org.jkiss.code.NotNull;
        this.singleColumn = singleColumn;

 * distributed under the License is distributed on an "AS IS" BASIS,
        this.colorBackground2 = colorBackground2;
package org.jkiss.dbeaver.model.virtual;
 *
public class DBVColorOverride {

            operator == this.operator &&
 *     http://www.apache.org/licenses/LICENSE-2.0

            attributeValues = newValue;
    }
        this.attributeValues = source.attributeValues == null ? null : Arrays.copyOf(source.attributeValues, source.attributeValues.length);


 * Color override settings
    }

 * limitations under the License.
        this.attributeName = attributeName;
        } else {
        this.colorBackground = colorBackground;

    private DBCLogicalOperator operator;
    public DBVColorOverride(String attributeName, DBCLogicalOperator operator, Object[] attributeValues, String colorForeground, String colorBackground) {
    }
    }
        this.colorForeground = colorForeground;
    public DBCLogicalOperator getOperator() {
        }
    }

        return colorForeground;
        this.colorBackground = colorBackground;
    private String colorForeground, colorForeground2;
    public String getColorBackground() {
    public String toString() {
    }
    }
    public void setColorBackground2(String colorBackground2) {
    }
        this.colorForeground = source.colorForeground;
    }
    }
    public void setAttributeName(String attributeName) {
    }
}
    }
    @Override
        if (this.attributeValues == null) {

    private String colorBackground, colorBackground2;
    public void setAttributeValues(Object[] attributeValues) {
    }
    }
 *
    private String attributeName;
    public boolean isSingleColumn() {
        this.colorBackground = source.colorBackground;
        return
    public void setColorBackground(String colorBackground) {
 */
    public String getColorForeground2() {
        this.colorForeground = colorForeground;
        return colorBackground2;
    public void setColorForeground2(String colorForeground2) {
        return attributeValues;
import org.jkiss.code.Nullable;
    public void setSingleColumn(boolean singleColumn) {

            this.attributeValues = new Object[] { value };
 * You may obtain a copy of the License at

        return isRange;
    public void setRange(boolean range) {
        return attributeName + " " + operator.toString() + " " + Arrays.toString(attributeValues);
        this.operator = source.operator;
        return attributeName;
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.attributeName = attributeName;
            Object[] newValue = new Object[this.attributeValues.length + 1];
    public String getAttributeName() {
    public void setColorForeground(String colorForeground) {

 * Unless required by applicable law or agreed to in writing, software
            newValue[newValue.length - 1] = value;
        return singleColumn;

        return colorForeground2;
import java.util.Arrays;
    }
    }
        this.colorBackground2 = source.colorBackground2;
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        this.isRange = source.isRange;
    public void addAttributeValue(Object value) {

        return operator;
    }
 *

    }
    private Object[] attributeValues;
        this.operator = operator;


    private boolean singleColumn;
    public void setOperator(DBCLogicalOperator operator) {
        this.attributeValues = attributeValues;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    }
            Arrays.equals(this.attributeValues, values);
        this.colorForeground2 = source.colorForeground2;

    }
        this.attributeName = source.attributeName;
    }
        this.singleColumn = source.singleColumn;
/**
 */
 * See the License for the specific language governing permissions and

        this.colorForeground2 = colorForeground2;


        return colorBackground;
        isRange = range;
    public boolean isRange() {
/*
