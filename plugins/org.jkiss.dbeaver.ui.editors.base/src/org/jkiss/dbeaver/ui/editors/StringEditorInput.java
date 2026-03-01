
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
 * StringEditorInput

package org.jkiss.dbeaver.ui.editors;
 * limitations under the License.
 */
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.ui.IEditorInput;
 * DBeaver - Universal Database Manager
 *
        super(name, value, readOnly, charset);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2024 DBeaver Corp and others
/*

}    }
 * you may not use this file except in compliance with the License.
public class StringEditorInput extends AbstractStorageEditorInput implements INonPersistentEditorInput {
 *
/**
    public static final IEditorInput EMPTY_INPUT = new StringEditorInput("<empty>", "", true, GeneralUtils.getDefaultFileEncoding());
    public StringEditorInput(String name, CharSequence value, boolean readOnly, String charset) {
import org.jkiss.dbeaver.utils.GeneralUtils;
 * You may obtain a copy of the License at
