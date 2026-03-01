        }
 * Copyright (C) 2010-2024 DBeaver Corp and others

 *

public class UIColors {
 * DBeaver - Universal Database Manager
import org.eclipse.swt.graphics.Color;
package org.jkiss.dbeaver.ui;
 * limitations under the License.

}

 * You may obtain a copy of the License at
        new RGB(157, 214, 245),
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * See the License for the specific language governing permissions and
    }
 * ERD constants
    public static Color getColor(int index) {
        return UIUtils.getSharedColor(extraDsColors[index]);
    public static final RGB[] EXTRA_DS_COLORS = new RGB[] {
        new RGB(119, 206, 130),
/**
        new RGB(206, 63, 34),
 *
    };
        new RGB(242, 132, 35),
        new RGB(249, 214, 205)
import org.eclipse.swt.graphics.RGB;
        RGB[] extraDsColors = UIColors.EXTRA_DS_COLORS;
 */
        new RGB(173, 140, 127),


 * Unless required by applicable law or agreed to in writing, software
        if (index >= extraDsColors.length) {
            index = index % extraDsColors.length;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Licensed under the Apache License, Version 2.0 (the "License");
        new RGB(124, 38, 19),
/*
 */
