 */
 * you may not use this file except in compliance with the License.
    Object getProperty(String name);
 */
    void setProperty(@NotNull String name, @Nullable Object value);
package org.jkiss.dbeaver.ui.editors;
}
 * Unless required by applicable law or agreed to in writing, software
 *
import org.eclipse.ui.IEditorInput;
 * limitations under the License.
 *
 * In-memory editor input
import org.jkiss.code.Nullable;
import org.jkiss.code.NotNull;
 * distributed under the License is distributed on an "AS IS" BASIS,

public interface IInMemoryEditorInput extends IEditorInput {
/*

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * DBeaver - Universal Database Manager


 *

 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
/**
    @Nullable
 *     http://www.apache.org/licenses/LICENSE-2.0
