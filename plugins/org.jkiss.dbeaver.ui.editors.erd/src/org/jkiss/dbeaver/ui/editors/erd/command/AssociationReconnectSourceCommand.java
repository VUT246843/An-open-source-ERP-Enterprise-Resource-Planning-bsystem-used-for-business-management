
        this.sourceEntity = sourceEntity;
    /**
import org.jkiss.dbeaver.model.erd.ERDAssociation;

 * Unless required by applicable law or agreed to in writing, software
                if (relationship.getTargetEntity().equals(targetEntity) &&
 * DBeaver - Universal Database Manager
        }
 * key

    }
 *
    }
                    relationship.getSourceEntity().equals(sourceEntity)) {

        oldSourceEntity.addAssociation(association, true);
        }
        //cannot connect to itself
/**
    @Override
 * you may not use this file except in compliance with the License.
    }

 */
        if (sourceEntity != null) {
        this.association = association;
        } else {
 * Command to change the foreign key we are connecting to a particular primary
    public void undo() {
            returnVal = false;
        association.setSourceEntity(oldSourceEntity);
        boolean returnVal = true;
 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected ERDElement oldSourceEntity;

 * limitations under the License.
/*

            sourceEntity.addAssociation(association, true);
    public ERDAssociation getAssociation() {
public class AssociationReconnectSourceCommand extends Command {
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
        ERDElement primaryEntity = association.getTargetEntity();


        if (primaryEntity.equals(sourceEntity)) {
 * @author Serge Rider
import java.util.List;
import org.jkiss.dbeaver.model.erd.ERDElement;
    }
     * Makes sure that primary key doesn't reconnect to itself or try to create
    protected ERDElement targetEntity;
    public boolean canExecute() {
 */
import org.eclipse.gef.commands.Command;
    public void setAssociation(ERDAssociation association) {

        oldSourceEntity = association.getSourceEntity();
    public void execute() {

    }

    @Override
            oldSourceEntity.removeAssociation(association, true);
        targetEntity = association.getTargetEntity();
            List<ERDAssociation> relationships = sourceEntity.getAssociations();
                }
package org.jkiss.dbeaver.ui.editors.erd.command;
                    break;
            association.setSourceEntity(sourceEntity);
 * You may obtain a copy of the License at
        return association;

 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
    protected ERDElement sourceEntity;
    @Override
     */
            for (ERDAssociation relationship : relationships) {

     * a relationship which already exists
    protected ERDAssociation association;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
}        return returnVal;

    public void setSourceEntity(ERDElement sourceEntity) {

        sourceEntity.removeAssociation(association, true);
                    returnVal = false;
