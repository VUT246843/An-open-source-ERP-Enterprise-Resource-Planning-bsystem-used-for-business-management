        } catch (InvocationTargetException e) {
 *

/**
        try {
/*
package org.jkiss.dbeaver.ui.dialogs;
import org.eclipse.jface.wizard.Wizard;
import org.jkiss.dbeaver.model.runtime.DBRRunnableWithProgress;
public abstract class BaseWizard extends Wizard
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *
import org.eclipse.jface.dialogs.IDialogPage;
    public DBRRunnableContext getRunnableContext() {
import org.jkiss.dbeaver.runtime.RunnableContextDelegate;

 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRRunnableContext;
        return page != null && page.getControl() != null;
    }
 */
            DBWorkbench.getPlatformUI().showError("Internal error", "Internal error while running wizard task", e);
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");
        } catch (InterruptedException ignored) {

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
            getRunnableContext().run(true, true, runnable::run);
        }
 * See the License for the specific language governing permissions and
    protected static boolean isPageActive(IDialogPage page) {
    }
    public void runWithProgress(DBRRunnableWithProgress runnable) {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */

 * BaseWizard
 *
import java.lang.reflect.InvocationTargetException;

        return new RunnableContextDelegate(getContainer());
} * limitations under the License.
{
