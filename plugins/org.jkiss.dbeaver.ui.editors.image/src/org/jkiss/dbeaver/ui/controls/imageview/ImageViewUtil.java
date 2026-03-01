import java.awt.geom.AffineTransform;
 * @author Chengdong Li: cli4@uky.edu
     * @return rectangle after transform with positive width and height
     * The result rectangle is positive width and positive height.
        Point2D src = new Point2D.Float(pt.x, pt.y);
     * @return rectangle after transform with positive width and height
 */
     * @return point after transform
        dest.height = (int) (src.height * af.getScaleY());
        dest.width = (int) (src.width * af.getScaleX());
     *
            dest.width = src.width;
 *
    }
     *
    }

     * Given an arbitrary rectangle, get the rectangle with the inverse given transform.
     *
		return dest;
 *
class ImageViewUtil {
 * You may obtain a copy of the License at
     * @param af affine transform
    public static Rectangle transformRect(AffineTransform af, Rectangle src) {
            dest.x = src.x;
        Point2D src = new Point2D.Float(pt.x, pt.y);

    /**
        Rectangle dest = new Rectangle(0, 0, 0, 0);
}
     * @param src source rectangle
            return new Point(0, 0);
     * The result rectangle is positive width and positive height.
    }
            e.printStackTrace();
 * See the License for the specific language governing permissions and
    /**
     */
            return new Point((int) Math.floor(dest.getX()), (int) Math.floor(dest.getY()));
        } catch (Exception e) {
        if (src.width < 0) {
        return dest;
        dest.x = p1.x;
        dest.height = (int) (src.height / af.getScaleY());
        Point p1 = new Point(src.x, src.y);
            dest.x = src.x + src.width + 1;
     */
		else{ dest.y=src.y; dest.height=src.height; }
        }
            dest.width = -src.width;
package org.jkiss.dbeaver.ui.controls.imageview;
 * Copyright (C) 2010-2024 DBeaver Corp and others
    }
     * @param af  AffineTransform


/**
    public static Rectangle inverseTransformRect(AffineTransform af, Rectangle src) {

     * @param pt source point
        dest.x = p1.x;

            Point2D dest = af.inverseTransform(src, null);
 */
        dest.width = (int) (src.width / af.getScaleX());
     * @param af  AffineTransform
        Point point = new Point((int) Math.floor(dest.getX()), (int) Math.floor(dest.getY()));
import org.eclipse.swt.graphics.Rectangle;
        p1 = transformPoint(af, p1);
 *
    public static Point inverseTransformPoint(AffineTransform af, Point pt) {
     * @param src source rectangle
 * Licensed under the Apache License, Version 2.0 (the "License");
        dest.y = p1.y;
        Point p1 = new Point(src.x, src.y);
        return point;
    public static Rectangle absRect(Rectangle src) {
    /**
 * DBeaver - Universal Database Manager
     *

 * Unless required by applicable law or agreed to in writing, software
        src = absRect(src);
     * Given an arbitrary point, get the point with the inverse given transform.
        if (src.height < 0) {
     */
 * Utility for Java2d transform
     * @param af AffineTransform
    /**
        dest.y = p1.y;

     * Given an arbitrary rectangle, get the rectangle with the given transform.
     * @return result rectangle with positive width and height
     *
 * you may not use this file except in compliance with the License.
        p1 = inverseTransformPoint(af, p1);
     * @param src source rectangle
     * Given an arbitrary point, get the point with the given transform.
        }
        return dest;
 *
        src = absRect(src);
 *     http://www.apache.org/licenses/LICENSE-2.0
import java.awt.geom.Point2D;

        Rectangle dest = new Rectangle(0, 0, 0, 0);
     * Given arbitrary rectangle, return a rectangle with upper-left
        Rectangle dest = new Rectangle(0, 0, 0, 0);

    /**
    public static Point transformPoint(AffineTransform af, Point pt) {
	}
        } else {
     * start and positive width and height.
 * distributed under the License is distributed on an "AS IS" BASIS,
     */
     */
/*
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * limitations under the License.
import org.eclipse.swt.graphics.Point;
            dest.height=-src.height; }
        Point2D dest = af.transform(src, null);
            dest.y = src.y + src.height + 1;
        try {
     * @param pt point to be transformed
     * @return point after transform
