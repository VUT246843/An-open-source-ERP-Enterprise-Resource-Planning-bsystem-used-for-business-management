    @Override
 */
import org.jkiss.dbeaver.model.exec.DBCSession;
    @NotNull
    public void setUseNativeDateTimeFormat(boolean useNativeDateTimeFormat) {
import org.jkiss.dbeaver.model.data.DBDFormatSettingsExt;
            QMUtils.getDefaultHandler().handleSessionOpen(this);
 * limitations under the License.
    @Override
import org.jkiss.dbeaver.model.exec.DBCExecutionPurpose;
        this.useNativeDateTimeFormat = (byte) (useNativeDateTimeFormat ? 1 : 0);
    public AbstractSession(DBRProgressMonitor monitor, DBCExecutionPurpose purpose, String taskTitle) {


    public boolean isUseNativeDateTimeFormat() {
    private String taskTitle;
        }

import org.jkiss.dbeaver.model.impl.data.DefaultValueHandler;
    }
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Override
import org.jkiss.dbeaver.model.runtime.DBRBlockingObject;
    private boolean loggingEnabled = true;
    }
 * See the License for the specific language governing permissions and
    public DBRProgressMonitor getProgressMonitor() {

package org.jkiss.dbeaver.model.impl;
        return DefaultValueHandler.INSTANCE;
    private byte useNativeDateTimeFormat = -1;
    @NotNull
}
    public boolean isLoggingEnabled() {

    @Override
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public String getTaskTitle() {
    }
    @Override
            holdsBlock = true;


    }
import org.jkiss.dbeaver.model.data.DBDDataFormatterProfile;
        }

        if (holdsBlock) {
        return monitor;
        dataFormatterProfile = formatterProfile;
 * DBeaver - Universal Database Manager
    public DBDValueHandler getDefaultValueHandler() {
        return loggingEnabled;
        if (loggingEnabled) {
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/**
import org.jkiss.dbeaver.model.qm.QMUtils;
    public boolean isUseScientificNumericFormat() {
            return getDataSource().getContainer().getDataFormatterProfile();
            QMUtils.getDefaultHandler().handleSessionClose(this);
    @Override


    }
import org.jkiss.dbeaver.model.data.DBDValueHandler;
/*

    public void enableLogging(boolean enable) {
            monitor.endBlock();
    @Override

import org.jkiss.code.NotNull;
    @Override
    private boolean holdsBlock = false;
 * distributed under the License is distributed on an "AS IS" BASIS,
        }

 *
    public boolean isUseNativeNumericFormat() {
    }
        if (dataFormatterProfile == null) {
        }
 *
    public void setDataFormatterProfile(DBDDataFormatterProfile formatterProfile) {
        return getExecutionContext().getDataSource().getContainer().isUseNativeNumericFormat();
        return true;
    private DBRProgressMonitor monitor;
    @NotNull
 */
    private DBDDataFormatterProfile dataFormatterProfile;
        return dataFormatterProfile;
        if (useNativeDateTimeFormat == -1) {
    @NotNull
        if (taskTitle != null) {

    private DBCExecutionPurpose purpose;
    public void close() {
            useNativeDateTimeFormat = (byte) (getExecutionContext().getDataSource().getContainer().isUseNativeDateTimeFormat() ? 1 : 0);
        loggingEnabled = enable;

    @Override

 * Abstract execution context
    }
        return purpose;
    @Override
    }
            monitor.startBlock(this, taskTitle);

    }
        this.taskTitle = taskTitle;
            holdsBlock = false;
 *
        this.purpose = purpose;
    public DBDDataFormatterProfile getDataFormatterProfile() {
public abstract class AbstractSession implements DBCSession, DBDFormatSettingsExt, DBRBlockingObject {
    }

        return taskTitle;
    public boolean isConnected() {
    @Override
    public DBCExecutionPurpose getPurpose() {
        return getExecutionContext().getDataSource().getContainer().isUseScientificNumericFormat();
        if (loggingEnabled) {
 * You may obtain a copy of the License at
    }
        return useNativeDateTimeFormat == 1;
    @Override
        this.monitor = monitor;
    }


    }
        }
 * you may not use this file except in compliance with the License.
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
