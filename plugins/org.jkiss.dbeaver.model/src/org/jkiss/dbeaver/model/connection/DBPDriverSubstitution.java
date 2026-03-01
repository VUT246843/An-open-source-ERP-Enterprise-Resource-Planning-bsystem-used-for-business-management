import java.sql.Driver;
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
        @NotNull DBPConnectionConfiguration configuration);
        @NotNull DBPConnectionConfiguration configuration);
 * DBeaver - Universal Database Manager
    @Nullable

 *

public interface DBPDriverSubstitution {
    @Nullable
        @NotNull DBPDataSourceContainer container,
    Properties getConnectionProperties(
    boolean isAuthModelSupported(@NotNull DBPAuthModelDescriptor descriptor);
import java.util.Properties;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    String getConnectionURL(
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");
/*

    boolean isNetworkHandlerSupported(@NotNull DBWHandlerDescriptor descriptor);
package org.jkiss.dbeaver.model.connection;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    @NotNull
}
import org.jkiss.dbeaver.model.net.DBWHandlerDescriptor;

 * limitations under the License.
 * You may obtain a copy of the License at
 */

    Driver getSubstitutingDriverInstance(@NotNull DBRProgressMonitor monitor);
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBPDataSourceContainer container,
 *
        @NotNull DBRProgressMonitor monitor,
 *     http://www.apache.org/licenses/LICENSE-2.0

