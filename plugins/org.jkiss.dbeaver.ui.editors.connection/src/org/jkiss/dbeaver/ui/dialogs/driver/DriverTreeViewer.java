    class ViewContentProvider implements ITreeContentProvider
            }
        {
            }

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * Licensed under the Apache License, Version 2.0 (the "License");
        public Object[] getChildren(Object parent)
            } else {
        }
        @Override
                    collapseToLevel(driver, ALL_LEVELS);
        @Override
                    break;
        usersColumn.getColumn().setText("#");
        {
    }
        List<DBPDataSourceContainer> allDataSources = DataSourceRegistry.getAllDataSources();
            return count;
            this.name = name;
                return !((DriverCategory) parent).drivers.isEmpty();


        {
                return new Object[0];
            }
            return obj instanceof DriverCategory &&
                }
                icon = ((DataSourceProviderDescriptor) obj).getIcon();
            DriverTreeViewer.this.sortByName = this.sortByName;
            return DBeaverIcons.getImage(getImage(element, 0));
        public Object[] getElements(Object parent)

            getTree().setSortDirection(SWT.DOWN);
            }
                    cell.setText(getText(cell.getElement()));

        @Override

                return ((DataSourceProviderDescriptor) element).getName();

            DBPImage driverImage = null;
            }
 *

    public static class DriverCategory {

            if (driverImage != null) {
            }
                return ((DataSourceProviderDescriptor) obj).getDescription();

        for (DBPDataSourceProviderDescriptor provider : providers) {

            if (element instanceof DataSourceProviderDescriptor) {
        nameColumn.setLabelProvider(new ViewLabelProvider());

                    } else {
        } else {
                }
        @Override
            if (parent instanceof DriverCategory) {
                return element.toString();
                    }
 */
            if (parent instanceof Collection) {
        new DefaultViewerToolTipSupport(this);
        final String name;
            }
        @Override
            }
        {
import org.eclipse.swt.widgets.Listener;
    private Collection<Object> collectDrivers()
            return defImage;
    }
        @Override
    }
            DBPImage defImage = DBIcon.TREE_PAGE;
        Collection<Object> drivers = collectDrivers();
                    return categories.get(driver.getCategory());
 * DBeaver - Universal Database Manager
        if (providers != null) {
            for (DBPDriver driver : getDrivers()) {
            return null;


                }
                case 0:
        this.setInput(drivers);
        }
            int count = 0;
            } else {

        @Override
                    }
            return name;
                String name1 = o1 instanceof DriverDescriptor ? ((DriverDescriptor) o1).getName() : ((DriverCategory) o1).getName();
 */

import org.jkiss.dbeaver.model.DBIcon;
            List<? extends DBPDriver> drivers = provider.getEnabledDrivers();
        usersColumn.getColumn().addListener(SWT.Selection, new DriversSortListener(usersColumn.getColumn(), false));
 * limitations under the License.
        public void update(ViewerCell cell) {
import org.jkiss.dbeaver.model.DBPImage;
import org.eclipse.swt.SWT;
        {
                count += DriverUtils.getUsedBy(driver, allDataSources).size();
    private List<DBPDataSourceProviderDescriptor> providers;
import org.jkiss.dbeaver.model.connection.DBPDriver;

                        driverList.add(driverCategory);

        nameColumn.getColumn().setText("Name");

    private int getConnectionCount(Object obj)
        @Override
            if (element instanceof DataSourceProviderDescriptor) {
        final List<DriverDescriptor> drivers = new ArrayList<>();
                return element.toString();
    }
import org.eclipse.jface.viewers.*;
                        super.expandToLevel(element, 1);
    public void setSelection(ISelection selection, boolean reveal) {
            for (Object driver : drivers) {

        super.refresh();
        {
            this.sortByName = sortByName;
        public String getText(Object element) {
            }
            IStructuredSelection selection = (IStructuredSelection) event.getSelection();
        getTree().setHeaderVisible(true);
        public Image getImage(Object element) {
            DriverTreeViewer.this.refresh();
package org.jkiss.dbeaver.ui.dialogs.driver;
import org.jkiss.dbeaver.registry.DataSourceProviderRegistry;
        if (obj instanceof DataSourceProviderDescriptor) {
        } else if (obj instanceof DriverCategory) {
        if (this.providers == null) {
            for (DBPDriver driver : ((DataSourceProviderDescriptor) obj).getEnabledDrivers()) {
        {

        {
        @Override
        super(parent, style);
        public DBPImage getImage() {
            return getChildren(parent);
			if (obj instanceof DataSourceProviderDescriptor) {
            }
                    break;
        if (expandRecent) {
                return ((DataSourceProviderDescriptor) element).getDescription();
            int count2 = getConnectionCount(o2);
        usersColumn.setLabelProvider(new ViewLabelProvider());

            this.collapseAll();
        }
        }


                    driverCategory.drivers.add((DriverDescriptor) driver);
import org.eclipse.swt.widgets.TreeColumn;
    private final List<Object> driverList = new ArrayList<>();
        public int hashCode()
        this.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.ui.DefaultViewerToolTipSupport;
            } else if (parent instanceof DriverCategory) {
    {
public class DriverTreeViewer extends TreeViewer {
            }
import org.eclipse.swt.layout.GridData;
                    if (Boolean.TRUE.equals(getExpandedState(element))) {
                    cell.setText(count <= 0 ? "" : String.valueOf(count));
            getTree().setSortColumn(this.column);

    }
        }
        {
            return DBIcon.TREE_DATABASE_CATEGORY;
        private final boolean sortByName;
        }
                if (CommonUtils.isEmpty(category)) {
                return ((DriverCategory) element).name;
            } else if (obj instanceof DriverDescriptor) {
                if (driverImage == null) {
        public Object getParent(Object child)

        TreeViewerColumn nameColumn = new TreeViewerColumn(this, SWT.LEFT);
        public String getName()
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
    private final Map<String,DriverCategory> categories = new HashMap<>();
                    driverImage = driver.getPlainIcon();
            if (child instanceof DriverDescriptor) {
        } else {
            } else {
            return count;
            return drivers;
        public String getDescription(Object obj)
            if (!selection.isEmpty()) {
    }
import org.jkiss.dbeaver.registry.driver.DriverUtils;

            return DriverUtils.getUsedBy((DBPDriver) obj, allDataSources).size();
            } else if (element instanceof DriverCategory) {
                return "";
        public DBPImage getImage(Object obj, int index)

                    DriverCategory driverCategory = categories.get(category);
 * See the License for the specific language governing permissions and
        for (DriverCategory category : categories.values()) {

                    driverImage = null;
        nameColumn.getColumn().addListener(SWT.Selection, new DriversSortListener(nameColumn.getColumn(), true));
            }
 * DriverTreeViewer
                        categories.put(category, driverCategory);
        public void dispose()
        {
            if (obj instanceof DataSourceProviderDescriptor) {
                return icon;
        }
        public void handleEvent(Event event) {
    public void initDrivers(List<DBPDataSourceProviderDescriptor> providers, boolean expandRecent)
        }
            int count = 0;
        }
            return 0;
    @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Override
        }
 * Unless required by applicable law or agreed to in writing, software
                return null;
        public String getToolTipText(Object element) {
        public boolean hasChildren(Object parent)
                        super.collapseToLevel(element, 1);
            DBPImage image = getImage(cell.getElement(), cell.getColumnIndex());

        }
        }
                String name2 = o2 instanceof DriverDescriptor ? ((DriverDescriptor) o2).getName() : ((DriverCategory) o2).getName();
 * you may not use this file except in compliance with the License.
        public boolean equals(Object obj)
            }
                icon = ((DriverCategory)obj).getImage();
        public List<DriverDescriptor> getDrivers()
                } else {
        }
                if (driver.getCategory() != null) {
            }
            switch (cell.getColumnIndex()) {
            // Expand used driver categories
import org.jkiss.dbeaver.registry.DataSourceRegistry;
            }
            collectDrivers();
                return ((DriverDescriptor) element).getName();
            DBPImage icon = null;
        {
import org.eclipse.swt.graphics.Image;
                }
            this.column = column;
        {
                    final int count = getConnectionCount(cell.getElement());
                count += DriverUtils.getUsedBy(driver, allDataSources).size();

 *
    public DriverTreeViewer(Composite parent, int style) {
            } else if (obj instanceof DriverCategory) {
import java.util.*;
        {
                return ((DriverDescriptor) obj).getDescription();
            }
/*
import org.eclipse.swt.widgets.Composite;
			    defImage = DBIcon.TREE_FOLDER;
        this.setContentProvider(new ViewContentProvider());
                    expandToLevel(driver, ALL_LEVELS);
 *
        }
                    cell.setText("");
    class ViewLabelProvider extends CellLabelProvider implements ILabelProvider {
        }


        driverList.clear();

        }
            if (image != null) {

            category.drivers.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));

        @Override
            } else if (element instanceof DriverDescriptor) {
                ((DriverCategory) obj).name.equals(name);
        }
        return driverList;
        driverList.sort((o1, o2) -> {
 *
                return ((DriverCategory) parent).getDrivers().toArray();
    {
        }
                    if (driverCategory == null) {
        }
        } else if (obj instanceof DBPDriver) {
        });
                if (driver instanceof DriverCategory && getConnectionCount(driver) > 0) {
        }
    private boolean sortByName = false;
        super.setSelection(selection, reveal);

        });
    }
            } else if (element instanceof DriverDescriptor) {
    @Override
            if (icon != null) {
                Object element = selection.getFirstElement();
                DriverDescriptor driver = (DriverDescriptor) child;
    public void refresh()
                } else if (!driverImage.equals(driver.getPlainIcon())) {


        public String toString()
        }
                String category = driver.getCategory();
        public void inputChanged(Viewer v, Object oldInput, Object newInput)
            } else {
        this.providers = providers;
        }
            if (index != 0) {
            if (sortByName || count1 == count2) {
        for (DriverCategory category : categories.values()) {
        UIUtils.expandAll(this);
                        driverCategory = new DriverCategory(category);
        private final TreeColumn column;
                case 1:
    {
    {
        @Override
    }
}
                icon = ((DriverDescriptor) obj).getIcon();
        }
    private class DriversSortListener implements Listener {
        TreeViewerColumn usersColumn = new TreeViewerColumn(this, SWT.LEFT);
            return name.hashCode();
            for (DBPDriver driver : ((DriverCategory) obj).drivers) {
                return name1.compareToIgnoreCase(name2);
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
            category.drivers.clear();
    {
        }
        {
 * @author Serge Rider
                } else {
            }
                cell.setImage(DBeaverIcons.getImage(image));
                return count2 - count1;
            }
                return ((Collection<?>) parent).toArray();
    }

import org.jkiss.dbeaver.ui.UIUtils;
        }
                    if (!driverList.contains(driverCategory)) {
                    break;

import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
 * You may obtain a copy of the License at
                    }
                    break;
        addDoubleClickListener(event -> {
            } else {
                }
        @Override
            for (DBPDriver driver : drivers) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
        DriversSortListener(TreeColumn column, boolean sortByName) {
                if (element instanceof DriverCategory || element instanceof DataSourceProviderDescriptor) {
        }
            int count1 = getConnectionCount(o1);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
        }
import org.eclipse.swt.widgets.Event;
import org.jkiss.dbeaver.ui.DBeaverIcons;
        DriverCategory(String name)
        }
            this.providers = DataSourceProviderRegistry.getInstance().getEnabledDataSourceProviders();
            return name;
        UIUtils.packColumns(getTree(), true, new float[] {0.9f, 0.1f});
            } else if (obj instanceof DriverDescriptor) {

                    driverList.add(driver);
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;
            return false;
                return ((DriverDescriptor) element).getDescription();

        @Override
                default:

/**
import org.jkiss.utils.CommonUtils;
                return driverImage;

