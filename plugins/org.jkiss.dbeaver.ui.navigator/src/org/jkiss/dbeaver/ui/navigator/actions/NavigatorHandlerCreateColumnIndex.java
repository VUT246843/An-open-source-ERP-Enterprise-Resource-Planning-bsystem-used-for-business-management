    public Object execute(ExecutionEvent event) throws ExecutionException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and

    @Override
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
        return createColumnObject(event, DBSTableIndex.class);
 *
public class NavigatorHandlerCreateColumnIndex extends NavigatorHandlerCreateColumnObjectBase {
import org.eclipse.core.commands.ExecutionEvent;
 *     http://www.apache.org/licenses/LICENSE-2.0
}
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
/*
 * DBeaver - Universal Database Manager
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.navigator.actions;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.struct.rdb.DBSTableIndex;
    }
 *

import org.eclipse.core.commands.ExecutionException;
