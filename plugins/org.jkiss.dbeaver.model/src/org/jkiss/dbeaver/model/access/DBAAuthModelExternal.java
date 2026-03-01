 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * DBeaver - Universal Database Manager
 * External auth model.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
    @Nullable
import org.jkiss.code.Nullable;
/*
 */
import org.jkiss.code.NotNull;
 */
    String getRequiredExternalAuth(@NotNull DBPConnectionConfiguration configuration);
 * limitations under the License.
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
 * See the License for the specific language governing permissions and
 *

 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2024 DBeaver Corp and others
}
public interface DBAAuthModelExternal<CREDENTIALS extends DBAAuthCredentials> extends DBAAuthModel<CREDENTIALS> {
package org.jkiss.dbeaver.model.access;
 * Unless required by applicable law or agreed to in writing, software
/**
