    protected final ERDElement targetEntity;
            }


                vEntity.addForeignKey((DBVEntityForeignKey) entityAssociation);
 *     http://www.apache.org/licenses/LICENSE-2.0
        association.setTargetEntity(targetEntity);
    protected final ERDElement sourceEntity;
        }

            if (!UIUtils.confirmAction("Delete logical key", "Are you sure you want to delete logical key '" + part.getAssociation().getName() + "'?")) {
            DBVEntity vEntity = DBVUtils.getVirtualEntity(entityAssociation.getParentObject(), false);
public class AssociationDeleteCommand extends Command {
    }
        if (association.getSourceEntity() != null) {
        if (entityAssociation instanceof DBVEntityForeignKey) {
    }
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
    }
    @Override
            sourceEntity = ((EntityPart) part.getSource().getParent()).getEntity();
        }
 *
     * Removes the relationship
        this.part = part;
 * See the License for the specific language governing permissions and
    @Override
        super();
        removeAssociationFromDiagram();
        association.setSourceEntity(sourceEntity);
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
    public void undo() {
        association = part.getAssociation();
import org.jkiss.dbeaver.ui.editors.erd.part.AssociationPart;
            targetEntity = ((EntityPart) part.getTarget().getParent()).getEntity();
            targetEntity = association.getTargetEntity();
    public AssociationDeleteCommand(AssociationPart part) {
        if (entityAssociation instanceof DBVEntityForeignKey) {
 */
    }
        } else {
/**
import org.jkiss.dbeaver.model.virtual.DBVEntityForeignKey;
        targetEntity.removeReferenceAssociation(association, true);
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.model.virtual.DBVEntity;
        }

import org.jkiss.dbeaver.model.erd.ERDAssociation;
            DBVEntity vEntity = DBVUtils.getVirtualEntity(entityAssociation.getParentObject(), false);
        sourceEntity.addAssociation(association, true);
                UIUtils.showMessageBox(UIUtils.getActiveWorkbenchShell(), "No virtual entity", "Can't find association owner virtual entity", SWT.ICON_ERROR);
 * Licensed under the Apache License, Version 2.0 (the "License");
        association.setSourceEntity(null);

            }


    protected void removeAssociationFromDiagram() {
/*
    protected final AssociationPart part;
        DBSEntityAssociation entityAssociation = association.getObject();
        sourceEntity.removeAssociation(association, true);
     */
            }
        part.setSelected(EditPart.SELECTED_NONE);
    /**
            sourceEntity = association.getSourceEntity();
 *
                return;
            return;
 * Command to delete relationship
import org.eclipse.swt.SWT;
     * Restores the relationship
    protected final ERDAssociation association;
package org.jkiss.dbeaver.ui.editors.erd.command;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    /**
     */
 * @author Serge Rider
}
        targetEntity.addReferenceAssociation(association, true);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
 * Unless required by applicable law or agreed to in writing, software
        } else {
            if (vEntity == null) {
        part.activate();

import org.jkiss.dbeaver.ui.editors.erd.part.AttributePart;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
            if (vEntity != null) {
        association.setTargetEntity(null);
import org.eclipse.gef.EditPart;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
        }
 * limitations under the License.
            vEntity.removeForeignKey((DBVEntityForeignKey) entityAssociation);
        if (association.getTargetEntity() == null && part.getTarget() instanceof AttributePart) {
 */
import org.jkiss.dbeaver.model.erd.ERDElement;
                return;
import org.jkiss.dbeaver.model.virtual.DBVUtils;
        if (association.getSourceEntity() == null && part.getSource() instanceof AttributePart) {
 *
    public void execute() {
import org.eclipse.gef.commands.Command;
        DBSEntityAssociation entityAssociation = association.getObject();
