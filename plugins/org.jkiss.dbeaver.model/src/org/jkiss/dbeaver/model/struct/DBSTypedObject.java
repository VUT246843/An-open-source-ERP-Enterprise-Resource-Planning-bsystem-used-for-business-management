    int getTypeID();
 *
 *
     */
}    long getMaxLength();
     */
    /**
     * Value scale. Can be null if scale is not applicable/not specified to this data type.
    int TYPE_MOD_CHAR_TRAILING_SPACES       = 1 << 12;
    @Nullable
import org.jkiss.dbeaver.model.DBPObject;
     * Determines kind of data for this typed object.

     * See TYPE_MOD_ constants.

    int TYPE_MOD_NUMBER_LEADING_ZEROES      = 1 << 10;
     * @return data kind

     */
     * @return precision


    Integer getPrecision();
    String getTypeName();
     * Type-specific modifiers.
 * Unless required by applicable law or agreed to in writing, software
{
    @NotNull
    /**
    /**
     * @return value type
 * DBeaver - Universal Database Manager
    long getTypeModifiers();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    // Numbers must be formatted with leading zeroes

     * Type numeric ID.
     * @return type name
 * You may obtain a copy of the License at
/*
     */
    /**

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");

    Integer getScale();
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * Maximum length
public interface DBSTypedObject extends DBPObject

 * limitations under the License.

     * @return scale
import org.jkiss.code.Nullable;
/**
    /**
     */
     */
     * Database specific type name
    int TYPE_MOD_NUMBER_UNSIGNED            = 1 << 5;
    @NotNull
    DBPDataKind getDataKind();
package org.jkiss.dbeaver.model.struct;
    /**

    @NotNull
 *
    // Number is unsigned and don't have a sign
 *     http://www.apache.org/licenses/LICENSE-2.0
     * Type name with all qualifiers.
     * @return max length
 * See the License for the specific language governing permissions and
     * Value precision. Can be null if precision is not applicable/not specified to this data type.
     * (may refer on java.sql.Types or other constant depending on implementer)
     */
    String getFullTypeName();
import org.jkiss.code.NotNull;
    /**
import org.jkiss.dbeaver.model.DBPDataKind;
    // String must be formatted with trailing spaces
    /**
    @Nullable

 */
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
 * DBSTypedObject
