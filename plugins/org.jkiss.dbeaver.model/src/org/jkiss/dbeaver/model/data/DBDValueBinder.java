    String makeQueryBind(@NotNull DBSAttributeBase attribute, @NotNull Object value) throws DBCException;

 * limitations under the License.

import org.jkiss.dbeaver.model.exec.DBCException;
}
 * Unless required by applicable law or agreed to in writing, software
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
 * Provides possibility to override default SQL query binding
 *
 * See the License for the specific language governing permissions and

package org.jkiss.dbeaver.model.data;
 * you may not use this file except in compliance with the License.
 * DBeaver - Universal Database Manager
/*
public interface DBDValueBinder extends DBDValueHandler
 */
import org.jkiss.code.NotNull;
 *
/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.jkiss.dbeaver.model.struct.DBSAttributeBase;


 *
{
