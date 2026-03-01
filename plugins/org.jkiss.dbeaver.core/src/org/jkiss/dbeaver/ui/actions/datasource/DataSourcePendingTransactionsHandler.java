}import org.eclipse.core.commands.ExecutionEvent;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");

 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.ui.controls.txn.PendingTransactionsDialog;
 * DBeaver - Universal Database Manager

 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 *
 */
 *
{
import org.eclipse.ui.handlers.HandlerUtil;
package org.jkiss.dbeaver.ui.actions.datasource;
    }

/*
    public Object execute(ExecutionEvent event) throws ExecutionException
        final Shell activeShell = HandlerUtil.getActiveShell(event);
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
    {
import org.eclipse.core.commands.ExecutionException;
    @Override
public class DataSourcePendingTransactionsHandler extends AbstractDataSourceHandler
import org.eclipse.swt.widgets.Shell;
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
        return null;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        PendingTransactionsDialog.showDialog(activeShell);
