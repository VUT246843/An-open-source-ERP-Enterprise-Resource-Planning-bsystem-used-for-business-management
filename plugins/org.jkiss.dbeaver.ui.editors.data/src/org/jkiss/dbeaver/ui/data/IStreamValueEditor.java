    /**
            throws DBCException;
/*
import org.jkiss.dbeaver.model.data.DBDContent;
    CONTROL createControl(IValueController valueController);
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
     *


 * You may obtain a copy of the License at
import org.jkiss.code.NotNull;
}

 *

package org.jkiss.dbeaver.ui.data;
     * Extracts value from value editor.
        throws DBException;
        throws DBException;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
     */
     * @param value new value for editor
 * Copyright (C) 2010-2024 DBeaver Corp and others
    void primeEditorValue(@NotNull DBRProgressMonitor monitor, @NotNull CONTROL control, @NotNull DBDContent value)
public interface IStreamValueEditor<CONTROL extends Control>
    void extractEditorValue(@NotNull DBRProgressMonitor monitor, @NotNull CONTROL control, @NotNull DBDContent value)
     */
{
import org.jkiss.dbeaver.DBException;
     */
     * Gets control which actually performs edit
 *

    /**
     * @throws DBException on any error
 * Wrapped in base value editor.

        // do nothing by default

/**
    void contributeSettings(@NotNull IContributionManager manager, @NotNull CONTROL control)
 *

     * @throws DBCException on error
     * Fills current editor with specified value. Do not updates value in controller.
    /**
        throws DBCException;
 * limitations under the License.
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
     * @throws DBException on any error
import org.jkiss.dbeaver.model.exec.DBCException;
 * distributed under the License is distributed on an "AS IS" BASIS,
     * @param valueController    value controller
import org.eclipse.swt.widgets.Control;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * @param manager context menu manager
     * Fills menu/toolbar with extra actions
    default void disposeEditor() {
 */
import org.eclipse.jface.action.IContributionManager;

 */
    }
    /**
    void contributeActions(@NotNull IContributionManager manager, @NotNull CONTROL control)
     * @return control reference
 * Stream Value Editor.
 * you may not use this file except in compliance with the License.
