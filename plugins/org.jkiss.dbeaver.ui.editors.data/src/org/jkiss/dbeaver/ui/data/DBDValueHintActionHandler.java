import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;
     */
import org.eclipse.swt.graphics.Point;
import org.jkiss.dbeaver.DBException;
/**

 *
 *
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
public interface DBDValueHintActionHandler {
 * limitations under the License.
     * @param controller result set  controller

 */
 *
package org.jkiss.dbeaver.ui.data;
    /**

     *
     * @param location   cell location in screen coordinates
    @NotNull
}
     * @param state      modifier state
 * Copyright (C) 2010-2026 DBeaver Corp and others
     * Perform hint action
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @throws DBException on any DB error
 */
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    void performAction(@NotNull IResultSetController controller, @NotNull Point location, long state) throws DBException;
 * Value hint action handler
    String getActionText();

 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
