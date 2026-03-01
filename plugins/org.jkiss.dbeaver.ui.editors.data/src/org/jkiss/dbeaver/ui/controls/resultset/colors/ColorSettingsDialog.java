    }
                editor.getControl().addListener(SWT.Modify, event -> {
 * You may obtain a copy of the License at
            );
        return super.close();
            });
        DEFAULT_RGB = resultSetViewer.getControl().getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND).getRGB();
            gd.heightHint = 100;
        }
            });
            } else {

        divider.setLayoutData(new GridData(GridData.FILL_BOTH));
            fgColorSelector1 = new ColorSelector(settingsGroup);
                        //event.gc.drawText(colorSettings, x, event.y);

package org.jkiss.dbeaver.ui.controls.resultset.colors;
            gd.horizontalSpan = 3;

            }

                    if (curOverride != null) {
                            attributeValues[index] = value;

        }
import org.jkiss.dbeaver.ui.controls.resultset.*;


        attributeTable.addSelectionListener(new SelectionAdapter() {
                    }
        DBCLogicalOperator.ILIKE,
    }
    @Override
import org.jkiss.utils.CommonUtils;
        this.row = row;
        public void updateValue(@Nullable Object value, boolean updatePresentation) {
//                    editor.primeEditorValue(defaultValue);

            }
                    event.gc.drawRectangle(event.x, event.y, event.width - 1, event.height - 1);
                valueEditor1 = createValueEditor(editorPlaceholder1, 0);
                    updateControlsState();
    }
                editor.createControl();
        }
                    fgColorSelector1.setColorValue(StringConverter.asRGB(curOverride.getColorForeground()));
    {
                GridData.FILL_HORIZONTAL, 3);
    }
            if (editor == null) {
            if (co.isRange()) {
            UIUtils.disposeChildControls(editorPlaceholder);

        void setInlinePlaceholder(Composite ph) {
        if (attribute == null) {
        });
                new Text(editorPlaceholder1, SWT.BORDER);
import org.eclipse.jface.dialogs.ControlEnableState;
        tableItem.setText(0, text);
            singleColumnCheck.addSelectionListener(new SelectionAdapter() {
            bgColorSelector1.addListener(event -> {
            }

                        colorsTable.setSelection(tableItem);
 *
                public void widgetSelected(SelectionEvent e) {
        }
        return null;

            colorsTable = new Table(colorsGroup, SWT.BORDER | SWT.FULL_SELECTION);
                    }
                    bgColorSelector1.setColorValue(StringConverter.asRGB(curOverride.getColorBackground()));

*/
import org.jkiss.dbeaver.ui.data.managers.StringValueManager;
public class ColorSettingsDialog extends BaseDialog {
                            //updateColumnItem(attributeTable.getSelection()[0]);
                        valueEditor2.primeEditorValue(ArrayUtils.isEmpty(values) || values.length < 2 ? null : values[1]);
 */
        return super.open();

            //UIUtils.createControlLabel(colorsGroup, "Cell conditions");
        } catch (DBException e) {
    private class ColorValueController extends ResultSetValueController {
    private void updateSettingsValues() {
                                attributeValues = new Object[valueCount];
                attributeTable.setSelection(attrItem);
    private ColorSelector fgColorSelector1;
                    public void widgetSelected(SelectionEvent e) {
            for (DBVColorOverride co : colorOverrides) {
    @Override
                        List<String> coStrings = new ArrayList<>();

                valueManager = new StringValueManager();
                settingsGroup,
import org.jkiss.dbeaver.model.virtual.DBVColorOverride;
                }
            }
                return UIUtils.getSharedColor(co.getColorBackground());
            settingsEnableState = null;
                    if (valueEditor2 != null) {
 * you may not use this file except in compliance with the License.
            return UIUtils.getSharedColor(co.getColorForeground());
            settingsEnableState.restore();

                settingsGroup,
            bgColorSelector2.addListener(event -> {
    private DBDAttributeBinding attribute;
            inlinePlaceholder = ph;
                colorsTable.setSelection(0);
        }
            editorPlaceholder1.setLayout(new FillLayout());
            colorOverrides = vEntity.getColorOverrides(attribute.getName());
import org.jkiss.dbeaver.ui.data.IValueManager;
    private static final DBCLogicalOperator[] SUPPORTED_OPERATORS = {

            IValueEditor editor = valueManager.createEditor(valueController);
                ResultSetMessages.dialog_row_colors_group_settings_operator_label,
                        Point textSize = new Point(boxSize, boxSize);
                    }
 * Licensed under the Apache License, Version 2.0 (the "License");
    private ControlEnableState settingsEnableState;
import java.util.ArrayList;
                    @Override
                        bgColorSelector2.setColorValue(DEFAULT_RGB);
import org.eclipse.swt.graphics.RGB;
                if (!CommonUtils.isEmpty(curOverride.getColorBackground())) {
                    @Override
                            } else if (attributeValues.length != valueCount) {
                List<DBVColorOverride> coList = vEntity.getColorOverrides(attr.getName());
            }
import org.eclipse.swt.events.SelectionAdapter;
            editorPlaceholder1.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            TableItem attrItem = new TableItem(attributeTable, SWT.NONE);
    @NotNull
    private void updateCurrentTreeItem() {
                ResultSetMessages.dialog_row_colors_group_settings_single_column_label,
                            vEntity.removeColorOverride(curOverride);
                        updateControlsState();
                            curOverride.setAttributeValues(attributeValues);
import org.jkiss.dbeaver.Log;
    }
            UIUtils.createControlLabel(settingsGroup, ResultSetMessages.dialog_row_colors_group_settings_label).setLayoutData(gd);
        int itemIndex = colorsTable.getSelectionIndex();
                        return null;
    private Table attributeTable;
    }
                @Override
    }

        boolean isRange = rangeCheck.getSelection();
import java.util.Arrays;
                        event.gc.setBackground(bgColor);
                        }
                    }
        } else {
        vEntitySrc.persistConfiguration();
            }

                }
        if (valueEditor2 != null) {
                rangeCheck.setSelection(false);
                Object[] values = curOverride.getAttributeValues();
                }

            operatorCombo.addSelectionListener(new SelectionAdapter() {
import org.eclipse.jface.dialogs.IDialogConstants;

            }
                        try {

    }
                    } else {
                }
import org.jkiss.code.NotNull;
                if (curOverride.isRange()) {
            GridData gd = new GridData(GridData.FILL_BOTH);
    }
import org.eclipse.jface.resource.StringConverter;
                colorOverrides = new ArrayList<>();
import org.jkiss.dbeaver.model.virtual.DBVEntity;
            }
            });
                        Color bg = getColorTableBackground(co);
            if (!CommonUtils.isEmpty(co.getColorBackground())) {

        DBCLogicalOperator.GREATER,
                operatorCombo.add(operator.getExpression());
    private ColorSelector bgColorSelector1;
        DBVColorOverride co = (DBVColorOverride) tableItem.getData();
                        curOverride.setRange(rangeCheck.getSelection());
                ResultSetMessages.dialog_row_colors_group_settings_range_tip,

            @Override
    @Override
                text = "In " + Arrays.toString(values);
            UIUtils.createControlLabel(settingsGroup, ResultSetMessages.dialog_row_colors_group_settings_background_color_label);
                        event.gc.drawRectangle(x, event.y + 2, textSize.x - 1, textSize.y - 1);
        DBCLogicalOperator.NOT_LIKE,
        TableItem[] selection = attributeTable.getSelection();
            gd.widthHint = 300;
                    }
        attributeTable.redraw();
            colorsTable.setLayoutData(gd);
        super.okPressed();
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                            updateCurrentTreeItem();
            colorsTable.addListener(SWT.PaintItem, event -> {
import org.jkiss.dbeaver.model.DBValueFormatting;
        DBCLogicalOperator.REGEX
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;

            });
                Color bg1Color = UIUtils.getSharedColor(bg1);

        super(resultSetViewer.getControl().getShell(), NLS.bind(ResultSetMessages.dialog_row_colors_title, attr.getDataContainer().getName()), UIIcon.PALETTE);
    public ColorSettingsDialog(
        }
            curOverride = null;
        try {
                Color bg2Color = UIUtils.getSharedColor(bg2);
    private final DBVEntity vEntity;

                valueManager = ValueManagerRegistry.findValueManager(
                @Override
            }
        ColorValueController(@Nullable Composite inlinePlaceholder) {
//                }
                        } catch (Exception e) {

            if (settingsEnableState == null) {
 *
    private Button singleColumnCheck;
                3
        for (DBDAttributeBinding attr : resultSetViewer.getModel().getVisibleAttributes()) {
        if (curOverride == null) {

                    btnDelete.setEnabled(selectionIndex >= 0);

            bgColorSelector1 = new ColorSelector(settingsGroup);

        if (selection.length == 0) {
                    updateControlsState();
    }
        fgColorSelector2.setEnabled(isRange);

    public int open() {
            settingsGroup.setLayout(new GridLayout(3, false));

            attrItem.setData(attr);
    private static final Log log = Log.getLog(ColorSettingsDialog.class);
            valueController.setInlinePlaceholder(editorPlaceholder);
                curOverride.setColorForeground(StringConverter.asString(fgColorSelector1.getColorValue()));
                inlinePlaceholder);
        DBCLogicalOperator.EQUALS,

                fgColorSelector1.setColorValue(DEFAULT_RGB);
            fgColorSelector2 = new ColorSelector(settingsGroup);
    private static RGB DEFAULT_RGB;
        Composite composite = super.createDialogArea(parent);
            // Color range values are always editable
                });
        });
    protected IDialogSettings getDialogBoundsSettings() {
        try {
            attrItem.setText(0, attr.getName());
    private final ResultSetViewer resultSetViewer;
                        vEntity.addColorOverride(curOverride);
            colorsTable.addSelectionListener(new SelectionAdapter() {
                SWT.DROP_DOWN | SWT.READ_ONLY
    };
    @Nullable
                operatorCombo.select(0);
import org.eclipse.swt.widgets.*;
    }
                    }
                }
                @Override
                false,
                    int selectionIndex = colorsTable.getSelectionIndex();
        }
            ColorValueController valueController = new ColorValueController(settingsGroup) {
            singleColumnCheck = UIUtils.createCheckbox(

        Object[] values = co.getAttributeValues();
                curOverride = colorOverrides.get(0);
            log.error(e);


            // Nothing to load
    private ResultSetRow row;
            valueEditor2 = createValueEditor(editorPlaceholder2, 1);

        } else if (values.length == 1) {
        }
    private ToolItem btnDelete;
import org.jkiss.dbeaver.ui.data.registry.ValueManagerRegistry;
                        //String colorSettings = "   ";//String.join(", ", coStrings);
import org.eclipse.osgi.util.NLS;
            });
    private IValueEditor createValueEditor(Composite editorPlaceholder, int index) {

                    attribute.getValueHandler().getValueObjectType(attribute));
                false,
        btnDelete.setEnabled(colorsTable.getSelectionIndex() >= 0);
        }
                EditType.INLINE,
            }
        {
            UIUtils.createTableColumn(colorsTable, SWT.RIGHT, "Value(s)");
                btnDelete.setEnabled(false);
            });
        //createButton(parent, IDialogConstants.ABORT_ID, ResultSetMessages.controls_resultset_filter_button_reset, false);
                            }

import org.jkiss.dbeaver.ui.UIIcon;
        }

import org.eclipse.swt.layout.FillLayout;
//                    Object defaultValue = ((DBDValueDefaultGenerator) attribute.getValueHandler()).generateDefaultValue(attribute);
            rangeCheck.addSelectionListener(new SelectionAdapter() {
    private Composite settingsGroup;
                        if (fg != null) event.gc.setForeground(fg);
                3

        String text;
                settingsEnableState = ControlEnableState.disable(settingsGroup);
            bgColorSelector2 = new ColorSelector(settingsGroup);
                }
            editorPlaceholder2.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                    resultSetViewer.getDataSource(),
            text = co.getOperator().getExpression() + " ?";
        } else if (settingsEnableState != null) {

                curOverride.setColorBackground2(StringConverter.asString(bgColorSelector2.getColorValue()));
                }
        }
                if ((event.detail & SWT.SELECTED) != 0) {
                new ResultSetCellLocation(attribute, row),
                singleColumnCheck.setSelection(false);

                    if (bgColor != null) {
        return null;
                        tableItem.setData(curOverride);
        attributeTable.setHeaderVisible(true);
        @Override
                        fgColorSelector2.setColorValue(DEFAULT_RGB);
        if (itemIndex >= 0) {
    }
            GridData gd = new GridData();
        createAttributeSettingsArea(divider);
                }
 * Unless required by applicable law or agreed to in writing, software
                TableItem tableItem = new TableItem(colorsTable, SWT.NONE);
            if (colorOverrides == null) {
        Composite panel = UIUtils.createComposite(composite, 1);
                            for (Object value : co.getAttributeValues()) {
                if (!coList.isEmpty()) {
import org.jkiss.dbeaver.model.data.DBDDisplayFormat;

                buttonsPanel.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
            editorPlaceholder2.setLayout(new FillLayout());
            settingsGroup = new Composite(mainGroup, SWT.NONE);

                        int boxSize = attributeTable.getItemHeight() - 4;
                if (valueEditor1 != null) {
        @Nullable final ResultSetRow row)
                            Object value = editor.extractEditorValue();
                            log.error(e);
                                coStrings.add(CommonUtils.toString(value));
                Label errorLabel = new Label(editorPlaceholder, SWT.NONE);
                        event.gc.setBackground(colorsTable.getBackground());
                bgColorSelector2.setColorValue(DEFAULT_RGB);
    /** List of operators from {@code SUPPORTED_OPERATORS} that operate on strings only. */
            // Do not update
        super.buttonPressed(buttonId);
    }
                if ((event.detail & SWT.SELECTED) == 0) {
        updateControlsState();
import org.jkiss.dbeaver.DBException;
        SashForm divider = new SashForm(composite, SWT.HORIZONTAL);
    }
import org.jkiss.dbeaver.ui.UIUtils;
        DBCLogicalOperator.LESS_EQUALS,
        } else {
import org.eclipse.swt.layout.GridData;
                public void widgetSelected(SelectionEvent e) {

        @NotNull ResultSetViewer resultSetViewer,
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
            settingsGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL));
        operatorCombo.setEnabled(!isRange);
                curOverride.setColorBackground(StringConverter.asString(bgColorSelector1.getColorValue()));
 * limitations under the License.
        @Override
        DBCLogicalOperator.NOT_LIKE,
            colorsGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_BOTH));
                singleColumnCheck.setSelection(curOverride.isSingleColumn());
        DBCLogicalOperator.LIKE,


    /** List of supported <b>binary</b> operators the user can pick from. */
                        event.gc.fillRectangle(x, event.y + 2, textSize.x, textSize.y);
                        bgColorSelector2.setColorValue(StringConverter.asRGB(curOverride.getColorBackground2()));
                            curOverride = null;
            attrItem.setImage(0, DBeaverIcons.getImage(DBValueFormatting.getObjectImage(attr, true)));

                    }
    private ColorSelector bgColorSelector2;
                    event.gc.fillRectangle(event.x, event.y, event.width, event.height);
                    }
            return false;
import org.eclipse.swt.layout.GridLayout;
                    if (curOverride != null) {
                @Override
            //UIUtils.createTableColumn(colorsTable, SWT.LEFT, "Operator");
 *     http://www.apache.org/licenses/LICENSE-2.0
                    }
            fgColorSelector2.addListener(event -> {
            }
                updateCurrentTreeItem();

        } else {
        }

                        if (curOverride != null) {
                        }
            });
        if (this.vEntity != null) {
    private void createAttributeSelectorArea(Composite composite) {
        } catch (DBException e) {
            attribute = null;
                valueEditor2 = null;
    protected void okPressed() {
        Composite mainGroup = UIUtils.createComposite(composite, 1);
            if (!colorOverrides.isEmpty()) {
                ToolBar buttonsPanel = new ToolBar(colorsGroup, SWT.FLAT | SWT.VERTICAL);
                updateCurrentTreeItem();
                                attributeValues = Arrays.copyOf(attributeValues, valueCount);

    private List<DBVColorOverride> colorOverrides;
*/
        gd.widthHint = 400;
        }
        mainGroup.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_BOTH));
    protected Composite createDialogArea(Composite parent) {


                updateCurrentTreeItem();
            attribute = (DBDAttributeBinding) selection[0].getData();

        DBCLogicalOperator.REGEX
                valueEditor2 = createValueEditor(editorPlaceholder2, 1);
                public void widgetSelected(SelectionEvent e) {
                    return attributeValues[index];
            fgColorSelector1.addListener(event -> {
    private void updateColorItem(TableItem tableItem) {
            operatorCombo = UIUtils.createLabelCombo(
                            int valueCount = index + 1;
                    } else {
        return UIUtils.getDialogSettings(DIALOG_ID);
            }
        }


                new Text(editorPlaceholder2, SWT.BORDER);
    }
                            }
        updateAttributeSelection();
                updateColorItem(tableItem);
    private Button rangeCheck;
    private void createAttributeSettingsArea(Composite composite) {
            editorPlaceholder1 = new Composite(settingsGroup, SWT.NONE);
            editorPlaceholder2 = new Composite(settingsGroup, SWT.NONE);
        attributeTable.setLayoutData(gd);
            UIUtils.createControlLabel(settingsGroup, ResultSetMessages.dialog_row_colors_group_settings_foreground_color_label);
        DBCLogicalOperator.LESS,
                valueEditor1 = null;
                }
 * See the License for the specific language governing permissions and
            );
                updateAttributeSelection();
                    return;
import org.eclipse.swt.graphics.Color;
/*
                ResultSetMessages.dialog_row_colors_group_settings_operator_tip,
            });
        attributeTable = new Table(panel, SWT.FULL_SELECTION | SWT.BORDER);

                        fgColorSelector2.setColorValue(StringConverter.asRGB(curOverride.getColorForeground2()));
                curOverride.setColorForeground2(StringConverter.asString(fgColorSelector2.getColorValue()));
            } else {
    }
                updateCurrentTreeItem();
                    if (!CommonUtils.isEmpty(curOverride.getColorForeground2())) {

            {

        attributeTable.addListener(SWT.PaintItem, event -> {
            settingsGroup.layout(true, true);

            for (DBCLogicalOperator operator : SUPPORTED_OPERATORS) {
 * Copyright (C) 2010-2024 DBeaver Corp and others
                ResultSetMessages.dialog_row_colors_group_settings_tip,
                return UIUtils.getSharedColor(ResultSetUtils.makeGradientValue(bg1Color.getRGB(), bg2Color.getRGB(), 1, 100, 50));
                } else {
                    valueEditor1.primeEditorValue(ArrayUtils.isEmpty(values) ? null : values[0]);

    protected void buttonPressed(int buttonId) {
                bgColorSelector1.setColorValue(DEFAULT_RGB);
            final IValueManager valueManager;
import org.jkiss.dbeaver.model.exec.DBCLogicalOperator;
        createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
            public void widgetSelected(SelectionEvent e) {
                text = co.getOperator().getExpression() + " " + Arrays.toString(values);
                    attribute,

            colorsTable.addListener(SWT.EraseItem, event -> {
                    //event.detail &= ~SWT.SELECTED;
                int x = event.x + 4;
            super(resultSetViewer,
                    Object[] attributeValues = curOverride.getAttributeValues();

                    bgColorSelector1.setColorValue(DEFAULT_RGB);

            } else {

                        if (bg != null) event.gc.setBackground(bg);
                } else {
import org.eclipse.swt.graphics.Point;
            this.vEntity.dispose();
    private Table colorsTable;

import org.jkiss.code.Nullable;
    private final DBVEntity vEntitySrc;
                            updateControlsState();
            UIUtils.createPlaceholder(settingsGroup, 1);
            text = co.getOperator().getExpression() + " " + DBValueFormatting.getDefaultValueDisplayString(values[0], DBDDisplayFormat.UI);
    @Override
                        //Point textSize = event.gc.stringExtent(colorSettings);
            if (!CommonUtils.isEmpty(bg1) && !CommonUtils.isEmpty(bg2)) {
            UIUtils.executeOnResize(colorsTable, () -> UIUtils.packColumns(colorsTable, true));
 * DBeaver - Universal Database Manager
                operatorCombo.select(Math.max(ArrayUtils.indexOf(SUPPORTED_OPERATORS, curOverride.getOperator()), 0));
                curOverride = null;


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        colorsTable.setEnabled(attribute != null);
                    if (curOverride == null ){
                        TableItem tableItem = new TableItem(colorsTable, SWT.NONE);
                @Override
        vEntitySrc.copyFrom(vEntity, vEntity.getModel());
                public void widgetSelected(SelectionEvent e) {

    @Override
                });
                        return null;
            }
                    for (DBVColorOverride co : coList) {
        //colorsTable.getColumn(0).setWidth(colorsTable.getSize().x);
            colorOverrides = null;
import org.jkiss.dbeaver.ui.DBeaverIcons;
                btnDelete = UIUtils.createToolItem(buttonsPanel, "Delete", UIIcon.ROW_DELETE, new SelectionAdapter() {
            if (curOverride == null || !ArrayUtils.contains(STRING_OPERATORS, curOverride.getOperator())) {
    @Nullable
                    }

    private Color getColorTableBackground(DBVColorOverride co) {
                        x += textSize.x + 4;
                        }
                fgColorSelector2.setColorValue(DEFAULT_RGB);
            if (event.index == 1) {
        if (!CommonUtils.isEmpty(co.getColorForeground())) {
                event.gc.drawText(((TableItem) event.item).getText(), event.x, event.y);

                        Color fg = attributeTable.getDisplay().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW);//getColorTableForeground(co);
                        curOverride.setSingleColumn(singleColumnCheck.getSelection());
        UIUtils.createTableColumn(attributeTable, SWT.LEFT, ResultSetMessages.dialog_row_colors_table_attributes_name);
                });
            if (this.attribute == attr) {
                            colorsTable.getItem(colorsTable.getSelectionIndex()).dispose();
 *

        if (ArrayUtils.isEmpty(values)) {
                ResultSetMessages.dialog_row_colors_group_settings_single_column_tip,
        public boolean isReadOnly() {
            });
//                if (attribute.getValueHandler() instanceof DBDValueDefaultGenerator) {
/*
                            if (attributeValues == null) {
        this.vEntitySrc = vEntity;
    private Composite editorPlaceholder2;
    public boolean close() {
    private ColorSelector fgColorSelector2;
                        if (co.getAttributeValues() != null) {
    private Color getColorTableForeground(DBVColorOverride co) {
        }

        createAttributeSelectorArea(divider);
        if (!co.isRange()) {
import org.eclipse.swt.events.SelectionEvent;
        @NotNull DBVEntity vEntity,
                public Object getValue() {
                if (!CommonUtils.isEmpty(curOverride.getColorForeground())) {
                    if (curOverride != null) {
 * distributed under the License is distributed on an "AS IS" BASIS,
    };

                    if (!CommonUtils.isEmpty(curOverride.getColorBackground2())) {
        DBCLogicalOperator.NOT_EQUALS,
import org.jkiss.dbeaver.ui.data.IValueEditor;
            log.error(e);
    @Override
        }
            );
    private IValueEditor valueEditor1;
                }
    protected void createButtonsForButtonBar(Composite parent) {
                    Color bgColor = getColorTableBackground((DBVColorOverride) event.item.getData());
        @NotNull final DBDAttributeBinding attr,
                }
        }
    private static final DBCLogicalOperator[] STRING_OPERATORS = {
        } else {
    }
    private Combo operatorCombo;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
    private DBVColorOverride curOverride;
                        curOverride = new DBVColorOverride(attribute.getName(), DBCLogicalOperator.EQUALS, null, null, null);
            Composite colorsGroup = UIUtils.createComposite(mainGroup, 2);

        UIUtils.executeOnResize(attributeTable, () -> UIUtils.packColumns(attributeTable, true));
            } else {
                    } else {
    }
        bgColorSelector2.setEnabled(isRange);
                ResultSetMessages.dialog_row_colors_group_settings_range_label,
/*
            UIUtils.createInfoLabel(settingsGroup,
            }
            rangeCheck = UIUtils.createCheckbox(
    @Override
                errorLabel.setText("N/A");
            String bg2 = co.getColorBackground2();
    private IValueEditor valueEditor2;
            };
                settingsGroup,
        return null;
            String bg1 = co.getColorBackground();

            valueEditor1 = createValueEditor(editorPlaceholder1, 0);
                tableItem.setData(co);
    private void updateAttributeSelection() {
                    }
                    public void widgetSelected(SelectionEvent e) {
    private static final String DIALOG_ID = "DBeaver.ColorSettingsDialog2";//$NON-NLS-1$
        GridData gd = new GridData(GridData.FILL_BOTH);
                    if (attributeValues == null || index > attributeValues.length - 1) {
                UIUtils.createToolItem(buttonsPanel, "Add", UIIcon.ROW_ADD, new SelectionAdapter() {
                    if (curOverride != null) {
            valueEditor2.getControl().setEnabled(isRange);
        resultSetViewer.getModel().updateColorMapping(vEntitySrc, true);
        {

        this.attribute = attr;
                    }
                    curOverride = selectionIndex < 0 ? null : (DBVColorOverride) colorsTable.getItem(selectionIndex).getData();
            if (curOverride == null) {
                    }
        colorsTable.removeAll();
        tableItem.setBackground(getColorTableBackground((DBVColorOverride) tableItem.getData()));
    private void updateControlsState() {
                UIUtils.disposeChildControls(editorPlaceholder2);
                rangeCheck.setSelection(curOverride.isRange());
                DBDAttributeBinding attr = (DBDAttributeBinding) event.item.getData();

            }
            return editor;
                UIUtils.disposeChildControls(editorPlaceholder1);
        divider.setSashWidth(10);
import org.eclipse.swt.custom.SashForm;
        DBCLogicalOperator.ILIKE,
            updateColorItem(colorsTable.getItem(itemIndex));
        return parent;
                        curOverride.setOperator(SUPPORTED_OPERATORS[operatorCombo.getSelectionIndex()]);
import org.jkiss.utils.ArrayUtils;
            UIUtils.createControlLabel(settingsGroup, ResultSetMessages.dialog_row_colors_group_settings_value_label);
    private Composite editorPlaceholder1;
        this.vEntity = new DBVEntity(vEntitySrc.getContainer(), vEntitySrc, vEntitySrc.getModel());
            //updateColumnItem(attrItem);
        tableItem.setForeground(getColorTableForeground((DBVColorOverride) tableItem.getData()));
        DBCLogicalOperator.GREATER_EQUALS,
            } else {
            });
                            Object[] attributeValues = curOverride.getAttributeValues();
import org.eclipse.swt.SWT;
                    updateControlsState();
        updateSettingsValues();
                        updateColorItem(tableItem);

        }
                    fgColorSelector1.setColorValue(DEFAULT_RGB);
            updateCurrentTreeItem();
import java.util.List;
                }
import org.eclipse.jface.preference.ColorSelector;
        this.resultSetViewer = resultSetViewer;
    }
        DBCLogicalOperator.LIKE,
        UIUtils.createTableColumn(attributeTable, SWT.LEFT, ResultSetMessages.dialog_row_colors_table_attributes_color);
}
