 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2025 DBeaver Corp and others
/*
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.code.NotNull;
 *

package org.jkiss.dbeaver.model.security;
}

 */
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
public record SMObjectSettings(@NotNull SMObjectType objectType, @NotNull String objectId, @NotNull Map<String, String> settings) {
 * Unless required by applicable law or agreed to in writing, software

 * DBeaver - Universal Database Manager
 * limitations under the License.
import java.util.Map;
 *
