 */
 * Copyright (c) 2004, 2011 Tasktop Technologies and others.
 *     Tasktop Technologies - initial API and implementation
import org.eclipse.swt.graphics.Image;

 * All rights reserved. This program and the accompanying materials
/**
public abstract class AbstractUiNotification extends AbstractNotification {
    public AbstractUiNotification(String eventId) {

/*******************************************************************************
 *
    public abstract void open();
 * which accompanies this distribution, and is available at

 * are made available under the terms of the Eclipse Public License v1.0
}
    public abstract Image getNotificationImage();

 * Copied from Mylyn sources
    }
        super(eventId);
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

    public abstract Image getNotificationKindImage();
package org.jkiss.dbeaver.ui.notifications;
 * Contributors:
