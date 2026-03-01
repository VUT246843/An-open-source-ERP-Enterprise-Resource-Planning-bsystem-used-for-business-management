 */
    public AbstractPartRenderer getRenderer(MUIElement uiElement, Object parent) {
    public DBeaverRendererFactory() {
        return super.getRenderer(uiElement, parent);
                stackRenderer = new DBeaverStackRenderer();
    private DBeaverStackRenderer stackRenderer;
    }
                super.initRenderer(stackRenderer);
import org.eclipse.e4.ui.workbench.renderers.swt.WorkbenchRendererFactory;
 *
 * limitations under the License.
/*
 * DBeaver - Universal Database Manager
            if (stackRenderer == null) {
    }
        if (uiElement instanceof MPartStack) {
 *     http://www.apache.org/licenses/LICENSE-2.0

}public class DBeaverRendererFactory extends WorkbenchRendererFactory {
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.eclipse.e4.ui.model.application.ui.MUIElement;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
            }
    @Override
 *
import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
            return stackRenderer;

package org.jkiss.dbeaver.ui.e4;
 * See the License for the specific language governing permissions and

        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
