		super.dispose();
 *
 * DBeaver - Universal Database Manager
	}
 *
import org.eclipse.jface.text.source.DefaultCharacterPairMatcher;

	}
		super.createPartControl(parent);
	public void doSaveAs() {
import org.eclipse.jface.text.rules.FastPartitioner;
	}
import org.eclipse.jface.text.source.projection.ProjectionSupport;

					new JSONPartitionScanner(),
import org.eclipse.core.runtime.CoreException;
					new String[]{
	public void dispose() {
	}
			((IDocumentExtension3) document).setDocumentPartitioner(JSONPartitionScanner.JSON_PARTITIONING, partitioner);
	@Override
/*
			IDocumentPartitioner partitioner =
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.


			partitioner.connect(document);
	}
	@Override
	public void createPartControl(Composite parent) {

		if (pairsMatcher != null) {
				new FastPartitioner(
import org.eclipse.jface.text.source.IVerticalRuler;

 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
}
	@Override
	@Override
	protected ISourceViewer createSourceViewer(Composite parent, IVerticalRuler ruler, int styles) {
		super.doSave(monitor);
		super.doSaveAs();
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
 */
		return viewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
 * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.text.FileRefDocumentProvider;
						JSONPartitionScanner.JSON_STRING});
 * you may not use this file except in compliance with the License.
		}

	public void doSetInput(IEditorInput input) throws CoreException {

		super.doRevertToSaved();

 * distributed under the License is distributed on an "AS IS" BASIS,
	}

	private DefaultCharacterPairMatcher pairsMatcher = new DefaultCharacterPairMatcher(PAIRS);
			pairsMatcher.dispose();



		setDocumentProvider(new FileRefDocumentProvider());

public class JSONTextEditor extends BaseTextEditor {
import org.eclipse.jface.text.source.ISourceViewer;
		ISourceViewer viewer = new ProjectionViewer(parent, ruler, null, false, styles);
import org.eclipse.swt.widgets.Composite;
import org.eclipse.core.runtime.IProgressMonitor;
		if (document != null) {
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;
	public JSONTextEditor() {
	@Override
package org.jkiss.dbeaver.ui.editors.json;
	}
		super.doSetInput(input);
		setupDocument();
	private void setupDocument() {
import org.eclipse.jface.text.IDocument;
	private ProjectionSupport projectionSupport;
 * See the License for the specific language governing permissions and
	public void doSave(IProgressMonitor monitor) {
	@Override


		super();
 * JSONTextEditor
	}
	public void doRevertToSaved() {
		setSourceViewerConfiguration(new JSONSourceViewerConfiguration(this));
		IDocument document = getDocument();
 */
import org.eclipse.jface.text.IDocumentExtension3;
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.jface.text.IDocumentPartitioner;
	}

		}
 * limitations under the License.
	@Override

	private final static char[] PAIRS= { '{', '}', '[', ']' };
 * You may obtain a copy of the License at
			pairsMatcher = null;

