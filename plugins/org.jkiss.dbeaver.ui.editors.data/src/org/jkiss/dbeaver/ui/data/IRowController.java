 *
    Object getAttributeValue(DBDAttributeBinding attribute);
 *
/**

/*
    List<DBDAttributeBinding> getRowAttributes();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * DBeaver - Universal Database Manager

{
 * Unless required by applicable law or agreed to in writing, software
 */
 *     http://www.apache.org/licenses/LICENSE-2.0
     * @param attribute column, must belong to the same result set as controller's value
import java.util.List;
 * DBD Row Controller


 * See the License for the specific language governing permissions and
 * distributed under the License is distributed on an "AS IS" BASIS,

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.

import org.jkiss.code.Nullable;
 *
}    /**
 */
     * @return value or null
public interface IRowController
 * Copyright (C) 2010-2024 DBeaver Corp and others
     * Tries to read value of certain column from result set.
    @NotNull
     */
    @Nullable
package org.jkiss.dbeaver.ui.data;
import org.jkiss.code.NotNull;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
 * limitations under the License.
