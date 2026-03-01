
        if (subject instanceof SubjectRegion subjectRegion) {
 *
        IRegion hoverRegion = this.annotationHover.getHoverRegion(textViewer, offset);
        }
            } else {
    }
                this.hasContents |= CommonUtils.isNotEmpty(info.message);
            }
        if (this.editor instanceof SQLEditor) {
            update();
            annotationsInfo = new AnnotationsInformationView.AnnotationsHoverInfo(Collections.emptyList(), subject, -1);
import org.jkiss.dbeaver.ui.editors.sql.util.ObjectInformationView;
                if (dbObject != null) {
        }
import org.eclipse.jface.text.information.IInformationProviderExtension;
/*

                    }
    );
            window.getPartService().addPartListener(partListener);
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.ArrayUtils;

        }
import org.eclipse.swt.widgets.Shell;
        SQLQuerySymbolClass.QUOTED
        return new SubjectRegion(
            DBRProgressMonitor monitor = new VoidProgressMonitor();
                    }
            info = null;
                    info = dbObject;

        String message;
    }
                c.setLayoutData(new BorderData(SWT.CENTER));
        } else if (ArrayUtils.isEmpty(contextInformer.getKeywords())) {
import org.eclipse.jface.text.*;
        );
        public SQLSymbolInformationControl(@NotNull Shell shell) {
            ).max().orElse(Integer.MIN_VALUE) - this.getOffset();

 * Copyright (C) 2010-2025 DBeaver Corp and others
    public Object getInformation2(@NotNull ITextViewer textViewer, @NotNull IRegion subject) {
        if (subject instanceof SubjectRegion subjectRegion && subjectRegion.isEmpty()) {
    }
                        null,
                        navModel.getNodeByObject(new VoidProgressMonitor(), dbObject, true);
        public int getOffset() {
                        dbObject = null;
        return information == null ? null : information.toString();

        @Override
                this.hasContents = !info.annotationsInfo.annotationsGroups().isEmpty();
 * limitations under the License.
                        contextInformer.getKeywordType()
import org.jkiss.dbeaver.DBException;
        }
        SQLDocumentSyntaxContext context = this.editor.getSyntaxContext();
                ? this.annotationHover.getAnnotationsHoverInfo(textViewer, subjectRegion.hoverRegion, null, true)
     */
 * DBeaver - Universal Database Manager
    private static boolean equalRegions(@NotNull IRegion a, @NotNull IRegion b) {
                    );
                };
import org.jkiss.dbeaver.model.struct.DBSObject;
    class EditorWatcher extends AbstractPartListener {
        return info;
        } else {
import org.jkiss.dbeaver.model.DBPKeywordType;
            IPerspectiveDescriptor perspective = page.getPerspective();
    @Nullable

        private Boolean hasContents = null;
                this.hoverRegion == null ? Integer.MAX_VALUE : this.hoverRegion.getOffset(),
                        ? null
                        : symbolEntry.getSymbolClass().getDescription();
    @NotNull
        }
        this.editor = editor;
                                pseudoColumn.source == null ? "" : (" derived from the " + (
        IWorkbenchPage page = window.getActivePage();
        this.contextInformer.searchInformation(new Region(offset, 0));
            parent.setLayout(layout);
            return this.selectionRegion == null
    private IInformationControlCreator informationControlCreator;

        }


import org.jkiss.dbeaver.model.sql.semantics.model.ddl.SQLQueryObjectDataModel;
                this.selectionRegion == null ? Integer.MIN_VALUE : (this.selectionRegion.getOffset() + this.selectionRegion.getLength()),
        IWorkbenchWindow window = editor.getSite().getWorkbenchWindow();
                info = switch (keywordType) {
            }
            if (perspective != null) {
    protected SQLAnnotationHover annotationHover;
        }
import org.jkiss.code.Nullable;
        }
import org.jkiss.utils.CommonUtils;
        Object information = getInformation2(textViewer, subject);
    }
        @Nullable IRegion hoverRegion,
            info = this.prepareInformerAdditionalInfo();
            update();
                SQLQuerySymbolEntry symbolEntry = subjectRegion.symbolEntry;
import org.jkiss.dbeaver.ui.editors.sql.util.AnnotationsInformationView;

        @Nullable SQLQuerySymbolEntry symbolEntry,
                this.setInformation(info.message);
                && this.symbolRegion == null
 * distributed under the License is distributed on an "AS IS" BASIS,
import org.eclipse.ui.*;
                    case KEYWORD -> "Keyword";
                this.hoverRegion == null ? Integer.MIN_VALUE : (this.hoverRegion.getOffset() + this.hoverRegion.getLength()),
        if (page != null) {

        public boolean isEmpty() {
                while (symbolEntry.getDefinition() instanceof SQLQuerySymbolEntry def && symbolEntry.getDefinition() != def) {

                    symbolEntry = def;
                this.symbolRegion == null ? Integer.MAX_VALUE : this.symbolRegion.getOffset(),
            update();
                info = null;
} * Unless required by applicable law or agreed to in writing, software
            return this.hasContents != null ?  this.hasContents : super.hasContents();
            }
import org.jkiss.dbeaver.model.sql.semantics.context.SQLQueryResultPseudoColumn;
    @Override
                this.annotationsInfoView.setLinksInformation(info.annotationsInfo);
            return null;
        }
    private record SubjectInformation(
        @Override
        if (annotationsInfo == null) {
        SQLQuerySymbolClass.ERROR,
                super.setInformation(CommonUtils.toString(input));
import org.eclipse.swt.SWT;
            if (navModel != null) {
    private static final Set<SQLQuerySymbolClass> ignoredSymbolClassDescription = Set.of(
            return IntStream.of(

 * You may obtain a copy of the License at
        }
 * you may not use this file except in compliance with the License.
        @Override
    ) implements IRegion {

            message = text;
            editor.getCompletionContext(),
    @Override
        }
                    message = null;
            return IntStream.of(
     * @deprecated
                this.selectionRegion == null ? Integer.MAX_VALUE : this.selectionRegion.getOffset(),
        private AnnotationsInformationView annotationsInfoView;
            final DBSObjectReference objectRef = contextInformer.getObjectReferences().getFirst();
                if (currentPerspective == null || !currentPerspective.equals(perspectiveId)) {

        @Nullable String message,
                    if (navModel != null) {
            annotationsInfo = this.annotationHover.getAnnotationsHoverInfo(textViewer, subject, null, true);
                    message = SQLCompletionHelper.readAdditionalProposalInfo(
                    }
        if (object != null) {
    private record SubjectRegion(
        if (informationControlCreator == null) {
        SQLQuerySymbolClass.UNKNOWN,
            }
import org.eclipse.swt.layout.BorderData;
            IWorkbenchWindow window = this.editor.getSite().getWorkbenchWindow();
                switch (symbolEntry.getDefinition()) {
                    this.objectInformationView = new ObjectInformationView();
            selectedRange.y > 1 ? new Region(selectedRange.x, selectedRange.y) : null,
    }
                                ))



        return a.getOffset() == b.getOffset() && a.getLength() == b.getLength();
    public String getInformation(ITextViewer textViewer, IRegion subject) {
                    this.objectInformationView.createContent(this.contentParent).setLayoutData(new BorderData(SWT.CENTER));
            return object;
                        dbObject = null;
        if ((info == null || (contextInformer.getKeywords().length > 0 && info.equals(contextInformer.getKeywords()[0])))) {
        final Point selectedRange = textViewer.getSelectedRange();
            if (subjectRegion.symbolEntry != null

 * Licensed under the Apache License, Version 2.0 (the "License");
            }
            DBPKeywordType keywordType = contextInformer.getKeywordType();
            if (keywordType != null) {
                this.annotationsInfoView.show();

    private IPartListener partListener;
        @NotNull AnnotationsInformationView.AnnotationsHoverInfo annotationsInfo,

            message = null;
                        message = pseudoColumn.description + "\n"
import org.jkiss.dbeaver.model.sql.semantics.model.select.SQLQueryRowsTableDataModel;

        public void partBroughtToTop(IWorkbenchPart part) {
        private ObjectInformationView objectInformationView;
    }

    }
            ).min().orElse(Integer.MAX_VALUE);
        }
                }
            symbolEntry, symbolRegion,


    protected SQLEditorBase editor;
        }
            this.annotationsInfoView.createControl(parent).setLayoutData(new BorderData(SWT.TOP));
    public SQLInformationProvider(@NotNull SQLEditorBase editor, @NotNull SQLContextInformer contextInformer) {


        private Composite contentParent;
        @Nullable Object info
                        dbObject = byObjDef.getDbObject();
import org.eclipse.jface.text.information.IInformationProviderExtension2;
    private final SQLContextInformer contextInformer;
    @NotNull
            this.contentParent = parent;
        public void partActivated(IWorkbenchPart part) {
    }
            super(shell, true);
            for (Control c : parent.getChildren()) {
    /*
                    case SQLQueryRowsTableDataModel byTableRefDef -> {
                                        ? "query part: \n" + pseudoColumn.source.getSyntaxNode().getTextContent()
        DBSObject object = null;
        }
            } else {
            if (visible) {
            this.annotationsInfoView = new AnnotationsInformationView(this, editor);
                            + "Pseudo-column" + (
        }
        public int getLength() {
                                            + SQLQuerySemanticUtils.getObjectTypeName(pseudoColumn.realSource))
import org.jkiss.dbeaver.ui.editors.sql.SQLEditor;
        public void setVisible(boolean visible) {
        SQLQuerySymbolEntry symbolEntry = context == null ? null : context.findToken(offset);
            parent.getShell().setMinimumSize(this.computeSizeConstraints(60, 6));
import org.jkiss.code.NotNull;
                && this.hoverRegion == null

import org.jkiss.dbeaver.model.sql.completion.SQLCompletionHelper;
                this.wordRegion == null ? Integer.MAX_VALUE : this.wordRegion.identStart
        }
                && (subjectRegion.selectionRegion == null || equalRegions(subjectRegion.symbolRegion, subjectRegion.selectionRegion))
            ) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

            } catch (DBException e) {

        @Override
import org.jkiss.dbeaver.model.sql.semantics.*;
                    }
            return;

        protected void createContent(@NotNull Composite parent) {
    }
                        dbObject = byTableRefDef.getImmediateTargetObject();
            }
                    }
    @Override
        }
                && this.symbolEntry == null
            if (part == editor) {
                if (info.info instanceof DBPNamedObject object) {
                    }
                                    pseudoColumn.realSource == null
            }
    private Object prepareInformerAdditionalInfo() {
        public void partClosed(IWorkbenchPart part) {
public class SQLInformationProvider implements IInformationProvider, IInformationProviderExtension, IInformationProviderExtension2 {
        public boolean hasContents() {
                    default -> null;
    ) {
                message = null;
import java.util.stream.IntStream;
                    case SQLQueryResultPseudoColumn pseudoColumn -> {
        @Nullable IRegion symbolRegion,
import org.eclipse.swt.graphics.Point;
                                        : (pseudoColumn.realSource.getName()
 *
import org.jkiss.dbeaver.ui.editors.sql.util.SQLAnnotationHover;
    @Override
                if (message == null  || message.equals(symbolEntry.getRawName())
    private String currentPerspective;
            wordRegion == null || wordRegion.isEmpty() ? null : wordRegion
        }
    }
                }
        if (this.contextInformer.hasObjects() && this.contextInformer.getKeywordType() != DBPKeywordType.KEYWORD) {
                        dbObject = byObjDataRefDef.getObject();
    private class SQLSymbolInformationControl extends DefaultInformationControl implements IInformationControlExtension2 {
                }
                DBSObject dbObject;
import java.util.Set;
        @Override
                    case SQLQuerySymbolEntry defSymbolEntry -> {
            this.annotationsInfoView.setForceAnnotationIcon(true);
            hoverRegion,


            // Make object description
                : null;
                object = objectRef.resolveObject(monitor);
                }
        this.annotationHover = new SQLAnnotationHover(editor);
            super.createContent(parent);

import org.eclipse.swt.widgets.Composite;
                    || (contextInformer.getKeywords().length > 0 && message.equals(contextInformer.getKeywords()[0]))) {
            DBNModel navModel = object.getDataSource().getContainer().getProject().getNavigatorModel();
import org.jkiss.dbeaver.model.sql.parser.SQLIdentifierDetector;
        IRegion symbolRegion = symbolEntry == null
import org.jkiss.dbeaver.model.struct.DBSObjectReference;

import org.jkiss.dbeaver.ui.AbstractPartListener;
    }
        @Override

//            layout.type = SWT.VERTICAL;
                    this.hasContents = true;
            informationControlCreator = SQLSymbolInformationControl::new;
                } else {
import org.jkiss.dbeaver.model.navigator.DBNModel;
            annotationsInfo = subjectRegion.hoverRegion != null &&
            null,
                    case SQLQuerySymbolByDbObjectDefinition byObjDef -> {


        @Override
                    info = null;
            : new Region(context.getLastAccessedTokenOffset(), symbolEntry.getInterval().length());
import org.eclipse.swt.widgets.Control;
        if (info instanceof String text) {
                    case null -> {

        }

        @Nullable SQLIdentifierDetector.WordRegion wordRegion
import org.eclipse.jface.text.information.IInformationProvider;
        if (window == null) {
                info = this.prepareInformerAdditionalInfo();
                (subjectRegion.selectionRegion == null || equalRegions(subjectRegion.hoverRegion, subjectRegion.selectionRegion))
        @Override
        public void setInput(@NotNull Object input) {
                    default -> throw new IllegalStateException("Not implemented");
        }
                        editor.getCompletionContext(),
            super.setVisible(visible);
            if (input instanceof SubjectInformation info) {

                        contextInformer.getKeywords(),
                String perspectiveId = perspective.getId();
    public IInformationControlCreator getInformationPresenterControlCreator() {

                }
                this.wordRegion == null ? Integer.MIN_VALUE : (this.wordRegion.identEnd)
                navModel.getNodeByObject(new VoidProgressMonitor(), object, true);
            return null;
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;
import org.jkiss.dbeaver.ui.editors.sql.SQLEditorBase;
import org.eclipse.swt.layout.BorderLayout;
                    DBNModel navModel = dbObject.getDataSource().getContainer().getProject().getNavigatorModel();
                    }
        AnnotationsInformationView.AnnotationsHoverInfo annotationsInfo;
                };
            try {
                partListener = null;
                editor.getSite().getWorkbenchWindow().getPartService().removePartListener(partListener);
            object,
            }
            contextInformer.getKeywords(),
package org.jkiss.dbeaver.ui.editors.sql.syntax;

        );
import java.util.Collections;
        SQLIdentifierDetector.WordRegion wordRegion = contextInformer.getWordRegion();
                        dbObject = null;
                    case SQLQueryObjectDataModel byObjDataRefDef -> {
                && this.wordRegion == null;
            BorderLayout layout = new BorderLayout();
 *
            }
        }
                        dbObject,
import org.jkiss.dbeaver.model.DBPNamedObject;
        Object info = SQLCompletionHelper.readAdditionalProposalInfo(
                return e.getMessage();
            contextInformer.searchInformation(subject);
                    this.annotationHover.setEditor(editor);

import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                this.symbolRegion == null ? Integer.MIN_VALUE : (this.symbolRegion.getOffset() + this.symbolRegion.getLength()),
        return informationControlCreator;
    }
            } else {
                    message = ignoredSymbolClassDescription.contains(symbolEntry.getSymbolClass())
                            );
    public IRegion getSubject(@NotNull ITextViewer textViewer, int offset) {
                    currentPerspective = perspectiveId;
                    this.setInformation(null);
        @Override

            partListener = new EditorWatcher();
        this.contextInformer = contextInformer;
                // Can't resolve
                    this.objectInformationView.setInput(object);
 */
                    case FUNCTION -> "Function";
            ? null
        Object info;
            contextInformer.getKeywordType()
    protected void update() {
        return new SubjectInformation(annotationsInfo, message, info);
        }
        @Nullable IRegion selectionRegion,
 * See the License for the specific language governing permissions and
