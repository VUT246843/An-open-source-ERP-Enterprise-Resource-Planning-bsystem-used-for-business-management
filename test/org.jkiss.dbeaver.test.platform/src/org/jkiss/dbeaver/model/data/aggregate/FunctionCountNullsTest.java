
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Test
        return Arrays.asList(new Object[][]{
import org.junit.runners.Parameterized;
 * distributed under the License is distributed on an "AS IS" BASIS,
        values.forEach(value -> nullsCountFunc.accumulate(value, false));

    public void shouldGetZeroCountWhenNoNullsPresent() {
import org.junit.runner.RunWith;

 * Unless required by applicable law or agreed to in writing, software
    }
import java.util.Collection;
 */
    @Parameters(name = "{index}: Test count nulls in {0} Should be {1}")
                {Arrays.asList(1, 2, 3, null), 1L},
                {Arrays.asList(1, 2, 3, 4), 0L},
import org.hamcrest.CoreMatchers;
import org.junit.runners.Parameterized.Parameter;

     *

    @Parameter(value = 1)
    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
                {Arrays.asList(null, null), 2L}
    }
import org.junit.Test;
 * DBeaver - Universal Database Manager
     * Test data
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
 * See the License for the specific language governing permissions and
     * @return parameters for test
    @Parameter(value = 0)
     */
import org.jkiss.junit.DBeaverUnitTest;
 * Copyright (C) 2010-2024 DBeaver Corp and others
        });
import org.hamcrest.MatcherAssert;


    public Long expectedCount;
 *
public class FunctionCountNullsTest extends DBeaverUnitTest {
    public static Collection<Object[]> data() {

import java.util.List;
 * limitations under the License.
@RunWith(value = Parameterized.class)
import org.junit.runners.Parameterized.Parameters;
 *

        MatcherAssert.assertThat(nullsCountFunc.getResult(0), CoreMatchers.is(expectedCount));

 *
/*
package org.jkiss.dbeaver.model.data.aggregate;
import java.util.Arrays;
 * you may not use this file except in compliance with the License.
        var nullsCountFunc = new FunctionCountNulls();
}
    public List<Integer> values;
