                    sessions,
 * limitations under the License.
            }
        {
public class SQLServerSessionEditor extends AbstractSessionEditor
                this.getText(),

        terminateQueryAction = new KillSessionAction();
                super.saveSettings(settings);
            protected void loadSettings(IDialogSettings settings) {
            {
    protected SessionManagerViewer createSessionViewer(DBCExecutionContext executionContext, Composite parent) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    null);
        KillSessionAction()
    public void createEditorControl(Composite parent) {
package org.jkiss.dbeaver.ext.mssql.ui.editors;
        super.createEditorControl(parent);
                            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION));
import org.jkiss.dbeaver.ui.ActionUtils;
import org.jkiss.dbeaver.ext.mssql.model.SQLServerDataSource;
                    options.put(SQLServerSessionManager.OPTION_SHOW_ONLY_CONNECTIONS, true);
        return new SessionManagerViewer<SQLServerSession>(this, parent, new SQLServerSessionManager((SQLServerDataSource) executionContext.getDataSource())) {

                terminateQueryAction.setEnabled(session != null);
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSession;
                            refreshPart(SQLServerSessionEditor.this, true);
                if (showOnlyConnections) {
import org.jkiss.dbeaver.ext.mssql.model.session.SQLServerSessionManager;
        };
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (sessions != null && UIUtils.confirmAction(
    }
                        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
                "Terminate",
                super.onSessionSelect(session);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                super.loadSettings(settings);

 * DBeaver - Universal Database Manager
        }
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.views.session.AbstractSessionEditor;

                UIUtils.getShardImageDescriptor(ISharedImages.IMG_ELCL_STOP));
 * See the License for the specific language governing permissions and
            @Override
                contributionManager.add(ActionUtils.makeActionContribution(
/**
import java.util.Map;
            }
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
/*
            protected void saveSettings(IDialogSettings settings) {
            {
            super(
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import java.util.HashMap;
                return options;
                contributionManager.add(new Separator());
}

                        public void run() {
    }
                        }
            }
 * SQLServerSessionEditor
                            showOnlyConnections = isChecked();
            final List<DBAServerSession> sessions = getSessionsViewer().getSelectedSessions();

                getSite().getShell(),
            @Override
    @Override
                Map<String, Object> options = new HashMap<>();
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;

                    }, true));
        {
                            setToolTipText("Show only physical connections");
import java.util.List;
                settings.put("showOnlyConnections", showOnlyConnections);
                            setChecked(showOnlyConnections);
import org.eclipse.jface.action.IContributionManager;
 *
    }
                contributionManager.add(terminateQueryAction);
 *
import org.jkiss.dbeaver.ui.views.session.SessionManagerViewer;
                        {
    private KillSessionAction terminateQueryAction;
                showOnlyConnections = CommonUtils.getBoolean(settings.get("showOnlyConnections"), true);
            }
                }
import org.eclipse.osgi.util.NLS;
            @Override
import org.eclipse.jface.dialogs.IDialogSettings;

import org.eclipse.jface.action.Action;
                getSessionsViewer().alterSessions(
        }

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.utils.CommonUtils;
{
        public void run()
import org.eclipse.jface.action.Separator;

import org.jkiss.dbeaver.ui.UIIcon;
                    new Action("Only connections", Action.AS_CHECK_BOX) {
            @Override
    private class KillSessionAction extends Action {

import org.jkiss.dbeaver.ext.mssql.model.session.SQLServerSession;
                contributionManager.add(new Separator());
import org.eclipse.swt.widgets.Composite;
 */
    @Override
            }
            public Map<String, Object> getSessionOptions() {
            protected void onSessionSelect(DBAServerSession session)
 *
 */
                NLS.bind("Terminate session {0}?", sessions)))
                        @Override
        @Override
            {
    private boolean showOnlyConnections = true;
import org.eclipse.ui.ISharedImages;
            @Override

import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.jkiss.dbeaver.ui.UIUtils;
            protected void contributeToToolbar(DBAServerSessionManager sessionManager, IContributionManager contributionManager)
            }

