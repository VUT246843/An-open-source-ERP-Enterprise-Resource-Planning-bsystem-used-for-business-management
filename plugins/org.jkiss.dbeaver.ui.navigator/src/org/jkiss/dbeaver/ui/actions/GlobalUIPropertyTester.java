                yield false;

            }

                        if (childDelta.getKind() == IResourceDelta.ADDED || childDelta.getKind() == IResourceDelta.REMOVED) {
    }
    //static final Log log = LogFactory.get vLog(ObjectPropertyTester.class);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                DBPProject project = NavigatorUtils.getSelectedProject();
        return DBWorkbench.getPlatform().getWorkspace().canManageProjects();
            ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
                    if (childDelta.getResource() instanceof IProject) {
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        public void resourceChanged(IResourceChangeEvent event) {
        @Override

import org.jkiss.dbeaver.model.rm.RMConstants;
            case PROP_CURRENT_PROJECT_RESOURCE_VIEWABLE -> {
        @Override
            if (event.getType() == IResourceChangeEvent.POST_CHANGE) {
    public static final String PROP_CURRENT_PROJECT_RESOURCE_VIEWABLE = "currentProjectResourceViewable";
/*
    public static final String PROP_CAN_CREATE_CONNECTION = "canCreateConnection";
        @Override
            case PROP_CURRENT_PROJECT_RESOURCE_EDITABLE -> {

                    }
import org.jkiss.dbeaver.ui.navigator.NavigatorUtils;
    }
                        yield true;
            case PROP_CAN_CREATE_PROJECT -> canManageProjects();
import org.jkiss.dbeaver.runtime.IPluginService;
        };
    public static final String PROP_CAN_CREATE_PROJECT = "canCreateProject";
    public static final String PROP_HAS_PERMISSION = "hasPermission";
        public void activateService() {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            case PROP_CAN_EDIT_RESOURCE -> {
            case PROP_HAS_ACTIVE_PROJECT -> DBWorkbench.getPlatform().getWorkspace().getActiveProject() != null;
        }
            case PROP_HAS_PERMISSION -> DBWorkbench.getPlatform().getWorkspace().hasRealmPermission(CommonUtils.toString(expectedValue));
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
            }
 * You may obtain a copy of the License at

 */
import org.jkiss.utils.CommonUtils;
                    if (project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_DATASOURCES_EDIT)) {
    public static final String PROP_HAS_ACTIVE_PROJECT = "hasActiveProject";
        }
                    }
                            firePropertyChange(GlobalUIPropertyTester.PROP_HAS_MULTI_PROJECTS);
 *
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.app.DBPProject;
        return switch (property) {

 *
    public static final String PROP_HAS_MULTI_PROJECTS = "hasMultipleProjects";
import org.eclipse.core.expressions.PropertyTester;
    public static final String PROP_CURRENT_PROJECT_RESOURCE_EDITABLE = "currentProjectResourceEditable";
 * See the License for the specific language governing permissions and
                yield project != null && project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_VIEW);
                yield project != null && project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
                DBPProject project = NavigatorUtils.getSelectedProject();
            }
    }
public class GlobalUIPropertyTester extends PropertyTester {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
 * Unless required by applicable law or agreed to in writing, software
            case PROP_CAN_CREATE_CONNECTION -> {
import org.jkiss.dbeaver.ui.ActionUtils;
            case PROP_HAS_MULTI_PROJECTS -> DBWorkbench.getPlatform().getWorkspace().getProjects().size() > 1;
    public static final String PROP_CAN_EDIT_RESOURCE = "canEditResource";
 * DBeaver - Universal Database Manager

                        }
            }
                }

    public static final String NAMESPACE = "org.jkiss.dbeaver.core.global";
            ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
                for (IResourceDelta childDelta : event.getDelta().getAffectedChildren()) {
 * you may not use this file except in compliance with the License.
    @Override
        ActionUtils.evaluatePropertyState(NAMESPACE + "." + propName);
/**
        public void deactivateService() {


package org.jkiss.dbeaver.ui.actions;
                DBPProject project = DBWorkbench.getPlatform().getWorkspace().getActiveProject();
        }
    public static class ResourceListener implements IPluginService, IResourceChangeListener {
 * GlobalUIPropertyTester
                for (DBPProject project : DBWorkbench.getPlatform().getWorkspace().getProjects()) {
            }
}
            default -> false;
    public static boolean canManageProjects() {
                }
    public static void firePropertyChange(String propName) {
                yield project != null && project.hasRealmPermission(RMConstants.PERMISSION_PROJECT_RESOURCE_EDIT);
import org.eclipse.core.resources.*;
