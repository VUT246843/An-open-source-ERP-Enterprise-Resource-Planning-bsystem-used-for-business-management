 */
            IPropertyValueValidator valueValidator = ((ObjectPropertyDescriptor) property).getValueValidator();

import java.time.LocalDateTime;
        }
                return new CustomCheckboxCellEditor(parent);
        if (!property.isEditable(object)) {
    private static class PropertyCellEditorValidator implements ICellEditorValidator {
}
            //return new CheckboxCellEditor(parent);
        if (propertyType == null || CharSequence.class.isAssignableFrom(propertyType)) {
                SWT.DROP_DOWN | SWT.READ_ONLY);
                }

                    strings = ArrayUtils.insertArea(String.class, strings, 0, new Object[] { "" });
            log.warn("Unsupported property type: " + propertyType.getName());
            final IPropertyValueListProvider listProvider = (IPropertyValueListProvider) property;
        Class<?> propertyType = property.getDataType();
                editor.setValidator(new PropertyCellEditorValidator(valueValidator, object));
                final CustomComboBoxCellEditor editor = new CustomComboBoxCellEditor(
                AdvancedTextCellEditor editor = new AdvancedTextCellEditor(parent);
            CustomNumberCellEditor editor = new CustomNumberCellEditor(parent, propertyType);
            return null;
import org.jkiss.dbeaver.model.meta.IPropertyValueValidator;
        if (property instanceof ObjectPropertyDescriptor) {
    }
    private static void setValidator(CellEditor editor, DBPPropertyDescriptor property, Object object) {
                strings,
            final Object[] items = listProvider.getPossibleValues(object);
                    return null;
        PropertyCellEditorValidator(IPropertyValueValidator validator, Object object) {
            } catch (Exception e) {
 * Unless required by applicable law or agreed to in writing, software
            this.validator = validator;
            for (int i = 0, itemsLength = enumConstants.length; i < itemsLength; i++) {
                    SWT.DROP_DOWN | (listProvider.allowCustomValue() ? SWT.NONE : SWT.READ_ONLY));
                strings[i] = ((Enum)enumConstants[i]).name();
import org.jkiss.dbeaver.model.meta.PropertyLength;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                } else {
import org.jkiss.dbeaver.runtime.properties.ObjectPropertyDescriptor;
        } else if (BeanUtils.isBooleanType(propertyType)) {
            this.object = object;
    public static CellEditor createCellEditor(Composite parent, Object object, DBPPropertyDescriptor property, int style)
import org.eclipse.swt.widgets.Composite;
 * limitations under the License.
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
        private final Object object;
            if (items != null) {
        style &= ~SWT.SHEET;
        boolean isPropertySheet = (style & SWT.SHEET) != 0;
        }
                return editor;
                setValidator(editor, property, object);
            final Control editorControl = cellEditor.getControl();
                if (!property.isRequired()) {
import org.jkiss.dbeaver.ui.controls.*;
import org.jkiss.utils.ArrayUtils;
        return cellEditor;
 * See the License for the specific language governing permissions and
    private static final Log log = Log.getLog(PropertyEditorUtils.class);
/**
                String[] strings = new String[items.length];
import org.eclipse.swt.SWT;
                return editor;
            try {
    public static CellEditor createPropertyEditor(final IServiceLocator serviceLocator, Composite parent, DBPPropertySource source, DBPPropertyDescriptor property, int style)
 * you may not use this file except in compliance with the License.
            }
public class PropertyEditorUtils {
            UIUtils.addDefaultEditActionsSupport(serviceLocator, editorControl);
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.viewers.ICellEditorValidator;
    }
            setValidator(editor, property, object);
        } else {
            return new CustomLocalDateTimeCellEditor(parent);
            return editor;
        } else if (BeanUtils.isNumericType(propertyType)) {
import org.eclipse.ui.services.IServiceLocator;
        public String isValid(Object value) {
import org.jkiss.utils.CommonUtils;
 * Licensed under the Apache License, Version 2.0 (the "License");

            }
        final Object object = source.getEditableValue();
 * DBeaver - Universal Database Manager
    }
                }
        // List

 */
    }
        CellEditor cellEditor = createCellEditor(parent, object, property, style);
                if (validValue) {
        } else if (LocalDateTime.class.isAssignableFrom(propertyType)) {
 *
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.model.DBPNamedObject;

import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
        }
        @Override
                setValidator(editor, property, object);
        if (cellEditor != null) {


            } else {
            if (isPropertySheet) {
                    strings[i] = items[i] instanceof DBPNamedObject ? ((DBPNamedObject)items[i]).getName() : CommonUtils.toString(items[i]);
                parent,
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.BeanUtils;
            final String[] strings = new String[enumConstants.length];
            }
        private final IPropertyValueValidator validator;
            return null;
                boolean validValue = validator.isValidValue(object, value);
                return new CustomComboBoxCellEditor(parent, new String[] { Boolean.TRUE.toString(), Boolean.FALSE.toString()} , SWT.DROP_DOWN | SWT.READ_ONLY);
            }
        }
                for (int i = 0, itemsLength = items.length; i < itemsLength; i++) {
            }
    {
                    strings,
                return editor;
import org.jkiss.dbeaver.ui.UIUtils;
            final Object[] enumConstants = propertyType.getEnumConstants();
        }
        }
        if (source == null) {
                    // Add null value
        }
            if (valueValidator != null) {
                    parent,
            }
import org.eclipse.jface.viewers.CellEditor;
    {

            } else {
            if (property instanceof ObjectPropertyDescriptor && ((ObjectPropertyDescriptor) property).getLength() == PropertyLength.MULTILINE) {
import org.jkiss.dbeaver.model.meta.IPropertyValueListProvider;
        }
import org.eclipse.swt.widgets.Control;
import org.jkiss.dbeaver.Log;

package org.jkiss.dbeaver.ui.properties;
/*
                CustomTextCellEditor editor = new CustomTextCellEditor(parent, SWT.SINGLE | ((style & SWT.PASSWORD) != 0 ? SWT.PASSWORD : SWT.NONE));
            return null;
        } else if (propertyType.isEnum()) {
        if (property instanceof IPropertyValueListProvider) {
 * PropertyEditorUtils
            return new CustomComboBoxCellEditor(

 *
                }
 * distributed under the License is distributed on an "AS IS" BASIS,
                    return "Invalid";
                return e.getMessage();
