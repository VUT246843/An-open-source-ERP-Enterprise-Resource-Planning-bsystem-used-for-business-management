        cancel.addSelectionListener(new SelectionAdapter() {
        // build first tab
        this.shell.setLayout(layout);
                        "Chart_Properties"));
        main.setLayout(new FillLayout());
        // build the third tab

                    "org.jfree.chart.editor.LocalizationBundle");
            }
import org.eclipse.swt.SWT;
    /**

 * Unless required by applicable law or agreed to in writing, software
            }
        item1.setControl(this.titleEditor);
import org.eclipse.swt.widgets.*;
 *
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FillLayout;

        });
        layout.marginLeft = layout.marginTop = layout.marginRight
 * DBeaver - Universal Database Manager
            = ResourceBundleWrapper.getBundle(
     * @param chart2edit  the chart to edit.
            public void widgetSelected(SelectionEvent e) {
        item3.setControl(this.otherEditor);
    /** The resourceBundle for the localization. */
        this.otherEditor.updateChartProperties(chart);

        Button ok = new Button(this.shell, SWT.PUSH | SWT.OK);
        this.plotEditor.updatePlotProperties(chart.getPlot());
        });
        ok.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));

    }
    /** A composite for displaying/editing the other properties of the chart. */
    public void updateChart(JFreeChart chart)
    public void open() {
import org.jfree.chart.util.ResourceBundleWrapper;
                SWTChartEditor.this.shell.dispose();
     * Creates a new editor.
public class SWTChartEditor implements ChartEditor {
 * See the License for the specific language governing permissions and
import org.eclipse.swt.layout.GridData;
            public void widgetSelected(SelectionEvent e) {
        this.titleEditor = new SWTTitleEditor(tab, SWT.NONE,

                "org.jfree.chart.LocalizationBundle").getString(
                this.chart.getTitle());
 * limitations under the License.
            if (!this.shell.getDisplay().readAndDispatch()) {

    /**

package org.jfree.chart.swt.editor;
        this.shell.setText(ResourceBundleWrapper.getBundle(
}
 *
        while (!this.shell.isDisposed()) {
        // build second tab
        // ok and cancel buttons
     *
    }
        Composite main = new Composite(this.shell, SWT.NONE);
                this.shell.getDisplay().sleep();
        cancel.setText(" Cancel ");
 *     http://www.apache.org/licenses/LICENSE-2.0
        ok.setText(" Ok ");

        this.shell.layout();
    private Shell shell;
    private JFreeChart chart;
     * @param display  the display.
 * Copyright (C) 2010-2025 DBeaver Corp and others
        GridLayout layout = new GridLayout(2, true);

    private SWTPlotEditor plotEditor;
     * Updates the chart properties.

    private SWTOtherEditor otherEditor;
        item2.setControl(this.plotEditor);
        item3.setText(" " + localizationResources.getString("Other") + " ");

     */
    public SWTChartEditor(Display display, JFreeChart chart2edit) {

                updateChart(SWTChartEditor.this.chart);
     * Opens the editor.
     */
 */
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
import org.eclipse.swt.events.SelectionEvent;
        this.titleEditor.setTitleProperties(chart);

        this.shell = new Shell(display, SWT.DIALOG_TRIM);
import java.util.ResourceBundle;
    private SWTTitleEditor titleEditor;
     * @param chart  the chart.
import org.jfree.chart.JFreeChart;
        main.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
    protected static ResourceBundle localizationResources
    }
import org.jfree.chart.editor.ChartEditor;

import org.eclipse.swt.events.SelectionAdapter;
 * you may not use this file except in compliance with the License.
        item2.setText(" " + localizationResources.getString("Plot") + " ");
/**
 * distributed under the License is distributed on an "AS IS" BASIS,
     *
        item1.setText(" " + localizationResources.getString("Title") + " ");
        TabItem item2 = new TabItem(tab, SWT.NONE);
 * An editor for chart properties.
    /** The shell */
     */
        this.shell.open();
        this.shell.setSize(400, 500);
        }
        this.plotEditor = new SWTPlotEditor(tab, SWT.NONE,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/*
        TabFolder tab = new TabFolder(main, SWT.BORDER);


        this.otherEditor = new SWTOtherEditor(tab, SWT.NONE, this.chart);
    /** A composite for displaying/editing the properties of the plot. */
    /** The chart which the properties have to be edited */
    {
    /**
 * You may obtain a copy of the License at
                this.chart.getPlot());
        Button cancel = new Button(this.shell, SWT.PUSH);
        this.chart = chart2edit;
    /** A composite for displaying/editing the properties of the title. */
 */
        TabItem item1 = new TabItem(tab, SWT.NONE);
                SWTChartEditor.this.shell.dispose();
        TabItem item3 = new TabItem(tab, SWT.NONE);
        ok.addSelectionListener(new SelectionAdapter() {
                = layout.marginBottom = 5;
            }
        cancel.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
