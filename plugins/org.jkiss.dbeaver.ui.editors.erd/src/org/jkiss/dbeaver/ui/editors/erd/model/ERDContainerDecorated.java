
            NodeVisualInfo visualInfo = part.getDiagram().getVisualInfo(part.getEntity().getObject());
        public Rectangle initBounds;
import org.eclipse.swt.graphics.Font;
    ERDAttributeVisibility getAttributeVisibility();
            if (visualInfo != null) {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDViewStyle;
 * DBeaver - Universal Database Manager
            NodeVisualInfo visualInfo = part.getDiagram().getVisualInfo(part.getNote());
                this.bgColor = figure.getBackgroundColor();
            init(part);
                this.zOrder = visualInfo.zOrder;
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.erd.ERDContainer;
        }
            init(part);
                this.fgColor = figure.getForegroundColor();
    NodeVisualInfo getVisualInfo(DBSEntity entity, boolean create);
    boolean hasAttributeStyle(@NotNull ERDViewStyle style);
            this.initBounds = part.getBounds();
        }
            }
    ERDDecorator getDecorator();
                this.font = figure.getFont();
        public NodeVisualInfo(EntityPart part) {
                this.transparent = !figure.isOpaque();
 *
import org.jkiss.dbeaver.ui.editors.erd.part.NotePart;


 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

public interface ERDContainerDecorated extends ERDContainer {
            if (visualInfo != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,


    @NotNull
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
 *
 * You may obtain a copy of the License at
            }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.draw2d.IFigure;
 * ERD object container (diagram)
        private void init(NodePart part) {
package org.jkiss.dbeaver.ui.editors.erd.model;
            if (figure != null) {
 * limitations under the License.
                this.zOrder = visualInfo.zOrder;
 */
        public Color fgColor;
        public NodeVisualInfo(NotePart part) {
import org.eclipse.swt.graphics.Color;

        }
        public NodeVisualInfo() {
            IFigure figure = part.getFigure();
        }
    }
import org.jkiss.dbeaver.model.erd.ERDAttributeVisibility;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public int borderWidth = -1;
            }
/*
}
        public Font font;
        public int zOrder = 0;


        public boolean transparent;
        public ERDAttributeVisibility attributeVisibility;
import org.jkiss.dbeaver.model.struct.DBSEntity;
import org.eclipse.draw2d.geometry.Rectangle;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.ui.editors.erd.part.NodePart;

 * Unless required by applicable law or agreed to in writing, software
        public Color bgColor;
    class NodeVisualInfo {
 *
/**
