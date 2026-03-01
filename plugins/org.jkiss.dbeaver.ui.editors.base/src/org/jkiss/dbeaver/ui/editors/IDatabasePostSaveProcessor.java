 */
 * Unless required by applicable law or agreed to in writing, software
    /**
 */
     * May run database object compile or other complex stuff.
 * You may obtain a copy of the License at

 * IDatabasePostSaveProcessor
     * @param context can be used to save object state. Cleared on each save.
 *
package org.jkiss.dbeaver.ui.editors;
/*
 * you may not use this file except in compliance with the License.

 * See the License for the specific language governing permissions and
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
     */
    void runPostSaveCommands(Map<String, Object> context);
     * Execute post-save commands.

import java.util.Map;
 * limitations under the License.

public interface IDatabasePostSaveProcessor {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
}

