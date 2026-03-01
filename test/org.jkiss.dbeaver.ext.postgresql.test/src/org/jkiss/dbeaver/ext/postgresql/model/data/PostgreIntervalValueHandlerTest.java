        String interval1 = "3 year 2 mon 9 days 06:10:32";
 * distributed under the License is distributed on an "AS IS" BASIS,
        int compare = comparator.compare(interval1, interval2);
import java.util.Comparator;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

    public void getComparator_whenNegativeDate_thenSuccess() {
        //WHEN
    public void getComparator_whenComplexDate_thenSuccess() {
}
 * limitations under the License.



    @Test
 * Copyright (C) 2010-2024 DBeaver Corp and others
        //THEN
/*
        //WHEN
import org.jkiss.junit.DBeaverUnitTest;
    PostgreIntervalValueHandler postgreIntervalValueHandler = new PostgreIntervalValueHandler();

    public void getComparator_whenComplexDateTime_thenSuccess() {
        Assert.assertTrue(compare < 0);


import org.junit.Assert;
 * you may not use this file except in compliance with the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        int compare = comparator.compare(interval1, interval2);
        String interval2 = "-1 year";
import org.junit.Test;
        //THEN
    }
        int compare = comparator.compare(interval1, interval2);
        String interval2 = "3 year 3 mon 9 days";

 * See the License for the specific language governing permissions and





 * Unless required by applicable law or agreed to in writing, software
        Comparator<Object> comparator = postgreIntervalValueHandler.getComparator();

    }
        String interval1 = "3 year 2 mon 9 days";
 *
 * DBeaver - Universal Database Manager

        Assert.assertTrue(compare > 0);
        String interval2 = "1 year";

 * You may obtain a copy of the License at
        String interval1 = "9 days";
        String interval1 = "9 days";
        //WHEN
    @Test
        //GIVEN
        String interval2 = "3 year 2 mon 9 days 05:10:31";
    public void getComparator_whenHappyCase_thenSuccess() {
        Comparator<Object> comparator = postgreIntervalValueHandler.getComparator();

    @Test
        //GIVEN

 * Licensed under the Apache License, Version 2.0 (the "License");
package org.jkiss.dbeaver.ext.postgresql.model.data;
        Assert.assertTrue(compare > 0);
    @Test
        //GIVEN
public class PostgreIntervalValueHandlerTest extends DBeaverUnitTest {
        //WHEN
        //GIVEN
        //THEN
        Assert.assertTrue(compare < 0);
 *
        //THEN
    }

        int compare = comparator.compare(interval1, interval2);
    }
        Comparator<Object> comparator = postgreIntervalValueHandler.getComparator();
        Comparator<Object> comparator = postgreIntervalValueHandler.getComparator();

 */
 *
