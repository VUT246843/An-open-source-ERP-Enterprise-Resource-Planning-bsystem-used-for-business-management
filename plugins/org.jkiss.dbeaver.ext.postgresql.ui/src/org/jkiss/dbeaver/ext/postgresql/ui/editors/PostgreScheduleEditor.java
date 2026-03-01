            @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            ));
                        return minutes[value];


import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistActionComment;
                        return weekDays[value.ordinal()];
            final StringJoiner changes = new StringJoiner(",\n\t");
                    @Override
            }
    private static String nth(@NotNull String name, int number) {
        {
                        return value.getDisplayName(TextStyle.SHORT, Locale.getDefault());
                    @Override
            if (!Arrays.equals(monthDays, schedule.getMonthDays())) {
                if (index < input.length) {
            }
                    @Override
import org.eclipse.swt.events.SelectionEvent;
                    button.setText(decorator.getText(value));

                    @Override
        final Button[] buttons = new Button[input.length];

                        return value.toString();
                button.setEnabled(decorator.getEnabled(data));
        private String toCompactArray(@NotNull boolean[] values) {


                            return true;
import java.time.format.TextStyle;
                        return monthDays[value - 1];

        if (force || !loaded || (source instanceof DBNEvent && ((DBNEvent) source).getSource() == DBNEvent.UPDATE_ON_SAVE)) {
                    }
            }
            }
    @NotNull
        return name + "th";

            }
                    }
        @Override
                        monthDays[value - 1] = checked;
        @NotNull
import org.jkiss.dbeaver.model.edit.DBEPersistAction;
            final IWorkbenchSite site = getSite();
 * Licensed under the Apache License, Version 2.0 (the "License");
            category.setLayoutData(new GridData(SWT.BEGINNING, SWT.BEGINNING, false, false));
                    button.addSelectionListener(listener);
                DatabaseEditorUtils.contributeStandardEditorActions(site, manager);
                    public void setChecked(@NotNull Integer value, boolean checked) {
            for (int j = 0; j < cols; j++) {



                    }

                Month.values(),
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;

                    button.setData(value);

import org.eclipse.swt.widgets.Composite;
                new SQLDatabasePersistAction(
            pageControl.activate(true);
    private PageControl pageControl;
                UIUtils.createTitledComposite(category, "Minutes", 6, GridData.FILL_HORIZONTAL),
    private final boolean[] monthDays = new boolean[32];
                        return value.plus(calendar.getFirstDayOfWeek() - Calendar.MONDAY).getDisplayName(TextStyle.SHORT, Locale.getDefault());
            ));
        });

            }
            switch (number % 10) {
        System.arraycopy(schedule.getMinutes(), 0, minutes, 0, minutes.length);
        }

import java.util.*;

import org.jkiss.dbeaver.ext.postgresql.model.PostgreJobSchedule;

            final StringJoiner joiner = new StringJoiner(",", "'{", "}'");
import org.eclipse.swt.layout.GridLayout;
                    final T value = input[index];

            listeners.add(createCheckboxPanel(
                } else {
            category.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, false, false));
                    public void setChecked(@NotNull Integer value, boolean checked) {
        @NotNull
                    break;
    private final boolean[] months = new boolean[12];
                    }
                }
            return (DBECommand<?>) userParams.get(name);
    public void setFocus() {
                DayOfWeek.values(),
import org.jkiss.dbeaver.ui.editors.AbstractDatabaseObjectEditor;
                        }
                    "Update schedule",
                case 1:
 * Copyright (C) 2010-2026 DBeaver Corp and others
import org.eclipse.jface.action.Separator;
    }
                    @Override

        };
        public UpdateCommand(@NotNull PostgreJobSchedule object) {
            ));
                    @NotNull

        System.arraycopy(schedule.getMonths(), 0, months, 0, months.length);
    }
import org.jkiss.dbeaver.model.edit.DBECommand;
        public PageControl(@NotNull Composite parent) {
                final T data = (T) button.getData();
import org.eclipse.jface.action.IContributionManager;
            ));
            return RefreshResult.REFRESHED;
        System.arraycopy(schedule.getWeekDays(), 0, weekDays, 0, weekDays.length);
                    @NotNull
            }
            };

                    @Override
 * See the License for the specific language governing permissions and
                ),
    @Override
                        addScheduleChange();
    }

                    public void setChecked(@NotNull Integer value, boolean checked) {
                    }
                    }
                    @Override
        return RefreshResult.IGNORED;
 * You may obtain a copy of the License at
                    return name + "nd";

                final T data = (T) button.getData();
                        for (int i = 0; i < months.length; i++) {
import org.eclipse.swt.events.SelectionListener;
    }

                        addScheduleChange();
                }
                        if (value > 31) {
        }
 * you may not use this file except in compliance with the License.
                IntStream.range(0, 60).boxed().toArray(Integer[]::new),

    private void refreshSchedulePresentation() {
}

        return () -> {
            ));
public class PostgreScheduleEditor extends AbstractDatabaseObjectEditor<PostgreJobSchedule> {

        }
    }
                        return value.toString();
                )
                    UIUtils.createPlaceholder(parent, 1);
            }
    }

                    }
        {
                    public boolean getChecked(@NotNull Integer value) {
import org.eclipse.swt.events.SelectionAdapter;
        void setChecked(@NotNull T t, boolean checked);
    private final boolean[] hours = new boolean[24];
                UIUtils.createTitledComposite(category, "Months", 4, GridData.FILL_HORIZONTAL),
                        refreshSchedulePresentation();
        String getText(@NotNull T t);

        @Override
                new SQLDatabasePersistActionComment(
            listeners.add(createCheckboxPanel(
            super(object, "Update schedule");
            final Composite category = new Composite(composite, SWT.NONE);
        composite.setLayout(new GridLayout(2, false));
import org.eclipse.ui.IWorkbenchSite;
                        minutes[value] = checked;
    }
    @SuppressWarnings("unchecked")
            for (boolean value : values) {
                    buttons[index] = button;
        System.arraycopy(schedule.getMonthDays(), 0, monthDays, 0, monthDays.length);
                manager.add(new Separator());
            }
                    public boolean getChecked(@NotNull Integer value) {


        }
                        refreshSchedulePresentation();
import org.jkiss.dbeaver.model.navigator.DBNEvent;


                    public String getText(@NotNull DayOfWeek value) {
    public void activatePart() {
                final int index = i + j * rows;
                joiner.add(value ? "t" : "f");

                        return months[value.ordinal()];
            if (userParams.putIfAbsent(name, this) == null) {
            return;

            super.fillCustomActions(manager);
                    schedule.getDataSource(),
            return joiner.toString();
                case 2:
    @NotNull
                    return name + "st";

                                return false;
                    }
                    }
                }
            final PostgreJobSchedule schedule = getObject();

        }
                    public boolean getChecked(@NotNull DayOfWeek value) {
                        months[value.ordinal()] = checked;

                    @NotNull
                        hours[value] = checked;

                button.setText(decorator.getText(data));
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
        public void fillCustomActions(@NotNull IContributionManager manager) {
    private boolean loaded;
                        addScheduleChange();
                                return false;
            listeners.add(createCheckboxPanel(

                }
                    public void setChecked(@NotNull Month value, boolean checked) {
            }
                        return hours[value];
        @Override
import org.eclipse.swt.SWT;
/*
    }
            public void undoCommand(@NotNull DBECommand<PostgreJobSchedule> command) {
            super(parent, SWT.SHEET);
            activatePart();
                    }
                IntStream.range(0, 24).boxed().toArray(Integer[]::new),
                    }
            listeners.add(createCheckboxPanel(

                    public String getText(@NotNull Month value) {
        public DBEPersistAction[] getPersistActions(@NotNull DBRProgressMonitor monitor, @NotNull DBCExecutionContext executionContext, @NotNull Map<String, Object> options) {
            if (site != null) {
                    @Override
import org.eclipse.swt.layout.GridData;
                }
    public RefreshResult refreshPart(Object source, boolean force) {
            if (changes.length() == 0) {
                new Decorator<>() {
        }
                }
                            }
                new Decorator<>() {

            }
import org.jkiss.dbeaver.ui.editors.DatabaseEditorUtils;
        if (loaded) {
                        }
        }
                    @NotNull
                changes.add("jscminutes=" + toCompactArray(minutes));
                    public boolean getEnabled(@NotNull Month month) {
                changes.add("jscmonthdays=" + toCompactArray(monthDays));
        @NotNull
            @Override
                return this;
import java.time.DayOfWeek;

        refreshSchedulePresentation();
                UIUtils.createTitledComposite(category, "Month Days", 4, GridData.FILL_HORIZONTAL),
        boolean getChecked(@NotNull T t);
 *
                new Decorator<>() {
                    return name + "rd";
                changes.add("jschours=" + toCompactArray(hours));
                        addScheduleChange();

                // not implemented
    @Override
                UIUtils.createTitledComposite(category, "Week Days", 4, GridData.FILL_HORIZONTAL),

import org.jkiss.code.NotNull;
                    public String getText(@NotNull Integer value) {
    }
        public DBECommand<?> merge(@NotNull DBECommand<?> prevCommand, @NotNull Map<Object, Object> userParams) {
            category.setLayout(new GridLayout(1, false));
        default boolean getEnabled(@NotNull T t) {
                    @Override
                    @Override
                changes.add("jscweekdays=" + toCompactArray(weekDays));
            listeners.add(createCheckboxPanel(
        }
                default:

        }
            return true;
            for (Button button : buttons) {
                        weekDays[value.ordinal()] = checked;
                button.setSelection(decorator.getChecked(data));
 *
package org.jkiss.dbeaver.ext.postgresql.ui.editors;
                    public boolean getChecked(@NotNull Integer value) {

                            }

                    }
            if (!Arrays.equals(hours, schedule.getHours())) {
import org.jkiss.dbeaver.ui.UIUtils;
                    final Button button = new Button(parent, SWT.CHECK);
            @Override
                    public String getText(@NotNull Integer value) {
        for (int i = 0; i < rows; i++) {
    private static <T> Runnable createCheckboxPanel(@NotNull Composite parent, @NotNull T[] input, @NotNull Decorator<T> decorator) {
        final SelectionListener listener = new SelectionAdapter() {
            public void redoCommand(@NotNull DBECommand<PostgreJobSchedule> command) {
    @Override
 * limitations under the License.
        if (pageControl != null) {
    private final boolean[] weekDays = new boolean[7];
        @NotNull
            category.setLayout(new GridLayout(1, false));
            if (!Arrays.equals(weekDays, schedule.getWeekDays())) {
                        return true;
                    }
                new Decorator<>() {
    private class UpdateCommand extends DBECommandAbstract<PostgreJobSchedule> {
                    @Override
 * DBeaver - Universal Database Manager
        }
            }
        };
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
            loaded = false;
                final Button button = (Button) e.widget;
        final Composite composite = new Composite(pageControl, SWT.NONE);

                decorator.setChecked(data, button.getSelection());
                UIUtils.createTitledComposite(category, "Hours", 6, GridData.FILL_HORIZONTAL),
            public void widgetSelected(SelectionEvent e) {
        addChangeCommand(new UpdateCommand(getDatabaseObject()), new DBECommandReflector<>() {
                    }


        final PostgreJobSchedule schedule = getDatabaseObject();
    private final List<Runnable> listeners = new ArrayList<>();

 *
 */
                        addScheduleChange();
        }
                        return true;
                    @Override

                            if (months[i] && Month.of(i + 1).minLength() < value) {


        final int rows = (int) Math.ceil(input.length / (float) cols);
                        for (int i = month.minLength(); i < 31; i++) {
        loaded = true;
    private final boolean[] minutes = new boolean[60];
    @Override
            }

 * distributed under the License is distributed on an "AS IS" BASIS,
        }
                return new DBEPersistAction[0];
        }
    private class PageControl extends ProgressPageControl {
 * Unless required by applicable law or agreed to in writing, software
                // not implemented

            final String name = "schedule#" + getObject().getObjectId();

                IntStream.range(1, 33).boxed().toArray(Integer[]::new),
                    @Override
                    @Override

import java.time.Month;

                        return value == 32 ? "<Last>" : nth(value.toString(), value);
                    public void setChecked(@NotNull DayOfWeek value, boolean checked) {
        if (number <= 3 || number >= 21) {
                changes.add("jscmonths=" + toCompactArray(months));
            }
            final Composite category = new Composite(composite, SWT.NONE);
 *     http://www.apache.org/licenses/LICENSE-2.0
                    @Override
                    }
            }
            return new DBEPersistAction[]{


                    "Update schedule '" + schedule.getName() + "'"
    private interface Decorator<T> {
import org.jkiss.dbeaver.model.impl.edit.SQLDatabasePersistAction;
                    }
        System.arraycopy(schedule.getHours(), 0, hours, 0, hours.length);
                new Decorator<>() {
                    public boolean getEnabled(@NotNull Integer value) {
        listeners.forEach(Runnable::run);
        this.pageControl = new PageControl(parent);
import org.eclipse.swt.widgets.Button;
                    }
                            if (monthDays[i]) {
    private void addScheduleChange() {
        }

            final Calendar calendar = Calendar.getInstance();
import java.util.stream.IntStream;

                    @Override
                    public String getText(@NotNull Integer value) {
    }
                    @Override
            if (!Arrays.equals(months, schedule.getMonths())) {
    }
import org.jkiss.dbeaver.model.impl.edit.DBECommandAbstract;
            if (!Arrays.equals(minutes, schedule.getMinutes())) {
                    "UPDATE pgagent.pga_schedule\nSET\n\t" + changes + "\nWHERE jscid=" + schedule.getObjectId()
import org.jkiss.dbeaver.model.edit.DBECommandReflector;
                case 3:
                        }
        final int cols = ((GridLayout) parent.getLayout()).numColumns;
                    public boolean getChecked(@NotNull Month value) {
    public void createPartControl(Composite parent) {
                    @NotNull
        pageControl.createOrSubstituteProgressPanel(getSite());
