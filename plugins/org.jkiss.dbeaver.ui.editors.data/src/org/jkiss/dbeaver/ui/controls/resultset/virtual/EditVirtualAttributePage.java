        dialogArea.setLayoutData(new GridData(GridData.FILL_BOTH));
        previewText.setLayoutData(new GridData(GridData.FILL_BOTH));
import org.jkiss.dbeaver.ui.editors.object.struct.BaseObjectEditPage;
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
import java.util.ArrayList;
        }
                }
    private void generatePreviewValue() {
import org.eclipse.swt.widgets.Text;
        } catch (Exception e) {
                for (DBSDataType dataType : localDataTypes) {
        super(ResultSetMessages.virtual_edit_attribute_viewer_title, DBIcon.TREE_COLUMN);
    public String getHelpContextId() {
    private final DBVEntityAttribute vAttr;
                expressionProposals.add(attr.getLabel());
            DBVEntityAttribute vAttr2 = vAttr.getEntity().getVirtualAttribute(name);
        final Composite dialogArea = UIUtils.createComposite(parent, 1);
    public EditVirtualAttributePage(ResultSetViewer viewer, DBVEntityAttribute vAttr) {
        this.viewer = viewer;
 *
            previewText.setText(GeneralUtils.getExpressionParseMessage(e));
 * DBeaver - Universal Database Manager
            ContentAssistUtils.installContentProposal(
            if (vAttr2 == null || vAttr2 == vAttr) {
            return;
            new SmartTextContentAdapter(),
                        vAttr.setDataKind(dataType.getDataKind());
            if (dataKind != DBPDataKind.UNKNOWN) {
            if (dataTypeProvider != null) {
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetViewer;
                DBVUtils.parseExpression(expression);
import java.util.Comparator;
        for (;;) {
            ResultSetMessages.virtual_edit_attribute_label_combo_type_name_tip,
import org.jkiss.dbeaver.ui.UIUtils;

 */
            }
 * Custom virtual attribute edit dialog
                        kindCombo.setText(dataType.getDataKind().name());
                    if (dataType != null) {
            try {
 * See the License for the specific language governing permissions and
 */
        if (currentRow == null) {
import org.eclipse.swt.SWT;
    private Combo kindCombo;
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
        return vAttr;
package org.jkiss.dbeaver.ui.controls.resultset.virtual;

            ResultSetMessages.virtual_edit_attribute_label_combo_type_name,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.*;
                new StringContentProposalProvider(typeCombo.getItems()));

 *     http://www.apache.org/licenses/LICENSE-2.0

            DBPDataTypeProvider dataTypeProvider = DBUtils.getAdapter(DBPDataTypeProvider.class, dataSource);
                typeCombo.addModifyListener(e -> {
                currentRow.values,
        vAttr.setExpression(expressionText.getText());
            return;
    public void performFinish() throws DBException {
        ResultSetRow currentRow = viewer.getCurrentRow();
        }
            for (DBDAttributeBinding attr : viewer.getModel().getAttributes()) {

                if (CommonUtils.isEmpty(defTypeName)) {
        }
        String name = vAttr.getName();
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
                    typeCombo.setText(defTypeName);
        vAttr.setName(nameText.getText());
                    defTypeName = dataTypeProvider.getDefaultDataTypeName(DBPDataKind.STRING);
        return "Virtual-column-expressions";
            name = vAttr.getName() + index;
        if (viewer != null) {
        gd.heightHint = expressionText.getLineHeight() * 5;
                    if (dataType != null) {
            }
 *

        GridData gd = new GridData(GridData.FILL_BOTH);

                kindCombo.add(dataKind.name());
            index++;

                new ComboContentAdapter(),
        Composite panel = UIUtils.createComposite(dialogArea, 2);
import org.jkiss.dbeaver.utils.GeneralUtils;
        DBPDataSource dataSource = vAttr.getEntity().getDataSource();
    }
 * you may not use this file except in compliance with the License.
    }


import org.eclipse.swt.widgets.Composite;
                    }
                    typeCombo.add(dataType.getFullTypeName());
    @Override
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
                    }
                previewText.setText(ResultSetMessages.virtual_edit_attribute_preview_message_editor);
            } else {
                break;

                viewer.getModel().getAttributes(),
import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        panel.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
 * You may obtain a copy of the License at
            } catch (Exception e) {

import org.jkiss.utils.CommonUtils;
    @Override
                    vAttr.setTypeName(defTypeName);

        generatePreviewValue();
                typeCombo.setText(CommonUtils.notEmpty(vAttr.getTypeName()));
            SWT.BORDER | SWT.DROP_DOWN);
        nameText = UIUtils.createLabelText(panel, ResultSetMessages.virtual_edit_attribute_label_text_column_name, name);
                }
import org.eclipse.swt.widgets.Combo;
import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;
            previewText.setText(ResultSetMessages.virtual_edit_attribute_preview_message_current_text);
/**
import org.jkiss.dbeaver.model.struct.DBSDataType;
        expressionText.setLayoutData(gd);
                localDataTypes.sort(Comparator.comparing(DBSDataType::getFullTypeName));
}
        typeCombo = UIUtils.createLabelCombo(
        kindCombo.setText(vAttr.getDataKind().name());

        for (DBPDataKind dataKind : DBPDataKind.values()) {
            panel,
 * Unless required by applicable law or agreed to in writing, software
    private final ResultSetViewer viewer;
                if (!CommonUtils.isEmpty(defTypeName)) {
        }

        try {
        super.performFinish();
                nameText.getText());
                }
        kindCombo = UIUtils.createLabelCombo(panel, ResultSetMessages.virtual_edit_attribute_label_combo_data_kind, ResultSetMessages.virtual_edit_attribute_label_combo_data_kind_tip, SWT.BORDER | SWT.DROP_DOWN | SWT.READ_ONLY);
            new StringContentProposalProvider(expressionProposals.toArray(new String[0])));
            JexlExpression parsedExpression = DBVUtils.parseExpression(expression);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }


    private Text expressionText;
            previewText.setText(CommonUtils.toString(result));
    private Text previewText;
                    DBSDataType dataType = dataTypeProvider.getLocalDataType(typeCombo.getText());
    }
        int index = 1;
                });
                parsedExpression,
        previewText = UIUtils.createLabelText(panel, ResultSetMessages.virtual_edit_attribute_label_text_preview, "", SWT.BORDER | SWT.READ_ONLY | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);
                previewText.setText(GeneralUtils.getExpressionParseMessage(e));
            Object result = DBVUtils.evaluateDataExpression(
    }
            }
    protected Control createPageContents(Composite parent) {
import org.jkiss.dbeaver.DBException;
    }
 * limitations under the License.

        if (viewer == null) {
public class EditVirtualAttributePage extends BaseObjectEditPage implements IHelpContextIdProvider {
    public DBSObject getObject() {
import org.jkiss.dbeaver.model.struct.DBSObject;
        List<String> expressionProposals = new ArrayList<>();
                List<DBSDataType> localDataTypes = new ArrayList<>(dataTypeProvider.getLocalDataTypes());
        {
                    DBSDataType dataType = dataTypeProvider.getLocalDataType(defTypeName);
    private Text nameText;
import org.jkiss.dbeaver.ui.IHelpContextIdProvider;

import org.jkiss.dbeaver.ui.controls.resultset.ResultSetRow;
            }
import org.eclipse.swt.layout.GridData;
    @Override
                String defTypeName = vAttr.getTypeName();
        return dialogArea;
                typeCombo,
        }
        vAttr.setTypeName(typeCombo.getText());
import org.apache.commons.jexl3.JexlExpression;
            }
 *
                viewer.getDataContainer(),
        String expression = expressionText.getText();


import org.eclipse.swt.widgets.Control;
import org.eclipse.jface.fieldassist.ComboContentAdapter;
import org.jkiss.dbeaver.model.virtual.DBVUtils;
        gd.widthHint = 300;
        this.vAttr = vAttr;
        expressionText.addModifyListener(e -> generatePreviewValue());
        ContentAssistUtils.installContentProposal(
    private Combo typeCombo;

        expressionText = UIUtils.createLabelText(panel, ResultSetMessages.virtual_edit_attribute_label_text_expression, CommonUtils.notEmpty(vAttr.getExpression()), SWT.BORDER | SWT.MULTI | SWT.V_SCROLL | SWT.WRAP);
        vAttr.setDataKind(CommonUtils.valueOf(DBPDataKind.class, kindCombo.getText(), DBPDataKind.STRING));
/*
            expressionText,

import java.util.List;
