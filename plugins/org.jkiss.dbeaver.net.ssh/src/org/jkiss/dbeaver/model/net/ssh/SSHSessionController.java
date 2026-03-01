     */
 *   // create a tunnel with a jump host in between
}
        @NotNull SSHSession session,

     *
 * SSH session controller
 */
 * DBeaver - Universal Database Manager
    /**
 * </pre>
     * @param origin        origin session (optional). If specified, the session will be created as a nested
        @NotNull DBWHandlerConfiguration configuration,
 *
        @NotNull DBWHandlerConfiguration configuration,
 * You may obtain a copy of the License at
        @Nullable SSHSession origin,
        @NotNull DBRProgressMonitor monitor,
     */
 *   var host = new SSHHostConfiguration("user", "host", 22, ...);
 * <p><b>Usage Examples:</b>
 * <pre>
    void release(
import org.jkiss.dbeaver.model.exec.DBCInvalidatePhase;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *

 *
 * limitations under the License.
public interface SSHSessionController {
    ) throws DBException;
import org.jkiss.code.NotNull;
     * @throws DBException on any error
        long timeout
     * Acquires SSH session that is connected to the specified destination.
        @NotNull DBRProgressMonitor monitor,
 *
 *   // create a simple tunnel to the specified host
 *   var session = controller.acquireSession(monitor, configuration, host, null, null);
    /**

    SSHSession[] getSessions();
 *   var jumpSession = controller.acquireSession(monitor, configuration, jumpHost, null, null);
 *   var portForward = new SSHPortForwardConfiguration("localhost", 1234, "", 5678);
        @NotNull DBCInvalidatePhase phase,
        @NotNull DBRProgressMonitor monitor,
     * @param destination   destination host configuration
 * Unless required by applicable law or agreed to in writing, software
     *                      session of the origin session. This is useful for creating "jump" sessions.
 * @see SSHSession
 * See the License for the specific language governing permissions and
 */
     * @return SSH session
    @NotNull
     * @param monitor       progress monitor
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *   var destSession = controller.acquireSession(monitor, configuration, destHost, jumpSession, null);
/**
    @NotNull
 * you may not use this file except in compliance with the License.
     * @param configuration client configuration
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
 *
     * @param portForward   port forward configuration (optional). May not be required if the session is a nested session.
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
 * distributed under the License is distributed on an "AS IS" BASIS,
    void invalidate(
    SSHSession acquireSession(
 *   var host = new SSHHostConfiguration("user", "host", 22, ...);
    ) throws DBException;
     * Returns a list of shared sessions. A shared session is a session that can be used for multiple connections.
/*
 *
    DBPDataSourceContainer[] getDependentDataSources(@NotNull SSHSession session);
        long timeout

import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        @NotNull SSHSession session,
    ) throws DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.Nullable;
 *   var session = controller.acquireSession(monitor, configuration, host, null, null);
 *   var destHost = new SSHHostConfiguration("user", "host", 22, ...);
import org.jkiss.dbeaver.DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.net.ssh.config.SSHPortForwardConfiguration;
    @NotNull
 *   var jumpHost = new SSHHostConfiguration("user", "jump-host", 22, ...);
        @NotNull SSHHostConfiguration destination,
 *   SSHSessionController controller = ...
        @NotNull DBWHandlerConfiguration configuration,
 *
package org.jkiss.dbeaver.model.net.ssh;
 *   // create a tunnel with port forwarding (remote :5678 -> local :1234)
        @Nullable SSHPortForwardConfiguration portForward
