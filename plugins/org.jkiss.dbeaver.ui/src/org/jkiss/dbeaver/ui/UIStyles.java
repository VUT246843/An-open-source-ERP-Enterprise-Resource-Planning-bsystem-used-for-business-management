    public static boolean isDarkTheme() {
        }
    /**
        String fgRGB = preferenceStore == null ? null : preferenceStore.getString(id);
        return p;
        return getDefaultTextColor("AbstractTextEditor.Color.Foreground", SWT.COLOR_LIST_FOREGROUND);
        float g = color.getGreen() / 255f;
        }
import org.eclipse.swt.widgets.Display;
    }
    @NotNull
    public static Color getDefaultWidgetBackground() {
            (int) (g * 255),
            s = (max - min) / (2 - max - min);
        return color;
import org.eclipse.swt.graphics.Color;
        }
        return getDefaultTextColor("AbstractTextEditor.Color.SelectionBackground", SWT.COLOR_LIST_SELECTION);
        org.eclipse.e4.ui.css.swt.theme.ITheme theme = null;
                        IThemeManager manager = context.getService(ref);
    @NotNull

import org.jkiss.code.NotNull;
    }
     */
import org.eclipse.jface.preference.IPreferenceStore;
    public static Color getDefaultTextColor(String id, int defSWT) {
    public static synchronized IPreferenceStore getEditorsPreferenceStore() {
        if (EDITORS_PREFERENCE_STORE == null) {
    public static Color getErrorTextForeground() {
        return new float[] {h, s, l};
        double luminance = 1 - (0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue()) / 255;
/*

public class UIStyles {
            return isDarkTheme() ? COLOR_WHITE_DARK : COLOR_WHITE;
        }
            Math.round(b2 + ((b1 - b2) * weight)),
        return toRGB(hsl[0], hsl[1], l, color.getAlpha() / 255f);
     * @param s saturation is specified as a percentage in the range 1 - 100.
        }
    }
            Math.round(r2 + ((r1 - r2) * weight)),
    }
 * You may obtain a copy of the License at
            return COLOR_BLACK;
     * @return an array containing HSL values: [Hue, Saturation, Luminance]
            (int) (r * 255),
    }
        var l = hsl[2] - amount;
            (int) (b * 255),
     * Convert an RGB Color to HSL values.
            if (toolbar != null && !toolbar.isDisposed()) {
            }
     */
    public static Color toRGB(float h, float s, float l, float alpha) {
    private static final String THEME_HIGH_CONTRAST_ID = "org.eclipse.e4.ui.css.theme.high-contrast";
        float b = Math.max(0, hueToRGB(p, q, h - (1f / 3f)));
import org.jkiss.dbeaver.Log;
    public static Color mix(@NotNull Color color1, @NotNull Color color2, float weight) {
    }
        int r2 = color2.getRed();
        int a2 = color2.getAlpha();
        if (weight >= 1) {
                theme = themeEngine.getActiveTheme();
        if (luminance > 0.5) {

 * limitations under the License.
    static final Color COLOR_WHITE_DARK = new Color(null, 192, 192, 192);
            h += 1;

        }
        IPreferenceStore preferenceStore = getEditorsPreferenceStore();
 * you may not use this file except in compliance with the License.
    public static Color getInvertedColor(Color color) {
            return color1;
import org.osgi.framework.ServiceReference;
            }
import org.osgi.framework.FrameworkUtil;
        // https://github.com/JFormDesigner/FlatLaf/blob/34b19f00e4488292f5dd7869205d41982bed317a/flatlaf-core/src/main/java/com/formdev/flatlaf/util/ColorFunctions.java#L38
        float h = 0;
        int b2 = color2.getBlue();
import org.osgi.framework.BundleContext;
            h = ((60 * (g - b) / (max - min)) + 360) % 360;

    public static final Color COLOR_WHITE = new Color(null, 255, 255, 255);
import org.eclipse.ui.internal.IWorkbenchThemeConstants;
        // https://github.com/JFormDesigner/FlatLaf/blob/34b19f00e4488292f5dd7869205d41982bed317a/flatlaf-core/src/main/java/com/formdev/flatlaf/util/ColorFunctions.java#L133C1-L156C3
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    public static void fixToolBarForeground(@NotNull Collection<ToolBarManager> toolbarManagers) {
        // https://github.com/JFormDesigner/FlatLaf/blob/34b19f00e4488292f5dd7869205d41982bed317a/flatlaf-core/src/main/java/com/formdev/flatlaf/util/HSLColor.java#L409
        return toRGB(hsl[0], hsl[1], l, color.getAlpha() / 255f);

            h = 0;
        return false;
            for (ToolItem item : toolBar.getItems()) {
import org.eclipse.swt.SWT;
        return isHighContrastTheme() && UIUtils.isDark(getDefaultWidgetBackground().getRGB());
     * Saturation and Luminance are specified as percentages in the range 0 - 1.
    static IThemeEngine themeEngine = null;
import org.eclipse.jface.action.ToolBarManager;
     *
        float r = Math.max(0, hueToRGB(p, q, h + (1f / 3f)));
    }
     * @param l luminance is specified as a percentage in the range 1 - 100.
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
            Color textColor = getDefaultTextForeground();
            return p + (q - p) * 6 * (2f / 3f - h);
     * Convert HSL values to an RGB Color.
    public static boolean isHighContrastTheme() {
        }
        if (max == min) {
    
                item.setForeground(textColor);
        float q;
import org.jkiss.utils.CommonUtils;
import org.eclipse.core.runtime.preferences.InstanceScope;
    public static void fixToolBarForeground(@NotNull ToolBar toolBar) {
            }
        l = Math.clamp(l, 0f, 1f);
        } else if (max == r) {

        if (theme != null) {
        b = Math.min(b, 1f);
    }
        var hsl = toHSL(color);
        if (!toolBar.isDisposed()) {
        return getDefaultTextColor("AbstractTextEditor.Color.Background", SWT.COLOR_LIST_BACKGROUND);
        return EDITORS_PREFERENCE_STORE;
        }

     * Fixes toolbars foreground colors on macOS to ensure proper text visibility
                        }
    public static boolean isDarkHighContrastTheme() {

    }

        if (color == null) {
        );
            ToolBar toolbar = toolbarManager.getControl();
        float l = (max + min) / 2;
    private static final Log log = Log.getLog(UIStyles.class);
        }
        if (color1.equals(color2)) {
    static final Color COLOR_BLACK = new Color(null, 0, 0, 0);
import org.osgi.framework.Bundle;
     */

                }
    public static Color getContrastColor(Color color) {
 * Unless required by applicable law or agreed to in writing, software
    public static Color darken(@NotNull Color color, float amount) {
        if (themeEngine != null) {
        }
 */
        } else {

    }

            if (themeEngine != null) {
        if (!RuntimeUtils.isMacOS()) {
        float p = 2 * l - q;
            s = 0;
            return q;
        var l = hsl[2] + amount;
        float min = Math.min(r, Math.min(g, b));
     * Hue is specified as degrees in the range 0 - 360.
    @NotNull
     * Calculate the Contrast color based on Luma(brightness)
            }

        }
        } else {
            Math.round(a2 + ((a1 - a2) * weight))
        if (3 * h < 2) {
        if (max == min) {
            return color2;

package org.jkiss.dbeaver.ui;


            theme = themeEngine.getActiveTheme(); 
        return COLOR_BLACK;
    private static IThemeEngine getThemeEngine() {
        }

    }
        h = h % 360f / 360f;
        return new Color(
}
    @NotNull
        return getDefaultTextColor("AbstractTextEditor.Error.Color.Foreground", SWT.COLOR_RED);
    }
     *
    
        float s;
        );
        return getDefaultTextColor("AbstractTextEditor.Color.SelectionForeground", SWT.COLOR_LIST_SELECTION_TEXT);
    /**
     */
        } else {
        var hsl = toHSL(color);
            if (bundle != null) {
 *
            q = (l + s) - (s * l);
    }
 * See the License for the specific language governing permissions and

            h -= 1;
            Math.round(g2 + ((g1 - g2) * weight)),
        return new Color(

            return color1;
        float max = Math.max(r, Math.max(g, b));
import org.eclipse.ui.preferences.ScopedPreferenceStore;
            h = (60 * (b - r) / (max - min)) + 120;
import org.eclipse.ui.PlatformUI;
            return theme.getId().equals(THEME_HIGH_CONTRAST_ID);
import org.eclipse.swt.widgets.ToolItem;
                BundleContext context = bundle.getBundleContext();
                            themeEngine = manager.getEngineForDisplay(Display.getDefault());
        return CommonUtils.isEmpty(fgRGB) ? Display.getDefault().getSystemColor(defSWT) : UIUtils.getSharedColor(fgRGB);
        return new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
     * Do not dispose returned color.
        if (h > 1) {
        alpha = Math.clamp(alpha, 0f, 1f);
        return themeEngine;
    }

import org.eclipse.e4.ui.css.swt.theme.IThemeManager;

    public static Color lighten(@NotNull Color color, float amount) {
import org.eclipse.ui.themes.ITheme;
    }
        }



    }
    static IPreferenceStore EDITORS_PREFERENCE_STORE;
        }
            toolBar.setForeground(textColor);
     * <br>
        r = Math.min(r, 1f);
import java.util.Collection;
        g = Math.min(g, 1f);
                    if (ref != null) {
        if (h < 0) {


     * https://en.wikipedia.org/wiki/Luma_(video)
        } else if (max == g) {
        int a1 = color1.getAlpha();
     * @param color the RGB color
     * @return the RGB color
        // https://github.com/JFormDesigner/FlatLaf/blob/34b19f00e4488292f5dd7869205d41982bed317a/flatlaf-core/src/main/java/com/formdev/flatlaf/util/ColorFunctions.java#L52
    public static Color getDefaultTextForeground() {
        if (2 * h < 1) {
 *

        ITheme theme = UIUtils.getCurrentTheme();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                fixToolBarForeground(toolbar);
                if (context != null) {
import org.eclipse.e4.ui.css.swt.internal.theme.BootstrapTheme3x;
        if (l < 0.5) {

        s = Math.clamp(s, 0f, 1f);
    public static Color getDefaultTextBackground() {

        // https://github.com/JFormDesigner/FlatLaf/blob/34b19f00e4488292f5dd7869205d41982bed317a/flatlaf-core/src/main/java/com/formdev/flatlaf/util/HSLColor.java#L362
    /**
            Bundle bundle = FrameworkUtil.getBundle(BootstrapTheme3x.class);
            return;
        if (6 * h < 1) {
    }
    public static Color getDefaultTextSelectionForeground() {
            s = (max - min) / (max + min);

            (int) (alpha * 255)
        int r1 = color1.getRed();
/**
            themeEngine = PlatformUI.getWorkbench().getService(IThemeEngine.class);
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;
        return UIUtils.isDark(getDefaultTextBackground().getRGB()) || isDarkHighContrastTheme();
    }
import org.jkiss.dbeaver.utils.RuntimeUtils;
            color = Display.getCurrent().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND);

        float r = color.getRed() / 255f;
            h = (60 * (r - g) / (max - min)) + 240;
    /**

                    ServiceReference<IThemeManager> ref = context.getServiceReference(IThemeManager.class);
 * UI Utils
        int g2 = color2.getGreen();
        if (themeEngine == null) {

        float g = Math.max(0, hueToRGB(p, q, h));
        int b1 = color1.getBlue();
            EDITORS_PREFERENCE_STORE = new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.eclipse.ui.editors");
        }

        Color color = theme.getColorRegistry().get(IWorkbenchThemeConstants.INACTIVE_TAB_BG_START);
 * DBeaver - Universal Database Manager
    }
        float b = color.getBlue() / 255f;
        IThemeEngine themeEngine = getThemeEngine();
        if (color == null) {
 */
                        if (manager != null) {
    }
        }

    }
        }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others
                    }
        // https://github.com/JFormDesigner/FlatLaf/blob/34b19f00e4488292f5dd7869205d41982bed317a/flatlaf-core/src/main/java/com/formdev/flatlaf/util/HSLColor.java#L260


        if (weight <= 0) {
    public static Color getDefaultTextSelectionBackground() {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");

    public static float[] toHSL(@NotNull Color color) {

        } else if (max == b) {
            q = l * (1 + s);
        int g1 = color1.getGreen();
        }
            return p + ((q - p) * 6 * h);
import org.eclipse.swt.widgets.ToolBar;
     * @param h hue is specified as degrees in the range 0 - 360.
        for (ToolBarManager toolbarManager : toolbarManagers) {
        } else if (l <= .5f) {
    private static float hueToRGB(float p, float q, float h) {
        }
     *
