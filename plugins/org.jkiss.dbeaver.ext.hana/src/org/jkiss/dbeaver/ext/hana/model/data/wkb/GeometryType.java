 * See the License for the specific language governing permissions and
 */
package org.jkiss.dbeaver.ext.hana.model.data.wkb;
 * limitations under the License.
        for (GeometryType type : GeometryType.values()) {
    GeometryType(int typeCode) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return typeCode;

    }
 * Contributors:
 * You may obtain a copy of the License at
public enum GeometryType {

 */
 * Unless required by applicable law or agreed to in writing, software
    }

 *
 * you may not use this file except in compliance with the License.
 *
    }
 * The geometry types supported by HANA.
            7), CIRCULARSTRING(8);

    public static GeometryType getFromCode(int code) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

}

    POINT(1), LINESTRING(2), POLYGON(3), MULTIPOINT(4), MULTILINESTRING(5), MULTIPOLYGON(6), GEOMETRYCOLLECTION(
 *
/**
    private int typeCode;
/*
            if (type.typeCode == code) {
        return null;
                return type;
 * DBeaver - Universal Database Manager
 *    Stefan Uhrig - initial implementation
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.typeCode = typeCode;
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    public int getTypeCode() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
