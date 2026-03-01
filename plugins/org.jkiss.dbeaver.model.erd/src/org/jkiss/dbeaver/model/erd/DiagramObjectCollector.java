                    continue;
 * you may not use this file except in compliance with the License.
                    continue;

                continue;
        try {
import org.jkiss.code.NotNull;
                }
    private boolean showPartitions;
                collector.generateDiagramObjects(monitor1, roots, settings));
                StringJoiner joiner = new StringJoiner(", ");
        Set<DBSEntity> tables,
        boolean forceShowViews)

    public DiagramObjectCollector(ERDDiagram diagram)
                if (monitor.isCanceled()) {
        DiagramCollectSettings settings,

                }
import org.jkiss.dbeaver.model.DBPNamedObject;
    }
        Set<DBSEntity> tables = new LinkedHashSet<>();
}
    }
        boolean showPartitions = settings.isShowPartitions();
            }
                try {
        @NotNull DBPProject diagramProject,
        container.cacheStructure(monitor, DBSObjectContainer.STRUCT_ALL);
        @NotNull ERDDiagram diagram,
                }
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
                monitor.subTask("Connect to '" + object.getName() + "'");



        throws DBException
 * See the License for the specific language governing permissions and
                if (objectFilter != null && !objectFilter.matches(entity.getName())) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        } finally {
        }
public class DiagramObjectCollector {
import org.jkiss.dbeaver.Log;
                root = ((DBSAlias) root).getTargetObject(monitor);
    public static List<ERDEntity> generateEntityList(
 */
        collector.setShowViews(forceShowViews);

        }
        boolean showViews = settings.isShowViews();
            }
                .filter(r -> r.getDataSource().getContainer().getProject() != diagramProject)
            }
        // Add new relations
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
            Map<DBPProject, List<DBSObject>> foreignObjectsPerProject = roots.stream()
        }
package org.jkiss.dbeaver.model.erd;
        if (erdEntity != null) {
            }
                    if ((entity instanceof DBSTablePartition && !showPartitions) || (DBUtils.isView(entity1) && !showViews)) {
        }
            }
        DBSObjectContainer container,


import org.jkiss.dbeaver.model.DBPDataSourceContainer;
                return true;
 * DBeaver - Universal Database Manager
            if (CommonUtils.equalObjects(entity.getAlias(), alias)) {

            DBSObjectFilter objectFilter = container.getDataSource().getContainer().getObjectFilter(childType, container, true);
        return tables;
        for (DBSEntity table : tables) {

                    }
        DiagramCollectSettings settings,

            if (monitor.isCanceled()) {
    public static Collection<DBSEntity> collectTables(
                }

                    log.debug(e);
 * You may obtain a copy of the License at
    private static void collectTables(
                    continue;
        return false;
                if ((root instanceof DBSTablePartition && !showPartitions) || (DBUtils.isView((DBSEntity) root) && !(showViews || forceShowViews))) {
        ERDEntity erdEntity = ERDUtils.makeEntityFromObject(monitor, diagram, erdEntities, table, null);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        boolean enforceSameProject
        DBRProgressMonitor monitor,
    private final List<ERDEntity> erdEntities = new ArrayList<>();
                if (entity instanceof DBSEntity) {
import org.jkiss.dbeaver.model.app.DBPProject;
            if (root instanceof DBSFolder) {
        monitor.beginTask("Collect diagram objects", 1);
    }
        Collection<? extends DBSObject> roots,
                        + "' (current project is '" + diagramProject.getName() + "')");
    private static final Log log = Log.getLog(DiagramObjectCollector.class);
            }
        }
            return;
                    break;
        boolean showViews,
            root = DBUtils.getPublicObject(root);
            addDiagramEntity(monitor, table);
        boolean forceShowViews,
import java.util.stream.Collectors;
        @NotNull DBRProgressMonitor monitor,
        return erdEntities;
/*

import org.jkiss.dbeaver.model.DBPEvaluationContext;
    ) {
    }
    {
        DBRProgressMonitor monitor,
 * limitations under the License.
import org.jkiss.dbeaver.model.DBUtils;
import org.jkiss.dbeaver.DBException;
        for (ERDEntity entity : erdEntities) {
            log.error(e);
        }
                break;

 */
        if (diagram.containsTable(table) && !diagram.getContentProvider().allowEntityDuplicates()) {
        DBRProgressMonitor monitor,
            if (root instanceof DBSAlias) {
        boolean forceShowViews)
            return;
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                    collectTables(monitor, (DBSObjectContainer) entity, tables, showViews, showPartitions);
                for (DBSObject value : values) {
            erdEntities.add(erdEntity);
 * Licensed under the Apache License, Version 2.0 (the "License");
                    diagram.addErrorMessage("Can't connect to '" + object.getName() + "': " + e.getMessage());
                } else if (entity instanceof DBSObjectContainer) {
        @NotNull DiagramCollectSettings settings,

    private final ERDDiagram diagram;

        Collection<? extends DBSObject> roots,
 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (Exception e) {
                DBPProject project = entry.getKey();
                // Skip hidden tables

    }
    {
            DBExecUtils.tryExecuteRecover(monitor, roots.getFirst().getDataSource(), monitor1 ->
 *

            for (var entry : foreignObjectsPerProject.entrySet()) {
    public void setShowViews(boolean showViews) {
            return Collections.emptyList();
        if (monitor.isCanceled()) {
                List<DBSObject> values = entry.getValue();
    {
        for (DBSObject root : roots) {
        final List<DBSObject> roots = new ArrayList<>();

        this.diagram = diagram;
            if (object instanceof DBPDataSourceContainer && !((DBPDataSourceContainer) object).isConnected()) {
                    ((DBPDataSourceContainer) object).connect(monitor, true, true);
        Collection<DBSEntity> tables = collectTables(monitor, roots, settings, showViews);
    {
            erdEntity.addModelRelations(monitor, diagram, true, false);
    {
    public List<ERDEntity> getDiagramEntities()
        if (roots.isEmpty()) {
        }
            monitor.done();
        }
        final Collection<? extends DBSObject> children = container.getChildren(monitor);
        }
        }
                continue;
        for (DBPNamedObject object : objects) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                tables.add((DBSEntity) root);
    }
    {
        }
        throws DBException
        throws DBException
        if (!CommonUtils.isEmpty(children)) {
        }
                } catch (DBException e) {

        DBRProgressMonitor monitor,
            for (DBSObject entity : children) {
        Set<DBSEntity> tables,
                    joiner.add("'" + DBUtils.getObjectFullName(value, DBPEvaluationContext.UI) + "'");
    private boolean aliasExist(String alias) {
    private boolean showViews;

            // Avoid duplicates
    private static void collectTables(
                roots.removeAll(values);
        boolean showPartitions)
 * Table collector
            Class<? extends DBSObject> childType = container.getPrimaryChildType(monitor);
                    DBSEntity entity1 = (DBSEntity) entity;
                    tables.add(entity1);
        if (enforceSameProject) {
    }
        DiagramCollectSettings settings)
        try {
            }
                    if (ERDUtils.skipSystemEntity(entity1)) {
            if (!(object instanceof DBSObject)) {
        Collection<? extends DBSObject> roots,
    {
        }
                        continue;
                collectTables(monitor, (DBSObjectContainer) root, tables, showViews, showPartitions);
import org.jkiss.dbeaver.model.struct.*;
        this.showViews = showViews;
            }
                }
                collectTables(monitor, ((DBSFolder) root).getChildrenObjects(monitor), tables, settings, false);


            if (DBUtils.isHiddenObject(table)) {
                }
    }
    }
                    }
        for (ERDEntity erdEntity : erdEntities) {
        throws DBException
 *
            } else if (root instanceof DBSEntity) {
                    "Can't add object" + (values.size() > 1 ? "s" : "") + " " + joiner + " from a different project '" + project.getName()
    public void generateDiagramObjects(
                diagram.addErrorMessage(
    }
            return collector.getDiagramEntities();
    @NotNull
                        continue;
        collectTables(monitor, roots, tables, settings, forceShowViews);
        @NotNull Collection<DBPNamedObject> objects,
 *
import org.jkiss.utils.CommonUtils;
import java.util.*;
            if (root instanceof DBSObjectContainer) {
            roots.add((DBSObject) object);

        DiagramObjectCollector collector = new DiagramObjectCollector(diagram);
/**
    private void addDiagramEntity(DBRProgressMonitor monitor, DBSEntity table)
                .collect(Collectors.groupingBy(r -> r.getDataSource().getContainer().getProject()));
