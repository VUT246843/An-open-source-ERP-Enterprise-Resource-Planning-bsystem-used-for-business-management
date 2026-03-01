    protected boolean isEditEnabled() {
    public String getName() {
public abstract class PropertyAwareConnectionPart extends AbstractConnectionEditPart implements PropertyChangeListener, DBPNamedObject {
import java.beans.PropertyChangeListener;
        EditPart contents = root.getContents();
        switch (property) {
            case ERDObject.PROP_CHILD:
    @Override
    @Override
 *

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
        }
        RootEditPart root = getRoot();
 * distributed under the License is distributed on an "AS IS" BASIS,
                refreshSourceConnections();
            erdObject.removePropertyChangeListener(this);
        if (isEditEnabled()) {
        throw new IllegalStateException("Diagram part must be top level part");
import org.eclipse.gef.GraphicalEditPart;
		 * if (Activity.PROP_NAME.equals(prop)) refreshVisuals(); // Causes Graph to
 * you may not use this file except in compliance with the License.

    @NotNull
 */
    public void activate() {
    public void propertyChange(PropertyChangeEvent evt) {
 * An ConnectionEditPart base class which is property aware, that is, can handle property change notification events
                refreshTargetConnections();
import java.beans.PropertyChangeEvent;

import org.jkiss.dbeaver.model.DBPNamedObject;
                break;
        ((GraphicalEditPart) (getViewer().getContents())).getFigure().revalidate();
        if (root == null) {
    public DiagramPart getDiagramPart() {
        }

import org.eclipse.gef.EditPart;
        return getRoot().getContents() instanceof DiagramPart && ((DiagramPart) getRoot().getContents()).getDiagram().isLayoutManualAllowed();
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
 * You may obtain a copy of the License at
        super.deactivate();
    public void deactivate() {
 * @author Serge Rider
            case ERDObject.PROP_OUTPUT:
        String property = evt.getPropertyName();
		 */


 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
            case ERDObject.PROP_INPUT:
        super.activate();
            return (DiagramPart) contents;
 * All our ConnectionEditPart are subclasses of this
 * limitations under the License.
} *
		 * re-layout
        }
		 * (FlowElement.INPUTS.equals(prop)) refreshTargetConnections(); else if
 */
                refreshChildren();
    @Override
            ERDObject<?> erdObject = (ERDObject<?>) getModel();
package org.jkiss.dbeaver.ui.editors.erd.part;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

                break;
    }
 *
            erdObject.addPropertyChangeListener(this);
        return ((ERDObject) getModel()).getName();
/**
    }
import org.eclipse.gef.RootEditPart;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

        if (isEditEnabled()) {
		/*
                break;
/*
        }
    }
 * DBeaver - Universal Database Manager
    }
    }

    @NotNull
         * if (FlowElement.CHILDREN.equals(prop)) refreshChildren(); else if
            throw new IllegalStateException("Diagram part is null. Disposed part?");
import org.jkiss.dbeaver.model.erd.ERDObject;

		 * (FlowElement.OUTPUTS.equals(prop)) refreshSourceConnections(); else


        ERDObject<?> erdObject = (ERDObject<?>) getModel();
 *
        if (contents instanceof DiagramPart) {
