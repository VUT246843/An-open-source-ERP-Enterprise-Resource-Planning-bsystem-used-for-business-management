            viewerComponent.getDocument().removePositionUpdater(updater);

            IDocument document = viewerComponent.getDocument();
        }
 *
                return;
            if (standaloneOperation && currentState == RenderState.SHOWING) {
    private final ITextViewer viewerComponent;
    }
                    drawHintContent(event.gc);
        if (viewerComponent.getDocument() != null) {

/*
 * limitations under the License.
import java.util.concurrent.Semaphore;
     *
            return content.isEmpty();
    public void deactivate(boolean redraw) {
    private String extractCurrentWord() {
 * distributed under the License is distributed on an "AS IS" BASIS,
        String lineContent = widget.getText().substring(0, position);
        }
    private enum RenderState {
        if (textLines.length > 0) {
    public void disable(boolean clearContent) {
        activeHint = HintContent.initialize(activeHint.getPosition(), "");

    }
        UIUtils.asyncExec(() -> {
        }
    public boolean hasContentToShow() {
        } catch (InterruptedException e) {
    }
                    drawHintContent(event.gc);

        if (lockObject.availablePermits() == 0) {
        int position = activeHint.getPosition();
        gc.setBackground(getTextWidget().getBackground());
    public static final String HINT_CATEGORY = "suggestion";
        REMOVING
                    break;
            this.content = content == null ? "" : content;
            return false;
            int modelPosition = TextRenderingUtils.widgetOffset2ModelOffset(viewerComponent, activeHint.getPosition());
        try {
    public void removeHint() {
                drawHintContent(event.gc);

    public void applyHint() {
        this.suggestionBackground = color;

     */
    private HintContent activeHint;
        textWidget.removePaintListener(this);
        private final int position;


                    break;
        StyledText textWidget = getTextWidget();
import org.eclipse.swt.custom.LineBackgroundEvent;
     *
            viewerComponent.getDocument().removePositionCategory(HINT_CATEGORY);
                return;
        if (this.repainting) {
        this.fontColor = color;
    private final Semaphore lockObject;
        }
    private void configureGraphicsContext(GC gc) {
import org.jkiss.code.NotNull;
        UIUtils.asyncExec(() -> ((ITextViewerExtension2) viewerComponent).addPainter(this));
        this.currentState = RenderState.REMOVING;
        try {
    private static final Log log = Log.getLog(SQLSuggestionTextPainter.class);
    public void lineGetBackground(LineBackgroundEvent event) {
        getTextWidget().redraw();
            viewerComponent.getDocument().addPositionUpdater(updater);
            viewerComponent.getDocument().addPositionCategory(HINT_CATEGORY);
            StyledText textWidget = getTextWidget();
    public void dispose() {

        UIUtils.asyncExec(this::executeRemove);
public class SQLSuggestionTextPainter implements IPainter, PaintListener, LineBackgroundListener {
    @Override
    }
import java.util.concurrent.TimeUnit;
        StyledText widget = getTextWidget();
 * Licensed under the Apache License, Version 2.0 (the "License");


    }
        currentState = RenderState.IDLE;

        if (!wordPrefix.isEmpty() && fragment.toLowerCase().startsWith(wordPrefix.toLowerCase())) {

        return viewerComponent.getTextWidget();
        }
}
    public void setPositionManager(IPaintPositionManager manager) {
            return content.split("\\R", 2);

    private boolean tryLock() {
    @Override
    }
                TextRenderingUtils.drawNextLines(textLines[1], gc, getTextWidget(), position);
                default:
    }
    private void executeShow(String text, int cursorPosition) {
     */
        this.viewerComponent = viewer;
 *     http://www.apache.org/licenses/LICENSE-2.0
    }


import org.eclipse.swt.graphics.GC;
    @Override

    @Override
            // prevent recursive invocation while asking text viewer to draw original text fragments during hint rendering
     * @param clearContent if true, removes any displayed hint before disabling the painter.
        viewerComponent.getDocument().removePositionUpdater(updater);
            this.repainting = true;
 * DBeaver - Universal Database Manager
        try {

        }

        }
        String fragment = text;
    private IPositionUpdater updater;
    /**
        String wordPrefix = extractCurrentWord();
        static HintContent initialize(int position, String content) {
    private static class HintContent {
        disable(redraw);
        }
        }
package org.jkiss.dbeaver.ui.editors.sql.suggestion;
        return getTextWidget().getCaretOffset();

        configureGraphicsContext(gc);
        if (!isEnabled) {
    public void paint(int reason) {
 * You may obtain a copy of the License at

    public void enable() {
    }
    private volatile boolean repainting = false;
        return currentState != RenderState.IDLE;
    }
        }
        }
    public void paintControl(PaintEvent event) {
            }
            return;
        activeHint = HintContent.initialize(cursorPosition, fragment);
                case SHOWING:
        }
    }
import org.eclipse.swt.graphics.Color;
        getTextWidget().redraw();
            return new HintContent(position, content);
        private final String content;
        if (!isEnabled) {
    /**
        return activeHint != null ? activeHint.getPosition() : -1;
    private void executeRemove() {
 * Unless required by applicable law or agreed to in writing, software
    }
    public boolean isProcessing() {
            if (!hasContentToShow()) {
import org.eclipse.swt.custom.StyledText;
            return;
        if (clearContent) {
            return;
        }
    private void resetState() {
        }
import org.jkiss.dbeaver.Log;

            gc.setForeground(fontColor);
    private boolean isEnabled;
    }
        String[] textLines = activeHint.getTextLines();
        String getContent() {
            return;
            }
    public void showHint(@NotNull String content, int cursorPosition) {
    }

        isEnabled = false;

            TextRenderingUtils.drawFirstLine(textLines[0], gc, getTextWidget(), position, this.suggestionBackground);
        resetState();
import org.eclipse.swt.events.PaintEvent;
        this.currentState = RenderState.SHOWING;
    @Override
        }
            lockObject.release();
    }
        } catch (BadPositionCategoryException ignored) {
    }
                    break;
        }
            updater = new DefaultPositionUpdater(HINT_CATEGORY);
        boolean isEmpty() {

    }
    }
 * you may not use this file except in compliance with the License.
        }
            return;
        IDLE,
    }
        } finally {
import org.eclipse.swt.custom.LineBackgroundListener;

        } catch (BadLocationException e) {
                    resetState();
     * Activates the suggestion text painter and enables its core functionality.
        removeHint();
    }
            return position;

    }
        return activeHint != null && !activeHint.isEmpty();

 * Copyright (C) 2010-2025 DBeaver Corp and others
            executeShow(content, cursorPosition);
                case REMOVING:

     * Displays a hint with the given content. Optionally removes any existing hint before displaying the new one.
import org.jkiss.dbeaver.ui.UIUtils;
        }
            log.debug("Exception trying to insert AI suggestion", e);
    private RenderState currentState;
import org.eclipse.jface.text.*;
        this.activeHint = HintContent.initialize(0, "");

        if (!isEnabled) {
        textWidget.removeLineBackgroundListener(this);
        int getPosition() {
        if (!tryLock()) {
        textWidget.removeLineBackgroundListener(this);

    private int getCursorPosition() {
        String[] getTextLines() {

        }
        int separator = Math.max(lineContent.lastIndexOf(' '), lineContent.lastIndexOf('\t'));

    public int getCurrentPosition() {
    public SQLSuggestionTextPainter(ITextViewer viewer) {
        this.lockObject = new Semaphore(1);

    }
        StyledText textWidget = getTextWidget();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
import org.eclipse.swt.events.PaintListener;

        insertTextAtCursor(activeHint.getContent());
    }
        }

            return content;
            switch (currentState) {
    private void drawHintContent(GC gc) {
    }
    }
    }
 * See the License for the specific language governing permissions and

    private boolean standaloneOperation = false;
    }
            fragment = fragment.substring(wordPrefix.length());
            }
     * @param cursorPosition the position of the cursor in editor
        SHOWING,

     */
        }
        private HintContent(int position, String content) {
 *

                resetState();
        return separator >= 0 ? lineContent.substring(separator + 1) : lineContent;
    @Override
        } else {
    public void setFontColor(Color color) {
                    drawHintContent(event.gc);
        if (!tryLock()) {
            this.position = position;
    private void insertTextAtCursor(String text) {
            document.replace(modelPosition, 0, text);
    }
        textWidget.removePaintListener(this);
            textWidget.addPaintListener(this);
        }
        }
    public void setSuggestionBackgroundColor(Color color) {
            this.repainting = false;
            getTextWidget().setCaretOffset(activeHint.getPosition() + text.length());
        if (!hasContentToShow()) {
        this.currentState = RenderState.IDLE;
            executeRemove(); // removes any currently displayed hint before showing the new one
        currentState = RenderState.IDLE;
            removeHint();
            enable();
     * @param content the content of the hint to be displayed
            configureGraphicsContext(gc);
 */

     * Disables the suggestion text painter functionality.
    private Color fontColor;
            textWidget.addLineBackgroundListener(this);
        try {
    private StyledText getTextWidget() {
    }
        if (fontColor != null) {
            }
        });
            if (textLines.length > 1) {
    /**
        int position = getCursorPosition();
    private Color suggestionBackground;
            return lockObject.tryAcquire(100, TimeUnit.MILLISECONDS);
            isEnabled = true;

