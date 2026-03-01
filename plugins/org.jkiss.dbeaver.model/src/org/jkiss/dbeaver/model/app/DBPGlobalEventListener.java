 *     http://www.apache.org/licenses/LICENSE-2.0

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.app;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 */

 * Unless required by applicable law or agreed to in writing, software
 *
 * See the License for the specific language governing permissions and
}
/**
{
 */

 * distributed under the License is distributed on an "AS IS" BASIS,
public interface DBPGlobalEventListener
 * You may obtain a copy of the License at
import java.util.Map;
 *
 * you may not use this file except in compliance with the License.
/*
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
 * DBPGlobalEventListener

    void handleGlobalEvent(@NotNull String eventId, @NotNull Map<String, Object> properties);
