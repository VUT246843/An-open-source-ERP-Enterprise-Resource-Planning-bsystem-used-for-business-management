

     * and returns a context-bound attributes containing corresponding information

 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
     * @param memberContext concrete attribute of the container record's hierarchy containing the instance of a data type
 */
    ) throws DBException;
     * @param monitor a progress monitor
 */
     * @throws DBException on any DB error

/**
}
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    List<? extends DBSContextBoundAttribute> bindAttributesToContext(
 *
/*
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 *

import java.util.List;
 * you may not use this file except in compliance with the License.
     * Binds data type attributes the given data container context 
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

     */
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.struct;
    /**
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @return a context-bound attributes containing information about the given data container context
public interface DBSBindableDataType extends DBSDataType {
 * You may obtain a copy of the License at
 * Data type descriptor capable of binding its attributes to the data container context.
        @NotNull DBRProgressMonitor monitor,

     *     (it is usually a field of a table, or of another nested data type in the table, whose field is of this type)
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBDAttributeBinding memberContext
