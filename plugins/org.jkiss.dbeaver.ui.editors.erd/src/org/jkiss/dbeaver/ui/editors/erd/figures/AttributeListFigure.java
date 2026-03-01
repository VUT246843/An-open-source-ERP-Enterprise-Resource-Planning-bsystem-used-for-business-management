		layout.setStretchMinorAxis(true);
		layout.setMinorSpacing(2);
    public List<AttributeItemFigure> getAttributes() {
 */
    class ColumnFigureBorder extends AbstractBorder {
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
}import java.util.List;
 * DBeaver - Universal Database Manager
        layout.marginHeight = 3;
 * Copyright (C) 2010-2025 DBeaver Corp and others

/*
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
package org.jkiss.dbeaver.ui.editors.erd.figures;
 * Figure used to hold the column labels
import java.util.ArrayList;
            graphics.setForegroundColor(((EntityFigure) getParent()).getBorderColor());
        layout.verticalSpacing = 0;
        FlowLayout layout = new FlowLayout(false);
/*
 *

import org.jkiss.dbeaver.model.erd.ERDEntity;
            Rectangle rect = getPaintRectangle(figure, insets);
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;
        @Override
import org.eclipse.draw2d.geometry.Rectangle;

 *
        }
        layout.marginWidth = 5;
            graphics.drawLine(rect.getTopLeft(), tempRect.getTopRight());
        @Override
 * Unless required by applicable law or agreed to in writing, software
                result.add((AttributeItemFigure) child);

        layout.horizontalSpacing = 0;
        setOpaque(true);
    public AttributeListFigure(ERDEntity entity, boolean key) {
    }
 *
            }
 */
 *
		layout.setMinorAlignment(FlowLayout.ALIGN_TOPLEFT);
 * you may not use this file except in compliance with the License.
        setForegroundColor(ERDThemeSettings.instance.attrForeground);
        setBorder(new ColumnFigureBorder());
 */
        public void paint(IFigure figure, Graphics graphics, Insets insets) {

        public Insets getInsets(IFigure figure) {
        setBackgroundColor(ERDThemeSettings.instance.attrBackground);
        setLayoutManager(layout);
    }
            return new Insets(0, -2, -2, -2);
import org.eclipse.draw2d.*;
public class AttributeListFigure extends Figure {
        return result;

 * @author Serge Rider
        List<AttributeItemFigure> result = new ArrayList<>();
 * See the License for the specific language governing permissions and
 * Created on Jul 13, 2004
 * Licensed under the Apache License, Version 2.0 (the "License");
            graphics.setLineWidth(2);
            if (child instanceof AttributeItemFigure) {
/*
        for (Object child : getChildren()) {
        GridLayout layout = new GridLayout(2, false);

 * limitations under the License.
import org.eclipse.draw2d.geometry.Insets;

        }
*/
/**

