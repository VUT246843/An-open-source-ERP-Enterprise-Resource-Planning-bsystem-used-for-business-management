        }
                                if (event.getProperty().equals(PROP_FONT)) {
            };
/*
                    case PROP_TEXT:

                    });


            Composite group = UIUtils.createTitledComposite(composite, "Holiday decorations", 1, GridData.FILL_HORIZONTAL);
            setErrorMessage(null);

            UIUtils.createLabel(parent, UIIcon.SEPARATOR_V);
                                if (event.getNewValue() == BooleanMode.TEXT) {
            this.normalFont = parent.getFont();
                icon.setToolTipText(state.getLabel());
                                break;
                            break;
                    BooleanState.CHECKED,
                    // Modification to current text widget is already fired, so we're fine

            this.state = state;
            booleanCheckedPanel.saveStyle(),
}
    private void updateBooleanValidState() {
        setPreferenceStore(new PreferenceStoreDelegate(DBWorkbench.getPlatform().getPreferenceStore()));
                        });
        private final Font italicFont;
                    addPropertyChangeListener(event -> {
                                item.setSelection(event.getNewValue() == currentDefaultColor);
                    group,
                }
                        this.currentAlignment = (UIElementAlignment) event.getNewValue();
        private UIElementAlignment currentAlignment;
        }
import org.jkiss.utils.CommonUtils;
        return super.performOk();
                CoreMessages.pref_page_ui_general_boolean,


                return BooleanStyle.usingIcon(state.getIcon(), currentAlignment);
            booleanNullPanel.saveStyle(),
                                        break;

                3,
            return currentMode == BooleanMode.ICON || !CommonUtils.isEmptyTrimmed(currentText);
import org.eclipse.ui.IWorkbenchPreferencePage;

                    item.addSelectionListener(selectionListener);
            UIUtils.createInfoLabel(group, CoreMessages.pref_page_ui_general_label_options_take_effect_after_restart);
                                break;
    }

    @Override
            UIUtils.createControlLabel(group, CoreMessages.pref_page_ui_general_boolean_label_color);

                            case PROP_TEXT:


            }
    @Override
                            case PROP_FONT:
            BooleanStyleSet defaultStyles = BooleanStyleSet.getDefaultStyleSet();
            booleanCheckedPanel = new BooleanPanel(
                final ToolBar alignToolBar = new ToolBar(parent, SWT.HORIZONTAL);
                    });
                            selector.setEnabled(event.getNewValue() == BooleanMode.TEXT);
import org.jkiss.dbeaver.ui.controls.TextWithDropDown;
                defaultColor = value.getDefaultColor();

                        switch (event.getProperty()) {
            booleanStylesChangeListeners.add(value -> {
                    addPropertyChangeListener(event -> {
                composite,

        }
                        switch (menu.getID()) {
import org.eclipse.swt.events.SelectionListener;
                final DefaultColorSelector selector = new DefaultColorSelector(parent, false);
        public void addPropertyChangeListener(@NotNull IPropertyChangeListener listener) {
                    }

    private RGB defaultColor;
        private static final String PROP_ALIGN = "alignValue";
    }
import org.eclipse.jface.util.IPropertyChangeListener;

import org.jkiss.dbeaver.ui.controls.bool.BooleanStyle;
import org.eclipse.ui.IWorkbench;
                    BooleanState.NULL,
                        final MenuItem menu = (MenuItem) e.widget;
        for (Consumer<BooleanStyleSet> listener : booleanStylesChangeListeners) {
                                UIUtils.enableWithChildren(text, event.getNewValue() == BooleanMode.TEXT);
        public void loadStyle(@NotNull BooleanStyle style, @NotNull RGB defaultColor) {
            booleanUncheckedPanel.saveStyle(),
                    switch (event.getProperty()) {
    private BooleanPanel booleanUncheckedPanel;
                        if (event.getProperty().equals(PROP_ALIGN)) {

                button.setToolTipText(mode.getDescription());

                button.setData(mode);


            } else {
            if (currentMode == BooleanMode.TEXT) {
import org.jkiss.dbeaver.ui.*;
            parent.addDisposeListener(e -> {
                };
                                UIUtils.setControlVisible(text, event.getNewValue() == text.getData());
        } else {
                }
import java.util.function.Consumer;
        @NotNull


                                    text.getTextComponent().setText("");
            setErrorMessage(CoreMessages.pref_page_ui_general_boolean_invalid_values);
                for (UIElementAlignment alignment : UIElementAlignment.values()) {
                        return;
                    public void widgetSelected(SelectionEvent e) {
    }

                                        text.getTextComponent().setFont(boldFont);
            }
    @Override
        }
                        break;
                                }

                savedText = currentText;
        super.performDefaults();
                                notifyPropertyChanged(e.widget, PROP_COLOR, currentDefaultColor);
            this.boldFont = fontDescriptor.setStyle(SWT.BOLD).createFont(parent.getDisplay());
                    item.setImage(DBeaverIcons.getImage(alignment.getIcon()));
                                break;
                            // Color is only applicable to text-based comboboxes
                    }
                                break;
                    }
                notifyPropertyChanged(this, PROP_TEXT, "");
            UIUtils.createLabel(group, CoreMessages.pref_page_ui_general_boolean_label_state);
import org.jkiss.dbeaver.ui.controls.bool.BooleanState;

    }
            }
            {
                                notifyPropertyChanged(e.widget, PROP_FONT, menu.getData());
                            savedStyles.getStyle(BooleanState.UNCHECKED).getText() :
        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

                                text.getTextComponent().setText((String) event.getNewValue());
import org.eclipse.swt.graphics.Font;
                    });
            booleanNullPanel = new BooleanPanel(
                            }

        public void notifyPropertyChanged(@NotNull Object source, @NotNull String property, @Nullable Object value) {
        private static final int MENU_FONT_ID = 2;
        private String currentText;
    }
                                }
            );
    protected Object getConfiguratorObject() {
                for (final UIElementAlignment alignment : UIElementAlignment.values()) {
import org.jkiss.dbeaver.core.CoreMessages;
                UIUtils.dispose(boldFont);
                booleanUncheckedPanel.loadStyle(value.getUncheckedStyle(), value.getDefaultColor());
                    group,
    private void notifyBooleanStylesChanged(@NotNull BooleanStyleSet set) {
            if (style.getMode() == BooleanMode.TEXT) {
            UIUtils.createControlLabel(group, CoreMessages.pref_page_ui_general_boolean_label_text);
        notifyBooleanStylesChanged(BooleanStyleSet.getDefaultStyleSet());
                    item.setToolTipText(alignment.getLabel());
 *
        private BooleanMode currentMode;
        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();

            }
import org.jkiss.code.Nullable;
        }
                    BooleanState.UNCHECKED,
    }
            });

                                notifyPropertyChanged(e.widget, PROP_TEXT, menu.getText());
            listener.accept(set);
                        // Ignore our own event
                    for (String variant : state.getPresets()) {
        private static final int MENU_PRESET_ID = 1;
                        this.currentDefaultColor = (RGB) event.getNewValue();
 * Copyright (C) 2010-2026 DBeaver Corp and others
        public boolean isValid() {
            group.setLayout(GridLayoutFactory.swtDefaults().numColumns(7).create());
    }
                        this.currentColor = (RGB) event.getNewValue();
    private BooleanPanel booleanCheckedPanel;
 * See the License for the specific language governing permissions and
        {
                    @Override

        private final Font normalFont;

                notifyPropertyChanged(this, PROP_FONT, style.getFontStyle());
                                }
    }
        private static final String PROP_DEFAULT_COLOR = "defaultColorValue";
    @Override
        private static final String PROP_TEXT = "textValue";
                        }
                            defaultStyles.getStyle(BooleanState.CHECKED).getText()
            );
                notifyPropertyChanged(this, PROP_DEFAULT_COLOR, defaultColor);
                                        text.getTextComponent().setFont(normalFont);
                final Button button = UIUtils.createRadioButton(groupEditors, mode.getName(), mode, null);

                        }
                        if (((ToolItem) e.widget).getSelection()) {

                });
                    if (event.getSource() == selector) {
                    text.setData(alignment);


                GridData.FILL_HORIZONTAL
        ));
                    final TextWithDropDown text = new TextWithDropDown(parent, SWT.BORDER, alignment.getStyle(), menuSelectionListener);
import org.jkiss.dbeaver.ui.controls.bool.BooleanStyleSet;
        }
        private static final String PROP_FONT = "fontValue";
                                    item.setSelection(event.getNewValue() == item.getData());
import org.jkiss.dbeaver.runtime.DBWorkbench;
                @Override
            UIUtils.createControlLabel(group, CoreMessages.pref_page_ui_general_boolean_label_align);
                            final MenuItem item = text.addMenuItem(menu, value.getLabel(), null, value, SWT.RADIO);
    private BooleanPanel booleanNullPanel;
                addPropertyChangeListener(event -> {
                UIUtils.dispose(italicFont);
        private static final int MENU_RESET_COLOR_ID = 3;
            this.parent = parent;
import org.eclipse.swt.graphics.RGB;
            setValid(true);

                        final MenuItem item = text.addMenuItem(menu, CoreMessages.pref_page_ui_general_boolean_color_use_theme_color, null, null, SWT.CHECK);

        private UIElementFontStyle currentFontStyle;
    @Override
                                    case ITALIC:
                final SelectionListener menuSelectionListener = new SelectionAdapter() {
        private final BooleanState state;
                    case PROP_MODE:
            final Object[] listeners = getListeners();
                final PropertyChangeEvent event = new PropertyChangeEvent(source, property, null, value);

                                text.getTextComponent().setForeground(UIUtils.getSharedColor((RGB) event.getNewValue()));

            addListenerObject(listener);
            for (BooleanMode mode : BooleanMode.values()) {
                        }
                    text.addMenuItemWithMenu(CoreMessages.pref_page_ui_general_boolean_color, null, menu -> {
        final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                        break;
            holidayDecorationsCheck = UIUtils.createCheckbox(group, "Show holiday decorations", false);

import java.util.ArrayList;
        private static final String PROP_COLOR = "colorValue";
        injectConfigurators(composite);
                        text.addMenuItem(variant).setID(MENU_PRESET_ID);
                            savedStyles.getStyle(BooleanState.CHECKED).getText() :
        private static final String PROP_MODE = "modeValue";



import org.eclipse.swt.layout.GridData;

public class PrefPageMiscellaneous extends PrefPageMiscellaneousAbstract implements IWorkbenchPreferencePage {
                            case PROP_MODE:
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.resource.FontDescriptor;
                            item.setSelection(event.getNewValue() == item.getData());
        }
    public boolean performOk() {
            UIUtils.createPlaceholder(group, 1);
                                break;

            final FontDescriptor fontDescriptor = FontDescriptor.createFrom(parent.getFont());
            holidayDecorationsCheck.setLayoutData(new GridData());
                                break;

        public BooleanStyle saveStyle() {
                };
                    savedStyles.getStyle(BooleanState.UNCHECKED).getMode() == BooleanMode.TEXT ?
            UIUtils.createPlaceholder(group, 1);

                        case PROP_DEFAULT_COLOR:
        return composite;
                booleanStylesChangeListeners.add(value -> button.setSelection(button.getData() == value.getMode()));

        }
                                    case NORMAL:
            BooleanStyleSet savedStyles = BooleanStyleSet.getDefaultStyles(DBWorkbench.getPlatform().getPreferenceStore());

                            addPropertyChangeListener(event -> {
                    case PROP_ALIGN:
    protected Control createPreferenceContent(@NotNull Composite parent) {
            addPropertyChangeListener(event -> {
 * Licensed under the Apache License, Version 2.0 (the "License");
                        this.currentMode = (BooleanMode) event.getNewValue();
                                break;
import org.eclipse.swt.events.SelectionEvent;
                switch (event.getProperty()) {
                    case PROP_FONT:
                                    text.getTextComponent().setText(this.savedText);
                        }
                    final ToolItem item = new ToolItem(alignToolBar, SWT.RADIO);
                            // React only to 'Selection' (avoid firing secondary event to 'DefaultSelection')
            defaultColor
                                        break;
        final boolean valid = booleanCheckedPanel.isValid() && booleanUncheckedPanel.isValid() && booleanNullPanel.isValid();
                    }
            UIUtils.createControlLabel(groupEditors, CoreMessages.pref_page_ui_general_boolean_label_mode);
import org.jkiss.code.NotNull;
                    case PROP_DEFAULT_COLOR:
                                break;
                booleanCheckedPanel.loadStyle(value.getCheckedStyle(), value.getDefaultColor());
                selector.addListener(e -> notifyPropertyChanged(selector, PROP_COLOR, selector.getColorValue()));
                    savedStyles.getStyle(BooleanState.CHECKED).getMode() == BooleanMode.TEXT ?
            );
        holidayDecorationsCheck.setSelection(store.getDefaultBoolean(DBeaverPreferences.UI_SHOW_HOLIDAY_DECORATIONS));
                final ModifyListener textModifyListener = e -> {

                    text.getTextComponent().addModifyListener(textModifyListener);
                    item.setData(alignment);
            {
            final SelectionAdapter selectionListener = new SelectionAdapter() {
    private Button holidayDecorationsCheck;
        public BooleanPanel(@NotNull Composite parent, @NotNull BooleanState state, @NotNull String savedText) {
                }
                    notifyBooleanStylesChanged(BooleanStyleSet.getDefaultStyles(store, mode));
 *
        private RGB currentColor;
            }
    protected void performDefaults() {

            setValid(false);

                        break;
        private final Font boldFont;

import org.eclipse.core.commands.common.EventManager;
                                text.getTextComponent().setText(currentText);
            UIUtils.createPlaceholder(group, 1);
                        case PROP_COLOR:
                for (Object listener : listeners) {
import org.eclipse.jface.util.PropertyChangeEvent;
 */
                    text.addMenuItemWithMenu(CoreMessages.pref_page_ui_general_boolean_styles, null, menu -> {
                    final DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
                        for (UIElementFontStyle value : UIElementFontStyle.values()) {
                            selector.setDefaultColorValue((RGB) event.getNewValue());
                    ((GridData) text.getLayoutData()).widthHint = 120;


        private String savedText;
import org.eclipse.jface.layout.GridDataFactory;
                    updateBooleanValidState();
                            item.setID(MENU_FONT_ID);

                        case PROP_MODE:
    private class BooleanPanel extends EventManager {
            group.setLayoutData(GridDataFactory.swtDefaults().span(3, 1).create());
                selector.setColorValue(new RGB(0, 0, 0));
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.preferences;
    }
                        this.currentFontStyle = (UIElementFontStyle) event.getNewValue();
                        }

import org.eclipse.swt.events.ModifyListener;

                }
                    public void widgetSelected(SelectionEvent e) {
                            break;
 *
            );
            this.savedText = savedText;
 *     http://www.apache.org/licenses/LICENSE-2.0
                notifyPropertyChanged(this, PROP_COLOR, style.getColor());
            UIUtils.createLabel(parent, UIIcon.SEPARATOR_V);
                        break;
        {
import org.jkiss.dbeaver.ui.controls.bool.BooleanMode;
import org.jkiss.dbeaver.DBeaverPreferences;
 * you may not use this file except in compliance with the License.
            } else {
import org.eclipse.swt.SWT;
            notifyBooleanStylesChanged(savedStyles);
                            case MENU_PRESET_ID:
                alignToolBar.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true));
        final Composite composite = UIUtils.createPlaceholder(parent, 1, 5);
                    savedStyles.getStyle(BooleanState.NULL).getMode() == BooleanMode.TEXT ?
            }
                                } else {
        BooleanStyleSet.setDefaultStyles(store, new BooleanStyleSet(
import org.jkiss.dbeaver.ui.controls.DefaultColorSelector;
import org.eclipse.swt.events.SelectionAdapter;
 * distributed under the License is distributed on an "AS IS" BASIS,
                notifyPropertyChanged(this, PROP_TEXT, style.getText());
                };
                        this.currentText = (String) event.getNewValue();
                }
            notifyPropertyChanged(this, PROP_ALIGN, style.getAlignment());
                    @Override
                        break;

        return super.getConfiguratorObject();
            final Composite group = new Composite(groupEditors, SWT.NONE);
            this.italicFont = fontDescriptor.setStyle(SWT.ITALIC).createFont(parent.getDisplay());
            UIUtils.createLabel(parent, UIIcon.SEPARATOR_V);
        }
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                selector.setDefaultColorValue(new RGB(0, 0, 0));
            }
                    this.currentText = ((Text) e.widget).getText();
        }
        // nothing to init
 * Unless required by applicable law or agreed to in writing, software
                            break;
                    }
                    final BooleanMode mode = (BooleanMode) e.widget.getData();
                        addPropertyChangeListener(event -> {

            notifyPropertyChanged(this, PROP_MODE, style.getMode());
    public void init(IWorkbench workbench) {
                booleanNullPanel.loadStyle(value.getNullStyle(), value.getDefaultColor());
import org.eclipse.swt.widgets.*;
            {

            Composite groupEditors = UIUtils.createTitledComposite(
 * DBeaver - Universal Database Manager

                    ((IPropertyChangeListener) listener).propertyChange(event);
    private final List<Consumer<BooleanStyleSet>> booleanStylesChangeListeners = new ArrayList<>();
import java.util.List;
                            });
                icon.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true));
                                switch ((UIElementFontStyle) event.getNewValue()) {
        private RGB currentDefaultColor;
                    });
                return BooleanStyle.usingText(currentText, currentAlignment, currentColor, currentFontStyle);
                        this.parent.layout(true);

                button.addSelectionListener(selectionListener);
            });
        store.setValue(DBeaverPreferences.UI_SHOW_HOLIDAY_DECORATIONS, holidayDecorationsCheck.getSelection());
            if (listeners.length > 0) {
                            defaultStyles.getStyle(BooleanState.NULL).getText()
                            case PROP_ALIGN:
                        break;
    public PrefPageMiscellaneous() {
                            case MENU_FONT_ID:
            holidayDecorationsCheck.setSelection(store.getBoolean(DBeaverPreferences.UI_SHOW_HOLIDAY_DECORATIONS));

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                                    case BOLD:
                            defaultStyles.getStyle(BooleanState.UNCHECKED).getText()
                            savedStyles.getStyle(BooleanState.NULL).getText() :
            booleanUncheckedPanel = new BooleanPanel(
        if (valid) {
                    text.addMenuSeparator();
                public void widgetSelected(SelectionEvent e) {
                final SelectionListener selectionListener = new SelectionAdapter() {
            }
                    case PROP_COLOR:
                            if (event.getProperty().equals(PROP_COLOR)) {
    @NotNull

                    // Do this way to avoid recursively firing the same event over and over again.
 * limitations under the License.
                updateBooleanValidState();
        private final Composite parent;
                            case MENU_RESET_COLOR_ID:
                final Label icon = UIUtils.createLabel(parent, state.getIcon());
            {
                    group,
            });
                                        break;
                            case PROP_COLOR:
                            notifyPropertyChanged(e.widget, PROP_ALIGN, e.widget.getData());
                            selector.setColorValue((RGB) event.getNewValue());

                                        text.getTextComponent().setFont(italicFont);

                        item.setID(MENU_RESET_COLOR_ID);
