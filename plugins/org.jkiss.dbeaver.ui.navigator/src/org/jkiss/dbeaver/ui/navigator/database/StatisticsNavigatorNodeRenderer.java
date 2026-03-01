            if (node instanceof DBNDataSource) {
                        Method getStatObjectSizeMethod = object.getClass().getMethod("getStatObjectSize");
            StatReadJob statReadJob = statReaders.get(parentObject);
                    classFormatMap.put(object.getClass().getName(), format);
        client.x += ELEMENT_MARGIN;
            getObjectStatistics(node.getParentNode(), realParentObject, parentItem);
import org.jkiss.dbeaver.utils.DataSourceUtils;
                    } catch (Exception e) {
import org.eclipse.swt.widgets.Tree;
    }
    @NotNull
        DBNNode parentNode = element.getParentNode();

            return;
            synchronized (classFormatMap) {
                long maxStatSize = 0;
    }
        }
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
                DBSObject object = dbNode.getObject();
 * Draws item statistics in the right part.
        if (actions.isEmpty()) {
}
        if (statsWasRead && maxObjectSize >= 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *
                            DBDDataFormatterProfile profile = object.getDataSource().getContainer().getDataFormatterProfile();
            } finally {
            gc.setFont(BaseThemeSettings.instance.treeAndTableFontItalic);
        if (!(object instanceof DBPObjectStatistics statistics)) {
            && event.x >= item.x + item.width - PERCENT_FILL_WIDTH
        } else if (node instanceof DBNDatabaseNode n && isOverObjectStatistics(n, tree, event)) {
            }
                }
        record Known(long statObjectSize, long maxObjectSize, @NotNull Format format) implements ObjectStatistics {
            }
            }
            statsWasRead = ((DBPObjectStatisticsCollector) parentObject).isStatisticsCollected();
        synchronized (statReaders) {
                        return NLS.bind("Object size on disk: {0} bytes", formattedSize);
                    low = mid + 1;
            item.width -= client.width - bounds.width;
                    DBNDatabaseNode[] children = dbNode.getChildren(monitor);
            gc.setFont(font);
        record Unknown() implements ObjectStatistics {
        // Compute width required to draw all actions
            }
            DBSObject realParentObject = DBUtils.getPublicObject(((DBNDatabaseNode) parentNode).getObject());
                    return overActionButton.getNodeActionToolTip(view, node);
                }

                if (object instanceof DBPObjectStatistics statistics && statistics.hasStatistics()) {

        boolean hovering = (event.detail & SWT.HOT) != 0;
    @Nullable

import java.lang.reflect.Method;

import org.jkiss.dbeaver.ui.BaseThemeSettings;
            if (statObjectSize <= 0) {
        drawText(gc, DataSourceUtils.getDataSourceAddressText(node.getDataSourceContainer()), bounds);
import org.jkiss.dbeaver.model.DBPEvaluationContext;
import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
                        }
            if (clipped.isEmpty()) {
        if (item == null) {
            }
                });
    }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.navigator.*;
            TreeItem parentItem = ((TreeItem) event.item).getParentItem();
                            formattedSize = formatter.formatValue(statObjectSize);
        @NotNull Rectangle client,
        Font font = gc.getFont();
            return;
                if (object instanceof DBPObjectStatisticsCollector) {
            this.treeItem = treeItem;


                    }
        this.view = view;
            Image image = DBeaverIcons.getImage(action.getNodeActionIcon(getView(), node));
            client.width - bounds.x - bounds.width,
            }

                return ((Number) maxSize).longValue();

        Rectangle client = getClientArea(tree);
                        if (treeItem != null && !treeItem.isDisposed()) {

            }
import org.jkiss.utils.ByteNumberFormat;
            return false;
            client.x + bounds.x + bounds.width,
import org.jkiss.dbeaver.ui.DBeaverIcons;
        try {
        int percentFull;
        StatReadJob(DBNNode parentNode, DBSObject object, TreeItem treeItem) {
            }
                    ((DBPObjectStatisticsCollector) object).collectObjectStatistics(monitor, false, false);
            }
        return null;
    ) {
    private DBNNode getParentItem(DBNDatabaseNode element) {

        }
                    }
            if (node instanceof DBNDatabaseFolder && store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CHILD_COUNT) && !databaseNode.needsInitialization()) {
                monitor.done();
    }

                    } finally {
        boolean hovering
        @NotNull
    private static Rectangle getClientArea(@NotNull Tree tree) {

            drawTextSegment(gc, text, bounds);
            return Status.OK_STATUS;
        try {
        }
        var item = tree.getItem(new Point(event.x, event.y));
            if (store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CONNECTION_HOST_NAME)) {
import org.jkiss.dbeaver.ui.navigator.INavigatorNodeActionHandler;
    }

        TreeItem parentItem = item.getParentItem();
            }
    public String getToolTipText(@NotNull DBNNode node, @NotNull Tree tree, @NotNull Event event) {
    }
            if (isOverObjectStatistics(dbNode, tree, event)) {
            }
                        removeStatReader();
        gc.fillRectangle(bounds.x + bounds.width - PERCENT_FILL_WIDTH + 2, bounds.y + 3, width, bounds.height - 6);
            Image image = DBeaverIcons.getImage(action.getNodeActionIcon(getView(), node));
                    long statObjectSize = statistics.getStatObjectSize();
                            if (child instanceof DBPObjectStatistics) {
        if (!(node.getObject() instanceof DBPObjectStatistics statistics) || !statistics.hasStatistics() || statistics.getStatObjectSize() <= 0) {
    private static final boolean PAINT_ACTION_HOVER = false;
        } else if (parentNode instanceof DBNDatabaseNode) {
            return tree.getDisplay().getSystemCursor(SWT.CURSOR_HELP);
                    }
    }
        DBNNode parentNode = getParentItem(node);
                drawDataSourceActions(gc, dataSourceNode, item, client, hovering);
            if (client.width < size.width || event.y < client.y || event.y >= client.y + client.height) {
        boolean statsWasRead;
        if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS)) {
            return false;
            }
                statReaders.put(parentObject, statReadJob);
            Rectangle size = image.getBounds();
                drawObjectChildrenCounter(gc, databaseNode, item);
    // Disabled because of performance and a couple of glitches
 * Draws connection type marker next to the item name.
    }
                return null;
        private void removeStatReader() {
    }
                                format = formatterClass.getConstructor().newInstance();
                if (overActionButton != null) {
            gc.drawImage(image, bounds.x + bounds.width - size.width, bounds.y + (bounds.height - size.height) / 2);
        if (bounds.width < PERCENT_FILL_WIDTH) {
 *     http://www.apache.org/licenses/LICENSE-2.0
        return parentNode;
        if (parentObject instanceof DBPObjectStatisticsCollector) { // && !((DBPObjectStatisticsCollector) parentObject).isStatisticsCollected()

        if (overdraw) {


        @NotNull GC gc,
 * you may not use this file except in compliance with the License.
        }
    public INavigatorModelView getView() {
    }
        client.height = bounds.height;
        Point extent = gc.textExtent(text);
                    break;
    }
                            Class<? extends Format> formatterClass = propAnnotation.formatter();
import org.jkiss.dbeaver.model.DBPObjectStatistics;
        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        // Draw actions
        super.paintNodeDetails(node, tree, gc, event);
        Point extent = gc.textExtent(text);
                return;
                statReadJob = new StatReadJob(parentNode, parentObject, parentItem);
                if (format == null) {


    private INavigatorNodeActionHandler getActionButton(@NotNull DBNNode node, @NotNull Tree tree, @NotNull Event event) {
        }
import java.util.HashMap;
    }

                return null;
            }
import org.eclipse.osgi.util.NLS;
        }
        }
                drawDataSourceAddress(gc, dataSourceNode, item);
        if (overdraw) {
        if (text.isEmpty()) {
                } else if (ext > bounds.width) {

        int width = Math.max((int) Math.ceil((PERCENT_FILL_WIDTH - 3) * percentFull / 100.0), 1);
        @Override
        // Bar
import org.jkiss.dbeaver.model.runtime.LocalCacheProgressMonitor;
        return new Rectangle(
        private final DBSObject object;
        if (UIStyles.isDarkHighContrastTheme() && PERCENT_FILL_WIDTH - width < PERCENT_FILL_WIDTH / 2) {
        }
                overActionButton.handleNodeAction(view, node, event, defaultAction);
        }
            Object maxSize = parentItem.getData(DatabaseNavigatorTree.TREE_DATA_STAT_MAX_SIZE);
                    if (format == null) {
import org.jkiss.code.NotNull;
        // Frame
    public void performAction(DBNNode node, Tree tree, Event event, boolean defaultAction) {
                                long statObjectSize = ((DBPObjectStatistics) child).getStatObjectSize();

        if (statistics instanceof ObjectStatistics.Known known) {
    private static final int PERCENT_FILL_WIDTH = 50;
        } else {
            return null;
    public Cursor getCursor(@NotNull DBNNode node, @NotNull Tree tree, @NotNull Event event) {
                        String formattedSize;
                    high = mid - 1;
                format = classFormatMap.get(object.getClass().getName());
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            try {
            if (CommonUtils.isBitSet(event.detail, SWT.SELECTED)) {
                    try {
                        format = numberFormat;
            bounds.width -= size.width + ELEMENT_MARGIN;

                                maxStatSize = Math.max(maxStatSize, statObjectSize);
        String text;
        gc.drawRectangle(bounds.x + bounds.width - PERCENT_FILL_WIDTH, bounds.y + 1, PERCENT_FILL_WIDTH, bounds.height - 3);
 * Unless required by applicable law or agreed to in writing, software
            if (!CommonUtils.isEmptyTrimmed(description)) {
            super("Read statistics for " + DBUtils.getObjectFullName(object, DBPEvaluationContext.UI));
                        for (DBNDatabaseNode childNode : children) {
    }
    @Nullable
                monitor.beginTask("Collect database statistics", 1);
        }
    @Nullable
                    }


        bounds.x += 5;
                    // Parent object is not necessary is stats collector.



import java.util.Map;
                if (ext < bounds.width) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.jkiss.dbeaver.model.DBUtils;
            int high = text.length();
import org.jkiss.dbeaver.DBException;
            synchronized (statReaders) {

        if (node instanceof DBNDatabaseNode dbNode) {

    @Override
        Rectangle bounds = item.getBounds();
        ObjectStatistics statistics = getObjectStatistics(node, event);



        if (treeItem == null) {
            bounds.height

            parentNode = parentNode.getParentNode();
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS)) {
            if (store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_NODE_ACTIONS)) {

                    // Calculate max object size
            Format format;
            bounds.y,
        int width = (actions.size() - 1) * ELEMENT_MARGIN;
    private static final Map<DBSObject, StatReadJob> statReaders = new IdentityHashMap<>();
            } else {
        Point textSize = gc.textExtent(text);
        }
        DBSObject object = node.getObject();
 */
                gc.setBackground(gc.getDevice().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
    }
    // Sometimes hover bg remains after mouse move
        } else {
            String clipped = text;
import org.eclipse.swt.graphics.*;
        client.y = bounds.y;

        }
    @Override
        var actions = NavigatorExtensionsRegistry.getInstance().getNodeActions(getView(), node);
            this.object = object;
import org.eclipse.core.runtime.Status;
                            Object prevValue = treeItem.getData(DatabaseNavigatorTree.TREE_DATA_STAT_MAX_SIZE);
import java.text.Format;

            this.parentNode = parentNode;
        }



import org.eclipse.swt.SWT;
                    try {
    private void getObjectStatistics(DBNNode parentNode, DBSObject parentObject, TreeItem parentItem) {
            if (bounds.width < size.width) {


    private static class StatReadJob extends AbstractJob {
        Rectangle client = getClientArea(tree);
        } finally {
                removeStatReader();
import org.jkiss.dbeaver.ui.internal.registry.NavigatorExtensionsRegistry;
    }
        } else {
            // Because it will trigger stats read job which won't read any statistics (as there is no way to load it for individual object).
                            if (formatterClass != Format.class) {
                return;
import org.jkiss.dbeaver.model.data.DBDDataFormatter;

            return null;
        if (actions.isEmpty()) {
        gc.drawText(text, bounds.x + bounds.width - textSize.x, bounds.y + (bounds.height - textSize.y) / 2, true);

            String description = object.getDescription();
 *
    private final INavigatorModelView view;
            // If there is no stats collector then do not check for stats presence
    public StatisticsNavigatorNodeRenderer(INavigatorModelView view) {
            width += size.width;
                gc.fillRectangle(bounds.x + bounds.width - size.width - ELEMENT_MARGIN, bounds.y, size.width + ELEMENT_MARGIN * 2, bounds.height);
        }
        // Draw delimiter between whatever is left from the tree item and the actions
        // Read stats always event if it is already collected.
            gc.setForeground(tree.getBackground());
        long maxObjectSize = statsWasRead ? getMaxObjectSize((TreeItem) event.item) : -1;
                            DBSObject child = childNode.getObject();
        while (parentNode instanceof DBNDatabaseFolder) {
            Rectangle size = image.getBounds();
                drawObjectDescription(gc, databaseNode, item);
 * limitations under the License.
        } else {

        }
            if (overActionButton != null) {
        for (int i = actions.size() - 1; i >= 0; i--) {

        }
            childCount = nodeChildren == null ? 0 : nodeChildren.length;
import org.jkiss.dbeaver.model.DBPObjectStatisticsCollector;
        }
        @NotNull DBNDataSource node,
 */
    }
        // Allow to show action button even if it does not fit into the bounds

                INavigatorNodeActionHandler overActionButton = getActionButton(node, tree, event);
            return tree.getDisplay().getSystemCursor(SWT.CURSOR_HAND);
        }
import org.jkiss.utils.CommonUtils;
            return;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        // Because we need to calc max object size anyway
        Rectangle client = tree.getClientArea();
        }
        bounds.width -= PERCENT_FILL_WIDTH + ELEMENT_MARGIN;
        bounds.width -= extent.x;
                        try {
        return null;
            INavigatorNodeActionHandler action = actions.get(i);
            if (event.x >= client.x + client.width - size.width && event.x < client.x + client.width) {
        if (!(node instanceof DBNDatabaseNode databaseNode)) {
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO)) {
            Image image = DBeaverIcons.getImage(action.getNodeActionIcon(getView(), node));
            percentFull = known.maxObjectSize == 0 ? 0 : (int) (known.statObjectSize * 100 / known.maxObjectSize);
                            formattedSize = String.valueOf(statObjectSize);
                }

        DBSObject parentObject = parentNode instanceof DBNDatabaseNode pn ? DBUtils.getPublicObject(pn.getObject()) : null;
            gc.setForeground(NavigatorThemeSettings.instance.hintColor);
        }

            if (overdraw) {
        }
    private static void drawTextSegment(@NotNull GC gc, @NotNull String text, @NotNull Rectangle bounds) {

        for (INavigatorNodeActionHandler action : actions) {
        if (extent.x > bounds.width) {


                        }
                        } catch (Exception e) {
public class StatisticsNavigatorNodeRenderer extends DefaultNavigatorNodeRenderer {
        if (statistics == null) {
                gc.setForeground(tree.getForeground());
    private boolean isOverActionButton(@NotNull DBNNode node, @NotNull Tree tree, @NotNull Event event) {
            }
import org.jkiss.dbeaver.model.meta.Property;
                drawObjectStatistics(gc, databaseNode, item, event);

import org.eclipse.swt.widgets.Event;
        }
                long finalMaxStatSize = maxStatSize;

            return null;
        return event.x < item.x + item.width
        gc.setFont(tree.getFont());
            && item.width >= PERCENT_FILL_WIDTH;
        if (parentItem != null) {
    private void drawObjectDescription(@NotNull GC gc, @NotNull DBNDatabaseNode node, @NotNull Rectangle bounds) {

        if (object != null) {
        } catch (DBException e) {
            }
        }
    private void drawDataSourceAddress(@NotNull GC gc, @NotNull DBNDataSource node, @NotNull Rectangle bounds) {

                int ext = gc.textExtent(clipped + "...").x;
    @Nullable
        }

        return getActionButton(node, tree, event) != null;
            long statObjectSize = statistics.getStatObjectSize();
            return null;
 * See the License for the specific language governing permissions and
        }
                    if (children != null) {
                statReaders.remove(object);
    private ObjectStatistics getObjectStatistics(@NotNull DBNDatabaseNode node, @NotNull Event event) {
        int childCount = 0;
            drawTextSegment(gc, "...", bounds);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                }
        // Text
        }
        if (node instanceof DBNDataSource dataSourceNode) {
        }
                log.debug(e);
        boolean overdraw = hovering && item.width < width;
            return false;
    private void drawText(@NotNull GC gc, @NotNull String text, @NotNull Rectangle bounds) {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void drawObjectStatistics(@NotNull GC gc, @NotNull DBNDatabaseNode node, @NotNull Rectangle bounds, @NotNull Event event) {
            } catch (DBException e) {

            return;

import java.util.IdentityHashMap;
        var treeItem = tree.getItem(new Point(event.x, event.y));
        } else {
            }
        }
            while (low <= high) {

        private final DBNNode parentNode;
        }
        return -1;
        @NotNull Rectangle item,
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
        }
            INavigatorNodeActionHandler action = actions.get(i);
                            DBDDataFormatter formatter = profile.createFormatter(DBDDataFormatter.TYPE_NAME_NUMBER, null);


    }

        Tree tree = (Tree) event.widget;
        } else {
                    // E.g. table partition parent is table while stats collector is schema
        Rectangle bounds = item.getBounds();
 * Copyright (C) 2010-2026 DBeaver Corp and others


                drawText(gc, CommonUtils.getSingleLineString(description), bounds);
/**
        for (int i = actions.size() - 1; i >= 0; i--) {
        }
                clipped = text.substring(0, mid);

        gc.setBackground(NavigatorThemeSettings.instance.statisticsFrameColor);
            drawTextClipped(gc, text, bounds);

        Rectangle item = getItemBounds(client, treeItem);
                    }

    }
                gc.setForeground(UIStyles.getDefaultTextSelectionForeground());
 * Statistics node renderer.


    private void drawDataSourceActions(
    @Override
            client.width -= size.width + ELEMENT_MARGIN;
            Rectangle size = image.getBounds();
                            }
        client.width -= ELEMENT_MARGIN * 2;
    private static final ByteNumberFormat numberFormat = new ByteNumberFormat();

        var actions = NavigatorExtensionsRegistry.getInstance().getNodeActions(getView(), node);

    }
        }
                } else {
import org.eclipse.core.runtime.IStatus;

    private final Map<String, Format> classFormatMap = new HashMap<>();
        return client;
        private final TreeItem treeItem;
import org.jkiss.dbeaver.Log;

    private sealed interface ObjectStatistics {
            }
            gc.fillRectangle(bounds.x + bounds.width - 1, bounds.y, 1, bounds.height);
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                return action;
        Rectangle client = getClientArea(tree);
        return new ObjectStatistics.Unknown();
            if (maxSize instanceof Number) {
                                treeItem.getParent().redraw();
                // Empty or no size - nothing to show

                            }
            gc.setBackground(gc.getDevice().getSystemColor(SWT.COLOR_LIST_SELECTION));
        DBSObject object = node.getObject();
            }
            return null;
                }
            }
            }
        Color foreground = gc.getForeground();
                UIUtils.asyncExec(() -> {


import org.jkiss.dbeaver.ui.UIUtils;
            text = "...";
import org.jkiss.dbeaver.model.struct.DBSObject;
        bounds.x += extent.x;
                        Property propAnnotation = getStatObjectSizeMethod.getAnnotation(Property.class);
        drawText(gc, text, bounds);
        }
                }
                        }
    private static void drawTextClipped(@NotNull GC gc, @NotNull String text, @NotNull Rectangle bounds) {

            statsWasRead = true;// statistics.hasStatistics();
    @Override
            drawTextSegment(gc, clipped, bounds);
    private static final Log log = Log.getLog(StatisticsNavigatorNodeRenderer.class);
        return view;
                        if (propAnnotation != null) {
                statReadJob.schedule();
            return new ObjectStatistics.Known(statObjectSize, maxObjectSize, format);
            if (node instanceof DBNDatabaseItem && store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_OBJECTS_DESCRIPTION)) {

            percentFull = 0;
        }
                    if (statObjectSize > 0) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
package org.jkiss.dbeaver.ui.navigator.database;
    }
            }
                            }
            int low = 0;
    }
                        log.debug(e);
    public void paintNodeDetails(DBNNode node, Tree tree, GC gc, Event event) {
/*
        Rectangle item = getItemBounds(client, (TreeItem) event.item);
            INavigatorNodeActionHandler overActionButton = getActionButton(node, tree, event);
            text = known.format.format(known.statObjectSize);
        String text = "(" + childCount + ")";

import org.eclipse.swt.widgets.TreeItem;
            // Detect active action
    private boolean isOverObjectStatistics(@NotNull DBNDatabaseNode node, @NotNull Tree tree, @NotNull Event event) {
        Rectangle bounds = item;
            return;
        }

        gc.setForeground(NavigatorThemeSettings.instance.statisticsFrameColor);
    @NotNull
            DBNDatabaseNode[] nodeChildren = node.getChildren(new LocalCacheProgressMonitor(new VoidProgressMonitor()));
            gc.setForeground(foreground);
                int mid = (low + high) >>> 1;


            if (store.getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_STATISTICS_INFO)) {
        gc.drawText(text, bounds.x, bounds.y + (bounds.height - extent.y) / 2, true);
            }
    private static Rectangle getItemBounds(@NotNull Rectangle client, @NotNull TreeItem item) {
        );


    private void drawObjectChildrenCounter(@NotNull GC gc, @NotNull DBNDatabaseNode node, @NotNull Rectangle bounds) {
                if (parentNode instanceof DBNDatabaseNode dbNode) {
                        }
    }
import org.jkiss.dbeaver.ui.UIStyles;
    private long getMaxObjectSize(TreeItem item) {
            bounds = new Rectangle(client.x, bounds.y, client.width, bounds.height);
        }
            if (statReadJob == null) {
        if (node instanceof DBNDataSource n && isOverActionButton(n, tree, event)) {
        }
    }
    private static final int ELEMENT_MARGIN = 3;
            return;
                                treeItem.setData(DatabaseNavigatorTree.TREE_DATA_STAT_MAX_SIZE, finalMaxStatSize);
                            /*if (!CommonUtils.equalObjects(finalMaxStatSize, prevValue)) */{
