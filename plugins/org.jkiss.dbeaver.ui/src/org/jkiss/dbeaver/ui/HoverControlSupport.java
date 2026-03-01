                hovering = nowHovering;
     * @param target target control
     * <p>
        Point location = target.getShell().toControl(origin.toDisplay(new Point(0, 0)));
        holder.setLayout(RowLayoutFactory.fillDefaults().margins(1, 1).spacing(5).wrap(false).create());
        Composite holder = new Composite(parent, SWT.NONE);
        createControl(holder, target);
 *
        // Are we hovering the target or overlay; e.g., it's not obstructed by anything?
            boolean nowHovering = isHoveringTarget(event);
import org.eclipse.swt.graphics.Point;
        new HoverControlSupport<>(target) {
        return target;

        Point location = pickOverlayLocation(target, size);

 * Licensed under the Apache License, Version 2.0 (the "License");
 *

public abstract class HoverControlSupport<T extends Control> {
package org.jkiss.dbeaver.ui;
        target.addDisposeListener(e -> {
     * @param target target control
    }

     * @param target target control
     * The default implementation does nothing.
    @NotNull
        holder.moveAbove(null);
     * Picks a target control, let it be a child of, or the {@code target} itself, to later
/**
        var targetLocation = target.toDisplay(0, 0);
     * This method is called every time the overlay is shown, so it shouldn't do
     */
/*
     * @param target  target control to show the overlay over when hovered
            if (nowHovering != hovering) {
import org.eclipse.swt.widgets.*;
        Listener filter = event -> {


 */
 *
     * @param target target control

    /**
     * Creates controls that will be shown in the overlay.
    private boolean isHoveringTarget(@NotNull Event event) {
    protected Point pickOverlayLocation(@NotNull T target, @NotNull Point size) {
     * <p>
        return UIUtils.isParent(target, control) || UIUtils.isParent(overlay, control);
        Composite holder = createOverlayControl(target.getShell(), target);
        }
    }

        var eventLocation = control.toDisplay(event.x, event.y);
        };
 * a control that are shown when hovering over it.

     * Creates a control that represents the overlay.
        };
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        return location;
     * A convenient helper that implements {@link #createControl(Composite, Control)}.
        overlay = holder;
import org.eclipse.jface.layout.RowLayoutFactory;
    public HoverControlSupport(@NotNull T target) {

        var targetSize = target.getSize();
     * @return location where to show the overlay
            }
    protected Control pickOverlayControl(@NotNull T target) {
     * <p>
            return false;
 * You may obtain a copy of the License at
    protected void dispose() {
     * @param parent parent composite
    @NotNull
        }
    /**
        if (!(event.widget instanceof Control control) || control.isDisposed()) {
import org.eclipse.swt.graphics.Rectangle;
        Rectangle bounds = origin.getBounds();
    private Control overlay;
 * limitations under the License.
        location.y += bounds.height - size.y - 5;
        return holder;

        });
    public static <T extends Control> void install(@NotNull T target, @NotNull BiConsumer<Composite, T> creator) {
 * DBeaver - Universal Database Manager
    protected abstract void createControl(@NotNull Composite parent, @NotNull T target);
     * Disposes of controls created in {@link #createControl(Composite, Control)}.


            overlay.dispose();
    @NotNull
     * compute a location of the overlay relative to using {@link #pickOverlayLocation(Control, Point)}.

        this.target = target;
        Point size = holder.computeSize(SWT.DEFAULT, SWT.DEFAULT);
        holder.setSize(size);
            }
     * @return control that represents the overlay
    protected Composite createOverlayControl(@NotNull Composite parent, @NotNull T target) {

     * any heavy work that might result cause the UI to freeze.

        if (!targetBounds.contains(eventLocation)) {
            return false;
        if (!hovering) {
import java.util.function.BiConsumer;
     */
    /**
    }
 * Allows creation of a toolbar-like controls over

     * When overriding this method, you must also call {@link #createControl(Composite, Control)}.

        var targetBounds = new Rectangle(targetLocation.x, targetLocation.y, targetSize.x, targetSize.y);
 * Copyright (C) 2010-2025 DBeaver Corp and others

    }

     * @param size   computed size of the overlay
     * @return target control for overlay location computation
        if (overlay != null) {
     */
     *
 * See the License for the specific language governing permissions and
    /**
     */
     *
    }

 * you may not use this file except in compliance with the License.
    /**
        }
 * distributed under the License is distributed on an "AS IS" BASIS,
     * <p>
        display.addFilter(SWT.MouseMove, filter);


        // do nothing
 *     http://www.apache.org/licenses/LICENSE-2.0
            dispose();
import org.jkiss.code.NotNull;
}
                onHoverChange(nowHovering);
 *
        location.x += bounds.width - size.x - 5;
        }
        // Are we within the target's bounds?
            overlay = null;
     *
     * Picks a location within the {@code target}'s coordinate space.
     *
    }
 * @param <T> type of the target control
        holder.setLocation(location);
    private void onHoverChange(boolean hovering) {
        }
     */
        Display display = target.getDisplay();
            return false;
     *
     * @param <T>     type of the target control
 */
    private final T target;
     * The default implementation simply returns the passed {@code target}.
 * Unless required by applicable law or agreed to in writing, software
    }

        if (target.isDisposed() || !target.isVisible()) {

     */
     * @param creator a consumer resembling {@link #createControl(Composite, Control)}
        Control origin = pickOverlayControl(target);

            protected void createControl(@NotNull Composite parent, @NotNull T target) {
            return;
            display.removeFilter(SWT.MouseMove, filter);
    /**
            onHoverChange(false);
import org.eclipse.swt.SWT;
            @Override

                creator.accept(parent, target);
     * @param parent parent composite
        new CompositeBorderPainter(holder);
    private boolean hovering;
