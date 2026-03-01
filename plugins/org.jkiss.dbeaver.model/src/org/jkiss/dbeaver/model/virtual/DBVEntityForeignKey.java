
/**
                throw new DBException("Can't find constraint " + refConstraintId + " in entity " + refEntityId);
    }
        DBSEntity refEntity = constraint.getParentObject();
        return entity;
    public String getName() {
    public boolean isPersisted() {
 * DBeaver - Universal Database Manager
            return;
import org.jkiss.dbeaver.model.app.DBPProject;

        this.refConstraintId = constraint.getName();
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;

import org.jkiss.dbeaver.model.DBUtils;
            throw new DBException("Ref entity ID not set for virtual FK " + getName());
    @NotNull
    @Nullable
        DBVModel.addToCache(this);
        return refEntityId;
        if (project == null) {
    public String toString() {
    }
    public void setRefEntityId(String refEntityId) {
    public DBSEntity getAssociatedEntity() {

        this.refEntityId = refEntityId;
        if (copyDS != null && copyDS == copy.getParentObject().getDataSourceContainer()) {
    @Override
            throw new DBException("Can't find reference node " + refEntityId + " for virtual foreign key");
 *
 *
import org.jkiss.code.NotNull;
    public DBSEntityConstraint getRealReferenceConstraint(@NotNull DBRProgressMonitor monitor) throws DBException {
 * Virtual foreign key
    @NotNull
 * See the License for the specific language governing permissions and
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        DBNDatabaseNode refNode = navigatorModel.getNodeByObject(monitor, refEntity, true);
        DBPProject project = getParentObject().getProject();
        if (refEntityId != null) {

            throw new DBException("Object " + refEntityId + " is not an entity");
        return refC == null ? null : refC.getParentObject();
            return null;
import org.jkiss.code.Nullable;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
    }
        }
    @Override
 * You may obtain a copy of the License at
            log.warn("Can't find navigator node for object " + DBUtils.getObjectFullId(refEntity));
        // refEntityId may refer to the current (old model owner) datasource
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

    @Override
    private String refConstraintId;
import org.jkiss.dbeaver.model.struct.rdb.DBSForeignKeyModifyRule;

    public DBSEntityConstraint getReferencedConstraint() {
    }
        DBPDataSourceContainer copyDS = copy.getAssociatedDataSource();
    @Override
        return attributes;


        return getReferencedConstraint(monitor).getParentObject();
    public DBSEntity getAssociatedEntity(@NotNull DBRProgressMonitor monitor) throws DBException {
        }
    @NotNull
    }
        }
    public DBSEntityConstraint getReferencedConstraint(@NotNull DBRProgressMonitor monitor) throws DBException {
        } else {
        }
    }
        }
    public List<DBVEntityForeignKeyColumn> getAttributes() {
 * you may not use this file except in compliance with the License.
    }
        if (refNode == null) {
        } catch (DBException e) {
            log.warn("Null navigator model in project " + project.getId());
    }
    @NotNull
    }
        }
    }
            }
    @Override
/*
            log.warn("Null ref entity");
        return true;
    public synchronized void setAttributes(List<DBVEntityForeignKeyColumn> attrs) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return refConstraintId;
            DBVModel.removeFromCache(this);
    private static final Log log = Log.getLog(DBVEntityForeignKey.class);
        if (refEntityId == null) {
    @NotNull

    public DBSEntityConstraintType getConstraintType() {
            "->" + refEntityId + "." + refConstraintId + " (" + attributes + ")";

    @Override

                this.refEntityId = copy.refEntityId.replace(copyDS.getId(), newDS.getId());

    void dispose() {
        }
    public String getDescription() {
    @Override
        try {
            throw new DBException("Null navigator model");
import org.jkiss.dbeaver.model.struct.rdb.DBSTableForeignKey;
        return entity.getDataSource();
    private final List<DBVEntityForeignKeyColumn> attributes = new ArrayList<>();
        if (refEntityId != null) {
    }
    }

        if (object instanceof DBSEntity e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (navigatorModel == null) {
            refEntity = dbvEntity.getRealEntity(monitor);
        }
        if (refEntity instanceof DBVEntity dbvEntity) {
}
        DBNModel navModel = project == null ? null : project.getNavigatorModel();
import org.jkiss.dbeaver.Log;

        return DBSForeignKeyModifyRule.NO_ACTION;
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            refEntityId = null;
        if (refEntityId == null) {
        DBNNode refNode = navigatorModel.getNodeByPath(monitor, refEntityId);

    }
    }
        DBSObject object = ((DBNDatabaseNode) refNode).getObject();
        return dsNode == null ? null : dsNode.getDataSourceContainer();
    public String getRefConstraintId() {
        attributes.clear();
 * limitations under the License.
        DBNModel navigatorModel = project.getNavigatorModel();
        this.refConstraintId = refConsId;
    public DBSForeignKeyModifyRule getUpdateRule() {

    @NotNull
    @NotNull
    @Override
            return;

import java.util.List;
 * Unless required by applicable law or agreed to in writing, software
        }


            return getRealReferenceConstraint(new VoidProgressMonitor());
    @Nullable
    public String getRefEntityId() {

        if (refEntityId != null) {
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public DBVEntity getParentObject() {

            DBVModel.removeFromCache(this);
        this.refEntityId = refNode.getNodeUri();
        }
        DBPProject project = getParentObject().getProject();
    @NotNull
    public DBVEntityForeignKey(@NotNull DBVEntity entity) {
public class DBVEntityForeignKey implements DBSEntityConstraint, DBSEntityAssociationLazy, DBSEntityReferrer, DBSTableForeignKey {
    public DBPDataSource getDataSource() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

            return;
    }

            //log.error(e);
    // Copy constructor
        if (refEntityId != null) {
    }
            return refEntityConstraint;
    @NotNull
            return;

            DBVModel.addToCache(this);



        if (navigatorModel == null) {
        return null;
        }
    private final DBVEntity entity;
        this.refEntityId = copy.refEntityId;
            this.attributes.add(new DBVEntityForeignKeyColumn(this, fkc));
    public DBSForeignKeyModifyRule getDeleteRule() {
    @Override

        return entity;
    public synchronized void setReferencedConstraint(String refEntityId, String refConsId) {
    }

    @NotNull
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.struct.*;
    public DBVEntity getEntity() {
            DBSEntityConstraint refEntityConstraint = DBUtils.findObject(constraints, refConstraintId);
        }
        DBNDataSource dsNode = navModel == null ? null : navModel.getDataSourceByPath(project, refEntityId);
        }
        this.refEntityId = refEntityId;
        if (refEntity == null) {

        return attributes;
    @Override
            DBVModel.addToCache(this);
        attributes.addAll(attrs);
    }

        // Here is a tricky part

    }
        if (!(refNode instanceof DBNDatabaseNode)) {
        return DBSForeignKeyModifyRule.NO_ACTION;
        return getConstraintType().getId() + "_" + entity.getName() + "_" + (refEntityId == null ? "?" : DBNUtils.getLastNodePathSegment(refEntityId));
            log.warn("Null project in " + getParentObject());
    DBVEntityForeignKey(@NotNull DBVEntity entity, DBVEntityForeignKey copy, DBVModel targetModel) {
    private String refEntityId;
import org.jkiss.dbeaver.model.DBPDataSource;
        // In this case we must fix it and refer to the new model owner.

            if (refEntityConstraint == null) {
            refConstraintId = null;
    public synchronized void setReferencedConstraint(DBRProgressMonitor monitor, DBSEntityConstraint constraint) throws DBException {
            List<DBSEntityConstraint> constraints = DBVUtils.getAllConstraints(monitor, e);
            if (newDS != null) {
        }
        }
    }
    }
 */
    }
        return DBSEntityConstraintType.VIRTUAL_FOREIGN_KEY;
    @Override
            }
    @Override
    }
import org.jkiss.dbeaver.model.navigator.*;
    @Override
    public DBPDataSourceContainer getAssociatedDataSource() {
    @Nullable
            DBPDataSourceContainer newDS = targetModel.getDataSourceContainer();
    }
    @Nullable
        return getRealReferenceConstraint(monitor);
    public List<DBVEntityForeignKeyColumn> getAttributeReferences(@Nullable DBRProgressMonitor monitor) throws DBException {


        this.entity = entity;
 *
        this.refConstraintId = copy.refConstraintId;
        if (this.refEntityId != null) {
            DBVModel.removeFromCache(this);
 */
package org.jkiss.dbeaver.model.virtual;
    }
            return null;
        for (DBVEntityForeignKeyColumn fkc : copy.attributes) {
        DBNModel navigatorModel = DBNUtils.getNavigatorModel(entity);
        this.entity = entity;
        DBSEntityConstraint refC = getReferencedConstraint();
        }
        }
        return "VFK: " + entity.getFullyQualifiedName(DBPEvaluationContext.UI) +
import java.util.ArrayList;
