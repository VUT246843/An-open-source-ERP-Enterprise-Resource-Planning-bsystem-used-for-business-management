
        });
                gc.dispose();
                Rectangle columnBounds = dragItem.getBounds();
    public TabFolderReorder(CTabFolder folder) {
        } else {

import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.graphics.Image;
            public void dragStart(DragSourceEvent event) {
    public final static class TabTransfer extends LocalObjectTransfer<CTabItem> {
                handleDragEvent(event);
public class TabFolderReorder
                    CTabItem item = folder.getItem(new Point(point.x, point.y));
        }
            public void dragOver(DropTargetEvent event)
                handleDragEvent(event);
            for (int i = from + 1; i <= to; i++) {
    public void swapTabs(@NotNull CTabItem src, @NotNull CTabItem dst) {
        dropTarget.addDropListener(new DropTargetListener() {
 *
            }



            }
import org.eclipse.swt.custom.CTabFolder;
    }
            {

        source.setTransfer(TabTransfer.INSTANCE);

        Event dstEvent = new Event();
        folder.setSelection(dst);
            {

        }
        src.setShowClose(dst.getShowClose());
                swapTabs(currTabItem, nextTabItem);
    }
        }
                if (!isDropSupported(folder, event)) {
                currTabItem = nextTabItem;
 * DBeaver - Universal Database Manager
                gc.copyArea(
            public void dropAccept(DropTargetEvent event)

        protected String[] getTypeNames() {
        @Override
 * distributed under the License is distributed on an "AS IS" BASIS,
        dst.setData(dragData);
            @Override
            {
                    dragImage = null;
            public void dragSetData (DragSourceEvent event) {
                }

            }
        }
        final boolean dragShowClose = src.getShowClose();
        folder.notifyListeners(ITEM_MOVE_EVENT, srcEvent);
        dst.setToolTipText(dragToolTip);
        DropTarget dropTarget = new DropTarget(folder, DND.DROP_MOVE);
package org.jkiss.dbeaver.ui.controls;

                    dragImage.dispose();
 */
        public static final TabTransfer INSTANCE = new TabTransfer();
        if (src == dst) {
                    columnBounds.x,
import org.eclipse.swt.widgets.Event;
            return;
        private static final int TYPEID = registerType(TYPE_NAME);

            {

            @Override

            @Override
                GC gc = new GC(folder);
import org.jkiss.code.NotNull;

    public static final int ITEM_MOVE_EVENT = 1001;
 * Copyright (C) 2010-2024 DBeaver Corp and others

            }
        src.setToolTipText(dst.getToolTipText());
                swapTabs(currTabItem, nextTabItem);
            public void dragLeave(DropTargetEvent event)
        if (from < to) {
            }
import org.eclipse.swt.widgets.Control;
     * The tab folder item move event.
        dst.setControl(dragControl);
                    return false;

        final Object dragData = src.getData();
            public void dragFinished(DragSourceEvent event) {
            }
                event.image = dragImage;
        dstEvent.widget = folder;
                }
    /**
import org.eclipse.swt.graphics.GC;
 */
        dst.setShowClose(dragShowClose);
        if (from == to) {
        final Control dragControl = src.getControl();
}            }
        final Image dragImage = src.getImage();
            }
        protected int[] getTypeIds() {
        @Override
                if (dragItem == null) {
                    }
                    dragImage = null;
        final String dragText = src.getText();
        this.folder = folder;
        CTabItem currTabItem = folder.getItem(from);
 * you may not use this file except in compliance with the License.
        Event srcEvent = new Event();
 * Unless required by applicable law or agreed to in writing, software
    }
            @Override
                event.feedback = DND.FEEDBACK_SELECT | DND.FEEDBACK_SCROLL;
                    return;
                }
        src.setText(dst.getText());
                Point point = folder.toControl(folder.getDisplay().getCursorLocation());
import org.jkiss.dbeaver.ui.dnd.LocalObjectTransfer;
 * You may obtain a copy of the License at
                if (dragImage != null) {
        srcEvent.widget = folder;
 *

 * limitations under the License.
                CTabItem item = folder.getItem(new Point(point.x, point.y));
            private void handleDragEvent(DropTargetEvent event)
                    columnBounds.y);
            public void drop(DropTargetEvent event)
                handleDragEvent(event);
        dropTarget.setTransfer(TabTransfer.INSTANCE, TextTransfer.getInstance());
                    Point point = folder.toControl(folder.getDisplay().getCursorLocation());
                } else {
            }
            @Override
                dragItem = folder.getItem(point);
        srcEvent.item = src;
import org.eclipse.swt.graphics.Rectangle;
                if (dragImage != null) {
            private Image dragImage;
        private static final String TYPE_NAME = "TabTransfer.CTabItem Transfer" + System.currentTimeMillis() + ":" + INSTANCE.hashCode();//$NON-NLS-1$
                    dragImage,
                        moveTab(folder, folder.indexOf(dragItem), folder.indexOf(item));
    private final CTabFolder folder;

                Point point = folder.toControl(folder.getDisplay().getCursorLocation());
 *
            {
                nextTabItem = folder.getItem(i);
    }
                return item != null && dragItem.getShowClose() == item.getShowClose();
                currTabItem = nextTabItem;
            return;
        });


 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        folder.notifyListeners(ITEM_MOVE_EVENT, dstEvent);
            @Override
                }
{
     */
        src.setControl(dst.getControl());
            }

                handleDragEvent(event);

            @Override
                    dragImage.dispose();
            @Override
 * See the License for the specific language governing permissions and
                nextTabItem = folder.getItem(i);
        dstEvent.item = dst;
        }
        source.addDragListener (new DragSourceListener() {
        final DragSource source = new DragSource(folder, DND.DROP_MOVE);
            return new int[] { TYPEID };
            @Override
    public void moveTab(@NotNull CTabFolder folder, int from, int to) {
                    if (item != null && dragItem != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Display;
            }
            }
                }
    private CTabItem dragItem;
        }
import org.eclipse.swt.graphics.Point;
        src.setImage(dst.getImage());
                if (event.detail == DND.DROP_MOVE) {
            public void dragOperationChanged(DropTargetEvent event)

 * Licensed under the Apache License, Version 2.0 (the "License");
            private boolean isDropSupported(CTabFolder folder, DropTargetEvent event)
            {

        dst.setText(dragText);
                handleDragEvent(event);
                    event.detail = DND.DROP_MOVE;

        final String dragToolTip = src.getToolTipText();
            public void dragEnter(DropTargetEvent event)

        CTabItem nextTabItem;
/*
                    event.detail = DND.DROP_NONE;
        private TabTransfer() {
import org.eclipse.swt.dnd.*;
            {
            {
            for (int i = from - 1; i >= to; i--) {
        src.setData(dst.getData());
 * TabFolderReorder
                }
                event.data = dragItem;


/**
        dst.setImage(dragImage);
            }
                if (dragItem == null) {
                handleDragEvent(event);
            return new String[] { TYPE_NAME };
                dragImage = new Image(Display.getCurrent(), columnBounds.width, columnBounds.height);

