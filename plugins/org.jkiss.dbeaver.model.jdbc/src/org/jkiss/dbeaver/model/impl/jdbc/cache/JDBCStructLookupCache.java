import java.util.List;
        if (dataSource == null) {
    {
            }
                            }
                                    return remoteObject;
import org.jkiss.code.Nullable;
            // https://github.com/dbeaver/dbeaver/issues/20383
{
        return getCachedObject(objectName);
    @NotNull
    protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull OWNER owner)

            } finally {
                            OBJECT remoteObject = fetchObject(session, owner, dbResult);
        throws DBException
                dbStat.executeStatement();
        super(objectNameColumn);

 */
            this.loadObjects(monitor, owner);
                "Reload object '" + object + "' from " + owner.getName()))
            return null;
                        // There could be multiple objects with the name (e.g. in different case)
        this.missingNames.clear();
    {
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBUtils;
        if (!isFullyCached()) {
 * you may not use this file except in compliance with the License.
        super.clearCache();
 *     http://www.apache.org/licenses/LICENSE-2.0

        throws DBException
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            } else {
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
        }
                    }
        }
            no.setName(objectName);
                        while (dbResult.next()) {
        if (object != null) {
                dbStat.setFetchSize(1);
import java.util.HashSet;
        }
import java.sql.SQLException;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;

                removeObject(oldObject, false);
    {

        if (monitor.isForceCacheUsage()) {
                }
                deepCopyCachedObject(newObject, oldObject);
        if (cachedObject != null || monitor.isForceCacheUsage()) {
import org.jkiss.dbeaver.model.DBPNamedObject2;
        } else {
 *
 * Unless required by applicable law or agreed to in writing, software
    }
    public JDBCStructLookupCache(Object objectNameColumn) {
                        }
        return object;

 * distributed under the License is distributed on an "AS IS" BASIS,
}
                        String checkName = object != null ? object.getName() : objectName;
 * DBeaver - Universal Database Manager
                                } else {
            // Not found!
        throws SQLException
                "Load object '" + objectName + "' from " + owner.getName() :
            cacheObject(object);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;

import org.jkiss.dbeaver.DBDatabaseException;
import org.jkiss.dbeaver.DBException;
            if (newObject != null) {
        try (JDBCSession session = DBUtils.openMetaSession(monitor, owner,
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.code.NotNull;
        }
        throws DBException
            objectName = DBUtils.getUnQuotedIdentifier(oldObject.getDataSource(), objectName);
                    try {
                            if (remoteObject != null && isValidObject(monitor, owner, remoteObject)) {
 *

                        dbResult.close();
                return null;
        if (oldObject instanceof DBPNamedObject2 no && DBUtils.isQuotedIdentifier(oldObject.getDataSource(), objectName)) {
 * You may obtain a copy of the License at
                clearChildrenCache(oldObject);
        {
    public OBJECT refreshObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull OBJECT oldObject)
        OBJECT cachedObject = getCachedObject(name);
            // Remove quotes in object name. Quotes are allowed only for a new (not-yet-persisted) objects
    }
        DBPDataSource dataSource = owner.getDataSource();
                        OBJECT firstFoundObject = null;
 * Struct cache with ability to load/search single object by name.
 */
                        return dataSource.getSQLDialect().useCaseInsensitiveNameLookup() ? firstFoundObject : null;
            try (JDBCStatement dbStat = prepareLookupStatement(session, owner, object, objectName)) {
    @Override
    extends JDBCStructCache<OWNER, OBJECT, CHILD>
        return prepareLookupStatement(session, owner, null, null);
        }
        }
    }
 *

    @Override
 * limitations under the License.
                if (dbResult != null) {
                afterCacheLoading(session, owner);
                                    firstFoundObject = remoteObject;
    }
    @Override
            if (isChildrenCached(oldObject)) {
/*
            }
    public void setCache(@NotNull List<OBJECT> objects) {
        // Now cache just one object
        } else {
            throw new DBDatabaseException("Error loading object metadata from database", ex, dataSource);
                                if (remoteObject.getName().equals(checkName)) {

            OBJECT newObject = this.reloadObject(monitor, owner, oldObject, null);

                JDBCResultSet dbResult = dbStat.getResultSet();
            return oldObject;
        super.setCache(objects);
package org.jkiss.dbeaver.model.impl.jdbc.cache;
import java.util.Set;
            }
        } catch (SQLException ex) {
    implements JDBCObjectLookup<OWNER, OBJECT>
public abstract class JDBCStructLookupCache<OWNER extends DBSObject, OBJECT extends DBSObject, CHILD extends DBSObject>
            return null;
    protected OBJECT reloadObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @Nullable OBJECT object, @Nullable String objectName)
                    } finally {
    public OBJECT getObject(@NotNull DBRProgressMonitor monitor, @NotNull OWNER owner, @NotNull String name)
/**
    @Override
    public void clearCache() {
            beforeCacheLoading(session, owner);
            return cachedObject;
                                }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
        String objectName = oldObject.getName();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final Set<String> missingNames = new HashSet<>();
        OBJECT object = reloadObject(monitor, owner, null, name);

            missingNames.add(name);
            throw new DBException(ModelMessages.error_not_connected_to_database);
import org.jkiss.dbeaver.model.struct.DBSObject;
    }
    }
            object == null ?
    {
        if (isFullyCached() || owner.getDataSource() == null || !owner.getDataSource().getContainer().isConnected() || missingNames.contains(name)) {
        }
        this.missingNames.clear();
    }
