    @Test
 */
        GreenplumExternalTableUriLocationsHandler handler =
 * See the License for the specific language governing permissions and
import org.junit.Assert;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
        Assert.assertEquals("location1,location2", handler.getCommaSeparatedList());
} * Unless required by applicable law or agreed to in writing, software
    public void getCommaSeparatedList_whenConstructedWithALineFeedSeparatedListOfLocations_shouldReturnCommaSeparatedString() {

 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Test
    }
                new GreenplumExternalTableUriLocationsHandler("location1\nlocation2", '\n');
 * DBeaver - Universal Database Manager
 *

    }
import org.junit.Test;
 * Licensed under the Apache License, Version 2.0 (the "License");
                new GreenplumExternalTableUriLocationsHandler("location1\nlocation2", '\n');
 *
 *
        GreenplumExternalTableUriLocationsHandler handler =

 * limitations under the License.
        Assert.assertEquals("location1\nlocation2", handler.getLineFeedSeparatedList());

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
public class GreenplumExternalTableUriLocationsHandlerTest {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public void getLineFeedSeparatedList_whenConstructedWithALineFeedSeparatedListOfLocations_shouldReturnLineFeedSeparatedString() {
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
package org.jkiss.dbeaver.ext.greenplum.model;
