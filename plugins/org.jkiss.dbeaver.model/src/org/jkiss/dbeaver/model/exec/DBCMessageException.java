    public DBCMessageException(String message) {
 * Exception which provides a message for users.
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    }

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.model.exec;
 * It is not actually an error but a way to signal user to change input or
 * you may not use this file except in compliance with the License.
 */
 * limitations under the License.

}
        super(message);
 *
/*
 *
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
 * Used in places such as SQL editor.
 *     http://www.apache.org/licenses/LICENSE-2.0


 * a configuration.
/**
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * UI should show just an informational panel instead of error dialog/panel.
 * You may obtain a copy of the License at
public class DBCMessageException extends DBCException {
