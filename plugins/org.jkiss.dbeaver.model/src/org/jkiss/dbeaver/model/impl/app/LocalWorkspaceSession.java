    }
        } catch (Exception e) {
 * DBeaver - Universal Database Manager
    public static final SMSessionType DB_SESSION_TYPE = new SMSessionType("DBeaver");
    public SMAuthSpace getSessionSpace() {
    public LocalWorkspaceSession(@NotNull DBPWorkspace workspace) {
            }
    @Override
        return workspace.getWorkspaceId();
 */
        return this;
 * You may obtain a copy of the License at
import org.jkiss.utils.StandardConstants;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

import org.jkiss.utils.CommonUtils;
        try {
                UnixSystem unixSystem = new UnixSystem();

    @NotNull
                domainName = System.getenv("USERDOMAIN");
 *     http://www.apache.org/licenses/LICENSE-2.0
            userName = "unknown";
 * Licensed under the Apache License, Version 2.0 (the "License");
        return startTime;
    @Override
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.DBConstants;
        }
    @Nullable
                userName = ntSystem.getName();

    @Override
import com.sun.security.auth.module.UnixSystem;
    private String userName;
    }
    @Override
import java.time.LocalDateTime;
import org.jkiss.dbeaver.model.auth.impl.AbstractSessionPersistent;
 * you may not use this file except in compliance with the License.
    public LocalDateTime getSessionStart() {
        return LocalSecretController.INSTANCE;

        this.workspace = workspace;
package org.jkiss.dbeaver.model.impl.app;
 *
                domainName = ntSystem.getDomain();
            userName = System.getProperty(StandardConstants.ENV_USER_NAME);
        return domainName;
            }

import org.jkiss.dbeaver.model.app.DBPWorkspace;

    public String getSessionId() {
    }
    }
import org.jkiss.code.NotNull;
    @NotNull
    public String getUserDomain() {
                NTSystem ntSystem = new NTSystem();
/*
            } else {
    }
    }
                userName = unixSystem.getUsername();
    private final DBPWorkspace workspace;
        return workspace.getAuthContext();
public class LocalWorkspaceSession extends AbstractSessionPersistent implements SMSession, SMSessionPrincipal, SMSessionSecretKeeper {
    public SMSessionContext getSessionContext() {
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @NotNull
 *
    @NotNull
        if (CommonUtils.isEmpty(userName)) {
    public SMSessionPrincipal getSessionPrincipal() {

            // Not supported on this system
            if (CommonUtils.isEmpty(domainName)) {
            if (RuntimeUtils.isWindows()) {
        }
        if (CommonUtils.isEmpty(domainName)) {
        this.startTime = LocalDateTime.now();
 * limitations under the License.
    private final LocalDateTime startTime;
                domainName = DBConstants.LOCAL_DOMAIN_NAME;
import org.jkiss.dbeaver.model.auth.*;

    public DBSSecretController getSecretController() {
 *
    private String domainName;
    public String getUserName() {
 * Unless required by applicable law or agreed to in writing, software
            }
import org.jkiss.code.Nullable;
        if (CommonUtils.isEmpty(userName)) {
        return userName;

    }
import com.sun.security.auth.module.NTSystem;

        }
}

        return workspace;
    @Override
    @Override
        }
 * See the License for the specific language governing permissions and
    @Override


            if (RuntimeUtils.isWindows()) {


    }

import org.jkiss.dbeaver.utils.RuntimeUtils;
    @NotNull
import org.jkiss.dbeaver.model.secret.DBSSecretController;
    @Override
