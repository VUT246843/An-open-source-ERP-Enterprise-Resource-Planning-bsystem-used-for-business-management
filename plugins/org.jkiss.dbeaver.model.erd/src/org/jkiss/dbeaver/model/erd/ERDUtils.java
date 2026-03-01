                List<DBSEntity> secondLevelEntities = new ArrayList<>();
 * limitations under the License.
            } else if (id instanceof DBSTableIndex && ((DBSTableIndex) id).isUnique()) {
                monitor.subTask("Read associations");
        }

        return result;
 */

                        }
import org.jkiss.code.Nullable;
                            (showViews && DBUtils.isView(entity1))
    }
                log.warn("Can't load table foreign keys", e);
                        if (associatedEntity != null) {
            diagram.getContentProvider().fillEntityFromObject(monitor, diagram, otherEntities, erdEntity);
                    objectContainer.cacheStructure(
                uniqueId = id;
import org.jkiss.dbeaver.DBException;
        ERDEntity erdEntity = new ERDEntity(entity);
            }

    public static Collection<? extends DBSEntityAttribute> getBestTableIdentifier(@NotNull DBRProgressMonitor monitor, @NotNull DBSEntity entity)
                            continue;
                            entity1.getEntityType() == DBSEntityType.VIRTUAL_ENTITY ||
            monitor.done();
 * You may obtain a copy of the License at
                        {
                }
                    }
            try {
        // Cache structure
            if (id instanceof DBSEntityReferrer && id.getConstraintType() == DBSEntityConstraintType.PRIMARY_KEY) {
        return !showSystemObjects && entity instanceof DBPSystemObject && ((DBPSystemObject) entity).isSystem();
            }
                for (DBSEntity entity : result) {
        }
 *
            return Collections.emptyList();
            }
                        if (entity1.getEntityType() == DBSEntityType.TABLE ||
        //DBSEntityConstraint uniqueIndex = null;
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
        }
 * See the License for the specific language governing permissions and
                result.addAll(secondLevelEntities);

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;

                        }
                            | DBSObjectContainer.STRUCT_ATTRIBUTES));
                log.debug(e);
            } else if (id.getConstraintType().isUnique()) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    }
                            return DBUtils.getEntityAttributes(monitor, index);
    }
            return null;
            monitor.worked(1);
                Class<? extends DBSObject> childType = objectContainer.getPrimaryChildType(monitor);
        if (CommonUtils.isEmpty(entity.getAttributes(monitor))) {
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            DBSEntity rootTable = (DBSEntity) root;
        try {


        } else if (root instanceof DBSEntity) {
            for (ERDObject<T> erdObject : erdObjects) {
import java.util.*;
/*
            } catch (DBException e) {
import org.jkiss.dbeaver.Log;
                        Collection<? extends DBSEntityAssociation> fks = entity.getAssociations(monitor);
    public static boolean isOptionalAssociation(ERDAssociation association) {
                monitor.worked(1);
            if (entities != null) {
                }
import org.jkiss.dbeaver.model.DBPSystemObject;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
                        monitor,
            try {
        }
                if (!CommonUtils.isEmpty(indexes)) {
        if (entity instanceof DBSTable) {
        }
                                if (association.getConstraintType() != DBSEntityConstraintType.INHERITANCE) {
            return Collections.emptyList();
            Collection<? extends DBSEntityAssociation> refs = DBVUtils.getAllReferences(monitor, rootTable);
            return false;
                                    secondLevelEntities.add(association.getAssociatedEntity());
            }
        if (!showPartitions) {
    }
                uniqueId = id;

    }
        if (association.isLogical()) {
                            )
                        }
            monitor.beginTask("Load '" + root.getName() + "' relations", 3);
        }
        boolean showPartitions) throws DBException
        return Collections.emptyList();

        }
        }
                result.add(erdObject.getObject());
                            continue;
                        final DBSEntity entity1 = (DBSEntity) entity;
    public static boolean skipSystemEntity(DBSEntity entity) {
    public static Collection<DBSEntity> collectDatabaseTables(
                if (fks != null) {
        for (ERDEntity diagramEntity : diagram.getEntities()) {


        boolean showSystemObjects = entity.getDataSource().getContainer().getNavigatorSettings().isShowSystemObjects();
            try {

    public static <T> List<T> getObjectsFromERD(List<? extends ERDObject<T>> erdObjects) {
        erdEntity.setUserData(userData);
     *
                        if (fks != null) {
            return DBUtils.isIdentifyingAssociation(new VoidProgressMonitor(), association.getObject());
            if (monitor.isCanceled()) {
        } catch (DBException e) {

                            }
import org.jkiss.dbeaver.model.exec.DBExecUtils;
                            result.add(DBVUtils.getRealEntity(monitor, associatedEntity));
        } catch (DBException e) {

                    }
                log.warn("Can't load table references", e);
                        }
package org.jkiss.dbeaver.model.erd;
                return result;
            }
                            result.add(entity1);
        if (root instanceof DBSObjectContainer objectContainer) {

                Collection<? extends DBSEntityAssociation> fks = DBVUtils.getAllAssociations(monitor, rootTable);
            result.removeIf(entity -> entity instanceof DBSTablePartition);
            }
            return DBUtils.isOptionalAssociation(new VoidProgressMonitor(), association.getObject());
            result.remove(diagramEntity.getObject());
        }

        for (ERDEntityAttribute erdAttr : entity.getAttributes()) {
                        if (skipSystemEntity(entity1)) {
     * @return - existing attribute or null
        throws DBException {
                result.add(ref.getParentObject());
        DBSEntityConstraint uniqueId = null;
    }
            if (erdAttr.getObject().getName().equals(attr.getName())) {
                monitor.subTask("Read foreign keys");
            } catch (DBException e) {
            return DBUtils.getEntityAttributes(monitor, (DBSEntityReferrer) uniqueId);
                monitor.worked(1);
            return false;
        }
                        }
            }
            try {
    }
import org.jkiss.dbeaver.model.struct.rdb.DBSTablePartition;
            monitor.beginTask("Load '" + root.getName() + "' content", 3);
public class ERDUtils
                        }
        if (entity == null) {
                    if (entity instanceof DBSEntity) {
        // Remove entities already loaded in the diagram
import org.jkiss.dbeaver.model.virtual.DBVUtils;
        }
                                }
        }
     */

                        DBSEntity associatedEntity = fk.getAssociatedEntity();

            monitor.done();
{
        if (uniqueId instanceof DBSEntityReferrer) {
                        DBSObjectContainer.STRUCT_ENTITIES

            log.debug(e);
        }
            Collection<? extends DBSObject> entities = objectContainer.getChildren(monitor);
        // Check indexes
                    for (DBSTableIndex index : indexes) {
                    for (DBSEntityAssociation fk : fks) {
        for (DBSEntityConstraint id : CommonUtils.safeCollection(entity.getConstraints(monitor))) {
    public static boolean isIdentifyingAssociation(ERDAssociation association) {
        Set<DBSEntity> result = new LinkedHashSet<>();
    @Nullable
                            for (DBSEntityAssociation association : fks) {
            if (monitor.isCanceled()) {

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        boolean showViews,
        List<T> result = null;
}
            result = new ArrayList<>();
                DBWorkbench.getPlatformUI().showError("Cache database model", "Error caching database model", e);
 * Licensed under the Apache License, Version 2.0 (the "License");
            return false;
        ERDDiagram diagram,
                        if (objectFilter != null && objectFilter.isEnabled() && !objectFilter.matches(entity.getName())) {
    @NotNull
            }
            for (DBSEntityAssociation ref : refs) {


            return null;
        if (erdObjects != null) {
        DBSObject root,
    }
            log.debug(e);
     * The method designed to find attributes by name comparison for one entity
                }
        return erdEntity;
import org.jkiss.dbeaver.model.exec.DBCException;
     * @param attr - attribute 
                return erdAttr;
    {
                }
import org.jkiss.dbeaver.model.DBUtils;
        return null;
    public static ERDEntityAttribute getAttributeByModel(ERDEntity entity, DBSEntityAttribute attr) {
            }
        DBRProgressMonitor monitor,
            result.add(rootTable);
        try {
            monitor.subTask("Read references");
 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
        return result;
     * @param entity - database entity (table)

            } catch (DBException e) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
                DBExecUtils.tryExecuteRecover(monitor, objectContainer.getDataSource(), param ->
        }
            log.error("Can't create ERD entity from database entity " + entity, e);
                    }
                return result;
        try {
import org.jkiss.dbeaver.model.struct.*;
            }
 *
import org.jkiss.code.NotNull;
                DBSObjectFilter objectFilter = objectContainer.getDataSource().getContainer().getObjectFilter(childType, objectContainer, true);
            } catch (DBException e) {
    }
                    if (entity != rootTable && entity.getEntityType() == DBSEntityType.ASSOCIATION) {
                return DBUtils.getEntityAttributes(monitor, (DBSEntityReferrer) id);
    public static ERDEntity makeEntityFromObject(DBRProgressMonitor monitor, ERDDiagram diagram, List<ERDEntity> otherEntities, DBSEntity entity, Object userData) {

                        // Read all association's associations
                Collection<? extends DBSTableIndex> indexes = ((DBSTable) entity).getIndexes(monitor);
                            entity1.getEntityType() == DBSEntityType.CLASS ||
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
        if (entity instanceof DBSTable && ((DBSTable) entity).isView()) {
        // Find PK or unique key
            }
        } catch (DBCException e) {

    private static final Log log = Log.getLog(ERDUtils.class);
                        if (DBUtils.isIdentifierIndex(monitor, index)) {
    /**
                for (DBSObject entity : entities) {
                            | DBSObjectContainer.STRUCT_ASSOCIATIONS
