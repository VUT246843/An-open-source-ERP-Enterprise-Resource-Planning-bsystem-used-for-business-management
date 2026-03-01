/**
                ToolBarManager toolBar = new ToolBarManager(SWT.NONE);
        }
            layout.verticalSpacing = 0;
            statusGroup.setLayout(layout);
 */
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
 *
import org.eclipse.swt.widgets.Composite;
 * See the License for the specific language governing permissions and
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.SWT;
package org.jkiss.dbeaver.ui.controls.imageview;
            messageLabel.setLayoutData(gd);
 *     http://www.apache.org/licenses/LICENSE-2.0
public class BrowserImageEditor extends BrowserImageViewer {

/*
            Text messageLabel = new Text(statusGroup, SWT.READ_ONLY);
 *
            }

 */


 * limitations under the License.
            statusGroup.setLayoutData(gd);
 * Image editor, based on image viewer.
            // Status & toolbar
        return true;
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
        super.loadImage(inputStream);

 * You may obtain a copy of the License at
            messageLabel.setText(""); //$NON-NLS-1$
    @Override
import java.io.InputStream;
            GridLayout layout = new GridLayout(2, false);
import org.eclipse.swt.layout.GridLayout;
    public BrowserImageEditor(Composite parent, int style) {
 * Unless required by applicable law or agreed to in writing, software
    public boolean loadImage(@NotNull InputStream inputStream) {
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
            Composite statusGroup = new Composite(this, SWT.NONE);
import org.jkiss.code.NotNull;
            layout.horizontalSpacing = 0;
            {
import org.eclipse.jface.action.ToolBarManager;

 *
    }
                toolBar.createControl(statusGroup);

 * DBeaver - Universal Database Manager
        {

}
            gd = new GridData(GridData.FILL_HORIZONTAL);
        super(parent, style);
import org.eclipse.swt.widgets.Text;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Licensed under the Apache License, Version 2.0 (the "License");
