        }
    protected Dimension calculatePreferredSize(IFigure container, int widthHint, int heightHint) {
    public void layout(IFigure container) {
import java.util.List;
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
/*
/**
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;

import org.eclipse.draw2d.geometry.Rectangle;
        for (IFigure child : children) {
        List<? extends IFigure> children = container.getChildren();
import org.eclipse.draw2d.geometry.Dimension;
package org.jkiss.dbeaver.ui.editors.erd.layout;
 *
        monitor.subTask(ERDUIMessages.erd_job_layout_diagram);
        Rectangle result = new Rectangle().setLocation(container.getClientArea().getLocation());
import org.jkiss.dbeaver.ui.UIUtils;
 * limitations under the License.
        });
 * you may not use this file except in compliance with the License.

    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public GraphLayoutAuto(DiagramPart diagram) {
    @Override

import org.eclipse.draw2d.IFigure;
        container.validate();
    private DiagramPart diagram;
 * DBeaver - Universal Database Manager
 */
        result.resize(container.getInsets().getWidth(), container.getInsets().getHeight());
 *     http://www.apache.org/licenses/LICENSE-2.0
        return result.getSize();
 *
 *
/*
        DBRProgressMonitor monitor = diagram.getDiagram().getMonitor();
public class GraphLayoutAuto extends AbstractLayout {
 */
    }
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
    @Override
import org.eclipse.draw2d.AbstractLayout;
        UIUtils.syncExec(() -> {
            result.union(child.getBounds());
            diagram.setTableModelBounds();
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.ui.editors.erd.layout.algorithm.direct.DirectedGraphLayoutVisitor;
 * You may obtain a copy of the License at

}

    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Created on Jul 13, 2004
        this.diagram = diagram;
 * Uses the DirectedGraphLayoutVisitor to automatically lay out figures on diagram
            new DirectedGraphLayoutVisitor(diagram.getDiagram().getDecorator()).layoutDiagram(diagram);
 * @author Serge Rider
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

