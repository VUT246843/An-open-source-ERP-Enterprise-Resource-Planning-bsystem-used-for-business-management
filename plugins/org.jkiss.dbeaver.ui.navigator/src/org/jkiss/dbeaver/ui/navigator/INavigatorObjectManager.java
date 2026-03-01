
import org.eclipse.ui.IWorkbenchWindow;
import org.jkiss.dbeaver.DBException;
 */

/**

}
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * you may not use this file except in compliance with the License.
 * limitations under the License.
 */
 *     http://www.apache.org/licenses/LICENSE-2.0

/*
 * Manages navigator object. Support create/delete/open commands for any node type.
 * See the License for the specific language governing permissions and
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    int FEATURE_CREATE = 1;
public interface INavigatorObjectManager {
    int FEATURE_OPEN = 1;
    int getSupportedFeatures();
import org.jkiss.dbeaver.model.navigator.DBNObjectNode;

 *
    default void deleteObjectNode(IWorkbenchWindow window, DBNObjectNode node) throws DBException {}

 * distributed under the License is distributed on an "AS IS" BASIS,
    default void createObjectNode(IWorkbenchWindow window, DBNObjectNode node) throws DBException {}

    int FEATURE_DELETE = 1;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    default void openObjectEditor(IWorkbenchWindow window, DBNObjectNode node) throws DBException {}
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager
 * ObjectNode managers are queries by system by using adapters.
 *

package org.jkiss.dbeaver.ui.navigator;
