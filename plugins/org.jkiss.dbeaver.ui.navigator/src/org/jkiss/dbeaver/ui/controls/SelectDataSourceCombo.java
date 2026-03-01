            return;
        }
        super(comboGroup, SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER, new DatabaseLabelProviders.ConnectionLabelProvider());
 * Unless required by applicable law or agreed to in writing, software
                log.error(e);
import java.util.List;
 *

            } catch (Exception e) {
    }
                listener.run(dataSource);
                // ignore
 */
        listeners.add(listener);
        }
        synchronized (listeners) {
 * See the License for the specific language governing permissions and

 *
    }
    }
        return DBWorkbench.getPlatform().getWorkspace().getActiveProject();
import java.util.ArrayList;
        if (activeProject != null) {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            } catch (InterruptedException e) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
            return;
        onDataSourceChange(dataSource);
    protected void onDataSourceChange(DBPDataSourceContainer dataSource) {
        }
}

package org.jkiss.dbeaver.ui.controls;
        addItem(null);
            }
 * limitations under the License.
    @Override

            for (DBPDataSourceContainer ds : activeProject.getDataSourceRegistry().getDataSources()) {
    private final List<DBRRunnableParametrized<DBPDataSourceContainer>> listeners = new ArrayList<>();


        this.select(dataSource);
    private static final Log log = Log.getLog(SelectDataSourceCombo.class);
    protected void dropDown(boolean drop) {
        SelectDataSourceDialog dialog = new SelectDataSourceDialog(getShell(), getActiveProject(), getSelectedItem());
import java.lang.reflect.InvocationTargetException;
 * distributed under the License is distributed on an "AS IS" BASIS,

        if (dialog.open() == IDialogConstants.CANCEL_ID) {
    public void showConnectionSelector() {


 * Licensed under the Apache License, Version 2.0 (the "License");

    }
    public void addProjectDataSources() {
    protected DBPProject getActiveProject() {
import org.jkiss.dbeaver.model.runtime.DBRRunnableParametrized;
                break;
        DBPProject activeProject = getActiveProject();
    }
    }
        dialog.setModeless(true);
import org.jkiss.dbeaver.model.app.DBPProject;
        DBPDataSourceContainer dataSource = dialog.getDataSource();
    public void addSelectionListener(DBRRunnableParametrized<DBPDataSourceContainer> listener) {
        }
                addItem(ds);
    public SelectDataSourceCombo(Composite comboGroup) {
import org.jkiss.dbeaver.Log;

 * you may not use this file except in compliance with the License.

 * Copyright (C) 2010-2025 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        }
 * DBeaver - Universal Database Manager
            listenersCopy = new ArrayList<>(listeners);
    }
                log.error(e.getTargetException());
import org.eclipse.swt.SWT;
public class SelectDataSourceCombo extends CSmartSelector<DBPDataSourceContainer> {
import org.eclipse.jface.dialogs.IDialogConstants;
        for (DBRRunnableParametrized<DBPDataSourceContainer> listener : listenersCopy) {
        List<DBRRunnableParametrized<DBPDataSourceContainer>> listenersCopy;
import org.eclipse.swt.widgets.Composite;
        if (!drop) {
        showConnectionSelector();
            try {
            } catch (InvocationTargetException e) {
 * You may obtain a copy of the License at
            }
import org.jkiss.dbeaver.ui.navigator.dialogs.SelectDataSourceDialog;
/*
