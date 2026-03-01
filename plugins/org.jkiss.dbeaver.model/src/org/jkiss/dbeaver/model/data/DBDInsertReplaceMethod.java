
import org.jkiss.code.NotNull;
/*
 * See the License for the specific language governing permissions and
}
 * you may not use this file except in compliance with the License.
public interface DBDInsertReplaceMethod {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.model.struct.rdb.DBSTable;
    @NotNull
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 *

 */
 * You may obtain a copy of the License at
    String getOpeningClause(@NotNull DBSTable table, @NotNull DBRProgressMonitor monitor);
package org.jkiss.dbeaver.model.data;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * DBeaver - Universal Database Manager


    String getTrailingClause(@NotNull DBSTable table, @NotNull DBRProgressMonitor monitor, DBSAttributeBase[] attributes);
 * limitations under the License.
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;
 * Unless required by applicable law or agreed to in writing, software
