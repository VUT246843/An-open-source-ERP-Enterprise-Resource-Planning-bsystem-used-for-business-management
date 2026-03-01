
    Control getEditorControl();
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ui;
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Gets main editor control
 */
 * Editor with single main control.
import org.jkiss.code.Nullable;
 *
}
import org.eclipse.ui.IEditorPart;
     */
 * See the License for the specific language governing permissions and
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
{
 * DBeaver - Universal Database Manager
/**
 *
public interface ISingleControlEditor extends IEditorPart
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.

    @Nullable
/*
 * You may obtain a copy of the License at
    /**
     * @return control
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.widgets.Control;
 * Usually used by editors represented by text of table/tree control.
 * Licensed under the Apache License, Version 2.0 (the "License");
