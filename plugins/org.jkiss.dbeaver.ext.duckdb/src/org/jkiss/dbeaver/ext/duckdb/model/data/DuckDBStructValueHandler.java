

import org.jkiss.dbeaver.model.exec.DBCSession;
        } else {
    ) throws DBCException {
            return (Map<String, Object>) BeanUtils.invokeObjectDeclaredMethod(object, "getMap", new Class[0], new Object[0]);
        } catch (Throwable e) {
 * Unless required by applicable law or agreed to in writing, software
    @SuppressWarnings("unchecked")
            throw new DBCException("Can't get structure as map", e);
        return super.getValueFromObject(session, type, object, copy, validateValue);

        try {
 */
                return new JDBCCompositeMap(session, null, map);

    @Override
        boolean validateValue
package org.jkiss.dbeaver.ext.duckdb.model.data;
        boolean copy,
    }
        }
import java.util.Map;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public static final DuckDBStructValueHandler INSTANCE = new DuckDBStructValueHandler();
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    public Object getValueFromObject(

    private static final Log log = Log.getLog(DuckDBStructValueHandler.class);
            } catch (DBCException e) {

                log.warn(e);
import org.jkiss.utils.BeanUtils;
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCException;
    private Map<String, Object> getMap(@NotNull Object object) throws DBCException {
            try {
            }
                Map<String, Object> map = getMap(object);
 * limitations under the License.
    }
        @NotNull DBSTypedObject type,
}
        if (object instanceof Struct) {
        @NotNull DBCSession session,
import org.jkiss.dbeaver.Log;
public class DuckDBStructValueHandler extends JDBCStructValueHandler {
import java.sql.Struct;
import org.jkiss.dbeaver.model.impl.jdbc.data.handlers.JDBCStructValueHandler;

import org.jkiss.dbeaver.model.impl.jdbc.data.JDBCCompositeMap;
/*
 *

        Object object,
 * you may not use this file except in compliance with the License.
            log.warn("Incorrect use of handler: " + this.getClass().getSimpleName());
 *
        }
