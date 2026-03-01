package org.jkiss.dbeaver.tools.transfer;
    Object transformAttribute(

 * Transformer may have a state. It is instantiated for each entity attribute.
        @NotNull DBDAttributeBinding[] dataAttributes,
 * Unless required by applicable law or agreed to in writing, software
        @NotNull Object[] dataRow,
}
        @NotNull Map<String, Object> options)

 * DBeaver - Universal Database Manager
        @NotNull DBCSession session,
        @NotNull DBDAttributeBinding attribute,
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;
 */
        @Nullable Object attrValue,
 * Attribute transformer for data transfer.

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
 *
/*
/**
 */


import java.util.Map;
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.code.NotNull;
        throws DBException;
 * You may obtain a copy of the License at
 * limitations under the License.
import org.jkiss.code.Nullable;
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
public interface IDataTransferAttributeTransformer {
import org.jkiss.dbeaver.model.exec.DBCSession;
