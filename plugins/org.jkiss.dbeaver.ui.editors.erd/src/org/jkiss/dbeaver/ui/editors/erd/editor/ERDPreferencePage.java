        ERDAttributeVisibility defaultVisibility = ERDAttributeVisibility.getDefaultVisibility(store);
    public boolean performOk() {
 * ERDPreferencePage
        return true;
        return true;
            }
    }
        }
        contentsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
    @NotNull
        );
            store.setValue(ERDUIConstants.PREF_GRID_SNAP_ENABLED, snapCheck.getSelection());
        } else {
        }
        if (hasColorPrefGroup()) {
    }

            createStyleGroup(store, composite);
                }
            for (Button check : styleButtons) {
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.erd.general"; //$NON-NLS-1$
        Composite contentsGroup = UIUtils.createTitledComposite(
        modeCombo.add(ERDUIMessages.pref_page_erd_item_fit_width);
            }
            radio.setText(visibility.getTitle());
                    ERDAttributeVisibility.setDefaultVisibility(store, (ERDAttributeVisibility) radio.getData());
                    pageMode = PrintFigureOperation.TILE;
            store.setValue(ERDUIConstants.PREF_PRINT_MARGIN_RIGHT, spinnerMarginRight.getSelection());
        gridCheck = UIUtils.createCheckbox(gridGroup, ERDUIMessages.pref_page_erd_checkbox_grid_enabled, null,
    private List<ERDConnectionRouterDescriptor> routerDescriptors = new ArrayList<>();

                }
import org.jkiss.dbeaver.model.erd.ERDAttributeVisibility;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
        spinnerMarginTop = UIUtils.createLabelSpinner(printGroup, ERDUIMessages.pref_page_erd_spinner_margin_top, store.getInt(ERDUIConstants.PREF_PRINT_MARGIN_TOP), 0, Short.MAX_VALUE);
        return composite;
            ERDConnectionRouterDescriptor connectionRouter = ERDConnectionRouterRegistry.getInstance()
import org.eclipse.swt.layout.GridData;
 * Copyright (C) 2010-2026 DBeaver Corp and others
            0
        Composite gridGroup = UIUtils.createTitledComposite(composite, ERDUIMessages.pref_page_erd_group_grid, 2);
    }
    private Spinner spinnerMarginLeft;
/**
import org.jkiss.dbeaver.ui.UIUtils;
            changeBorderColors.setSelection(store.getDefaultBoolean(ERDUIConstants.PREF_DIAGRAM_CHANGE_BORDER_COLORS));
        if (hasStyleGroup()) {
            SWT.DROP_DOWN | SWT.READ_ONLY);
            store.getBoolean(ERDUIConstants.PREF_DIAGRAM_CHANGE_HEADER_COLORS));
import org.eclipse.swt.SWT;
        if (hasPrintGroup()) {
        }
    public void init(IWorkbench workbench)
    }
            store.setValue(ERDUIConstants.PREF_PRINT_MARGIN_LEFT, spinnerMarginLeft.getSelection());
            switch (modeCombo.getSelectionIndex()) {
        if (defNotation != null) {

                if (check.getSelection() && check.getData() instanceof ERDViewStyle data) {
        if (hasPrintGroup()) {
 * limitations under the License.
            radio.setData(visibility);
    {
            default -> 0;
            createContentsGroup(store, composite);
                ERDConnectionRouterRegistry.getInstance().setActiveRouter(connectionRouter);
                    break;
        if (hasGridGroup()) {
            store.getBoolean(ERDUIConstants.PREF_GRID_SNAP_ENABLED), 2);
 *
        }
            if (ArrayUtils.contains(enabledStyles, style)) {
    private Spinner spinnerGridHeight;
    protected boolean hasContentGroup() {
/*
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
        notationType = UIUtils.createLabelCombo(contentsGroup, ERDUIMessages.erd_preference_page_title_notation_combo,
            case PrintFigureOperation.FIT_HEIGHT -> 3;
                radio.setSelection(true);

            store.getInt(ERDUIConstants.PREF_GRID_HEIGHT), 5, Short.MAX_VALUE);
        contentsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
        return true;
            store.getInt(ERDUIConstants.PREF_GRID_WIDTH), 5, Short.MAX_VALUE);

        }
    }
            createAdvancedGroup(store, composite);
    
            int pageMode;
            createPrintGroup(store, composite);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            spinnerMarginTop.setSelection(ERDUIConstants.PRINT_MARGIN_DEFAULT);
        if (hasAdvancedGroup()) {

        snapCheck = UIUtils.createCheckbox(gridGroup, ERDUIMessages.pref_page_erd_checkbox_snap_to_grid, null,
        if (hasAdvancedGroup()) {
        }
            spinnerMarginBottom.setSelection(ERDUIConstants.PRINT_MARGIN_DEFAULT);
        }
        modeCombo.add(ERDUIMessages.pref_page_erd_item_fit_height);

            check.setData(style);
            store.getBoolean(ERDUIConstants.PREF_DIAGRAM_CHANGE_BORDER_COLORS));
            check.setText(style.getTitle());
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;

                    break;

    protected boolean hasGridGroup() {
    }

    }
            ERDNotationDescriptor erdNotation = ERDNotationRegistry.getInstance().getDescriptorByName(notationType.getText());
                styleButtons.getFirst().setSelection(true);
            gridCheck.setSelection(store.getDefaultBoolean(ERDUIConstants.PREF_GRID_ENABLED));
 * distributed under the License is distributed on an "AS IS" BASIS,
            contentsShowPartitions.setSelection(store.getDefaultBoolean(ERDUIConstants.PREF_DIAGRAM_SHOW_PARTITIONS));

    
        DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();
        }
        return true;
            ERDUIMessages.erd_preference_page_title_color_pref,
            store.setValue(ERDUIConstants.PREF_DIAGRAM_SHOW_VIEWS, contentsShowViews.getSelection());
    private Spinner spinnerMarginBottom;
            store.setValue(ERDUIConstants.PREF_PRINT_MARGIN_BOTTOM, spinnerMarginBottom.getSelection());
        }
        ERDConnectionRouterDescriptor defConnectionRouter = routerRegistry.getActiveRouter();
            store.getBoolean(ERDUIConstants.PREF_GRID_ENABLED), 2);
    protected boolean hasPrintGroup() {
            }
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterDescriptor;
            visibilityButtons.add(radio);
    private void createGridGroup(DBPPreferenceStore store, Composite composite) {
        if (hasColorPrefGroup()) {
    private final List<Button> styleButtons = new ArrayList<>();
        if (hasColorPrefGroup()) {
    
            0,
        Composite elemsGroup = UIUtils.createTitledComposite(composite, ERDUIMessages.erd_preference_page_title_attribute_style, 1);
            spinnerGridWidth.setSelection(store.getDefaultInt(ERDUIConstants.PREF_GRID_WIDTH));
            routingType.add(descriptor.getName());

        modeCombo = UIUtils.createLabelCombo(printGroup, ERDUIMessages.pref_page_erd_combo_page_mode, SWT.READ_ONLY | SWT.DROP_DOWN);
    }
            SWT.DROP_DOWN | SWT.READ_ONLY);
    }
                    break;
            createGridGroup(store, composite);
            1,
        if (hasContentGroup()) {
 * Unless required by applicable law or agreed to in writing, software
    protected boolean hasStyleGroup() {
    }
public class ERDPreferencePage extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {

        changeHeaderColors = UIUtils.createCheckbox(contentsGroup, ERDUIMessages.erd_preference_page_title_change_header_colors,
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            if (!visibilityButtons.isEmpty()) {
    private Combo routingType;
        }
        return true;
        ERDViewStyle[] enabledStyles = ERDViewStyle.getDefaultStyles(store);
        DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();

        spinnerMarginBottom = UIUtils.createLabelSpinner(printGroup, ERDUIMessages.pref_page_erd_spinner_margin_bottom, store.getInt(ERDUIConstants.PREF_PRINT_MARGIN_BOTTOM), 0, Short.MAX_VALUE);
    private Button changeHeaderColors;
        for (ERDNotationDescriptor descriptor : notationDescriptors) {
 */
    private void createAdvancedGroup(DBPPreferenceStore store, Composite composite) {
import java.util.List;
import org.eclipse.swt.widgets.*;
    private final ERDNotationRegistry notationRegistry = ERDNotationRegistry.getInstance();
        for (ERDAttributeVisibility visibility : ERDAttributeVisibility.values()) {
            store.getBoolean(ERDUIConstants.PREF_DIAGRAM_SHOW_PARTITIONS));
    }
    private final ERDConnectionRouterRegistry routerRegistry = ERDConnectionRouterRegistry.getInstance();
    public void setElement(IAdaptable element)
        if (hasContentGroup()) {

    }
        );
    }
import org.eclipse.ui.IWorkbench;

import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotationRegistry;

    public IAdaptable getElement()
    {
            createVisibilityGroup(store, composite);
import org.eclipse.ui.IWorkbenchPropertyPage;
        this.element = element;
            }
        super.performDefaults();
            // Style settings
        // routing
        for (ERDConnectionRouterDescriptor descriptor : routerDescriptors) {
                case 1:
            }
    private void createPrintGroup(DBPPreferenceStore store, Composite composite)
    }
 * See the License for the specific language governing permissions and
        Composite contentsGroup = UIUtils.createTitledComposite(composite, ERDUIMessages.erd_preference_page_title_advanced, 2);
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
        Composite contentsGroup = UIUtils.createTitledComposite(
        changeBorderColors = UIUtils.createCheckbox(contentsGroup, ERDUIMessages.erd_preference_page_title_change_border_colors,
    protected boolean hasAdvancedGroup() {
    private Button gridCheck;
    private Combo modeCombo;
            snapCheck.setSelection(store.getDefaultBoolean(ERDUIConstants.PREF_GRID_SNAP_ENABLED));
        }
        spinnerGridWidth = UIUtils.createLabelSpinner(gridGroup, ERDUIMessages.pref_page_erd_spinner_grid_width,
    @Override
    private Spinner spinnerMarginRight;
            store.setValue(ERDUIConstants.PREF_PRINT_MARGIN_TOP, spinnerMarginTop.getSelection());
        if (hasVisibilityGroup()) {

        }
        if (hasGridGroup()) {
        spinnerMarginLeft = UIUtils.createLabelSpinner(printGroup, ERDUIMessages.pref_page_erd_spinner_margin_left, store.getInt(ERDUIConstants.PREF_PRINT_MARGIN_LEFT), 0, Short.MAX_VALUE);
            }
            store.setValue(ERDUIConstants.PREF_DIAGRAM_CHANGE_HEADER_COLORS, changeHeaderColors.getSelection());
        contentsShowPartitions = UIUtils.createCheckbox(contentsGroup, ERDUIMessages.erd_preference_page_title_shows_partitions,
    private IAdaptable element;
            if (!styleButtons.isEmpty()) {
            composite,

            }
        int modeIndex = switch (store.getInt(ERDUIConstants.PREF_PRINT_PAGE_MODE)) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
 *
    }
        gridGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotationDescriptor;
        spinnerMarginRight = UIUtils.createLabelSpinner(printGroup, ERDUIMessages.pref_page_erd_spinner_margin_right, store.getInt(ERDUIConstants.PREF_PRINT_MARGIN_RIGHT), 0, Short.MAX_VALUE);
            store.setValue(ERDUIConstants.PREF_PRINT_PAGE_MODE, pageMode);
        }
            }
    private Combo notationType;
    private void createVisibilityGroup(DBPPreferenceStore store, Composite composite) {
        for (ERDViewStyle style : ERDViewStyle.values()) {
                case 3:

        }
            for (Button radio : visibilityButtons) {
        modeCombo.select(modeIndex);
        }
            0,
        if (hasAdvancedGroup()) {
        }
    }

        }
                    pageMode = PrintFigureOperation.FIT_PAGE;
            1
            store.setValue(ERDUIConstants.PREF_GRID_ENABLED, gridCheck.getSelection());
        if (hasStyleGroup()) {
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
            store.setValue(ERDUIConstants.PREF_DIAGRAM_SHOW_PARTITIONS, contentsShowPartitions.getSelection());
        contentsShowViews = UIUtils.createCheckbox(contentsGroup, ERDUIMessages.erd_preference_page_title_shows_views,
        return element;
    protected boolean hasColorPrefGroup() {
            contentsShowViews.setSelection(store.getDefaultBoolean(ERDUIConstants.PREF_DIAGRAM_SHOW_VIEWS));
    @Override
        }
    protected boolean hasVisibilityGroup() {
        PrefUtils.savePreferenceStore(store);
        return true;

            ERDViewStyle.setDefaultStyles(store, enabledStyles.toArray(new ERDViewStyle[0]));
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterRegistry;
        }
    @Override
        Composite printGroup = UIUtils.createTitledComposite(composite, ERDUIMessages.pref_page_erd_group_print, 2);
            store.getBoolean(ERDUIConstants.PREF_DIAGRAM_SHOW_VIEWS));
    protected void performDefaults() {
    private Button snapCheck;


        }
                case 2:
            createColorPrefGroup(store, composite);
                    enabledStyles.add(data);
    protected Control createPreferenceContent(@NotNull Composite parent) {

    private List<ERDNotationDescriptor> notationDescriptors = new ArrayList<>();
    private Button contentsShowViews;
 * Licensed under the Apache License, Version 2.0 (the "License");

    private Button contentsShowPartitions;
        Composite elemsGroup = UIUtils.createTitledComposite(
 *
                ERDNotationRegistry.getInstance().setActiveDescriptor(erdNotation);
        elemsGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
            List<ERDViewStyle> enabledStyles = new ArrayList<>();
import org.jkiss.utils.ArrayUtils;
 * you may not use this file except in compliance with the License.
            if (visibility == defaultVisibility) {
        if (hasStyleGroup()) {
import org.eclipse.draw2d.PrintFigureOperation;
            ERDUIMessages.erd_preference_page_title_diagram_contents,
                    styleButton.setSelection(false);
        if (hasContentGroup()) {
        Composite composite = UIUtils.createComposite(parent, 2);
        spinnerGridHeight = UIUtils.createLabelSpinner(gridGroup, ERDUIMessages.pref_page_erd_spinner_grid_height,
 * You may obtain a copy of the License at

    @Override
        modeCombo.add(ERDUIMessages.pref_page_erd_item_fit_page);
        if (hasVisibilityGroup()) {
import org.eclipse.core.runtime.IAdaptable;
        // notation
            notationType.select(notationDescriptors.indexOf(defNotation));
    private Spinner spinnerGridWidth;
    @Override
            composite,
    }
    }
            Button radio = new Button(elemsGroup, SWT.RADIO);
        ERDNotationDescriptor defNotation = notationRegistry.getActiveDescriptor();
        routingType = UIUtils.createLabelCombo(contentsGroup, ERDUIMessages.erd_preference_page_title_routing_combo,
        }
            store.setValue(ERDUIConstants.PREF_GRID_WIDTH, spinnerGridWidth.getSelection());
                }
import org.eclipse.ui.IWorkbenchPreferencePage;
    }
                    break;
    private Button changeBorderColors;

    private final List<Button> visibilityButtons = new ArrayList<>();
            case PrintFigureOperation.FIT_WIDTH -> 2;
            composite,
    {

            Button check = new Button(elemsGroup, SWT.CHECK);
    private void createStyleGroup(DBPPreferenceStore store, Composite composite) {
        if (hasGridGroup()) {
            case PrintFigureOperation.FIT_PAGE -> 1;
            if (erdNotation != null) {
        notationDescriptors = notationRegistry.getNotations();
                    pageMode = PrintFigureOperation.FIT_WIDTH;
        modeCombo.add(ERDUIMessages.pref_page_erd_item_tile);
            styleButtons.add(check);
    private void createContentsGroup(DBPPreferenceStore store, Composite composite) {
        );
import java.util.ArrayList;
        }

            spinnerMarginRight.setSelection(ERDUIConstants.PRINT_MARGIN_DEFAULT);
                check.setSelection(true);

            0
                for (Button styleButton : styleButtons) {
            modeCombo.select(ERDUIConstants.PRINT_MODE_DEFAULT);

    private void createColorPrefGroup(DBPPreferenceStore store, Composite composite) {
            spinnerMarginLeft.setSelection(ERDUIConstants.PRINT_MARGIN_DEFAULT);
        }
        if (hasPrintGroup()) {
import org.jkiss.dbeaver.utils.PrefUtils;
            routingType.select(routerDescriptors.indexOf(routerRegistry.getActiveRouter()));
                    break;
}        }
            ERDUIMessages.erd_preference_page_title_attributes_visibility,

            store.setValue(ERDUIConstants.PREF_DIAGRAM_CHANGE_BORDER_COLORS, changeBorderColors.getSelection());
    }
            }
        if (hasVisibilityGroup()) {
 * DBeaver - Universal Database Manager
            spinnerGridHeight.setSelection(store.getDefaultInt(ERDUIConstants.PREF_GRID_HEIGHT));
        return true;
    {
            changeHeaderColors.setSelection(store.getDefaultBoolean(ERDUIConstants.PREF_DIAGRAM_CHANGE_HEADER_COLORS));
                if (radio.getSelection()) {
            store.setValue(ERDUIConstants.PREF_GRID_HEIGHT, spinnerGridHeight.getSelection());
            notationType.select(0);

        }
            if (connectionRouter != null) {
        };
        routingType.select(routerDescriptors.indexOf(defConnectionRouter));
                .getDescriptorById(routingType.getText());
        }
    @Override
                visibilityButtons.getFirst().setSelection(true);
    private Spinner spinnerMarginTop;

        routerDescriptors = routerRegistry.getDescriptors();

                    pageMode = PrintFigureOperation.FIT_HEIGHT;
            notationType.select(notationDescriptors.indexOf(notationRegistry.getDefaultDescriptor()));
package org.jkiss.dbeaver.ui.editors.erd.editor;
            1,
            notationType.add(descriptor.getName());
 */
                default:
import org.jkiss.code.NotNull;

        return true;
