
        }
    public void handleNameChange(String value)
	 */
	{
                //installEditPolicy(EditPolicy.LAYOUT_ROLE, new EntityLayoutEditPolicy());
} *
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;

    /**
    public NotePart() {
	@Override
    public ConnectionAnchor getTargetConnectionAnchor(Request request)
    }
    {

    {
        return new ChopboxAnchor(getFigure());
    public EditPart getTargetEditPart(Request request) {
    }
                public void getName(AccessibleEvent e) {
		super.setSelected(value);

        manager.show();
import org.eclipse.draw2d.ConnectionAnchor;
	/**
	 * Creates a figure which represents the table
	 */
    }
	public String toString()
        return new ChopboxAnchor(getFigure());
     * Open edit box
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors.erd.part;
    }
    public void performRequest(Request request)
            //noteFigure.setLocation(bounds.getLocation());
     */
			noteFigure.setSelected(false);

        refreshVisuals();
import org.jkiss.dbeaver.model.erd.ERDElement;
    }
     * Reverts to existing name in model when exiting from a direct edit
        }
		if (request.getType() == RequestConstants.REQ_OPEN) {
        if (RequestConstants.REQ_CONNECTION_START.equals(request.getType()) ||
                value -> null);
    @Override
        noteFigure.setText(getNote().getObject());

        return new ChopboxAnchor(getFigure());
        NoteFigure noteFigure = (NoteFigure) getFigure();
	{
        return accPart;
    public void revertNameChange()
            getDiagram().getModelAdapter().installPartEditPolicies(this);
    protected void refreshVisuals()
import org.eclipse.draw2d.geometry.Dimension;

	/**
            //noteFigure.setSize(bounds.getSize());
        final NoteFigure noteFigure = new NoteFigure(getNote());
	}
            }
					&& !directEditHitTest(((DirectEditRequest) request).getLocation().getCopy()))
		parent.setLayoutConstraint(this, notefigure, constraint);

        if (manager == null) {
    public Command getCommand(Request request) {
            final boolean layoutEnabled = isLayoutEnabled();
    public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection)
/*

            noteFigure.setBorder(createBorder(visualInfo.borderWidth));


	 */
            RequestConstants.REQ_CONNECTION_END.equals(request.getType()))
        if (this.accPart == null) {
        NoteFigure noteFigure = (NoteFigure) getFigure();
		NoteFigure noteFigure = (NoteFigure) getFigure();
    }

    {
    {
            noteFigure.setPreferredSize(new Dimension(100, 50));
        return super.getTargetEditPart(request);
	@Override
        }
	/**
	@Override
    {
    @Override
		NoteFigure notefigure = (NoteFigure) getFigure();
                //installEditPolicy(EditPolicy.CONTAINER_ROLE, new EntityContainerEditPolicy());
 * 
        }
	{
    @Override
 *

	@Override
	@Override
 * you may not use this file except in compliance with the License.


        Rectangle bounds = visualInfo.initBounds;
    }
import org.eclipse.draw2d.geometry.Rectangle;
    }
            return getNote();
            getDiagram().getModelAdapter().performPartRequest(this, request);
        NoteFigure figure = (NoteFigure) getFigure();
{
import org.eclipse.draw2d.geometry.Point;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
        {
			noteFigure.setSelected(true);
            noteFigure.setForegroundColor(visualInfo.fgColor);
	 * Creates edit policies and associates these with roles
    /**
            noteFigure.setFont(visualInfo.font);
		Rectangle constraint = new Rectangle(location.x, location.y, -1, -1);
        } else {
		refreshVisuals();

		Point location = notefigure.getLocation();
			if (request instanceof DirectEditRequest
import org.eclipse.gef.requests.DirectEditRequest;
    {
import org.jkiss.dbeaver.model.erd.ERDNote;
        return super.getAdapter(key);

	 * Handles change in name when committing a direct edit
 * @author Serge Rider
import org.eclipse.gef.*;
 * DBeaver - Universal Database Manager
            this.accPart = new AccessibleGraphicalEditPart() {
    }
    }
    }
            noteFigure.setPreferredSize(bounds.getSize());
	}
            performDirectEdit();
                new FigureEditorLocator(figure),
import org.eclipse.gef.commands.Command;
public class NotePart extends NodePart
        return getNote();
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
		noteFigure.setText(getNote().getObject());
        return noteFigure;
    }
        return figure.containsPoint(requestLoc);
                MultilineTextCellEditor.class,

        EntityDiagram.NodeVisualInfo visualInfo = ((DiagramPart) getParent()).getDiagram().getVisualInfo(getNote(), true);
    }
import org.jkiss.dbeaver.ui.editors.erd.figures.NoteFigure;
import org.eclipse.draw2d.ChopboxAnchor;
        }
    public ERDElement getElement() {
    @Override
    private DirectEditManager manager;
            NoteFigure figure = (NoteFigure) getFigure();
	}
        noteFigure.setVisible(true);
        refreshVisuals();
 *


import org.eclipse.osgi.util.NLS;
            noteFigure.setOpaque(false);
    @Override
    private AccessibleGraphicalEditPart accPart;
import org.jkiss.dbeaver.ui.controls.MultilineTextCellEditor;
                //installEditPolicy(EditPolicy.COMPONENT_ROLE, new NoteDirectEditPolicy());
 */
            noteFigure.setBounds(bounds);
 * You may obtain a copy of the License at
        if (visualInfo.font != null) {
	 * Reset the layout constraint, and revalidate the content pane
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
import org.eclipse.gef.tools.DirectEditManager;
 * limitations under the License.
		NoteFigure noteFigure = (NoteFigure) getFigure();
            if (layoutEnabled) {

                }
        return super.getCommand(request);
	/**
				return;
            return this;
import org.jkiss.dbeaver.ui.editors.erd.policy.NoteEditPolicy;
                figure,

            performDirectEdit();
        }
    public void setSelected(int value)
			performDirectEdit();
 * Unless required by applicable law or agreed to in writing, software
    @Override
		return getNote().getObject();

        }
        if (visualInfo.borderWidth != ERDUIConstants.DEFAULT_NOTE_BORDER_WIDTH) {
        return new ChopboxAnchor(getFigure());
                installEditPolicy(EditPolicy.DIRECT_EDIT_ROLE, new NoteDirectEditPolicy());
    public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection)
        if (request.getType() == RequestConstants.REQ_DIRECT_EDIT) {
    public ConnectionAnchor getSourceConnectionAnchor(Request request)
 *     http://www.apache.org/licenses/LICENSE-2.0
    }

		else
        }
	//******************* Layout related methods *********************/
	 * Sets the width of the line when selected
import org.jkiss.dbeaver.ui.editors.erd.policy.NoteDirectEditPolicy;
    protected AccessibleEditPart getAccessibleEditPart() {
        if (visualInfo.transparent) {
        }
	{
    }
        if (bounds != null) {
	/**
import java.beans.PropertyChangeEvent;
	}
    protected void commitNameChange(PropertyChangeEvent evt)
        noteFigure.setVisible(false);
import org.jkiss.dbeaver.ui.editors.erd.policy.EntityConnectionEditPolicy;
 * Copyright (C) 2010-2025 DBeaver Corp and others
     * (possibly before a commit which will result in a change in the figure

    {
	{
import org.jkiss.dbeaver.model.DBPNamedObject;
	{
*/
        figure.translateToRelative(requestLoc);
 */
 * See the License for the specific language governing permissions and
        if (key == DBPNamedObject.class) {
 * Represents the editable/resizable note.
	 */
        if (!getEditor().isReadOnly()) {
            manager = new ExtendedDirectEditManager(
/**
	}
                //installEditPolicy(EditPolicy.SELECTION_FEEDBACK_ROLE, new ResizableEditPolicy());
    }
		noteFigure.setVisible(true);
		DiagramPart parent = (DiagramPart) getParent();
        }
        }
import org.eclipse.swt.accessibility.AccessibleEvent;
                installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new EntityConnectionEditPolicy());
    public ERDNote getNote()
     * value)
                this,
        if (visualInfo.fgColor != null) {
	{
    public void performDirectEdit() {

	}

    private boolean directEditHitTest(Point requestLoc) {
/*
    public Object getAdapter(Class key)
        }
    @Override
import org.jkiss.dbeaver.ui.editors.erd.directedit.ExtendedDirectEditManager;

		if (value != EditPart.SELECTED_NONE)
     */
		noteFigure.repaint();
                installEditPolicy(EditPolicy.COMPONENT_ROLE, new NoteEditPolicy());
                    e.result = NLS.bind(ERDUIMessages.erd_accessibility_note_part, NotePart.this.getName());
	 */
    protected void createEditPolicies()
	@Override
    protected NoteFigure createFigure()
            };
        } else if (request.getType() == RequestConstants.REQ_DIRECT_EDIT) {
        if (visualInfo.bgColor != null) {
		return (ERDNote) getModel();
            noteFigure.setBackgroundColor(visualInfo.bgColor);
        } else if (noteFigure.getSize().isEmpty()) {
import org.jkiss.dbeaver.ui.editors.erd.directedit.FigureEditorLocator;

        }
