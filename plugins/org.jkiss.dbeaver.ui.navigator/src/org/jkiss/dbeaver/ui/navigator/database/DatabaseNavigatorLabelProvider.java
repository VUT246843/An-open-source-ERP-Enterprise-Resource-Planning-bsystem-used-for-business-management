                }

        }
            if (element instanceof DBNDataSource dbnDataSource) {
    }

        Image image = null;
                    tooltip.add(NLS.bind(
        setNavigatorFont(tree);
        } else if (obj instanceof DBNNode) {
    protected Color lockedForeground;
                event.x = treeLocation.x;
    @Override
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_TOOLTIPS)) {
        String text = null;
/**
        }
        if (labelDecorator != null && obj instanceof DBNResource) {
                return NavigatorThemeSettings.instance.transientForeground;
    }
 *
                    tooltip.add(NLS.bind(UINavigatorMessages.navigator_provider_element_tooltip_datasource_error, ds.getConnectionError()));
public class DatabaseNavigatorLabelProvider extends ColumnLabelProvider implements IFontProvider, IColorProvider {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
            if (element instanceof DBNResource &&
                String briefInfo = dbnNode.getNodeBriefInfo();
    @Override
            if (dbnNode.isLocked()) {


                if (tipText != null) {
}
        this.tree = tree;
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                        tooltip.add(NLS.bind(
    public boolean useNativeToolTip(Object object) {
                Point cursorLocation = Display.getCurrent().getCursorLocation();
    private final DatabaseNavigatorTree tree;
        return null;
        if (obj instanceof ILabelProvider labelProvider) {
                            databaseVersion.toString()));
                if (!CommonUtils.isEmpty(briefInfo)) {
                if (!CommonUtils.isEmpty(cfg.getUrl())) {
                if (!CommonUtils.isEmpty(ds.getDescription())) {

                if (ds.isProvided()) {
            return node.getNodeDisplayName();
                final DBPConnectionConfiguration cfg = ds.getConnectionConfiguration();
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_TOOLTIPS)) {
                    if (databaseVersion != null) {
            DBPDataSourceContainer ds = dbnDataSource.getDataSourceContainer();
        }
import org.jkiss.dbeaver.model.DBPDataSource;
        if (element instanceof DBNNode) {
        }
 * you may not use this file except in compliance with the License.
                String tipText = tree.getItemRenderer().getToolTipText(dbnDataSource, treeControl, event);
    }
            text = "?";
        }
    ILabelDecorator getLabelDecorator() {
            }

                tooltip.add(NLS.bind(UINavigatorMessages.navigator_provider_element_tooltip_datasource_name, ds.getName()));
            final String description = node.getNodeDescription();
                return UIUtils.getConnectionColor(ds.getConnectionConfiguration());

    }
                DBPDataSourceContainer ds = dbnDataSource.getDataSourceContainer();
                }
            if (ds != null) {
    @Override

        }
    @Override

                        UINavigatorMessages.navigator_provider_element_tooltip_datasource_description,
    public Image getImage(Object obj) {
    @Override
        super.dispose();
package org.jkiss.dbeaver.ui.navigator.database;
            image = labelDecorator.decorateImage(image, obj);
import org.jkiss.utils.CommonUtils;
    public int getToolTipStyle(Object object) {


            {
                Tree treeControl = tree.getViewer().getTree();
import org.eclipse.swt.widgets.Display;
                }

            image = labelProvider.getImage(obj);
    public Image getToolTipImage(Object element) {

                    }
            if (dbnNode instanceof DBNDataSource dbnDataSource) {
            tree);
import org.osgi.framework.Version;
                }

                } else if (!CommonUtils.isEmpty(cfg.getDatabaseName())) {
import org.jkiss.dbeaver.model.navigator.DBNResource;

            return lockedForeground;
    }
                Color bgColor = UIUtils.getConnectionColor(ds.getConnectionConfiguration());
                        UINavigatorMessages.navigator_provider_element_tooltip_datasource_database_name,
 * You may obtain a copy of the License at
        return null;
            return null;
                    tooltip.add(NLS.bind(UINavigatorMessages.navigator_provider_element_tooltip_datasource_url, cfg.getUrl()));
        return element instanceof DBNNode && ((DBNNode) element).isFiltered();

                    tooltip.add(NLS.bind(UINavigatorMessages.navigator_provider_element_tooltip_datasource_user, cfg.getUserName()));
 */
 * DBeaver - Universal Database Manager
    @Override
                    tooltip.add(UINavigatorMessages.navigator_provider_element_tooltip_datasource_provided);
    public DatabaseNavigatorLabelProvider(@NotNull DatabaseNavigatorTree tree) {
                return bgColor == null ? null : UIStyles.getContrastColor(bgColor);
    }
        if (text == null) {
    private ILabelDecorator labelDecorator;
                return null;
        if (isFilteredElement(obj)) {
    @Override
                }
                }
    }
                        ds.getDescription()));
            }
    }
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
*/
 * Copyright (C) 2010-2025 DBeaver Corp and others
                if (!CommonUtils.isEmpty(cfg.getUserName())) {
    }
        }
import org.jkiss.dbeaver.model.struct.DBSWrapper;
                    return tipText;
            }

                            UINavigatorMessages.navigator_provider_element_tooltip_datasource_database_version,
            text = obj.toString();
    private static void setNavigatorFont(@NotNull DatabaseNavigatorTree tree) {
                    tooltip.add(UINavigatorMessages.navigator_provider_element_tooltip_datasource_read_only);
 * Unless required by applicable law or agreed to in writing, software
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.graphics.Color;
            return DBeaverIcons.getImage(((DBNNode) element).getNodeIconDefault());
 * DatabaseNavigatorLabelProvider
    public Color getBackground(Object element) {
            return BaseThemeSettings.instance.treeAndTableFontBold;
                    text += " (" + briefInfo + ")";
import org.eclipse.swt.widgets.Text;

import org.jkiss.dbeaver.model.navigator.DBNNode;
                if (ds.getConnectionError() != null) {
                    return BaseThemeSettings.instance.treeAndTableFontItalic;
                Point treeLocation = treeControl.toControl(cursorLocation);
    }

    public Color getForeground(Object element) {
 *
        if (element instanceof DBNNode dbnNode)  {
        this.labelDecorator = labelDecorator;
                return tooltip.toString();
        if (element instanceof TreeNodeSpecial) {
        }
        }
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
    }
                }
        } else if (obj instanceof DBNNode dbnNode) {
            }
    @Override
 * See the License for the specific language governing permissions and
import org.eclipse.swt.graphics.Point;

        return null;
                if (dataSource != null) {
        return 0;
            if (dbnNode instanceof DBSWrapper dbsWrapper && dbsWrapper.getObject() != null && !dbsWrapper.getObject().isPersisted()) {

            }
        if (element instanceof DBNDataSource dbnDataSource) {
import org.eclipse.swt.graphics.Font;
            if (!CommonUtils.isEmptyTrimmed(description)) {
                }
        return image;
                return lockedForeground;
        } else {
    }
import org.eclipse.swt.widgets.Tree;
import org.jkiss.dbeaver.model.navigator.DBNUtils;
import org.jkiss.dbeaver.ui.navigator.database.load.TreeNodeSpecial;

            }
            return BaseThemeSettings.instance.treeAndTableFont;
        if (element instanceof DBNDataSource dbnDataSource) {
            }
            if (DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_OBJECT_TIPS)) {
        return labelDecorator;
        BaseThemeSettings.instance.addPropertyListener(

import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
    private boolean isFilteredElement(Object element) {
import org.eclipse.osgi.util.NLS;
            image = DBeaverIcons.getImage(((DBNNode) obj).getNodeIconDefault());
    @Override
import java.util.StringJoiner;
        return true;
    @Override
    public void dispose() {

    }
                        cfg.getDatabaseName()));
                Event event = new Event();
    void setLabelDecorator(ILabelDecorator labelDecorator) {

            }
        }

    public Font getFont(Object element) {
                StringJoiner tooltip = new StringJoiner("\n");
                    tooltip.add(NLS.bind(
    }
                DBPDataSource dataSource = ds.getDataSource();
            if (ds != null) {
        } else if (element instanceof IToolTipProvider provider) {
import org.eclipse.swt.widgets.Event;
    public String getToolTipText(Object element) {
        viewer.getControl().setFont(normalFont);
                event.y = treeLocation.y;
    }
                if (ds.isConnectionReadOnly()) {
        final Text filter = tree.getFilterControl();
        return text;
        this.lockedForeground = Display.getDefault().getSystemColor(SWT.COLOR_DARK_GRAY);
                    Version databaseVersion = dataSource.getInfo().getDatabaseVersion();
        if (filter != null) {
            text = dbnNode.getNodeDisplayName();
        }
import org.eclipse.swt.graphics.Image;
import org.jkiss.code.NotNull;
                !DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.NAVIGATOR_SHOW_CONTENTS_IN_TOOLTIP)
            final DBPDataSourceContainer ds = dbnDataSource.getDataSourceContainer();
/*
        return super.getToolTipStyle(object);

            }
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
            text += " (...)";
 *
            return provider.getToolTipText(element);
 *     http://www.apache.org/licenses/LICENSE-2.0
                return description;
    public String getText(Object obj) {
            s -> setNavigatorFont(tree),
            ) {
        return null;
        } else if (element instanceof DBNNode node) {
                    //treeControl.getShell().toDisplay(cursorLocation.x, cursorLocation.y);
import org.jkiss.dbeaver.ui.internal.UINavigatorMessages;
        if (obj instanceof ILabelProvider labelProvider) {
        }
 * limitations under the License.
            UIFonts.Eclipse.TREE_AND_TABLE_FONT_FOR_VIEWS,
        Font normalFont = BaseThemeSettings.instance.treeAndTableFont;
        } else if (obj != null) {
    @NotNull
        if (DBNUtils.isDefaultElement(element)) {

import org.jkiss.dbeaver.model.navigator.DBNDataSource;
                }
            }
            return null;
import org.eclipse.swt.SWT;

        final TreeViewer viewer = tree.getViewer();
                final DBPDataSourceContainer ds = dbnDataSource.getDataSourceContainer();
            text = labelProvider.getText(obj);
        viewer.refresh();
    public int getToolTipDisplayDelayTime(Object object) {
            filter.setFont(normalFont);
    }
                if (ds != null && (ds.isProvided() || ds.isTemporary())) {
