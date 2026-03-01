
                return options;
    
            }
        super.createEditorControl(parent);
            protected void contributeToToolbar(DBAServerSessionManager sessionManager, IContributionManager contributionManager)
}                terminateQueryAction.setEnabled(session != null);
            public Map<String, Object> getSessionOptions() {
import org.jkiss.dbeaver.ui.ActionUtils;
        ShowIdleAction() {
public class PostgreSessionEditor extends AbstractSessionEditor
        
import java.util.HashMap;
                contributionManager.add(new ShowIdleAction());
import java.util.Map;
 * Copyright (C) 2010-2024 DBeaver Corp and others
/**
import org.jkiss.utils.CommonUtils;
            final List<DBAServerSession> sessions = getSessionsViewer().getSelectedSessions();
    }
                settings.put(PostgreSessionManager.OPTION_SHOW_IDLE, showIdle);

    }
                contributionManager.add(new Separator());
                Map<String, Object> options = new HashMap<String,Object>();
 * Licensed under the Apache License, Version 2.0 (the "License");
            {
                "Show idle connections",

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            }
            protected void loadSettings(IDialogSettings settings) {
import org.jkiss.dbeaver.ui.views.session.AbstractSessionEditor;

import org.eclipse.jface.action.Action;
        };
import org.jkiss.dbeaver.model.DBUtils;
        {
            protected void onSessionSelect(DBAServerSession session) {
                "Cancel query",
            }
 * you may not use this file except in compliance with the License.
                    sessions,
 * DBeaver - Universal Database Manager
        }
 * Unless required by applicable law or agreed to in writing, software
    @Override
            setChecked(showIdle);
                contributionManager.add(new Separator());
    private class CancelQueryAction extends Action {
        @Override
    }
    }
            @Override
                contributionManager.add(terminateQueryAction);
        public void run() {
            {
import org.eclipse.jface.action.Separator;
                this.getText(),
            refreshPart(PostgreSessionEditor.this, true);
            
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * PostgreSessionEditor
        }
            
import org.jkiss.dbeaver.ui.views.session.SessionManagerViewer;
        terminateQueryAction = new KillSessionAction();
import org.jkiss.dbeaver.ext.postgresql.model.session.PostgreSession;
            if (sessions != null && UIUtils.confirmAction(
                super.loadSettings(settings);
    private class ShowIdleAction extends Action {

        CancelQueryAction() {
        }
 * limitations under the License.
    private CancelQueryAction cancelQueryAction;
        }
                getSite().getShell(),
            setToolTipText("Cancel query");
                "Terminate",
            
    protected SessionManagerViewer createSessionViewer(DBCExecutionContext executionContext, Composite parent) {
/*
        @Override
                cancelQueryAction.setEnabled(session != null);
 */
import org.eclipse.jface.dialogs.IDialogSettings;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.postgresql.model.session.PostgreSessionManager;
                UIUtils.getShardImageDescriptor(ISharedImages.IMG_ELCL_STOP));
            }
                contributionManager.add(cancelQueryAction);
import org.eclipse.ui.ISharedImages;
            @Override
            final List<DBAServerSession> sessions = getSessionsViewer().getSelectedSessions();
            @Override
import org.jkiss.dbeaver.ui.UIIcon;
            setToolTipText("Show idle connections");
import org.eclipse.osgi.util.NLS;
                
package org.jkiss.dbeaver.ext.postgresql.ui.editors;
            showIdle = isChecked();
import org.eclipse.jface.action.IContributionManager;
                super.onSessionSelect(session);
                    sessions,
        return new SessionManagerViewer<PostgreSession>(this, parent, sessionManager) {
            }

            {
                NLS.bind("Cancel query of session {0}?", sessions)))
                options.put(PostgreSessionManager.OPTION_QUERY_CANCEL, true);
                NLS.bind("Terminate session {0}?", sessions)))
                this.getText(),
                options.put(PostgreSessionManager.OPTION_SHOW_IDLE, showIdle);
            

 *
                getSessionsViewer().alterSessions(
                showIdle = CommonUtils.getBoolean(settings.get(PostgreSessionManager.OPTION_SHOW_IDLE), true);
import org.jkiss.dbeaver.ui.DBeaverIcons;
    private class KillSessionAction extends Action {
 *
        public void run()
                super.saveSettings(settings);
            }
        public void run() {
                    null);
                getSessionsViewer().alterSessions(
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
import org.eclipse.swt.widgets.Composite;
 *
                getSite().getShell(),
            super(
    @Override
                Map<String, Object> options = new HashMap<>();
            @Override
    private KillSessionAction terminateQueryAction;
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSession;
        {
            @Override

            super(
import org.jkiss.dbeaver.ui.UIUtils;
            super(
            protected void saveSettings(IDialogSettings settings) {
    }
{
                UIUtils.getShardImageDescriptor(ISharedImages.IMG_ELCL_STOP));
        @Override
 * See the License for the specific language governing permissions and
            }
        
                DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION));
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void createEditorControl(Composite parent) {
import java.util.List;
        KillSessionAction()
        cancelQueryAction = new CancelQueryAction();
            if (sessions != null && UIUtils.confirmAction(
 * distributed under the License is distributed on an "AS IS" BASIS,

        DBAServerSessionManager sessionManager = DBUtils.getAdapter(DBAServerSessionManager.class, executionContext.getDataSource());
 */
        }
    private boolean showIdle = true;
                    options);
        }
