    }
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void initializeWorkbenchWindow(@NotNull IWorkbenchWindowConfigurer configurer) {
import org.jkiss.dbeaver.ui.IWorkbenchWindowInitializer;

 *

        if (UIStatisticsActivator.isSkipDataShareConfirmation() || UIStatisticsActivator.isTrackingEnabled()) {
 * You may obtain a copy of the License at
            return;
 * Licensed under the Apache License, Version 2.0 (the "License");
}
    @Override
 *
 *
 * limitations under the License.
 * See the License for the specific language governing permissions and
/*
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
public class WorkbenchInitializerDataShareConfirm implements IWorkbenchWindowInitializer {
        StatisticsCollectionConfirmDialog dialog = new StatisticsCollectionConfirmDialog(configurer.getWindow().getShell());
        dialog.open();
 * DBeaver - Universal Database Manager
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
package org.jkiss.dbeaver.ui.statistics;
