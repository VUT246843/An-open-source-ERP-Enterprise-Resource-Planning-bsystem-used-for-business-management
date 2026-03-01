 *
    }
    public ERDEntity getEntity() {
        index = diagramPart.getDiagram().getEntities().indexOf(entity);
    }
    private void restoreRelationships() {
    /**

 * limitations under the License.
}
    private List<ERDAssociation> foreignKeyRelationships = new ArrayList<>();
package org.jkiss.dbeaver.ui.editors.erd.command;
        // Delete entity
    @Override
    private int index = -1;
        return entity;
        //entityPart.modifyBounds(new Rectangle(0, 0, 0, 0));
        foreignKeyRelationships.clear();
            r.getSourceEntity().addAssociation(r, true);
     */

        deleteRelationships(entity);
     */


    public void undo() {
        diagramPart.getDiagram().getVisualInfo(entity.getObject(), true).initBounds = entityPart.getBounds();
        for (ERDAssociation r : foreignKeyRelationships) {
    public void redo() {

            t.removeReferenceAssociation(r, true);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private List<ERDAssociation> primaryKeyRelationships = new ArrayList<>();

        }
    private DiagramPart diagramPart;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software

        for (ERDAssociation association : foreignKeyRelationships) {
    }
        this.entity = entityPart.getEntity();
 * @author Serge Rider
 */
        //for all relationships where current entity is foreign key
import org.eclipse.gef.commands.Command;
        this.foreignKeyRelationships.addAll(t.getAssociations());
/**

    }
        }
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
 *

    public EntityPart getEntityPart() {
    }
/*
 * DBeaver - Universal Database Manager
    }

 */
    /**
    @Override
        diagramPart.getDiagram().removeEntity(entity, true);

    /**
     * Invokes the execution of this command.
    }
        this.primaryKeyRelationships.addAll(t.getReferences());
        //this.bounds = entityPart.getFigure().getBounds().getCopy();
import org.jkiss.dbeaver.model.erd.ERDAssociation;
    //private Rectangle bounds;
    }
        for (ERDAssociation r : primaryKeyRelationships) {
        }
        // Put entity's bound in init map - it could be used by EntityPart on undo
        diagramPart.getDiagram().addEntity(entity, index, true);
            r.getSourceEntity().addAssociation(r, true);
public class EntityRemoveCommand extends Command {
        primExecute();
        for (ERDAssociation r : primaryKeyRelationships) {
    private EntityPart entityPart;
            r.getTargetEntity().addReferenceAssociation(r, true);
    @Override
        // Zero bounds - to let modifyBounds reflect on undo
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
        restoreRelationships();

            association.getTargetEntity().removeReferenceAssociation(association, true);
import java.util.List;
            r.getSourceEntity().removeAssociation(r, true);
        this.diagramPart = entityPart.getDiagramPart();
    private void deleteRelationships(ERDEntity t) {

    }
 *
    public void execute() {
        //for all relationships where current entity is primary key
    private void primExecute() {

 * distributed under the License is distributed on an "AS IS" BASIS,
        primExecute();
     */



import java.util.ArrayList;
 * Command to delete tables from the schema
        return entityPart;
import org.jkiss.dbeaver.model.erd.ERDEntity;
        primaryKeyRelationships.clear();
     * @see org.eclipse.gef.commands.Command#execute()
    public EntityRemoveCommand(EntityPart entityPart) {
 *
            r.getTargetEntity().addReferenceAssociation(r, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        }
        this.entityPart = entityPart;
    private ERDEntity entity;
 *     http://www.apache.org/licenses/LICENSE-2.0
            t.removeAssociation(association, true);
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
     * @see org.eclipse.gef.commands.Command#redo()


