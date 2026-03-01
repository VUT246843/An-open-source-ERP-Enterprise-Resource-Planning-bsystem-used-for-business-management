import org.jkiss.dbeaver.ui.DBeaverIcons;
public class AltibaseSessionEditor extends AbstractSessionEditor {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0

            ConfirmationDialog dialog = new ConfirmationDialog(
    protected SessionManagerViewer createSessionViewer(DBCExecutionContext executionContext, Composite parent) {
 * distributed under the License is distributed on an "AS IS" BASIS,

                contributionManager.add(new Separator());
import org.eclipse.osgi.util.NLS;
/*
    public AltibaseSessionEditor() {
    }
    public void createEditorControl(Composite parent) {
import org.eclipse.jface.dialogs.MessageDialog;
            super(AltibaseUIMessages.editors_altibase_session_editor_action_disconnect_session, 
import org.eclipse.jface.action.Action;
                getSessionsViewer().alterSessions(sessions, options);
                    MessageDialog.CONFIRM,
                    action,
import java.util.Map;

    private DisconnectSessionAction disconnectSessionAction;
 * You may obtain a copy of the License at
        DisconnectSessionAction() {
            if (dialog.open() == IDialogConstants.YES_ID) {
import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;

            protected void onSessionSelect(DBAServerSession session) {
import java.util.List;
import org.eclipse.swt.widgets.Composite;
 */
import org.jkiss.dbeaver.ext.altibase.ui.internal.AltibaseUIMessages;
import org.jkiss.dbeaver.ext.altibase.model.session.AltibaseServerSession;
 * AltibaseSessionEditor

package org.jkiss.dbeaver.ext.altibase.ui.editors;
                 DBeaverIcons.getImageDescriptor(UIIcon.SQL_DISCONNECT));
        disconnectSessionAction = new DisconnectSessionAction();
        return new SessionManagerViewer<AltibaseServerSession>(this, parent, 
 * limitations under the License.
        super.createEditorControl(parent);
 *
            protected void contributeToToolbar(DBAServerSessionManager sessionManager, IContributionManager contributionManager) {
                    0,
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
}            @Override
                    false);
        }
import org.jkiss.dbeaver.ui.views.session.AbstractSessionEditor;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                Map<String, Object> options = new HashMap<>();
                    NLS.bind(AltibaseUIMessages.editors_altibase_session_editor_confirm_action, action.toLowerCase(), sessions),
import java.util.HashMap;
 *
 * See the License for the specific language governing permissions and
                new AltibaseServerSessionManager((AltibaseDataSource) executionContext.getDataSource())) {
                    null,
        public void run() {
            refreshPart(AltibaseSessionEditor.this, true);
import org.jkiss.dbeaver.ext.altibase.model.session.AltibaseServerSessionManager;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
                contributionManager.add(disconnectSessionAction);
                    null,
                super.onSessionSelect(session);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.views.session.SessionManagerViewer;
import org.jkiss.dbeaver.ext.altibase.model.AltibaseDataSource;

            }
import org.jkiss.dbeaver.ui.UIIcon;
import org.eclipse.jface.dialogs.IDialogConstants;
    }
 * you may not use this file except in compliance with the License.

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Override
 * Unless required by applicable law or agreed to in writing, software

                    getSite().getShell(),
            }
        };
            
            final List<DBAServerSession> sessions = getSessionsViewer().getSelectedSessions();

import org.eclipse.jface.action.Separator;
    }
            final String action = AltibaseUIMessages.editors_altibase_session_editor_action_disconnect_session;
/**
                    new String[] { IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL },
 *


import org.jkiss.dbeaver.model.admin.sessions.DBAServerSession;
            @Override
            
 */
import org.eclipse.jface.action.IContributionManager;
    }
        @Override
    private class DisconnectSessionAction extends Action {

            }
                disconnectSessionAction.setEnabled(session != null);
