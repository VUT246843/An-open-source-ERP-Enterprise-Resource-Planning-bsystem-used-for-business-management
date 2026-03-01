import org.eclipse.jface.text.source.ISourceViewer;
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
        formatter.setDocumentPartitioning(IDocument.DEFAULT_CONTENT_TYPE);
 *
import org.eclipse.jface.text.IDocument;
 *
 * You may obtain a copy of the License at
    }
    private final BaseTextEditor editor;

import org.eclipse.jface.text.formatter.IContentFormatter;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
} * Unless required by applicable law or agreed to in writing, software
import org.jkiss.dbeaver.ui.editors.text.BaseTextEditor;

 * DBeaver - Universal Database Manager
 *
public class PlainTextViewerConfiguration extends SourceViewerConfiguration {
import org.eclipse.jface.text.formatter.ContentFormatter;
        ContentFormatter formatter = new ContentFormatter();
 * you may not use this file except in compliance with the License.

 * limitations under the License.
/*
 * Licensed under the Apache License, Version 2.0 (the "License");

        return formatter;
import org.eclipse.jface.text.source.SourceViewerConfiguration;
    public PlainTextViewerConfiguration(BaseTextEditor editor) {
 * See the License for the specific language governing permissions and

 *     http://www.apache.org/licenses/LICENSE-2.0
    }
        formatter.enablePartitionAwareFormatting(false);

    public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
 * Copyright (C) 2010-2024 DBeaver Corp and others

package org.jkiss.dbeaver.ui.data.managers.stream;
        this.editor = editor;
 */
