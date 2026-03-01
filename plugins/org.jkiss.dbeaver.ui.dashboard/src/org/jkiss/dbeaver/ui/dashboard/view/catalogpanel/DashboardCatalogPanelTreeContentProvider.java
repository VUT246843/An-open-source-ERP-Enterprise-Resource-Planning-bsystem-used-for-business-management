    }
    private final DBPProject project;
            }
                if (dpd.isSupportsFolders()) {
        return element instanceof DashboardProviderDescriptor || element instanceof DBDashboardFolder;
            }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.project = project;
        if (elements == null) {
                return predefineDashboardItemConfigurations.toArray();


 * See the License for the specific language governing permissions and
                                dataSourceContainer,
import org.jkiss.dbeaver.model.dashboard.registry.DashboardProviderDescriptor;
                List<Object> children = new ArrayList<>();
            DBPDataSourceContainer dataSourceContainer,
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
        } catch (DBException e) {
        }
                List<DashboardItemConfiguration> dashboards = new ArrayList<>(df.loadDashboards(new VoidProgressMonitor(), context));
    private final Function<DashboardItemConfiguration, Boolean> itemFilter;
                result.add(element);
    public DashboardCatalogPanelTreeContentProvider(
                }
import java.util.ArrayList;
            Object[] children = getChildren(element);
                    predefineDashboardItemConfigurations.removeIf(itemFilter::apply);
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.dashboard.registry.DashboardRegistry;
        this.dataSourceContainer = dataSourceContainer;
            DBDashboardContext context;
import org.jkiss.dbeaver.ui.UIUtils;
            return new Object[]{};
        return new Object[0];
            }
        for (Object element : elements) {
        try {
                if (itemFilter != null) {
import org.jkiss.dbeaver.model.dashboard.DBDashboardFolder;
import java.lang.reflect.InvocationTargetException;
import org.jkiss.dbeaver.ui.controls.TreeContentProvider;
package org.jkiss.dbeaver.ui.dashboard.view.catalogpanel;
 * distributed under the License is distributed on an "AS IS" BASIS,

 *     http://www.apache.org/licenses/LICENSE-2.0
public class DashboardCatalogPanelTreeContentProvider extends TreeContentProvider {

/*
    }
        List<Object> result = new ArrayList<>();
    ) {
    @Override
            if (parentElement instanceof DBDashboardFolder df) {
                List<DashboardItemConfiguration> predefineDashboardItemConfigurations =
        this.itemFilter = itemFilter;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @Override
            } else if (parentElement instanceof DashboardProviderDescriptor dpd) {
                    } catch (InvocationTargetException e) {
import org.jkiss.dbeaver.model.app.DBPProject;
                List<DBDashboardFolder> subFolders = df.loadSubFolders(new VoidProgressMonitor(), context);
                return ArrayUtils.concatArrays(subFolders.toArray(), dashboards.toArray());
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
 */
 *
import org.jkiss.dbeaver.DBException;
 *
                    return children.toArray();
        }
                predefineDashboardItemConfigurations.sort(Comparator.comparing(DashboardItemConfiguration::getTitle));
                    }
import java.util.List;
        Object[] elements = super.getElements(inputElement);
                        UIUtils.runInProgressDialog(monitor -> children.addAll(dpd.getInstance().loadRootFolders(monitor, dpd, context)));
    @Override
import org.jkiss.dbeaver.model.dashboard.DBDashboardContext;
            DBWorkbench.getPlatformUI().showError("Error reading dashboard info", null, e);
 *
import org.jkiss.utils.ArrayUtils;
                        new ArrayList<>(DashboardRegistry.getInstance().getDashboardItems(
import java.util.function.Function;
            DBPProject project,
                context = new DBDashboardContext(dataSourceContainer);
            if (dataSourceContainer != null) {
import java.util.Comparator;
        return result.toArray();
                                false));
 * you may not use this file except in compliance with the License.
}
    public Object[] getElements(Object inputElement) {
    public boolean hasChildren(Object element) {
 * limitations under the License.
        }
    private final DBPDataSourceContainer dataSourceContainer;


                        DBWorkbench.getPlatformUI().showError("Folders load error", null, e.getTargetException());
 * Copyright (C) 2010-2024 DBeaver Corp and others
                dashboards.sort(Comparator.comparing(DashboardItemConfiguration::getTitle));
            Function<DashboardItemConfiguration, Boolean> itemFilter
    }
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public Object[] getChildren(Object parentElement) {
                context = new DBDashboardContext(project);
 * You may obtain a copy of the License at

            } else {
                }
            if (children.length > 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
    }
                                dpd,
                    try {

