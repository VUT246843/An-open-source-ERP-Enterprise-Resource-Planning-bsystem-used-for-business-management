     *
 */
    String askForNewPassword(@NotNull String title, @Nullable String defPassword);
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Security UI Service


public interface UIServiceSecurity {
        @NotNull String title,
}        boolean emptyPasswordAllowed);
 *
package org.jkiss.dbeaver.runtime.ui;
        @Nullable String defPassword,
     * Reset project password
     *
    void resetProjectPassword(DBPProject project) throws DBException;
    String askForPasswordChange(@NotNull String title, @NotNull String currentPassword);
    boolean validatePassword(DBPProject project, String title, String message, boolean forceEncryption);
     */
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
     */

 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String askForPassword(@NotNull String title, String message, @Nullable String defPassword, boolean emptyPasswordAllowed);
    /**
     * @throws DBException - thrown exception
 * Unless required by applicable law or agreed to in writing, software

     * Ask the password for specific project
        @NotNull DBPProject project,
     * @param project - current project
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
    String askForPassword(
import org.jkiss.code.NotNull;
 *
 * you may not use this file except in compliance with the License.

    /**
        String message,
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.DBException;
 *



 * See the License for the specific language governing permissions and
     * @return - password
/**
 * limitations under the License.

