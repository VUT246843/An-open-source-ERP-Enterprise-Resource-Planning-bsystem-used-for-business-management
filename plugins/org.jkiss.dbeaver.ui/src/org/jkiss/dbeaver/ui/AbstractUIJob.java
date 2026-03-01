    }
    public IStatus runInUIThread(@NotNull IProgressMonitor monitor)


    protected abstract IStatus runInUIThread(@NotNull DBRProgressMonitor monitor);
 *
    protected AbstractUIJob(String name)
package org.jkiss.dbeaver.ui;
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.utils.RuntimeUtils;
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
    {
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 */
}import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.core.runtime.IProgressMonitor;
        super(name);
    @NotNull
    @NotNull
        return this.runInUIThread(RuntimeUtils.makeMonitor(monitor));
public abstract class AbstractUIJob extends UIJob
 *
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
import org.eclipse.ui.progress.UIJob;
import org.jkiss.code.NotNull;
    @Override
 * See the License for the specific language governing permissions and
{
/**
/*

import org.jkiss.dbeaver.Log;
 * Copyright (C) 2010-2026 DBeaver Corp and others
    static protected final Log log = Log.getLog(AbstractUIJob.class);
 * limitations under the License.
 * Abstract Database Job
    {
    }


import org.eclipse.core.runtime.IStatus;
