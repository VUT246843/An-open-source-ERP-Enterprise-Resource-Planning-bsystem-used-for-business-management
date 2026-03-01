                    Iterator<ImageReader> readers = ImageIO.getImageReaders(stream);
import org.jkiss.dbeaver.Log;
                    if (!readers.hasNext()) {
            super.dispose();


            DBWorkbench.getPlatform().getTempFolder(new VoidProgressMonitor(), "dbeaver-images"),
                throw error;
    }
import java.nio.file.Path;
                        reader.setInput(stream);
    private Path tempFile;

            if (RuntimeUtils.isLinux()) {
                        ImageIO.write(ImageIO.read(stream),
import org.jkiss.dbeaver.ui.UIUtils;
            } else {
                    success = true;
                            "." + reader.getFormatName().toLowerCase(Locale.ROOT)
        }

    @Override
            }.schedule();
        clearTempFile();
 */
    }
                    showBinaryTXT(inputStream);
import java.net.URL;
                    }
                            reader.getFormatName().toLowerCase(Locale.ROOT),
import org.eclipse.swt.widgets.Control;
                Files.delete(tempFile);
        }
import org.eclipse.swt.widgets.Composite;
        );
import org.jkiss.dbeaver.utils.GeneralUtils;
                }
import org.jkiss.code.Nullable;

import org.eclipse.swt.layout.GridLayout;
import javax.imageio.ImageIO;

        // Add DND support
        try {

            }

                        tempFile = Files.createTempFile(
            } else {
import org.eclipse.swt.browser.Browser;
public class BrowserImageViewer extends AbstractImageViewer {
                try (ImageInputStream stream = ImageIO.createImageInputStream(inputStream)) {
 *
import org.jkiss.dbeaver.utils.RuntimeUtils;
                );
import org.eclipse.swt.layout.GridData;
    private void showBinaryTXT(@NotNull InputStream inputStream) throws IOException {

import java.util.Iterator;
                    if (!exception.getMessage().equals("closed")) {
    public BrowserImageViewer(Composite parent, int style) {
import java.io.InputStream;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.Status;
            browser = new Browser(this, SWT.NONE);
            browserCreating = false;
        gl.marginHeight = 0;


 * you may not use this file except in compliance with the License.
/*

                        );
                try (OutputStream outputStream = Files.newOutputStream(tempFile, StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
import java.util.Locale;
import javax.imageio.stream.ImageInputStream;
                    "image",
import java.nio.file.Files;
                tempFile = Files.createTempFile(
        browser.setUrl(null);
        // Edge uses callbacks which have a lowest priority in UI
                    } else {
                browser = null;
    }

    public boolean loadImage(@NotNull InputStream inputStream) {
                    return Status.OK_STATUS;
    private volatile boolean browserCreating = false;

            new Job("Disposing browser") {
        tempFile = Files.createTempFile(
    @Override
            URL url = tempFile.toUri().toURL();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        } catch (SWTError error) {
                            tempFile.toFile()

        }
                    while (browserCreating) {
        }
    }
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
        } else {
    private static final Log log = Log.getLog(BrowserImageViewer.class);
        browser.setLayoutData(new GridData(GridData.FILL_BOTH));
            }
}
 * You may obtain a copy of the License at
                for (Control control : getChildren()) {
import javax.imageio.ImageReader;
                    log.error("Error reading image data", ex);
                } catch (IOException exception) {
            ".txt"
                } catch (IOException ex) {
/**
        // on already disposed composite, we don't want this at all
                        throw new IOException("No Image readers");
import org.eclipse.swt.SWTError;
        GridLayout gl = new GridLayout(1, false);
        Files.writeString(tempFile, s);
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    IOUtils.copyStream(inputStream, outputStream);
                            DBWorkbench.getPlatform().getTempFolder(new VoidProgressMonitor(), "dbeaver-images"),
 * distributed under the License is distributed on an "AS IS" BASIS,
        boolean success = false;
        if (browser != null) {
            } catch (IOException e) {
                }
                    ""
        super(parent, style);
 *     http://www.apache.org/licenses/LICENSE-2.0
                }
 * limitations under the License.
        // We can prevent this error by delaying dispose in independent thread operation to allow Edge to finish its
 * DBeaver - Universal Database Manager
                @Override
        // initialization to be disposed properly
            browser.setUrl(url.toString());
                    UIUtils.syncExec(BrowserImageViewer.super::dispose);
        browser.setJavascriptEnabled(false); // We don't need java script to open images
        gl.marginWidth = 0;
    public boolean clearImage() {
                // HACK: Will force SWT to use IE instead. We can't use SWT.DEFAULT because it might resolve to SWT.EDGE
    @Override
        try {
 * Unless required by applicable law or agreed to in writing, software
            try {
    }
        if (tempFile != null && Files.exists(tempFile)) {
    private void clearTempFile() {
                            "image",
        //FIXME That should be removed as soon as Edge will be fixed, this is an awfull hack
                        showBinaryTXT(inputStream);
        // So if dispose is sent during that operation this will lead to initialization
        gl.verticalSpacing = 0;
        } catch (IOException exception) {
        setLayout(gl);
        return true;
                        );
                    control.dispose();
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
                log.warn(e);
            if (error.code == SWT.ERROR_NOT_IMPLEMENTED) {
import org.eclipse.core.runtime.IStatus;
                        log.error("Error reading image data", exception);
                    DBWorkbench.getPlatform().getTempFolder(new VoidProgressMonitor(), "dbeaver-images"),
 * Image viewer control
        String s = IOUtils.readToString(new InputStreamReader(inputStream, GeneralUtils.DEFAULT_ENCODING));
                browser = new Browser(this, SWT.WEBKIT);
        clearTempFile();
        tempFile = null;
package org.jkiss.dbeaver.ui.controls.imageview;

                        Thread.onSpinWait();

    private Browser browser;
        return success;
        browserCreating = true;
import java.io.InputStreamReader;
            "image",
    }
    private ImageData imageData;
            log.error(exception);

            clearTempFile();
    @Override
 *
    public Path getExternalFilePath() {
        gl.horizontalSpacing = 0;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.jkiss.code.NotNull;
    @Nullable
        return tempFile;
import java.io.OutputStream;
 *
import org.eclipse.core.runtime.IProgressMonitor;
                        ImageReader reader = readers.next();
                }
import java.nio.file.StandardOpenOption;
            }
                    }
        } finally {

                    }
                        success = true;
                protected IStatus run(IProgressMonitor monitor) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
    public void dispose() {
 * See the License for the specific language governing permissions and
import java.io.IOException;
        int i = 0;

import org.jkiss.utils.IOUtils;
