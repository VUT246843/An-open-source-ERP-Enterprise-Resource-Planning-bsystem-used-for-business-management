        final DBPPreferenceStore preferences = GISViewerActivator.getDefault().getPreferences();
        public String toString() {
        try {
            };
                populateToolbar();
                {
        if (RuntimeUtils.isWindows()) {
            throw new IOException("View template file not found (" + GISBrowserViewerConstants.VIEW_TEMPLATE_PATH + ")");
import org.jkiss.dbeaver.utils.ContentUtils;
                }
        composite = UIUtils.createPlaceholder(parent, 1);

import java.io.*;
        toolBarManager.add(new Action(GISMessages.panel_leaflet_viewer_tool_bar_action_text_open, DBeaverIcons.getImageDescriptor(UIIcon.BROWSER)) {
            if (presentation instanceof SpreadsheetPresentation) {
                        ((AbstractPresentation) presentation).setSelection(new StructuredSelection(selection), false);
        {
            for (String fileName : GISBrowserViewerConstants.INC_FILES) {
        }
            GC gc = new GC(image);
            // TODO:
                saveDialog.setFilterNames(filterNames);
            System.arraycopy(values, 0, truncValues, 0, maxObjects);
            @Override
            toolBarManager = new ToolBarManager(bottomToolbar);
import org.jkiss.dbeaver.model.data.DBDContent;
    private static final String PROP_SRID = "gis.srid";
            Object targetValue = value.getRawValue();
            return;
    private volatile boolean browserCreating = false;
        toolBarManager.removeAll();
            statusBar.setRedraw(true);

            imageData = GISBrowserImageUtils.getControlScreenshotOnWindows(browser);
                    imageLoader.save(fos, imageType);
        updateControlsVisibility();
            }
import org.jkiss.dbeaver.utils.GeneralUtils;
    private static final String PREF_RECENT_SRID_LIST = "srid.list.recent";
                if (geometry != null) {

                    // Variable 'geoMap' may be undefined during first run
            }
                    "    return undefined;" +
                }
                    CommonUtils.toDouble(bounds[2]),

        {
    }
            }
            if (binding.getEntityAttribute() != null) {
            //  and ignores other attributes, if present. There's no clear
                imageLoader.data[0] = captureBrowserImage();
        if (bindings[0].getAttribute() instanceof GisAttribute) {
        toolBarManager.add(new Separator());
                ImageLoader imageLoader = new ImageLoader();
    private Path generateViewScript(DBGeometry[] values, @Nullable Bounds bounds) throws IOException {
            } catch (Throwable e) {
        Action tilesSelectorAction = new SelectTilesAction(this);
        int oldSRID = sourceSRID;
    private void updateControlsVisibility() {
            new BrowserFunction(browser, "setClipboardContents") {
            return;
        } finally {
    }
        return lastValue;
                        .getAttributeGeometrySRID(new VoidProgressMonitor());
                }
    private static final Gson gson = new GsonBuilder()
                gc.dispose();
                if (vAttr != null) {
        boolean showMap = false;
                            final String[] split = ((String) pos).split(":");
            } finally {
        showLabels = preferences.getBoolean(GeometryViewerConstants.PREF_SHOW_LABELS);

    @Nullable
                            ContentUtils.close(fis);
            }
        @Nullable
        toolBarManager.add(new Action(GISMessages.panel_leaflet_viewer_tool_bar_action_text_print, DBeaverIcons.getImageDescriptor(UIIcon.PRINT)) {
            } else {
        if (browser != null) {
    }
            gc.dispose();
                yield String.valueOf(preferences.getInt(GeometryViewerConstants.PREF_MIN_ZOOM_LEVEL));
        this.sourceSRID = srid;
                    vAttr.setProperty(PROP_SRID, String.valueOf(getValueSRID()));
        toolBarManager.add(ActionUtils.makeActionContribution(tilesSelectorAction, true));
            try {
    }

import org.jkiss.code.Nullable;
                        continue;
            @Override
        if (browser == null) {
                final Shell shell = browser.getShell();


            this.north = north;
            }
            log.warn("Internal web browser initialization failed", error);
            }
                continue;
                }
            } catch (DBException e) {
        }
                    browser.setUrl("about:blank");
            reloadGeometryData(lastValue, true, false);
            DBDAttributeBinding binding = bindings[0];
import org.jkiss.dbeaver.ui.controls.resultset.spreadsheet.SpreadsheetPresentation;
            }
                    yield null;
 * you may not use this file except in compliance with the License.
import org.eclipse.jface.action.Separator;
                    browser.execute("javascript:window.print();");
        }
        if (!Files.exists(incFolder)) {
            if (srid == GisConstants.SRID_SIMPLE) {
import java.nio.file.Files;
        });
        }
                    }
import org.jkiss.code.NotNull;
                    DBWorkbench.getPlatformUI().showError("Image save error", "Error saving as picture", e);
        Action crsSelectorAction = new SelectCRSAction(this);

            crsSelectorAction.setEnabled(false);
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
    }
                if (ArrayUtils.isEmpty(values)) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    "}"
                public Object function(Object[] arguments) {

        }
                }
        }
        return composite;
        try {
                }
        });
        if (GeometryViewerConstants.PREF_SHOW_LABELS.equals(event.getProperty())) {
                for (int i = 0; i < SUPPORTED_FORMATS.length; i++) {
            //  vision of what we should do here instead.
            {
                    }


        List<String> geomValues = new ArrayList<>();
            toolsVisible = false;
 *

                        targetValue = request.getTargetValue();

        }

import org.eclipse.swt.SWTError;
        });
        final Browser browser = getBrowser();
    }
            public void run() {
                        return null;
                    value = value.flipCoordinates();
    }
            }
            try {

            this.west = west;
            statusBar.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        if (scriptFile == null) {
        private final double south;
        populateToolbar();
                    }
                    }
        }
        }
                // https://leafletjs.com/reference-1.7.1.html#latlngbounds
    private final DBDAttributeBinding[] bindings;
        }
        updateControlsVisibility();
    private final IResultSetPresentation presentation;
                for (Control control : composite.getChildren()) {
                FileDialog saveDialog = new FileDialog(shell, SWT.SAVE);
                // Some controls overlapping the map may be still in a disappearing process, so let's wait a little #20921
                srid = value.getSRID();
        GISViewerActivator.getDefault().getPreferences().setValue(GeometryViewerConstants.PREF_SHOW_LABELS, value);
            }
                // ignore
                    public Object function(Object[] arguments) {
                GC gc = new GC(browser.getDisplay());
import org.jkiss.dbeaver.DBException;
            // Check for save settings
import org.jkiss.dbeaver.runtime.DBWorkbench;
            statusBar.layout(true, true);


    }
                    vAttr.setProperty(PROP_FLIP_COORDINATES, String.valueOf(flipCoordinates));
            DBWorkbench.getPlatformUI().showError("Setting SRID", "Can't change source SRID to " + srid, e);
        if (maxObjects <= 0) {
                    "if (typeof geoMap === 'undefined') {" +


            GISViewerActivator.getDefault().getPreferences().setValue(PREF_RECENT_SRID_LIST, sridListStr.toString());
                browser = new Browser(composite, SWT.WEBKIT);
                    "} else {" +

            String recentSRIDString = preferences.getString(PREF_RECENT_SRID_LIST);
            return;
    private final Composite composite;
public class GISLeafletViewer implements IGeometryValueEditor, DBPPreferenceListener {
        refresh();
                            log.warn("Error copying inc file " + fileName, e);

            }
                    control.dispose();
                        imageType = SWT.IMAGE_PNG;
                }
        toolBarManager.add(new Action(GISMessages.panel_leaflet_viewer_tool_bar_action_text_flip, Action.AS_CHECK_BOX) {
    }
                return null;
                if (vEntity != null) {

            }
                }
            @Override
                setToolTipText(GISMessages.panel_leaflet_viewer_tool_bar_action_tool_tip_text_flip);
    private int actualSourceSRID; // SRID taken from geometry value

        {
                throw error;
                );
                        imageType = SWT.IMAGE_GIF;

 */
    }
import org.jkiss.dbeaver.ui.css.CSSUtils;
                    CommonUtils.toDouble(bounds[3])
 * distributed under the License is distributed on an "AS IS" BASIS,
                        for (Object pos : ((Object[]) arguments[0])) {
                try {
            }
    }
                    final Bounds bounds = recenter ? null : Bounds.tryExtractFromBrowser(browser);
    private boolean toolsVisible = true;
                setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.PALETTE));
                throw new DBException("Error generating viewer script", e);
        toolBarManager.update(true);
        return scriptFile;
        if (scriptFile != null) {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceListener;



        }
    private static class Bounds {
            }
    private static final int UNDEFINED_SRID = -1;

        return presentation;
                }
            }
                yield GeometryViewerRegistry.getInstance().getDefaultLeafletTiles().getLayersDefinition();
                    }
import org.jkiss.utils.CommonUtils;
import org.jkiss.dbeaver.model.virtual.DBVUtils;
                        GisTransformUtils.transformGisData(request);
        if (browser != null) {
    public void reloadGeometryData(@Nullable DBGeometry[] values, boolean force, boolean recenter) throws DBException {
                clipboard.setContents(new Object[] { imageData }, new Transfer[]{imageTransfer});

            }
            }
                        }
    public void setValueSRID(int srid) {
            checkIncludesExistence(tempDir);
        ImageData imageData;
                }
        }
    public void setShowLabels(boolean value) {
            if (srid != GeometryDataUtils.getDefaultSRID() && srid != GisConstants.SRID_3857) {
            case "geomSRID" -> String.valueOf(defaultSRID);
        return browserCreating;
        toolBarManager.add(ActionUtils.makeActionContribution(new ToggleLabelsAction(this), true));
            if (srid == UNDEFINED_SRID && value.getSRID() != 0) {
import org.jkiss.dbeaver.ui.gis.GeometryDataUtils;
                    actualSourceSRID = srid;
                    return null;
    }
            {
    @Override
        for (int i = 0; i < values.length; i++) {
import org.jkiss.dbeaver.ui.gis.GeometryViewerConstants;
                LeafletTilesDescriptor descriptor = GeometryViewerRegistry.getInstance().getDefaultLeafletTiles();
            }
import org.eclipse.jface.viewers.StructuredSelection;
            } else {
        };
            if (DBUtils.isNullValue(value)) {
        showLabels = value;
            //  Following code uses properties from very first attribute
        this.flipCoordinates = spatialDataProvider != null && spatialDataProvider.isFlipCoordinates();
                }
    private static final Log log = Log.getLog(GISLeafletViewer.class);
import org.jkiss.dbeaver.ui.controls.lightgrid.GridPos;
import org.jkiss.dbeaver.ui.gis.internal.GISViewerActivator;
import org.eclipse.swt.dnd.TextTransfer;
                } else {

        .registerTypeHierarchyAdapter(DBDContent.class, new DBDContentAdapter()).create();
            statusBar = UIUtils.createPlaceholder(composite, 1);//new Composite(composite, SWT.NONE);
    }
        }
                log.error(e);
        String geomTipValuesString = String.join(",", geomTipValues);
        private final double north;
                return new Bounds(
                ShellUtils.launchProgram(scriptFile.toAbsolutePath().toString());
            case "showMap" -> String.valueOf(isShowMap);
    public void updateToolbar() {
                for (String sridStr : recentSRIDString.split(",")) {
        }
        boolean toolsVisibility = toolsVisible;
        for (DBDAttributeBinding binding : bindings) {
        } else {
        }
    private ImageData captureBrowserImage() {
                        } catch (Exception e) {
        String template;
            browser.execute("javascript:showLabels(" + value + ")");
import org.jkiss.dbeaver.Log;
    public boolean isShowLabels() {
                if (bounds == null) {
            }
            }
                    geomTipValues.add("null");

            } catch (DBCException e) {
                        final List<GridPos> selection = new ArrayList<>();
    public Browser getBrowser() {
        browserCreating = true;
    public Control getEditorControl() {
        }
        }
import org.jkiss.dbeaver.model.DBUtils;
        try {
                    if (vAttr != null) {

package org.jkiss.dbeaver.ui.gis.panel;
        toolBarManager.add(new Action(GISMessages.panel_leaflet_viewer_tool_bar_action_text_show_hide, Action.AS_CHECK_BOX) {
            this.east = east;
                final Object[] bounds = (Object[]) browser.evaluate(
            case "minZoomLevel" -> {
                    "    let b = geoMap.getBounds();" +
    private final ToolBarManager toolBarManager;
import org.jkiss.dbeaver.ui.gis.registry.GeometryViewerRegistry;
            reloadGeometryData(lastValue, true, true);
        if (toolsVisible) {
                Thread.sleep(500);
import org.eclipse.swt.SWT;
        this.bindings = bindings;
                    browser.setUrl(file.toFile().toURI().toURL().toString());
                actualSourceSRID = srid;
            }

                DBPPreferenceStore preferences = GISViewerActivator.getDefault().getPreferences();
    private DBGeometry[] lastValue;
                    }
                GISEditorUtils.addRecentSRID(srid);
        return composite;
        boolean isShowMap = showMap;
        bindings[0].getDataSource().getContainer().persistConfiguration();
                DBVEntityAttribute vAttr = vEntity.getVirtualAttribute(binding, true);
        lastValue = values;
                value = value.force2D();

                    return;
        private final double east;
    }
            case "geomValues" -> CommonUtils.escapeHtml(geomValuesString);
            browser = new Browser(composite, SWT.NONE);
            @Override
            public boolean isChecked() {
            imageData = image.getImageData();
        });

        } catch (SWTError error) {
            CSSUtils.markConnectionTypeColor(statusBar);
            browser.addDisposeListener(e -> {
    private int defaultSRID; // Target SRID used to render map
import org.eclipse.swt.dnd.Transfer;
            case "geomCRS" -> geomCRS;
import org.jkiss.dbeaver.model.exec.DBCException;
                log.debug(e);
        if (fis == null) {
import org.jkiss.dbeaver.model.data.DBDAttributeBinding;
                GISViewerActivator.getDefault().getPreferences().removePropertyChangeListener(this);
                Geometry geometry = GisTransformUtils.getJtsGeometry(targetValue);
    public DBGeometry[] getCurrentValue() {
        if (!force && CommonUtils.equalObjects(lastValue, values)) {
                showMap = true;
            @Override
                try {
            }
                        this.sourceSRID = CommonUtils.toInt(vAttr.getProperty(PROP_SRID), this.sourceSRID);
            try {
                        actualSourceSRID = request.getSourceSRID();
            if (error.code != SWT.ERROR_NOT_IMPLEMENTED) {
        return actualSourceSRID;
    @Override
        saveAttributeSettings();
import org.eclipse.swt.browser.Browser;
            GISEditorUtils.curRecentSRIDs();
                } catch (IOException e) {
            } catch (IOException e) {
        toolBarManager.add(new Action(GISMessages.panel_leaflet_viewer_tool_bar_action_text_save_as, DBeaverIcons.getImageDescriptor(UIIcon.PICTURE_SAVE)) {

            }
            if (flipCoordinates) {
        try {
                        showMap = false;
                    "    return [b.getNorth(), b.getEast(), b.getSouth(), b.getWest()];" +
            @Override
                attributeSrid = ((GisAttribute) bindings[0].getAttribute())
                if (sridListStr.length() > 0) sridListStr.append(",");
import org.jkiss.dbeaver.ui.gis.registry.LeafletTilesDescriptor;

 *

        if (values != null && values.length > maxObjects) {

import org.jkiss.dbeaver.ui.gis.internal.GISMessages;
            UIUtils.updateContributionItems(toolBarManager);
    }
                        } finally {
            });
            if (!CommonUtils.isEmpty(recentSRIDString)) {
                    geomTipValues.add(gson.toJson(value.getProperties()));

    public Composite getBrowserComposite() {
            image.dispose();
        }
            Image image = new Image(Display.getDefault(), bounds.width, bounds.height);
            }
    public int getValueSRID() {
            case "defaultTiles" -> {
                }
import java.util.List;

                // HACK: Will force SWT to use IE instead. We can't use SWT.DEFAULT because it might resolve to SWT.EDGE
                    reloadGeometryData(lastValue, true, true);
                sridListStr.append(sridInt);
                } catch (DBException e) {
    private static final String[] SUPPORTED_FORMATS = new String[] { "png", "gif", "bmp" };
        }
                    gc.dispose();
    private Path scriptFile;
        toolBarManager.add(new Action(GISMessages.panel_leaflet_viewer_tool_bar_action_text_copy_as, DBeaverIcons.getImageDescriptor(UIIcon.PICTURE)) {
                cleanupFiles();
    private static final String PROP_FLIP_COORDINATES = "gis.flipCoords";
        int attributeSrid = UNDEFINED_SRID;


        .disableHtmlEscaping()
    public IResultSetPresentation getPresentation() {
import org.eclipse.jface.action.Action;
 * You may obtain a copy of the License at
    }
            case "geomBounds" -> CommonUtils.toString(bounds, "undefined");
                continue;
                ImageData imageData = captureBrowserImage();
            Path tempDir = DBWorkbench.getPlatform().getTempFolder(new VoidProgressMonitor(), "gis-viewer-files");
            case "showLabels" -> String.valueOf(showLabels);
            } catch (Exception e) {
                    CommonUtils.toDouble(bounds[0]),
    }
                setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.LINK_TO_EDITOR));
            }
                log.error("Error forcing geometry to 2D", e);

                    } catch (DBException e) {
            if (srid == UNDEFINED_SRID) {
                } finally {
                    final Path file = generateViewScript(values, bounds);
        if (browser != null) {
            try {
    }
    @Nullable
                        }
 * Unless required by applicable law or agreed to in writing, software
        {

            }
            browser = null;
    @Override
        toolBarManager.add(new Separator());
    private boolean showLabels;
    public void refresh() {
/*
                    return null;
            DBWorkbench.getPlatformUI().showError("Refresh", "Can't refresh value viewer", e);
                flipCoordinates = !flipCoordinates;
import org.jkiss.dbeaver.ui.gis.panel.actions.ToggleLabelsAction;
        }
        CSSUtils.markConnectionTypeColor(composite);
import org.jkiss.dbeaver.ui.*;
            StringBuilder sridListStr = new StringBuilder();
        });
import org.jkiss.dbeaver.model.virtual.DBVEntity;
        toolBarManager.add(ActionUtils.makeActionContribution(crsSelectorAction, true));
    private int sourceSRID = UNDEFINED_SRID; // Explicitly set SRID
    @Override
                        GisTransformRequest request = new GisTransformRequest(geometry, srid, GisConstants.SRID_4326);
                    DBWorkbench.getPlatformUI().showError("Render error", "Error rendering geometry", e);
                    try (OutputStream fos = Files.newOutputStream(incFolder.resolve(fileName))) {
                    @Override
        GC gc = new GC(browser.getDisplay());
            default -> null;
                File outFile = new File(filePath);

                return flipCoordinates;
    public GISLeafletViewer(Composite parent, @NotNull DBDAttributeBinding[] bindings, @Nullable SpatialDataProvider spatialDataProvider, @Nullable IResultSetPresentation presentation) {
import org.jkiss.utils.IOUtils;


    }
                };
    private Browser browser;
                    GISEditorUtils.addRecentSRID(recentSRID);
import org.eclipse.swt.layout.GridData;

            public void run() {
    }
    public void preferenceChange(PreferenceChangeEvent event) {
        private Bounds(double north, double east, double south, double west) {

        }
        try (InputStreamReader isr = new InputStreamReader(fis)) {


                if (filePath == null) {
        IVariableResolver resolver = name -> switch (name) {
            ToolBar bottomToolbar = new ToolBar(statusBar, SWT.FLAT | SWT.HORIZONTAL | SWT.RIGHT);
            }

    }
        
                @Override

        this.presentation = presentation;
import org.jkiss.dbeaver.ui.gis.IGeometryValueEditor;

                        log.debug("Error transforming CRS", e);
            try {
                ImageTransfer imageTransfer = ImageTransfer.getInstance();
    private final Composite statusBar;
                }
        }
import org.jkiss.dbeaver.runtime.IVariableResolver;

        if (showLabels == value) {
                Files.delete(scriptFile);
    public void setGeometryData(@Nullable DBGeometry[] values) throws DBException {
import com.google.gson.Gson;
        }
import java.nio.file.Path;
                    if (filePathLower.endsWith(".png")) {
        } finally {
        toolsVisible = toolsVisibility;
                        showMap = request.isShowOnMap();
                try {
}
                );
        public static Bounds tryExtractFromBrowser(@NotNull Browser browser) {
                }
                saveAttributeSettings();
import com.google.gson.GsonBuilder;
                        try {
        try {
                    filterNames[i] = SUPPORTED_FORMATS[i].toUpperCase() + " (*." + SUPPORTED_FORMATS[i] + ")";
    private void saveAttributeSettings() {
    }
            if (srid == UNDEFINED_SRID) {
            case "geomTipValues" -> CommonUtils.escapeHtml(geomTipValuesString);
            int srid = sourceSRID;
            }
            public void run() {
                browser.print(gc);

                srid = attributeSrid;
import org.jkiss.dbeaver.ui.controls.resultset.IResultSetPresentation;
            sourceSRID = oldSRID;
                DBVEntity vEntity = DBVUtils.getVirtualEntity(binding, true);
 * limitations under the License.
            }
            try {
                if (CommonUtils.isEmpty(value.getProperties())) {
import org.jkiss.dbeaver.data.gis.handlers.WKGUtils;
                String[] extensions = new String[SUPPORTED_FORMATS.length];
                log.error("Error retrieving map bounds", e);
            values = truncValues;
import org.eclipse.swt.widgets.*;
        }
            public boolean isChecked() {
                return toolsVisible;


                targetValue = WKGUtils.linearize((org.cugos.wkg.Geometry) targetValue);

        } catch (DBException e) {
                    log.error(e);
            maxObjects = GeometryViewerConstants.DEFAULT_MAX_OBJECTS_RENDER;
                Clipboard clipboard = new Clipboard(Display.getCurrent());
        }*/
        String geomCRS = actualSourceSRID == GisConstants.SRID_SIMPLE ? GisConstants.LL_CRS_SIMPLE : GisConstants.LL_CRS_3857;
            }
            @Override
 *
                    int recentSRID = CommonUtils.toInt(sridStr);
        return browser;
        }
                try (OutputStream fos = new FileOutputStream(outFile)) {
        } catch (DBException e) {
    }
        }
                showMap = false;
                if (descriptor == null) {
                            selection.add(new GridPos(CommonUtils.toInt(split[0]), CommonUtils.toInt(split[1])));
            browser.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
            for (Integer sridInt : GISEditorUtils.getRecentSRIDs()) {
    @Override
                }

                }
            } else if (srid == GisConstants.SRID_4326) {
import java.util.ArrayList;
 * DBeaver - Universal Database Manager
        reloadGeometryData(values, false, true);
        }
import org.jkiss.dbeaver.ui.controls.resultset.AbstractPresentation;
            DBGeometry[] truncValues = new DBGeometry[maxObjects];
        Files.writeString(scriptFile, GeneralUtils.replaceVariables(template, resolver));
            public void run() {
            }
            }
                } catch (DBException e) {
            try {

        return imageData;
                toolsVisible = !toolsVisible;
    private boolean flipCoordinates = false;
            // Truncate value list
        private final double west;
                }
            if (binding.getEntityAttribute() != null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
            // Disallow changing srid if geometries have different srid

import org.jkiss.utils.ArrayUtils;

        } finally {
            Files.createDirectories(incFolder);
            } catch (IOException e) {
        Path incFolder = scriptDir.resolve("inc");
                ShellUtils.launchProgram(outFile.getAbsolutePath());

    void populateToolbar() {
import org.eclipse.swt.dnd.ImageTransfer;
import org.jkiss.dbeaver.utils.RuntimeUtils;
                DBVEntity vEntity = DBVUtils.getVirtualEntity(binding, false);
            // Save SRID to the list of recently used SRIDs
                int imageType = SWT.IMAGE_BMP;
            return String.format("L.latLngBounds(L.latLng(%f, %f), L.latLng(%f, %f))", north, east, south, west);
                String filePath = DialogUtils.openFileDialog(saveDialog);
            this.south = south;
                String[] filterNames = new String[SUPPORTED_FORMATS.length];


            case "showTools" -> String.valueOf(toolsVisible);
        InputStream fis = GISViewerActivator.getDefault().getResourceStream(GISBrowserViewerConstants.VIEW_TEMPLATE_PATH);
        int maxObjects = GISViewerActivator.getDefault().getPreferences().getInt(GeometryViewerConstants.PREF_MAX_OBJECTS_RENDER);
    private void cleanupFiles() {
                InputStream fis = GISViewerActivator.getDefault().getResourceStream(GISBrowserViewerConstants.WEB_INC_PATH + fileName);
                    UIUtils.setClipboardContents(Display.getCurrent(), TextTransfer.getInstance(), arguments[0]);
 * See the License for the specific language governing permissions and
            @Override
        }

    private void checkIncludesExistence(Path scriptDir) throws IOException {
            if (targetValue == null) {
                } else {
        if (srid == sourceSRID) {
                saveDialog.setFilterExtensions(extensions);
        @Override
            } catch (InterruptedException e) {
            // Maybe we should transform them into source srid first and then transmute into a desired one?
                    extensions[i] = "*." + SUPPORTED_FORMATS[i];
        }

                    try {
        this.defaultSRID = actualSourceSRID;
        }
import org.eclipse.swt.graphics.*;

                srid = GeometryDataUtils.getDefaultSRID();
            scriptFile = Files.createTempFile(tempDir, "view", "gis.html");
                new BrowserFunction(browser, "setPresentationSelection") {
            browserCreating = false;

 * Copyright (C) 2010-2025 DBeaver Corp and others
                if (fis != null) {
        if (browser == null) {
    }
            }
        });

            template = IOUtils.readToString(isr);
            statusBar.setRedraw(false);

        String geomValuesString = String.join(",", geomValues);
                } else {

            try {
            //return;
                }
                imageLoader.data = new ImageData[1];
import org.eclipse.swt.dnd.Clipboard;


            public void run() {
import org.jkiss.dbeaver.model.virtual.DBVEntityAttribute;
        List<String> geomTipValues = new ArrayList<>();
                        srid = request.getTargetSRID();
            }
import org.jkiss.dbeaver.model.gis.*;
                    CommonUtils.toDouble(bounds[1]),
                        actualSourceSRID = srid;
                    } else if (filePathLower.endsWith(".gif")) {

        /*if (Arrays.stream(lastValue).map(DBGeometry::getSRID).distinct().count() > 1) {

import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
                updateControlsVisibility();
                    String filePathLower = filePath.toLowerCase();
        //if geometries have different srid show warning and do nothing (see in SelectCRSAction)
            DBGeometry value = values[i];
                        this.flipCoordinates = CommonUtils.getBoolean(vAttr.getProperty(PROP_FLIP_COORDINATES), this.flipCoordinates);
        return showLabels;
import org.eclipse.jface.action.ToolBarManager;
            }
import org.locationtech.jts.geom.Geometry;
            }

                log.debug("Can't delete temp script file '" + scriptFile + "'", e);
            Rectangle bounds = browser.getBounds();
            geomValues.add("'" + targetValue + "'");
        preferences.addPropertyChangeListener(this);
                            IOUtils.copyStream(fis, fos);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        }
                    if (recentSRID == 0 || recentSRID == GeometryDataUtils.getDefaultSRID() || recentSRID == GisConstants.SRID_3857) {
                populateToolbar();

            return;
            if (WKGUtils.isCurve(targetValue)) {
import org.jkiss.dbeaver.model.runtime.VoidProgressMonitor;
                    DBVEntityAttribute vAttr = vEntity.getVirtualAttribute(binding, false);
            browser.execute("javascript:showTools(" + toolsVisible + ");");
import org.eclipse.swt.browser.BrowserFunction;
            return;
    public boolean isBrowserCreating() {
        }
                actualSourceSRID = srid;
            public void run() {
            }

