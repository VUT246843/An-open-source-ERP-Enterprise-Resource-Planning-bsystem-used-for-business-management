 * Unless required by applicable law or agreed to in writing, software
                                        OracleConstants.PREF_KEY_DDL_FORMAT, format.name());
                                source.refreshPart(this, true);
            protected Control createControl(Composite parent) {
                    public void widgetSelected(SelectionEvent e) {
        contributionManager.add(new Separator());
import org.eclipse.swt.widgets.Combo;
                ddlFormatCombo.setToolTipText("DDL Format");
                        ddlFormatCombo.select(ddlFormatCombo.getItemCount() - 1);
                        }
                                if (source instanceof OracleDDLOptions) {
        contributionManager.add(new ControlContribution("DDLFormat") {
 * distributed under the License is distributed on an "AS IS" BASIS,
package org.jkiss.dbeaver.ext.oracle.ui.editors;
 * You may obtain a copy of the License at

                            }
        });
 * See the License for the specific language governing permissions and
                OracleDDLFormat ddlFormat = OracleDDLFormat.getCurrentFormat(sourceObject.getDataSource());
            @Override
                return ddlFormatCombo;
import org.eclipse.swt.widgets.Control;
                        for (OracleDDLFormat format : OracleDDLFormat.values()) {
/*
                    ddlFormatCombo.add(format.getTitle());
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.SWT;
            }
import org.jkiss.dbeaver.ext.oracle.model.OracleDDLFormat;
                                    ((OracleDDLOptions)source).putDDLOptions(OracleConstants.PREF_KEY_DDL_FORMAT, format);

                ddlFormatCombo.addSelectionListener(new SelectionAdapter() {
    }
                                sourceObject.getDataSource().getContainer().getPreferenceStore().setValue(
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.swt.events.SelectionEvent;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.jface.action.IContributionManager;
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.jface.action.ControlContribution;
 *
                    }
 */
                    }
import org.jkiss.dbeaver.ext.oracle.model.OracleConstants;
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
}
                }
 * DBeaver - Universal Database Manager
 * limitations under the License.
                final Combo ddlFormatCombo = new Combo(parent, SWT.BORDER | SWT.READ_ONLY | SWT.DROP_DOWN);
                                }
                    @Override
                            if (format.ordinal() == ddlFormatCombo.getSelectionIndex()) {
import org.eclipse.jface.action.Separator;
import org.jkiss.dbeaver.model.struct.DBSObject;
    public static void addDDLControl(IContributionManager contributionManager, DBSObject sourceObject, SQLSourceViewer source) {
 *
public class OracleEditorUtils {
                });
 *
                                break;
                for (OracleDDLFormat format : OracleDDLFormat.values()) {
import org.eclipse.swt.events.SelectionAdapter;
                    if (format == ddlFormat) {
import org.eclipse.swt.widgets.Composite;
