import org.eclipse.jface.text.source.IVerticalRuler;
    public void appendVerifyKeyListener(VerifyKeyListener listener) {
            } else {
        //textWidget.setAlwaysShowScrollBars(false);
        }
 *
    public void setHyperlinkPresenter(IHyperlinkPresenter hyperlinkPresenter) throws IllegalStateException {
        boolean expanded = false;
        @NotNull Composite parent,

        }
    @Override
        Iterator<Annotation> it = projectionAnnotationModel.getAnnotationIterator(offset, 0, true, true);
    
}
            // It is a hack to allow auto-complete with TAB key (#2316)
            }
                    ) {
    @Override
            return expanded;
    private final LinkedList<VerifyKeyListener> verifyKeyListeners = new LinkedList<>();
        this.sqlEditor = sqlEditor;
    
                        && currentPrefStoreSupplier.get().getBoolean(SQLPreferenceConstants.TAB_AUTOCOMPLETION)

import org.eclipse.swt.widgets.Composite;
                    expanded = true;
                projectionAnnotationModel.modifyAnnotations(null, null, null);
        textWidget.addListener(ST.VerifyKey, event -> {
        super.prependVerifyKeyListener(listener);
     * @param parent the SWT parent control
     * @param showsAnnotationOverview <code>true</code> if the overview ruler should be shown
    @Override
            
        return expanded;
                getTextWidget().copy();
 * Licensed under the Apache License, Version 2.0 (the "License");
        if (fHyperlinkManager != null) {
import org.eclipse.swt.graphics.Point;
    ) {
    
    @Override
            // so get the annotations intersecting range start end range end positions, and then expand them.
            IRegion lineInfo = document.getLineInformation(line);
                        for (VerifyKeyListener listener : List.copyOf(verifyKeyListeners)) {
        @Nullable IVerticalRuler ruler,
            return true;
        this.currentPrefStoreSupplier = currentPrefStoreSupplier;
            }
import org.eclipse.jface.text.*;

        if (operation == CUT) {
            fHyperlinkManager = null;
        }

    /**
            // TODO: perhaps we should test ContentAssistant.isProposalPopupActive() here?
            verifyKeyListeners.addFirst(listener);
        StyledText textWidget = super.createTextWidget(parent, styles);
     */
                        }

                        VerifyEvent verifyEvent = new VerifyEvent(event);
    
            Annotation annotation = it.next();
import org.eclipse.swt.custom.StyledText;
            return false;
            super.copyMarkedRegion(delete);
    @Override
        
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;


            // We only want to expand annotations preventing the user from observation of the given range boundaries,
    public SQLEditorSourceViewer(

/*
            
        super.setHyperlinkPresenter(hyperlinkPresenter);
 *     http://www.apache.org/licenses/LICENSE-2.0
            if (delete) {
            boolean b = this.expandAnnotationsContaining(projectionAnnotationModel, modelRange.getOffset() + modelRange.getLength());
            boolean expanded = a | b;
 * You may obtain a copy of the License at
    }
                            listener.verifyKey(verifyEvent);
            ProjectionAnnotationModel projectionAnnotationModel = this.getProjectionAnnotationModel();
    
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                    if (event.character == '\t'
    public void prependVerifyKeyListener(VerifyKeyListener listener) {
        }
    @Override
 * limitations under the License.
            }
import java.util.List;
import org.eclipse.jface.text.source.Annotation;
 * you may not use this file except in compliance with the License.
     *
 * Unless required by applicable law or agreed to in writing, software
        super.removeVerifyKeyListener(listener);

            if (expanded) {
            //     return projectionAnnotationModel.expandAll(modelRange.getOffset(), modelRange.getLength());

import org.eclipse.swt.events.VerifyEvent;
    }

    }
    }
    }
    @Override
     * @param ruler the vertical ruler (annotation area)
    public void removeVerifyKeyListener(VerifyKeyListener listener) {
    }
import java.util.Iterator;
        if (listener != null) {
import java.util.function.Supplier;
        @NotNull SQLEditorBase sqlEditor
     * @param overviewRuler the overview ruler
import org.eclipse.jface.text.source.projection.ProjectionViewer;
    }
            if (annotation instanceof ProjectionAnnotation p && p.isCollapsed()) {
    private final SQLEditorBase sqlEditor;
            int line = document.getLineOfOffset(caretOffset);

import org.eclipse.swt.custom.VerifyKeyListener;
        }
            return;
            resetVisibleRegion();
        return this.sqlEditor;
                getTextWidget().cut();
     * @param sqlEditor editor
            int caretOffset = selection.x;
                case ST.VerifyKey: {
    public SQLEditorBase getSqlEditor() {
        super.appendVerifyKeyListener(listener);
package org.jkiss.dbeaver.ui.editors.sql;
        } catch (BadLocationException e) {
            super.copyMarkedRegion(delete);
        try {
            setSelectedRange(lineInfo.getOffset(), lineInfo.getLength() + delimiterLength);
        }
    private boolean expandAnnotationsContaining(@NotNull ProjectionAnnotationModel projectionAnnotationModel, int offset) {
                    break;
        return false;
import org.jkiss.code.NotNull;
    private static final Log log = Log.getLog(SQLEditorSourceViewer.class);
    public boolean exposeModelRange(@NotNull IRegion modelRange) {
        super(parent, ruler, overviewRuler, showsAnnotationOverview, styles);
        if (listener != null) {
import org.eclipse.jface.text.hyperlink.IHyperlinkPresenter;

            
    void refreshTextSelection() {
import org.jkiss.code.Nullable;
    }
            // , which is wrong because we don't want to expand annotations completely covered by the given range.
        while (it.hasNext()) {
            String lineDelimiter = document.getLineDelimiter(line);
import java.util.LinkedList;
        }

        if (isProjectionMode()) {
        }

            return isEditable();
        return super.canDoOperation(operation);
        }
            verifyKeyListeners.addLast(listener);
                    }
                }
    public boolean canDoOperation(int operation) {
    }
        if (operation == COPY) {
 * DBeaver - Universal Database Manager
        boolean showsAnnotationOverview,
    @NotNull
     * @param styles the SWT style bits
        Point selection = getSelectedRange();
    
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
public class SQLEditorSourceViewer extends ProjectionViewer {
                if (position != null && position.includes(offset)) {
                    projectionAnnotationModel.expand(annotation);
    }


    @NotNull
import org.eclipse.swt.custom.ST;
            boolean a = this.expandAnnotationsContaining(projectionAnnotationModel, modelRange.getOffset());
        });
            int delimiterLength = lineDelimiter != null ? lineDelimiter.length() : 0;
        @NotNull Supplier<DBPPreferenceStore> currentPrefStoreSupplier,
     * Creates an instance of this class with the given parameters.
            }
    // Let source viewer reconfiguration possible (https://dbeaver.io/forum/viewtopic.php?f=2&t=2939)
                Position position = projectionAnnotationModel.getPosition(annotation);
        return textWidget;
 *
 * Copyright (C) 2010-2024 DBeaver Corp and others
        }
        if (selection.y != 0) {
    protected StyledText createTextWidget(Composite parent, int styles) {
            fHyperlinkManager.uninstall();
                        verifyEvent.character = '\n';
        fireSelectionChanged(selection.getOffset(), selection.getLength());
 * distributed under the License is distributed on an "AS IS" BASIS,
            verifyKeyListeners.remove(listener);
                        event.doit = verifyEvent.doit;
                }
        int styles,



    }
            IDocument document = getDocument();
        }
    private final Supplier<DBPPreferenceStore> currentPrefStoreSupplier;
    protected void copyMarkedRegion(boolean delete) {
        }
        
        ITextSelection selection = (ITextSelection) getSelection();
            return true;
        if (getTextWidget() == null) {
    }
 */
import org.jkiss.dbeaver.Log;
            log.error("Error selecting current line for copy/cut operation", e);
 * See the License for the specific language governing permissions and

            // Underlying default implementation was
        @Nullable IOverviewRuler overviewRuler,
 *
        if (!overlapsWithVisibleRegion(modelRange.getOffset(), modelRange.getLength())) {
import org.eclipse.jface.text.source.IOverviewRuler;
            switch (event.type) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        if (listener != null) {
