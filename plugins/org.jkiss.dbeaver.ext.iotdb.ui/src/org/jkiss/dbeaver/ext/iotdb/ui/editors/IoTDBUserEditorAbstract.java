            DatabaseEditorUtils.contributeStandardEditorActions(getSite(), contributionManager);
 * distributed under the License is distributed on an "AS IS" BASIS,



 * You may obtain a copy of the License at
        }
                public void completeLoading(List<IoTDBGrant> grants) {
            };
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBRelationalUser;
                    } catch (DBException e) {
    /**
 * See the License for the specific language governing permissions and
    @Override
import org.jkiss.dbeaver.ui.LoadingJob;

        }
import org.jkiss.dbeaver.DBException;
        }
                @Override
        if (getPageControl() != null) {
import org.jkiss.dbeaver.ext.iotdb.model.IoTDBGrant;
 * DBeaver - Universal Database Manager
    }
import org.jkiss.dbeaver.ui.editors.AbstractDatabaseObjectEditor;
import java.util.List;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return new ProgressVisualizer<List<IoTDBGrant>>() {
import org.jkiss.dbeaver.ui.controls.ObjectEditorPageControl;
 * you may not use this file except in compliance with the License.
        @Override
public abstract class IoTDBUserEditorAbstract extends AbstractDatabaseObjectEditor<IoTDBRelationalUser> {
    protected abstract UserPageControl getPageControl();
    }
 *
package org.jkiss.dbeaver.ext.iotdb.ui.editors;
            new DatabaseLoadService<List<IoTDBGrant>>(IoTDBUiMessages.editors_user_editor_abstract_load_grants,
                }

                    processGrants(grants);
/*
            super(parent, SWT.NONE, IoTDBUserEditorAbstract.this);
                public List<IoTDBGrant> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
    void loadGrants() {
                    super.completeLoading(grants);
import org.eclipse.swt.SWT;
            .schedule();
     */
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        public ProgressVisualizer<List<IoTDBGrant>> createGrantsLoadVisualizer() {
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
        }

import org.eclipse.jface.action.IContributionManager;

 * Unless required by applicable law or agreed to in writing, software
     * Load all global and schema privileges of current user
                        throw new InvocationTargetException(e);
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;
}
                    getDatabaseObject().getDataSource()) {
            getPageControl().setFocus();
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            super.fillCustomActions(contributionManager);
import org.eclipse.swt.widgets.Composite;
    protected class UserPageControl extends ObjectEditorPageControl {
                @Override
    }

                    try {
 *     http://www.apache.org/licenses/LICENSE-2.0
                        return getDatabaseObject().getGrants(monitor);
            getPageControl().createGrantsLoadVisualizer())

    public void setFocus() {
            },
 *
import org.jkiss.dbeaver.ext.iotdb.ui.internal.IoTDBUiMessages;
        public void fillCustomActions(IContributionManager contributionManager) {
                }
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public UserPageControl(Composite parent) {
                    }
import java.lang.reflect.InvocationTargetException;
 * limitations under the License.
    protected abstract void processGrants(List<IoTDBGrant> grants);
import org.jkiss.code.NotNull;
        LoadingJob.createService(

