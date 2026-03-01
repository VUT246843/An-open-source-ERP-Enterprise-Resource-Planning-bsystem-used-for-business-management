
        }
import org.jkiss.dbeaver.model.DBPEvaluationContext;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSDataContainer;

    @Override
            UIUtils.showMessageBox(null, "Open link", "Can't navigate to '" + DBUtils.getObjectFullName(dataContainer, DBPEvaluationContext.UI) + "' - navigator node not found", SWT.ICON_ERROR);
        return true;
        return resultSetView.isRefreshInProgress();
    {

        //resultSetView.setSelection(resultSetView.getSelection());


                null,


    @Override
                targetNode,
    public boolean isActiveTask() {

        return resultSetView;
        // Cache project here. It may be inaccessible thru db object in case of later disconnect
        DBDDataFilter dataFilter = getEditorDataFilter();
import org.eclipse.swt.widgets.Composite;
    }
        if (resultSetView != null && resultSetView.isDirty()) {
    {
                );

    }
        if (force && resultSetView != null && resultSetView.hasData() && !resultSetView.isRefreshInProgress()) {
        UIUtils.asyncExec(() -> {
    {
        IActionBars actionBars = getEditorSite().getActionBars();

    public IResultSetDecorator createResultSetDecorator() {
    }
    public void createPartControl(Composite parent)
    public DBPProject getProject() {
    public ResultSetViewer getResultSetController()
            IEditorPart entityEditor = NavigatorHandlerObjectOpen.openEntityEditor(
            if (isReadyToRun()) {
 *
                if (selectedPage instanceof IResultSetContainer) {

        this.parent = parent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                }
import org.eclipse.ui.part.MultiPageEditorPart;
            resultSetView = null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
            resultSetView.refresh();
            resultSetView.refreshWithFilter(dataFilter);
 * DBeaver - Universal Database Manager
            resultSetView.getControl().setFocus();
                Object selectedPage = ((MultiPageEditorPart) entityEditor).getSelectedPage();

        super.dispose();
/*
    private ResultSetViewer resultSetView;
import org.jkiss.dbeaver.model.DBUtils;
            return;
    @Override
    }
        return null;//super.getAdapter(adapter);

    }
    {
    {
    public void setFocus()
            return RefreshResult.REFRESHED;
import org.jkiss.dbeaver.ui.editors.AbstractDatabaseObjectEditor;
        if (executionContext == null) {
                true);
    @Override
        rscContext = PlatformUI.getWorkbench().getService(IContextService.class).activateContext(IResultSetController.RESULTS_CONTEXT_ID);
            }
import org.jkiss.code.NotNull;
            }
        firePropertyChange(IEditorPart.PROP_DIRTY);

        } else {
        }
    {
    }
                refreshWithFilters();
        refreshActions();
    protected abstract String getDataQueryMessage();
    private void refreshActions() {


    public void handleResultSetLoad() {
    }
                UIUtils.getActiveWorkbenchWindow(),
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;

            refreshWithFilters();
                return res;
    public void deactivatePart()
                DataEditorFeatures.DATA_EDIT_OPEN.use(

import org.jkiss.dbeaver.utils.RuntimeUtils;
                    Map.of("objectType", getDatabaseObject().getClass().getSimpleName())
    @Override
    private void createResultSetView()
    {
import org.eclipse.ui.contexts.IContextService;
            }

    }
    public boolean isReadyToRun()
                DatabaseDataEditor.class.getName(),
    public void openNewContainer(DBRProgressMonitor monitor, @NotNull DBSDataContainer dataContainer, @NotNull DBDDataFilter newFilter) {
    }
                    }
    @Override
        if (resultSetView != null && !resultSetView.getActivePresentation().getControl().isDisposed()) {
    public void dispose() {
    @NotNull
 * AbstractDataEditor
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (targetNode == null) {
import org.jkiss.dbeaver.ui.UIUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
            resultSetView.addListener(this);
package org.jkiss.dbeaver.ui.editors.data;
            }

    {
    @Override
    }
import org.eclipse.ui.contexts.IContextActivation;
import org.jkiss.dbeaver.ui.editors.entity.IEntityDataEditor;
    private static final Log log = Log.getLog(AbstractDataEditor.class);
import org.jkiss.dbeaver.ui.DataEditorFeatures;
import org.eclipse.core.runtime.IProgressMonitor;
            getSite().setSelectionProvider(resultSetView);
        if (resultSetView != null) {
            // Set selection provider from resultset

 * you may not use this file except in compliance with the License.

        refreshActions();
                return adapter.cast(resultSetView);
    public void handleResultSetSelectionChange(SelectionChangedEvent event) {
        if (rscContext != null) {
            return;
            resultSetView = new ResultSetViewer(parent, getSite(), this);
    public boolean isDirty()
                    ResultSetViewer rsv = (ResultSetViewer) ((IResultSetContainer) selectedPage).getResultSetController();
    //private boolean running = false;
}
    }
    }
    {
    @Override
    }
        openNewDataEditor(targetNode, newFilter);
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.app.DBPProject;
    public static void openNewDataEditor(DBNDatabaseNode targetNode, DBDDataFilter newFilter) {
            log.error("Can't open new container - not execution context found");
        final DBCExecutionContext executionContext = getExecutionContext();
    }
        return RefreshResult.IGNORED;
    @Override
public abstract class AbstractDataEditor<OBJECT_TYPE extends DBSObject> extends AbstractDatabaseObjectEditor<OBJECT_TYPE>
 * See the License for the specific language governing permissions and
 * limitations under the License.
            resultSetView.removeListener(this);
                loaded = true;
    @Override
            if (!resultSetView.applyChanges(RuntimeUtils.makeMonitor(monitor), new ResultSetSaveSettings())) {
import org.jkiss.dbeaver.Log;
import org.jkiss.dbeaver.model.data.DBDDataFilter;
                        rsv.refreshWithFilter(newFilter);
        return project;
    protected abstract boolean isSuspendDataQuery();
            resultSetView.getActivePresentation().getControl().setFocus();
 * Unless required by applicable law or agreed to in writing, software

    public void activatePart()

 *
                monitor.setCanceled(true);
    @Override
    protected abstract DBDDataFilter getEditorDataFilter();

    @Override
import java.util.Collections;
            if (newFilter != null && entityEditor instanceof MultiPageEditorPart) {
                Collections.singletonMap(DatabaseDataEditor.ATTR_DATA_FILTER, newFilter),

    @Nullable
    @Override
            if (res != null) {
    public RefreshResult refreshPart(Object source, boolean force) {
            }
    }
    public void doSave(IProgressMonitor monitor)
        }

    @Override
    private Composite parent;

import org.eclipse.ui.PlatformUI;

        }
    }
import org.eclipse.ui.IEditorPart;
        if (dataFilter == null) {
    private boolean loaded = false;
import java.util.Map;
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
            T res = resultSetView.getAdapter(adapter);
        if (resultSetView != null) {
    }
                        // Set filter directly
        });
        }
        this.project = getDatabaseObject().getDataSource().getContainer().getProject();

    public void handleResultSetChange()
            parent.layout();
    }

 *     http://www.apache.org/licenses/LICENSE-2.0


        if (resultSetView == null) {
import org.jkiss.dbeaver.model.struct.DBSObject;
    implements IResultSetContainer,IResultSetListener,IEntityDataEditor
        }

 * You may obtain a copy of the License at
import org.eclipse.jface.viewers.SelectionChangedEvent;
        }
        super.deactivatePart();
        createResultSetView();
 *
/**
        if (!loaded && !isSuspendDataQuery()) {
        }
    {
        createResultSetView();
                    if (rsv != null && !rsv.isRefreshInProgress() && !newFilter.equals(rsv.getModel().getDataFilter())) {
        final DBNDatabaseNode targetNode = DBWorkbench.getPlatform().getNavigatorModel().getNodeByObject(monitor, dataContainer, false);
                resultSetView.setStatus(getDataQueryMessage());
    @Override
    private IContextActivation rscContext;
    }
 */
        }
        return resultSetView != null && !resultSetView.getControl().isDisposed() && resultSetView.isDirty();
    }
 */
        return new QueryResultsDecorator();
{
import org.jkiss.code.Nullable;
import org.eclipse.swt.SWT;
import org.jkiss.dbeaver.ui.controls.resultset.*;

            rscContext = null;
        actionBars.updateActionBars();
    {
            if (adapter == IResultSetController.class || adapter == ResultSetViewer.class) {
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.ui.IActionBars;
        // No actions
    @Override
    private void refreshWithFilters() {
    public <T> T getAdapter(Class<T> adapter)
    private DBPProject project;

            PlatformUI.getWorkbench().getService(IContextService.class).deactivateContext(rscContext);
        }
    @Override
    }

        }
    @Override
