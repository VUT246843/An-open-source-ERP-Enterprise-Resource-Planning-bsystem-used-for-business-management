    @Override
 *
 * See the License for the specific language governing permissions and

import org.jkiss.dbeaver.ui.controls.resultset.internal.ResultSetMessages;
        return ResultSetMessages.sql_editor_resultset_filter_panel_control_no_data;

    }
 */
    @Override
    }
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
    public String getEmptyDataMessage() {
 *
    @Override
 * Decorator for query results
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
    public String getEmptyDataDescription() {
    public long getDecoratorFeatures() {
 * DBeaver - Universal Database Manager
 * you may not use this file except in compliance with the License.

 * limitations under the License.

 * Copyright (C) 2010-2024 DBeaver Corp and others
        return null;
}
/*
 */
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return FEATURE_FILTERS | FEATURE_STATUS_BAR | FEATURE_PANELS | FEATURE_PRESENTATIONS | FEATURE_EDIT | FEATURE_LINKS;
public class QueryResultsDecorator extends ResultSetDecoratorBase {
 * distributed under the License is distributed on an "AS IS" BASIS,
    }
package org.jkiss.dbeaver.ui.controls.resultset;
/**

