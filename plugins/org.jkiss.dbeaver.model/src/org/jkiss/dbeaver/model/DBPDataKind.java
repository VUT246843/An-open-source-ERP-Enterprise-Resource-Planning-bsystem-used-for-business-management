     * <p>

 * See the License for the specific language governing permissions and
     * Using this concept it is possible to peek a best-suitable
 * You may obtain a copy of the License at
        }

    BOOLEAN(false),
    public int getCommonality() {
 *
    NUMERIC(false),
        return !complex && this != ROWID;
 */
            case ARRAY:
     * The commonality describes how common is a given data kind, mostly
            return sourceKind == STRING;// || sourceKind == NUMERIC || sourceKind == BOOLEAN || sourceKind == DATETIME;
            case STRUCT:
            case STRING:
 *     http://www.apache.org/licenses/LICENSE-2.0
            case CONTENT:
     * @return commonality of given data kind
    }
            return sourceKind == STRING || sourceKind == BINARY || sourceKind == CONTENT;
    ANY(true),
    CONTENT(false),

            return sourceKind == targetKind;
    public boolean supportsRangeSearch() {
                return 0;
 * DBeaver - Universal Database Manager
        } else if (targetKind == STRING) {
    }
    }
    DATETIME(false),
    /**

    OBJECT(true),
    ARRAY(true),
{
    STRUCT(true),
     * its ability for one type to consume another <b>without losing any data</b>.
    public static boolean canConsume(DBPDataKind sourceKind, DBPDataKind targetKind) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return 3;
        return complex;
            case BINARY:
    STRING(false),
    public boolean isComplex() {
     * type for document-based attributes where the containing data
            case REFERENCE:
    ROWID(false),
}
     * could wary from one document to another.
 */

    UNKNOWN(false);
                return 1;
 * Data kind
        this.complex = complex;
        switch (this) {
     * <p>
    private final boolean complex;
 * Unless required by applicable law or agreed to in writing, software
        if (targetKind == CONTENT || targetKind == BINARY) {
 *
                return 2;
 * you may not use this file except in compliance with the License.
    BINARY(false),
package org.jkiss.dbeaver.model;
    }

     * For example, when comparing {@link #NUMERIC} and {@link #STRING},
        }
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
            case BOOLEAN:

    REFERENCE(true),
            case NUMERIC:
 *
public enum DBPDataKind
 * distributed under the License is distributed on an "AS IS" BASIS,
            default:
            case OBJECT:
        } else {
 * limitations under the License.
            case ROWID:
/**
            case DATETIME:
     * {@link #NUMERIC} (but no other way around).
    DOCUMENT(true),
     */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    DBPDataKind(boolean complex) {
    }
     * the latter one would be more common because it can represent
     *
