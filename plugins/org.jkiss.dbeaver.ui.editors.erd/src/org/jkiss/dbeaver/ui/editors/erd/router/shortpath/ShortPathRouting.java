
                current.translateToRelative(start);
                int dx1 = (int) (Math.cos(Math.toRadians(direction1)) * indentation);
        return Collections.emptyList();

            if (path == null) {
            queueSomeRouting();
        }
            // Make sure one of the remaining is revalidated so that we can
                    direction1 = 180 - getDirection(bounds, points.getPoint(0).getCopy());
            direction = RIGHT;
        getContainer().getChildren().forEach(this::addChild);
                return;
            // re-route again.
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
        } else {
            } else {
    }
    private Map<Connection, Path> connectionToPaths;
        if (i <= distance) {
        if (connectionToPaths == null) {
        while (iter.hasNext()) {
     * Sets the value indicating if connection invalidation should be ignored.
    public void invalidate(Connection connection) {
            figuresToBounds = null;
                if (srcOwner instanceof EntityFigure) {
        if (connectionToPaths.isEmpty()) {
     *
    public void setIgnoreInvalidate(boolean b) {
                        }
        if (ignoreInvalidate) {
                connectionToPaths.put(conn, path);
    private class LayoutTracker extends LayoutListener.Stub {
                    srcTrgAngel = 90 - getDirection(bounds, points.getPoint(0));
            hookAll();
        paths = algorithm.solve();

    }

    /**
    /**
                    trgSrcAngel = -90 + getDirection(bounds, points.getPoint(points.size() - 1));
            if (staleConnections.isEmpty()) {
        }

     * Returns true if the given connection is routed by this router, false
        if (connectionToPaths == null) {
                int dxTrgSrc = (int) (Math.cos(Math.toRadians(trgSrcAngel)) * indentation);
                Point p2 = new Point(end.x - dx2, end.y - dy2);
                    Rectangle rectangle = entry.getValue();
                current.translateToAbsolute(ref1);
                            firstPoint = new Point(firstPoint.x + dxSrcTrg, firstPoint.y - dySrcTrg);
 *
        Rectangle bounds = child.getBounds().getCopy();
     * not dirty may change as well, as a consequence of new routings.
    private boolean ignoreInvalidate;

     * Sets the default space that should be maintained on either side of a
        for (Path path : paths) {
        int i = 0;
        i = Math.abs(r.bottom() - p.y);
import org.eclipse.draw2d.geometry.Point;
        return connectionToPaths != null && connectionToPaths.containsKey(conn);
        // require to solve for new route calculation
                    }
    public double getIndentation() {
        }
        }
                        if (dxEnd == 0 && dyEnd < POINT_DISTANCE) {
    }
     * otherwise
            isDirty = true;
            return;
                path.setBendPoints(bends);

 * You may obtain a copy of the License at
                }
            return;
import org.eclipse.draw2d.geometry.PrecisionPoint;
    @Override
                }
        return direction;
                    }
    /**
     * Gets the constraint for the given {@link Connection}. The constraint is the

        if (change) {
            ignoreInvalidate = true;
    }
        }


            return algorithm.solve();
        if (i <= distance) {
    private Map<IFigure, Rectangle> figuresToBounds;
    private final Map<Connection, Object> constraintMap = new HashMap<>();
    private final FigureListener figureListener = source -> {
        Path path = connectionToPaths.remove(connection);
        } finally {
                current.translateToRelative(end);
                Point end = current.getTargetAnchor().getLocation(ref2).getCopy();
               
    private static final int RIGHT = 180;
            if (!constraint.isEmpty()) {
                    modifiedPoints.addPoint(points.getPoint(i));
            PointList actualBendPoints = new PointList(bendPoints.size());
            return;
        boolean change = algorithm.removeObstacle(bounds);
                    bends.addPoint(bp.getLocation());
    void removeChild(IFigure child) {

    /**

            getContainer().translateToRelative(start);
        algorithm.setSpacing(spacing);
        figuresToBounds.put(source, newBounds);
    }
                    for (int i = 0; i < entry.getKey().getPoints().size(); i++) {
        return algorithm.getSpacing();
                for (Entry<IFigure, Rectangle> entry : figuresToBounds.entrySet()) {
    @Override
     * This method checks and remove bend point if it overlap entity
    }

        }
     */
                modifiedPoints.addPoint(points.getFirstPoint());
    public boolean hasMoreConnections() {
        return paths;
    }
                    Rectangle bounds = ((EntityFigure) srcOwner).getBounds().getCopy();

    private static final int DOWN = -90;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        }
                // first

        staleConnections.remove(connection);
            }
     * from the obstacles. The default value is 4.
                            Point endPoint = points.getPoint(points.size() - 1);
                constraint = Collections.emptyList();
                        if (dxStart == 0 && dyStart < POINT_DISTANCE) {

            staleConnections.iterator().next().revalidate();
        if (isDirty) {
            getContainer().translateToRelative(end);
        getConnectionPoints().put(connection, new PointList());
     * 
            Point end = conn.getTargetAnchor().getReferencePoint().getCopy();


import java.util.*;
        }
            ignoreInvalidate = true;
            removeChild(child);
        algorithm.removePath(path);

    }
            connectionToPaths.keySet().iterator().next().revalidate();
    }
            Connection conn = iter.next();
     * connection. This causes the connections to be separated from each other and
public class ShortPathRouting extends ERDConnectionRouter {
            Iterator<IFigure> figureItr = figuresToBounds.keySet().iterator();
    /**
     * The method returns indentation value
                // from 1<<--2
 * See the License for the specific language governing permissions and
        if (i < distance) {
            }
            }
                Point p1 = new Point(start.x + dx1, start.y - dy1);
     * @param path - path
        return connectionToPaths != null && !connectionToPaths.isEmpty();
        getContainer().addLayoutListener(listener);
        }

        constraintMap.put(connection, constraint);
            isDirty = false;
/*
        figuresToBounds.remove(child);
                int trgSrcAngel = 0;
        if (isDirty) {
import org.eclipse.draw2d.graph.Path;

        if (iter.hasNext() && connectionToPaths == null) {
    private void removeOverlappingBendPoints(Path path) {
                int dy1 = (int) (Math.sin(Math.toRadians(direction1)) * indentation);
            ignoreInvalidate = false;
        if (connectionToPaths == null) {
                if (requireToSkipp) {
package org.jkiss.dbeaver.ui.editors.erd.router.shortpath;
    private static final int POINT_DISTANCE = 7;
     * ConnectionRouter#remove(Connection)
     * Returns the default spacing maintained on either side of a connection. The
                int direction2 = 0;

        child.removeFigureListener(figureListener);
    /**
                            points.setPoint(firstPoint, 0);
                }
        }
        }
    };
     */
 *

 * you may not use this file except in compliance with the License.
            }
                int dxSrcTrg = (int) (Math.cos(Math.toRadians(srcTrgAngel)) * indentation);
                    }
        }
                // Must use iterator's remove to avoid concurrent modification

            distance = i;
        isDirty = true;
                int direction1 = 0;

                PointList points = path.getPoints().getCopy();
            direction = DOWN;
        return isDirty;
                            end = new Point(end.x - dxTrgSrc, end.y - dyTrgSrc);
                            endPoint = new Point(endPoint.x - dxTrgSrc, endPoint.y - dyTrgSrc);
     * paths list of bend points for this connection.


        }
                    if (rectangle.contains(bp)) {
        ignoreInvalidate = b;
        }
                IFigure srcOwner = current.getSourceAnchor().getOwner();
    @Override
        if (connectionToPaths == null || connectionToPaths.isEmpty()) {
            processStaleConnections();
    private double indentation = 30.0;
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouter;
            addChild(child);
        if (figuresToBounds != null) {
     * default value is 4.
                        break;
            processStaleConnections();
                IFigure child = figureItr.next();
            while (figureItr.hasNext()) {
     */
     * ConnectionRouter#invalidate(Connection)
    public void setSpacing(int spacing) {
                points.setPoint(end, points.size() - 1);
     */
            return;
        }
            path.setBendPoints(actualBendPoints);
        }
            List<Path> paths = computePaths();
        isDirty = true;
        figuresToBounds.put(child, bounds);
            return;
                path.setBendPoints(null);
                int dy2 = (int) (Math.sin(Math.toRadians(direction2)) * indentation);

            Connection current;
            connectionToPaths = new HashMap<>();
    /**
    @Override
                    Rectangle bounds = ((EntityFigure) targetOwner).getBounds().getCopy();
                        int dyEnd = Math.abs(end.y - p.y);
                current.revalidate();
        int distance = Math.abs(r.x - p.x);
    private static final int UP = 90;
            isDirty = true;
            Path path = connectionToPaths.get(conn);

        // this is a way to get List<Path> from algorithm
                current = (Connection) path.data;
            for (int index = 0; index < bendPoints.size(); index++) {
            List<Object> constraint = (List<Object>) getConstraint(conn);
 * DBeaver - Universal Database Manager
        figuresToBounds = new HashMap<>();
     * outstanding connections that need to be routed
    }
                        int dxStart = Math.abs(start.x - p.x);
 * Unless required by applicable law or agreed to in writing, software
                figureItr.remove();
            @SuppressWarnings("unchecked")

    public void route(Connection conn) {
    private List<Path> computePaths() {
            isDirty = false;
    }
                boolean requireToSkipp = false;
                        continue;
                    Bendpoint bp = (Bendpoint) element;
        if (figuresToBounds.containsKey(child)) {


import java.util.Map.Entry;
            }
    }
 */
        i = Math.abs(r.right() - p.x);
                path = new Path(conn);
                if (current.getSourceAnchor().getOwner() instanceof EntityFigure) {
        getContainer().removeLayoutListener(listener);
        try {
    }
                }
                actualBendPoints.addPoint(bp);
    }
        Rectangle newBounds = source.getBounds().getCopy();
     */
     */
     * All connection paths after routing dirty paths. Some of the paths that were
    /**
                    direction2 = getDirection(bounds, points.getPoint(points.size() - 1).getCopy());
                        int dyStart = Math.abs(start.y - p.y);
    protected int getDirection(Rectangle r, Point p) {
                            start = new Point(start.x + dxSrcTrg, start.y - dySrcTrg);
     */
            unhookAll();
    /**
    private void hookAll() {
        if (bendPoints != null) {
     */
                    Rectangle bounds = ((EntityFigure) current.getSourceAnchor().getOwner()).getBounds().getCopy();

 * limitations under the License.
    public List<?> getPathsAfterRouting() {
                }
    }
    private final Set<Connection> staleConnections = new HashSet<>();
        }
import org.eclipse.draw2d.*;


                            Point firstPoint = points.getPoint(0);
                    if (entry.getKey().equals(current)) {

                        requireToSkipp = true;
        List<Path> paths = algorithm.solve();
            for (Path path : paths) {

                for (int i = 1; i < points.size() - 1; i++) {
                    Rectangle bounds = ((EntityFigure) current.getTargetAnchor().getOwner()).getBounds().getCopy();
        staleConnections.add(connection);
                IFigure targetOwner = current.getTargetAnchor().getOwner();
                for (Object element : constraint) {
                // from 1-->>2
        public void postLayout(IFigure container) {
                PointList modifiedPoints = new PointList();
        PointList bendPoints = path.getBendPoints();
        if (algorithm.updateObstacle(figuresToBounds.get(source), newBounds)) {
                current.translateToAbsolute(ref2);
                current.setPoints(modifiedPoints);
    void queueSomeRouting() {

                Point start = current.getSourceAnchor().getLocation(ref1).getCopy();
                int srcTrgAngel = 0;
    }
                if (targetOwner instanceof EntityFigure) {
import org.eclipse.draw2d.geometry.Rectangle;
                // end
                int dyTrgSrc = (int) (Math.sin(Math.toRadians(trgSrcAngel)) * indentation);
                if (current.getTargetAnchor().getOwner() instanceof EntityFigure) {
    public int getSpacing() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        isDirty = true;

     */
    }
                }
    private static final int LEFT = 0;
            direction = UP;
            isDirty |= path.isDirty;
        i = Math.abs(r.y - p.y);
        }
     * Returns the value indicating if the router is dirty, i.e. if there are any
     */
                        Point p = entry.getKey().getPoints().getPoint(i);
        @Override
                for (Entry<Connection, PointList> entry : getConnectionPoints().entrySet()) {

            Point start = conn.getSourceAnchor().getReferencePoint().getCopy();
import org.eclipse.draw2d.graph.ShortestPathRouter;
        this.indentation = indentation;
                        }
                modifiedPoints.addPoint(p2);
    public void setConstraint(Connection connection, Object constraint) {
            queueSomeRouting();
    private boolean isDirty;
        public void remove(IFigure child) {
            ignoreInvalidate = false;
                Point ref2 = new PrecisionPoint(points.getPoint(points.size() - 2));
            path.setEndPoint(end);
     */
    /**
                Point bp = bendPoints.getPoint(index);

        }
        return indentation;
                int dx2 = (int) (Math.cos(Math.toRadians(direction2)) * indentation);
                modifiedPoints.addPoint(points.getLastPoint());
    private final LayoutListener listener = new LayoutTracker();

    public boolean containsConnection(Connection conn) {
     */
 *     http://www.apache.org/licenses/LICENSE-2.0
                PointList bends = new PointList(constraint.size());
        }
            }
    /**
                Point ref1 = new PrecisionPoint(points.getPoint(1));
            removeOverlappingBendPoints(path);

    }
     */
        return constraintMap.get(connection);
        public void setConstraint(IFigure child, Object constraint) {
        int direction = LEFT;
        }
    }
    public void remove(Connection connection) {
    private void processStaleConnections() {
        Rectangle bounds = child.getBounds().getCopy();
        return ignoreInvalidate;
        child.addFigureListener(figureListener);
            path.setStartPoint(start);
        }
     * ConnectionRouter#route(Connection)

        constraintMap.remove(connection);
    private void unhookAll() {
    @Override
                algorithm.addPath(path);
    }
                // add other middle points
     * Returns the value indicating if connection invalidation should be ignored.
    }
                points.setPoint(start, 0);
        Iterator<Connection> iter = staleConnections.iterator();
            if (constraint == null) {
    }
}        }
    /**
            queueSomeRouting();
import org.eclipse.draw2d.geometry.PointList;
    }
        algorithm.addObstacle(bounds);
                        int dxEnd = Math.abs(end.x - p.x);
                int dySrcTrg = (int) (Math.sin(Math.toRadians(srcTrgAngel)) * indentation);
                }
        @Override
            connectionToPaths = null;
     * Method design to specify indentation value
        staleConnections.clear();
     */
    public boolean shouldIgnoreInvalidate() {
                            points.setPoint(endPoint, points.size() - 1);
    public void setIndentation(double indentation) {
                    continue;
        @Override
     */
    /**
            distance = i;
        isDirty = true;
                }
    private final ShortestPathRouter algorithm = new ShortestPathRouter();
     * Checks multiple connections
    void addChild(IFigure child) {
                removeChild(child);
                // before end
 * Copyright (C) 2010-2025 DBeaver Corp and others
        staleConnections.add(connection);
    public Object getConstraint(Connection connection) {
    }
                }
 *
            }
    /**
                modifiedPoints.addPoint(p1);
            return;
    public boolean isDirty() {
import org.jkiss.dbeaver.ui.editors.erd.figures.EntityFigure;
