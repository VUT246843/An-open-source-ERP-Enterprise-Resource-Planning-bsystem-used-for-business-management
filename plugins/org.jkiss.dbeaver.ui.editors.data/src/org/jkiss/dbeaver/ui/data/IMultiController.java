 *

{
 */
package org.jkiss.dbeaver.ui.data;
 *

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
 * Supports value editors switch.
    /**
    void nextInlineEditor(boolean next);
 * Multi-value controller.
     * @param next true for next and false for previous cell
}
/**
public interface IMultiController
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.
     * This action may initiated by editor control (e.g. on Enter or Esc key)
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
/*
     * Closes current value editor.
 * DBeaver - Universal Database Manager
 */
     */
     */
    void closeInlineEditor();

 * you may not use this file except in compliance with the License.
     * Closes current editor and activated next cell editor
