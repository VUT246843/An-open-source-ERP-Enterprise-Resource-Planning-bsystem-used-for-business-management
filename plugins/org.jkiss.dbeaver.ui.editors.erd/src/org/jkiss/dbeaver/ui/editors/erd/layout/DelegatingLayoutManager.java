        //use the graph layout manager as the initial delegate
        EntityDiagram entityDiagram = diagram.getDiagram();
 * DBeaver - Universal Database Manager
    {
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
                } else {
    public Dimension getPreferredSize(IFigure container, int wHint, int hHint)
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
    private DiagramPart diagram;
    {
    public LayoutManager getActiveLayoutManager()




 * distributed under the License is distributed on an "AS IS" BASIS,
        return activeLayoutManager.getPreferredSize(container, wHint, hHint);

        finally {
    // ****************************/
                    } else {
            if (!diagram.getChildren().isEmpty()) {
    }
    private GraphLayoutAuto graphLayoutManager;

    public void setXYLayoutConstraint(IFigure child, Rectangle constraint)

    }
import org.eclipse.draw2d.LayoutManager;
import org.jkiss.dbeaver.ui.editors.erd.policy.DiagramXYLayoutPolicy;
                    setLayoutManager(container, xyLayoutManager);
            } else {
                        } else {
import org.eclipse.gef.EditPolicy;
                        //	yes we are okay to start populating the table bounds
                activeLayoutManager.layout(container);
        monitor.worked(1);
        }
                        if (diagram.setTableFigureBounds(true)) {
    }
    {

    }
    }
                            //we successfully set bounds for all the existing
                            setLayoutManager(container, xyLayoutManager);

    @Override
 * limitations under the License.
    }
        }
 * Used to delegate between the GraphLayoutAuto and the GraphLayoutXY classes
    {
 * you may not use this file except in compliance with the License.
        graphLayoutManager.layout(container);
    @Override
        }

        return activeLayoutManager.getMinimumSize(container, wHint, hHint);
/*
    public Object getConstraint(IFigure child)
        activeLayoutManager.setConstraint(child, constraint);
    public void setConstraint(IFigure child, Object constraint)
                    }
            diagram.installEditPolicy(EditPolicy.LAYOUT_ROLE, null);
                            setLayoutManager(container, xyLayoutManager);
                        // we first have to set the constraint data

        activeLayoutManager.remove(child);
import org.eclipse.draw2d.IFigure;
            }
    }
    /**
        this.xyLayoutManager = new GraphLayoutXY(diagram);
 */
    /**
                            // before we can set xyLayout
        return activeLayoutManager.getConstraint(child);

        try {
    public void rearrange(DBRProgressMonitor monitor, IFigure container) {

    //********************* protected and private methods

                    activeLayoutManager.layout(container);
            return;
                            //we did not - we still need to run autolayout once
        monitor.worked(1);

    }
        }

package org.jkiss.dbeaver.ui.editors.erd.layout;
 * See the License for the specific language governing permissions and
    @Override
        this.diagram = diagram;
     * Sets the current active layout manager
     */

 * Created on Jul 13, 2004
/*
                            activeLayoutManager.layout(container);
public class DelegatingLayoutManager implements LayoutManager {
 *
                entityDiagram.setNeedsAutoLayout(false);
                if (activeLayoutManager != xyLayoutManager) {
     * Rearrange figure on the diagram 

        container.setLayoutManager(layoutManager);
    @Override


 */
        } else {
}                            //run this again so that it will work again next time

import org.eclipse.draw2d.geometry.Dimension;
        xyLayoutManager.cleanupConstraints();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0
 * @author Serge Rider
    private LayoutManager activeLayoutManager;
        if (layoutManager == xyLayoutManager) {
    }
        if (monitor.isCanceled()) {
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
    {
 * Licensed under the Apache License, Version 2.0 (the "License");

            }
                setLayoutManager(container, graphLayoutManager);
/**
    public void remove(IFigure child)
        return activeLayoutManager;
        activeLayoutManager.invalidate();
    {
 *
                }
    public void layout(IFigure container)
    }
        monitor.beginTask(ERDUIMessages.erd_job_rearrange_diagram, 2);
    {
    {
     */
    @Override
 */
 * You may obtain a copy of the License at
                        }
    public void invalidate()
    // ****************************/
                    if (entityDiagram.isLayoutManualAllowed() && !entityDiagram.isNeedsAutoLayout()) {
                            // tables so we can start using xyLayout immediately

    //********************* layout manager methods methods
    @Override
 *

                        activeLayoutManager.layout(container);
    }
    {
        this.activeLayoutManager = layoutManager;
    public Dimension getMinimumSize(IFigure container, int wHint, int hHint)
        xyLayoutManager.setConstraint(child, constraint);
                        setLayoutManager(container, xyLayoutManager);
    @Override
    {

        this.graphLayoutManager = new GraphLayoutAuto(diagram);
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
    {
    private GraphLayoutXY xyLayoutManager;
import org.eclipse.draw2d.geometry.Rectangle;
        this.activeLayoutManager = this.graphLayoutManager;
                            activeLayoutManager.layout(container);
    public DelegatingLayoutManager(DiagramPart diagram)
 *

            diagram.installEditPolicy(EditPolicy.LAYOUT_ROLE, new DiagramXYLayoutPolicy());
            if (entityDiagram.isLayoutManualDesired()) {

    private void setLayoutManager(IFigure container, LayoutManager layoutManager)
