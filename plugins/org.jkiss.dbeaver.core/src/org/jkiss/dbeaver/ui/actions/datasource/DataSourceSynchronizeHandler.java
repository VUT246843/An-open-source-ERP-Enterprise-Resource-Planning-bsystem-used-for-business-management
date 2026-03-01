
import org.jkiss.dbeaver.DBException;
                            dataSourceProvider.syncLocalDataSource(monitor, dataSourceContainer);
import org.eclipse.core.runtime.IStatus;

        final var dataSourceProvider = (DBPDataSourceProviderSynchronizable) dataSourceContainer.getDriver().getDataSourceProvider();
            return null;
 *
                            DataSourceInvalidateHandler.invalidateDataSource(dataSourceContainer.getDataSource());
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.UIUtils;
                            dataSourceProvider.syncRemoteDataSource(monitor, dataSourceContainer);
                        }
                        if (reply[0] == REPLY_KEEP_LOCAL_CHANGES) {
                try {
            }
                    return Status.OK_STATUS;
 * you may not use this file except in compliance with the License.
        return null;
        if (context == null) {
import org.eclipse.core.runtime.Status;
                    if (localSynchronized != remoteSynchronized) {
import org.jkiss.dbeaver.ui.dialogs.MessageBoxBuilder;
/*
        new AbstractJob("Synchronize data source [" + dataSource.getName() + "]") {
import org.jkiss.dbeaver.model.runtime.AbstractJob;

 * Copyright (C) 2010-2025 DBeaver Corp and others

                    return GeneralUtils.makeExceptionStatus(e);
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
package org.jkiss.dbeaver.ui.actions.datasource;
        }.schedule();

 * See the License for the specific language governing permissions and
        final var dataSourceContainer = dataSource.getContainer();

    private static final Reply REPLY_KEEP_LOCAL_CHANGES = new Reply(CoreMessages.dialog_data_source_synchronize_reply_keep_local_label);
                            .showMessageBox());
                        } else if (reply[0] == REPLY_KEEP_REMOTE_CHANGES) {
                            .setReplies(REPLY_KEEP_LOCAL_CHANGES, REPLY_KEEP_REMOTE_CHANGES, Reply.CANCEL)
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBIcon;

 *
        }
                            .setPrimaryImage(DBIcon.STATUS_QUESTION)
import org.jkiss.dbeaver.model.DBPDataSourceProviderSynchronizable;
 * Unless required by applicable law or agreed to in writing, software
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.dialogs.Reply;
                        UIUtils.syncExec(() -> reply[0] = MessageBoxBuilder.builder()
            @NotNull


                        final Reply[] reply = new Reply[1];
 * limitations under the License.
                }
import org.jkiss.code.NotNull;
    private static final Reply REPLY_KEEP_REMOTE_CHANGES = new Reply(CoreMessages.dialog_data_source_synchronize_reply_keep_remote_label);

    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
import org.eclipse.core.commands.ExecutionException;
import org.jkiss.dbeaver.core.CoreMessages;
 *

    public Object execute(ExecutionEvent event) throws ExecutionException {
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.osgi.util.NLS;
                    final boolean remoteSynchronized = dataSourceProvider.isRemoteDataSourceSynchronized(monitor, dataSourceContainer);
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            @Override
                            .setDefaultReply(Reply.CANCEL)
public class DataSourceSynchronizeHandler extends AbstractDataSourceHandler {
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
                    final boolean localSynchronized = dataSourceProvider.isLocalDataSourceSynchronized(monitor, dataSourceContainer);
        final DBCExecutionContext context = getActiveExecutionContext(event, false);
                            .setTitle(CoreMessages.dialog_data_source_synchronize_title)
import org.jkiss.dbeaver.utils.GeneralUtils;
                            .setMessage(NLS.bind(CoreMessages.dialog_data_source_synchronize_message, dataSource.getName()))
                    }
 * DBeaver - Universal Database Manager
                } catch (DBException e) {

 */
        final var dataSource = context.getDataSource();
