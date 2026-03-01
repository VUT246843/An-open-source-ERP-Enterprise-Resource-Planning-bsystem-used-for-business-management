    private final String query;
    @NotNull
        JDBCPreparedStatement dbStat = session.prepareStatement(query);
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OWNER owner)
        try {
                        break;
                            }
 * Simple objects cache.
                if (objectConstructor == null) {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 *
    private Constructor<OBJECT> objectConstructor;
            for (int i = 0; i < queryParameters.length; i++) {
    }
                    try {
/*
            return objectConstructor.newInstance(owner, resultSet);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.model.impl.jdbc.cache;
            }
                for (Class<?> argType = owner.getClass(); argType != null; argType = argType.getSuperclass()) {
        throws DBException
            throw new DBException(
{
    }

import org.jkiss.dbeaver.DBException;
                }
    @Override
    public JDBCObjectSimpleCache(Class<OBJECT> objectType, String query, Object ... args) {
    }
                dbStat.setObject(i + 1, queryParameters[i]);
 *     http://www.apache.org/licenses/LICENSE-2.0
        throws SQLException
                        }
        this.objectType = objectType;
                        objectConstructor = objectType.getConstructor(argType, ResultSet.class);

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.DBSObject;
    {
        if (queryParameters != null) {
        return dbStat;
                    throw new DBException("Can't find proper constructor for object '" + objectType.getName() + "'");
    extends JDBCObjectCache<OWNER, OBJECT>

                        }
        }
            }
                                objectConstructor = objectType.getConstructor(intType, ResultSet.class);
 *
                            try {
 * DBeaver - Universal Database Manager
        this.queryParameters = args;
/**
import java.lang.reflect.InvocationTargetException;
                        for (Class<?> intType : argType.getInterfaces()) {
 */

    private final Class<OBJECT> objectType;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others

public final class JDBCObjectSimpleCache<OWNER extends DBSObject, OBJECT extends DBSObject>
 * You may obtain a copy of the License at
                    } catch (Exception e) {
                }
                            } catch (Exception e2) {
                            break;
 * limitations under the License.
        } catch (Exception e) {
    protected OBJECT fetchObject(@NotNull JDBCSession session, @NotNull OWNER owner, @NotNull JDBCResultSet resultSet)
                        if (objectConstructor != null) {
 *
                "Error creating cache object",
        this.query = query;


 * distributed under the License is distributed on an "AS IS" BASIS,
                                break;
    {
import java.sql.ResultSet;
        }
                        // Not found - check interfaces
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
                e instanceof InvocationTargetException ite ? ite.getTargetException() : e);
 * See the License for the specific language governing permissions and
 */
import java.lang.reflect.Constructor;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
                    }
 * you may not use this file except in compliance with the License.
    private final Object[] queryParameters;
    @Override
}
                                // Not found
            if (objectConstructor == null) {
import java.sql.SQLException;
 * Licensed under the Apache License, Version 2.0 (the "License");
