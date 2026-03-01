                return DriverDownloadDialog.downloadDriverFiles(
            protected Boolean runTask() {
 * UIServiceDriversImpl
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.model.connection.DBPDriver;
package org.jkiss.dbeaver.ui.actions.datasource;

    public boolean downloadDriverFiles(
import org.jkiss.utils.CommonUtils;

 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * See the License for the specific language governing permissions and
 * limitations under the License.
import org.jkiss.dbeaver.model.connection.DBPDriverDependencies;
}
                    null,
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
        @NotNull DBPDriverDependencies dependencies,
                    driver,

 *
            @Override
import org.jkiss.dbeaver.runtime.ui.UIServiceDrivers;
 */

        @NotNull DBRProgressMonitor monitor,
            }

        Boolean result = new UITask<Boolean>() {
        boolean isShowExpanded
        @NotNull DBPDriver driver,
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
                    dependencies,
import org.jkiss.dbeaver.ui.dialogs.driver.DriverDownloadDialog;
import org.jkiss.code.NotNull;
    ) {
public class UIServiceDriversImpl implements UIServiceDrivers {
                    isShowExpanded
 *
 * DBeaver - Universal Database Manager
                );
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.UITask;
 */
 *
        }.execute();
    @Override
        return CommonUtils.toBoolean(result, false);
 * Unless required by applicable law or agreed to in writing, software
    }
/*
