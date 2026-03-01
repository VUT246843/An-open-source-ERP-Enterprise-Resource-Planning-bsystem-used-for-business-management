        super.setControl(newControl);
                    DBNNode node = DBWorkbench.getPlatform().getNavigatorModel().getNodeByPath(monitor, dsNode.getOwnerProject(), nodePath);

                try {
                } catch (DBException e) {
    public boolean performAction() {
                        continue;

    }
    @Override
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Control;
                    } else {
public abstract class AbstractSearchPage extends DialogPage implements ISearchPage {
    }
                    }

    }
    }
    @Override
/*
    protected void setControl(Control newControl) {
import java.util.*;

    public void setContainer(ISearchPageContainer container) {
        Dialog.applyDialogFont(newControl.getParent());
import org.jkiss.utils.CommonUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,
        try {
            Set<DBNDataSource> brokenDataSources = new HashSet<>();

            }
import org.eclipse.swt.widgets.Composite;
    protected ISearchPageContainer container;
            updateEnablement();
        final List<DBNNode> result = new ArrayList<>();
package org.jkiss.dbeaver.ui.search;

                }

    public void setVisible(boolean visible)
            // Find all nodes
    public void createControl(Composite parent) {
                    DBNDataSource dsNode = DBWorkbench.getPlatform().getNavigatorModel().getDataSourceByPath(project, nodePath);
    protected AbstractSearchPage(String title) {
    protected abstract void saveState(DBPPreferenceStore store);
            StringTokenizer st = new StringTokenizer(sources, "|"); //$NON-NLS-1$

        if (!CommonUtils.isEmpty(sources)) {
            NewSearchUI.runQueryInBackground(createQuery());
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        return result;
            // Keep broken datasources to make connect attempt only once
                    if (dsNode == null || brokenDataSources.contains(dsNode)) {
    }

            DBWorkbench.getPlatformUI().showError("Search error", "Can't perform search", e);
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.Log;
                    log.error(e);

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
        this.container = container;
import org.eclipse.jface.dialogs.DialogPage;
                    if (node != null) {
    protected abstract void loadState(DBPPreferenceStore store);
    @Override
 *
import org.jkiss.dbeaver.runtime.DBWorkbench;
import org.eclipse.search.ui.ISearchPageContainer;
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                        brokenDataSources.add(dsNode);
import org.jkiss.dbeaver.model.app.DBPProject;
        return true;
        }
    }
 * See the License for the specific language governing permissions and
            while (st.hasMoreTokens()) {
 *

import org.jkiss.dbeaver.model.navigator.DBNDataSource;
    protected abstract void updateEnablement();
    }

 * DBeaver - Universal Database Manager
 *
        if (visible) {
                        result.add(node);
    {
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.ISearchPage;

    @Override
                String nodePath = st.nextToken();
    protected abstract ISearchQuery createQuery() throws DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0

        super(title);
        loadState(DBWorkbench.getPlatform().getPreferenceStore());
        }
import org.jkiss.dbeaver.DBException;


    protected List<DBNNode> loadTreeState(DBRProgressMonitor monitor, DBPProject project, String sources) {
 * Unless required by applicable law or agreed to in writing, software

        super.setVisible(visible);
 * limitations under the License.
 * you may not use this file except in compliance with the License.
            saveState(DBWorkbench.getPlatform().getPreferenceStore());
    static final protected Log log = Log.getLog(AbstractSearchPage.class);

 */
import org.eclipse.search.ui.NewSearchUI;
import org.jkiss.dbeaver.model.navigator.DBNNode;
    @Override
import org.eclipse.jface.dialogs.Dialog;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        } catch (DBException e) {
                    }

            return false;
