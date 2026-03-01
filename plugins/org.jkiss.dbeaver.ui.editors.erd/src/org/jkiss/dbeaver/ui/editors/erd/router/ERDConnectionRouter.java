     *
     * Set container
    
     */
        return container;
    /**

import org.eclipse.draw2d.Connection;
     */
 * limitations under the License.
import org.eclipse.draw2d.PolylineConnection;

     * @return - map of points related to connection
 * See the License for the specific language governing permissions and
     * Connection to points
    /**
/**
 * DBeaver - Universal Database Manager

    @Override


     */
    public IFigure getContainer() {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.editors.erd.connector.ERDConnection;
        getConnectionPoints().clear();
import java.util.Map;
 * you may not use this file except in compliance with the License.
 *
     * Return a container
import org.eclipse.draw2d.IFigure;
    }
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
     *
     * @param figure - container
import org.eclipse.draw2d.AutomaticRouter;
     *

 * You may obtain a copy of the License at
 *
     * @return
}
 */
    private IFigure container;

    }
    public void setContainer(IFigure figure) {
     */
     * Get instance of connection

    /**
 * Unless required by applicable law or agreed to in writing, software
 * Generic interface designed to set container for particular router
        this.container = figure;
    protected void handleCollision(PointList list, int index) {
public abstract class ERDConnectionRouter extends AutomaticRouter {
        // here considering reset points if container reset
import java.util.HashMap;
        // TODO Auto-generated method stub
/*
        return new ERDConnection();
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
 */
    public PolylineConnection getConnectionInstance() {
    public Map<Connection, PointList> getConnectionPoints() {
import org.eclipse.draw2d.geometry.PointList;
    }
    private final Map<Connection, PointList> connection2points = new HashMap<>();
 *
        return connection2points;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.editors.erd.router;
 * Licensed under the Apache License, Version 2.0 (the "License");
