 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.widgets.Composite;
            {
            }

    @Override
    public DB2RoutineDDLEditor()
                            }
                                getSourceObject().getDataSource().getContainer().getPreferenceStore()
 *
import org.jkiss.dbeaver.ext.db2.model.DB2Routine;
                for (DB2DDLFormat format : DB2DDLFormat.values()) {
/**
                            if (format.ordinal() == ddlFormatCombo.getSelectionIndex()) {
                                break;
                                refreshPart(this, true);
                        }
import org.eclipse.swt.events.SelectionAdapter;
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * DBeaver - Universal Database Manager

                    if (format == ddlFormat) {
        contributionManager.add(new ControlContribution("DDLFormat") {

    }
import org.eclipse.swt.SWT;
                        for (DB2DDLFormat format : DB2DDLFormat.values()) {
    protected void contributeEditorCommands(IContributionManager contributionManager)
import org.eclipse.swt.events.SelectionEvent;
 */
 * 
                return ddlFormatCombo;
            protected Control createControl(Composite parent)
public class DB2RoutineDDLEditor extends SQLSourceViewer<DB2Routine> {
                final Combo ddlFormatCombo = new Combo(parent, SWT.BORDER | SWT.READ_ONLY | SWT.DROP_DOWN);
            @Override
        super.contributeEditorCommands(contributionManager);
                    public void widgetSelected(SelectionEvent e)
                ddlFormatCombo.setToolTipText("DDL Format");
package org.jkiss.dbeaver.ext.db2.ui.editors;
 * Manage the "Format" drop down box in the bottom right corner of the Routine DDL viewer toformat DDL

    }
}                }
import org.eclipse.jface.action.ControlContribution;
                    ddlFormatCombo.add(format.getTitle());
/*
                    }
 */
 * Copyright (C) 2010-2024 DBeaver Corp and others
                    }
                    @Override
 *
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.action.IContributionManager;
 * limitations under the License.
import org.jkiss.dbeaver.ui.editors.sql.SQLSourceViewer;
import org.eclipse.jface.action.Separator;
 * Copyright (C) 2013-2017 Denis Forveille (titou10.titou10@gmail.com)
import org.jkiss.dbeaver.ext.db2.DB2Constants;
                                    .setValue(DB2Constants.PREF_KEY_DDL_FORMAT, format.name());
                ddlFormatCombo.addSelectionListener(new SelectionAdapter() {
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Control;
        contributionManager.add(new Separator());
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Combo;

    {

                DB2DDLFormat ddlFormat = DB2DDLFormat.getCurrentFormat(getSourceObject().getDataSource());
                });
                    {
                        ddlFormatCombo.select(ddlFormatCombo.getItemCount() - 1);

import org.jkiss.dbeaver.ext.db2.editors.DB2DDLFormat;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * @author Denis Forveille
    {
        });
