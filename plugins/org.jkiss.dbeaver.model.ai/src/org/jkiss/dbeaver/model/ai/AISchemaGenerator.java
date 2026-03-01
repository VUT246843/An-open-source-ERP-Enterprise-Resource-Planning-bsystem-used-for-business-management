 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
}
import org.jkiss.dbeaver.DBException;

 * See the License for the specific language governing permissions and
    String generateSchema(
 *
package org.jkiss.dbeaver.model.ai;
        @NotNull DBRProgressMonitor monitor,
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        boolean useFqn
 * You may obtain a copy of the License at
    ) throws DBException;
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
        @Nullable DBCExecutionContext ctx,
import org.jkiss.dbeaver.model.struct.DBSEntity;
 *
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull AISchemaGenerationOptions options,
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
        @NotNull DBSEntity entity,
 * limitations under the License.
public interface AISchemaGenerator {
