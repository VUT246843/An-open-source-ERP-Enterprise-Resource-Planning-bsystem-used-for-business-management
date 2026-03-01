     *
 *
     *
     * <p>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    void enableReferentialIntegrity(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     * so it is strongly advised to apply the result of execution of this method database-wide, not session-wide.
 *
}
    String getChangeReferentialIntegrityStatement(@NotNull DBRProgressMonitor monitor, boolean enable) throws DBException;
    boolean supportsChangingReferentialIntegrity(@NotNull DBRProgressMonitor monitor) throws DBException;
    @Nullable
     * @param enable {@code true} to enable referential integrity checks
 * you may not use this file except in compliance with the License.
     * As of the time of writing, DT uses two different sessions to prepare consumers for the transfer and the transfer itself,
import org.jkiss.dbeaver.DBException;
import org.jkiss.code.NotNull;
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at

public interface DBPReferentialIntegrityController {
 */
     * @throws DBException upon any errors
 * DBeaver - Universal Database Manager
    /**
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
     * @param monitor monitor
 *
     * Enables or disables referential integrity checks.
 * Copyright (C) 2010-2025 DBeaver Corp and others
package org.jkiss.dbeaver.model;
/*


     * This method was originally introduced for use in data transfer.
 * limitations under the License.
