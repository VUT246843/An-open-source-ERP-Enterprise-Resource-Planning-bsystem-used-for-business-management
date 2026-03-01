    }
        }

        return count;
 * limitations under the License.
package org.jkiss.dbeaver.model.data.aggregate;
 * See the License for the specific language governing permissions and
public class FunctionCountNulls implements IAggregateFunction {
            count++;

 */
 * Licensed under the Apache License, Version 2.0 (the "License");
        return true;

}
    private long count = 0;
 * you may not use this file except in compliance with the License.
 * Unless required by applicable law or agreed to in writing, software
 * You may obtain a copy of the License at
    public Object getResult(int valueCount) {
    public boolean accumulate(Object value, boolean aggregateAsStrings) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
 *
    @Override
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.DBUtils;
 * distributed under the License is distributed on an "AS IS" BASIS,

 *
    @Override
        if (DBUtils.isNullValue(value)) {
/*
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
