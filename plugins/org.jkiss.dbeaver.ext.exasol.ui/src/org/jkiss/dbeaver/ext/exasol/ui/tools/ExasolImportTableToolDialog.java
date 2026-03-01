 * Copyright (C) 2010-2026 DBeaver Corp and others
				updateSQL();
import org.eclipse.swt.layout.GridData;
			@Override
			public void widgetSelected(SelectionEvent e)
 * DBeaver - Universal Database Manager
				if (directory != null) {
	@Override
				updateSQL();
		sb.append(" FROM LOCAL CSV FILE '");
		// directory was selected
		txFileName.addModifyListener(new ModifyListener() {
		Composite composite = new Composite(optionsGroup, 2);
			{
			{
import java.util.Collection;
		
import org.jkiss.dbeaver.ext.exasol.ui.internal.ExasolMessages;
import java.util.List;
		selectedDirectory.setVisible(false);


		
		{
		// encoding
		// column separator
		// row separator
		sql.add(sb.toString());

		Composite optionsGroup = UIUtils.createTitledComposite(parent,
import org.jkiss.dbeaver.model.DBPEvaluationContext;

			}
		
		
					selectedDirectory.setVisible(true);
import org.eclipse.swt.events.ModifyListener;
			public void widgetSelected(SelectionEvent e)
		sb.append(object.getFullyQualifiedName(DBPEvaluationContext.DML));
 * Licensed under the Apache License, Version 2.0 (the "License");
			}
				updateSQL();
		// name file like table
import org.eclipse.swt.events.SelectionEvent;
/*
        // PlaceHolder

				selectedTables);
		btSelectCompress = UIUtils.createCheckbox(composite,
		UIUtils.createPlaceholder(composite, 1);
		cbRowSep.addSelectionListener(new SelectionAdapter() {
		sb.append(" ENCODING = '" + encoding + "'");
		
		optionsGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			}
		btInclColNames = UIUtils.createCheckbox(composite, ExasolMessages.dialog_table_tools_column_heading, true);
 *     http://www.apache.org/licenses/LICENSE-2.0
			sb.append(" SKIP = 1");
		
		cbEncoding = UIUtils.createLabelCombo(composite, ExasolMessages.dialog_table_tools_encoding, SWT.DROP_DOWN | SWT.READ_ONLY);
import org.jkiss.dbeaver.ext.exasol.ui.ExasolUIConstants;
package org.jkiss.dbeaver.ext.exasol.ui.tools;
	// Dialog artifacts
	private Button btSelectDirectory;
				filename = txFileName.getText();
			final Collection<ExasolTableBase> selectedTables)
}
		
		
			}
		for (String mode: ExasolUIConstants.rowSeparators)
		composite.setLayout(new GridLayout(2, false));
			{
		// compress output
			sb.append(selectedDirectory.getText());
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		filename = "${schema}_${table}_${date}";

				final DirectoryDialog dialog = new DirectoryDialog(parent.getShell());
		createObjectsSelector(parent);
	protected void generateObjectCommand(List<String> sql, ExasolTableBase object)
	private String rowSep;
		cbRowSep = UIUtils.createLabelCombo(composite, ExasolMessages.dialog_table_tools_row_sep_mode, SWT.DROP_DOWN | SWT.READ_ONLY);
		txFileName = UIUtils.createLabelText(composite, ExasolMessages.dialog_table_tools_file_template, filename);

			{
		txStringSep = UIUtils.createLabelText(composite, ExasolMessages.dialog_table_tools_string_sep, "\"");

				final String directory = dialog.open();
		txStringSep.addModifyListener(new ModifyListener() {
		sb.append("IMPORT INTO ");
			}
			public void widgetSelected(SelectionEvent e)
				updateSQL();
				}
 * you may not use this file except in compliance with the License.
	}
	{
			@Override
		txStringSep.setTextLimit(1);
		sb.append(" COLUMN SEPARATOR = '" + txColSep.getText().replaceAll("'", "''") + "'");
		});
		if (btInclColNames.getSelection())
import org.eclipse.swt.events.ModifyEvent;
			public void modifyText(ModifyEvent arg0)
			{
import org.jkiss.dbeaver.ui.UIUtils;
			{
		UIUtils.createPlaceholder(composite, 1);
 * Unless required by applicable law or agreed to in writing, software
				encoding = ExasolUIConstants.encodings.get(cbEncoding.getSelectionIndex());
		rowSep = ExasolUIConstants.rowSeparators.get(0);
				} else {
 * See the License for the specific language governing permissions and
			
		sb.append(" ROW SEPARATOR = '" + rowSep + "'");
		}
			}
		super(partSite, ExasolMessages.dialog_table_tools_import_title,
 * distributed under the License is distributed on an "AS IS" BASIS,
				updateSQL();
		txColSep = UIUtils.createLabelText(composite, ExasolMessages.dialog_table_tools_column_sep, ";");
		
	private Button btSelectCompress;
	}
			@Override
		txColSep.addModifyListener(new ModifyListener() {
		
				rowSep = ExasolUIConstants.rowSeparators.get(cbRowSep.getSelectionIndex());
        // PlaceHolder
		btInclColNames.addSelectionListener(new SelectionAdapter() {
 *
		//file template
		
					selectedDirectory.setText(directory + File.separatorChar);
		});
		
		});
			@Override
		// string separator
	{
		});
	{
				ExasolMessages.dialog_table_tools_export_compress, false);
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
			public void widgetSelected(SelectionEvent e)
			

		// string sep
	public ExasolImportTableToolDialog(IWorkbenchPartSite partSite,
		// column sep
			public void modifyText(ModifyEvent arg0)
		btSelectDirectory = UIUtils.createPushButton(composite,
 * You may obtain a copy of the License at

		}
		// include column headings
		});
		// Directory select Button

			@Override
	@Override
		sb.append(super.replaceVars(filename, object));
			{
	private String encoding;
			
		cbRowSep.select(0);
		selectedDirectory = UIUtils.createLabel(composite, "");
		for(String enc: ExasolUIConstants.encodings)
				ExasolMessages.dialog_table_open_input_directory, null, new SelectionAdapter() {
				updateSQL();
		
		if (selectedDirectory.getText() != null)
		

	private Button btInclColNames;
	private Text txColSep;
	}
			public void widgetSelected(SelectionEvent e)
			@Override
	protected void createControls(final Composite parent)
 */
		//  row separator
		


		sb.append(" COLUMN DELIMITER = '" + txStringSep.getText().replaceAll("'", "''") + "'");

		// include column headings
		});
		//label for selected directory
			{
		// Export String
import org.eclipse.ui.IWorkbenchPartSite;
		});
	private Combo cbRowSep;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.SWT;
		encoding = ExasolUIConstants.encodings.get(0);
public class ExasolImportTableToolDialog extends ExasolBaseTableToolDialog {

			public void modifyText(ModifyEvent arg0)

		
		
		btSelectCompress.addSelectionListener(new SelectionAdapter() {
	@SuppressWarnings("unused")
					selectedDirectory.setVisible(false);
				updateSQL();
	private Text txStringSep;
 *
			}
	private String filename;
import org.eclipse.swt.widgets.*;
		{

		cbEncoding.addSelectionListener(new SelectionAdapter() {
 * limitations under the License.
import java.io.File;
			@Override
		sb.append(btSelectCompress.getSelection() ? ".csv.gz'" : ".csv'");
				ExasolMessages.dialog_table_tools_options, 1, GridData.FILL_HORIZONTAL);

			cbEncoding.add(enc);

				updateSQL();
import org.eclipse.swt.layout.GridLayout;
		cbEncoding.select(0);
			}
		// encoding combo
		txColSep.setTextLimit(1);
		});
			cbRowSep.add(mode);
	private Label selectedDirectory;
		StringBuilder sb = new StringBuilder(256);
	private Combo cbEncoding;
import org.jkiss.dbeaver.ext.exasol.model.ExasolTableBase;
			@Override
		
	private Text txFileName;
