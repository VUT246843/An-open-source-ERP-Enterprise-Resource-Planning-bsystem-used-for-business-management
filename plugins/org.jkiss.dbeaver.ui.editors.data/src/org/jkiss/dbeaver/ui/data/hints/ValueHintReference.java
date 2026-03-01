            public void menuAboutToHide(@NotNull IMenuManager manager) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
            throw new IllegalArgumentException("At least one reference must be provided");
                        public void run() {
        });
    }
    public String getHintDescription() {
    public String getActionText() {
import org.jkiss.dbeaver.model.data.DBDValueRow;
        }.schedule();
import org.jkiss.code.NotNull;
        if (references.isEmpty()) {
import org.jkiss.dbeaver.model.runtime.AbstractJob;
            @NotNull
            }
            if (editDictionaryPage.edit(controller.getControl().getShell())) {
 * limitations under the License.
    }
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 * A resultset value hint that allows navigation to a single or multiple referenced rows.
            }
    ValueHintReference {
    @Override
/*
            var entity = association.getAssociatedEntity();
                ? NLS.bind("{0} ({1})", DBUtils.getObjectFullName(entity, DBPEvaluationContext.UI), association.getName())

        if (CommonUtils.isBitSet(state, SWT.ALT)) {
                    manager.add(new Action(label, image) {
                }
    }
        if (references.size() > 1) {
        } else {

 *

 *
        var menu = manager.createContextMenu(controller.getControl());
    @Override
    }
import org.eclipse.jface.action.Action;
    /**
import org.eclipse.core.runtime.Status;
            @Override
            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        if (references.size() > 1) {
    }
                : association.getName();
    }
        @NotNull
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetController;

                controller.refreshData(null);
        menu.setLocation(location);
import java.util.List;
            return "Navigate to...";
/**
    private static void performAction(@NotNull Reference reference, @NotNull IResultSetController controller, long state) {
import org.jkiss.code.Nullable;
                    controller.navigateAssociation(


        var manager = new MenuManager();
            showActionsMenu(controller, location, state);
    @Nullable
                    return GeneralUtils.makeExceptionStatus(e);
import org.jkiss.dbeaver.model.DBUtils;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.model.DBPEvaluationContext;
    public HintType getHintType() {
        }
import org.jkiss.utils.CommonUtils;
                        CommonUtils.isBitSet(state, SWT.MOD1)
                } catch (DBException e) {
    record Reference(
import org.eclipse.osgi.util.NLS;
 * Licensed under the Apache License, Version 2.0 (the "License");
    }
            return entity != null
import org.jkiss.dbeaver.model.DBPImage;
 * See the License for the specific language governing permissions and
    ) {
import org.eclipse.swt.SWT;
    }
        manager.addMenuListener(new IMenuListener2() {
     */
 * you may not use this file except in compliance with the License.
            }


        return UIIcon.LINK;
                    );
                for (int i = 0; i < references.size(); i++) {
        }
import org.eclipse.jface.action.IMenuManager;
        }
        references = List.copyOf(references);
                    var reference = references.get(i);
                    });
    private void showActionsMenu(@NotNull IResultSetController controller, @NotNull Point location, long state) {
                        @Override
import org.jkiss.dbeaver.model.data.hints.DBDValueHint;
    @NotNull
    public DBPImage getHintIcon() {
                            performAction(reference, controller, state);
                }

import org.jkiss.dbeaver.model.struct.DBSEntityType;
        new AbstractJob("Navigate association") {
            EditDictionaryPage editDictionaryPage = new EditDictionaryPage(reference.association().getAssociatedEntity());
                    var image = DBeaverIcons.getImageDescriptor(DBSEntityType.TABLE.getIcon());
 */
                        monitor,
    public void performAction(@NotNull IResultSetController controller, @NotNull Point location, long state) {
        menu.setVisible(true);
                UIUtils.asyncExec(manager::dispose);
import org.jkiss.dbeaver.ui.data.DBDValueHintActionHandler;
import org.jkiss.dbeaver.DBException;
                return Status.OK_STATUS;
 */

 * Copyright (C) 2010-2026 DBeaver Corp and others
        }
    @NotNull
            public void menuAboutToShow(@NotNull IMenuManager manager) {
        return "Navigate to referenced table row";
        private String toDisplayString() {
        return null;
    @NotNull
import org.jkiss.dbeaver.ui.editors.object.struct.EditDictionaryPage;
                try {
package org.jkiss.dbeaver.ui.data.hints;
        }

record ValueHintReference(@NotNull List<Reference> references) implements DBDValueHint, DBDValueHintActionHandler {
    @Override
    @Override
import org.jkiss.dbeaver.ui.*;
    @NotNull
}                        controller.getModel(),
                        List.of(reference.row()),
            return;
import org.jkiss.dbeaver.utils.GeneralUtils;
    public String getHintText() {


        return HintType.ACTION;
     * A reference to a single row in a referenced table via an association.
    }

        } else {
            @Override
    }

                manager.add(new EmptyAction("Navigate to"));
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.graphics.Point;
                        reference.association(),
    @Override
                    var label = ActionUtils.getLabelWithIndexMnemonic(reference.toDisplayString(), i);
        @NotNull DBSEntityAssociation association
        @NotNull DBDValueRow row,
import org.eclipse.jface.action.IMenuListener2;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
 * DBeaver - Universal Database Manager
            @Override
    @Override
            }
            performAction(references.getFirst(), controller, state);
                        }
            return "Navigate to " + references.getFirst().toDisplayString();
import org.eclipse.core.runtime.IStatus;
