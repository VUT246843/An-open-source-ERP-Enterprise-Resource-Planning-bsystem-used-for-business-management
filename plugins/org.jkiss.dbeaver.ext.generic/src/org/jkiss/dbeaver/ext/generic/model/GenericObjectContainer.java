                    if (!oldIndex.isPersisted()) {
                pack.orderProcedures();
                    // Nothing was read, Maybe driver doesn't support mass keys reading
                for (GenericTableIndex oldIndex : oldCache) {
            } catch (Exception e) {
        this.tableCache.clearCache();

        return tableCache.getObject(monitor, this, name);
    public GenericSynonym getSynonym(DBRProgressMonitor monitor, String name) throws DBException {
        this.constraintKeysCache.clearCache();
 * limitations under the License.
                // Try to read all FKs
import org.jkiss.dbeaver.Log;

        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericObjectContainer container) throws SQLException {
        this.sequences = null;
 *
                    newIndexCache = new ArrayList<>();
    @Override
    public List<? extends GenericView> getViews(@NotNull DBRProgressMonitor monitor) throws DBException {
            DBUtils.orderObjects(procedures);

    }
    private final GenericSequenceCache sequenceCache;
    @Override
    public static class ContainerTriggerCache extends JDBCObjectCache<GenericStructContainer, GenericTrigger<?>> {
        List<GenericProcedure> filteredProcedures = new ArrayList<>();
                    } finally {
    public void addPackage(GenericPackage procedurePackage) {
            } catch (Exception e) {
                // First - try to read all indexes. Some drivers can do this
        this.procedures = null;
    }
            tableCache.getAllObjects(monitor, this);
    @NotNull
    public synchronized DBSObject refreshObject(@NotNull DBRProgressMonitor monitor) throws DBException {

        return DBUtils.findObjects(getProcedures(monitor), name);
    protected GenericObjectContainer(@NotNull GenericDataSource dataSource) {

            tableTriggerCache.getObject(monitor, this, triggerName) : null;
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    @Override


            }
        // allows index query only by certain table name
            cacheStructure(monitor, STRUCT_ALL);
            packages = new ArrayList<>();
        //cacheIndexes(monitor, null);
            try {
import org.jkiss.dbeaver.model.DBPRefreshableObject;
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericStructContainer container) throws SQLException {
                    // Load indexes for all tables and return copy of them
    @Override
            return container.getDataSource().getMetaModel().prepareSynonymsLoadStatement(session, container);
        dataSource.getMetaModel().loadProcedures(monitor, this);
import org.jkiss.dbeaver.model.exec.jdbc.JDBCResultSet;
        this.sequenceCache = new GenericSequenceCache();
                monitor.subTask("Cache primary keys");
    }

        }
        return synonymCache.getObject(monitor, this, name);
import org.jkiss.dbeaver.DBException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    @Override
        return synonymCache;
            }
    @Override
        }
import org.jkiss.code.Nullable;
            return getDataSource().getMetaModel().handleSequenceCacheReadingError(error);
            return container.getDataSource().getMetaModel().createContainerTriggerImpl(container, resultSet);
    }
    public String toString() {
        }
import java.util.*;
        @Override
    public Collection<? extends DBSObject> getChildren(@NotNull DBRProgressMonitor monitor) throws DBException {
            }
            childrenList.addAll(getSynonyms(monitor));

        this.synonymCache.clearCache();
    @Override
        this.dataSource = dataSource;

        if (procedures == null) {
    @NotNull
                            Collection<? extends GenericTableIndex> tableIndexes = table.getIndexes(monitor);
    }
    public boolean hasProcedure(String name) {
    @NotNull
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
public abstract class GenericObjectContainer implements GenericStructContainer, DBPRefreshableObject {
                        for (int i = 0; i < newIndexCache.size(); i++) {
        return this;
            return container.getDataSource().getMetaModel().prepareSequencesLoadStatement(session, container);
        @Override
    @Override
        // Cache indexes (read all tables, all columns and all indexes in this container)
                // Try to read all indexes
            return getProcedures(monitor);
import org.jkiss.code.NotNull;
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.packages = null;
        if (packages == null) {
        return indexCache;


                    .thenComparing(JDBCTableIndex::getName));
        }
        this.tableTriggerCache = new TableTriggerCache(tableCache);
        @Override
    private List<GenericPackage> packages;
    public void cacheStructure(@NotNull DBRProgressMonitor monitor, int scope) throws DBException {
                    newIndexCache = new ArrayList<>();
            }
        if (procedures == null) {
            monitor.subTask("Cache tables");
        synchronized (indexCache) {
    }
 */
                if (readFromTables && newIndexCache.isEmpty()) {
    }
                    constraintKeysCache.clearCache();
package org.jkiss.dbeaver.ext.generic.model;
        return sequenceCache.getObject(monitor, this, name);
import org.jkiss.dbeaver.model.meta.Association;
        this.synonymCache = new GenericSynonymCache();
        }

        return constraintKeysCache;
    public final IndexCache getIndexCache() {
            return container.getDataSource().getMetaModel().createSynonymImpl(session, container, resultSet);
    }

                monitor.subTask("Cache tables' columns");
                    // Failed - seems to be unsupported feature
                if (CommonUtils.isEmpty(objects)) {
        for (GenericProcedure proc : CommonUtils.safeList(getProcedures(monitor))) {
                }

    }
                // If index list is empty then try to read by tables
        return null;
            for (GenericTableBase table : tables) {
    private static final Log log = Log.getLog(GenericObjectContainer.class);
        return synonymCache.getAllObjects(monitor, this);
                List<GenericTableIndex> oldCache = indexCache.getCachedObjects();
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureType;
    public static class GenericSynonymCache extends JDBCObjectCache<GenericObjectContainer, GenericSynonym> {
    public TableCache createTableCache(GenericDataSource datasource) {
    public GenericTableBase getTable(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {
        @NotNull
        this.foreignKeysCache = new ForeignKeysCache(tableCache);
        return indexCache.getObjects(monitor, this, null);
                        // Nothing was read, Maybe driver doesn't support mass keys reading
    private final ContainerTriggerCache containerTriggerCache;
    }
        }
    }
    public final ForeignKeysCache getForeignKeysCache() {
                try {
            }
        return null;
    public Collection<? extends GenericTrigger<?>> getTableTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override

                filteredProcedures.add(proc);
    @Override
        protected JDBCStatement prepareObjectsStatement(@NotNull JDBCSession session, @NotNull GenericObjectContainer container) throws SQLException {


import org.jkiss.dbeaver.model.impl.jdbc.struct.JDBCTableIndex;
            return container.getDataSource().getMetaModel().createSequenceImpl(session, container, resultSet);
    public DBSObject getChild(@NotNull DBRProgressMonitor monitor, @NotNull String childName) throws DBException {
    }
                newIndexCache.sort(Comparator.comparing((GenericTableIndex o) -> o.getTable().getName())
            return filtered;


                if (proc.getName().equals(name)) {
        @Nullable
import java.sql.SQLException;
        return tableTriggerCache;
        final boolean needsStructureCaching = !getTableCache().isEmpty();
/*
    }
                            GenericTableIndex newIndex = newIndexCache.get(i);
    }
    @NotNull
                            monitor.subTask("Read indexes for '" + table.getFullyQualifiedName(DBPEvaluationContext.DDL) + "'");
            return container.getDataSource().getMetaModel().prepareContainerTriggersLoadStatement(session, container);
        return procedures;
        // This doesn't work for generic datasource because metadata facilities
                log.debug(e);
            // So error here is not fatal
        }
    public GenericProcedure getProcedure(@NotNull DBRProgressMonitor monitor, @NotNull String uniqueName) throws DBException {
        @Override
                            }
    }
                        monitor.done();
            }
    public List<GenericProcedure> getProcedures(@NotNull DBRProgressMonitor monitor) throws DBException {
        if ((scope & STRUCT_ATTRIBUTES) != 0 && dataSource.supportsStructCache()) {
                    List<? extends GenericTableBase> tables = getTables(monitor);
    protected List<GenericProcedure> procedures;
                cacheIndexes(monitor, false);
 *
    }
            if (!indexCache.isFullyCached()) {
                    try {
import org.jkiss.dbeaver.model.DBUtils;
    }
            for (GenericPackage pack : packages) {
    }
        }
import org.jkiss.dbeaver.ext.generic.GenericMessages;
        }
        return getDataSource().getDataTypes(monitor);
    public void addProcedure(GenericProcedure procedure) {
        if (!dataSource.splitProceduresAndFunctions()) {
    private final GenericDataSource dataSource;
                                newIndexCache.set(i, oldIndex);
    }
    }
        @Override
    public boolean isPersisted() {
            if (dataSource.getInfo().supportsReferentialIntegrity()) {
        return false;
                }

    public final ConstraintKeysCache getConstraintKeysCache() {
    public List<GenericProcedure> getProcedureCache() {
    }
                // Failed - seems to be unsupported feature
        }
    public GenericTrigger<?> getTableTrigger(@NotNull DBRProgressMonitor monitor, String triggerName) throws DBException {
    public List<? extends GenericProcedure> getProceduresOnly(@NotNull DBRProgressMonitor monitor) throws DBException {
    private final ForeignKeysCache foreignKeysCache;

        this.indexCache.clearCache();
    @Override
            // Cannot be sure that all jdbc drivers support reading of all catalog columns
    }
    public Collection<? extends GenericSequence> getSequences(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Override

            }
            if (dataSource.getInfo().supportsIndexes()) {
            loadProcedures(monitor);
            procedures = new ArrayList<>();
 * DBeaver - Universal Database Manager

    protected List<? extends GenericSequence> sequences;
                }
        if (procedures == null) {
        List<? extends GenericTableBase> tables = getTables(monitor);
        }

    private final IndexCache indexCache;
    @Override


                } catch (Exception e) {

                indexCache.setCache(newIndexCache);
    public final TableCache getTableCache() {
import org.jkiss.utils.CommonUtils;
        packages.add(procedurePackage);
                    if (CommonUtils.isEmpty(foreignKeys)) {
    private final GenericSynonymCache synonymCache;
        this.constraintKeysCache = new ConstraintKeysCache(tableCache);
    }
        return sequenceCache.getAllObjects(monitor, this);
    protected List<? extends GenericSynonym> synonyms;
    }
 * you may not use this file except in compliance with the License.
    }
    }
    @Override
            List<GenericTable> filtered = new ArrayList<>();

    }
 * You may obtain a copy of the License at
        }
    }
    @NotNull
    @NotNull
                    log.debug("Error reading catalog/schema indexes. Get indexes from tables", e);
        }
    }
    @Nullable
        return getDataSource().getMetaModel().supportsTriggers(getDataSource()) ? tableTriggerCache.getAllObjects(monitor, this) : Collections.emptyList();
    public Collection<GenericTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException {
    @Association
    public List<? extends GenericTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException {
            }


        for (GenericProcedure procedure : CommonUtils.safeCollection(getProcedures(monitor))) {
        }
                            if (!CommonUtils.isEmpty(tableIndexes)) {
                    return true;

                            monitor.worked(1);


                if (table instanceof GenericView) {
        @Override
                if (table.isPhysicalTable()) {
                }

    }
                            }
        List<? extends GenericTableBase> tables = getTables(monitor);
        this.indexCache = new IndexCache(tableCache);
        this.synonyms = null;
                }
import org.jkiss.dbeaver.model.impl.jdbc.cache.JDBCObjectCache;
    public GenericSequence getSequence(DBRProgressMonitor monitor, String name) throws DBException {
                    filtered.add((GenericTable) table);

            if (proc.getProcedureType() == DBSProcedureType.FUNCTION) {
        this.sequenceCache.clearCache();
                List<GenericTableIndex> newIndexCache;
                monitor.subTask("Cache indexes");
        return filteredProcedures;
                                newIndexCache.addAll(tableIndexes);
        List<GenericProcedure> filteredProcedures = new ArrayList<>();
                                return;

        }
        protected GenericTrigger<?> fetchObject(@NotNull JDBCSession session, @NotNull GenericStructContainer container, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
            // Try to read all FKs
                    newIndexCache = indexCache.getObjects(monitor, this, null);
                return procedure;


    }
        return filteredProcedures;

    }
                        }
/**
    }
    public List<GenericProcedure> getProcedures(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException {
        if (needsStructureCaching) {

            for (GenericProcedure proc : procedures) {
    @NotNull
    @Override
        if ((scope & STRUCT_ENTITIES) != 0) {
        return dataSource;
    @Override

        return getTable(monitor, childName);
                log.debug(e);
                            if (oldIndex.getContainer() == newIndex.getContainer() &&
    @NotNull

        if (procedures != null) {
 * See the License for the specific language governing permissions and

                        newIndexCache.add(oldIndex);
    @Override

    @Override
    public Collection<GenericPackage> getPackages(@NotNull DBRProgressMonitor monitor) throws DBException {
        @Override
    public Collection<? extends GenericTrigger<?>> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
        }
    @Override
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.jdbc.JDBCStatement;
    }
                            }
    }
        @NotNull
                Collection<GenericUniqueKey> objects = constraintKeysCache.getObjects(monitor, this, null);
                }
        this.tableTriggerCache.clearCache();
    }
    private final TableCache tableCache;

        return packages;
        this.containerTriggerCache = new ContainerTriggerCache();



                    }
    @Override
            if (proc.getProcedureType() == DBSProcedureType.PROCEDURE) {
        }
        return new TableCache(datasource);
        }
                        }
    private final ConstraintKeysCache constraintKeysCache;
    @Override
                }
    private final TableTriggerCache tableTriggerCache;
        cacheIndexes(monitor, true);
        if ((scope & STRUCT_ASSOCIATIONS) != 0 && dataSource.supportsStructCache()) {
                    Collection<GenericTableForeignKey> foreignKeys = foreignKeysCache.getObjects(monitor, this, null);
    @Association
            if (uniqueName.equals(procedure.getUniqueName())) {
        protected GenericSequence fetchObject(@NotNull JDBCSession session, @NotNull GenericObjectContainer container, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {
    public Collection<? extends DBSDataType> getDataTypes(@NotNull DBRProgressMonitor monitor) throws DBException {
    public Collection<? extends GenericSynonym> getSynonyms(@NotNull DBRProgressMonitor monitor) throws DBException {
        // Order procedures
    @Override
        return DBUtils.findObject(getPackages(monitor), name);
    @Override
 *
 * Licensed under the Apache License, Version 2.0 (the "License");

    public Collection<? extends GenericProcedure> getFunctionsOnly(@NotNull DBRProgressMonitor monitor) throws DBException {
                try {
 */
            }
                    filtered.add((GenericView) table);
        procedures.add(procedure);
                    indexCache.clearCache();
            // Try to cache columns
        for (GenericProcedure proc : CommonUtils.safeList(getProcedures(monitor))) {

    }
        }
    public GenericSynonymCache getSynonymCache() {
            try {
    @Override
        return tableCache.getAllObjects(monitor, this);
            // Try to read all PKs
                    monitor.beginTask("Cache indexes from tables", tables.size());
    private synchronized void loadProcedures(DBRProgressMonitor monitor) throws DBException {
        return getDataSource().getMetaModel().supportsDatabaseTriggers(getDataSource()) ? containerTriggerCache.getAllObjects(monitor, this) : Collections.emptyList();
        if (tables != null) {


        // Cache tables
        this.containerTriggerCache.clearCache();
    }
    public GenericSequenceCache getSequenceCache() {
    public List<? extends GenericTableBase> getTables(@NotNull DBRProgressMonitor monitor) throws DBException {
    public TableTriggerCache getTableTriggerCache() {
        return getDataSource().getMetaModel().supportsTriggers(getDataSource()) ?
        return childrenList;
        return true;
        @Nullable
import org.jkiss.dbeaver.model.exec.jdbc.JDBCSession;
import org.jkiss.dbeaver.model.struct.DBSDataType;
                        for (GenericTableBase table : tables) {
                        // Check for the dups
        if (dataSource.getMetaModel().supportsSynonyms(dataSource)) {
        }
                filteredProcedures.add(proc);
        return sequenceCache;

        // Cache associations
                    } else {
        protected boolean handleCacheReadError(@NotNull Exception error) {
        }
        return tableCache;
        return getName() == null ? GenericMessages.generic_object_container_none : getName();
        return foreignKeysCache;

    @Override
    @Override
                } catch (DBException e) {
        return null;
            return filtered;
                indexCache.clearCache();
        if (tables != null) {
    }
                    log.debug(e);
import org.jkiss.dbeaver.model.struct.DBSObject;
                            if (monitor.isCanceled()) {
        this.tableCache = createTableCache(dataSource);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public GenericPackage getPackage(DBRProgressMonitor monitor, String name) throws DBException {
            List<GenericView> filtered = new ArrayList<>();
            }
    public GenericDataSource getDataSource() {

            }

 * GenericEntityContainer
    }
        }
            }

                    }
        if (procedures != null) {

    public class GenericSequenceCache extends JDBCObjectCache<GenericObjectContainer, GenericSequence> {
                tableCache.loadChildren(monitor, this, null);
    private void cacheIndexes(DBRProgressMonitor monitor, boolean readFromTables) throws DBException {
                    monitor.subTask("Cache foreign keys");
        if (packages != null) {
        // Cache attributes
            for (GenericTableBase table : tables) {
    }
                }
                        foreignKeysCache.clearCache();


        @Nullable
    }
                    }
        @NotNull
        return procedures;
    @NotNull
                                CommonUtils.equalObjects(oldIndex.getName(), newIndex.getName())) {
        List<DBSObject> childrenList = new ArrayList<>(getTables(monitor));
 * distributed under the License is distributed on an "AS IS" BASIS,
        protected GenericSynonym fetchObject(@NotNull JDBCSession session, @NotNull GenericObjectContainer container, @NotNull JDBCResultSet resultSet) throws SQLException, DBException {




        }
        }
    @Override
}
        this.foreignKeysCache.clearCache();
    }
    }
            loadProcedures(monitor);

    }

