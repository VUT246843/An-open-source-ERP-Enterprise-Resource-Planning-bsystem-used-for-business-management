 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.model.DBPDataSourceTask;
     * Recreates editor UI.
 */
/*

package org.jkiss.dbeaver.ui.editors;
 */
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPContextProvider;
 * You may obtain a copy of the License at

public interface IDatabaseEditor extends IEditorPart, DBPDataSourceTask, DBPContextProvider, IRefreshablePart
/**
 * you may not use this file except in compliance with the License.
} *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.IEditorPart;
 *
     * Used by lazy editor initializer
 * limitations under the License.


    void recreateEditorControl();
     */
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.IRefreshablePart;
{
 * Unless required by applicable law or agreed to in writing, software
 * IDatabaseEditor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
