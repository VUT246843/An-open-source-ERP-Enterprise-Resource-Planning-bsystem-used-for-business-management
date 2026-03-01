                    options.put(OracleServerSessionManager.OPTION_SHOW_INACTIVE, true);
                MessageDialog.CONFIRM,
                        }
            }
 *
                DBeaverIcons.getImageDescriptor(kill ? UIIcon.REJECT : UIIcon.SQL_DISCONNECT));
import org.eclipse.swt.widgets.Composite;

    @Override
                super.saveSettings(settings);
                0,
        disconnectSessionAction = new DisconnectSessionAction(false);
                            setToolTipText(OracleUIMessages.views_session_manager_viewer_show_background_tasks_tip);
                contributionManager.add(disconnectSessionAction);
            public Map<String, Object> getSessionOptions() {
                    new Action(OracleUIMessages.views_session_manager_viewer_show_background, Action.AS_CHECK_BOX) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override
    protected SessionManagerViewer createSessionViewer(DBCExecutionContext executionContext, Composite parent) {
                            refreshPart(OracleSessionEditor.this, true);

            super(
import org.eclipse.jface.action.Action;
/**
                contributionManager.add(killSessionAction);
 */
                }
            protected void onSessionSelect(DBAServerSession session)
import org.eclipse.jface.dialogs.IDialogSettings;
    private DisconnectSessionAction killSessionAction;
                super.onSessionSelect(session);
                Map<String, Object> options = new HashMap<>();
                kill ? OracleUIMessages.editors_oracle_session_editor_title_kill_session : OracleUIMessages.editors_oracle_session_editor_title_disconnect_session,
            protected void loadSettings(IDialogSettings settings) {
            if (dialog.open() == IDialogConstants.YES_ID) {
                }
import java.util.HashMap;
                            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION));
                    options.put(OracleServerSessionManager.PROP_KILL_SESSION, kill);

import org.jkiss.dbeaver.ui.ActionUtils;
                showInactive = CommonUtils.toBoolean(settings.get("showInactive"));
package org.jkiss.dbeaver.ext.oracle.ui.editors;

                new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL },
{
            private boolean showInactive;
                    options.put(OracleServerSessionManager.PROP_IMMEDIATE, true);
import org.jkiss.dbeaver.ui.DBeaverIcons;
import org.eclipse.jface.dialogs.MessageDialog;
                        }
        killSessionAction = new DisconnectSessionAction(true);
        {
                            refreshPart(OracleSessionEditor.this, true);
                    options.put(OracleServerSessionManager.OPTION_SHOW_BACKGROUND, true);
                        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
                    }, true));
                    new Action(OracleUIMessages.views_session_manager_viewer_show_inactive, Action.AS_CHECK_BOX) {
                disconnectSessionAction.setEnabled(session != null);

import org.jkiss.dbeaver.ext.oracle.model.session.OracleServerSessionManager;
import org.jkiss.dbeaver.ui.views.session.SessionManagerViewer;

            {
 *
            }
                contributionManager.add(ActionUtils.makeActionContribution(
                getSite().getShell(),
import org.jkiss.dbeaver.ui.views.session.AbstractSessionEditor;
                killSessionAction.setEnabled(session != null);
        private final boolean kill;
        public void run()
                        public void run() {
import org.jkiss.dbeaver.ext.oracle.model.session.OracleServerSession;
import org.eclipse.jface.action.IContributionManager;
                }
public class OracleSessionEditor extends AbstractSessionEditor

                        {
                getSessionsViewer().alterSessions(sessions, options);
            }
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSession;
                        }
            @Override
                            showInactive = isChecked();
            {
        @Override
    public void createEditorControl(Composite parent) {
 * You may obtain a copy of the License at
 *
            final List<DBAServerSession> sessions = getSessionsViewer().getSelectedSessions();
                            showBackground = isChecked();
 * OracleSessionEditor
        super.createEditorControl(parent);
import org.jkiss.dbeaver.ext.oracle.ui.internal.OracleUIMessages;
                if (showInactive) {
import java.util.List;
                if (kill) {
import org.eclipse.jface.action.Separator;
                return options;
            }

    }
    public OracleSessionEditor() {
                        @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            }

                }
                if (dialog.getToggleState()) {
    private class DisconnectSessionAction extends Action {
            protected void saveSettings(IDialogSettings settings) {
}
/*
                super.loadSettings(settings);

                            setChecked(showBackground);
                NLS.bind(OracleUIMessages.editors_oracle_session_editor_confirm_action, action.toLowerCase(), sessions),
                            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION));
            ConfirmationDialog dialog = new ConfirmationDialog(
            @Override
    }
 * See the License for the specific language governing permissions and
                settings.put("showInactive", showInactive);
            final String action = (kill ? OracleUIMessages.editors_oracle_session_editor_action_kill : OracleUIMessages.editors_oracle_session_editor_action_disconnect) + OracleUIMessages.editors_oracle_session_editor_action__session;
            this.kill = kill;
        }
                settings.put("showBackground", showBackground);
 * Unless required by applicable law or agreed to in writing, software

                if (showBackground) {
        {
            @Override
        return new SessionManagerViewer<OracleServerSession>(this, parent, new OracleServerSessionManager((OracleDataSource) executionContext.getDataSource())) {
                Map<String, Object> options = new HashMap<>();
                        public void run() {
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
            protected void contributeToToolbar(DBAServerSessionManager sessionManager, IContributionManager contributionManager)
                showBackground = CommonUtils.toBoolean(settings.get("showBackground"));
import java.util.Map;
import org.jkiss.dbeaver.ext.oracle.model.OracleDataSource;
                contributionManager.add(new Separator());
import org.jkiss.dbeaver.ui.UIIcon;
            @Override
    @Override

        }

import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
            private boolean showBackground;
                contributionManager.add(ActionUtils.makeActionContribution(
                false);
 * limitations under the License.
                null,
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;
                    }, true));
                OracleUIMessages.editors_oracle_session_editor_confirm_title,
            }
        };
import org.jkiss.utils.CommonUtils;
    private DisconnectSessionAction disconnectSessionAction;
                            setChecked(showInactive);
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.
                        {
                action,

import org.eclipse.osgi.util.NLS;
    }
    }
                        }
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;

        DisconnectSessionAction(boolean kill)
import org.eclipse.jface.dialogs.IDialogConstants;

 * Copyright (C) 2010-2025 DBeaver Corp and others
                            setToolTipText(OracleUIMessages.views_session_manager_viewer_show_inactive_sessions_tip);
