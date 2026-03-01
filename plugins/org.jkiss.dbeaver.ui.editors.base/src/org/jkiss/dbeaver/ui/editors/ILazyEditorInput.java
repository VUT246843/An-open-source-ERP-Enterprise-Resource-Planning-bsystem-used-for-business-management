 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
     * Determines whether the real editor input can be initialized as
 * limitations under the License.
    @Nullable
/**
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * An editor input that is initialized on demand.
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at

     * @throws DBException on any DB error
    boolean canLoadImmediately();
    IEditorInput initializeRealInput(@NotNull DBRProgressMonitor monitor) throws DBException;
    /**
    @Nullable
    /**

 */
     * @return {@code true} if the real input can be initialized right away, or {@code false} if not
import org.eclipse.ui.IEditorInput;
     * @param monitor progress monitor
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface ILazyEditorInput extends IEditorInput, IUnloadableEditorInput {
     *
import org.jkiss.dbeaver.DBException;
 * See the License for the specific language governing permissions and
     */
/*
 *
import org.jkiss.dbeaver.model.app.DBPProject;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     * Initializes real editor input.
 *
 *


     */
     *
import org.jkiss.code.NotNull;
}
     * soon as the editor has received this lazy input as its input or not.
    DBPProject getProject();
import org.jkiss.code.Nullable;
     * @return real editor input, or {@code null} if it can't be initialized
package org.jkiss.dbeaver.ui.editors;
