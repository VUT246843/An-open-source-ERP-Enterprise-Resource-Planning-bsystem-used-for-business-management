 * Decorator for grouping panel
 */
        return referenceKey != null && !referenceKey.isReference();
import org.jkiss.dbeaver.ui.controls.resultset.QueryResultsDecorator;
        ReferencesResultsContainer.ReferenceKey referenceKey = container.getActiveReferenceKey();
 * Unless required by applicable law or agreed to in writing, software
 * limitations under the License.
import org.eclipse.jface.action.IContributionManager;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
package org.jkiss.dbeaver.ui.controls.resultset.panel.references;

 * you may not use this file except in compliance with the License.

    @Override
 *

 *
}
    public Boolean getAutoRecordMode() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
    public long getDecoratorFeatures() {
    }
    public void fillContributions(@NotNull IContributionManager contributionManager) {
    public ReferencesResultsDecorator(ReferencesResultsContainer container) {
 * distributed under the License is distributed on an "AS IS" BASIS,
/**
        this.container = container;
 * DBeaver - Universal Database Manager
 *
    private ReferencesResultsContainer container;
        return FEATURE_EDIT | FEATURE_LINKS | FEATURE_PRESENTATIONS;


//        contributionManager.add(new ReferencesPanel.EditColumnsAction(container));
 * See the License for the specific language governing permissions and
/*
//        contributionManager.add(new ReferencesPanel.ClearGroupingAction(container));
    }
import org.jkiss.code.NotNull;
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * You may obtain a copy of the License at
 * Licensed under the Apache License, Version 2.0 (the "License");
//        contributionManager.add(new ReferencesPanel.DeleteColumnAction(container));
    @Override
    @Override
    }

public class ReferencesResultsDecorator extends QueryResultsDecorator {
    }


