
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
            rect.width - borderSize.width * 2,
 *
/*
 * you may not use this file except in compliance with the License.

        Border border = figure.getBorder();
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 * A CellEditorLocator for a specified text flow
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            rect.height - borderSize.height * 2);
        figure.translateToAbsolute(rect);
    }
 * See the License for the specific language governing permissions and
    @Override

 * You may obtain a copy of the License at
public class FigureEditorLocator implements CellEditorLocator {
    public FigureEditorLocator(IFigure figure) {

    private IFigure figure;

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.draw2d.IFigure;
     */
 */
/**
import org.eclipse.draw2d.geometry.Rectangle;

        text.setBounds(
import org.eclipse.gef.tools.CellEditorLocator;
    }
 */
    protected IFigure getFigure() {
        Text text = (Text) celleditor.getControl();
package org.jkiss.dbeaver.ui.editors.erd.directedit;
        text.setBackground(figure.getBackgroundColor());
}import org.eclipse.draw2d.geometry.Dimension;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
     * expands the size of the control by 1 pixel in each direction
/*
import org.eclipse.draw2d.Border;
        Rectangle rect = figure.getBounds().getCopy();
            rect.x + borderSize.width,
        Dimension borderSize = border.getPreferredSize(figure);
import org.eclipse.jface.viewers.CellEditor;


 * Created on Jul 13, 2004
    public void relocate(CellEditor celleditor) {
 *
 *

        this.figure = figure;
 * @author Serge Rider
            rect.y + borderSize.height,
import org.eclipse.swt.widgets.Text;
        //Insets insets = border.getInsets(figure);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        return figure;
    /**
 *
