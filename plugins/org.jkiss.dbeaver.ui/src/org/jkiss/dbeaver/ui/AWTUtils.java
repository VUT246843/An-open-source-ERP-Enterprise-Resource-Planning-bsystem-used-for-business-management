 * distributed under the License is distributed on an "AS IS" BASIS,
    }

        try {
    public static boolean isDesktopSupported() {

            log.warn("AWT initialization error", e);
        return new Color(swtBgColor.red, swtBgColor.green, swtBgColor.blue);
}

 * Copyright (C) 2010-2025 DBeaver Corp and others
            return !GraphicsEnvironment.isHeadless() && Desktop.isDesktopSupported();
 * See the License for the specific language governing permissions and
            return false;
    private static final Log log = Log.getLog(AWTUtils.class);
 * You may obtain a copy of the License at

 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui;

    }
    public static java.awt.Color makeAWTColor(org.eclipse.swt.graphics.Color src) {
 * you may not use this file except in compliance with the License.
import java.awt.*;
 * Unless required by applicable law or agreed to in writing, software
 * DBeaver - Universal Database Manager
/*
 * limitations under the License.

import org.jkiss.dbeaver.Log;
        } catch (Throwable e) {
        org.eclipse.swt.graphics.RGB swtBgColor = src.getRGB();

        }
public class AWTUtils {
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
