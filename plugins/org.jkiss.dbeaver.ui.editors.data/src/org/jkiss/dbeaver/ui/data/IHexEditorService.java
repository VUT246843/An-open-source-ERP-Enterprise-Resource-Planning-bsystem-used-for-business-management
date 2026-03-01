/*
}
public interface IHexEditorService {
 *
 * See the License for the specific language governing permissions and

/**

 * you may not use this file except in compliance with the License.
 * Optional service used by data editor.
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Control;

 */
 * Licensed under the Apache License, Version 2.0 (the "License");

 * DBeaver - Universal Database Manager
    byte[] getHexContent(Control control);
 * Hex editor service.
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    void setHexContent(Control hexEditControl, byte[] bytes, String charset);
 */
 * You may obtain a copy of the License at
    Control createHexControl(Composite parent, boolean readOnly);
 *
package org.jkiss.dbeaver.ui.data;

import org.eclipse.swt.widgets.Composite;
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
