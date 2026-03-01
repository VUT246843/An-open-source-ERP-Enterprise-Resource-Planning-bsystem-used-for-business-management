
        }
                        hintItem.setText(hintText);
        }
        this.defRefreshText = defTooltip;
                        hintItem.setEnabled(false);
                        mi.setText(text);
import org.jkiss.dbeaver.model.DBPImage;
            }
            return;
import java.util.List;

            } else {
                    }
    }
        final AutoRefreshJob refreshJob = this.autoRefreshJob;
                        final Integer timeout = presetList.get(i);
                    List<Integer> presetList = new ArrayList<>();
        parent.addDisposeListener(e -> {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
                }
            setRefreshSettings(settings);
                                runPreset(timeout);
                if (hintSupplier != null) {

                            NLS.bind(UIMessages.sql_editor_resultset_filter_panel_menu_refresh_interval, timeout) :
                {

    public ToolItem populateRefreshButton(ToolBar toolbar) {
        this.refreshSettings = refreshSettings;
        return autoRefreshEnabled;
    }
        });
            refreshJob.cancel();
 * limitations under the License.
                        }
    private class AutoRefreshMenuListener extends SelectionAdapter {
                    mi.addSelectionListener(new SelectionAdapter() {
import org.eclipse.osgi.util.NLS;
                    });
                            enableAutoRefresh(false);
            if (e.detail == SWT.ARROW) {
                    }
        if (refreshSettings == null) {
                        });
                        // We need hint item not just for hint. It also fills last menu element to avoid accidental miss-click in dropdown falls up
        this.refreshSettings.saveSettings();
        AutoRefreshConfigDialog dialog = new AutoRefreshConfigDialog(parent.getShell(), getRefreshSettings());
        this.autoRefreshEnabled = enable;
        }
        });
    private String controlId;
    public DBRRunnableWithProgress getRunnable() {
package org.jkiss.dbeaver.ui.controls.autorefresh;
        autoRefreshJob.schedule((long)settings.getRefreshInterval() * 1000);
                schedulerMenu = new Menu(dropdown.getParent().getShell());
        this.defRefreshIcon = defImage;
    public synchronized void scheduleAutoRefresh(boolean afterError) {
    public synchronized void enableAutoRefresh(boolean enable) {
    private DBPImage defRefreshIcon;
        UIStyles.fixToolBarForeground(toolbar);
 *     http://www.apache.org/licenses/LICENSE-2.0
                schedulerMenu.dispose();
            autoRefreshButton.dispose();
    private static final int[] AUTO_REFRESH_DEFAULTS = new int[]{1, 5, 10, 15, 30, 60};
        this.controlId = controlId;
        autoRefreshJob = new AutoRefreshJob(this);
        return refreshSettings;
                            NLS.bind(UIMessages.sql_editor_resultset_filter_panel_menu_refresh_interval_1, timeout);
    }
                schedulerMenu.setLocation(pt.x, pt.y + rect.height);

 * DBeaver - Universal Database Manager
    }
import java.util.ArrayList;

        AutoRefreshMenuListener(ToolItem item, Runnable defaultAction) {
        return runnable;
                autoRefreshButton.setImage(DBeaverIcons.getImage(UIIcon.CLOCK_STOP));
                }
                            public void widgetSelected(SelectionEvent e) {
            if (schedulerMenu != null) {
        }
        // Cancel any auto-refresh activities
                    });

    }
                        }
        autoRefreshButton.setImage(DBeaverIcons.getImage(defRefreshIcon));
import org.eclipse.swt.events.SelectionEvent;


    private Menu schedulerMenu;
import org.eclipse.jface.action.IContributionManager;
import org.jkiss.utils.CommonUtils;
import org.eclipse.swt.graphics.Point;
    }
    private Control parent;
                    defaultAction.run();


                    mi.setText(UIMessages.sql_editor_resultset_filter_panel_menu_stop);
        return populateRefreshButton(toolbar, null, UIMessages.sql_editor_resultset_filter_panel_btn_config_refresh, UIIcon.CLOCK_START, createDefaultRefreshAction());
        if (autoRefreshButton != null && !autoRefreshButton.isDisposed()) {
        if (refreshJob != null) {
                if (isAutoRefreshEnabled()) {
                    new MenuItem(schedulerMenu, SWT.SEPARATOR);
                            @Override
 */
                        MenuItem hintItem = new MenuItem(schedulerMenu, SWT.PUSH);
                    }
                    String hintText = hintSupplier.get();
import java.util.function.Supplier;
            }
                    mi.setEnabled(isAutoRefreshEnabled());
    }
        if (autoRefreshButton != null && !autoRefreshButton.isDisposed()) {
            this.autoRefreshJob = null;
        if (autoRefreshButton != null && !autoRefreshButton.isDisposed()) {
                    for (int i = 0; i < presetList.size(); i++) {
    private Supplier<String> hintSupplier;
 *
public class AutoRefreshControl {
                populateRefreshButton(parent);
        }
        }

                        }
        if (autoRefreshJob != null) {
 * You may obtain a copy of the License at
    synchronized boolean isAutoRefreshEnabled() {
        private final ToolItem dropdown;
                        new MenuItem(schedulerMenu, SWT.SEPARATOR);
import org.eclipse.swt.graphics.Rectangle;
            } else {
    public void cancelRefresh() {
import org.jkiss.dbeaver.ui.UIStyles;


    }

        if (itemText != null) {
            enableAutoRefresh(true);
        }
    }
import org.jkiss.dbeaver.ui.UIIcon;
        }
        }
            autoRefreshButton.setEnabled(enable);
        private void runPreset(int interval) {
            autoRefreshJob.cancel();
        this.runnable = runnable;

                    MenuItem mi = new MenuItem(schedulerMenu, SWT.NONE);
                        @Override
import org.jkiss.dbeaver.ui.internal.UIMessages;
                    mi.setText(UIMessages.sql_editor_resultset_filter_panel_menu_customize);
import org.eclipse.jface.dialogs.IDialogConstants;
                            }
        scheduleAutoRefresh(false);
            settings.setRefreshInterval(interval);
    private AutoRefreshJob autoRefreshJob;


        }
    private RefreshSettings refreshSettings;
                ToolItem item = (ToolItem) e.widget;
    }
                    mi = new MenuItem(schedulerMenu, SWT.NONE);
                        @Override

                autoRefreshButton.setToolTipText(UIMessages.sql_editor_resultset_filter_panel_btn_stop_refresh);

    }
 *
    public ToolItem populateRefreshButton(ToolBar toolbar, String itemText, String defTooltip, DBPImage defImage, Runnable defAction) {

 * See the License for the specific language governing permissions and
        contributionManager.add(new ContributionItem() {
                    schedulerMenu.dispose();
    }

                }
    String getControlId() {
    private synchronized RefreshSettings getRefreshSettings() {
        if (afterError && settings.isStopOnError()) {
            @Override
/*
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.SWT;
    }
                    if (defaultInterval > 0 && !presetList.contains(defaultInterval)) {
        this.hintSupplier = hintSupplier;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
                        mi = new MenuItem(schedulerMenu, SWT.PUSH);
                        mi.addSelectionListener(new SelectionAdapter() {

    public AutoRefreshControl(Control parent, String controlId, DBRRunnableWithProgress runnable) {
    public void setHintSupplier(Supplier<String> hintSupplier) {
            }

        }
                if (schedulerMenu != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            public void fill(ToolBar parent, int index) {
                        if (isAutoRefreshEnabled() && timeout == defaultInterval) {
    }
                Point pt = item.getParent().toDisplay(new Point(rect.x, rect.y));
    }
                        presetList.add(0, defaultInterval);
    private void runCustomized() {

            enableAutoRefresh(true);
            autoRefreshButton.setText(itemText);

            RefreshSettings settings = new RefreshSettings(getRefreshSettings());
}
                    int defaultInterval = getRefreshSettings().getRefreshInterval();
                    for (int t : AUTO_REFRESH_DEFAULTS) presetList.add(t);
        RefreshSettings settings = getRefreshSettings();
                schedulerMenu = null;
    private DBRRunnableWithProgress runnable;
        this.parent = parent;
    public void populateRefreshButton(IContributionManager contributionManager) {
            refreshSettings = new RefreshSettings(controlId);

        return controlId;
            if (isAutoRefreshEnabled()) {
    private ToolItem autoRefreshButton;
        private final Runnable defaultAction;
                }
                autoRefreshButton.setToolTipText(defRefreshText);
                            schedulerMenu.setDefaultItem(mi);
import org.eclipse.swt.widgets.*;
                    enableAutoRefresh(false);
    private Runnable createDefaultRefreshAction() {
                    mi.addSelectionListener(new SelectionAdapter() {
        return autoRefreshButton;

                schedulerMenu.setVisible(true);
        @Override
    }
    private void updateAutoRefreshToolbar() {
            this.defaultAction = defaultAction;
import org.jkiss.dbeaver.ui.DBeaverIcons;

                    if (!CommonUtils.isEmpty(hintText)) {
    }
    public synchronized void enableControls(boolean enable) {

        autoRefreshButton = new ToolItem(toolbar, SWT.DROP_DOWN | SWT.NO_FOCUS);
 * Unless required by applicable law or agreed to in writing, software
            setRefreshSettings(dialog.getRefreshSettings());
                Rectangle rect = item.getBounds();
        if (!this.autoRefreshEnabled || parent.isDisposed()) {
            autoRefreshJob = null;
                            runCustomized();

            return;
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
    private synchronized void setRefreshSettings(RefreshSettings refreshSettings) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        autoRefreshButton.addSelectionListener(new AutoRefreshMenuListener(autoRefreshButton, defAction));
                autoRefreshButton.setImage(DBeaverIcons.getImage(defRefreshIcon));
        updateAutoRefreshToolbar();
            enableAutoRefresh(false);
        public void widgetSelected(SelectionEvent e) {
 *
                        public void widgetSelected(SelectionEvent e) {
                        String text = i == 0 ?

    }
                        public void widgetSelected(SelectionEvent e) {
            }




        return this::runCustomized;
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.action.ContributionItem;
        if (dialog.open() == IDialogConstants.OK_ID) {

        updateAutoRefreshToolbar();
            this.dropdown = item;
            refreshSettings.loadSettings();
    private String defRefreshText;

    private volatile boolean autoRefreshEnabled = false;
                } else {
