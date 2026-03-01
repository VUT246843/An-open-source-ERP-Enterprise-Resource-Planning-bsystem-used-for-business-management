 */
     * Attempts to unload an editor input.
     *
 *

 * Unless required by applicable law or agreed to in writing, software
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
    /**
     * @return {@code true} if the editor input was loaded successfully, or {@code false} if it can't be done
    /**
 * An editor that can unload its own editor input so it can be initialized on demand later.
 *
package org.jkiss.dbeaver.ui.editors;
 * Copyright (C) 2010-2024 DBeaver Corp and others
public interface ILazyEditor extends IEditorPart {
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
     * @return {@code true} if the editor input was unloaded successfully, or {@code false} if it can't be done
 * See the License for the specific language governing permissions and
     *
    boolean loadEditorInput();
    boolean unloadEditorInput();
     */


/*
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.IEditorPart;
 * limitations under the License.

 * DBeaver - Universal Database Manager
     * Attempts to load an editor input.
}
