        return Status.OK_STATUS;
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull

/*
        } catch (InvocationTargetException e) {

import org.jkiss.code.NotNull;
    }
    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
        super(name);
 * limitations under the License.

 * distributed under the License is distributed on an "AS IS" BASIS,
    private final DBRRunnableWithProgress runnable;
 *
    public SystemJob(String name, DBRRunnableWithProgress runnable) {
    @Override
 */


        } catch (InterruptedException e) {
/**
import org.eclipse.core.runtime.IStatus;
 * See the License for the specific language governing permissions and
{
        }
public class SystemJob extends AbstractJob
 * Unless required by applicable law or agreed to in writing, software
        this.runnable = runnable;
 *
            return Status.CANCEL_STATUS;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import java.lang.reflect.InvocationTargetException;
} * DBeaver - Universal Database Manager
    }
            return GeneralUtils.makeExceptionStatus(e.getTargetException());
        try {
        setSystem(true);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        setUser(false);
import org.eclipse.core.runtime.Status;
import org.jkiss.dbeaver.utils.GeneralUtils;
 */
package org.jkiss.dbeaver.model.runtime;
 * Abstract Database Job
            runnable.run(monitor);
 *     http://www.apache.org/licenses/LICENSE-2.0
