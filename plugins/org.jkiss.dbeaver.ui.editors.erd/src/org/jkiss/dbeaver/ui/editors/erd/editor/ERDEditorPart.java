                    avMenu.add(new EmptyAction(avaTitle));
            setDiagramNotation(notation);
    public ERDHighlightingManager getHighlightingManager() {
        }
        if (settingsAction.isEnabled()) {
        @Override
    {
        private final ERDViewStyle style;
            if (format.getExtension().equals(ext)) {

                            resultsFound = true;
                refreshEntityAndAttributes();
            return;
        zoomCombo.setZoomManager(zoomManager);
    private class ChangeERDRouterStyleAction extends Action {
        if (hasProgressControl()) {
                contributionManager.update(true);
    }
    }
 *
        IEditorInput editorInput = this.getEditorInput();
        @Override
                    if (progressControl != null) {
        if (navigatorViewerAdapter == null) {
import org.jkiss.dbeaver.ui.editors.IDatabaseEditorInput;
                curSearchPattern = null;
     * Adds an action to this editor's <code>ActionRegistry</code>. (This is
        if (editDomain.getPaletteViewer() != null) {
            return;


        @Override
            GraphicalViewer graphicalViewer = getGraphicalViewer();
        }
        @Nullable
                }

        @Override
    }
     * @param reload - load diagram 
    }


     */
            placeholder.addPaintListener(e -> {
            menu.add(resetPartColorAction);
    {
        setDirty(getCommandStack().isDirty());
        GraphicalViewer viewer = getGraphicalViewer();
            if (graphicalViewer == null) {
import org.jkiss.dbeaver.ui.editors.erd.part.*;
        }
                            return true;
        if (graphicalControl == null) {
        } else if (adapter == EditDomain.class) {

        } else if (adapter == ActionRegistry.class) {
        }
                } catch (PatternSyntaxException e) {
                for (Object item : ((IStructuredSelection) selection).toArray()) {
        }
import org.jkiss.dbeaver.ui.editors.erd.editor.tools.ChangeZOrderAction;
    /**
            DBWorkbench.getPlatformUI().showError("ERD export", "No export format correspond to file extension '" + ext + "'");
    }
import org.jkiss.dbeaver.ui.editors.erd.model.ERDContentProviderDecorated;
            return placeholder;
                    } else {
            } else {
            return false;
    public void fillNotationsMenu(IMenuManager menu) {
        {
import org.eclipse.jface.util.IPropertyChangeListener;
                parts.add("unnammed");
    }
    protected void installKeyHandler(GraphicalViewer viewer) {
            undoablePropertySheetPage.setRootEntry(new UndoablePropertySheetEntry(getCommandStack()));
        }
        // Update actions
     * @param menu - root node
    }
    }
                {
            return notation.getId().equals(getDiagramNotation().getId());
        toolBarManager.add(new ToggleViewAction(IPageLayout.ID_PROP_SHEET));
    public Viewer getNavigatorViewer() {
        public ProgressVisualizer<EntityDiagram> createLoadVisualizer()
import org.eclipse.ui.*;
            }
            avMenu.add(new EmptyAction(ERDUIMessages.menu_attribute_visibility_default));
    }

                DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();
        }
        });
     * <p/>
        }
        for (Object actionId : actionIds) {
import org.jkiss.dbeaver.model.erd.*;

                outlinePage = new ERDOutlinePage((ScalableFreeformRootEditPart) rootEditPart);
        if (editorInput instanceof IDatabaseEditorInput) {
        @Override
     * @return the preferences for the Palette Flyout
    /**
    @Override

                resultsIterator = results.listIterator();

            new IPartService() {
        return undoablePropertySheetPage;
            super(router.getName(), AS_CHECK_BOX);
                    currentItem = null;
    @Override
        String[] extensions = new String[allFormats.size()];
            public void completeLoading(EntityDiagram entityDiagram)

    protected PaletteViewerProvider createPaletteViewerProvider()

                    return null;
        }
        return new ERDDecoratorDefault();
                return entityDiagram;
    public ERDContentProvider getContentProvider() {
            } else if (ERDUIConstants.PREF_DIAGRAM_SHOW_VIEWS.equals(event.getProperty()) ||
    {
        public void refresh() {
     */
    private ERDOutlinePage outlinePage;
        private boolean editModeEnabled = false;

        return diagramLoadingJob != null && diagramLoadingJob.getState() == Job.RUNNING;
        MenuManager ntMenu = new MenuManager(ERDUIMessages.menu_notation_style);
import org.eclipse.swt.printing.PrinterData;
    private IPropertyChangeListener configPropertyListener;
                String likePattern = SQLUtils.makeLikePattern(searchString);
     * initializes it.
                menuService.populateContributionManager(extToolBar , "toolbar:ERDEditorToolbar");
    /**
        PaletteRoot paletteRoot = new PaletteRoot();
        // Set context menu
                    avMenu.add(new ChangeAttributeVisibilityAction(false, ERDAttributeVisibility.KEYS));
            return getRootNode();
    public DBECommandContext getCommandContext() {
import org.jkiss.dbeaver.ui.editors.erd.export.ERDExportFormatRegistry;
        return true;
        }
        toolBarManager.add(zoomInAction);
     * The method process entity relation diagram for element visualization
                    }
    public ERDDecorator getDecorator() {
                    store.getInt(ERDUIConstants.PREF_GRID_HEIGHT)));
            parent,
        }
    private ERDDecorator decorator;
            contentContainer = progressControl.createContentContainer();
        return highlightingManager;
        for (ERDExportFormatRegistry.FormatDescriptor format : allFormats) {
            IStructuredSelection selection = (IStructuredSelection)event.getSelection();
import org.eclipse.jface.dialogs.IDialogConstants;
                    if (node instanceof DBPNamedObject && node instanceof EditPart) {
    private static final Log searcherLog = Log.getLog(Searcher.class);
        if (divPos == -1) {
        {
    }
        initializeGraphicalViewer();


        if (getDiagram().getDecorator().supportsAttributeVisibility()) {

        IWorkbenchPartSite site = getSite();
     * <p/>
        if (null == undoablePropertySheetPage) {
     *
        Composite contentContainer = parent;
    public GraphicalViewer getViewer()
        public void fillCustomActions(IContributionManager toolBarManager) {
            undoablePropertySheetPage = new PropertySheetPage();
    {
        return contentProvider;
    public boolean isSearchPossible()
    /**
    public class ProgressControl extends ProgressPageControl {
        implements DBPDataSourceTask, IDatabaseModellerEditor, ISearchContextProvider, IRefreshablePart, INavigatorModelView {
        }
        }
        } else {

     */
        return new ERDContentProviderDecorated();
        for (Object actionId : getSelectionActions()) {
        }
                    curSearchPattern = Pattern.compile(likePattern, Pattern.CASE_INSENSITIVE);
        UIUtils.syncExec(() -> graphicalControl.setBackground(ERDThemeSettings.instance.diagramBackground));
     */
                            }
                                }
        if (reload) {
    }
        zoomOutAction.setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.ZOOM_OUT));
            if (rootEditPart instanceof ScalableFreeformRootEditPart) {
    private class ChangeAttributePresentationAction extends Action {
     * An event will be fired immediately if the new state is different than the

        protected void populateCustomActions(ContributionManager contributionManager) {
                        progressControl.setInfo(e.getMessage());
    @Nullable
    @Override
 * Licensed under the Apache License, Version 2.0 (the "License");
            if (!actionSet.contains(action)) {

                refreshEntityAndAttributes();
        return decorator;
 */
        this.getGraphicalViewer().getControl().setBackground(ERDThemeSettings.instance.diagramBackground);
        {
    public boolean isActiveTask() {

    /**
        for (ERDConnectionRouterDescriptor ntType : ERDConnectionRouterRegistry.getInstance().getDescriptors()) {
     * @param actionIds the list of ids of actions to update
                    ERDPreferencePage.PAGE_ID);

    @Nullable
                refreshDiagram(true, false);
            diagramLoadingJob.cancel();
                    if (!errorMessages.isEmpty()) {

        SetPartSettingsAction settingsAction = new SetPartSettingsAction(this, selection);
    {
    /**
        return paletteRoot;
        zoomManager.setZoomLevelContributions(zoomLevels);

import org.jkiss.dbeaver.model.DBPDataSourceTask;
                ERDAttributeVisibility attrVisibility = CommonUtils.valueOf(ERDAttributeVisibility.class, CommonUtils.toString(event.getNewValue()));
                this.searchString = searchString;
        } else if (adapter == ZoomManager.class) {
            }
        public void setInput(Object input) {
            // Add dynamic toolbar contributions

            filterNames[i] = allFormats.get(i).getLabel() + " (" + extensions[i] + ")";
            }
        }
import org.eclipse.jface.widgets.CompositeFactory;

     * <code>EditDomain</code>.
                status = CommonUtils.toString(selection.getFirstElement());
     * No-arg constructor

        @Override

    }
            return;
                super.visualizeLoading();

import org.eclipse.swt.graphics.Color;
                }


        public boolean canExecute() {
import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotationRegistry;

    }
        // configure the viewer
import org.jkiss.dbeaver.model.DBIcon;
        viewer.addDropTargetListener(new DataEditDropTargetListener(viewer));
                    Color color = ERDThemeSettings.instance.searchHighlightColor;
        this.notationStyle = notation;
                monitor.worked(1);
        }
    @Override
            ntMenu.add(new ChangeERDRouterStyleAction(ntType));
                if (likePattern.isEmpty() || (curSearchPattern != null && likePattern.equals(curSearchPattern.pattern()))) {
            }
        ZoomInAction zoomInAction = new ZoomInAction(zoomManager);
                graphicalViewer.reveal((EditPart) currentItem);
            if (!CommonUtils.isEmpty(proposedFileName)) {
                        + " If these errors are recoverable then fix errors and then refresh/reopen diagram",
            } else {
            super(style.getActionTitle(), AS_CHECK_BOX);
            }
                }

        // important: always call super implementation of dispose
            }
        return new ERDPalettePreferences();
            var layout = (FillLayout) placeholder.getLayout();
        @Override
        MenuManager manager = new MenuManager(getClass().getName(), getClass().getName());
                return resultsFound;
import org.eclipse.ui.menus.IMenuService;
        public ISelection getSelection() {
            String status;
        }
            }
        @Override
    }
        {
    }

                @Override
 * Copyright (C) 2010-2025 DBeaver Corp and others
        public boolean isChecked()
        graphicalViewer.setProperty(SnapToGrid.PROPERTY_GRID_ENABLED, store.getBoolean(ERDUIConstants.PREF_GRID_ENABLED));

}
        }
        }
import org.jkiss.dbeaver.model.runtime.DBRProgressMonitor;

    /**
     */
        graphicalViewer.addSelectionChangedListener(event -> {
    /**
     */
            if (monitor.isCanceled()) {
        );
                restoreVisualSettings(diagramPart, entityDiagram)) {
    protected ERDContentProvider createContentProvider() {
        }
                e.gc.fillRectangle(bounds.x + bounds.width - EDIT_MODE_BORDER_SIZE, bounds.y, EDIT_MODE_BORDER_SIZE, bounds.height);

import org.jkiss.dbeaver.ui.editors.erd.notations.ERDNotationDescriptor;
/*
                    }
                public void removePartListener(IPartListener listener)
        //toolBarManager.add(createAttributeVisibilityMenu());

        GraphicalViewer viewer = createViewer(parent);
        viewer.setKeyHandler(new DBeaverNavigationKeyHandler(viewer));
            if (defStyle) {
        @Override
                @Override
                            }

        }
        if ((null == outlinePage || outlinePage.getControl().isDisposed()) && null != getGraphicalViewer()) {
        }
        //getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
    public boolean isDirty()
        }
     * @return the PaletteRoot to be used with the PaletteViewer
        private static final int EDIT_MODE_BORDER_SIZE = 2;
        toolBarManager.add(new DiagramToggleGridAction());
 * an editor </i> in chapter <i>Introduction to .gef </i>
import org.eclipse.jface.layout.GridLayoutFactory;
            isLoaded = true;
                isPrevStepWasFwd = isFindNext;
        } else {
                    resultsFound = false;
            EntityDiagram diagram = getDiagram();
        }
            return getGraphicalViewer();
        return hasChanges && hasLayout;
 *
import org.jkiss.dbeaver.model.DBPNamedObject;
        return super.getGraphicalViewer();
    }
    }
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
            this.editModeEnabled = editMode;
        ActionUtils.evaluatePropertyState(ERDEditorPropertyTester.NAMESPACE + "." + ERDEditorPropertyTester.PROP_CAN_UNDO);
        public boolean isChecked() {
        toolBarManager.add(new ToggleViewAction(IPageLayout.ID_OUTLINE));
import java.util.regex.PatternSyntaxException;
            toolBarManager.add(new DiagramToggleHandAction(editDomain.getPaletteViewer()));

            IFigure figure = rootPart.getLayer(ScalableFreeformRootEditPart.PRINTABLE_LAYERS);

    }
        super.init(site, input);
                        UIUtils.asyncExec(() -> {

                int extIndex = proposedFileName.lastIndexOf('.');
            monitor.worked(1);

import org.jkiss.dbeaver.ui.navigator.INavigatorModelView;
                ERDUIMessages.erd_editor_control_action_print_diagram,
            if (router == null || getDiagramRouter() == null) {
    public boolean performSearch(SearchType searchType)
                }
    public boolean isModelEditEnabled() {

        }
        getGraphicalViewer().getContents().getChildren().forEach(editPart -> {
        return true;
        }
import org.eclipse.gef.*;
     * the graphical viewer
                return false;
    /**

import org.eclipse.gef.editparts.ZoomManager;
        }
            getDiagram().setAttributeStyle(style, !isChecked());
        toolBarManager.add(new Separator());
            this.style = style;
    private ScalableFreeformRootEditPart rootPart;

        public void run()
     */
     */
    @Nullable
            refreshDiagram(false, false);
            } else {
                refreshDiagram(true, true);
        public EditModeComposite(@NotNull Composite parent) {
    {
            }

     */
            toolBarManager.add(ActionUtils.makeCommandContribution(getSite(), ERDUIConstants.CMD_SAVE_AS));
                UIIcon.PRINT));
     */
        }
import org.jkiss.dbeaver.ui.editors.erd.ERDUIConstants;
        for (ERDViewStyle style : ERDViewStyle.values()) {

                    highlightings.clear();
    @Override
            searcher = new Searcher();
    {
    }
                return;
        ActionUtils.evaluatePropertyState(ERDEditorPropertyTester.NAMESPACE + "." + ERDEditorPropertyTester.PROP_CAN_REDO);
        } else if (IWorkbenchAdapter.class.equals(adapter)) {
            while (obj != null && !(obj instanceof DBPDataSourceContainer)) {
        List<String> zoomLevels = new ArrayList<>(3);
                boolean hasSave = contributionManager.find("save") != null;
     */
            ((IEditorSite)site).registerContextMenu(ERDEditorPart.class.getName() + ".EditorContext", provider, viewer, false);
     * Indicates if the editor has unsaved changes.
            }
    protected void setInput(IEditorInput input)
 * You may obtain a copy of the License at
     * the dirty state
     * The method designed to refresh diagram with metadata request  
        toolBarManager.add(new DiagramLayoutAction(ERDEditorPart.this));
    private ERDConnectionRouterDescriptor routerStyle;
            if (graphicalControl != null) {
    protected void configureGraphicalViewer()


        if (paletteRoot == null) {
    }
                resultsIterator = results.listIterator(isFindNext ? 0 : results.size());
            diagramPart.resetArrangement();
            return new LoadVisualizer();
import org.eclipse.gef.commands.CommandStack;

        for (int i = 0; i < allFormats.size(); i++) {
    private class ConfigPropertyListener implements IPropertyChangeListener {
                                "Diagram loading errors",
        }
        });
import java.util.*;
            ZoomManager.FIT_WIDTH
    protected void fillDefaultEditorContributions(IContributionManager toolBarManager) {
        if (monitor.isCanceled()) {
                if (resultsFound) {
import org.jkiss.code.NotNull;
    @Override
        final Shell shell = getSite().getShell();
            }
        public void runWithEvent(Event event) {
            IFigure rootFigure = rootPart.getLayer(ScalableFreeformRootEditPart.PRINTABLE_LAYERS);
            ERDExportFormatHandler formatHandler = targetFormat.getInstance();

                for (IContributionItem item : extToolBar.getItems()) {
        }
                }
        @Override

    }
                    if (hasSave) {

    private String exportMruFilename = null;
            }
     * @return the undoable <code>PropertySheetPage</code>
            }
                setDiagramRouter(defaultRouter);
                ));
            }

            IAction action = getActionRegistry().getAction(actionId);
                    avMenu.add(new ChangeAttributeVisibilityAction(false, ERDAttributeVisibility.NONE));

     *
                return false;
        setGraphicalViewer(viewer);
    }
        configAction.setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.CONFIGURATION));
    }
        menu.add(new SetPartColorAction(this, selection));

            navigatorViewerAdapter = new NavigatorViewerAdapter();
        return new ERDEditorContextMenuProvider(this, true);
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.ui.model.IWorkbenchAdapter;


                EntityDiagram.NodeVisualInfo vi = new EntityDiagram.NodeVisualInfo((EntityPart) oldEntity);
            return getOverviewOutlinePage();
        }
        }
    }
        hookGraphicalViewer();
                menu.add(action);
    private ERDHighlightingManager highlightingManager = new ERDHighlightingManager();
        return entityDiagram;
                super.completeLoading(entityDiagram);
    public void refreshDiagram(boolean rearrange, boolean reload) {
     * Creates a PaletteViewerProvider that will be used to create palettes for


     */
            avMenu.add(new ChangeAttributeVisibilityAction(true, ERDAttributeVisibility.ALL));
     * Save as not allowed

    public boolean isERD() {
import org.jkiss.dbeaver.model.struct.DBSEntity;
/*
                if (entityDiagram != null) {
        zoomLevels.add(ZoomManager.FIT_HEIGHT);
        private List<Object> results = null;
            }
        for (ERDEntity entity : newDiagram.getEntities()) {
     *
        ERDEditorContextMenuProvider provider = createContextProvider();
        // Collect visual settings from old diagram and apply them to the new one
    protected void updateToolbarActions() {

     * @param parent the parent composite
            refreshDiagram(true, true);

     */
            if (resultsFound && results != null) {
    {
import org.jkiss.dbeaver.model.preferences.DBPPreferenceStore;
     *
    @Override
        paletteComposite.setBackground(ERDThemeSettings.instance.diagramBackground);
    }
import org.jkiss.utils.CommonUtils;
     * Returns the schema model associated with the editor
            NodePart oldNotePart = oldDiagram.getChildByObject(newNote.getObject());

                ERDUIConstants.CONFIRM_OPEN_EXPORTED_FILE,
            addAction(new DiagramToggleHandAction(editDomain.getPaletteViewer()));
            } else if (ERDConstants.PREF_ATTR_VISIBILITY.equals(event.getProperty())) {
     */
    }
        if (data != null) {
        //toolBarManager.add(new DiagramRefreshAction(ERDEditorPart.this));
        private ChangeAttributeVisibilityAction(boolean defStyle, ERDAttributeVisibility visibility)
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
        return getDiagramPart().getDiagram();

                getSite(),
    /**
                    List<String> errorMessages = entityDiagram.getErrorMessages();

        }
*/
                graphicalViewer.deselectAll();
        return routerStyle;
        GraphicalViewer viewer = new ERDGraphicalViewer(this, validationMessageHandler);
            setEditMode(false);
        FileDialog saveDialog = new FileDialog(shell, SWT.SAVE);
            toolBarManager.add(ActionUtils.makeCommandContribution(
                return true;

        if (!asMenu.isEmpty()) {
                        }
    }
import org.jkiss.dbeaver.ui.editors.erd.directedit.StatusLineValidationMessageHandler;
            DBWorkbench.getPlatformUI().showError("ERD export", "No file extension was specified");
        if (progressControl != null) {
                for (ERDEntity entity : diagram.getEntities()) {
            NodeVisualInfo visualInfo = newDiagram.getVisualInfo(entity.getObject());
                return false;
    public void printDiagram()
            placeholder = CompositeFactory.newComposite(SWT.NONE)
    @Override
                printOp.setPrintMargin(new Insets(
                if (!CommonUtils.isEmpty(nodes)) {

                }
        @Override
     */
import org.eclipse.swt.widgets.*;
            return new PropertyPageStandard();
        }
                    resultsIterator = null;
import org.jkiss.dbeaver.ui.editors.erd.action.DiagramLayoutAction;
import org.eclipse.gef.palette.PaletteRoot;
        // we need to handle common .gef elements we created
                        }
                                if (child instanceof DBPNamedObject && child instanceof EditPart) {
                refreshEntityAndAttributes();
            refreshDiagram(true, false);
        protected abstract void finishLoading();
        @Override
        private final ERDAttributeVisibility visibility;
        }
    }
    {
    @Override
    public ERDNotationDescriptor getDiagramNotation() {
    }
                ERDNotationDescriptor defaultNotation = ERDNotationRegistry.getInstance().getActiveDescriptor();

    public EntityDiagram getDiagram()
    public boolean isSearchEnabled()
        refreshDiagram(rearrange, reload, false);
        @Override
                @Override

    }
        public boolean isChecked() {
                public String getLabel(Object o) {
            MenuManager avMenu = new MenuManager(ERDUIMessages.menu_attribute_visibility);
            return getViewer().getSelection();
        viewer.addDropTargetListener(new NodeDropTargetListener(viewer));
        GraphicalViewer graphicalViewer = getGraphicalViewer();

    protected void registerDropTargetListeners(GraphicalViewer viewer) {
        private final CLabel label;
import org.jkiss.dbeaver.ui.editors.erd.dnd.DataEditDropTargetListener;
            if (entityDiagram.isDirty()) {
            return curSearchPattern.matcher(element.getName()).find();
    protected FlyoutPaletteComposite createPaletteComposite(Composite parent) {
                        }
                }
     */
                isPrevStepWasFwd = null;
        UIUtils.syncExec(() -> getCommandStack().flush());

                List<String> errorMessages = entityDiagram.getErrorMessages();
                obj = diagram.getEntities().get(0).getObject();
import org.eclipse.jface.viewers.ISelection;
        ERDUIActivator.getDefault().getPreferenceStore().removePropertyChangeListener(configPropertyListener);
        public class LoadVisualizer extends ProgressVisualizer<EntityDiagram> {

        public void setSelection(ISelection selection, boolean reveal) {
    protected ERDOutlinePage getOverviewOutlinePage()
                    setInfo(entityDiagram.getEntityCount() + " objects");
                        contributionManager.insertAfter("configuration", item);
            //EntityDiagramFigure diagramFigure = findFigure(rootFigure, EntityDiagramFigure.class);
            label = new CLabel(this, SWT.LEFT);
        @Override
     * Returns the <code>CommandStack</code> of this editor's
    }
    }

            refreshEntityAndAttributes();

import org.eclipse.draw2d.IFigure;
     * Sets the dirty state of this editor.
            }
 * distributed under the License is distributed on an "AS IS" BASIS,
            } else if (ERDConstants.PREF_ATTR_STYLES.equals(event.getProperty())) {
     */
            if (oldEntity instanceof EntityPart) {
     * @see #setEditMode(boolean)
        zoomCombo = new ZoomComboContributionItem(
        }
        try {
    }
import org.eclipse.swt.graphics.Rectangle;
                {
                return false;

                e.gc.fillRectangle(bounds.x, bounds.y, EDIT_MODE_BORDER_SIZE, bounds.height);
            if (ERDUIConstants.PREF_GRID_ENABLED.equals(event.getProperty())) {
                    getGraphicalViewer().deselectAll();
        private final Composite placeholder;
     * @param entityDiagram - EntityDiagram
                            ((EntityPart) object).refresh();
    }
        }

        String proposedFileName = exportMruFilename;
     * the undoable <code>IPropertySheetPage</code>
        
import org.eclipse.jface.viewers.Viewer;
            this.getSite().getPage(),
            };
                ((UpdateAction) action).update();
    }

                    store.getInt(ERDUIConstants.PREF_PRINT_MARGIN_TOP),
     *
                    String avaTitle = ERDUIMessages.menu_attribute_visibility_entity;
                            return visibility == getDiagram().getAttributeVisibility();
        public boolean isChecked()


public abstract class ERDEditorPart extends GraphicalEditorWithFlyoutPalette

                            if (!resultsFound) {
            DBWorkbench.getPlatformUI().showError("ERD export failed", null, e);
    private class NavigatorViewerAdapter extends Viewer {
        viewer.getControl().setBackground(ERDThemeSettings.instance.diagramBackground);

     */
        }
    public String getErrorMessage() {
                            }
import org.jkiss.dbeaver.ui.editors.erd.dnd.NodeDropTargetListener;
    
            this.visibility = visibility;
        return viewer;
    public void doSaveAs()
        zoomManager.setZoomLevels(
                ERDUIConstants.PREF_DIAGRAM_SHOW_PARTITIONS.equals(event.getProperty())) {
        List<ERDExportFormatRegistry.FormatDescriptor> allFormats = ERDExportFormatRegistry.getInstance().getFormats();
                        List<?> children = ((EntityPart) node).getChildren();
import org.jkiss.dbeaver.ui.dialogs.DialogUtils;
            }

                }
                        totalEntities++;
        // the super implementation handles the rest
     * 
            }

            return entityDiagram;


    /**
    protected boolean hasProgressControl() {
    }
                    DBPNamedObject focusedNode = null;
                status = selection.size() + " objects";
        public Control getControl() {
                            messageStatuses.add(new Status(Status.ERROR, ERDUIActivator.PLUGIN_ID, error));
                public IWorkbenchPart getActivePart()
        }
    public void init(IEditorSite site, IEditorInput input) throws PartInitException
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite;
    }
        IAction zoomOut = new ZoomOutAction(zoomManager);
     *
     * @return an instance of <code>Schema</code>
            return entityDiagram;
    @Override

        getActionRegistry().dispose();
        File outFile = new File(filePath);
        };
            super.visualizeLoading();
            }
            new double[]{.1, .1, .2, .3, .5, .6, .7, .8, .9, 1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0, 2.5, 3, 4}
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
                            "Error(s) occurred during diagram loading. If these errors are recoverable then fix errors and then refresh/reopen diagram",
        return null;
        } else if (adapter == IContentOutlinePage.class) {
        public boolean canUndo() {
        return progressControl != null && progressControl.isSearchEnabled();

import org.jkiss.dbeaver.ui.editors.erd.model.ERDContainerDecorated.NodeVisualInfo;
    public EntityDiagram visuallize(DBRProgressMonitor monitor, EntityDiagram entityDiagram) {
     * Fill ERD notations popup menu
    }
                        nodes.add((DBPNamedObject) node);
    }
    @Override

                e.gc.fillRectangle(bounds.x, bounds.y + bounds.height - EDIT_MODE_BORDER_SIZE, bounds.width, EDIT_MODE_BORDER_SIZE);
            avMenu.add(new ChangeAttributeVisibilityAction(true, ERDAttributeVisibility.PRIMARY));
                try {
                        graphicalViewer.reveal((EditPart) focusedNode);
        @Override
        if (entityDiagram != null) {
    /**
        ERDUIActivator.getDefault().getPreferenceStore().addPropertyChangeListener(configPropertyListener);



                .layout(new FillLayout())
                        ((EntityPart) object).getEntity().setAttributeVisibility(visibility);
            this.getPalettePreferences());


     * Save as not allowed
    {
        public Object getInput() {
                        if (!CommonUtils.isEmpty(children)) {
    {
        }
        if (routerStyle == null) {
    /////////////////////////////////////////
    }
    /**
            var margin = editMode ? EDIT_MODE_BORDER_SIZE : 0;
        }
            @Override

            0,
            isDirty = dirty;
                IWorkbenchCommandConstants.FILE_PRINT,
        private Pattern curSearchPattern;
    {
    }
    }
                Boolean enabled = Boolean.valueOf(event.getNewValue().toString());
            return getGraphicalViewer() == null ? null : getGraphicalControl();
        @NotNull
            }

        createActions();
        installKeyHandler(viewer);
    {

            EditPart oldContents = getGraphicalViewer().getContents();
        return outlinePage;
                        if (matchesSearch(erdNode)) {
    private PropertySheetPage undoablePropertySheetPage;
        ZoomOutAction zoomOutAction = new ZoomOutAction(zoomManager);

import org.jkiss.dbeaver.ui.editors.erd.editor.tools.SetPartColorAction;

                    }


        return isLoaded;
        }
    }
        isLoaded = true;
            }
        }
        Composite getPlaceholder() {
                @Override
     */
            zoomStrings);
        }

        } catch (DBException e) {
        super.createPartControl(contentContainer);
     * The <code>CommandStackListener</code> that listens for
        fillConfigurationContribution(toolBarManager);
    public ProgressControl getProgressControl() {
 *
                            status);
    /**
        }
import org.jkiss.dbeaver.ui.*;
                }

        if (editModeComposite != null) {

        }
                {
                    return resultsFound;

        if (hasProgressControl()) {
                status = "";

        @Override
        for (ERDNote newNote : newDiagram.getNotes()) {
    @Override
        ResetPartColorAction resetPartColorAction = new ResetPartColorAction(this, selection);
import org.jkiss.dbeaver.ui.editors.erd.export.ERDExportFormatHandler;

        @Override
        ZoomManager zoomManager = rootPart.getZoomManager();
        boolean hasChanges = false;
                printOp.run("Print ER diagram");
            }
     */
            return getActionRegistry();
        if (monitor.isCanceled()) {

            super(notation.getName(), AS_CHECK_BOX);
            if (oldNotePart instanceof NotePart) {
    @Override
import org.jkiss.dbeaver.model.struct.DBSObject;
            return searcher;
            if (resultsIterator == null || isFindNext ? !resultsIterator.hasNext() : !resultsIterator.hasPrevious()) {
                vi.initBounds = oldNotePart.getBounds();
    public Object getAdapter(Class adapter) {
    }
            routerStyle = ERDConnectionRouterRegistry.getInstance().getActiveRouter();
import org.jkiss.code.Nullable;
    {
                .create(this);
    /**
        return true;
        menu.add(ntMenu);

        }
            LinkedList<String> parts = new LinkedList<>();
                graphicalViewer.setProperty(SnapToGrid.PROPERTY_GRID_SPACING, new Dimension(


            if (openFileDecision == IDialogConstants.YES_ID) {
    // We need it to support a set of standard commands like copy/paste/rename/etc
                setErrorMessage(null);
            }
        }
    public CommandStack getCommandStack()
        paletteRoot.setLabel("Entity Diagram");
                    if (item instanceof EntityPart) {
        menu.add(new ChangeZOrderAction(this, selection, true));
import org.eclipse.draw2d.PrintFigureOperation;
    {
                        if (entityAV == null) {
                    return "ERD Editor";
    private ERDContentProvider contentProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
        // add  selection change listener
    }

        return errorMessage;
                    }
                graphicalViewer.setProperty(SnapToGrid.PROPERTY_GRID_VISIBLE, enabled);
    private boolean isDirty;
    /**
*/
import org.eclipse.core.runtime.jobs.Job;
        if (diagramPart == null) {
                }
                // Run print


                    avMenu.add(new Separator());
        String filePath = DialogUtils.openFileDialog(saveDialog);
        Control graphicalControl = getGraphicalControl();
                    }
        });
    protected void updateActions(List actionIds)
            }
            layout.marginWidth = margin;
        }
                hasLayout = true;


        zoomLevels.add(ZoomManager.FIT_WIDTH);
        }

        private ProgressControl(Composite parent, int style)
                monitor.worked(1);
    }
            final IMenuService menuService = getSite().getService(IMenuService.class);
            progressControl = new ProgressControl(parent, SWT.SHEET);
    }
        

                        contributionManager.insertAfter("save", item);
        return paletteRoot;
import org.jkiss.dbeaver.model.runtime.load.ILoadService;
        toolBarManager.add(zoomCombo);
            } else if (selection.size() == 1) {
import org.jkiss.dbeaver.ui.css.CSSUtils;
    }
        {
    protected boolean restoreVisualSettings(DiagramPart oldDiagram, EntityDiagram newDiagram) {

            progressControl.setShowDivider(true);
    }
            if (selection instanceof IStructuredSelection && !selection.isEmpty()) {
    {
            final int openFileDecision = ConfirmationDialog.confirmAction(
        private final ERDNotationDescriptor notation;
    private class ChangeERDNotationStyleAction extends Action {
     * @param monitor - DBRProgressMonitor
        }
     */
        private Boolean isPrevStepWasFwd;
            {
    @Nullable
        toolBarManager.add(new Separator());
            }
    private List<String> editPartActionIDs = new ArrayList<>();
                jumpToNext(isFindNext);
                if (totalEntities > 0) {
        } else if (adapter == IPropertySheetPage.class) {
    }
        private void jumpToNext(boolean isFindNext) {
        graphicalViewer.setProperty(SnapToGrid.PROPERTY_GRID_SPACING, new Dimension(
        }
    }
    public abstract DBPProject getDiagramProject();
        }
import org.jkiss.dbeaver.ui.navigator.actions.ToggleViewAction;
    {
                    return ERDEditorPart.this;
        return navigatorViewerAdapter;
import org.eclipse.gef.ui.palette.PaletteViewerProvider;
                        } else if (entityAV == visibility) {
                actionSet.add(action);
    {
                entityDiagram.setLayoutManualDesired(true);
                    for (String error : errorMessages) {
            } else {
    @Override
            if (progressControl != null) {
                }
    }
                parts.addFirst(obj.getName());
                    ERDEditorPart.this,
                    if (resultsFound && focusedNode != null) {


 * DBeaver - Universal Database Manager
     */
     * @return the overview
                @Override
    }
    }
            firePropertyChange(IEditorPart.PROP_DIRTY);
                }
    {
                EntityDiagram diagram = getDiagram();
        }
    @Override
        @Override
                }
        this.routerStyle = router;
        return super.getAdapter(adapter);
        } else {
            RootEditPart rootEditPart = getGraphicalViewer().getRootEditPart();
    /**
     * the overview outline page
import org.jkiss.dbeaver.ui.editors.erd.model.ERDDecoratorDefault;
        @Nullable
        public void run()
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
     * @return the palette provider
                }
     *
import org.jkiss.dbeaver.model.navigator.DBNNode;
    

        saveDialog.setFileName(proposedFileName);
                public void removePartListener(IPartListener2 listener)
            currentItem = isFindNext ? resultsIterator.next() : resultsIterator.previous();
        }

                    List<Status> messageStatuses = new ArrayList<>(errorMessages.size());

     *
        saveDialog.setFilterExtensions(extensions);
import org.eclipse.core.runtime.*;
        }
package org.jkiss.dbeaver.ui.editors.erd.editor;
import org.jkiss.dbeaver.ui.editors.IDatabaseModellerEditor;
                    store.getInt(ERDUIConstants.PREF_GRID_WIDTH),
        // Setup zoom manager
                if (isPrevStepWasFwd != null && isPrevStepWasFwd.booleanValue() != isFindNext) { 
    public void setDiagramNotation(ERDNotationDescriptor notation) {
        configPropertyListener = new ConfigPropertyListener();

            ISelection selection = getGraphicalViewer().getSelection();
                return findNextResult(options == SEARCH_NEXT);
                getCommandStack().execute(new MarkDirtyCommand());

        @Override
                    DBWorkbench.getPlatformUI().showError(
 * limitations under the License.
            }
        if (outFile.exists()) {
    @Override
    protected ERDEditorContextMenuProvider createContextProvider() {
     *
            decorator = createDecorator();
     * Returns the overview for the outline view.
        @Override
            contentProvider = createContentProvider();
        }
        if (filePath == null || filePath.trim().length() == 0) {

        if (contentProvider == null) {

    /**
                    store.getInt(ERDUIConstants.PREF_PRINT_MARGIN_LEFT),
    }
    private ZoomComboContributionItem zoomCombo;
        if (CommonUtils.isEmpty(proposedFileName)) {
        protected ISearchExecutor getSearchRunner()
    protected void refreshEntityAndAttributes() {
            }
     * @param dirty the new dirty state to set
    private ERDNotationDescriptor notationStyle;
    private static class EditModeComposite extends Composite {
    private static class MarkDirtyCommand extends Command {

                doSave(new NullProgressMonitor());
                PrintFigureOperation printOp = new PrintFigureOperation(new Printer(data), rootFigure);
        // remove selection listener
        private String searchString = null;
            loadDiagram(refreshMetadata);
    }
                            for (Object child: children) {
        //toolBarManager.add(new PrintAction(ERDEditorPart.this));
                    if (object instanceof EntityPart) {
        // Reevaluate properties

            } else {
        if (monitor.isCanceled()) {
    {
                EntityDiagram.NodeVisualInfo vi = new EntityDiagram.NodeVisualInfo((NotePart) oldNotePart);
    protected void addAction(IAction action)
        @Override
        {
     * Initializes the editor.
            NodePart oldEntity = oldDiagram.getChildByObject(newEntity.getObject());
        if (progressControl == null || progressControl.isDisposed()) {
            store.getInt(ERDUIConstants.PREF_GRID_WIDTH),
        public ChangeERDRouterStyleAction(@NotNull ERDConnectionRouterDescriptor router) {
        private final boolean defStyle;
    @NotNull
        // initialize actions
            if ((oldContents instanceof DiagramPart diagramPart) &&
        public boolean performSearch(@NotNull String searchString, int options) {
        @Override
            return false;
        }
    }
        FlyoutPaletteComposite paletteComposite = new FlyoutPaletteComposite(

     * The method designed to refresh diagram without metadata request  
            progressControl.updateActions();
        ZoomManager zoomManager = rootPart.getZoomManager();
            }

                Rectangle bounds = placeholder.getClientArea();
            refreshDiagram(false, true);
            extensions[i] = "*." + allFormats.get(i).getExtension();
    /**

        }
import org.eclipse.gef.ui.actions.*;
                    avMenu.add(new ChangeAttributeVisibilityAction(false, ERDAttributeVisibility.PRIMARY));
            DBSObject obj = diagram.getRootObjectContainer();
            }

        return getEditDomain().getCommandStack();
    }
            } else if (ERDUIConstants.PREF_NOTATION_TYPE.equals(event.getProperty())) {
                e.gc.fillRectangle(bounds.x, bounds.y, bounds.width, EDIT_MODE_BORDER_SIZE);
        public void propertyChange(PropertyChangeEvent event)
        if (rearrange) {
                    proposedFileName = proposedFileName.substring(0, extIndex);
    private NavigatorViewerAdapter navigatorViewerAdapter;
     *
    protected ERDPalettePreferences getPalettePreferences()
    }
            label.setImage(DBeaverIcons.getImage(DBIcon.SMALL_WARNING));
                doSave(new NullProgressMonitor());
        toolBarManager.add(configAction);

            }
import org.jkiss.dbeaver.ui.editors.erd.editor.tools.ResetPartColorAction;
                public void addPartListener(IPartListener2 listener)
     *
    @Override
                asMenu.add(new ChangeAttributePresentationAction(style));
import org.eclipse.jface.layout.GridDataFactory;
        saveDiagramAs();
            if (menuService != null) {

                setDiagramNotation(defaultNotation);

        }
                .applyTo(this);
    public void setEditMode(boolean editMode) {
        String ext = filePath.substring(divPos + 1);
        if (site instanceof IEditorSite) {
    @Override
import org.jkiss.dbeaver.ui.editors.erd.editor.tools.SetPartSettingsAction;
        super.dispose();
            } else {
    }
                } else {
            }
        graphicalViewer.setProperty(SnapToGrid.PROPERTY_GRID_VISIBLE, store.getBoolean(ERDUIConstants.PREF_GRID_ENABLED));
     * @param menu - root node
    /**
            } else if (ERDUIConstants.PREF_ROUTING_TYPE.equals(event.getProperty())) {
                }
        if (targetFormat == null) {

    {
    }
        viewer.setContents(new EntityDiagram(null, "empty", getContentProvider(), getDecorator()));
            avMenu.add(new ChangeAttributeVisibilityAction(true, ERDAttributeVisibility.KEYS));
                    searcherLog.warn("Unable to perform search in ERD editor due to an inability to compile search pattern", e);
                        "VQB Diagram loading errors",
            updateActions(editPartActionIDs);
    private DefaultEditDomain editDomain;
                if (extIndex != -1) {
        contentContainer = editModeComposite.getPlaceholder();
                    results = null;
    /**

     */

    }
        // create root

import org.jkiss.dbeaver.ui.controls.ProgressLoaderVisualizer;

                    }
        }
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIMessages;
                    }
    /**
        toolBarManager.add(new Separator());
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterRegistry;
    @Override
    }
            return entityDiagram;
        super.setInput(input);
                        DBWorkbench.getPlatformUI().showError(
 * you may not use this file except in compliance with the License.
import org.eclipse.swt.custom.CLabel;
        @Override
    {
            if (decorator.supportsAttributeStyle(style)) {
            monitor.worked(1);
    {
        }

        //new PrintAction(this).run();
import org.jkiss.dbeaver.DBException;
                getDiagram().setAttributeStyles(ERDViewStyle.getDefaultStyles(ERDUIActivator.getDefault().getPreferences()));
                                focusedNode = erdNode; // let's set focus to the first found node after search complete
     * Creates a new <code>GraphicalViewer</code>, configures, registers and

            return ((IDatabaseEditorInput) editorInput).getCommandContext();
            if (entityDiagram == null || !entityDiagram.getEntities().isEmpty()) {
                    }
        {
            menu.add(avMenu);
    {
            zoomCombo.setZoomManager(rootPart.getZoomManager());

        private final Searcher searcher;
import org.jkiss.dbeaver.ui.editors.erd.action.ERDEditorPropertyTester;
        }
    /**
                return visibility == getDiagram().getAttributeVisibility();
        }
        this.errorMessage = errorMessage;
            menu.add(settingsAction);
    @Override
        return (ERDGraphicalViewer) super.getGraphicalViewer();
        };
                hasChanges = true;
        if (diagramLoadingJob != null) {
            super(loadingService, control);
                resultsFound = false;
                for (Object node : getDiagramPart().getChildren()) {
     * @return the <code>CommandStack</code>
        }
    protected void createGraphicalViewer(Composite parent)

        public void run() {
                newDiagram.addVisualInfo(newNote, vi);
                @Override
        DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();
        for (ERDNotationDescriptor ntType : ERDNotationRegistry.getInstance().getNotations()) {
        //getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
     * the list of action ids that are to EditPart actions
    public void setDirty(boolean dirty)
        @Nullable
import org.eclipse.swt.printing.Printer;
    }
                doSave(new NullProgressMonitor());
        if (editorInput instanceof IDatabaseEditorInput) {
            store.getInt(ERDUIConstants.PREF_GRID_HEIGHT)));
        }
    @Override
import org.jkiss.dbeaver.ui.controls.ProgressPageControl;
                }
                    return;
                .spacing(0, 0)
    }
    {
        @Nullable
        return true;
    protected PaletteRoot getPaletteRoot()
    }
            
                ERDGraphicalViewer graphicalViewer = getGraphicalViewer();

     * @param rearrange - re-arrange layout
                            if (erdNode instanceof GraphicalEditPart) {
            IAction action = getActionRegistry().getAction(actionId);
        // Init zoom combo with dummy part service
            if (obj == null && diagram.getEntities().size() > 0) {
                }
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
            return;
                    }
                this.cancelSearch();
        String[] zoomStrings = new String[]{
        if (isDirty != dirty) {
            if (curSearchPattern != null) {
        if (zoomCombo != null) {



import org.jkiss.dbeaver.ui.dialogs.ConfirmationDialog;

    public boolean isSaveAsAllowed()

                .layoutData(GridDataFactory.fillDefaults().grab(true, true).create())
        }
    private class Searcher implements ISearchExecutor {
     * @return - EntityDiagram
        }
     * Fill ERD routers popup menu
        }
        protected boolean cancelProgress()
            proposedFileName = String.join(" - ", parts);
     * A special command that marks the editor dirty without the possibility to undo it.
import org.eclipse.ui.views.properties.IPropertySheetPage;
    private EditModeComposite editModeComposite;
     * Returns the undoable <code>PropertySheetPage</code> for this editor.

    protected ProgressControl progressControl;
        }
     * @param refreshMetadata - reload metadata  
        getEditorSite().registerContextMenu(getClass().getName() + ".EditorContext", manager, graphicalViewer, true); //$NON-NLS-1$
                graphicalViewer.deselectAll();

     * @see org.eclipse.ui.part.EditorPart#isDirty
                }
     */
    }
 * See the License for the specific language governing permissions and
    private PaletteRoot paletteRoot;
        }
        editDomain = new DefaultEditDomain(this);
        viewer.setEditPartFactory(getDecorator().createPartFactory());
        IEditorInput editorInput = this.getEditorInput();
    /**
import org.eclipse.jface.action.*;
    public void setErrorMessage(String errorMessage) {
            proposedFileName = this.getTitle();
                newDiagram.addVisualInfo(newEntity.getObject(), vi);
            }
        //toolBarManager.add(new UndoAction(ERDEditorPart.this));
            return router.getId().equals(getDiagramRouter().getId());
                }
            if (!UIUtils.confirmAction(shell, "Overwrite file", "File '" + filePath + "' already exists.\nOverwrite?")) {
     * @param rearrange - re-arrange layout
            this.getPaletteViewerProvider(),
            @Override
        void setEditMode(boolean editMode) {
    private class ChangeAttributeVisibilityAction extends Action {
                return entityDiagram;
    public DBNNode getRootNode() {
            return new WorkbenchAdapter() {
import org.eclipse.jface.viewers.IStructuredSelection;
        }
    public DiagramPart getDiagramPart()
    public void fillAttributeVisibilityMenu(IMenuManager menu)
                        status);
            if (parts.isEmpty()) {
            this.notation = notation;
                refreshDiagram(true, false);
            },
        return progressControl != null && progressControl.performSearch(searchType);
    /**

                    jumpToNext(isFindNext); 


        manager.setRemoveAllWhenShown(true);
        addAction(zoomIn);
                }
    protected abstract void loadDiagram(boolean refreshMetadata);
        getDiagram().getEntities().forEach(entity -> {
    public void createPartControl(Composite parent)
        @Override
        if (control == null || control.isDisposed()) {
        }
                return false;
            layout.marginHeight = margin;
        return object instanceof DBSEntity && getDiagram().getEntity((DBSEntity) object) != null;
            return getEditDomain();
     */
                        messageStatuses.add(new Status(Status.ERROR, ERDUIActivator.PLUGIN_ID, error));
        }
                diagram.setAttributeVisibility(attrVisibility);
        if (resetPartColorAction.isEnabled()) {
                @Override
     * a helper method.)
    public void fillPartContextMenu(IMenuManager menu, IStructuredSelection selection) {
        }
        getDecorator().fillPalette(paletteRoot, isReadOnly());
     */
                    highlightings.forEach(ERDHighlightingHandle::release);
                            results.add(erdNode);
    @Override
        private boolean findNextResult(boolean isFindNext) {
            UIUtils.syncExec(() -> getGraphicalViewer().setContents(entityDiagram));
import org.eclipse.draw2d.geometry.Dimension;
            super.visualizeLoading();
    /**
        saveDialog.setFilterNames(filterNames);
    protected ERDEditorPart()
                    if (((IStructuredSelection) selection).size() == 1) {
import org.eclipse.gef.commands.Command;
        registerDropTargetListeners(viewer);
            paletteRoot = createPaletteRoot();
                printOp.setPrintMode(store.getInt(ERDUIConstants.PREF_PRINT_PAGE_MODE));
        int divPos = filePath.lastIndexOf('.');
import org.jkiss.dbeaver.ui.editors.erd.action.DiagramToggleHandAction;
                for (Object object : ((IStructuredSelection)getGraphicalViewer().getSelection()).toArray()) {
        viewer.createControl(parent);
        public void run() {
    }
                    avMenu.add(new ChangeAttributeVisibilityAction(false, ERDAttributeVisibility.ALL));
        }
        @Nullable

    public void setDiagramRouter(ERDConnectionRouterDescriptor router) {
        PrintDialog dialog = new PrintDialog(viewer.getControl().getShell(), SWT.NULL);


    public void fillRoutersMenu(IMenuManager menu) {

     */
    public void refreshDiagram(boolean rearrange, boolean reload, boolean refreshMetadata) {
            }
    /**

                }




        return this.progressControl;
import org.jkiss.dbeaver.model.app.DBPProject;
                targetFormat = format;
    /**
            if (editPart instanceof EntityPart entityPart) {
    }
        PrinterData data = dialog.open();

                        avaTitle += " (" + totalEntities + ")";
     */
                    for (DBPNamedObject erdNode : nodes) {
                    if (node instanceof EntityPart) {
        }

            label.setText(ERDUIMessages.erd_editor_control_edit_mode_label);
        }

        }

     */
import org.jkiss.dbeaver.ui.editors.erd.model.EntityDiagram;
        return getDiagram().isEditEnabled();

        //toolBarManager.add(new RedoAction(ERDEditorPart.this));

        private boolean matchesSearch(@Nullable DBPNamedObject element) {
                        "Error(s) occurred during diagram loading."
        rootPart = new ScalableFreeformRootEditPart();
            });
                {
            }
    }
    public PaletteRoot createPaletteRoot()


                    store.getInt(ERDUIConstants.PREF_PRINT_MARGIN_BOTTOM),
import org.jkiss.dbeaver.model.edit.DBECommandContext;
        {
                e.gc.setBackground(ERDThemeSettings.instance.linesForeground);
        refreshDiagram(force, force);
                        }
    public boolean isLoaded() {
            GridLayoutFactory.fillDefaults()
                // Associated connections were changed during the loading process

                    // direction change gets current item again as if it's a new loop initialization 
 * Editor implementation based on the example editor skeleton that is built in <i>Building
     * @param reload - load diagram
    }
            }
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
            public void visualizeLoading()
            return getGraphicalViewer().getProperty(ZoomManager.class.toString());
import org.jkiss.dbeaver.ui.editors.erd.router.ERDConnectionRouterDescriptor;
    {
    // INavigatorModelView implementation
                public void addPartListener(IPartListener listener)
    protected void fillConfigurationContribution(IContributionManager toolBarManager) {

        toolBarManager.add(zoomOutAction);
import java.io.File;
            if (curSearchPattern == null || element == null) {
            ToolBarManager extToolBar = new ToolBarManager();
        MenuManager asMenu = new MenuManager(ERDUIMessages.menu_view_style);

        menu.add(new ChangeZOrderAction(this, selection, false));
        return null;
                getGraphicalControl().getShell(),
            refreshDiagram(false, true);
                hasChanges = true;
    /**
                    getSite().getShell(),
    }
            return entityDiagram;
        @Override
 * Unless required by applicable law or agreed to in writing, software

    }
    }
    }
        public ChangeAttributePresentationAction(ERDViewStyle style) {
        String[] filterNames = new String[allFormats.size()];
                break;

        private Object currentItem = null;
            return true;
            UIUtils.setControlVisible(label, editMode);
            return;
                    if (object instanceof EntityPart) {
            return false;
    protected LoadingJob<EntityDiagram> diagramLoadingJob;
                style);
            site.registerContextMenu(ERDEditorPart.class.getName() + ".EditorContext", provider, viewer);
                    return false;
                                highlightings.add(highlightingManager.highlight(((GraphicalEditPart) erdNode).getFigure(), color));
        }
     * the view and the flyout.

            if (defStyle) {
    public ERDConnectionRouterDescriptor getDiagramRouter() {
                    store.getInt(ERDUIConstants.PREF_PRINT_MARGIN_RIGHT)

     * with a border around the diagram control.

            if (visualInfo != null && visualInfo.initBounds != null && visualInfo.initBounds.x != 0 && visualInfo.initBounds.y != 0) {
    }


        monitor.beginTask(ERDUIMessages.erd_job_visuallize_content, 4);
                    }
        DiagramPart diagramPart = getDiagramPart();

        viewer.setContextMenu(provider);
            if (diagramLoadingJob != null) {
import org.jkiss.dbeaver.ui.controls.PropertyPageStandard;
            return getCommandStack();
                UIUtils.showPreferencesFor(
    protected ERDGraphicalViewer getGraphicalViewer() {
        // hook the viewer into the EditDomain
        }


                break;
        boolean hasLayout = false;

    public abstract void doSave(IProgressMonitor monitor);


        MenuManager ntMenu = new MenuManager(ERDUIMessages.menu_router_style);

        {
            super.runWithEvent(event);
        Control control = getGraphicalViewer().getControl();

    public void saveDiagramAs()
            super(parent, SWT.NONE);

import org.eclipse.swt.printing.PrintDialog;
            }
            }
            layout(true, true);
            this.router = router;
     * A special composite responsible for showing a warning label along
     */
            super(visibility.getTitle() + "", IAction.AS_CHECK_BOX);
        zoomInAction.setImageDescriptor(DBeaverIcons.getImageDescriptor(UIIcon.ZOOM_IN));
                {
    @Override
/*
        if (CommonUtils.isEmpty(proposedFileName)) {
            }
                graphicalViewer.setProperty(SnapToGrid.PROPERTY_GRID_ENABLED, enabled);
        if (notationStyle == null) {
    {
            if (this.results != null && this.searchString != null && this.searchString.equals(searchString)) {
    /**
        return RefreshResult.REFRESHED;
                {
     *
        ERDExportFormatRegistry.FormatDescriptor targetFormat = null;
            ((IMenuListener) selection.getFirstElement()).menuAboutToShow(menu);
                        ERDAttributeVisibility entityAV = ((EntityPart) object).getEntity().getAttributeVisibility();
        CSSUtils.setExcludeFromStyling(contentContainer);

            formatHandler.exportDiagram(getDiagram(), figure, getDiagramPart(), outFile);
        public void completeLoading(EntityDiagram entityDiagram) {

        Action configAction = new Action(ERDUIMessages.erd_editor_control_action_configuration) {
import java.util.List;
import org.jkiss.dbeaver.runtime.DBWorkbench;
            public void run() {
        UIUtils.registerKeyBinding(getSite(), action);
    public void commandStackChanged(EventObject event)
                    }
        toolBarManager.add(new Separator("configuration"));
            return entityDiagram;

    /**
        } else {
                return;
     * @param action the action to add.
            return ArrayUtils.contains(
            if (null != action && action instanceof UpdateAction) {
        getActionRegistry().registerAction(action);
            progressControl.setShowDivider(true);
        }
        IAction zoomIn = new ZoomInAction(zoomManager);
        if (selection.getFirstElement() instanceof IMenuListener) {
     * @see org.eclipse.ui.part.EditorPart#setInput(org.eclipse.ui.IEditorInput)
            progressControl.createProgressPanel();
        }
        zoomLevels.add(ZoomManager.FIT_ALL);
            } else if (ERDUIConstants.PREF_GRID_WIDTH.equals(event.getProperty()) || ERDUIConstants.PREF_GRID_HEIGHT.equals(event.getProperty())) {
    {
        menu.add(ntMenu);
                        for (String error : errorMessages) {
            diagramLoadingJob = null;
        private ListIterator<Object> resultsIterator = null;
    protected abstract class DiagramLoaderVisualizer extends ProgressLoaderVisualizer<EntityDiagram> {
            this.defStyle = defStyle;
        {
    }
     */
     *
            }
        }

        @Override
            {
        public ChangeERDNotationStyleAction(@NotNull ERDNotationDescriptor notation) {
        if (editDomain.getPaletteViewer() != null) {
            avMenu.add(new ChangeAttributeVisibilityAction(true, ERDAttributeVisibility.NONE));
        StatusLineValidationMessageHandler validationMessageHandler = new StatusLineValidationMessageHandler(getEditorSite());
    }
                return true;
import org.eclipse.swt.layout.FillLayout;
    }
    {
        }
            super.completeLoading(entityDiagram);

    protected PropertySheetPage getPropertySheetPage()
            menu.add(asMenu);
                if (!editModeEnabled) {

        Set<IAction> actionSet = new HashSet<>();
        if (selection.isEmpty()) {
            @Override
        }
        }
    {
                diagramLoadingJob.cancel();
                ERDConnectionRouterDescriptor defaultRouter = ERDConnectionRouterRegistry.getInstance().getActiveRouter();
    public boolean containsModelObject(DBSObject object) {
        }
     * current one.
                    } else {
    private volatile String errorMessage;
            ZoomManager.FIT_ALL,
            setDiagramRouter(router);
    protected ERDDecorator createDecorator() {
    /**
                int totalEntities = 0;
            progressControl = new ProgressControl((Composite) super.getGraphicalControl(), SWT.SHEET);
    @Override
     */
        // dispose the ActionRegistry (will dispose all actions)
        super.commandStackChanged(event);
                ERDGraphicalViewer graphicalViewer = getGraphicalViewer();
        if (decorator == null) {
                    }
                    setInfo("Empty diagram due to error (see error log)");
        {

            super(parent, style);
import java.util.regex.Pattern;
        }
 */
        exportMruFilename = outFile.getName();
        return notationStyle;
                Set<DBPNamedObject> nodes = new HashSet<>();
/**
    @Override
        super.configureGraphicalViewer();
                obj = obj.getParentObject();
                        avaTitle += " (" + ((IStructuredSelection) selection).getFirstElement() + ")";
                ConfirmationDialog.QUESTION);
            }
        public boolean canRedo() {
                ERDViewStyle.getDefaultStyles(ERDUIActivator.getDefault().getPreferences()),
    private GraphicalViewer createViewer(Composite parent)
        for (ERDEntity newEntity : newDiagram.getEntities()) {
            if (rootFigure != null) {

import org.eclipse.ui.model.WorkbenchAdapter;
     * <code>CommandStack </code> changes.
        editModeComposite = new EditModeComposite(contentContainer);
     *
            if (!extToolBar.isEmpty()) {
                // Set print preferences

            ntMenu.add(new ChangeERDNotationStyleAction(ntType));
                    MultiStatus status = new MultiStatus(ERDUIActivator.PLUGIN_ID, 0, messageStatuses.toArray(new IStatus[0]), null, null);
        // initialize the viewer with input
import org.jkiss.dbeaver.Log;
                progressControl.setInfo(status);
        setEditDomain(editDomain);
    @Override
                        List<Status> messageStatuses = new ArrayList<>(errorMessages.size());
                results = new ArrayList<>();
            }
                diagram.setAttributeVisibility(visibility);

            } else {
                entityDiagram.setLayoutManualAllowed(true);
                graphicalControl.setBackground(ERDThemeSettings.instance.diagramBackground);
     * Updates the specified actions.
        } else if (adapter == CommandStack.class) {
        if (adapter == GraphicalViewer.class || adapter == EditPartViewer.class) {

            Control graphicalControl = getGraphicalControl();
    public abstract boolean isReadOnly();
    public void dispose()
        configureGraphicalViewer();

            editModeComposite.setEditMode(editMode);
        // to prevent zoom disable on part change - as it is standalone zoom control, not global one
        }
        private final ERDConnectionRouterDescriptor router;
        private boolean resultsFound;
        }
            entity.reloadAttributes(getDiagram());
                public IWorkbenchPartReference getActivePartReference()
                            ((EntityPart) object).getEntity().reloadAttributes(diagram);
        return rootPart == null ? null : (DiagramPart) rootPart.getContents();
        viewer.setRootEditPart(rootPart);
                final DBPPreferenceStore store = ERDUIActivator.getDefault().getPreferences();
                }
    {
            }
            notationStyle = ERDNotationRegistry.getInstance().getActiveDescriptor();
            if (notation == null || getDiagramNotation() == null) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.jkiss.utils.ArrayUtils;
                        MultiStatus status = new MultiStatus(ERDUIActivator.PLUGIN_ID, 0, messageStatuses.toArray(new IStatus[0]), null, null);
    private boolean isLoaded;
    public RefreshResult refreshPart(Object source, boolean force)
     *
    }

        return new ERDPaletteViewerProvider(editDomain);
        }

     * the <code>EditDomain</code>
        return !isReadOnly() && isDirty;
            EntityDiagram diagram = this.getDiagram(); 
                        });
        }
     * Adaptable implementation for Editor
        private List<ERDHighlightingHandle> highlightings = new LinkedList<>();
        protected DiagramLoaderVisualizer(ILoadService<EntityDiagram> loadingService, Composite control) {
            fillDefaultEditorContributions(toolBarManager);
                }

                    entity.reloadAttributes(diagram);
    @Override
        return paletteComposite;
import org.jkiss.dbeaver.ui.editors.erd.model.ERDDecorator;
        }
            } else {
    }
    @NotNull
import org.jkiss.dbeaver.ui.editors.erd.action.DiagramToggleGridAction;


                ShellUtils.launchProgram(outFile.getAbsolutePath());
                entityPart.refresh();
        }
        public void cancelSearch() {
                for (Object object : ((IStructuredSelection)getGraphicalViewer().getSelection()).toArray()) {

                graphicalViewer.select((EditPart) currentItem);
            }
        }
        public void visualizeLoading() {
import org.eclipse.jface.util.PropertyChangeEvent;


import org.jkiss.dbeaver.model.sql.SQLUtils;
    }
                if (!errorMessages.isEmpty()) {
            return ((IDatabaseEditorInput) editorInput).getNavigatorNode();
        addAction(zoomOut);
        // Set initial (empty) contents
import org.eclipse.swt.SWT;
        }
        @Nullable
            ZoomManager.FIT_HEIGHT,
                                    nodes.add((DBPNamedObject) child);
    {
            if (selection.isEmpty()) {
            if (monitor.isCanceled()) {

        @Override
