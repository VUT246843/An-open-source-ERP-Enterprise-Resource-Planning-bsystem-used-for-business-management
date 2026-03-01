 *

        // then

        // given
        // given
    public void dangerousDeleteShouldReturnDangerous() {
    public void dangerousUpdateShouldReturnDangerous() {
    public void dropSchemaStatementShouldReturnDropType() {
    @Test
        // given
public class SQLQueryDangerousDetectionTest extends DBeaverUnitTest {
import static org.junit.Assert.assertFalse;
        // then
    @Test
        // then
import static org.junit.Assert.assertTrue;
        assertFalse(query.isDeleteUpdateDangerous());

 * limitations under the License.
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
    public void noDangerousUpdateShouldReturnNotDangerous() {
import org.jkiss.junit.DBeaverUnitTest;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * you may not use this file except in compliance with the License.
    @Test


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        var query = new SQLQuery(null, "SELECT * FROM table WHERE id = ?");

    }

 * Unless required by applicable law or agreed to in writing, software
    }

        var query = new SQLQuery(null, "DELETE FROM table");
    @Test


 */
    }
        // then
 * You may obtain a copy of the License at
        assertTrue(query.isDeleteUpdateDangerous());
        var query = new SQLQuery(null, "DROP schema users");
import org.junit.Test;
 * Licensed under the Apache License, Version 2.0 (the "License");
        assertTrue(query.isDeleteUpdateDangerous());
    }
        var query = new SQLQuery(null, "DELETE FROM table SET a = 1 WHERE id = 1");
    public void dropTableStatementShouldReturnTableDropType() {
}
    public void noDropStatementShouldReturnNoneTypeDrop() {
    @Test
/*
        // given
        var query = new SQLQuery(null, "UPDATE table SET a = 1");
        // then
        // given
        // then
 *
 * DBeaver - Universal Database Manager

    @Test
        assertFalse(query.isDeleteUpdateDangerous());
    public void noDangerousDeleteShouldReturnNotDangerous() {
        assertFalse(query.isDropDangerous());
        assertTrue(query.isDropDangerous());

    }
 * See the License for the specific language governing permissions and
        // given

        assertTrue(query.isDropDangerous());
 *
        // given
        var query = new SQLQuery(null, "DROP table users");
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Test
package org.jkiss.dbeaver.model.sql;
    }
        // then
        var query = new SQLQuery(null, "UPDATE table SET a = 1 WHERE id = 1");
