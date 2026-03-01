 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 *


 * DBEObjectManager
    void onCommandDo(DBECommand<?> command);
 *
 * Unless required by applicable law or agreed to in writing, software
 * Licensed under the Apache License, Version 2.0 (the "License");
public interface DBECommandListener {
    void onReset();

    void onCommandChange(DBECommand<?> command);
/**
    void onCommandUndo(DBECommand<?> command);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.

/*
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.edit;

 * DBeaver - Universal Database Manager


} */
 */

 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
    void onSave();
