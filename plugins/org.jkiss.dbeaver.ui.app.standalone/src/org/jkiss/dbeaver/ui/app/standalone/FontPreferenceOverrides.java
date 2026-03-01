                        if (bindings == null) {
                }
                }
            return page;
                    }
                if ((catId == null && categoryId == null)

        }
                defs = registry.getFonts();
            return fontsPage.getTitle();
import org.eclipse.ui.themes.ITheme;
 * you may not use this file except in compliance with the License.
        }
                defs = registry.getColors();
import org.eclipse.swt.graphics.Point;
            return fontsPage.okToLeave();
                return !isIdToHide(elc.getId());
        @Override

                    return true;
        @Override

                String defaultId = ((FontDefinition) element).getDefaultsTo();
        }

        
        }
                FontData[] data = fonts.getFontData(fontPropertyId);

        }
        }
            if (element instanceof ThemeElementCategory elc) {
        @Override
            themeManager.addPropertyChangeListener(themeChangeListener);
        }
            if (page == null) {
            IPreferencePage originalPage = originalNode.getPage();
                    categoryMap.put(categoryId, defintions);
/*
        public void dispose() {
        }
        @Override
        }
        @Override
                        continue;
            super(originalNode.getId());
package org.jkiss.dbeaver.ui.app.standalone;
        private final Set<String> prefIdsToHide;
                page.dispose();
        @Override
        @Override
        }
        }
        @Override
                ) {
        private final IPropertyChangeListener themeChangeListener;
        });

        }
        public void setVisible(boolean visible) {
            }

import java.util.*;
        PreferenceManager pm = PlatformUI.getWorkbench().getPreferenceManager();
                    }
    public static void hideFontPrefs(@NotNull Set<String> prefIdsToHide) {
            String id = def.getId();
        @Override 
            Composite mainColumn = (Composite)advancedCompositeSash.getChildren()[0];
            this.originalNode = originalNode;
                    list.add(fontDefinition);

            ColorDefinition[] colorDefinitions = themeRegistry.getColorsFor(currentTheme.getId());
        private ITheme currentTheme;
 *
            return null;
            return originalNode.getLabelImage();
                }
 * See the License for the specific language governing permissions and
        @Override
        public Object[] getElements(Object inputElement) {
            return id != null && prefIdsToHide.contains(id);
                originalNode.setPage(null);
}
            this.prefIdsToHide = prefIdsToHide;
                if (colorDef.getId().equals(defaultsTo)
            fontsPage.setTitle(title);
                    list.add(elementDefinition);
                    page.setImageDescriptor(DBeaverIcons.getImageDescriptor(new DBIconBinary(null, originalNode.getLabelImage())));
            if ((string == null && string2 == null))
            return false;
        public void setImageDescriptor(ImageDescriptor image) {
            Composite advancedCompositeSash = (Composite)prefsPageContent.getChildren()[0];
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
        @Override
        @Override
            return list.toArray(new Object[0]);
                        ((ICategorizedThemeElementDefinition) def).getCategoryId(),
    }
                    Set<?> bindings = themeRegistry.getPresentationsBindingsFor(category);
            } else {
                if (event.getProperty().equals(IThemeManager.CHANGE_CURRENT_THEME)) {
            // see ColorsAndFontsPreferencePage.createContents(..)
            }
                }
            if (page != null) {
                return registry.findCategory(categoryId);
                if (defintions == null) {
 * Licensed under the Apache License, Version 2.0 (the "License");
                    && catIdEquals(
            return originalNode.getLabelText();
            if (def instanceof ColorDefinition) {
        }
                        }
                    list.add(colorDefinition);
                    fonts.put(fontId, data);

                for (ThemeElementCategory category : registry.getCategories()) {
                page.setTitle(getLabelText());
        }
        }
        @Override
        public void setContainer(IPreferencePageContainer preferencePageContainer) {
                if (category.getParentId() == null && !isIdToHide(category.getId())) {
            return fontsPage.getControl();
 * limitations under the License.
        @Override
                    if (categoryId.equals(category.getParentId()) && !isIdToHide(category.getId())) {
    
            }
            this.page = page;
                    && catIdEquals(colorDef.getCategoryId(), definition.getCategoryId())
        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
            
            originalNode.disposeResources();
            for (ColorDefinition colorDef : registry.getColors()) {
                    continue;
            
        String viewsCatId = wbPrefPageId  + "/org.eclipse.ui.preferencePages.Views";
                    return true;
 * DBeaver - Universal Database Manager
        }
                for (String fontId: fontIdsToOverride) {
        }
        private final IThemeRegistry themeRegistry = WorkbenchPlugin.getDefault().getThemeRegistry();
            return fontsPage.computeSize();
                    return true;

import org.eclipse.ui.internal.WorkbenchPlugin;
            for (ThemeElementCategory category : ((IThemeRegistry) inputElement).getCategories()) {
        public boolean okToLeave() {
            return fontsPage.getImage();
                }
                String defaultId = ((IHierarchalThemeElementDefinition) element).getDefaultsTo();
            FilteredTree tree = (FilteredTree)mainColumn.getChildren()[1];
import org.eclipse.jface.dialogs.IMessageProvider;
        String fontsPrefPageId = wbPrefPageId + "/org.eclipse.ui.preferencePages.Views/org.eclipse.ui.preferencePages.ColorsAndFonts";
                    }
                }
            catNode.add(new FontPreferenceNodePageOverride((PreferenceNode)rawFontsNode, prefIdsToHide));
                }
        @Override
                        ((ICategorizedThemeElementDefinition) def).getCategoryId(),
        private final PreferenceNode originalNode;
        
                    && catIdEquals(fontDef.getCategoryId(), definition.getCategoryId())
                    FontDefinition defaultElement = registry.findFont(defaultId);
            }
                    if (parentIsInSameCategory(defaultElement))
import org.eclipse.jface.resource.FontRegistry;
        public boolean performCancel() {

        
        public void createControl(Composite parent) {

 *

            IHierarchalThemeElementDefinition[] defs;
        private boolean parentIsInSameCategory(ColorDefinition definition) {
            }
            }

            return fontsPage.isValid();
                        return defaultElement;
                if (!colorDefinition.isEditable() || isIdToHide(colorDefinition.getId())) {
        @Override
import org.eclipse.swt.widgets.Control;
            }
                }
                return false;
                return defintions;
                        ((ICategorizedThemeElementDefinition) elementDefinition).getCategoryId())) {
                return new Object[0];
            fontsPage.setDescription(description);
        }
    // Original implementation at org.eclipse.ui.internal.themes.ColorsAndFontsPreferencePage.ThemeContentProvider
                    continue;
        }
        @Override
        public FilteredThemeContentProvider(Set<String> prefIdsToHide) {

        
        public String getErrorMessage() {
            }
            return fontsPage.getErrorMessage();
        @Override

            for (IHierarchalThemeElementDefinition elementDefinition : defs) {
            String defaultsTo = definition.getDefaultsTo();
            IHierarchalThemeElementDefinition def = (IHierarchalThemeElementDefinition) parentElement;
            }
            return false;

            if (isIdToHide(id)) {
import org.jkiss.code.NotNull;
                }

        @Override
                            list.add(category);
            return false;
 *
            if (def instanceof ColorDefinition) {
            }

                }
            for (FontDefinition fontDefinition : fontDefinitions) {
            }
import org.eclipse.swt.graphics.FontData;
        public boolean hasChildren(Object element) {            

            IHierarchalThemeElementDefinition def = (IHierarchalThemeElementDefinition) element;
        
            fontsPage.setImageDescriptor(image);
            categoryMap.clear();
import org.eclipse.ui.themes.IThemeManager;
            Control[] prefsPageParts = parent.getChildren(); // page content container and defaults&apply buttons container 
        public String getTitle() {
                        }
        private boolean catIdEquals(String string, String string2) {

            for (ColorDefinition colorDefinition : colorDefinitions) {
            return fontsPage.getMessage();
        public boolean performOk() {
            this.prefIdsToHide = prefIdsToHide;
            if (string == null || string2 == null)
            tree.getViewer().setContentProvider(new FilteredThemeContentProvider(prefIdsToHide));
                if (defaultId != null) {
            catNode.remove(rawFontsNode);
            return fontsPage.getDescription();

        }
        private final Set<String> prefIdsToHide;
import org.eclipse.jface.viewers.ITreeContentProvider;
            if (categoryId != null) {
                defs = registry.getFonts();
            themeManager = PlatformUI.getWorkbench().getThemeManager();
            ArrayList<IThemeElementDefinition> list = new ArrayList<>();
                if (fontDef.getId().equals(defaultsTo)
            String id = def.getId();
        if (rawFontsNode instanceof PreferenceNode) {
        }
            IHierarchalThemeElementDefinition[] defs;

        public void setTitle(String title) {
            if (element instanceof FontDefinition) {

                }

                ) {
                return true;
        public Point computeSize() {
            }
        String wbPrefPageId = PrefPageConstants.WORKBENCH_PREF_PAGE_ID ;
                String categoryId = ((FontDefinition) element).getCategoryId();
        @Override
            fontsPage.createControl(parent);
                            list.add(category);
        public IPreferencePage getPage() {
import org.eclipse.swt.graphics.Image;

                String categoryId = ((ColorDefinition) element).getCategoryId();
        }
            Composite prefsPageContent = (Composite)prefsPageParts[Math.max(prefsPageParts.length - 1, 0)];
        public Image getLabelImage() {
                    currentTheme = themeManager.getCurrentTheme();
            }
            list.addAll(Arrays.asList(uncatChildren));

                page = new MyFontsPrefPage((PreferencePage)originalPage, prefIdsToHide);
                }
import org.eclipse.jface.util.IPropertyChangeListener;

            FontDefinition[] fontDefinitions = themeRegistry.getFontsFor(currentTheme.getId());
    private static class FilteredThemeContentProvider implements ITreeContentProvider {
    }
                    }
                        continue;
        public void setSize(Point size) {
            themeChangeListener = event -> {
        public void setDescription(String description) {

        }
            ArrayList<Object> list = new ArrayList<>();
        }
            }
            fontsPage.performHelp();
        @Override
        @Override
                        ((ICategorizedThemeElementDefinition) elementDefinition).getCategoryId()
    public static void overrideFontPrefValues(Map<String, List<String>> fontOverrides) {
            
        public FontPreferenceNodePageOverride(PreferenceNode originalNode, Set<String> prefIdsToHide) {
    private static class MyFontsPrefPage implements IPreferencePage, IMessageProvider {
        @Override
        public String getLabelText() {
        }
import org.eclipse.jface.resource.ImageDescriptor;
            return fontsPage.performCancel();
        @Override
            themeManager.removePropertyChangeListener(themeChangeListener);
        }

        @Override
            fontsPage.setVisible(visible);
                    ColorDefinition defaultElement = registry.findColor(defaultId);
                    if (parentIsInSameCategory(defaultElement))
                        return defaultElement;
        @Override
        @Override
        @Override
            return fontsPage.getMessageType();
import org.eclipse.swt.widgets.Composite;
    }
            return string.equals(string2);
        
        }
                    defintions = getCategoryChildren(categoryId);                    
        private final PreferencePage fontsPage;
        private IPreferencePage page = null;
        @Override


        }
            


        WorkbenchThemeManager.getInstance().addPropertyChangeListener(event -> {
                }

            categoryMap.clear();
            currentTheme = themeManager.getCurrentTheme();
        
            if (element instanceof ColorDefinition) {
            String defaultsTo = definition.getDefaultsTo();
            return list.toArray();
            for (IHierarchalThemeElementDefinition elementDefinition : defs) {
        }
        }
        public MyFontsPrefPage(PreferencePage fontsPage, Set<String> prefIdsToHide) {
                return false;
 * Copyright (C) 2010-2026 DBeaver Corp and others

        @Override
            Object[] uncatChildren = getCategoryChildren(null);
            }
        }
import org.eclipse.ui.PlatformUI;
            if (originalPage instanceof PreferencePage) {
                FontRegistry fonts = UIUtils.getCurrentTheme().getFontRegistry();
            } else {
                        if (children != null && children.length > 0) {
                page = originalPage;

 * You may obtain a copy of the License at
        }
            if (parentElement instanceof ThemeElementCategory) {
        
                if (!fontDefinition.isEditable() || isIdToHide(fontDefinition.getId())) {
        }
        IPreferenceNode rawFontsNode = pm.find(fontsPrefPageId);
 * Unless required by applicable law or agreed to in writing, software
            }
        private boolean parentIsInSameCategory(FontDefinition definition) {
                Object[] defintions = categoryMap.get(categoryId);
            ArrayList<IHierarchalThemeElementDefinition> list = new ArrayList<>();
        public Control getControl() {
            this.fontsPage = fontsPage;
        public String getMessage() {

                ) {
        public void dispose() {
        
        @Override

                        Set<?> bindings = themeRegistry.getPresentationsBindingsFor(category);
        }

                        || (catId != null && categoryId != null && categoryId.equals(catId))) {

        public Image getImage() {
                return registry;
        IPreferenceNode catNode = pm.find(viewsCatId);

        }
            String fontPropertyId = event.getProperty();
public class FontPreferenceOverrides {
import org.jkiss.dbeaver.ui.DBeaverIcons;
                String catId = colorDefinition.getCategoryId();
        public Object getParent(Object element) {            
            if (fontIdsToOverride != null) {
            fontsPage.dispose();
                defs = registry.getColors();
                page = null;
                        || (catId != null && categoryId != null && categoryId.equals(catId))) {
        public void disposeResources() {
                String catId = fontDefinition.getCategoryId();
                    if (colorDefinition.getDefaultsTo() != null && parentIsInSameCategory(colorDefinition)) {
        private IThemeRegistry registry;
                return registry.findCategory(categoryId);
        

        public String getDescription() {
            originalNode.createPage();
        public void createPage() {

        }
                String categoryId = ((ThemeElementCategory) parentElement).getId();
import org.eclipse.ui.internal.themes.*;
            return fontsPage.performOk();
            this.prefIdsToHide = prefIdsToHide;
                if (id.equals(elementDefinition.getDefaultsTo()) && catIdEquals(
                }
            }
import org.jkiss.dbeaver.ui.UIUtils;
            for (FontDefinition fontDef : registry.getFonts()) {
        private final Map<String, Object[]> categoryMap = new HashMap<>(7);
 * distributed under the License is distributed on an "AS IS" BASIS,
            }
import org.eclipse.ui.dialogs.FilteredTree;
                if (defaultId != null) {

import org.jkiss.dbeaver.ui.DBIconBinary;
                if (id.equals(elementDefinition.getDefaultsTo())
            return list.toArray(new Object[0]);
        }
        public void setPage(IPreferencePage page) {
                    if (bindings == null) {
                if ((catId == null && categoryId == null)
        @Override
        }
 */
        private Object[] getCategoryChildren(String categoryId) {
        public Object[] getChildren(Object parentElement) {            
                    if (fontDefinition.getDefaultsTo() != null && parentIsInSameCategory(fontDefinition)) {
            List<String> fontIdsToOverride = fontOverrides.get(fontPropertyId);
        private final Set<String> prefIdsToHide;
            }

            super.disposeResources();
                }

        }   
            } else {
        
        }

                        Object[] children = getChildren(category);
import org.eclipse.jface.viewers.Viewer;

            }
        private boolean isIdToHide(String id) {

                if (getLabelImage() != null) {
        public boolean isValid() {
            if (element instanceof ThemeElementCategory)
            
    }
            if (isIdToHide(categoryId)) {
        @Override
            };
            fontsPage.setSize(size);
            registry = (IThemeRegistry) newInput;
        public void performHelp() {
import org.eclipse.jface.preference.*;
                }
    private static class FontPreferenceNodePageOverride extends PreferenceNode {
            fontsPage.setContainer(preferencePageContainer);
        public int getMessageType() {
        }
import org.jkiss.dbeaver.ui.preferences.PrefPageConstants;

 *     http://www.apache.org/licenses/LICENSE-2.0
        private final IThemeManager themeManager;
                    )
        }
