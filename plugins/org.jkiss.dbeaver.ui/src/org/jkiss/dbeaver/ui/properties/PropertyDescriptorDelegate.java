}    public ILabelProvider getLabelProvider() {
    private final DBPPropertyDescriptor delegate;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

            if (element instanceof DBPNamedObject) {

        }
    }
import org.eclipse.jface.viewers.CellEditor;
        this.delegate = delegate;
        public String getText(Object element) {
        return null;
    }
import org.eclipse.jface.viewers.ILabelProvider;
import org.jkiss.dbeaver.utils.GeneralUtils;

import org.eclipse.swt.widgets.Composite;
        {
        if (delegate.hasFeature(DBConstants.PROP_FEATURE_EXPENSIVE) ||
    public Object getId() {
    public Object getHelpContextIds() {
            return super.getImage(element);
                    }
import org.eclipse.jface.viewers.ColumnLabelProvider;
        public Image getImage(Object element) {
                    final DBNDatabaseNode node = DBWorkbench.getPlatform().getNavigatorModel().findNode((DBSObject) element);
                    return DBeaverIcons.getImage(image);
    @Override
 *     http://www.apache.org/licenses/LICENSE-2.0
        return false;
    }
    @Override
public class PropertyDescriptorDelegate implements IPropertyDescriptor
        String category = delegate.getCategory();
    public String getDescription() {
    @Override
 * DBeaver - Universal Database Manager
        return delegate.getId();
            if (element instanceof DBPObject) {
 *
/**
        }
    }

                DBPImage image = DBValueFormatting.getObjectImage((DBPObject) element, false);
 * PropertyDescriptorDelegate
            category = DBConstants.CAT_MAIN;
        return DEFAULT_LABEL_PROVIDER;
    }
    public String getDisplayName() {
 * limitations under the License.
import org.jkiss.dbeaver.model.*;
        return delegate.getDisplayName();
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    public CellEditor createPropertyEditor(Composite parent) {
        if (CommonUtils.isEmpty(category)) {

 * you may not use this file except in compliance with the License.
        @Override

            return new String[] { IPropertySheetEntry.FILTER_ID_EXPERT };
    @Override
        @Override
 * Unless required by applicable law or agreed to in writing, software
 * See the License for the specific language governing permissions and
                    if (node != null) {
    @Override
    }
        return delegate.getDescription();
import org.eclipse.swt.graphics.Image;
            DBConstants.CAT_STATISTICS.equals(delegate.getCategory()))
    @Override
    }
        this.propSource = propSource;
            } else {
                return CommonUtils.toString(GeneralUtils.makeDisplayString(element));
        }
    private static final ILabelProvider DEFAULT_LABEL_PROVIDER = new ColumnLabelProvider() {

            }
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override

package org.jkiss.dbeaver.ui.properties;
*/
import org.jkiss.dbeaver.model.preferences.DBPPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetEntry;
/*


        if (!delegate.isEditable(propSource.getEditableValue())) {
        }
 *
    };
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */
import org.eclipse.swt.SWT;
                }


    @Override

            return null;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.preferences.DBPPropertySource;
                        image = node.getNodeIcon();

                if (image != null) {
                if (image == null && element instanceof DBSObject) {
    }
    @Override
import org.jkiss.utils.CommonUtils;
 */
            delegate.hasFeature(DBConstants.PROP_FEATURE_HIDDEN) ||
        return PropertyEditorUtils.createCellEditor(parent, propSource.getEditableValue(), delegate, SWT.SHEET);
{
    }
 *
                return DBUtils.getObjectFullName((DBPNamedObject) element, DBPEvaluationContext.UI);
        return null;
import org.jkiss.dbeaver.ui.DBeaverIcons;
    public boolean isCompatibleWith(IPropertyDescriptor anotherProperty) {
/*
    public String[] getFilterFlags() {
                }
    public PropertyDescriptorDelegate(DBPPropertySource propSource, DBPPropertyDescriptor delegate) {
        return category;
    public String getCategory() {
 * You may obtain a copy of the License at
    private final DBPPropertySource propSource;
            }
