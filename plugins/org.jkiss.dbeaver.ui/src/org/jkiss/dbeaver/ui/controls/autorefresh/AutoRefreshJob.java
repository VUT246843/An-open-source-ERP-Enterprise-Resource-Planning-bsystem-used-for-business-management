
                // ignore
}
        if (!monitor.isCanceled() && refreshControl.isAutoRefreshEnabled()) {
 * Unless required by applicable law or agreed to in writing, software
    @Override

        super("Auto-refresh job (" + refreshControl.getControlId() + ")");

                return GeneralUtils.makeErrorStatus("Auto-refresh error", e.getTargetException());
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
            try {
import org.jkiss.code.NotNull;
        setSystem(true);
    }
 * limitations under the License.
public class AutoRefreshJob extends AbstractJob {
        setUser(false);
    private final AutoRefreshControl refreshControl;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Copyright (C) 2010-2025 DBeaver Corp and others
        return Status.OK_STATUS;

    protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    AutoRefreshJob(AutoRefreshControl refreshControl) {
import org.eclipse.core.runtime.IStatus;
import java.lang.reflect.InvocationTargetException;
    }
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
        this.refreshControl = refreshControl;
 */
package org.jkiss.dbeaver.ui.controls.autorefresh;
 *     http://www.apache.org/licenses/LICENSE-2.0
            } catch (InterruptedException e) {
 *

            }
            } catch (InvocationTargetException e) {
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.eclipse.core.runtime.Status;
/*
 * DBeaver - Universal Database Manager
                refreshControl.getRunnable().run(monitor);
 *

 *
import org.jkiss.dbeaver.utils.GeneralUtils;
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 * See the License for the specific language governing permissions and
