
 * DBeaver - Universal Database Manager
    public void create() {
            UIUtils.createLabelSeparator(parent, SWT.HORIZONTAL);
 *
    @Override
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
    }

    @Override
 * Copyright (C) 2010-2026 DBeaver Corp and others
    }
 * limitations under the License.
        layout.verticalSpacing = 0;
public class BaseTitleDialog extends TitleAreaDialog {
 *
    }
    }
package org.jkiss.dbeaver.ui.dialogs;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return true;
        composite.setFont(parent.getFont());
        return composite;

            getShell().setImage(DBeaverIcons.getImage(icon));


    private DBPImage icon;
    public void setImage(DBPImage image) {

 */
import org.eclipse.jface.dialogs.TitleAreaDialog;
    }
import org.eclipse.swt.widgets.Shell;
        layout.horizontalSpacing = 0;
        if (icon != null) {
    }

    private boolean needsTopSeparator() {
    public BaseTitleDialog(Shell parentShell, @Nullable DBPImage icon) {
    protected Composite createDialogArea(Composite parent) {
 * See the License for the specific language governing permissions and

 */
 *     http://www.apache.org/licenses/LICENSE-2.0

 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.ui.UIUtils;

        this.icon = icon;
import org.eclipse.swt.layout.GridData;
        this.icon = image;
/**
import org.jkiss.code.Nullable;
 *
            // Build the separator line
 * you may not use this file except in compliance with the License.
        return true;
import org.jkiss.dbeaver.model.DBPImage;
        }
        Composite composite = new Composite(parent, SWT.NONE);
import org.eclipse.swt.widgets.Composite;
        if (needsTopSeparator()) {
        super(parentShell);
import org.eclipse.swt.layout.GridLayout;
        GridLayout layout = new GridLayout();
    public DBPImage getImage() {
    protected boolean isResizable() {
}
import org.eclipse.swt.SWT;
        composite.setLayout(layout);
 * Unless required by applicable law or agreed to in writing, software
/*
    @Override
 * Base dialog with title and image
    }
        return icon;
import org.jkiss.dbeaver.ui.DBeaverIcons;
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
 * You may obtain a copy of the License at
        super.create();
