 *
            // Notifications disabled
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBeaverPreferences;

    private TrayIconHandler trayItem;
import org.jkiss.dbeaver.ui.UIUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
        } else {
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(DBeaverPreferences.AGENT_LONG_OPERATION_NOTIFY)) {
import org.eclipse.swt.widgets.Display;

        this.trayItem = new TrayIconHandler();
 *
 * Unless required by applicable law or agreed to in writing, software
/*
import org.jkiss.dbeaver.runtime.DBeaverNotifications;
import org.eclipse.core.runtime.IStatus;
    public long getLongOperationTimeout() {
                message,
 * UIServiceDriversImpl
/**
 * you may not use this file except in compliance with the License.
    public UIServiceSystemAgentImpl() {
    @Override


 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
            trayItem.notify(message, status);


    }
}
                "agent.notify",
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */


 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
    }
import org.jkiss.dbeaver.model.DBPMessageType;
package org.jkiss.dbeaver.ui.actions.datasource;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            DBeaverNotifications.showNotification(

        return DBWorkbench.getPlatform().getPreferenceStore().getLong(DBeaverPreferences.AGENT_LONG_OPERATION_TIMEOUT);
 * You may obtain a copy of the License at
 *
                status == IStatus.INFO ? DBPMessageType.INFORMATION :
                "Agent Notification",
    }
        if (TrayIconHandler.isSupported()) {
 * limitations under the License.
public class UIServiceSystemAgentImpl implements UIServiceSystemAgent {
            UIUtils.syncExec(() -> Display.getCurrent().beep());
    public void notifyAgent(String message, int status) {
                    (status == IStatus.ERROR ? DBPMessageType.ERROR : DBPMessageType.WARNING),
        }
                null);
import org.jkiss.dbeaver.ui.TrayIconHandler;
 */
            return;
import org.jkiss.dbeaver.runtime.ui.UIServiceSystemAgent;
