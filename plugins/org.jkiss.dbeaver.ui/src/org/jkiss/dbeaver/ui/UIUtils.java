        Label titleLabel = new Label(composite, SWT.NONE);
                return parentType.cast(control);
                    defIndex = index;
        }
    }
        textLabel.setText(label);

    }
                            if (newWidth < minWidth) {
        return createTitledComposite(parent, label, columns, layoutStyle, widthHint, 1);
        final Control control;
        FontData[] fontData = font.getFontData();
        layout.marginWidth = 0;
            IWorkbenchPart activePart = serviceLocator.getService(IWorkbenchPart.class);
    public static void runInUI(IRunnableContext context, final DBRRunnableWithProgress runnable) {
public class UIUtils {
import org.jkiss.dbeaver.ui.internal.UIActivator;
            if (!styleField.canAccess(control)) {
        final String exponentSeparator = symbols.getExponentSeparator();
                .setDefaultReply(Reply.OK)
    private static IPreferenceNode findPreferenceNode(@NotNull PreferenceManager preferenceManager, @NotNull String pageId) {
    }
            button.setText(label);
            }
        if (tooltip != null) {
    }

    public static TableItem getPreviousTableItem(Table table, TableItem item) {
            DBPDataSourceInfo dataSourceInfo = dataSource.getInfo();
    public static boolean isInWizard(Control control) {
            checkbox.setToolTipText(tooltip);
            Color connectionColor = SHARED_TEXT_COLORS.getColor(rgbStringOrId);
    public static Label createLabel(Composite parent, String label) {
            if (!display.readAndDispatch()) {
        if (parent.getLayout() instanceof GridLayout) {
                display.asyncExec(runnable);
        }
    }
    @Nullable
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
            if (e.getTargetException() instanceof DBException dbe) {
        @NotNull String message,
            );
            }

            TreeItem child = getTreeItem(item, data);
        str = str.trim();
                }
            return activeShell;
import org.jkiss.dbeaver.model.connection.DBPConnectionConfiguration;
            }
        for (CTabItem item : tabFolder.getItems()) {
        }
        return new CustomSashForm(parent, style);
            gd = new GridData(GridData.FILL_VERTICAL);
        int b = blend(c1.blue, c2.blue, ratio);
                }
        return null;
            if (window != null) {
        if (rgb == null) {

        Composite ph = new Composite(parent, SWT.NONE);
    public static Label createHorizontalLine(Composite parent) {
                            }
    public static Button createDialogButton(
    }
    }
        createLabelSeparator(toolBar, style, 0);
        }
        Spinner spinner = new Spinner(parent, SWT.BORDER);
     * @param modifier   the amount by which to modify the font size. Positive values increase the size,
                e.doit = true;
            target.addListener(eventType, listener);
            }
            TreeItem child = getTreeItem(item, data);
            table.setRedraw(true);
        return new ExpandableComposite(parent, style, expansionStyle) {{
        copyListeners(original, text, SWT.DefaultSelection);
        int r = blend(c1.red, c2.red, ratio);
        }
                    } finally {
    public static Button createRadioButton(
            propDialog.open();
        if (selectionListener != null) {
                if (pageContainer != null && canOpenHere) {
            gc.dispose();
                    e.doit = false;
            Rectangle clientArea = tree.getClientArea();
                gc.setFont(null);
        }
    public static ToolItem createToolItem(ToolBar parent, String text, DBPImage icon, SelectionListener selectionListener) {
        gl.marginWidth = 0;
     *     try (DBPCloseableObject ignored = UIUtils.disableRedraw(control)) {
    @NotNull
    @NotNull
    }
    public static boolean setComboSelection(Combo combo, String value) {
            // Some color constant
                    throw dbe;
    }
            gd.widthHint = 1;
                        tc.setWidth(tc.getWidth() + extraSpace);
            finalFocusService.addFocusTracker(control, controlID);
        ph.setLayoutData(gd);
        }


    public static void createLineSeparator(@NotNull Composite parent, int style) {
                content.setSize(size);
    public static VerifyListener getIntegerVerifyListener(Locale locale) {
    }
        return e -> {
        shell.setLocation(x, y);
                                tc.setWidth((int) (tc.getWidth() + extraSpace));
                        pageData,
    public static Composite createTitledComposite(
        }
            }
        String rgbString = connectionType.getColor();
            button.addSelectionListener(selectionListener);

            }
    public static CustomSashForm createPartDivider(final IWorkbenchPart workbenchPart, Composite parent, int style) {

    @NotNull
        gl.verticalSpacing = spacing;
        while (!job.isFinished() && !DBWorkbench.getPlatform().isShuttingDown()) {
            if (activePart == null) {
                );

    public static boolean confirmAction(@Nullable Shell shell, String title, String message, @NotNull DBPImage image, String[] buttons) {
    public static void runInUI(final DBRRunnableWithProgress runnable) {
                }
        BaseThemeSettings.instance.addPropertyListener(
                        int extraSpace = totalWidth - areaWidth;
        return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(id);
    }
        return -1;
    public static Display getDisplay() {
            symbols.getMinusSign(), symbols.getZeroDigit(), symbols.getMonetaryDecimalSeparator(), '+', '.', ','
                e.gc.drawLine(e.x, e.y, e.x, e.y + e.height);
                e.doit = true;

import org.eclipse.jface.window.Window;
            titleLabel.addPaintListener(e -> {
    public static DBPCloseableNE disableRedraw(@NotNull Control control) {
            }
    ) {
            IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
    }
    }
            @Override
        return imageLabel;
            getDefaultRunnableContext().run(true, true, monitor -> {
        int widthHint,

            button.addSelectionListener(selectionListener);

        }
        return createLabelCheckbox(parent, label, null, checked, SWT.NONE);

    private static TreeItem getTreeItem(TreeItem parent, Object data) {
        }
                            int minWidth = gc.stringExtent(tc.getText()).x;
        return createInfoLabel(parent, text, null);
        boolean cancelable,
    public static SharedTextColors getSharedTextColors() {

        if (checked) {
        if ((control.getStyle() & SWT.DOUBLE_BUFFERED) != 0) {
        if (CommonUtils.isEmpty(rgbString)) {
        }
        int hSpan
    }
        int expansionStyle
                e.gc.drawLine(e.x, e.y, e.x + e.width, e.y);
                // On Windows everything is fine
        if (element == null) {
            .setDefaultReply(Reply.NO)
                return item;
            l.setToolTipText(tooltip);
            }
    public static String getCatalogSchemaTerms(@Nullable DBPDataSourceContainer dataSourceContainer, boolean checkChangePossibility) {


                    }
        }

        }
            if (curCharset != null) {
                int totalWidth = 0;
        waitJobCompletion(job, null);
        clipboard.setContents(new Object[] {contents}, new Transfer[] {transfer});
            .setReplies(Reply.YES, Reply.NO)
        }
    }
    }
        }
    }

            gc.dispose();
            line = line.trim();
        IRunnableContext context = window != null ? window : DummyRunnableContext.INSTANCE;
        );

        //editButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

            }
    }
        if (layoutData != null) {
        }
    public static Spinner createSpinner(Composite parent, String tooltip, int value, int minimum, int maximum) {
        return createHorizontalLine(parent, 1, 0);
        return textSize;
        if (style != SWT.HORIZONTAL && style != SWT.VERTICAL) {
import org.eclipse.ui.handlers.IHandlerService;
    }
        for (int i = 0; i < columnCount; i++) {
        Control[] children = titledComposite.getChildren();
            return Display.getDefault();
    public static boolean confirmAction(final String title, final String question) {
    }
    public static Point getTextSize(@NotNull Control control, @NotNull String text) {

        int style,
                    result[0] = runnable.runTask(monitor);
        IWorkbench workbench = PlatformUI.getWorkbench();

        composite.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
        return getActiveShell();

        }
            }
        if (textSize.x > bounds.width) {
                gc.drawText(tip, baseline, baseline, true);
        return button;
            if (workbenchWindow != null) {
        UIUtils.setContentProposalToolTip(controlForTip, toolTipPattern, variables);
        }
                    try {
            titleLabel.setFont(BaseThemeSettings.instance.baseFontBold);
    }
    public static VerifyListener getNumberVerifyListener(Locale locale) {

        } else {
        });

import org.eclipse.swt.layout.GridData;

        TableItem[] items = table.getItems();
        Button button = new Button(parent, SWT.PUSH);

    private static boolean mainFontIsDefault() {
                } catch (InterruptedException e) {


        combo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                            minWidth += 5;
        if (resource != null && !resource.isDisposed()) {
     * This method removes the {@link SWT#SMOOTH} style if the device zoom is not 100%,

        if (tooltip != null) {
        if (parent == null || shell == null) {
                if (workbenchWindow != null) {
                        // Then shrink them to 30%
            gd = gridData;
    @Nullable
    @Nullable
     * <p>
    }
        }
    }
        if (icon != null) {
    public static Composite createTitledComposite(
        final Button button = new Button(parent, SWT.CHECK);
            if (columnCount > 0) {
            if (child != null) {
            DBWorkbench.getPlatformUI().showError(null, null, e.getTargetException());
                    }
import org.eclipse.swt.dnd.Clipboard;
        gd.horizontalSpan = hSpan;
        return createTitledComposite(parent, label, columns, layoutStyle, SWT.DEFAULT);
        return createLabelCombo(parent, label, null, style);
            return original;

        return reply[0] == Reply.OK;
    public static Composite createPlaceholder(@NotNull Composite parent, int columns, int spacing) {
    }
            button.setImage(DBeaverIcons.getImage(image));
    @NotNull
        final char[] allowedChars = new char[] {
        @Nullable SelectionListener selectionListener
                try {

        Point textSize = gc.textExtent(message);

    public static ExpandableComposite createExpandableCompositeWithSeparator(
        Clipboard clipboard = new Clipboard(display);

        GridData gd;
                line,
     * Example:
     * @param style the style of the sash
        @NotNull Composite parent,
        if (partSite == null) {
                        for (TreeColumn tc : columns) {
            return style & ~SWT.SMOOTH;
            if (childType.isInstance(child)) {
        } catch (Exception e) {
        @NotNull String label,
            button.addSelectionListener(selectionListener);
        layout.marginBottom = 3;
    public static Text createLabelTextAdvanced(@NotNull Composite parent, @NotNull String label, @Nullable String value, int style) {
        return group;
        final DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);
            }
        });
    }
    }

        return button;
                    ParameterizedCommand cmd = model.getWbCommand();
            section = parent.addNewSection(sectionId);
        if (focusService == null) {
            IFocusService finalFocusService = focusService;
        @NotNull Composite parent,
    public static boolean hasFocus(Control control) {

        return column;
                    }
     */
        } catch (Exception e) {
        resizeShell(shell, compSize);

            return gc.textExtent(text);
                gd.horizontalSpan = hSpan;
                        }
                        gc.dispose();
        GC gc = new GC(button);
            if ((textField.getStyle() & SWT.READ_ONLY) == SWT.READ_ONLY) {
        }


                    }
        final Point compSize = shell.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
            } else if (CommonUtils.isEmpty(schemaTerm)) {
    public static void runInProgressService(
        packColumns(tree, false, null);

            if (parentType.isInstance(control)) {
    /**
    @Nullable
        group.setLayout(layout);
     */
        GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_END);
        Label textLabel = new Label(parent, SWT.NONE);
        }
    public static Shell createCenteredShell(@NotNull Shell parent) {
                }
        return createLabelSpinner(parent, label, null, value, minimum, maximum);
        labelControl.addMouseListener(new MouseAdapter() {
    public static Shell getShell(IWorkbenchPart part) {
                return true;
            if (monitor != null && monitor.isCanceled()) {
import org.jkiss.dbeaver.model.exec.DBCExecutionContext;
    public static Combo createLabelCombo(Composite parent, String label, int style) {
    public static int getColumnAtPos(TreeItem item, int x, int y) {
    public static Button createPushButton(
     *
        return new RGB(r, g, b);
    }
    public static Button createCheckbox(Composite parent, boolean checked) {
        }
    @NotNull
    @NotNull

                if (defaultContext != null) {
        if (control == null || control.isDisposed()) {
        IViewReference[] references = workbenchWindow.getActivePage().getViewReferences();
    }
    @NotNull
            PlatformUI.getWorkbench().getProgressService().runInUI(context,
    @Nullable
        if (dataSource != null) {
                    }
                        activePart = activePage.getActivePart();
                DBCExecutionContext defaultContext = DBUtils.getDefaultContext(dataSource, false);
                textField.setBackground(null);

            if (c == parent) {

            return null;
        } else {
            return;
        return createInfoLabel(parent, text, gridStyle, hSpan, null);

    ) {
        @Nullable SelectionListener selectionListener
    }
        return null;
        return new Font(normalFont.getDevice(), data);
        final Button button = new Button(parent, SWT.CHECK);
        composite.setLayoutData(GridDataFactory.fillDefaults()
    public static Shell getActiveWorkbenchShell() {
        }
            gd = new GridData(GridData.FILL_HORIZONTAL);
        int layoutStyle
     * NOTE: this call can't be canceled if it will block in IO

    }
        Text text = new Text(parent, style);
                char ch = e.text.charAt(i);
        }

    @NotNull
            if (CommonUtils.isEmpty(catalogTerm)) {

        }
import org.eclipse.ui.swt.IFocusService;

            }
                control.dispose();
    }
            int widthHint = Dialog.convertHorizontalDLUsToPixels(gc.getFontMetrics(), IDialogConstants.BUTTON_WIDTH);
                partSite = activePart.getSite();
    @NotNull
            icon = DBIcon.STATUS_QUESTION;
    }
                // It is important for dark themes
        final Rectangle parentBounds = parent.getBounds();
            button.setSelection(true);
            }
        @Nullable SelectionListener selectionListener
                e.gc.setForeground(titleLabel.getDisplay().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
    }
        }
            return;
    public static Button createLabelCheckbox(Composite parent, String label, String tooltip, boolean checked) {
                if (model != null) {

                return childType.cast(child);
    }
                gc.setForeground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));

        TableColumn column = new TableColumn(table, style);
        packColumns(table, false);
        if (control instanceof Composite) {
        GridDataFactory.fillDefaults()

            log.error("Unable to enable double buffering", e.getCause());
        if (layoutData instanceof GridData gridData) {
        int minimum,
            if (activePart != null) {
        @NotNull Composite parent,

                }
        if (checked) {
    public static int getTextHeight(@NotNull Control control) {
        } else {
                (bounds.height - textSize.y) / 2 + y
                if (defIndex < 0) {
        FontData[] data = normalFont.getFontData();
    }
    public static <T> T runWithMonitor(@NotNull DBRRunnableWithReturn<T> runnable) throws DBException {
            int totalWidth = 0;
                //                }
     *     }
    public static void addFocusTracker(IServiceLocator serviceLocator, String controlID, Control control) {
            log.debug(e);
        return control;
     */
    public static ScrolledComposite createScrolledComposite(@NotNull Composite parent, int style) {
        return () -> control.setRedraw(true);
            }
            group.setLayoutData(gd);
import org.eclipse.ui.services.IServiceLocator;

                return ref.getView(false);
package org.jkiss.dbeaver.ui;
            public void controlResized(ControlEvent e) {
    }
        } else {
    public static DBRRunnableContext getDefaultRunnableContext() {
        };
                } catch (InvocationTargetException e) {
        if (PlatformUI.isWorkbenchRunning()) {
            }
            bounds.height -= height;
        }
                widget.dispose();
    }

                return Status.OK_STATUS;
        IDialogSettings workbenchSettings = UIActivator.getDefault().getDialogSettings();
            link.setToolTipText(canOpenHere ? null : UIMessages.link_external_tip);
        fixReadonlyTextBackground(text);
            button.addSelectionListener(selectionListener);
        Composite ph = new Composite(parent, SWT.NONE);
    ) {
        Link link = new Link(parent, SWT.NONE);
        return createInfoLabel(parent, text, gridStyle, hSpan, callback, DBeaverIcons.getImage(DBIcon.SMALL_INFO));
    private static void copyListeners(@NotNull Widget source, @NotNull Widget target, int eventType) {
    }
        try {
        if (tooltip != null) {
        for (Control c = child; c != null; c = c.getParent()) {
        gl.horizontalSpacing = spacing;
            return;
import org.jkiss.dbeaver.ui.dialogs.Reply;
    @Nullable
        @NotNull String label,
        text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
        return false;

        spinner.setMaximum(maximum);
        } catch (Exception e) {
        }
        @Nullable String value,
            styleField.set(control, styleField.getInt(control) | SWT.DOUBLE_BUFFERED);
        return scrolledComposite;
        }
        }
    public static void openWebBrowser(String url) {
    public static void addDefaultEditActionsSupport(final IServiceLocator site, final Control control) {
    }
    public static void enableDoubleBuffering(@NotNull Control control) {
    }
    public static ITheme getCurrentTheme() {
            return gridData;
    }

            text.setLayoutData(layoutData);
        @NotNull Composite parent,
        for (IContributionItem item : manager.getItems()) {
    public static Point drawMessageOverControl(Control control, PaintEvent e, String message, int verticalOffset) {

import org.jkiss.code.Nullable;
    ) {
    }
    public static Color getConnectionTypeColor(@NotNull DBPConnectionType connectionType) {
        }
                    button.setSelection(!button.getSelection());
    }
            int height = table.getHeaderHeight();
            return rgb.red;
            .stream(variables)
        int hSpan
        @Nullable String toolTip,
        @NotNull Image image


                if (!Character.isDigit(e.text.charAt(i))) {
    public static TableItem getNextTableItem(Table table, TableItem item) {
import org.jkiss.dbeaver.runtime.DBWorkbench;
        }
import org.eclipse.ui.forms.widgets.ExpandableComposite;
                activePart = activeWindow.getActivePage().getActivePart();
     * Configures created composite to detect resize and be appropriately sized with its contents
                }
        } finally {
        if (tooltip != null) {
            gc.setFont(JFaceResources.getDialogFont());
import org.jkiss.dbeaver.DBException;
            public void widgetSelected(SelectionEvent e) {
        canvas.addPaintListener(e -> {
    }
        if (control == null || control.isDisposed() || mainFontIsDefault()) {
            }
            e.doit = true;
        IRunnableContext runnableContext,
        setHelp(control, UIActivator.PLUGIN_ID, helpContextID);

        if (window != null) {

        spinner.setSelection(value);
        boolean fork,
        }


    @NotNull

    /**
        gd.widthHint = 0;
        // There is still no good workaround: https://bugs.eclipse.org/bugs/show_bug.cgi?id=340889

        final StringContentProposalProvider proposalProvider = new StringContentProposalProvider(Arrays
        } finally {
                resource.dispose();
                runnableContext = new ProgressMonitorDialog(workbench.getActiveWorkbenchWindow().getShell());
        ShellUtils.launchProgram(url);
            control = control.getParent();

                //                    areaWidth -= tree.getVerticalBar().getSize().x;
            link.setText(NLS.bind(message, label));
    }
        return varsTip.toString();
        ph.setLayout(gl);
    @NotNull
    //    {
    public static Point drawMessageOverControl(Control control, GC gc, String message, int verticalOffset) {
        if (fontData.length == 0) {

    }
    public static Text createLabelText(Composite parent, String label, String value, int style) {
        int maximum
        @NotNull Composite parent,
        }
                                tc.setWidth((int) (tc.getWidth() + extraSpace * ratios[i]));
        return bounds;
                });
        GridLayout gl = new GridLayout(columns, false);
            if (hSpan > 1) {
            .showMessageBox()
 * Licensed under the Apache License, Version 2.0 (the "License");
        return null;
        composite.addPaintListener(e -> {
import org.eclipse.core.runtime.IProgressMonitor;
        }
import org.jkiss.utils.CommonUtils;
    }
        try {
        if (icon != null) {
            bounds.height -= height;
    }
        if (workbench != null && workbench.getActiveWorkbenchWindow() != null) {
import org.eclipse.jface.resource.JFaceResources;
     * Creates an {@link ExpandableComposite} that paints a separator on top.
        final Point size = gc.textExtent(text);
        } else {
                e.gc.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
            return selectionProvider;
            addPaintListener(e -> {
            IWorkbench workbench = PlatformUI.getWorkbench();
    public static <T extends Control> T getChildOfType(@NotNull Composite parent, @NotNull Class<T> childType) {
        return UIMessages.label_catalog_schema;
            comp.layout();
        final int x = parentBounds.x + (parentBounds.width - size.x) / 2;
        }


    public static Composite createFormPlaceholder(Composite parent, int columns, int hSpan) {
            final CLabel label = new CLabel(parent, SWT.NONE);
                            minWidth += 5;
            log.error(e);

        if (shellLocation.x + shellSize.x > displayArea.width || shellLocation.y + shellSize.y > displayArea.height) {
        if (value != null) {
        boolean needsLayout = false;
    public static void applyMainFont(@Nullable Control control) {
        @NotNull String label,
        );
            SWT.COLOR_WIDGET_LIGHT_SHADOW;
        @Nullable String label,
        @NotNull Composite parent,
            return runnable.getResult();
            final TableColumn[] columns = table.getColumns();
        if (str.isEmpty()) {
                gd.widthHint = widthHint;
    }

    @NotNull
        final Combo combo = new Combo(parent, style);
        tabItem.addDisposeListener(e -> {
    }
    public static ISelectionProvider getSelectionProvider(IServiceLocator serviceLocator) {

            String tip = tipProvider.getValue(control);
    public static void centerShell(@Nullable Shell parent, @Nullable Shell shell) {
            varsTip.append("  ").append(GeneralUtils.variablePattern(var));
     * @return the corresponding {@link IWorkbenchWindow}, or {@code null} if none found
                            int newWidth = (int) (tc.getWidth() - extraSpace * ratio);
                        }
            String var = variables[i];
        }
                    (scrolledComposite.getStyle() & SWT.H_SCROLL) != 0 ? SWT.DEFAULT : area.width,
    @Nullable
        int hSpan


    public static <T> T runWithDialog(final DBRRunnableWithReturn<T> runnable) throws DBException {

import org.eclipse.ui.menus.CommandContributionItem;
    @NotNull

     * @param control the SWT control (must not be null)
        return preferenceManager.getElements(PreferenceManager.POST_ORDER).stream()
import org.jkiss.utils.StringUtils;
    public static Text createLabelText(
                    label.y + label.height / 2,
        Rectangle bounds;
        );
            });
    public static CTabItem getTabItem(CTabFolder tabFolder, Object data) {
    }

        }

        }
    /**
            monitor -> runnableWithProgress.run(RuntimeUtils.makeMonitor(monitor))
            return;
import org.eclipse.ui.themes.ITheme;
                    } catch (DBException e) {
        @Nullable SelectionListener selectionListener
            return;
    public static Label createControlLabel(Composite parent, String label) {
    public static Composite createTitledComposite(
        imageLabel.setImage(DBeaverIcons.getImage(DBIcon.SMALL_INFO));
                    // Too wide column - make it a bit narrower
        }

                IWorkbenchWindow workbenchWindow = serviceLocator.getService(IWorkbenchWindow.class);
        return text;
    public static int getFontHeight(Control control) {
            return windows[0];
                if (item.isDisposed()) {
                runnableContext = workbench.getProgressService();
        try {

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        return button;
                messageBox.open();
        @NotNull String text,

        return createLabelText(parent, label, value, style, new GridData(GridData.FILL_HORIZONTAL));
        } else if (parent.getLayout() instanceof RowLayout) {

                int baseline = (controlSize.y - control.getBorderWidth() * 2 - textSize.y) / 2;
        GridLayout gl = new GridLayout(columns, false);
        applyFont(control, BaseThemeSettings.instance.monospaceFont);
    public static ImageDescriptor getShardImageDescriptor(String id) {
        int y = bounds.y + verticalOffset;
        @NotNull String text,
    }
import org.eclipse.swt.layout.RowData;
    ) {
            }
import org.eclipse.swt.internal.DPIUtil;
        final Label l = createControlLabel(parent, label);
                    int extraSpace = clientArea.width - totalWidth;
    }
    }
            String schemaTerm = showSchema ? dataSourceInfo.getSchemaTerm() : null;
            log.debug("Focus service not found in " + serviceLocator);


        @Nullable String label,
        int buttonWidth = getDialogButtonWidth(button);
            }
                    }
    }
        editTB.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));

    }
            // IF we are in wrong thread

        }
        if (messageType == SWT.ICON_ERROR) {
        if (handlerService != null) {
    public static void createLabelSeparator(@NotNull Composite toolBar, int style, int span) {
                        if (alias.equalsIgnoreCase(curCharset)) {
    /**
        }
    private static String createHrefText(@NotNull String text) {
            }
    }
        } catch (Exception e) {
        group.setText(label);
            bounds.y += height;
        }
        }
    }

    public static IHandlerActivation registerKeyBinding(IServiceLocator serviceLocator, IAction action) {
    private static boolean isEmptyTextControl(Control control) {
            }
        return greyLevel(rgb) < 128;
import org.eclipse.e4.ui.workbench.renderers.swt.HandledContributionItem;
        Canvas canvas = new Canvas(toolBar, SWT.NONE);
    }
        Composite ph = new Composite(parent, SWT.NONE);

    }
    }
     *
        @Nullable String toolTip,
            }
            });
        if (false) {
            link.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> {
    }
    ) {
     *         // do something
    }
            }
    private static IPreferenceNode findPreferenceNode(@Nullable IWorkbenchPreferenceContainer container, @NotNull String pageId) {
            if (items[i] == item) {
        }
    }
                int areaWidth = clientArea.width;
    public static void disposeControlOnItemDispose(final CTabItem tabItem) {
            }
        try {
            return false;
            Rectangle rect = item.getBounds(i);
        try {
    public static Composite createTitledComposite(
                    colWidth = clientArea.width;
        if (container instanceof PreferenceDialog dialog) {
        } catch (Exception e) {
                (bounds.width - ext.x) / 2,
    public static Button createLabelCheckbox(
            }

    public static Button createDialogButton(
        if (label != null) {
        final Composite parent = original.getParent();
    }
                        new String[] {pageId},
            .setMessage(message)
        }
        final Reply[] reply = {null};
        Label imageLabel = new Label(parent, SWT.NONE);
                job.cancel();
                log.debug("Resource dispose error", e);
                }
        return text;
                return items[i + 1];
        if (CommonUtils.isEmpty(rgbString)) {
                            }
            if (item.getData() == data) {
            child.dispose();
        int style,
    }
                            }
            final Control control = tabItem.getControl();
            control
        }
        }
        }
        if (style == SWT.HORIZONTAL) {
            fd.setHeight(fd.getHeight() + modifier);
        return confirmAction(shell, title, question, DBIcon.STATUS_QUESTION);
            .setTitle(title)
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
    ) {
            label.setToolTipText(tooltip);
    public static Shell getShell(IShellProvider provider) {
    /**
        }
     * Sets width hint for a control with GridData.


            if (style == SWT.HORIZONTAL) {
        ToolItem toolItem = createToolItem(parent, text, icon != null ? DBeaverIcons.getImage(icon) : null, selectionListener);
            shellLocation.y = CommonUtils.clamp(displayArea.height - shellSize.y, 0, shellLocation.y);

            e.doit = newText.compareTo(MAX_LONG_STRING) <= 0;
        } finally {

                    text.setText(newText);
    public static Control createInfoLabel(@NotNull Composite parent, @NotNull String text, int gridStyle, int hSpan) {
        return Arrays.stream(PlatformUI.getWorkbench().getWorkbenchWindows())
            .span(colsSpan, 1)
        if (shellSize.x < compSize.x || shellSize.y < compSize.y) {
    public static Spinner createLabelSpinner(
                    if (activePage != null) {
        final DBRRunnableWithProgress runnableWithProgress

        } else if (curCharset != null) {
import org.eclipse.ui.internal.WorkbenchMessages;
                link.setText(createHrefText(text));
        if (original == null || original.getStyle() == style) {

        @Nullable String label,
        if (selectionIndex < 0) {
        } finally {
        final Composite composite = new Composite(parent, style);
                //                if (tree.getVerticalBar() != null) {
        if (propDialog != null) {

        }
            }
    }

import org.eclipse.ui.*;
        return button;
            @Override
                return true;
    public static <T extends Control> T getParentOfType(@NotNull Control control, @NotNull Class<T> parentType) {
                        tc.setWidth(tc.getWidth() + extraSpace);
                if (!Character.isDigit(ch) && !ArrayUtils.contains(allowedChars, ch) && exponentSeparator.indexOf(ch) == -1) {
        @NotNull Composite parent,
    }
 * DBeaver - Universal Database Manager
                }
            }
        if (section == null) {
        int hSpan,
    public static AbstractUIJob runUIJob(String jobName, int timeout, final DBRRunnableWithProgress runnableWithProgress) {
            }
            (control instanceof StyledText && ((StyledText) control).getCharCount() == 0) ||
    @NotNull
                    GC gc = new GC(tree);

 * See the License for the specific language governing permissions and
        table.setRedraw(false);
import org.eclipse.jface.preference.PreferenceDialog;
        final int y = bounds.y + bounds.height / 2 - 170;
        if (workbenchWindow != null) {
    }
import org.eclipse.jface.preference.IPreferenceNode;
            index++;
        }
    public static Group createControlGroup(Composite parent, String label, int columns, int layoutStyle, int widthHint) {
            labelControl.setToolTipText(tooltip);
                            extraSpace /= columns.length;
    }

        int g = blend(c1.green, c2.green, ratio);
    }
        int value,
        } else {

        final IPreferenceNode node = findPreferenceNode(pageId);
        return null;
            if (link != null) {
                    e.doit = false;
                    label.x + label.width + 6,
        Runnable messageBoxRunnable;
        Control focusControl = control.getDisplay().getFocusControl();
        if (widget.isDisposed()) {
        } else {
            gd = new GridData(GridData.FILL_HORIZONTAL);
                    return Status.CANCEL_STATUS;

        }
                ParameterizedCommand cmd = cci.getCommand();
                        if (ratios == null || ratios.length < columns.length) {
    public static void setControlVisible(Control control, boolean visible) {
    /**
     * @return the modified style if necessary
    /**
     *                   and negative values decrease it.
                return;
        original.dispose();
        };
        text.setLayoutData(original.getLayoutData());
            return handlerService.activateHandler(action.getActionDefinitionId(), new ActionHandler(action));
                    tc.pack();
        final Shell activeShell = display.getActiveShell();
import org.eclipse.jface.commands.ActionHandler;
            s -> applyMainFont(control),
            fd.setStyle(fd.getStyle() | style);

        ToolItem editButton = new ToolItem(editTB, SWT.DOWN);
            if (ref.getId().equals(viewId)) {

    public static void expandAll(AbstractTreeViewer treeViewer) {
        IWorkbenchPartSite partSite = serviceLocator.getService(IWorkbenchPartSite.class);


                return;
    public static VerifyListener getUnsignedLongOrEmptyTextVerifyListener(Text text) {
        }
                    }
                display.timerExec(milliseconds, runnable);
        int columnCount = item.getParent().getColumnCount();
            Link link = UIUtils.getChildOfType(comp, Link.class);
        return link;
            .map(Widget::getData)
            encodingCombo.add(charset.displayName());
                final Point textSize = gc.textExtent(tip);
        int gridStyle,

    @Nullable
        if (control instanceof Composite comp) {
     * @return closeable object that will enable redraw when closed
    public static void setHelp(Control control, String helpContextID) {
        editButton.setImage(DBeaverIcons.getImage(UIIcon.EDIT)); //$NON-NLS-1$
        for (IViewReference ref : references) {
    public static IDialogSettings getSettingsSection(@NotNull IDialogSettings parent, @NotNull String sectionId) {
                        } else {
            y += ext.y;

     * <p>
                display.syncExec(runnable);
            Point minSize = button.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
        return runUIJob(jobName, 0, runnableWithProgress);
        gd.horizontalSpan = hSpan;

        });
            .filter(w -> w.getShell() == shell)
        TreeItem[] items = tree.getItems();
            .grab(style == SWT.HORIZONTAL, style == SWT.VERTICAL)

        runInUI(context, runnable);
                if (columns.length > 0) {
    private static Rectangle getControlPaintBounds(@NotNull Control control) {
    @NotNull
            }
        @Nullable SelectionListener selectionListener
                    }
                                newWidth = minWidth;
     * @param button the button.
    }
        final Reply[] reply = {null};
        Object layoutData = widget.getLayoutData();
    }
    public static void applyFont(@Nullable Control control, @NotNull Font font) {

            log.debug(e);
        @Nullable DBPImage icon,
        if (children.length > 0 && children[0] instanceof Label label) {
        }
        int columns
        Display display = Display.getCurrent();
     * }</pre>
    ) {
                        showSchema = contextDefaults.getDefaultSchema() != null || contextDefaults.supportsSchemaChange();
    }
            .setDefaultReply(Reply.NO)
    public static Font modifyFont(@NotNull Font normalFont, int style) {
     * @param widthHint Desired width in pixels
    public static Spinner createLabelSpinner(@NotNull Composite parent, @NotNull String label, int value, int minimum, int maximum) {
            return;
            }
            } catch (InvocationTargetException e) {

        }
        Composite group = new Composite(composite, SWT.NONE);
    public static void packColumns(@NotNull Tree tree, boolean fit, @Nullable float[] ratios) {
     * Confirm action with custom labels
        }

    }
    }
                }
            Object[] result = new Object[1];
        }
                if (!CommonUtils.isEmpty(schemaTerm)) {
                    ).open();
        gl.marginHeight = 0;
        IWorkbench workbench = PlatformUI.getWorkbench();
        if (tooltip != null) {
        return createDialogButton(parent, label, null, (DBPImage) null, selectionListener);
        final Display display = Display.getCurrent();
        @Nullable Image image,
    }

        } catch (InterruptedException e) {
            labelControl.setToolTipText(tooltip);
            text.setText(value);


 */
            symbols.getDecimalSeparator(), symbols.getGroupingSeparator(),
            control = label;
    private static final String MAX_LONG_STRING = String.valueOf(Long.MAX_VALUE);
        for (int i = 0; i < count; i++) {
        layout.marginHeight = 0;
     * Runs task in Eclipse progress service.
    public static void fixReadonlyTextBackground(Text textField) {
        for (int i = 0; i < items.length - 1; i++) {
        return SHARED_TEXT_COLORS.getColor(rgbString);
import org.eclipse.swt.layout.GridLayout;

            final DBPImage finalIcon = icon;
        titleLabel.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING));
    @NotNull

            IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
    @Nullable
            }
                if (cmd != null) {
    public static void run(
    public static boolean confirmAction(@Nullable Shell shell, final String title, final String question) {
     * Returns whether the given color is dark or light depending on the colors grey-scale level.
                            extraSpace--;
     * @return true if it has focus
 *
            if (!display.isDisposed()) {
        UIUtils.addFocusTracker(site, UIUtils.INLINE_WIDGET_EDITOR_ID, control);
        if (gridStyle != SWT.NONE || hSpan > 1) {
        return createLabelText(parent, label, value, SWT.BORDER);

            label.setText(text);
            shell.setSize(shellSize);
        @Nullable SelectionListener selectionListener
    private static final String INLINE_WIDGET_EDITOR_ID = "org.jkiss.dbeaver.ui.InlineWidgetEditor";
                }
            bounds = scrollable.getClientArea();
    }
        return getFontHeight(control.getFont());
    }
        return createInfoLabel(parent, text, gridStyle, hSpan, null, DBeaverIcons.getImage(DBIcon.SMALL_WARNING));
    }
                }

                monitor -> runnable.run(RuntimeUtils.makeMonitor(monitor)), ResourcesPlugin.getWorkspace().getRoot()
        final Rectangle displayArea = shell.getDisplay().getClientArea();
            return false;
    @Nullable
                gc.setFont(control.getFont());
    public static Font modifyFontSize(@NotNull Font normalFont, int modifier) {
    public static DBRRunnableContext getDialogRunnableContext() {
            int height = tree.getHeaderHeight();
                MessageBox messageBox = new MessageBox(activeShell, messageType | SWT.OK);
        if (PlatformUI.isWorkbenchRunning()) {
        return null;
     * <p>
    @NotNull
                            for (int i = 0; i < columns.length; i++) {
        if (CommonUtils.isEmpty(rgbString)) {
    ) {
                    PreferencesUtil.createPreferenceDialogOn(
        }
        Control control = treeViewer.getControl();
import org.eclipse.jface.action.ToolBarManager;
            } catch (Exception e) {
        Control[] children = titledComposite.getChildren();
        gd.widthHint = widthHint;
     * @param clazz   the class of the window to check
    public static double greyLevel(RGB rgb) {
        int layoutStyle,
        if (CommonUtils.isNotEmpty(tooltip)) {
            .orElse(null);
            return false;
            button.setToolTipText(toolTip);
                    try {
        button.setText(label);
                }
    public static Button createDialogButton(
            gd.exclude = !visible;
                    item.setData("commandId", cmd.getId());
     */
    }
    public static IViewPart findView(IWorkbenchWindow workbenchWindow, String viewId) {
        if (!url.startsWith("http://") && !url.startsWith("https://") && !url.startsWith("ftp://")) {
            }
        scrolledComposite.setContent(content);
    private static Object getDialogButtonLayoutData(@NotNull Composite parent, @NotNull Button button) {
    @NotNull

    }

                            double ratio = (double) tc.getWidth() / totalWidth;
            propDialog = PreferencesUtil.createPreferenceDialogOn(shell, defPageID[0], defPageID, null, PreferencesUtil.OPTION_NONE);
    public static ToolItem createToolItem(ToolBar parent, String text, Image icon, SelectionListener selectionListener) {
            messageBoxRunnable = () -> {
                }
            // Do not use expandAll(true) as it is not supported by Eclipse versions before 2019
    public static void setDefaultTextControlWidthHint(@NotNull Control widget) {
    public static TreeItem getNextTreeItem(Tree tree, TreeItem item) {
    }
            return;
            }
        return textLabel;
    }
                if (table.getVerticalBar() != null) {
                finalFocusService.removeFocusTracker(control);
        IWorkbenchWindow workbenchWindow = findActiveWorkbenchWindow();
                if (e.getTargetException() instanceof DBException dbe) {
    }
        } catch (Exception e) {
        return "<a>" + text + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$
    @Nullable
                .setReplies(Reply.OK)
        return createDialogButton(parent, label, toolTip, icon, selectionListener);
        column.setText(text);

        }
        return shells.length > 0 ? shells[0] : null;
        applyFont(control, BaseThemeSettings.instance.baseFont);
            }
    }
        }
        return (ratio * v1 + (100 - ratio) * v2) / 100;
        }
                } else {
        for (String line : message.split("\n")) {
        return new Font(normalFont.getDevice(), data);
                .showMessageBox();

     * Returns the width of the button. The width is calculated based on the button font.
            @Override
    }
                    for (TableColumn tc : columns) {

    ) {
        if (parent.getLayout() instanceof GridLayout) {
    }
    }
        }
    public static int getColumnAtPos(TableItem item, int x, int y) {
     */
    public static Image getShardImage(@NotNull String id) {
        imageLabel.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, true));
        String rgbString = connectionInfo.getConnectionColor();
        int colsSpan,
        try {
        }


    }
            //show legacy message box
        if (windows.length > 0) {

                    extraSpace /= columnCount;
        @NotNull String pageId,
    @Nullable
        } else {
                }
import org.eclipse.core.runtime.Status;
            final TreeColumn[] columns = tree.getColumns();
        }
            return null;
     * Modifies the size of the given font by applying the specified modifier to the current font size.
        } else if (control instanceof Table table) {
import org.eclipse.osgi.util.NLS;
        if (!RuntimeUtils.isMacOS()) {

     *
        return toolItem;
    }
        if (hSpan > 1) {
                if (child instanceof Composite) {

 */
                }
        control.setRedraw(false);
            }
            button.setImage(icon);

        final Link link = new Link(parent, 0);
     */
            .grab(true, false).create());

            }
     * Returns {@link IWorkbenchWindow} that contains the given control.
    }
        IFocusService focusService = serviceLocator.getService(IFocusService.class);
            if (shell.isVisible()) {

        }
            if (activePart != null) {
    public static IWorkbenchPartSite getWorkbenchPartSite(IServiceLocator serviceLocator) {
        return getCurrentTheme().getColorRegistry();
    }
    //    }
import org.eclipse.jface.viewers.AbstractTreeViewer;
            return connectionColor;
                }
    }
    public static String makeAnchor(String text) {
    public static Button createCheckbox(Composite parent, String label, boolean checked) {

        for (ToolItem item : toolBar.getItems()) {
            if (item.getData() == data) {
        for (IViewReference ref : references) {
                );
        return false;
        return BaseThemeSettings.instance.monospaceFont;
        final int centerY = y - size.y;

        gl.marginHeight = 0;
        if (value == null) {
     */
        return SHARED_TEXT_COLORS.getColor(rgb);
                applyFont(element, font);
                    if (cmd != null && commandId.equals(cmd.getId())) {
        StringBuilder varsTip = new StringBuilder();
        int widthHint
                IWorkbenchWindow activeWindow = getActiveWorkbenchWindow();
                throw new DBException("Internal error", e.getTargetException());
                            int minWidth = gc.stringExtent(tc.getText()).x;
     * NOTE: this call can't be canceled if it will block in IO
            encodingCombo.select(defIndex);
                        totalWidth -= colWidth;
        return button;
            }

        for (FontData fd : data) {
            int totalWidth = 0;
        @Nullable Object pageData
import org.jkiss.dbeaver.ui.contentassist.ContentAssistUtils;
            boolean showSchema = true;
        }
                        throw new InvocationTargetException(e);
    public static Control createInfoLabel(@NotNull Composite parent, @NotNull String text) {
            for (int i = 0; i < e.text.length(); i++) {
    }
        }
     * @param modifier the scaling factor by which the font size will be multiplied
            RGB rgb = getCurrentTheme().getColorRegistry().getRGB(rgbStringOrId);
    public static void resizeShell(@NotNull Shell shell) {
            spinner.setToolTipText(tooltip);
    }
    /**
    }
    }
        int defIndex = -1;
    }
    //    public static Combo createEncodingCombo(Composite parent, String curCharset)
            public IStatus runInUIThread(@NotNull DBRProgressMonitor monitor) {
    }
import org.jkiss.dbeaver.ui.dialogs.EditTextDialog;
            button.setData(data);
            }
    @Nullable
    @NotNull
        return (T) result[0];
        }
        @NotNull Composite parent,
    public static Color getSharedColor(@Nullable String rgbString) {
            for (int i = 0; i < e.text.length(); i++) {
    public static Control createInfoLabel(
    }
            log.debug(e);

        });
            composite.setLayoutData(gd);
            } catch (Throwable e) {
            return (T) result[0];
    }
    public static Control createInfoLabel(@NotNull Composite parent, @NotNull String text, @Nullable Runnable listener) {
        }
    }
    @Nullable
            final boolean canOpenHere = findPreferenceNode(pageContainer, pageId) != null;
        if (selectionListener != null) {
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;
        if (selectionListener != null) {
        }
                return;
            }
        Object[] result = new Object[1];
    public static void applyMonospaceFont(@Nullable Control control) {
        if (data != null) {
            String newText = text.getText().substring(0, e.start) + e.text + text.getText().substring(e.end);
    @Nullable

            } else {
        if (toolTip != null) {
    }
            if (view != null && viewClass.isAssignableFrom(view.getClass())) {
        }
        // https://github.com/eclipse-platform/eclipse.platform.swt/issues/2329
        }
                if (totalWidth > areaWidth) {

    }
        };
            return 20;
    public static Color getConnectionColorByRGB(@NotNull String rgbStringOrId) {

    }
        final Link link = new Link(composite, SWT.NONE);
    }
        ph.setLayout(gl);
        for (int i = 0; i < items.length - 1; i++) {
        gc.setBackground(UIStyles.getDefaultTextBackground());
        return combo.getItem(selectionIndex);
            final GridData gd = new GridData(gridStyle);
        }
                    if (columns.length > 0) {
            }
            message = StringUtils.wrap(message, (int) charsPerLine);
        return partSite;
            textSize = gc.textExtent(message);
    @NotNull
        }
        final Button button = new Button(parent, SWT.CHECK | style);
import org.jkiss.dbeaver.ui.contentassist.SmartTextContentAdapter;
        gd.horizontalSpan = hSpan;
        }

            .hint(1, 1)
            if (tip != null && isEmptyTextControl(control) && !control.isFocusControl()) {
        textLabel.setText(label + ": "); //$NON-NLS-1$
    public static Composite createTitledComposite(
        job.schedule(timeout);
        runnableContext.run(fork, cancelable,
            GridData gd = new GridData(layoutStyle);
            @NotNull
                    return item;
        };

    public static void waitJobCompletion(@NotNull AbstractJob job, @Nullable IProgressMonitor monitor) {
                        }
                }
        try {
        ToolBar editTB = new ToolBar(panel, SWT.HORIZONTAL);
            };
                    totalWidth += tc.getWidth();
            e.doit = true;

        button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
                        pageId,
        IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
    public static boolean isParent(@NotNull Control parent, @Nullable Control child) {
        Label textLabel = new Label(parent, SWT.NONE);
    public static Shell getActiveShell() {
            // do nothing
            for (TreeColumn column : columns) {
        text.moveAbove(original);

        @Nullable Object layoutData
            if (checkChangePossibility) {
            return SHARED_TEXT_COLORS.getColor(rgb);
        return (fork, cancelable, runnable) -> runInProgressDialog(runnable);
            if (clientArea.isEmpty()) {
        return style;
     *
        final Shell shell = new Shell(parent);
    /**
        encodingCombo.setVisibleItemCount(30);
    )
                    return;

        return null;
        control.addPaintListener(e -> {
        }
                for (TableColumn tc : columns) {
            if (clientArea.width > 0 && totalWidth > clientArea.width) {
        return drawMessageOverControl(control, e.gc, message, verticalOffset);
    @NotNull
            if (activePart == null) {
    public static Link createInfoLink(
    public static int getFontHeight(Font font) {
        return e -> {
            return new RowData(buttonWidth, SWT.DEFAULT);
                return true;
    /**
     * Disables redraw for the control and returns a closeable object that will enable redraw when closed.
    }
        if (label != null) {
                e.gc.drawLine(
        if (selectionListener != null) {
    public static void packColumns(Table table, boolean fit) {
        }
        @Nullable String tooltip,
import org.jkiss.dbeaver.model.connection.DBPConnectionType;
        } else if (messageType == SWT.ICON_WARNING) {
        }
import org.jkiss.dbeaver.ui.contentassist.StringContentProposalProvider;
                    label.y + label.height / 2
            combo.setToolTipText(tooltip);
 *

        if (infoLink instanceof Composite comp) {
        gc.drawText(text, centerX, centerY, true);
import org.eclipse.jface.dialogs.IDialogSettings;
    throws InvocationTargetException, InterruptedException {
    }
    public static Text createLabelText(Composite parent, String label, String value) {
        Button button = new Button(parent, SWT.PUSH);
            } else {
        canvas.setLayoutData(gd);
        gd.verticalIndent = vIndent;
 *     http://www.apache.org/licenses/LICENSE-2.0
        }
        }};

            .setDefaultFocus(buttons.length - 1)
    ) {
                    }
    ) {
    ) throws InvocationTargetException, InterruptedException {
    public static Color getSharedColor(@Nullable RGB rgb) {
            } else {
     * @param normalFont the original font to be scaled; must not be null
        createControlLabel(parent, label);
    public static Label createLabel(Composite parent, @NotNull DBPImage image) {
            // do nothing
     * @param parent composite parent
        Label labelControl = createControlLabel(parent, label);
        return group;
    }
    }
     * Checks if the window that is instance of the given class is visible in the current display.
        Label emptyLabel = new Label(parent, SWT.NONE);

        if (DPIUtil.getDeviceZoom() != 100) {
            }
                combo.select(i);
    public static Combo createEncodingCombo(Composite parent, @Nullable String curCharset) {
        group.setLayout(gl);
     *
                }
                }
        @NotNull String label,
        }
            .setMessage(message)
        };
            if (widthHint > 0) {
    @NotNull

    public static void syncExec(Runnable runnable) {
        } catch (NumberFormatException e) {
        }
     * @param display the current display

                    // Open in a new dialog
            }
            }
            shell.layout(true, true);
    public static Combo createLabelCombo(Composite parent, String label, String tooltip, int style) {
    }
    }
                    DBCExecutionContextDefaults<?, ?> contextDefaults = defaultContext.getContextDefaults();
            bounds.y += height;
            for (TableColumn column : columns) {
            table.setRedraw(true);
     * @param content           it's contents
            return null;
    }
                    if (cmd != null) {
     * Checks the style of the sash.
        @NotNull Composite parent,
                        link.getShell(),
    }
import org.jkiss.dbeaver.utils.GeneralUtils;
        }
        }
    public static Label createControlLabel(Composite parent, String label, int hSpan) {
            if (child != null) {
    public static String getComboSelection(Combo combo) {
        IWorkbench workbench = PlatformUI.getWorkbench();
            label.setText(title);
        }
                    return schemaTerm;
    public static void asyncExec(Runnable runnable) {
        }
        varsTip.append(toolTip).append(". ").append(UIMessages.pref_page_connections_tool_tip_text_allowed_variables).append(":\n");
    public static void configureScrolledComposite(@NotNull ScrolledComposite scrolledComposite, @NotNull Control content) {
    }
        gc.setForeground(UIStyles.getDefaultTextForeground());
        copyListeners(original, text, SWT.Verify);
            if (items[i] == item) {
import java.lang.reflect.Field;
    }
        }
    public static void showPreferencesFor(Shell shell, Object element, String... defPageID) {
            titleLabel.setToolTipText(tooltip);
        }
        DBPImage icon = null;
    }
        if (control instanceof Composite composite) {
            IWorkbenchPart activePart = serviceLocator.getService(IWorkbenchPart.class);
        layout.marginLeft = 7;
        } finally {
    ) {
        @Nullable String label,
        return PlatformUI.getWorkbench().getSharedImages().getImage(id);
                            tc.setWidth(newWidth);
            });
        column.setText(text);
    public static void createLabelSeparator(@NotNull Composite toolBar, int style) {
        @Nullable IWorkbenchPreferenceContainer pageContainer,
    public static SharedFonts getSharedFonts() {
        return link;
        gl.marginWidth = 0;
        if (partSite != null) {
            } else {
            button.setText(label);

    }
        return button;
                return items[i + 1];
            gd.verticalSpan = span;
    public static Control createEmptyLabel(Composite parent, int horizontalSpan, int verticalSpan) {
    }
            Rectangle rect = item.getBounds(i);

            if (item.getData() == data) {

            }
        @Nullable Runnable callback,

                if (colWidth > clientArea.width) {
import org.eclipse.swt.graphics.*;
            Charset charset = charsetMap.get(csName);
        for (Control fc = focusControl; fc != null; fc = fc.getParent()) {
                return i;
     */
            control.setRedraw(true);
            .anyMatch(data -> data != null && clazz.isAssignableFrom(data.getClass()));
    @Nullable
import org.jkiss.utils.ArrayUtils;
        }
        try {
            if (data instanceof CommandContributionItem cci) {
                Point size = content.computeSize(
        final Text text = new Text(parent, style);
            return partSite.getSelectionProvider();
        });
        setWidgetWidthHint(widget, 150);

        copyListeners(original, text, SWT.Modify);
                            }
        }
        int hSpan,
import org.eclipse.ui.internal.themes.WorkbenchThemeManager;
    public static int checkSashStyle(int style) {
    }
                return catalogTerm;
    }
        } catch (InterruptedException e) {

            label.setImage(image);
                // For white color return just null to avoid explicit color set.
        if (toolTip != null) {
        return null;
            .map(GeneralUtils::variablePattern)
    }
        ToolItem button = new ToolItem(parent, SWT.PUSH);
            checkbox.setLayoutData(gd);
        if (rgbStringOrId.isEmpty()) {
                ParameterizedCommand cmd = cci.getCommand();
                int sbWidth = table.getBorderWidth() * 2;
        }
    }
    }
        if (partSite == null) {

    }
     * @return a new Font instance with the scaled size, based on the original font
        IDialogSettings section = parent.getSection(sectionId);
        if (selectionListener != null) {
        }
                totalWidth += colWidth;
        return emptyLabel;
                messageBox.setMessage(info);
        }
                    sbWidth = sbWidth + table.getVerticalBar().getSize().x;
        GridData gd;
        control.setVisible(visible);
                    return;
    }
        }
     * @return a new {@link Font} object with the modified size.

        @Nullable DBPImage icon,
    public static Integer getTextInteger(Text text) {
    public static boolean confirmAction(@Nullable Shell shell, String title, String message, @NotNull DBPImage image) {
     * Returns the grey value in which the given color would be drawn in grey-scale.
            } else {
            return (fork, cancelable, runnable) -> runnable.run(new VoidProgressMonitor());
    }
        return null;
    @NotNull
            int columnCount = table.getColumnCount();
                    }
     * @param control control to check
import java.util.Arrays;
    }

            );
                Rectangle label = textLabel.getBounds();

            PlatformUI.getWorkbench().getHelpSystem().setHelp(control, pluginId + "." + helpContextID); //$NON-NLS-1$
     */
                    (scrolledComposite.getStyle() & SWT.V_SCROLL) != 0 ? SWT.DEFAULT : area.height
        Composite parent = widget.getParent();
        syncExec(messageBoxRunnable);
        }
        gc.fillRectangle(centerX - 2, centerY - 2, size.x + 4, size.y + 4);
                    return;
        return section;
        return checkbox;

                .setMessage(info)
        return createToolItem(parent, text, icon != null ? DBeaverIcons.getImage(icon) : null, selectionListener);

    public static void setContentProposalToolTip(Control control, String toolTip, String... variables) {
    }
            }
    @NotNull
import org.jkiss.dbeaver.model.runtime.*;
    @NotNull
import org.eclipse.swt.layout.RowLayout;
    @NotNull
    }
                Shell shell = window.getShell();
        }
        return ph;
                return;
        @Nullable String toolTip,
    }
        for (TreeItem item : parent.getItems()) {
        int columns,
                return child;
            IViewPart view = ref.getView(false);

        }
        ToolBar toolBar = toolbarManager.getControl();
    @NotNull
        return null;
            }
            .findFirst()
            return;
        if (focusService != null) {
        return getConnectionColorByRGB(rgbString);
        }
        int columns,
            icon = DBIcon.STATUS_INFO;
    }
import org.eclipse.swt.custom.*;
     * @return ScrolledComposite
    public static IDialogSettings getDialogSettings(@NotNull String dialogId) {
                        showCatalog = contextDefaults.getDefaultCatalog() != null || contextDefaults.supportsCatalogChange();
    }
        if (toolBar == null || toolBar.isDisposed()) {
            .hint(widthHint, SWT.DEFAULT)
                control.removeControlListener(this);
        final Point shellLocation = shell.getLocation();
            getDisplay().syncExec(runnable);
        final int y = parentBounds.y + (parentBounds.height - size.y) / 2;
        control.setEnabled(enable);
            for (Control child : composite.getChildren()) {
            (RuntimeUtils.isMacOS() ? SWT.COLOR_WIDGET_NORMAL_SHADOW : SWT.COLOR_WIDGET_DARK_SHADOW) :
        return text;
            gd.horizontalSpan = hSpan;

            IWorkbench workbench = PlatformUI.getWorkbench();
        }

            .filter(next -> next.getId().equals(pageId))
    ) {
            }));
    }
    public static boolean isInDialog(Control control) {
                }

            try {
                int colWidth = column.getWidth();
                    int colWidth = column.getWidth();
            return;
                    enableWithChildren(child, enable);
        Composite composite = new Composite(parent, SWT.NONE);

    }

    public static void executeOnResize(Control control, Runnable runnable) {
    /**
                }
                        child.setEnabled(enable);
                }
            }
        }
        ph.setLayout(gl);
            fd.setHeight((int) Math.round(fd.getHeight() * modifier));
            log.debug(e);
        @NotNull Composite parent,
            Display display = getDisplay();
        }
    }

        @Nullable String label,
            button.setSelection(true);
    public static IWorkbenchWindow findWorkbenchWindow(@NotNull Control control) {
            rgbString = connectionInfo.getConnectionType().getColor();

import org.eclipse.core.runtime.IStatus;
                    return;
        return ph;
            control.addDisposeListener(e -> {
        Button button = new Button(parent, SWT.PUSH | SWT.FLAT);
                final Point controlSize = control.getSize();
    @NotNull
        Combo encodingCombo = new Combo(parent, SWT.DROP_DOWN);
            gd.heightHint = 1;
        gl.marginHeight = 0;
            } else if (data instanceof HandledContributionItem hci) {
        return provider == null ? null : provider.getShell();
        DecimalFormatSymbols symbols = DecimalFormatSymbols.getInstance(locale);
                column.pack();
        parent.setTabList(tabList);
        control.setFont(font);
            }
                    bounds.width,
            GridData gd = new GridData(layoutStyle > 0 ? layoutStyle : GridData.HORIZONTAL_ALIGN_BEGINNING);
        return createPlaceholder(parent, columns, 0);
            throw new IllegalArgumentException("style must be SWT.HORIZONTAL or SWT.VERTICAL");
        int widthHint,

        @Nullable String label,

        syncExec(() -> reply[0] = MessageBoxBuilder.builder(shell != null ? shell : getActiveWorkbenchShell())
        panel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
import java.lang.reflect.InvocationTargetException;
        GridLayout gl = new GridLayout(columns, false);
     */
        table.setRedraw(false);
    private static final SharedTextColors SHARED_TEXT_COLORS = new SharedTextColors();
    }
        return fontData[0].getHeight();
        button.setText(label);
            return false;
        final FontData[] defaultFontData = JFaceResources.getFontRegistry().getFontData(JFaceResources.DEFAULT_FONT);
        label.setImage(DBeaverIcons.getImage((style & SWT.HORIZONTAL) == SWT.HORIZONTAL ? UIIcon.SEPARATOR_H : UIIcon.SEPARATOR_V));
    public static AbstractUIJob runUIJob(String jobName, final DBRRunnableWithProgress runnableWithProgress) {
import org.eclipse.swt.widgets.*;
            runnableContext.run(true, true, monitor -> runnable.run(RuntimeUtils.makeMonitor(monitor)));
                        return item;
    /**
        IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
        log.error("Composite is not titled!");
            }
        return createTitledComposite(parent, label, null, columns, layoutStyle, widthHint, hSpan);
                if (totalWidth < clientArea.width) {
                    // Open in the same dialog
            if (!display.isDisposed()) {
        }
        final FontData[] data = normalFont.getFontData();
    public static int blend(int v1, int v2, int ratio) {
    }
        return createPushButton(parent, label, image, null);
                }
        return Display.getCurrent() != null;
            widget.addListener(SWT.Selection, event -> onFocusLost.run());
        }
            UIFonts.DBeaver.MAIN_FONT,
    }
     * Create centralized shell from default display
        job.setSystem(true);
        if (image != null) {
        return modifyFont(normalFont, SWT.BOLD);
                        item.setData("commandId", cmd.getId());
        @NotNull Composite parent,
            if (fc == control) {

        @NotNull Composite parent,
                            defIndex = index;
            } catch (Exception e) {
            button.setToolTipText(toolTip);
        final int x = bounds.x + bounds.width / 2 - 120;

        SortedMap<String, Charset> charsetMap = Charset.availableCharsets();
    @NotNull
            for (int i = 0; i < e.text.length(); i++) {



        tree.setRedraw(false);
    @Nullable
    }
            });

            Display display = getDisplay();
            return null;
        }
    }
                            for (TreeColumn tc : columns) {

    public static Button createCheckbox(Composite parent, String label, String tooltip, boolean checked, int hSpan) {
            .showMessageBox());
    public static void setClipboardContents(Display display, Transfer transfer, Object contents) {
            IRunnableContext runnableContext;
     * @return the width of the button.
            return window;



    public static String getSupportedVariablesTip(String toolTip, String... variables) {
        Button button = new Button(parent, SWT.RADIO);



    }
        if (Character.isAlphabetic(rgbStringOrId.charAt(0))) {
                Shell activeShell = shell != null ? shell : getActiveWorkbenchShell();
        GridLayout gl = new GridLayout(columns, false);
    }
            return null;
                            int newWidth = (int) (tc.getWidth() - extraSpace * ratio);
     * Creates new GridData with FILL_HORIZONTAL if not exists.
        return combo;
        }
    }
        scrolledComposite.addControlListener(new ControlAdapter() {
        return ph;
        Button checkbox = createCheckbox(parent, label, checked);

                if (newText != null) {
    }


import org.eclipse.ui.handlers.IHandlerActivation;
        GridData gd = new GridData(GridData.FILL, GridData.FILL, true, false, 1, 1);
    /**
    }
/**
        }
    }
        try {
        @NotNull Composite parent, @NotNull String label, @Nullable String tooltip,
        return createInfoLink(parent, text, callback, SWT.NONE, 1, SWT.DEFAULT);
        if (label != null) {


        Composite panel = createComposite(parent, 2);
        for (Control child : composite.getChildren()) {
        for (FontData fd : data) {
        @NotNull String text,
        // Vert align center. Because height of single line control may differ from label height. This makes form ugly.
        Label horizontalLine = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
    }
    public static void populateToolItemCommandIds(ToolBarManager toolbarManager) {
import java.nio.charset.Charset;

        }
    }
        if (control.getLayoutData() instanceof GridData gd) {
            toolItem.setText(title);
        return textLabel;
        final Control[] tabList = parent.getTabList();


        Shell shell = control.getShell();
            return Integer.valueOf(str);
        try {
    }
     * Runs task in Eclipse progress dialog.

        @NotNull DBRRunnableWithProgress runnable
        } else {
                } else {
                        }
            gd.horizontalSpan = hSpan;
import org.eclipse.swt.dnd.Transfer;

        if (selectionListener != null) {
        gl.marginWidth = 0;

        }
    }
        return findPreferenceNode(PlatformUI.getWorkbench().getPreferenceManager(), pageId);
    public static Button createToolButton(Composite parent, String text, SelectionListener selectionListener) {
        return createLabelCheckbox(parent, label, tooltip, checked, SWT.NONE);
        if (control instanceof Tree tree) {
            if (items[i] == item) {
    }

        } else {
    }
                }
                            tc.setWidth(newWidth);
                    return GeneralUtils.makeExceptionStatus(e);
    }

     *
        return workbenchWindow;
                    pageContainer.openPage(pageId, pageData);
        editButton.addSelectionListener(new SelectionAdapter() {
import org.jkiss.dbeaver.model.*;
        }
        });
        }
            GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
import org.jkiss.dbeaver.Log;

        for (int i = 0; i < variables.length; i++) {
    @NotNull
            return null;
        }
            control = createInfoLink(parent, createHrefText(text), callback).getParent();
        Rectangle bounds = getControlPaintBounds(control);
    }
import org.eclipse.core.resources.ResourcesPlugin;
        }

        if (icon != null) {
                        column.setWidth(totalWidth / 3);
            .orElse(null);
        @NotNull Composite parent,
    public static <T> T syncExec(RunnableWithResult<T> runnable) {
    public static Link createInfoLink(@NotNull Composite parent, @NotNull String text, @NotNull Runnable callback) {
            GridData gd = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);

            boolean showCatalog = true;
            if (rect.contains(x, y)) {
    }
    @NotNull
        @Nullable String tooltip,
}
    }
    }
                if (!Character.isDigit(ch) && ch != symbols.getMinusSign() && ch != symbols.getGroupingSeparator()) {
        }
        try {
        scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
     * @param style          the control style (as expected by SWT subclass)
    @NotNull
    @NotNull
            // Already enabled - no op
            if (newText.length() < MAX_LONG_STRING.length()) {
     */



        gc.drawRoundRectangle(centerX - 3, centerY - 3, size.x + 5, size.y + 5, 5, 5);
                return catalogTerm + "/" + schemaTerm;
    public static void dispose(Resource resource) {
    public static Color getConnectionColor(@NotNull DBPConnectionConfiguration connectionInfo) {

            String catalogTerm = showCatalog ? dataSourceInfo.getCatalogTerm() : null;

        control.setToolTipText(getSupportedVariablesTip(toolTip, variables));
    }
            return null;
        PreferenceDialog propDialog;
                    ParameterizedCommand cmd = model.getWbCommand();
    @Nullable
        return job;
     */
    }

            treeViewer.expandAll();

                        for (TableColumn tc : columns) {
                if (workbenchWindow == null) {
                if (!button.isDisposed() && button.isVisible() && button.isEnabled()) {
        int index = 0;
        Label labelControl = createControlLabel(parent, label);
                    workbenchWindow = getActiveWorkbenchWindow();
            }

    public static void disposeChildControls(Composite composite) {
import org.eclipse.jface.resource.ColorRegistry;
                    } finally {
                log.error(e);
    }
            }
    }
     */
                final GC gc = e.gc;
                if (shell != null && shell.isVisible()) {
    public static Text recreateTextControl(@Nullable Text original, int style) {
        return createControlLabel(parent, label, 1);
        scrolledComposite.setExpandVertical(true);
            messageBoxRunnable = () -> MessageBoxBuilder.builder(shell != null ? shell : getActiveWorkbenchShell())
        link.addSelectionListener(listener);
                    column.setWidth(colWidth);
    //
        if (control == null || control.isDisposed()) {
        new ToolItem(toolBar, SWT.SEPARATOR).setControl(label);
            if (data instanceof CommandContributionItem cci) {
        }
        }
            return null;
    public static Label createHorizontalLine(Composite parent, int hSpan, int vIndent) {
    public static ToolItem findToolItemByCommandId(@NotNull ToolBarManager toolbarManager, @NotNull String commandId) {
    }
        try {
            button.setImage(DBeaverIcons.getImage(icon));

        if (text instanceof String) {
    }
    }
            focusService = UIUtils.getActiveWorkbenchWindow().getService(IFocusService.class);
        return spinner;
    }
import org.eclipse.jface.wizard.IWizardContainer;
        }
     * @param control control to disable redraw
                    e.doit = false;
                if (totalWidth < clientArea.width) {
    ) {

        if (defIndex >= 0) {
    }
    }
        }
            button.setSelection(true);

        try {
            }
        clipboard.dispose();
        }
            }
     * Determine whether this control or any of it's child has focus

        return SHARED_TEXT_COLORS;
        }
            }
                return shell;
            link.setText(NLS.bind(WorkbenchMessages.PreferenceNode_NotFound, pageId));
                tabList[i] = text;
        {

        final Rectangle bounds = parent.getBounds();
     *

            }
                if (charset.displayName().equalsIgnoreCase(curCharset)) {
        for (ToolItem item : toolBar.getItems()) {
import org.eclipse.swt.SWT;
            Point ext = gc.textExtent(line);
        // For multiline texts we need to set vert align manually.
                    }
        final Shell[] shells = display.getShells();
import org.eclipse.jface.layout.GridDataFactory;
import java.util.SortedMap;
     */
            .applyTo(composite);
            @Override
    public static IWorkbenchWindow getActiveWorkbenchWindow() {
        return -1;
        return confirmAction(null, title, question);
            if (fit && totalWidth < clientArea.width) {
        parent.layout(true, true);

    @Nullable
        textLabel.setLayoutData(gd);
        }
    }
        scrolledComposite.setExpandHorizontal(true);
    }
import org.eclipse.jface.action.IContributionManager;

    }
            }
            Object data = item.getData();
            }
                runnable.run();
    }
            final Field styleField = Widget.class.getDeclaredField("style");
                            double ratio = (double) tc.getWidth() / totalWidth;
import org.jkiss.code.NotNull;
            Object data = item.getData();
        IWorkbench workbench = PlatformUI.getWorkbench();

    public static IWorkbenchWindow findActiveWorkbenchWindow() {
        try {
    @NotNull

        url = url.trim();
    ) {
        }
            control.setLayoutData(gd);
    public static void waitJobCompletion(AbstractJob job) {
        return shell;
                } else if (totalWidth < areaWidth) {
    public static Font makeBoldFont(Font normalFont) {
            log.debug(e);
    public static Composite createComposite(@NotNull Composite parent, int columns) {
        return null;
        }
     * @param normalFont the original font whose size needs to be modified.
        IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
    }
    @Nullable
        } finally {
    public static int getShadowColor() {
                e.gc.drawLine(0, e.height - 1, e.width, e.height - 1);
                    GC gc = new GC(table);
        @NotNull String label,
        return getTextSize(control, "X").y;
        return button;
        return (control instanceof Text && ((Text) control).getCharCount() == 0) ||
            url = "http://" + url;

import org.eclipse.ui.dialogs.PreferencesUtil;
        }
            Shell activeShell = Display.getCurrent().getActiveShell();
        if (image != null) {

            }

                } catch (DBException e) {
        boolean checked, int style
            tree.setRedraw(true);
                }
        if (widget != null && !widget.isDisposed()) {
import org.jkiss.dbeaver.runtime.DummyRunnableContext;
    }
        return SHARED_FONTS;
    public static void setHelp(Control control, String pluginId, String helpContextID) {
import org.eclipse.jface.layout.GridLayoutFactory;
            // Check for disposed items
        Point size = shell.computeSize(SWT.DEFAULT, SWT.DEFAULT);
            for (Control element : ((Composite) control).getChildren()) {
        return (0.299 * rgb.red + 0.587 * rgb.green + 0.114 * rgb.blue + 0.5);
            button.setImage(image);
            return new RunnableContextDelegate(workbench.getActiveWorkbenchWindow());

        }
    public static Control createWarningLabel(
    public static RGB blend(RGB c1, RGB c2, int ratio) {
import org.eclipse.jface.dialogs.Dialog;
        return new Font(normalFont.getDevice(), data);
                        PreferencesUtil.OPTION_NONE

    }
    public static void maxTableColumnsWidth(Table table) {
        }
    public static void createToolBarSeparator(ToolBar toolBar, int style) {
        @NotNull String label,


        }
            double charsPerLine = (double) bounds.width / gc.getFontMetrics().getAverageCharacterWidth();
        int count = combo.getItemCount();
        return e -> {
    }
    }
            return PlatformUI.getWorkbench().getDisplay();
        // used for accessibility automation, see qa-auto-dbeaver
    }
                gd.widthHint = widthHint;
        TreeColumn column = new TreeColumn(tree, style);
    public static Object normalizePropertyValue(Object text) {
        if (focusControl == null) {
        if (node == null) {
                return child;
                Rectangle bounds = getBounds();

        if (activeShell != null) {
                }
    }
                }
            widget.addDisposeListener(e -> onFocusLost.run());

        display.update();
        link.setText(text);
    }
        return getSettingsSection(workbenchSettings, dialogId);
    }
        }

                    int extraSpace = (clientArea.width - totalWidth - sbWidth) / columns.length - 1;
        try {

        return horizontalLine;
            gc.drawText(
        if (callback == null) {
    /**
    }
            @Override
     *
        for (String csName : charsetMap.keySet()) {
            final Rectangle clientArea = table.getBounds();
    }
        if (tooltip != null) {

        }
            return;
                    button.notifyListeners(SWT.Selection, new Event());
                totalWidth += column.getWidth();
    public static Font scaleFontSize(@NotNull Font normalFont, double modifier) {
        return link;

    public static void updateContributionItems(IContributionManager manager) {
                styleField.setAccessible(true);
            // TODO: it looks like SWT error. Sometimes tree items are disposed and NPE is thrown from column.pack
            .findFirst()
        }
 * Unless required by applicable law or agreed to in writing, software
            .toArray(String[]::new));
     * Creates {@link ScrolledComposite} from the {@link Composite}
    public static Button createPushButton(@NotNull Composite parent, @Nullable String label, @Nullable Image image) {
    }
            if (!display.isDisposed()) {
    @Nullable
    ) {
            log.warn("Charset '" + curCharset + "' is not recognized"); //$NON-NLS-1$ //$NON-NLS-2$
        }

            }
        }
            button.setToolTipText(tooltip);
        Composite composite = UIUtils.createComposite(parent, 1);
        return Arrays.equals(mainFontData, defaultFontData);
            e.gc.setForeground(e.display.getSystemColor(getShadowColor()));
        IWorkbenchWindow[] windows = workbench.getWorkbenchWindows();

    public static void enableWithChildren(Control control, boolean enable) {
    public static Button createLabelCheckbox(Composite parent, String label, boolean checked) {

     * Creates a new link that opens the given preference page either in the current
        Text text = new Text(panel, style);
                messageBox.setText(title);
                final Rectangle clientArea = table.getClientArea();
        return button;
            return null;
    public static ToolItem createToolItem(ToolBar parent, String title, String text, DBPImage icon, SelectionListener selectionListener) {
        GridData gd = new GridData(GridData.VERTICAL_ALIGN_CENTER /*| GridData.HORIZONTAL_ALIGN_END*/);
        // labelControl.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        final Label imageLabel = new Label(composite, SWT.NONE);
        createControlLabel(parent, label);
        button.setFont(JFaceResources.getDialogFont());
                    try {
                dialog.run(true, true, monitor -> {
                    if (contextDefaults != null) {
        @NotNull Composite parent,
        }
     * @param expansionStyle the style of the expansion widget (see {@link ExpandableComposite})
        @NotNull String text,
    }
        IViewReference[] references = workbenchWindow.getActivePage().getViewReferences();
                                newWidth = minWidth;
                    for (String alias : charset.aliases()) {
                    IWorkbenchPage activePage = workbenchWindow.getActivePage();
    @NotNull
        final FontData[] mainFontData = JFaceResources.getFontRegistry().getFontData(UIFonts.DBeaver.MAIN_FONT);

        button.setToolTipText(text);
            return Math.max(widthHint, minSize.x);

                scrolledComposite.setMinSize(size);

            widget.setLayoutData(gd);
            final String label = canOpenHere ? node.getLabelText() : NLS.bind(UIMessages.link_external_label, node.getLabelText());
     *
                    float extraSpace = areaWidth - totalWidth;

        int columns,
    public static void updateTitledCompositeTooltip(@NotNull Composite titledComposite, @NotNull String tooltip) {
    @NotNull
                return viewClass.cast(view);
        for (Shell shell : shells) {
        }
        }
        link.setText(text);
        int gridStyle,
     *
            }
        return createTitledComposite(parent, label, columns, GridData.HORIZONTAL_ALIGN_BEGINNING, SWT.DEFAULT);
        if (false) {
            needsLayout = true;
            if (tabList[i] == original) {
import org.eclipse.jface.preference.PreferenceManager;

                String newText = EditTextDialog.editText(parent.getShell(), label, text.getText());
        return false;
            (control instanceof Combo && ((Combo) control).getText().isEmpty());
    public static void installMacOSFocusLostSubstitution(@NotNull Widget widget, @NotNull Runnable onFocusLost) {
        // We have to use an anonymous class because "textLabel" has protected access
            return null;
    }
        imageLabel.setImage(DBeaverIcons.getImage(image));
                    if (!child.isDisposed()) {


        emptyLabel.setLayoutData(gd);
                for (TableColumn column : columns) {
    /**
                try {
        } else {
        int layoutStyle,
                if (cmd != null && commandId.equals(cmd.getId())) {
        return Arrays.stream(display.getShells())
        return reply[0] == Reply.YES;
        IWorkbenchPartSite partSite = getWorkbenchPartSite(serviceLocator);
        if (CommonUtils.isEmpty(rgbString)) {
                    if (colWidth > totalWidth / 3) {
        DBPDataSource dataSource = dataSourceContainer == null ? null : dataSourceContainer.getDataSource();
                return item;
        @NotNull Composite parent,
        }
        } else {
 * limitations under the License.
        gd.horizontalSpan = horizontalSpan;
    }
        }
     *
    }

    }
     * preference container, is present, or in a new modal dialog.
                } else {
        ScrolledComposite scrolledComposite = new ScrolledComposite(parent, style);
import org.jkiss.dbeaver.utils.RuntimeUtils;
    public static Composite createPlaceholder(Composite parent, int columns) {
                display.sleep();
        if (widget instanceof Combo || widget instanceof CCombo) {
        gd.verticalSpan = verticalSpan;
            if (rect.contains(x, y)) {
        }
        button.setLayoutData(getDialogButtonLayoutData(parent, button));
                }
        String str = text.getText();
            button.addSelectionListener(selectionListener);
        return column;
    public static void installAndUpdateMainFont(@NotNull Control control) {
                return items[i - 1];

            shellLocation.x = CommonUtils.clamp(displayArea.width - shellSize.x, 0, shellLocation.x);
            return runWithMonitor(runnable);
        for (FontData fd : data) {
        try {
import org.jkiss.dbeaver.model.exec.DBCExecutionContextDefaults;
    public static Link createPreferenceLink(
import org.eclipse.jface.window.IShellProvider;
 *
        }
        ContentAssistUtils.installContentProposal(controlForTip, new SmartTextContentAdapter(), proposalProvider);
    private static final Log log = Log.getLog(UIUtils.class);
    public static boolean isDark(RGB rgb) {
                }
            .setPrimaryImage(image)
        return text;

        ToolBar toolBar = toolbarManager.getControl();
                MHandledItem model = hci.getModel();
import org.jkiss.dbeaver.ui.dialogs.MessageBoxBuilder;
                        totalWidth += column.getWidth();
     * operate on its bounds in pixels rather than points.
                        gc.dispose();

     * @param parent         the parent
            if (connectionColor.getBlue() == 255 && connectionColor.getRed() == 255 && connectionColor.getGreen() == 255) {
            item.update();
        int selectionIndex = combo.getSelectionIndex();
    public static void dispose(Widget widget) {
        varsTip.append("."); //$NON-NLS-1$
        try {
            if (fit) {
            .setTitle(title)
        TableItem[] items = table.getItems();
                return null;
            }

            if (!control.isDisposed()) {
     */
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
            Display display = getDisplay();
    // From E4 sources
            needsLayout = true;
import org.eclipse.core.commands.ParameterizedCommand;

    @NotNull
        }
        link.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, true, true));
                return;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
        }

    public static ColorRegistry getColorRegistry() {
        }

import org.eclipse.jface.dialogs.IDialogConstants;

import org.jkiss.dbeaver.ui.internal.UIMessages;
    ) {



     */
        if (value != null) {
        for (int i = 0; i < columnCount; i++) {
        return null;
    }
        for (int i = 0; i < tabList.length; i++) {
    @NotNull
            }

                    return shell;
    public static TableColumn createTableColumn(Table table, int style, String text) {
            shellSize.x = Math.max(shellSize.x, compSize.x);
            }
        control.setRedraw(false);
        @Nullable DBPImage image,
    @NotNull
        layout.marginTop = 0;
        }
                            if (newWidth < minWidth) {
    }
        if (control != null && !control.isDisposed()) {
                throw dbe;
            return activeShell != null && isInDialog(activeShell);
                }
        return createInfoLabel(parent, text, SWT.NONE, 1, listener);
        if (selectionProvider != null) {
    }

        } catch (Throwable e) {
        } else if (messageType == SWT.ICON_QUESTION) {
        }
        if (checked) {
        Group group = new Group(parent, SWT.NONE);
        @NotNull Composite parent,
        return getConnectionColorByRGB(rgbString);
                            break;
                        // If some columns are too big (more than 33% of total width)

    private static IPreferenceNode findPreferenceNode(@NotNull String pageId) {
                textField.setBackground(textField.getDisplay().getSystemColor(SWT.COLOR_WIDGET_HIGHLIGHT_SHADOW));
            if (widthHint > 0) {

    }
    public static boolean isInDialog() {

            }

     * @param scrolledComposite composite to configure
            }
    @Nullable
    public static void addVariablesToControl(@NotNull Control controlForTip, @NotNull String[] variables, String toolTipPattern) {
        @NotNull Composite parent,
        } else if (messageType == SWT.ICON_INFORMATION) {
    public static void timerExec(int milliseconds, @NotNull Runnable runnable) {
            propDialog = PreferencesUtil.createPropertyDialogOn(shell, element, defPageID[0], null, null, PreferencesUtil.OPTION_NONE);
    @Nullable
    }
        } catch (Exception e) {
            button.setText(label);
    }
     */
            }
/*
            }
        text.setText(original.getText());
    }
                    throw new DBException("Internal error", e.getTargetException());

    public static Button createPushButton(
import org.eclipse.jface.action.IAction;
    /**
        return encodingCombo;

        } catch (InvocationTargetException e) {


        if (control instanceof Scrollable scrollable) {
        //editButton.setText("...");
            text.setText(value);
        return "<a href=\"#\">" + text + "</a>";
     * This method can later be removed when migrated to a newer version of Eclipse that includes a fix for this issue.


        });
        if (workbenchWindow == null) {
        final int centerX = x - size.x / 2;
        ISelectionProvider selectionProvider = serviceLocator.getService(ISelectionProvider.class);
    public static Control createInfoLabel(
        syncExec(() -> reply[0] = MessageBoxBuilder.builder(shell != null ? shell : getActiveWorkbenchShell())
            e.gc.fillRectangle(0, 0, e.width, e.height);
    }
            return findPreferenceNode(dialog.getPreferenceManager(), pageId);
            }
    public static void setWidgetWidthHint(@NotNull Control widget, int widthHint) {
            }
        }
            .setPrimaryImage(image)
 * You may obtain a copy of the License at

    ) {
        @Nullable Object data,
import org.eclipse.jface.resource.ImageDescriptor;
            throw new IllegalStateException("No workbench window");

            }

import org.eclipse.swt.events.*;
        return button;
        final FontData[] data = normalFont.getFontData();
            button.addSelectionListener(selectionListener);

                Rectangle area = scrolledComposite.getClientArea();

    public static <T> T findView(IWorkbenchWindow workbenchWindow, Class<T> viewClass) {
            bounds = control.getBounds();

    }
                    runnableWithProgress.run(monitor);
 * you may not use this file except in compliance with the License.
                log.debug("widget dispose error", e);
     * @see <a href="https://github.com/eclipse-platform/eclipse.platform.swt/issues/2329">https://github.com/eclipse-platform/eclipse.platform.swt/issues/2329</a>

                return item;
        titleLabel.setText(label);
    public static Font getMonospaceFont() {
    public static void resizeShell(@NotNull Shell shell, Point compSize) {
    public static TreeColumn createTreeColumn(Tree tree, int style, String text) {
        } else {
    public static void showMessageBox(final Shell shell, final String title, final String info, final int messageType) {
        final Point shellSize = shell.getSize();
     * <pre>{@code
        @NotNull String label,
        }
        AbstractUIJob job = new AbstractUIJob(jobName) {
                MHandledItem model = hci.getModel();
import org.eclipse.jface.action.IContributionItem;
    public static TreeItem getTreeItem(Tree tree, Object data) {
    }
            if (e.text.isEmpty()) {
        if (toolBar == null || toolBar.isDisposed()) {
     *
        }
        @NotNull Runnable callback,
            shellSize.y = Math.max(shellSize.y, compSize.y);
            e.gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW));
        GridLayout layout = new GridLayout(columns, false);
        for (int i = 1; i < items.length; i++) {
    }
            .setLabels(buttons)
                e.doit = false;
import org.eclipse.jface.operation.IRunnableContext;
        while (control != null) {
            gridData.widthHint = buttonWidth;
    ) {
                .setTitle(title)
    public static boolean isUIThread() {
     * addressing the bug in the SWT implementation for Windows that causes the sash to
        int columns,
            icon = DBIcon.STATUS_WARNING;
        button.setText(text);
    }
        //Button editButton = new Button(panel, SWT.DOWN);
        int columnCount = item.getParent().getColumnCount();
     * @param widget Control to set width hint for
            return CommonUtils.toString(text).trim();
        scrolledComposite.setLayout(new GridLayout(1, false));
        return WorkbenchThemeManager.getInstance().getCurrentTheme();
            if (value.equals(combo.getItem(i))) {
    public static void packColumns(@NotNull Tree tree) {
            }
        int layoutStyle,
        horizontalLine.setLayoutData(gd);
        GC gc = new GC(control);
        group.setLayoutData(new GridData(GridData.FILL_BOTH));
        }
import java.util.Locale;
        }
        }
                partSite = activePart.getSite();
            ProgressMonitorDialog dialog = new ProgressMonitorDialog(workbench.getActiveWorkbenchWindow().getShell());

        });
    }
            if (i > 0) {
            return null;
            try {
        return createSpinner(parent, tooltip, value, minimum, maximum);
    public static <T extends Control> void addEmptyTextHint(T control, DBRValueProvider<String, T> tipProvider) {
        if (children.length > 0 && children[0] instanceof Label label) {
            public void mouseUp(MouseEvent e) {
            }
        return UIStyles.isDarkTheme() ?
        for (TreeItem item : tree.getItems()) {
    public static int getDialogButtonWidth(@NotNull Button button) {
                final TableColumn[] columns = table.getColumns();
    }
    private static final SharedFonts SHARED_FONTS = new SharedFonts();
                column.pack();
        return null;
                // Unregister from focus service
        log.error("Composite is not titled!");
            public void controlResized(ControlEvent e) {
        }
                .setPrimaryImage(finalIcon)
        } else {
        int gridStyle,
        // Wait until job finished
            } else if (data instanceof HandledContributionItem hci) {
        } catch (InvocationTargetException e) {
        if (parent == null || !(parent.getLayout() instanceof GridLayout)) {
            icon = DBIcon.STATUS_ERROR;
                    throw new InvocationTargetException(e);
            try {
        }
import java.text.DecimalFormatSymbols;
            shell.setLocation(shellLocation.x, shellLocation.y);
            for (TreeItem item : tree.getItems()) {
        @NotNull Composite parent,

    public static void runInProgressDialog(final DBRRunnableWithProgress runnable) throws InvocationTargetException {
        @Nullable Runnable callback
                char ch = e.text.charAt(i);
        getDefaultRunnableContext().run(true, true, runnable);
    public static boolean isWindowVisible(@NotNull Display display, @NotNull Class<? extends Window> clazz) {
        if (title != null) {
        }

        }
        int style,
        Label label = new Label(toolBar, SWT.NONE);//SEPARATOR | style);
    @NotNull
            if (RuntimeUtils.isWindows()) {
     * @return {@code true} if a window of the given class is visible
import org.jkiss.dbeaver.runtime.RunnableContextDelegate;
            }

        shell.setLocation(x, y);
        IHandlerService handlerService = serviceLocator.getService(IHandlerService.class);
        for (Control child : parent.getChildren()) {
    }
                    int extraSpace = totalWidth - clientArea.width;
    @NotNull
    public static void setInfoLinkText(@NotNull Control infoLink, @NotNull String text) {
    }
    /**

                        result[0] = runnable.runTask(RuntimeUtils.makeMonitor(monitor));
    }
        int widthHint
     * @param style  composite style
        @NotNull Composite parent,
                varsTip.append(",\n");
import org.eclipse.jface.viewers.ISelectionProvider;
    public static void drawTextWithBackground(@NotNull GC gc, @NotNull String text, int x, int y) {
            return null;
            for (TreeColumn column : columns) {
    public static Link createLink(Composite parent, String text, SelectionListener listener) {

        if (rgb.red == rgb.green && rgb.green == rgb.blue) {
        Button button = new Button(parent, SWT.PUSH);
     * Scales the font size of the provided font by the specified modifier.


     */
                                TreeColumn tc = columns[i];
            if (newText.length() > MAX_LONG_STRING.length()) {
    }
                return i;

    /**
    }
        } else {

    }

    @Nullable
import org.jkiss.dbeaver.ui.controls.CustomSashForm;
        return part == null ? null : getShell(part.getSite());
        }
 * UI Utils

    //////////////////////////////////////////

                if (model != null) {
    public static void updateTitledComposite(@NotNull Composite titledComposite, @NotNull String title) {
        for (Listener listener : source.getListeners(eventType)) {
    /**


        fixReadonlyTextBackground(text);

        return control.getShell().getData() instanceof IWizardContainer;
        link.addSelectionListener(SelectionListener.widgetSelectedAdapter(e -> callback.run()));
    public static void packColumns(Table table) {
            gd.horizontalSpan = span;
        control.addControlListener(new ControlAdapter() {
    @Nullable
        }
                    }
                    }
        spinner.setMinimum(minimum);
        return null;
        if (needsLayout) {
    @NotNull
                    for (TableColumn tc : columns) {
            return null;
        return control.getShell().getData() instanceof Dialog;
    }
