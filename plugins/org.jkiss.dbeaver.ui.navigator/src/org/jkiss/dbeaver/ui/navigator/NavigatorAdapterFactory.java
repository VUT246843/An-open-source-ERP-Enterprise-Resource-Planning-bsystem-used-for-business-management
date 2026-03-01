        DBPNamedObject.class,
            if (object == null) {
        DBPQualifiedObject.class,
            DBSObject object = DBUtils.getFromObject(adaptableObject);
        } else if (adapterType == IWorkbenchAdapter.class) {
                adaptableObject = ((DBNDatabaseFolder) adaptableObject).getParentObject();
                return adapterType.cast(new PropertySourceDelegate(props));
                return null;
            }
                return adapterType.cast(dbObject);
        IWorkbenchAdapter.class
//            return project == null ? null : adapterType.cast(project.getEclipseProject());
        }

            }
                return adapterType.cast(workbenchAdapter);
            }
import org.eclipse.ui.model.IWorkbenchAdapter;
            } else if (adaptableObject instanceof DBPObject) {
                if (adapterType.isInstance(resource)) {
            if (object instanceof DBSObject) {
                };
    @Override
import org.eclipse.core.resources.IResource;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
    };
                    }
            }
                    @Override
import org.eclipse.jface.resource.ImageDescriptor;
//        } else if (IProject.class == adapterType) {
                dbObject = wrapper.getObject();
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.properties.PropertySourceDelegate;
import org.eclipse.core.runtime.IAdapterFactory;
                        return DBeaverIcons.getImageDescriptor(node.getNodeIconDefault());
public class NavigatorAdapterFactory implements IAdapterFactory
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

            if (adaptableObject instanceof DBNDatabaseFolder) {
            if (adaptableObject instanceof DBNDataSource) {
/*
import org.jkiss.dbeaver.model.messages.ModelMessages;
//            }
 * Licensed under the Apache License, Version 2.0 (the "License");

        DBSDataContainer.class,
            if (adaptableObject instanceof DBSWrapper wrapper) {
                return null;
        DBSStructContainer.class,
                Object adapter = adaptable.getAdapter(IPropertySource.class);
 * DBeaver - Universal Database Manager
            return dataSource == null ? null : adapterType.cast(dataSource.getContainer());
            if (dbObject instanceof IAdaptable adaptable) {
                    return adapterType.cast(adapter);
                adapter = adaptable.getAdapter(DBPPropertySource.class);
            }
import org.jkiss.dbeaver.model.navigator.DBNNode;
            if (object != null && adapterType.isAssignableFrom(object.getClass())) {
        IResource.class,
                props.collectProperties();
        IFolder.class,
 * limitations under the License.
    }
 */
                    public String getLabel(Object o) {
import org.jkiss.dbeaver.model.*;

        } else if (IResource.class.isAssignableFrom(adapterType)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
                    props.addProperty(null, "desc", ModelMessages.model_navigator_Description, meta.getDescription()); //$NON-NLS-1$
                        return node.getNodeDisplayName();
        } else if (adapterType == IPropertySource.class) {
        IProject.class,
            }
                }
                object = ((DBSWrapper) adaptableObject).getObject();
        DBPDataSourceContainer.class,
                return adapterType.cast(object);
}        DBSObject.class,
                if (props.isEmpty() && adaptableObject instanceof DBSObject meta) {
                return ((DBNResource) adaptableObject).getAdapter(adapterType);
                    props.addProperty(null, DBConstants.PROP_ID_NAME, ModelMessages.model_navigator_Name, meta.getName()); //$NON-NLS-1$
        if (adapterType == DBPDataSourceContainer.class) {
import org.jkiss.dbeaver.model.navigator.DBNDatabaseFolder;
import org.eclipse.core.runtime.IAdaptable;
                dbObject = (DBPObject) adaptableObject;
                    public ImageDescriptor getImageDescriptor(Object object) {
                if (adapter != null) {
            }
            if (adaptableObject instanceof DBNResource) {
    {
        return null;
//            DBPProject project = null;

                    }
 * You may obtain a copy of the License at
 */
                    @Override
import org.eclipse.ui.model.WorkbenchAdapter;
                    public Object getParent(Object o) {
 * Unless required by applicable law or agreed to in writing, software
            }
                    @Override
                WorkbenchAdapter workbenchAdapter = new WorkbenchAdapter() {
            }
                    return adapterType.cast(resource);
            if (adaptableObject instanceof DBNNode node) {
package org.jkiss.dbeaver.ui.navigator;
            if (dbObject instanceof IPropertySource) {
{
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType)
            DBPObject object = null;
        DBSObjectContainer.class,
            }
            DBPObject dbObject = null;
            // Workbench adapter
                object = DBUtils.getPublicObject((DBSObject) object);
            if (dbObject != null) {
            if (adaptableObject instanceof DBSWrapper) {
import org.jkiss.dbeaver.runtime.properties.PropertyCollector;
                    // Add default properties
                return adapterType.cast(((DBNDataSource) adaptableObject).getDataSourceContainer());
 *

    @Override
            DBPDataSource dataSource = object.getDataSource();
                object = (DBPObject) adaptableObject;
import org.jkiss.dbeaver.model.struct.*;
//                project = ((DBNNode) adaptableObject).getOwnerProject();
            } else if (adaptableObject instanceof DBPObject) {
                }
        } else if (DBPObject.class.isAssignableFrom(adapterType)) {
            }
 * Navigator AdapterFactory
                }
                final IResource resource = node.getAdapter(IResource.class);
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    public Class<?>[] getAdapterList() {
    private static final Class<?>[] ADAPTER_LIST = {
    }
import org.eclipse.core.resources.IFolder;
                }
                        return node.getParentNode();
                    return adapterType.cast(new PropertySourceDelegate((DBPPropertySource) adapter));
 *
import org.eclipse.core.resources.IProject;
        DBPObject.class,
//            if (adaptableObject instanceof DBNNode) {
                    }
import org.jkiss.dbeaver.ui.DBeaverIcons;
                return adapterType.cast(object);
        IPropertySource.class,
            if (dbObject instanceof DBPPropertySource) {
                PropertyCollector props = new PropertyCollector(adaptableObject, dbObject , true);
/**
        return ADAPTER_LIST;
            } else {
                if (adapter != null) {
        DBSDataManipulator.class,
            }
import org.eclipse.ui.views.properties.IPropertySource;
                return adapterType.cast(new PropertySourceDelegate((DBPPropertySource) dbObject));
            }
import org.jkiss.dbeaver.model.navigator.DBNResource;
        IFile.class,
            if (object instanceof DBPDataSourceContainer) {
import org.eclipse.core.resources.IFile;
        DBSEntity.class,
            } else if (adaptableObject instanceof DBNNode node) {
