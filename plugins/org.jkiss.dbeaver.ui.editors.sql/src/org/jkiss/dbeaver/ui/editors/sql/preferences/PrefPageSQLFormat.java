                        }
        Composite composite = UIUtils.createComposite(parent, 3);
import org.eclipse.swt.widgets.Control;
        } catch (DBException e) {

            } catch (Exception e) {
import org.jkiss.dbeaver.ui.editors.sql.preferences.format.SQLFormatterConfigurator;
import org.eclipse.jface.text.source.ISourceViewer;

        }
            if (text instanceof StyledText) {
        }
import org.jkiss.dbeaver.utils.ContentUtils;
 */
        formatCurrentQueryCheck = UIUtils.createCheckbox(

import org.eclipse.swt.SWT;
            @Override
    @NotNull
            log.error(e);
    {
/*

            curConfigurator.resetSettings(store);
import org.jkiss.code.Nullable;
                styleBoldKeywords = UIUtils.createCheckbox(
            formatterSelector.add(DBPIdentifierCase.capitalizeCaseName(formatterDesc.getLabel()));
            gd.horizontalSpan = 3;
import java.util.Comparator;
        formatterGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            {

import org.jkiss.dbeaver.model.sql.registry.SQLFormatterDescriptor;
            SQLEditorMessages.pref_page_sql_format_label_format_active_query,
        Composite formatterGroup = UIUtils.createComposite(composite, 1);
                final String sqlText = ContentUtils.readToString(sqlStream, StandardCharsets.UTF_8);
    // Formatter
        {
import org.jkiss.dbeaver.model.sql.format.tokenized.SQLFormatterTokenized;
        );
import org.jkiss.dbeaver.ui.UIUtils;
        {
                    curConfigurator.saveSettings(getTargetPreferenceStore());
                curConfigurator = new SQLExternalFormatterConfigurationPage();
import java.io.InputStream;
import org.eclipse.swt.events.SelectionAdapter;
    @Override
        UIUtils.disposeChildControls(formatterConfigPlaceholder);
                log.error(e);
import org.jkiss.dbeaver.model.sql.SQLModelPreferences;
                performApply();
    {
import java.util.Locale;
 * limitations under the License.
        });
                sqlViewer.setInput(new StringEditorInput("SQL preview", sqlText, true, GeneralUtils.getDefaultFileEncoding()));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        );
                    SQLEditorMessages.pref_page_sql_format_label_bold_keywords_tip,
package org.jkiss.dbeaver.ui.editors.sql.preferences;
        try {
import org.eclipse.jface.text.TextSelection;
        formatters.sort(Comparator.comparing(SQLFormatterDescriptor::getLabel));
                    final String sqlText = ContentUtils.readToString(sqlStream, StandardCharsets.UTF_8);

            sqlViewer = new SQLEditorBase() {

        for (SQLFormatterDescriptor formatterDesc : formatters) {
import org.jkiss.dbeaver.model.DBPDataSource;
import org.jkiss.dbeaver.model.sql.format.SQLFormatter;
                    false, 2);

                // Styles
import org.eclipse.swt.widgets.Button;
                        performApply();
        super.performApply();


import java.util.List;
                });
        ((GridData)formatterGroup.getLayoutData()).horizontalSpan = 3;
            sqlViewer.createPartControl(previewGroup);
                curConfigurator.loadSettings(getTargetPreferenceStore(), useDefaults);
            GridData gd = new GridData(GridData.FILL_BOTH);
            }
    protected String getPropertyPageID() {
    protected void performDefaults() {
            } else if (sqlFormatter instanceof SQLFormatterExternal) {
        // External formatter
    }
                sqlViewer.reloadSyntaxRules();
import org.jkiss.dbeaver.ui.editors.StringEditorInput;
import org.jkiss.utils.CommonUtils;

                curConfigurator = new SQLTokenizedFormatterConfigurationPage();

    private void showFormatterSettings(boolean useDefaults) {
    @Override
                    if (container != null) {
    protected boolean hasDataSourceSpecificOptions(DBPDataSourceContainer dataSourceDescriptor) {
        String formatterId = useDefaults
    private Combo formatterSelector;
    }
                @Nullable
            formatters.get(formatterSelector.getSelectionIndex()).getId().toUpperCase(Locale.ENGLISH));
            try (final InputStream sqlStream = getClass().getResourceAsStream(FORMAT_FILE_NAME)) {
                curConfigurator = GeneralUtils.adapt(sqlFormatter, SQLFormatterConfigurator.class);
            if (curConfigurator instanceof IDialogPage) {
import org.jkiss.dbeaver.model.DBPIdentifierCase;
            setMessage(CommonUtils.toString(e.getMessage()), SWT.ICON_ERROR);
            useDefaults
                : store.getBoolean(SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS)

            }
            if (formatters.get(i).getId().equalsIgnoreCase(formatterId)) {
        store.setToDefault(SQLModelPreferences.SQL_FORMAT_FORMATTER);
                styleBoldKeywords.addSelectionListener(new SelectionAdapter() {
 * Copyright (C) 2010-2026 DBeaver Corp and others
 * PrefPageSQLFormat
                    }
        if (!useDefaults && curConfigurator != null) {
    private Button formatCurrentQueryCheck;
    private Composite formatterConfigPlaceholder;

        );

import org.eclipse.ui.IEditorSite;
import org.eclipse.swt.layout.FillLayout;
                ? store.getDefaultBoolean(SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS)

        }
        store.setValue(SQLPreferenceConstants.SQL_FORMAT_ACTIVE_QUERY, formatCurrentQueryCheck.getSelection());
        store.setValue(SQLModelPreferences.SQL_FORMAT_FORMATTER,
    protected boolean supportsDataSourceSpecificOptions()
    public PrefPageSQLFormat()
import org.jkiss.dbeaver.utils.GeneralUtils;
        }
            // SQL preview



    }
    private final static String FORMAT_FILE_NAME = "format_preview.sql";
        styleBoldKeywords.setSelection(
 * Licensed under the Apache License, Version 2.0 (the "License");
            composite,
            } else {
        return
import org.jkiss.dbeaver.model.DBUtils;
        formatSQL();
                    return null;
        loadPreferences(store, false);
            }
            previewGroup.addDisposeListener(e -> sqlViewer.dispose());
                }
            useDefaults


                curConfigurator.configure(selFormatter, () -> {
import org.jkiss.dbeaver.model.sql.format.external.SQLFormatterExternal;
            if (sqlFormatter instanceof SQLFormatterTokenized) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
    @Override
    @Override
                ? store.getDefaultBoolean(SQLPreferenceConstants.SQL_FORMAT_ACTIVE_QUERY)
                sqlViewer.getTextViewer().doOperation(ISourceViewer.FORMAT);
        return true;
 * you may not use this file except in compliance with the License.

    }
import org.eclipse.swt.widgets.Composite;
            SQLEditorMessages.pref_page_sql_format_label_format_active_query_tip,
    @Override
                break;

                    StringEditorInput sqlInput = new StringEditorInput("SQL preview", sqlText, true, GeneralUtils.getDefaultFileEncoding());
import org.jkiss.dbeaver.model.DBPDataSourceContainer;


            sqlViewer.reloadSyntaxRules();
    }
import org.eclipse.swt.custom.StyledText;
/**
                    IEditorSite subSite = new SubEditorSite(UIUtils.getActiveWorkbenchWindow().getActivePage().getActivePart().getSite());
    @Override
                        if (dataSource != null) {
    private Button styleBoldKeywords;
    }
 * Unless required by applicable law or agreed to in writing, software
                try (final InputStream sqlStream = getClass().getResourceAsStream(FORMAT_FILE_NAME)) {
    }
                formatterSelector.select(i);
        formatterSelector.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    }

            1
        super();
            // FIXME: for now we support only predefined list of formatters
        if (curConfigurator != null) {
            ? store.getDefaultString(SQLModelPreferences.SQL_FORMAT_FORMATTER)
import org.jkiss.dbeaver.model.sql.registry.SQLFormatterConfigurationRegistry;
    protected void performApply() {
        formatterSelector = UIUtils.createLabelCombo(composite, SQLEditorMessages.pref_page_sql_format_label_formatter, SWT.DROP_DOWN | SWT.READ_ONLY);

            enablePreferenceContent(useDataSourceSettings());
import org.jkiss.dbeaver.ui.editors.sql.internal.SQLEditorMessages;
 */
        if (curConfigurator != null) {
                    formatSQL();
                    SQLEditorMessages.pref_page_sql_format_label_bold_keywords,


            }
                            return DBUtils.getDefaultContext(dataSource.getDefaultInstance(), false);
                : store.getBoolean(SQLPreferenceConstants.SQL_FORMAT_ACTIVE_QUERY)
import org.eclipse.jface.dialogs.IDialogPage;
        if (isDataSourcePreferencePage()) {
            }
                    composite,
        showFormatterSettings(useDefaults);
            };
        }
                    }
import org.eclipse.swt.layout.GridData;
import org.jkiss.dbeaver.ui.editors.sql.preferences.format.SQLExternalFormatterConfigurationPage;
        if (formatterSelector.getSelectionIndex() < 0) {
                sqlViewer.getTextViewer().setSelection(new TextSelection(0, 0));
    @Override
import java.nio.charset.StandardCharsets;
 *
        formatterSelector.addSelectionListener(new SelectionAdapter() {
    private SQLEditorBase sqlViewer;
import org.jkiss.dbeaver.ui.editors.sql.SQLPreferenceConstants;
                showFormatterSettings(true);
        DBPPreferenceStore store = dataSourceDescriptor.getPreferenceStore();
        SQLFormatterDescriptor selFormatter = formatters.get(formatterSelector.getSelectionIndex());

import org.jkiss.dbeaver.ui.preferences.TargetPrefPage;
                }
 * You may obtain a copy of the License at

        ((Composite)getControl()).layout(true, true);
            store.contains(SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS) ||

                        final DBPDataSource dataSource = container.getDataSource();
        return PAGE_ID;
    private void formatSQL() {
        }
        }
        formatCurrentQueryCheck.setSelection(
        }
            public void widgetSelected(SelectionEvent e) {
                public DBCExecutionContext getExecutionContext() {
import org.jkiss.dbeaver.ui.editors.SubEditorSite;

            curConfigurator.saveSettings(getTargetPreferenceStore());
            SQLFormatter sqlFormatter = selFormatter.createFormatter();



                    final DBPDataSourceContainer container = getDataSourceContainer();
        super.performDefaults();

        return composite;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
                ((IDialogPage)curConfigurator).createControl(formatterConfigPlaceholder);
    protected Control createPreferenceContent(@NotNull Composite parent) {
    }
        PrefUtils.savePreferenceStore(store);
            return;
    protected void clearPreferences(DBPPreferenceStore store) {
            true,
    @Override
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.editors.sql.preferences.format.tokenized.SQLTokenizedFormatterConfigurationPage;
    }
        formatSQL();

                    @Override
            Object text = sqlViewer.getAdapter(Control.class);
}
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.main.sql.format"; //$NON-NLS-1$
    private SQLFormatterConfigurator curConfigurator;
import org.eclipse.swt.events.SelectionEvent;
    private static final Log log = Log.getLog(PrefPageSQLFormat.class);
        loadPreferences(getTargetPreferenceStore(), true);
            formatterSelector.select(0);
        try {
        for (int i = 0; i < formatters.size(); i++) {
        }
            formatterConfigPlaceholder.setLayoutData(new GridData(GridData.FILL_HORIZONTAL | GridData.HORIZONTAL_ALIGN_BEGINNING));
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
            store.contains(SQLModelPreferences.SQL_FORMAT_FORMATTER);
                ((StyledText) text).setWordWrap(true);
            }
    protected void savePreferences(DBPPreferenceStore store) {
            // FIXME: this is a dirty hack because I'm too lazy to make proper registry/adapter for formatter UI configurators
public class PrefPageSQLFormat extends TargetPrefPage {
        } catch (Exception e) {
        store.setValue(SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS, styleBoldKeywords.getSelection());
    private void loadPreferences(DBPPreferenceStore store, boolean useDefaults) {
 *
 * DBeaver - Universal Database Manager
        }
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.Log;
            }

import org.eclipse.swt.widgets.Combo;
        }
                sqlViewer.getTextViewer().setSelection(new TextSelection(0, sqlText.length()));
    }

            try {

            formatterConfigPlaceholder = UIUtils.createComposite(formatterGroup, 1);
import org.jkiss.dbeaver.utils.PrefUtils;
 *
    }
import org.jkiss.dbeaver.DBException;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @NotNull

        formatters = SQLFormatterConfigurationRegistry.getInstance().getFormatters();
            }
    private List<SQLFormatterDescriptor> formatters;
        store.setToDefault(SQLPreferenceConstants.SQL_FORMAT_BOLD_KEYWORDS);
            previewGroup.setLayoutData(gd);
            log.error("Error creating formatter configurator", e);

            Composite previewGroup = new Composite(composite, SWT.BORDER);
                    sqlViewer.init(subSite, sqlInput);
                @Override
            curConfigurator.saveSettings(getTargetPreferenceStore());
            : store.getString(SQLModelPreferences.SQL_FORMAT_FORMATTER);
    protected void loadPreferences(DBPPreferenceStore store) {
            previewGroup.setLayout(new FillLayout());
                });

        formatterSelector.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
                    public void widgetSelected(SelectionEvent e) {
    @Override
