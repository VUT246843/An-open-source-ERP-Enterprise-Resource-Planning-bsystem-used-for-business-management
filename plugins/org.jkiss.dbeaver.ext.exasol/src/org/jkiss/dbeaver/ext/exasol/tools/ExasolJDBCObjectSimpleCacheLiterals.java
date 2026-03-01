	
        }
                                break;
        ((JDBCStatementImpl) dbStat).setQueryString(executeQuery);
                }

        throws SQLException
    }
                    }
    {
    	
    
                    } catch (Exception e) {
                    throw new DBException("Can't find proper constructor for object '" + objectType.getName() + "'");
 * Licensed under the Apache License, Version 2.0 (the "License");
        	queryParameters[i] = (Object) ExasolUtils.quoteString(queryParameters[i].toString());
        executeQuery = String.format(query, queryParameters);
                    try {
    {
        this.query = query;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;

    protected OBJECT fetchObject(@NotNull JDBCSession session, @NotNull OWNER owner, @NotNull JDBCResultSet resultSet)
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

        
        this.objectType = objectType;
public final class ExasolJDBCObjectSimpleCacheLiterals<OWNER extends DBSObject, OBJECT extends DBSObject>
        for (int i = 0; i < queryParameters.length; i++) {
                        if (objectConstructor != null) {
                        for (Class<?> intType : argType.getInterfaces()) {

                e instanceof InvocationTargetException ? ((InvocationTargetException)e).getTargetException() : e);
 * Unless required by applicable law or agreed to in writing, software
                if (objectConstructor == null) {
                            }
    private final Class<OBJECT> objectType;
 * you may not use this file except in compliance with the License.
                            try {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
                                objectConstructor = objectType.getConstructor(intType, ResultSet.class);
        this.queryParameters = args;
import org.jkiss.dbeaver.DBException;
    private Constructor<OBJECT> objectConstructor;
    public ExasolJDBCObjectSimpleCacheLiterals(Class<OBJECT> objectType, String query, Object ... args)
	@Override
    private final Object[] queryParameters;
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OWNER owner)
    {
                "Error creating cache object",

        //escape parameters

            if (objectConstructor == null) {
 *
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    @Override
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
		extends JDBCObjectCache<OWNER, OBJECT> {
    @SuppressWarnings("rawtypes")
                for (Class<?> argType = owner.getClass(); argType != null; argType = argType.getSuperclass()) {
        
	
        JDBCStatement dbStat = session.createStatement();
                        objectConstructor = objectType.getConstructor(argType, ResultSet.class);
                            break;
    private final String query;
import java.lang.reflect.InvocationTargetException;
    private String executeQuery = "";
import java.sql.ResultSet;
import org.jkiss.dbeaver.model.impl.jdbc.exec.JDBCStatementImpl;
 */
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
   
import java.lang.reflect.Constructor;
                        }
        throws SQLException, DBException
 * limitations under the License.
 *
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
            return objectConstructor.newInstance(owner, resultSet);
}
                                // Not found
import java.sql.SQLException;
		}
        
        return dbStat;
                        }
            throw new DBException(
package org.jkiss.dbeaver.ext.exasol.tools;
                        // Not found - check interfaces

        } catch (Exception e) {
    @NotNull
                            } catch (Exception e2) {
        try {
 *
                        break;
 * See the License for the specific language governing permissions and
