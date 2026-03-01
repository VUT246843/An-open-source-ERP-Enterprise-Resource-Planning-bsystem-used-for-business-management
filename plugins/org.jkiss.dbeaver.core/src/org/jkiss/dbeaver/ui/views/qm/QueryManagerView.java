    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
 *
                public void dividerMoved(int firstControlWeight, int secondControlWeight) {
    @Override
import org.jkiss.dbeaver.utils.GeneralUtils;
        if (adapter == IWorkbenchAdapter.class) {
        }
        if (sash == null) {
                        ActionUtils.fireCommandRefresh(QueryManagerFilterHandler.ID);
    }
    public void createPartControl(Composite parent) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            throw new IllegalStateException();
    public boolean isFilterPanelAvailable() {
 * You may obtain a copy of the License at
    }
            sash.hideDown();
        queryLogViewer = new QueryLogViewer(group, getSite(), null, true, false);
        QueryManagerViewFilter filter = GeneralUtils.adapt(this, QueryManagerViewFilter.class);

        Composite group = UIUtils.createPlaceholder(parent, 1);
import org.eclipse.ui.model.WorkbenchAdapter;
import org.eclipse.swt.layout.GridData;
        UIUtils.setHelp(group, IHelpContextIds.CTX_QUERY_MANAGER);
            sash.hideDown();
import org.jkiss.dbeaver.ui.controls.CustomSashForm;
 */
import org.eclipse.swt.widgets.Composite;
    @Override
            sash.setLayout(new FillLayout());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                    boolean nowVisible = isFilterPanelVisible();
import org.jkiss.dbeaver.ui.controls.querylog.QueryLogViewer;
            sash.setLayoutData(new GridData(GridData.FILL_BOTH));
 * Unless required by applicable law or agreed to in writing, software


            sash.setNoHideLeft(true);
        return sash != null && !sash.isDownHidden();
                @Override

    public void setFilterPanelVisible(boolean visible) {
    public <T> T getAdapter(Class<T> adapter) {
                        wasVisible = nowVisible;
 *
 * DBeaver - Universal Database Manager
            filter.createControl(sash, queryLogViewer);

        queryLogViewer.getControl().setFocus();
        }

                }
 * you may not use this file except in compliance with the License.
        } else {
/*
                    }
}
        }
                    return "Query Manager";
    public boolean isFilterPanelVisible() {

import org.jkiss.dbeaver.ui.IHelpContextIds;
            });
    }
import org.eclipse.swt.layout.FillLayout;
            return adapter.cast(new WorkbenchAdapter() {
    }

    private CustomSashForm sash;
            sash.addCustomSashFormListener(new CustomSashForm.ICustomSashFormListener() {
    private void createViewer(@NotNull Composite parent) {
import org.eclipse.ui.part.ViewPart;
    public static final String VIEW_ID = "org.jkiss.dbeaver.core.queryManager";
import org.jkiss.dbeaver.ui.ActionUtils;
            sash = new CustomSashForm(parent, SWT.HORIZONTAL);
package org.jkiss.dbeaver.ui.views.qm;

                    if (wasVisible != nowVisible) {
 * See the License for the specific language governing permissions and
            createViewer(sash);
import org.eclipse.ui.model.IWorkbenchAdapter;
    }
        return sash != null;
                private boolean wasVisible = false;
import org.jkiss.dbeaver.ui.UIUtils;
            createViewer(parent);
        if (filter != null) {
    }
public class QueryManagerView extends ViewPart {
                @Override

            sash.setWeights(65, 35);

            });
                }
        return super.getAdapter(adapter);
    }
                public String getLabel(Object o) {
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *

        queryLogViewer.clearLog();
import org.eclipse.swt.SWT;
 * limitations under the License.
    public void clearLog() {
            sash.showDown();
        } else {
 * Licensed under the Apache License, Version 2.0 (the "License");

    private QueryLogViewer queryLogViewer;
        if (visible) {
    public void setFocus() {
