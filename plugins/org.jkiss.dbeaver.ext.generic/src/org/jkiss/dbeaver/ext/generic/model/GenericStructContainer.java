import java.util.List;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
    ConstraintKeysCache getConstraintKeysCache();
    @NotNull
 * DBeaver - Universal Database Manager
    @NotNull

    @NotNull
    Collection<? extends GenericSynonym> getSynonyms(@NotNull DBRProgressMonitor monitor) throws DBException;
/*
    Collection<? extends GenericTrigger<?>> getTriggers(@NotNull DBRProgressMonitor monitor) throws DBException;
    @NotNull


 *

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.




    @NotNull
 *
import java.util.Collection;

    @NotNull
import org.jkiss.code.Nullable;
    GenericObjectContainer.GenericSequenceCache getSequenceCache();
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;

 */


    Collection<? extends GenericProcedure> getProcedures(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException;


    TableCache getTableCache();
    List<? extends GenericView> getViews(@NotNull DBRProgressMonitor monitor) throws DBException;
    GenericCatalog getCatalog();
    Collection<? extends GenericProcedure> getProceduresOnly(@NotNull DBRProgressMonitor monitor) throws DBException;

 * distributed under the License is distributed on an "AS IS" BASIS,
public interface GenericStructContainer extends DBSObjectContainer, DBSProcedureContainer {

    Collection<? extends GenericTableIndex> getIndexes(@NotNull DBRProgressMonitor monitor) throws DBException;
import org.jkiss.dbeaver.DBException;
/**
 *
    Collection<? extends GenericProcedure> getFunctionsOnly(@NotNull DBRProgressMonitor monitor) throws DBException;
 * See the License for the specific language governing permissions and
    GenericProcedure getProcedure(@NotNull DBRProgressMonitor monitor, @NotNull String uniqueName) throws DBException;
    @NotNull



import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
    ForeignKeysCache getForeignKeysCache();
    Collection<? extends GenericSequence> getSequences(@NotNull DBRProgressMonitor monitor) throws DBException;
    @NotNull
    GenericSchema getSchema();

 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
    Collection<? extends DBSDataType> getDataTypes(@NotNull DBRProgressMonitor monitor) throws DBException;

 * Unless required by applicable law or agreed to in writing, software
    @Nullable
    @NotNull
    IndexCache getIndexCache();
    TableTriggerCache getTableTriggerCache();

import org.jkiss.dbeaver.model.struct.DBSDataType;


    GenericTableBase getTable(@NotNull DBRProgressMonitor monitor, @NotNull String name) throws DBException;
 * Generic struct container

    GenericObjectContainer.GenericSynonymCache getSynonymCache();
package org.jkiss.dbeaver.ext.generic.model;

 */
    @Override
    Collection<? extends GenericTrigger<?>> getTableTriggers(@NotNull DBRProgressMonitor monitor) throws DBException;
 * limitations under the License.
    GenericStructContainer getObject();
    List<? extends GenericTableBase> getTables(@NotNull DBRProgressMonitor monitor) throws DBException;

    GenericDataSource getDataSource();
    Collection<? extends GenericProcedure> getProcedures(@NotNull DBRProgressMonitor monitor) throws DBException;
    Collection<? extends GenericPackage> getPackages(@NotNull DBRProgressMonitor monitor) throws DBException;

}
 * Licensed under the Apache License, Version 2.0 (the "License");


 * Copyright (C) 2010-2025 DBeaver Corp and others
    List<? extends GenericTable> getPhysicalTables(@NotNull DBRProgressMonitor monitor) throws DBException;
 * You may obtain a copy of the License at
