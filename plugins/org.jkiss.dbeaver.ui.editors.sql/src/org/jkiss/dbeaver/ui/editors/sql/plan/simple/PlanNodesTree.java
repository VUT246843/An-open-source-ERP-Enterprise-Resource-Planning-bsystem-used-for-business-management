    @Override
    @Override
        public boolean isHyperlink(Object element, Object cellValue)
import org.jkiss.dbeaver.model.exec.plan.DBCPlanNodeKind;
/**

            }
    public void showPlan(DBPDataSource dataSource, DBCPlan plan) {
        }
            return BaseThemeSettings.instance.colorWarning;
        }
    @Override
        @Override
    private String query;
import org.eclipse.ui.IWorkbenchSite;
import org.eclipse.jface.viewers.ITreeContentProvider;
        }
 *
    private class PlanTreeRenderer extends ViewerRenderer {
import java.util.List;
        return false;
        {
                return CommonUtils.isEmpty(nestedNodes) ? new Object[0] : nestedNodes.toArray();
        } finally {

        @Override
        return new PlanTreeRenderer();
    @Override
            clearListData();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected String getListConfigId(List<Class<?>> classList) {

package org.jkiss.dbeaver.ui.editors.sql.plan.simple;
import org.jkiss.dbeaver.ui.navigator.actions.NavigatorHandlerObjectOpen;
    protected ObjectViewerRenderer createRenderer()
    {
    }
            }
            return cellValue instanceof DBSObject;
        }
        {

        this.dataSource = dataSource;

            return BaseThemeSettings.instance.colorError;
                Collection<? extends DBCPlanNode> nestedNodes = ((DBCPlanNode) parentElement).getNested();
        public boolean hasChildren(Object element)
    }
public class PlanNodesTree extends DatabaseObjectListControl<DBCPlanNode> {
        @Override
import org.eclipse.swt.widgets.Composite;
import org.eclipse.jface.viewers.Viewer;


import java.util.Collection;
        itemsViewer.getControl().setRedraw(false);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull

/*
            itemsViewer.expandToLevel(10);
        {
    @Nullable
    }
        }
            if (parentElement instanceof DBCPlanNode) {
import org.jkiss.dbeaver.model.struct.DBSObject;

            if (element instanceof DBCPlanNode) {

    protected Color getObjectForeground(DBCPlanNode item) {

            }
    @Override
        setFitWidth(true);
    public PlanNodesTree(@NotNull Composite parent, int style, @NotNull IWorkbenchSite site) {

            setListData(nodes, false, false);
            }
        {
}
 */
        public Object getParent(Object element)
import org.jkiss.dbeaver.ui.controls.ObjectViewerRenderer;
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.ui.navigator.itemlist.DatabaseObjectListControl;
 *     http://www.apache.org/licenses/LICENSE-2.0
                return ((Collection<?>)inputElement).toArray();
        }
    private DBPDataSource dataSource;


import java.util.ArrayList;
    }
import org.eclipse.jface.viewers.TreeViewer;
    protected Color getObjectBackground(DBCPlanNode item) {
        {

    }
import org.eclipse.swt.graphics.Color;
        super(parent, style, site, CONTENT_PROVIDER);
 * You may obtain a copy of the License at
            if (inputElement instanceof Collection) {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
            itemsViewer.getControl().setRedraw(true);
        @Override

import org.jkiss.dbeaver.model.exec.plan.DBCPlan;
 * Copyright (C) 2010-2025 DBeaver Corp and others


import org.jkiss.utils.CommonUtils;
    }
                return ((DBCPlanNode)element).getParent();
        }
        public void navigateHyperlink(Object cellValue)
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        public void dispose()
            if (cellValue instanceof DBSObject) {
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
        {

            return null;
    }
        return super.getObjectForeground(item);
    {
import org.jkiss.code.Nullable;
 *
        @Override
        @Override
    @NotNull
        List<DBCPlanNode> nodes = new ArrayList<>(plan.getPlanNodes(
        public Object[] getElements(Object inputElement)
import org.jkiss.dbeaver.ui.BaseThemeSettings;
        @Override
            return element instanceof DBCPlanNode && !CommonUtils.isEmpty(((DBCPlanNode) element).getNested());
        public Object[] getChildren(Object parentElement)
    @Override
import java.util.Collections;
 *
    @Nullable
        try {
            Collections.singletonMap(DBCPlan.OPTION_KEEP_ORIGINAL, true)));
    protected LoadingJob<Collection<DBCPlanNode>> createLoadService(boolean forUpdate)
        @Override



import org.jkiss.dbeaver.model.exec.plan.DBCPlanNode;
        }
 */
        } else if (item.getNodeKind() == DBCPlanNodeKind.INDEX_SCAN) {

        }
        return "ExecutionPlan/" + dataSource.getContainer().getDriver().getId();
            return null;
                NavigatorHandlerObjectOpen.openEntityEditor((DBSObject) cellValue);
    }
    public boolean supportsDataGrouping() {
    };

 * DBeaver - Universal Database Manager
        {
        return null;
        if (item.getNodeKind() == DBCPlanNodeKind.TABLE_SCAN) {
        return super.getObjectBackground(item);
import org.jkiss.dbeaver.ui.LoadingJob;
 * See the License for the specific language governing permissions and
        final TreeViewer itemsViewer = (TreeViewer) PlanNodesTree.this.getItemsViewer();

 * limitations under the License.
    }
            return null;
        {
    private static ITreeContentProvider CONTENT_PROVIDER = new ITreeContentProvider() {

 * Plan nodes tree
