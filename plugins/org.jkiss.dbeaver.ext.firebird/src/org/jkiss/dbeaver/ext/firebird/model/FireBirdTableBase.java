/*

 * You may obtain a copy of the License at
 */


 * DBeaver - Universal Database Manager
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


    String getOwnerName();
 * Copyright (C) 2010-2024 DBeaver Corp and others
    List<FireBirdTableColumn> getAttributes(@NotNull DBRProgressMonitor monitor) throws DBException;
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
import java.util.List;
public interface FireBirdTableBase {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.DBException;
 * limitations under the License.

import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 *

    String getColumnDomainType(DBRProgressMonitor monitor, FireBirdTableColumn column) throws DBException;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.firebird.model;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Licensed under the Apache License, Version 2.0 (the "License");
