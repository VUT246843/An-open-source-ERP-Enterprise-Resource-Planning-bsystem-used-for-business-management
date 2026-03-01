import org.eclipse.swt.SWT;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        stText.setText(sw.toString());
    public ViewExceptionDialog(Shell parentShell, Throwable error)
    protected Composite createDialogArea(Composite parent) {
        setReadonly(true);
 *

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.swt.widgets.Composite;
public class ViewExceptionDialog extends EditTextDialog {
        error.printStackTrace(buffer);
 * Licensed under the Apache License, Version 2.0 (the "License");
        StringWriter sw = new StringWriter();
}
import org.eclipse.swt.widgets.Text;
 *
 * you may not use this file except in compliance with the License.
        this.error = error;
package org.jkiss.dbeaver.ui.dialogs;
        super(parentShell, "Error", error.getMessage());
import java.io.PrintWriter;

import java.io.StringWriter;
        Composite composite = super.createDialogArea(parent);
 * Unless required by applicable law or agreed to in writing, software

        return composite;


        PrintWriter buffer = new PrintWriter(sw, true);
    @Override
    private Throwable error;
        UIUtils.createControlLabel(composite, "Stacktrace");

 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    protected void createControlsBeforeText(Composite composite) {
 * You may obtain a copy of the License at
        Text stText = new Text(composite, SWT.BORDER | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY);
        UIUtils.createControlLabel(composite, "Message");
/*
    {
    @Override
    }
import org.jkiss.dbeaver.ui.UIUtils;
 * See the License for the specific language governing permissions and
import org.eclipse.swt.widgets.Shell;
 * DBeaver - Universal Database Manager
    }
    }
 * limitations under the License.

 *
 */
