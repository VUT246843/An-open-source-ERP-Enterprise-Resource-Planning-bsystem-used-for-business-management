            }
                        }
            }
                        {
            @Override

    private KillSessionAction terminateQueryAction;
import org.jkiss.utils.CommonUtils;
{
            }
    }
/*
        public KillSessionAction(boolean killQuery)
                this.getText(),
import org.jkiss.dbeaver.ext.mysql.model.session.MySQLSessionManager;
import org.eclipse.jface.action.IContributionManager;
                hideSleeping = CommonUtils.toBoolean(settings.get("hideSleeping"));
import org.eclipse.swt.widgets.Composite;
 *
import org.eclipse.ui.ISharedImages;
            @Override

            }
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSession;
        {


                super.saveSettings(settings);
            protected void onSessionSelect(DBAServerSession session) {
    public void createEditorControl(Composite parent) {
import java.util.Map;
                getSessionsViewer().alterSessions(
            {
                    options.put(MySQLSessionManager.OPTION_SHOW_PERFORMANCE, true);
                        public void run() {
            protected void contributeToToolbar(DBAServerSessionManager sessionManager, IContributionManager contributionManager) {
                            @Override
import java.util.List;
                            setToolTipText(MySQLUIMessages.editors_session_hide_sleeping_tip);
 * Unless required by applicable law or agreed to in writing, software
public class MySQLSessionEditor extends AbstractSessionEditor
                    options.put(MySQLSessionManager.OPTION_HIDE_SLEEPING, true);
import java.util.HashMap;
            @Override
                                setChecked(showPerformance);
                    DBeaverIcons.getImageDescriptor(UIIcon.SQL_DISCONNECT));
                            public void run() {
                }
                contributionManager.add(terminateQueryAction);
                    contributionManager.add(ActionUtils.makeActionContribution(


    private KillSessionAction killSessionAction;
                contributionManager.add(new Separator());
                        new Action(MySQLUIMessages.editors_session_show_performance_text, Action.AS_CHECK_BOX) {
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2025 DBeaver Corp and others
                settings.put("hideSleeping", hideSleeping);
import org.jkiss.dbeaver.ui.views.session.AbstractSessionEditor;
package org.jkiss.dbeaver.ext.mysql.ui.editors;
 */
            protected void saveSettings(IDialogSettings settings) {
            public Map<String, Object> getSessionOptions() {
        }
                killQuery ?

                showPerformance = CommonUtils.toBoolean(settings.get("showPerformance"));
                        }
    }
            final List<DBAServerSession> sessions = getSessionsViewer().getSelectedSessions();

        }
        final MySQLDataSource dataSource = (MySQLDataSource) executionContext.getDataSource();
                                showPerformance = isChecked();
        private boolean killQuery;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            {

            private boolean hideSleeping;
                settings.put("showPerformance", showPerformance);

                                setToolTipText(MySQLUIMessages.editors_session_show_performance_tip);
                super.loadSettings(settings);
        @Override
                    sessions,
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.dialogs.IDialogSettings;
                        }, true));
import org.eclipse.osgi.util.NLS;

 * limitations under the License.
            if (sessions != null && UIUtils.confirmAction(getSite().getShell(),
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
                            }
                }
        super.createEditorControl(parent);

                }
import org.jkiss.dbeaver.model.admin.sessions.DBAServerSessionManager;
import org.jkiss.dbeaver.ext.mysql.model.MySQLDataSource;
            private boolean showPerformance;
import org.eclipse.jface.action.Separator;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.ActionUtils;
                if (hideSleeping) {
/**
import org.jkiss.dbeaver.ui.UIIcon;
                            setChecked(hideSleeping);

 */

 * you may not use this file except in compliance with the License.
                    new Action(MySQLUIMessages.editors_session_hide_sleeping_text, Action.AS_CHECK_BOX) {
    @Override
}import org.jkiss.dbeaver.ui.views.session.SessionManagerViewer;
        killSessionAction = new KillSessionAction(false);
                contributionManager.add(ActionUtils.makeActionContribution(
                            refreshPart(MySQLSessionEditor.this, true);
 * See the License for the specific language governing permissions and

    private class KillSessionAction extends Action {
import java.util.Collections;
        public void run()
                        @Override
                Map<String, Object> options = new HashMap<>();
                return options;
    }
                if (showPerformance) {
 * MySQLSessionEditor
                            }
            super(
 * distributed under the License is distributed on an "AS IS" BASIS,
    protected SessionManagerViewer createSessionViewer(DBCExecutionContext executionContext, Composite parent) {
            this.killQuery = killQuery;
                killQuery ? MySQLUIMessages.editors_session_editor_action_terminate_Query : MySQLUIMessages.editors_session_editor_action_kill_Session,
            @Override
 * DBeaver - Universal Database Manager
                            setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.HIDE_ALL_DETAILS));

        };
                killSessionAction.setEnabled(session != null);


                                setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.SHOW_ALL_DETAILS));
import org.jkiss.dbeaver.ui.DBeaverIcons;
                super.onSessionSelect(session);
        return new SessionManagerViewer<>(this, parent, new MySQLSessionManager(dataSource)) {
        {
                terminateQueryAction.setEnabled(session != null && !CommonUtils.isEmpty(session.getActiveQuery()));
    @Override
 *
                contributionManager.add(killSessionAction);
                            hideSleeping = isChecked();
            }
                NLS.bind(MySQLUIMessages.editors_session_editor_confirm, getText(), sessions)))
        terminateQueryAction = new KillSessionAction(true);
                contributionManager.add(new Separator());
            }
 *
            protected void loadSettings(IDialogSettings settings) {
                if (dataSource.supportsSysSchema()) {
import org.jkiss.dbeaver.ext.mysql.ui.internal.MySQLUIMessages;
                    }, true));
            @Override
                    UIUtils.getShardImageDescriptor(ISharedImages.IMG_ELCL_STOP) :
                    Collections.singletonMap(MySQLSessionManager.PROP_KILL_QUERY, killQuery));
                                refreshPart(MySQLSessionEditor.this, true);
import org.eclipse.jface.action.Action;
 * Licensed under the Apache License, Version 2.0 (the "License");

    private static final Log log = Log.getLog(MySQLSessionEditor.class);
 * You may obtain a copy of the License at
