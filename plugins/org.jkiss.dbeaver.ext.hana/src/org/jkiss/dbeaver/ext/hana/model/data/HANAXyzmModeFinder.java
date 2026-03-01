     *            A geometry. Must not be null.
 *
                someHaveM = true;
 * limitations under the License.
                allHaveZ = false;
            }
 *    Stefan Uhrig - initial implementation


     */
        return instance.inspect(g);
 *


            inspectLineString(pg.getInteriorRingN(i));
    }
        for (int i = 0; i < numHoles; ++i) {
    }
 * Find the XYZM mode of a geometry instance.
    private void inspectGeometry(Geometry g) {
     *
        } else if (allHaveZ) {
        for (int i = 0; i < size; ++i) {
        }
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
     * Finds the XYZM mode of a geometry.
public class HANAXyzmModeFinder {
    }
            inspectCollection((GeometryCollection) g);
import org.jkiss.dbeaver.ext.hana.model.data.wkb.XyzmMode;
 * Unless required by applicable law or agreed to in writing, software
    private void inspectCollection(GeometryCollection gc) {
    }

    private void inspectPolygon(Polygon pg) {
    private boolean allHaveZ = true;
        int size = cs.size();
        } else if (g instanceof LineString) {
     * @return Returns the appropriate XYZM mode.
 */

    }
        inspectSequence(ls.getCoordinateSequence());
            inspectPoint((Point) g);
        }
        } else if (g instanceof GeometryCollection) {
/**
    private void inspectPoint(Point p) {
        } else if (someHaveM) {

        inspectSequence(p.getCoordinateSequence());
            }
 *
    }
            }
 *
 * You may obtain a copy of the License at
    public static XyzmMode findXyzmMode(Geometry g) {
    private XyzmMode inspect(Geometry g) {
}
            inspectGeometry(gc.getGeometryN(i));
        if (size == 0) {
            throw new AssertionError("Unknown geometry type " + g.getClass());
        int numGeometries = gc.getNumGeometries();
            }
 *
            if (cs.hasM()) {
        } else {
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        if (allHaveZ && someHaveM) {
            if (Double.isFinite(cs.getM(i))) {
            inspectLineString((LineString) g);
        inspectGeometry(g);
        } else if (g instanceof Polygon) {
package org.jkiss.dbeaver.ext.hana.model.data;
 * point has a m-coordinate to find the proper XYZM mode.
        if (g instanceof Point) {
            return XyzmMode.XYZ;
    }
                allHaveZ = false;
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * you may not use this file except in compliance with the License.
            return XyzmMode.XYM;
        inspectLineString(pg.getExteriorRing());
    private void inspectSequence(CoordinateSequence cs) {
    /**

 * DBeaver - Universal Database Manager
    private HANAXyzmModeFinder() {
 * don't have a third ordinate (i.e. it is NaN). This class checks the
 * coordinate sequences and checks if all points have a z-coordinate and if any
            inspectPolygon((Polygon) g);

        HANAXyzmModeFinder instance = new HANAXyzmModeFinder();
        }
        } else {
            if (!cs.hasZ()) {


 */
            return XyzmMode.XYZM;
            return XyzmMode.XY;
        }
     * @param g
        int numHoles = pg.getNumInteriorRing();
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
    private boolean someHaveM = false;
 * See the License for the specific language governing permissions and
    private void inspectLineString(LineString ls) {
 * JTS coordinate sequences are often three-dimensional, but their coordinates
        for (int i = 0; i < numGeometries; ++i) {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.locationtech.jts.geom.*;
            if (!Double.isFinite(cs.getZ(i))) {
 * Contributors:
                someHaveM = true;
