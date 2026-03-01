 */
            }
            DBVUtils.isIdentifyingAttributes(monitor, targetAttrs);
    }
    }



            return false;
import org.jkiss.dbeaver.Log;
    public ERDElement<?> getSourceEntity() {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import java.util.Collections;


            if (currentRelationship.getSourceEntity().equals(sourceEntity)) {
                return true;
        this.editor = editor;
        this.sourceAttributes = Collections.singletonList(sourceAttribute);
    protected List<ERDEntityAttribute> sourceAttributes;


    }
    public void setAttributes(ERDEntityAttribute sourceAttribute, ERDEntityAttribute targetAttribute) {
public class AssociationCreateCommand extends Command {
        }
            targetEntity.removeReferenceAssociation(association, true);

                log.error("Error reading constraints", e);
            List<DBSEntityAttribute> refAttrs = ERDUtils.getObjectsFromERD(targetAttributes);
    @Override



            try {
    }
    }
import org.jkiss.dbeaver.model.virtual.DBVEntity;
/*

                association = new ERDAssociation(sourceEntity, targetEntity, true);
            }
        if (association != null) {
import org.jkiss.utils.CommonUtils;
            vEntity.persistConfiguration();
    public void setEditor(ERDEditorPart editor) {
    }
    public void redo() {
            }
        }
    protected boolean needToSwapForeignKeyDirection(DBRProgressMonitor monitor, List<DBSEntityAttribute> srcAttrs, List<DBSEntityAttribute> targetAttrs) throws DBException {
    }
 *
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
        this.association = association;
 *     http://www.apache.org/licenses/LICENSE-2.0
            DBSEntity srcEntityObject = ((ERDEntity)sourceEntity).getObject();

                    EditForeignKeyPage.FK_TYPE_LOGICAL
import org.jkiss.dbeaver.model.virtual.DBVUtils;
        association.resolveAttributes();
    @Override
            }
                if (needToSwapForeignKeyDirection(new VoidProgressMonitor(), srcAttrs, refAttrs)) {

    public void undo() {

        return targetEntity;
                    refAttrs = srcAttrs;
    }
    }
        } else {
            !CommonUtils.isEmpty(targetAttrs) &&
 * Unless required by applicable law or agreed to in writing, software
                    srcEntityObject = tmpEntity;
            if (vfk == null) {
        if (sourceEntity.equals(targetEntity)) {
        ERDAssociation association = null;
            sourceEntity.addAssociation(association, true);
                return !isAssociationExists();
    public void setAttributes(List<ERDEntityAttribute> sourceAttributes, List<ERDEntityAttribute> targetAttributes) {

        this.targetEntity = targetEntity;

            if (targetEntity == null) {
        return association;
        } else {
                    targetEntityObject = srcEntityObject;
        return editor;
    public ERDAssociation getAssociation() {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

            assert vEntity != null;
/**
package org.jkiss.dbeaver.ui.editors.erd.command;
    }
                // Maybe we need to swap source and target
    }
    public ERDEntityAttribute getTargetAttribute() {
import org.jkiss.dbeaver.model.struct.DBSEntity;
import java.util.List;
                    List<DBSEntityAttribute> tmpAttrs = refAttrs;
            DBSEntity targetEntityObject = ((ERDEntity)targetEntity).getObject();
                srcAttrs,
        return association;

            }
    }
            } catch (DBException e) {
        if (association != null) {

            DBVEntity vEntity = DBVUtils.getVirtualEntity(srcEntityObject, true);

        association = createAssociation(sourceEntity, targetEntity, true);
                // Ref table must have a unique constraint with ref attributes
import org.eclipse.gef.commands.Command;
    }
import org.jkiss.dbeaver.model.erd.*;
    }
    public ERDElement<?> getTargetEntity() {
    protected ERDElement<?> sourceEntity;
                return null;
        List<ERDAssociation> relationships = targetEntity.getReferences();
            targetEntity.addReferenceAssociation(association, true);
import org.jkiss.dbeaver.ui.editors.object.struct.EditForeignKeyPage;
            } else {
        }
            }
        return !CommonUtils.isEmpty(srcAttrs) &&
        for (ERDAssociation currentRelationship : relationships) {
                },
    protected List<ERDEntityAttribute> targetAttributes;
                association = new ERDAssociation(vfk, (ERDEntity) sourceEntity, (ERDEntity) targetEntity, true);

        if (sourceEntity instanceof ERDEntity && targetEntity instanceof ERDEntity) {
    protected ERDAssociation createAssociation(ERDElement<?> sourceEntity, ERDElement<?> targetEntity, boolean reflect) {
            sourceEntity.removeAssociation(association, true);
}
                }

    public void setSourceEntity(ERDElement<?> sourceEntity) {
 * DBeaver - Universal Database Manager
        return CommonUtils.isEmpty(sourceAttributes) ? null : sourceAttributes.get(0);
    }
        return sourceEntity;
    public ERDEditorPart getEditor() {
    public boolean canExecute() {
    private static final Log log = Log.getLog(AssociationCreateCommand.class);
                    srcAttrs = tmpAttrs;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
        // Check for existence of relationship already


    @Override
 *
 */
    }
    }
            !DBVUtils.isIdentifyingAttributes(monitor, srcAttrs) &&
        return false;
 * limitations under the License.
import org.jkiss.dbeaver.DBException;
            List<DBSEntityAttribute> srcAttrs = ERDUtils.getObjectsFromERD(sourceAttributes);
                return false;
import org.jkiss.dbeaver.model.struct.DBSEntityAttribute;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.sourceAttributes = sourceAttributes;

        this.targetAttributes = targetAttributes;
            DBVEntityForeignKey vfk = EditForeignKeyPage.createVirtualForeignKey(
 * Command to create association
    public void setAssociation(ERDAssociation association) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    private ERDEditorPart editor;
    public ERDEntityAttribute getSourceAttribute() {
                new EditForeignKeyPage.FKType[] {
            if (sourceEntity != null && targetEntity != null) {
    public void execute() {
                vEntity,

 * you may not use this file except in compliance with the License.
    public AssociationCreateCommand() {
import org.jkiss.dbeaver.model.virtual.DBVEntityForeignKey;

        }
    }
        this.targetAttributes = Collections.singletonList(targetAttribute);

        this.sourceEntity = sourceEntity;
    protected boolean isAssociationExists() {
    public void setTargetEntity(ERDElement<?> targetEntity) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 *
    @Override
        }

    }
                refAttrs);


                    DBSEntity tmpEntity = targetEntityObject;
                targetEntityObject,
 * You may obtain a copy of the License at
            if (sourceEntity != null && targetEntity != null) {
    protected ERDAssociation association;
        return CommonUtils.isEmpty(targetAttributes) ? null : targetAttributes.get(0);
    protected ERDElement<?> targetEntity;
