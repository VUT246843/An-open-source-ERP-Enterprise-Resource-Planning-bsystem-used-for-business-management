
 *

        for (EntityConfiguratorDescriptor descriptor : entityConfigurators) {

    }
            for (EntityEditorDescriptor descriptor : positionList) {
            instance = new EntityEditorsRegistry(Platform.getExtensionRegistry());
        for (IConfigurationElement ext : extElements) {
                entityConfigurators.add(descriptor);
                list.add(descriptor);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    private final EntityEditorDescriptor defaultEditor;
        entityEditors.clear();
        List<EntityEditorDescriptor> editors = new ArrayList<>();
    }
        return null;
        // Create default editor
 * EntityEditorsRegistry
    public EntityEditorDescriptor getMainEntityEditor(DBPObject object, IEntityEditorContext context) {
import org.jkiss.dbeaver.model.DBPObject;
import org.jkiss.utils.CommonUtils;
        entityConfigurators.clear();
        List<EntityConfiguratorDescriptor> allDescriptors = new ArrayList<>();
    public List<EntityEditorDescriptor> getEntityEditors() {
        return editors;

}
                allDescriptors.add(descriptor);
/*

                EntityConfiguratorDescriptor descriptor = new EntityConfiguratorDescriptor(ext);
    }

                if (descriptor.appliesTo(object, context)) {
        for (EntityEditorDescriptor ed : entityEditors) {
import java.util.*;
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others

            CommonUtils.isEmpty(position) ? entityEditors : positionsMap.get(position);

    }
 * Unless required by applicable law or agreed to in writing, software
        return entityEditors;
/**
import org.jkiss.code.NotNull;
        // Load datasource providers from external plugins
                return ed;
                    descriptor.getPosition(), k -> new ArrayList<>());
 * You may obtain a copy of the License at
import org.eclipse.ui.IEditorPart;
        return defaultEditor;
        if (!allDescriptors.isEmpty()) {
    private final List<EntityConfiguratorDescriptor> entityConfigurators = new ArrayList<>();
 */

            }
 *
            if (TAG_EDITOR.equals(ext.getName())) {

        }

        }
        }
    private static EntityEditorsRegistry instance = null;
        }
    private static final String TAG_CONFIGURATOR = "configurator"; //NON-NLS-1
        defaultEditor = new EntityEditorDescriptor();
        IConfigurationElement[] extElements = registry.getConfigurationElementsFor(EntityEditorDescriptor.EXTENSION_ID);
    public void dispose() {
        }

            if (allDescriptors.size() > 1) {
        return null;
    }
        if (positionList != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    public synchronized static EntityEditorsRegistry getInstance() {
        }
                    editors.add(descriptor);
    }
import org.jkiss.utils.BeanUtils;
        return instance;
    public EntityEditorDescriptor getDefaultEditor() {

            if (descriptor.appliesTo(object) && descriptor.getObjectTypes().length > 0) {
    public EntityConfiguratorDescriptor getEntityConfigurator(DBPObject object) {
        final List<EntityEditorDescriptor> positionList =
 */

    }

        if (instance == null) {
            } else if (TAG_CONFIGURATOR.equals(ext.getName())) {
        for (EntityEditorDescriptor descriptor : entityEditors) {
 * limitations under the License.
    }
            if (ed.getEditorType().getImplName().equals(editor.getClass().getName())) {
                    o -> BeanUtils.getInheritanceDistance(object, o.getObjectTypes()[0].getImplClass())));
                EntityEditorDescriptor descriptor = new EntityEditorDescriptor(ext);
    private final List<EntityEditorDescriptor> entityEditors = new ArrayList<>();
            if (descriptor.appliesTo(object, context) && descriptor.isMain() && descriptor.getType() == EntityEditorDescriptor.Type.editor) {
                allDescriptors.sort(Comparator.comparingInt(

            return allDescriptors.getFirst();
package org.jkiss.dbeaver.ui.editors.entity;
        }
            }
import org.eclipse.core.runtime.Platform;
                entityEditors.add(descriptor);
 * you may not use this file except in compliance with the License.
import org.eclipse.core.runtime.IConfigurationElement;
    private static final String TAG_EDITOR = "editor"; //NON-NLS-1
import org.eclipse.core.runtime.IExtensionRegistry;
                return descriptor;
 * Licensed under the Apache License, Version 2.0 (the "License");
                // Determine the closes one
                List<EntityEditorDescriptor> list = positionsMap.computeIfAbsent(
        return defaultEditor;
    public EntityEditorDescriptor getEntityEditor(IEditorPart editor) {
 * DBeaver - Universal Database Manager
            }

public class EntityEditorsRegistry {
    public List<EntityEditorDescriptor> getEntityEditors(DBPObject object, IEntityEditorContext context, String position) {
    public EntityEditorsRegistry(IExtensionRegistry registry) {
    }
    private final Map<String, List<EntityEditorDescriptor>> positionsMap = new HashMap<>();
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
    @NotNull
