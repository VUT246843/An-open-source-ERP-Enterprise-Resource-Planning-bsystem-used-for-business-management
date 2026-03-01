 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
            context = contextProvider.getExecutionContext();
    public Object execute(ExecutionEvent event) throws ExecutionException {
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        final Shell activeShell = HandlerUtil.getActiveShell(event);
package org.jkiss.dbeaver.ui.actions.datasource;
        return null;
    }
    @Override
/*
import org.jkiss.utils.CommonUtils;
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
import org.eclipse.ui.IEditorPart;
import org.jkiss.dbeaver.ui.actions.AbstractDataSourceHandler;
    // Command parameter
 * DBeaver - Universal Database Manager
        }
    public static final String PARAM_SHOW_ALL = "showAll";
        DBCExecutionContext context = null;
import org.eclipse.ui.handlers.HandlerUtil;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * distributed under the License is distributed on an "AS IS" BASIS,
        IEditorPart editor = HandlerUtil.getActiveEditor(event);
import org.jkiss.dbeaver.model.DBPContextProvider;
public class DataSourceTransactionLogHandler extends AbstractDataSourceHandler {
import org.eclipse.core.commands.ExecutionEvent;
        TransactionLogDialog.showDialog(activeShell, context, false, showAll);
        if (editor instanceof DBPContextProvider contextProvider) {
 * limitations under the License.

 *
import org.jkiss.dbeaver.ui.controls.txn.TransactionLogDialog;
}

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.widgets.Shell;
 * Unless required by applicable law or agreed to in writing, software
 */
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        boolean showAll = CommonUtils.toBoolean(event.getParameters().get(PARAM_SHOW_ALL));
 * Licensed under the Apache License, Version 2.0 (the "License");

