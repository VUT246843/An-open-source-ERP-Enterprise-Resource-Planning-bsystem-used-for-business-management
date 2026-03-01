                    TimeSeries series = chartDataset.getSeries(i);
    public void updateDashboardView(@NotNull DashboardViewItem dashboardItem) {
        TimeSeriesCollection chartDataset = (TimeSeriesCollection) plot.getDataset();
            DashboardItemViewSettings dashboardConfig = dashboardItem.getItemConfiguration();
                plot.setDomainGridlinesVisible(dashboardConfig.isGridVisible());
        plot.setRangeGridlinePaint(gridColor);
        {
            };
            case week -> new Week(row.getTimestamp());
            if (dashboardConfig != null) {
    public static final int MAX_TIMESERIES_RANGE_LABELS = 25;
        plotRenderer.setDefaultItemLabelPaint(gridColor);

            domainAxis.setTickUnit(new DateTickUnit(unitType, Math.min(MAX_TIMESERIES_RANGE_LABELS, tickCount)));
    @Override
                    for (DashboardDatasetRow row : rows) {


            true,
                    break;
            domainAxis.setDateFormatOverride(new SimpleDateFormat("HH:mm:ss"));

            domainAxis.setLowerMargin(0);
            chartDataset.removeAllSeries();
            default -> new FixedMillisecond(row.getTimestamp().getTime());
        return chartComposite;

import org.jfree.chart.ui.RectangleInsets;
 * Unless required by applicable law or agreed to in writing, software
            if (viewConfig != null && !viewConfig.isRangeTicksVisible()) {
        };
        }
import org.jkiss.dbeaver.ui.AWTUtils;
 */
//        renderer.setSeriesOutlineStroke(0, new BasicStroke(0.5f));

    }
            plot.setDomainAxis(domainAxis);
            domainAxis.setTickLabelInsets(RectangleInsets.ZERO_INSETS);
        DashboardChartComposite chartComposite = getChartComposite(container);
        ChartPanel chartPanel = new ChartPanel( histogramChart );
                        }
    }
                plot.getRangeAxis().setVisible(dashboardConfig.isRangeTicksVisible());

import org.jfree.chart.renderer.xy.XYItemRenderer;
            int tickCount = container.getDashboardMaxItems();
                chartComposite.getChart().getLegend().setVisible(dashboardConfig.isLegendVisible());
import org.jkiss.dbeaver.ui.dashboard.control.DashboardViewItem;
 *
                plot.getRenderer().setSeriesStroke(chartDataset.getSeriesCount() - 1, plot.getRenderer().getDefaultStroke());
        if (plot != null) {
                default -> DateTickUnitType.SECOND;
import org.jkiss.dbeaver.model.dashboard.data.DashboardDataset;
            new float[] {1.0f, 1.0f}, 0.0f);
    }
        Stroke gridStroke = new BasicStroke(0.1f,
            null,

                    series.setMaximumItemCount(dashboardConfig.getMaxItems());
        plot.setBackgroundPaint(histogramChart.getBackgroundPaint());
                    break;
    @Override

import org.jfree.data.time.*;
 */
        //generateSampleSeries(container, dataset);
            return;
 *
            DashboardChartComposite chartComposite = getChartComposite(dashboardItem);
import org.jfree.chart.axis.*;
                        }
                        } else {
        long secondsPassed = lastUpdateTime == null ? 1 : (currentTime - lastUpdateTime.getTime()) / 1000;
                    for (DashboardDatasetRow row : rows) {
        TimeSeriesCollection dataset = new TimeSeriesCollection();
            DateTickUnitType unitType = switch (dashboard.getInterval()) {
import java.text.NumberFormat;
        {
        plot.getRenderer().setDefaultToolTipGenerator(new StandardXYToolTipGenerator(

                case month -> DateTickUnitType.MONTH;
                plot.setRangeGridlinesVisible(dashboardConfig.isGridVisible());
                domainAxis.setVisible(false);
                    Date startTime = null;
import java.util.List;
                            if (newValue instanceof Number && prevValue instanceof Number) {
        return switch (container.getItemDescriptor().getInterval()) {
            if (tickCount <= 1) {
        histogramChart.setBorderVisible(false);
 * DBeaver - Universal Database Manager
        XYItemRenderer plotRenderer = plot.getRenderer();
    @Override
        XYPlot plot = getDashboardPlot(dashboardItem);
                    }
/**
            rangeAxis.setTickLabelPaint(gridColor);
            NumberFormat.getNumberInstance()
                rangeAxis.setUpperBound(100);
import org.jkiss.dbeaver.ui.charts.BaseChartDrawingSupplier;
                            series.addOrUpdate(makeDataItem(container, row), (Number) value);
                }

        DashboardChartComposite chartComposite = createChartComposite(composite, container, viewContainer, preferredSize);
    private XYPlot getDashboardPlot(DashboardItemContainer container) {
                series = new TimeSeries(seriesName);
                series.setMaximumItemCount(container.getDashboardMaxItems());
            DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT),
                            startTime = row.getTimestamp();
        JFreeChart chart = chartComposite.getChart();
import org.jfree.chart.ChartPanel;
                                }
}
        JFreeChart histogramChart = ChartFactory.createXYLineChart(

    public DashboardChartComposite createDashboard(@NotNull Composite composite, @NotNull DashboardItemContainer container, @NotNull DashboardContainer viewContainer, @NotNull Point preferredSize) {
                    if (lastUpdateTime == null) {
import java.awt.*;
    @Override
        if (!rows.isEmpty()) {
                            }



import org.jkiss.dbeaver.model.dashboard.DBDashboardInterval;
import java.text.SimpleDateFormat;
import org.eclipse.swt.graphics.Point;
 *
            case hour -> new Hour(row.getTimestamp());
 * Copyright (C) 2010-2025 DBeaver Corp and others
            domainAxis.setTickLabelPaint(gridColor);
        }
                        if (value instanceof Number) {
                        if (lastRow != null) {
            case month -> new Month(row.getTimestamp());
import org.jkiss.code.Nullable;
            String seriesName = srcSeries[i];
            }
            }
            ValueAxis rangeAxis = plot.getRangeAxis();
import org.jkiss.dbeaver.ui.dashboard.control.DashboardChartComposite;
            if (series == null) {
                plot.getDomainAxis().setVisible(dashboardConfig.isDomainTicksVisible());
            false);

import org.jkiss.dbeaver.model.dashboard.DBDashboardFetchType;
            rangeAxis.setTickLabelInsets(RectangleInsets.ZERO_INSETS);
        for (int i = 0; i < srcSeries.length; i++) {
            secondsPassed = 1;
                tickCount = container.getDashboardMaxItems() / 5;

            domainAxis.setTickLabelFont(DEFAULT_TICK_LABEL_FONT);
import org.jkiss.dbeaver.ui.dashboard.DashboardUIUtils;
        DashboardItemViewSettings viewConfig = container.getItemConfiguration();
        if (plot != null) {
    }

        XYPlot plot = getDashboardPlot(container);
//        renderer.setSeriesOutlinePaint(0, Color.black);
import org.jkiss.dbeaver.ui.UIStyles;
        BasicStroke stroke = new BasicStroke(2.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 10.0f, null, 0.0f);
            domainAxis.setTickMarkPosition(DateTickMarkPosition.MIDDLE);
            PlotOrientation.VERTICAL,
 * Histogram dashboard renderer
                                if (dashboard.getValueType() != DBDashboardValueType.decimal) {
                                    deltaValue = Math.round(deltaValue);
        // Set background
            rangeAxis.setStandardTickUnits(DashboardUIUtils.getTickUnitsSource(dashboard.getValueType()));
        // Remove border
        if (chartComposite.isDisposed()) {


                        }
        histogramChart.setBackgroundPaint(AWTUtils.makeAWTColor(UIStyles.getDefaultTextBackground()));
                case minute -> DateTickUnitType.MINUTE;
import org.jkiss.dbeaver.model.dashboard.registry.DashboardItemConfiguration;
        DashboardItemConfiguration dashboard = container.getItemDescriptor();
        plot.setRangeGridlinesVisible(viewConfig != null && viewConfig.isGridVisible());
            }
        DashboardItemConfiguration dashboard = container.getItemDescriptor();
        }
                    }
            "Value",

        plot.setDomainGridlinePaint(gridColor);
 * Licensed under the Apache License, Version 2.0 (the "License");
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemViewSettings;
*/
        }
/*

import org.jkiss.dbeaver.ui.dashboard.model.DashboardContainer;
                            }
            switch (dashboard.getCalcType()) {
                                deltaValue /= secondsPassed;

                case day, week -> DateTickUnitType.DAY;
            if (tickCount > 40) {
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.

                            Object prevValue = lastRow.getValues()[i];
        }
        DashboardDatasetRow lastRow = (DashboardDatasetRow) chartComposite.getData("last_row");
        histogramChart.setPadding(new RectangleInsets(0, 0, 0, 0));
                                    deltaValue);
        //plot.setDomainGridlineStroke(gridStroke);


            StandardXYToolTipGenerator.DEFAULT_TOOL_TIP_FORMAT,
        dashboardItem.getParent().layout(true, true);
        //plot.setRenderer(renderer);
            rangeAxis.setTickLabelFont(DEFAULT_TICK_LABEL_FONT);
                chartDataset.addSeries(series);
        plot.setOutlinePaint(null);
import org.jfree.chart.ChartFactory;
        JFreeChart chart = chartComposite.getChart();
        ));
import java.util.Date;
                        Object value = row.getValues()[i];
            case second -> new FixedMillisecond(row.getTimestamp().getTime());
            domainAxis.setUpperMargin(0);
        List<DashboardDatasetRow> rows = dataset.getRows();
                            Object newValue = row.getValues()[i];
            dataset,
            }
package org.jkiss.dbeaver.ui.dashboard.histogram;
                                double deltaValue = ((Number) newValue).doubleValue() - ((Number) prevValue).doubleValue();

    }
                case hour -> DateTickUnitType.HOUR;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardItemContainer;
            chartDataset.removeAllSeries();
            }
            domainAxis.setLabel(null);
import org.jkiss.code.NotNull;

            }


        histogramChart.setTextAntiAlias(true);
            case minute -> new Minute(row.getTimestamp());
 * You may obtain a copy of the License at
        long currentTime = System.currentTimeMillis();
import java.text.DateFormat;
            //rangeAxis.setLowerBound(.1);
            TimeSeriesCollection chartDataset = (TimeSeriesCollection) plot.getDataset();
                                    makeDataItem(container, row),
        // Remove background
import org.jkiss.dbeaver.model.dashboard.DBDashboardValueType;
        if (dashboard.getFetchType() == DBDashboardFetchType.stats) {
    public void updateDashboardData(@NotNull DashboardItemContainer container, @Nullable Date lastUpdateTime, @NotNull DashboardDataset dataset) {
                rangeAxis.setLowerBound(0);
                        if (startTime == null) {
                        return;
                    series.setMaximumItemAge(dashboardConfig.getMaxAge());
            false,
            "Time",

        String[] srcSeries = dataset.getColumnNames();
        Color gridColor = AWTUtils.makeAWTColor(UIStyles.getDefaultTextForeground());
        //XYItemRenderer renderer = new XYLine3DRenderer();
        }
    public void resetDashboardData(@NotNull DashboardItemContainer container, Date lastUpdateTime) {

            domainAxis.setAutoRange(true);
                tickCount = 10;
    private static final Font DEFAULT_TICK_LABEL_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 8);

        final XYPlot plot = histogramChart.getXYPlot( );
import org.eclipse.swt.widgets.Composite;
                                }
            rangeAxis.setLabel(null);
                    //System.out.println("LAST=" + lastUpdateTime + "; CUR=" + new Date());
            //rangeAxis.setLowerMargin(0.2);

 * you may not use this file except in compliance with the License.
            if (dashboard.getValueType() == DBDashboardValueType.percent) {
                for (int i = 0; i < chartDataset.getSeriesCount(); i++) {
                            if (dashboard.getInterval() == DBDashboardInterval.second || dashboard.getInterval() == DBDashboardInterval.millisecond) {
            if (viewConfig != null && !viewConfig.isDomainTicksVisible()) {
        return chart == null ? null : (XYPlot) chart.getPlot();
                                long diffSeconds = (row.getTimestamp().getTime() - startTime.getTime()) / 1000;
                series.setMaximumItemAge(container.getDashboardMaxAge());


        plot.setShadowGenerator(null);
                }

        DashboardChartComposite chartComposite = getChartComposite(container);
            }
 * limitations under the License.
                                    break;
        //plot.setRangeGridlineStroke(gridStroke);
                case year -> DateTickUnitType.YEAR;
            }
        plot.setDomainGridlinesVisible(viewConfig != null && viewConfig.isGridVisible());
                                    // Too big difference between start and end points. Stop here otherwise we'll flood chart with too many ticks
import org.jkiss.dbeaver.ui.dashboard.control.DashboardRendererDatabaseChart;
        createDefaultLegend(viewConfig, histogramChart);
                case delta: {
        plot.setDrawingSupplier(new BaseChartDrawingSupplier());
import org.jfree.chart.labels.StandardXYToolTipGenerator;
/*
            DateAxis domainAxis = new DateAxis("Time");
        }
                                series.addOrUpdate(

import org.jkiss.dbeaver.model.dashboard.data.DashboardDatasetRow;
        plot.getRenderer().setDefaultStroke(stroke);
                    int maxDP = 200;
                                if (diffSeconds > maxDP) {


            TimeSeries series = chartDataset.getSeries(seriesName);
import org.jfree.chart.JFreeChart;
        }
    }
            case year -> new Year(row.getTimestamp());
            BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 1.0f,
            chartComposite.setData("last_row", rows.get(rows.size() - 1));
import org.jfree.chart.plot.PlotOrientation;
 * See the License for the specific language governing permissions and

                }
        chartPanel.setPreferredSize( new java.awt.Dimension( preferredSize.x, preferredSize.y ) );
        chartComposite.setChart(histogramChart);
 * distributed under the License is distributed on an "AS IS" BASIS,

                TimeSeriesCollection chartDataset = (TimeSeriesCollection) plot.getDataset();
 *     http://www.apache.org/licenses/LICENSE-2.0

        if (secondsPassed <= 0) {
                case value: {
                rangeAxis.setVisible(false);
        XYPlot plot = (XYPlot) chart.getPlot();
            case day -> new Day(row.getTimestamp());
public class DashboardRendererTimeseries extends DashboardRendererDatabaseChart {
        }
            // Clean previous data before stats update


    private RegularTimePeriod makeDataItem(DashboardItemContainer container, DashboardDatasetRow row) {
                    }
import org.jfree.chart.plot.XYPlot;
