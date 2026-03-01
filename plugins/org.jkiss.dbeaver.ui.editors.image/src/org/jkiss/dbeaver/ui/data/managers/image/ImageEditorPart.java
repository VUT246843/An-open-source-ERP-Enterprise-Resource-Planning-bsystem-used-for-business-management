
import java.io.InputStream;
        return false;
    }
    @Override

    @Override
import org.jkiss.dbeaver.ui.controls.resultset.ResultSetPreferences;
import org.eclipse.swt.SWT;
            imageViewer = new BrowserImageEditor(parent, SWT.NONE);
    }
    private void loadImage() {
                        imageViewer.update();
                        imageViewer.loadImage(inputStream);

public class ImageEditorPart extends EditorPart implements IRefreshablePart {
        // Refresh editor
        setInput(input);
import org.jkiss.dbeaver.ui.DBeaverIcons;
    }
 * See the License for the specific language governing permissions and
                File localFile = absolutePath.toFile();
 * You may obtain a copy of the License at
                }

 *
    }
    private final IValueController controller;
    }
 */

        }
    public void doSaveAs() {
 *
    public boolean isDirty() {
    public void setFocus() {
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Licensed under the Apache License, Version 2.0 (the "License");
            .getDataSource()
    private void refreshImage() {
import org.jkiss.dbeaver.ui.controls.imageview.SWTImageEditor;
import java.io.FileInputStream;

    @Override
                final IPath absolutePath = ((IPathEditorInput) getEditorInput()).getPath();
    public boolean isSaveAsAllowed() {

import org.eclipse.ui.part.EditorPart;
 * distributed under the License is distributed on an "AS IS" BASIS,
                log.error("Can't load image contents", e);
        if (getEditorInput() instanceof IPathEditorInput) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
 * limitations under the License.
    }
import org.eclipse.core.runtime.IPath;
            .getPreferenceStore();

    @Override
    public RefreshResult refreshPart(Object source, boolean force) {
import org.eclipse.ui.IEditorSite;
            return;
 * CONTENT text editor
    private AbstractImageViewer imageViewer;
    @Override
    public void doSave(IProgressMonitor monitor) {
import org.jkiss.dbeaver.ui.controls.imageview.AbstractImageViewer;
    }
/*
    }
    @Override
import org.jkiss.dbeaver.model.DBIcon;
    @Override
    @Override


    public void dispose() {
    {

                    }
    public Image getTitleImage()
                    try (InputStream inputStream = new FileInputStream(localFile)) {
        setSite(site);
 * DBeaver - Universal Database Manager
import org.jkiss.dbeaver.ui.data.IValueController;
    @Override
                if (localFile.exists()) {
            } catch (Exception e) {
    {
import org.eclipse.ui.IEditorInput;
        if (imageViewer == null || imageViewer.isDisposed()) {
package org.jkiss.dbeaver.ui.data.managers.image;
    }
    public ImageEditorPart(IValueController controller) {

        }
    public String getTitle()
        return DBeaverIcons.getImage(DBIcon.TYPE_IMAGE);
        //ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
        loadImage();


        }
        return "Image";
        super.dispose();

import org.eclipse.ui.IPathEditorInput;
 * you may not use this file except in compliance with the License.
        } else {
import org.jkiss.dbeaver.ui.controls.imageview.BrowserImageEditor;

        UIUtils.asyncExec(this::loadImage);
    }

        refreshImage();
        imageViewer.setFocus();
import org.eclipse.core.runtime.IProgressMonitor;
 *

    @Override

import org.eclipse.swt.widgets.Composite;
    }
    public void createPartControl(Composite parent) {
import org.jkiss.dbeaver.ui.IRefreshablePart;
        this.controller = controller;
    @Override
        DBPPreferenceStore preferenceStore = controller.getExecutionContext()

            }
import org.eclipse.swt.graphics.Image;
        //ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
    }
 */

            imageViewer = new SWTImageEditor(parent, SWT.NONE);
import org.jkiss.dbeaver.Log;
import org.eclipse.ui.PartInitException;
import org.jkiss.dbeaver.ui.UIUtils;
import java.io.File;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            .getContainer()
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
            try {
    }
        return RefreshResult.REFRESHED;
    }
}/**
 * Copyright (C) 2010-2024 DBeaver Corp and others
        return false;
        if (preferenceStore.getBoolean(ResultSetPreferences.RESULT_IMAGE_USE_BROWSER_BASED_RENDERER)) {
    private static final Log log = Log.getLog(ImageEditorPart.class);

 * Unless required by applicable law or agreed to in writing, software
