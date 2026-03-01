 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
}
public interface DBPCloseableObject extends AutoCloseable
 * you may not use this file except in compliance with the License.
package org.jkiss.dbeaver.model;

/**
 *
     * Closes object

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
{
/*
 */

 * distributed under the License is distributed on an "AS IS" BASIS,

import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
    @Override
     */
 * Closable object
    /**
 * DBeaver - Universal Database Manager
    void close() throws DBException;
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 *
 * You may obtain a copy of the License at
