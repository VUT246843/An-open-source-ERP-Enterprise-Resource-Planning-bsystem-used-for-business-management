	}
		createDetailsButton(parent);
		return composite;
	}
			// was the details button pressed?
		super(parentShell, title, icon);
		composite.setFont(parent.getFont());
		Composite composite = super.createDialogArea(parent);
import org.eclipse.swt.graphics.Point;
	}
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.widgets.Control;
    }
			detailsContents = null;
		if ((opened && diffY > 0) || (!opened && diffY < 0)) {
	protected final void showDetailsArea() {
	}
public class DetailsViewDialog extends BaseDialog {

			Control control = getContents();
	private void toggleDetailsArea() {
 *
		if (detailsContents == null) {
			false);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 */

 * Unless required by applicable law or agreed to in writing, software
	protected String getDetailsLabel(boolean show) {
 * DBeaver - Universal Database Manager
		return show ? IDialogConstants.SHOW_DETAILS_LABEL : IDialogConstants.HIDE_DETAILS_LABEL;
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,

		// create OK and Details buttons
		}
import org.eclipse.swt.widgets.Button;
			opened = true;
		}
	private Control detailsContents = null;
		childData.horizontalSpan = 2;
import org.jkiss.dbeaver.model.DBPImage;
			detailsButton.setText(getDetailsLabel(false));
		composite.setLayoutData(childData);

/**
 */
			IDialogConstants.DETAILS_ID,
			getShell().setSize(new Point(windowSize.x, windowSize.y + (diffY)));

			super.buttonPressed(id);
	}
	protected Button detailsButton;

import org.eclipse.swt.widgets.Composite;
			}
/*
	}

		if (detailsContents != null) {
			getContents().getShell().layout();
 * distributed under the License is distributed on an "AS IS" BASIS,
		detailsButton = createButton(
 *
	protected Composite createDialogArea(Composite parent) {
    @Override
			if (control != null && !control.isDisposed()) {
		Point newSize = getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT);
import org.jkiss.code.Nullable;
			opened = false;
	protected void buttonPressed(int id) {
	@Override
		}
				true);
			getDetailsLabel(true),
	}
	@Override
	}
 * See the License for the specific language governing permissions and

    	return true;
		}
		} else {
		return null;
		// decrease the dialog height if details were closed and empty space appeared
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.dialogs;
import org.eclipse.jface.dialogs.IDialogConstants;
			detailsButton.setText(getDetailsLabel(true));
		int diffY = newSize.y - windowSize.y;
	protected void createButtonsForButtonBar(Composite parent) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
			toggleDetailsArea();

		GridData childData = new GridData(GridData.FILL_BOTH);
import org.eclipse.swt.SWT;
	protected boolean isResizable() {

import org.eclipse.swt.widgets.Shell;
 *     http://www.apache.org/licenses/LICENSE-2.0
	}





 * A dialog with extendable details area. Similar to ErrorDialog.
 * limitations under the License.
}
		boolean opened = false;
		if (id == IDialogConstants.DETAILS_ID) {
			parent,
		// increase the dialog height if details were opened and such increase is necessary
		createMessageArea(composite);


	protected void createMessageArea(Composite composite) {
 *
		childData.grabExcessVerticalSpace = false;
	protected Control createDetailsContents(Composite composite) {
				toggleDetailsArea();
import org.eclipse.swt.layout.GridData;
			detailsContents.dispose();
	}

		Point windowSize = getShell().getSize();
 * Licensed under the Apache License, Version 2.0 (the "License");
		} else {
	protected void createDetailsButton(Composite parent) {
	public DetailsViewDialog(Shell parentShell, String title, @Nullable DBPImage icon) {
			detailsContents = createDetailsContents((Composite) getContents());
