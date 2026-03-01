        @NotNull DBSAttributeBase[] attributes,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.exec.DBCExecutionSource;
        @NotNull DBCSession session,
 *     http://www.apache.org/licenses/LICENSE-2.0

 */

        @NotNull DBSManipulationType type,
public interface DBSDataManipulatorExt extends DBSDataManipulator {

import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.DBCException;
 * You may obtain a copy of the License at
 */
}
 *
    void beforeDataChange(
        throws DBCException;
/*
package org.jkiss.dbeaver.model.struct;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
import org.jkiss.dbeaver.model.struct.rdb.DBSManipulationType;
        @NotNull DBCSession session,
        @NotNull DBSManipulationType type,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Data manipulator extensions.
        throws DBCException;
 * See the License for the specific language governing permissions and
 *
 * you may not use this file except in compliance with the License.
        @NotNull DBCExecutionSource source)
        @NotNull DBSAttributeBase[] attributes,
 * Extends data manipulator and provides away to execute some actions before and after data manipulations.

/**

    void afterDataChange(
 * DBeaver - Universal Database Manager

        @NotNull DBCExecutionSource source)
 * Licensed under the Apache License, Version 2.0 (the "License");
