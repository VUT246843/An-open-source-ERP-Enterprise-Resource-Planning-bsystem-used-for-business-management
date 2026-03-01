
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.ext.exasol.ui.editors;
            }
    }
import org.jkiss.dbeaver.ui.views.session.SessionManagerViewer;
 * Copyright (C) 2016-2016 Karl Griesser (fullref@gmail.com)


        @SuppressWarnings("unchecked")
    public void createEditorControl(Composite parent) {
            }
            protected void onSessionSelect(DBAServerSession session) {
 *
            if (UIUtils.confirmAction(getSite().getShell(), "Confirm kill session",
import org.jkiss.utils.CommonUtils;
    private KillSessionAction killSessionAction = new KillSessionAction(false);

import org.eclipse.jface.action.IContributionManager;
                    DBeaverIcons.getImageDescriptor(UIIcon.SQL_DISCONNECT));
    }
                super.onSessionSelect(session);
}
        super.createEditorControl(parent);
        private boolean killQuery;
        return new SessionManagerViewer<ExasolServerSession>(this, parent, new ExasolServerSessionManager((ExasolDataSource) executionContext.getDataSource())) {

 *
    }
public class ExasolServerSessionEditor extends AbstractSessionEditor {
import org.jkiss.dbeaver.ui.views.session.AbstractSessionEditor;
 */

    @Override
            final List<DBAServerSession> sessions = getSessionsViewer().getSelectedSessions();
            final String action = ExasolMessages.editors_exasol_session_editor_action_kill;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
import org.jkiss.dbeaver.ext.exasol.model.app.ExasolServerSessionManager;

import org.eclipse.ui.ISharedImages;
            super(
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
        public KillSessionAction(boolean killQuery) {
                contributionManager.add(terminateQueryAction);
            @Override
import org.jkiss.dbeaver.ui.UIUtils;
        public void run() {
                getSessionsViewer().alterSessions(sessions, Collections.singletonMap(ExasolServerSessionManager.PROP_KILL_QUERY, killQuery));
            }
 * you may not use this file except in compliance with the License.
	@Override
import org.eclipse.jface.action.Action;
                contributionManager.add(killSessionAction);
        }

        killSessionAction = new KillSessionAction(false);
 *

                killQuery ? UIUtils.getShardImageDescriptor(ISharedImages.IMG_ELCL_STOP) :
import org.jkiss.dbeaver.ui.DBeaverIcons;
 * limitations under the License.
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.eclipse.osgi.util.NLS;
 * See the License for the specific language governing permissions and
/*
import org.jkiss.dbeaver.ui.UIIcon;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ext.exasol.model.app.ExasolServerSession;
            this.killQuery = killQuery;
        };

        terminateQueryAction = new KillSessionAction(true);
 * You may obtain a copy of the License at

 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected SessionManagerViewer createSessionViewer(DBCExecutionContext executionContext, Composite parent) {
 * DBeaver - Universal Database Manager
            @Override

    private class KillSessionAction extends Action {
                NLS.bind(ExasolMessages.editors_exasol_session_editor_confirm_action, action.toLowerCase(), sessions))) {
/**
import java.util.Collections;
		@Override
import org.jkiss.dbeaver.ext.exasol.model.ExasolDataSource;
import org.eclipse.swt.widgets.Composite;
                contributionManager.add(new Separator());
    private KillSessionAction terminateQueryAction = new KillSessionAction(true);
import org.eclipse.jface.action.Separator;
                killSessionAction.setEnabled(session != null);
                killQuery ? ExasolMessages.editors_exasol_session_editor_title_kill_session_statement : ExasolMessages.editors_exasol_session_editor_title_kill_session,
import java.util.List;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    @SuppressWarnings("rawtypes")
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSession;
        }
                terminateQueryAction.setEnabled(session != null && !CommonUtils.isEmpty(session.getActiveQuery()));

            protected void contributeToToolbar(DBAServerSessionManager sessionManager, IContributionManager contributionManager) {
 * @author Karl
