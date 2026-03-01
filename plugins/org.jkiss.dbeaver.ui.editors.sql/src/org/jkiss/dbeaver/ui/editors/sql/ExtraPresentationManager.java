                SQLEditorPropertyTester.firePropertyChange(SQLEditorPropertyTester.PROP_CAN_EXECUTE);
    SQLEditorPresentationPanel activePresentationPanel;
import org.jkiss.dbeaver.DBException;
        this.owner = owner;
        }

                "enabled"
    SQLPresentationDescriptor activePresentationDescriptor;
    public void dispose() {
                return true;
                    activePresentation.hidePresentation(this.owner);
                presentation.dispose();
            activePresentation = null;
 * Unless required by applicable law or agreed to in writing, software
        if (presentation == null) {


                if (activePresentation != null) {
import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationRegistry;
            if (presentation.canShowPresentation(this.owner, true)) {

    SQLEditorPresentation activePresentation;
                return true;
import org.jkiss.utils.CommonUtils;
        }
            activePresentationDescriptor = null;

            return true;
            presentations.put(presentation, null);
            final IEvaluationReference reference = evaluationService.addEvaluationListener(
        final Expression enabledWhen = presentation.getEnabledWhen();
    @Nullable
import org.eclipse.ui.services.IEvaluationService;
    final Map<SQLPresentationDescriptor, Integer> presentationStackIndices = new HashMap<>();
            return;
                presentationStackIndices.put(descriptor, this.owner.getPresentationStack().getChildren().length);
        }
            if (presentation.canShowPresentation(this.owner, false)) {
                presentations.put(descriptor, activePresentation);
            }
import org.eclipse.swt.SWT;
                panels.put(panel, null);

 * See the License for the specific language governing permissions and
 * Copyright (C) 2010-2026 DBeaver Corp and others

import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationDescriptor;
    private final SQLEditor owner;
            // Same presentation, no op
        if (!enabled && activePresentationDescriptor == presentation) {
        }
        }

            }
    }
}
class ExtraPresentationManager {
import org.jkiss.code.Nullable;
import java.util.Map;
        @NotNull VerticalButton button,
        if (evaluationService != null && enabledWhen != null) {
    final Map<SQLPresentationDescriptor, SQLEditorPresentation> presentations = new LinkedHashMap<>();
 * You may obtain a copy of the License at
                }
        return button;

    Control getActivePresentationControl() {
import org.jkiss.code.NotNull;

            for (SQLPresentationPanelDescriptor panel : presentation.getPanels()) {

        button.setVisible(enabled);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
        activePresentation = null;
                if (activePresentation != null) {

            return false;

 * you may not use this file except in compliance with the License.
        return this.owner.getPresentationStack().getChildren()[index];
    @NotNull
        }

    private void handlePresentationEnablement(
                }
        }
            button.setToolTipText(presentation.getDescription());

            button.setToolTipText(presentation.getDescription() + " (" + toolTip + ")");
import org.eclipse.core.expressions.Expression;
        boolean enabled
        for (SQLPresentationDescriptor presentation : SQLPresentationRegistry.getInstance().getPresentations()) {
                SQLEditorPropertyTester.firePropertyChange(SQLEditorPropertyTester.PROP_CAN_EXECUTE);
        if (this.owner.isDisposed()) {
                activePresentationDescriptor = descriptor;
        button.getParent().layout(true, true);

        button.setText(presentation.getLabel());

            return null;
        final int index = presentationStackIndices.get(activePresentationDescriptor);
        return false;
    }
    ) {
import org.jkiss.dbeaver.ui.DBeaverIcons;
            SQLEditorPropertyTester.firePropertyChange(SQLEditorPropertyTester.PROP_CAN_EXECUTE);
            return true;
        if (descriptor == null) {
/*
        final String toolTip = ActionUtils.findCommandDescription(
                activePresentationDescriptor = descriptor;
import org.jkiss.dbeaver.ui.ActionUtils;


                // Must be done before doing something to presentationStack
 */
    VerticalButton createPresentationButton(@NotNull SQLPresentationDescriptor presentation) {
import org.jkiss.dbeaver.ui.controls.VerticalButton;
                event -> handlePresentationEnablement(button, presentation, CommonUtils.toBoolean(event.getNewValue())),
        activePresentationPanel = null;
    final Map<SQLPresentationPanelDescriptor, SQLEditorPresentationPanel> panels = new HashMap<>();


        if (activePresentation != null && !activePresentation.canHidePresentation(this.owner)) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
import java.util.HashMap;
            activePresentationPanel = null;
            // Presentation decided not to close
        }

        activePresentationDescriptor = null;
 * limitations under the License.
        } else {
        final VerticalButton button = new VerticalButton(owner.getPresentationSwitchFolder(), SWT.RIGHT | SWT.CHECK);

        panels.clear();
        @NotNull SQLPresentationDescriptor presentation,
    }
    public boolean setActivePresentation(@Nullable SQLPresentationDescriptor descriptor) throws DBException {
        final IEvaluationService evaluationService = this.owner.getSite().getService(IEvaluationService.class);
        }
                activePresentation.showPresentation(this.owner, false);
        if (CommonUtils.isEmpty(toolTip)) {
 *
        presentations.clear();
import org.eclipse.ui.services.IEvaluationReference;
    }

        );
            }
import org.eclipse.swt.layout.FillLayout;

import org.jkiss.dbeaver.ui.editors.sql.registry.SQLPresentationPanelDescriptor;

import org.jkiss.dbeaver.ui.editors.sql.handlers.SQLEditorHandlerSwitchPresentation;
        SQLEditorPresentation presentation = presentations.get(descriptor);
            this.owner.showExtraPresentation((SQLPresentationDescriptor) null);

            SQLEditorHandlerSwitchPresentation.CMD_SWITCH_PRESENTATION_ID, this.owner.getSite(), true,
 * DBeaver - Universal Database Manager
 * Licensed under the Apache License, Version 2.0 (the "License");
            presentation = descriptor.createPresentation();
        } else {
        }
            button.addDisposeListener(e -> evaluationService.removeEvaluationListener(reference));
                enabledWhen,
        for (SQLEditorPresentation presentation : presentations.values()) {
import org.eclipse.swt.widgets.Composite;
        if (this.owner.getPresentationStack() == null || activePresentationDescriptor == null) {
        }
    @NotNull

import org.eclipse.swt.widgets.Control;
 *
        if (this.owner.getPresentationStack() == null || activePresentationDescriptor == descriptor) {
                activePresentation.createPresentation(placeholder, this.owner);


    }

                    activePresentation.hidePresentation(this.owner);
        button.setImage(DBeaverIcons.getImage(presentation.getIcon()));
            if (presentation != null) {

package org.jkiss.dbeaver.ui.editors.sql;
                activePresentation.showPresentation(this.owner, true);
                final Composite placeholder = new Composite(this.owner.getPresentationStack(), SWT.NONE);

            // Just hide presentation
 * distributed under the License is distributed on an "AS IS" BASIS,
                activePresentation = presentation;


                placeholder.setLayout(new FillLayout());
                activePresentation = presentation;
            );
        button.setData(presentation);
    public ExtraPresentationManager(@NotNull SQLEditor owner) {
import java.util.LinkedHashMap;
            SQLEditorHandlerSwitchPresentation.PARAM_PRESENTATION_ID, presentation.getId()

            }
