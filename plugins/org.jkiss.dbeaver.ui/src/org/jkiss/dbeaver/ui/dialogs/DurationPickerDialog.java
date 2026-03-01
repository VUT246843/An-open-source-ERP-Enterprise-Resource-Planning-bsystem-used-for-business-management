        this.title = title;
import org.eclipse.jface.widgets.SpinnerFactory;
        UIUtils.createControlLabel(composite, "Minutes");
                updateCompletion();
 */
        if (title != null) {
                setter.accept(((Spinner) e.widget).getSelection());
 * limitations under the License.
            seconds = duration.toSecondsPart();
        Composite composite = (Composite) super.createDialogArea(parent);
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Unless required by applicable law or agreed to in writing, software
    }
    @Override
        return Duration.ofHours(hours).plusMinutes(minutes).plusSeconds(seconds);

 * You may obtain a copy of the License at
}
        getButton(IDialogConstants.OK_ID).setEnabled(getDuration().isPositive());
 *     http://www.apache.org/licenses/LICENSE-2.0
        createSpinner(composite, 23, () -> hours, value -> hours = value);
 * DBeaver - Universal Database Manager

        layout.numColumns = 3;
/**
            .setSelection(getter.getAsInt());
public final class DurationPickerDialog extends Dialog {

 * distributed under the License is distributed on an "AS IS" BASIS,
            .layoutData(GridDataFactory.fillDefaults().grab(true, false).create())
        createSpinner(composite, 59, () -> seconds, value -> seconds = value);
            minutes = duration.toMinutesPart();
        createSpinner(composite, 59, () -> minutes, value -> minutes = value);

import org.jkiss.dbeaver.ui.UIUtils;
 * A simple duration picker that allows to individually specify hours, minutes, and seconds.
import org.jkiss.code.NotNull;

            hours = Math.toIntExact(duration.toHours());

    }
    private void updateCompletion() {
    private void createSpinner(@NotNull Composite parent, int maximum, @NotNull IntSupplier getter, @NotNull IntConsumer setter) {
import org.jkiss.code.Nullable;
        UIUtils.asyncExec(this::updateCompletion);

            .onSelect(e -> {

    }
import org.eclipse.swt.widgets.Composite;
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Spinner;
    private int minutes;

    @NotNull
import org.eclipse.swt.widgets.Control;
import org.eclipse.jface.dialogs.IDialogConstants;
            newShell.setText(title);
import java.util.function.IntConsumer;

package org.jkiss.dbeaver.ui.dialogs;
    public Duration getDuration() {

    protected void configureShell(Shell newShell) {
 *
            })
        super(parentShell);
        SpinnerFactory.newSpinner(SWT.BORDER)
import org.eclipse.jface.layout.GridDataFactory;
        UIUtils.createControlLabel(composite, "Seconds");
 * Licensed under the Apache License, Version 2.0 (the "License");
    private int seconds;
            .create(parent)

import org.eclipse.swt.layout.GridLayout;
/*
    }
        UIUtils.createControlLabel(composite, "Hours");

        super.configureShell(newShell);

        return composite;
 * See the License for the specific language governing permissions and
    private final String title;
        layout.makeColumnsEqualWidth = true;
        GridLayout layout = (GridLayout) composite.getLayout();
 */
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
    private int hours;
import java.util.function.IntSupplier;
    protected Control createDialogArea(Composite parent) {
    }
        if (duration != null) {
    public DurationPickerDialog(@NotNull Shell parentShell, @Nullable String title, @Nullable Duration duration) {
import org.eclipse.swt.widgets.Shell;
    @Override
            .bounds(0, maximum)
 *
        }
    }
import java.time.Duration;
 *

import org.eclipse.jface.dialogs.Dialog;
