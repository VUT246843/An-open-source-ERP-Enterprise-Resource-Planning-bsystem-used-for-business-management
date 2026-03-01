}
        return false;

 * See the License for the specific language governing permissions and
 *     http://www.apache.org/licenses/LICENSE-2.0

            cache.add((Comparable<?>) value);
            if (val1 instanceof Number && val2 instanceof Number) {
    private final List<Comparable<?>> cache = new ArrayList<>();
            return true;
        } else {
import java.util.ArrayList;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * Median
        value = FunctionNumeric.getComparable(value, aggregateAsStrings);

        try {
public class FunctionMedian implements IAggregateFunction {
package org.jkiss.dbeaver.model.data.aggregate;
    public Object getResult(int valueCount) {
            Comparable<?> val2 = cache.get(middle);
 * DBeaver - Universal Database Manager
        }
import java.util.List;
 *
            return cache.get(middle);
    public boolean accumulate(Object value, boolean aggregateAsStrings) {
 * you may not use this file except in compliance with the License.

        }


            cache.sort(AggregateUtils::compareValues);
        if (size % 2 == 1) {
 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            return null;
            log.debug("Can't sort value collection: " + e.getMessage());
 *

    @Override
        } catch (Exception e) {
    private static final Log log = Log.getLog(FunctionMedian.class);
/**
import org.jkiss.dbeaver.Log;
 * Licensed under the Apache License, Version 2.0 (the "License");
            // So just get first one
    }
    @Override
 * Unless required by applicable law or agreed to in writing, software
            // Not true median - but we can't evaluate it for non-numeric values
            }
        if (value != null) {
    }
        }
 * You may obtain a copy of the License at
        int middle = size / 2;
            Comparable<?> val1 = cache.get(middle - 1);
            return val1;
 */
                return (((Number) val1).doubleValue() + ((Number) val2).doubleValue()) / 2.0;

 */
        int size = cache.size();
/*
