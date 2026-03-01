 * Licensed under the Apache License, Version 2.0 (the "License");
    // Control-based handler activation disabled for now (as it requires workbench site and thus doesn't work in dialogs)
    String NAVIGATOR_CONTEXT_ID = "org.jkiss.dbeaver.ui.context.navigator";
import org.jkiss.code.Nullable;

 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String NAVIGATOR_CONTROL_ID = "org.jkiss.dbeaver.core.ui.navigator.control";
public interface INavigatorModelView extends INavigatorNodeContainer {

    String NAVIGATOR_VIEW_CONTEXT_ID = "org.jkiss.dbeaver.ui.context.navigator.view";
    @Nullable
    // TODO: find some solution.
    Viewer getNavigatorViewer();
import org.eclipse.jface.viewers.Viewer;
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ui.navigator;
/**
/*
 */

 * DBeaver - Universal Database Manager
 *
 *
    // However current handlers also don't work in dialogs as they are mapped on activePart.
 * Copyright (C) 2010-2024 DBeaver Corp and others
}
 */
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software

 * INavigatorView
 *     http://www.apache.org/licenses/LICENSE-2.0
 * You may obtain a copy of the License at

