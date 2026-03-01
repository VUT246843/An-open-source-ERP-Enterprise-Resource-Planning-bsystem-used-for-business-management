/*
}
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 *


    DBPDataSourceContainer getDataSourceContainer();
 * May affect default catalog/schema for the new editor.
 * Context for new database editor opening.
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPContextProvider;
 *     http://www.apache.org/licenses/LICENSE-2.0
public interface DatabaseEditorContext extends DBPContextProvider {

 *
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 */

/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,

    DBSObject getSelectedObject();
import org.jkiss.dbeaver.model.struct.DBSObject;
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.ui.editors;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
