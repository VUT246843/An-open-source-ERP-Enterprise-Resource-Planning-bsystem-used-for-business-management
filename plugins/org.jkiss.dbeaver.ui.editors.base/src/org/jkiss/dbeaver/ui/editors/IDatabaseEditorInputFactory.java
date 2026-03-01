 */
 *
public interface IDatabaseEditorInputFactory {
import org.eclipse.ui.IEditorInput;
 * limitations under the License.
 * you may not use this file except in compliance with the License.

 * See the License for the specific language governing permissions and
}

 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager


package org.jkiss.dbeaver.ui.editors;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    IEditorInput createNestedEditorInput(IDatabaseEditorInput mainInput);
/**
 */

/*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Nested editor input factory
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
