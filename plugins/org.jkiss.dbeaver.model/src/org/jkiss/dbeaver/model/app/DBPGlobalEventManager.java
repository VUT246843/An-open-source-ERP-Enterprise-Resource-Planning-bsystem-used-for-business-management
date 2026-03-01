
 * See the License for the specific language governing permissions and

    void fireGlobalEvent(@NotNull String eventId, @NotNull Map<String, Object> properties);

 * You may obtain a copy of the License at
 *

    void removeEventListener(@NotNull DBPGlobalEventListener listener);
 * Licensed under the Apache License, Version 2.0 (the "License");
    void addEventListener(@NotNull DBPGlobalEventListener listener);
 */

package org.jkiss.dbeaver.model.app;
 * DBPGlobalEventManager


/**
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
/*
}
public interface DBPGlobalEventManager {
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
 * DBeaver - Universal Database Manager
 */

 *
 * you may not use this file except in compliance with the License.
import java.util.Map;
