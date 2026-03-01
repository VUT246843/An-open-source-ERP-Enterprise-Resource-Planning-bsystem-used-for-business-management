
            Composite settingsGroup = UIUtils.createTitledComposite(
        return false;
                        if (item instanceof NotePart) {
                }
        }
                            settingsGroup.layout(true, true);
                if (settingsDialog.open() != IDialogConstants.OK_ID) {
            public void redo() {
import org.eclipse.gef.ui.actions.SelectionAction;
                            hasEntities = true;
import org.eclipse.jface.preference.ColorSelector;

 * DBeaver - Universal Database Manager
                        oldSettings.fontInfo = SharedFonts.toString(part.getCustomFont());

            if (node != null) {
                GridData.FILL_HORIZONTAL
            this.noteStyles = noteStyles;
                borderWidthText = UIUtils.createLabelText(settingsGroup, ERDUIMessages.erd_settings_border_width_label, String.valueOf(node == null ? 1 : node.getCustomBorderWidth()));
                }

                boolean hasNotes = false;
    }
                gd.widthHint = 30;
 * Copyright (C) 2010-2026 DBeaver Corp and others
                    if (item instanceof ICustomizablePart) {
        public String getFontData() {
            @Override
import org.eclipse.swt.graphics.FontData;
            private void setNodeSettings(ICustomizablePart part, ViewSettings settings) {

        private String fontInfo;
        private ViewSettings newSettings = new ViewSettings();
                        }
import org.jkiss.dbeaver.ui.UIUtils;
                }
                gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING | GridData.FILL_HORIZONTAL);
        private boolean transparency;
                    part.setCustomTransparency(settings.transparency);

import org.eclipse.swt.events.SelectionAdapter;
                ERDUIMessages.erd_settings_dialog_group_label,
import org.eclipse.gef.commands.Command;

 * you may not use this file except in compliance with the License.
        }
        public PartSettingsDialog(Shell parentShell, NodePart node, boolean noteStyles, boolean entityStyles) {
import org.jkiss.dbeaver.ui.editors.erd.editor.ERDEditorPart;
    protected void init() {
 *
                        ViewSettings oldSettings = new ViewSettings();
 * limitations under the License.
    protected boolean calculateEnabled() {
    private final IStructuredSelection selection;
            }
import org.eclipse.jface.dialogs.IDialogConstants;
        super(part);
                Button changeFontButton = UIUtils.createPushButton(settingsGroup, ERDUIMessages.erd_settings_button_change_font_label, null, null);
                    return;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;
import org.jkiss.utils.CommonUtils;
import java.util.Map;
            newSettings.borderWidth = getBorderWidth();
                borderWidthText.addVerifyListener(UIUtils.getIntegerVerifyListener(Locale.ENGLISH));
        this.selection = selection;
                for (Object item : objects) {

                    if (item instanceof ICustomizablePart colorizedPart) {
import org.eclipse.swt.layout.GridData;
            this.entityStyles = entityStyles;

            UIUtils.createControlLabel(settingsGroup, ERDUIMessages.erd_settings_color_picker_background_label);
            if (item instanceof NodePart) {
/*
 */
                }
        this.execute(this.createColorCommand(selection.toArray()));
                    foregroundColorPicker.setColorValue(node.getCustomForegroundColor().getRGB());
                }
        this.setId("setPartSettings"); //$NON-NLS-1$
                    part.setCustomBorderWidth(settings.borderWidth);
                }
            return foregroundColorPicker == null ? null : UIUtils.getSharedTextColors().getColor(foregroundColorPicker.getColorValue());
                        settings.fontInfo));
                previewText.setText(ERDUIMessages.erd_settings_font_preview_text);
                        }
                }
            public void undo() {
                            previewText.setFont(UIUtils.getSharedFonts().getFont(previewText.getDisplay(), result));
        }
        public Color getBackgroundColor() {
        private String fontData;

                    }
            return fontData;
                    if (item instanceof ICustomizablePart part) {

        }

                    if (item instanceof NodePart) {
        }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may obtain a copy of the License at
import org.jkiss.dbeaver.ui.editors.erd.part.EntityPart;
            return borderWidthText == null ? 0 : CommonUtils.toInt(borderWidthText.getText());
        private int borderWidth;
    }
                    public void widgetSelected(SelectionEvent e) {
                    }
        @Override
            }
                        }
                    part.setCustomForegroundColor(settings.foreground);
                        }
            }

 * distributed under the License is distributed on an "AS IS" BASIS,

            this.node = node;
                            setNodeSettings(colorizedPart, viewSettings);


        private Button transparentCheckbox;
                changeFontButton.addSelectionListener(new SelectionAdapter() {
        private final boolean noteStyles;
        protected Composite createDialogArea(@NotNull Composite parent) {
                for (Object item : objects) {
import org.jkiss.code.NotNull;
                if (part instanceof NotePart) {
            private ViewSettings newSettings;

import org.jkiss.dbeaver.ui.editors.erd.part.NodePart;
    }
            );

                        oldSettings.transparency = part.getCustomTransparency();

    private Command createColorCommand(final Object[] objects) {
import java.util.HashMap;
            super(parentShell, ERDUIMessages.erd_settings_dialog_text_title, null);
        }
            public void execute() {
                changeFontButton.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_BEGINNING));
                gd.horizontalSpan = 2;
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
                foregroundColorPicker = new ColorSelector(settingsGroup);

                        if (nodePart == null) {
    public SetPartSettingsAction(ERDEditorPart part, IStructuredSelection selection) {
import org.jkiss.dbeaver.ui.editors.erd.part.NotePart;
    }
 *
            @Override

        this.setText(ERDUIMessages.erd_settings_action_customize);
                UIUtils.createControlLabel(settingsGroup, ERDUIMessages.erd_settings_color_picker_foreground_label);
            newSettings.foreground = getForegroundColorPicker();
    public void run() {
package org.jkiss.dbeaver.ui.editors.erd.editor.tools;
        for (Object item : selection.toArray()) {
                        ERDUIMessages.erd_settings_checkbox_transparent_tip, node != null && node.getCustomTransparency(), 2);
                    }
            }
                        FontData result = fontDialog.open();
                        Display.getCurrent(),
import org.jkiss.dbeaver.ui.editors.erd.part.ICustomizablePart;
                        fontDialog.setFontList(previewText.getFont().getFontData());
        }
                }
            if (noteStyles) {
                for (Object item : objects) {
                part.setCustomBackgroundColor(settings.background);
                    fontData = SharedFonts.toString(node.getCustomFont().getFontData()[0]);
                        oldSettings.borderWidth = part.getCustomBorderWidth();

public class SetPartSettingsAction extends SelectionAction {
import org.jkiss.dbeaver.ui.SharedFonts;
        public boolean isTransparent() {

                Text previewText = new Text(settingsGroup, SWT.BORDER | SWT.READ_ONLY | SWT.MULTI);
        };
        return new Command() {
                PartSettingsDialog settingsDialog = new PartSettingsDialog(

            }
 * See the License for the specific language governing permissions and
            return transparentCheckbox != null && transparentCheckbox.getSelection();
        @NotNull
        private Color background;
                    }
                2,
        protected void okPressed() {
        this.setToolTipText(ERDUIMessages.erd_settings_action_customize_tip);
            Composite dialogArea = super.createDialogArea(parent);
            super.okPressed();
import org.eclipse.swt.widgets.*;
            newSettings.fontInfo = getFontData();
        public int getBorderWidth() {
                        ViewSettings viewSettings = oldSettings.get(colorizedPart);
}
            private final Map<ICustomizablePart, ViewSettings> oldSettings = new HashMap<>();
                UIUtils.createControlLabel(settingsGroup, ERDUIMessages.erd_settings_font_label);
        public Color getForegroundColorPicker() {
                    nodePart,
            newSettings = new ViewSettings();
        private final NodePart node;
                    hasNotes,
 *
        private Color foreground;
            return dialogArea;
            return backgroundColorPicker == null ? null : UIUtils.getSharedTextColors().getColor(backgroundColorPicker.getColorValue());
                return true;
                        this.oldSettings.put(part, oldSettings);
                dialogArea,
                        if (viewSettings != null) {
            newSettings.transparency = isTransparent();
                        } else if (item instanceof EntityPart) {
                boolean hasEntities = false;
    private static class PartSettingsDialog extends BaseDialog {
                    @Override
import org.eclipse.swt.events.SelectionEvent;
        @Override
                    }
        super.init();
            @Override

            newSettings.background = getBackgroundColor();
                transparentCheckbox = UIUtils.createCheckbox(settingsGroup, ERDUIMessages.erd_settings_checkbox_transparent_label,
                            nodePart = (NodePart) item;
                if (node != null) {
                        oldSettings.background = part.getCustomBackgroundColor();
            backgroundColorPicker = new ColorSelector(settingsGroup);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                            hasNotes = true;
            if (noteStyles) {
                    previewText.setFont(node.getCustomFont());
        private final boolean entityStyles;
                for (Object item : objects) {
 *     http://www.apache.org/licenses/LICENSE-2.0
                );

                        setNodeSettings((ICustomizablePart) item, newSettings);

                }
            }
                        if (result != null) {
            }
    }
                });
                if (node != null) {
                    nodePart.getEditor().getSite().getShell()    ,
                if (part instanceof NotePart) {
    }
import org.eclipse.jface.viewers.IStructuredSelection;



                    hasEntities

            }

        }
                newSettings = settingsDialog.newSettings;
        private ColorSelector foregroundColorPicker;
                        oldSettings.foreground = part.getCustomForegroundColor();
        private Text borderWidthText;
 * Unless required by applicable law or agreed to in writing, software
                GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
        private ColorSelector backgroundColorPicker;
                NodePart nodePart = null;
                borderWidthText.setLayoutData(gd);

                    part.setCustomFont(UIUtils.getSharedFonts().getFont(
    private static class ViewSettings {
import org.eclipse.swt.SWT;
    }
import org.eclipse.swt.graphics.Color;
                            fontData = SharedFonts.toString(result);

                        FontDialog fontDialog = new FontDialog(getShell(), SWT.NONE);
        }
import java.util.Locale;
                previewText.setLayoutData(gd);
                        setNodeSettings(part, newSettings);
                backgroundColorPicker.setColorValue(node.getCustomBackgroundColor().getRGB());
