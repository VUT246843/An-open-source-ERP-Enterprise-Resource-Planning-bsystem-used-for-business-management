    }
    public Insets getInsets(IFigure figure) {
        graphics.setLineStyle(this.lineStyle);
        tempRect.shrink(rlbWidth / 2, rlbWidth / 2);
    }
    public RoundedLineBorder(Color c, int width, int arcLength, int lineStyle) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        tempRect.setBounds(getPaintRectangle(figure, insets));

 *
 * you may not use this file except in compliance with the License.
    }
        }

            graphics.setForegroundColor(this.getColor());
    public void paint(IFigure figure, Graphics graphics, Insets insets) {
import org.eclipse.draw2d.IFigure;
        return margin <= 0 ? super.getInsets(figure) : new Insets(margin);
        this.lineStyle = lineStyle;
        this.lineStyle = lineStyle;
 * See the License for the specific language governing permissions and
}
 * distributed under the License is distributed on an "AS IS" BASIS,
    private int margin = 0;
        super(width);


 *
    }
 *
        this.arcLength = arcLength;
        this.arcLength = arcLength;

    public RoundedLineBorder(int width, int arcLength, int lineStyle) {
    public RoundedLineBorder(Color c, int width, int arcLength) {
        super(c, width);

    }
        if (rlbWidth % 2 == 1) {
        this.margin = margin;
 * DBeaver - Universal Database Manager
        if (this.getColor() != null) {
 * Unless required by applicable law or agreed to in writing, software
    protected int lineStyle = 1;
        graphics.setLineWidth(rlbWidth);

            tempRect.width--;
        int rlbWidth = this.getWidth();
        super(width);
    @Override

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.graphics.Color;
import org.eclipse.draw2d.geometry.Insets;
            tempRect.height--;
    }
/*
import org.eclipse.draw2d.Graphics;
 * limitations under the License.

        this.arcLength = arcLength;
 * Copyright (C) 2010-2025 DBeaver Corp and others

    public void setMargin(int margin) {

 *     http://www.apache.org/licenses/LICENSE-2.0
        super(c, width);
        graphics.drawRoundRectangle(tempRect, this.arcLength, this.arcLength);
    public RoundedLineBorder(int width, int arcLength) {
        }
package org.jkiss.dbeaver.ui.editors.erd.figures;
    protected int arcLength;
public class RoundedLineBorder extends LineBorder {
import org.eclipse.draw2d.LineBorder;
 */
    }
        this.arcLength = arcLength;
