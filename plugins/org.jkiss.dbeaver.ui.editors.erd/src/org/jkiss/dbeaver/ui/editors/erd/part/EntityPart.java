
import org.jkiss.dbeaver.model.DBPEvaluationContext;

            }
            }
 * limitations under the License.
    }
            final boolean layoutEnabled = isLayoutEnabled();
        return super.getTargetEditPart(request);
        if (!supportsAttributeAssociations()) {

        refreshVisuals();
            super.removeChildVisual(childEditPart);

        if (this.accPart == null) {
    }
 * @author Serge Rider
    /**
    }

        entityFigure.refreshColors();
                        EntityPart.this.getName(),
            if (layoutEnabled) {
        }
public class EntityPart extends NodePart {
                public void getName(AccessibleEvent e) {
import org.jkiss.dbeaver.ui.editors.erd.figures.AttributeItemFigure;
     *  Some routing methods doesn't support attribute associations
        super.registerVisuals();
            };
        return super.getDragTracker(request);
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDGraphicalViewer;
    }

    }

    @Override
        return (ERDEntity) getModel();
    @Override
import java.beans.PropertyChangeEvent;
        if (childEditPart instanceof AttributePart) {
     * Handles change in name when committing a direct edit
    }
            return this;
    //******************* Miscellaneous stuff *********************/

    protected AccessibleEditPart getAccessibleEditPart() {
    private boolean supportsAttributeAssociations() {
    }
                    });
        return new ChopboxAnchor(getFigure());
 */
    public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connectionEditPart) {


        Point location = entityFigure.getLocation();
        return new ChopboxAnchor(getFigure());
                        sourceConnections == null ? 0 : sourceConnections.size(),
    /**
import org.eclipse.draw2d.geometry.Rectangle;
 * you may not use this file except in compliance with the License.
    @Override
    protected void refreshVisuals() {
        } else {
    }

        visualPartMap.put(getFigure().getNameLabel(), this);
            entityFigure.setSelected(true);
    public EntityPart() {
        }
     */

    }

import org.eclipse.gef.tools.DirectEditManager;

        label.setVisible(true);
            if (visualInfo.initBounds != null) {
            if (getEntity().getAttributeVisibility() == null && visualInfo.attributeVisibility != null) {
            getDiagram().getModelAdapter().performPartRequest(this, request);
                installEditPolicy(EditPolicy.CONTAINER_ROLE, new EntityContainerEditPolicy());
        return list;
/*
    public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connectionEditPart) {

        }
 */
        return (EntityFigure) super.getFigure();
 * Created on Jul 13, 2004
        if (visualInfo != null) {
    protected List<ERDEntityAttribute> getModelChildren() {
    @Override
        return getEntity().getAttributes();
import org.jkiss.dbeaver.ui.editors.erd.figures.EntityFigure;
        EditableLabel label = entityFigure.getNameLabel();
    public DragTracker getDragTracker(Request request) {
import java.util.ArrayList;
import org.eclipse.draw2d.ConnectionAnchor;
import org.jkiss.dbeaver.model.DBUtils;
    @Override
        return new ChopboxAnchor(getFigure());
        if (!getEditor().isReadOnly()) {
        if (request.getType() == RequestConstants.REQ_OPEN) {
     *  Also not all visibility settings can allow an attribute-attribute
     *
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
    // Workaround: attribute figures aren't direct children of entity figure
                installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new EntityConnectionEditPolicy());

        return (ERDGraphicalViewer) super.getViewer();
        else
import org.eclipse.draw2d.geometry.Point;
        Map visualPartMap = this.getViewer().getVisualPartMap();
package org.jkiss.dbeaver.ui.editors.erd.part;
    }
     * @return is attribute associations possible
    public void setSelected(int value) {
    public void handleNameChange() {
        return figure;
        visualPartMap.put(getFigure().getKeyFigure(), this);
    }
    @Override
        EntityFigure entityFigure = getFigure();
        super.activate();
    @Override
        super.setSelected(value);
        if (value != EditPart.SELECTED_NONE)

     */

        EntityFigure entityFigure = getFigure();

 */
    protected AccessibleGraphicalEditPart accPart;
    }
        visualPartMap.put(getFigure().getColumnsFigure(), this);
    /**
 * distributed under the License is distributed on an "AS IS" BASIS,
            return super.getModelSourceConnections();
        }
        return new ChopboxAnchor(getFigure());
    }
    }
     */
 * See the License for the specific language governing permissions and

/**
    }

    }
                || isMixedAssociationSupported() && erdAssociation.getTargetAttributes().size() == 0) {
    @Override

        label.setText(getEntity().getObject().getName());
import org.jkiss.dbeaver.ui.editors.erd.policy.EntityContainerEditPolicy;
    /**
    }
    @Override

    protected List<ERDAssociation> getModelTargetConnections() {
    @Override
     */
        super.deactivate();
import java.util.Map;

        visualPartMap.remove(getFigure().getNameLabel());
        EntityDiagram.NodeVisualInfo visualInfo = diagram.getVisualInfo(getEntity().getObject());
        List<ERDAssociation> list = new ArrayList<>();
        List<ERDAssociation> list = new ArrayList<>();
    @Override
/*
            return super.getModelTargetConnections();
        super.unregisterVisuals();
    @Override
     * Creates edit policies and associates these with roles
//		return figure.getColumnsFigure();

    @Override
        label.setText(getEntity().getName());
    public ERDElement getElement() {
            }
    }
    // Add nested figures to visuals (to make hit test work properly)
    }
        super.commitRefresh(evt);
        return list;
            && !ERDAttributeVisibility.isHideAttributeAssociations(ERDUIActivator.getDefault().getPreferences());
        EntityFigure entityFigure = getFigure();
    /**
    protected EntityFigure createFigureImpl() {
                }
    public void deactivate() {
        return DBUtils.getObjectFullName(getEntity().getObject(), DBPEvaluationContext.UI);
            figure.remove(childFigure);
    }
 * You may obtain a copy of the License at
//		EntityFigure figure = (EntityFigure) getFigure();
    }
    protected void commitRefresh(PropertyChangeEvent evt) {
        }
                        EntityPart.this.getEntity().getAttributes().size(),
     * @return the Content pane for adding or removing child figures
    public void performRequest(Request request) {
    public ERDGraphicalViewer getViewer() {
    @Override
    @Override
    protected boolean isMixedAssociationSupported() {
                list.add(erdAssociation);
        return this.accPart;
    protected void registerVisuals() {

import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
        return new EntityFigure(this);
            }
 *
 * DBeaver - Universal Database Manager

    protected void commitNameChange(PropertyChangeEvent evt) {
import org.eclipse.gef.*;

        getViewer().handleTableDeactivate(getEntity().getObject());

            || ERDAttributeVisibility.isHideAttributeAssociations(ERDUIActivator.getDefault().getPreferences())) {
                figure.setLocation(visualInfo.initBounds.getLocation());
    // so we delegate child removal to entity part
        }
    @Override
        for (ERDAssociation erdAssociation : super.getModelSourceConnections()) {
     */
import org.jkiss.dbeaver.ui.editors.erd.ERDUIUtils;

    }
 *
        EntityFigure entityFigure = getFigure();
    
            AttributeItemFigure childFigure = ((AttributePart) childEditPart).getFigure();
    // Remove nested figures from visuals
        EditableLabel label = entityFigure.getNameLabel();
        Rectangle constraint = new Rectangle(location.x, location.y, -1, -1);

    protected EntityFigure createFigure() {
    @Override
    }
     *  relations

        label.setVisible(true);
        refreshVisuals();
                figure.setBackgroundColor(visualInfo.bgColor);
    @Override
 *
import org.jkiss.dbeaver.model.erd.*;
    public ConnectionAnchor getSourceConnectionAnchor(Request request) {
    /**
        getViewer().handleTableActivate(getEntity().getObject());
     * Sets the width of the line when selected
    @Override
import org.eclipse.draw2d.ChopboxAnchor;
        final EntityDiagram diagram = getDiagram();
        visualPartMap.remove(getFigure().getColumnsFigure());
    public EditPart getTargetEditPart(Request request) {
    public String toString() {

        } else {
            if (erdAssociation.getObject().getConstraintType() == DBSEntityConstraintType.INHERITANCE
import org.jkiss.dbeaver.model.struct.DBSEntityConstraintType;
 * Unless required by applicable law or agreed to in writing, software
    public ERDEntity getEntity() {
import org.jkiss.dbeaver.ui.editors.erd.policy.EntityEditPolicy;

 *
    }
                        targetConnections == null ? 0 : targetConnections.size(),
import org.jkiss.dbeaver.ui.editors.erd.figures.EditableLabel;
    protected DirectEditManager manager;
            if (visualInfo.bgColor != null) {
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
    public EntityFigure getContentPane() {
     */
    @Override
    }
     */
    //******************* Editing related methods *********************/
    }

        return false;
    @Override
        }
     * Creates a figure which represents the table
    public void activate() {
        visualPartMap.remove(getFigure().getKeyFigure());
    protected void removeChildVisual(EditPart childEditPart) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        entityFigure.repaint();
    }
    @Override


    @Override
            getDiagram().getModelAdapter().installPartEditPolicies(this);
            entityFigure.setSelected(false);
     */
    }
     * Reset the layout constraint, and revalidate the content pane
import org.eclipse.osgi.util.NLS;
        getDiagramPart().setLayoutConstraint(this, entityFigure, constraint);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public ConnectionAnchor getTargetConnectionAnchor(Request request) {
    }
            ERDUIUtils.openObjectEditor(getDiagram(), getEntity());
        return getFigure();
 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
                list.add(erdAssociation);
}                || (isMixedAssociationSupported() && erdAssociation.getTargetAttributes().size() == 0)) {
        if (RequestConstants.REQ_MOVE.equals(request.getType()) || RequestConstants.REQ_ADD.equals(request.getType())) {
            }
import org.jkiss.dbeaver.ui.editors.erd.policy.EntityConnectionEditPolicy;
        return getEntity();

     * Returns the Table model object represented by this EditPart
            this.accPart = new AccessibleGraphicalEditPart() {

    //******************* Listener related methods *********************/

    }
            }
        }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    //******************* Layout related methods *********************/
        }
    public EntityFigure getFigure() {
    protected void createEditPolicies() {
                getEntity().setAttributeVisibility(visualInfo.attributeVisibility);

        final EntityFigure figure = createFigureImpl();
 * Represents the editable/resizable table which can have columns added,
            if (erdAssociation.getObject().getConstraintType() == DBSEntityConstraintType.INHERITANCE
    @Override
 * removed, renamed etc.


        for (ERDAssociation erdAssociation : super.getModelTargetConnections()) {

import org.eclipse.swt.accessibility.AccessibleEvent;
    /**
        return getEditor().getDiagramRouter().supportedAttributeAssociation()
import java.util.List;
    protected void unregisterVisuals() {
        if (!getEditor().getDiagramRouter().supportedAttributeAssociation() 
                installEditPolicy(EditPolicy.COMPONENT_ROLE, new EntityEditPolicy());
        EntityFigure figure = getFigure();
        Map visualPartMap = this.getViewer().getVisualPartMap();
    }
    @Override
                    e.result = NLS.bind(ERDUIMessages.erd_accessibility_entity_part, new Object[]{
        }
    protected List<ERDAssociation> getModelSourceConnections() {

    @Override

