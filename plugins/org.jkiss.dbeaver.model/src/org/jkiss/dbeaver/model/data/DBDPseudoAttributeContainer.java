    /**
 * Pseudo attribute container

 * DBeaver - Universal Database Manager
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
    /**
     * Returns collection of pseudo-attributes handled by the database engine while querying this object or objects in this context
    DBDPseudoAttribute[] getPseudoAttributes()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        throws DBException;
 */
/*
     */
     */
 * you may not use this file except in compliance with the License.
 *
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
/**
 * You may obtain a copy of the License at
    DBDPseudoAttribute[] getAllPseudoAttributes(@NotNull DBRProgressMonitor monitor)
 *


 */
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.data;
 * Unless required by applicable law or agreed to in writing, software
     * Returns collection of pseudo-attributes to use during query generation and attributes binding in resultset visualization (apparently)
import org.jkiss.code.NotNull;
public interface DBDPseudoAttributeContainer {
 * distributed under the License is distributed on an "AS IS" BASIS,

        throws DBException;

import org.jkiss.dbeaver.DBException;
