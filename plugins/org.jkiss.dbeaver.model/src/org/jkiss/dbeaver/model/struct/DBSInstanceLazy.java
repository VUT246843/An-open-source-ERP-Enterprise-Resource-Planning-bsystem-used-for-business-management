 * distributed under the License is distributed on an "AS IS" BASIS,
 */

 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * You may obtain a copy of the License at
public interface DBSInstanceLazy extends DBSInstance
 * See the License for the specific language governing permissions and

 * Licensed under the Apache License, Version 2.0 (the "License");
     */
 *
{
    void checkInstanceConnection(@NotNull DBRProgressMonitor monitor) throws DBException;
/**
}
import org.jkiss.dbeaver.DBException;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 * Instance with lazy initialization
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.model.struct;
 * limitations under the License.
     * Check instance connection
 */
import org.jkiss.code.NotNull;
/*

 *
    boolean isInstanceConnected();
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    /**
