import com.jcraft.jsch.UserInfo;
 * you may not use this file except in compliance with the License.

 * Unless required by applicable law or agreed to in writing, software
 */

 * Licensed under the Apache License, Version 2.0 (the "License");
public interface JSCHUserInfoPromptProvider {
package org.jkiss.dbeaver.model.net.ssh;
}
 * See the License for the specific language governing permissions and
import com.jcraft.jsch.Session;
    @NotNull
import org.jkiss.code.NotNull;
 * JSCH prompter provider
    UserInfo createUserInfoPrompt(@NotNull SSHHostConfiguration configuration, @NotNull Session session);
/*
 */

 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

/**
 *
import org.jkiss.dbeaver.model.net.ssh.config.SSHHostConfiguration;
 *
 *
 * limitations under the License.
