    public Image getNotificationImage() {
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.ui.notifications;
    @Override
    private final Date date;
            return null;
 * limitations under the License.
        return null;
/*
    public GeneralNotification(
    }
        }

    public Image getNotificationKindImage() {
    public Date getDate() {
        if (messageType == null) {
        }

    @Override
    @Override
    public String getDescription() {
    private final String description;
import org.jkiss.code.NotNull;
        return date;
 * DBeaver - Universal Database Manager
    public void open() {
                return DBeaverIcons.getImage(DBIcon.STATUS_WARNING);
    @Override
    private final String label;
import org.jkiss.dbeaver.model.DBPMessageType;

        if (feedback != null) {
 *
    public <T> T getAdapter(@NotNull Class<T> adapter) {
            case WARNING:
    }
        this.description = description;
        this.date = new Date();
        @Nullable Runnable feedback)
        return description;
    private final Runnable feedback;
 *     http://www.apache.org/licenses/LICENSE-2.0
        @Nullable DBPMessageType messageType,


        @NotNull String description,
import org.jkiss.dbeaver.model.DBIcon;
 * Unless required by applicable law or agreed to in writing, software
        @NotNull String id,
public class GeneralNotification extends AbstractUiNotification {
    }
        this.feedback = feedback;
    {
        switch (messageType) {
        this.messageType = messageType;

    }
            feedback.run();
    private final DBPMessageType messageType;
    }
                return DBeaverIcons.getImage(DBIcon.STATUS_INFO);
    @Override
    public String getLabel() {
import org.eclipse.swt.graphics.Image;
        this.label = title;
 * See the License for the specific language governing permissions and

}        }
    @Override
import java.util.Date;
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
    }
    }
 * Copyright (C) 2010-2025 DBeaver Corp and others

import org.jkiss.dbeaver.ui.DBeaverIcons;
        return label;
 *
        super("org.jkiss.dbeaver.notifications.event." + id);

    @Override
 * You may obtain a copy of the License at
    }

            default:

 *
 * Licensed under the Apache License, Version 2.0 (the "License");
            case ERROR:
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return null;

        @NotNull String title,
                return DBeaverIcons.getImage(DBIcon.STATUS_ERROR);


import org.jkiss.code.Nullable;
