            select 5
import static org.junit.Assert.assertTrue;
            """;
        String md = """

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
            Query 4:
            """;
    @Test
        String md = """
             ```
        assertEquals(messageChunks.length, 0);
            ```
    }
            Query1: ```sql
        assertTrue(messageChunks[5] instanceof MessageChunk.Code code && "    select 3;".equals(code.text()));
        assertTrue(messageChunks[7] instanceof MessageChunk.Code code && " select 4;".equals(code.text()));
package org.jkiss.dbeaver.model.ai;
 *
    @Test
             union all
                select 3;
        assertEquals("```\nselect 1\n```", messageChunks[1].toRawString());
import org.jkiss.junit.DBeaverUnitTest;

            ```
    @Test
        assertTrue(messageChunks[1] instanceof MessageChunk.Code code && "select 1".equals(code.text()));

        MessageChunk[] messageChunks = AITextUtils.splitIntoChunks(md, true);
        assertEquals(messageChunks[8].toRawString(), "Query 5:");
 * you may not use this file except in compliance with the License.
            Query 2:
 * Copyright (C) 2010-2026 DBeaver Corp and others
            And trailing footer
 */
        assertEquals(messageChunks.length, 3);
import org.junit.Test;
              Query 3:
              and some footer
        assertTrue(messageChunks[9] instanceof MessageChunk.Code code && "select 5\n union all\nselect 6".equals(code.text()));
            ```
                ```
            ```
 * Licensed under the Apache License, Version 2.0 (the "License");
            This is some query
        MessageChunk[] messageChunks = AITextUtils.splitIntoChunks(md, true);
    public void mdEmptyText() {
        String md = """
            select 2
/*
            select 1
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
public class AIMarkdownTest extends DBeaverUnitTest {
        MessageChunk[] messageChunks = AITextUtils.splitIntoChunks(md, true);
            Query 5:
}
             select 4;
import org.jkiss.dbeaver.model.ai.impl.MessageChunk;
 * Unless required by applicable law or agreed to in writing, software
import static org.junit.Assert.assertEquals;
            select 6

              ```
            select 1
        assertTrue(messageChunks[3] instanceof MessageChunk.Code code && "select 2".equals(code.text()));
 * limitations under the License.
        assertEquals(messageChunks.length, 11);
 * See the License for the specific language governing permissions and
            ```
              ```

             ```
 * DBeaver - Universal Database Manager

            """;
 * You may obtain a copy of the License at

    public void mdMultiQueries() {
    public void mdMixedText() {
    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *

              ```sql
