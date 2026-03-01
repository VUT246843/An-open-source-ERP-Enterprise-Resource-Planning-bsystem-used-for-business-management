

        super.createEditorControl(parent);
 * 
        public void run()
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.UIIcon;
import org.jkiss.dbeaver.ui.views.session.SessionManagerViewer;
 * Copyright (C) 2013-2015 Denis Forveille (titou10.titou10@gmail.com)
                getSessionsViewer().alterSessions(sessions, options);
            final String action = DB2Messages.editors_db2_application_editor_action_force;
 * You may obtain a copy of the License at
    }
        {
/*
import org.jkiss.dbeaver.ui.UIUtils;

            final List<DBAServerSession> sessions = getSessionsViewer().getSelectedSessions();
                NLS.bind(DB2Messages.editors_db2_application_editor_confirm_action, action.toLowerCase(), sessions))) {
    {
                Map<String, Object> options = new HashMap<>();
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
    }
import java.util.Map;
        forceApplicationAction = new ForceApplicationAction();
package org.jkiss.dbeaver.ext.db2.ui.editors;
            protected void onSessionSelect(DBAServerSession session)

            }
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;

import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.ui.DBeaverIcons;
 *
                super.onSessionSelect(session);
            if (UIUtils.confirmAction(getSite().getShell(), "Confirm force application",
import org.eclipse.osgi.util.NLS;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.action.IContributionManager;
 * DBeaver - Universal Database Manager
    @Override
    public void createEditorControl(Composite parent)
            {
        }
import org.jkiss.dbeaver.ext.db2.model.app.DB2ServerApplication;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.eclipse.swt.widgets.Composite;
            @SuppressWarnings("rawtypes")
        };
        {
            @Override
            protected void contributeToToolbar(DBAServerSessionManager sessionManager, IContributionManager contributionManager)
import org.jkiss.dbeaver.ext.db2.ui.internal.DB2Messages;
 *
        return new SessionManagerViewer<DB2ServerApplication>(this, parent, new DB2ServerApplicationManager((DB2DataSource) executionContext.getDataSource())) {

import org.jkiss.dbeaver.model.admin.sessions.DBAServerSession;


            }
    private class ForceApplicationAction extends Action {
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ext.db2.model.app.DB2ServerApplicationManager;

 * DB2 Application Editor
    }
 * limitations under the License.
                forceApplicationAction.setEnabled(session != null);
            {
import org.jkiss.dbeaver.ext.db2.model.DB2DataSource;
 *
        }
 * @author Denis Forveille
import org.jkiss.dbeaver.ui.views.session.AbstractSessionEditor;
            }
            super(DB2Messages.editors_db2_application_editor_title_force_application, DBeaverIcons.getImageDescriptor(UIIcon.REJECT));
/**
                contributionManager.add(forceApplicationAction);
    @Override
import java.util.List;
}        @Override
    protected SessionManagerViewer createSessionViewer(DBCExecutionContext executionContext, Composite parent) {
public class DB2ServerApplicationEditor extends AbstractSessionEditor {
import org.eclipse.jface.action.Action;
 * you may not use this file except in compliance with the License.
    private ForceApplicationAction forceApplicationAction;
        public ForceApplicationAction()
            @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
                contributionManager.add(new Separator());
import org.eclipse.jface.action.Separator;
import java.util.HashMap;
