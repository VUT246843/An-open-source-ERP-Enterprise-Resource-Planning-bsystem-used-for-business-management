    @Override
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
import net.schmizz.sshj.common.KeyType;
 * You may obtain a copy of the License at
 *
        SSHUtils.forcePlatformReloadKnownHostsPreferences();
    }
 *
            }
        this.actualHostConfiguration = actualHostConfiguration;
 *
        } else {
 * DBeaver - Universal Database Manager
                return true;
        }
    public boolean verify(String hostname, int port, PublicKey key) {
import java.io.File;
        DBWorkbench.getPlatformUI().showWarningMessageBox(

 * limitations under the License.
            return true;
        boolean isConfirmed = DBWorkbench.getPlatformUI().confirmAction(SSHJUIMessages.verify_connection_confirmation_title,
        this.khFile.getParentFile().mkdirs();
        super.write(entry);
package org.jkiss.dbeaver.model.net.ssh;
    @Override
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (hostname.equals(DBConstants.HOST_LOCALHOST)) {
    public KnownHostsVerifier(@NotNull File khFile, @NotNull SSHHostConfiguration actualHostConfiguration) throws IOException {
 * distributed under the License is distributed on an "AS IS" BASIS,
        this.khFile.getParentFile().mkdirs();
        if (!isConfirmed) {
                KeyType.fromKey(key).toString(),

            return super.verify(hostname, port, key);
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            })

import org.jkiss.code.NotNull;

            SSHJUIMessages.warning_title,
            } catch (IOException e) {
public class KnownHostsVerifier extends OpenSSHKnownHosts {
    }
    public void write() throws IOException {
        } else {
        super(khFile);
        if (hostname.equals(DBConstants.HOST_LOCALHOST) || hostname.equals(DBConstants.HOST_LOCALHOST_IP)) {
    }
import java.util.List;
    protected boolean hostKeyUnverifiableAction(String hostname, PublicKey key) {
                this.entries().add(new HostEntry(null, hostname, KeyType.fromKey(key), key));
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                this.write();
                SecurityUtils.getFingerprint(key),

            return super.findExistingAlgorithms(actualHostConfiguration.hostname(), actualHostConfiguration.port());
    public void write(KnownHostEntry entry) throws IOException {
            return super.findExistingAlgorithms(hostname, port);
    }
        super.write();
        KeyType type = KeyType.fromKey(key);


    protected boolean hostKeyChangedAction(String hostname, PublicKey key) {

            NLS.bind(SSHJUIMessages.host_key_changed_warning_message, new String[]{
 * you may not use this file except in compliance with the License.
    private final SSHHostConfiguration actualHostConfiguration;
/*
 * See the License for the specific language governing permissions and

        SSHUtils.forcePlatformReloadKnownHostsPreferences();
        }
import java.io.IOException;
        } else {
                    NLS.bind(SSHJUIMessages.known_host_added_warning_message, hostname, type));

    }
            return false;
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.security.PublicKey;
            NLS.bind(SSHJUIMessages.verify_connection_confirmation_message, new String[]{hostname, type.toString(), SecurityUtils.getFingerprint(key)}), true);
                getFile().getAbsolutePath()

    @Override
}

    @Override
    @Override
import net.schmizz.sshj.common.SecurityUtils;
                throw new RuntimeException(e);
        );
                DBWorkbench.getPlatformUI().showWarningMessageBox(SSHJUIMessages.warning_title,
 * Unless required by applicable law or agreed to in writing, software
    }
import org.jkiss.dbeaver.model.DBConstants;
import net.schmizz.sshj.transport.verification.OpenSSHKnownHosts;
 */
    public List<String> findExistingAlgorithms(String hostname, int port) {
import org.eclipse.osgi.util.NLS;
            try {
        }
        return false;
