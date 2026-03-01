    void writeStreamValue(
/**

import org.jkiss.dbeaver.model.exec.DBCException;
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull Writer writer)

 *
public interface DBDContentValueHandler extends DBDValueHandler
 *
 * you may not use this file except in compliance with the License.
import org.jkiss.dbeaver.model.DBPDataSource;
 * Content value handler
import java.io.Writer;

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.struct.DBSTypedObject;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
        @NotNull DBPDataSource dataSource,
     * Must use native content representation.
import java.io.IOException;
{
        @NotNull DBSTypedObject type,
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        @NotNull DBDContent object,
        throws DBCException, IOException;

 * Copyright (C) 2010-2024 DBeaver Corp and others
     */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
package org.jkiss.dbeaver.model.data;
        @NotNull DBRProgressMonitor monitor,

 *
 * You may obtain a copy of the License at
     * Writes content value.
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
    /**

}
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
