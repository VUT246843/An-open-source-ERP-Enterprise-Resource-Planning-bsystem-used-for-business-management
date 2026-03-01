            },
            return new ProgressVisualizer<List<MySQLGrant>>() {
        @Override
{
 * Copyright (C) 2010-2025 DBeaver Corp and others
            };
                        return getDatabaseObject().getGrants(monitor);
import org.jkiss.dbeaver.model.runtime.load.DatabaseLoadService;

 * See the License for the specific language governing permissions and
            getPageControl().setFocus();
 * DBeaver - Universal Database Manager

 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.swt.SWT;
 */
    protected abstract UserPageControl getPageControl();
    }
    {
                public void completeLoading(List<MySQLGrant> grants) {
            getPageControl().createGrantsLoadVisualizer())
 *
import org.jkiss.dbeaver.DBException;
                    }
 * MySQLUserEditorAbstract
    protected class UserPageControl extends ObjectEditorPageControl {
 *
        public void fillCustomActions(IContributionManager contributionManager) {

            new DatabaseLoadService<List<MySQLGrant>>(MySQLUIMessages.editors_user_editor_abstract_load_grants, getDatabaseObject().getDataSource()) {

 * distributed under the License is distributed on an "AS IS" BASIS,
        public ProgressVisualizer<List<MySQLGrant>> createGrantsLoadVisualizer() {
                public java.util.List<MySQLGrant> evaluate(@NotNull DBRProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
    void loadGrants()
import org.jkiss.dbeaver.ext.mysql.model.MySQLUser;
import java.util.List;
/**

                    super.completeLoading(grants);

                        throw new InvocationTargetException(e);
package org.jkiss.dbeaver.ext.mysql.ui.editors;

    }
                    } catch (DBException e) {
            DatabaseEditorUtils.contributeStandardEditorActions(getSite(), contributionManager);
        }
                    try {
 * you may not use this file except in compliance with the License.
 *
            super.fillCustomActions(contributionManager);
                    processGrants(grants);
 * Unless required by applicable law or agreed to in writing, software
    }
import java.lang.reflect.InvocationTargetException;
/*
                @Override
public abstract class MySQLUserEditorAbstract extends AbstractDatabaseObjectEditor<MySQLUser>
import org.eclipse.jface.action.IContributionManager;


                }
    public void setFocus()

    {
        }
 * limitations under the License.
} * Licensed under the Apache License, Version 2.0 (the "License");
        if (getPageControl() != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
                }
            super(parent, SWT.NONE, MySQLUserEditorAbstract.this);
import org.jkiss.dbeaver.ui.LoadingJob;
    @Override
import org.jkiss.dbeaver.ui.editors.AbstractDatabaseObjectEditor;
import org.jkiss.dbeaver.ext.mysql.model.MySQLGrant;
import org.jkiss.dbeaver.ui.controls.ObjectEditorPageControl;
            .schedule();
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
        }
        public UserPageControl(Composite parent) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected abstract void processGrants(List<MySQLGrant> grants);
        }
                @Override
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Composite;
        LoadingJob.createService(
