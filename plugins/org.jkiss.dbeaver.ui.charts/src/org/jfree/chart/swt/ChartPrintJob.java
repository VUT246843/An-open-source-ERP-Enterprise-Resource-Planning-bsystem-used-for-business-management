 * Licensed under the Apache License, Version 2.0 (the "License");
    }
                gc.dispose();
     * by the printer hardware)
 * See the License for the specific language governing permissions and
 * Unless required by applicable law or agreed to in writing, software
import org.eclipse.swt.graphics.Image;
        }
import org.eclipse.swt.graphics.Rectangle;
                imageGC.dispose();
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
     * @param safetyBorder
        int availWidth = printer.getClientArea().width - marginLeft
            return; // Anwender hat abgebrochen.
            image.dispose();
        }

        int availHeight = printer.getClientArea().height - marginTop
        } finally {
                        elementToPrint.getSize());
        int marginTop = Math.max(trimTop, safetyBorderHeight);
     */
 * You may obtain a copy of the License at
     * Creates a new job.
 *
 * limitations under the License.
 * you may not use this file except in compliance with the License.
     * The object to print should be scaled up or down to fit horizontally and
     * 
            try {
            printer.startJob(jobName);
 * Copyright (C) 2010-2025 DBeaver Corp and others
        Image image = new Image(elementToPrint.getDisplay(),
/*
/**
    /**
                        elementToPrint.getSize().y, printArea.x, printArea.y, 
     * vertically the available space.
                gc.drawImage(image, 0, 0, elementToPrint.getSize().x,
import org.eclipse.swt.graphics.GC;
                printer.endPage();
 */
    /** 
        if (printerData == null) {
     * @param printArea
    private Rectangle getPrintableArea(Printer printer, double safetyBorder) {
        Printer printer = new Printer(printerData);
            }
            } finally {
        Rectangle trim = printer.computeTrim(0, 0, 0, 0);
        PrintDialog dialog = new PrintDialog(elementToPrint.getShell());

    }
import org.eclipse.swt.graphics.Point;
 * distributed under the License is distributed on an "AS IS" BASIS,
     * 
                        fittedSize.x, fittedSize.y);
 * DBeaver - Universal Database Manager
        PrinterData printerData = dialog.open();
import org.eclipse.swt.widgets.Composite;
        int trgHeight = (int) Math.ceil(originalSize.y * scaleFactor);

                Rectangle printArea = getPrintableArea(printer, BORDER);
            } finally {
        int trimTop = -trim.y;
    private void printComposite(Composite elementToPrint, GC gc, 
                elementToPrint.getSize().x, elementToPrint.getSize().y);
import org.eclipse.swt.printing.PrintDialog;
            GC imageGC = new GC(image);
        this.jobName = jobName;
        return new Point(trgWidth, trgHeight);

     * @return the fitted size of the object to print
                elementToPrint.print(imageGC);
        int trimBottom = trim.y + trim.height;
     */
     * @param jobName  this will be the name of the print job or the default 
            try {
    /**
            }

        int trgWidth = (int) Math.ceil(originalSize.x * scaleFactor);
    }
    protected void startPrintJob(Composite elementToPrint, 
    public ChartPrintJob(String jobName) {
    }
        int trimLeft = -trim.x;
        int safetyBorderHeight = (int) (safetyBorder * printer.getDPI().y);
import org.eclipse.swt.printing.PrinterData;
 *
        int marginRight = Math.max(trimRight, safetyBorderWidth);


     * @return the rectangle in pixels to print on (and which is also supported
     *     name of the file (if printed to a file).

        int trimRight = trim.x + trim.width;
     * Prints the specified element.
        int marginBottom = Math.max(trimBottom, safetyBorderHeight);
            printer.endJob();
        }
                printer.startPage();

    Point calcFittedSize(Rectangle printArea, Point originalSize) {
 * Printer job for SWT.
     */
    /**
            PrinterData printerData) {
    private static final double BORDER = 0.8;
     * 


            Rectangle printArea) {
package org.jfree.chart.swt;
                Point fittedSize = calcFittedSize(printArea, 
        } finally {
                - marginBottom;

    private String jobName;
    }
}        try {

import org.eclipse.swt.printing.Printer;

        try {

            GC gc = new GC(printer);
 */
    public void print(Composite elementToPrint) {
     */
     * Border on the paper not to print on (in inches)
                printComposite(elementToPrint, gc, printArea);
        int safetyBorderWidth = (int) (safetyBorder * printer.getDPI().x);

    /**
 *     http://www.apache.org/licenses/LICENSE-2.0
            printer.dispose();
        double scaleFactor = Math.min(
     *     
     */
        return new Rectangle(marginLeft, marginTop, availWidth, availHeight);
        startPrintJob(elementToPrint, printerData);
    }

        int marginLeft = Math.max(trimLeft, safetyBorderWidth);
public class ChartPrintJob {
                (double) printArea.width / originalSize.x);

                (double) printArea.height / originalSize.y,
     * @param elementToPrint  the {@link Composite} to be printed.
     * @param printer
                - marginRight;
     * @param originalSize
