/*
package org.jkiss.dbeaver.model.fs.event;
 */
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
public record DBFEvent(Action action) {
 * limitations under the License.
 * Unless required by applicable law or agreed to in writing, software
 *
import org.jkiss.code.NotNull;
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.

}
    }
 * You may obtain a copy of the License at
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
    public DBFEvent(@NotNull Action action) {
 *     http://www.apache.org/licenses/LICENSE-2.0

 */
        this.action = action;
/**
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        REFRESH

    public enum Action {
 * distributed under the License is distributed on an "AS IS" BASIS,


 * File system event
