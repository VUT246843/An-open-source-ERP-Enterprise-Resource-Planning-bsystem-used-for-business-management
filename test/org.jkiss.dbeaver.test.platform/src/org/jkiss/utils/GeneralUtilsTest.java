 *
import org.junit.Test;
        }
        var patternsWithResults = Map.of(
    public static final String VARIABLE_MONTH = "month";
                getVariableValue(VARIABLE_YEAR, ts) + getVariableValue(VARIABLE_YEAR, ts) + "-"
package org.jkiss.utils;
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
            default:
                return name;
import java.util.Date;
            case VARIABLE_YEAR:
    @NotNull

                return new SimpleDateFormat("mm").format(ts);

    }
            assertEquals(expectedResult, actualResult);
                return new SimpleDateFormat("HH").format(ts);

            String expectedResult = entry.getValue();
        }
            "${missingVariable}", "missingVariable",
        );
    public static final String VARIABLE_DAY = "day";
/*

            String actualResult = GeneralUtils.replaceVariables(pattern, (name) -> getVariableValue(name, ts));
    public static final String VARIABLE_YEAR = "year";
            "abracadabra${hour}", "abracadabra" + getVariableValue(VARIABLE_HOUR, ts),
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static String getVariableValue(@NotNull String name, @NotNull Date ts) {
                return new SimpleDateFormat("yyyy").format(ts);

                + getVariableValue(VARIABLE_MONTH, ts) + getVariableValue(VARIABLE_YEAR, ts) + "-"
            case VARIABLE_DAY:
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Test
            case VARIABLE_MONTH:
import org.jkiss.dbeaver.utils.GeneralUtils;
        switch (name) {
        for (Map.Entry<String, String> entry : patternsWithResults.entrySet()) {
 * you may not use this file except in compliance with the License.
}
    public static final String VARIABLE_HOUR = "hour";
import org.jkiss.code.NotNull;
    
 * limitations under the License.
 */
 * See the License for the specific language governing permissions and
            case VARIABLE_HOUR:
                return new SimpleDateFormat("MM").format(ts);
        Date ts = new Date(90, 3, 21, 3, 20, 54);
 * Licensed under the Apache License, Version 2.0 (the "License");
import static org.junit.Assert.assertEquals;
    }   
 * You may obtain a copy of the License at
            "hour${month}day", "hour" + getVariableValue(VARIABLE_MONTH, ts) + "day",
import java.util.Map;
                + getVariableValue(VARIABLE_DAY, ts) + getVariableValue(VARIABLE_MONTH, ts)
        @SuppressWarnings("deprecation")
                + getVariableValue(VARIABLE_MONTH, ts) + getVariableValue(VARIABLE_DAY, ts) + "-"
 *
            "${year}${year}-${month}${year}-${month}${day}-${day}${month}", 
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * DBeaver - Universal Database Manager
public class GeneralUtilsTest extends DBeaverUnitTest {
    
    public void testVariablesSubstitution() {
import java.text.SimpleDateFormat;
                return new SimpleDateFormat("dd").format(ts);
 *
    public static final String VARIABLE_MINUTE = "minute";
            "${minute}", getVariableValue(VARIABLE_MINUTE, ts),
            String pattern = entry.getKey();
import org.jkiss.junit.DBeaverUnitTest;
            case VARIABLE_MINUTE:
