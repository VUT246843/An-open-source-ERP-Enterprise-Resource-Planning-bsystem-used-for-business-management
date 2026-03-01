        if (CommonUtils.isEmpty(t)) {
    /**
     * and then disposes it afterward.

            return ""; //$NON-NLS-1$
        int s = pivot;
/**
            e++;
        }
     * {@link org.eclipse.swt.graphics.GC#textExtent(String)}.
     * @param t     text to modify.
     * @param width Pixels to display.
import org.eclipse.swt.graphics.GC;
        int l = text.length();
     * @param width       Pixels to display.
        try {
        }
    }
        if (l > 500) {
        if (s == 0 || e == l) {
        }
            s--;

        while (s >= 0 && e < l) {
     * to the end of the string. The width is computed using the
     * Shortens a supplied string so that it fits within the area specified by

    /**
    public static String getShortText(@NotNull Drawable drawable, @NotNull String text, int width) {

     * This method creates a new {@link GC} from a given {@code drawable} object
            return t;
            length = (float) width / avgCharWidth;
     * to the end of the string. The width is computed using the
        int w = gc.textExtent("...").x;
 *
            return t;
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
     * Text shorten removed due to awful algorithm (it works really slow on long strings).
 * you may not use this file except in compliance with the License.
     * <p>
import org.jkiss.utils.CommonUtils;
            UIUtils.dispose(gc);
     * <p/>
            length *= 2; // In case of big number of narrow characters
        if (width >= gc.textExtent(t).x) {
        }
                break;
    }
}
                text = s1 + " ... " + s2;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }

import org.eclipse.swt.graphics.Drawable;
     * @see #getShortText(GC, String, int)
 * DBeaver - Universal Database Manager
            if (length < t.length()) {
     * <p>

     * the width argument. Strings that have been shorted have an "..." attached

     * Shortens a supplied string so that it fits within the area specified by

            l = 500; // Performance issue fix

 *
     *
     * @param fontMetrics fontMetrics used to perform calculation.
        double avgCharWidth = fontMetrics.getAverageCharacterWidth();
 * limitations under the License.
 * Copyright (C) 2010-2026 DBeaver Corp and others
     */
    public static String getShortText(GC gc, String t, int width) {
            return getShortText(gc, text, width);
     * the width argument. Strings that have been shorted have an "..." attached
/*
     * {@link org.eclipse.swt.graphics.GC#textExtent(String)}.
     * @return shortened string that fits in area specified.
        final GC gc = new GC(drawable);
     * {@link org.eclipse.swt.graphics.GC#stringExtent(String)}.
     * This method should not be used for real-time rendering.
     * to the end of the string. The width is computed using the
import org.jkiss.code.NotNull;
package org.jkiss.dbeaver.ui;
            int l1 = gc.textExtent(s1).x;
            }
     * the width argument. Strings that have been shorted have an "..." attached
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
        String text = t;
 *

     */
        }
        //        return t;

            String s2 = text.substring(e, l);
        }
        }
        return t;
            return t;
            String s1 = text.substring(0, s);
        }
        if (CommonUtils.isEmpty(t)) {
     * TODO: make something better
     * @param gc    GC used to perform calculation.
        int e = pivot + 1;
import org.eclipse.swt.graphics.FontMetrics;
        int pivot = l / 2;

                t = t.substring(0, (int) length);
            text = text.charAt(0) + "..." + text.charAt(l - 1);
 * distributed under the License is distributed on an "AS IS" BASIS,
        return text;
        }
     *
     * @param t           text to modify.
    @NotNull
 * You may obtain a copy of the License at
 */
            if (l1 + w + l2 < width) {
        } finally {
    public static String getShortString(FontMetrics fontMetrics, String t, int width) {
        double length = t.length();
        if (width < length * avgCharWidth) {
public class UITextUtils {
        if (width <= 1) {

     * Shortens a supplied string so that it fits within the area specified by
     */
     *
            int l2 = gc.textExtent(s2).x;

 * Text utils
 * Unless required by applicable law or agreed to in writing, software
     * @return shortened string that fits in area specified.
                //return getShortText(gc, t, width);
    /**
