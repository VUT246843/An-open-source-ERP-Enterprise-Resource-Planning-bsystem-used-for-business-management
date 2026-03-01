                        try {

 */
                    }
        IFile file = FileBuffers.getWorkspaceFileAtLocation(location);
 *
import org.eclipse.core.resources.IMarker;
                        return defaultMarkerUpdater.getMarkerType();
                                return true;
                        } else {
                    @Override
    }
                markerUpdater = new IMarkerUpdater() {
                    }
 * You may obtain a copy of the License at


        }
                //     also incorrectly infers `end = start`, which is obviously wrong even if the line number usage is intended.
/*
public class SQLEditorSemanticAnnotationModelFactory implements IAnnotationModelFactory {
                                return false;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                // BasicMarkerUpdater fucks up the position object associated with semantic marker annotation, so intercept it when needed.
import org.eclipse.core.runtime.IPath;
            super(file);
                };
 * DBeaver - Universal Database Manager

            if (markerUpdater instanceof BasicMarkerUpdater defaultMarkerUpdater) {
 * Unless required by applicable law or agreed to in writing, software
                    public String getMarkerType() {
                // Apparently it is due to the error in the condition in the BasicMarkerUpdater::updateMarker(..) method
                    }
                            return false;
        @Override
import org.eclipse.jface.text.Position;
                        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.ui.texteditor.IMarkerUpdater;
                            return defaultMarkerUpdater.updateMarker(iMarker, iDocument, position);
                            if (position == null) {
                    private static boolean isSemanticErrorMarker(IMarker marker) {
            super.addMarkerUpdater(markerUpdater);
                            } else {

import org.eclipse.core.runtime.CoreException;
package org.jkiss.dbeaver.ui.editors.sql.semantics;
}

                            return marker.getType().equalsIgnoreCase(SQLSemanticErrorAnnotation.MARKER_TYPE);
    public IAnnotationModel createAnnotationModel(IPath location) {
        protected void addMarkerUpdater(IMarkerUpdater markerUpdater) {
                        if (isSemanticErrorMarker(iMarker)) {
 * you may not use this file except in compliance with the License.
        public ResourceMarkerSemanticAnnotationModel(IResource file) {
import org.eclipse.ui.texteditor.BasicMarkerUpdater;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.filebuffers.IAnnotationModelFactory;
        }
                //     and assigned back to the position object somewhere upper on the callstack with the fruitless help of
                            } else if (position.isDeleted()) {
                    }
import org.eclipse.jface.text.IDocument;
                // where the MarkerUtilities.setLineNumber(..) is being forced when not needed:
                //     AbstractMarkerAnnotationModel::createPositionFromMarker(..), which consumes only the line number and
// see org.eclipse.ui.texteditor.ResourceMarkerAnnotationModelFactory
import org.eclipse.core.resources.IFile;

                    public boolean updateMarker(IMarker iMarker, IDocument iDocument, Position position) {
 *
 * limitations under the License.
 * See the License for the specific language governing permissions and

import org.eclipse.ui.texteditor.ResourceMarkerAnnotationModel;
                    @Override
    }
import org.eclipse.jface.text.source.AnnotationModel;
                //     line number is being inferred from the position object, then leading to the incorrect offsets being derived
 * Licensed under the Apache License, Version 2.0 (the "License");
                            }
import org.eclipse.core.runtime.Assert;
        return file != null ? new ResourceMarkerSemanticAnnotationModel(file) : new AnnotationModel();
                    @Override
import org.eclipse.jface.text.source.IAnnotationModel;
                        return defaultMarkerUpdater.getAttribute();
                        }
 * distributed under the License is distributed on an "AS IS" BASIS,
 *
                    public String[] getAttribute() {
                        } catch (CoreException e) {
                                return true;
    private static class ResourceMarkerSemanticAnnotationModel extends ResourceMarkerAnnotationModel {
 * Copyright (C) 2010-2024 DBeaver Corp and others
import org.eclipse.core.filebuffers.FileBuffers;
    @Override
            }
