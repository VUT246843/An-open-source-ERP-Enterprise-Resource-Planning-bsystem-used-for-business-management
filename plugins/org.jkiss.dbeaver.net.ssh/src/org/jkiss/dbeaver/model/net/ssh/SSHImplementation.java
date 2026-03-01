 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull DBRProgressMonitor monitor
 * Unless required by applicable law or agreed to in writing, software
     *
        throws DBException, IOException;
    void getFile(
import java.io.IOException;
import java.io.OutputStream;

 *
 * DBeaver - Universal Database Manager
     * @param dst     output stream used for writing data to
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.model.net.ssh;
        throws DBException, IOException;
     * Downloads a file from the specified remote path.

     * @param src     path to a remote file
        throws DBException, IOException;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    DBPConnectionConfiguration initTunnel(DBRProgressMonitor monitor, DBWHandlerConfiguration configuration, DBPConnectionConfiguration connectionInfo)

     */
 */
 * SSH tunnel implementation
        @NotNull DBRProgressMonitor monitor
        @NotNull OutputStream dst,
     * @param monitor progress monitor which is used for tracking upload progress
 * you may not use this file except in compliance with the License.
 *
/**
    ) throws DBException, IOException;

import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 */
 * limitations under the License.

        @NotNull InputStream src,
}
    /**
        @NotNull String src,
     */


 * distributed under the License is distributed on an "AS IS" BASIS,
    String getServerVersion();
     * Uploads a file to the specified remote path.
     *
    void putFile(
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
import java.io.InputStream;
 * You may obtain a copy of the License at
    void invalidateTunnel(DBRProgressMonitor monitor)

 *
     * @param src     input stream used for reading data from
 * Licensed under the Apache License, Version 2.0 (the "License");

     * @param dst     path to a remote file
    /**
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
        @NotNull String dst,
 * See the License for the specific language governing permissions and
public interface SSHImplementation {
    void closeTunnel(DBRProgressMonitor monitor)
     * @param monitor progress monitor which is used for tracking download progress

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.code.NotNull;
    String getClientVersion();
    ) throws DBException, IOException;
