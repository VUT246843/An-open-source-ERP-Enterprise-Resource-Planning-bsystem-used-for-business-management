        this.setForeground(UIStyles.getDefaultTextForeground());
        }
            newItem.setText(itemText);
                this.popup = null;
                e.doit = event.doit;
            if (!enabled) {
                e.character = event.character;
            this.popup.addListener(popupEvent, this.listener);

            this.items.clear();
    }
import org.jkiss.dbeaver.ui.*;
                }
        if (hScrollBar != null) {
 */
        super.setForeground(foreground);
                listEvent(event);
        gridLayout.marginHeight = 2;
    private void arrowEvent(Event event) {
            }
    @Override
    @Override
                return;
    public void setToolTipText(String string) {
        checkWidget();

            }
        Rectangle listRect = this.dropDownControl.getBounds();
                    event.doit = false;
                return;
                        select(Math.max(oldIndex - 1, 0));
                    case SWT.TRAVERSE_ESCAPE:
                Display display = getDisplay();
    public void remove(int index) {
        Shell oldPopup = this.popup;
            } catch (Exception e) {
            case SWT.Resize: {
                break;
                // pop up list as characters typed in text widget
        this.arrow.setBackground(background);
            }
            }

                    } else {
                    dropDown(true);
                        notifyListeners(SWT.Selection, e);
                ITEM_TYPE item = (ITEM_TYPE) tableItem.getData();
        createTableItems(table);
import org.jkiss.utils.ArrayUtils;
    private TableFilter<ITEM_TYPE> tableFilter = null;
                e.keyCode = event.keyCode;
                removeListener(SWT.Dispose, listener);
        if (items.size() == 1) {
        this.imageLabel.setBackground(background);
            }
        for (ITEM_TYPE item : this.items) {
        for (int arrowEvent : arrowEvents) {
 * Image combo
                if (getShell() != this.popup.getParent()) {
                Event e = new Event();
 * you may not use this file except in compliance with the License.
            listSize.x -= verticalBar.getSize().x;

            this.addListener(comboEvent, this.listener);

    private Shell popup;
 *
        select(this.items.indexOf(item));

        createTableItems(table);
        table.setFocus();
                this.popup = null;

                    notifyListeners(SWT.DefaultSelection, e);
        createPopup();
            if (CSmartCombo.this.arrow == event.widget) {
                return;
        }
                break;

                    createPopup();
        String itemText;
        super.setBackground(background);
        }
            case SWT.FocusIn: {
        }
                break;
                    break;
    }
            case SWT.FocusOut: {
                    if ((event.stateMask & SWT.ALT) != 0) {
            filterButton.setText("Show " + (tableFilter.isEnabled() ? tableFilter.getDefaultLabel() : tableFilter.getFilterLabel()));
                    this.dropDownControl = null;
                    // Enter causes default selection
            }

                }
                }
                if (event.button != 1) {
                Event e = new Event();
                    if (event.keyCode == SWT.ARROW_UP) {
                if (isDisposed()) {
                        //this.text.selectAll();
        if (index < 0) {
                        dropDown(!dropped);
                comboEvent(event);
        this.listener = event -> {

            });
    @NotNull
                        boolean dropped = isDropped();
        this.popup.setBounds(x, y, width, height);
        int mask = SWT.READ_ONLY | SWT.FLAT | SWT.LEFT_TO_RIGHT | SWT.RIGHT_TO_LEFT | SWT.CHECK;
        return style & mask;


        gridLayout.marginWidth = 2;
        Image itemImage = null;
                    return;
    }
                final TreeItem tableItem = selection[0];
                        event.doit = false;
        int itemCount = this.items.size();
        }
    public void addModifyListener(@NotNull ModifyListener listener) {
        return items;
    }
            new CompositeBorderPainter(this);
        }
        }
        GridLayout gridLayout = new GridLayout(3, false);
            }
            if (itemBackground != null && itemForeground == null) {
        this.text.setText(itemText);
        addListener(SWT.Modify, event -> listener.modifyText(new ModifyEvent(event)));
                }
            return;
            }
        Point comboSize = getSize();
            this.imageLabel.setImage(itemImage);
 * limitations under the License.
            return;

                        // do not use them for traversal.
    public void addItem(@Nullable ITEM_TYPE element) {
                    }
            selectedItem = this.items.get(index);
    }

        this.filter = event -> {
        super(parent, checkStyle(style));
/*
            }
                        break;
 * See the License for the specific language governing permissions and
    @Override

        return this.items.indexOf(this.selectedItem);
        int[] arrowEvents = {SWT.MouseDown, SWT.MouseUp, SWT.FocusIn};
            y = parentRect.y - height;
                e.character = event.character;


                if (event.keyCode == SWT.ARROW_UP || event.keyCode == SWT.ARROW_DOWN) {
        this.text.setCursor(arrowCursor);
        table.setLayoutData(new GridData(GridData.FILL_BOTH));
                itemBackground = ((IColorProvider) labelProvider).getBackground(item);
        checkWidget();
    public String getItemText(int index) {
                e.character = event.character;
                notifyListeners(SWT.FocusOut, e);
    public int getItemCount() {
            listSize.y += popup.getChildren()[0].computeSize(SWT.DEFAULT, SWT.DEFAULT).y;
            if (column.getWidth() < maxSize) {

/**
        }
        Rectangle displayRect = getMonitor().getClientArea();
    @Override
    private void handleFocus(int type) {
                e.character = event.character;
                shell.removeListener(SWT.Deactivate, this.listener);
            final Button filterButton = new Button(this.popup, SWT.PUSH | SWT.FLAT | SWT.CENTER);
        }
                if (event.button != 1) {
        gridLayout.marginBottom = 0;
        switch (type) {
        if (sizeHint != null) {
                @Override
                // If so, do not continue.
                table.setSelection(tableItem);
        if ((style & SWT.CHECK) != 0) {
import java.util.List;
                    return;
                break;
        switch (event.type) {
    }
                shell.removeListener(SWT.Deactivate, this.listener);
        int[] popupEvents = {SWT.Close, SWT.Paint, SWT.Deactivate};
            Image itemImage = labelProvider.getImage(item);
        checkWidget();
    private final StyledText text;
            this.select(getSelectionIndex());
                break;
    public interface TableFilter<FILTER_ITEM_TYPE> {
                notifyListeners(SWT.KeyDown, e);
                this.dropDownControl = null;
        table.removeAll();
                    if (isDisposed()) {
        switch (event.type) {
                }
        }
            if (CSmartCombo.this.popup == event.widget) {
                    break;
        this.imageLabel.setToolTipText(string);
                Display display = getDisplay();
    }
                e.stateMask = event.stateMask;
            listStyle |= SWT.RIGHT_TO_LEFT;

            }
    }
            case SWT.Close:
        int itemHeight = table.getItemHeight() * itemCount;
                if (item.getData() == selectedItem) {
            if (CSmartCombo.this.text == event.widget) {
        addListener(SWT.Selection, event -> listener.widgetSelected(new SelectionEvent(event)));
                handleFocus(SWT.FocusIn);
                        break;
        // create a table instead of a list.

        int y = parentRect.y + comboSize.y;
    }
    }
                        break;
            }

        itemCount = (itemCount == 0) ? this.visibleItemCount : Math.min(this.visibleItemCount, itemCount);
                this.hasFocus = true;
        this.arrow.setLayoutData(gd);
            selectedItem = null;

    }
                    case SWT.TRAVERSE_ARROW_NEXT:
    public void remove(ITEM_TYPE item) {
            }
        return items.get(index);
                e.character = event.character;
                }

                            setFocus();
            filterButton.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        super.setToolTipText(string);
        if (force || enabled != isEnabled()) {
                    case SWT.TRAVERSE_RETURN:
                }
                if (event.character == SWT.CR) {
        GridLayout gl = new GridLayout(1, true);
        }
        if (count < 0) {
    private Tree dropDownControl;
            }
    public void setVisibleItemCount(int count) {
            }

        Display display = getDisplay();
                public void widgetSelected(SelectionEvent e) {
    private void updateTableItems() {
        if (items.size() == 1) {

        }

    }
                e.keyCode = event.keyCode;
            if (CSmartCombo.this.dropDownControl == event.widget) {
                break;
    public void removeAll() {
        this.setLayout(gridLayout);
        if (tableFilter != null) {
                Tree table = this.dropDownControl;
        addListener(SWT.DefaultSelection, event -> listener.widgetDefaultSelected(new SelectionEvent(event)));
                continue;
        addListener(SWT.Verify, event -> listener.verifyText(new VerifyEvent(event)));
        }
                    int selectionIndex = this.getSelectionIndex();
    public CSmartCombo(@NotNull Composite parent, int style, @NotNull ILabelProvider labelProvider) {
                e.time = event.time;
            } else {
                if (this.popup != null && !this.popup.isDisposed()) {
            case SWT.MouseDown: {
                    return;
        return this.labelProvider.getText(this.selectedItem);

 * Copyright (C) 2010-2026 DBeaver Corp and others
            case SWT.Dispose:
    }

            select(0);
            case SWT.KeyUp: {
                if (event.character == SWT.CR) {
                e.time = event.time;
            case SWT.KeyUp: {
        }
            }
            }
 *
        if (itemImage != null) {
            this.items.remove(index);
        setEnabled(enabled, false);
        table.setBounds(1, 1, Math.max(size.x, listSize.x) - 30, listSize.y);
import org.eclipse.swt.SWT;
    public String getText() {

        gridLayout.horizontalSpacing = 0;
                break;
            listSize.y += hScrollBar.getSize().y;
                if (event.character == SWT.ESC) {
    public void setText(String string) {
            if (shell == CSmartCombo.this.getShell()) {
            newItem.setData(item);
                    // If so, do not continue.
    }
                //this.text.selectAll();
                itemImage = labelProvider.getImage(selectedItem);
            for (TreeItem item : table.getItems()) {
    public void addItem(@Nullable ITEM_TYPE parent, @Nullable ITEM_TYPE element) {
                // No image
                this.hasFocus = false;
        items.add(element);
                Event e = new Event();
                break;

        return this.popup != null && this.popup.getVisible();
                }
        }
            case SWT.MouseDown: {
            }
                notifyListeners(SWT.KeyDown, e);
        int x = parentRect.x;
                break;
            case SWT.Dispose:
        if (oldPopup != null) {
                    // Escape key cancels popup list
        }
        Point listSize = table.computeSize(SWT.DEFAULT, itemHeight, false);
                    selectedItem = null;
            }
                this.setBackground(getParent().getBackground());
                }
                // Further work : Need to add support for incremental search in 
        this.popup.setVisible(true);
                handleFocus(SWT.FocusIn);
            }
            return;
            oldPopup.dispose();
                return;
        if (isDisposed()) {
                dropDown(false);
        this.arrow.setToolTipText(string);
                        "Show " + (tableFilter.isEnabled() ? tableFilter.getDefaultLabel() : tableFilter.getFilterLabel()));

        }
                Shell shell = getShell();
        for (int comboEvent : comboEvents) {
                    Event e = new Event();
            case SWT.Traverse: {
                shell.removeListener(SWT.Deactivate, this.listener);
                break;
        }
        this.text.setFont(font);
                }
        }
            case SWT.Move:

                notifyListeners(SWT.KeyUp, e);
                        Event e = new Event();
                e.keyCode = event.keyCode;
                    return;
        }
    }
            case SWT.FocusIn: {
                notifyListeners(SWT.Modify, e);
                Display display = getDisplay();
                switch (event.detail) {
                }
        remove(this.items.indexOf(item));
                    notifyListeners(SWT.DefaultSelection, e);
    }
        checkWidget();
        };
    }
                        // the arrow keys are used to manipulate the list contents so
        checkWidget();
            final TreeColumn column = table.getColumn(0);
                        e.time = event.time;
                Event e = new Event();
                e.time = event.time;
                    case SWT.TRAVERSE_ARROW_PREVIOUS:
 */
import java.util.ArrayList;
 *     http://www.apache.org/licenses/LICENSE-2.0
        checkWidget();
                    tableFilter.setEnabled(!tableFilter.isEnabled());
        this.popup = new Shell(getShell(), SWT.RESIZE | SWT.ON_TOP);
    }
            this.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                Control focusControl = getDisplay().getFocusControl();
                event.doit = e.doit;
                Event e = new Event();
            listStyle |= SWT.CHECK;
    public void setFont(Font font) {
    public List<ITEM_TYPE> getItems() {
            imageLabel.setEnabled(enabled);
    }
                    filterButton.setText(
                break;
    public int getSelectionIndex() {
    private Label arrow;
            }
                e.doit = event.doit;
        }
            case SWT.FocusIn: {
                e.keyCode = event.keyCode;
                this.arrow = null;
    public ITEM_TYPE getSelectedItem() {
                notifyListeners(SWT.Traverse, e);
                    dropDown(false);
            case SWT.KeyDown: {
        }

            }

                if (!dropped && (System.currentTimeMillis() - disposeTime) > 200) {
        }
                    case SWT.TRAVERSE_ARROW_NEXT:
    private void createPopup() {
                e.keyCode = event.keyCode;

                break;
    @Override
                        }
        if ((style & SWT.BORDER) != 0) {
                handleFocus(SWT.FocusIn);
                    dropDown(false);
    }
                break;
    protected final List<ITEM_TYPE> items = new ArrayList<>();

    private final Listener filter;
            column.pack();
                handleFocus(SWT.FocusOut);
        TableFilter<ITEM_TYPE> filter = tableFilter != null && tableFilter.isEnabled() ? tableFilter : null;
    }

                handleFocus(SWT.FocusOut);
    }
    }
package org.jkiss.dbeaver.ui.controls;
        }
        }
    private boolean hasFocus;
                display.removeFilter(SWT.FocusIn, this.filter);
            Shell shell = ((Control) event.widget).getShell();

                // draw black rectangle around list
                Shell shell = getShell();
                Event e = new Event();
            }
        if (background == getBackground()) {
            this.arrow.addListener(arrowEvent, this.listener);
    }

            this.popup.setData("resizeListener", Boolean.TRUE);
                final Shell toDispose = this.popup;
                event.doit = e.doit;
        for (int i = 0; i < this.items.size(); i++) {
        int height = listRect.height;
                e.doit = event.doit;
                table.setSelection(newItem);
            }
            table.addListener(listEvent, this.listener);
            }
                e.detail = event.detail;
                    case SWT.TRAVERSE_ARROW_PREVIOUS:
                notifyListeners(SWT.Selection, e);
        this.imageLabel.setForeground(foreground);
                    }
    }
                event.gc.drawRectangle(0, 0, listRect.width + 1, listRect.height + 1);


                display.addFilter(SWT.FocusIn, this.filter);
        if (string == null) {
                Event e = new Event();
        if (selectedItem != null) {
    }

        if ((style & SWT.LEFT_TO_RIGHT) != 0) {
        int style = getStyle();
}
                    table.setTopItem(item);
        this.dropDownControl.setFocus();
        this.arrow = new Label(this, SWT.NONE);
        this.setBackground(itemBackground);
                if (focusControl == this.arrow || focusControl == this.dropDownControl || focusControl == this) {
                break;
    private long disposeTime = -1;
    public void select(int index) {
    private void createTableItems(Tree table) {
                break;
                event.type = SWT.None;
                // If so, do not continue.
    public ITEM_TYPE getItem(int index) {
            if (isDisposed()) {
        return selectedItem;
                Event e = new Event();
        } else {
        items.add(element);
                    //At this point the widget may have been disposed.
    private void textEvent(Event event) {
            case SWT.MouseUp: {
import org.eclipse.swt.widgets.*;
    }
        return labelProvider.getText(this.items.get(index));
        gl.horizontalSpacing = 0;
                display.removeFilter(SWT.FocusIn, this.filter);
                }
                if (!isDropped() && (System.currentTimeMillis() - disposeTime) > 200) {

            itemText = labelProvider.getText(selectedItem);
        checkWidget();
            if (getShell() == event.widget) {
        this.text.setBackground(background);
                    return;
                break;
                break;
            try {
            }
                e.time = event.time;
 * DBeaver - Universal Database Manager

        }

        this.imageLabel = new Label(this, SWT.NONE);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL | GridData.VERTICAL_ALIGN_CENTER);
                event.gc.setForeground(black);
                dropDown(false);
        if (index < 0) {
 *
                disposeTime = System.currentTimeMillis();
            }
            case SWT.Deactivate:
                event.detail = e.detail;
    }
                if (isDisposed()) {

        }
        this.remove(-1);
        this.text.setToolTipText(string);

            case SWT.Selection: {
import org.jkiss.code.NotNull;
                popupEvent(event);
                Rectangle listRect = this.dropDownControl.getBounds();
                        if (!dropped) {
                dropDown(false);
    public void select(ITEM_TYPE item) {
                if (index < items.size() - 1) {
                Shell shell = getShell();
        if (!drop) {
    }
                    && (event.keyCode == SWT.ARROW_UP || event.keyCode == SWT.ARROW_DOWN)) {

                        // The enter causes default selection and
import org.jkiss.code.Nullable;
                e.stateMask = event.stateMask;
                if (ArrayUtils.isEmpty(selection)) {
                Event e = new Event();
    }
                }
                notifyListeners(SWT.FocusIn, e);
    /**
                notifyListeners(SWT.Traverse, e);
                //At this point the widget may have been disposed.

    public void addSelectionListener(@NotNull SelectionListener listener) {
                notifyListeners(SWT.KeyUp, e);
                }
                } else {
                if (selectedItem != null && labelProvider instanceof IColorProvider cp) {
                    Event e = new Event();
        boolean isEnabled();
                    this.setBackground(cp.getBackground(selectedItem));
                    }
                e.stateMask = event.stateMask;
        String getFilterLabel();
        if (verticalBar != null) {
        gl.marginHeight = 0;
import org.eclipse.swt.layout.GridLayout;
        }
public class CSmartCombo<ITEM_TYPE> extends Composite {
        }
                return;
            if (labelProvider instanceof IColorProvider cp) {
                break;
                itemForeground = ((IColorProvider) labelProvider).getForeground(item);
                        break;
        }
    private int visibleItemCount = 10;

            case SWT.KeyDown: {

    private final Label imageLabel;
                    table.showItem(item);
    public void setBackground(Color background) {

            }
                boolean dropped = isDropped();
    private void setEnabled(boolean enabled, boolean force) {
    private final Listener listener;
        UIUtils.asyncExec(() -> layout(true, true));
    }
                }
                TreeItem[] selection = table.getSelection();
                e.time = event.time;
import org.eclipse.swt.custom.StyledText;
        gridLayout.verticalSpacing = 0;
                    return;
        String getDefaultLabel();
 * You may obtain a copy of the License at

                    return;
                }
                if (!this.hasFocus) {
        this.tableFilter = tableFilter;

        }
                event.doit = false;
        int[] comboEvents = {SWT.Dispose, SWT.Move, SWT.Resize};
                break;

                e.stateMask = event.stateMask;
        return this.items.size();
        for (int popupEvent : popupEvents) {
            }
        gl.marginWidth = 0;
            }
                event.detail = e.detail;
                if (this.hasFocus) {
            this.select(-1);
        this.arrow.setImage(DBeaverIcons.getImage(UIIcon.TREE_COLLAPSE));
        }
            width = sizeHint.x;
                arrowEvent(event);
            }
        }
            case SWT.Paint:
        } else {
            this.dropDownControl.removeListener(SWT.Dispose, this.listener);
        this.popup.setLayout(gl);
            if (CSmartCombo.this == event.widget) {
        int[] textEvents = {SWT.KeyDown, SWT.KeyUp, SWT.Modify, SWT.MouseDown, SWT.MouseUp, SWT.Traverse, SWT.FocusIn};
        }
        for (int textEvent : textEvents) {
        Tree table = new Tree(this.popup, listStyle);
            if (labelProvider instanceof IColorProvider) {

                break;
                    e.time = event.time;

            this.text.addListener(textEvent, this.listener);
            this.popup.addListener(SWT.Resize, event -> CSmartCombo.this.sizeHint = popup.getSize());

            return;




                //table.pack();
        this.setEnabled(true, true);
        checkWidget();
    }
            if (this.popup != null) {
                    dropDown(false);
        this.setCursor(arrowCursor);
    public void setForeground(Color foreground) {
                return;
        if ((style & SWT.RIGHT_TO_LEFT) != 0) {
        boolean filter(FILTER_ITEM_TYPE item);
    }
 * Licensed under the Apache License, Version 2.0 (the "License");
            return;
     */
            String itemText = labelProvider.getText(item);
            case SWT.Traverse: {
                if (event.button != 1) {

                Color black = getDisplay().getSystemColor(SWT.COLOR_LIST_FOREGROUND);
        this.text.setForeground(foreground);
            filterButton.addSelectionListener(new SelectionAdapter() {
        int listStyle = SWT.SINGLE | SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION;
                //column.setWidth(maxSize);
    private Point sizeHint;

        ScrollBar verticalBar = table.getVerticalBar();
        int width = comboSize.x;
            if (this.labelProvider.getText(items.get(i)).equals(string)) {
    private static int checkStyle(int style) {
                break;
        Tree table = dropDownControl;
            super.setEnabled(enabled);
                    }
        if (y + height > displayRect.y + displayRect.height) {
 * Unless required by applicable law or agreed to in writing, software
                        select(Math.min(oldIndex + 1, getItemCount() - 1));
                    this.popup = null;
            selectedItem = null;
            if (item == selectedItem) {
    }
        this.arrow.setForeground(foreground);
        checkWidget();

            newItem.setBackground(itemBackground);
        this.labelProvider = labelProvider;
                break;
            TreeItem newItem = new TreeItem(table, SWT.NONE);
                shell.addListener(SWT.Deactivate, this.listener);
        Color itemBackground = null;
                }
        if (tableFilter != null) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }

        if (this.popup.getData("resizeListener") == null) {
            select(0);
                    this.popup.dispose();
            height = sizeHint.y;
                }
        if (parent.getLayout() instanceof GridLayout) {
                }
            Color itemBackground = null, itemForeground = null;
                display.removeFilter(SWT.FocusIn, this.filter);
        int[] listEvents = {SWT.MouseUp, SWT.Selection, SWT.Traverse, SWT.KeyDown, SWT.KeyUp, SWT.FocusIn, SWT.Dispose, SWT.Resize};
                    case SWT.TRAVERSE_RETURN:
            newItem.setImage(itemImage);
        }
        if ((style & SWT.FLAT) != 0) {
        Tree table = dropDownControl;
     * Adds element
        switch (event.type) {
    @Nullable
    }
    }
                    e.time = event.time;
        super.setFont(font);
                    this.dropDownControl.removeListener(SWT.Dispose, this.listener);
            listStyle |= SWT.FLAT;
            newItem.setForeground(itemForeground);
import org.eclipse.jface.viewers.ILabelProvider;
                break;
                    int oldIndex = getSelectionIndex();

                e.time = event.time;
            string = "";
                itemBackground = cp.getBackground(selectedItem);
                if ((event.stateMask & SWT.ALT) != 0
        switch (event.type) {
        for (int listEvent : listEvents) {
            case SWT.FocusIn: {
        this.text = new StyledText(this, SWT.SINGLE | SWT.READ_ONLY);
        this.dropDownControl = table;
                e.detail = event.detail;
                    updateTableItems();
                }
    private void popupEvent(Event event) {
        }
        {
                break;

        if (itemBackground == null) {
    public void setTableFilter(@Nullable TableFilter<ITEM_TYPE> tableFilter) {
        }
        if (drop == isDropped()) {
        }
        gridLayout.marginTop = 0;
            case SWT.MouseUp: {
        this.popup.layout();

                select(item);
                e.time = event.time;
    private boolean isDropped() {
        }
                Event e = new Event();
                textEvent(event);
                    if (oldIndex != getSelectionIndex()) {
                    break;
                e.stateMask = event.stateMask;
            itemText = "";

                }
        switch (event.type) {
    private void listEvent(Event event) {
            final int maxSize = table.getSize().x - 10;// - 2;//table.getVerticalBar().getSize().x;
        }
        ScrollBar hScrollBar = table.getHorizontalBar();
            }
    }
                    e.stateMask = event.stateMask;
    }
import org.eclipse.swt.layout.GridData;
        new TreeColumn(table, SWT.LEFT);
                        e.stateMask = event.stateMask;
                e.keyCode = event.keyCode;
            }
                }
                }
        Point size = getSize();

                itemForeground = UIStyles.getContrastColor(itemBackground);
            }

    }
        };
                    dropDown(true);
    }
                    dropDown(false);
        if (this.dropDownControl != null) {
                    e.stateMask = event.stateMask;
        gd = new GridData(GridData.FILL_VERTICAL | GridData.HORIZONTAL_ALIGN_END | GridData.VERTICAL_ALIGN_CENTER);
        boolean setEnabled(boolean enabled);
        this.visibleItemCount = count;
    @NotNull
                }
                UIUtils.asyncExec(toDispose::dispose);
                notifyListeners(SWT.Dispose, event);
                // At this point the widget may have been disposed.
            }
                    selectedItem = items.get(index + 1);
            itemBackground = UIStyles.getDefaultTextBackground();
            listStyle |= SWT.LEFT_TO_RIGHT;
                select(i);
                switch (event.detail) {
    protected void dropDown(boolean drop) {
                this.dropDownControl = null;
 * distributed under the License is distributed on an "AS IS" BASIS,
        gl.verticalSpacing = 0;
                e.character = event.character;
    public void addVerifyListener(@NotNull VerifyListener listener) {
                event.doit = e.doit;
                    selectedItem = items.get(index - 1);
import org.eclipse.swt.events.*;
                e.time = event.time;
                break;
    private ITEM_TYPE selectedItem;
            case SWT.Modify: {
        Cursor arrowCursor = getDisplay().getSystemCursor(SWT.CURSOR_ARROW);
    public void setEnabled(boolean enabled) {
        this.text.setLayoutData(gd);
            }
        }

    protected final ILabelProvider labelProvider;
            }
            text.setEnabled(enabled);
            }

                        event.doit = false;
                } else if (index > 0) {
        // create shell and list
import org.eclipse.swt.graphics.*;


    private void comboEvent(Event event) {
        Rectangle parentRect = display.map(getParent(), null, getBounds());
            if (filter != null && !filter.filter(item)) {
import org.eclipse.jface.viewers.IColorProvider;
        }
            }
        this.imageLabel.setLayoutData(new GridData(GridData.FILL_VERTICAL | GridData.HORIZONTAL_ALIGN_BEGINNING));
            if (selectedItem == items.get(index)) {
                dropDown(false);
