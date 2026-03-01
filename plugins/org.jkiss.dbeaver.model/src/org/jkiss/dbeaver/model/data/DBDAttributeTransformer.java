import org.jkiss.dbeaver.DBException;

    /**
import org.jkiss.dbeaver.model.exec.DBCSession;
 * DBeaver - Universal Database Manager
 */
package org.jkiss.dbeaver.model.data;
 * See the License for the specific language governing permissions and
        @NotNull Map<String, Object> options)
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 * Copyright (C) 2010-2024 DBeaver Corp and others
        @NotNull DBCSession session,
import org.jkiss.code.NotNull;
{
        @NotNull DBDAttributeBinding attribute,

 * limitations under the License.
/*
 *
 * you may not use this file except in compliance with the License.
     * Transforms attribute
 *
 * Unless required by applicable law or agreed to in writing, software
 */
 * DBD binding transformer.
        @NotNull List<Object[]> rows,
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 *
}
import java.util.List;
import java.util.Map;
 * Transforms attribute to another attribute
    void transformAttribute(

 *     http://www.apache.org/licenses/LICENSE-2.0
        throws DBException;
/**
 * Licensed under the Apache License, Version 2.0 (the "License");

     */
public interface DBDAttributeTransformer
