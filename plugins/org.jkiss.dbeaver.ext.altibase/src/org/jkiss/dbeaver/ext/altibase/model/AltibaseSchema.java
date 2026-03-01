    public List<AltibaseView> getViews(@NotNull DBRProgressMonitor monitor) throws DBException {
        @Override
    }
import org.jkiss.utils.CommonUtils;
import java.sql.SQLException;
}
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
            for (GenericTableBase table : tables) {
    
    /**
        return dbLinkCache;
    public GenericTrigger getTableTrigger(@NotNull DBRProgressMonitor monitor, String uniqueName) throws DBException {
        List<AltibaseTypeset> filteredProcedures = new ArrayList<>();
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;

 * You may obtain a copy of the License at
        }
    // Statistics
            return ((AltibaseMetaModel) container.getDataSource().getMetaModel()).createDirectoryImpl(container, resultSet);
     * Altibase Schema
                }
    }
import org.jkiss.code.Nullable;
    static class LibraryCache extends JDBCObjectLookupCache<GenericObjectContainer, AltibaseLibrary> {
    private final DbLinkCache dbLinkCache = new DbLinkCache();
     */
            return filtered;
        return null;

        return null;
 * Unless required by applicable law or agreed to in writing, software
                    "SELECT table_name, memory_size, disk_size FROM system_.sys_table_size_ WHERE USER_NAME = ?")) {

        for (GenericTableIndex index : CommonUtils.safeCollection(getIndexes(monitor))) {

     * Return materialized view only from table list.
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull GenericObjectContainer owner,
        }
        object = getTable(monitor, childName);
    public List<AltibaseQueue> getQueueTables(DBRProgressMonitor monitor) throws DBException {
 * you may not use this file except in compliance with the License.
                if (table instanceof AltibaseTable) {
    static class DirectoryCache extends JDBCObjectLookupCache<GenericObjectContainer, AltibaseDirectory> {
                if (table instanceof AltibaseQueue) {
        for (GenericTrigger tableTrigger : CommonUtils.safeCollection(getTableTriggers(monitor))) {
    
import org.jkiss.dbeaver.model.DBUtils;
public class AltibaseSchema extends GenericSchema implements DBPObjectStatisticsCollector {
    public AltibaseSchema(GenericDataSource dataSource, GenericCatalog catalog, String schemaName) {
            if (proc instanceof AltibaseTypeset) {
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        }
    }
        for (GenericProcedure procedure : CommonUtils.safeCollection(getProcedures(monitor))) {
    public boolean isStatisticsCollected() {
    public List<AltibaseMaterializedView> getMaterializedViews(DBRProgressMonitor monitor) throws DBException {
        @Override
            for (GenericTableBase table : tables) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                    session, owner, object, objectName);
        @Override

            return ((AltibaseMetaModel) owner.getDataSource().getMetaModel()).prepareDirectoryLoadStatement(
        hasStatistics = false;
        }
    }
        return null;
 *
        return null;
 */
                            table.fetchTableSize(dbResult);
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
    ///////////////////////////////////

                if (table instanceof AltibaseTable && !((AltibaseTable) table).hasStatistics()) {
        List<? extends GenericTableBase> tables = getTables(monitor);
                if (table instanceof AltibaseMaterializedView) {
        return object;
        } catch (SQLException e) {
    static class DbLinkCache extends JDBCObjectLookupCache<GenericObjectContainer, AltibaseDbLink> {
            return filtered;
import java.util.ArrayList;
        return hasStatistics;
     */
        }

                }
        protected AltibaseDirectory fetchObject(@NotNull JDBCSession session, @NotNull GenericObjectContainer container, 
                        String tableName = dbResult.getString(1);
    }
            }
        this.directoryCache.clearCache();
        @Nullable
        if (tables != null) {
    /**
        if (tables != null) {
        protected AltibaseDbLink fetchObject(@NotNull JDBCSession session, @NotNull GenericObjectContainer container, 
                    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
import org.jkiss.dbeaver.model.exec.jdbc.JDBCPreparedStatement;
        return filteredProcedures;
        return null;
    

            List<AltibaseMaterializedView> filtered = new ArrayList<>();
                        }
import org.jkiss.code.NotNull;
        }
            }
     * Return queue table objects only from table list.
                dbStat.setString(1, getName());
    /**

 *
    @Override
        if (tables != null) {
    }
    @Override
        }
            }
        } finally {
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
                return index;
    public List<AltibaseDbLink> getDbLinks(DBRProgressMonitor monitor) throws DBException {

        }
            }
    
        return directoryCache.getAllObjects(monitor, this);
            if (uniqueName.equals(index.getName())) {


            for (GenericTableBase table : tables) {
    }
            for (GenericTableBase table : tables) {
        
     */
                        AltibaseTable table = (AltibaseTable) getTable(monitor, tableName);
    }
                    filtered.add((AltibaseMaterializedView) table);
                    while (dbResult.next()) {
import org.jkiss.dbeaver.model.struct.DBSObject;
            return ((AltibaseMetaModel) owner.getDataSource().getMetaModel()).prepareLibraryLoadStatement(
    }
        }
        
        @Nullable
import org.jkiss.dbeaver.DBException;
        if (tables != null) {
        }
        return null;
    public List<AltibaseDirectory> getDirectories(DBRProgressMonitor monitor) throws DBException {
        return this;
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull GenericObjectContainer owner,
    }
        this.dbLinkCache.clearCache();
    }
    
            List<AltibaseQueue> filtered = new ArrayList<>();
            List<AltibaseView> filtered = new ArrayList<>();
    
package org.jkiss.dbeaver.ext.altibase.model;
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectLookupCache;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        List<? extends GenericTableBase> tables = getTables(monitor);
                }
    }
 * DBeaver - Universal Database Manager
            try (JDBCPreparedStatement dbStat = session.prepareStatement(
    public void collectObjectStatistics(@NotNull DBRProgressMonitor monitor, boolean totalSizeOnly, boolean forceRefresh) throws DBException {
    public GenericProcedure getProcedureByName(DBRProgressMonitor monitor, String name) throws DBException {
 * limitations under the License.
    @Override

        @Override
    }
                @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
        return libraryCache.getAllObjects(monitor, this);
            return object;
                    session, owner, object, objectName);
            }

                @Nullable AltibaseLibrary object, @Nullable String objectName) throws SQLException {
        protected AltibaseLibrary fetchObject(@NotNull JDBCSession session, @NotNull GenericObjectContainer container, 
                filteredProcedures.add((AltibaseTypeset) proc);
                @Nullable AltibaseDirectory object, @Nullable String objectName) throws SQLException {
        public JDBCStatement prepareLookupStatement(@NotNull JDBCSession session, @NotNull GenericObjectContainer owner,
        
                    filtered.add((AltibaseTable) table);
        }
            if (name.equals(procedure.getName())) {
/*
    
 * distributed under the License is distributed on an "AS IS" BASIS,
                    ((AltibaseTable) table).resetSize();
                    filtered.add((AltibaseView) table);
        DBSObject object = null;
            return ((AltibaseMetaModel) container.getDataSource().getMetaModel()).createDbLinkImpl(container, resultSet);
import org.jkiss.dbeaver.model.exec.DBCException;
                return tableTrigger;
     */

                }
                try (JDBCResultSet dbResult = dbStat.executeQuery()) {
                        if (table != null) {
    public List<AltibaseTypeset> getTypesetsOnly(DBRProgressMonitor monitor) throws DBException {

            hasStatistics = true;
            throw new DBCException("Error reading table statistics", e);
    public List<AltibaseTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException {
 * Licensed under the Apache License, Version 2.0 (the "License");
            List<AltibaseTable> filtered = new ArrayList<>();
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
        
    
        @Nullable

import java.util.List;
  
            return object;
            if (uniqueName.equals(tableTrigger.getName())) {
        @Override
            return;
                    session, owner, object, objectName);
        List<? extends GenericTableBase> tables = getTables(monitor);
        super(dataSource, catalog, schemaName);
        }
 * See the License for the specific language governing permissions and
        if (object != null) {
            }
    }
        List<? extends GenericTableBase> tables = getTables(monitor);
    }
        
import org.jkiss.dbeaver.ext.generic.model.*;
    }
    public List<AltibaseLibrary> getLibraries(DBRProgressMonitor monitor) throws DBException {

        super.refreshObject(monitor);
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
        return libraryCache;
            }
        object = getPackage(monitor, childName);
            }
                return procedure;
 *
            return ((AltibaseMetaModel) owner.getDataSource().getMetaModel()).prepareDbLinkLoadStatement(
    public DirectoryCache getDirectoryCache() {
    public GenericTableIndex getIndex(DBRProgressMonitor monitor, String uniqueName) throws DBException {
        }
    @Override
        return dbLinkCache.getAllObjects(monitor, this);
    public LibraryCache getLibraryCache() {
        this.libraryCache.clearCache();

        }
            return filtered;
            return filtered;
    private final LibraryCache libraryCache = new LibraryCache();
    
                if (table instanceof AltibaseView) {
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    filtered.add((AltibaseQueue) table);
        if (object != null) {

    }
    /**
            return ((AltibaseMetaModel) container.getDataSource().getMetaModel()).createLibraryImpl(container, resultSet);
            }
    }
        try (JDBCSession session = DBUtils.openMetaSession(monitor, this, "Load table status")) {
                }
        }
        object = getProcedure(monitor, childName);
                @Nullable AltibaseDbLink object, @Nullable String objectName) throws SQLException {
                
            }
        }
            return object;
    }
        }

        if (hasStatistics && !forceRefresh) {
        return directoryCache;
                }
    private volatile boolean hasStatistics;
    public DbLinkCache getDbLinkCache() {
    private final DirectoryCache directoryCache = new DirectoryCache();
    }
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
        return null;
    }
        if (object != null) {
        for (GenericProcedure proc : CommonUtils.safeList(getProcedures(monitor))) {
     * Return typeset objects only from procedures
    }

        @Override
    
    
        object = getSynonym(monitor, childName);
            for (GenericTableBase table : getTableCache().getCachedObjects()) {
