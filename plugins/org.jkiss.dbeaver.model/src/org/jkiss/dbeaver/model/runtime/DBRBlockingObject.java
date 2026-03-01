
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
public interface DBRBlockingObject {
 * Object which can block execution flow.
     * @param monitor monitor
import org.jkiss.code.Nullable;
 *

 */
    void cancelBlock(@NotNull DBRProgressMonitor monitor, @Nullable Thread blockThread) throws DBException;
}
     * @param blockThread  thread which initiated the block. Can be null.
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
 *
    /**
 * you may not use this file except in compliance with the License.
     * In actual implementation this object may not block process at the moment of invocation
     * @throws DBException on error
        return null;
/**

import org.jkiss.code.NotNull;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * Unless required by applicable law or agreed to in writing, software
 * Such as socket, statement or connection, etc.

 * See the License for the specific language governing permissions and
    }

 * You may obtain a copy of the License at
     * Cancels block.
     * of this method. Implementor should check object's state and cancel blocking on demand.
    default Thread getBlockThread() {
 * limitations under the License.
import org.jkiss.dbeaver.DBException;

package org.jkiss.dbeaver.model.runtime;
