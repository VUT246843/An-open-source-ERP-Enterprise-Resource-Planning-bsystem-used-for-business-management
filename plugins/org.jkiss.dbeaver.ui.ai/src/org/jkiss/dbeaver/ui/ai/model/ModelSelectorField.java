    public void refreshModelListSilently(boolean refresh) {
        }
            combo.setItems(sortedModels.toArray(new String[0]));
        if (model == null || model.isBlank()) {
            });

            disableModifyListener = true;
 * See the License for the specific language governing permissions and
                .toList();
import org.eclipse.swt.layout.GridData;


    }
/*
        return new Builder();
import org.eclipse.core.runtime.Status;
            ModelSelectorField modelSelectorField = new ModelSelectorField(combo, modelListSupplier, onModify);
                            } catch (DBException exception) {
                UIIcon.REFRESH,
                parent,
                                return Status.CANCEL_STATUS;
                SWT.DROP_DOWN
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
import java.util.Set;
            return this;
    public interface ModelListProvider {
import org.eclipse.swt.SWT;
                SelectionListener.widgetSelectedAdapter((e) -> {
    private static final Log log = Log.getLog(ModelSelectorField.class);
import org.jkiss.code.Nullable;

        public Builder withParent(@NotNull Composite parent) {
                    new AbstractJob("Refreshing model list") {
import org.eclipse.core.runtime.IStatus;
            if (combo.isDisposed()) {
                })
            this.combo.addModifyListener(e -> selectedModel = combo.getText());

            this.modelLabel = modelLabel;
            @Override
    }
    public void refreshModelList(DBRProgressMonitor monitor, boolean refresh) throws DBException {
        public Builder withModelListSupplier(@NotNull ModelListProvider modelListProvider) {
            List<String> sortedModels = new ArrayList<>(models).stream()
            return modelSelectorField;
 *
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * you may not use this file except in compliance with the License.
    public static Builder builder() {
                }
package org.jkiss.dbeaver.ui.ai.model;
        }
    @Nullable
import org.jkiss.dbeaver.model.runtime.AbstractJob;
 * Copyright (C) 2010-2025 DBeaver Corp and others
        @Nullable
import java.util.ArrayList;
            return;

        @NotNull

            return;
            );
            combo.select(sortedModels.indexOf(selectedItem));

        @NotNull
            }
        new AbstractJob("Refreshing model list silently") {
    }
        public Builder withModifyListener(@NotNull Runnable onModify) {
        });
        private GridData gridData;
                        }
    private final Combo combo;
        combo.setText(model);
            this.onModify = onModify;
    private ModelSelectorField(

        } else {
            this.parent = parent;
                String newText = combo.getText();
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;
import org.eclipse.swt.widgets.Composite;
 */
    @NotNull
        private Runnable onModify;
        Set<String> models = new HashSet<>(modelListProvider.getModels(monitor, refresh));

            String selectedItem = combo.getText();
            UIUtils.createPushButton(
        }
                                modelSelectorField.refreshModelList(monitor, true);
                                    exception
    }
        @NotNull Combo combo,
                        @NotNull
import java.util.HashSet;
import org.eclipse.swt.widgets.Combo;
import org.jkiss.dbeaver.DBException;
            return this;
        UIUtils.syncExec(() -> {


            protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    public String getSelectedModel() {
        }

                                );
                                return Status.OK_STATUS;
    public void setSelectedModel(@Nullable String model) {
        @NotNull

        @Nullable Runnable onModelModify
                    refreshModelList(monitor, refresh);
                        @Override
import org.jkiss.code.NotNull;
            return this;

                if (!newText.equals(selectedModel) && !disableModifyListener) {
        public Builder withGridData(@NotNull GridData gridData) {
        @NotNull ModelListProvider modelListProvider,

            }

        this.combo = combo;
                null,
            this.modelListSupplier = modelListProvider;
                    selectedModel = newText;

 * limitations under the License.
public class ModelSelectorField {
                .sorted(String::compareToIgnoreCase)
                            }
 * You may obtain a copy of the License at
        @NotNull

    }
                    return Status.OK_STATUS;
            disableModifyListener = false;
            this.gridData = gridData;
            Combo combo = UIUtils.createLabelCombo(


            );
        @NotNull
        if (models.isEmpty()) {

        List<String> getModels(@NotNull DBRProgressMonitor monitor, boolean forceRefresh) throws DBException;
        private Composite parent;
    private final ModelListProvider modelListProvider;
                                DBWorkbench.getPlatformUI().showError(
 *
}

    @NotNull


    }
                    return Status.CANCEL_STATUS;
                    onModelModify.run();
 *
            return this;
 * DBeaver - Universal Database Manager
 * Unless required by applicable law or agreed to in writing, software
    public static class Builder {
        public Builder withModelLabel(@NotNull String modelLabel) {
 * distributed under the License is distributed on an "AS IS" BASIS,
        }
        }
import java.util.List;
                                    null,
    private volatile String selectedModel;
        private String modelLabel = AIUIMessages.gpt_preference_page_combo_engine;

            return this;
        this.modelListProvider = modelListProvider;
                modelLabel,

import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
        private ModelListProvider modelListSupplier;
            @NotNull
    ) {
                            try {
                AIUIMessages.gpt_preference_page_refresh_models,
import org.jkiss.dbeaver.ui.UIUtils;
                        protected IStatus run(@NotNull DBRProgressMonitor monitor) {
    @NotNull
        }.schedule();

        }
        if (onModelModify != null) {
        public ModelSelectorField build() {
                    }.schedule();
        }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                try {
    }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.dbeaver.Log;
    private boolean disableModifyListener = false;
                }
import org.eclipse.swt.events.SelectionListener;

        return selectedModel;

    }

                } catch (DBException e) {
            models.add(selectedItem);
                return;
            combo.setLayoutData(gridData);
            this.combo.addModifyListener(e -> {
                parent,
                                    "Error reading model list",
                    log.debug("Error reading model list", e);
import org.jkiss.dbeaver.ui.UIIcon;
