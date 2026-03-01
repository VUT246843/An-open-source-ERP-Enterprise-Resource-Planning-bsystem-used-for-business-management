     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * makes since only for inline editors, otherwise return value is ignored.
     * Value editor could be:
     * <li>workbench editor</li>
    /**
     * Modeless dialogs and editors must implement IValueEditor and
import org.jkiss.dbeaver.DBException;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @return true on success

     * @param activeEditor    active editor
        throws DBException;
import org.jkiss.code.Nullable;
 *

     * Creates value editor.
    @Nullable
     * value controller.
 * You may obtain a copy of the License at
    /**
    /**
     * Returns array of edit types supported by this value manager.
     * @param propertySource property source

 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
     */
     * <li>inline editor (control created withing inline placeholder)</li>
{
        throws DBCException;
}
    void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller, @Nullable IValueEditor activeEditor)
     * @param controller value controller
package org.jkiss.dbeaver.ui.data;
 * limitations under the License.
import org.eclipse.jface.action.IContributionManager;
 * UI Value Manager.

    String GROUP_ACTIONS_ADDITIONAL = "actions_add";
     * @param controller value controller
 *
     * Fills value's custom properties
/*
     * @throws DBCException on error
import org.jkiss.dbeaver.model.preferences.DBPPropertyManager;

 *
     * @throws DBException on error
 * DBeaver - Universal Database Manager
 */
     */
    IValueEditor createEditor(@NotNull IValueController controller)
     * @param manager context menu manager
     */
     * <li>dialog (modal or modeless)</li>
     *
 *     http://www.apache.org/licenses/LICENSE-2.0
     * must register themselves within value controller. On close they must unregister themselves within

    void contributeProperties(@NotNull DBPPropertyManager propertySource, @NotNull IValueController controller);

    /**
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    IValueController.EditType[] getSupportedEditTypes();
 * you may not use this file except in compliance with the License.
public interface IValueManager
     * @param controller value controller  @return true if editor was successfully opened.
import org.jkiss.dbeaver.model.exec.DBCException;
     * Fills context menu for certain value
/**

import org.jkiss.code.NotNull;
