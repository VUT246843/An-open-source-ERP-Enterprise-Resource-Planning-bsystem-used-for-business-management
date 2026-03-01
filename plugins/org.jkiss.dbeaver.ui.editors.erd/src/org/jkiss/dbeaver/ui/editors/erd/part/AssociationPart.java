    public ERDAssociation getAssociation() {
            //                (\)
/**
            log.error("ERD notation instance not created for id: " + diagramNotationDescriptor.getId());
            GEOMETRY.addPoint(-1, 1);
    private PolylineConnection createConnectionFigure(@NotNull DBRProgressMonitor monitor) {
        final Color contrastColor = UIStyles.getContrastColor(foreground);
            //
    public AssociationPart() {
    public void addBendpoint(int bendpointIndex, Point location) {
            // remember that d > radius.
    }
        conn.setConnectionRouter(cLayer.getConnectionRouter());
        }
            setConnectionRouting(monitor, conn);
 * Represents the editable primary key/foreign key relationship
            return;
    }
     */
        @NotNull DBRProgressMonitor monitor,
        if (constraint instanceof List) {
        labelForegroundColor = UIUtils.getSharedColor(labelForeground);
        List<Bendpoint> bendpoints = getBendpointsCopy();
    }
    private Integer oldLineWidth;
        ERDAssociation association = getAssociation();
            log.error("ERD notation descriptor is not defined");
                bends.add(bp1);
            return (List<Bendpoint>) constraint;
    protected AccessibleEditPart getAccessibleEditPart() {
    public List<Bendpoint> getBendpoints() {
 * See the License for the specific language governing permissions and
import org.jkiss.code.NotNull;
        public void setRadius(int radius) {
        return conn;

    public static class CircleDecoration extends Ellipse implements RotatableDecoration {
        private static PointList GEOMETRY = new PointList();
        return conn;
    }
        ConnectionLayer cLayer = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
            bendpoints.remove(bendpointIndex);
            int rx, ry;
}            if (location.y > p.y) {
                RelativeBendpoint bp3 = new RelativeBendpoint(conn);
 * limitations under the License.
                rx = p.x - (int) shortx;
            }
        }
                ry = p.y + (int) shorty;
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotation;
            notation.applyNotationForArrows(monitor, conn, getAssociation(), background, labelForegroundColor);
            ((PolylineConnection) getFigure()).setLineWidth(oldLineWidth);
        }
                            ERDUIMessages.erd_accessibility_association_part_attribute,
import org.eclipse.draw2d.geometry.Point;
                Label descLabel = new Label(association.getObject().getDescription());
            return new ArrayList<>();
        return this.accPart;
            // we use
            ERDNotationDescriptor diagramNotationDescriptor = getDiagramPart().getEditor().getDiagramNotation();
            double k = (d - radius) / d;
                Color associationColor = ERDThemeSettings.instance.fkHighlightColor;
    @Override
        }
                        result += ERDUIMessages.erd_accessibility_association_part_logical;
 * DBeaver - Universal Database Manager
                List<RelativeBendpoint> bends = new ArrayList<>();
 *
            GEOMETRY.addPoint(0, 0);
                    String result = "";

import org.jkiss.dbeaver.ui.UIUtils;
        }
            Rectangle bounds = new Rectangle(location.x - radius, location.y - radius, radius * 2, radius * 2);

                        sourceString.toString(),
        if (getSource() == null || getTarget() == null) {
        @NotNull DBRProgressMonitor monitor,

import org.jkiss.dbeaver.ui.editors.erd.policy.AssociationBendEditPolicy;
        } else {
import org.eclipse.gef.*;
                ry = p.y - (int) shorty;
import org.jkiss.dbeaver.ui.editors.erd.router.shortpath.ShortPathRouting;
        Object constraint = getConnectionFigure().getRoutingConstraint();
            getDiagramPart().getDiagram().getModelAdapter().installPartEditPolicies(this);
            return;
import java.util.List;
            // between l and r is radius). We can do this using triangle identities.
            }
        if (monitor.isCanceled()) {

            conn.setRoutingConstraint(connBends);
            //
import org.eclipse.osgi.util.NLS;
                        association.getTargetEntity().getName(),
        boolean showComments = getDiagramPart().getDiagram().hasAttributeStyle(ERDViewStyle.COMMENTS);
        } else if (associatedAttributesHighlighing != null) {
            conn = new ERDConnection();
        @NotNull PolylineConnection conn
    protected void createEditPolicies() {
                return;
                Color attributeColor = ERDThemeSettings.instance.fkHighlightColor;
 */

    protected IFigure createFigure() {

            //
            if (entityPart instanceof GraphicalEditPart
            return;
    public static class RhombusDecoration extends PolygonDecoration {
        if (!getDiagramPart().getEditor().isReadOnly()) {

        final RGB labelForeground = UIUtils.blend(foreground.getRGB(), contrastColor.getRGB(), 60);
            // now create locate the new point using the distances depending on the location of the original points.

import org.jkiss.dbeaver.model.erd.ERDAssociation;
    /**
            if (isEditEnabled()) {
                connBends.add(new AbsoluteBendpoint(bend[0], bend[1]));
            List<AbsoluteBendpoint> connBends = new ArrayList<>();
import org.jkiss.dbeaver.Log;

            }
            if (entityPart == null) {
                int entityHeight = figureSize.height;
            // For reasons that are still unknown to me, I had to increase the radius
        }
    public void moveBendpoint(int bendpointIndex, Point location) {
        super.deactivate();
        public void setLocation(Point p) {
        ERDConnectionRouter router = getDiagramPart().getActiveRouter();
    public void removeBendpoint(int bendpointIndex) {
            setConnectionStyles(monitor, conn);
    }
        if (router != null) {
                    }
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterDescriptor;
        }
    }
            this.radius = radius;
            setConnectionToolTip(monitor, conn);
        } else {
        if (monitor.isCanceled()) {
    }
        if (oldLineWidth == null) {
        updateBendpoints(bendpoints);
        if (this.accPart == null) {
        // Set router and initial bends
            return;
 * distributed under the License is distributed on an "AS IS" BASIS,
            double longx = Math.abs(p.x - location.x);
 */
            // Make constraint copy


import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotationDescriptor;
        DBRProgressMonitor monitor = getDiagramPart().getDiagram().getMonitor();
        private int radius = 4;
        if (monitor.isCanceled()) {
                bp1.setRelativeDimensions(new Dimension(entityWidth, h2), new Dimension(entityWidth / 2, -h2 + w2));
                        targetString.append(NLS.bind(
 *
            setBounds(new Rectangle(rx - radius, ry - radius, (int) (radius * 2.5), (int) (radius * 2.5)));
            //  longy = |py-xy|
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.swt.graphics.RGB;
        ERDNotationDescriptor diagramNotationDescriptor = getDiagramPart().getEditor().getDiagramNotation();
                bends.add(bp2);
                        targetString.toString()
package org.jkiss.dbeaver.ui.editors.erd.part;
        }
        }
            return Collections.emptyList();
        if (value != EditPart.SELECTED_NONE) {
        if (notation != null) {

        return getAssociation().getObject().getConstraintType().getName() + " " + getAssociation().getObject().getName();
        }
        getConnectionFigure().setRoutingConstraint(bendpoints);
        ERDNotation notation = diagramNotationDescriptor.getNotation();
                    for (ERDEntityAttribute sourceAttribute : association.getSourceAttributes()) {
            GEOMETRY.addPoint(-2, 0);
            // using pythagoras theorem, we have a triangle like this:
            }
    }

                bp4.setRelativeDimensions(new Dimension(entityWidth, h2), new Dimension(entityWidth / 2, -h2 - w2));
                ListNode<ERDHighlightingHandle> nodes = highlightingManager.highlightRelatedAttributes(this, attributeColor);
            setTemplate(GEOMETRY);
            } else {
        if (getViewer() == null) {
    private List<Bendpoint> getBendpointsCopy() {
    }
import org.jkiss.dbeaver.ui.editors.erd.ERDUIUtils;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    private static final Log log = Log.getLog(AssociationPart.class);
            return;
                RelativeBendpoint bp1 = new RelativeBendpoint(conn);
            //      |                    |
        @NotNull PolylineConnection conn
                    for (ERDEntityAttribute targetAttribute : association.getTargetAttributes()) {
        } else if (association.getTargetEntity() != null && association.getTargetEntity() == association.getSourceEntity()) {
    protected void setConnectionRouting(

    public void setSelected(int value) {
        if (showComments) {
            //                | |  \
    private final Color labelForegroundColor;
        Bendpoint bendpoint = new AbsoluteBendpoint(location);
            double longy = Math.abs(p.y - location.y);
                RelativeBendpoint bp4 = new RelativeBendpoint(conn);
    public String toString() {
            setBounds(bounds);
import org.jkiss.dbeaver.utils.ListNode;
        } else {

            //     |px-rx|/|px-lx|=|py-ry|/|py-ly|=|d-radius|/d
        }
        if (diagramNotationDescriptor == null) {
        if (request.getType() == RequestConstants.REQ_OPEN) {

            GEOMETRY.addPoint(-1, -1);
        }
            //      |_____(l.x,l.y)______|
import java.util.ArrayList;
        List<Bendpoint> bendpoints = getBendpointsCopy();
            if (association != null && association.getObject() != null && !CommonUtils.isEmpty(association.getObject().getDescription())) {
                    });
    @Override

    @Override
            EditPart entityPart = getSource();
        }
        conn.setForegroundColor(ERDThemeSettings.instance.linesForeground);
import java.util.Collections;
import org.eclipse.draw2d.geometry.Rectangle;
    public void deactivate() {
        } else {
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.PointList;

        toolTip.setIcon(DBeaverIcons.getImage(DBIcon.TREE_FOREIGN_KEY));
                conn.setRoutingConstraint(bends);
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
                entityPart = getTarget();
        }
 * You may obtain a copy of the License at
                    }

                int entityWidth = figureSize.width;
            // Make constraint copy

            }
            return;
        super.activate();
            // and center our circle at this point.
        super.setSelected(value);
        Bendpoint bendpoint = new AbsoluteBendpoint(location);
    }
        @Override
                bp2.setRelativeDimensions(new Dimension(entityWidth, h2), new Dimension(entityWidth, -h2 + w2 / 2));
                installEditPolicy(EditPolicy.COMPONENT_ROLE, new AssociationEditPolicy());
        }
        @NotNull DBRProgressMonitor monitor,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    ) {
        if (!CommonUtils.isEmpty(association.getInitBends())) {
                && !router.supportedAttributeAssociation()) {
            return;
                nodes = highlightingManager.highlightAssociation(nodes, this, associationColor);
                    if (association.isLogical()) {
import org.jkiss.dbeaver.ui.editors.erd.editor.*;
            }
import org.jkiss.dbeaver.ui.editors.erd.connector.ERDConnection;
                            sourceAttribute.getName()));
import org.jkiss.dbeaver.ui.UIStyles;
    public void performRequest(Request request) {


        if (value != EditPart.SELECTED_NONE) {
            //                | | \
        }
            ERDUIUtils.openObjectEditor(getDiagramPart().getDiagram(), getAssociation());
            ((PolylineConnection) getFigure()).setLineWidth(oldLineWidth + 3);
    protected AccessibleGraphicalEditPart accPart;
        @Override
    public void activate() {
            // We want to find a point that at radius distance from l (location) on the line between l and p
     * Sets the width of the line when selected
        }
            conn = router.getConnectionInstance();
        }
                int w2 = entityWidth / 2;
            // I you remember your school math, let the distance between l and p (calculated
    @Override
            //                |_|(p.x,p.y)
import org.jkiss.dbeaver.ui.editors.erd.policy.AssociationEditPolicy;
    }
            updateBendpoints(bendpoints);
                    StringBuilder sourceString = new StringBuilder();
        Color foreground = ERDThemeSettings.instance.attrForeground;
                        association.getSourceEntity().getName(),
                descLabel.setForegroundColor(ERDThemeSettings.instance.attrForeground);
        if (constraint instanceof List) {
                    e.result = result;
    @Override

 * you may not use this file except in compliance with the License.
        ERDConnectionRouterDescriptor router = getDiagramPart().getEditor().getDiagramRouter();
    }
            }
        }
 */

                            targetAttribute.getName()));
 *
/*
    ) {



            //
        if (monitor.isCanceled()) {

        public void setReferencePoint(Point p) {
            updateBendpoints(bendpoints);

                        sourceString.append(NLS.bind(ERDUIMessages.erd_accessibility_association_part_attribute,
                    result += NLS.bind(ERDUIMessages.erd_accessibility_association_part, new Object[]{
        PolylineConnection conn;
            if (d < radius)
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouter;
        installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
            location = p;
            double shorty = k * longy;

    protected void setConnectionToolTip(
                ERDHighlightingManager highlightingManager = erdViewer.getEditor().getHighlightingManager();
        });
public class AssociationPart extends PropertyAwareConnectionPart {
    }
            // using pythagoras theorem) be defined as d. We want to find point r where the
        }
            return new ArrayList<>(curList);
            return conn;
            setScale(5, 5);
        Color background = getParent().getViewer().getControl().getBackground();
        installEditPolicy(EditPolicy.CONNECTION_BENDPOINTS_ROLE, new AssociationBendEditPolicy());
            // distance between r and p is d-radius (the same as saying that the distance
            // length of line between reference point and location

        public RhombusDecoration() {
                        association.getName(),
            setFill(true);
        if (cLayer.getConnectionRouter() instanceof ShortPathRouting shortPathRouting) {
 *
                    StringBuilder targetString = new StringBuilder();
 * @author Serge Rider
            //
        }
                    }
            //
    @Override
                bends.add(bp3);
    }
            //  longx = |px-lx|
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;
            // This part seems to be deleted
            // of the circle for the graphics to look right.
            bendpoints.set(bendpointIndex, bendpoint);


            oldLineWidth = ((PolylineConnection) getFigure()).getLineWidth();
        if (getSelected() == value) {
                }
                ConnectionLocator descLabelLocator = new ConnectionLocator(conn, ConnectionLocator.MIDDLE);
    }
            // do nothing if link is too short.
        Label toolTip = new Label(getAssociation().getObject().getName() + " [" + getAssociation().getObject().getConstraintType().getName() + "]");
                final IFigure entityFigure = ((GraphicalEditPart) entityPart).getFigure();
            List<Bendpoint> curList = (List<Bendpoint>) constraint;
    }
    private void updateBendpoints(List<Bendpoint> bendpoints) {
                public void getName(AccessibleEvent e) {
            this.accPart = new AccessibleGraphicalEditPart() {
    @Override
        }
            }
            //      |       figure       |
                conn.add(descLabel, descLabelLocator);
                rx = p.x + (int) shortx;
            };
            ERDAssociation association = getAssociation();
import org.jkiss.dbeaver.model.erd.ERDEntityAttribute;

            super();
            if (this.getViewer() instanceof ERDGraphicalViewer erdViewer && associatedAttributesHighlighing == null) {
        return (ERDAssociation) getModel();
        }
                RelativeBendpoint bp2 = new RelativeBendpoint(conn);
    // Keep original line width to visualize selection
    private ERDHighlightingHandle associatedAttributesHighlighing = null;
        bendpoints.add(bendpointIndex, bendpoint);
        public CircleDecoration() {
    @Override
import org.eclipse.swt.graphics.Color;
    }
    protected void setConnectionStyles(
        PolylineConnection conn = createConnectionFigure(monitor);
        } else {
            } else {
            for (int[] bend : association.getInitBends()) {
    ) {
                    ERDAssociation association = AssociationPart.this.getAssociation();
        }
                associatedAttributesHighlighing = highlightingManager.makeHighlightingGroupHandle(nodes);
        }
import org.jkiss.dbeaver.model.DBIcon;
                bp3.setRelativeDimensions(new Dimension(entityWidth, h2), new Dimension(entityWidth, -h2 - w2 / 2));

        conn.setToolTip(toolTip);
        private Point location = new Point();
            if (location.x < p.x) {
                bends.add(bp4);

        Object constraint = getConnectionFigure().getRoutingConstraint();
        UIUtils.syncExec(() -> {



 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.draw2d.*;
                int h2 = entityHeight / 2;
            //                | |   \
            //                | |\
        static {
            //
            shortPathRouting.setIndentation(diagramNotationDescriptor.getNotation().getIndentation());
            double shortx = k * longx;
    }
        if (bendpointIndex < bendpoints.size()) {
import org.jkiss.utils.CommonUtils;
        }
import org.eclipse.swt.accessibility.AccessibleEvent;
        @NotNull PolylineConnection conn


    }
            //                | \(r.x,r.y)
            associatedAttributesHighlighing.release();
                final Dimension figureSize = entityFigure.getMinimumSize();
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
 * Created on Jul 13, 2004
            double d = Math.sqrt(Math.pow((location.x - p.x), 2) + Math.pow(location.y - p.y, 2));
        List<Bendpoint> bendpoints = getBendpointsCopy();
            associatedAttributesHighlighing  = null;
        if (bendpointIndex < bendpoints.size()) {
/*
            //  k = |d-radius|/d
        }
