            }
            }

            e.gc.setAntialias(SWT.ON);
                image = imageDisabled;
            this.setToolTipText(toolTipText);
        if (getFolder().isCheckCommandEnablement()) {

    public void addSelectionListener(SelectionListener listener) {


        Transform transform = null;
                ActionUtils.runCommand(commandId, serviceLocator);
 * Unless required by applicable law or agreed to in writing, software

        if (!CommonUtils.isEmpty(toolTipText)) {
 * You may obtain a copy of the License at
    }

import org.jkiss.code.NotNull;
            transform = new Transform(e.display);

import org.eclipse.swt.widgets.Event;
        }
                    e.gc.setBackground(selectedBackColor);
import org.eclipse.swt.layout.GridData;
            return;
import org.eclipse.core.commands.ICommandListener;
    }




                transform.rotate(90);
import org.eclipse.swt.graphics.*;
public class VerticalButton extends Canvas {
        notifyListeners(SWT.Selection, event);
                redraw();
                e.gc.setForeground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
            offset += TEXT_MARGIN.top;
                enabled = false;
            if (ActionUtils.isCommandEnabled(commandId, serviceLocator)) {

    private String commandId;
            size.y = imageBounds.height;
                offset += bounds.height + TEXT_SPACING;
            }

        final Command command = ActionUtils.findCommand(commandId);
import java.awt.*;
package org.jkiss.dbeaver.ui.controls;
    public VerticalButton(VerticalFolder parent, int style) {
    private boolean hit = false;
        }
            gc.dispose();
        }
            } else {
                }
            });
        if (!CommonUtils.isEmpty(text)) {
        String toolTipText = action.getToolTipText();
    }
    public void setText(String string) {
        }
    @NotNull
            size.y + BASE_MARGIN.left + BASE_MARGIN.right,
    private String text = "";
        );
        this.image = image;
                transform.translate(0, size.y);
        }

                e.gc.drawImage(image, offset, (size.x - bounds.height) / 2);
            if (isHover) {
        }
            public void mouseEnter(MouseEvent e) {
    private ICommandListener commandListener;
import org.eclipse.swt.graphics.Rectangle;
            }
    public void setImage(Image image) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.CommonUtils;
            } else {
        GC gc = new GC(this);
        }
    public IAction getAction() {
                if (hit) {
                    e.gc.fillRectangle(0, 0, size.x, size.y);

import org.eclipse.swt.events.*;
        this.action = action;
                    imageDisabled = new Image(e.display, this.image, SWT.IMAGE_GRAY);
            Point extent = gc.stringExtent(text);

        if (transform != null) {

            }
            if (transform != null) {
        return button;
    private Image imageDisabled = null;
import org.eclipse.ui.services.IServiceLocator;
        button.setCommand(serviceLocator, commandId, showText);
    public void setCommand(IServiceLocator serviceLocator, String commandId, boolean showText) {
        Point size = computeSize(e.gc);
                offset += bounds.width + TEXT_SPACING;

import org.eclipse.swt.graphics.Point;
                redraw();
                final String toolTipText = ActionUtils.findCommandDescription(commandId, serviceLocator, false);
            }

 *
    }
import org.jkiss.dbeaver.ui.UIStyles;
                    event.widget = event.item = VerticalButton.this;
import org.eclipse.core.commands.Command;
        VerticalButton button = new VerticalButton(folder, style);
                    addDisposeListener(e1 -> imageDisabled.dispose());
        boolean isDarkBG = UIUtils.isDark(curBackground.getRGB());
        } finally {
}        try {
                isHover = true;
            this.setToolTipText(toolTipText);
    private boolean isHover;
    }
                redraw();

            command.addCommandListener(commandListener = event -> {
            ((getStyle() & SWT.RADIO) == SWT.RADIO && getFolder().getSelection() == this) ||
            RGB blendRGB = isDarkBG ? new RGB(255, 255, 255) : new RGB(0, 0, 0);
        });
            return computeSize(gc);
            if (action.isEnabled()) {

            e.gc.setTransform(transform);
    public String getCommandId() {
import org.eclipse.swt.graphics.Color;
                hit = false;
    private void setImage(ImageDescriptor imageDescriptor) {
            event.doit = selectionEvent.doit;
        setImage(ActionUtils.findCommandImage(commandId));
            // Make bg a bit darker
            }

            getFolder().removeItem(this);
    private Point computeSize(@NotNull GC gc) {
            if ((getStyle() & SWT.RIGHT) == SWT.RIGHT) {
import org.eclipse.swt.SWT;
    }

                    Event event = new Event();



        final Point size = new Point(0, 0);
        }
                hit = true;

            size.y += TEXT_MARGIN.left + TEXT_MARGIN.right;
        String toolTipText = ActionUtils.findCommandDescription(commandId, serviceLocator, false);
        if (enabled && (selected || isHover)) {
 *
                // Update visuals
        if (this.commandId != null) {

    private IServiceLocator serviceLocator;
        if (image != null) {
    private void runAction(Event event) {
        if (imageDescriptor != null) {
 * DBeaver - Universal Database Manager
        return button;
                isHover = true;
    }
        }
                    runAction(event);
            });
 *
        button.setAction(action, showText);
    private void removeCommandListener(@NotNull String commandId) {
        return text;
        addListener(SWT.Selection, event -> {
            @Override
            public void mouseHover(MouseEvent e) {
            size.x = imageBounds.width;
        String text = getText();

                RGB buttonHoverRGB = UIUtils.blend(curBackground.getRGB(), blendRGB, 90);
        setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_CENTER));
                redraw();
 * limitations under the License.
        this.setCommandListener(commandId);
        parent.addItem(this);
        if (!CommonUtils.isEmpty(toolTipText)) {

                }
            (action != null && (action.getStyle() & IAction.AS_CHECK_BOX) == IAction.AS_CHECK_BOX && action.isChecked());

                if (CommonUtils.isNotEmpty(toolTipText)) {
                if (imageDisabled == null) {

    public static VerticalButton create(VerticalFolder folder, int style, IServiceLocator serviceLocator, String commandId, boolean showText) {
        this.commandId = commandId;
        }
                if (e.keyCode == '\r' || e.character == ' ') {
        this.checked = selection;
            public void mouseDown(MouseEvent e) {

                redraw();
        boolean selected = isSelected();
            final Rectangle bounds = image.getBounds();
                removeCommandListener(commandId);
        if (!event.doit) {
        if (command != null && commandListener != null) {
            } else {
                transform.rotate(-90);
                    Color selectedBackColor = UIUtils.getSharedTextColors().getColor(selectedBackRGB);
            SelectionEvent selectionEvent = new SelectionEvent(event);
            }
    private IAction action;
        addMouseMoveListener(e -> {
        this.serviceLocator = serviceLocator;
 * See the License for the specific language governing permissions and
import org.jkiss.dbeaver.ui.UIUtils;
import org.eclipse.jface.resource.ImageDescriptor;
        if (!CommonUtils.isEmpty(text)) {
            command.removeCommandListener(commandListener);
        return action;
        return new Point(
                    setToolTipText(toolTipText);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        } else if (commandId != null) {
    @Override
        });
                e.gc.fillRectangle(0, 0, size.x, size.y);
    }
                }
    public Point computeSize(int wHint, int hHint, boolean changed) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                image = this.image;
        boolean enabled = true;
            getFolder().setSelection(this);
        if (showText) {

        if (action != null) {
                e.gc.drawImage(image, (size.x - bounds.width) / 2, offset);
        setImage(action.getImageDescriptor());

        if (showText) {
                    isHover = true;

/*
 * you may not use this file except in compliance with the License.
                UIUtils.dispose(image);
        }
    public void setChecked(boolean selection) {
                }
            this.text = ActionUtils.findCommandName(commandId);
    private static final int TEXT_SPACING = TEXT_MARGIN.bottom;
            }
    }
            Rectangle imageBounds = image.getBounds();
            public void mouseExit(MouseEvent e) {
    }
            }
                enabled = ActionUtils.isCommandEnabled(commandId, serviceLocator);

            public void keyPressed(KeyEvent e) {
                    event.widget = event.item = VerticalButton.this;

        return commandId;
            if (commandId != null) {
                redraw();
            }
        }
                Color buttonHoverColor = UIUtils.getSharedTextColors().getColor(buttonHoverRGB);
                action.runWithEvent(event);
    public String getText() {
        }
            if (image != null) {
    }
        }
            if (!isHover) {
                isHover = true;
    }
        }
        });
            transform.dispose();
                }
        this.addDisposeListener(e -> {
            commandListener = null;
                transform.translate(size.x, 0);
            }
    }
        this.text = string;
                if (!isHover) {
            listener.widgetSelected(selectionEvent);
        this.addMouseListener(new MouseAdapter() {
import org.jkiss.dbeaver.ui.ActionUtils;
    public boolean isChecked() {
                size.x += TEXT_SPACING;
        });
import org.eclipse.swt.graphics.Image;

        this.addPaintListener(this::paint);
            size.x = size.x + extent.x;
    }
                }
    public VerticalFolder getFolder() {
    }

 */
            public void mouseUp(MouseEvent e) {
                    redraw();
                e.gc.setBackground(buttonHoverColor);
            e.gc.drawString(this.text, offset, (size.x - bounds.y) / 2);
    private void paint(@NotNull PaintEvent e) {
        return (VerticalFolder) getParent();

    private static final Insets BASE_MARGIN = new Insets(2, 2, 2, 2);
            addDisposeListener(e -> {
        return checked ||
        return checked;

            }

        if (image != null) {
        }
        final Command command = ActionUtils.findCommand(commandId);
        redraw();
        redraw();
    public void setAction(IAction action, boolean showText) {
    }
        });
            // Extra margins so the text is not too close to the border
            this.image = imageDescriptor.createImage(true);
            size.y = Math.max(size.y, extent.y);
                isHover = false;

                e.gc.drawRectangle(0, 0, size.x - 1, size.y - 1);

    private void setCommandListener(@NotNull String commandId) {
            e.gc.setForeground(isDarkBG ? UIStyles.COLOR_WHITE : UIStyles.getDefaultTextForeground());
    }
                    Event event = new Event();
            }
    }
                    runAction(event);
    }
        if (!CommonUtils.isEmpty(text)) {
        }
        if (command != null) {
            size.x + BASE_MARGIN.top + BASE_MARGIN.bottom
            }
    public static VerticalButton create(VerticalFolder folder, int style, IAction action, boolean showText) {

            this.text = action.getText();

            if (action != null && !action.isEnabled()) {

    private boolean isSelected() {

            } else if (commandId != null) {

        if ((getStyle() & SWT.RADIO) == SWT.RADIO) {
            if (selected) {
        }
    }
                    RGB selectedBackRGB = UIUtils.blend(curBackground.getRGB(), blendRGB, 95);
            this.removeCommandListener(this.commandId);
    private static final Insets TEXT_MARGIN = new Insets(4, 0, 4, 0);
        setFont(parent.getFont());
                if (!isHover) {
import org.eclipse.swt.widgets.Canvas;
            size.x += TEXT_MARGIN.top + TEXT_MARGIN.bottom;
 * distributed under the License is distributed on an "AS IS" BASIS,

        this.addKeyListener(new KeyAdapter() {
        Color curBackground = e.gc.getBackground();
        VerticalButton button = new VerticalButton(folder, style);
                isHover = true;
        }
        super(parent, style | SWT.NO_FOCUS);
    private Image image = null;

    }
        });
        }
            }
        int offset = BASE_MARGIN.top;
import org.eclipse.jface.action.IAction;
            if (!enabled) {
            }
            final Image image;
    }
        if (!CommonUtils.isEmpty(text)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
        }
        this.addMouseTrackListener(new MouseTrackAdapter() {
    private boolean checked;


            final Point bounds = e.gc.textExtent(text);
