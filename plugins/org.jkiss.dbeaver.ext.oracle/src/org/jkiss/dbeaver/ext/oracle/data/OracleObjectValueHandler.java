}

 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * You may obtain a copy of the License at
    {

 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStructValueHandler;
        return java.lang.Object.class;
        } else if (object instanceof OracleObjectValue) {

/*
    public Class<Object> getValueObjectType(@NotNull DBSTypedObject attribute)
    {
        } else if (object instanceof Struct) {
            return new OracleObjectValue(null);
/**
    public static final OracleObjectValueHandler INSTANCE = new OracleObjectValueHandler();
 * limitations under the License.
    public Object getValueFromObject(@NotNull DBCSession session, @NotNull DBSTypedObject type, Object object, boolean copy) throws DBCException
package org.jkiss.dbeaver.ext.oracle.data;
        } else {
/*
    }
            return super.getValueFromObject(session, type, object, copy);
    @Override
    @Override
 * Object type support
            return new OracleObjectValue(object);
        if (object == null) {
 * DBeaver - Universal Database Manager
*/
    }

 * Unless required by applicable law or agreed to in writing, software
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
 */
 * you may not use this file except in compliance with the License.
 *
public class OracleObjectValueHandler extends JDBCStructValueHandler {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            return copy ? new OracleObjectValue(((OracleObjectValue) object).getValue()) : (OracleObjectValue)object;
