     */
    /**
     * Determine value content type (MIME).


import org.jkiss.dbeaver.model.struct.DBSTypedObject;
     * @param type attribute type
     * @param session session
     */
    /**
     * object set by editor (editValue function).  @throws org.jkiss.dbeaver.model.exec.DBCException on error
     */
{
     * Creates new value from object.
import org.jkiss.dbeaver.model.exec.*;
    /**
     * @param resultSet result set
    @NotNull
     * @throws org.jkiss.dbeaver.model.exec.DBCException on error

import org.jkiss.code.Nullable;
     * Get comparator for compare values
     * it is not required to return exact implementation class
     */

     * Must analyse passed object and convert it (if possible) to appropriate handler's type.

     * Extracts object from result set
/**
        throws DBCException;
 * distributed under the License is distributed on an "AS IS" BASIS,
        throws DBCException;
     */
 */
     * @param attribute    value attribute

     * @param session execution context
    @Nullable
 * Licensed under the Apache License, Version 2.0 (the "License");
     */
     * @param object source object
    /**
    default Comparator<Object> getComparator() {
     *
 */
    String getValueContentType(@NotNull DBSTypedObject attribute);
     * Can be used to create new arrays, structs and other composite objects.
 * Unless required by applicable law or agreed to in writing, software
    Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, @Nullable Object object, boolean copy, boolean validateValue)
 * Extract, edit and bind database values.
public interface DBDValueHandler extends DBDValueRenderer
     */
     * Most attributes do not have associated MIME type so handlers returns null.
     * @return operations
        return null;
    /**
     *
     * For null objects returns null of DBDValue marked as null
 *
     * Release any internal resources associated with this value.
    Object fetchValueObject(@NotNull DBCSession session, @NotNull DBCResultSet resultSet, @NotNull DBSTypedObject type, int index)

    /**
     * @param index parameter index (zero based)
    @NotNull
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable


     * However most CONTENT and DOCUMENT attributes have some content type.
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    DBCLogicalOperator[] getSupportedOperators(@NotNull DBSTypedObject attribute);

 * See the License for the specific language governing permissions and
    /**
        throws DBCException;
     * @param session execution context
 * DBD Value Handler.
    /**
     * @param type attribute type
    Object createNewValueObject(@NotNull DBCSession session, @NotNull DBSTypedObject type)

     */
     * @param attribute value attribute
/*
 *
    }
     *
     *
     * List of logical operation supported by underlying values
    Class<?> getValueObjectType(@NotNull DBSTypedObject attribute);
     * (moreover it may be unknown before certain value is extracted)
    /**
     * Creates new value object.
     * @return value object type
     * @param copy copy object
     * This method is called after value binding and statement execution/close.
     * @return initial object value
        throws DBCException;
package org.jkiss.dbeaver.model.data;

    void releaseValueObject(@Nullable Object value);
     * @param validateValue if true then input value will be validated and exception will be thrown on error (e.g. when number cannot be parsed). Otherwise invalid object value will be converted to null.
import org.jkiss.code.NotNull;
}
    void bindValueObject(@NotNull DBCSession session, @NotNull DBCStatement statement, @NotNull DBSTypedObject type, int index, @Nullable Object value)
     * @return content type
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
     *
    @Nullable
     * May return base interface of object's type -
     * @param value value
 * limitations under the License.
     * Binds specified parameter to statement
     * @param statement statement
     * Gets value object's type.
    @Nullable
     * @param attribute    attribute
import java.util.Comparator;
     */
     * @throws org.jkiss.dbeaver.model.exec.DBCException on error
     * @param value parameter value (can be null). Value is get from fetchValueObject function or from
 * you may not use this file except in compliance with the License.
     * @param index attribute index (zero based)
     * @return comparator

     * @param type attribute type
     * @return value or null
