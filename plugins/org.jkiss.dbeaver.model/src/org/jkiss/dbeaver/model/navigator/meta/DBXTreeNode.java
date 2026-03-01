    public DBXTreeNode(

            return true;
        if (parent != null) {
            for (DBXTreeNode child : node.children) {
    }
        this.source = source;
    {
     */
        return standaloneNode;
 *
import org.jkiss.code.Nullable;
/*
import org.apache.commons.jexl3.JexlException;

                List<DBXTreeNode> filteredChildren = new ArrayList<>(children.size());
                    }
            for (DBXTreeIcon icon : extIcons) {
    public DBPImage getDefaultIcon() {
                return true;
                if (iconExpression == null) {
        if (this.children == null) {
            }
            return visibleIf == null || Boolean.TRUE.equals(visibleIf.evaluate(DBNUtils.makeContext(context)));
        }
    public boolean isStandaloneNode() {
     */
    @Nullable
    }
            recursiveLink = this;
        this.visibleIf = node.visibleIf;

                log.debug("Error parsing expression '" + visibleIf + "':" + GeneralUtils.getExpressionParseMessage(e));
                }

        this.navigable = navigable;
        if (context == null) {

    public String toString() {
    public void addChild(@NotNull DBXTreeNode child) {
            return true;
    public List<DBXTreeNode> getChildren(@Nullable DBNNode context) {
        }
        @NotNull String command
        return source;
        if (context instanceof DBNDataSource) {
        if (recursive != null) {
    /**

    private List<DBXTreeNode> children;
     * @return true or false
    }
    {
        handlers.add(new DBXTreeNodeHandler(action, perform, command));
        }
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
/**
        }
    }
                if (handler.getAction() == action) {
        }
        }
        if (handlers != null) {
    }
    @Nullable
 * you may not use this file except in compliance with the License.
    {
    public String getId()
            parent.addChild(this);
        if (!CommonUtils.isEmpty(extIcons) && context != null) {
    }
        return false;
        }
        for (DBXTreeNode child : children) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        children.clear();

    private final boolean inline;
            }
    private final IConfigurationElement config;
        if (children != null) {
        this.inline = node.inline;
    @Nullable
    }
    }
            for (DBXTreeNodeHandler handler : handlers) {
    }
        return id;
     * Human-readable child nodes type
    private List<DBXTreeNodeHandler> handlers = null;
}

    public AbstractDescriptor getSource()
                    continue;
                        "' on node '" + context.getName() + "': " + GeneralUtils.getExpressionParseMessage(e));
     * be found in tree by object

        this.parent = parent;
import org.jkiss.utils.CommonUtils;
        if (node.handlers != null) {
            if (n == afterItem || (n instanceof DBXTreeFolder && n.getChildren() != null && n.getChildren().size() == 1 && n.getChildren().getFirst() == afterItem)) {
 *


        return recursiveLink;
        if (parent != null) {
    public void removeChild(DBXTreeItem item) {
import org.jkiss.dbeaver.model.DBPImage;
            this.icons = new ArrayList<>(node.icons);
                try {
    }
    public static boolean hasNonFolderNode(@NotNull List<DBXTreeNode> list) {
    }
        if (node.children != null) {
    }
                    if (Boolean.TRUE.equals(result)) {

        this.defaultIcon = defaultIcon;
                this.visibleIf = AbstractDescriptor.parseExpression(visibleIf);

    }
            return Collections.emptyList();
            for (String path : recursive.split("/")) {
import java.util.List;
    }
        }
    @NotNull
        }
        if (!CommonUtils.isEmpty(visibleIf)) {
 * DBeaver - Universal Database Manager
    public void clearChildren() {

    {
                    }
        this.inline = inline;
        this.id = node.id;
            }
    }
        this.config = node.config;
        this.defaultIcon = node.defaultIcon;
        if (CommonUtils.isEmpty(children)) {
        }
import org.jkiss.dbeaver.Log;

        }
import org.jkiss.dbeaver.model.DBIcon;
    private final AbstractDescriptor source;
    }
        }
    private DBPImage defaultIcon;
        return parent;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.DBException;
    public boolean isVirtual()
    }

        if (context != null && !CommonUtils.isEmpty(children)) {
            }
        return virtual;
            this.children = new ArrayList<>();
                if (child instanceof DBXTreeObject) new DBXTreeObject(source, this, (DBXTreeObject)child);
 * Licensed under the Apache License, Version 2.0 (the "License");
        this.source = source;
    public abstract String getChildrenTypeLabel(@Nullable DBPDataSource dataSource, @Nullable String locale);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        @Nullable IConfigurationElement config,
    }
                        return icon.getIcon();

            }
    {
            if (recursiveLink != null) {
    public void addIcon(@NotNull DBXTreeIcon icon) {

        return config;
 */
                else if (child instanceof DBXTreeFolder) new DBXTreeFolder(source, this, (DBXTreeFolder)child);
        }
 *
            handlers = new ArrayList<>();
            return DBIcon.TREE_FOLDER;
    }
    @Nullable
 */
     */
                    break;
        this.virtual = virtual;
    public boolean hasChildren(DBNNode context, boolean navigable)
                    return handler;
    private List<DBXTreeIcon> icons;
    public List<DBXTreeIcon> getIcons()
        }
        if (handlers == null) {
        if (children == null) {
        return visibleIf;
    private final String id;
    }
    public DBXTreeNode getParent()
        @NotNull AbstractDescriptor source,
            }
        }
                }
import org.jkiss.dbeaver.model.impl.AbstractDescriptor;
    //private final boolean embeddable;
    private final DBXTreeNode parent;
    {
 * Unless required by applicable law or agreed to in writing, software
    public void moveChildAfter(@NotNull DBXTreeNode child, @NotNull DBXTreeNode afterItem) {
                break;
    public boolean hasChildren(DBNNode context)
        this.standaloneNode = node.standaloneNode;
                for (DBXTreeNode child : children) {
    private DBXTreeNode recursiveLink;
 * See the License for the specific language governing permissions and
    {

    ) {
    public JexlExpression getVisibleIf()
                }
import org.jkiss.code.NotNull;

                }

        return children;
    public DBXTreeNode(@NotNull AbstractDescriptor source, @Nullable DBXTreeNode parent, @NotNull DBXTreeNode node) {
    public boolean isInline()
    private static final Log log = Log.getLog(DBXTreeNode.class);
        return icons;
        this.standaloneNode = standalone;
    @Nullable
                    recursiveLink = recursiveLink.parent;
    @Nullable

            try {
    public DBXTreeNodeHandler getHandler(@NotNull DBXTreeNodeHandler.Action action) {
                    if (child.isVisible(context)) {
    public boolean isNavigable()
                } catch (JexlException e) {
        }
            DBXTreeNode n = children.get(i);
        return getDefaultIcon();
        boolean inline,

    }
    protected List<DBXTreeNode> getChildren() {
                    // do nothing
    {
        return "Node " + id;
        }
        } catch (JexlException e) {
    private final boolean standaloneNode;
        }
    }
        this.virtual = node.virtual;
        boolean navigable,
            }

        if (context instanceof DBNDatabaseNode dbNode && dbNode.getObject() == null) {
    }
        this.config = config;
package org.jkiss.dbeaver.model.navigator.meta;
            }
        return hasChildren(context, false);
    {
    @NotNull
import org.jkiss.dbeaver.utils.GeneralUtils;
        return list.stream().anyMatch(dbxTreeNode -> !(dbxTreeNode instanceof DBXTreeFolder));
        @Nullable DBXTreeNode parent,
        this.id = config == null ? null : config.getAttribute("id");
     *
        boolean virtual,
        return navigable;
            children.add(afterIndex + 1, child);

import org.jkiss.dbeaver.model.navigator.DBNUtils;
import org.jkiss.dbeaver.model.navigator.DBNNode;
                }
     * Remove node item from the node list
            this.children = new ArrayList<>(node.children.size());
    public abstract String getNodeTypeLabel(@Nullable DBPDataSource dataSource, @Nullable String locale);
    private JexlExpression visibleIf;
    private final boolean virtual;
            log.debug("Error evaluating tree node expression '" + visibleIf.getSourceText() + "' on node '" + context.getName() + "': " + GeneralUtils.getExpressionParseMessage(e));
        }
public abstract class DBXTreeNode {
import org.eclipse.core.runtime.IConfigurationElement;
            return false;
import java.util.ArrayList;

            parent.addChild(this);
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

                return recursiveLink.getChildren(context);

            }
        List<DBXTreeIcon> extIcons = getIcons();

        return null;
                        filteredChildren.add(child);

    @NotNull
            boolean hasExpr = false;
            } catch (DBException e) {
     */

            this.icons = new ArrayList<>();
                afterIndex = i;
                else new DBXTreeItem(source, this, (DBXTreeItem)child);
import org.jkiss.dbeaver.model.navigator.DBNDataSource;
    @Override
    }
    ) {
    }
        }
    private final boolean navigable;
    {
        return children;
    protected boolean isVisible(@Nullable DBNNode context) {
                JexlExpression iconExpression = icon.getExpression();
    }
 * limitations under the License.

        for (int i = 0; i < children.size(); i++) {
     * Human readable node type
        try {
import java.util.Collections;
        @Nullable String visibleIf,
    @Nullable
        @Nullable String recursive
            children.remove(item);
            // Try to get some icon depending on it's condition
     * Virtual items. Such items are not added to global metamodel and couldn't
import org.apache.commons.jexl3.JexlExpression;
                return filteredChildren;

        if (node.icons != null) {
        }

        }
    {
            }
    /**
        if (this.icons == null) {

        }
        @NotNull DBXTreeNodeHandler.Action action,

 * You may obtain a copy of the License at
            children.remove(child);
        return inline;
        this.children.add(child);
            if (hasExpr) {
            return recursiveLink != null && recursiveLink.hasChildren(context, navigable);
        this.icons.add(icon);
    public DBXTreeNode getRecursiveLink()
                    hasExpr = true;
            this.handlers = new ArrayList<>(node.handlers);
            if ((!navigable || child.isNavigable()) && child.isVisible(context)) {
    public void setDefaultIcon(@Nullable DBPImage defaultIcon)
        this.parent = parent;
            return false;
    /**
                if (path.equals("..")) {
        return defaultIcon;
import org.jkiss.dbeaver.model.DBPDataSource;
 * DBXTreeNode
        int afterIndex = -1;
                }
    protected IConfigurationElement getConfig() {
        if (afterIndex >= 0) {
        boolean standalone,
                    log.trace("Error evaluating node icon expression '" + icon.getExprString() +
        if (defaultIcon == null && this instanceof DBXTreeFolder) {
     * @param item - node for remove
        this.navigable = node.navigable;
    }
                    Object result = iconExpression.evaluate(DBNUtils.makeContext(context));

    {
        @NotNull DBXTreeNodeHandler.Perform perform,
    public DBPImage getIcon(@Nullable DBNNode context) {
            for (DBXTreeNode child : children) {
    /**
        }
    public void addActionHandler(
    }
                if (child.getVisibleIf() != null) {
