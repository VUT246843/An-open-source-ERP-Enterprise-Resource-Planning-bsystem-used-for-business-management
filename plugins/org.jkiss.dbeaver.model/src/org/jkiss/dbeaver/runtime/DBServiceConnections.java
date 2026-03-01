import org.jkiss.code.Nullable;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 */
/*

import org.jkiss.code.NotNull;
    @Nullable
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
}
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.DBException;

 * You may obtain a copy of the License at

public interface DBServiceConnections {

import org.jkiss.dbeaver.model.runtime.DBRProgressListener;
 * limitations under the License.

 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.runtime;
        return null;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
/**
 * DBeaver - Universal Database Manager
 */
    void initConnection(DBRProgressMonitor monitor, DBPDataSourceContainer dataSourceContainer, DBRProgressListener onFinish) throws DBException;
 * Unless required by applicable law or agreed to in writing, software
    }
 * Connections Service
    default PasswordAuthentication getGlobalProxyConfiguration(@NotNull String requestingProtocol, @Nullable String requestingHost, int requestingPort) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.net.PasswordAuthentication;

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
