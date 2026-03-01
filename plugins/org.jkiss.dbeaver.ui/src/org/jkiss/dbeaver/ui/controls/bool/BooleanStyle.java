 * you may not use this file except in compliance with the License.


    @NotNull
    ) {
    private final String text;
        Assert.isLegal(mode != BooleanMode.ICON || (text == null && icon != null && fontStyle == null && color == null),
    private final BooleanMode mode;
import org.jkiss.dbeaver.model.DBIcon;
        return mode;
}
 * limitations under the License.

        Assert.isLegal(mode == BooleanMode.TEXT);
import org.jkiss.code.NotNull;
    }
        this.color = color;

    @NotNull
    ) {
    }
        @NotNull UIElementFontStyle font

    @NotNull
        Assert.isLegal(mode != BooleanMode.TEXT || (text != null && icon == null && fontStyle != null && color != null),
        this.alignment = alignment;

import org.jkiss.dbeaver.ui.UIElementFontStyle;
 * Unless required by applicable law or agreed to in writing, software
        return color;
    public BooleanMode getMode() {
        @Nullable RGB color
    public String getText() {
    private final UIElementAlignment alignment;
package org.jkiss.dbeaver.ui.controls.bool;
    public UIElementFontStyle getFontStyle() {
        @Nullable String text,
 * Copyright (C) 2010-2025 DBeaver Corp and others
    @NotNull
    private final UIElementFontStyle fontStyle;
 */
        this.fontStyle = fontStyle;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * DBeaver - Universal Database Manager
        @NotNull BooleanMode mode,

    }
    @NotNull
    @NotNull
    }
        @NotNull UIElementAlignment alignment
        @NotNull UIElementAlignment alignment,
        @NotNull UIElementAlignment alignment,
        return new BooleanStyle(BooleanMode.ICON, null, icon, alignment, null, null);
        return text;
    @NotNull
    private final RGB color;
/*
import org.jkiss.dbeaver.ui.UIElementAlignment;
    }
    }
        return icon;
        Assert.isLegal(mode == BooleanMode.TEXT);
import org.eclipse.swt.graphics.RGB;
    public RGB getColor() {
    private BooleanStyle(
            "Only text, color and font must be present in text style");

        Assert.isLegal(mode == BooleanMode.ICON);
 * Licensed under the Apache License, Version 2.0 (the "License");
            "Only icon must be present in icon style");
        this.text = text;
    public static BooleanStyle usingText(
    ) {
 * See the License for the specific language governing permissions and
 *
        this.icon = icon;
 *
    @NotNull
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        return fontStyle;
 * distributed under the License is distributed on an "AS IS" BASIS,
        @Nullable DBIcon icon,


        @Nullable UIElementFontStyle fontStyle,
    private final DBIcon icon;
        @NotNull String text,
 *
    public DBIcon getIcon() {
    }
        this.mode = mode;
        return new BooleanStyle(BooleanMode.TEXT, text, null, alignment, font, color);
        @NotNull DBIcon icon,
import org.eclipse.core.runtime.Assert;
        @NotNull RGB color,
    public static BooleanStyle usingIcon(
        return alignment;
public class BooleanStyle {
    }
        Assert.isLegal(mode == BooleanMode.TEXT);
 * You may obtain a copy of the License at
    public UIElementAlignment getAlignment() {
import org.jkiss.code.Nullable;
