        @Override
                }
import org.eclipse.swt.custom.ScrolledComposite;
        }
                for (int i = 0; i < images.size(); i++) {
                path.substring(path.lastIndexOf('/') + 1),
        header.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        @Nullable
                Collectors.summingInt(x -> 1)
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);

                    hiddenExtensions.remove(extension);

        options.setLayout(new RowLayout());
                panels.forEach(Control::redraw);
        UIUtils.configureScrolledComposite(viewport, container);
                path.substring(path.lastIndexOf('.') + 1),
            int row = y / (size.y + SPACING);
        header.setLayout(new GridLayout(2, false));
                    return;

                return new Point(columns * (size.x + SPACING), rows * (size.y + SPACING));
            }
                .comparingInt((Map.Entry<Rectangle, List<ImageLocation>> e) -> e.getValue().size()) // by count
    private boolean showBorders = true;
                e.gc.setForeground(e.display.getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
        });
            try {
import org.osgi.framework.BundleContext;



                    if (showBorders) {
import org.eclipse.swt.graphics.Rectangle;
import java.io.File;
        }));
    private final List<ImagePanel> panels = new ArrayList<>();
        UIUtils.createLabel(header, "%s x %s (%s)".formatted(bounds.width, bounds.height, images.size()));
import org.jkiss.dbeaver.ui.app.devtools.handlers.ShowIconsHandler;
import org.eclipse.swt.layout.GridLayout;
    private static void collectIcons(@NotNull Bundle bundle, @NotNull Consumer<String> consumer) {
}
                }
                var url = bundle.getEntry(path);
    }
            }
 * Licensed under the Apache License, Version 2.0 (the "License");
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
                    ShellUtils.showInSystemExplorer(new File(url.toURI()));

                if (extensionCheck.getSelection()) {
            ));
        shell.setText("Icons");
        container.setLayoutData(new GridData(GridData.FILL_BOTH));
        showBordersCheck.setText("Show borders");
                    setToolTipText(null);
 * You may obtain a copy of the License at

                log.debug("Failed to create image for " + bundle.getSymbolicName() + " - " + path + ": " + e.getMessage());
                    var url = FileLocator.toFileURL(image.url());
                return;
        Map<String, Integer> extensions = images.stream()
                int columns = getColumns(area.width, size.x);
                bundle,
        super(shell);
        Composite composite = (Composite) super.createDialogArea(parent);
                int x = 0;
        List<ImageLocation> images = new ArrayList<>();
                    hiddenExtensions.add(extension);
            extensionCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
 *
import org.jkiss.dbeaver.ui.ShellUtils;
                if (image == null) {
                    var image = images.get(i);

import org.eclipse.swt.graphics.Point;
 *     http://www.apache.org/licenses/LICENSE-2.0
                Rectangle area = getClientArea();
import java.util.List;
                consumer.accept(path);
        ImagePanel panel = new ImagePanel(parent, images, new Point(bounds.width, bounds.height));
 * See the License for the specific language governing permissions and
import org.osgi.framework.FrameworkUtil;
import org.jkiss.code.NotNull;
        panels.add(panel);
        Composite container = new Composite(viewport, SWT.NONE);
import org.eclipse.jface.dialogs.TrayDialog;

            if (path.endsWith("/")) {
    protected void configureShell(Shell shell) {
                    }
        }
                ImageLocation image = getImageAt(e.x, e.y);
        ScrolledComposite viewport = UIUtils.createScrolledComposite(composite, SWT.V_SCROLL);
    private void collectIcons(@NotNull BiConsumer<Bundle, String> consumer) {
            String path = paths.nextElement();
import org.eclipse.swt.layout.GridData;

        private int getColumns(int width, int size) {
        public Point computeSize(int wHint, int hHint, boolean changed) {
import org.eclipse.swt.widgets.*;
    @Override
                    }


import org.eclipse.swt.events.MouseListener;
import org.eclipse.jface.layout.GridLayoutFactory;
import java.util.function.Consumer;
            if (wHint == SWT.DEFAULT) {
                    log.error("Error accessing icon " + image.url(), ex);
import org.eclipse.swt.SWT;
            if (index < 0 || index >= images.size()) {
            int index = row * getColumns(area.width, size.x) + column;
import org.eclipse.swt.events.SelectionListener;

import org.eclipse.jface.layout.GridDataFactory;
import java.util.*;
    }
                return new Point(images.size() * (size.x + SPACING), size.y);
        }
                .reversed())
            }
        super.configureShell(shell);
            Rectangle area = getClientArea();

                    }
    }

    private record ImageLocation(Bundle bundle, String path, String filename, String extension, URL url, Image image) {
 * Copyright (C) 2010-2025 DBeaver Corp and others
            if (!name.startsWith("org.jkiss.dbeaver") && !name.startsWith("com.dbeaver")) {
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
import org.jkiss.dbeaver.ui.UIUtils;

        }
                    setToolTipText("%s - %s".formatted(image.bundle().getSymbolicName(), image.path()));
            .sorted(Comparator.comparing(ImageLocation::filename))
    @Override
                    var nowTransparent = hiddenExtensions.contains(image.extension());
    }
                    e.gc.drawImage(image.image(), x + 1, y + 1);

        options.setText("Options");
            String name = bundle.getSymbolicName();
                    return;

    @Override

                image
        }
                        transparent = nowTransparent;

    }
    private void createCategory(@NotNull Composite parent, @NotNull Rectangle bounds, @NotNull List<ImageLocation> images) {
            Button extensionCheck = new Button(options, SWT.CHECK);
                int columns = getColumns(wHint, size.x);
                path,
                boolean transparent = false;
                int rows = Math.max(1, (images.size() + columns - 1) / columns);
                location.image().dispose();
        options.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
import org.eclipse.jface.dialogs.IDialogConstants;
        container.setLayout(GridLayoutFactory.fillDefaults().spacing(0, 0).create());

                } catch (Exception ex) {

        Composite header = new Composite(parent, SWT.NONE);
                int y = 0;
                        e.gc.drawRectangle(x, y, size.x + 1, size.y + 1);
                e.gc.fillRectangle(0, 0, e.width, e.height);
    protected boolean isResizable() {

        return composite;

import java.util.function.BiConsumer;
    }
package org.jkiss.dbeaver.ui.app.devtools.ui;
        private ImageLocation(Bundle bundle, String path, URL url, Image image) {
            .collect(Collectors.groupingBy(image -> image.image().getBounds())).entrySet().stream()

        showBordersCheck.setSelection(showBorders);
import org.jkiss.dbeaver.Log;
                }

                return null;
        }
    private static final Log log = Log.getLog(ShowIconsHandler.class);
    }
            addPaintListener(e -> {
        });
            createCategory(container, entry.getKey(), entry.getValue());
            super(parent, SWT.NONE);
    private static void collectIcons(@NotNull Bundle bundle, @NotNull String root, @NotNull Consumer<String> consumer) {
                    x += size.x + SPACING;
        panel.setLayoutData(new GridData(GridData.FILL_BOTH));
 * DBeaver - Universal Database Manager
 *
import java.net.URL;

                    if (transparent != nowTransparent) {
            return Math.max(1, width / (size + SPACING));
    }
                }
    }
        viewport.addDisposeListener(e -> {
public class IconDialog extends TrayDialog {
 * limitations under the License.
            });

                return null;
        return true;
                images.add(new ImageLocation(bundle, path, url, image));
            });
        extensions.forEach((extension, count) -> {

            showBorders = showBordersCheck.getSelection();

                ImageLocation image = getImageAt(e.x, e.y);

            return;
                collectIcons(bundle, path, consumer);
            addMouseMoveListener(e -> {
        });
 *

    private class ImagePanel extends Composite {
        Enumeration<String> paths = bundle.getEntryPaths(root);
import org.osgi.framework.Bundle;
    protected void createButtonsForButtonBar(Composite parent) {
            if (x < 0 || y < 0 || x >= area.width || y >= area.height) {
                url,
            this.size = size;
import org.jkiss.code.Nullable;

 * you may not use this file except in compliance with the License.
        private final Point size;

        viewport.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).hint(700, 500).create());
 */
import org.eclipse.swt.layout.RowLayout;
        if (paths == null) {
                if (e.button != 1) {
                        y += size.y + SPACING;
            .sorted(Comparator
        for (Bundle bundle : context.getBundles()) {
            } catch (SWTException e) {
            }
            addMouseListener(MouseListener.mouseUpAdapter(e -> {
        showBordersCheck.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
            } else {
        private static final int SPACING = 5;
                try {
    @Override
            extensionCheck.setSelection(true);
            for (ImageLocation location : images) {
                        e.gc.setAlpha(nowTransparent ? 30 : 255);
        private ImageLocation getImageAt(int x, int y) {
        }
            panels.forEach(Control::redraw);
            }
                e.gc.setAdvanced(!hiddenExtensions.isEmpty());

 * distributed under the License is distributed on an "AS IS" BASIS,
    }
    }

        UIUtils.createLabelSeparator(header, SWT.HORIZONTAL);

            }
                    if (i > 0 && i % columns == 0) {

import org.eclipse.core.runtime.FileLocator;
            }
                ImageLocation::extension,
        for (Map.Entry<Rectangle, List<ImageLocation>> entry : categories.entrySet()) {
            }));
        collectIcons((bundle, path) -> {
            collectIcons(bundle, path -> consumer.accept(bundle, path));
    public IconDialog(@NotNull Shell shell) {
/*
        private final List<ImageLocation> images;
                } else {
import java.util.stream.Collectors;
            } else {
        }
        Group options = new Group(composite, SWT.NONE);
            }));
                } else {
        public ImagePanel(@NotNull Composite parent, @NotNull List<ImageLocation> images, @NotNull Point size) {
                continue;
                        x = 0;
                }
            if (path.contains("@2x")) {


            this(
            int column = x / (size.x + SPACING);
    private final Set<String> hiddenExtensions = new HashSet<>();
            );
        Button showBordersCheck = new Button(options, SWT.CHECK);
                .thenComparingInt(e -> e.getKey().width * e.getKey().height) // by density
                var image = ImageDescriptor.createFromURL(url).createImage(true);
 * Unless required by applicable law or agreed to in writing, software
            this.images = images;
import org.eclipse.jface.resource.ImageDescriptor;
        }
        collectIcons(bundle, "icons", consumer);
import org.eclipse.swt.SWTException;
                }

            }
        BundleContext context = FrameworkUtil.getBundle(getClass()).getBundleContext();
            return images.get(index);
import org.eclipse.swt.graphics.Image;
        Map<Rectangle, List<ImageLocation>> categories = images.stream()
    protected Composite createDialogArea(Composite parent) {
                // Skip @2x variations for now

                if (image == null) {
            .collect(Collectors.groupingBy(
        while (paths.hasMoreElements()) {
            extensionCheck.setText("%s (%d)".formatted(extension.toUpperCase(), count));
