    SQLScriptElement getQuery();

 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 */
/**
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBPContextProvider;
 *
    SQLScriptContext getScriptContext();

 * limitations under the License.
public interface SQLQueryContainer extends DBPDataSourceContainerProvider, DBPContextProvider {
 * you may not use this file except in compliance with the License.
import java.util.Map;

 */
 * SQLQuery container.
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;


/*
 * You may obtain a copy of the License at
 *
 * See the License for the specific language governing permissions and
package org.jkiss.dbeaver.model.sql;
 * Licensed under the Apache License, Version 2.0 (the "License");
}
 * Copyright (C) 2010-2024 DBeaver Corp and others
    Map<String, Object> getQueryParameters();
