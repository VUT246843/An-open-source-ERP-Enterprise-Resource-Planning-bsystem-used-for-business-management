import org.eclipse.draw2d.IFigure;

public class GraphLayoutXY extends FreeformLayout {
        this.diagram = diagram;
    public Object getConstraint(IFigure child)
                return bounds;
 * Unless required by applicable law or agreed to in writing, software
    public GraphLayoutXY(DiagramPart diagram)
            if (bounds != null) {
 * when doing manual layout (XYLayout)
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
 * @author Serge Rider
        Object constraint = constraints.get(child);
 */
    @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
    }
    }
    {
 * DBeaver - Universal Database Manager
            Rectangle bounds = diagram.getDiagram().getVisualInfo(erdTable);
 * Subclass of XYLayout which can use the child figures actual bounds as a constraint
 * you may not use this file except in compliance with the License.
            return constraint;
/*
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
*/
        if (child instanceof EntityFigure) {
    public void cleanupConstraints()
/*
 */
    {
 * You may obtain a copy of the License at
            Rectangle currentBounds = child.getBounds();
    private DiagramPart diagram;
                bounds.width = child.getSize().width;
    @Override
            return new Rectangle(currentBounds.x, currentBounds.y, -1, -1);
        diagram.setTableModelBounds();
 * distributed under the License is distributed on an "AS IS" BASIS,

 *     http://www.apache.org/licenses/LICENSE-2.0
        } else {
    }
    }
    public void layout(IFigure container)
                bounds.height = child.getSize().height;
        }
package org.jkiss.dbeaver.ui.editors.erd.layout;
            final ERDEntity erdTable = ((EntityFigure) child).getTable();
 * Licensed under the Apache License, Version 2.0 (the "License");

        constraints.clear();

 *
/**

        if (constraint instanceof Rectangle) {
    {
 * See the License for the specific language governing permissions and
    {
 * Created on Jul 21, 2004
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.FreeformLayout;
 * limitations under the License.
        }

        super.layout(container);

 *
/*
 *
}
