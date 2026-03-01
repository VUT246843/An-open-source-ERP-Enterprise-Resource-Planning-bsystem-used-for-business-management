        }
import org.junit.After;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Unless required by applicable law or agreed to in writing, software
    @Before
import org.junit.Test;
    public void setUp() throws Exception {
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Test
 * See the License for the specific language governing permissions and

    @After
        try {
    public void tearDown() throws Exception {
 * you may not use this file except in compliance with the License.
            System.out.println("DBeaver application: " + infoDetails);
            e.printStackTrace();
import org.junit.Before;

 * Copyright (C) 2010-2025 DBeaver Corp and others
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package org.jkiss.dbeaver.test.platform;
        } catch (Exception e) {
    }
/*
 * limitations under the License.
            String infoDetails = DBWorkbench.getPlatform().getApplication().getInfoDetails();
 * Licensed under the Apache License, Version 2.0 (the "License");

import org.jkiss.dbeaver.runtime.DBWorkbench;
 * DBeaver - Universal Database Manager

}
 *
    public void testPlatformPresence() {
    }
 *

    }
import org.jkiss.junit.DBeaverUnitTest;
public class PlatformTest extends DBeaverUnitTest {
 *
