        cell.setText(text);

import org.jkiss.utils.CommonUtils;
/*

    @Nullable
 * DBeaver - Universal Database Manager
    @Nullable
 * distributed under the License is distributed on an "AS IS" BASIS,
        return null;
import org.eclipse.swt.graphics.Font;


import java.util.ArrayList;
            }
                if (start < 0) {
 * Licensed under the Apache License, Version 2.0 (the "License");


        final List<int[]> ranges = new ArrayList<>();
        }

    public abstract String getText(Object element);
 */
import org.jkiss.code.Nullable;
 * You may obtain a copy of the License at
    }
    @NotNull
                }
            cell.setStyleRanges(ss.getStyleRanges());
                return null;
            }

                ranges.add(new int[]{start, v - start});
            for (int[] range : ranges) {
                ss.setStyle(range[0], range[1], styler);

 */
import org.jkiss.code.NotNull;
    @NotNull
    }
    @Override
/**
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        final Object element = cell.getElement();
    }
    }
    public Font getFont(Object element) {
        if (CommonUtils.isEmpty(ranges)) {
 *
        super.update(cell);
package org.jkiss.dbeaver.ui;
        } else {
import java.util.List;
    }
                p++;
 * limitations under the License.
 * See the License for the specific language governing permissions and
        return ranges;
        cell.setImage(getImage(element));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ranges = match(pattern, text);
                    start = v;
            cell.setStyleRanges(null);
        final String pattern = getPattern();
        boldFont.dispose();

    public void dispose() {
    private static List<int[]> match(@NotNull String pattern, @NotNull String value) {
    public void update(@NotNull ViewerCell cell) {
        } else {
import org.eclipse.jface.viewers.*;
    public abstract Image getImage(Object element);
public abstract class SearchCellLabelProvider extends StyledCellLabelProvider implements ILabelProvider, IFontProvider {
 *
    public abstract String getPattern();
}

    }
        if (CommonUtils.isEmpty(pattern)) {
    }
                start = -1;

            final StyledString.Styler styler = new BoldStylerProvider(getMatchFont(element)).getBoldStyler();
        final List<int[]> ranges;
        cell.setFont(getFont(element));
            } else if (start >= 0) {

    @Override
import org.eclipse.swt.widgets.Display;
        final String text = getText(element);
    protected final Font boldFont;
        }
 * you may not use this file except in compliance with the License.
    @Nullable
 * Copyright (C) 2010-2024 DBeaver Corp and others
    public SearchCellLabelProvider() {


            ranges = List.of();
 *
            if (p < pattern.length() && Character.toLowerCase(pattern.charAt(p)) == Character.toLowerCase(value.charAt(v))) {
    @Nullable
        this.boldFont = UIUtils.makeBoldFont(Display.getCurrent().getSystemFont());
 * A label provider that highlights matching parts of a label against the supplied pattern.

        return boldFont;
            }
        }
import org.eclipse.swt.graphics.Image;
    public static boolean matches(@NotNull String pattern, @NotNull String value) {
            if (p != pattern.length() && v == value.length()) {
 * Unless required by applicable law or agreed to in writing, software
        return match(pattern, value) != null;
            final StyledString ss = new StyledString(text);

        for (int p = 0, v = 0, start = -1; p <= pattern.length() && v <= value.length(); v++) {

    public Font getMatchFont(@NotNull Object element) {
