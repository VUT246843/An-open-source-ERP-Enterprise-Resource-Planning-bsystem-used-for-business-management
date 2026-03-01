                    statusLine.updateSelectionValueText(hexEditControl.getSelection(), hexEditControl.getActualValue());
	}

        if (aListener == null) return;
    private String defWidth;
        if (hexEditControl != null) throw new IllegalStateException("Editor part exists already");
import org.eclipse.swt.events.SelectionListener;
     */
        return hexEditControl.getSelection();
    {
                        @Override
    public void addLongSelectionListener(SelectionListener listener)
    public void setTextFont(FontData aFont)
     */
    public boolean canRedo()
    /**
    }
     */
     *
    public boolean isOverwriteMode()
            @Override

     * @see HexEditControl#setSelection(long, long)
    {
    {
 * You may obtain a copy of the License at
     * @param newContent the content to be edited
                // awake periodically so it returns when task has finished

            hexEditControl.setFont(fontText);
    /**
    public void addListener(Listener aListener)
        });
        } else {
    {

     * status
     * Creates editor part of parent application. Can only be called once per Manager object.
    public long[] getSelection()
            else if (fixedHigher[i] < movingLower[i])

        hexEditControl.addDisposeListener(new DisposeListener() {
        }

            //getSite().registerContextMenu(menuManager, this);
import java.util.List;

 */
                    display.timerExec(300, new Runnable() {
        thread.start();
import org.eclipse.jface.action.MenuManager;
     */
        hexEditControl.deleteSelected();
        this.menuListener = menuListener;

     * Set the editor text font.
    /**
     * Causes the text areas to have the keyboard focus
     */

     * While in insert mode, deletes the selection
     * Cuts selection into clipboard
		this.defWidth = defValue;
                        public void run()


     */
            if (listOfLongListeners == null)
    void dispose()
        if (hexEditControl == null) return;
     * @param task independent of the user interface thread (no widgets used)
        Rectangle fixed = fixedShell.getBounds();
            if (!display.readAndDispatch()) {
 * Licensed under the Apache License, Version 2.0 (the "License");
    public HexEditControl getControl()
 *
    }
        if (HexEditControl.DEFAULT_FONT_DATA.equals(fontData))
    }
                }
    }

		if (defWidth != null) {
     * @throws IOException when a file has no read access
        if (fontData != null) {

    {
            contextMenu = menuManager.createContextMenu(hexEditControl.getPreviewText());

 * before any menu actions.
     */
            hexEditControl.setFont(fontText);
        }
        long[] selection = hexEditControl.getSelection();
    {
     *
    {
        });
    private Font fontText = null;

    /**
            hexEditControl.setFocus();
        return hexEditControl != null && hexEditControl.canRedo();
    /**
 * limitations under the License.
        if (findDialog == null) {
 * Unless required by applicable law or agreed to in writing, software
    public void doSelectAll()

        if (hexEditControl != null)
     * Redoes the last undone action
            if (listOfStatusChangedListeners == null)
     */

    }
    }

                    statusLine.updatePositionValueText(hexEditControl.getCaretPos(), hexEditControl.getActualValue());
    }

    {
    private List<SelectionListener> listOfLongListeners = null;
    }
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
    }
        findDialog.open();
import org.eclipse.swt.events.DisposeEvent;
        hexEditControl.selectAll();
import org.eclipse.swt.graphics.Font;
		
            });

     *
     */
/*
     * Open find dialog
    /**
                }
        if (parent == null) throw new NullPointerException("Null parent");
    /**
    /**
    }
     *
        fontText = null;
     * @param aFont new font to be used; should be a constant char width font. Use null to set to the
        if (listOfLongListeners != null) {
                    statusLine.updateInsertModeText(hexEditControl == null || !hexEditControl.isOverwriteMode());

    {
    public Composite createEditorPart(Composite parent, int style)
            {
    {
        hexEditControl.undo();


     * @return the content being edited
                if (hexEditControl.isSelected())
 */

        textsParent = parent;
                if (fontText != null && !fontText.isDisposed())
		return defWidth;
    private FindReplaceDialog findDialog = null;

        int[] fixedHigher = {fixed.x + fixed.width, fixed.y + fixed.height};
    }

    public boolean isDirty()
import org.jkiss.dbeaver.ui.editors.binary.dialogs.FindReplaceDialog;
import org.eclipse.swt.widgets.*;
		}
     * @return true: an action ca be undone
    {
    /**
                    });
            if (movingLower[i] + movingSpan[i] < fixedLower[i])
    private IMenuListener menuListener;
        if (hexEditControl == null) {
        }
    /**

     * @throws NullPointerException  if textsParent is null
     * @return if changes have been performed
    public void doPaste()

    {
 *     http://www.apache.org/licenses/LICENSE-2.0
                    fontText.dispose();
     * @return true: overwriting, false: inserting
     * Tells whether the input has text selected
        while (thread.isAlive() && !display.isDisposed()) {
     */
     * Undoes the last action
        return hexEditControl;
            listOfStatusChangedListeners.add(aListener);

import org.eclipse.jface.action.IMenuManager;
        {
        content = newContent;
        int[] fixedLower = {fixed.x, fixed.y};
     */
                hexEditControl.showMark(location);

 * Manager of the javahexeditor application, either in its standalone or Eclipse plugin version.
    /**
        if (hexEditControl == null) {
     * Helper method to make a shell come closer to another shell
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    /**
     *
    }
            }
     * Get the binary content

    public void doCopy()
    public void setContent(@NotNull BinaryContent newContent, String charset) {
            }
            fontToDispose.dispose();
 *
 * DBeaver - Universal Database Manager
            statusLine.updateInsertModeText(hexEditControl == null || !hexEditControl.isOverwriteMode());
    {
    }
    public static void blockUntilFinished(Runnable task)
 * you may not use this file except in compliance with the License.
    }
        if (content != null) {

    /**
            @Override
                movingLower[i] = fixedLower[i] - movingSpan[i] + 10;
            for (SelectionListener listOfLongListener : listOfLongListeners) {
                if (!pollerEnabled[0]) {
            fontData = null;
    }
import java.io.File;
    }
    /**
    {
 *
     */
     */
            // Context menu
     * Tells whether the input is in overwrite or insert mode

    public void doDelete()
        hexEditControl.redo();
     * @return true: text is selected, false: no text selected
    private FontData fontData = null;  // when null uses default font
        }
                fontText = new Font(Display.getCurrent(), fontData);
        setContent(new BinaryContent(aFile), charset);
     * @return true: an action ca be redone
    /**
        if (listener == null)
                statusLine.updatePositionValueText(0L, (byte) 0);
import org.jkiss.code.NotNull;
    {
    }
        }
     * @param listener the listener
        int[] movingLower = {moving.x, moving.y};
     * @param aFile the file to be edited
    }
     */
            hexEditControl.addLongSelectionListener(listener);
        if (fontToDispose != null && !fontToDispose.isDisposed())
    {
 * @author Jordi
        }
    }
    {

     * Add a listener to changes of the 'dirty', 'insert/overwrite', 'selection' and 'canUndo/canRedo'


            {
     *
        hexEditControl.cut();
        hexEditControl.setSelection(start, end);
	

            } else {
     */
            if (button == 1)
     * Blocks the caller until the task is finished. Does not block the user interface thread.
 * Copyright (C) 2010-2024 DBeaver Corp and others
	public String getDefaultWidth() {

        hexEditControl = new HexEditControl(textsParent, style);
        final boolean[] pollerEnabled = {false};
     * Pastes clipboard into editor

            menuManager.setRemoveAllWhenShown(true);
     * Tells whether the last action can be redone

            if (hexEditControl != null) {
    {
/**
     */
            hexEditControl.addListener(SWT.Modify, aListener);
 *
			hexEditControl.setDefWidth(Integer.valueOf(defWidth));
     * Copies selection into clipboard
            hexEditControl.getPreviewText().setMenu(contextMenu);



        hexEditControl.addListener(SWT.Modify, new Listener() {
        if (content.length() < 1L) return;
	}
     * @param parent composite where the part will be drawn.
                if (statusLine != null)
        if (hexEditControl == null) return false;
     *
     */
        //hexEditControl.addLongSelectionListener(new ControlSelectionAdapter(ControlSelectionAdapter.UPDATE_POSITION_TEXT));
        } else {
     *
        if (statusLine != null) {
        Display display = Display.getCurrent();
     *
    public boolean isTextSelected()

     */

            findDialog = new FindReplaceDialog(textsParent.getShell());
            content.dispose();
     * @param fixedShell  where movingShell will get closer to
    }
        return hexEditControl == null || hexEditControl.isOverwriteMode();

    }
                movingLower[i] = fixedHigher[i] - 10;
        int[] movingSpan = {moving.width, moving.height};
    public void openFile(File aFile, String charset)
    public static void reduceDistance(Shell fixedShell, Shell movingShell)
    /**
    {
                @Override
 * Manages creation of widgets, and executes menu actions, like File->Save. Call createEditorPart()

                else
            listOfLongListeners = null;
     * Adds a long selection listener. Events sent to the listener have long start and end points.
    private Composite textsParent = null;
    /**
     *
            fontText = new Font(Display.getCurrent(), fontData);
import org.eclipse.swt.graphics.FontData;
import org.eclipse.jface.action.IMenuListener;
     */
            goToDialog = new GoToDialog(textsParent.getShell());
    }
    // visual controls

     * @param movingShell shell to be relocated

import java.util.ArrayList;

        }
                    }
    public void setMenuListener(IMenuListener menuListener)
        for (int i = 0; i < 2; ++i) {
    public void doRedo()
    private HexEditControl hexEditControl = null;
        hexEditControl.setCharset(charset);
        return content != null && content.isDirty();

                    pollerEnabled[0] = true;
    public void setFocus()
    

        if (hexEditControl != null) {
        if (hexEditControl == null) return;
        }
    public void doFind()
    /**
    {
        return content;
            }
        }
        if (goToDialog == null)
            return new long[]{0L, 0L};
     * Open 'go to' dialog

    public void setSelection(long start, long end)
     *
     *              default font.
 * See the License for the specific language governing permissions and

     */
            }

        if (hexEditControl == null) return;
    /**

                public void menuAboutToShow(IMenuManager manager)
    public BinaryContent getContent()
    {
                {
     * Delegates to HexTexts.setSelection(start, end)

        if (hexEditControl == null) return;
            else
            MenuManager menuManager = new MenuManager();
                        menuListener.menuAboutToShow(manager);
import org.jkiss.dbeaver.ui.editors.binary.dialogs.GoToDialog;
     *
        movingShell.setLocation(movingLower[0], movingLower[1]);
        }

     *
        if (hexEditControl == null) {
     */

        }
    /**
    }
            }
                display.sleep();


public class HexManager {

        throws IOException
            listOfLongListeners.add(listener);
    {
    /**
            }
    public void doGoTo()
    }

        }
    {
package org.jkiss.dbeaver.ui.editors.binary;
     * Selects all file contents in editor
            menuManager.addMenuListener(new IMenuListener() {
    }
            long button = goToDialog.getButtonPressed();
            public void widgetDisposed(DisposeEvent e)
    /**
            Menu contextMenu = menuManager.createContextMenu(hexEditControl.getHexText());
            for (Listener listOfStatusChangedListener : listOfStatusChangedListeners) {
    public void doCut()

    public boolean canUndo()
        if (location >= 0L) {
    /**

    private GoToDialog goToDialog = null;
                hexEditControl.selectBlock(location, location);
 * distributed under the License is distributed on an "AS IS" BASIS,
     *
                        {
        }

            if (fontData != null)
                listOfLongListeners = new ArrayList<>();
            listOfStatusChangedListeners = null;
            public void handleEvent(Event event)
    /**
    private BinaryContent content = null;
     */
            throw new IllegalArgumentException();
    {
            content.dispose();
     * Get whether the content has been modified or not
        hexEditControl.paste();
        }

    public void doUndo()
            hexEditControl.getHexText().setMenu(contextMenu);
        return hexEditControl;
                listOfStatusChangedListeners = new ArrayList<>();
     * @throws IllegalStateException when editor part exists already (method called twice or more)
        findDialog.setTarget(hexEditControl);
     *
    }
    private List<Listener> listOfStatusChangedListeners = null;
    /**
        Rectangle moving = movingShell.getBounds();
        }
    }
import java.io.IOException;
import org.eclipse.swt.events.DisposeListener;
}
    {
        hexEditControl.setContentProvider(content, true);
    {
                hexEditControl.addLongSelectionListener(listOfLongListener);

     * Open file for editing
        if (listOfStatusChangedListeners != null) {
    {
        Font fontToDispose = fontText;
                            pollerEnabled[0] = false;

     */
                    if (menuListener != null) {
        Thread thread = new Thread(task);
     * Tells whether the last action can be undone
        return hexEditControl != null && hexEditControl.canUndo();
     * @see HexEditControl#getSelection()
    /**
                hexEditControl.addListener(SWT.Modify, listOfStatusChangedListener);




     * Sets new content for editing
        // dispose it after setting new one (StyledTextRenderer 3.448 bug in line 994)

    private HexStatusLine statusLine = null;
     */
     */
                        }
        return selection[0] != selection[1];

     */
     * @param aListener the listener to be notified of changes
	public void setDefWidth(String defValue) {

    }
        if (content != null) {
    {
    }
        fontData = aFont;

        hexEditControl.copy();
        long location = goToDialog.open(content.length() - 1L);
