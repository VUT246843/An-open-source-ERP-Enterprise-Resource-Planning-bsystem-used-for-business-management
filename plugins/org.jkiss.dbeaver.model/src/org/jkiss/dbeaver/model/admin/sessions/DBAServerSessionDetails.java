 * Unless required by applicable law or agreed to in writing, software

import org.jkiss.dbeaver.model.DBPObject;
}
 * Server session additional details provider
import java.util.List;
import org.jkiss.code.NotNull;

    DBPImage getDetailsIcon();
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.DBException;

    List<? extends DBPObject> getSessionDetails(
    String getDetailsTitle();
 *
 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,
        @NotNull DBCSession session,
package org.jkiss.dbeaver.model.admin.sessions;
 * limitations under the License.
import org.jkiss.dbeaver.model.DBPImage;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    String getDetailsTooltip();
public interface DBAServerSessionDetails {


 *
 */

    Class<?> getDetailsType();


/**
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.exec.DBCSession;
 */

        @NotNull DBAServerSession serverSession) throws DBException;
