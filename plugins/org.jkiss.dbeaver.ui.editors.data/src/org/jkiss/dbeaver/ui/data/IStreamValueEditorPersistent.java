 * Unless required by applicable law or agreed to in writing, software
 */
 * limitations under the License.
 *


import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Control;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
 * distributed under the License is distributed on an "AS IS" BASIS,
 * @param <CONTROL> editor control
 * Copyright (C) 2010-2024 DBeaver Corp and others
public interface IStreamValueEditorPersistent<CONTROL extends Control> extends IStreamValueEditor<CONTROL> {
    @Nullable
 *
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
}
    Path getExternalFilePath(@NotNull CONTROL control);
import java.nio.file.Path;
     * @return filepath of external file or null if not found


 * You may obtain a copy of the License at
    /**
package org.jkiss.dbeaver.ui.data;

     * @param control editor control
 * DBeaver - Universal Database Manager
import org.jkiss.code.Nullable;
 *
 * Value editor which provides external files
     *
     * returns path of the file used by editor
     */
 */
