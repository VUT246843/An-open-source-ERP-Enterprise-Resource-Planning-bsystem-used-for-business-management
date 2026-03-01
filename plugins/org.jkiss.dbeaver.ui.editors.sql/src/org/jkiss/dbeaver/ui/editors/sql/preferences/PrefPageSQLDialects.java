        dmlKeywordsText.setText(String.join(",", curDialect.getDMLKeywords()));
import org.jkiss.dbeaver.ui.UIUtils;
            Composite dialectsGroup = UIUtils.createComposite(composite, 1);

    }
            return;
        if (!dialect.isHidden()) {

        executeKeywordsText.setText(String.join(",", curDialect.getExecuteKeywords()));

import org.jkiss.dbeaver.ui.DBeaverIcons;
 * You may obtain a copy of the License at
        return element;
    private Text blockStatementsText;
            gd.heightHint = 200;
        TreeItem di;
    protected void performDefaults() {
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.eclipse.ui.IWorkbenchPropertyPage;
        //store.setValue(SQLPreferenceConstants.SCRIPT_BIND_EMBEDDED_READ, bindEmbeddedReadCheck.getSelection());
        super();
        boolean isPrefPage = element == null;
                    if (selection.length == 1) {

                @Override
            dualTableNameText = UIUtils.createLabelText(miscGroup, "Dual table name", "", SWT.BORDER);
/*
        if (di != null) {
        transactionKeywordsText.setText(String.join(",", curDialect.getTransactionKeywords()));
import java.util.List;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        subDialects.sort(Comparator.comparing(SQLDialectMetadata::getLabel));
 */
import org.jkiss.dbeaver.model.sql.registry.SQLDialectDescriptor;

            if (dataSource != null) {
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            di.setImage(DBeaverIcons.getImage(dialect.getIcon()));
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
            testQueryText = UIUtils.createLabelText(miscGroup, "Test query", "", SWT.BORDER);

        //blockStatementsText.setText(String.join(",", curDialect.getBlockBoundStrings()));
                gd.horizontalSpan = 2;
            reservedWordsText = UIUtils.createLabelTextAdvanced(kwGroup, "Reserved words", "", SWT.BORDER);

            transactionKeywordsText = UIUtils.createLabelTextAdvanced(kwGroup, "Transaction keywords", "", SWT.BORDER);

            dialectText.setText(curDialect.getLabel());

    private Text dialectText;
 * Unless required by applicable law or agreed to in writing, software
            Composite settingsGroup = UIUtils.createComposite(composite, 2);
 */
            blockStatementsText = UIUtils.createLabelTextAdvanced(kwGroup, "Block statements", "", SWT.BORDER);

            if (!isPrefPage) {
        List<SQLDialectMetadata> subDialects = dialect.getSubDialects(true);


            dialectsGroup.setLayoutData(new GridData(GridData.FILL_VERTICAL | GridData.HORIZONTAL_ALIGN_BEGINNING));
            ddlKeywordsText = UIUtils.createLabelTextAdvanced(kwGroup, "DDL keywords", "", SWT.BORDER);
    }
    @Override
 * limitations under the License.
            functionNamesText = UIUtils.createLabelTextAdvanced(kwGroup, "Function names", "", SWT.BORDER);
        }
        }
            di = parentItem;
        this.element = element;
 *     http://www.apache.org/licenses/LICENSE-2.0
        for (SQLDialectMetadata dm : subDialects) {
 * PrefPageSQLDialects
import org.eclipse.swt.widgets.*;
        {
            dialectTable.addSelectionListener(new SelectionAdapter() {
    public boolean performOk() {
    private Text ddlKeywordsText;
            Composite kwGroup = UIUtils.createTitledComposite(settingsGroup, "Keywords", 2, GridData.FILL_HORIZONTAL);
            List<SQLDialectMetadata> dialects = DBWorkbench.getPlatform().getSQLDialectRegistry().getRootDialects();
                        curDialect = (SQLDialectDescriptor) selection[0].getData();
    private Text transactionKeywordsText;
            createDialectItem(dialectTable, di, dm);
        loadDialectSettings();
import java.util.Comparator;

    protected Control createPreferenceContent(@NotNull Composite parent) {
    }
import org.eclipse.core.runtime.IAdaptable;
/**
                Composite nameComp = UIUtils.createComposite(settingsGroup, 2);

        dataTypesText.setText(String.join(",", curDialect.getDataTypes()));
 *

        statementDelimiterText.setText(curDialect.getScriptDelimiter());
    public void setElement(IAdaptable element) {
    private Text testQueryText;

    private Text statementDelimiterText;
            gd.widthHint = UIUtils.getFontHeight(settingsGroup) * 50;
    private Text dmlKeywordsText;

        ddlKeywordsText.setText(String.join(",", curDialect.getDDLKeywords()));

    }

    }

        Composite composite = UIUtils.createComposite(parent, isPrefPage ? 2 : 1);
 * DBeaver - Universal Database Manager

import org.jkiss.code.NotNull;
            di.setText(dialect.getLabel());
            GridData gd = new GridData(GridData.FILL_BOTH);
    private Text dualTableNameText;
            dialectTable.setLayoutData(gd);
import org.jkiss.dbeaver.model.sql.SQLDialectMetadata;
        DBPPreferenceStore store = DBWorkbench.getPlatform().getPreferenceStore();
    private Text functionNamesText;
            statementDelimiterText = UIUtils.createLabelText(miscGroup, "Statement delimiter", "", SWT.BORDER);
    @Override
        super.performDefaults();
        }
            executeKeywordsText = UIUtils.createLabelTextAdvanced(kwGroup, "Execute keywords", "", SWT.BORDER);
            dataTypesText = UIUtils.createLabelTextAdvanced(kwGroup, "Data Types", "", SWT.BORDER);
            //dialects.sort(Comparator.comparing(SQLDialectDescriptor::getLabel));
        performDefaults();
package org.jkiss.dbeaver.ui.editors.sql.preferences;

            }
import org.jkiss.dbeaver.utils.PrefUtils;
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
            Composite miscGroup = UIUtils.createTitledComposite(settingsGroup, "Miscellaneous", 2, GridData.FILL_HORIZONTAL);
                }
import org.eclipse.swt.SWT;
                gd = new GridData(GridData.FILL_HORIZONTAL);
        }
        if (curDialect == null) {
    public PrefPageSQLDialects() {
                curDialect = dataSource.getScriptDialect();
        }
public class PrefPageSQLDialects extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
            di = parentItem == null ? new TreeItem(dialectTable, SWT.NONE) : new TreeItem(parentItem, SWT.NONE);
    private void loadDialectSettings() {
    private Text executeKeywordsText;
            // Create dialect selector

            dmlKeywordsText = UIUtils.createLabelTextAdvanced(kwGroup, "Data modify keywords", "", SWT.BORDER);

            }
 *
            UIUtils.createControlLabel(dialectsGroup, "Dialects", 2);
import org.eclipse.ui.IWorkbench;
        reservedWordsText.setText(String.join(",", curDialect.getReservedWords()));
    @Override
 * you may not use this file except in compliance with the License.

    public IAdaptable getElement() {
        }
        } else {
        if (element != null) {
            settingsGroup.setLayoutData(gd);
    private void createDialectItem(Tree dialectTable, TreeItem parentItem, SQLDialectMetadata dialect) {
    @Override
import org.eclipse.swt.layout.GridData;
}        if (dialectText != null) {
    @Override
 *
import org.eclipse.swt.events.SelectionEvent;
                public void widgetSelected(SelectionEvent e) {
                nameComp.setLayoutData(gd);
            Tree dialectTable = new Tree(dialectsGroup, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sql.dialects"; //$NON-NLS-1$
        }
            ((GridData)kwGroup.getLayoutData()).horizontalSpan = 2;
        PrefUtils.savePreferenceStore(store);
            GridData gd = new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_BEGINNING);
import org.eclipse.swt.events.SelectionAdapter;
            });
            DBPDataSourceContainer dataSource = element.getAdapter(DBPDataSourceContainer.class);
            //UIUtils.createControlLabel(settingsGroup, SQLEditorMessages.pref_page_sql_format_label_settings, 2);
                dialectText = UIUtils.createLabelText(nameComp, "Dialect", "", SWT.READ_ONLY);

 * See the License for the specific language governing permissions and
                    TreeItem[] selection = dialectTable.getSelection();
    @NotNull
    private Text dataTypesText;
            for (SQLDialectMetadata dialect : dialects) {
        functionNamesText.setText(String.join(",", curDialect.getFunctions()));
 * Licensed under the Apache License, Version 2.0 (the "License");
    private IAdaptable element;

                        loadDialectSettings();

    }
        return composite;
    private Text reservedWordsText;


            di.setExpanded(true);
            di.setData(dialect);
    }
    public void init(IWorkbench workbench) {
        if (isPrefPage) {
            }

    @Override
    private SQLDialectMetadata curDialect;
    }

    }
        return super.performOk();

                    }
                createDialectItem(dialectTable, null, dialect);
