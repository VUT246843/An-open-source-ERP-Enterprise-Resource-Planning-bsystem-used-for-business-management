 * Copied from Mylyn sources
import org.jkiss.dbeaver.model.DBPAdaptable;
 * Contributors:
/**
    }

    }
 * which accompanies this distribution, and is available at
        return o == null ? 1 : CommonUtils.compare(this.getDate(), o.getDate());
    public AbstractNotification(String eventId) {
    public int compareTo(AbstractNotification o) {
 * Copyright (c) 2004, 2011 Tasktop Technologies and others.

import java.util.Date;
}


    }
    public String getEventId() {
 * All rights reserved. This program and the accompanying materials
public abstract class AbstractNotification implements Comparable<AbstractNotification>, DBPAdaptable {
        this.eventId = eventId;
 * http://www.eclipse.org/legal/epl-v10.html
    private final String eventId;
 *     Tasktop Technologies - initial API and implementation

    public abstract Date getDate();
        return null;
 *******************************************************************************/

 */
        return this.eventId;
 * are made available under the terms of the Eclipse Public License v1.0

import org.jkiss.utils.CommonUtils;


    public abstract String getDescription();
package org.jkiss.dbeaver.ui.notifications;
 *
/*******************************************************************************

    public abstract String getLabel();
    public Object getToken() {
    }
