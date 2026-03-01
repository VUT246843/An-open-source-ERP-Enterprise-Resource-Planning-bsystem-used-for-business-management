                return dbResult.getString(1);
            long objectId)
 * you may not use this file except in compliance with the License.
        for (OBJECT object : cache.getAllObjects(monitor, owner)) {
import org.jkiss.code.Nullable;
            throws DBException {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
/*

import java.sql.SQLException;
 * See the License for the specific language governing permissions and
            if (dbResult.next()) {
}
            @NotNull DBRProgressMonitor monitor,
            JDBCPreparedStatement dbStat = session.prepareStatement("SELECT DBMS_METADATA.GET_DDL(?,?,?)");
 * limitations under the License.
import org.jkiss.code.NotNull;

 * @author Shengkai Bai


import org.jkiss.dbeaver.model.DBPObjectWithLongId;
import org.jkiss.dbeaver.model.struct.DBSObject;
            @NotNull AbstractObjectCache<OWNER, OBJECT> cache,
 *
 * Unless required by applicable law or agreed to in writing, software
public class DamengUtils {
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.cache.AbstractObjectCache;
    public static String getDDL(DBRProgressMonitor monitor, DBSObject object, DamengConstants.ObjectType objectType, String schema) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        return null;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

 */
package org.jkiss.dbeaver.ext.dameng.model;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
            throw new DBException("Load source code for " + objectType + " '" + object.getName() + "' failed", e);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, object, "Load source code for " + objectType + " '" + object.getName() + "'")) {
import org.jkiss.dbeaver.ext.dameng.DamengConstants;
 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (SQLException e) {
 * You may obtain a copy of the License at
            if (object.getObjectId() == objectId) {
    public static <OWNER extends DBSObject, OBJECT extends DBPObjectWithLongId & DBSObject> OBJECT getObjectById(
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/**

            }
 * distributed under the License is distributed on an "AS IS" BASIS,

            dbStat.setString(3, schema);
 *
            dbStat.setString(2, object.getName());
            JDBCResultSet dbResult = dbStat.executeQuery();
 *
        return null;
 */
            @NotNull OWNER owner,
            dbStat.setString(1, objectType.name());
            }
        }

        }
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBUtils;
    }
                return object;
 * Copyright (C) 2010-2024 DBeaver Corp and others
