        this.modified = true;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (this.storage != null) {
    void handleContentReadingException(DBCException e) throws DBCException {
        if (!errorMessageIsShown && transactionManager != null && transactionManager.isAutoCommit()) {
    }
import org.jkiss.utils.CommonUtils;
        super(dataSource);

    }
    public long getContentLength() throws DBCException {

    public void resetContents()
            executionContext.setContextAttribute(ERROR_MESSAGE_PARAM_IS_SHOWN, Boolean.TRUE);
    private DBDContentStorage originalStorage;
        }
import org.jkiss.dbeaver.model.messages.ModelMessages;
        if (storage != null) {
 * See the License for the specific language governing permissions and

            executionContext.getContextAttribute(ERROR_MESSAGE_PARAM_IS_SHOWN));
    @Override
    {
        throws DBCException

            this.originalStorage.release();
import org.jkiss.dbeaver.model.data.DBDContentStorage;
 *
    @Override
/**
            this.originalStorage = null;
        if (this.originalStorage != null) {
    }
                return storage.getContentLength();

    {
import java.io.IOException;

package org.jkiss.dbeaver.model.impl.jdbc.data;

    public DBDValueCloneable cloneValue(DBRProgressMonitor monitor)
import org.jkiss.dbeaver.runtime.DBWorkbench;
            this.storage.release();

 *
        return true;
        if (storage != null) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.jkiss.dbeaver.model.exec.DBCTransactionManager;

 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
    {
        throw new DBCException(e.getMessage(), e);
            }
    public void release()
            }


}
        @NotNull DBRProgressMonitor monitor,
            this.modified = false;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.

            this.originalStorage = this.storage;
        JDBCContentLOB copy = createNewContent();
        boolean errorMessageIsShown = CommonUtils.toBoolean(
    protected DBDContentStorage storage;
    }
        return getLOBLength();
        }
    protected abstract long getLOBLength() throws DBCException;
/*
            if (this.originalStorage != null && this.originalStorage != this.storage) {
                this.storage.release();
            this.storage = this.originalStorage;
            }
    @Override
        DBCTransactionManager transactionManager = DBUtils.getTransactionManager(executionContext);
        }
    private static final String ERROR_MESSAGE_PARAM_IS_SHOWN = "lob-reading-error-message-is-shown";
                this.originalStorage.release();
import org.jkiss.code.NotNull;

 */
        @NotNull DBDContentStorage storage)
            this.storage = null;
            if (this.storage != null) {
    @Override
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.data.DBDContent;

                ModelMessages.jdbc_content_view_error_message_title,
        }
public abstract class JDBCContentLOB extends JDBCContentAbstract implements DBDContent {
 *
 * @author Serge Rider
                ModelMessages.jdbc_content_view_error_message_hint);
            try {
    protected JDBCContentLOB(DBCExecutionContext dataSource)
 *
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        if (this.storage != null) {
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.exec.DBCException;
 * Unless required by applicable law or agreed to in writing, software
                throw new DBCException("Error reading content length", e);
                copy.updateContents(monitor, storage.cloneStorage(monitor));
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBUtils;
        DBDContentStorage storage = getContents(monitor);

    {
import org.jkiss.dbeaver.model.data.DBDValueCloneable;
        if (this.originalStorage != null) {
 */
            }
                throw new DBCException("IO error while clone content", e);
        }
    protected abstract JDBCContentLOB createNewContent();
    @Override
    public boolean updateContents(
 * JDBCContentLOB
            } catch (IOException e) {
    }
            try {
    }
        this.storage = storage;
            } catch (IOException e) {
            DBWorkbench.getPlatformUI().showWarningMessageBox(
        return copy;
    {
