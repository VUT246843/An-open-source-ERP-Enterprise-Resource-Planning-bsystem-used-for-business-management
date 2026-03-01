import org.jkiss.dbeaver.ui.editors.binary.HexEditControl;
            gridData.horizontalSpan = 3;


    private void updateAndRefreshSample()
    int getSize()
    private List listSize = null;
        this.defWidthValue = defWidthValue;
        fontsListCurrent.remove(0);
            fontsNonScalable = fontsScalable = fontsListCurrent = null;

import org.eclipse.swt.graphics.Font;


            gridData8.horizontalSpan = 3;
import java.util.*;
        return size;
                }
                public void widgetSelected(SelectionEvent e)
        refreshSample();
    private void updateSizeItemsAndGuessSelected()
                return TEXT_REGULAR;
        }
                    textSize.setText(listSize.getSelection()[0]);
     * @param aFontData the font to be shown.
            sampleFontData.getStyle());
     * Set preferences to show a font. Use null to show default font.
            case SWT.BOLD:
 * DBeaver - Universal Database Manager
    private Combo cmbByteWidth = null;

    private void refreshWidgets()
                public void widgetSelected(SelectionEvent e)
            textName = new Text(fontGroup, SWT.SINGLE | SWT.BORDER);
    private static final String SAMPLE_TEXT = BinaryEditorMessages.editor_binary_hex_sample_text;
    private static String fontStyleToString(int style)

                @Override
    private void populateFixedCharWidthFontsAsync()
        if (fontsNonScalable.size() == 0 && fontsScalable.size() == 0) {
            GridData gridData52 = new GridData();
    {
            sampleFontData.getName(),
            Composite fontGroup = UIUtils.createTitledComposite(composite, BinaryEditorMessages.editor_binary_hex_froup_font_selection, 3, GridData.FILL_HORIZONTAL);
                        fontsSorted.put(fontData.getName(), heights);
            cmbByteWidth.select(index);
    /**

import org.jkiss.code.NotNull;
     * Creates the part containing all preferences-editing widgets, that is, ok and cancel
            gridData8.horizontalAlignment = GridData.FILL;
    {
            sampleText.setLayoutData(gridData8);
        if (composite.isDisposed() || textName == null)
/**
        int index = Arrays.asList(arrDefValuetoIndex).indexOf(defWidthValue);
        showSelected(listSize, Integer.toString(sampleFontData.getHeight()));
                return TEXT_BOLD_ITALIC;
    private boolean isMonospacedFont(@NotNull FontData fontData, boolean isScalable) {
            gridData5.horizontalAlignment = GridData.FILL;
 *
            textSize = new Text(fontGroup, SWT.BORDER);
        sampleFont = new Font(Display.getCurrent(), sampleFontData);
public class HexPreferencesManager {
        } else {
    }
            if (fontsListCurrent.size() == 0) {
            GridData gridData = new GridData();
        fontsGc = new GC(parent);
import org.eclipse.swt.widgets.*;

    String getDefWidth() {
    private java.util.List<FontData> fontsListCurrent = null;


        textStyle.setText(fontStyleToString(sampleFontData.getStyle()));
    private static final String TEXT_BOLD_ITALIC = BinaryEditorMessages.editor_binary_hex_font_style_bold_italic;
            gridData6.widthHint = averageCharWidth * 6;
                        heights = new TreeSet<>();

            fontsRejected = null;
                {

                if (isScalable) {
        }
                    Set<Integer> heights = fontsSorted.get(fontData.getName());

    }
                    updateAndRefreshSample();

    }
     */
import org.jkiss.dbeaver.ui.editors.binary.internal.BinaryEditorMessages;
            textName.setText(sampleFontData.getName());
            int index = Arrays.asList(arrDefValuetoIndex).indexOf(defWidthValue);
            style = SWT.ITALIC;
                fontsListCurrent = fontsScalable;
    private static final Set<Integer> scalableSizes = new TreeSet<>(
            sampleFontData.getHeight(),
                @Override
        fontsScalable = new ArrayList<>(Arrays.asList(Display.getCurrent().getFontList(null, true)));

            listSize = new List(fontGroup, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER);
            textName.setText(BinaryEditorMessages.editor_binary_hex_default_font);
    private java.util.Set<String> fontsRejected = null;
        if (size == 1 || size == 2) size = 3;
            fontsNonScalable = null;

        sampleFontData = new FontData(textName.getText(), getSize(), fontStyleToInt(textStyle.getText()));
            gridData7.widthHint = gridData6.widthHint;
        // very small sizes would compromise responsiveness in large windows, and they are too small
        }
    private static final String TEXT_ITALIC = BinaryEditorMessages.editor_binary_hex_font_style_italic;

            }
        FontData aData = fontsListCurrent.get(0);
    }
    private FontData getNextFontData()
                {
        }
    {
            return;
            }
        textSize.setText(Integer.toString(sampleFontData.getHeight()));

    private FontData sampleFontData = null;



            gc.dispose();
                size = Integer.parseInt(textSize.getText());
     * @param aParent composite where preferences will be drawn
package org.jkiss.dbeaver.ui.editors.binary.pref;
            listStyle.setItems(new String[] { TEXT_REGULAR, TEXT_BOLD, TEXT_ITALIC, TEXT_BOLD_ITALIC });
        return aData;
        String[] items = new String[sizes.size()];
    {
import org.eclipse.swt.widgets.List;
        showSelected(listSize, items[position]);
            textName.setLayoutData(gridData4);
            gridData7.heightHint = gridData52.heightHint;
        int lastSize = getSize();
        int height = 10;
                    heights.add(fontData.getHeight());
            fontsScalable = null;
        {
            if (width != fontsGc.getAdvanceWidth(ch)) {
        fontsListCurrent = fontsNonScalable;
    private static void showSelected(List aList, String item)
    }
            listStyle = new List(fontGroup, SWT.SINGLE | SWT.BORDER);
        switch (style) {
    private GC fontsGc = null;
    {
                return TEXT_BOLD;
            listFont.setItems(fontsSorted.keySet().toArray(new String[fontsSorted.keySet().size()]));

import org.eclipse.swt.graphics.FontData;
        listSize.setItems(items);
                // do nothing
            return;
        } else {
        cmbByteWidth.select(index);
            aList.setSelection(selected);
                    }
                {

    {

                    listFont.setItems(fontsSorted.keySet().toArray(new String[fontsSorted.keySet().size()]));
        fontsRejected = new HashSet<>();
        int position = 0;
    private Text textName = null;
            GridData gridData6 = new GridData();
            gridData6.horizontalAlignment = GridData.FILL;
                refreshWidgets();
        }
                if (!listFont.isDisposed())
            // Discard vertical versions of fonts.

 * @author Jordi
import org.eclipse.swt.events.SelectionEvent;
            textStyle.setLayoutData(gridData5);
        font.dispose();
        defWidthValue = defWidth;      
        fontsNonScalable = new ArrayList<>(Arrays.asList(Display.getCurrent().getFontList(null, false)));
            aList.setTopIndex(Math.max(0, selected - itemsDisplayed + 1));
            UIUtils.asyncExec(this::populateFixedCharWidthFontsAsync);
/*
    
            fontsGc = null;
    public FontData getFontData()

            case SWT.ITALIC:
        }
        }
    private void populateFixedCharWidthFonts()
        textSize.setText(items[position]);
                    if (heights == null) {
        if (fontsListCurrent.size() == 0) {
            Composite cmpByteSettings = UIUtils.createTitledComposite(
        if (aFontData == null)
        for (Iterator<Integer> j = sizes.iterator(); i < items.length; ++i) items[i] = j.next().toString();
    private static String[] arrDefValuetoIndex = new String[] { "4", "8", "16" };
            default:
 * Licensed under the Apache License, Version 2.0 (the "License");
            sampleText.addDisposeListener(e -> {
        createComposite();
                    textStyle.setText(listStyle.getSelection()[0]);
            style = SWT.BOLD;
}
        int i = 0;
 */
        boolean isMonospaced = true;
        refreshSample();
                public void widgetSelected(SelectionEvent e)
            });
        return composite;
    {


        }
            style = SWT.BOLD | SWT.ITALIC;
    private List listStyle = null;
     */
            cmbByteWidth = new Combo(cmpByteSettings, SWT.BORDER);
            aFontData = HexEditControl.DEFAULT_FONT_DATA;
    private static final int itemsDisplayed = 9;  // Number of font names displayed in list
            });
        if (fontsNonScalable.size() == 0 && fontsScalable.size() == 0) {
    private static int fontStyleToInt(String styleString)
        sampleFontData = aFontData;
            try {
        sampleFontData = aFontData;
        for (int i = 1; i < items.length; ++i) {
        if (!fontsRejected.contains(fontData.getName())) {

            gridData8.widthHint = gridData52.widthHint + gridData21.widthHint + gridData7.widthHint + 10;
                    textName.setText(listFont.getSelection()[0]);
     */
    }
            if (!parent.isDisposed()) fontsGc.dispose();
                composite,
            if (isMonospacedFont(fontData, isScalable)) {
            int averageCharWidth = gc.getFontMetrics().getAverageCharWidth();
    private void updateSizeItems()
                BinaryEditorMessages.editor_cmp_byte_settings_label,
                    updateSizeItemsAndGuessSelected();
    Composite createPreferencesPart(Composite aParent)
    {


    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * Get the preferred font data
                    updateAndRefreshSample();
                if (sampleFont != null && !sampleFont.isDisposed()) {
        }
            sampleText.setEditable(false);
            textStyle.setEnabled(false);
                @Override
        } else {
            return;
        if (fontsSorted == null || !fontsSorted.containsKey(sampleFontData.getName())) {
            case SWT.BOLD | SWT.ITALIC:
            aList.setTopIndex(0);
            fontsListCurrent.remove(0);
            GC gc = new GC(fontGroup);
 *
import org.eclipse.swt.SWT;
    /**

        }
    
        while (fontsRejected.contains(aData.getName()) && fontsScalable.size() > 0) {
     * @return a copy of the preferred font data
        return cmbByteWidth.getText();


            Label label = UIUtils.createControlLabel(fontGroup, BinaryEditorMessages.editor_binary_hex_label_available_fix_width_fonts);
                } else {
    {
 * You may obtain a copy of the License at
            }  // was not a number, keep it 0
            aList.deselectAll();
    }
        }
            });
        return new FontData(
        // to see anyway
 * Unless required by applicable law or agreed to in writing, software
                GridData.FILL_HORIZONTAL
        parent = aParent;
            GridData gridData21 = new GridData();
    {
    private Text sampleText = null;
            sampleText.setText(SAMPLE_TEXT);

    /**
import org.eclipse.swt.layout.GridData;
    }
            listStyle.setLayoutData(gridData21);

 *
            gridData52.heightHint = itemsDisplayed * listFont.getItemHeight();

            catch (NumberFormatException e) {
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.eclipse.swt.events.SelectionAdapter;
            listSize.removeAll();
    private java.util.List<FontData> fontsScalable = null;

    private Text textSize = null;
                position = i;
    private static final String TEXT_REGULAR = BinaryEditorMessages.editor_binary_hex_font_style_regular;
    {
            cmbByteWidth.setItems(arrDefValuetoIndex);
     *
        return isMonospaced;
        showSelected(listFont, sampleFontData.getName());
                }
    {

        String[] items = listSize.getItems();
    }
                    fontsSorted.put(fontData.getName(), scalableSizes);
        {
            refreshWidgets();
        }
                }
            listSize.setLayoutData(gridData7);

        Arrays.asList(6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 18, 22, 32, 72));


    {
        if (fontsSorted.size() < 1) {
import org.eclipse.swt.layout.GridLayout;


     */
 * Copyright (C) 2010-2026 DBeaver Corp and others
            }
            aData = fontsListCurrent.get(0);
        Font font = new Font(Display.getCurrent(), fontData.getName(), height, SWT.NORMAL);
    }
        int size = 0;
    }
    }
        if (sizes == null) {
        if (sampleFont != null && !sampleFont.isDisposed()) {
    {
        refreshWidgets();
        char ch = SWT.SPACE;
    /**
 * Manager of all preferences-editing widgets, with an optional standalone dialog.
            });
            sampleFont.dispose();
            populateFixedCharWidthFonts();

            listFont = new List(fontGroup, SWT.SINGLE | SWT.V_SCROLL | SWT.BORDER);

        fontsSorted = new TreeMap<>();
        int style = SWT.NORMAL;
    private Font sampleFont = null;
    private java.util.List<FontData> fontsNonScalable = null;
        UIUtils.asyncExec(this::populateFixedCharWidthFontsAsync);
        } else {

        }
 * See the License for the specific language governing permissions and
        composite.setLayout(new GridLayout(1, true));
            boolean isScalable = fontsListCurrent == fontsScalable;
            UIUtils.createControlLabel(cmpByteSettings, BinaryEditorMessages.editor_byte_settings_width_label);
        if (TEXT_BOLD.equals(styleString))
            fontsListCurrent = fontsScalable;
        updateSizeItems();
        }
        return style;
     * buttons are left out so we can call this method from both standalone and plugin.
    private Text textStyle = null;

        if (!isScalable) {
    }
 *
    }
        fontsGc.setFont(font);
        sampleText.setFont(sampleFont);

        if (!"".equals(textSize.getText())) { //$NON-NLS-1$
    }
            if (lastSize >= Integer.parseInt(items[i]))
            }
     * Creates all internal widgets
                isMonospaced = false;
        else if (TEXT_ITALIC.equals(styleString))
    void resetDefWidthValue(String defWidthValue) {
        updateSizeItems();
            listStyle.addSelectionListener(new SelectionAdapter() {
    private java.util.Map<String, Set<Integer>> fontsSorted = null;
        if (RuntimeUtils.isWindows() && fontData.getName().startsWith("@")) {
            listSize.addSelectionListener(new SelectionAdapter() {
        int width = fontsGc.getAdvanceWidth(ch);
            UIUtils.createControlLabel(fontGroup, BinaryEditorMessages.editor_binary_hex_label_style);
            gridData8.heightHint = 50;
        }
    }
            label.setLayoutData(gridData);
import org.jkiss.dbeaver.ui.UIUtils;
    HexPreferencesManager(FontData aFontData, String defWidth) {

        // bugfix: HexText's raw array overflows when font is very small and window very big
        else if (TEXT_BOLD_ITALIC.equals(styleString))
    private List listFont = null;
                fontsRejected.add(fontData.getName());
            GridData gridData8 = new GridData();
            );
        int selected = aList.indexOf(item);
    {
            sampleText = new Text(fontGroup, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.READ_ONLY | SWT.BORDER);
    private String defWidthValue; 
    private void refreshSample()
    private Composite composite = null;
        }
        }
            gridData4.horizontalAlignment = GridData.FILL;
            UIUtils.createControlLabel(fontGroup, BinaryEditorMessages.editor_binary_hex_label_size);
            GridData gridData4 = new GridData();
            gridData52.widthHint = averageCharWidth * 40;
 * you may not use this file except in compliance with the License.
    }
     *
            gridData21.widthHint = averageCharWidth * TEXT_BOLD_ITALIC.length() * 2;
        FontData fontData = getNextFontData();

            height = fontData.getHeight();
    void setFontData(FontData aFontData)
                }

     *
    {
            UIUtils.createControlLabel(fontGroup, BinaryEditorMessages.editor_binary_hex_label_name);
                    updateAndRefreshSample();

import org.eclipse.swt.graphics.GC;
 * limitations under the License.
                    sampleFont.dispose();
            } else {
            textStyle = new Text(fontGroup, SWT.BORDER);
 */
            gridData21.verticalAlignment = GridData.FILL;
            listFont.addSelectionListener(new SelectionAdapter() {
                }
    private void createComposite()
import org.jkiss.dbeaver.utils.RuntimeUtils;


        composite = new Composite(parent, SWT.NONE);
        for (ch++; ch < SWT.DEL && isMonospaced; ch++) {

    private static final String TEXT_BOLD = BinaryEditorMessages.editor_binary_hex_font_style_bold;
                return TEXT_ITALIC;
                2,
            textSize.setLayoutData(gridData6);
            GridData gridData7 = new GridData();
        listStyle.select(listStyle.indexOf(fontStyleToString(sampleFontData.getStyle())));
        Set<Integer> sizes = fontsSorted.get(textName.getText());
        }
    }
            GridData gridData5 = new GridData();
        if (selected >= 0) {
    private Composite parent = null;
 * distributed under the License is distributed on an "AS IS" BASIS,

            listFont.setLayoutData(gridData52);
            return false;
    }

