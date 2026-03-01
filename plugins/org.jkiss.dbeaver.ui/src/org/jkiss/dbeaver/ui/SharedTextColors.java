    public void dispose() {
            colorTable = fDisplayTable.get(display);
    }
    }

        synchronized (rgbMap) {
        synchronized (fDisplayTable) {

 *
        return getColor(rgb);

        dispose(fDisplayTable.remove(display));
                rgb = StringConverter.asRGB(rgbString);
            return;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and

                rgbMap.put(rgbString, rgb);
 * Unless required by applicable law or agreed to in writing, software

    private void dispose(Map<RGB, Color> colorTable) {
        RGB rgb;
        }
import org.eclipse.swt.graphics.RGB;
        if (display == null) {
        for (Color color : colorTable.values()) {

        if (color == null) {
 *
            rgb = rgbMap.get(rgbString);
/*
    public Color getColor(@NotNull RGB rgb) {
    public Color getColor(String rgbString) {
    private void dispose(Display display) {
        Color color = colorTable.get(rgb);
import org.jkiss.code.NotNull;
 */
import java.util.HashMap;
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at
        }
    /**
    }
 * limitations under the License.
            }
    @NotNull

    }
                fDisplayTable.put(curDisplay, colorTable);
            color.dispose();

        Map<RGB, Color> colorTable;
        }

            dispose(rgbColorMap);
        colorTable.clear();
 *     http://www.apache.org/licenses/LICENSE-2.0
        return color;
    @Override
    }
    }
package org.jkiss.dbeaver.ui;
        super();
    private final Map<Display, Map<RGB, Color>> fDisplayTable = new HashMap<>();

        final Display curDisplay = display;

    public static final RGB COLOR_WARNING = new RGB(0xFF, 0x63, 0x47);
 *
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.widgets.Display;
     * The display table.

        }
            color = new Color(curDisplay, rgb);
        }
            if (colorTable == null) {
        for (Map<RGB, Color> rgbColorMap : fDisplayTable.values()) {
 * distributed under the License is distributed on an "AS IS" BASIS,

                colorTable = new HashMap<>(10);
            if (rgb == null) {

}
        fDisplayTable.clear();
import org.eclipse.jface.text.source.ISharedTextColors;
    @Override
import org.eclipse.swt.graphics.Color;
    private final Map<String, RGB> rgbMap = new HashMap<>();
        if (colorTable == null)
            colorTable.put(rgb, color);
            }
        }
    @NotNull
     */
 * Licensed under the Apache License, Version 2.0 (the "License");
            display = Display.getDefault();

public class SharedTextColors implements ISharedTextColors {
 * Copyright (C) 2010-2024 DBeaver Corp and others

    public SharedTextColors() {
                display.disposeExec(() -> dispose(curDisplay));
import java.util.Map;
        Display display = Display.getCurrent();
