 *
 * you may not use this file except in compliance with the License.
        }
            part = new DiagramPart();
    }
/*
import org.jkiss.dbeaver.model.erd.ERDAssociation;
        if (part != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Created on Jul 13, 2004
            part.setModel(model);
import org.jkiss.dbeaver.model.erd.ERDEntityAttribute;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            part = new AssociationPart();
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
        EditPart part = null;
            part = new NotePart();
 * @author Serge Rider
package org.jkiss.dbeaver.ui.editors.erd.editor;
 * Unless required by applicable law or agreed to in writing, software
}        } else if (model instanceof ERDEntityAttribute) {
    @Override
{
        } else if (model instanceof ERDAssociation) {
        } else if (model instanceof ERDNote) {
 *
 * limitations under the License.
 * You may obtain a copy of the License at
import org.eclipse.gef.EditPart;
            part = new EntityPart();
 *
import org.eclipse.gef.EditPartFactory;
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
            part = new AttributePart();
        return part;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.editors.erd.part.*;
 * See the License for the specific language governing permissions and
        } else if (model instanceof ERDEntity) {
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.model.erd.ERDNote;

/*
        }
/**
 *
 */
    public EditPart createEditPart(EditPart context, Object model) {
 * Edit part factory for creating EditPart instances as delegates for model objects
 */
        if (model instanceof EntityDiagram) {
public class ERDEditPartFactory implements EditPartFactory
import org.jkiss.dbeaver.model.erd.ERDEntity;
