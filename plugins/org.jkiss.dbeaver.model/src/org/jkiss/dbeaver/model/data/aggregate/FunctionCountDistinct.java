    }
    @Override


 *
public class FunctionCountDistinct implements IAggregateFunction {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * You may obtain a copy of the License at
}

/**
 *
    public boolean accumulate(Object value, boolean aggregateAsStrings) {
import java.util.HashSet;
        }
 */
            return true;
    }
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *     http://www.apache.org/licenses/LICENSE-2.0
        return false;
 * See the License for the specific language governing permissions and
    private Set<Object> cache = new HashSet<>();
import java.util.Set;
        if (!cache.contains(value)) {
            count++;
 */
 * Unless required by applicable law or agreed to in writing, software

        return count;
 * limitations under the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    public Object getResult(int valueCount) {
    private int count = 0;
            cache.add(value);
package org.jkiss.dbeaver.model.data.aggregate;
 * you may not use this file except in compliance with the License.
    @Override

 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * FunctionCountDistinct
/*
