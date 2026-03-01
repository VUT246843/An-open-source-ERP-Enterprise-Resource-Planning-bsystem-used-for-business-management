    protected static final String LABEL_1_TO_N = "1..n";
        label.setForegroundColor(frgColor);
    protected static final int LBL_U_DISTANCE = 3;
    protected static final int CIRCLE_RADIUS = 4;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
import org.eclipse.draw2d.Label;
 * DBeaver - Universal Database Manager
    }
 *
 *
    protected static final String LABEL_0_TO_1 = "0..1";
 * distributed under the License is distributed on an "AS IS" BASIS,
}
    protected static final String LABEL_1 = "1";
public abstract class ERDNotationBase {
    protected static final int LBL_V_DISTANCE = -4;
 */

    protected Label getLabel(String name, Color frgColor) {
        Label label = new Label(name);
        label.setFont(ERDThemeSettings.instance.notationLabelFont);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

package org.jkiss.dbeaver.ui.editors.erd.notations;
        return label;

 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
import org.eclipse.swt.graphics.Color;
 *
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDThemeSettings;

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
