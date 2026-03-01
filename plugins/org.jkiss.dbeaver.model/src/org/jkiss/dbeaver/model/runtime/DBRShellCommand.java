                this.waitProcessFinish == source.waitProcessFinish &&

    public String getCommand() {
 * You may obtain a copy of the License at
    public void setWaitProcessFinish(boolean waitProcessFinish) {
    public void setWaitProcessTimeoutMs(int waitProcessTimeoutMs) {
                CommonUtils.equalObjects(this.workingDirectory, source.workingDirectory);
    }
    }
    }
 * DBRShellCommand
        return terminateAtDisconnect;
    }
    }
        this.pauseAfterExecute = pauseAfterExecute;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public int getWaitProcessTimeoutMs() {
import java.util.List;
                this.enabled == source.enabled &&
    private boolean terminateAtDisconnect = true;
        this.command = command.command;
        return commandParams;
        this.waitProcessFinish = waitProcessFinish;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void setPauseAfterExecute(int pauseAfterExecute) {
    }
    public List<String> getCommandParams() {
        this.showProcessPanel = showProcessPanel;
/**
    public DBRShellCommand(DBRShellCommand command) {
        return waitProcessFinish;
    public boolean equals(Object obj) {





    public String getWorkingDirectory() {
    public boolean isEnabled() {
        this.enabled = command.enabled;
    @Override
        return

 *
        this.waitProcessTimeoutMs = command.waitProcessTimeoutMs;
            CommonUtils.equalObjects(this.commandParams, source.commandParams) &&
    private boolean enabled;
        this.terminateAtDisconnect = terminateAtDisconnect;

        this.enabled = enabled;

        this.waitProcessFinish = command.waitProcessFinish;
        return command;
    public boolean isShowProcessPanel() {
public class DBRShellCommand {
    public DBRShellCommand(List<String> commandParams) {
            CommonUtils.equalObjects(this.command, source.command) &&
    private int pauseAfterExecute = 0;
 *


    }
    private boolean showProcessPanel = true;
        return showProcessPanel;
    }
 * DBeaver - Universal Database Manager
    public DBRShellCommand(String command) {
    }
    public void setWorkingDirectory(String workingDirectory) {
    private List<String> commandParams;
        return pauseAfterExecute;
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    }
    }

    }
    }


 * Unless required by applicable law or agreed to in writing, software
        }
    private boolean waitProcessFinish;
    private String workingDirectory;
    public boolean isWaitProcessFinish() {
 */

                this.waitProcessTimeoutMs == source.waitProcessTimeoutMs &&
        return enabled;
    }
        this.waitProcessTimeoutMs = waitProcessTimeoutMs;
import org.jkiss.utils.CommonUtils;
    }
    public void setEnabled(boolean enabled) {
 *

}

        this.showProcessPanel = command.showProcessPanel;
        this.commandParams = commandParams;

                this.showProcessPanel == source.showProcessPanel &&
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
 * you may not use this file except in compliance with the License.
    public boolean isTerminateAtDisconnect() {

    public void setShowProcessPanel(boolean showProcessPanel) {
    }
    public static final int WAIT_PROCESS_TIMEOUT_MAX_SELECTION = 99999;
package org.jkiss.dbeaver.model.runtime;

        this.command = command;
    }
    private String command;
                this.terminateAtDisconnect == source.terminateAtDisconnect &&
        this.terminateAtDisconnect = command.terminateAtDisconnect;



        this.commandParams = commandParams;
    public void setCommand(String command) {
                this.pauseAfterExecute == source.pauseAfterExecute &&
    public int getPauseAfterExecute() {

            return false;

    public static final int WAIT_PROCESS_TIMEOUT_FOREVER = -1;
    public void setTerminateAtDisconnect(boolean terminateAtDisconnect) {
    }
        this.pauseAfterExecute = command.pauseAfterExecute;
    private int waitProcessTimeoutMs = WAIT_PROCESS_TIMEOUT_FOREVER;
    public void setCommandParams(List<String> commandParams) {
        this.workingDirectory = workingDirectory;

        this.workingDirectory = command.workingDirectory;

    }

    }
        this.command = command;
        return waitProcessTimeoutMs;
        return workingDirectory;
        if (!(obj instanceof DBRShellCommand source)) {
        this.commandParams = command.commandParams;
 * See the License for the specific language governing permissions and
