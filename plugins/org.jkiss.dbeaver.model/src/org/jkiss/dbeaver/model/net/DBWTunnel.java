import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        throws DBException, IOException;

 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.code.Nullable;
    }

 *
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
    void addCloseListener(@NotNull Runnable listener);

 * Abstract tunnel
 * distributed under the License is distributed on an "AS IS" BASIS,

 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
/**
 */
import java.io.IOException;
 */


 * limitations under the License.
import org.jkiss.code.NotNull;
/*

    void closeTunnel(@NotNull DBRProgressMonitor monitor)
}
    @NotNull
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * See the License for the specific language governing permissions and
        CREDENTIALS,
public interface DBWTunnel extends DBWNetworkHandler, DBWForwarder {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        PASSWORD
 *
 *
    AuthCredentials getRequiredCredentials(@NotNull DBWHandlerConfiguration configuration) throws DBException;
 * You may obtain a copy of the License at
        NONE,
    enum AuthCredentials {
package org.jkiss.dbeaver.model.net;
    Object getImplementation();
