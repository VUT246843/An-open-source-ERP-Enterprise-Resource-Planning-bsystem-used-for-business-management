 *
 */

 * Unless required by applicable law or agreed to in writing, software
     * @param src     input stream used for reading data from
    ) throws DBException, IOException;

    String getClientVersion();
     * @param monitor progress monitor which is used for tracking download progress
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
     */


    String getServerVersion();
     * @param dst     path to a remote file
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
import org.jkiss.dbeaver.DBException;
package org.jkiss.dbeaver.model.net.ssh;
 * You may obtain a copy of the License at
        @NotNull String dst,
import java.io.OutputStream;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *     http://www.apache.org/licenses/LICENSE-2.0
     *
    @NotNull
    ) throws DBException, IOException;
     * Downloads a file from the specified remote path.
public interface SSHSession {
 *
import java.io.InputStream;
        @NotNull InputStream src,
    /**
        @NotNull DBRProgressMonitor monitor
import org.jkiss.code.NotNull;
    void getFile(
     * @param dst     output stream used for writing data to
    void putFile(
    /**
 * limitations under the License.
    @NotNull
     * @param monitor progress monitor which is used for tracking upload progress
        @NotNull String src,
        @NotNull OutputStream dst,
}
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Uploads a file to the specified remote path.
     *
import java.io.IOException;
     */


        @NotNull DBRProgressMonitor monitor
 * DBeaver - Universal Database Manager
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param src     path to a remote file
