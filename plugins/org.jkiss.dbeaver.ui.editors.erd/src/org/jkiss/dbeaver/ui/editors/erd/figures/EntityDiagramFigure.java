        TextFlow flow = new TextFlow();
        setBackgroundColor(ERDThemeSettings.instance.diagramBackground);

                        Dimension textExtents = FigureUtilities.getTextExtents(message, textFlow.getFont());
        super.add(child, constraint, index);
    @Override
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
import org.eclipse.draw2d.text.TextFlow;

                    String message = ((ERDGraphicalViewer) part.getViewer()).getEditor().getErrorMessage();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public EntityDiagramFigure(DiagramPart diagramPart) {
/*
                        textFlow.setText(message);
import org.eclipse.draw2d.*;

    }
            @Override
        //hintFigure.setTextAlignment(PositionConstants.CENTER);

 *
 * @author Serge Rider
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;
import org.eclipse.jface.resource.JFaceResources;
                        int posX = (clientArea.width - textExtents.width) / 2;
        flow.setFont(JFaceResources.getFont(JFaceResources.HEADER_FONT));

 *
        addFigureListener(new FigureListener() {
 */
                        EntityDiagramFigure.this.removeFigureListener(this);
 */
                        if (posX > 0 && posY > 0) {
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
                            hintFigure.setLocation(new Point(posX, posY));
 * Figure which represents the whole diagram - the view which corresponds to the
import org.eclipse.draw2d.geometry.Rectangle;
 * you may not use this file except in compliance with the License.
/**
        //hintFigure.setTextPlacement(PositionConstants.MIDDLE);
    }
package org.jkiss.dbeaver.ui.editors.erd.figures;
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
    }
import org.eclipse.draw2d.geometry.Dimension;

public class EntityDiagramFigure extends FreeformLayer {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        //setConstraint(hintFigure, );
    private DiagramPart part;
 *
        }
                }
 *
            hintFigure = null;

 * Unless required by applicable law or agreed to in writing, software
        if (hintFigure != null && child != hintFigure) {
 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    } else {
        add(hintFigure, null);
        hintFigure.setHorizontalAligment(PositionConstants.CENTER);
    private FlowPage hintFigure;
import org.eclipse.draw2d.text.FlowPage;
}                        hintFigure.setVisible(false);
/*
 * Schema model object
        //setOpaque(true);
                            hintFigure.setVisible(true);
        hintFigure.add(flow);
 * limitations under the License.
 * Created on Jul 13, 2004
    public DiagramPart getPart() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.part = diagramPart;
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDGraphicalViewer;
            remove(hintFigure);
 */
                        }
                    Rectangle clientArea = EntityDiagramFigure.this.getClientArea();
 * DBeaver - Universal Database Manager
        //setChildrenOrientation(Orientable.HORIZONTAL);
                    if (!CommonUtils.isEmpty(message)) {

            }
                if (hintFigure != null) {
                        int posY = (clientArea.height - textExtents.height) / 2;
                        TextFlow textFlow = (TextFlow) hintFigure.getChildren().get(0);
            public void figureMoved(IFigure iFigure) {

        });
        return part;
        hintFigure = new FlowPage();
    public void add(IFigure child, Object constraint, int index) {
import org.eclipse.draw2d.geometry.Point;
