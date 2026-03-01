    }
    
import org.eclipse.core.runtime.CoreException;
/*
 */
        super(resource);
        this.node = node;
    protected DBSObject getDatabaseObject() {
    private final String nodeItemPath;
        this.nodeItemPath = node.getNodeUri();

    protected DBNNode getNode() {
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Copyright (C) 2017-2018 Alexander Fedorov (alexander.fedorov@jkiss.org)
 * See the License for the specific language governing permissions and
            Object[] attributes = marker.getAttributes(ATTRIBUTE_NAMES);


        }


 *
 * DBeaver - Universal Database Manager
        DBMarkers.MARKER_ATTRIBUTE_NODE_PATH };
    public DatabaseMarkerAnnotationModel(DBSObject databaseObject, DBNDatabaseNode node, IResource resource) {

}
 * limitations under the License.
        return databaseObject;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    private final String datasourceId;
        } catch (CoreException e) {
        this.databaseObject = databaseObject;
        if (!acceptable) {
import org.jkiss.dbeaver.runtime.DBMarkers;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
        return node;
    private final static String[] ATTRIBUTE_NAMES = new String[] { //

    }
    private final DBSObject databaseObject;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        boolean acceptable = super.isAcceptable(marker);
    @Override
    }
            log.log(e.getStatus());
    private final DBNNode node;
package org.jkiss.dbeaver.ui.editors.text;

import org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel;
        this.datasourceId = databaseObject.getDataSource().getContainer().getId();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.core.resources.IResource;
            return false;
 *
    protected boolean isAcceptable(IMarker marker) {
        DBMarkers.MARKER_ATTRIBUTE_DATASOURCE_ID, //
 * You may obtain a copy of the License at
        }
import org.eclipse.core.resources.IMarker;
                nodeItemPath.equals(attributes[1]);
import org.jkiss.dbeaver.Log;


        try {
public class DatabaseMarkerAnnotationModel extends ResourceMarkerAnnotationModel {
            return false;
    private static final Log log = Log.getLog(DatabaseMarkerAnnotationModel.class);
 * Unless required by applicable law or agreed to in writing, software
    }
            return datasourceId.equals(attributes[0]) &&
import org.jkiss.dbeaver.model.navigator.DBNNode;
 * distributed under the License is distributed on an "AS IS" BASIS,
