    record KeyData(@NotNull String data, @Nullable String password, boolean savePassword) implements WithPassword {
/*
 * Unless required by applicable law or agreed to in writing, software
    sealed interface WithPassword extends SSHAuthConfiguration {
 * Licensed under the Apache License, Version 2.0 (the "License");


    }
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * You may obtain a copy of the License at
    }
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others

        boolean savePassword();
import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
        String password();
 *

package org.jkiss.dbeaver.model.net.ssh.config;
        @Nullable
 * DBeaver - Universal Database Manager
 */
    record Agent() implements SSHAuthConfiguration {
    }
 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.code.Nullable;
    }
    record KeyFile(@NotNull String path, @Nullable String password, boolean savePassword) implements WithPassword {

}
public sealed interface SSHAuthConfiguration {

    record Password(@Nullable String password, boolean savePassword) implements WithPassword {
