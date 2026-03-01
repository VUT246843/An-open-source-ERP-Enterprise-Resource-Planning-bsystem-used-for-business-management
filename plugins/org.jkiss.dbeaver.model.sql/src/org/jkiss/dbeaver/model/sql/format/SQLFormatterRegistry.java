 * SQL Formatter registry
 * Licensed under the Apache License, Version 2.0 (the "License");
    @Nullable
import org.jkiss.code.NotNull;
 * you may not use this file except in compliance with the License.

     */
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
public interface SQLFormatterRegistry {
 *
 * See the License for the specific language governing permissions and
 */
    SQLFormatter createFormatter(@NotNull SQLFormatterConfiguration configuration);
import org.jkiss.code.Nullable;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Unless required by applicable law or agreed to in writing, software
}

 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at

/**
package org.jkiss.dbeaver.model.sql.format;
 */
 *
     * Creates new formatter. Uses default config and doesn't interact with user for any configuration.

 *     http://www.apache.org/licenses/LICENSE-2.0
    /**
 * DBeaver - Universal Database Manager
/*
