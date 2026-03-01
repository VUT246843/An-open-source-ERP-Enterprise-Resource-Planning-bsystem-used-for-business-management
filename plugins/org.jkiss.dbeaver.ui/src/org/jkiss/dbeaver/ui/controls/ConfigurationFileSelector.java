    }
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
    public ConfigurationFileSelector(Composite parent, String title, String[] filterExt, boolean binaryFile) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 * distributed under the License is distributed on an "AS IS" BASIS,

 * See the License for the specific language governing permissions and
    protected boolean isShowFileContentEditor() {
import org.eclipse.swt.widgets.Composite;

    public ConfigurationFileSelector(Composite parent, String title, String[] filterExt) {
 */
}


 * You may obtain a copy of the License at

    }
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.controls;

    }
        this(parent, title, filterExt, false, false);
 *
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Override
/*
 * Licensed under the Apache License, Version 2.0 (the "License");
        return DBWorkbench.isDistributed();
 *
public class ConfigurationFileSelector extends TextWithOpenFile {
        this(parent, title, filterExt, binaryFile, false);
    }

 * limitations under the License.
    public ConfigurationFileSelector(Composite parent, String title, String[] filterExt, boolean binaryFile, boolean secured) {
        super(parent, title, filterExt, binaryFile, secured);
 * Copyright (C) 2010-2025 DBeaver Corp and others
