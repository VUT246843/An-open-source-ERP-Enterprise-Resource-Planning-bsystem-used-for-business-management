 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

package org.jkiss.dbeaver.runtime.ui;
    void connectDataSource(@NotNull DBPDataSourceContainer dataSourceContainer, DBRProgressListener onFinish);
    void closeActiveTransaction(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext context, boolean commitTxn);

import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
    void openConnectionEditor(@NotNull DBPDataSourceContainer dataSourceContainer, @Nullable String defaultPageName);
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager

/**
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 *
 * limitations under the License.

    void disconnectDataSource(@NotNull DBPDataSourceContainer dataSourceContainer);
import org.jkiss.code.Nullable;
 */
}

 */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *

    boolean checkAndCloseActiveTransaction(@NotNull DBCExecutionContext[] contexts);
    boolean confirmTransactionsClose(@NotNull DBCExecutionContext[] contexts);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface UIServiceConnections {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
import org.jkiss.code.NotNull;
 * Connections Service


 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
