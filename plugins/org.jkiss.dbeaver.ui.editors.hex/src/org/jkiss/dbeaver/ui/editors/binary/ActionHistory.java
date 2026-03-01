    @Override
     *
        if (actionPosition() <= aRange.position) {  // they're == when ending an overwrite action
 * DBeaver - Universal Database Manager
        actionList = new ArrayList<>();

     * @param aRange the range being inserted
    private void startAction(ActionType type, boolean isSingle)
     */
            if (range.data instanceof Closeable) {
    private List<Range> currentAction = null;  // contains Ranges

import org.jkiss.dbeaver.ui.editors.binary.BinaryContent.Range;

     *
            (type == ActionType.INSERT || type == ActionType.OVERWRITE) && actionExclusiveEnd() != position ||
        }
                newRangePosition = position;
                actionLastRange.position -= aRange.length;

     * @param isSingle    used when integerList.size == 1 to tell whether it is a single or a piece of a block
/*
        }
    {
        previousTime = System.currentTimeMillis();
     * Adds an inserted range to a new action. Does not merge Ranges nor single actions.
                newRangeLength = 1L;
    }
            if (newRangePosition < 0L)


    {
        if (integerList.size() > 1L || !isSingle) {  // block delete
        currentActionType = null;

            if (mergedSinglesTop < 0L) {
        if (newRangePosition < 0L) {
import java.util.List;
            }
        currentActionType = type;
        if (isBackspace) {
     * Sets the last processed action as finished. Calling this method will prevent single action merging.
    void endAction()
    static enum ActionType {
    }
    private long mergedSinglesTop = -1L;

    {
        }
     * @param type     one of DELETE, INSERT or OVERWRITE
            type == ActionType.DELETE && actionPosition() != position && actionPosition() - 1L != position) {
        return new BinaryContent.Range(position, store, true);


     * Waiting time before a single action is considered separate from the previous one.
        if (isSingle && type == ActionType.INSERT) {  // never calls addInserted...
    void addInserted(BinaryContent.Range aRange)
    /**
     * Redoes last action on BinaryContent.
    private ByteBuffer newBufferFromIntegerList(List<Integer> integerList)
        currentAction = new ArrayList<>();
    {
     * @param type
            addRangeToCurrentAction(aRange);

        return actionList.toString();
    {
import java.nio.ByteBuffer;
        ByteBuffer store = ByteBuffer.allocate(integerList.size());

     *
            result = lowest.position;
    Object[] redoAction()
        }
            currentAction = null;
            currentAction.add(aRange);
    protected void finalize() throws Throwable

        if (currentAction != null && currentAction.size() > 0) {
            List<Range> oneElementList = new ArrayList<>();
package org.jkiss.dbeaver.ui.editors.binary;
        addRangeToCurrentAction(newRange);
    }
        return result;
    }
        }

        }
     *                    delete. When integerList.size() > 1 (a block delete for sure) isSingle is ignored.
    private List<Integer> deletedList = null;  // of Integers
    private BinaryContent.Range newRangeFromIntegerList(long position, List<Integer> integerList)
    }

     */
        actionsIndex = actionList.size();
        }

            BinaryContent.Range range = newRangeFromIntegerList(position, integerList);
        actionLastRange = null;
    /**
        --actionsIndex;
        return result;
            return;

            previousTime = System.currentTimeMillis();
        }
    void addLostByte(long position, Integer integer)

    private void newRangeToCurrentAction()
    Object[] undoAction()
    private ActionType currentActionType = null;
            result = newRangeExclusiveEnd;
     * Closes all files for termination
     * Tells whether an undo is possible
            if (newRangePosition < 0L) {
import java.io.Closeable;
        previousTime = System.currentTimeMillis();
    }
        long result = -1L;




        if (deletedList == null)
        endAction();
 * Consecutive single actions are merged into a block action if they are of the same type, their data
 * Block actions are sequences of BinaryContent.Range. Single actions are one range of size 1.
    /**
     *
        OVERWRITE
 */
        endAction();
        updateNewRange(position);
    private long actionPosition()
    void eventPreModify(ActionType type, long position, boolean isSingle)
     */
        newRangeLength = -1L;
    /**
 * Keeps track of actions performed on a BinaryContent so they can be undone and redone.
    }
public class ActionHistory {

        if (!canRedo()) return null;
        }
        if (!canUndo()) return null;
            disposeRanges(currentAction);
    {
    public String toString()
        if (ranges == null)
    }
        currentAction = null;
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.
        }
    {
import org.jkiss.dbeaver.utils.ContentUtils;


/**
        if (type != currentActionType ||
 *
        }
            newRangePosition = position;
                return;
        if (ranges == null) {
    {
        actionList.subList(actionsIndex, actionList.size()).clear();
    }
     */
                currentAction.get(currentAction.size() - 1);
        } else {

        if (currentActionType == ActionType.DELETE) {

    private long previousTime = 0L;
        if (currentAction == null) return;
        } else {
        content = aContent;
            newRange = (BinaryContent.Range) content.getRangeAt(newRangePosition).clone();
     *
        if (currentAction != null && currentAction.size() > 0) {
    {
    void addRangeToCurrentAction(Range aRange)
 * @author Jordi
    }
        } else {
        Object[] tuple = {currentActionType, currentAction};
    }
            previousTime = System.currentTimeMillis();
 * Licensed under the Apache License, Version 2.0 (the "License");
                return;
    ActionHistory(BinaryContent aContent)
    private long newRangePosition = -1L;
    private static final int MERGE_TIME = 1500;  // milliseconds
    private List<Object[]> actionList = null;  // contains ArrayLists (from currentAction)
        long newRangeExclusiveEnd = newRangePosition + newRangeLength;
        long result = 0L;

    /**
     * @return true if something can be redone
    /**
        }
    {
    {
 *
    }
    {

    {
            if (actionLastRange.compareTo(aRange) > 0) {

        if (currentAction != null) {
            deletedList.add(integer);
        for (Range range : ranges) {
    {
            content.commitChanges();
        actionLastRange = aRange;
        return currentAction != null || actionsIndex > 0;
            addLostByte(position, integerList.get(0));

        currentAction.add(aRange);
        }
            deletedList = null;
    public boolean canRedo()


     */
                // merging singles shifts aRange
     * @param position    starting delete point
            newRangeToCurrentAction();

                aRange.position = mergedSinglesTop++;

            ++newRangeLength;

    /**
            addLostRange(range);
    private BinaryContent.Range actionLastRange = null;

    private void disposeRanges(java.util.List<Range> ranges)

     */
    /**
            BinaryContent.Range highest =
        mergingSingles = isSingle;
            }
        dispose();
     * Tells whether a redo is possible
    void addLostRanges(java.util.List<Range> ranges)
    }
     */
     * @param position

            }
 * limitations under the License.
        mergedSinglesTop = -1L;
    }

            newRangeToCurrentAction();
        if (aContent == null)
            content.actionsOn(true);
     * Must be called after each block action.
    }
     * @param integerList deleted integers
    private int actionsIndex = 0;
                actionLastRange.dataOffset -= aRange.length;
            store.put(anIntegerList.byteValue());

            } else {
    }
     * Undoes last action on BinaryContent.
            updateNewRange(position);

     */
    {
        ByteBuffer store = newBufferFromIntegerList(integerList);

    private long actionExclusiveEnd()

 *     http://www.apache.org/licenses/LICENSE-2.0
            for (Object[] tuple : actionList) {

    }
    void addLostRange(BinaryContent.Range aRange)
        if (mergingSingles) {

        return actionList.get(actionsIndex++);
     * User event: single/block delete/insert/overwrite. Called before any change has been done
 */
            isBackspace = actionPosition() > position;


     */
 * Unless required by applicable law or agreed to in writing, software
        if (currentActionType == ActionType.OVERWRITE && mergingSingles) {
                ContentUtils.close((Closeable) range.data);
     * @param isSingle whether the action is a single byte or more

            startAction(type, isSingle);
 * distributed under the License is distributed on an "AS IS" BASIS,
    private void mergeRange(BinaryContent.Range aRange)
            }
    private BinaryContent content = null;
        } else {  // currentActionType == INSERT || currentActionType == OVERWRITE

    }
                disposeRanges(ranges);
            result = highest.exclusiveEnd();
    }
        isBackspace = false;
}
    {
        if (actionLastRange == null || actionLastRange.data != aRange.data) {
            currentAction.add(0, aRange);
    {
        }
                @SuppressWarnings("unchecked")
    void addDeleted(long position, List<Integer> integerList, boolean isSingle)
        for (Integer anIntegerList : integerList) {
    }
            System.currentTimeMillis() - previousTime > MERGE_TIME ||
    }


    {
    /**
            addLostRanges(oneElementList);
        newRangePosition = -1L;
        actionList.add(tuple);
            if (newRangePosition > position) {  // Backspace (BS)
    private long newRangeLength = -1L;
        }

        if (actionList != null) {
                mergedSinglesTop = aRange.exclusiveEnd();
     */
            deletedList.add(0, integer);
				List<Range> ranges = (List<Range>) tuple[1];
    /**
            content.actionsOn(false);
            BinaryContent.Range lowest = currentAction.get(0);
                newRangePosition = aRange.position;

     *
            newRange = newRangeFromIntegerList(newRangePosition, deletedList);

    void dispose()
            }

        endAction();

     * @see Object#finalize()



        } else {
    }
    {
     * Starts the processing of a new action.

     */
            }
    {
     * Adds a list of deleted integers to the current action. If possible, merges integerList with the list
            actionList = null;
        INSERT,
        for (Range range : ranges) {

        }
    {
        if (mergingSingles)
     * Current value is 1500 milliseconds.
    }
    private void updateNewRange(long position)


        return actionsIndex < actionList.size() && currentAction == null;
                ++newRangeLength;
        }
            result = newRangePosition;
            if (deletedList == null)
    /**

            throw new NullPointerException("null content");
 * Copyright (C) 2010-2024 DBeaver Corp and others
    {
        return store;

            !isSingle ||
            } else if (currentActionType == ActionType.DELETE && !isBackspace) {

     * Create new action history storage object
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        super.finalize();
            newRangeLength = 1L;
    {
        } else {  // delete(Del) or overwrite
    }
            return;
        }
        mergeRange(aRange);
     * in the previous call to this method.

        DELETE,
            actionLastRange.length += aRange.length;
     */
                newRangePosition = aRange.position;
 * is contiguous, and are performed with a time difference lower than MERGE_TIME.
    private boolean isBackspace = false;
            deletedList = new ArrayList<>();
    {
 * Actions can be single or block deletes, inserts or overwrites.
            oneElementList.add(range);
    {
    }
 *
        } else {
     *
        return actionList.get(actionsIndex);
 *
    public boolean canUndo()
        store.position(0);
        BinaryContent.Range newRange;
        if (newRangeExclusiveEnd > result)
    private boolean mergingSingles = false;
 * You may obtain a copy of the License at
    /**

        if (result < 0 || newRangePosition >= 0 && newRangePosition < result)
     * @return true if something can be undone
import java.util.ArrayList;
    }
