    private void setupDocument() {
        projectionSupport.install();
        setSourceViewerConfiguration(new XMLSourceViewerConfiguration(this));
package org.jkiss.dbeaver.ui.editors.xml;
                    new XMLPartitionScanner(),

 *
    private ProjectionAnnotationModel annotationModel;
                new FastPartitioner(
            ProjectionAnnotation annotation = new ProjectionAnnotation();
            annotations[i] = annotation;
    public void createPartControl(Composite parent) {
        viewer.doOperation(ProjectionViewer.TOGGLE);
import java.util.List;
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
    }
    }
    private Annotation[] oldAnnotations;
import org.eclipse.jface.text.source.ISourceViewer;
        ISourceViewer viewer = new ProjectionViewer(parent, ruler, getOverviewRuler(), isOverviewRulerVisible(), styles);


        super.createPartControl(parent);

        //with their corresponding positions
import org.eclipse.jface.text.IDocumentPartitioner;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
    @Override
    protected void doSetInput(IEditorInput input) throws CoreException {
        projectionSupport = new ProjectionSupport(viewer, getAnnotationAccess(), getSharedColors());
import java.util.HashMap;
        for (int i = 0; i < positions.size(); i++) {
                        XMLPartitionScanner.XML_TAG,
import java.util.Map;


            newAnnotations.put(annotation, positions.get(i));
        ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();
    public XMLEditor() {
 */

import org.eclipse.jface.text.IDocumentExtension3;

                        XMLPartitionScanner.XML_COMMENT});
        Annotation[] annotations = new Annotation[positions.size()];
        //this will hold the new annotations along
        getSourceViewerDecorationSupport(viewer);

import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.widgets.Composite;
 * limitations under the License.


 *
 * distributed under the License is distributed on an "AS IS" BASIS,
    {

public class XMLEditor extends BaseTextEditor {

import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
        super.dispose();
        //turn projection mode on
            ((IDocumentExtension3) document).setDocumentPartitioner(XMLPartitionScanner.XML_PARTITIONING, partitioner);
import org.eclipse.ui.texteditor.ITextEditorExtension3;
}

    @Override
        // ensure decoration support has been created and configured.
import org.eclipse.jface.text.source.projection.ProjectionViewer;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    void updateFoldingStructure(List<Position> positions) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            IDocumentPartitioner partitioner =
import org.jkiss.dbeaver.ui.editors.text.FileRefDocumentProvider;

import org.eclipse.jface.text.Position;
    }

    public void dispose() {

                    new String[]{
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
        return viewer;
    private ProjectionSupport projectionSupport;
import org.eclipse.core.runtime.CoreException;
        Map<Annotation, Position> newAnnotations = new HashMap<>();
 * Unless required by applicable law or agreed to in writing, software
        }
        super.doSetInput(input);
        if (document != null) {
            partitioner.connect(document);

        IDocument document = getDocument();

import org.eclipse.jface.text.source.Annotation;
    }
 * See the License for the specific language governing permissions and
 * you may not use this file except in compliance with the License.


 *
import org.eclipse.jface.text.rules.FastPartitioner;
    @Override
        oldAnnotations = annotations;
        annotationModel = viewer.getProjectionAnnotationModel();
        setupDocument();
import org.eclipse.ui.IEditorInput;
    }
        }
        annotationModel.modifyAnnotations(oldAnnotations, newAnnotations, null);
        setDocumentProvider(new FileRefDocumentProvider());
        configureInsertMode(ITextEditorExtension3.SMART_INSERT, false);

    protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles)


    }
 * DBeaver - Universal Database Manager
import org.eclipse.jface.text.IDocument;
 * You may obtain a copy of the License at
    }

