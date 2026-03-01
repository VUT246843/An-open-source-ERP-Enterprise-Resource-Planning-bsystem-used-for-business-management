    protected GenerateSQLParametrizedDialog(
        String title,
 */
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
    {
        super(parentSite, executionContext, title, image);
    protected void createControls(Composite parent) {

public abstract class GenerateSQLParametrizedDialog extends GenerateSQLDialog {

        @Nullable DBPImage image)

package org.jkiss.dbeaver.ui.editors.sql.dialogs;
import org.eclipse.swt.widgets.Composite;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.

import org.jkiss.dbeaver.model.DBPImage;
        DBCExecutionContext executionContext,
    }
 *

    }


        IWorkbenchPartSite parentSite,
} *
import org.jkiss.code.Nullable;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
import org.eclipse.ui.IWorkbenchPartSite;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
    protected abstract String[] generateSQLScript();
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
/*
