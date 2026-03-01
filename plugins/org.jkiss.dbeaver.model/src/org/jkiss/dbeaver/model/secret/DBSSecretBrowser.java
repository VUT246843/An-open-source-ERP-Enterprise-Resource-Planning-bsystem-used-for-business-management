    @NotNull
 */
 * You may obtain a copy of the License at
/**
    List<DBSSecret> listSecrets(@Nullable String path) throws DBException;
    @Nullable
 * See the License for the specific language governing permissions and
 * limitations under the License.
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    void clearAllSecrets(String keyPrefix) throws DBException;
import java.util.List;

 *

import org.jkiss.dbeaver.DBException;

    void deleteSecret(@NotNull String secretId) throws DBException;
import org.jkiss.code.Nullable;
 * Unless required by applicable law or agreed to in writing, software
/*
package org.jkiss.dbeaver.model.secret;

 * DBeaver - Universal Database Manager
 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.jkiss.code.NotNull;


 * distributed under the License is distributed on an "AS IS" BASIS,
 * Secret manager API

 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

public interface DBSSecretBrowser {
 */
    DBSSecret getSecret(@NotNull String secretId) throws DBException;
