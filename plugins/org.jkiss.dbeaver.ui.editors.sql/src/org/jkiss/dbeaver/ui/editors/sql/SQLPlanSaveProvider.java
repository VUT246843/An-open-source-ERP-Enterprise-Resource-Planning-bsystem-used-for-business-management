import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    @Override
    private static final String[] NAMES = {"DBeaver Plan File", "All files"}; //$NON-NLS-1$ //$NON-NLS-2$;

    }
            super(text, image);
import org.eclipse.jface.resource.ImageDescriptor;
        public boolean isEnabled() {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    protected void fillPlan(SQLQuery query, DBCPlan plan) {

 *
    private DBCQueryPlanner planner;
/*

 *
                    DBWorkbench.getPlatformUI().showError("Load plan", "Error loading plan", e);
            } else {
import org.jkiss.dbeaver.utils.GeneralUtils;


    }

                }

            return planner instanceof DBCQueryPlannerSerializable;
            contributionManager.add(saveAction);
            }

 * you may not use this file except in compliance with the License.
    
                saveAction.setEnabled(false);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public abstract class SQLPlanSaveProvider implements SQLPlanViewProvider {
import org.jkiss.dbeaver.model.exec.plan.DBCPlan;

 * See the License for the specific language governing permissions and
        SQLPlanSaveProvider provider;

}
import org.eclipse.jface.action.IContributionManager;

        public SaveAction(String text, ImageDescriptor image, SQLPlanSaveProvider provider) {
import java.io.Writer;
                    return;
        this.plan = plan;
                if (filePath == null) {
                }
 * You may obtain a copy of the License at
        this.query = query;
    public SQLPlanSaveProvider() {
    public static final String[] EXT = {"*.dbplan", "*"}; //$NON-NLS-1$ //$NON-NLS-2$;
    private Viewer viewer;





    protected abstract void showPlan(Viewer viewer, SQLQuery query, DBCPlan plan);
 * Unless required by applicable law or agreed to in writing, software
                } catch (IOException | InvocationTargetException e) {


 */

        @Override
        public void run() {
    private DBCPlan plan;
import org.jkiss.dbeaver.model.sql.SQLQuery;
 * limitations under the License.
        }
        this.planner = GeneralUtils.adapt(query.getDataSource(),DBCQueryPlanner.class);
        }
            if (planner instanceof DBCQueryPlannerSerializable) {
                final File filePath = DialogUtils.selectFileForSave(viewer.getControl().getShell(), "Save execution plan as", EXT, NAMES, null);
    private SaveAction saveAction;
        }
import org.eclipse.jface.action.Action;
    private SQLQuery query;
import org.eclipse.jface.viewers.Viewer;
        this.viewer = viewer;
            provider.doSave();
import java.io.File;
 * DBeaver - Universal Database Manager
import java.io.FileWriter;

    class SaveAction extends Action {

package org.jkiss.dbeaver.ui.editors.sql;
    }

    public void contributeActions(Viewer viewer, IContributionManager contributionManager, SQLQuery lastQuery, DBCPlan lastPlan) {

       saveAction = new SaveAction("Save plan", DBeaverIcons.getImageDescriptor(UIIcon.SAVE_AS), this);
import org.eclipse.jface.action.Separator;
    protected void doSave() {
            this.provider = provider;

        @Override
    }
                    ((DBCQueryPlannerSerializable) planner).serialize(w, plan);
 *     http://www.apache.org/licenses/LICENSE-2.0
        if (saveAction.isEnabled()) {
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
        }
        }
import java.lang.reflect.InvocationTargetException;
            contributionManager.add(new Separator());
                try (Writer w = new FileWriter(filePath)) {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlanner;
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.IOException;
        if (query != null) {
import org.jkiss.dbeaver.model.exec.plan.DBCQueryPlannerSerializable;

