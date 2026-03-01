    @Override
 * See the License for the specific language governing permissions and

}        Composite parent,
/*
 */
 * limitations under the License.
        String[] filterExt,
import org.jkiss.dbeaver.model.fs.DBFUtils;
    }
 *
 * TextWithOpenFileRemote.
    public DBPProject getProject() {

        this.project = project;

import org.jkiss.dbeaver.model.app.DBPProject;
 * DBeaver - Universal Database Manager
/**
    public TextWithOpenFileRemote(
 *
 *
 *
        String title,
 * You may obtain a copy of the License at
        return project;
    ) {
 * Styles: SWT.SAVE, SWT.OPEN, SWT.SINGLE
 * distributed under the License is distributed on an "AS IS" BASIS,

    }
        int style,
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
        boolean binary,
        super(parent, title, filterExt, style, binary, project != null && DBFUtils.supportsMultiFileSystems(project), false);
 * Licensed under the Apache License, Version 2.0 (the "License");
    private final DBPProject project;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
public class TextWithOpenFileRemote extends TextWithOpenFile {
import org.eclipse.swt.widgets.Composite;
        DBPProject project
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.controls;

