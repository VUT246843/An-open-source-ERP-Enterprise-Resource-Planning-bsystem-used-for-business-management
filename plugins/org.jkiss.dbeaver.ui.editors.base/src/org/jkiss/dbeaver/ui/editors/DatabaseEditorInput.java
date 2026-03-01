            return;
    @Override
    }
public abstract class DatabaseEditorInput<NODE extends DBNDatabaseNode> implements IPersistableElement, IDatabaseEditorInput, DBPDataSourceContainerProvider, DBPContextProvider
        return node == null ? null : node.getObject();
                public String getLabel(Object o) {

            getDatabaseObject() == null ||
                }
    @Override
        DBSObject object = node == null ? null : node.getObject();
        return attributes.get(name);
        return null;
        return new ArrayList<>(attributes.keySet());
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;

    {
                    this.executionContext,

        }
        if (object != null) {
    @Override
                log.error("Database object '" + object.getName() + "' is not associated with any execution context");

        }
                }

    @Override
    @Override
    @Override
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * You may obtain a copy of the License at

    @Override

    }
 * DatabaseEditorInput

        propertySource.collectProperties();
 *
    public Object getAttribute(String name) {
            return node.getName();

            this.commandContext = commandContext != null ?
        memento.putString(DatabaseEditorInputFactory.TAG_DATA_SOURCE, context.getDataSource().getContainer().getId());
        } else {
    private String defaultFolderId;
    @Override
import org.jkiss.code.Nullable;
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
        this.defaultFolderId = defaultFolderId;
import org.jkiss.dbeaver.ui.UIUtils;
                @Override
import org.jkiss.dbeaver.model.DBUtils;
    {
            return;

        memento.putString(DatabaseEditorInputFactory.TAG_NODE_NAME, node.getNodeDisplayName());
            (obj instanceof DatabaseEditorInput && ((DatabaseEditorInput<?>)obj).node.equals(node));

                @Override
 * Unless required by applicable law or agreed to in writing, software
        }
    {
/**
    {
    private final DBCExecutionContext executionContext;
    }

            memento.putString(DatabaseEditorInputFactory.TAG_ACTIVE_PAGE, getDefaultPageId());
        }
        return obj == this ||
        }
    public String getFactoryId()
            return adapter.cast(getDatabaseObject());
        this.node = node;

        return propertySource;
                    return node.getParentNode();

            this.commandContext = null;
            return node.getDataSourceContainer();
    @Override
    {
            });
            return;
            return executionContext.getDataSource().getContainer();
            getDatabaseObject());
    public DBCExecutionContext getExecutionContext() {
    private String defaultPageId;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Nullable
    }
    @Override
        } else if (node instanceof DBNDataSource) {
import org.jkiss.utils.CommonUtils;
        } else {
    {
    }
            getCommandContext(),
    public <T> T getAdapter(Class<T> adapter)
 *
    public DBPDataSourceContainer getDataSourceContainer()

    @Override
/*
 * limitations under the License.
        }
    }
    @Override
            getNavigatorNode(),
            }
}
    }
    @Override
        if (getDatabaseObject() != null && !getDatabaseObject().isPersisted()) {
    private final DBECommandContext commandContext;
        if (value == null) {
        return false;
    public boolean exists()
import org.eclipse.ui.model.IWorkbenchAdapter;
            !DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DatabaseEditorPreferences.PROP_SAVE_EDITORS_STATE))

    private final Map<String, Object> attributes = new LinkedHashMap<>();
    public boolean equals(Object obj)

            return attributes.put(name, value);
    }
        {
    {
        }
    @Override
    }
                    false);

 */
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public DBPPropertySource getPropertySource()
    @Override

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }

        if (node == null) {
import org.jkiss.dbeaver.Log;
    }

    }
            this.executionContext = DBUtils.getDefaultContext(object, false);
            this.executionContext = null;
            !getDatabaseObject().isPersisted() ||

        return defaultPageId;


    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
    @Nullable

    @Override


        }
    {
import org.eclipse.ui.IMemento;
        final DBCExecutionContext context = getExecutionContext();
        if (connectionColor != null) {
    }
    {
    public DBECommandContext getCommandContext()
        } else {
        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DatabaseEditorPreferences.PROP_TITLE_SHOW_FULL_NAME)) {
        if (!CommonUtils.isEmpty(getDefaultFolderId())) {
        } else {
import org.eclipse.swt.graphics.Color;
        memento.putString(DatabaseEditorInputFactory.TAG_PROJECT, context.getDataSource().getContainer().getProject().getName());
    public void saveState(IMemento memento) {
        } else if (DBSObject.class.equals(adapter)) {
import org.eclipse.jface.resource.ImageDescriptor;
        return null;
import java.util.ArrayList;
        }

    public String getToolTipText()
        if (executionContext != null) {
        memento.putString(DatabaseEditorInputFactory.TAG_NODE, node.getNodeUri());
    public String getName()
    }
        this(node, null);
        }
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
    @Nullable
 * See the License for the specific language governing permissions and
            return null;
            if (this.executionContext == null) {
    public void setDefaultFolderId(String defaultFolderId)

{
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;

        if (getExecutionContext() == null ||
        if (container != null) {
    {

import java.util.Map;
 * DBeaver - Universal Database Manager
    public void setDefaultPageId(String defaultPageId)
                    return node.getName();
        return defaultFolderId;
                @Override
            // Detached - nothing to save
    }
                public Object getParent(Object o) {
                public ImageDescriptor getImageDescriptor(Object object) {
    private static final Log log = Log.getLog(DatabaseEditorInput.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPContextProvider;
        return DBeaverIcons.getImageDescriptor(node.getNodeIconDefault());
    protected DatabaseEditorInput(@Nullable NODE node, @Nullable DBECommandContext commandContext)
        this.defaultPageId = defaultPageId;
            return null;
        } else {
import org.eclipse.ui.model.WorkbenchAdapter;

 * Copyright (C) 2010-2025 DBeaver Corp and others
    protected DatabaseEditorInput(@Nullable NODE node)
                commandContext :
    public Object setAttribute(String name, Object value) {
                }
    {
        return executionContext;
    {

import java.util.LinkedHashMap;
        Color connectionColor = getConnectionColor();
import org.eclipse.ui.IPersistableElement;
    public String getDefaultPageId()
    }
    }
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            return adapter.cast(new WorkbenchAdapter() {
    }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
 */
    }

        if (context == null || context.getDataSource().getContainer().isTemporary()) {
        return commandContext;
        return DatabaseEditorInputFactory.ID_FACTORY;
                    return DBeaverIcons.getImageDescriptor(node.getNodeIconDefault());
    }
import org.eclipse.jface.resource.StringConverter;
    }
    {
    @Override
            return "?";
package org.jkiss.dbeaver.ui.editors;
            memento.putString(DatabaseEditorInputFactory.TAG_CONNECTION_COLOR, StringConverter.asString(connectionColor.getRGB()));
        }
    }
    {

import org.jkiss.dbeaver.runtime.properties.PropertySourceEditable;
        if (IWorkbenchAdapter.class.equals(adapter)) {
        return node.getNodeDescription();

    @Override
        DBPDataSourceContainer container = getDataSourceContainer();
    {
        return node;
        return this;
    public DBSObject getDatabaseObject()
    public IPersistableElement getPersistable()
    {
    public String getDefaultFolderId()
            return attributes.remove(name);
        PropertySourceEditable propertySource = new PropertySourceEditable(
            return null;
    {
    public ImageDescriptor getImageDescriptor()

    public Collection<String> getAttributeNames() {
    }
            memento.putString(DatabaseEditorInputFactory.TAG_ACTIVE_FOLDER, getDefaultFolderId());
        if (!CommonUtils.isEmpty(getDefaultPageId())) {
    @Override
    {
            return node.getNodeFullName();
    {
    }
    public String getNodePath() {
import org.jkiss.dbeaver.runtime.DBWorkbench;

    }
        memento.putString(DatabaseEditorInputFactory.TAG_CLASS, getClass().getName());
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collection;
    public Color getConnectionColor() {
        }
            return UIUtils.getConnectionColor(container.getConnectionConfiguration());
        }
    public NODE getNavigatorNode()
    }
                new SimpleCommandContext(
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DatabaseEditorPreferences.PROP_SAVE_EDITORS_STATE)) {
 *
    @Nullable
 * you may not use this file except in compliance with the License.
    @Nullable

    private final NODE node;
