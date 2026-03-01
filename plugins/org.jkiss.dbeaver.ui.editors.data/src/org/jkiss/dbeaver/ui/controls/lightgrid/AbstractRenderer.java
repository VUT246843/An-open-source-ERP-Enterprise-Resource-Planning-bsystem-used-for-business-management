     */
        this.grid = grid;
import org.jkiss.dbeaver.utils.RuntimeUtils;
 *
    }

 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
 * limitations under the License.
package org.jkiss.dbeaver.ui.controls.lightgrid;
    /**
 * Abstract grid renderer
    protected AbstractRenderer(LightGrid grid) {
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
 */
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

/**
     * @return Returns the display.
 * You may obtain a copy of the License at
 *
 */

abstract class AbstractRenderer {
/*

import org.eclipse.swt.widgets.Display;
 * DBeaver - Universal Database Manager
    protected final LightGrid grid;
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
     * Sets the display for the renderer.
    public Display getDisplay()
 * See the License for the specific language governing permissions and
    static final boolean isTransparent = !RuntimeUtils.isMacOS();
 *     http://www.apache.org/licenses/LICENSE-2.0
     * 
        return grid.getDisplay();

