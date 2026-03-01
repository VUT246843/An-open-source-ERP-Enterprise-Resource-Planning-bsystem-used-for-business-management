import java.util.Collection;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.model.edit;
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    OBJECT_TYPE getObject();
 * DBeaver - Universal Database Manager
 * You may obtain a copy of the License at


    DBECommandQueue getParentQueue();
public interface DBECommandQueue<OBJECT_TYPE extends DBPObject> extends Collection<DBECommand<OBJECT_TYPE>> {
 * Unless required by applicable law or agreed to in writing, software
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * limitations under the License.

 *
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.DBPObject;
 *

 */
 *
/*


 * Object commander.

 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    Collection<DBECommandQueue> getSubQueues();
} * Provides facilities for object edit commands, undo/redo, save/revert
