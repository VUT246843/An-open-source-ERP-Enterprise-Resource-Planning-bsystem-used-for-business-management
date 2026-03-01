    protected BaseTextDocumentProvider() {
 *
    }
 * See the License for the specific language governing permissions and
 * DBeaver - Universal Database Manager
        return new Document();

import org.eclipse.jface.text.Document;
 * You may obtain a copy of the License at


 * Licensed under the Apache License, Version 2.0 (the "License");
import org.eclipse.jface.operation.IRunnableContext;
}
 *
 *

/*
    }
        return (fork, cancelable, runnable) -> runnable.run(monitor);
 * Copyright (C) 2010-2024 DBeaver Corp and others
 * you may not use this file except in compliance with the License.
    }
import org.eclipse.ui.texteditor.AbstractDocumentProvider;
 */
/**
 * Unless required by applicable law or agreed to in writing, software
        return new ProjectionAnnotationModel();
 * BaseTextDocumentProvider
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
 * distributed under the License is distributed on an "AS IS" BASIS,
    @Override
 * limitations under the License.
    protected IAnnotationModel createAnnotationModel(Object element) throws CoreException {

    @Override
    }

 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.core.runtime.CoreException;
public abstract class BaseTextDocumentProvider extends AbstractDocumentProvider {

import org.eclipse.core.runtime.IProgressMonitor;

    protected IRunnableContext getOperationRunner(final IProgressMonitor monitor) {
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
    protected Document createEmptyDocument() {

package org.jkiss.dbeaver.ui.editors.text;
import org.eclipse.jface.text.source.IAnnotationModel;
