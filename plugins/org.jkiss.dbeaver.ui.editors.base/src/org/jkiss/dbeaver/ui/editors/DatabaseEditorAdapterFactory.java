        DBSDataContainer.class,
 *
                if (activeEditor instanceof IFolderedPart) {
                }
        if (adapterType == DBPDataSourceContainer.class) {
/*
        DBSObject.class,
    }
                return adapterType.cast(adaptableObject);
        }*/
 * limitations under the License.
            if (adaptableObject instanceof DBPDataSourceContainer) {
                adaptableObject = ((IEditorPart) adaptableObject) .getEditorInput();
                return adapterType.cast(EditorUtils.getInputDataSource((IEditorInput) adaptableObject));
            }
    }
import org.jkiss.dbeaver.model.struct.DBSWrapper;
                return adapterType.cast(((DBPDataSourceContainerProvider) adaptableObject).getDataSourceContainer());
                return adapterType.cast(((DBPDataSourceContainerProvider) adaptableObject).getDataSourceContainer());
import org.eclipse.ui.IEditorPart;

                        DBSObject object = ((DBSWrapper)node).getObject();
                    DBNNode node = ((IDatabaseEditorInput) editorInput).getNavigatorNode();
                        if (activeFolder instanceof IAdaptable) {
 * distributed under the License is distributed on an "AS IS" BASIS,

 * DatabaseEditorAdapterFactory
            IEditorPart activeEditor = ((EntityEditor) adaptableObject).getActiveEditor();
import org.jkiss.dbeaver.model.struct.DBSDataManipulator;
                        }
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
                        if (adapterType.isAssignableFrom(activeFolder.getClass())) {
    @Override
                    if (activeFolder != null) {

            if (adaptableObject instanceof DBPDataSourceContainerProvider) {
package org.jkiss.dbeaver.ui.editors;
                if (adapterType.isAssignableFrom(activeEditor.getClass())) {
 *
        DBSDataContainer.class,

    };
    public Class<?>[] getAdapterList()
            if (adaptableObject instanceof IEditorPart) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.navigator.DBNNode;
            return null;
                    return activeEditor;
        }/* else if (adaptableObject instanceof EntityEditor) {
 */
                    }
public class DatabaseEditorAdapterFactory implements IAdapterFactory
                        }
import org.jkiss.dbeaver.model.struct.DBSObject;

        DBSDataManipulator.class,
                        }
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
                            return adapterType.cast(object);
            }
 * You may obtain a copy of the License at
    @Override
            } else if (adaptableObject instanceof DBPDataSourceContainerProvider) {
        DBPDataSourceContainer.class
 * See the License for the specific language governing permissions and
                            return ((IAdaptable) activeFolder).getAdapter(adapterType);
 */
    public <T> T getAdapter(Object adaptableObject, Class<T> adapterType)
}
 * DBeaver - Universal Database Manager
                IEditorInput editorInput = ((IEditorPart) adaptableObject).getEditorInput();
            }
{
/**
            } else if (adaptableObject instanceof IEditorInput) {
                    Object activeFolder = ((IFolderedPart) activeEditor).getActiveFolder();
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.IEditorInput;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
                        if (object != null && adapterType.isAssignableFrom(object.getClass())) {
                if (editorInput instanceof IDatabaseEditorInput) {
                            return activeEditor;
    {
    private static final Class<?>[] ADAPTER_LIST = {
            }
import org.eclipse.core.runtime.IAdapterFactory;
            if (activeEditor != null) {
        } else if (DBPObject.class.isAssignableFrom(adapterType)) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
        DBPDataSourceContainer.class,
            if (adaptableObject instanceof IEditorPart) {
                    }
 * you may not use this file except in compliance with the License.
    {
                    if (node != null) {
 * Unless required by applicable law or agreed to in writing, software
                }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.dbeaver.model.DBPObject;
        return null;
        return ADAPTER_LIST;
            }
