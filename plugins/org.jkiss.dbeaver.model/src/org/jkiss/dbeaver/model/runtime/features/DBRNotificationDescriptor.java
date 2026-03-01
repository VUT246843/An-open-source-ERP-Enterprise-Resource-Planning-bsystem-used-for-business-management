 * You may obtain a copy of the License at

 *
        this.action = DBRNotificationAction.NONE;

        this.action = action;
 * Unless required by applicable law or agreed to in writing, software
    public String getSoundFile() {
    private DBRNotificationAction action;
}    }
package org.jkiss.dbeaver.model.runtime.features;
 * limitations under the License.
        this.shellCommand = shellCommand;
 */


    }
    public DBRNotificationDescriptor() {
 * DBeaver - Universal Database Manager
        this.action = action;
 * DBeaver notification description
    }
    }
 */
        return action;

    public String getShellCommand() {
    }
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
    }
 * See the License for the specific language governing permissions and
        this.soundFile = soundFile;

    }
    public DBRNotificationAction getAction() {
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0



    public void setAction(@NotNull DBRNotificationAction action) {

 * Licensed under the Apache License, Version 2.0 (the "License");
    }
    private String soundFile;

    public DBRNotificationDescriptor(@NotNull DBRNotificationAction action, String soundFile, String shellCommand) {
    public void setSoundFile(String soundFile) {
        return soundFile;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        this.soundFile = soundFile;
    @NotNull

/**
 *
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
        return shellCommand;
/*
public class DBRNotificationDescriptor {
    public void setShellCommand(String shellCommand) {
        this.shellCommand = shellCommand;
    private String shellCommand;
