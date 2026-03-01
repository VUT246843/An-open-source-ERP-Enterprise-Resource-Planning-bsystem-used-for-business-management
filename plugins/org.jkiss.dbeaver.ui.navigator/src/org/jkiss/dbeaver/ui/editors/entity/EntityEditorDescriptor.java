 * Licensed under the Apache License, Version 2.0 (the "License");
    private final AbstractDescriptor.ObjectType inputFactoryType;
        folder
        this.name = UINavigatorMessages.registry_entity_editor_descriptor_name;
    {
    public boolean isEmbeddable() {
    public String getId() {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        super(UINavigatorActivator.PLUGIN_ID);
import org.jkiss.dbeaver.model.DBPImage;
            this.type = Type.valueOf(typeName);
    private static final Log log = Log.getLog(EntityEditorDescriptor.class);
/**
            log.error("Error instantiating entity editor '" + editorType.getImplName() + "'", ex); //$NON-NLS-1$ //$NON-NLS-2$
    }
        this.name = config.getAttribute("label");
 * distributed under the License is distributed on an "AS IS" BASIS,
        return position;
    public ObjectType getEditorType() {

        if (inputFactoryType == null || inputFactoryType.getImplName() == null) {
        this.main = CommonUtils.getBoolean(config.getAttribute("main"));
        }
 *
import org.jkiss.utils.CommonUtils;
    @Override
 *
        super(config);
    public static final String EXTENSION_ID = "org.jkiss.dbeaver.databaseEditor"; //NON-NLS-1 //$NON-NLS-1$
    }
        this.main = true;
        this.inputFactoryType = new AbstractDescriptor.ObjectType(ObjectPropertiesEditorInputFactory.class.getName());
    public static final String POSITION_MIDDLE = IActionConstants.MB_ADDITIONS_MIDDLE;
import org.jkiss.code.NotNull;
    private final String description;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    {
    public IEditorPart createEditor() {
    public static final String DEFAULT_OBJECT_EDITOR_ID = "default.object.editor"; //NON-NLS-1 //$NON-NLS-1$
            return editorType.createInstance(IEditorPart.class);



            IDatabaseEditorInputFactory instance = inputFactoryType.createInstance(IDatabaseEditorInputFactory.class);
            return null;

        }
import org.eclipse.ui.IEditorPart;
    private final DBPImage icon;

 * See the License for the specific language governing permissions and
    public static final String POSITION_START = IActionConstants.MB_ADDITIONS_START;
    public IEditorInput getNestedEditorInput(@NotNull IDatabaseEditorInput mainInput) {
    {
    private final String position;
    private final String id;

        return id;
        return name;
        this.editorType = new AbstractDescriptor.ObjectType(config.getAttribute("class"));
        return contributorType == null ? null : contributorType.getObjectClass(IEditorActionBarContributor.class);
 *
        return type;
        } catch (Exception ex) {

 * EntityEditorDescriptor
        }
        return mainInput;
            log.error("Error instantiating input factory", e);
    }
    }

    public String getDescription()
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.IEditorActionBarContributor;
    @NotNull
/*
    public String toString() {
    public DBPImage getIcon()

 */
        } catch (Exception e) {
        try {
import org.eclipse.ui.IEditorInput;
        editor,
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
    public Type getType()
    public EntityEditorDescriptor(@NotNull IConfigurationElement config) {
import org.jkiss.dbeaver.ui.editors.entity.properties.ObjectPropertiesEditorInputFactory;
    }
        this.description = UINavigatorMessages.registry_entity_editor_descriptor_description;

import org.jkiss.dbeaver.ui.internal.UINavigatorActivator;
        this.icon = iconToImage(config.getAttribute("icon"));
 */
        this.editorType = new AbstractDescriptor.ObjectType(ObjectPropertiesEditor.class.getName());
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInputFactory;
 * You may obtain a copy of the License at
        return embeddable;
    }
            return instance.createNestedEditorInput(mainInput);
 * DBeaver - Universal Database Manager
    {
    private final boolean main;
        this.type = Type.editor;
import org.jkiss.dbeaver.model.DBIcon;
        this.contributorType = new AbstractDescriptor.ObjectType(config.getAttribute("contributor"));
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        this.embeddable = CommonUtils.toBoolean(config.getAttribute("embeddable"));

    EntityEditorDescriptor() {
    private final AbstractDescriptor.ObjectType editorType;

    @Nullable
            return mainInput;
package org.jkiss.dbeaver.ui.editors.entity;
 * limitations under the License.
        this.contributorType = null;
        this.inputFactoryType = new AbstractDescriptor.ObjectType(config.getAttribute("inputFactory"));


    }
import org.jkiss.dbeaver.ui.editors.entity.properties.ObjectPropertiesEditor;
        this.position = null;

    public boolean isMain()

        return description;
        } else {
import org.jkiss.dbeaver.Log;
        return icon;
        return main;
        return editorType;
        this.position = config.getAttribute("position");
        this.id = config.getAttribute("id");
    public Class<? extends IEditorActionBarContributor> getContributorClass() {
        this.icon = DBIcon.TREE_DATABASE;
            this.type = Type.editor;
    public static final String POSITION_END = IActionConstants.MB_ADDITIONS_END;
import org.jkiss.dbeaver.model.impl.AbstractContextDescriptor;
 * you may not use this file except in compliance with the License.
        this.id = DEFAULT_OBJECT_EDITOR_ID;

        }
    public enum Type {
    public String getPosition()

    {
        this.description = config.getAttribute("description");
    private final String name;
}
    }
    }
    }
import org.jkiss.dbeaver.ui.IActionConstants;
    }
        return id;
        if (!CommonUtils.isEmpty(typeName)) {

    public static final String POSITION_PROPS = IActionConstants.MB_ADDITIONS_PROPS;
        try {
        String typeName = config.getAttribute("type");
    {
    }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    private boolean embeddable;
    private final AbstractDescriptor.ObjectType contributorType;
 * Unless required by applicable law or agreed to in writing, software

public class EntityEditorDescriptor extends AbstractContextDescriptor {
    private final Type type;
    @Nullable

import org.eclipse.core.runtime.IConfigurationElement;
import org.jkiss.code.Nullable;
    @NotNull
    public String getName()
    }
