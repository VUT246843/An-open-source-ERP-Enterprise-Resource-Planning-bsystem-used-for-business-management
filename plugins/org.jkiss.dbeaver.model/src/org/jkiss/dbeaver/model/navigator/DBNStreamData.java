
package org.jkiss.dbeaver.model.navigator;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * distributed under the License is distributed on an "AS IS" BASIS,
import java.io.IOException;
import org.jkiss.dbeaver.DBException;
 * you may not use this file except in compliance with the License.


 * See the License for the specific language governing permissions and
    boolean supportsStreamData();
}     */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Node which contains some stream data

 *     http://www.apache.org/licenses/LICENSE-2.0
 *
/*

public interface DBNStreamData {
import java.io.InputStream;
 */
    InputStream openInputStream() throws DBException, IOException;
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others

    long getStreamSize() throws IOException;
 */

    /**

 * limitations under the License.
     * Returns stream if it allowed
 * Unless required by applicable law or agreed to in writing, software
 *
/**
 * You may obtain a copy of the License at
