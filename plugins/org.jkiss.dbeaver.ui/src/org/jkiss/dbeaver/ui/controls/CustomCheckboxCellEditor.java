            @Override
 */
    public void setBooleanAlignment(@NotNull UIElementAlignment alignment) {
        return ph;
            checkBox.setImage(DBeaverIcons.getImage(style.getIcon()));
                        fireApplyEditorValue();
        }
    }

        this(parent, false);
        return 0;
 * you may not use this file except in compliance with the License.
 * See the License for the specific language governing permissions and
    protected Control createControl(Composite parent) {
        });
    protected void doSetFocus() {
                updateCheckVisuals();
 * Unless required by applicable law or agreed to in writing, software

            }
        gl.marginHeight = 0;
    }
    }
            }
    }
                        applyEditorValue();
        if (!changeOnActivate) {
            }
    @Override
        final BooleanStyle style = booleanStyles.getStyle(checked);
            @Override
        if (changeOnActivate) {
    private boolean initialValue;
                    case SWT.ESC:
    private BooleanStyleSet booleanStyles;


                //fireApplyEditorValue();

 *
        ph.setLayout(gl);
        //fireApplyEditorValue();
        checkBox.getParent().setFocus();
    private void applyEditorValue() {
        return checked;
    }

    @Override
import org.jkiss.dbeaver.ui.controls.bool.BooleanStyleDecorator;
 *
            checked = !checked;

import org.jkiss.utils.CommonUtils;
            ((GridData) checkBox.getLayoutData()).horizontalIndent = 3;
        Assert.isTrue(checkBox != null && (value instanceof Boolean));
        boolean isValid = isCorrect(newValue);
import org.jkiss.dbeaver.ui.controls.bool.BooleanMode;
    public CustomCheckboxCellEditor(Composite parent) {
import org.eclipse.swt.layout.GridLayout;
    private boolean checked;
        } else {
    public LayoutData getLayoutData() {
 * Licensed under the Apache License, Version 2.0 (the "License");
        final IPropertyChangeListener styleChangeListener = event -> {
        initialValue = val;
            // added to prevent checkbox flickering when the changeOnActivate is set to true
        checkBox.getParent().layout(true, true);
 * Copyright (C) 2010-2024 DBeaver Corp and others
        Object newValue = doGetValue();
        boolean val = CommonUtils.toBoolean(value);
        checkBox.addMouseListener(new MouseAdapter() {
package org.jkiss.dbeaver.ui.controls;
            checkBox.setBackground(parent.getBackground());

 * Checkbox cell editor

                        checked = initialValue;
        }
                switch (e.character) {
        ph.addKeyListener(new KeyListener() {
import org.jkiss.dbeaver.ui.UIUtils;
        checkBox.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, true));
    }
        checked = val;
    public CustomCheckboxCellEditor(Composite parent, boolean changeOnActivate) {
        });
    }
            public void mouseDown(MouseEvent e) {

    protected int getDoubleClickTimeout() {
            booleanStyles = BooleanStyleSet.getDefaultStyles(DBWorkbench.getPlatform().getPreferenceStore());
        checkBox = new Label(ph, SWT.NONE);
import org.jkiss.dbeaver.ui.controls.bool.BooleanStyleSet;
        });
        if (style.getMode() == BooleanMode.TEXT) {
import org.eclipse.swt.layout.GridData;
            @Override
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.core.runtime.Assert;
        gl.marginWidth = 0;
    }
            applyEditorValue();
        // must set the selection before getting value
        Composite ph = new Composite(parent, SWT.NONE);
        LayoutData layoutData = super.getLayoutData();
    private Label checkBox;

    protected Boolean doGetValue() {
    protected void doSetValue(Object value) {
        super(parent);
    @Override
                dispose();
        markDirty();
                    case SWT.CR:
 * You may obtain a copy of the License at
import org.eclipse.swt.widgets.Composite;
        setValueValid(isValid);
            UIUtils.asyncExec(() -> {
    @Override
            }
import org.jkiss.dbeaver.runtime.DBWorkbench;
        if (alignment == UIElementAlignment.LEFT) {
    public void activate() {
            public void keyReleased(KeyEvent e) {
    private final boolean changeOnActivate;
        BooleanStyleSet.installStyleChangeListener(parent, styleChangeListener);
    private void updateCheckVisuals() {
                        applyEditorValue();
        final UIElementAlignment alignment = this.alignment == null ? style.getAlignment() : this.alignment;
        GridLayout gl = new GridLayout(1, false);
            @Override
import org.eclipse.swt.SWT;
    @Override

                applyEditorValue();
        layoutData.grabHorizontal = true;
                CustomCheckboxCellEditor.this.focusLost();
import org.eclipse.jface.viewers.CellEditor;

        }
                }
import org.eclipse.swt.events.*;
                fireApplyEditorValue();
 * distributed under the License is distributed on an "AS IS" BASIS,
 * DBeaver - Universal Database Manager
    @Override
/*
    }
            super.activate(activationEvent);

    }
        this.alignment = alignment;
import org.eclipse.swt.widgets.Control;
        };
import org.jkiss.dbeaver.ui.DBeaverIcons;
                checked = !checked;
            checkBox.setForeground(UIUtils.getSharedColor(style.getColor()));

 */
        updateCheckVisuals();
        return layoutData;
        if (changeOnActivate) {
        /*if (activationEvent.eventType != ColumnViewerEditorActivationEvent.TRAVERSAL) */{
            checkBox.getParent().setBackground(parent.getBackground());
    @Override
        } else {
        styleChangeListener.propertyChange(null);
    }


            // Run in async to avoid NPE. fireApplyEditorValue disposes and nullifies editor
                        updateCheckVisuals();
        updateCheckVisuals();
            public void focusLost(FocusEvent e) {
import org.eclipse.swt.widgets.Label;
        }
import org.jkiss.dbeaver.ui.UIElementAlignment;
    }
        ph.addFocusListener(new FocusAdapter() {
                        break;

 *
                    case SWT.SPACE:
import org.jkiss.code.NotNull;
        this.changeOnActivate = changeOnActivate;

                        // fallthrough
            ((GridData) checkBox.getLayoutData()).horizontalIndent = 0;
            });
                        break;
import org.jkiss.dbeaver.ui.controls.bool.BooleanStyle;



    }

import org.eclipse.jface.util.IPropertyChangeListener;
        }
            checkBox.setText(style.getText());
            public void keyPressed(KeyEvent e) {
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;

/**
        //setCheckIcon();

                        checked = !checked;
 *     http://www.apache.org/licenses/LICENSE-2.0
        ((GridData) checkBox.getLayoutData()).horizontalAlignment = alignment.getStyle();
        }
public class CustomCheckboxCellEditor extends CellEditor implements BooleanStyleDecorator {
    private UIElementAlignment alignment;
    @Override
 * limitations under the License.
}

        layoutData.horizontalAlignment = SWT.CENTER;
    public void activate(ColumnViewerEditorActivationEvent activationEvent) {
