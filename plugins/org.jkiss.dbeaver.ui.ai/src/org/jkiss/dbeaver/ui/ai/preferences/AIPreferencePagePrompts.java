
                instructions.put(entry.getKey(), entry.getValue());
    public AIPreferencePagePrompts() {
        promptsViewer.setSelection(new StructuredSelection(generators.getFirst()));

        return super.performOk();
            IStructuredSelection selection = event.getStructuredSelection();
    }
                var descriptor = (AIPromptGeneratorDescriptor) selection.getFirstElement();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
                style.font = BaseThemeSettings.instance.treeAndTableFontItalic;
        var viewer = new TableViewer(parent, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
import org.eclipse.swt.graphics.Image;
        UIUtils.createInfoLabel(parent, AIUIMessages.gpt_preference_page_prompts_hint);
import org.eclipse.ui.IWorkbenchPreferencePage;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }
    }
            if (description != null) {
                onGeneratorChanged(descriptor);
            var modified = isModified(descriptor);
        return !getCustomInstructions(generator).isEmpty();
        // do nothing

        editor.addModifyListener(e -> onInstructionsChanged(editor.getText().strip()));
        instructionsText.setText("");
        this.customInstructions.putAll(settingsManager.getSettings().getCustomInstructions());
        public StyledString getStyledText(Object element) {
            public void applyStyles(@NotNull TextStyle style) {
        this.settings = settingsManager.getSettings();
    private void onInstructionsChanged(@NotNull String instructions) {
            }
import org.eclipse.jface.window.ToolTip;
    @Override
import org.jkiss.dbeaver.ui.UIUtils;
        viewer.setLabelProvider(new DelegatingStyledCellLabelProvider(new ViewerLabelProvider()));
        var instructions = new LinkedHashMap<String, String>();
import org.jkiss.dbeaver.ui.controls.ListContentProvider;

 *
    private final AISettings settings;
 * limitations under the License.
        settings.setCustomInstructions(instructions);
        viewer.addSelectionChangedListener(event -> {
    @NotNull

        instructionsText.setText(getCustomInstructions(generator));
        // do nothing
        return sash;
    }

        }
    @Override
        viewer.setInput(generators);
        }
import org.eclipse.swt.custom.SashForm;
            }
    private Viewer createViewer(@NotNull Composite parent, @NotNull List<AIPromptGeneratorDescriptor> generators) {
import org.jkiss.code.Nullable;
import org.eclipse.jface.layout.GridLayoutFactory;
        private static final StyledString.Styler ITALIC_STYLER = new StyledString.Styler() {
    @Override
        @Nullable
    private final Map<String, String> customInstructions = new LinkedHashMap<>();
    private AIPromptGeneratorDescriptor activeGenerator;
 * See the License for the specific language governing permissions and
            return descriptor.getIcon() != null ? DBeaverIcons.getImage(descriptor.getIcon()) : null;
    }
    @NotNull
import java.util.List;
        settingsManager.saveSettings(settings);
        for (Map.Entry<String, String> entry : customInstructions.entrySet()) {
    }
        sash.setSashWidth(6);
    }
    }
    protected Control createPreferenceContent(@NotNull Composite parent) {
            @Override
import org.jkiss.dbeaver.model.ai.registry.AIPromptGeneratorRegistry;
        @Override
import org.eclipse.swt.graphics.TextStyle;

    public boolean performOk() {
import org.eclipse.swt.widgets.Text;


    @NotNull

        contents.setLayout(GridLayoutFactory.fillDefaults().create());
import org.jkiss.dbeaver.ui.ai.internal.AIUIMessages;
    }
                description = StringUtils.wrap(description, 60);
    @NotNull
        sash.setWeights(30, 70);

 * Copyright (C) 2010-2026 DBeaver Corp and others
        };
 *

import org.eclipse.swt.layout.GridData;
    private Text createEditor(@NotNull Composite parent) {

import org.eclipse.jface.viewers.*;

import org.jkiss.dbeaver.ui.BaseThemeSettings;
    }
            if (!selection.isEmpty()) {
        return customInstructions.getOrDefault(generator.getId(), "");
    private final class ViewerLabelProvider extends ColumnLabelProvider implements DelegatingStyledCellLabelProvider.IStyledLabelProvider {
        customInstructions.clear();
            }


import org.jkiss.dbeaver.model.ai.registry.AIPromptGeneratorDescriptor;
            }
            .sorted(Comparator.comparing(AIPromptGeneratorDescriptor::getLabel))
        return editor;
            return new StyledString(descriptor.getLabel(), modified ? ITALIC_STYLER : null);
        });
        return viewer;


import java.util.Map;
        activeGenerator = generator;
        @NotNull
        promptsViewer = createViewer(sash, generators);
        ColumnViewerToolTipSupport.enableFor(viewer, ToolTip.NO_RECREATE);
        }
        @Override
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.model.ai.registry.AISettingsManager;
            var descriptor = (AIPromptGeneratorDescriptor) element;
    }
    private boolean isModified(@NotNull AIPromptGeneratorDescriptor generator) {
    private Viewer promptsViewer;

            }
    public void setElement(@NotNull IAdaptable element) {
import org.eclipse.swt.widgets.Control;
    @Override
        var sash = new SashForm(parent, SWT.HORIZONTAL | SWT.SMOOTH);
import org.eclipse.core.runtime.IAdaptable;
        public Image getImage(@NotNull Object element) {
        }

import org.jkiss.utils.StringUtils;
    }
        instructionsText = createEditor(sash);
import java.util.LinkedHashMap;
public final class AIPreferencePagePrompts extends AbstractPrefPage implements IWorkbenchPreferencePage, IWorkbenchPropertyPage {
        this.settingsManager = AISettingsManager.getInstance();
    private String getCustomInstructions(@NotNull AIPromptGeneratorDescriptor generator) {
/*
            String description = descriptor.getDescription();

    @NotNull
        activeGenerator = null;
    @Override
            var descriptor = (AIPromptGeneratorDescriptor) element;
import java.util.Comparator;
    private void onGeneratorChanged(@NotNull AIPromptGeneratorDescriptor generator) {
    protected void performDefaults() {

    public IAdaptable getElement() {
            .toList();

        @Override
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
            return description;
    }
 */
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
    public void init(@NotNull IWorkbench workbench) {
 * you may not use this file except in compliance with the License.
        return settings;
    }
import org.jkiss.dbeaver.ui.DBeaverIcons;

    @Override
}
        }
        var editor = new Text(contents, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
        var contents = new Composite(parent, SWT.NONE);
package org.jkiss.dbeaver.ui.ai.preferences;
import org.eclipse.ui.IWorkbench;
        public String getToolTipText(Object element) {
        editor.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
    private final AISettingsManager settingsManager;

                promptsViewer.refresh();
    private Text instructionsText;
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.model.ai.AISettings;


 * You may obtain a copy of the License at

        var generators = AIPromptGeneratorRegistry.getInstance().getAllPromptGenerator().stream()
 * distributed under the License is distributed on an "AS IS" BASIS,
        viewer.setContentProvider(new ListContentProvider());
        if (activeGenerator != null) {
            var descriptor = (AIPromptGeneratorDescriptor) element;
            var previous = customInstructions.put(activeGenerator.getId(), instructions);
        promptsViewer.refresh();

import org.eclipse.ui.IWorkbenchPropertyPage;


import org.jkiss.code.NotNull;
 * Unless required by applicable law or agreed to in writing, software
            if (!entry.getValue().isEmpty()) {

            if (previous == null || !previous.equals(instructions)) {
