 * DBeaver - Universal Database Manager

                minScale, maxScale);
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * See the License for the specific language governing permissions and

        super(owner, fieldType.getValueType(), name, remarks, unsigned, searchable, precision, 
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.ext.altibase.model;
    public AltibaseDataType(GenericStructContainer owner, AltibaseDataTypeDomain dataTypeDomin) {
    public AltibaseDataType(GenericStructContainer owner, AltibaseDataTypeDomain fieldType,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

 * you may not use this file except in compliance with the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
public class AltibaseDataType extends GenericDataType {
            int precision, int minScale, int maxScale) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        super(owner, dataTypeDomin.getValueType(), dataTypeDomin.getTypeName(), null, false, true, 0, 0, 0);
}
 *
 * limitations under the License.
import org.jkiss.dbeaver.ext.generic.model.GenericDataType;
            String name, String remarks, boolean unsigned, boolean searchable,
    }
    }
 */
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ext.generic.model.GenericStructContainer;
