 * Licensed under the Apache License, Version 2.0 (the "License");

        throws SQLException
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String name)
        if (isFullyCached() || missingNames.contains(name) || monitor == null) {
}
                        dbResult.close();
                JDBCResultSet dbResult = dbStat.getResultSet();
    @Override
        throws DBException
                removeObject(oldObject, false);
 * You may obtain a copy of the License at
            throw new DBDatabaseException(ex, dataSource);
        if (!isFullyCached()) {
            }
    }
    protected JDBCObjectLookupCache() {
        {

        super.clearCache();
        }
        }
        }
 * limitations under the License.
    }

        return prepareLookupStatement(session, owner, null, null);
        // Now cache just one object
    }

            missingNames.add(name);

import org.jkiss.dbeaver.DBDatabaseException;
    @NotNull

                "Load object '" + objectName + "' from " + owner.getName() :
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (object != null) {
                            return fetchObject(session, owner, dbResult);
import java.sql.SQLException;
                    }
 *
/**
            }

            // Not found!
    public OBJECT refreshObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull OBJECT oldObject)
        throws DBException
        } else {
    }

            log.debug("[TEST] Skip lookup cache read in test mode");
            return cachedObject;
    {
            throw new DBException(ModelMessages.error_not_connected_to_database);
    @Override
                dbStat.executeStatement();
import java.util.HashSet;
        if (DBWorkbench.getPlatform().isUnitTestMode()) {
        OBJECT cachedObject = getCachedObject(name);
            try (JDBCStatement dbStat = prepareLookupStatement(session, owner, object, objectName)) {
public abstract class JDBCObjectLookupCache<OWNER extends DBSObject, OBJECT extends DBSObject>
    public void clearCache() {

import java.util.Set;
    {
                        }
                dbStat.setFetchSize(1);
import java.util.List;
        if (cachedObject != null) {
 *
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
 * Object lookup cache

        this.missingNames.clear();
    public void setCache(@NotNull List<OBJECT> objects) {
package org.jkiss.dbeaver.model.impl.jdbc.cache;
            } else {
            return object;
    }
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.struct.DBSObject;
        DBPDataSource dataSource = owner.getDataSource();
import org.jkiss.code.NotNull;
        try (JDBCSession session = DBUtils.openMetaSession(monitor, owner,
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
            OBJECT newObject = this.reloadObject(monitor, owner, oldObject, null);
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.Log;
        } else {
 */
{
    private final Set<String> missingNames = new HashSet<>();
    {
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.runtime.DBWorkbench;
    }
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OWNER owner)
    {
                    } finally {
    @Override
                "Reload object '" + object + "' from " + owner.getName()))
            return oldObject;
    extends JDBCObjectCache<OWNER, OBJECT> implements JDBCObjectLookup<OWNER, OBJECT>
        this.missingNames.clear();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
 * See the License for the specific language governing permissions and
/*
    @Override
            object == null ?
import org.jkiss.dbeaver.DBException;
            return null;
        return object;
                }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
import org.jkiss.dbeaver.model.DBUtils;
    }
            if (newObject != null) {
                return null;
                //cacheObject(newObject);
                        if (dbResult.next()) {
        super.setCache(objects);
 * Unless required by applicable law or agreed to in writing, software
        return getCachedObject(objectName);
 */
                deepCopyCachedObject(newObject, oldObject);
                    try {
        }
            cacheObject(object);
import org.jkiss.dbeaver.model.messages.ModelMessages;
        String objectName = oldObject.getName();
    protected OBJECT reloadObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @Nullable OBJECT object, @Nullable String objectName)
    private static final Log log = Log.getLog(JDBCObjectLookupCache.class);
        OBJECT object = reloadObject(monitor, owner, null, name);
 *
        }
import org.jkiss.dbeaver.model.DBPDataSource;
            this.loadObjects(monitor, owner);
        if (dataSource == null) {
        }
import org.jkiss.code.Nullable;

        } catch (SQLException ex) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                if (dbResult != null) {
        throws DBException

