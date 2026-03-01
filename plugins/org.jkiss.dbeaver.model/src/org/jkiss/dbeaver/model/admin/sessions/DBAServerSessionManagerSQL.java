 * You may obtain a copy of the License at
    @NotNull

 */

 * Licensed under the Apache License, Version 2.0 (the "License");

public interface DBAServerSessionManagerSQL {
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;

 * limitations under the License.
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *     http://www.apache.org/licenses/LICENSE-2.0

 */
package org.jkiss.dbeaver.model.admin.sessions;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    String generateSessionReadQuery(@NotNull Map<String, Object> options);
/*

 * DBeaver - Universal Database Manager
/**
 *
 * you may not use this file except in compliance with the License.
 *
 * See the License for the specific language governing permissions and
 * Session manager
}
import java.util.Map;

    boolean canGenerateSessionReadQuery();
 *
