        try {
    }

                        selectorViewer.getControl().traverse(e.detail, e);
 * Copyright (C) 2010-2026 DBeaver Corp and others
import java.util.List;

    }
    private void createFilterToolbar(Composite parent) {
    public DriverSelectViewer(Composite parent, Object site, List<DBPDataSourceProviderDescriptor> providers, boolean expandRecent, SelectorViewType forceViewType) {
            return isLeafMatch(viewer, element);
                       wordMatches(driver.getDescription()) ||
    }
            });
        browser
    private static SelectorViewType getCurrentSelectorViewType() {
        if (forceViewType == null) {
                        filters.add(new DriverInstalledFilter());
import java.util.ArrayList;
    }

    public ISelection getSelection() {
            viewType = viewType == SelectorViewType.tree ? SelectorViewType.browser : SelectorViewType.tree;
import org.eclipse.jface.viewers.*;

        }
            this.label = label;
    private StructuredViewer selectorViewer;

        try {
import org.eclipse.core.runtime.IProgressMonitor;

            return description;
    private static final int REFRESH_DELAY = 200;
                                ((Window) container).close();
    private OrderBy orderBy;
    public void refresh() {
        this(parent, site, providers, expandRecent, null);
        filterText.addKeyListener(new KeyAdapter() {
        return CommonUtils.valueOf(OrderBy.class, DBWorkbench.getPlatform().getPreferenceStore().getString(PROP_SELECTOR_ORDER_BY), OrderBy.score);
        refreshJob = createRefreshJob();
        }
                break;



        }
            public void keyTraversed(TraverseEvent e) {
        filterLayout.marginWidth = 0;
                    }
                if (forceViewType == null) {
                    return Status.CANCEL_STATUS;
    private Comparator<DBPDriver> driverComparator;
        createSelectorControl();
                public void widgetSelected(SelectionEvent e) {
    @Override
        selectorViewer.setSelection(selection, reveal);
                    List<ViewerFilter> filters = new ArrayList<>();
            if (element instanceof DBPDriver driver) {
                        ((AbstractTreeViewer) selectorViewer).expandAll();
                if (keyEvent.keyCode == SWT.ARROW_DOWN || keyEvent.keyCode == SWT.CR) {
    public void setInput(Object input) {
        }

            return SelectorViewType.browser;
                drivers.addAll(provider.getEnabledDrivers());
            return super.isLeafMatch(viewer, element);

        private final String label;
    private void clearText() {
                selectorViewer = new DriverTreeViewer(selectorComposite, SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
            }
    }
                return driver.getDefaultDriverLoader().isDriverInstalled();


            }
        GridLayout filterLayout = new GridLayout(2, false);
        filterLayout.marginHeight = 0;
        String viewTypeStr = DBWorkbench.getPlatform().getPreferenceStore().getString(PROP_SELECTOR_VIEW_TYPE);
        return selectorViewer.getInput();
        ToolItem clearItem = new ToolItem(switcherToolbar, SWT.PUSH);
        }
                    } finally {
    }

                }
        switch (orderBy) {
        GridLayout layout = new GridLayout(1, false);
            UIConnectionMessages.dialog_driver_select_viewer_order_by_name_description
        filterComposite.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
        }
/**
    }
        return drivers.toArray(new Object[0]);

                    if (selectorViewer instanceof AbstractTreeViewer) {
            }
    }
        // Create browser control toggle
                }
    private final Composite composite;

        return orderBy;

 *
import org.jkiss.dbeaver.registry.driver.DriverDescriptor;
            UIConnectionMessages.dialog_driver_select_viewer_order_by_score_label,
import org.eclipse.swt.events.*;
            }
    }
        public boolean select(Viewer viewer, Object parentElement, Object element) {
        }
            SelectorViewType viewType = getCurrentSelectorViewType();

        UIUtils.asyncExec(() -> filterComposite.layout(true, true));
        selectorComposite.setRedraw(false);
            });
    private static final String PROP_SELECTOR_VIEW_TYPE = "driver.selector.view.mode"; //$NON-NLS-1$
        filterText.setText("");
            setIncludeLeadingWildcard(true);
        createFilterToolbar(filterComposite);
        composite.setLayout(layout);
 * you may not use this file except in compliance with the License.

/*
        filterComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        drivers.sort((o1, o2) -> {
        layout.marginWidth = 0;
    public Object getInput() {
import org.eclipse.ui.progress.WorkbenchJob;
    public enum SelectorViewType {
        OrderBy(String label, String description) {
        createExtraFilterControlsAfter(filterGroup);
                this.driverComparator = new DriverUtils.DriverScoreComparator(dataSources);
        DBWorkbench.getPlatform().getPreferenceStore().setValue(PROP_SELECTOR_ORDER_BY, orderBy.name());
            switchItem = new ToolItem(switcherToolbar, SWT.CHECK | SWT.DROP_DOWN);
        layout.marginHeight = 0;
    */
        score(
import org.jkiss.dbeaver.model.DBIcon;
        public String getDescription() {

                return isParentMatch(viewer, element) || isLeafMatch(viewer, element);
    private final List<DBPDataSourceContainer> dataSources;

        selectorViewer.refresh();

 * DriverSelectViewer
                selectorViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
            return o1.getName().compareToIgnoreCase(o2.getName());
                selectorViewer.getControl().addTraverseListener(e -> {
        // cancel currently running job first, to prevent unnecessary redraw

        selectorComposite.setRedraw(false);

        private final String description;
import org.eclipse.swt.layout.GridLayout;
    }
    private void createSelectorControl() {
            return SelectorViewType.browser;



    private Control getSelectorControl() {
                }
    }
        } finally {
                    }
import org.jkiss.dbeaver.registry.DataSourceProviderDescriptor;
        textChanged();
                        }
    }

                    switchItem.setImage(DBeaverIcons.getImage(DBIcon.TREE_TABLE));
                return wordMatches(driver.getName()) ||
                    if (e.detail == SWT.TRAVERSE_ESCAPE) {
package org.jkiss.dbeaver.ui.dialogs.driver;
                        ((DriverTreeViewer) selectorViewer).initDrivers(providers, expandRecent);
        @Override
            @Override
            textChanged();
            selectorViewer.getControl().dispose();
            selectorComposite.setRedraw(true);
    private static void setCurrentSelectorViewType(SelectorViewType viewType) {
    private static final String PROP_SELECTOR_ORDER_BY = "driver.selector.orderBy"; //$NON-NLS-1$

            switchItem.setText("Switch view");
        });
 *
import org.eclipse.swt.layout.GridData;
    }
    private static class DriverInstalledFilter extends ViewerFilter {

                    if (CommonUtils.isNotEmpty(text)) {
    public StructuredViewer getSelectorViewer() {
                    }
                            }
                if (site instanceof IDoubleClickListener) {




        if (provs != null) {
                if (getControl().isDisposed()) {
import org.jkiss.dbeaver.model.connection.DBPDataSourceProviderDescriptor;

            });
 * Licensed under the Apache License, Version 2.0 (the "License");
    private void switchSelectorControl() {
                this.driverComparator = new DriverUtils.DriverNameComparator();
import org.jkiss.dbeaver.model.connection.DBPDriver;
    protected void createExtraFilterControlsAfter(Composite filterGroup) {
                }
            }

                @Override
        selectorViewer.refresh(driver);
        refreshJob.cancel();
            case name:
                    selectorViewer.setFilters(filters.toArray(new ViewerFilter[0]));


        } finally {
    }
 *
                        filters.add(driverFilter);
                    switchItem.setText(UIConnectionMessages.viewer_selector_control_text_gallery);
        createExtraFilterControlsBefore(filterGroup);

}
            return SelectorViewType.valueOf(viewTypeStr);
    @Override

        }
    @NotNull
        filterText.addModifyListener(e -> textChanged());
            } else {
        OrderBy defOrderBy = getDefaultOrderBy();
                } finally {
                filterText.setFocus();
                });
                    }
    }
    private void createFilterControl(Composite parent) {
            selectorComposite.layout(true, true);
                UIUtils.asyncExec(() -> {
import org.eclipse.swt.SWT;
                        if (site instanceof IWizardPage) {
                        inTraverse = false;
        tree,
    }
    public OrderBy getOrderBy() {
    }
        }
        composite = new Composite(parent, SWT.NONE);
        if (!CommonUtils.isEmpty(filterText.getText())) {
        return new WorkbenchJob("Refresh driver filter") {//$NON-NLS-1$
        }
        }

import org.jkiss.dbeaver.registry.DataSourceRegistry;
    }
            composite.setLayoutData(new GridData(GridData.FILL_BOTH));
            public IStatus runInUIThread(IProgressMonitor monitor) {
        this.site = site;
    private Composite selectorComposite;
        if (selectorViewer instanceof DriverTabbedViewer) {
        name(
    public enum OrderBy {
    public Control getControl() {
                if (forceViewType == null) {
    /*
            }
            selectorViewer.addSelectionChangedListener(event -> {
    private Text filterText;
            setCurrentSelectorViewType(viewType);
import org.jkiss.dbeaver.runtime.DBWorkbench;
    private Object[] collectDrivers(List<DataSourceProviderDescriptor> provs) {
 * DBeaver - Universal Database Manager
    public DriverTabbedViewer getTabbedViewer() {
    private final List<DBPDataSourceProviderDescriptor> providers;


    protected void createExtraFilterControlsBefore(Composite filterGroup) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        Composite filterComposite = new Composite(filterGroup, SWT.NONE);
                       wordMatches(driver.getId());
                    try {


 */
        this.forceViewType = forceViewType;
        clearItem.addSelectionListener(new SelectionAdapter() {
import org.eclipse.core.runtime.IStatus;

    private static class DriverFilter extends PatternFilter {


            selectorViewer.addDoubleClickListener(event -> {
            createSelectorControl();
        return filterText != null ? filterText.getText() : "";
        }
import java.util.Comparator;

import org.jkiss.dbeaver.ui.UIIcon;
        List<DBPDriver> drivers = new ArrayList<>();
    }
        };
        protected boolean isLeafMatch(Viewer viewer, Object element) {
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.registry.driver.DriverUtils;
                    inTraverse = true;
                Object element = ((StructuredSelection) curSelection).getFirstElement();
    }
    }



        return selectorViewer.getSelection();
                    switchSelectorControl();

        return (DriverTabbedViewer) selectorViewer;

            UIConnectionMessages.dialog_driver_select_viewer_order_by_name_label,
        return selectorViewer;
        this.dataSources = DataSourceRegistry.getAllDataSources();

            this.description = description;
import org.jkiss.dbeaver.ui.UIUtils;

    }
            @Override
            return true;

        });
 * See the License for the specific language governing permissions and
            for (DataSourceProviderDescriptor provider : provs) {
                selectorViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
                if (site instanceof ISelectionChangedListener) {
                    .getContentProvider()).getParent(element);
        filterText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
    }
import org.jkiss.code.NotNull;
    private WorkbenchJob createRefreshJob() {
        filterText = new Text(filterComposite, SWT.BORDER | SWT.SINGLE);
                            IWizardContainer container = ((IWizardPage) site).getWizard().getContainer();
        DBWorkbench.getPlatform().getPreferenceStore().setValue(PROP_SELECTOR_VIEW_TYPE, viewType.name());
public class DriverSelectViewer extends Viewer {
        selectorViewer.setInput(input);
            }


import org.eclipse.core.runtime.jobs.Job;
    private final boolean expandRecent;
            switchItem.addSelectionListener(new SelectionAdapter() {
        }

        selectorComposite = UIUtils.createComposite(composite, 1);
                }
                    switchItem.setSelection(false);
                    switchItem.setSelection(true);

                    ((ISelectionChangedListener) site).selectionChanged(event);
    }
                    selectorViewer.setSelection(new StructuredSelection(element), true);
    public static OrderBy getDefaultOrderBy() {
        public boolean isElementVisible(Viewer viewer, Object element) {
                Object parent = ((ITreeContentProvider) ((AbstractTreeViewer) viewer)
            return label;
 *     http://www.apache.org/licenses/LICENSE-2.0
            }
                try {
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }

                }
                });
        refreshJob.schedule();
        try {

import org.eclipse.swt.widgets.*;
            }
        if (parent.getLayout() instanceof GridLayout) {
                if (parent != null && isLeafMatch(viewer, parent)) {
        }
    private Job refreshJob;
        this.setOrderBy(defOrderBy);

        }
            ISelection curSelection = selectorViewer.getSelection();
                break;

            ((DriverTabbedViewer) selectorViewer).setListComparator(this.driverComparator);
    public void refresh(DBPDriver driver) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
            @Override
                return Status.OK_STATUS;
 * Unless required by applicable law or agreed to in writing, software
                    }
        );
        clearItem.setImage(DBeaverIcons.getImage(UIIcon.ERASE));
                clearText();

        return composite;

    @Override
 *
        } catch (IllegalArgumentException e) {
                }
                }
            selectorComposite.setRedraw(true);
        createFilterControl(composite);
                    switchItem.setImage(DBeaverIcons.getImage(DBIcon.TREE_SCHEMA));
            boolean inTraverse;
    private final SelectorViewType forceViewType;
        ),
        }
                        driverFilter.setPattern(text);
                    if (DBWorkbench.isDistributed()) {
    public void setOrderBy(OrderBy orderBy) {

                    String text = getFilterString();
import org.eclipse.ui.dialogs.PatternFilter;
    }
            if (curSelection instanceof StructuredSelection && !curSelection.isEmpty()) {
import org.jkiss.dbeaver.ui.internal.UIConnectionMessages;

            switchItem.setImage(DBeaverIcons.getImage(DBIcon.TREE_SCHEMA));
            if (viewer instanceof AbstractTreeViewer) {
                selectorViewer.getControl().setRedraw(false);
                    switchItem.setText(UIConnectionMessages.viewer_selector_control_text_classic);
        @Override
                       wordMatches(driver.getCategory()) ||
        DriverFilter() {
                    ((IDoubleClickListener) site).doubleClick(event);
            public void keyPressed(KeyEvent keyEvent) {
        return selectorViewer.getControl();
        this.expandRecent = expandRecent;
 * @author Serge Rider
                });
    private void textChanged() {

        if (viewTypeStr == null) {
                    selectorViewer.getControl().setRedraw(true);
        filterComposite.setFont(composite.getFont());
    }
        ToolBar switcherToolbar = new ToolBar(parent, SWT.RIGHT | SWT.HORIZONTAL);
                        DriverFilter driverFilter = new DriverFilter();
            public void widgetSelected(SelectionEvent e) {
        selectorComposite.setLayoutData(new GridData(GridData.FILL_BOTH));
        });
            case score:
                    }
    public void setSelection(ISelection selection, boolean reveal) {

        filterText.setMessage(UIConnectionMessages.dialog_connection_driver_treecontrol_initialText);
                if (!inTraverse) {
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
                selectorViewer = new DriverTabbedViewer(selectorComposite, SWT.NONE, dataSources, driverComparator);


        filterText.addTraverseListener(new TraverseListener() {
    private ToolItem switchItem;
        filterComposite.setLayout(filterLayout);
    @Override
    private String getFilterString() {
            UIConnectionMessages.dialog_driver_select_viewer_order_by_score_description
        });
        this.orderBy = orderBy;
    public DriverSelectViewer(Composite parent, Object site, List<DBPDataSourceProviderDescriptor> providers, boolean expandRecent) {
                }
                    getSelectorControl().setFocus();
    }
        refreshJob.schedule(REFRESH_DELAY);
        public String getLabel() {
        filterGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import org.jkiss.utils.CommonUtils;
        }
                    if (selectorViewer instanceof DriverTreeViewer) {
            switchItem.setWidth(UIUtils.getFontHeight(switcherToolbar) * 15);
 */
            if (forceViewType == SelectorViewType.tree || (forceViewType == null && getCurrentSelectorViewType() == SelectorViewType.tree)) {


                            if (container instanceof Window) {
        Composite filterGroup = UIUtils.createComposite(parent, 1);
    @Override

    }
    }
 * limitations under the License.

                UIUtils.asyncExec(() -> {
                    return true;

            @Override
        this.providers = providers;
            if (element instanceof DriverDescriptor driver) {
            }
    private final Object site;
