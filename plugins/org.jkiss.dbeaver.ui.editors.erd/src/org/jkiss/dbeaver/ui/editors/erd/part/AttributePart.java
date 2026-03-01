import org.jkiss.dbeaver.ui.editors.erd.figures.AttributeItemFigure;
    public String getAttributeLabel() {
        } else if (associatedRelationsHighlighing != null) {

    }
    }
                        ERDUIUtils.getFullAttributeLabel(getDiagram(), getAttribute(), true, true));
 *
        ERDEntityAttribute attribute = getAttribute();
        return ERDUIUtils.getFullAttributeLabel(getDiagram(), getAttribute(), false);
        if (this.accPart == null) {
                if (attr.getObject() == attribute.getObject()) {
            || ERDAttributeVisibility.isHideAttributeAssociations(ERDUIActivator.getDefault().getPreferences())) {
        return parts;
    @Override

                }
    @Override

     */
    public EditPart getTargetEditPart(Request request) {
                }
        ERDEntityAttribute attribute = getAttribute();
                } else {
                }
    public List<AssociationPart> getAssociatingBySource() {
        List<ERDAssociation> associations = getEntity().getAssociations();
            || ERDAttributeVisibility.isHideAttributeAssociations(ERDUIActivator.getDefault().getPreferences())) {

    }
                                && entityAssociatonPart.getAssociation().equals(attributeAssociation)) {
        for (ERDAssociation attributeAssociation : associations) {
    }
    public ERDElement getElement() {
            }
        return new AttributeItemFigure(this);

     *
    // Remove nested figures from visuals
            }
    }
                nodes = highlightingManager.highlightAssociation(nodes, this, associationColor);
        if (RequestConstants.REQ_MOVE.equals(request.getType()) || RequestConstants.REQ_ADD.equals(request.getType())) {
                        for (Object o : entityAttribute.getSourceConnections()) {

        }
    public ConnectionAnchor getSourceConnectionAnchor(Request request) {
        }
    }
            if (rightPanel instanceof EditableLabel) {
        EditableLabel columnLabel = getFigure().getLabel();
    public void handleNameChange() {
        AttributeItemFigure figure = getFigure();
    @Override
        return new ChopboxAnchor(getFigure());
import org.eclipse.swt.graphics.Color;
    }
import org.eclipse.osgi.util.NLS;
                Color attributeColor = ERDThemeSettings.instance.fkHighlightColor;
import java.beans.PropertyChangeEvent;
            for (ERDEntityAttribute attr : erdAssociation.getSourceAttributes()) {
        }
                            if (o instanceof AssociationPart entityAssociatonPart
        return (ERDEntity) getParent().getModel();
    @Override
    }
     *
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
     */
    protected void commitNameChange(PropertyChangeEvent evt) {
                if (getEditPolicy(EditPolicy.CONTAINER_ROLE) == null && isColumnDragAndDropSupported()) {
/*
        return getEntity();
        figure.updateLabels();
        List<ERDAssociation> list = new ArrayList<>();
                } else {

        for (ERDAssociation attributeAssociation : associations) {
 *
            if (attr.getObject() == attribute.getObject()) {
    @Override
                associatedRelationsHighlighing = highlightingManager.makeHighlightingGroupHandle(nodes);
                    list.add(erdAssociation);
import org.eclipse.draw2d.ChopboxAnchor;
    /**
        super.setSelected(value);
            associatedRelationsHighlighing = null;
                    e.result = NLS.bind(ERDUIMessages.erd_accessibility_attribute_part,
    @Override
    @Override
    }
    }
     */
import java.util.List;
    }
            return;
    public ERDEntityAttribute getAttribute() {

                    installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new AttributeDragAndDropEditPolicy(this));
        }
import org.jkiss.dbeaver.ui.editors.erd.policy.AttributeConnectionEditPolicy;
    protected void createEditPolicies() {
        if (!getEditor().getDiagramRouter().supportedAttributeAssociation()
    @Override
import org.eclipse.swt.accessibility.AccessibleEvent;
    }

    /**
        }
    }
            ERDUIUtils.openObjectEditor(getDiagram(), getAttribute());


 * See the License for the specific language governing permissions and
        return (AttributeItemFigure) super.getFigure();
import org.eclipse.draw2d.IFigure;
     * We don't need to explicitly handle refresh visuals because the times when
        ERDEntityAttribute attribute = getAttribute();
 */
 *
                }
            };
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
        }
                    }
    private ERDHighlightingHandle associatedRelationsHighlighing = null;
            if (this.getViewer() instanceof ERDGraphicalViewer erdViewer && associatedRelationsHighlighing == null) {
        if (connection.getModel() instanceof ERDAssociation association) {
import java.util.Map;
            if (attributeAssociation.getTargetAttributes().contains(attribute)) {
    @Override
                    installEditPolicy(EditPolicy.CONTAINER_ROLE, new AttributeConnectionEditPolicy(this));
    public AttributePart() {
        columnLabel.setSelected(value != EditPart.SELECTED_NONE);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
import org.jkiss.dbeaver.model.erd.*;
                        for (Object o : entityAttribute.getTargetConnections()) {
        if (!getEditor().isReadOnly()) {
    }
    @Override
     * Create EditPolicies for the column label
        super.registerVisuals();
    @Override

            return Collections.emptyList();
        figure.revalidate();
        }
     */
                if (attr.getObject() == attribute.getObject()) {

        ERDEntityAttribute attribute = getAttribute();
    public AttributeCheckCommand createAttributeCheckCommand(boolean newChecked) {
        visualPartMap.put(getFigure().getLabel(), this);
        visualPartMap.put(getFigure().getCheckBox(), this);
     * Return list of references related by source type of connection
        figure.updateLabels();
        ERDAssociation association = associationPart.getAssociation();
    public DragTracker getDragTracker(Request request) {
import java.util.ArrayList;
                    (getParent() instanceof EntityPart entityPart)) {
        if (false) {
        //label.setText(textValue);
        ERDAssociation association = associationPart.getAssociation();
    }
            }
            associatedRelationsHighlighing.release();
    @Override
import org.jkiss.dbeaver.ui.editors.erd.ERDUIUtils;
    @Override
        }
                ListNode<ERDHighlightingHandle> nodes = highlightingManager.highlightRelatedAttributes(this, attributeColor);
import java.util.Collections;
        }
        }
        }
        } else {
            }

import org.jkiss.dbeaver.ui.editors.erd.command.AttributeCheckCommand;
 * Unless required by applicable law or agreed to in writing, software
    public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {
        setSelected(EditPart.SELECTED_PRIMARY);
    public boolean isSelectable() {
    @Override
        }
        List<AssociationPart> parts = new ArrayList<>();
        if (!getEditor().getDiagramRouter().supportedAttributeAssociation()
        }
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDGraphicalViewer;
    @Override
    }
    }
            if (attributeAssociation.getSourceAttributes().contains(attribute)) {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDHighlightingHandle;
                                && entityAssociatonPart.getAssociation().equals(attributeAssociation)) {

     * @return the ColumnLabel representing the Column
     * this needs to be done it is handled by the table e.g. handleNameChange()
}
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
        AttributeItemFigure figure = getFigure();
                    for (GraphicalEditPart entityAttribute : entityPart.getChildren()) {
    public void setSelected(int value) {
        ERDEntityAttribute attribute = getAttribute();


            if (isLayoutEnabled()) {

package org.jkiss.dbeaver.ui.editors.erd.part;

import org.eclipse.gef.tools.DragEditPartsTracker;
 * @author Serge Rider
 * You may obtain a copy of the License at
    /**
 * Represents an editable Column object in the model
    @Override
    /**
     */
            }

        if (value != EditPart.SELECTED_NONE) {
    public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
                            }
    protected List<ERDAssociation> getModelSourceConnections() {
                    }
    /**
        List<AssociationPart> parts = new ArrayList<>();
        return parts;
        Map visualPartMap = this.getViewer().getVisualPartMap();
    public ConnectionAnchor getTargetConnectionAnchor(Request request) {
            IFigure rightPanel = getFigure().getRightPanel();
     * Sets the width of the line when selected
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDHighlightingManager;
        return new AttributeCheckCommand<>(this, newChecked);
        }
     */
        List<ERDAssociation> list = new ArrayList<>();
    public static final String PROP_CHECKED = "CHECKED";
        getFigure().updateLabels();
        DragEditPartsTracker dragTracker = new DragEditPartsTracker(this);
            return Collections.emptyList();
        for (ERDEntityAttribute attr : association.getTargetAttributes()) {
        //EditableLabel label = getFigure().getLabel();
        }
    protected void addSourceConnection(ConnectionEditPart connection, int index) {
    public ERDEntity getEntity() {
 * DBeaver - Universal Database Manager
        visualPartMap.remove(getFigure().getLabel());
            getDiagram().getModelAdapter().installPartEditPolicies(this);


    @Override

                    (getParent() instanceof EntityPart entityPart)) {
        Map visualPartMap = this.getViewer().getVisualPartMap();
                public void getName(AccessibleEvent e) {
import org.jkiss.dbeaver.utils.ListNode;
            || ERDAttributeVisibility.isHideAttributeAssociations(ERDUIActivator.getDefault().getPreferences())) {
    protected AccessibleEditPart getAccessibleEditPart() {
        List<ERDAssociation> associations = getEntity().getReferences();
                return new ChopboxAnchor(getFigure().getParent());
        return ERDUIMessages.column_.trim() + " " + getAttribute().getLabelText();
 * limitations under the License.
        return super.getTargetEditPart(request);

    }
    }
        for (ERDAssociation erdAssociation : super.getModelTargetConnections()) {

                if (connectionPart == null &&
        AssociationPart associationPart = (AssociationPart) connection;
public class AttributePart extends NodePart {
    protected void refreshVisuals() {
    protected void unregisterVisuals() {
        //label.revalidate();

 * distributed under the License is distributed on an "AS IS" BASIS,
        //setSelected(EditPart.SELECTED_NONE);
     */

                }
    protected AccessibleGraphicalEditPart accPart;
    public void performRequest(Request request) {
                        }
 *

    protected void registerVisuals() {

        columnLabel.repaint();
    public List<AssociationPart> getAssociatingByTarget() {

import org.eclipse.gef.*;
                }
import org.jkiss.dbeaver.ui.editors.erd.policy.AttributeDragAndDropEditPolicy;
                    parts.add(connectionPart);
        return dragTracker;
            for (ERDEntityAttribute attr : erdAssociation.getTargetAttributes()) {
    /**
        figure.revalidate();
                ((EditableLabel) rightPanel).setSelected(value != EditPart.SELECTED_NONE);
     * Handles when successfully applying direct edit
            return this;
import org.jkiss.dbeaver.ui.editors.erd.figures.EditableLabel;
                    list.add(erdAssociation);
                    for (GraphicalEditPart entityAttribute : entityPart.getChildren()) {
                                parts.add(entityAssociatonPart);
     * Return list of references related by target type of connection
    public String toString() {
        return new ChopboxAnchor(getFigure());

        if (request.getType() == RequestConstants.REQ_OPEN) {
    }
    }
    }
        if (!getEditor().getDiagramRouter().supportedAttributeAssociation()
                AssociationPart connectionPart = getConnectionPart(attributeAssociation, true);
        }
            }
        return new ChopboxAnchor(getFigure());
    public AttributeItemFigure getFigure() {
    /**
            }
            if (attr.getObject() == attribute.getObject()) {
        for (ERDAssociation erdAssociation : super.getModelSourceConnections()) {
                super.addSourceConnection(connection, index);
 * you may not use this file except in compliance with the License.
    }
    @Override
    }
    @Override
    // Add nested figures to visuals (to make hit test work properly)
                            if (o instanceof AssociationPart entityAssociatonPart
    @Override
    }
                if (connectionPart == null &&
    @Override
    @Override
    protected List<ERDAssociation> getModelTargetConnections() {

                        }
        if (!getEditor().getDiagramRouter().supportedAttributeAssociation()

/**
    }
        visualPartMap.remove(getFigure().getCheckBox());
            }
    }
                                parts.add(entityAssociatonPart);
                            }
                AssociationPart connectionPart = getConnectionPart(attributeAssociation, true);
                super.addTargetConnection(connection, index);
    protected void addTargetConnection(ConnectionEditPart connection, int index) {
            this.accPart = new AccessibleGraphicalEditPart() {

        setSelected(EditPart.SELECTED_NONE);
        ERDEntityAttribute attribute = getAttribute();
            }
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
        for (ERDEntityAttribute attr : association.getSourceAttributes()) {
    }
            || ERDAttributeVisibility.isHideAttributeAssociations(ERDUIActivator.getDefault().getPreferences())) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
                Color associationColor = ERDThemeSettings.instance.fkHighlightColor;

            if (association.getTargetAttributes().contains(attribute)) {
        super.unregisterVisuals();
            return;
        }
    protected AttributeItemFigure createFigure() {
                ERDHighlightingManager highlightingManager = erdViewer.getEditor().getHighlightingManager();
import org.eclipse.draw2d.ConnectionAnchor;

            getDiagram().getModelAdapter().performPartRequest(this, request);
        return new ChopboxAnchor(getFigure());

    }

        return list;
    @Override
        return this.accPart;
        return true;
                    parts.add(connectionPart);
        return list;
    }
        AssociationPart associationPart = (AssociationPart) connection;
        return (ERDEntityAttribute) getModel();
        ERDEntityAttribute attribute = getAttribute();
        dragTracker.setDefaultCursor(SharedCursors.CURSOR_TREE_MOVE);
