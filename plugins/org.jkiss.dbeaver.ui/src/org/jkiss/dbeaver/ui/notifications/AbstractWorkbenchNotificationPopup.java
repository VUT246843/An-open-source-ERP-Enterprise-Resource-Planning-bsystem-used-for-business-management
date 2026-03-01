/*******************************************************************************
	protected Image getPopupShellImage(int maximumHeight) {
	public AbstractWorkbenchNotificationPopup(Display display, int style) {
package org.jkiss.dbeaver.ui.notifications;
 * @author Steffen Pingel
	}
        super(display, style);
 *
		return DBeaverIcons.getImage(UIIcon.DBEAVER_LOGO_SMALL);
 * 
		super(display);
 * are made available under the terms of the Eclipse Public License v1.0

 *******************************************************************************/
 *     Tasktop Technologies - initial API and implementation

 * Contributors:
import org.jkiss.dbeaver.ui.UIIcon;
	}


 */
 * All rights reserved. This program and the accompanying materials
	public AbstractWorkbenchNotificationPopup(Display display) {
	}
import org.eclipse.swt.graphics.Image;
 * A popup window that uses the workbench shell image in the title.
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
}import org.eclipse.swt.widgets.Display;
import org.jkiss.dbeaver.ui.DBeaverIcons;
/**
 * Copyright (c) 2004, 2011 Tasktop Technologies and others.
public class AbstractWorkbenchNotificationPopup extends AbstractNotificationPopup {

import org.eclipse.jface.notifications.AbstractNotificationPopup;
	@Override

