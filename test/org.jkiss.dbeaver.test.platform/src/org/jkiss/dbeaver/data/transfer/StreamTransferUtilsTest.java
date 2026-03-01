
import org.jkiss.dbeaver.tools.transfer.stream.StreamTransferUtils;
import java.util.HashMap;

 * See the License for the specific language governing permissions and
        props.put("delimiter", null);
 * You may obtain a copy of the License at

 *
    public void testDelimiterString() {
import org.junit.Assert;
import org.jkiss.junit.DBeaverUnitTest;
public class StreamTransferUtilsTest extends DBeaverUnitTest {
        Assert.assertEquals(",", StreamTransferUtils.getDelimiterString(props, "delimiter"));
        Assert.assertEquals(" \t\n\r", StreamTransferUtils.getDelimiterString(props, "delimiter"));
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Copyright (C) 2010-2024 DBeaver Corp and others
import java.util.Map;

 *
        props.put("delimiter", " \\t\\n\\r");
        props.put("delimiter", "");
 * Unless required by applicable law or agreed to in writing, software
package org.jkiss.dbeaver.data.transfer;
        Assert.assertEquals(",", StreamTransferUtils.getDelimiterString(props, "delimiter"));
        Map<String, Object> props = new HashMap<>();
 * limitations under the License.
import org.junit.Test;

 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    }
/*
 * DBeaver - Universal Database Manager
}
 * you may not use this file except in compliance with the License.
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Test
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
