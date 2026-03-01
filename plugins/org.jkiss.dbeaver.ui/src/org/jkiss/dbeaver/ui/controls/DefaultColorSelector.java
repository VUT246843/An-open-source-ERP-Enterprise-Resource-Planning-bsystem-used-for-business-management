import org.jkiss.dbeaver.ui.internal.UIMessages;

            gc.drawRectangle(1, 1, bounds.width - 3, bounds.height - 3);
import org.eclipse.jface.util.IPropertyChangeListener;

            final Color contrastColor = UIStyles.getContrastColor(color);
import org.eclipse.swt.widgets.Button;
            // Draw overlay and cross with contrast color
import org.jkiss.dbeaver.ui.UIStyles;

            button.setImage(image);
 */
            getButton().setToolTipText(UIMessages.control_default_color_selector_reset_default_tip);
                    }

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.swt.events.MouseAdapter;
    @NotNull
            for (Object listener : listeners) {
    public RGB getDefaultColorValue() {
 * See the License for the specific language governing permissions and
 *
import org.eclipse.swt.SWT;
                    if ((e.stateMask & SWT.BUTTON3) > 0) {
    }
import org.jkiss.dbeaver.ui.UIUtils;
            final Rectangle bounds = image.getBounds();

        }
            gc.drawLine(bounds.width - 3, 2, 2, bounds.height - 3);
            }
        if (listeners.length > 0) {
                ((IPropertyChangeListener) listener).propertyChange(event);

import org.jkiss.code.NotNull;
import org.eclipse.swt.widgets.Composite;
 * You may obtain a copy of the License at
            return;
        if (getColorValue() == null) {
        }
}
 * Copyright (C) 2010-2025 DBeaver Corp and others
        }
    }
 *
    }


import org.eclipse.jface.preference.ColorSelector;
 * limitations under the License.
import org.eclipse.jface.util.PropertyChangeEvent;

 * DBeaver - Universal Database Manager
    }
        }
    private void fireColorUpdateEvent(@NotNull RGB oldColor, @NotNull RGB newColor) {


        this.defaultColorValue = defaultColorValue;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, PROP_COLORCHANGE, oldColor, newColor);
        if (rightClickResetsColor) {
 *     http://www.apache.org/licenses/LICENSE-2.0
    public DefaultColorSelector(@NotNull Composite parent, boolean rightClickResetsColor) {
import org.eclipse.swt.graphics.*;
                public void mouseUp(MouseEvent e) {
        if (getColorValue() == getDefaultColorValue()) {

 * Licensed under the Apache License, Version 2.0 (the "License");
                @Override
 * you may not use this file except in compliance with the License.
        super(parent);
        super.updateColorImage();
import org.eclipse.swt.events.MouseEvent;

        updateColorImage();
                        fireColorUpdateEvent(getColorValue(), getDefaultColorValue());
 *
    }
            gc.drawLine(2, 2, bounds.width - 3, bounds.height - 3);
    public void setDefaultColorValue(@NotNull RGB defaultColorValue) {
                        setColorValue(getDefaultColorValue());
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
/*
public class DefaultColorSelector extends ColorSelector {
            final Color color = UIUtils.getSharedColor(getColorValue());
                }
            });
    @Override
            final Color blendedColor = UIUtils.getSharedColor(UIUtils.blend(color.getRGB(), contrastColor.getRGB(), 50));
    /* Copied from ColorSelector#open() */
            final GC gc = new GC(image);
            getButton().addMouseListener(new MouseAdapter() {
        return defaultColorValue;
            final Image image = button.getImage();
            gc.dispose();
            final Button button = getButton();
package org.jkiss.dbeaver.ui.controls;
    protected void updateColorImage() {
        final Object[] listeners = getListeners();

    private RGB defaultColorValue;
            gc.setForeground(blendedColor);
