import java.util.List;
    @NotNull
 * Licensed under the Apache License, Version 2.0 (the "License");
    List<DBPDataSourcePermission> getModifyPermission();
 * DBeaver - Universal Database Manager
/**
 * Data-source permissions owner


 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
 */
 * Unless required by applicable law or agreed to in writing, software
public interface DBPDataSourcePermissionOwner
 */
}
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 *


 *
 * you may not use this file except in compliance with the License.
    boolean hasModifyPermission(@NotNull DBPDataSourcePermission permission);
import org.jkiss.code.NotNull;
/*

 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
import org.jkiss.code.Nullable;
{

import java.util.Collection;
    void setModifyPermissions(@Nullable Collection<DBPDataSourcePermission> permissions);
package org.jkiss.dbeaver.model;
