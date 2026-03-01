 * Licensed under the Apache License, Version 2.0 (the "License");
            }
        }*/
 */
 * you may not use this file except in compliance with the License.
        return false;
            return null;
 * FunctionAvg
 * See the License for the specific language governing permissions and

        Number num = getNumeric(value);
public class FunctionAvg extends FunctionNumeric {
/**

    public Object getResult(int valueCount) {
}
            result += num.doubleValue();
 * Unless required by applicable law or agreed to in writing, software
 *
            return true;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    protected double result = Double.NaN;
 *
    }
        if (Double.isNaN(result)) {
        if (num != null) {
    @Override
 * You may obtain a copy of the License at
        }/* else if (value instanceof Date) {
    }
 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Copyright (C) 2010-2024 DBeaver Corp and others
                result = 0.0;
            dateResult += ((Date)value).getTime();
package org.jkiss.dbeaver.model.data.aggregate;
        }
 */
 * limitations under the License.
 * DBeaver - Universal Database Manager

    @Override
    public boolean accumulate(Object value, boolean aggregateAsStrings) {
            if (Double.isNaN(result)) {
            return true;
/*
        return result / valueCount;
