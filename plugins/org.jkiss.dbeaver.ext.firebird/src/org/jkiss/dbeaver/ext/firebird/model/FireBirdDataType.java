    private boolean notNull;
 *
        int fieldLength, int charLength,
    private String defaultSource;

            return DBPDataKind.BINARY;
    public FireBirdDataType(FireBirdDataSource genericDataSource, FireBirdFieldType fieldType, int subType, String name, String remarks,
    public boolean isSystem() {
        return fieldType.getName();
    public String getCharsetName() {
    public boolean isNotNull() {

    @Property(order = 51)
    }
        boolean unsigned, boolean searchable, int precision, int minScale, int maxScale,
public class FireBirdDataType extends GenericDataType implements DBPSystemObject {
 * distributed under the License is distributed on an "AS IS" BASIS,
        return getTypeName().contains("$");    // [JDBC: Firebird]
        this.charLength = charLength;
package org.jkiss.dbeaver.ext.firebird.model;
    }


 */
 * you may not use this file except in compliance with the License.
    private final FireBirdFieldType fieldType;
        String computedSource, String validationSource, String defaultSource, String charsetName, boolean notNull)

import org.jkiss.dbeaver.ext.generic.model.GenericDataType;

        return notNull;
 *
    private String computedSource;

    public DBPDataKind getDataKind() {
    public FireBirdDataType(FireBirdDataSource dataSource, FireBirdFieldType fieldType) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
    @Property(order = 50)
    }
        this.charsetName = charsetName;
    public String getValidationSource() {

    private final int subType;
    public String getDefaultSource() {
 * See the License for the specific language governing permissions and
    @Property(order = 60)
}

 * DBeaver - Universal Database Manager
    private int fieldLength;
        return computedSource;
        return super.getDataKind();
        this.computedSource = computedSource;
    }
    }
    @Property(order = 17)
 * Licensed under the Apache License, Version 2.0 (the "License");
    public int getFieldLength() {
    }
    @Override
    }
    @Property(order = 45)
    private int charLength;

    }
        this.fieldLength = fieldLength;
    public int getCharLength() {
    @Property(order = 16)
        super(dataSource, fieldType.getValueType(), fieldType.getName(), null, false, true, 0, 0, 0);
        this.fieldType = fieldType;
        this.fieldType = fieldType;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.DBPSystemObject;
    @Property(order = 19)
            (FireBirdConstants.CHARSET_OCTETS.equals(charsetName) || FireBirdConstants.CHARSET_BINARY.equals(charsetName)))
    public int getSubType() {
        this.subType = 0;
 *
    {

        return validationSource;
    @Override
    private String charsetName;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        }

import org.jkiss.dbeaver.model.meta.Property;
        this.validationSource = validationSource;
    public String getComputedSource() {
        this.defaultSource = defaultSource;
import org.jkiss.dbeaver.model.DBPDataKind;

    }
        return defaultSource;
        return charsetName;
    private String validationSource;

    @Property(order = 18)
    }
    public String getFieldType() {
    @Property(order = 70)
    }
        return fieldLength;
        this.notNull = notNull;
        if (fieldType == FireBirdFieldType.CHAR &&
    @NotNull
 * You may obtain a copy of the License at


        return charLength;
 * limitations under the License.


/*
        return subType;
    }
        {
        this.subType = subType;
        super(genericDataSource, fieldType.getValueType(), name, remarks, unsigned, searchable, precision, minScale, maxScale);
 * Unless required by applicable law or agreed to in writing, software
