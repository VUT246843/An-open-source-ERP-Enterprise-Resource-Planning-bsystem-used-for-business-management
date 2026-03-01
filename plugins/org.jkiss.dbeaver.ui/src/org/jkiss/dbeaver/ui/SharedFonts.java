            data1.getStyle() == data2.getStyle();
        return fontData.getName() + ":" + fontData.getHeight() + ":" + fontData.getStyle();
            data1.getHeight() == data2.getHeight() &&
        FontData data2 = font2.getFontData()[0];

 * Licensed under the Apache License, Version 2.0 (the "License");
        return CommonUtils.equalObjects(data1.getName(), data2.getName()) &&
                font = new Font(device, fontData);

import org.eclipse.swt.graphics.Device;
            String fontKey = toString(fontData);

 */
 *     http://www.apache.org/licenses/LICENSE-2.0
            CommonUtils.toInt(fontParts[1]),
    public static boolean equalFonts(Font font1, Font font2) {
import org.jkiss.code.NotNull;

public class SharedFonts {
        FontData data1 = font1.getFontData()[0];
/*

import org.eclipse.swt.graphics.FontData;

 *
    }
        FontData data = new FontData(
import org.jkiss.utils.CommonUtils;
 * See the License for the specific language governing permissions and

    }

        }

    @NotNull
            Font font = fontMap.get(fontKey);
    private final Map<String, Font> fontMap = new HashMap<>();
    public Font getFont(Device device, String fontData) {
    public static String toString(FontData fontData) {
    }

    }
 *
        return toString(font.getFontData()[0]);
                fontMap.put(fontKey, font);
        return getFont(device, data);
import java.util.Map;
import org.eclipse.swt.graphics.Font;
 * You may obtain a copy of the License at
        synchronized (fontMap) {
    }
            }
 * Copyright (C) 2010-2024 DBeaver Corp and others
            if (font == null) {
package org.jkiss.dbeaver.ui;

 *
 * DBeaver - Universal Database Manager
    public static String toString(Font font) {
 * Unless required by applicable law or agreed to in writing, software
    public SharedFonts() {
            CommonUtils.toInt(fontParts[2]));
import java.util.HashMap;
 * you may not use this file except in compliance with the License.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return font;
            fontParts[0],
    }
        String[] fontParts = fontData.split(":");
}
 * limitations under the License.
    public Font getFont(Device device, FontData fontData) {
 * distributed under the License is distributed on an "AS IS" BASIS,
