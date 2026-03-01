}
 * distributed under the License is distributed on an "AS IS" BASIS,
 */
 * limitations under the License.
    public Object getResult(int valueCount) {

        }
    }
    @Override
 */
            if (result == null || AggregateUtils.compareValues((Comparable<?>) value, result) < 0) {
 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
        value = FunctionNumeric.getComparable(value, aggregateAsStrings);
 *

 *
package org.jkiss.dbeaver.model.data.aggregate;
        return result;

            }
                result = (Comparable<?>) value;

    public boolean accumulate(Object value, boolean aggregateAsStrings) {
 * you may not use this file except in compliance with the License.
 *
/*
        return false;
 * You may obtain a copy of the License at
        if (value != null) {
public class FunctionMin implements IAggregateFunction {
            return true;
 * Unless required by applicable law or agreed to in writing, software
    }
    Comparable<?> result = null;
 * FunctionSum
 * Licensed under the Apache License, Version 2.0 (the "License");
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
