                ) {
            infoLabel.setLayoutData(gridData);
import org.jkiss.dbeaver.ext.postgresql.model.PostgreObject;

 * limitations under the License.
            GridData gridData = new GridData(SWT.FILL, SWT.END, true, false);
    public static void addCompatibilityInfoLabelForForks(
import org.eclipse.swt.SWT;

    }

public class PostgreUIUtils {
 *
        @Nullable PostgreDataSource dataSource
import org.eclipse.swt.widgets.Composite;
            gridData.horizontalSpan = 1;
                showInfoLabel = true;
 * DBeaver - Universal Database Manager
            if (databaseObject instanceof PostgreObject pObject &&
            }
        if (showInfoLabel) {
import org.jkiss.dbeaver.ui.UIUtils;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    ) {
 *
        }
import org.jkiss.dbeaver.ext.postgresql.model.impls.PostgreServerPostgreSQL;
        if (dataSource != null && dataSource.getServerType() instanceof PostgreServerPostgreSQL) {
import org.jkiss.code.NotNull;
 * You may obtain a copy of the License at
                PostgreMessages.wizard_info_label_incompatible_tool,
 *     http://www.apache.org/licenses/LICENSE-2.0
                GridData.FILL_BOTH,
}
import org.jkiss.dbeaver.tasks.ui.nativetool.AbstractNativeToolWizard;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.layout.GridData;
                !(pObject.getDataSource().getServerType() instanceof PostgreServerPostgreSQL)
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
            Object databaseObject = wizard.getSettings().getDatabaseObjects().get(0);
 * Copyright (C) 2010-2024 DBeaver Corp and others
            Control infoLabel = UIUtils.createWarningLabel(
                composite,
import org.eclipse.swt.widgets.Control;
 * See the License for the specific language governing permissions and
        @NotNull AbstractNativeToolWizard wizard,
                1);
        boolean showInfoLabel = false;
        } else if (!wizard.getSettings().getDatabaseObjects().isEmpty()) {
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.postgresql;
 */
            showInfoLabel = true;
import org.jkiss.dbeaver.ext.postgresql.model.PostgreDataSource;
        @NotNull Composite composite,
import org.jkiss.code.Nullable;

        }
