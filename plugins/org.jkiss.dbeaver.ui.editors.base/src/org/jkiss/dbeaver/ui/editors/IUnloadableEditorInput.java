/**
     * Creates a new editor input that represent this editor input
     * @return a new editor input instance
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @NotNull
 * An editor input can can be unloaded back to its lazy variant.
package org.jkiss.dbeaver.ui.editors;
 *
     * but in a lazy variant so it can be loaded on demand later.
public interface IUnloadableEditorInput extends IEditorInput {
 *     http://www.apache.org/licenses/LICENSE-2.0
/*
 * See the License for the specific language governing permissions and
}
 * you may not use this file except in compliance with the License.
import org.jkiss.code.NotNull;
 *
    /**
 *
 * limitations under the License.
 */

     */

 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
     *
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.ui.IEditorInput;
    ILazyEditorInput unloadInput();
