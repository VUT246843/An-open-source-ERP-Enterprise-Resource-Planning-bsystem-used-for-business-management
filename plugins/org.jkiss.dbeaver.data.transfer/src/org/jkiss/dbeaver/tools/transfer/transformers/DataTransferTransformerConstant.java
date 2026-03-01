 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.jkiss.dbeaver.DBException;
 * limitations under the License.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
    }
}
import org.jkiss.code.NotNull;

import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
    public Object transformAttribute(@NotNull DBCSession session, @NotNull DBDAttributeBinding[] dataAttributes, @NotNull Object[] dataRow, @NotNull DBDAttributeBinding attribute, Object attrValue, @NotNull Map<String, Object> options) throws DBException {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


 *
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.exec.DBCSession;
 */
 */
        return options.get("constant");
    @Override
public class DataTransferTransformerConstant implements IDataTransferAttributeTransformer {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * distributed under the License is distributed on an "AS IS" BASIS,
 * You may obtain a copy of the License at
 * you may not use this file except in compliance with the License.

package org.jkiss.dbeaver.tools.transfer.transformers;
 *
 * Constant attribute transformer
/*
import org.jkiss.dbeaver.tools.transfer.IDataTransferAttributeTransformer;
 *
 * See the License for the specific language governing permissions and
/**
import java.util.Map;

