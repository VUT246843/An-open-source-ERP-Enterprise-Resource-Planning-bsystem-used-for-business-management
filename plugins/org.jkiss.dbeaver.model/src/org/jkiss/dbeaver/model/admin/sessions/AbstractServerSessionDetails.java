    @Override
        this.detailsTooltip = detailsTooltip;
    public DBPImage getDetailsIcon() {
    }
 * See the License for the specific language governing permissions and

/*

package org.jkiss.dbeaver.model.admin.sessions;
    @Override
 *
    public String getDetailsTitle() {
import org.jkiss.dbeaver.model.DBPImage;
 * Licensed under the Apache License, Version 2.0 (the "License");
        return detailsIcon;
 *

        return detailsTitle;
    }
 * You may obtain a copy of the License at
 * Unless required by applicable law or agreed to in writing, software
        this.detailsTitle = detailsTitle;
        return detailsTooltip;

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
    private DBPImage detailsIcon;
}
 * you may not use this file except in compliance with the License.
    public AbstractServerSessionDetails(String detailsTitle, String detailsTooltip, DBPImage detailsIcon) {
 * limitations under the License.
        this.detailsIcon = detailsIcon;
    public String getDetailsTooltip() {
    @Override
 * Server session additional details provider
    private String detailsTooltip;

 * DBeaver - Universal Database Manager

 */
 */

 *

public abstract class AbstractServerSessionDetails implements DBAServerSessionDetails {
    }
    private String detailsTitle;
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
