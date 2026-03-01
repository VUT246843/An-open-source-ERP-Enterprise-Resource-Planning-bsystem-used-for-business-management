/**
        if (num != null) {
    private final List<Object> cache = new ArrayList<>();
    }
    public Object getResult(int valueCount) {
 * Mode
//            return null;
        }
                maxCount = count;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
        Number num = FunctionNumeric.getNumeric(value);
                if (cache.get(j).equals(cache.get(i))) {
import java.util.List;
 *
                    count++;
//        if (maxCount <= 1) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Object maxValue = null;
        }
            if (count > maxCount) {
            cache.add(value);
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software

        return false;
 */
}
        for (int i = 0; i < cache.size(); ++i) {
 *
import java.util.ArrayList;
            int count = 0;


            }
 *     http://www.apache.org/licenses/LICENSE-2.0
package org.jkiss.dbeaver.model.data.aggregate;
                maxValue = cache.get(i);

public class FunctionMode implements IAggregateFunction {
        return maxValue;
 */
 *
/*

 * DBeaver - Universal Database Manager

//        }
                }
            for (int j = 0; j < cache.size(); ++j) {
        int maxCount = 0;
    @Override
            return true;
    public boolean accumulate(Object value, boolean aggregateAsStrings) {
 * See the License for the specific language governing permissions and
        if (value != null) {
            value = num;
        }
    @Override
 * limitations under the License.
            }
 * You may obtain a copy of the License at
    }
