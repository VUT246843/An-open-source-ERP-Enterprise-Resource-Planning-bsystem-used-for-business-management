import java.util.ArrayList;
 */
                CommonUtils.equalObjects(node.getProject().getId(), project.getId()))

    @Override
        }
    @Nullable
        if (extraNodes.remove(node)) {
        return model;
    }

        } else {
            }
    }
    public String getNodeType() {

                DBNUtils.disposeNode(projectNode, true);
    @Nullable
    @Override
                project.refreshNode(monitor, source);


        return null;
                return node;
    }

    }
 * See the License for the specific language governing permissions and
    @Override
            if (DBWorkbench.getPlatform().getWorkspace() instanceof DBPProjectManager projectManager) {

    @NotNull
        } else {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        if (project == null) {
import org.jkiss.dbeaver.model.app.DBPProjectListener;
        super();
import org.jkiss.utils.CommonUtils;
    public DBNNode[] getChildren(@NotNull DBRProgressMonitor monitor) {
            DBNProject projectNode = projects.get(i);
        if (model.isGlobal()) {
 *
    }
        addProject(project, true);

                addProject(project, false);
            if (node.getProject().equals(project) ||
        removeProject(project);
                projectManager.addProjectListener(this);
        if (reflect) {
    }
            for (DBPProject project : globalProjects) {
    private final DBNModel model;

    private final List<DBNNode> extraNodes = new ArrayList<>();
        return "#root"; //$NON-NLS-1$

        }

    @Nullable
        DBNProject projectNode = getModel().createProjectNode(this, project);
        for (DBNProject node : projects) {

    @Override
    }
    @Nullable
            }
 *     http://www.apache.org/licenses/LICENSE-2.0

        DBNProject oldProjectNode = getProjectNode(oldValue);

    public void removeExtraNode(@NotNull DBNNode node) {
    public String getNodeItemPath() {
            }
        model.fireNodeEvent(new DBNEvent(this, DBNEvent.Action.ADD, node));
            }

        projects.sort((o1, o2) -> o1.getNodeDisplayName().compareToIgnoreCase(o2.getNodeDisplayName()));
        if (globalProjects != null) {
        projects.clear();
}
        return ModelMessages.model_navigator_Project;
            children.addAll(extraNodes);
import org.jkiss.dbeaver.model.DBPImage;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    public Object getValueObject() {
        } else {
        }
    }
    public DBNProject getProjectNode(@Nullable DBPProject project) {
            for (DBPProject project : DBWorkbench.getPlatform().getWorkspace().getProjects()) {
        }
                projectManager.removeProjectListener(this);
        for (DBNNode node : extraNodes) {
    public String getNodeDisplayName() {
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
    @Nullable
        return extraNodes;
            return this;
    @Property(viewable = true, order = 1)
    public DBNModel getModel() {
        this.model = model;
            return null;


        return ModelMessages.model_navigator_Model_root;
    @NotNull
        projects.add(projectNode);
 */
    @NotNull
        return null;

        return "";

        } else if (projects.isEmpty()) {
        return ModelMessages.model_navigator_Root;
        }
    public DBNRoot(@NotNull DBNModel model) {
import org.jkiss.dbeaver.model.navigator.registry.DBNRegistry;
    @Override
        List<? extends DBPProject> globalProjects = model.getModelProjects();

 * DBeaver - Universal Database Manager
    }
        DBNProject projectNode = getProjectNode(newValue);
        extraNodes.sort(Comparator.comparing(DBNNode::getNodeDisplayName));
        }
    @Override
    @Override
    protected void dispose(boolean reflect) {
        return this;
import org.jkiss.dbeaver.model.app.DBPProject;
    }
            List<DBNNode> children = new ArrayList<>(projects.size() + extraNodes.size());
    @NotNull
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
            }
    @Override
package org.jkiss.dbeaver.model.navigator;
/*
    @Override
        }
    @NotNull
        if (oldProjectNode != null) {
    private final List<DBNProject> projects = new ArrayList<>();
            return projects.toArray(new DBNNode[0]);
    }
    }
    public Class<?> getChildrenClass() {
    @Override
                projects.remove(i);
        extraNodes.add(node);
            return children.toArray(new DBNNode[0]);
    }
    }
    public void handleProjectRemove(@NotNull DBPProject project) {
    public boolean allowsChildren() {
import org.jkiss.dbeaver.model.app.DBPProjectManager;
    @Nullable

    }
            {
    @Override
    @Nullable
        for (DBNProject project : projects) {

        }
    @Deprecated
 * Unless required by applicable law or agreed to in writing, software
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (projectNode.getProject() == project) {
 * You may obtain a copy of the License at
    public DBNProject addProject(@NotNull DBPProject project, boolean reflect) {
        return projects;
                break;
            children.addAll(projects);
        return projectNode;
        return !projects.isEmpty() || !extraNodes.isEmpty();
    public String getNodeDescription() {
            }
            DBNUtils.disposeNode(project, reflect);
    @NotNull
    @Override
    @Override
    }
    }
    }

        }
    @Override
        if (extraNodes.isEmpty()) {
        if (projectNode != null) {

            DBNUtils.disposeNode(node, reflect);
    public DBPImage getNodeIcon() {
        }
    public void removeProject(@NotNull DBPProject project) {
import org.jkiss.dbeaver.model.meta.Property;
    }
 *
 * limitations under the License.
            model.fireNodeEvent(new DBNEvent(this, DBNEvent.Action.ADD, projectNode));
        return super.getName();
        }
/**
    }

 * distributed under the License is distributed on an "AS IS" BASIS,
            model.fireNodeEvent(new DBNEvent(this, DBNEvent.Action.UPDATE, projectNode));
            model.fireNodeEvent(new DBNEvent(this, DBNEvent.Action.UPDATE, oldProjectNode));
        extraNodes.clear();
                model.fireNodeEvent(new DBNEvent(this, DBNEvent.Action.REMOVE, projectNode));
    @Override
 * you may not use this file except in compliance with the License.
                addProject(project, false);

    public void handleActiveProjectChange(@NotNull DBPProject oldValue, @NotNull DBPProject newValue) {
    @Override
        }
            model.fireNodeEvent(new DBNEvent(this, DBNEvent.Action.REMOVE, node));
            return this.getParentNode().refreshNode(monitor, source);

    }
    public List<DBNProject> getProjects() {
    public void handleProjectAdd(@NotNull DBPProject project) {
    }
            return extraNodes.toArray(new DBNNode[0]);
    @Override
    @Override
    public void addExtraNode(@NotNull DBNNode node, boolean reflect) {
        DBNRegistry.getInstance().extendNode(this, false);

import org.jkiss.dbeaver.model.messages.ModelMessages;
import org.jkiss.code.NotNull;
        if (this.getParentNode() != null) {
        for (int i = 0; i < projects.size(); i++) {
    @Override
    }

import org.jkiss.dbeaver.DBException;

            for (DBNProject project : projects) {
    }
        }
    public List<DBNNode> getExtraNodes() {
        }
    @NotNull
    public DBNNode refreshNode(@NotNull DBRProgressMonitor monitor, @Nullable Object source) throws DBException {
public class DBNRoot extends DBNNode implements DBNContainer, DBNNodeExtendable, DBPProjectListener {
        if (model.isGlobal()) {
import java.util.Comparator;
 *
 * DBNRoot
        return Object.class;
            if (DBWorkbench.getPlatform().getWorkspace() instanceof DBPProjectManager projectManager) {
import java.util.List;
    public String getName() {
    public String getChildrenType() {
