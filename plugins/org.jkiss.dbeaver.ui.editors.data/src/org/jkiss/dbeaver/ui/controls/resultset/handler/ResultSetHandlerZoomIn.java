public class ResultSetHandlerZoomIn extends ResultSetHandlerMain implements IElementUpdater {
 *

 */
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.menus.UIElement;
import java.util.Map;
 * ResultSetHandlerZoomIn
 * See the License for the specific language governing permissions and
import org.eclipse.ui.commands.IElementUpdater;
import org.jkiss.dbeaver.ui.ActionUtils;
    }
 * you may not use this file except in compliance with the License.
/**
    public void updateElement(UIElement element, Map parameters) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        element.setText(ActionUtils.findCommandName("org.eclipse.ui.edit.text.zoomIn")); //  //$NON-NLS-1$
 * DBeaver - Universal Database Manager
package org.jkiss.dbeaver.ui.controls.resultset.handler;
}
 *
    @Override
/*
 * limitations under the License.
 *

