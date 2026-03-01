     * Underlying object's property source
     * @return connection color or {@code null} if not defined


    @Nullable
import org.jkiss.dbeaver.model.navigator.DBNDatabaseNode;
     * Color of the connection type used by the associated connection

 */

    DBSObject getDatabaseObject();
     * Command context
import org.eclipse.swt.graphics.Color;
     * @return command context

    /**
    String getNodePath();
     */
    DBECommandContext getCommandContext();
    DBPPropertySource getPropertySource();
/**


     */
package org.jkiss.dbeaver.ui.editors;
import org.jkiss.dbeaver.model.edit.DBECommandContext;
 * See the License for the specific language governing permissions and
    @Nullable
     * Default editor folder (tab) ID
     *
 * Unless required by applicable law or agreed to in writing, software
     * Default editor page ID
    /**

import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.util.Collection;
    /**

 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPContextProvider;
 * You may obtain a copy of the License at
}
import org.jkiss.code.Nullable;
 *
    Object getAttribute(String name);
 */
    DBNDatabaseNode getNavigatorNode();
    Object setAttribute(String name, Object value);
 * Copyright (C) 2010-2025 DBeaver Corp and others
    String getDefaultPageId();

/*
     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable

     * @return folder ID or null

 *     http://www.apache.org/licenses/LICENSE-2.0
 * DBeaver - Universal Database Manager
    String getDefaultFolderId();
 * you may not use this file except in compliance with the License.
     * @return page ID or null
     */
    @Override
 * limitations under the License.
 * IDatabaseEditorInput
 *

import org.jkiss.dbeaver.model.struct.DBSObject;
 *
    /**

     * @return property source
    Color getConnectionColor();
    /**
public interface IDatabaseEditorInput extends INavigatorEditorInput, DBPContextProvider {

     */
    Collection<String> getAttributeNames();
    @Nullable
