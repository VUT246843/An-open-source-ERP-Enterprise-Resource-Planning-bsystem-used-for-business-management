        this.addPaintListener(this::paintItem);
            @Override
        this.autoUpdateEnabled = true;

        return groupContainer.getDataSourceContainer();
        }
import java.util.HashMap;
            for (DashboardRendererType viewType : viewTypes) {
    private final DashboardItemViewSettings viewItemConfig;
            int increasePercent = Math.min(widthIncreasePercent, heightIncreasePercent);
            titleComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
                groupContainer.setSelection(DashboardViewItem.this);
            Map<String, Object> params = new HashMap<>();
    @Override
        return viewItemConfig.getItemConfiguration();
                (defHeight * increasePercent / 100));
            e.gc.setLineStyle(SWT.LINE_SOLID);
        };
                // Stretch to fit height
            titleComposite.setBackground(defBG);
    private final Label titleLabel;
            throw new IllegalStateException("View item configuration not found for '" + item.getId() + "'");
    public DBDashboardMapQuery getMapQuery() {
        titleToolbarManager.removeAll();
            //e.gc.setLineDash(new int[] {10, 10});
            GridLayout gridLayout = new GridLayout(3, false);

        renderer.fillDashboardToolbar(this, titleToolbarManager, dashboardControl, viewItemConfig);
    public static final int DEFAULT_HEIGHT = 200;

    @Override
    private boolean autoUpdateEnabled;

                createDashboardRenderer();
        createDashboardRenderer();
        }
    }
    @Override
                DashboardUIConstants.CMD_CATALOG_SHOW_DASHBOARD, params));
        return groupContainer;
            // Something went wrong
            if (viewItemConfig.getViewType() != curViewType) {
import org.jkiss.dbeaver.DBException;
        return titleLabel;
            MenuManager viewMenu = new MenuManager(UIDashboardMessages.dashboard_chart_composite_menu_manager_text);
        }
    }
                    public boolean isChecked() {
    private void initChartRenderer() {
        try {

    }
            return GeneralUtils.replaceVariables(label, dataSourceContainer.getVariablesResolver(true));
            if (item.getDashboardProvider().isDatabaseRequired() && dataSourceContainer != null) {
            titleLabel.setText(item.getId());
        }
public class DashboardViewItem extends Composite implements DashboardItemContainer {
            DBPDataSourceContainer dataSourceContainer = getDataSourceContainer();
    public void refreshInfo() {
            }
        this.viewItemConfig = groupContainer.getView().getViewConfiguration().getItemConfig(item.getId());
 * You may obtain a copy of the License at

            Composite titleComposite = new Composite(this, SWT.NONE);
            @Override
        // Use some insets
    public void fillDashboardContextMenu(
        if (!singleChartMode) {

        });

    public Point computeSize(int wHint, int hHint, boolean changed) {
        });

            curViewType = viewItemConfig.getViewType();


                extraHeightSpace = areaSize.y - totalHeight;
    }
                };
 * Licensed under the Apache License, Version 2.0 (the "License");
        return dashboard == null ? null : dashboard.getQueries();
    public long getUpdatePeriod() {
        if (dataSourceContainer != null) {
        addDisposeListener(e -> groupContainer.removeItem(this));
        GridLayout listLayout = (GridLayout) groupContainer.getLayout();
        e.gc.drawRectangle(1, 1, itemSize.x - 2, itemSize.y - 2);
    }
        dbCanvas.addFocusListener(new FocusListener() {
    }
            }
        MenuManager menuMgr = new MenuManager(null, getItemDescriptor().getId() + "_context_menu");
    }
            e.gc.setLineWidth(2);

        } else {
            public void focusLost(FocusEvent e) {
            manager.add(viewMenu);
                // Grab all extra space if possible
import org.jkiss.dbeaver.model.dashboard.DBDashboardQuery;
        return groupContainer;

            public void focusGained(FocusEvent e) {
    private final ToolBarManager titleToolbarManager;
            fillDashboardContextMenu(menuMgr, false);

import org.jkiss.dbeaver.ui.UIStyles;
        int listRowCount = groupContainer.getListRowCount();
        manager.add(new Separator());

import org.eclipse.swt.graphics.Color;


            public void keyPressed(KeyEvent e) {
//        }
                extraHeightSpace = areaSize.y - defHeight;
    public long getDashboardMaxAge() {

        Color defFG = UIStyles.getDefaultTextForeground();
    @Override
                lastUpdateTime = new Date();
            }
            errorLabel.setText(NLS.bind(UIDashboardMessages.dashboard_item_errorlabel_text, viewItemConfig.getItemId(), e.getMessage()));
        chartComposite.setLayout(new FillLayout());
import java.util.List;
    }
    }
        return dashboardControl;
            titleComposite.setForeground(defFG);
    }
        return new Point(width, height);
        return viewItemConfig.getMaxItems();
        Point listAreaSize = groupContainer.getSize();
        int totalHeight = 0;
                    }

        Point areaSize = groupContainer.getParent().getSize();
    @Override
    private void createDashboardRenderer() {
import org.eclipse.swt.graphics.Point;
            // Vertical
    public DashboardListControl getGroupContainer() {
    @Override
    }
                //System.out.println("NEw size: " + compSize);
    private void updateChartLabel(@NotNull DashboardItemConfiguration item) {
    @Override
            for (DashboardItem item : groupContainer.getItems()) {
            return new Point(defWidth, defHeight);
 *
        return viewItemConfig;
        int extraHeightSpace = 0;
    @Override
    public DashboardViewItem(@NotNull DashboardListControl parent, @NotNull DashboardItemConfiguration item) {
        }
        this.autoUpdateEnabled = false;
    public String[] getMapKeys() {
        return (int) (viewItemConfig.getWidthRatio() * getDefaultHeight());
        }
    public DashboardGroupContainer getGroup() {
            DBPImage icon = DashboardIcons.DASHBOARD;
        Control dbCanvas = dashboardControl instanceof DashboardViewCompositeControl chart ?
        updateChartLabel(getItemDescriptor());
            }
                if (dashboardControl != null) {
import org.eclipse.swt.SWT;
                groupContainer.handleKeyEvent(e);
            int heightIncreasePercent = 100 * areaSize.y / totalHeight;
    public Label getTitleLabel() {
        return dashboard == null ? viewItemConfig.getItemId() : dashboard.getName();
            totalWidth = Math.min(defWidth, areaSize.x);

        layout.marginWidth = 3;
                renderer.resetDashboardData(this, lastUpdateTime);
        this.setLayout(layout);
        int totalWidth = 0;



    @Override
    }
            titleLabel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            Point compSize = new Point(
            } else if (renderer != null) {
                    dashboardControl.dispose();

        DashboardItemConfiguration dashboard = viewItemConfig.getItemConfiguration();
            return compSize;
    @Override
        dashboardControl.addDisposeListener(e -> renderer.disposeDashboard(DashboardViewItem.this));
        titleLabel.setToolTipText(CommonUtils.notEmpty(item.getDescription()));
            this.createContextMenu(titleLabel);
        if (this.viewItemConfig == null) {
                icon = dataSourceContainer.getDriver().getIcon();

 *
    @Override
            if (currentSize.x > 0 && currentSize.y > 0) {
            if (totalWidth < areaSize.x) {

        int height = (listAreaSize.y - listLayout.marginHeight * 2 - listLayout.verticalSpacing * (listRowCount - 1)) / listRowCount;
            titleLabel.setFont(parent.getTitleFont());
            }

        return groupContainer.getProject();
    public DBPDataSourceContainer getDataSourceContainer() {
            }
import org.eclipse.swt.layout.GridData;


 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.events.*;
        });
            manager.add(ActionUtils.makeCommandContribution(UIUtils.getActiveWorkbenchWindow(),
            public void mouseDown(MouseEvent e) {
            e.gc.setLineWidth(1);


        e.gc.setForeground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_DARK_SHADOW));

            renderer = curViewType.createRenderer();
 * limitations under the License.
            updateChartLabel(item);
            params.put(PARAM_CATALOG_PANEL_TOGGLE, "true");
        }
        DashboardItemConfiguration dashboard = viewItemConfig.getItemConfiguration();
                //dbCanvas.forceFocus();
    ) {

                    public void runWithEvent(Event event) {
        GridLayout layout = new GridLayout(1, true);
*/
import org.jkiss.dbeaver.ui.ActionUtils;
                icon = item.getDashboardProvider().getIcon();
import org.jkiss.dbeaver.model.DBPImage;
                (defWidth * increasePercent / 100),
/*
        }

            @Override
    }
                        getGroup().getView().saveChanges();
                if (viewType.getIcon() != null) {
        initChartRenderer();
                groupContainer.setSelection(DashboardViewItem.this);
        this.groupContainer = parent;
    public int getDefaultHeight() {
    }
        chartComposite = new Composite(this, SWT.NONE);
            return super.computeSize(wHint, hHint, changed);
                totalWidth += item.getDefaultWidth();
        } else {
        }
    }
    }
//        if (groupContainer.getSelectedItem() == this) {
            if (totalHeight < areaSize.y) {


            }
        DashboardItemConfiguration dashboard = viewItemConfig.getItemConfiguration();
        List<DashboardRendererType> viewTypes = DashboardUIRegistry.getInstance().getSupportedViewTypes(getItemDescriptor().getDataType());
    public void updateDashboardData(DashboardDataset dataset) {
        menuMgr.setRemoveAllWhenShown(true);
    public JexlExpression getMapFormula() {
                        updateDashboardView();
    public String[] getMapLabels() {


        }
                layout(true, true);

        areaSize.x -= 10;

    }
    }

        Point currentSize = getSize();
        } else {
            Label titleIcon = new Label(titleComposite, SWT.NONE);
import org.eclipse.swt.layout.FillLayout;
        DBPDataSourceContainer dataSourceContainer = getDataSourceContainer();
                extraWidthSpace = areaSize.x - totalWidth;
            manager.add(ActionUtils.makeCommandContribution(UIUtils.getActiveWorkbenchWindow(), DashboardUIConstants.CMD_REMOVE_DASHBOARD));
        this.setBackground(defBG);


            }
import org.eclipse.osgi.util.NLS;
        if (groupContainer.getSelectedItem() == this) {
            titleLabel = new Label(titleComposite, SWT.NONE);
                redraw();
        layout.marginHeight = 3;
import org.jkiss.dbeaver.ui.DBeaverIcons;
 *

            }
            manager.add(new Separator());
        int width = (listAreaSize.x - listLayout.marginWidth * 2 - listLayout.horizontalSpacing * (listColumnCount - 1)) / listColumnCount;
                }
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
        } catch (DBException e) {
import org.jkiss.dbeaver.ui.dashboard.internal.UIDashboardMessages;
        this.addMouseListener(mouseAdapter);
                    @Override
    private void paintItem(PaintEvent e) {
    }
            errorLabel.setLayoutData(new GridData(GridData.CENTER, GridData.CENTER, true, true));
        return dashboard == null ? null : dashboard.getMapFormulaExpr();

import java.util.Map;
            totalHeight = Math.min(defHeight, areaSize.y);
    public String toString() {
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
            manager.add(new Separator());
    public DashboardItemConfiguration getItemDescriptor() {
import org.jkiss.dbeaver.ui.dashboard.DashboardUIConstants;

        if (areaSize.x > areaSize.y) {
        if (extraHeightSpace > 0 && extraWidthSpace > 0 && totalWidth > 0 && totalHeight > 0) {
        }
            boolean forceLayout = false;

}

    private DashboardRendererType curViewType;
        return DEFAULT_HEIGHT;
        UIUtils.asyncExec(() -> {

import org.jkiss.utils.CommonUtils;
        super(parent, SWT.DOUBLE_BUFFERED);
 * DBeaver - Universal Database Manager
            toolBar.setBackground(defBG);
            return;
                    @Override
    }
    @Override

        dbCanvas.addKeyListener(new KeyAdapter() {
    @Override

        if (dbCanvas == null) {
        });
        {
    public void resetDashboardData() {
                totalHeight += item.getDefaultHeight();
            manager.add(ActionUtils.makeCommandContribution(UIUtils.getActiveWorkbenchWindow(), DashboardUIConstants.CMD_ADD_DASHBOARD));
    }
        UIUtils.asyncExec(() -> {
import org.jkiss.dbeaver.ui.dashboard.registry.DashboardUIRegistry;
        int defWidth = getDefaultWidth();
        return dashboard == null ? null : dashboard.getMapKeys();
                extraWidthSpace = areaSize.x - defWidth;
                if (totalHeight > 0) totalHeight += groupContainer.getItemSpacing();
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.layout.GridLayout;
        if (groupContainer.getView().isSingleChartMode() || listAreaSize.x <= 0 || listAreaSize.y <= 0) {
        }
        int extraWidthSpace = 0;
import org.jkiss.dbeaver.model.dashboard.DBDashboardMapQuery;
        if (!UIUtils.isInDialog(dashboardControl) && viewTypes.size() > 1) {
/*
    private void updateToolBarActions() {
                renderer.updateDashboardData(this, lastUpdateTime, dataset);
        return viewItemConfig.getMaxAge();
    public int getDashboardMaxItems() {
    }
    @Override
            titleComposite.setLayout(gridLayout);
import org.eclipse.swt.widgets.*;
            }
        menuMgr.addMenuListener(manager -> {
            titleIcon.setImage(DBeaverIcons.getImage(icon));
import org.jkiss.dbeaver.model.dashboard.data.DashboardDataset;


    public int getDefaultWidth() {
        if (viewItemConfig == null) {
        layout.horizontalSpacing = 0;
            titleLabel.setText(evaluateChartLabel(item.getTitle()));

        return dashboard == null ? null : dashboard.getMapQuery();

    private Composite dashboardControl;
            }
                // Stretch to fit width
    public boolean isAutoUpdateEnabled() {
        if (UIUtils.isInDialog(this)) {
            if (renderer != null) {
    @Override
    }
    }
        UIUtils.asyncExec(() -> {
        return viewItemConfig.getUpdatePeriod();
            e.gc.setLineStyle(SWT.LINE_SOLID);
    public void disableAutoUpdate() {
            return new Point(Math.min(defWidth, areaSize.x), Math.min(defHeight, areaSize.y));
//            e.gc.drawRoundRectangle(1, 1, itemSize.x - 4, itemSize.y - 4, 3, 3);
                    changeViewAction.setImageDescriptor(DBeaverIcons.getImageDescriptor(viewType.getIcon()));
            ToolBar toolBar = titleToolbarManager.createControl(titleComposite);
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
    public Date getLastUpdateTime() {
        //this.setForeground(defFG);
        titleToolbarManager.update(false);
        areaSize.y -= 10;
    }
        @NotNull IMenuManager manager,
    }
        boolean singleChartMode
        });
            dashboardControl = renderer.createDashboard(chartComposite, this, groupContainer.getView(), computeSize(-1, -1));
    }
        return label;
            chart.getDashboardControl() : null;
import static org.jkiss.dbeaver.ui.dashboard.DashboardUIConstants.PARAM_CATALOG_PANEL_TOGGLE;
        }

    }
                Action changeViewAction = new Action(viewType.getTitle(), Action.AS_RADIO_BUTTON) {
import org.eclipse.jface.action.*;
        dbCanvas.addMouseListener(mouseAdapter);
    public DashboardItemViewSettings getItemConfiguration() {
        groupContainer.addItem(this);
            @Override

package org.jkiss.dbeaver.ui.dashboard.control;

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
        MouseAdapter mouseAdapter = new MouseAdapter() {
            titleToolbarManager = new ToolBarManager(SWT.FLAT | SWT.HORIZONTAL);
    public Composite getDashboardControl() {
        });
            // Horizontal
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else {
            }
import org.jkiss.dbeaver.ui.dashboard.model.*;
            return;
        if (!singleChartMode) {
        control.setMenu(menu);

    }
    }
 * you may not use this file except in compliance with the License.
    private final Composite chartComposite;
    @Override
    public DashboardItemViewSettings getViewItemConfig() {

                // Stretch to fit height
    }
            manager.add(ActionUtils.makeCommandContribution(UIUtils.getActiveWorkbenchWindow(), DashboardUIConstants.CMD_VIEW_DASHBOARD));
    }
            if (renderer != null) {

    @Override
import org.jkiss.dbeaver.model.dashboard.DashboardIcons;
    private String evaluateChartLabel(String label) {
        Menu menu = menuMgr.createContextMenu(this);
 */
            updateToolBarActions();
        return dashboard == null ? null : dashboard.getMapLabels();

    @Override
            gridLayout.marginHeight = 3;

    public List<? extends DBDashboardQuery> getQueryList() {
            gridLayout.marginWidth = 3;
                if (totalWidth > 0) totalWidth += groupContainer.getItemSpacing();
            if (forceLayout) {
                        return getItemConfiguration().getViewType() == viewType;
            titleLabel.setBackground(defBG);
    }
import org.apache.commons.jexl3.JexlExpression;
        if (areaSize.x <= 0 || areaSize.y <= 0) {
                        getViewItemConfig().setViewType(viewType);
    }
        titleLabel.addMouseListener(mouseAdapter);
        renderer.moveDashboardView(this, item, clearOriginal);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        return lastUpdateTime;
        Point itemSize = getSize();
        this.setLayoutData(new GridData(GridData.FILL_BOTH));
        int defHeight = getDefaultHeight();
            // Stretch
    private void createContextMenu(Control control) {
import org.jkiss.dbeaver.utils.GeneralUtils;
        layout.verticalSpacing = 0;
                renderer.updateDashboardView(this);

            }
        }
                    }
        DashboardItemConfiguration dashboard = viewItemConfig.getItemConfiguration();
            } else {
    @Override
import org.jkiss.dbeaver.model.app.DBPProject;
    public DBPProject getProject() {
        DashboardItemConfiguration dashboard = viewItemConfig.getItemConfiguration();
 * See the License for the specific language governing permissions and
    public void updateDashboardView() {
    @Override
            }
    @Override
                viewMenu.add(changeViewAction);
        return autoUpdateEnabled;
import org.jkiss.code.NotNull;
    public void moveViewFrom(DashboardViewItem item, boolean clearOriginal) {
            manager.add(ActionUtils.makeCommandContribution(UIUtils.getActiveWorkbenchWindow(), DashboardUIConstants.CMD_REFRESH_CHART));
            int widthIncreasePercent = 100 * areaSize.x / totalWidth;
    private Date lastUpdateTime;

                }

            Text errorLabel = new Text(this, SWT.READ_ONLY | SWT.MULTI | SWT.WRAP);
            for (DashboardItem item : groupContainer.getItems()) {
        int listColumnCount = groupContainer.getListColumnCount();
    private final DashboardListControl groupContainer;
                    forceLayout = true;

        Color defBG = UIStyles.getDefaultTextBackground();

            }
        DashboardItemConfiguration dashboard = viewItemConfig.getItemConfiguration();
import java.util.Date;
    @Override
    private DashboardItemRenderer renderer;
                // Change view!
        return viewItemConfig;
        chartComposite.setLayoutData(new GridData(GridData.FILL_BOTH));

        }
