
     */
    /**
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
     * Fills menu/toolbar with extra actions

 * DBD Value Editor.
     * @throws DBException on any error
        throws DBException;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    Object extractEditorValue()
/**
 *
     * Do not updates value in controller.
    /**
    /**

}
     * @return value. Possibly NULL
 */
import org.eclipse.jface.action.IContributionManager;
    void dispose();
 */

     *
    boolean isDirty();
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
    Control getControl();
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
public interface IValueEditor
     */
    @Nullable
     * @param manager context menu manager
     * @throws DBCException on error
 * distributed under the License is distributed on an "AS IS" BASIS,
    boolean isReadOnly();
        throws DBCException;
     * @param controller value controller
 * Must be implemented by all visual value editors (dialogs, editors, inline controls).
    void primeEditorValue(@Nullable Object value)

     */
package org.jkiss.dbeaver.ui.data;
     * @param value new value for editor
import org.eclipse.swt.widgets.Control;
    /**
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.code.NotNull;
 *
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
     * @return control reference
 * DBeaver - Universal Database Manager
    void contributeActions(@NotNull IContributionManager manager, @NotNull IValueController controller)
/*
     * Fills current editor with specified value.
    /**
 *
     * Checks whether editor content was modified (after #primeEditorValue invocation).


    /**
    void setDirty(boolean dirty);
     * Create editor control(s)
     */
import org.jkiss.dbeaver.model.exec.DBCException;
{

     */
     * In inline mode implementation should select whole value.
     * Extracts value from value editor.
    void createControl();
     * @throws DBException on any error
     * Gets control which actually performs edit

        throws DBException;


import org.jkiss.code.Nullable;

