        sourceEntity = relationship.getSourceEntity();
        oldTargetEntity = relationship.getTargetEntity();
        if (targetEntity != null) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.erd.ERDAssociation;
    }
    public void setRelationship(ERDAssociation relationship) {


 *

        return returnVal;
    public void undo() {
 * you may not use this file except in compliance with the License.

            returnVal = false;

 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
    public void setTargetEntity(ERDElement targetEntity) {
 *
import org.jkiss.dbeaver.model.erd.ERDElement;
    }
        targetEntity.removeReferenceAssociation(relationship, true);
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
    public boolean canExecute() {
 * Unless required by applicable law or agreed to in writing, software
    @Override
            for (ERDAssociation relationship : relationships) {

        relationship.setTargetEntity(oldTargetEntity);
    @Override
    public void execute() {
        this.relationship = relationship;
 * key
        boolean returnVal = true;
            relationship.setTargetEntity(targetEntity);
            targetEntity.addReferenceAssociation(relationship, true);
            }
}                    && relationship.getTargetEntity().equals(targetEntity)) {
 * limitations under the License.
public class AssociationReconnectTargetCommand extends Command {
    @Override
/*

package org.jkiss.dbeaver.ui.editors.erd.command;
    }
            List<ERDAssociation> relationships = targetEntity.getReferences();
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Command to change the primary key we are connecting to a particular foreign key
        }
 *
import java.util.List;
        }
     * Makes sure that foreign key doesn't reconnect to itself or try to create

        if (foreignKeyEntity.equals(targetEntity)) {
                    returnVal = false;
    protected ERDAssociation relationship;
        this.targetEntity = targetEntity;
                    break;

 */
    /**


     */
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
    protected ERDElement targetEntity;
        oldTargetEntity.addReferenceAssociation(relationship, true);
            oldTargetEntity.removeReferenceAssociation(relationship, true);
                }
import org.eclipse.gef.commands.Command;
     * a relationship which already exists


    }
                if (relationship.getSourceEntity().equals(sourceEntity)
        ERDElement foreignKeyEntity = relationship.getSourceEntity();
    protected ERDElement oldTargetEntity;

 * You may obtain a copy of the License at
        } else {

    protected ERDElement sourceEntity;
