    @Override
        final Listener listener = event -> {

        }
        final Display display = Display.getCurrent();

            return false;
        frameTime = System.currentTimeMillis() / 1000.0;

 *
 * distributed under the License is distributed on an "AS IS" BASIS,
 *     http://www.apache.org/licenses/LICENSE-2.0
/**
    private static boolean isEnabled0() {
            return;
        if (size.x <= 0 || size.y <= 0) {
        return ENABLED;
import java.awt.*;

 * @see #install(Control)
            switch (event.type) {
        control.addListener(SWT.Resize, listener);
 */
            }
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.runtime.DBWorkbench;
        painter.dispose();
                }
    public static boolean install(@NotNull Control control) {
 *
    public static final String PREF_UI_SHOW_HOLIDAY_DECORATIONS = "ui.show.holiday.decorations"; //$NON-NLS-1$
        double deltaTime = currentTime - frameTime;
    }
 * See the License for the specific language governing permissions and
            public void run() {
    }
                case SWT.Resize -> reset(((Control) event.widget).getSize());
                    // Throttle a bit

 * Copyright (C) 2010-2024 DBeaver Corp and others

    private void reset(@NotNull Point size) {
                decorations.update(control.getSize());
    }
        painter.reset(size.x, size.y);
        }

                if (control.isVisible()) {


        };
        painter.update(size.x, size.y, deltaTime);
                        }
        final GraphicsDevice device = environment.getDefaultScreenDevice();
import org.eclipse.ui.services.IDisposable;

}
        UIUtils.enableDoubleBuffering(control);


/*
                if (control.isDisposed()) {
            @Override
    }
 * DBeaver - Universal Database Manager
 *
    private void paint(@NotNull GC gc) {
        final HolidayDecorations decorations = new HolidayDecorations(control);

        LocalDate current = LocalDate.now();
                    display.asyncExec(() -> {
 */
    public void dispose() {
 * <p>
            return;
    private HolidayDecorations(@NotNull Control control) {
 * you may not use this file except in compliance with the License.
        control.addListener(SWT.Paint, listener);

        };
        // Is there any better way to obtain display's refresh rate?

    }
        if (!DBWorkbench.getPlatform().getPreferenceStore().getBoolean(PREF_UI_SHOW_HOLIDAY_DECORATIONS)) {

            case JANUARY -> current.getDayOfMonth() <= 7;
import java.time.LocalDate;
        // Dec 24 <= Cur <= Jan 7
import org.eclipse.swt.SWT;
 * Unless required by applicable law or agreed to in writing, software
        return true;

import org.jkiss.code.NotNull;
            }

                }
                        if (!control.isDisposed()) {
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
                            control.redraw();

    private static final boolean ENABLED = isEnabled0();
            default -> false;

        return switch (current.getMonth()) {
        }
    }
        control.addListener(SWT.Dispose, listener);
import org.eclipse.swt.widgets.Listener;
            case DECEMBER -> current.getDayOfMonth() >= 24;

                    display.timerExec(refreshRate * 10, this);
                    display.timerExec(refreshRate, this);
    private double frameTime;
    }
    }
                case SWT.Dispose -> dispose();
        painter.paint(gc);
 * You may obtain a copy of the License at
        display.timerExec(refreshRate, timer);
        final Runnable timer = new Runnable() {
    public static boolean isEnabled() {
 *
 * This class is responsible for drawing various random decorations over a control.
public class HolidayDecorations implements IDisposable {
 * Currently, it only provides winter decorations, such as snowflakes.
    private void update(@NotNull Point size) {
package org.jkiss.dbeaver.ui.controls.decorations;
        double currentTime = System.currentTimeMillis() / 1000.0;

                } else {
 * @see #isEnabled()

        final int refreshRate = 1000 / Math.max(device.getDisplayMode().getRefreshRate(), 60);
        if (size.x <= 0 || size.y <= 0) {
        };

        this.painter = new SnowflakePainter(control.getDisplay());

            return false;
                    });
import org.eclipse.swt.graphics.Point;

    private final Painter painter;
 * limitations under the License.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        frameTime = currentTime;
        if (!isEnabled()) {
                case SWT.Paint -> paint(event.gc);
        }
                    return;
 * Licensed under the Apache License, Version 2.0 (the "License");
        final GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
import org.eclipse.swt.graphics.GC;
