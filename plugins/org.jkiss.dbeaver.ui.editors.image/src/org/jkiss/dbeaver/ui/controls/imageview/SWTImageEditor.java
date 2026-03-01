            {
                ToolBarManager toolBar = new ToolBarManager(SWT.NONE);
                return false;

    private final Text messageLabel;

        super(parent, style);
            messageLabel = new Text(statusGroup, SWT.READ_ONLY);
            } else {
        //setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_LIST_BACKGROUND));
import java.io.InputStream;
 * limitations under the License.

    private final Color redColor = Display.getCurrent().getSystemColor(SWT.COLOR_RED);
            gd = new GridData(GridData.FILL_HORIZONTAL);
import org.eclipse.jface.action.ToolBarManager;
            statusGroup.setLayout(layout);
            // Status & toolbar
//                toolBar.setLayoutData(gd);
 * Image editor, based on image viewer.

    private final Color blackColor = Display.getCurrent().getSystemColor(SWT.COLOR_BLACK);
                toolBar.createControl(statusGroup);
                messageLabel.setForeground(blackColor);
            SWTException lastError = getLastError();
 *
            if (lastError != null) {
            messageLabel.setText(""); //$NON-NLS-1$
            layout.verticalSpacing = 0;
 */
 */
import org.eclipse.swt.layout.GridData;
            messageLabel.setLayoutData(gd);
 * Copyright (C) 2010-2024 DBeaver Corp and others

 * Licensed under the Apache License, Version 2.0 (the "License");
            statusGroup.setLayoutData(gd);
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
        try {
                messageLabel.setForeground(redColor);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.graphics.Color;
}

import org.eclipse.swt.SWTException;
 * You may obtain a copy of the License at
 *
package org.jkiss.dbeaver.ui.controls.imageview;
            }
/*
        }

 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.SWT;
    @Override
            layout.horizontalSpacing = 0;
            GridData gd = new GridData(GridData.FILL_HORIZONTAL);
                messageLabel.setText(getImageDescription());
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        {
import org.jkiss.code.NotNull;
    public boolean loadImage(@NotNull InputStream inputStream) {
    public SWTImageEditor(Composite parent, int style) {
        } finally {
import org.eclipse.swt.widgets.Display;
/**
            Composite statusGroup = new Composite(this, SWT.NONE);
    }
            GridLayout layout = new GridLayout(2, false);
 *

                messageLabel.setText(lastError.getMessage());
 * you may not use this file except in compliance with the License.




import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridLayout;
                return true;
public class SWTImageEditor extends SWTImageViewer {
 * DBeaver - Universal Database Manager
//                gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
 * See the License for the specific language governing permissions and
            }
        updateActions();
            updateActions();
        super.loadImage(inputStream);
    }
                fillToolBar(toolBar);
import org.eclipse.swt.widgets.Composite;
