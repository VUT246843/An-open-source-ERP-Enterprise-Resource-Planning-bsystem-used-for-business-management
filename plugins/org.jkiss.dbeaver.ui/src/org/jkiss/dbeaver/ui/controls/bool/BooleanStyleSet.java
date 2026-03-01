    }
    @NotNull

 * DBeaver - Universal Database Manager
import org.jkiss.utils.CommonUtils;
            store.setValue(namespace + PROP_COLOR, convertColorToString(style.getColor(), defaultColor));
import org.eclipse.core.runtime.Assert;
        @NotNull RGB defaultColor
import org.eclipse.ui.PlatformUI;
        return new BooleanStyleSet(
            );
                state.choose("☑", "☐", "☒"),
            "Mixed style modes");
                getDefaultStyle(store, mode, BooleanState.CHECKED, defaultColor),
            );
    }
        return checkedStyle.getMode();
 * Copyright (C) 2010-2025 DBeaver Corp and others
                UIElementAlignment.class,
        };
        } else {
    public BooleanStyle getCheckedStyle() {
import org.eclipse.swt.widgets.Control;
                UIElementAlignment.class,
        final RGB defaultColor = UIStyles.getDefaultTextForeground().getRGB();
            default -> BooleanStyle.usingText(
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;
    private static final String PROP_LEGACY_STYLE_TRUE_FALSE = "TRUE_FALSE";
import org.jkiss.dbeaver.ui.UIIcon;
            color,
    private static final String PROP_LEGACY_STYLE_TEXTBOX = "TEXTBOX";


    public static BooleanStyleSet getDefaultStyles(@NotNull DBPPreferenceStore store) {
 * You may obtain a copy of the License at
    private static final String PROP_TEXT = "text";
 * Licensed under the Apache License, Version 2.0 (the "License");
        return BooleanStyle.usingText(state.choose(
        final BooleanMode mode = CommonUtils.valueOf(BooleanMode.class, store.getString(PREF_BOOLEAN_STYLE + ".mode"));
        DBWorkbench.getPlatform().getPreferenceStore().addPropertyChangeListener(preferenceListener);
        final DBPPreferenceListener preferenceListener = e ->
        @NotNull BooleanState state,
        this.defaultColor = defaultColor;
                getDefaultStyleLegacy(store, BooleanState.UNCHECKED, defaultColor),

    @NotNull
        return checkedStyle;
                UIElementAlignment.CENTER,

    private static BooleanStyle getDefaultStyle(
     * Default styles set for default preferences
/*
                UIElementFontStyle.NORMAL
                getDefaultStyle(store, mode, BooleanState.NULL, defaultColor),
            "[ ]",
            );
    public static BooleanStyleSet getDefaultStyles(@NotNull DBPPreferenceStore store, @Nullable BooleanMode mode) {
                UIElementAlignment.CENTER,
        setDefaultStyle(store, set.getNullStyle(), BooleanState.NULL, set.getDefaultColor());
    private static BooleanStyle getDefaultStyle(@NotNull BooleanState state, @NotNull RGB color) {
import org.jkiss.dbeaver.ui.UIStyles;
    public static void installStyleChangeListener(@NotNull Control control, @NotNull IPropertyChangeListener listener) {
    }
                store.getString(namespace + PROP_FONT),
    @NotNull
        }
        });
    @NotNull
    }
            case PROP_LEGACY_STYLE_TRUE_FALSE -> BooleanStyle.usingText(
        } else {
                state.choose("[v]", "[ ]", DBConstants.NULL_VALUE_LABEL),
            );
    @NotNull
    }
                getDefaultStyleLegacy(store, BooleanState.CHECKED, defaultColor),

    private final RGB defaultColor;
 * distributed under the License is distributed on an "AS IS" BASIS,
                store.getString(namespace + PROP_ALIGN),
    private static final String PROP_LEGACY_STYLE_CHECKBOX = "CHECKBOX";
                UIElementFontStyle.NORMAL
    private final BooleanStyle uncheckedStyle;
        this.uncheckedStyle = uncheckedStyle;
        setDefaultStyle(store, set.getCheckedStyle(), BooleanState.CHECKED, set.getDefaultColor());
    }
    @NotNull
        return state.choose(checkedStyle, uncheckedStyle, nullStyle);
    }
        final String namespace = PREF_BOOLEAN_STYLE + '.' + state.getId() + '.';
 * Unless required by applicable law or agreed to in writing, software
            return new BooleanStyleSet(
            DBWorkbench.getPlatform().getPreferenceStore().removePropertyChangeListener(preferenceListener);
        return COLOR_DEFAULT.equals(color) ? defaultColor : StringConverter.asRGB(color, defaultColor);
 *
            store.setValue(namespace + PROP_ALIGN, style.getAlignment().name());
            .getGlobalDataSourcePreferenceStore().addPropertyChangeListener(preferenceListener);
                .getGlobalDataSourcePreferenceStore().removePropertyChangeListener(preferenceListener);
}
    /**
        final RGB defaultColor = UIStyles.getDefaultTextForeground().getRGB();
    private static final String PROP_FONT = "font";

            store.setValue(namespace + PROP_ALIGN, style.getAlignment().name());
    private static final String PROP_LEGACY_STYLE_ICON = "ICON";

    }
    public static BooleanStyleSet getDefaultStyleSet() {
    public BooleanStyle getStyle(@NotNull BooleanState state) {
    public BooleanStyle getStyle(@Nullable Boolean value) {
        if (mode != null) {
import org.eclipse.jface.util.PropertyChangeEvent;

    @NotNull
                UIElementFontStyle.NORMAL

        } else {
import org.jkiss.code.NotNull;
     */
            store.setValue(namespace + PROP_TEXT, style.getText().trim());
                defaultColor

                UIElementAlignment.CENTER,
                color,
    public BooleanStyle getNullStyle() {
        @NotNull DBPPreferenceStore store,

            defaultColor

            );
    public BooleanMode getMode() {
import org.jkiss.code.Nullable;

            DBWorkbench.getPlatform().getDataSourceProviderRegistry()
    }
    private final BooleanStyle nullStyle;
            );
        setDefaultStyle(store, set.getUncheckedStyle(), BooleanState.UNCHECKED, set.getDefaultColor());
        Assert.isLegal(checkedStyle.getMode() == uncheckedStyle.getMode() && uncheckedStyle.getMode() == nullStyle.getMode(),
        @NotNull DBPPreferenceStore store,
            listener.propertyChange(new PropertyChangeEvent(e.getSource(), e.getProperty(), e.getOldValue(), e.getNewValue()));
    ) {
        @NotNull BooleanStyle nullStyle,

import org.eclipse.jface.util.IPropertyChangeListener;
 *
import org.jkiss.dbeaver.model.DBConstants;
        @NotNull BooleanState state,
            final UIElementAlignment alignment = CommonUtils.valueOf(
 * See the License for the specific language governing permissions and
                state.choose("true", "false", DBConstants.NULL_VALUE_LABEL),
            final UIElementFontStyle font = CommonUtils.valueOf(
        return nullStyle;
            getDefaultStyle(BooleanState.NULL, defaultColor),
            PlatformUI.getWorkbench().getThemeManager().removePropertyChangeListener(listener);
            final RGB color = convertStringToColor(store.getString(namespace + PROP_COLOR), defaultColor);
 *     http://www.apache.org/licenses/LICENSE-2.0
    @NotNull
    private static void setDefaultStyle(
    @NotNull
    private static final String PROP_LEGACY_STYLE_YES_NO = "YES_NO";
                state.choose(UIIcon.CHECK_ON, UIIcon.CHECK_OFF, UIIcon.CHECK_QUEST),
 * limitations under the License.
        @NotNull BooleanStyle uncheckedStyle,

                UIElementAlignment.CENTER,
        final String namespace = PREF_BOOLEAN_STYLE + '.' + state.getId() + '.';
                getDefaultStyleLegacy(store, BooleanState.NULL, defaultColor),

            case PROP_LEGACY_STYLE_CHECKBOX -> BooleanStyle.usingText(
    private static final String PROP_COLOR = "color";
import org.jkiss.dbeaver.ui.UIElementAlignment;
            UIElementAlignment.CENTER,

 *
 * you may not use this file except in compliance with the License.
        return uncheckedStyle;
        return getDefaultStyles(store, mode);
    public BooleanStyleSet(
        @NotNull BooleanStyle style,
            );
        DBWorkbench.getPlatform().getDataSourceProviderRegistry()
            );
    private static final String PROP_ALIGN = "align";
    @NotNull
                state.choose("yes", "no", DBConstants.NULL_VALUE_LABEL),

                getDefaultStyle(store, mode, BooleanState.UNCHECKED, defaultColor),
 */

                UIElementAlignment.CENTER
            );

            final String text = store.getString(namespace + PROP_TEXT);
    ) {
    @NotNull

        control.addDisposeListener(e -> {
    }
    }
                color,
    }
        return defaultColor;
    /* For backward compatibility with previous versions. Maps old presets into new style. */

            );
                defaultColor
import org.eclipse.swt.graphics.RGB;
    private static final String COLOR_DEFAULT = "default";
            UIElementFontStyle.NORMAL);
        return color == defaultColor ? COLOR_DEFAULT : StringConverter.asString(color);
            getDefaultStyle(BooleanState.CHECKED, defaultColor),
            return BooleanStyle.usingIcon(state.getIcon(), alignment);
    }
            case PROP_LEGACY_STYLE_YES_NO -> BooleanStyle.usingText(
    @NotNull
        @NotNull BooleanStyle checkedStyle,
     *
            return new BooleanStyleSet(
    }
    private final BooleanStyle checkedStyle;
    }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
        @NotNull RGB defaultColor
import org.jkiss.dbeaver.ui.UIElementFontStyle;
        }

            store.setValue(namespace + PROP_FONT, style.getFontStyle().name());
package org.jkiss.dbeaver.ui.controls.bool;
            final UIElementAlignment alignment = CommonUtils.valueOf(
    }
    public static void setDefaultStyles(@NotNull DBPPreferenceStore store, @NotNull BooleanStyleSet set) {
        this.nullStyle = nullStyle;

                store.getString(namespace + PROP_ALIGN),

        if (mode == BooleanMode.TEXT) {
        @NotNull BooleanMode mode,
                UIElementAlignment.CENTER
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class BooleanStyleSet {

    private static RGB convertStringToColor(@NotNull String color, @NotNull RGB defaultColor) {
        return switch (CommonUtils.toString(store.getString(PREF_BOOLEAN_STYLE), PROP_LEGACY_STYLE_TRUE_FALSE)) {
        }

import org.jkiss.dbeaver.runtime.DBWorkbench;
        return value == null ? nullStyle : value ? checkedStyle : uncheckedStyle;
                color,
                UIElementFontStyle.NORMAL
    private static final String PREF_BOOLEAN_STYLE = "ui.render.boolean.style";
        if (style.getMode() == BooleanMode.TEXT) {
    }
            case PROP_LEGACY_STYLE_ICON -> BooleanStyle.usingIcon(

    }
        @NotNull RGB defaultColor
        store.setValue(PREF_BOOLEAN_STYLE + '.' + PROP_MODE, set.getMode().name());
                UIElementFontStyle.class,
    private static BooleanStyle getDefaultStyleLegacy(@NotNull DBPPreferenceStore store, @NotNull BooleanState state, @NotNull RGB color) {
                UIElementAlignment.CENTER
            "[v]",
                color,
        );
     * @return Default styles set
            getDefaultStyle(BooleanState.UNCHECKED, defaultColor),
        PlatformUI.getWorkbench().getThemeManager().addPropertyChangeListener(listener);
    }
                UIElementFontStyle.NORMAL
    private static String convertColorToString(@NotNull RGB color, @NotNull RGB defaultColor) {
    ) {

    @NotNull
            DBConstants.NULL_VALUE_LABEL),

import org.eclipse.jface.resource.StringConverter;
    private static final String PROP_MODE = "mode";
    public RGB getDefaultColor() {
            return BooleanStyle.usingText(text.trim(), alignment, color, font);
        this.checkedStyle = checkedStyle;
    public BooleanStyle getUncheckedStyle() {
