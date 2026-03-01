            case ONE_OR_MANY:
        // points: circle
                g.drawLine(crowsFootPoints.getPoint(3), crowsFootPoints.getPoint(4));
                g.fillOval(point.x - 4, point.y - 4, 8, 8);
                break;
                g.drawLine(crowsFootPoints.getPoint(1), crowsFootPoints.getPoint(2));
        geometryList.addPoint(-2, -1);
import org.eclipse.draw2d.geometry.PointList;
 * You may obtain a copy of the License at
 *
    @Override
        // points: dash 2
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.ui.editors.erd.notation.crowsfoot;
 *
            case ZERO:
            case ONE_ONLY:
 * DBeaver - Universal Database Manager
        geometryList.addPoint(-2, 0);
        PointList crowsFootPoints = getPoints();
        setTemplate(geometryList);
    }
        geometryList.addPoint(-2, 1);
    protected void outlineShape(Graphics g) {
                break;
 * Licensed under the Apache License, Version 2.0 (the "License");
            case ZERO_OR_MANY:
                // no default behavior
                g.drawLine(crowsFootPoints.getPoint(5), crowsFootPoints.getPoint(6));
 *     http://www.apache.org/licenses/LICENSE-2.0
            case MANY:
                g.drawLine(crowsFootPoints.getPoint(1), crowsFootPoints.getPoint(2));

/*
        geometryList.addPoint(-3, 1);
                break;
                g.drawLine(crowsFootPoints.getPoint(3), crowsFootPoints.getPoint(4));
                g.fillOval(point.x - 4, point.y - 4, 8, 8);
import org.eclipse.draw2d.geometry.Point;
                break;
 * limitations under the License.
        }
            case ZERO_OR_ONE:
 * Unless required by applicable law or agreed to in writing, software
                g.drawOval(point.x - 4, point.y - 4, 8, 8);
                g.drawOval(point.x - 4, point.y - 4, 8, 8);
                g.fillOval(point.x - radius, point.y - radius, DIAMETER, DIAMETER);
    private ERDAssociationType association;

public class CrowsFootPolylineDecoration extends PolylineDecoration {
    public CrowsFootPolylineDecoration(ERDAssociationType association) {
    private static PointList geometryList = new PointList();
                g.drawOval(point.x - radius, point.y - radius, DIAMETER, DIAMETER);
        Point point;
 *
import org.eclipse.draw2d.Graphics;
                break;

        geometryList.addPoint(-3, 0);
                g.drawLine(crowsFootPoints.getPoint(1), crowsFootPoints.getPoint(2));
        switch (association) {
        // points: dash 1
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDAssociationType;

import org.eclipse.draw2d.PolylineDecoration;
                break;
}
                g.drawLine(crowsFootPoints.getPoint(0), crowsFootPoints.getPoint(1));
 * distributed under the License is distributed on an "AS IS" BASIS,
        geometryList.addPoint(0, 1);
                g.drawLine(crowsFootPoints.getPoint(3), crowsFootPoints.getPoint(4));
        setScale(5, 5);
                point = crowsFootPoints.getPoint(7);
                point = crowsFootPoints.getPoint(7);
                g.drawLine(crowsFootPoints.getPoint(0), crowsFootPoints.getPoint(1));
        geometryList.addPoint(-6, 0);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        geometryList.addPoint(-3, -1);
        geometryList.addPoint(0, -1);
    static {
            default:
                point = crowsFootPoints.getPoint(7);
        int radius = DIAMETER / 2;
                g.drawLine(crowsFootPoints.getPoint(0), crowsFootPoints.getPoint(1));
        // top
    }
    private static final int DIAMETER = 8;
                break;
        this.association = association;

        // points: crowsfoot
