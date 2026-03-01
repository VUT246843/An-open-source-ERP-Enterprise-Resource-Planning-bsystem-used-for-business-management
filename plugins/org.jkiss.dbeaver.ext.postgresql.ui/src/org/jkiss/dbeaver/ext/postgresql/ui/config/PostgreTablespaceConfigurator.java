}

 *
package org.jkiss.dbeaver.ext.postgresql.ui.config;
 * Copyright (C) 2019 Andrew Khitrin (ahitrin@gmail.com)

import org.jkiss.dbeaver.ui.UIUtils;
    public PostgreTablespace configureObject(@NotNull DBRProgressMonitor monitor, @Nullable DBECommandContext commandContext, @Nullable Object container, @NotNull PostgreTablespace tablespace, @NotNull Map<String, Object> options) {
            @Override
 * limitations under the License.
import org.jkiss.code.Nullable;
/*
                tablespace.setLoc(dialog.getLoc());
import org.jkiss.dbeaver.model.edit.DBECommandContext;

 * you may not use this file except in compliance with the License.
        }.execute();
import java.util.Map;
public class PostgreTablespaceConfigurator implements DBEObjectConfigurator<PostgreTablespace> {
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ext.postgresql.ui.PostgreCreateTablespaceDialog;
 * DBeaver - Universal Database Manager
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
                tablespace.setOptions(dialog.getOptions());
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
                PostgreCreateTablespaceDialog dialog = new PostgreCreateTablespaceDialog(UIUtils.getActiveWorkbenchShell(), tablespace);
            protected PostgreTablespace runTask() {

import org.jkiss.dbeaver.model.edit.DBEObjectConfigurator;
                    return null;
                tablespace.setName(dialog.getName());

import org.jkiss.dbeaver.ui.UITask;
    }
        return new UITask<PostgreTablespace>() {
            }
import org.jkiss.dbeaver.ext.postgresql.model.PostgreTablespace;
                }
import org.eclipse.jface.dialogs.IDialogConstants;

                tablespace.setOwnerId(dialog.getOwner().getObjectId());
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
                return tablespace;
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others

    @Override
                if (dialog.open() != IDialogConstants.OK_ID) {
 *
 *

 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
