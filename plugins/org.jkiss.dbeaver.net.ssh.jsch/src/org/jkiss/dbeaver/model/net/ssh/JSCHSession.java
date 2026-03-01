import org.jkiss.code.NotNull;
            channel.put(src, dst, new SftpProgressMonitorAdapter(monitor));
import org.eclipse.osgi.util.NLS;
            throw new IOException("Error opening SFTP channel", e);
 * You may obtain a copy of the License at
    private record SftpProgressMonitorAdapter(@NotNull DBRProgressMonitor delegate) implements SftpProgressMonitor {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and

 *
    public void connect(
    ) {

    public String getClientVersion() {
    }
import java.io.OutputStream;


import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.
    public void disconnect(
        try {
 * DBeaver - Universal Database Manager

            channel = (ChannelSftp) session.openChannel("sftp");
            session.delPortForwardingL(configuration.localHost(), configuration.localPort());
 */
    ) throws DBException {
        return channel;
        @NotNull String dst,
public class JSCHSession extends AbstractSession {
        @NotNull InputStream src,
                configuration.remoteHost(),
        session.disconnect();
        try {
        final ChannelSftp channel = openSftpChannel();
        session = controller.createNewSession(monitor, configuration, destination);
        return session.getClientVersion();
        @Override
        this.controller = controller;
            channel.connect();
    private final JSCHSessionController controller;
    }
            channel.disconnect();
/*
    @NotNull
import com.jcraft.jsch.*;

        public boolean count(long count) {
            return !delegate.isCanceled();
        }
        @NotNull DBWHandlerConfiguration configuration,

    private ChannelSftp openSftpChannel() throws IOException {
                delegate.beginTask(NLS.bind("Download file ''{0}'' -> ''{1}''", src, dst), (int) max);
        } catch (JSchException e) {
        @NotNull SSHHostConfiguration destination,
                configuration.localHost(),
        } catch (JSchException e) {
}
        }
            return;
        } finally {
    @NotNull
    ) throws IOException {


                port,

        final ChannelSftp channel;
    }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
    }
    @Override
    }
    }
            channel.disconnect();
        } catch (JSchException e) {

    @Override
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;

        @NotNull DBRProgressMonitor monitor
    @Override

                configuration.localPort(),
    public void getFile(
 *
import java.io.InputStream;
        @NotNull DBRProgressMonitor monitor,
    }
    }
            throw new IOException("Error uploading file through SFTP channel", e);
            throw new DBException("Unable to remove port forwarding", e);
    @Override
    ) throws IOException {
            throw new DBException("Unable to set up port forwarding", e);
    @Override
        }
    @NotNull
        try {
        if (!session.isConnected()) {
            throw new IOException("Error downloading file through SFTP channel", e);
        try {
            }
            );
                configuration.remotePort()
    public String getServerVersion() {
        try {
        }
    public void putFile(
    }
        }
 * limitations under the License.
        @NotNull DBRProgressMonitor monitor

    public void removePortForward(@NotNull SSHPortForwardConfiguration configuration) throws DBException {
 *
            delegate.worked((int) count);
        session = null;
    public SSHPortForwardConfiguration setupPortForward(@NotNull SSHPortForwardConfiguration configuration) throws DBException {
        }
import org.jkiss.dbeaver.model.net.DBWHandlerConfiguration;
            if (op == PUT) {

    @NotNull
            return new SSHPortForwardConfiguration(
 *     http://www.apache.org/licenses/LICENSE-2.0

        }
 * Licensed under the Apache License, Version 2.0 (the "License");
            channel.get(src, dst, new SftpProgressMonitorAdapter(monitor));
package org.jkiss.dbeaver.model.net.ssh;
                configuration.remoteHost(),
        @Override
        return session.getServerVersion();
                configuration.remotePort()
                configuration.localHost(),
            delegate.done();
        public void init(int op, String src, String dst, long max) {
        }
        long timeout
        } catch (SftpException e) {
            );
    public JSCHSession(@NotNull JSCHSessionController controller) {
        @NotNull DBWHandlerConfiguration configuration
        @NotNull String src,
    private Session session;
        } catch (SftpException e) {
            final int port = session.setPortForwardingL(
        // FIXME: timeout is not used

        @NotNull OutputStream dst,
        final ChannelSftp channel = openSftpChannel();

 * Copyright (C) 2010-2024 DBeaver Corp and others

                delegate.beginTask(NLS.bind("Upload file ''{0}'' -> ''{1}''", src, dst), (int) max);
    @Override
import org.jkiss.dbeaver.model.net.ssh.config.SSHPortForwardConfiguration;
import java.io.IOException;

        }
        @Override

            // The connection might already have been closed due to a network error
 * Unless required by applicable law or agreed to in writing, software
        } finally {
            } else {

    }
    @Override
        public void end() {
        @NotNull DBRProgressMonitor monitor,
