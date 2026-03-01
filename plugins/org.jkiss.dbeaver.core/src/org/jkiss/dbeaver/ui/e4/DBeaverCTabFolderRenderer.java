            try {
                try {
import org.jkiss.dbeaver.model.DBPDataSourceContainerProvider;
import org.eclipse.swt.SWT;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    @Nullable
    }

 * you may not use this file except in compliance with the License.
        }
import org.jkiss.code.NotNull;
            if (color != null) {
                var oldHotUnselectedTabsColorBackground = hotUnselectedTabsColorBackgroundField.get(this);
            }
                var oldSelectedTabHighlightColor = selectedTabHighlightColorField.get(this);
            return getConnectionColor(part);
 */
                return getConnectionColor(editor.getEditor());
        }
    private void resetCurves() {
                log.error("Cannot set value of field '" + field.getName() + "' from object " + object, e);

 * You may obtain a copy of the License at
        super.draw(part, state, bounds, gc);
    @Override
        if (container != null) {
            return super.computeTrim(part, state, x, y, width, height);
        static <T, R> FieldReflection<T, R> of(@NotNull Class<T> declaringClass, @NotNull String fieldName) {
        } finally {
        return getConnectionColor(editorPart.getEditorInput());
            return UIUtils.getConnectionColor(container.getConnectionConfiguration());
                boolean isSelected = (state & SWT.SELECTED) != 0;
import org.eclipse.swt.custom.CTabFolderRenderer;
import org.eclipse.ui.internal.e4.compatibility.CompatibilityEditor;
            // FIXME: this is a dirty workaround for UI freeze (dbeaver/pro#6519)
                    : parent.getSelectionBackground();
import org.eclipse.e4.ui.internal.css.swt.ICTabRendering;

        if (isInColor) {
                var oldCloseRect = closeRectField.get(item);
                return;
            // Tab rendering is broken on Linux when a different renderer other than org.eclipse.e4.ui.workbench.renderers.swt.CTabRendering is used:
            Field field = null;

                return;
                }
                if (!isSelected) {
        if (part.getTransientData().containsKey(PART_SKIP_KEY)) {
    }
            }
            return null;
import org.eclipse.swt.widgets.Control;
                }
            // https://github.com/eclipse-platform/eclipse.platform.swt/blob/1a1f0c22b89d8c99ff9ad58c2bbcf82147852e5a/bundles/org.eclipse.swt/Eclipse%20SWT%20Custom%20Widgets/common/org/eclipse/swt/custom/CTabFolderRenderer.java#L1795-L1796
    private static final Rectangle EMPTY_CLOSE_RECT = new Rectangle(0, 0, 0, 0);
            curveIndent.set(this, 0);
    }

                Color selectedColor = UIStyles.mix(highlightColor, fillColor, 0.1f);
    }
import org.jkiss.dbeaver.ui.editors.EditorUtils;
            } catch (ReflectiveOperationException e) {
                    // logic, we need to override it to be the same color as the tab itself
    private static final FieldReflection<CTabItem, Rectangle> closeRectField;
import org.jkiss.code.Nullable;
        if (editorPart instanceof DBPDataSourceContainerProvider provider) {
    @Override
                field.setAccessible(true);
        void set(@NotNull T_CLASS object, @Nullable T_FIELD value) {
import org.jkiss.dbeaver.utils.RuntimeUtils;
    }
    private static final FieldReflection<CTabRendering, Color> tabOutlineColorField;
            // We fix it by avoiding UI double entrance
    private static final FieldReflection<CTabRendering, Color[]> selectedTabFillColorsField;
    protected Rectangle computeTrim(int part, int state, int x, int y, int width, int height) {
import org.jkiss.dbeaver.model.DBPDataSourceContainer;
    private static final FieldReflection<CTabFolderRenderer, Integer> curveIndent;
        closeRectField = FieldReflection.of(CTabItem.class, "closeRect");
                field.set(object, value);
                boolean isDarkTheme = UIStyles.isDarkTheme();
        curveWidth = FieldReflection.of(CTabFolderRenderer.class, "curveWidth");
    @SuppressWarnings("unchecked")

        } finally {
        }
                selectedTabHighlightColorField.set(this, oldSelectedTabHighlightColor);
    private static final Log log = Log.getLog(DBeaverCTabFolderRenderer.class);

        try {
                    log.debug("Cannot get editor input for part: " + part.getElementId(), e);


            }
import org.eclipse.swt.custom.CTabItem;
            }
 * See the License for the specific language governing permissions and
                var oldSelectedTabFillColors = selectedTabFillColorsField.get(this);
        curveIndent = FieldReflection.of(CTabFolderRenderer.class, "curveIndent");
public final class DBeaverCTabFolderRenderer extends CTabRendering implements ICTabRendering {
        return null;
        try {
        } finally {
                    // The outline bleeds over the hover tab. Since we're relying on SWT.HOT painting
            return super.computeSize(part, state, gc, wHint, hHint);
                selectedTabFillColorsField.set(this, new Color[]{selectedColor});

 *     http://www.apache.org/licenses/LICENSE-2.0
            if (part.getTransientData().get(IWorkbenchPartReference.class.getName()) instanceof IEditorReference ref) {
                    return getConnectionColor(ref.getEditorInput());

            } catch (ReflectiveOperationException e) {
                if (oldCloseImageState != null && oldCloseImageState == SWT.BACKGROUND) {

 *
                }
import org.eclipse.swt.graphics.Point;
            return new FieldReflection<>(field);
    }
        if (RuntimeUtils.isLinux()) {
import org.eclipse.ui.IEditorPart;

            if (container != null) {
import org.eclipse.swt.graphics.Color;
                super.draw(part, state | SWT.HOT, bounds, gc);
import org.jkiss.dbeaver.ui.UIStyles;
            if (part.getObject() instanceof CompatibilityEditor editor) {
                // Removes the background behind the close button
        }
        }
        @Nullable
package org.jkiss.dbeaver.ui.e4;
                    // If for whatever reason we failed to retrieve the editor input with an exception,
import org.jkiss.dbeaver.Log;
        try {
    private static Color getConnectionColor(@NotNull IEditorInput editorInput) {
    @Override

            if (field == null) {
        isInColor = true;
import org.eclipse.ui.IWorkbenchPartReference;
                selectedTabFillColorsField.set(this, oldSelectedTabFillColors);
                    return getConnectionColor(editor);
    }
                IEditorPart editor = ref.getEditor(false);
    @Nullable
                Color fillColor = oldSelectedTabFillColors != null && oldSelectedTabFillColors.length == 1
            }

            }
    private static Color getConnectionColor(@NotNull IEditorPart editorPart) {
import org.eclipse.e4.ui.workbench.renderers.swt.CTabRendering;
    private static final FieldReflection<CTabRendering, Color> selectedTabHighlightColorField;
            CTabItem item = parent.getItem(part);
                hotUnselectedTabsColorBackgroundField.set(this, isHot ? selectedColor : color);

            // See org.eclipse.ui.internal.WorkbenchPartReference.WorkbenchPartReference
 * Unless required by applicable law or agreed to in writing, software

        if (item.getData(AbstractPartRenderer.OWNING_ME) instanceof MPart part) {
    protected void draw(int part, int state, Rectangle bounds, GC gc) {
        T_FIELD get(@NotNull T_CLASS object) {
                var oldCloseImageState = closeImageStateField.get(item);

            }

 *
    private static final FieldReflection<CTabItem, Integer> closeImageStateField;

    public DBeaverCTabFolderRenderer(@NotNull CTabFolder parent) {

                var oldTabOutlineColor = tabOutlineColorField.get(this);
        super(parent);
 * Copyright (C) 2010-2025 DBeaver Corp and others
                log.error("Cannot get value of field '" + field.getName() + "' from object " + object, e);
        DBPDataSourceContainer container = EditorUtils.getInputDataSource(editorInput, false);
        }
                return getConnectionColor(part);
            try {
    protected Point computeSize(int part, int state, GC gc, int wHint, int hHint) {
                } catch (Exception e) {

            Color color = getConnectionColor(item);
        }
        tabOutlineColorField = FieldReflection.of(CTabRendering.class, "tabOutlineColor");

                log.error("Cannot get field '" + fieldName + "' from class " + declaringClass.getName(), e);
                if (editor != null) {
        return null;
            resetCurves();
import org.eclipse.swt.graphics.GC;
                selectedTabHighlightColorField.set(this, highlightColor);
    private static Color getConnectionColor(@NotNull MPart part) {

            } catch (ReflectiveOperationException e) {
            }
            try {
        closeImageStateField = FieldReflection.of(CTabItem.class, "closeImageState");
        }
import org.eclipse.ui.IEditorReference;
    static {
            // The issue can be fixed by resetting these fields:
            isInColor = false;
                return null;
                boolean isHot = (state & SWT.HOT) != 0;
    }

                // Replaces unselected and selected tab colors
    private record FieldReflection<T_CLASS, T_FIELD>(@Nullable Field field) {
/*

    }
        hotUnselectedTabsColorBackgroundField = FieldReflection.of(CTabRendering.class, "hotUnselectedTabsColorBackground");
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

                    // it's likely to happen again. To avoid such scenarios, we set this key so it will
                closeRectField.set(item, oldCloseRect);
                    tabOutlineColorField.set(this, isHot ? selectedColor : color);
                    ? oldSelectedTabFillColors[0]
        for (Control control = item.getParent(); control != null; control = control.getParent()) {
                // Restore whatever we have changed back to original values

        }
 *
            DBPDataSourceContainer container = provider.getDataSourceContainer();
        }
import org.eclipse.swt.custom.CTabFolder;
    @Nullable
        selectedTabHighlightColorField = FieldReflection.of(CTabRendering.class, "selectedTabHighlightColor");

}
import org.eclipse.swt.graphics.Rectangle;
                tabOutlineColorField.set(this, oldTabOutlineColor);
                return UIUtils.getConnectionColor(container.getConnectionConfiguration());
                    part.getTransientData().put(PART_SKIP_KEY, Boolean.TRUE);
 * Licensed under the Apache License, Version 2.0 (the "License");

                }

            }
import java.lang.reflect.Field;
 * DBeaver - Universal Database Manager
    @Nullable
import org.eclipse.ui.IEditorInput;
    private static Color getConnectionColor(@NotNull CTabItem item) {
                return null;
            if (control.getData(AbstractPartRenderer.OWNING_ME) instanceof MPart part) {
            curveWidth.set(this, 0);
        if (part >= 0 && part < parent.getItemCount()) {
                field = declaringClass.getDeclaredField(fieldName);
            }
    }
            return null;
        }
                hotUnselectedTabsColorBackgroundField.set(this, oldHotUnselectedTabsColorBackground);

        selectedTabFillColorsField = FieldReflection.of(CTabRendering.class, "selectedTabFillColors");
        }
import org.jkiss.dbeaver.ui.UIUtils;

        }
import org.eclipse.e4.ui.internal.workbench.swt.AbstractPartRenderer;
 * limitations under the License.
            // Freeze happens because we may trigger master password dialog in ref.getEditorInput()
    }
 * distributed under the License is distributed on an "AS IS" BASIS,
    private static final FieldReflection<CTabFolderRenderer, Integer> curveWidth;
                    // cause all future calls for this part to return early.
    private static final FieldReflection<CTabRendering, Color> hotUnselectedTabsColorBackgroundField;
            resetCurves();
    private static final String PART_SKIP_KEY = DBeaverCTabFolderRenderer.class.getName() + ".skipPart";
        }
            return null;
                    closeRectField.set(item, EMPTY_CLOSE_RECT);

                Color highlightColor = isDarkTheme ? UIStyles.lighten(color, 0.2f) : UIStyles.darken(color, 0.2f);

            if (field == null) {
    private static volatile boolean isInColor;
                return (T_FIELD) field.get(object);
