    }

    public boolean getCustomTransparency() {
            figure.setFont(font);
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (figure != null) {
     * @param bounds The bounds to set.
            Figure entityFigure = (Figure) getFigure();

import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
            }
     */
    }
    protected Border createBorder(int borderWidth) {
        }
            Border border = figure.getBorder();
package org.jkiss.dbeaver.ui.editors.erd.part;
    public Font getCustomFont() {
    }
    }
    /**
 *
            newBorder = new CompoundBorder(

/*
    }
            figure.setBorder(createBorder(borderWidth));
    }
    }
        return newBorder;
}
    public int getCustomBorderWidth() {
                return ((LineBorder) border).getWidth();
                    return ((LineBorder) ((CompoundBorder) border).getOuterBorder()).getWidth();
    public void setCustomBackgroundColor(Color color) {
        }
                new MarginBorder(5)


import org.jkiss.dbeaver.model.erd.ERDAssociation;
        }
     * @return Returns the bounds.
 *
    @Override
                new LineBorder(ERDThemeSettings.instance.linesForeground, borderWidth),
                    color);
                }

    @Override
        return figure == null ? null : figure.getForegroundColor();
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (conn instanceof AssociationPart && ((AssociationPart) conn).getAssociation() == rel) {
    }
        Rectangle oldBounds = this.bounds;
        IFigure figure = getFigure();
     * @param bounds The bounds to set.
    @Override

 * You may obtain a copy of the License at
import org.eclipse.draw2d.geometry.Rectangle;

        if (borderWidth == 0) {
        IFigure figure = getFigure();
    @Override
            figure.setOpaque(!transparency);
 */

    @Override
    public abstract ERDElement getElement();
        if (figure != null) {
    public Rectangle getBounds() {
        return figure != null && !figure.isOpaque();
        IFigure figure = getFigure();
 * limitations under the License.
        IFigure figure = getFigure();
        return figure == null ? null : figure.getBackgroundColor();

    @Override

     * If modified, sets bounds and fires off event notification
     *
            newBorder = new MarginBorder(5);
import org.eclipse.gef.NodeEditPart;
        if (figure != null) {
        IFigure figure = getFigure();
    public Color getCustomBackgroundColor() {
        IFigure figure = getFigure();

        IFigure figure = getFigure();
    }
        }
    @Override
                    ERDThemeSettings.instance.noteBackground :

import java.util.List;
        }
            );

    public void modifyBounds(Rectangle bounds) {

    }
    @Override
        }
        IFigure figure = getFigure();
    public void setBounds(Rectangle bounds) {
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public void setCustomFont(Font font) {
            figure.setForegroundColor(
    }
        return getElement().getAssociations();
    }
    protected List<ERDAssociation> getModelTargetConnections() {
        if (!bounds.equals(oldBounds)) {
        } else {
import org.jkiss.dbeaver.model.erd.ERDElement;
        return 0;
            } else if (border instanceof CompoundBorder) {
    /**

                    ERDThemeSettings.instance.noteForeground :

        return null;
    }
 * Abstract node part
            if (border instanceof LineBorder) {
public abstract class NodePart extends PropertyAwarePart implements NodeEditPart, ICustomizablePart {
                return (AssociationPart) conn;
        IFigure figure = getFigure();
    @Override
 * See the License for the specific language governing permissions and
     */
                    color);
 * DBeaver - Universal Database Manager




        if (figure != null) {
    public void setCustomTransparency(boolean transparency) {

        return getElement().getReferences();
    }
        if (figure != null) {
            }
                color == null ?
    /**

    public AssociationPart getConnectionPart(ERDAssociation rel, boolean source) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        return bounds;
        }
        Border newBorder;
    public void setCustomForegroundColor(Color color) {
                if (((CompoundBorder) border).getOuterBorder() instanceof LineBorder) {
            figure.setBackgroundColor(
    public void setCustomBorderWidth(int borderWidth) {
    }
    @Override
import org.eclipse.swt.graphics.Color;

     */
        if (figure != null) {
/**
            this.bounds = bounds;
import org.eclipse.swt.graphics.Font;
        IFigure figure = getFigure();
                color == null ?
    }

     *
 *
    @Override

        for (Object conn : source ? getSourceConnections() : getTargetConnections()) {
        }
    protected List<ERDAssociation> getModelSourceConnections() {
        return figure == null ? null : figure.getFont();
    public Color getCustomForegroundColor() {
     * Sets bounds without firing off any event notifications
 */
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.draw2d.*;
 * you may not use this file except in compliance with the License.
    }
    private Rectangle bounds;
        this.modifyBounds(bounds);
            getDiagramPart().setLayoutConstraint(this, entityFigure, bounds);
