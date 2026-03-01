 *
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.struct.DBSObject;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
 */
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
public abstract class AbstractImportSettings<BASE_OBJECT extends DBSObject>
 * You may obtain a copy of the License at

 * limitations under the License.
    public AbstractImportSettings() {
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software

    }
import org.jkiss.dbeaver.model.app.DBPProject;
        super(project);
    extends AbstractNativeToolSettings<BASE_OBJECT> {
}


package org.jkiss.dbeaver.tasks.nativetool;
    public AbstractImportSettings(@NotNull DBPProject project) {
 * DBeaver - Universal Database Manager
    }
 *
