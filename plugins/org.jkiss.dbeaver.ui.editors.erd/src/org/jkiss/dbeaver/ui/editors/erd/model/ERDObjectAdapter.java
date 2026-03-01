/**
 */
                Object model = ((EditPart) adaptableObject).getModel();
                    if (object != null && adapterType.isAssignableFrom(object.getClass())) {
                if (!childItems.isEmpty()) {
                if (object instanceof DBSObject && adaptableObject instanceof DiagramPart && ((DBSObject) object).getParentObject() instanceof DBSStructContainer) {

        return new Class<?>[] { ERDObject.class, DBPNamedObject.class, DBPQualifiedObject.class, DBSObject.class, DBNNode.class };
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeNode;
    @Override
                                        if (navFolder.getMeta() == childFolderMeta) {
            if (object instanceof DBSObject) {
    public Class<?>[] getAdapterList() {
                        String itemPropName = ((DBXTreeItem) itemMeta).getPropertyName();

    private DBNDatabaseNode getItemsFolderNode(DBNDatabaseNode node) {
                    }
    @Override
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeFolder;
        }
 * ERD object adapter
                    Object object = ((ERDObject<?>) model).getObject();
                                    for (DBNDatabaseNode navFolder : nodeChildren) {
import org.jkiss.dbeaver.model.struct.DBSObject;
                    node = getItemsFolderNode(node);
                                // Shouldn't be here
                    node = (DBNDatabaseNode) node.getParentNode();
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                }
                if (node != null) {
                if (model instanceof ERDObject) {
                List<DBXTreeNode> childItems = childFolderMeta.getChildren(node);
            final Collection<DBSObjectContainer> objectContainers = diagram.getObjectContainers(dataSourceContainer);
                                            node = navFolder;

            }
            Object object = ((EditPart) adaptableObject).getModel();
                Object model = ((EditPart) adaptableObject).getModel();
            }
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
                    } else if (diagram.getRootObjectContainer() != null) {
                if (node instanceof DBNDatabaseItem && node.getObject() instanceof DBSStructContainer) {
                object = ((ERDObject<?>) object).getObject();
                    if (itemMeta instanceof DBXTreeItem) {
import org.eclipse.core.runtime.IAdapterFactory;
import org.jkiss.dbeaver.model.struct.DBSObjectContainer;
import org.jkiss.dbeaver.model.navigator.DBNDatabaseItem;
    // That's tricky
                    return adapterType.cast(model);
import org.jkiss.dbeaver.model.navigator.DBNNode;
import org.jkiss.dbeaver.model.struct.DBSStructContainer;
import org.jkiss.dbeaver.model.erd.ERDObject;
                            try {

                }
            }
            if (adaptableObject instanceof EditPart) {
 * limitations under the License.
                                    }
                                DBNDatabaseNode[] nodeChildren = node.getChildren(new VoidProgressMonitor());
                                            break;
                        object = diagram.getRootObjectContainer();
import org.eclipse.gef.EditPart;
        }
import org.jkiss.code.NotNull;
import java.util.List;
            final DBPDataSourceContainer dataSourceContainer = diagram.getDataSources().iterator().next();
            boolean unwrapParentNode = false;
/*
 * See the License for the specific language governing permissions and
                                // Safe to use fake monitor because we read local folders
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.DBPObject;
                }
        return diagram.getRootObjectContainer() != null;
        return null;
    private static boolean isEntityContainerUnique(@NotNull EntityDiagram diagram) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
}
        }
                    object = ((DBSObject) object).getParentObject();
        } else if (DBPObject.class.isAssignableFrom(adapterType)) {
            if (object instanceof EntityDiagram) {
 *
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
                    DBXTreeNode itemMeta = childItems.get(0);

import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
import org.jkiss.dbeaver.model.navigator.DBNUtils;
                        return adapterType.cast(object);
                            }
    }

                    return ((ERDObject<?>) model).getAdapter(adapterType);
            if (adaptableObject instanceof EditPart) {
            return objectContainers != null && objectContainers.size() == 1;
 * distributed under the License is distributed on an "AS IS" BASIS,
                        }
                            } catch (DBException ignored) {
        } else if (DBPPropertySource.class.isAssignableFrom(adapterType)) {
        for (DBXTreeNode childFolderMeta : node.getMeta().getChildren(node)) {
    // Try to get Table folder. It is handy for Create New command
                }
            if (childFolderMeta instanceof DBXTreeFolder) {
        if (diagram.getDataSources().size() == 1) {
                unwrapParentNode = true;
        return node;
 * you may not use this file except in compliance with the License.
                        object = diagram.getEntities().get(0);
import java.util.Collection;
            }
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                if (model instanceof ERDObject) {
                                        }
                    return adapterType.cast(node);
    }
 *
                    if (!diagram.getEntities().isEmpty()) {
                        if (itemPropName.contains("table") || itemPropName.contains("collection")) {
import org.jkiss.dbeaver.model.navigator.meta.DBXTreeItem;
            if (object instanceof ERDObject) {
                if (isEntityContainerUnique(diagram)) {
                final EntityDiagram diagram = (EntityDiagram) object;
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType) {
    }
                            break;
                }
                    }
import org.jkiss.dbeaver.model.DBPQualifiedObject;
public class ERDObjectAdapter implements IAdapterFactory {
import org.jkiss.dbeaver.model.DBPNamedObject;
                                }
 *
    }
import org.jkiss.dbeaver.ui.editors.erd.part.DiagramPart;

            }
                }
                                if (nodeChildren != null) {
                DBNDatabaseNode node = DBNUtils.getNodeByObject((DBSObject) object);
                }
                }

                if (model != null && adapterType.isAssignableFrom(model.getClass())) {
package org.jkiss.dbeaver.ui.editors.erd.model;
 */

    }
        if (DBNNode.class == adapterType) {
    public ERDObjectAdapter() {
                } else if (node != null && node.getParentNode() instanceof DBNDatabaseNode && unwrapParentNode) {
 * DBeaver - Universal Database Manager
                    }
