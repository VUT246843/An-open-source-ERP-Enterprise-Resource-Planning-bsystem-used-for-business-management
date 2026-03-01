        if (parent.getLayout() instanceof GridLayout) {
                    if (CommonUtils.isEmpty(statusText)) {
                refreshProperties();
        @Override
        this.input = input;
        @Override
    private boolean isAttached() {
            return null;
    public void dispose() {
                }

            }
        }
    }
    @Override
        this.part = part;
            }
        {
        }
        for (DBPPropertyDescriptor prop : input.getPropertySource().getProperties()) {
            ownerProgressControl = ((IProgressControlProvider) this.part).getProgressControl();


import org.jkiss.code.NotNull;

                @Override
        public void fillCustomActions(IContributionManager contributionManager) {
    }
                    actionBars.getStatusLineManager().setMessage(CommonUtils.notEmpty(statusText));
    public void aboutToBeShown() {

import org.eclipse.swt.widgets.Composite;
    @Override
                        }
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
                    actionBars = ((IEditorSite) site).getActionBars();
import org.eclipse.core.runtime.IStatus;
import org.jkiss.dbeaver.ui.controls.folders.TabbedFolderPage;
    private UIJob refreshJob = null;
    @Override
                if (registry != null) {
    private PropertiesPageControl progressControl;
}            @Override
        {
/*
        protected ISearchExecutor getSearchRunner() {

import org.eclipse.jface.viewers.IFontProvider;
                IWorkbenchPartSite site = part.getSite();
            UIUtils.expandAll(propertyTree);
            public void focusLost(FocusEvent e) {

                refreshJob = new RefreshJob();
import org.jkiss.dbeaver.model.struct.DBSObject;
            };
import org.eclipse.swt.SWT;
    public void handleDataSourceEvent(@NotNull DBPEvent event)
import org.jkiss.dbeaver.runtime.properties.PropertiesContributor;
        List<String> extraCategories = new ArrayList<>();
    private class PropertyLabelProvider extends ColumnLabelProvider implements IFontProvider {
        }
                progressControl.activate(false);
        }
    private final boolean attached;
    private boolean activated;
            }
            curPropertySource = input.getPropertySource();
import org.jkiss.dbeaver.model.DBUtils;
                }
                if (actionBars != null) {
import org.eclipse.swt.events.FocusEvent;
        }
            super.fillCustomActions(contributionManager);
            curPropertySource = input.getPropertySource();
import org.jkiss.dbeaver.runtime.DBWorkbench;
            }
                }
    }
            synchronized (TabbedFolderPageProperties.this) {
        if (!activated) {
    }

        }
            if (element instanceof DBPPropertyDescriptor && curPropertySource != null && ((DBPPropertyDescriptor) element).isEditable(curPropertySource.getEditableValue())) {
            }
        if (force) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            progressControl.createProgressPanel();
        if (input.getDatabaseObject() == event.getObject() && !Boolean.FALSE.equals(event.getEnabled()) && !propertyTree.getControl().isDisposed()) {
    @Override
            return propertyTree.getTree().getItemCount() > 0;
import org.eclipse.swt.graphics.Font;
                }
            super("Refresh properties");
        @Override
                    String statusText = null;
        ProgressPageControl ownerProgressControl = null;
                dispose();

        }
                    Object selection = (propsSelection instanceof IStructuredSelection ? ((IStructuredSelection) propsSelection).getFirstElement() : null);
        }
            if (!CommonUtils.isEmpty(category)) {
                refreshProperties();
            });

                    if (prop != null) {
        @Override

            if (input.getDatabaseObject() != null) {
import org.jkiss.dbeaver.model.DBPEventListener;
import org.eclipse.swt.events.FocusListener;
            propertyTree.setExpandMode(PropertyTreeViewer.ExpandMode.FIRST);
                propertyTree.refresh();
                progressControl.activate(true);


                if (!extraCategories.contains(category)) {
        }
        return RefreshResult.IGNORED;
            }
                            statusText = prop.getDisplayName();
        public void handlePropertyLoad(Object object, DBPPropertyDescriptor property, Object propertyValue, boolean completed)
    protected IDatabaseEditorInput input;
            }
            super(parent, SWT.SHEET);
                    List<DBPPropertyDescriptor> result = new ArrayList<>();
import org.eclipse.ui.*;


        {
                protected void contributeContextMenu(IMenuManager manager, Object node, String category, DBPPropertyDescriptor property) {
                var registry = DBUtils.getObjectRegistry((DBSObject) curPropertySource.getEditableValue());
    }

        public IStatus runInUIThread(IProgressMonitor monitor)
                    DBPPropertyDescriptor prop = propertyTree.getPropertyFromElement(selection);
    }
                    }
    private DBPPropertySource curPropertySource;
    public TabbedFolderPageProperties(IWorkbenchPart part, IDatabaseEditorInput input) {
            propertyTree.addSelectionChangedListener(event -> {

            }
import org.jkiss.dbeaver.model.DBPEvent;
        this.attached = !DBWorkbench.getPlatform().getPreferenceStore().getBoolean(NavigatorPreferences.ENTITY_EDITOR_DETACH_INFO);
import org.jkiss.dbeaver.ui.*;
            return Status.OK_STATUS;
        });
 * You may obtain a copy of the License at

        }
        public void cancelSearch() {
 * Unless required by applicable law or agreed to in writing, software
                // Force control redraw (to repaint hyperlinks and other stuff)
        if (ownerProgressControl != null) {
            progressControl.setLayoutData(new GridData(GridData.FILL_BOTH));
            String category = prop.getCategory();
import org.eclipse.swt.layout.GridData;
            }
                    }
    {
 * you may not use this file except in compliance with the License.
            propertyTree.repackColumns();

                    // Return only properties with categories
            if (refreshJob == null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
                IActionBars actionBars = null;
                    actionBars = ((IViewSite) site).getActionBars();
import org.eclipse.core.runtime.IProgressMonitor;
        if (this.part instanceof IProgressControlProvider) {
                propertyTree.loadProperties(curPropertySource);
import org.eclipse.swt.layout.GridLayout;
            PropertiesContributor.getInstance().addLazyListener(this);
            propertyTree.resetFilters();
 * DBeaver - Universal Database Manager
                registry.removeDataSourceListener(this);

    {
 * limitations under the License.
                return RefreshResult.REFRESHED;
        @Override
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
                        statusText = CommonUtils.toString(selection);
        }
                }
import org.jkiss.utils.CommonUtils;
import org.eclipse.core.runtime.Status;
            propertyTree = new PropertyTreeViewer(this, SWT.NONE) {
        } else {

    private class RefreshJob extends UIJob {
import org.eclipse.jface.action.IMenuManager;
            }

            if (curPropertySource.getEditableValue() == object && !propertyTree.getControl().isDisposed()) {
                            continue;
        if (curPropertySource != null && curPropertySource.getEditableValue() instanceof DBSObject) {
import java.util.List;
            });
 *
            propertyTree.setExtraLabelProvider(new PropertyLabelProvider());
            return this;

            if (!propertyTree.getControl().isDisposed()) {
                    for (DBPPropertyDescriptor prop : properties) {
                refreshJob.schedule(100);
    }
    public List<String> getExtraCategories() {
                }
                        result.add(prop);
                DatabaseEditorUtils.contributeStandardEditorActions(part.getSite(), contributionManager);
		super.dispose();
                PropertiesContributor.getInstance().removeLazyListener(PropertiesPageControl.this);
package org.jkiss.dbeaver.ui.editors.entity.properties;
    public RefreshResult refreshPart(Object source, boolean force) {

 *
    public void setFocus() {
            progressControl.substituteProgressPanel(ownerProgressControl);

	}
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
                    fillCustomActions(manager);
public class TabbedFolderPageProperties extends TabbedFolderPage implements IRefreshablePart, DBPEventListener {
    }
        progressControl.addDisposeListener(e -> dispose());
 */
        public boolean performSearch(String searchString, int options) {
        @Override
            curPropertySource = null;
            public void focusGained(FocusEvent e) {
                propertyTree.getControl().redraw();
            if (part != null) {

        return attached;
        synchronized (this) {
        {
                        }
 *
                    ISelection propsSelection = propertyTree.getSelection();
                    }
            @Override
                @Override
	}
import org.jkiss.dbeaver.runtime.properties.ILazyPropertyLoadListener;
    protected IWorkbenchPart part;
        return extraCategories;
        }
                    registry.addDataSourceListener(TabbedFolderPageProperties.this);
                protected DBPPropertyDescriptor[] filterProperties(Object object, DBPPropertyDescriptor[] properties) {
                refreshJob = null;
    @Override
 * See the License for the specific language governing permissions and
        RefreshJob()
            if (propertyTree != null) {

                    extraCategories.add(category);
        @Override
import org.eclipse.jface.viewers.ColumnLabelProvider;
    private class PropertiesPageControl extends ProgressPageControl implements ILazyPropertyLoadListener, ISearchExecutor {
        }
    @Override
        }
import org.eclipse.jface.viewers.IStructuredSelection;
import java.util.ArrayList;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
    }
                        if (CommonUtils.isEmpty(statusText)) {
        propertyTree.getControl().setFocus();
                if (site instanceof IEditorSite) {
                return BaseThemeSettings.instance.treeAndTableFontBold;
            propertyTree.setFilters(new PropertyTreeViewer.NodeFilter(searchString));
 * Licensed under the Apache License, Version 2.0 (the "License");

            if (registry != null) {
import org.jkiss.dbeaver.ui.navigator.NavigatorPreferences;
        PropertiesPageControl(Composite parent) {
        }
        }
    private PropertyTreeViewer propertyTree;
        }
import org.eclipse.jface.action.IContributionManager;
    public void createControl(Composite parent) {
import org.eclipse.ui.progress.UIJob;

                        if (CommonUtils.isEmpty(prop.getCategory())) {
            propertyTree.loadProperties(curPropertySource);
 */
            refreshProperties();

    private void refreshProperties()
            var registry = DBUtils.getObjectRegistry((DBSObject) curPropertySource.getEditableValue());
import org.eclipse.jface.viewers.ISelection;
            }
                        statusText = prop.getDescription();
    }
        propertyTree.getTree().addFocusListener(new FocusListener() {
                } else if (site instanceof IViewSite) {
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
            activated = true;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * TabbedFolderPageProperties
            }
        }
        public Font getFont(Object element)
import org.jkiss.dbeaver.ui.properties.PropertyTreeViewer;
    }
        progressControl = new PropertiesPageControl(parent);

/**
                    return result.toArray(new DBPPropertyDescriptor[0]);
            propertyTree.getControl().addDisposeListener(e -> {
