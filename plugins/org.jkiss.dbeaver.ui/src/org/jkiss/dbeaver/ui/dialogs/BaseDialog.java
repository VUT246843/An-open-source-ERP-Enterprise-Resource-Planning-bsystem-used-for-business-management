        applyDialogFont(composite);
            getShell().setText(title);
 *
        createButtonsForButtonBar(trailingButtonsComposite);
/*

    protected Control createButtonBar(@NotNull Composite parent) {
import org.eclipse.jface.dialogs.Dialog;
        if (trailingButtonsComposite.getChildren().length == 0) {

import org.eclipse.swt.widgets.Button;
        if (button != null) {
    @NotNull
        //composite.setFont(parent.getFont());
import org.eclipse.jface.dialogs.IDialogConstants;
    }
    }

        layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
            return button.isEnabled();
        return false;
    protected Composite getDialogArea() {
import org.jkiss.code.Nullable;
import org.eclipse.swt.widgets.Composite;
        Composite composite = WidgetFactory.composite(SWT.NONE).layout(layout)
        layout.marginHeight = convertVerticalDLUsToPixels(compact ? IDialogConstants.VERTICAL_MARGIN / 2 : IDialogConstants.VERTICAL_MARGIN);
        layout.verticalSpacing = convertVerticalDLUsToPixels(compact ? IDialogConstants.VERTICAL_SPACING / 2 : IDialogConstants.VERTICAL_SPACING);

        this.title = title;
    }
            ((GridLayout) composite.getLayout()).numColumns -= 1;
        composite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
        Button button = getButton(buttonID);
    }
        final Composite leadingButtonsComposite = createButtonBarComposite(composite, SWT.LEAD);
 * limitations under the License.


import org.jkiss.code.NotNull;
    private String title;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
        createButtonsForLeftButtonBar(leadingButtonsComposite);

        return (Composite) dialogArea;
        }
    }

        this.icon = image;
        layout.marginWidth = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_MARGIN);
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
        return (Composite) dialogArea;

 *     http://www.apache.org/licenses/LICENSE-2.0
        layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
    }
            leadingButtonsComposite.dispose();
 * See the License for the specific language governing permissions and
        return composite;

    }
 * Copyright (C) 2010-2026 DBeaver Corp and others
        dialogArea = createDialogPanelWithMargins(parent, false);
    @NotNull
        if (icon != null) {

    @NotNull
        super(parentShell);
        applyDialogFont(dialogArea);
    protected void createButtonsForButtonBar(@NotNull Composite parent) {
        Control contents = super.createContents(parent);
import org.eclipse.swt.widgets.Shell;
    @Nullable
        return composite;
 *
        }
import org.eclipse.jface.widgets.WidgetFactory;
    public String getTitle() {
    @NotNull
    @Override
    protected void createButtonsForLeftButtonBar(@NotNull Composite parent) {
 * you may not use this file except in compliance with the License.


        super.createButtonsForButtonBar(parent);
    @Nullable
 */
        if (button != null) {

            button.setEnabled(enabled);
            .layoutData(new GridData(GridData.FILL_BOTH)).create(parent);
 */

        return composite;
 *
    protected Control createContents(@NotNull Composite parent) {
    protected boolean isButtonEnabled(int buttonID) {
 * DBeaver - Universal Database Manager
    protected void enableButton(int buttonID, boolean enabled) {
        GridLayout layout = new GridLayout();
    @NotNull
        layout.marginHeight = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_MARGIN);
    @Override
        this.title = title;
        return contents;
    // Overloaded just to add the @Nullable annotation
    @Nullable
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    public void setImage(@NotNull DBPImage image)
        return true;
    @Override
        }
import org.eclipse.swt.layout.GridLayout;
    public void setTitle(String title) {
        final GridData data = new GridData(alignment, SWT.CENTER, true, false);
    @Override

 * Unless required by applicable law or agreed to in writing, software
    }

    protected Composite createDialogArea(@NotNull Composite parent) {
import org.jkiss.dbeaver.ui.UIUtils;

        super.create();
    protected Composite createDialogPanelWithMargins(@NotNull Composite parent, boolean compact) {
    private DBPImage icon;

    }
public class BaseDialog extends Dialog {
        final Composite trailingButtonsComposite = createButtonBarComposite(composite, SWT.TRAIL);
    protected Button getButton(int id) {
    }
        composite.setLayoutData(data);
        }
        Button button = getButton(buttonID);

/**
        layout.verticalSpacing = convertVerticalDLUsToPixels(IDialogConstants.VERTICAL_SPACING);
        final GridLayout layout = new GridLayout(0, true);
    }
        return super.getButton(id);



    protected boolean isResizable() {
        composite.setLayout(layout);
        final Composite composite = new Composite(parent, SWT.NONE);
    {

        final Composite composite = UIUtils.createPlaceholder(parent, 2, 0);

    }
    }
    }
        return icon;
    protected Composite createButtonBarComposite(@NotNull Composite parent, int alignment) {
}
import org.jkiss.dbeaver.model.DBPImage;
    @Override

    }
            ((GridLayout) composite.getLayout()).numColumns -= 1;
        }


        return title;

    }
import org.eclipse.swt.widgets.Control;
            getShell().setImage(DBeaverIcons.getImage(icon));

        }
 * Base dialog with title and image

 * distributed under the License is distributed on an "AS IS" BASIS,
        if (leadingButtonsComposite.getChildren().length == 0) {
    public void create() {
package org.jkiss.dbeaver.ui.dialogs;
        this.icon = icon;
        layout.horizontalSpacing = convertHorizontalDLUsToPixels(IDialogConstants.HORIZONTAL_SPACING);
        if (title != null) {
    @Override
            trailingButtonsComposite.dispose();

    public DBPImage getImage() {
    public BaseDialog(@Nullable Shell parentShell, @Nullable String title, @Nullable DBPImage icon) {
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.DBeaverIcons;
