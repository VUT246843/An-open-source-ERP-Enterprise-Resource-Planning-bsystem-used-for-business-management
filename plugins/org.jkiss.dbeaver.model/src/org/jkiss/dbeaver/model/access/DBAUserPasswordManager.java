
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.model.access;
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
        @NotNull DBRProgressMonitor monitor,


 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
}

    void changeUserPassword(
 * Unless required by applicable law or agreed to in writing, software
        @NotNull String oldPassword) throws DBException;
import org.jkiss.dbeaver.DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 *
        @NotNull String newPassword,
 * you may not use this file except in compliance with the License.
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface DBAUserPasswordManager {
 * See the License for the specific language governing permissions and
        @NotNull String userName,
 * limitations under the License.
 *
 *
