        folderComposite.addFolderListener(folderId1 -> {
                    }
                drivers.add(driver);
            for (TabbedFolderInfo folder : folders) {
        private AdvancedListViewer viewer;
                "all", UIConnectionMessages.dialog_driver_category_all_label, DBIcon.TREE_DATABASE, UIConnectionMessages.dialog_driver_category_all_tip, false,
 *

        List<TabbedFolderInfo> extFolders = new ArrayList<>();
        String folderId = UIUtils.getDialogSettings(DIALOG_ID).get(PARAM_LAST_FOLDER);
        });
import java.util.List;

        void refreshDrivers() {
    }
import org.jkiss.dbeaver.ui.UIUtils;
 // - Cloud
        return viewer == null ? null : viewer.getSelection();
import org.jkiss.dbeaver.registry.DriverCategoryDescriptor;
        public void createControl(Composite parent) {
    protected void setSelectionToWidget(List l, boolean reveal) {
            public String getToolTipText(Object element) {
        private boolean activated;

        folderComposite.setFolders(getClass().getSimpleName(), folders.toArray(new TabbedFolderInfo[0]));
 */


    // Internal stuff

 * DBeaver - Universal Database Manager
                }
        }
                        category.getName(),
        StructuredViewer viewer = getCurrentViewer();
    @Override
                control.setFocus();
import org.eclipse.swt.graphics.Image;

                }
 */
    public Object getInput() {
        }
        }
                        false,
        StructuredViewer viewer = getCurrentViewer();
        @Override
                }
        return drivers;
    public Control getControl() {
 // - Embedded
            }
                        toolTip.append("\n\n");
            @Override

        }
        List<DBPDriver> ratedDrivers = new ArrayList<>(allDrivers);
        }
                drivers.sort(listComparator);
import org.jkiss.dbeaver.ui.controls.finder.viewer.AdvancedListViewer;
        public void aboutToBeHidden() {
    private static final String PARAM_LAST_FOLDER = "folder";
    }

        curFilters = filters;
                    fireSelectionChanged(new SelectionChangedEvent(currentViewer, selection));
            }
            if (cmp == 0) {
    private static final Log log = Log.getLog(DriverTabbedViewer.class);
                        category.getIcon(),
    }

import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.jface.viewers.*;
            }
                return toolTip.toString();

                ((DriverListFolder) folderComposite.getActiveFolder()).viewer.setFilters(curFilters);
            new TabbedFolderInfo(
                if (!drivers.isEmpty()) {
        List<DBPDriver> drivers = new ArrayList<>();
        this.listComparator = listComparator;

    public ISelection getSelection() {
import org.jkiss.dbeaver.model.connection.DBPDriver;
        return folderComposite;
        }
                } else {
import org.jkiss.utils.CommonUtils;
            public Image getImage(Object element) {
    }
 *
        }
                if (!CommonUtils.isEmpty(driver.getDescription())) {
        if (viewer != null) {
        }
 *
            folderId = "all";
 * you may not use this file except in compliance with the License.
    }
        List<DBPDriver> recentDrivers = DriverUtils.getRecentDrivers(allDrivers, 12);
            DriverCategoryDescriptor cat2 = ((DriverListFolder) o2.getContents()).category;
 // - All


                }
import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderInfo;

    }
import org.jkiss.dbeaver.registry.DriverManagerRegistry;
    protected void internalRefresh(Object element) {
        folderComposite = new TabbedFolderComposite(parent, style) {

    public void reveal(Object element) {
    @Override

                } else {
                if (activeFolder != null) {
                        category.getDescription(),
import org.eclipse.swt.widgets.Widget;
            }
        StructuredViewer viewer = getCurrentViewer();
        });
        if (viewer != null) {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;
        StructuredViewer viewer = getCurrentViewer();
        viewer.addDoubleClickListener(this::fireDoubleClick);
import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderComposite;
                cmp = cat1.getName().compareTo(cat2.getName());
    }
            viewer.setLabelProvider(new DriverLabelProvider());
        return null;
        private final DriverCategoryDescriptor category;
            StructuredViewer currentViewer = getCurrentViewer();
            }
    }

            Control control = viewer.getControl();
                this.refreshDrivers();


        }
    }
                    return super.setFocus();
        StructuredViewer viewer = getCurrentViewer();

                viewer.setInput(drivers);


                ISelection selection = currentViewer.getSelection();
    protected Widget doFindInputItem(Object element) {
        };
import org.jkiss.dbeaver.model.DBIcon;
            if (!control.isDisposed()) {
    protected Widget doFindItem(Object element) {
                    if (toolTip.length() > 0) {

        if (viewer != null) {
    }
            viewer = new AdvancedListViewer(parent, SWT.NONE);
                List<DBPDriver> drivers = getCategoryDrivers(category, allDrivers);
        return null;
                toolTip.append("\n");

                    }
    @Override
import org.jkiss.dbeaver.ui.controls.folders.ITabbedFolder;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;

                "popular", UIConnectionMessages.dialog_driver_category_popular_label, DBIcon.TREE_DATABASE, UIConnectionMessages.dialog_driver_category_popular_tip, false,
            int cmp = cat1.getRank() - cat2.getRank();
            }
        if (viewer != null) {
                    toolTip.append(NLS.bind(UIConnectionMessages.driver_labal_provider_tip_saved_connections, usedBy.size()));
            this.category = category;
    public void setFilters(ViewerFilter... filters) {
            @Override
        }
        }


    }
    }
                toolTip.append(driver.getFullName());

    public TabbedFolderComposite getFolderComposite() {
            viewer.setContentProvider(new ListContentProvider());
 * DriverTabbedViewer
    @Override


        }
                    return true;

                return DBeaverIcons.getImage(((DBPDriver) element).getIconBig());
                if (!usedBy.isEmpty()) {
/**

                    extFolders.add(new TabbedFolderInfo(
            }
    }
    public void refresh() {
        this.dataSources = dataSources;
            return cmp;
    public void setSelection(ISelection selection, boolean reveal) {
                        //fireSelectionChanged(new SelectionChangedEvent(currentViewer, new StructuredSelection(category)));
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
        if (viewer != null) {
                ITabbedFolder activeFolder = getActiveFolder();
import org.eclipse.swt.SWT;

                    activeFolder.setFocus();
/*

                if (selection.isEmpty()) {
import java.util.ArrayList;
        //listComparator = new DriverUtils.DriverScoreComparator(dataSources);
                    ((DriverListFolder) folder.getContents()).refreshDrivers();
        @Override
    @Override
    }
            if (driver.getCategories().contains(category.getId())) {

        return viewer == null ? null : viewer.getInput();
    private StructuredViewer getCurrentViewer() {
    protected List getSelectionFromWidget() {
        }
    @Override
        viewer.addSelectionChangedListener(this::fireSelectionChanged);
            }
        List<TabbedFolderInfo> folders = new ArrayList<>();
import org.jkiss.dbeaver.registry.driver.DriverUtils;
        folderComposite.switchFolder(folderId, false);
        folders.add(
    public void setListComparator(Comparator<DBPDriver> listComparator) {
    @Override
            }
            }

            new TabbedFolderInfo(
import java.util.Comparator;
public class DriverTabbedViewer extends StructuredViewer {
        folders.add(
                    toolTip.append(driver.getDescription());
        if (activeFolder instanceof DriverListFolder) {
}
            viewer.reveal(element);
        }
            public boolean setFocus() {

        return null;


            registerViewer(viewer);
        //allDrivers.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }
    @Override
            if (listComparator != null) {
            public String getText(Object element) {
            }

 *     http://www.apache.org/licenses/LICENSE-2.0
        }
                StringBuilder toolTip = new StringBuilder();
        return folderComposite;

            this.drivers = new ArrayList<>(drivers);
            if (curFilters != null) {
            }
                DBPDriver driver = (DBPDriver) element;
        public void aboutToBeShown() {
 *

 * Licensed under the Apache License, Version 2.0 (the "License");
            viewer.resetFilters();
            return ((DriverListFolder) activeFolder).viewer;
    private ViewerFilter[] curFilters;

                return ((DBPDriver) element).getName();
import org.eclipse.osgi.util.NLS;
package org.jkiss.dbeaver.ui.dialogs.driver;
 * Unless required by applicable law or agreed to in writing, software
 // Tabs:
    @Override
    private Comparator<DBPDriver> listComparator;
            if (currentViewer != null) {
    protected void doUpdateItem(Widget item, Object element, boolean fullMap) {
        List<DBPDriver> allDrivers = DriverUtils.getAllDrivers();
    public DriverTabbedViewer(Composite parent, int style, List<DBPDataSourceContainer> dataSources, Comparator<DBPDriver> driverComparator) {
        private class DriverLabelProvider extends LabelProvider implements IToolTipProvider {

    }
        if (folders != null) {
        StructuredViewer viewer = getCurrentViewer();
        ITabbedFolder activeFolder = folderComposite.getActiveFolder();
        private final List<DBPDriver> drivers;
 * distributed under the License is distributed on an "AS IS" BASIS,
                    ));
    @Override
                        new DriverListFolder(category, drivers)
    }
                new DriverListFolder(null, ratedDrivers)));
                new DriverListFolder(null, recentDrivers)));
            viewer.setSelection(selection, reveal);
    @Override
                List<DBPDataSourceContainer> usedBy = DriverUtils.getUsedBy(driver, dataSources);
            viewer.setFilters(filters);
        @Override
                    toolTip.append(UIConnectionMessages.driver_labal_provider_tip_no_saved_connections);
                } else {
        extFolders.sort((o1, o2) -> {

 * limitations under the License.
        public void dispose() {
                }
        DriverListFolder(DriverCategoryDescriptor category, List<DBPDriver> drivers) {
    @Override
 * See the License for the specific language governing permissions and
        return null;
    private List<DBPDriver> getCategoryDrivers(DriverCategoryDescriptor category, List<DBPDriver> allDrivers) {
            @Override
                        category.getId(),
        if (CommonUtils.isEmpty(folderId)) {
        }
    }
 // - Recent
    private static final String DIALOG_ID = "DBeaver.DriverTabbedViewer";//$NON-NLS-1$
        TabbedFolderInfo[] folders = folderComposite.getFolders();

            @Override
        for (DriverCategoryDescriptor category : DriverManagerRegistry.getInstance().getCategories()) {
    private void registerViewer(AdvancedListViewer viewer) {
                    if (category != null) {
            viewer.refresh();

            }

 * You may obtain a copy of the License at
        public void setFocus() {
    private final List<DBPDataSourceContainer> dataSources;
        for (DBPDriver driver : allDrivers) {
        }
        folders.addAll(extFolders);
    }
            if (viewer != null) {
    private final TabbedFolderComposite folderComposite;
    @Override
        StructuredViewer viewer = getCurrentViewer();
        }
        @Override
                if (folder.getContents() instanceof DriverListFolder) {

import org.eclipse.swt.widgets.Composite;
            UIUtils.getDialogSettings(DIALOG_ID).put(PARAM_LAST_FOLDER, folderId1);
        @Override

                }
    private class DriverListFolder implements ITabbedFolder {

    /////////////////////////////////////////
    }
import org.jkiss.dbeaver.ui.controls.ListContentProvider;
        this.listComparator = driverComparator;
    @Override
        //DriverUtils.sortDriversByRating(dataSources, ratedDrivers);
                    DriverCategoryDescriptor category = DriverManagerRegistry.getInstance().getCategory(folderId1);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            DriverCategoryDescriptor cat1 = ((DriverListFolder) o1.getContents()).category;

import org.jkiss.dbeaver.Log;
import org.eclipse.swt.widgets.Control;

            if (!activated) {
    }
                activated = true;
            if (category.isPromoted()) {

    public void resetFilters() {
