        }
    @Override
            if (child instanceof NodePart entityPart) {
     * Gets the diagram router
                UIUtils.syncExec(() -> resetConnectionConstraints(monitor, nodePart.getSourceConnections()));
        return true;
    private final CommandStackEventListener stackListener = new CommandStackEventListener() {

    }
            if (child instanceof NodePart && ((NodePart) child).getElement().getObject() == object) {


        monitor.beginTask(ERDUIMessages.erd_job_rearrange_diagram, getChildren().size() + 2);
import org.jkiss.utils.CommonUtils;
            }
    /**
    @Nullable
    @Override
    @Nullable
import org.eclipse.draw2d.PolylineConnection;

    public NodePart getChildByObject(Object object) {
    }
    public boolean isSelectable() {
        return ERDThemeSettings.instance.diagramFont;
     * changed. The delegating layout manager will then decide whether to

    }

        if (key == SnapToHelper.class) {
    public EntityDiagram getDiagram() {
    }

                Rectangle bounds = entityFigure.getBounds().getCopy();
        if ((control.getStyle() & SWT.MIRRORED) == 0) {
        super.deactivate();
        ERDEditorPart editor = getEditor();
                }
    }
            }
    /**
     * @see org.eclipse.gef.editparts.AbstractEditPart#isSelectable()

                    //TODO handle this better
    }
        for (Object child : getChildren()) {
    public String toString() {
    @Nullable
    public NotePart getNotePart(ERDNote erdNote) {
        getFigure().setLayoutManager(delegatingLayoutManager);
        ERDEditorPart editor = getEditor();
import org.jkiss.code.NotNull;
/*
        return (EntityDiagram) getModel();
        if (getEditor() == null) {
    }
                }
     * @return the children Model objects as a new ArrayList
 * distributed under the License is distributed on an "AS IS" BASIS,
                    getFigure().getUpdateManager().performUpdate();
 * See the License for the specific language governing permissions and
                    return;
     */

            for (Object sc : sourceConnections) {
                if (!GraphAnimation.captureLayout(getFigure())) {
        return router;
import org.jkiss.dbeaver.model.erd.ERDNote;
            final DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();
    }
    public EntityPart getEntityPart(ERDEntity erdEntity) {
        return null;
    /**
        delegatingLayoutManager = new DelegatingLayoutManager(this);
        return figure;


    }
     * performUpdate() when it changes
        }
     * @return whether the procedure execute successfully without any omissions.
import java.util.List;
    void rearrangeDiagram(@NotNull DBRProgressMonitor monitor) {
    public void performRequest(Request request) {
    /**
     */
import org.eclipse.swt.widgets.Control;
                            //setting the width and height so that the preferred size will be applied
                    } else {
            routerDescriptor = ERDConnectionRouterRegistry.getInstance().getActiveRouter();
    }
                if (bounds == null) {
    public Command createEntityAddCommand(List<ERDEntity> entities, Point location) {
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
    /**
                } else {
        }
            installEditPolicy(EditPolicy.CONTAINER_ROLE, new DiagramContainerEditPolicy());
        RearrangeDiagramService diagramService = new RearrangeDiagramService(this);
        return true;
    public <T> T getAdapter(Class<T> key) {
            return;
            }

                //if we don't find a node for one of the children then we should
import org.jkiss.dbeaver.ui.UIUtils;
                            //pass the constraint information to the xy layout
 * you may not use this file except in compliance with the License.

        UIUtils.syncExec(() -> getFigure().repaint());
     */
        Control control = getViewer().getControl();
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;

     * handling), and sets layout constraint data
     * to original
        return result;
                        associationPart.setConnectionRouting(monitor, (PolylineConnection) abstractPart.getConnectionFigure());
 *
        if (monitor.isCanceled()) {
            )
            return;
 * limitations under the License.
        }

            getDiagram().getModelAdapter().installPartEditPolicies(this);
import org.eclipse.swt.graphics.Font;
    }
            .schedule();
    @Override
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
    protected void createEditPolicies() {

    /**
                }
     */
 * Edit part for Schema object, and uses a SchemaDiagram figure as
        monitor.worked(1);
    private ERDConnectionRouter router;
import org.jkiss.dbeaver.ui.editors.erd.command.EntityRemoveCommand;
 * the container for all graphical objects
    @NotNull
                    return false;
                }
        return null;
                        }
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
 * You may obtain a copy of the License at
    public boolean setTableFigureBounds(boolean updateConstraint) {
                entityPart.setBounds(bounds);
    protected boolean isListensModelChanges() {
                getFigure().getUpdateManager().performUpdate();
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        EntityDiagramFigure figure = new EntityDiagramFigure(this);
    }

            installEditPolicy(EditPolicy.LAYOUT_ROLE, null);
import org.eclipse.draw2d.geometry.Point;

     * The latter occurs if any Table objects have no bounds set or if
        public void stackChanged(CommandStackEvent commandStackEvent) {

    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
                IFigure entityFigure = entityPart.getFigure();
import org.jkiss.dbeaver.ui.editors.erd.layout.GraphLayoutAuto;
import org.jkiss.dbeaver.ui.editors.erd.figures.EntityDiagramFigure;
        figure.setLayoutManager(delegatingLayoutManager);
            return;
                //now check whether we can find an entry in the tableToNodesMap
import java.beans.PropertyChangeEvent;
     * delegate layout to the XY or Graph layout

 */
        } else {
                return null;
                    continue;
                            delegatingLayoutManager.setXYLayoutConstraint(entityFigure, new Rectangle(bounds.x, bounds.y, -1, -1));
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        if (!CommonUtils.isEmpty(sourceConnections)) {
import org.eclipse.swt.SWT;
    }
        return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull

 *
    public Command createEntityDeleteCommand(EntityPart entityPart) {
    public Font getBoldFont() {
                    .createLoadVisualizer()
    @Override
        ERDConnectionRouterDescriptor routerDescriptor = editor == null ? null : editor.getDiagramRouter();

        getChildren().forEach(c -> {
        super.activate();
     */
    @Override
 * @author Serge Rider
    @Override
                }
        if (routerDescriptor == null) {
    public ERDConnectionRouter getActiveRouter() {
        getDiagram().getModelAdapter().performPartRequest(this, request);
    public void activate() {

                    if (sc instanceof AssociationPart associationPart) {
    }
     * no figure is available for the EntityPart
        return ERDThemeSettings.instance.diagramFontBold;

        }
     * Sets layout constraint only if XYLayout is active
     * Updates the bounds of the table figure (without invoking any event
            } else {
    public void changeLayout() {

 *
            return;

        getViewer().getEditDomain().getCommandStack().removeCommandStackEventListener(stackListener);
 * Unless required by applicable law or agreed to in writing, software
        super.setLayoutConstraint(child, childFigure, constraint);
import org.eclipse.gef.commands.Command;
    }

        //default constructor


    /**
    }
        List<?> nodeParts = getChildren();
    }

/**
            }
            }
                    }
        return getDiagram().getContents();
    }
            if (child instanceof EntityPart) {

    /**
     */
    }
import org.jkiss.dbeaver.model.erd.ERDEntity;
        router = routerDescriptor.createRouter();
 */
    @Override
                    .getProgressControl()
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        super.handleChildChange(evt);
    public void setTableModelBounds() {
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouter;

    }
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterDescriptor;
                diagramService,
        for (Object child : getChildren()) {
        }
    /**
            }
                // continue
     * The method designed for diagram re-arrangement, reset alignment elements
        LoadingJob.createService(
        for (Object child : entityParts) {
    /**
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterRegistry;
import org.eclipse.draw2d.IFigure;
     */
        }
        }
                Rectangle bounds = entityPart.getBounds();
    /**
 * DBeaver - Universal Database Manager
        return new EntityAddCommand(this, entities, location);
import org.jkiss.dbeaver.ui.editors.erd.layout.DelegatingLayoutManager;
        }
    public Font getNormalFont() {
    protected void handleChildChange(PropertyChangeEvent evt) {
        }
            if (child instanceof NodePart entityPart) {
    public void setLayoutConstraint(EditPart child, IFigure childFigure, Object constraint) {
                        if (updateConstraint) {
                while (GraphAnimation.step()) {
    @Override

import org.eclipse.draw2d.ConnectionLayer;
                if (sc instanceof AbstractConnectionEditPart abstractPart) {
            }
    }
     * Passes on to the delegating layout manager that the layout type has
            } else {
     *
            }

import org.eclipse.draw2d.geometry.Rectangle;
    };
    public List<EntityPart> getEntityParts() {
                getEditor()
    }
    protected IFigure createFigure() {
        monitor.subTask(ERDUIMessages.erd_job_repaint_diagram);
    }
        if (editor != null && !editor.isReadOnly()) {
     *
        if (monitor.isCanceled()) {
    }
        return super.getAdapter(key);
     * Updates the table bounds in the model so that the same bounds can be
}    }
        return ERDUIMessages.entity_diagram_;
                return key.cast(new SnapToGrid(this));
    @Override
    public DiagramPart() {
    protected List<?> getModelChildren() {
            monitor.worked(1);
    @Override

                return (NodePart) child;
        });
                monitor.worked(1);
            cLayer.setAntialias(SWT.ON);
    }
     */
        monitor.subTask(ERDUIMessages.erd_job_reset_element_position);
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
                result.add((EntityPart) child);
                    if (entityFigure == null) {
        return new EntityRemoveCommand(entityPart);
import org.jkiss.dbeaver.ui.editors.erd.policy.DiagramContainerEditPolicy;
     * left to the delegating layout manager
                return (EntityPart) child;
public class DiagramPart extends PropertyAwarePart {
        getViewer().getEditDomain().getCommandStack().addCommandStackEventListener(stackListener);

        for (Object child : nodeParts) {

        router.setContainer(figure);
 *
     * Removes this EditPart as a command stack listener
            if (child instanceof NotePart && ((NotePart) child).getNote() == erdNote) {
import java.util.ArrayList;
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
        }
                    }
    private void resetConnectionConstraints(DBRProgressMonitor monitor, List<?> sourceConnections) {
    }
     * @return - router
        for (Object child : getChildren()) {
                    IFigure entityFigure = entityPart.getFigure();
        }
                        associationPart.getAssociation().setInitBends(null);
    private DelegatingLayoutManager delegatingLayoutManager;
                return (NotePart) child;
import org.eclipse.gef.commands.CommandStackEventListener;

import org.jkiss.code.Nullable;
            }
                        return false;
        cLayer.setConnectionRouter(router);
        }
        ConnectionLayer cLayer = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
            if (store.getBoolean(ERDUIConstants.PREF_GRID_ENABLED) && store.getBoolean(ERDUIConstants.PREF_GRID_SNAP_ENABLED)) {
     * Creates EditPolicy objects for the EditPart. The LAYOUT_ROLE policy is
     */

        }
        @Override
        if (monitor.isCanceled()) {
    @Override
     */
        }
     * Adds this EditPart as a command stack listener, which can be used to call
                GraphAnimation.end();
        List<EntityPart> result = new ArrayList<>();
import org.jkiss.dbeaver.ui.editors.erd.layout.GraphAnimation;
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
import org.jkiss.dbeaver.ui.LoadingJob;
                    abstractPart.getConnectionFigure().setRoutingConstraint(null);
     * restored after saving
        for (Object child : getChildren()) {
    public void resetArrangement() {
import org.jkiss.dbeaver.ui.editors.erd.command.EntityAddCommand;

     */
 * Licensed under the Apache License, Version 2.0 (the "License");
                if (entityFigure == null) {
            if (child instanceof EntityPart && ((EntityPart) child).getEntity() == erdEntity) {
            if (delegatingLayoutManager.getActiveLayoutManager() instanceof GraphLayoutAuto) {
        return null;
            }
        }
    }
package org.jkiss.dbeaver.ui.editors.erd.part;
import org.eclipse.gef.*;
        List<?> entityParts = getChildren();

    @Override
        delegatingLayoutManager.rearrange(monitor, getFigure());
import org.eclipse.gef.commands.CommandStackEvent;
    public void deactivate() {
            if (c instanceof NodePart nodePart) {
