    @NotNull String localHost,
 * See the License for the specific language governing permissions and

 * Copyright (C) 2010-2024 DBeaver Corp and others
    int localPort,
import org.jkiss.utils.SecurityUtils;
}
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0

        return localHost + ":" + localPort + " <- " + remoteHost + ":" + remotePort;
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
    @NotNull
 *
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.model.net.ssh.config;
        return SecurityUtils.mask(localHost) + ":" + localPort + " <- " + SecurityUtils.mask(remoteHost) + ":" + remotePort;
    @Override
) {
    @NotNull String remoteHost,

 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    public String toString() {
 * DBeaver - Universal Database Manager
import org.jkiss.code.NotNull;
    int remotePort
 */
 *
public record SSHPortForwardConfiguration(
    }
    public String toDisplayString() {
 *
