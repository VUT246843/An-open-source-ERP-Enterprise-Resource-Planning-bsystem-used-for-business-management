 */


    }
 */
    {
 * You may obtain a copy of the License at
 *
 * Object state

    public static final DBSObjectState INVALID = new DBSObjectState("Invalid", DBIcon.OVER_ERROR);
 *
        this.title = title;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    private final DBPImage overlayImage;
 * distributed under the License is distributed on an "AS IS" BASIS,
    public DBSObjectState(String title, DBPImage overlayImage)

        this.overlayImage = overlayImage;
 * Unless required by applicable law or agreed to in writing, software
/**
 * you may not use this file except in compliance with the License.
    public DBPImage getOverlayImage()
package org.jkiss.dbeaver.model.struct;
public class DBSObjectState
import org.jkiss.dbeaver.model.DBIcon;
        return overlayImage;
    }
{
 * See the License for the specific language governing permissions and

 * DBeaver - Universal Database Manager
    private final String title;

import org.jkiss.dbeaver.model.DBPImage;
 *     http://www.apache.org/licenses/LICENSE-2.0
    public static final DBSObjectState ACTIVE = new DBSObjectState("Active", DBIcon.OVER_SUCCESS);
    {
 * Copyright (C) 2010-2024 DBeaver Corp and others
}/*
    public static final DBSObjectState NORMAL = new DBSObjectState("Normal", null);

    }
    public static final DBSObjectState UNKNOWN = new DBSObjectState("Unknown", DBIcon.OVER_UNKNOWN);
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        return title;
 * limitations under the License.

    public String getTitle()
