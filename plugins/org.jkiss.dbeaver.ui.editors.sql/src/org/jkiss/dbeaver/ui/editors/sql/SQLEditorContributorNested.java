
 * you may not use this file except in compliance with the License.
        nestedCount++;


        nestedId = nestedCount;
    }
 * DBeaver - Universal Database Manager
 * See the License for the specific language governing permissions and
    protected boolean isNestedEditor()
 * distributed under the License is distributed on an "AS IS" BASIS,
    public void dispose()
}
 * Nested SQL editor contributor.


    }
    {
 */
 * Unless required by applicable law or agreed to in writing, software

 *     http://www.apache.org/licenses/LICENSE-2.0
 */
        return true;//nestedId > 0;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    @Override

 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    {
 *
    @Override
    }
        nestedCount--;
 * It is really nested if more than one contributor exists at the same time.
    private int nestedId;

 * limitations under the License.
 * Otherwise it should act as normal contributor
 * Licensed under the Apache License, Version 2.0 (the "License");
        super.dispose();
    private static int nestedCount = 0;
/**
 *
public class SQLEditorContributorNested extends SQLEditorContributor {
/*
    {
    public SQLEditorContributorNested()
package org.jkiss.dbeaver.ui.editors.sql;
 *
