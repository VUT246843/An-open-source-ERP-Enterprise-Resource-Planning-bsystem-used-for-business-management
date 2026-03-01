            ((GridLayout)bPH.getLayout()).marginRight = 10;
            BeanUtils.isNumericType(propertyType);
                String curValue = objectValueToString(value);

                                    updatePropertyValue(prop, combo.getText());

                            );
 * distributed under the License is distributed on an "AS IS" BASIS,
                            UIUtils.getFontHeight(group) * 15,
                propertyDisplayName,
            if (items == null && property instanceof ObjectPropertyDescriptor opd && opd.hasListValueProvider()) {

                UIUtils.createEmptyLabel(group, 2, 1);
                        editor.notifyListeners(SWT.Selection, new Event());
        if (DBSObject.class.isAssignableFrom(propType) || isLinkProperty(property)) {
                    prop,
    private static boolean isLinkProperty(@NotNull DBPPropertyDescriptor property) {
            GridData textGd = new GridData(SWT.FILL, SWT.FILL, true, false);
            }
                if (!CommonUtils.equalObjects(text.getText(), stringValue)) {
                "",
    public void clearEditors() {
    }
    }
            return namedObject.getName();
                } else {
        } else {
package org.jkiss.dbeaver.ui.controls;

                Text text = new Text(parent, SWT.BORDER |
                    (readOnly ? SWT.READ_ONLY : SWT.NONE) |
                    StringContentProposalProvider proposalProvider = new StringContentProposalProvider(stringsArray);
                                public void widgetSelected(SelectionEvent e) {
                SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY | SWT.NONE
                curButtonsContainer.setLayout(layout);
    public CustomFormEditor(
                    (prop.getId().equals(DBConstants.PROP_ID_NAME) && supportsObjectRename()));
                Class<?> dataType = prop.getDataType();
    }
            } else {
                final Object[] oldItems = (Object[]) combo.getData(LIST_VALUE_KEY);
            propValues.put(prop, value);
    public void loadEditorValues(@NotNull Map<DBPPropertyDescriptor, Object> editorValues) {
    public List<DBPPropertyDescriptor> filterProperties(@NotNull DBPPropertyDescriptor[] props) {


                1
        try {
        if (property.hasFeature(DBConstants.PROP_FEATURE_INFO)) {
            (opd.isLinkPossible() || opd.isHref());
            final String[] strings = new String[enumConstants.length];
                combo.setText(curValue);
                    }
            Link link = new Link(parent, SWT.NONE);
            boolean isReadOnlyCon = databaseObject == null || DBUtils.isReadOnly(databaseObject);
                continue;
                RowLayout layout = new RowLayout(SWT.HORIZONTAL);
                    propertyDisplayName,
            }
    private static final Log log = Log.getLog(CustomFormEditor.class);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;

                    // Do not create editor for null optional properties
        @NotNull DBPPropertyDescriptor property,
            return combo;
            link.setText(getLinkTitle(value));
            if (prop == null) {
    public Control createEditorControl(
            return DBValueFormatting.getDefaultValueDisplayString(value, DBDDisplayFormat.EDIT);
            Label textLabel = new Label(infoComposite, SWT.WRAP);
            Button editor = UIUtils.createCheckbox(
    public void updateOtherPropertyValues(@Nullable Object excludePropId) {

            return editor;
                    if (oldItems == null || !Arrays.equals(items, oldItems)) {
                    text.setText(stringValue);
            if (excludePropId != null && excludePropId.equals(prop.getId())) {
 * See the License for the specific language governing permissions and
                        final String[] strings = new String[items.length];
                    final Object[] enumConstants = propertyType.getEnumConstants();
 */
                                updatePropertyValue(prop, button.getSelection());
                            EditTextDialog.showText(
import org.jkiss.dbeaver.ui.internal.UIMessages;
    @Nullable
                    // Do not refresh enum values - they are static
                    } else if (editControl instanceof StyledText text) {
        @NotNull DBSObject databaseObject,
import org.eclipse.swt.widgets.*;
            link.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }
import org.eclipse.swt.layout.GridData;
                items = new Object[0];
 * CustomFormEditor
        } else if (isTextPropertyType(propType)) {
                        }
                    value = GeneralUtils.convertString((String) UIUtils.normalizePropertyValue(value), dataType);
            } else {
                propertySource.setPropertyValue(null, prop.getId(), value);
                    }
                UIUtils.createEmptyLabel(parent, 1, 1);
        } else {

                combo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING));
                        Map<String, Object> options = new LinkedHashMap<>();
                        if (readOnly) {
                            combo.addModifyListener(e -> {
                                editor.setText(newValue);

        if (value instanceof DBPQualifiedObject qo) {
import org.jkiss.dbeaver.runtime.DBWorkbench;

                        text.addModifyListener(e -> updatePropertyValue(prop, text.getText()));
        for (DBPPropertyDescriptor prop : props) {
    protected void openObjectLink(Object linkData) {
            Label iconLabel = new Label(infoComposite, SWT.NONE);
    }
                    return;
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
                    strings.addFirst("");
        }
                            CommonUtils.toString(UIUtils.normalizePropertyValue(value))
            for (int i = 0, itemsLength = enumConstants.length; i < itemsLength; i++) {
        } finally {
     */
                                    log.debug("Error setting value from combo: " + ex.getMessage());
    private transient boolean isLoading;
            Composite bPH = UIUtils.createComposite(curButtonsContainer, 2);

    }
            if (property instanceof ObjectPropertyDescriptor && property.getLength() == PropertyLength.MULTILINE) {
                    .grab(true, true)
                for (Map.Entry<DBPPropertyDescriptor, Object> prop : editorValues.entrySet()) {
                                @Override
                text.setText(objectValueToString(value));
                    strings.add(curValue);
                Label label = UIUtils.createControlLabel(parent, propertyDisplayName);
                        options.put(DBEObjectManager.OPTION_UI_SOURCE, this);
                    combo.setText(stringValue);
            iconLabel.setImage(DBeaverIcons.getImage(DBIcon.SMALL_INFO));
import org.jkiss.dbeaver.model.struct.DBSObject;
            }
            result.add(prop);
            } else if (propertyType != null && propertyType.isEnum()) {
                    }
    /**
            if (items != null) {
                        }
import org.jkiss.dbeaver.utils.GeneralUtils;
            }
        }
import java.util.List;
            UIUtils.createControlLabel(
                            }
import org.jkiss.dbeaver.model.*;
                combo.setText(stringValue);
    ) {
            final Object[] enumConstants = propType.getEnumConstants();
            textLabel.setText(objectValueToString(value));
                    ToolBar toolBar = new ToolBar(parent1, SWT.FLAT);
        Class<?> propertyType = property.getDataType();
import java.util.*;
    }
                    } else if (editControl instanceof Text text) {
                parent,
                }
                if (!CommonUtils.isEmpty(propDescription)) {
            combo.setText(objectValueToString(value));
            } else if (editorControl instanceof StyledText text) {
                parent,
        if (curButtonsContainer != null) {

                    toolItem.setImage(DBeaverIcons.getImage(UIIcon.EDIT));
                            String newValue = EditTextDialog.editText(
                    try {
                Control editControl = createEditorControl(
                editorMap.put(prop, editControl);
                Combo combo = UIUtils.createLabelCombo(
        return property instanceof ObjectPropertyDescriptor opd &&

import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        try {
                if (value instanceof String) {
                    }
        boolean readOnly
                if (combo.getItemCount() == 0) {
                        log.error("Error renaming object", e);
                        );
import org.jkiss.dbeaver.Log;
import org.eclipse.swt.layout.GridLayout;
                if (items != null) {
            isLoading = true;
import org.eclipse.swt.layout.RowLayout;
                Object propertyValue = propertySource.getPropertyValue(null, prop.getId());
    private static boolean isTextPropertyType(@Nullable Class<?> propertyType) {
            Combo combo = UIUtils.createLabelCombo(
            layout.marginWidth = 0;
                        strings[i] = ((Enum<?>) enumConstants[i]).name();
import org.jkiss.dbeaver.model.meta.PropertyLength;
                }
            combo.setItems(strings);
                if (!CommonUtils.isEmpty(curValue) && !strings.contains(curValue)) {
                    setEditorValue(object, prop.getKey(), prop.getValue());
                if (editControl instanceof Button) {
        }
                    (property instanceof ObjectPropertyDescriptor && ((ObjectPropertyDescriptor) property).isPassword() ? SWT.PASSWORD : SWT.NONE));
        for (DBPPropertyDescriptor prop : propertySource.getProperties()) {
import org.eclipse.jface.layout.GridDataFactory;
     * Supported editors:
                    // nothing
                    .applyTo(editor);
    @Nullable
            Composite infoComposite = new Composite(parent, SWT.NONE);

public class CustomFormEditor {
    }
    }
    public boolean hasEditors() {
                public void mouseUp(MouseEvent e) {
                editor.setEnabled(false);
                            @Override
                        button.addSelectionListener(new SelectionAdapter() {
                Text editor = new Text(parent, SWT.MULTI | SWT.WRAP | SWT.BORDER | SWT.V_SCROLL | (readOnly ? SWT.READ_ONLY : SWT.NONE));
                button.setSelection(CommonUtils.toBoolean(value));
                if (editable) {
                }

 *
    }
        List<DBPPropertyDescriptor> result = new ArrayList<>();
                            }
    public void setEditorValue(@NotNull Object object, @NotNull DBPPropertyDescriptor property, @Nullable Object value) {
     * Text (strings, numbers, dates)
            String category = prop.getCategory();
            }
                        editor.setSelection(!editor.getSelection());
            Label label = UIUtils.createLabel(bPH, propertyDisplayName);
                            });
            }
import org.eclipse.swt.events.*;
    }

            if (prop.getId().equals(DBConstants.PROP_ID_NAME) && databaseObject != null && databaseObject.isPersisted()) {
        return result;
                text.setLayoutData(new GridData((BeanUtils.isNumericType(propType) ? GridData.HORIZONTAL_ALIGN_BEGINNING : GridData.FILL_HORIZONTAL) | GridData.VERTICAL_ALIGN_BEGINNING));
    //
                link.setText(getLinkTitle(value));
                                }
            }
                    group,
                UIUtils.createControlLabel(parent, propertyDisplayName);
            gd.horizontalSpan = 2;
                return editor;
                    if (editor.isEnabled()) {
import org.jkiss.code.Nullable;
                    final String[] strings = new String[enumConstants.length];
                if (commandContext != null && renamer != null) {
                    ContentAssistUtils.installContentProposal(combo, new ComboContentAdapter(), proposalProvider);
            }
            link.setData(value);
                    // Handle click on label
                strings[i] = ((Enum)enumConstants[i]).name();
                GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                        } else {
    private void updatePropertyValue(@NotNull DBPPropertyDescriptor prop, @Nullable Object value) {
                boolean editable = !isReadOnlyCon && (prop.isEditable(propertySource.getEditableValue()) ||
                link.setData(value);
        } else if (value instanceof Enum<?> e) {
                }

 * Unless required by applicable law or agreed to in writing, software

 * Copyright (C) 2010-2025 DBeaver Corp and others
        @NotNull Composite parent,
        }
                                editor.getShell(),
                if (!CommonUtils.equalObjects(text.getText(), stringValue)) {
                    ToolItem toolItem = new ToolItem(toolBar, SWT.PUSH);
        // List

            link.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> openObjectLink(link.getData())));
        isLoading = true;
            }

                }

                        text.addModifyListener(e -> updatePropertyValue(prop, text.getText()));
    private static final String VALUE_KEY = "form.data.value";
                for (Object item : items) {
        return propertyType == null || CharSequence.class.isAssignableFrom(propertyType) ||
                // Keep only basic properties
        if (editorControl instanceof Combo combo) {
            } else if (editorControl instanceof Button button) {
                    propertyValue,
                "",

                        combo.setItems(strings);
                                editor.getText()
                    propertySource.getEditableValue(),
 * You may obtain a copy of the License at
                    } catch (Throwable e) {
                curButtonsContainer = new ConComposite(parent, SWT.NONE);
            );
                    }));
        if (linkData != null) {
                }
            }
import org.jkiss.dbeaver.model.edit.DBEObjectManager;
                DBEObjectRenamer renamer = DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(
    private final DBPPropertySource propertySource;

import org.eclipse.swt.SWT;
                        for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
                }
                parent,
        Map<DBPPropertyDescriptor, Object> propValues = new HashMap<>();
                curButtonsContainer.setLayoutData(gd);
    }
                );
    }
                }
            if (property instanceof IPropertyValueListProvider listProvider) {
                }
                    editControl.setToolTipText(propDescription);
                    text.setText(stringValue);

                if ((combo.getStyle() & SWT.READ_ONLY) == 0) {
    }
            if (!CommonUtils.isEmpty(category)) {
                        if ((editControl.getStyle() & SWT.READ_ONLY) == SWT.READ_ONLY) {
                    strings.add(objectValueToString(item));
            infoComposite.setLayoutData(gd);
                        } else {
        }
    }
 *
        this.commandContext = commandContext;
    }
            UIUtils.openWebBrowser(CommonUtils.toString(linkData));
                    .hint(SWT.DEFAULT, UIUtils.getTextHeight(editor) * 3)
                    propertySource.getEditableValue().getClass(), DBEObjectRenamer.class);
        for (DBPPropertyDescriptor prop : allProps) {
            }
    @NotNull
        }
/**
                    .align(SWT.FILL, SWT.TOP)
 *     http://www.apache.org/licenses/LICENSE-2.0
                return combo;
                    !editable);
import org.jkiss.dbeaver.model.edit.DBECommandContext;
            });
            if (readOnly) {
        return !editorMap.isEmpty();
                    // Add null value
    private final DBECommandContext commandContext;
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
                @Override

        } if (value instanceof DBPNamedObject namedObject) {
                    toolItem.setToolTipText("Edit...");
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
        } finally {
            iconLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.TOP, false, false));
        }
                Object object = propertySource.getEditableValue();
                    GridData gd = (GridData) editControl.getLayoutData();
                            editControl.computeSize(SWT.DEFAULT, SWT.DEFAULT).x);
        @NotNull Object object,
                    }
        return value == null ? "N/A" : "<a>" + objectValueToString(value) + "</a>";
    private Composite curButtonsContainer;
    ) {
                                UIMessages.edit_text_dialog_title_edit_value,
import org.jkiss.utils.BeanUtils;

                        });
                label.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                            public void widgetSelected(SelectionEvent e) {
                    if (editControl instanceof Combo combo) {
 * limitations under the License.
        String propertyDisplayName = property.getDisplayName();
        }
        Class<?> propType = property.getDataType();
                HoverControlSupport.install(editor, (parent1, editor1) -> {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } else if (BeanUtils.isBooleanType(propType)) {
        String stringValue = objectValueToString(value);
    private final Map<DBPPropertyDescriptor, Control> editorMap = new HashMap<>();
                final Object[] items = listProvider.getPossibleValues(object);
            return infoComposite;
                            options,
                    SWT.BORDER | SWT.DROP_DOWN | (listProvider.allowCustomValue() ? SWT.NONE : SWT.READ_ONLY)
                            databaseObject,
                            if (newValue != null) {
                            strings[i] = items[i] instanceof DBPNamedObject ? ((DBPNamedObject) items[i]).getName() : CommonUtils.toString(items[i]);

            propertyDisplayName += " (*)";
                propertyDisplayName);
                }
                editor.setText(objectValueToString(value));
                    for (int i = 0, itemsLength = enumConstants.length; i < itemsLength; i++) {
                String[] stringsArray = strings.toArray(new String[0]);
                GridDataFactory.fillDefaults()
                                editor.getText()
                    parent,
                List<String> strings = new ArrayList<>(items.length);
                        editControl.setLayoutData(gd);
            GridData gd = new GridData(SWT.FILL, SWT.FILL, true, false);
    public void createPropertyEditor(Composite group, DBPPropertyDescriptor prop) {
     * Combo (lists)
        return DBWorkbench.getPlatform().getEditorsRegistry().getObjectManager(
                continue;
                    } else if (editControl instanceof Button button) {

 * you may not use this file except in compliance with the License.
        }
    //
                    //boolean plainText = (CharSequence.class.isAssignableFrom(propType));
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
        } else {
    private boolean supportsObjectRename() {

    private final DBSObject databaseObject;
            isLoading = false;
        @Nullable Object value,

                                try {
            }
                }
                            combo.addSelectionListener(new SelectionAdapter() {
                combo.setData(LIST_VALUE_KEY, items);
                CommonUtils.toBoolean(value),
    ///////////////////////////////////////////////
import org.jkiss.utils.CommonUtils;
            return e.name();
            layout.marginHeight = 0;
                objectValueToString(value),
                }
 * DBeaver - Universal Database Manager
                // It is a list provider but it seems to be lazy and not yet initialized
        }
/*
                        gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING);

                                    updatePropertyValue(prop, combo.getText());
                        }
 */
                bPH,
        } else if (!readOnly && propType.isEnum()) {
     * Button (booleans)
            } else if (editorControl instanceof Link link) {
                        renamer.renameObject(

                            commandContext,

                    }
                propertyDisplayName,
    public boolean isEditableObject() {
            if (propertySource != null) {
                if (!property.isRequired()) {
        this.propertySource = propertySource;
        // List
        if (!readOnly && property instanceof IPropertyValueListProvider listProvider) {
                }

            {

        loadEditorValues(propValues);
                            });
        }
                }
                    if (editControl instanceof Text || editControl instanceof StyledText || editControl instanceof Combo) {
            if (editorControl instanceof Text text) {
import org.eclipse.jface.fieldassist.ComboContentAdapter;
            isLoading = false;
                                }
                }
}
    private static final String LIST_VALUE_KEY = "form.data.list.value";
import org.eclipse.swt.custom.StyledText;
    ////////////////////////////////////////////////
    @NotNull
            curButtonsContainer = null;
        @Nullable DBECommandContext commandContext,
            } else {
        return false;
            return link;
            Object[] items = listProvider.getPossibleValues(object);
        List<DBPPropertyDescriptor> allProps = filterProperties(propertySource.getProperties());
                    if (gd == null) {
                });
                    toolItem.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
                String propDescription = prop.getDescription();
        if (!isLoading) {
        this.editorMap.clear();
            infoComposite.setLayout(layout);
        }
 *

        }
import org.jkiss.dbeaver.model.edit.DBEObjectRenamer;


                                } catch (Exception ex) {
            return qo.getFullyQualifiedName(DBPEvaluationContext.UI);
        this.databaseObject = databaseObject;
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
            textLabel.setLayoutData(textGd);
            if (prop.isEditable(propertySource.getEditableValue()) ||
                return text;
            if (curButtonsContainer == null) {

        if (property.isRequired()) {
import org.jkiss.dbeaver.ui.*;
            Object value = propertySource.getPropertyValue(null, prop.getId());
            GridLayout layout = new GridLayout(2, false);
                (prop.getId().equals(DBConstants.PROP_ID_NAME) && supportsObjectRename()))

import org.jkiss.dbeaver.model.data.DBDDisplayFormat;
        }
            curButtonsContainer.dispose();
    private String getLinkTitle(Object value) {
            return UIUtils.createLabelText(
                }
                combo.setItems(stringsArray);
                Object oldPropValue = propertySource.getPropertyValue(null, prop.getId());
                        gd.widthHint = Math.max(
            }
                    combo.setItems(strings);
            combo.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_BEGINNING));
            (propertyType.getComponentType() != null && CharSequence.class.isAssignableFrom(propertyType.getComponentType())) ||
                    }
        @NotNull DBPPropertySource propertySource


            propertySource.getEditableValue().getClass(), DBEObjectRenamer.class) != null;
                SWT.BORDER | SWT.READ_ONLY);
            label.addMouseListener(new MouseAdapter() {

                if (propertyValue == null && prop instanceof ObjectPropertyDescriptor && ((ObjectPropertyDescriptor) prop).isOptional()) {
import org.jkiss.code.NotNull;
            }
    }


                            );
                                editor.getShell(),
    private static String objectValueToString(Object value) {
            );
        Control editorControl = editorMap.get(property);
                                UIMessages.edit_text_dialog_title_edit_value,
                return true;
