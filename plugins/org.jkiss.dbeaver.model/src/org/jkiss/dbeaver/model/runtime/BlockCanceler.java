            if (e instanceof RuntimeException) {
 * Unless required by applicable law or agreed to in writing, software
        thread.setName("Operation cancel [" + block + "]");
public class BlockCanceler
        } catch (Throwable e) {
    public static void cancelBlock(@NotNull DBRProgressMonitor monitor, @NotNull DBRBlockingObject block) throws DBException {
            block.cancelBlock(monitor, block.getBlockThread());
 *
 * See the License for the specific language governing permissions and
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
                throw e;
 * distributed under the License is distributed on an "AS IS" BASIS,
            thread.setName(threadOldName);

            throw new DBException("Cancel error", e);

        final Thread thread = Thread.currentThread();
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        try {
import org.jkiss.code.NotNull;
        final String threadOldName = thread.getName();
 * you may not use this file except in compliance with the License.
        } finally {
 * Abstract Database Job
    private static final Log log = Log.getLog(BlockCanceler.class);

}
package org.jkiss.dbeaver.model.runtime;
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;
 */
            }
import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2024 DBeaver Corp and others

/**
{
 *
 *
 * You may obtain a copy of the License at
        }
    }
 * limitations under the License.
