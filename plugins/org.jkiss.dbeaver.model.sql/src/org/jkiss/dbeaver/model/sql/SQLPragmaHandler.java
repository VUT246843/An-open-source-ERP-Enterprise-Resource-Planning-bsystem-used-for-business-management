 *
    int RESULT_CONSUME_QUERY = 1 << 1;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
     * Whether the processed pragma should not be processed by following queries
     */
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
 *
    int RESULT_CONSUME_PRAGMA = 1;
     * @return a set of {@code RESULT_} constants.
public interface SQLPragmaHandler {
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
    String PRAGMA_EXPORT = "export";
     */
import org.jkiss.dbeaver.DBException;

 */
 * See the License for the specific language governing permissions and
 * limitations under the License.
package org.jkiss.dbeaver.model.sql;
    int processPragma(@NotNull DBRProgressMonitor monitor, @NotNull DBSDataContainer container, @NotNull Map<String, Object> parameters) throws DBException;
    /**

    /**
import org.jkiss.dbeaver.model.struct.DBSDataContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.util.Map;

 *

}
     * Whether the processed query should not be run
 * you may not use this file except in compliance with the License.
     * @throws DBException on any error

     */
