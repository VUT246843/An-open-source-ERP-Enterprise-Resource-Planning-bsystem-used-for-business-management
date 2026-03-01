    public void updateElement(UIElement element, Map parameters) {
/*

 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.ui.ActionUtils;
/**
 * DBeaver - Universal Database Manager

 *
} * Copyright (C) 2010-2024 DBeaver Corp and others

import org.eclipse.ui.menus.UIElement;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * limitations under the License.
 */
        element.setText(ActionUtils.findCommandName("org.eclipse.ui.edit.text.zoomOut")); //  //$NON-NLS-1$

 *
 * ResultSetHandlerZoomOut
    }
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
import java.util.Map;
public class ResultSetHandlerZoomOut extends ResultSetHandlerMain implements IElementUpdater {
    @Override
import org.eclipse.ui.commands.IElementUpdater;
package org.jkiss.dbeaver.ui.controls.resultset.handler;
