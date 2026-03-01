        });
            }
    }
        rightList = createList(this);
    }
            public void mouseDoubleClick(MouseEvent e) {
    public void setModel(Collection<ELEMENT> leftElements, Collection<ELEMENT> rightElements)
            Composite buttonsPane = new Composite(this, SWT.NONE);
                @Override

        rightLabel.setText(rightTitle);
        {
 */
            public void handleEvent (Event e) {

        Event event = new Event();

 *
            @Override
            GridLayout gl = new GridLayout(1, false);
    public static final int MOVE_RIGHT = 1;
        Table fromTable = toRight ? leftList : rightList;
        updateControls();
            selListener.widgetSelected(null);
    {

        return button;
    }
    {

            btnMoveRightAll.setEnabled(false);
                @Override
    }

                    moveElements(false);
        movedFont = UIUtils.modifyFont(getFont(), SWT.ITALIC);

/**
        GridData gd = new GridData(GridData.FILL_BOTH);
    {
        int style,
        }
        super(parent, style);
        Label rightLabel = new Label(this, SWT.NONE);
            });
        leftList.addSelectionListener(selListener);

        list.removeAll();

 * Copyright (C) 2010-2024 DBeaver Corp and others
            btnMoveLeft.setEnabled(false);
        return table;
                moveElements(false);
                newItem.setFont(movedFont);



            final Button btnMoveLeftAll = createButton(buttonsPane, DBeaverIcons.getImage(UIIcon.ARROW_LEFT_ALL), new SelectionAdapter() {
    public static final int MOVE_LEFT = 0;
        createPairList(leftTitle, rightTitle);
    {
    private SelectionListener selListener;
        leftList = createList(this);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            });
    private Table rightList;
        Label leftLabel = new Label(this, SWT.NONE);
    }
        for (ELEMENT element : movedElements) {

        final TableColumn column = new TableColumn(table, SWT.LEFT);
    {

        }

                @Override
                }
        setListData(leftList, this.leftElements = leftElements);
import org.jkiss.dbeaver.ui.UIIcon;
                    moveElements(false);
        fromTable.remove(fromTable.getSelectionIndices());
 */
                    moveElements(true);

                }
                public void widgetSelected(SelectionEvent e) {
        setListData(rightList, this.rightElements = rightElements);
        button.setImage(label);
                public void widgetSelected(SelectionEvent e) {
                    btnMoveRightAll.setEnabled(leftList.getItemCount() > 0);
 * See the License for the specific language governing permissions and

                    rightList.selectAll();
        event.detail = toRight ? MOVE_RIGHT : MOVE_LEFT;
            super.notifyListeners(SWT.Modify, event);
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
        leftList.addMouseListener(new MouseAdapter() {
    }
            createButton(buttonsPane, DBeaverIcons.getImage(UIIcon.ARROW_RESET), new SelectionAdapter() {
            selListener = new SelectionAdapter() {
 * You may obtain a copy of the License at
package org.jkiss.dbeaver.ui.controls;
        });
                    btnMoveRight.setEnabled(leftList.getSelectionCount() > 0);
            movedElements.add(element);
                    setListData(leftList, leftElements);
        return item;
            });
        table.addListener (SWT.Resize,  new Listener() {
 *     http://www.apache.org/licenses/LICENSE-2.0
        GridData gd = new GridData(GridData.FILL_BOTH);
    private Button createButton(Composite panel, Image label, SelectionListener listener)
                public void widgetSelected(SelectionEvent e) {
                moveElements(true);
                    btnMoveLeftAll.setEnabled(rightList.getItemCount() > 0);
        for (TableItem item : fromTable.getSelection()) {
            event.data = element;

        button.addSelectionListener(listener);
    }
        if (selListener != null) {
import java.util.Collection;
        });

        Table toTable = toRight ? rightList : leftList;
            gd = new GridData(GridData.VERTICAL_ALIGN_CENTER);
    private void setListData(Table list, Collection<ELEMENT> elements)

        String leftTitle,
            @Override
            createListItem(list, element);
import java.util.List;

                    btnMoveLeft.setEnabled(rightList.getSelectionCount() > 0);

                @Override
    public PairListControl(
        rightList.addMouseListener(new MouseAdapter() {
                column.setWidth(table.getClientArea().width);
            });
        rightList.addSelectionListener(selListener);
        }
        List<ELEMENT> movedElements = new ArrayList<>();
    private TableItem createListItem(Table list, Object element) {

                }
        item.setText(element.toString());
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.graphics.Font;
                public void widgetSelected(SelectionEvent e) {
    private void createPairList(String leftTitle, String rightTitle)
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Image;
        button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            btnMoveRight.setEnabled(false);
                @Override

        TableItem item = new TableItem(list, SWT.NONE);
        event.widget = this;
 *
        Composite parent,
        item.setData(element);
        }
        final Table table = new Table(panel, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
            }
        this.setLayout(new GridLayout(3, false));
import org.jkiss.dbeaver.ui.DBeaverIcons;
                    leftList.selectAll();
        this.setLayoutData(gd);
        leftLabel.setText(leftTitle);
import org.jkiss.dbeaver.ui.UIUtils;
        for (ELEMENT element : elements) {
import org.eclipse.swt.events.*;
import org.jkiss.dbeaver.Log;
    private Table createList(Composite panel)
    private List<ELEMENT> movedElements = new ArrayList<>();
                }
            buttonsPane.setLayout(gl);

            }
import org.eclipse.swt.SWT;
    private Collection<ELEMENT> leftElements;
                }
        table.setLayoutData(gd);


            TableItem newItem = createListItem(toTable, element);
    private void moveElements(boolean toRight)
            if (!checkList.contains(element)) {
/*
import org.eclipse.swt.layout.GridLayout;
 * DBeaver - Universal Database Manager
            buttonsPane.setLayoutData(gd);
    {
            }
        new Label(this, SWT.NONE);
            final Button btnMoveLeft = createButton(buttonsPane, DBeaverIcons.getImage(UIIcon.ARROW_LEFT), new SelectionAdapter() {
            btnMoveLeftAll.setEnabled(false);
    private void updateControls() {
            };
            final Button btnMoveRight = createButton(buttonsPane, DBeaverIcons.getImage(UIIcon.ARROW_RIGHT), new SelectionAdapter() {
import java.util.ArrayList;
    private static final Log log = Log.getLog(PairListControl.class);
            gd.minimumWidth = 50;
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
 * limitations under the License.
public class PairListControl<ELEMENT> extends Composite
    }
    {
    private Collection<ELEMENT> rightElements;
            });
            ELEMENT element = (ELEMENT) item.getData();

            public void mouseDoubleClick(MouseEvent e) {
        }
                public void widgetSelected(SelectionEvent e) {

}                    setListData(rightList, rightElements);
            final Button btnMoveRightAll = createButton(buttonsPane, DBeaverIcons.getImage(UIIcon.ARROW_RIGHT_ALL), new SelectionAdapter() {


        String rightTitle)
                    moveElements(true);

        Button button = new Button(panel, SWT.PUSH);
        Collection<ELEMENT> checkList = toRight ? rightElements : leftElements;

        updateControls();
import org.eclipse.swt.widgets.*;
                @Override
    }
    private Table leftList;
{
                public void widgetSelected(SelectionEvent e) {
            @Override

 * PairListControl

    private Font movedFont;
                }
