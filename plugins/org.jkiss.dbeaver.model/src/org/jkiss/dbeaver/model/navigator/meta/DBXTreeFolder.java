            List<DBXTreeNode> childrenWithContributions = new ArrayList<>(children);
    public void setInjectedConfig(IConfigurationElement injectedConfig) {
    }
            return itemIcon;

import org.jkiss.dbeaver.Log;
        this.label = label;
    public void setLabel(String label) {
    private boolean isAdminFolder;
                for (DBPEditorContribution editor : editors) {
        if (contributedCategories == null) {
public class DBXTreeFolder extends DBXTreeNode {

        if (!CommonUtils.isEmpty(contributedCategories) && context instanceof DBNDatabaseNode) {
                .stream()

        public String getClassName() {
        this.type = type;
        } else {
import org.jkiss.dbeaver.runtime.DBWorkbench;

                        continue;
                        editor.getDescription(),


                if (node instanceof DBXTreeItem treeItem && path.equals(treeItem.getPath())) {
            DBPDataSourceContainer dataSource = ((DBNDatabaseNode) context).getDataSourceContainer();
                String itemTypeName = it.getAttribute("type");
        this.isOptional = folder.isOptional;
            if (CommonUtils.isNotEmpty(childId)) {
            IConfigurationElement config = getConfig();
        }
        if (!hasChildren) {
    @NotNull
    }
        return !CommonUtils.isEmpty(id) ? id : type;
                        getSource(),
 * you may not use this file except in compliance with the License.
    @Override
    }
                }
    public List<DBXTreeNode> getChildren(@Nullable DBNNode context) {
        this.label = config.getAttribute("label");
    public String getNodeTypeLabel(@Nullable DBPDataSource dataSource, @Nullable String locale) {
        // If child nodes are only folders and all non visible then parent folder is also not visible
        if (getChildren() != null) {
                .map(DBXTreeItem::getPath)
                        itemTypeName,
        this.label = folder.label;
import org.jkiss.code.Nullable;
 * limitations under the License.
                        null,
            String childId = getChildren()
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderRegistry;
            hasChildren = !CommonUtils.isEmpty(contributedCategories);
        public String getItemType() {
    public void addContribution(String category) {
        return getNodeTypeLabel(dataSource, locale);
import org.jkiss.utils.ArrayUtils;
        return isAdminFolder;
        contributedCategories.add(category);
    private static final Log log = Log.getLog(DBXTreeFolder.class);
        this.contributedCategories = folder.contributedCategories == null ? null : new ArrayList<>(folder.contributedCategories);



        return children;
    public void setDescription(String description) {
        boolean hasChildren = super.hasChildren(context, navigable);
        return description;
        this.description = config.getAttribute("description");
    public String getDescription() {
        String id = getId();
    }
                    objectCreateTypes.add(new ItemType(
            return id;
            }
                return childId;

            for (DBXTreeNode node : getChildren()) {
            return label;
        this.isAdminFolder = CommonUtils.getBoolean(config.getAttribute("adminFolder"), false);
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    public boolean hasChildren(DBNNode context, boolean navigable) {
    private String type;
        this.isOptional = isOptional;
 * You may obtain a copy of the License at
        return false;
                    }
        }
    public String getType() {
    }
    public String toString() {
                itemTypes = objectCreateTypes.toArray(new ItemType[0]);
 */
            }
            }
        private ItemType(String className, String itemType, DBPImage itemIcon) {
import java.util.stream.Collectors;
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
                    if (!editor.isVisible(context)) {

        private final String className;
            }
                DBPEditorContribution[] editors = dspRegistry.getContributedEditors(category, dataSource);
    private String description;
                return true;

 *
    public String getOptionalItem() {
    private IConfigurationElement injectedConfig;
    }
        }
        for (DBXTreeNode childNode : getChildren(context)) {

            for (String category : contributedCategories) {
            if (injectedConfig != null) {

import org.jkiss.dbeaver.model.DBPDataSource;
 * distributed under the License is distributed on an "AS IS" BASIS,
        IConfigurationElement[] itemTypesConfig = config.getChildren("itemType");
        return optionalItem;
    @Override
    @Override

import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
import java.util.List;
import org.jkiss.dbeaver.model.connection.DBPEditorContribution;
            String injectedLabel = null;

        private final String itemType;
                        editor.getEditorId());
        this.type = folder.type;

    }
    private String label;
                    DBXTreeObject editorNode = new DBXTreeObject(
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;

    }
    }
        String id = getId();
                }

                        null, // No parent - otherwise we'll have dups after each call
            return className;
                    return treeItem;
        this.optionalItem = config.getAttribute("optionalItem");
                    if (objectCreateTypes == null) {
    @Override
    private final String optionalItem;
}
    private ItemType[] itemTypes = null;
                        it.getAttribute("label"),
        }
    }
    public String getHumanReadableId() {
        List<DBXTreeNode> children = super.getChildren(context);
    public boolean isOptional() {

import org.jkiss.utils.CommonUtils;

    }
    }
            contributedCategories = new ArrayList<>();
        log.warn("Type will be used as id: " + type);
    @Override
        if (!ArrayUtils.isEmpty(itemTypesConfig)) {
            }
    }
        this.description = description;

            return false;
            if (childNode.isVisible(context)) {
        this.type = type;
    }
            }
            return childrenWithContributions;
        return CommonUtils.safeList(contributedCategories);
    private List<String> contributedCategories = null;
    public boolean isAdminFolder() {
        this.description = folder.description;
import org.jkiss.code.NotNull;
 *
                        editor.getLabel(),
    @Nullable
    }

                    editorNode.setDefaultIcon(editor.getIcon());
        return "Folder " + label;
import org.eclipse.core.runtime.IConfigurationElement;
        }
    public String getIdOrType() {

            this.className = className;
        return type;

        return type;
                    childrenWithContributions.add(editorNode);
    private final boolean isOptional;

        public DBPImage getItemIcon() {
                .filter(CommonUtils::isNotEmpty)
        super(source, parent, config, navigable, false, virtual, false, visibleIf, null);
        }
    public List<String> getContributedCategories() {
        this.optionalItem = folder.optionalItem;
package org.jkiss.dbeaver.model.navigator.meta;
                .filter(child -> child instanceof DBXTreeItem)
                }
        return itemTypes;
        }
    }
        return null;
import org.jkiss.dbeaver.model.navigator.DBNNode;
        }
                (config == null ? getType() : config.getAttribute("label", locale));
    protected boolean isVisible(@Nullable DBNNode context) {
        }
                        objectCreateTypes = new ArrayList<>();

        }
        }
 * See the License for the specific language governing permissions and
        if (getChildren() != null) {
 * Unless required by applicable law or agreed to in writing, software
        }
            List<ItemType> objectCreateTypes = null;


            DBPDataSourceProviderRegistry dspRegistry = DBWorkbench.getPlatform().getDataSourceProviderRegistry();
        }
        if (locale == null) {
    public DBXTreeFolder(AbstractDescriptor source, DBXTreeNode parent, IConfigurationElement config, String type, boolean navigable, boolean virtual, String visibleIf, boolean isOptional) {

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                if (!CommonUtils.isEmpty(itemTypeName)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
                .map(child -> (DBXTreeItem) child)

        super(source, parent, folder);

 * DBXTreeFolder

import java.util.ArrayList;
            }
            if (objectCreateTypes != null) {
                .collect(Collectors.joining("_"));
    }

    public String getChildrenTypeLabel(@Nullable DBPDataSource dataSource, String locale) {
            this.itemType = itemType;
/**
                    }
            return CommonUtils.isNotEmpty(injectedLabel) ? injectedLabel :
            return itemType;
    public DBXTreeItem getChildByPath(@NotNull String path) {

                        source.iconToImage(it.getAttribute("icon"))));
        this.itemTypes = folder.itemTypes;
    }
        if (CommonUtils.isNotEmpty(id)) {
    }
    public static class ItemType {
    }
        return isOptional;
    DBXTreeFolder(AbstractDescriptor source, DBXTreeNode parent, DBXTreeFolder folder) {
 */
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public ItemType[] getItemTypes() {
    public void setType(String type) {
                        null,
        if (!super.isVisible(context)) {
            this.itemIcon = itemIcon;
import org.jkiss.dbeaver.model.DBPImage;
        private final DBPImage itemIcon;
    }
    }
        return hasChildren;


                injectedLabel = injectedConfig.getAttribute("changeFolderLabel", locale);
        this.injectedConfig = injectedConfig;
/*

            // Add contributed editors
    }
            for (IConfigurationElement it : itemTypesConfig) {
