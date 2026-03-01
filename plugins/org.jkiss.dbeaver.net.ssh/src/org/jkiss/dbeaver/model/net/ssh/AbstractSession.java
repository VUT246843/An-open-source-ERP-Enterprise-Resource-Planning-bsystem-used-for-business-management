package org.jkiss.dbeaver.model.net.ssh;
    ) throws DBException;
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 * limitations under the License.
        @NotNull DBRProgressMonitor monitor,
 *
}
 * See the License for the specific language governing permissions and
    public abstract void removePortForward(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    public abstract SSHPortForwardConfiguration setupPortForward(
    public abstract void connect(

    public abstract void disconnect(
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.net.ssh.config.SSHPortForwardConfiguration;

        @NotNull SSHPortForwardConfiguration configuration
 * Unless required by applicable law or agreed to in writing, software
        @NotNull DBWHandlerConfiguration configuration

    ) throws DBException;
 */
    ) throws DBException;
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
    ) throws DBException;
public abstract class AbstractSession implements SSHSession {
import org.jkiss.dbeaver.DBException;
 * You may obtain a copy of the License at

 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBRProgressMonitor monitor,
 *
 *
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
        @NotNull DBWHandlerConfiguration configuration,
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * you may not use this file except in compliance with the License.
        long timeout
        @NotNull SSHPortForwardConfiguration configuration
    @NotNull

        @NotNull SSHHostConfiguration destination,
