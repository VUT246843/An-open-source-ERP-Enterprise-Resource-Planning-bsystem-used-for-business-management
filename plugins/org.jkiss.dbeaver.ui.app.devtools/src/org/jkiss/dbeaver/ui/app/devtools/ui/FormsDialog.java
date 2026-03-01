            .row("button", rb -> rb.button("text", UIRowBuilder.identityConsumer()))
            .row("Combo that wraps an enum (custom converter)", rb -> rb
        return pb -> pb


                    "Toggle second",
 *
            .row("textField", rb -> rb.textField(UIObservable.of("text")))

 * Copyright (C) 2010-2026 DBeaver Corp and others
        // @formatter:on
            .row(rb -> rb
            OPTION_A,
        // @formatter:off

            .row("label", rb -> rb.label("text"))
import org.eclipse.swt.widgets.Shell;
        return pb -> pb
    @NotNull
        // @formatter:on
        var integer = UIObservable.of(1_000_000);
                .comboBox(List.of("Default"), UIObservable.of("Default")))

    @NotNull
        CTabItem item = new CTabItem(folder, SWT.NONE);
            OPTION_B,
    @Override
    @NotNull
    @NotNull
                .visible(enabled5)
                .checkBox("Enable second check", bb -> bb.enabled(enabled1).selected(enabled2))
/*
 *
                    bb -> bb.enabled(enabled)));
                .checkBox("Enable textField", bb -> bb.selected(enabled4))

 * you may not use this file except in compliance with the License.
    }
            .row(rb -> rb
                            .checkBox("Select on hover", UIRowBuilder.identityConsumer()))
        Composite composite = (Composite) super.createDialogArea(parent);
    }
import org.jkiss.dbeaver.ui.UIUtils;


                    .fromModel(String::toLowerCase)
 *     http://www.apache.org/licenses/LICENSE-2.0

import org.eclipse.swt.custom.CTabItem;
            .row(rb -> rb.group("Text", buildTextPanel()))

            .row("Combo using a list of values", rb -> rb
            .row(rb -> rb
            .row("Modify:", rb -> rb.comboBox(List.of("Show confirmation"), UIObservable.of("Show confirmation")))
                    .row(rb1 -> rb1.label("A group label"))))
            .row("Schema:", rb -> rb.comboBox(List.of("Show confirmation"), UIObservable.of("Show confirmation")));
                .button(
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return pb -> pb
        @NotNull CTabFolder folder,
    protected boolean isResizable() {
        var workbenchSaveInterval = UIObservable.of(5);
import org.eclipse.swt.layout.FillLayout;
            .row(rb -> rb.checkBox("Include source in query comment", UIRowBuilder.identityConsumer()))
                    e -> UIUtils.showMessageBox(UIUtils.getActiveShell(), "Hello", "Hello from forms", SWT.ICON_INFORMATION),
                .comboBox(valueEnum, Enum::toString))
                .label("Workbench save interval (in minutes):")

                .group("Open mode", pb1 -> pb1
                .row("As lowercase", rb -> rb.textField(text, tb -> tb

        // @formatter:off
            .row("Requires an integer", rb -> rb
    @NotNull
                        .row(rb1 -> rb1

    private static Consumer<UIPanelBuilder> buildAiConfigurationPanel() {
            .row("passwordField", rb -> rb.passwordField(UIObservable.of("text")))
    }
        return pb -> pb
            .indent(pb1 -> pb1
            .row(rb -> rb
            .row(rb -> rb.group("General", general))
public class FormsDialog extends TrayDialog {
    }
        }
        // @formatter:off
                .textField(nonBlank, tb -> tb
        // @formatter:on
    }
            .row(rb -> rb.group("Completion", completion))
                        .selected(checked)))

            .row(rb -> rb.group("Combo", buildComboPanel()))
    @NotNull
        var enabled1 = UIObservable.of(true);
                .indent(pb2 -> pb2
    protected Control createDialogArea(@NotNull Composite parent) {
    @NotNull
            .row("Combo that wraps an enum", rb -> rb
            .row(rb -> rb
        var enabled2 = UIObservable.of(true);
                            .enabled(checked)
            .row(rb -> rb.group("Buttons", buildButtonPanel()));
            .row(rb -> rb.checkBox("Enable AI query suggestion", UIRowBuilder.identityConsumer()));
        // @formatter:off

        return pb -> pb
            .row(rb -> rb
        // @formatter:off
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
    @NotNull
            .row(rb -> rb.group("Execution", execution))
        return pb -> pb
 * You may obtain a copy of the License at
    ) {
    private static Consumer<UIPanelBuilder> buildControlsPanel() {
    @NotNull
        return pb -> pb
                .button(
                    .enabled(UIObservable.of(false))))
        super(shell);
    private static void createFolderTab(

import java.util.function.Function;
 *
            .row(rb -> rb.checkBox("Execute SQL immediately", UIRowBuilder.identityConsumer()))
                    .fromModel(String::toUpperCase)

 * distributed under the License is distributed on an "AS IS" BASIS,
            .row(rb -> rb.checkBox("Keep next/previous editor, view and perspectives dialog open", UIRowBuilder.identityConsumer()))
            .row("radioButton", rb -> rb.radioButton("text", UIRowBuilder.identityConsumer()))
            .row("comboBox", rb -> rb.comboBox(List.of(42), UIObservable.of(42), String::valueOf));
        var text = UIObservable.of("value");
    private static Consumer<UIPanelBuilder> buildTextPanel() {
                    e -> enabled.set(!enabled.get()))
                .comboBox(List.of("value", "other value", "THIRD VALUE"), valueString));
                    .row("Indented row", rb -> rb.label("A doubly indented label"))))
        Consumer<UIPanelBuilder> completion = pb -> pb
 * DBeaver - Universal Database Manager
        item.setControl(UIPanelBuilder.build(folder, handler));
import org.eclipse.swt.widgets.Control;
                    .row(rb1 -> rb1.radioButton("Double click", UIRowBuilder.identityConsumer()))
                .checkBox("Enable super additional options", bb -> bb.selected(enabled5)))
                .textField(UIObservable.of("textField2")));
        return composite;
        // @formatter:off
                    .align(UIAlignX.FILL)
            .row(rb -> rb

            .row(rb -> rb.checkBox("Send unique and primary keys information", UIRowBuilder.identityConsumer()));
    }
        CTabFolder folder = new CTabFolder(composite, SWT.TOP | SWT.FLAT);
        return true;
                    .indent(pb2 -> pb2
        createFolderTab(folder, "Pref - General", buildGeneralPanel());
                .enabled(enabled3)
        var enabled4 = UIObservable.of(false);
                    "Show message",
            .indent(pb1 -> pb1
                    .row(rb1 -> rb1.label("Note: This preference may not take effect on all views"))));
    }
import java.util.Locale;
    private static Consumer<UIPanelBuilder> buildComboPanel() {

        createFolderTab(folder, "Showcase", buildShowcasePanel());
                .intTextField(maximumElementsShown, tb -> tb.align(UIAlignX.FILL)))

                    .enabled(UIObservable.of(false)))));
        enum Test1 {
 * limitations under the License.
        var maximumElementsShown = UIObservable.of(1000);
                .comboBox(valueEnum, value -> value.name().toLowerCase(Locale.ROOT)))
        var checked = UIObservable.of(false);
        Consumer<UIPanelBuilder> general = pb -> pb

import org.eclipse.swt.widgets.Composite;
        folder.setSelection(0);
    private static Consumer<UIPanelBuilder> buildGeneralPanel() {
        return pb -> pb
                .textField(UIObservable.of(""), tb -> tb.enabled(enabled4))
    }
        Consumer<UIPanelBuilder> structure = pb -> pb
                .checkBox("Enable additional options", bb -> bb.selected(enabled3)))
        var enabled3 = UIObservable.of(false);
            .row(rb -> rb.group("Send database structure", structure));
        Consumer<UIPanelBuilder> execution = pb -> pb
                    .row(rb1 -> rb1.label("An expandable group label"))));

                            .checkBox("Open when using arrow keys", UIRowBuilder.identityConsumer())))
    private static Consumer<UIPanelBuilder> buildShowcasePanel() {
import java.util.List;
    }
        createFolderTab(folder, "Pref - AI", buildAiConfigurationPanel());
    public FormsDialog(@NotNull Shell shell) {
                            .enabled(checked)
        var enabled5 = UIObservable.of(false);
            .row(rb -> rb.checkBox("Send column data type information", UIRowBuilder.identityConsumer()))
        @NotNull String text,
    }
        var valueEnum = UIObservable.of(Test1.OPTION_B);
    }
        createFolderTab(folder, "Controls", buildControlsPanel());
            OPTION_C
            .row("Language", rb -> rb.comboBox(List.of("English"), UIObservable.of("English")));
            .row(rb -> rb.group("Check", buildCheckPanel()))
                    .toModel(UIValidators.requireNotBlank(), Function.identity())))
        // @formatter:on
            .row("Regular row", rb -> rb.label("A label"))
                .row("As uppercase", rb -> rb.textField(text, tb -> tb
                        .row(rb1 -> rb1
}
import org.jkiss.dbeaver.ui.forms.*;
            .row("Value", rb -> rb.textField(text))
            .row("intTextField", rb -> rb.intTextField(UIObservable.of(42)))
    }

                .row("Indented row", rb -> rb.label("An indented label"))
            .row(rb -> rb.checkBox("Always run in background", UIRowBuilder.identityConsumer()))
                .label("Initial maximum number of elements shown in views:")
    private static Consumer<UIPanelBuilder> buildButtonPanel() {
                .intTextField(integer))
            .row(rb -> rb
        item.setText(text);
                .textField(UIObservable.of("textField1"))
            .row(rb -> rb

                .label("Table join rule:")
import org.eclipse.swt.SWT;
                .expandableGroup("An expandable group", true, pb1 -> pb1
 * Unless required by applicable law or agreed to in writing, software
        var enabled = UIObservable.of(false);
            .row(rb -> rb.checkBox("Format SQL query", UIRowBuilder.identityConsumer()))
    }
        var nonBlank = UIObservable.of("An ugly little beast");
            .row("Requires not blank", rb -> rb

            .row("Select:", rb -> rb.comboBox(List.of("Execute immediately"), UIObservable.of("Execute immediately")))
import org.jkiss.code.NotNull;
import org.eclipse.jface.dialogs.TrayDialog;
 * See the License for the specific language governing permissions and
            .row(rb -> rb.checkBox("Send foreign keys information", UIRowBuilder.identityConsumer()))
        // @formatter:on
                    .row(rb1 -> rb1.radioButton("Single click", bb -> bb
            .row(rb -> rb.checkBox("Rename resource inline if available", UIRowBuilder.identityConsumer()))
        var valueString = UIObservable.of("value");
        return pb -> pb
            .row(rb -> rb.checkBox("Send object description", UIRowBuilder.identityConsumer()))
            .row(rb -> rb
    private static Consumer<UIPanelBuilder> buildCheckPanel() {
import java.util.function.Consumer;
        @NotNull Consumer<UIPanelBuilder> handler
            .row(rb -> rb
                .checkBox("Enable first check", bb -> bb.enabled(enabled2).selected(enabled1)))
                .intTextField(workbenchSaveInterval, tb -> tb.align(UIAlignX.FILL)))

        // @formatter:on
    @Override
                .group("A named group", pb1 -> pb1
package org.jkiss.dbeaver.ui.app.devtools.ui;
            .row(rb -> rb.group("Panel", buildPanelPanel()))
    private static Consumer<UIPanelBuilder> buildPanelPanel() {
    @NotNull
import org.eclipse.swt.custom.CTabFolder;

            .row("checkBox", rb -> rb.checkBox("text", UIRowBuilder.identityConsumer()))
            .row(rb -> rb.checkBox("Show heap status", UIRowBuilder.identityConsumer()))
        composite.setLayout(new FillLayout());
