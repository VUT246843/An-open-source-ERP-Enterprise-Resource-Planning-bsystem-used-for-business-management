            throw new IllegalStateException("Exactly one of old or new values must be non-null for PROP_INPUT event");
        return true;
                }
     * Called when change to one of the inputs occurs
            }
            for (Object child : children) {
            for (Object next : childrenParts) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (newValue != null) {
                    }
                handleChildChange(evt);
        refreshChildren();
    protected void handleReorderChange(PropertyChangeEvent evt) {
            }
            erdObject.removePropertyChangeListener(this);

    protected boolean isEditEnabled() {
 * limitations under the License.
import org.jkiss.code.NotNull;
            }
        return super.getAdapter(key);
        Object newValue = evt.getNewValue();
        for (EditPart part = getParent(); part != null; part = part.getParent()) {
    }
     */
     * Called when columns are re-ordered within
        super.activate();
        }
    }
            case ERDObject.PROP_CHILD:
    }
        EditPartViewer viewer = getViewer();

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        //we want direct edit name changes to update immediately
    }
                if (part.getModel() == oldValue) {
        }
        ERDEditorPart editor = getEditor();
            }
                        ConnectionEditPart childConnectionPart = (ConnectionEditPart) childrenConnection;
 */
    public void deactivate() {
            case ERDObject.PROP_INPUT:
    protected void commitRefresh(PropertyChangeEvent evt) {

                            childConnectionPartToRemove = childConnectionPart;

            if (partToRemove != null)

import org.eclipse.draw2d.IFigure;
    }

                    propertyCollector.collectProperties();
            if (part instanceof DiagramPart) {
import org.eclipse.gef.ConnectionEditPart;
        } else {
                        if (commandContext != null) {
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;

                if (part.getModel() == oldValue) {
            int modelIndex = getModelChildren().indexOf(newValue);
                break;
    }

                return (DiagramPart) part;
        }
    @NotNull
                        DBECommandContext commandContext = getCommandContext();

                addSourceConnection(editPart, modelIndex);
            IFigure partFigure = graphicalEditPart.getFigure();
                break;
                    partToRemove = part;
    public <T> T getAdapter(Class<T> key) {
    protected boolean isLayoutEnabled() {
                removeChild(partToRemove);
import java.util.List;
                EditPart part = (EditPart) child;
                ConnectionEditPart part = (ConnectionEditPart) child;
            throw new IllegalStateException("Exactly one of old or new values must be non-null for PROP_INPUT event");
        Object oldValue = evt.getOldValue();
            return erdGraphicalViewer.getEditor();
                }
        } else {

            ConnectionEditPart editPart = createOrFindConnection(newValue);

 * Unless required by applicable law or agreed to in writing, software
}        commitNameChange(evt);
                            break;
 */
            } else {


        // a more efficient implementation should either remove or add the

                break;
import java.beans.PropertyChangeListener;
        ERDObject<?> erdObject = (ERDObject<?>) getModel();
        return getDiagram().isEditEnabled();
import org.eclipse.gef.GraphicalEditPart;
                    if (child instanceof PropertyAwarePart) {
        switch (property) {
            List<?> children = getSourceConnections();
            List<?> childrenParts = getChildren();
        getContentPane().revalidate();
     */
    public DBECommandContext getCommandContext() {
                    PropertyCollector propertyCollector = new PropertyCollector(object, false);
            //add new connection
                        if (childConnectionPart.getModel() == oldValue) {
     */

                } else {
        getContentPane().revalidate();
            if (modelIndex >= 0) {
public abstract class PropertyAwarePart extends AbstractGraphicalEditPart implements PropertyChangeListener, DBPNamedObject {

                    curBounds.width = newSize.width;
        //relevant target connection
     */
        }
    /**
            ERDObject<?> erdObject = (ERDObject<?>) getModel();

            EditPart editPart = createChild(newValue);
    /**
        //refreshChildren();

    @NotNull
        }
            EditPart partToRemove = null;
        return editor == null ? null : editor.getCommandContext();
        //using the removeTargetConnection(ConnectionEditPart connection) or
                if (next instanceof PropertyAwarePart pap) {

                        if (childConnectionPart.getModel() == oldValue) {
    }
/*
        }
    public ERDEditorPart getEditor() {
            }
            throw new IllegalStateException("Exactly one of old or new values must be non-null for PROP_CHILD event");
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
 * An abstract EditPart implementation which is property aware and responds to
                        ConnectionEditPart childConnectionPart = (ConnectionEditPart) childrenConnection;

 * See the License for the specific language governing permissions and
            //add new child
            if (partToRemove != null)
                        }

    @Override
        //not use the Graph animation, if automatic layout is being used

            //remove connection
                    Dimension newSize = figure.getPreferredSize();
            case ERDObject.PROP_REORDER:

            }
            List<?> children = getTargetConnections();
                IFigure figure = getFigure();
                handleInputChange(evt);
            partFigure.getUpdateManager().performUpdate();
            if (partToRemove != null)

                    ConnectionEditPart childConnectionPartToRemove;
        //addSourceConnection(ConnectionEditPart connection, int index)
                }
        if ((oldValue != null) == (newValue != null)) {
            for (Object next : childrenParts) {
import org.eclipse.gef.EditPartViewer;
 * you may not use this file except in compliance with the License.
        return isLayoutEnabled() || isEditEnabled();
    @Nullable
                            PropertySourceEditable pse = new PropertySourceEditable(commandContext, object, object);
        return ((ERDObject<?>) getModel()).getName();
        Object newValue = evt.getNewValue();
import org.eclipse.gef.EditPart;
                    Rectangle curBounds = figure.getBounds().getCopy();
                    List<?> childrenConnections = pap.getSourceConnections();
                    for (Object childrenConnection : childrenConnections) {
                }

                removeTargetConnection(partToRemove);
                    nodePart.modifyBounds(curBounds);
                handleReorderChange(evt);


 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.properties.PropertySourceDelegate;
    protected boolean isColumnDragAndDropSupported() {
import org.jkiss.code.Nullable;
        }

        if (isListensModelChanges()) {
                }
    }
    }

                    return key.cast(new PropertySourceDelegate(propertyCollector));

            int modelIndex = getModelTargetConnections().indexOf(newValue);
                            return key.cast(new PropertySourceDelegate(pse));
                            pse.collectProperties();

        return getDiagramPart().getDiagram();
                    partToRemove = part;
                    }
            addChild(editPart, modelIndex);
        }

                if (object instanceof DBSObject) {
        Object newValue = evt.getNewValue();
                if (part.getModel() == oldValue) {
import java.beans.PropertyChangeEvent;

                if (this instanceof NodePart nodePart) {
        if (viewer instanceof ERDGraphicalViewer erdGraphicalViewer) {
                        }

            Object model = getModel();
    public DiagramPart getDiagramPart() {
                removeSourceConnection(partToRemove);
        if (newValue != null) {
                        }
                    ConnectionEditPart childConnectionPartToRemove;
    /**
        }
                    for (Object childrenConnection : childrenConnections) {
                            pap.removeSourceConnection(childConnectionPartToRemove);
                        ((PropertyAwarePart) child).refreshSourceConnections();
            int modelIndex = getModelSourceConnections().indexOf(newValue);
            for (Object child : children) {
            ConnectionEditPart partToRemove = null;
                    break;
                    if (isEditEnabled()) {
        }
import org.jkiss.dbeaver.model.struct.DBSObject;
     * Called when change to one of the outputs occurs
     * called when child added or removed
    }
        //refreshSourceConnections();

        throw new IllegalStateException("Diagram part must be top level part");
    private void handleOutputChange(PropertyChangeEvent evt) {
            List<?> children = getChildren();
            }
                break;
                            childConnectionPartToRemove = childConnectionPart;
                for (Object child : getChildren()) {
    }
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDGraphicalViewer;
                break;
            //remove connection
            if (modelIndex >= 0) {
/**

            List<?> childrenParts = getChildren();
 * PropertyChangeEvents fired from the model
import org.jkiss.dbeaver.model.edit.DBECommandContext;
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
            case ERDObject.PROP_OUTPUT:
    }
        }

                    partToRemove = part;
        } else {
                    break;
            GraphicalEditPart graphicalEditPart = (GraphicalEditPart) (getViewer().getContents());

        if (key == IPropertySource.class) {
                            pap.removeTargetConnection(childConnectionPartToRemove);
    protected boolean isListensModelChanges() {
    public void activate() {
        //getContentPane().revalidate();
        //using the removeSourceConnection(ConnectionEditPart connection) or
    public String getName() {
                    }
    @NotNull
    public EntityDiagram getDiagram() {
        } else {
        //this works but is not efficient
                if (next instanceof PropertyAwarePart pap) {
    }
    protected void commitNameChange(PropertyChangeEvent evt) {
    private void handleInputChange(PropertyChangeEvent evt) {

    }
        if ((oldValue != null) == (newValue != null)) {
        refreshVisuals();
                }
                    List<?> childrenConnections = pap.getTargetConnections();
 * Licensed under the Apache License, Version 2.0 (the "License");
            for (Object child : children) {
        if (ERDObject.PROP_NAME.equals(property)) {
            case ERDObject.PROP_NAME:
import org.eclipse.draw2d.geometry.Dimension;
        Object oldValue = evt.getOldValue();
        refreshChildren();
package org.jkiss.dbeaver.ui.editors.erd.part;
                for (Object child : getChildren()) {
 *

import org.jkiss.dbeaver.model.DBPNamedObject;
                    if (child instanceof PropertyAwarePart) {
    @Override
        //addTargetConnection(ConnectionEditPart connection, int index)
                commitRefresh(evt);
                    }
        Object oldValue = evt.getOldValue();
import org.jkiss.dbeaver.model.erd.ERDObject;
    // Refresh part name
            return null;
        getDiagram().getModelAdapter().handlePropertyChange(getEditor(), evt);

                }
 * Copyright (C) 2010-2025 DBeaver Corp and others

        if ((oldValue != null) == (newValue != null)) {
            ConnectionEditPart editPart = createOrFindConnection(newValue);

    }
                break;

                }
    protected void handleChildChange(PropertyChangeEvent evt) {

    @Override
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
        }
            return null;
                    curBounds.height = newSize.height;
            erdObject.addPropertyChangeListener(this);
            }
 *
    /**

                Object object = ((ERDObject<?>) model).getObject();
    }


        refreshVisuals();
                break;
    public void propertyChange(PropertyChangeEvent evt) {
            case ERDObject.PROP_CONTENTS:
            case ERDObject.PROP_SIZE: {
        //this works but is not efficient
            }

                handleOutputChange(evt);
                    figure.setSize(figure.getPreferredSize());
            //add new connection
        if (newValue != null) {

                ConnectionEditPart part = (ConnectionEditPart) child;
 * @author Serge Rider

        String property = evt.getPropertyName();
    }
        //a more efficient implementation should either remove or add the
 *
            ConnectionEditPart partToRemove = null;
        if (isListensModelChanges()) {

    }
import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;


        }
    // Refresh part contents
                }
        return getDiagram().isLayoutManualAllowed();
 * distributed under the License is distributed on an "AS IS" BASIS,
                            break;

                addTargetConnection(editPart, modelIndex);
 *
            }
            } else {
                    }
                    break;
        //we could do this but it is not very efficient
            if (model instanceof ERDObject) {
 * DBeaver - Universal Database Manager
    @Override
import org.eclipse.draw2d.geometry.Rectangle;
        // relevant target connect
                commitNameChange(evt);

    @Override
                        ((PropertyAwarePart) child).refreshTargetConnections();
    }
        //refreshTargetConnections();

import org.eclipse.ui.views.properties.IPropertySource;

        super.deactivate();
    @Nullable
