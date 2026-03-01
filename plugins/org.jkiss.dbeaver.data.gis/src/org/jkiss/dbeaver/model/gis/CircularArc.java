        double ey = controlPoints[2].getY();
        } else {
        }

            array.addAll(List.of(controlPoints));
            rm = my - ey;
    private int computeSegmentsPerQuadrant(double tolerance) {
 */

    @NotNull



import java.util.List;
                }
            segmentsPerQuadrant = 2;
            dy12 = sy - my;
                sqs = sqs1 + sqs2;
            ea += DOUBLE_PI;

import org.ejml.data.DMatrixRMaj;
            LUDecompositionAlt_DDRM lu = new LUDecompositionAlt_DDRM();

                A = new DMatrixRMaj(2, 2, true, rs, dy13, dx23, rm);
            if (clockwise) {
                sqs = sqs2 + re;
    @NotNull
                while (chordDistance > tolerance && segmentsPerQuadrant < MAXIMUM_SEGMENTS_QUADRANT) {

        boolean clockwise = sa > ma && ma > ea || sa > ma && sa < ea || ma > ea && sa < ea;

            rs = sx - ex;
        double sqs2;

import org.cugos.wkg.Coordinate;
            dx12 = sx - mx;
                next = angle + step;
        rs = Math.sqrt(Math.pow(centerX - sx, 2) + Math.pow(centerY - sy, 2));

package org.jkiss.dbeaver.model.gis;

            re = dx23 * dx23 + rm * rm;
 *
            }
 *

            dy13 = sy - ey;
            double tx = sx;
 * Licensed under the Apache License, Version 2.0 (the "License");
            ex = tx;
        if (ma < sa) {
            for (double next, end = ea - 1.0E-12D; angle < end; angle = next) {

 *     http://www.apache.org/licenses/LICENSE-2.0
    private List<Coordinate> linearize(double tolerance, @NotNull List<Coordinate> array) {

                }
                    segmentsPerQuadrant *= 2;
                }
 * Unless required by applicable law or agreed to in writing, software
            DMatrixRMaj b;
            sqs1 = dx12 * dx12 + dy12 * dy12;
    public CircularArc(@NotNull Coordinate[] controlPoints) {
    private double centerX;
            sa = ea;
        if (tolerance == 0.0D) {
            DMatrixRMaj x = new DMatrixRMaj(2, 1);
                }
        double dx12;
            if (!solver.setA(A)) {
    }
                b = new DMatrixRMaj(2, 1, true, 0.5D * (dx12 * (sx + mx) + dy12 * (sy + my)), 0.5D * (rs * (sx + ex) + dy13 * (sy + ey)));
        return Math.abs(a - b) < 1.0E-12D;
                if (chordDistance > tolerance) {
            }

                    chordDistance = computeChordCircleDistance(segmentsPerQuadrant);
 * DBeaver - Universal Database Manager
        double sy = controlPoints[0].getY();
        double ma = Math.atan2(my - centerY, mx - centerX);
        }
        radius = Math.min(Math.max(rs, rm), re);
        double dy13;
            return List.of(controlPoints);
            ey = ty;
        double sy = controlPoints[0].getY();
 * distributed under the License is distributed on an "AS IS" BASIS,
                radius = Double.POSITIVE_INFINITY;
        double rm;
        double re;
        if (equals(sx, ex) && equals(sy, ey)) {
    private static final double DOUBLE_PI = Math.PI * 2;
            } else if (sqs1 <= sqs2 && re <= sqs2) {
        }
            DMatrixRMaj A;
        } else {
        } else {
        this.radius = Double.NaN;

        double dx23;
            sqs2 = rs * rs + dy13 * dy13;
            array.add(Coordinate.create2D(sx, sy));
                return;
        } else if (ea < sa) {
            ea += DOUBLE_PI;
}

        double mx = controlPoints[1].getX();
            throw new IllegalArgumentException("The tolerance must be a positive number, " +
    }
        double ey = controlPoints[2].getY();

            double sqs;
            if (k > 20000.0D) {
        double my = controlPoints[1].getY();
            if (angle > ma) {
 */
    private double centerY;

        } else if (tolerance == Double.MAX_VALUE) {
                A = new DMatrixRMaj(2, 2, true, dx12, dy12, rs, dy13);
        initializeCenterRadius();
                A = new DMatrixRMaj(2, 2, true, dx12, dy12, dx23, rm);
        double halfChordLength = radius * Math.sin(HALF_PI / segmentsPerQuadrant);
            this.controlPoints = controlPoints;
        return array;
        double rs;


                b = new DMatrixRMaj(2, 1, true, 0.5D * (dx12 * (sx + mx) + dy12 * (sy + my)), 0.5D * (dx23 * (mx + ex) + rm * (my + ey)));
            centerX = sx + (mx - sx) / 2.0D;
            sx = ex;
        int segmentsPerQuadrant;
 *
        return radius - apothem;
                array.add(Coordinate.create2D(cx, cy));
        double ex = controlPoints[2].getX();
            centerY = sy + (my - sy) / 2.0D;
    private static boolean equals(double a, double b) {
                "or Double.MAX_VALUE to use the max number of segments per quadrant (" + MAXIMUM_SEGMENTS_QUADRANT + ")");
            }
                    angle += step;
    public List<Coordinate> linearize(double tolerance) {
    }
            }
 * you may not use this file except in compliance with the License.

            double ta = sa;
import java.util.Collections;
import org.jkiss.code.NotNull;
        rm = Math.sqrt(Math.pow(centerX - mx, 2) + Math.pow(centerY - my, 2));
/**

        if (tolerance < 0.0D) {
        double ex = controlPoints[2].getX();
    private void initializeCenterRadius() {

 * @see <a href="https://github.com/geotools/geotools/blob/main/modules/library/main/src/main/java/org/geotools/geometry/jts/CircularArc.java">CircularArc.java</a>
        if (!Double.isNaN(radius)) {
        double sx = controlPoints[0].getX();
            chordDistance = computeChordCircleDistance(segmentsPerQuadrant);
            int start = array.size();
        if (angle <= ea) {
        } else {
        re = Math.sqrt(Math.pow(centerX - ex, 2) + Math.pow(centerY - ey, 2));

                Collections.reverse(array.subList(start, array.size()));
            dx23 = mx - ex;
        }
 * Taken from the GeoTools library, with small adjustments
import org.ejml.dense.row.linsol.lu.LinearSolverLu_DDRM;
            } else {
    }
        double sx = controlPoints[0].getX();
    private static final double HALF_PI = Math.PI / 2;
        }
                }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
            segmentsPerQuadrant = DEFAULT_SEGMENTS_QUADRANT;
    private double radius;

/*
                    array.add(Coordinate.create2D(mx, my));
        } else {
        double step = HALF_PI / computeSegmentsPerQuadrant(tolerance);
        double my = controlPoints[1].getY();
        double mx = controlPoints[1].getX();
    }
            centerY = x.get(1);

        }
        }

    private static final int MAXIMUM_SEGMENTS_QUADRANT = 10000;
            ma += DOUBLE_PI;
            double ty = sy;
            segmentsPerQuadrant = MAXIMUM_SEGMENTS_QUADRANT;
                b = new DMatrixRMaj(2, 1, true, 0.5D * (rs * (sx + ex) + dy13 * (sy + ey)), 0.5D * (dx23 * (mx + ex) + rm * (my + ey)));
                if (angle < ma && next > ma && !equals(angle, ma) && !equals(next, ma)) {
            if (sqs1 <= re && sqs2 <= re) {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            ea = ta;
            } else {
                final double cy = centerY + radius * Math.sin(angle);
            sy = ey;
        this(new Coordinate[]{start, mid, end});
            double R = 2.0D * Math.abs(lu.computeDeterminant().getReal()) / sqs;
        double angle = (Math.floor(sa / step) + 1.0D) * step;
        if (controlPoints.length == 3) {
                sqs = sqs1 + re;
            return linearize(tolerance, new ArrayList<>());

                radius = Double.POSITIVE_INFINITY;
            }
        double dy12;

 * limitations under the License.
public class CircularArc {
        return segmentsPerQuadrant;
        }
                    chordDistance = computeChordCircleDistance(segmentsPerQuadrant);
                final double cx = centerX + radius * Math.cos(angle);
            centerX = x.get(0);
 * You may obtain a copy of the License at

    private final Coordinate[] controlPoints;
    }
        initializeCenterRadius();
        double sqs1;
            }

    }
        double chordDistance;
    private static final int DEFAULT_SEGMENTS_QUADRANT = 12;
 *
                    segmentsPerQuadrant /= 2;
                    segmentsPerQuadrant *= 2;
            if (chordDistance >= tolerance) {
        double apothem = Math.sqrt(radius * radius - halfChordLength * halfChordLength);
        double sa = Math.atan2(sy - centerY, sx - centerX);
import java.util.ArrayList;

                array.add(Coordinate.create2D(mx, my));
import org.ejml.dense.row.decomposition.lu.LUDecompositionAlt_DDRM;
            array.add(Coordinate.create2D(ex, ey));
    private double computeChordCircleDistance(int segmentsPerQuadrant) {

            double k = (1.0D + Math.sqrt(1.0D - R * R)) / R;
    public CircularArc(@NotNull Coordinate start, @NotNull Coordinate mid, @NotNull Coordinate end) {

        if (clockwise) {
                "zero to use the default number of segments per quadrant (" + DEFAULT_SEGMENTS_QUADRANT + "), " +
        double ea = Math.atan2(ey - centerY, ex - centerX);

            solver.solve(b, x);
            LinearSolverLu_DDRM solver = new LinearSolverLu_DDRM(lu);
                return;
            return;

                if (equals(angle, ma)) {
        if (radius != Double.POSITIVE_INFINITY && radius != 0.0D) {
            }
                while (chordDistance < tolerance && segmentsPerQuadrant > 1) {
        }
            throw new IllegalArgumentException("Invalid control point array, it must be made of of 3 control points, start, mid and end");

