                return (handler.getFeatures(resource) & DBPResourceHandler.FEATURE_OPEN) != 0;
        if (handler == null) {

 * Licensed under the Apache License, Version 2.0 (the "License");
                return (handler.getFeatures(resource) & DBPResourceHandler.FEATURE_CREATE_FOLDER) != 0;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
            case PROP_IS_FOLDER:
                final DBPResourceHandler resourceHandler = workspace.getResourceHandler(resource);
            case PROP_CAN_SET_ACTIVE: {
    public static final String PROP_IS_FOLDER = "isFolder";
                return !(resource instanceof EFSNIOResource) && resource.getLocation() != null;
                   (workspace.getActiveProject() instanceof RCPProject rcpProject && resource != rcpProject.getEclipseProject());
        }
    public static final String PROP_CAN_CREATE_FOLDER = "canCreateFolder";
import org.eclipse.core.expressions.PropertyTester;
            return false;

    public static final String PROP_CAN_DELETE = "canDelete";
public class ResourcePropertyTester extends PropertyTester
 */
    public static final String PROP_CAN_SET_ACTIVE = "canSetActive";
 * distributed under the License is distributed on an "AS IS" BASIS,
                return resource instanceof IFolder;
        super();
            return false;
/*
{
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0

    public static final String PROP_IS_LOCAL_FS = "isLocalFS";
                return handler instanceof DBPResourceCreator && (handler.getFeatures(resource) & DBPResourceCreator.FEATURE_CREATE_FILE) != 0;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
        }
    }
            case PROP_CAN_DELETE:

import org.eclipse.core.resources.IFolder;
                return (handler.getFeatures(resource) & DBPResourceHandler.FEATURE_CREATE_FOLDER) != 0 && !resource.isLinked(IResource.CHECK_ANCESTORS);
            case PROP_CAN_CREATE_LINK:

            }
        switch (property) {
    public static final String PROP_CAN_CREATE_LINK = "canCreateLink";
        DBPResourceHandler handler = workspace.getResourceHandler(resource);
                return resourceHandler != null && expectedValue.equals(resourceHandler.getTypeName(resource));

                return resource instanceof IProject &&
import org.jkiss.dbeaver.model.app.DBPPlatformDesktop;
        }
            case PROP_CAN_CREATE_FILE:
import org.jkiss.dbeaver.model.app.DBPWorkspaceDesktop;
    {

 * limitations under the License.
 * ResourcePropertyTester
/**
    public static final String PROP_TYPE = "type";
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
 * See the License for the specific language governing permissions and
    }
            case PROP_CAN_OPEN:
    public static void firePropertyChange(String propName)
}
    public static final String PROP_CAN_OPEN = "canOpen";
import org.jkiss.dbeaver.ui.ActionUtils;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IProject;
                return (handler.getFeatures(resource) & DBPResourceHandler.FEATURE_DELETE) != 0;
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
import org.jkiss.dbeaver.model.fs.nio.EFSNIOResource;
        DBPWorkspaceDesktop workspace = DBPPlatformDesktop.getInstance().getWorkspace();
        return false;
import org.jkiss.dbeaver.model.app.DBPResourceHandler;
    public static final String NAMESPACE = "org.jkiss.dbeaver.core.resource";
            case PROP_IS_LOCAL_FS:
            case PROP_TYPE:
            case PROP_CAN_CREATE_FOLDER:
 *
import org.jkiss.dbeaver.model.rcp.RCPProject;
package org.jkiss.dbeaver.ui.navigator;
    @Override
    }
 *
 * You may obtain a copy of the License at
        if (!(receiver instanceof IResource resource)) {
import org.jkiss.dbeaver.model.app.DBPResourceCreator;
    public ResourcePropertyTester() {
    public static final String PROP_CAN_CREATE_FILE = "canCreateFile";
