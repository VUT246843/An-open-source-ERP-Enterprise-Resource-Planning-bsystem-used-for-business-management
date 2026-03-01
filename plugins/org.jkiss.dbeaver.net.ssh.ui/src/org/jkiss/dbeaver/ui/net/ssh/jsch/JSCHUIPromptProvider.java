        }
 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.Log;
    public UserInfo createUserInfoPrompt(@NotNull SSHHostConfiguration configuration, @NotNull Session session) {
            log.debug("SSH server message:");
import org.jkiss.dbeaver.runtime.DBWorkbench;
            if (configuration.auth() instanceof SSHAuthConfiguration.WithPassword auth) {
 */
            return true;
    private static class UIPrompter extends UserInfoPrompter {
            if (configuration.auth() instanceof SSHAuthConfiguration.WithPassword auth) {
        }
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

                if (auth.savePassword() || CommonUtils.isNotEmpty(auth.password())) {
        @Override
        }
        @Override
import org.jkiss.utils.CommonUtils;


        UIPrompter(@NotNull SSHHostConfiguration configuration, Session session) {
            // Just log it in debug
import org.jkiss.dbeaver.model.net.ssh.JSCHUserInfoPromptProvider;
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
            return DBWorkbench.getPlatformUI().confirmAction(
                true
                setPassphrase(auth.password());
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
 * limitations under the License.
package org.jkiss.dbeaver.ui.net.ssh.jsch;

        }
        private static final Log log = Log.getLog(JSCHUIPromptProvider.class);
 *     http://www.apache.org/licenses/LICENSE-2.0
            log.debug(message);



        }
/*
        private final SSHHostConfiguration configuration;
            }
        public String[] promptKeyboardInteractive(String destination, String name, String instruction, String[] prompt, boolean[] echo) {
            this.configuration = configuration;
        public boolean promptPassword(String message) {
import com.jcraft.jsch.UserInfo;
                question,
    @NotNull
public class JSCHUIPromptProvider implements JSCHUserInfoPromptProvider {
    }
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
            if (configuration.auth() instanceof SSHAuthConfiguration.WithPassword auth) {
        public void showMessage(String message) {
        @Override
            super(session);
} *
    @Override
import com.jcraft.jsch.Session;
        public boolean promptYesNo(String question) {

        @Override
import org.eclipse.jsch.ui.UserInfoPrompter;
import org.jkiss.dbeaver.model.net.ssh.config.SSHAuthConfiguration;
 * you may not use this file except in compliance with the License.
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
                SSHUIMessages.jsch_remote_host_identifier_changed_warning_title,
                }
        return new UIPrompter(configuration, session);
            );
            return true;
            }
import org.jkiss.dbeaver.ui.net.ssh.SSHUIMessages;
 * You may obtain a copy of the License at

                    setPassword(auth.password());

        public boolean promptPassphrase(String message) {
                setPassword(auth.password());
        }
        @Override
            return super.promptKeyboardInteractive(destination, name, instruction, prompt, echo);
 *
    }
