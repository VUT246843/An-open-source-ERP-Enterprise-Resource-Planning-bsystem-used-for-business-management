import org.jkiss.dbeaver.ui.ShellUtils;
            } else if (curIndex >= items.size()) {
        item.dispose();
import org.eclipse.swt.dnd.*;
    }
        titleLabel.setFont(this.getTitleFont());

    private void moveSelection(int delta) {
                        dashboardConfig.setIndex(i);
                    // Dispose old items
    }
    public List<DashboardViewItem> getItems() {
        addItemViewDropSupport(item.getDashboardControl(), operations);
 * limitations under the License.
    private void addItemMoveSupport(DashboardViewItem item) {

            public void drop(DropTargetEvent event) {
                break;
                    DashboardListControl.this.setRedraw(true);
        Map<String, Object> params = new HashMap<>();
            }
            selection.redraw();


                if (selectedItem != null) {
            item.getDashboardControl().setFocus();
            }
            case SWT.ARROW_LEFT:
        if (this.items.isEmpty()) {
        this.viewContainer = viewContainer;
                break;

                }

                viewContainer.saveChanges();
            }
import java.util.HashMap;
                break;
                    selectedItem = null;
        }
            }
                loadItem(dd);
                    if (DashboardItemTransfer.INSTANCE.isSupportedType(event.dataType)) {
                    return false;
        }
    @Override
            curIndex += delta;
            @Override
    }
                // Too many
    /////////////////////////////////////////////////////////////////////////////////
        this.setLayout(layout);
            });
    }
    DBPDataSourceContainer getDataSourceContainer() {
                    event.detail = DND.DROP_NONE;
import org.eclipse.ui.IWorkbenchSite;
            return;
        }
                }
                }
                        viewContainer.showChartCatalog();

                        UIUtils.asyncExec(() -> moveDashboard(event));

                    }
                    } else if (event.data instanceof DashboardItemConfiguration item) {
    public DashboardContainer getView() {
            @Override
                setSelection(null);

    }
                    }
                }
                // Bad item - remove it
            public void dragOver(DropTargetEvent event) {
            }
            public void mouseDown(MouseEvent e) {
            @Override
        }
            int itemWidth = listAreaSize.x / itemsPerRow;
            @Override

                }

                        }
import org.jkiss.code.NotNull;
                lastDragEndTime = System.currentTimeMillis();
                        dragImage.dispose();
        viewContainer.getViewConfiguration().readDashboardItemConfiguration(dashboard);
        });
import org.eclipse.swt.SWT;
                    }
    private final DashboardContainer viewContainer;

        });

        if (selectedItem == null) {
    }
                    DashboardListControl.this.layout(true, true);
    private int listColumnCount = 1;
            public void dragOperationChanged(DropTargetEvent event) {
        // Calculate pack efficiency for different number of rows
                    if (event.data instanceof DashboardViewItem) {
        menuMgr.add(ActionUtils.makeCommandContribution(site, DashboardUIConstants.CMD_REFRESH_CHART));
    /////////////////////////////////////////////////////////////////////////////////
            private void handleDragEvent(DropTargetEvent event) {
            }
                if (dragImage != null) {
                "For further information, please refer to the <a>documentation</a>.",

                handleDragEvent(event);
            }
                computeGridSize();
    // DnD
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                if (selectedItem == null || overItem == null) {
        FontData[] fontData = normalFont.getFontData();

                ActionUtils.runCommand(DashboardUIConstants.CMD_REMOVE_DASHBOARD, DashboardListControl.this.site);
            @Override
    }
import org.jkiss.dbeaver.ui.dashboard.view.DashboardManagerDialog;

            "<a>" + addCommandName + "</a> to this dashboard by drag-n-drop or double-click from the <a>catalog</a> or another dashboard.\n" +
            }
                break;
    void addItem(DashboardViewItem item) {
                if (!isDropSupported(event)) {

        listRowCount = 1;
                DashboardConfiguration viewConfiguration = viewContainer.getViewConfiguration();
            public void keyPressed(KeyEvent e) {
}
            private void handleDragEvent(DropTargetEvent event) {
            @Override
        DashboardViewItem item = new DashboardViewItem(this, dashboard);
    /**
 * Licensed under the Apache License, Version 2.0 (the "License");
        return viewContainer;
import java.util.List;
            public void controlResized(ControlEvent e) {
                }

        return boldFont;
            }
                if (rowCount > 1) {
            case SWT.ARROW_RIGHT:
    }
    private final Font boldFont;
                newList.remove(selectedItem);
    private void loadItem(DashboardItemConfiguration dashboard) {
                }

                        td.type == DashboardItemTransfer.INSTANCE.getSupportedTypes()[0].type) {
                layout(true, true);
            @Override
    }
 *



 *     http://www.apache.org/licenses/LICENSE-2.0
                event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
                    }  else if (CommonUtils.equalObjects("documentation", e.text)) {
                curIndex = items.size() - 1;

        return ITEM_SPACING;
        String addCommandName = ActionUtils.findCommandName(DashboardUIConstants.CMD_ADD_DASHBOARD);
                handleDragEvent(event);
    private void computeGridSize() {
                    }else {
        addItemViewDropSupport(dndControl, operations);
     * Clear dashboards view
        });
        items.clear();
/*
        }
                        return true;
        final DragSource source = new DragSource(dndControl, operations);
        addMouseListener(new MouseAdapter() {
        Label titleLabel = new Label(intro, SWT.NONE);
                        columnBounds.x,
        boldFont = new Font(normalFont.getDevice(), fontData[0]);
                    } else if (event.data instanceof DashboardViewItem item) {
            }

            @Override
    }
            return;
        if (!UIUtils.isInDialog(parent)) {
        GridLayout layout = new GridLayout(1, true);
                    return false;
    void handleKeyEvent(KeyEvent e) {
import org.eclipse.swt.widgets.Label;
                public void widgetSelected(SelectionEvent e) {
                    event.doit = false;
                ActionUtils.runCommand(DashboardUIConstants.CMD_ADD_DASHBOARD, DashboardListControl.this.site);
                    listRowCount = rowCount - 1;
package org.jkiss.dbeaver.ui.dashboard.control;

                    GC gc = new GC(DashboardListControl.this);
                    for (DashboardViewItem item : newList) {

                        event.data = selectedItem;
        });
        MenuManager menuMgr = new MenuManager();

                    }
                handleDragEvent(event);

            }
                handleDragEvent(event);
        super(parent, SWT.DOUBLE_BUFFERED);

        addDisposeListener(e -> menuMgr.dispose());
                            return (DashboardViewItem) parent;
                }
import org.jkiss.dbeaver.ui.dashboard.view.DashboardItemTransfer;
        this.items.add(item);
 * Unless required by applicable law or agreed to in writing, software
            case SWT.INSERT:

                    for (Composite parent = control.getParent(); parent != null; parent = parent.getParent()) {

            public void dragLeave(DropTargetEvent event) {
            }
        viewContainer.saveChanges();
            int itemHeight = itemWidth / 3;
                        DashboardItemViewSettings dashboardConfig = viewConfiguration.getItemConfig(newItem.getItemDescriptor().getId());
    private final List<DashboardViewItem> items = new ArrayList<>();
                    }
    private static final int ITEM_SPACING = 5;
        if (oldSelection == selection) {
                    } else if (CommonUtils.equalObjects("catalog", e.text)) {
                    }
        }
 */
                        dragImage = null;
            if (curIndex < 0) {
        getView().getViewConfiguration().clearItems();
                    event.detail = DND.DROP_MOVE;
        for (DashboardViewItem item : List.copyOf(items)) {
import org.jkiss.dbeaver.model.app.DBPProject;
            @Override


                        UIUtils.asyncExec(() -> addItem(item));
            public void drop(DropTargetEvent event) {
import org.jkiss.dbeaver.model.dashboard.registry.DashboardRegistry;
import org.jkiss.dbeaver.ui.UIUtils;
                break;
                        DashboardViewItem oldItem = newList.get(i);
            public void dragFinished(DragSourceEvent event) {
                        event.detail = DND.DROP_MOVE;
            for (DashboardItemConfiguration dd : dashboards) {
import static org.jkiss.dbeaver.ui.dashboard.DashboardUIConstants.PARAM_CATALOG_PANEL_TOGGLE;
            oldSelection.redraw();
    }
import org.eclipse.swt.layout.GridLayout;
                        addItem(itemConfiguration);
            case SWT.DEL:
                    UIUtils.dispose(dragImage);

                    if (event.detail == DND.DROP_NONE) {
        }
                    event.detail = DND.DROP_NONE;
        computeGridSize();
        Point listAreaSize = getSize();

                newList.add(newIndex, selectedItem);

    public Font getTitleFont() {
            }
    @Override
            int curIndex = items.indexOf(selectedItem);
        selectedItem = null;
        addItemDropSupport();
        DashboardViewItem oldSelection = this.selectedItem;
    @NotNull
                for (TransferData td : event.dataTypes) {
                // Re-create  items

    public int getListRowCount() {
 * DBeaver - Universal Database Manager
        Composite intro = UIUtils.createComposite(this, 1);

                DashboardViewItem overItem = getOverItem(event);
        this.selectedItem = selection;
            private boolean isDropSupported(DropTargetEvent event) {

                    Control control = ((DropTarget) source).getControl();
                } else {
                DashboardViewItem overItem = getOverItem(event);
import org.eclipse.swt.widgets.Composite;
    private void registerContextMenu() {
                break;
            viewContainer.showChartCatalog();
    }
        for (int rowCount = 1; rowCount < 50; rowCount++) {
        addKeyListener(new KeyAdapter() {

            new SelectionAdapter() {
            private DashboardViewItem getOverItem(DropTargetEvent event) {
    public void clear() {
import org.jkiss.dbeaver.utils.HelpUtils;
            case SWT.ARROW_UP:


                Object source = event.getSource();
        if (viewContainer.getViewConfiguration().isInitDefaultCharts() && viewContainer.getDataSourceContainer() != null) {
                        addItem(item.getItemConfiguration().getDashboardItem());
                moveSelection(-1);
                DashboardListControl.this.setRedraw(false);
                } finally {
            UIUtils.disposeChildControls(this);
            @Override
 *
    public void removeItem(@NotNull DashboardItemContainer container) {
                handleDragEvent(event);
import org.jkiss.utils.CommonUtils;
        }
    @Override
                curIndex = 0;
        switch (e.keyCode) {
            setSelection(items.get(0));
        if (this.items.isEmpty()) {
        target.setTransfer(DashboardItemTransfer.INSTANCE, DashboardItemConfigurationTransfer.INSTANCE);
            @Override

    @NotNull
        UIUtils.createLink(intro,
        }
    void createDefaultDashboards() {
        new DashboardViewItem(this, dashboard);
        viewContainer.getViewConfiguration().readDashboardItemConfiguration(dashboard);
                "You can also create new charts in the <a>Configuration</a> dialog.\n" +
                }
                handleDragEvent(event);
        fontData[0].setStyle(SWT.BOLD);

    private void addItemDropSupport() {
    public DashboardListControl(IWorkbenchSite site, Composite parent, DashboardContainer viewContainer) {
                try {
        int totalItems = items.size();
            DashboardViewItem newSelection = items.get(curIndex);
            }
        return viewContainer.getDataSourceContainer();

            }
        }
        source.addDragListener(new DragSourceListener() {
    }
                        ShellUtils.launchProgram(HelpUtils.getHelpExternalReference(DashboardUIConstants.DASHBOARD_DOCUMENTATION_URL_SUFFIX));
                handleDragEvent(event);

    }
        layout(true, true);
                    }

                if (event.detail == DND.DROP_MOVE || event.detail == DND.DROP_COPY) {
        viewContainer.updateSelection();
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private final IWorkbenchSite site;
        return listColumnCount;
            case SWT.CR:
                handleDragEvent(event);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            public void dragOver(DropTargetEvent event) {
    void removeItem(DashboardViewItem item) {
            return;
    public void setSelection(DashboardViewItem selection) {
        return selectedItem;
            public void dropAccept(DropTargetEvent event) {
import org.jkiss.dbeaver.ui.dashboard.view.DashboardItemConfigurationTransfer;
    public int getItemSpacing() {

import org.jkiss.dbeaver.ui.dashboard.model.*;

    private DashboardViewItem selectedItem;
                        dragImage,
                } else {
 * You may obtain a copy of the License at
                @Override
 * you may not use this file except in compliance with the License.
import java.util.ArrayList;
        this.setBackground(UIStyles.getDefaultTextBackground());
    public void addItem(@NotNull DashboardItemConfiguration dashboard) {
        fontData[0].setHeight(fontData[0].getHeight() + 1);
        DropTarget dropTarget = new DropTarget(dndControl, operations);
                        columnBounds.y);
                }
                    if (dragImage != null) {
                    dragImage = null;
import org.eclipse.swt.events.*;

                }
 * distributed under the License is distributed on an "AS IS" BASIS,
                    Rectangle columnBounds = selectedItem.getBounds();
        registerContextMenu();


    }

     */
 *

                return false;
                handleDragEvent(event);
        }

        this.items.remove(item);
        this.setForeground(UIStyles.getDefaultTextForeground());
    public void selectItem(DashboardItemContainer item) {
    private int listRowCount = 1;
                }
        menuMgr.add(ActionUtils.makeCommandContribution(site, DashboardUIConstants.CMD_ADD_DASHBOARD));
    }
        DashboardViewItem item = (DashboardViewItem) container;
                }

                }
                    }
        addControlListener(new ControlAdapter() {
                    }
    public void createDashboardsFromConfiguration() {
        }
            }
            // Duplicate
import org.eclipse.swt.widgets.Control;
            if (totalHeight > listAreaSize.y) {
    }
    DBPProject getProject() {
            }
            }

        if (oldSelection != null && !oldSelection.isDisposed()) {
            }
import org.jkiss.dbeaver.ui.ActionUtils;
                    gc.dispose();
                        if (parent instanceof DashboardViewItem) {

        }
                    for (int i = 0; i < newList.size(); i++) {
import org.jkiss.dbeaver.ui.dashboard.DashboardUIConstants;
                ActionUtils.runCommand(DashboardUIConstants.CMD_VIEW_DASHBOARD, DashboardListControl.this.site);
        return listRowCount;
                null, viewContainer.getDataSourceContainer(), true);


                handleKeyEvent(e);
            private long lastDragEndTime;
            }

            }
    }
    public DashboardViewItem getSelectedItem() {
                    }
            newSelection.getDashboardControl().setFocus();
                int newIndex = newList.indexOf(overItem);
                if (event.dataTypes == null) {
            int totalHeight = itemHeight * rowCount;
        return items;
            } else {
import org.eclipse.swt.graphics.*;

        setSelection((DashboardViewItem) item);
        layout(true, true);
        source.setTransfer(DashboardItemTransfer.INSTANCE);
import org.eclipse.jface.action.MenuManager;
            @Override
            public void dropAccept(DropTargetEvent event) {
        ((GridLayout) getLayout()).numColumns = listColumnCount;
                }
        addItemMoveSupport(item);
        dropTarget.setTransfer(DashboardItemTransfer.INSTANCE, DashboardItemConfigurationTransfer.INSTANCE);
        if (selection != null && !selection.isDisposed()) {
            }
            public void dragStart(DragSourceEvent event) {



            newSelection.redraw();


    public void showItem(DashboardItemContainer item) {

                handleDragEvent(event);
    }
        }
    }
        dropTarget.addDropListener(new DropTargetListener() {
        for (DashboardItemViewSettings itemConfig : new ArrayList<>(viewContainer.getViewConfiguration().getDashboardItemConfigs())) {
            @Override


                loadItem(dashboard);

            }
                    if (td.type == DashboardItemConfigurationTransfer.INSTANCE.getSupportedTypes()[0].type ||
        if (viewContainer.getViewConfiguration().getItemConfig(dashboard.getId()) != null) {
    }
        if (this.items.isEmpty()) {
                    gc.copyArea(
            DashboardItemConfiguration dashboard = itemConfig.getItemConfiguration();
 * See the License for the specific language governing permissions and
        }
                List<DashboardViewItem> newList = new ArrayList<>(items);
        if (item != null) {

        }
            public void dragEnter(DropTargetEvent event) {
import org.eclipse.swt.widgets.Display;

            @Override
                if (!isDropSupported(event)) {
            }
        computeGridSize();
                if (source instanceof DropTarget) {

            }

                return null;
            }
                moveSelection(1);
            case SWT.ARROW_DOWN:
            List<DashboardItemConfiguration> dashboards = DashboardRegistry.getInstance().getDashboardItems(

    public int getListColumnCount() {
        titleLabel.setText("Customize your dashboard");
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
    }
            private void moveDashboard(DropTargetEvent event) {
                event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
                if (selectedItem == null || overItem == null || selectedItem == overItem) {
            private Image dragImage;
                    if (CommonUtils.equalObjects(addCommandName, e.text)) {

        viewContainer.getViewConfiguration().removeItem(item.getItemDescriptor().getId());
            @Override

        if (listAreaSize.x <= 0 || listAreaSize.y <= 0 || items.isEmpty()) {

                    items.clear();

        listColumnCount = (int) Math.ceil((float) totalItems / listRowCount);

                        DashboardViewItem newItem = new DashboardViewItem(DashboardListControl.this, oldItem.getItemDescriptor());
import java.util.Map;
            private boolean isDropSupported(DropTargetEvent event) {
            public void dragLeave(DropTargetEvent event) {
            createIntroItem();
            return;

                handleDragEvent(event);
        Font normalFont = getFont();
    }
        if (items.isEmpty()) {

            @Override
                        item.dispose();
    }
                if (event.detail == DND.DROP_MOVE) {

import org.jkiss.dbeaver.ui.UIStyles;
        params.put(PARAM_CATALOG_PANEL_TOGGLE, "true");

                if (selectedItem == null || lastDragEndTime > 0 && System.currentTimeMillis() - lastDragEndTime < 100) {
                } else {
            item.dispose();
            createIntroItem();
    }
        });
        } else {
        addDisposeListener(e -> boldFont.dispose());
        this.site = site;
    private void addItemViewDropSupport(Control dndControl, int operations) {

                return true;
                        newItem.moveViewFrom(oldItem, true);
        }
                viewContainer.getViewConfiguration().removeItemConfiguration(itemConfig);

                handleDragEvent(event);

        viewContainer.saveChanges();
                    event.image = dragImage;
            if (dashboard != null) {
        setMenu(menuMgr.createContextMenu(this));
            UIUtils.disposeChildControls(this);
            public void dragEnter(DropTargetEvent event) {
        Label dndControl = item.getTitleLabel();
        final DropTarget target = new DropTarget(this, DND.DROP_MOVE);
            public void dragOperationChanged(DropTargetEvent event) {
                    return;
        target.addDropListener(new DropTargetAdapter() {
            }
        final int operations = DND.DROP_MOVE | DND.DROP_COPY;// | DND.DROP_MOVE | DND.DROP_LINK | DND.DROP_DEFAULT;
            @Override
            setSelection(newSelection);
        return viewContainer.getViewConfiguration().getProject();
public class DashboardListControl extends Composite implements DashboardGroupContainer {
    }
        });
                    if (event.data instanceof DashboardItemConfiguration itemConfiguration) {
                        ActionUtils.runCommand(DashboardUIConstants.CMD_ADD_DASHBOARD, site);
        menuMgr.add(ActionUtils.makeCommandContribution(site, DashboardUIConstants.CMD_CATALOG_SHOW_DASHBOARD, params));
    private void createIntroItem() {
    @Override
    }
                setFocus();
            @Override
            int itemsPerRow = (int) Math.ceil((float) totalItems / rowCount);
    }
            }

                        new DashboardManagerDialog(UIUtils.getActiveWorkbenchShell()).open();
            public void dragSetData(DragSourceEvent event) {
    }
                    dragImage = new Image(Display.getCurrent(), columnBounds.width, columnBounds.height);
