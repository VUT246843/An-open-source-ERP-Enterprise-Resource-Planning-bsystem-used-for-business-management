    );
    DBRFeature CATEGORY_RESULT_SET_VIEWER = DBRFeature.createCategory(CATEGORY_DATA_EDITOR, "Result set viewer", "Result set viewer features");
 * Copyright (C) 2010-2025 DBeaver Corp and others

/**
 * DBeaver - Universal Database Manager
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0
        "Data presentation",
    DBRFeature RESULT_SET_PANEL_CALC = DBRFeature.createFeature(CATEGORY_RESULT_SET_VIEWER, "Use calc panel");
 *
        CATEGORY_RESULT_SET_PRESENTATION,
    DBRFeature RESULT_SET_PANEL_GROUPING = DBRFeature.createFeature(CATEGORY_RESULT_SET_VIEWER, "Use group by panel");
 * Unless required by applicable law or agreed to in writing, software
 */
    DBRFeature RESULT_SET_PANEL_REFS = DBRFeature.createFeature(CATEGORY_RESULT_SET_VIEWER, "Use references panel");

        CATEGORY_RESULT_SET_VIEWER,
 *
public interface DataEditorFeatures {
    DBRFeature RESULT_SET_SCROLL = DBRFeature.createFeature(CATEGORY_RESULT_SET_VIEWER, "Scroll result set");
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

 *

    DBRFeature DATA_EDIT_OPEN = DBRFeature.createFeature(CATEGORY_DATA_EDITOR, "Open data editor");
    );
    DBRFeature RESULT_SET_REFRESH = DBRFeature.createFeature(CATEGORY_RESULT_SET_VIEWER, "Refresh result set");
 * You may obtain a copy of the License at
        "Presentation is used in the result set viewer"

 * See the License for the specific language governing permissions and
    DBRFeature RESULT_SET_PANEL_OPEN = DBRFeature.createFeature(CATEGORY_RESULT_SET_VIEWER, "Open result set panel");
    DBRFeature RESULT_SET_PANEL_METADATA = DBRFeature.createFeature(CATEGORY_RESULT_SET_VIEWER, "Use metadata panel");
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Data editor features
}

import org.jkiss.dbeaver.model.runtime.features.DBRFeature;
 */

package org.jkiss.dbeaver.ui;
    DBRFeature CATEGORY_RESULT_SET_PRESENTATION = DBRFeature.createCategory(
/*
    DBRFeature CATEGORY_DATA_EDITOR = DBRFeature.createCategory("Data editor", "Data editor features");
    DBRFeature RESULT_SET_PRESENTATION_RECORD = DBRFeature.createFeature(CATEGORY_RESULT_SET_PRESENTATION, "Use Record mode view");
 * you may not use this file except in compliance with the License.

    DBRFeature RESULT_SET_PRESENTATION_SELECTED = DBRFeature.createFeature(
        "Selected presentation"
