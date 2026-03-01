 * See the License for the specific language governing permissions and
/**

    /**
/*
 * You may obtain a copy of the License at
     *
import java.util.List;
    @NotNull
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.jkiss.dbeaver.DBException;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * you may not use this file except in compliance with the License.
 *
     * @return the list

     * Translate script element to target dialect.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public interface SQLTranslator {
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.sql.SQLScriptElement;
     * @throws DBException the db exception

 * Sql translator.
 *
 */

import org.jkiss.code.NotNull;
 * DBeaver - Universal Database Manager
 * limitations under the License.
 *
 */
}     */
    List<? extends SQLScriptElement> translate(@NotNull SQLScriptElement element) throws DBException;
     * @param element the element
package org.jkiss.dbeaver.model.sql.translate;
