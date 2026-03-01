 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

        this.resourcePath = DBUtils.getAdapter(Path.class, element);
                        UIUtils.createLabelText(composite, "File group", CommonUtils.toString(group.getName()), SWT.BORDER | SWT.READ_ONLY);
            fileAttributeView = Files.getFileAttributeView(resourcePath, FileOwnerAttributeView.class);
import org.eclipse.swt.layout.GridData;
 * You may obtain a copy of the License at
            fileAttributeView = Files.getFileAttributeView(resourcePath, BasicFileAttributeView.class);
        if (fileAttributeView instanceof BasicFileAttributeView basicAttrsView) {
                }
import org.jkiss.dbeaver.runtime.DBWorkbench;
                    if (group != null) {
/**
        }

 */
                    UIUtils.createLabelText(composite, "File size", FileSystemExplorerView.FILE_SIZE_FORMAT.format(attributes.size()), SWT.BORDER | SWT.READ_ONLY);


                    GroupPrincipal group = posixAttributes.group();
        if (resourcePath == null) {
import org.jkiss.dbeaver.ui.preferences.AbstractPrefPage;
                UIUtils.createLabelText(composite, "Creation time",
                    if (owner != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.nio.file.Files;

import org.eclipse.core.runtime.IAdaptable;
                if (fileKey != null) {
    protected Control createPreferenceContent(@NotNull Composite parent) {
        composite.setLayoutData(new GridData(GridData.FILL_BOTH));
                    UIUtils.createCheckbox(composite, "Directory", null, attributes.isDirectory(), 2).setEnabled(false);

    private Path resourcePath;
        this.element = element;
    @Override
        }
    private static final Log log = Log.getLog(PrefPageProjectResourceDetails.class);
                        UIUtils.createLabelText(composite, "Permissions",
import org.jkiss.dbeaver.Log;

import java.io.IOException;
import org.eclipse.swt.widgets.Composite;
 * distributed under the License is distributed on an "AS IS" BASIS,
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Copyright (C) 2010-2025 DBeaver Corp and others
    }
                UIUtils.createLabelText(composite, "Last modified time",
                    }
                    UserPrincipal owner = posixAttributes.owner();
 * DBeaver - Universal Database Manager
            try {
package org.jkiss.dbeaver.ui.project;
import java.nio.file.Path;
 *
        setDescription("Resource information details");
        }
                }
import java.util.Set;
                    Set<PosixFilePermission> permissions = posixAttributes.permissions();
    private IAdaptable element;
        Composite composite = UIUtils.createComposite(parent, 2);
import org.jkiss.dbeaver.model.DBUtils;
    }
                Object fileKey = attributes.fileKey();
 * See the License for the specific language governing permissions and

    @NotNull
                    UIUtils.createLabelText(composite, "File key", CommonUtils.toString(fileKey), SWT.BORDER | SWT.READ_ONLY);

        UIUtils.createLabelText(composite, "Path", DBFUtils.convertPathToString(resourcePath), SWT.BORDER | SWT.READ_ONLY);
 * PrefPageProjectResourceSettings
    public PrefPageProjectResourceDetails() {
                if (attributes instanceof PosixFileAttributes posixAttributes) {
                            permissions.stream().map(Enum::name).collect(Collectors.joining(",")), SWT.BORDER | SWT.READ_ONLY);
import org.jkiss.utils.CommonUtils;
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.SWT;
 * limitations under the License.
        return composite;
                DBWorkbench.getPlatformUI().showError("Error reading file attributes", null, e);

import org.jkiss.dbeaver.model.fs.DBFUtils;
                        UIUtils.createLabelText(composite, "File owner", CommonUtils.toString(owner.getName()), SWT.BORDER | SWT.READ_ONLY);
            return composite;
                    if (!CommonUtils.isEmpty(permissions)) {
import org.jkiss.code.NotNull;
            }
 *

 */
/*
    @Override
    public void setElement(IAdaptable element) {
                }
                    }
        if (fileAttributeView == null) {
                    FileSystemExplorerView.FILE_TIMESTAMP_FORMAT.format(attributes.creationTime().toMillis()), SWT.BORDER | SWT.READ_ONLY);
        }
                BasicFileAttributes attributes = basicAttrsView.readAttributes();
        if (fileAttributeView == null) {
    }

import org.jkiss.dbeaver.ui.navigator.project.FileSystemExplorerView;
        FileAttributeView fileAttributeView = Files.getFileAttributeView(resourcePath, PosixFileAttributeView.class);
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbenchPropertyPage;
 *
import java.util.stream.Collectors;
    }
    public IAdaptable getElement() {
import java.nio.file.attribute.*;
 * Unless required by applicable law or agreed to in writing, software
public class PrefPageProjectResourceDetails extends AbstractPrefPage implements IWorkbenchPropertyPage {
    public static final String PAGE_ID = "org.jkiss.dbeaver.preferences.resourceDetails"; //$NON-NLS-1$

            } catch (IOException e) {
                } else {

}
        return element;
                    }

                if (attributes.isDirectory()) {

    @Override
import org.jkiss.dbeaver.ui.UIUtils;
                    FileSystemExplorerView.FILE_TIMESTAMP_FORMAT.format(attributes.lastModifiedTime().toMillis()), SWT.BORDER | SWT.READ_ONLY);

