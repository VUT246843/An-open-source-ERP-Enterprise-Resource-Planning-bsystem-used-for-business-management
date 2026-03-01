 * distributed under the License is distributed on an "AS IS" BASIS,
 * limitations under the License.
    long FEATURE_PANELS             = 4;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    long FEATURE_COMPACT_FILTERS    = 64;

 * Copyright (C) 2010-2026 DBeaver Corp and others
 * You may obtain a copy of the License at
    /**
public interface IResultSetDecorator {
     */
    long FEATURE_FILTERS            = 1;
    String getPreferredPresentation();
    Boolean getAutoRecordMode();
    void fillContributions(@NotNull IContributionManager contributionManager);
     * Fill additional menu actions

 */
    void registerDragAndDrop(@NotNull IResultSetPresentation presentation);
    @Nullable

    @Nullable
/*
 * See the License for the specific language governing permissions and



    @Nullable
    long FEATURE_LINKS              = 32;
    /**


    long FEATURE_DECORATE_ON_DEMAND = 1 << 8;
     */
 *
import org.jkiss.dbeaver.model.data.DBDAttributeDecorator;
    long FEATURE_PRESENTATIONS      = 16;
    long FEATURE_NONE               = 0;
import org.eclipse.jface.action.IContributionManager;
 * Unless required by applicable law or agreed to in writing, software
     * Primary presentation ID.
import org.jkiss.code.Nullable;

    @Nullable
 * you may not use this file except in compliance with the License.
    long getDecoratorFeatures();
    long FEATURE_STATUS_BAR         = 2;
 *
    String getEmptyDataMessage();
    /** Decorations should be applied when the result set if activated */
 * DBeaver - Universal Database Manager
    long FEATURE_EDIT               = 8;
    /** Hides the status details label */

 *
    DBDAttributeDecorator getDataLabelProvider();
import org.jkiss.code.NotNull;

package org.jkiss.dbeaver.ui.controls.resultset;
     * @return presentation ID or null.
/**
}
 *     http://www.apache.org/licenses/LICENSE-2.0
    @Nullable
    long FEATURE_COMPACT_STATUS     = 128;
 */
    String getEmptyDataDescription();
 * Licensed under the Apache License, Version 2.0 (the "License");
 * ResultSet decorator.

