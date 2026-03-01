                                if (nameList.size() == 1) {
            // Find using context defaults
        }
        @NotNull SQLIdentifierDetector identifierDetector,

            List<? extends DBSObject> result = findObjectsByPath(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                        if (defaultSchema != null) {
import org.jkiss.dbeaver.model.struct.*;
                        }
            if (monitor.isCanceled()) {
            request.getContext().getExecutionContext(),
                                    }
        @NotNull DBRProgressMonitor monitor,
                                if (nameList.size() == 2) {
        } catch (DBException e) {
                        break;
    }
        @NotNull DBRProgressMonitor monitor,
                parent = oc;
/**
        DBPDataSource dataSource = objectContainer == null ? null : objectContainer.getDataSource();
                        DBSObjectContainer catalog = contextDefaults.getDefaultCatalog();
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
            if (!result.isEmpty()) {
        @Nullable DBSObjectContainer objectContainer,
                                List<? extends DBSObject> objs = findProcedures(monitor, childProcsContainer, nameList.get(0));
        @NotNull SQLIdentifierDetector identifierDetector,


        @NotNull List<String> names,
                DBCExecutionContextDefaults<?, ?> contextDefaults = executionContext.getContextDefaults();
        );
        DBRProgressMonitor mdMonitor = dataSource.getContainer().isExtraMetadataReadEnabled() ?
                        params.setParentObject(sc);
            objectContainer,
}        boolean isGlobalSearch,
                            if (anyObject && catalog instanceof DBSProcedureContainer childProcsContainer) {
        }
        @NotNull DBCExecutionContext executionContext,
        boolean useAssistant
import org.jkiss.dbeaver.model.sql.completion.SQLCompletionRequest;
                        params.setCaseSensitive(identifierDetector.isQuoted(objectNameMask));
    }
                                    return objs;

        boolean isGlobalSearch,
            return list.getFirst();
    @NotNull
                        );

                if (objs.size() > 0) {
                    }
            List<? extends DBSObject> childObject = null;
            log.error(e);
        boolean anyObject
            if (child == null) {
                List<? extends DBSObject> objs = findProcedures(monitor, procsContainer, childName);
package org.jkiss.dbeaver.model.sql;
            List<String> transformedNameList = new ArrayList<>(nameList);
                        Collection<DBSObjectReference> tables = structureAssistant.findObjectsByMask(monitor, executionContext, params);
            }
import org.jkiss.dbeaver.model.DBPDataSource;
            return Collections.emptyList();
                    }
                                        List<? extends DBSObject> objs = findProcedures(monitor, childProcsContainer, nameList.get(1));
    }
                        String objectNameMask = nameList.get(0);
import java.util.List;
                } else {
                    if (nameList.size() == 1) {
import org.jkiss.code.Nullable;
            dataSource = executionContext.getDataSource();
            if (child instanceof DBSObjectContainer oc) {
 * DBeaver - Universal Database Manager
                }
                            return List.of(tables.iterator().next().resolveObject(monitor)); // consider all matching tables
 */
                    DBSStructureAssistant structureAssistant = DBUtils.getAdapter(DBSStructureAssistant.class, sc);
    @NotNull
                            DBSObject childObject = catalog.getChild(monitor, nameList.get(0));
 */
                unquotedNames.add(DBUtils.getUnQuotedIdentifier(dataSource, name));
            nameList,
 * Metadata search utils
                        DBSObjectContainer defaultSchema = contextDefaults.getDefaultSchema();
                Collection<? extends DBSProcedure> procs = procsContainer.getProcedures(monitor);
                                }
                } else {
        @NotNull DBSProcedureContainer procsContainer,
            if (childObject.isEmpty() && nameList.size() <= 1) {
            }
        return getFirstIfPresented(

                }
                return List.of(child);
 * You may obtain a copy of the License at
                    }
        @NotNull DBCExecutionContext executionContext,
        if (nameList.isEmpty()) {
        }
 * you may not use this file except in compliance with the License.
        @NotNull String procedureName
import org.jkiss.code.NotNull;
        @Nullable SQLCompletionRequest request,
import org.jkiss.dbeaver.model.DBUtils;
                return Collections.emptyList();
    public static List<? extends DBSObject> findObjectsByPath(
        return Collections.emptyList();
            for (String name : nameList) {
    ) {
                    if (!matchedProcs.isEmpty()) {
                        params.setGlobalSearch(isGlobalSearch);
                        }
        @NotNull SQLIdentifierDetector identifierDetector,
            }
        @NotNull List<String> nameList,
                                    if (anyObject && childObject instanceof DBSProcedureContainer childProcsContainer) {
            DBSObject child = parent.getChild(monitor, childName);
        @NotNull List<String> nameList,
        @NotNull List<String> nameList,
 *
            }
                    return Collections.emptyList();
            }
                                if (!objs.isEmpty()) {
                }
        @NotNull DBRProgressMonitor monitor,
            if (i == names.size() - 1) {
                    if (structureAssistant != null) {
            }
            List<String> unquotedNames = new ArrayList<>(nameList.size());
                            }
                                        if (entity != null) {
                    }
            if (child != null) {
                    if (parentSc == null) {
    public static DBSObject findObjectByFQN(
                                }
                }
            findObjectsByFQN(monitor, objectContainer, executionContext, nameList, useAssistant, identifierDetector, false, false)
    }
                String unquotedName = DBUtils.getUnQuotedIdentifier(dataSource, name);

                                    return List.of(childObject);
                    } else {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            }
        }
            return Collections.emptyList();
/*
                mdMonitor, executionContext, objectContainer, unquotedNames, identifierDetector, useAssistant, isGlobalSearch, anyObject
    @Nullable
        boolean useAssistant,
        for (int i = 0; i < names.size(); i++) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        @Nullable DBSObjectContainer objectContainer,
                                if (objs.size() > 0) {
    ) throws DBException {
            !request.isSimpleMode(),
        if (dataSource == null) {
                if (procs != null) {
        boolean anyObject


                && parent.getDataSource().getInfo().supportsStoredCode()
        if (!mdMonitor.isForceCacheUsage()) {
 *
        @NotNull SQLIdentifierDetector identifierDetector
            if (!nameList.isEmpty()) {
    private static <T> T getFirstIfPresented(@Nullable List<T> list) {
                                }

        boolean useAssistant,
 *
import org.jkiss.dbeaver.Log;
                        return matchedProcs;
            }
            String childName = names.get(i);
                            if (entity != null) {
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor,
        }
        }
        @NotNull List<String> nameList
        {
                child = null;

                return childObject;
        @Nullable DBCExecutionContext executionContext,
            executionContext = DBUtils.getDefaultContext(dataSource, true);
            );
            } else {

    @Nullable
                        if (catalog != null) {
            request.getContext().isSearchGlobally(),
                            }
 * distributed under the License is distributed on an "AS IS" BASIS,
                            }
                        return Collections.emptyList();
                if (contextDefaults != null) {
            for (int i = 0; i < nameList.size(); i++) {
                transformedNameList.set(i, name);
                            if (childObject != null) {
                childObject = findNestedObjects(monitor, executionContext, sc, nameList, anyObject);
    }
            if (anyObject && child == null && parent instanceof DBSProcedureContainer procsContainer
            ) {
        @Nullable DBCExecutionContext executionContext,
    public static DBSObject findObjectByFQN(
                                return List.of(entity);
                break;
        } catch (DBException e) {
        if (dataSource == null && executionContext != null) {
                                List<? extends DBSObject> objs = findProcedures(monitor, procsContainer, nameList.get(0));
    @NotNull
            return Collections.emptyList();
            return findObjectsByPath(mdMonitor, executionContext, objectContainer, transformedNameList, identifierDetector, useAssistant, isGlobalSearch, anyObject);
public class SQLSearchUtils {
                break;
        @NotNull List<String> nameList,
    ) {
            if (!DBStructUtils.isConnectedContainer(child)) {
                                        }
    }
            parent.cacheStructure(monitor, DBSObjectContainer.STRUCT_ENTITIES);
                        }
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedureContainer;
        return getFirstIfPresented(findObjectsByFQN(
                    sc = parentSc;
        if (executionContext == null && dataSource != null) {
                                            return objs;
    public static List<? extends DBSObject> findNestedObjects(
    public static DBSObject findObjectByPath(
                                            return List.of(entity);
        return getFirstIfPresented(
 *     http://www.apache.org/licenses/LICENSE-2.0
            } else {
import org.jkiss.dbeaver.DBException;
        return findObjectsByFQN(monitor, objectContainer, executionContext, nameList, useAssistant, identifierDetector, false, anyObject);
                                structureAssistant.getAutoCompleteObjectTypes(),
        @NotNull DBRProgressMonitor monitor,
                        params.setMaxResults(2);
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    ) {
import java.util.Collections;
            }
    ) {
 * Unless required by applicable law or agreed to in writing, software
        ));
                                        if (objs.size() > 0) {
    private static List<? extends DBSProcedure> findProcedures(
            return null;
    @Nullable

                    // No such object found - may be it's start of table name
    ) {
        boolean useAssistant,
    }
                            DBSObject entity = defaultSchema.getChild(monitor, nameList.get(0));
                    DBSObjectContainer parentSc = DBUtils.getParentAdapter(DBSObjectContainer.class, sc);
 * See the License for the specific language governing permissions and
                }
        @NotNull DBSObjectContainer objectContainer,
                if (childObject.isEmpty()) {
            monitor : new LocalCacheProgressMonitor(monitor);
        @NotNull DBRProgressMonitor monitor,
            // Fix names (convert case or remove quotes)
        @Nullable DBSObjectContainer objectContainer,
        @NotNull DBCExecutionContext executionContext,
    @NotNull
import java.util.ArrayList;
            DBSProcedure child = procsContainer.getProcedure(monitor, procedureName);
    public static List<? extends DBSObject> findObjectsByFQN(
        @Nullable DBCExecutionContext executionContext,

            }
        }
    ) {
        boolean anyObject
                return result;
        @NotNull List<String> nameList,
            }
                                        }
        boolean useAssistant,
    }
                            } else if (anyObject && defaultSchema instanceof DBSProcedureContainer procsContainer) {
        if (list == null || list.isEmpty()) {
                    List<? extends DBSProcedure> matchedProcs = procs.stream().filter(p -> p.getName().equals(procedureName)).toList();
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
            request.getWordDetector(),
        @Nullable DBSObjectContainer objectContainer,
                                }
                    return objs;
        }
                String name = nameList.get(i);
            monitor,
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
    @Nullable
        @NotNull DBSObjectContainer sc,
        }
            findObjectsByPath(monitor, executionContext, objectContainer, nameList, identifierDetector, useAssistant, false, false)
import org.jkiss.dbeaver.model.impl.DBObjectNameCaseTransformer;
                                        DBSObject entity = schema.getChild(monitor, nameList.get(1));
    private static final Log log = Log.getLog(SQLSearchUtils.class);
                return List.of(child);
import org.jkiss.dbeaver.model.runtime.LocalCacheProgressMonitor;
                    if (!nameList.isEmpty()) {
                                    return objs;
                break;
            }
                }
    ) throws DBException {
import java.util.Collection;
        try {
                                identifierDetector.removeQuotes(objectNameMask)
                        if (!tables.isEmpty()) {
        @NotNull SQLIdentifierDetector identifierDetector,
        }
                    name = DBObjectNameCaseTransformer.transformName(objectContainer.getDataSource(), name);
        try {
        boolean anyObject
        @NotNull DBSObjectContainer parent,
    @NotNull
                if (!unquotedName.equals(name)) {
 * limitations under the License.
            while (childObject == null) {
            } else {
    public static List<? extends DBSObject> findObjectsByFQN(
                                    }
            return Collections.emptyList();
        @NotNull DBRProgressMonitor monitor,
                if (useAssistant && !monitor.isForceCacheUsage()) {
            }
            false
            // Find structu containers
                    name = unquotedName;
            log.debug("Error loading procedures for semantic analysis", e);
        } else {
        );
        @NotNull DBRProgressMonitor monitor,
                                    if (childObject instanceof DBSObjectContainer schema) {
                        DBSStructureAssistant.ObjectsSearchParams params = new DBSStructureAssistant.ObjectsSearchParams(
