     * call to the {@code transform} method:
            return true;
     *
     * Draws a rendered image. If {@code img} is {@code null} this method
        }
     * filling methods.

        Hashtable properties = new Hashtable();
    /** The AWT paint that has been set. */
    /**
        switchColors();
    }
        int w = image.getWidth(observer);
     * @param rect  a rectangle (in device space).
     *
     * @param x  the x-coordinate.
    }
            setClip(new Rectangle2D.Double());
     */
     * AWT font. Be careful that the newly created SWT font
import java.awt.font.FontRenderContext;
    /**
    private void switchColors() {
     */
     */
        return (RenderingHints) this.hints.clone();
    public void setRenderingHints(Map hints) {
import java.awt.Image;
     * @see #fill(Shape)
     *
     * the current paint and stroke settings.

        if (font == null) {
     *
     * Applies the specified clip.
     * @param height  the frame height.
 *
        else if (swtLineJoin == SWT.JOIN_MITER) {
            // handle transparency and compositing.
                new AffineTransform(), true, true);

        setPaint(color);
     * Perform a switch between foreground and background
    /**
    @Override
     */
            return;
    @Override
     * @param color  the color.
        }
     *
    @Override

        Shape ts;
     * {@code (sx1, sy1, sx2, sy2)}) into the destination rectangle
     * @param observer  ignored here.
     * 
     *
     * @param yPoints  the y-coordinates.
    public Paint getPaint() {
    @Override
     * @param sx2  the x-coordinate for the bottom right of the source.
    }
        if (this.gc.getForegroundPattern() == null) {
     * @see #setColor(Color)
     * Returns the current color for this graphics context.
     * Draws a line from (x1, y1) to (x2, y2) using the current stroke
        if (swtLineCap == SWT.CAP_FLAT) {
     * @see #getTransform()
    /**
     * Returns the current value for the specified hint key, or
     *
        return result;
        }
    public void setTransform(AffineTransform t) {
     * ignores all hints.
     */

            Path clipPath = toSwtPath(region);
            return SWT.JOIN_ROUND;
        this.hints = new RenderingHints(null);
    }
     */
    @Override
    /** The AWT color that has been set. */

     * 
    /**
    public void fillOval(int x, int y, int width, int height) {
                case (PathIterator.SEG_CLOSE):
     * @param shx  the x-shear factor.
     * @see #getPaint()
    public void drawPolyline(int[] xPoints, int[] yPoints, int npoints) {
    private Map<GradientPaint, Pattern> patternsPool = new HashMap<>();
     * Internal method to convert a AWT transform object into
        return result;
     * @param width  the width.
        ImageData data = SWTUtils.convertAWTImageToSWT(image);
        }
            int height = this.gc.getDevice().getBounds().height;
     * Returns a copy of the current transform.
        }
    @Override
     *
     */
    }
     * @param height  the frame height.
     */
     * @param xPoints  the x-coordinates.
    /**
     */
     * 
    /**
            }

    public void clipRect(int x, int y, int width, int height) {
        setPaint(saved);
    private int toAwtLineCap(int swtLineCap) {
        for (int i = 0; i < npoints; i++) {
            throw new RuntimeException(
        String[] keys = img.getPropertyNames();
    /**
     */
    public AffineTransform getTransform() {
            int width = this.gc.getDevice().getBounds().width;
    @Override
    /**
     * @param sy1  the y-coordinate for the top left of the source.
     *         rectangle's corners.
        clip(this.rect);
     * Internal method to convert a AWT font object into

        }
     *

     * a SWT font resource. If a corresponding SWT font
     * Dispose the resource pool.
                case Path2D.WIND_NON_ZERO:
     * map.  Note that, for now, this graphics context ignores all hints.
    }
            ImageObserver observer) {
     */
     * and scaled to the specified width and height.
            imageToDraw = op.filter(image, null);
                toAwtLineCap(this.gc.getLineCap()),
     * @return The hint value, or {@code null}.
    /**
     * @param awtTransform The AWT transform to convert.
    /**
     * @param s the shape.
            double[] matrix = new double[6];
    /**
     *
     * @see #fillRoundRect(int, int, int, int, int, int)
        translate(x, y);
        BufferedImage img2 = new BufferedImage(w, h, 
            pointArray[2 * i + 1] = yPoints[i];
    /**
     * baseline level will be aligned with the {@code (x, y)} point.
    /**
import java.awt.RenderingHints.Key;
     * compatibility in AWT, you should use the
    }
        AffineTransform awtTransform = new AffineTransform(elements);
     */
     * Returns the user clipping region.  The initial default value is
                isAlphaPremultiplied, properties);
     * method has come from a forum post by Jim Moore at:
        if (this.clip == null) {

     * @param y  the y-coordinate.
    public void clearRect(int x, int y, int width, int height) {
                }
        org.eclipse.swt.graphics.Color bg = this.gc.getBackground();
        RenderedImage ri = image.createDefaultRendering();
     * @return The path.
    @Override
     * Returns the device configuration associated with this
        return drawImage(img2, dx1, dy1, null);
    /**
     *
     *
        AffineTransform tx = getTransform();
        return this.backgroundColor;
     * @param y  the y-coordinate.
            return false;
            ImageObserver observer) {
        BufferedImage bi = convertRenderedImage(image);
     */
    }
        // necessary to switch temporarily the foreground and background
            addToResourcePool(swtPattern);
     * 
        Path path = new Path(this.gc.getDevice());
        return swtFont;
        tx.concatenate(t);
     */
        }
     * @param observer  ignored.
    }
     * @see #setTransform(java.awt.geom.AffineTransform)
            return BasicStroke.JOIN_BEVEL;

     *
    public Shape getClip() {
     * @param obs  the image observer (ignored).
     * Sets the foreground color.  This method exists for backwards
        t.rotate(theta);
     *
     * @param bgcolor  the background color.
                    default:

        this.composite = AlphaComposite.getInstance(AlphaComposite.SRC, 1.0f);
                    break;
     * Draws an SWT image with the top left corner of the image aligned to the
    private int toSwtLineJoin(int awtLineJoin) {
     */
        this.composite = comp;
        }

        return (AffineTransform) this.transform.clone();
                    height);
        this.gc.fillArc(x, y, width - 1, height - 1, arcStart, arcAngle);
    }
     * {@code null}.
    }
     */
     */
     * context only supports instances of {@link Color} or
            setTransform(null);
            this.transformsPool.put(awtTransform, t);
     * @return The background color (possibly {@code null})..
            return SWT.JOIN_MITER;
     *
     * Returns the AWT line cap corresponding to the specified SWT line cap.
     * to {@link #translate(double, double)}.
    /**
                    break;
        path.dispose();
            c = iterator.next();
                    path.lineTo(coords[0], coords[1]);
            throw new IllegalArgumentException("SWT LineCap " + swtLineCap
     * Draws an arc that is part of an ellipse that fits within the specified
     * @param width  the frame width.
                            coords[3], coords[4], coords[5]);

     * @param font the font.
     * {@code (sx1, sy1, sx2, sy2)}) into the destination rectangle
    /**
     */
    /**
            int alpha = (int) (acomp.getAlpha() * 0xFF);
        // Note that for consistency with the AWT implementation, it is
        }
        BufferedImage imageToDraw = image;
        }
        org.eclipse.swt.graphics.Font swtFont = getSwtFontFromPool(font);
     * @see #translate(double, double)
     * {@link GradientPaint} (in the latter case there is no real gradient
        swtTransform.getElements(elements);
     *
    private Map fontsPool = new HashMap();
            Area a1 = new Area(s);
            swtFont = new org.eclipse.swt.graphics.Font(this.gc.getDevice(),
     *

    }
    }
    public void dispose() {
            return false;
    @Override
     * @see #setPaint(java.awt.Paint)
     * @param height  the height.
     * @param image  the image.
    @Override
     * @see #getPaint()
        int numChars = iterator.getEndIndex() - iterator.getBeginIndex();
                height);
     * http://www.jguru.com/faq/view.jsp?EID=114602</a>
        return !a1.isEmpty();
    public boolean drawImage(Image image, int dx1, int dy1, int dx2, int dy2,
     * @param shape  the shape ({@code null} not permitted).
    public SWTGraphics2D(GC gc) {
        if (paint == null) {
     * Sets the background color.
    }
     *
     * @param x  the x-coordinate.
				polylines[(2 * i) + 1] = yPoints[i];
    /**
    }

    public void rotate(double theta, double x, double y) {
        if (awtLineCap == BasicStroke.CAP_BUTT) {
        }
     * @see #setRenderingHint(RenderingHints.Key, Object)
        int h = image.getHeight(observer);
     */
     *
    /**
            t.setElements((float) matrix[0], (float) matrix[1],
     * @param height  the height.
        if (bgcolor == null) {
     * @param image  the image.
        } else {
     * @return The current paint.
     * that the {@code observer} is ignored.
    private GC gc;
     * @see java.awt.Graphics#setFont(java.awt.Font)
     * @param height  the frame height.
    @Override
            this.transform = new AffineTransform(t);
     * Returns the current paint for this graphics context.
     * Set the font SWT graphic composite from the specified
        this.clip = null;
            pit.next();
     */
    /**
import java.util.List;
    }
    public void rotate(double theta) {
            BasicStroke bs = (BasicStroke) stroke;
     * Draws a rectangle with rounded corners that fits within the specified
    @Override
     * @param dy1  the y-coordinate for the top left of the destination.
     * @param x  the x-coordinate.
            this.gc.setLineCap(toSwtLineCap(bs.getEndCap()));

        }
     */
    /** A reusable rectangle to avoid garbage. */
     */
     * @param onStroke  test the stroked outline only?
        drawString(new String(sb),x,y);
     * {@link #setPaint(java.awt.Paint)} method.

            throw new IllegalArgumentException("Null 'comp' argument.");
        copy.setTransform(getTransform());
        // since this is only used by clearRect(), we don't update the GC yet
    @Override
        this.clip = this.transform.createTransformedShape(region);
                    break;
     * @param sy2  the y-coordinate for the bottom right of the source.
     * @param height  the frame height.
     */
            setTransform(saved);
     * @param x  the x-coordinate.
            return SWT.CAP_SQUARE;
        transform(AffineTransform.getShearInstance(shx, shy));
            ImageObserver obs) {
        }
import java.text.AttributedCharacterIterator;
     */
                case Path2D.WIND_EVEN_ODD:
     * Fills the specified rectangle with the current background color.
    /**
        switchColors();
    /**
    @Override

     * @return {@code true} if the image is drawn.      
            int arcWidth, int arcHeight) {
     *
    }
     * {@code (dx1, dy1, dx2, dy2)}.  Note that the {@code observer} 
     * Not implemented - see {@link Graphics#setXORMode(Color)}.
     *
    public void drawArc(int x, int y, int width, int height, int arcStart,
                for (int i = 0; i < swtDashes.length; i++) {
            this.awtColor = (Color) paint;
     *
     * a SWT transform resource. If a corresponding SWT transform
    /**
     * @param dy2  the y-coordinate for the bottom right of the destination.
        else if (awtLineJoin == BasicStroke.JOIN_MITER) {
    private org.eclipse.swt.graphics.Color getSwtColorFromPool(Color awtColor) {
 *
            Area a2 = new Area(getClip());
    }
            this.gc.setLineWidth((int) bs.getLineWidth());
     * Applies the translation {@code (tx, ty)}.  This call is delegated
            return true;
    }
		gc.drawPolygon(polygons);
     *
        this.gc.fillPath(path);
     * @param npoints  the number of points.
            AffineTransform saved = getTransform();
    @Override
            Color bgcolor, ImageObserver observer) {

     */

     *
     * @param width  the width.
     * @param x  the x-coordinate for the rectangle.
     *
    @Override
     */
        if (comp instanceof AlphaComposite) {
    @Override
            this.gc.setBackgroundPattern(pattern);
        copy.setBackground(getBackground());
    }
     * @return A copy of the current transform (never {@code null}).
            org.eclipse.swt.graphics.Color swtColor = getSwtColorFromPool(this.awtColor);

     * </ul>
     * Sets the clip region to the specified rectangle.
    public void drawRenderableImage(RenderableImage image,
            switch (p2d.getWindingRule()) {
        // for now we simply want to extract the chars from the iterator
    public void fillRect(int x, int y, int width, int height) {
    }
    }
    }

     * Applies a rotation (anti-clockwise) about {@code (x, y)}.
     * @param y  the y-coordinate.
        if (width <= 0 || height <= 0) {
    }


     * <p>
    @Override
     * @param dy1  the y-coordinate for the top left of the destination.
     * @see #setPaint(Paint)
    private List resourcePool = new ArrayList();
    }
    }
            ImageObserver observer) {
    }
        path.dispose();
                    case AlphaComposite.SRC_OVER:
        this.resourcePool.clear();

    }
        }
     * Sets the transform.
     * @param image  the image.
     * required), first filling the background with the specified color.  Note 

        Path path = toSwtPath(shape);
     */
     *         rectangle's corners.
     * framing rectangle.
     * @param font The AWT font to convert.
        int h = image.getHeight(null);
     *
    /**
        switchColors();
    public boolean drawImage(Image image, int x, int y, 
        }
    /** A List to store the SWT resources. */
     * @param width  the frame width.
     * @param y  the y-coordinate.
        }
     *
     *
        switchColors();
     * Converts an SWT transform into the equivalent AWT transform.
     *
     * @param width  the width for the rendered image.
    /**
     *
    private RenderingHints hints;
    private Path toSwtPath(Shape shape) {
     * @see #draw(Shape)
     *
 *     http://www.apache.org/licenses/LICENSE-2.0
            this.gc.setClipping(clipPath);

    /** The current transform (protect this, only hand out copies). */
     * Draws a sequence of connected lines specified by the given points, using
     */
    private static BufferedImage convertRenderedImage(RenderedImage img) {
    public Font getFont() {
        switchColors();
    /**
     *
     * paint settings.
     * 
        if (stroke instanceof BasicStroke) {
     */
    @Override
        }
     */
    /** 
        if (image == null) {
     * Draws an image to the rectangle {@code (x, y, w, h)} (scaling it if
     * @return A SWT color instance.
     * Applies a rotation (anti-clockwise) about {@code (0, 0)}.
     * @param height  the height.


            int arcWidth, int arcHeight) {
        if (this.clip != null) {
     * @param dx2  the x-coordinate for the bottom right of the destination.
        }
     *
     * @return The AWT transform.
     *
        return fontRenderContext;
        this.gc.setTransform(swtTransform);
     *
    @Override
    /**
            int arcAngle) {
    @Override
    }
     *
        // and call an unstyled text renderer
     * <ul><li>
     */
    public void drawString(AttributedCharacterIterator iterator, float x,
    @Override
        else if (paint instanceof GradientPaint) {
                    (float) matrix[2], (float) matrix[3],
            }
     */

        }
     * color of gc. This is needed for consistency with
     * getDeviceConfiguration() method).
    public void translate(int tx, int ty) {

        setPaint(bgcolor);
     *
            return null;
                case (PathIterator.SEG_QUADTO):
    public void drawImage(org.eclipse.swt.graphics.Image image, int x, int y) {
     *
     * {@link #setColor(Color)} for instance.
    /**
     * Applies the translation {@code (tx, ty)}.
     * only the {@link AlphaComposite} class.
     * @param image  the rendered image ({@code null} permitted).
        } else if (paint instanceof MultipleGradientPaint) {
            AffineTransform xform) {
        setPaint(saved);
        if (data == null) {
        WritableRaster raster = cm.createCompatibleWritableRaster(width, height);
            return;
}
            swtPattern = new Pattern(this.gc.getDevice(), (float) gp.getPoint1().getX(), (float) gp.getPoint1().getY(),
    public RenderingHints getRenderingHints() {
        }
    }
     * {@code getColor1()}).
     * {@link #setTransform(AffineTransform)} for instance.
    }
     * @return The device configuration (never {@code null}).
     *
     * @param hintValue  the value (must be compatible with the specified key).
     */
    @Override
    public void shear(double shx, double shy) {
     * @param dx1  the x-coordinate for the top left of the destination.
            ts = transform.createTransformedShape(stroke.createStrokedShape(s));
        this.gc.drawString(text, (int) x, (int) (y - fm), true);
    public void setRenderingHint(Key hintKey, Object hintValue) {
        }
     * @param shy  the y-shear factor.
     *
    public void setFont(Font font) {
    @Override
    }
        this.fontsPool.clear();
    }
        if (img instanceof BufferedImage) {
    public void fillPolygon(int[] xPoints, int[] yPoints, int npoints) {
     * @param region  the clip.

 * Copyright (C) 2010-2025 DBeaver Corp and others
    @Override
        this.switchColors();
     * Returns the current composite.
     */
        BufferedImage result = new BufferedImage(cm, raster, 
        setPaint(saved);
     * with the shape (the interior, if {@code onStroke} is false, 
    /** The user clip. */
        return new BasicStroke(this.gc.getLineWidth(),
        return this.deviceConfiguration;
            clipPath.dispose();
     */
     * @param x  the x-coordinate.
        }
     * @param npoints  the number of points in the polyline.
     *
     * Draws the outline of the polygon specified by the given points, using
     * Fills an oval that fits within the specified rectangular region.
     * @param y  the y-coordinate.
    @Override
        this.gc.setFont(swtFont);
        }
    }
        g2.drawImage(image, 0, 0, w, h, sx1, sy1, sx2, sy2, null);

                + " not recognised");
            this.gc.setAlpha(alpha);

            type = pit.currentSegment(coords);
                    path.close();
        return this.awtFont;

        // we dispose resources we own but user must dispose gc
     * point (x, y).
     */
    public void setComposite(Composite comp) {
     * @param img  the rendered image.
        int[] pointArray = new int[npoints * 2];
     */
    @Override
     */
        if (hints == null) {
    }
		}
    public void drawPolygon(int[] xPoints, int[] yPoints, int npoints) {
            // how to handle?
     * @return {@code true} if the image is drawn. 
        return awtTransform;
     * @param xform  the transform.
     * Converts a rendered image to a {@code BufferedImage}.  This utility
        } else {
     *
        }
    /**
        this.swtInitialClip = gc.getClipping();
            for (int i = 0; i < keys.length; i++) {
     * @param arcAngle  the extent of the arc.
        drawImage(bi, xform, null);
        int type;
        } else {
     * Applies a scale transform.
        super();
                    (float) gp.getPoint2().getX(), (float) gp.getPoint2().getY(), getSwtColorFromPool(gp.getColor1()),
        }
     * @param x  the x-coordinate.
     * @throws IllegalArgumentException if {@code hintValue} is not
    }
     * @param text  the string ({@code null} not permitted).
     * @param arcWidth  the width of the arc defining the roundedness of the
     * @param ty  the y-translation.
     * @param sy1  the y-coordinate for the top left of the source.
     * Returns the AWT line join corresponding to the specified SWT line join.

    }
            throw new NullPointerException("Null 'text' argument.");
            return true;
     */
     *
import java.awt.Font;
     * the {@code observer} is ignored. 
        }
    @Override
        }
     *         compatible with the {@code hintKey}.
 */
     *
        int w = image.getWidth(null);
     */

     * @param theta  the rotation angle (in radians).

     */
     * @param x  the x-coordinate.
    public void fill(Shape shape) {
     * @param x  the x-coordinate.
public class SWTGraphics2D extends Graphics2D {
    public void fillArc(int x, int y, int width, int height, int arcStart,
     * @param observer  an image observer.
        AffineTransform t = getTransform();
     * Returns {@code true} if the rectangle (in device space) intersects
    /**
     * @return A copy of the hints collection.
            float y) {
    }
     * must be disposed separately.
     */
    /**
        this.awtFont = font;
    /**
 * you may not use this file except in compliance with the License.
/**
     *
            pointArray[2 * i] = xPoints[i];
        // TODO Auto-generated method stub
 * limitations under the License.

     * cleared by filling it with the specified {@code bgcolor}. Note that
     * 
        return this.composite;
     * @param arcHeight the height of the arc defining the roundedness of the
    public void drawString(String text, float x, float y) {

        this.awtPaint = paint;
     * @see #draw(Shape)
     * @see #fill(Shape)
     */
    }
    /**
            return BasicStroke.JOIN_MITER;
        }
     * 
        else {
                    (float) matrix[4], (float) matrix[5]);
        if (this.rect == null) {
import org.eclipse.swt.graphics.*;
     * @return The SWT line cap.
        }
                case (PathIterator.SEG_MOVETO):
    @Override
        setTransform(t);
        Pattern swtPattern = this.patternsPool.get(gp);
            this.rect = new Rectangle2D.Double(x, y, width, height);
        org.eclipse.swt.graphics.Font swtFont = (org.eclipse.swt.graphics.Font)
     *
     * @param shape  the shape ({@code null} not permitted).
            switchColors();

     * A reference to the compositing rule to apply. This is necessary
    }
     * Returns the SWT line cap corresponding to the specified AWT line cap.
        int width = img.getWidth();
     * Sets the current composite.  This implementation currently supports
     * Draws an image with the specified transform. Note that the 
     * @param t  the transform ({@code null} not permitted).

     * @return the SWT {@code Resource} just added.
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    }
    }
     *
     * @param y  the y-coordinate.
                    break;
            this.colorsPool.put(Integer.valueOf(awtColor.getRGB()), swtColor);
            this.transform = new AffineTransform();

     */

        }
     * @see #setRenderingHints(Map)
import java.awt.geom.*;
     * @param height  the height for the rendered image.
     *
        a1.intersect(a2);
    /**
    /**
    /**
    /**
     * @param y2  the y-coordinate for the ending point.
            resource.dispose();
     * Draws a string at the specified position.
                switch (acomp.getRule()) {
     *
        if (color == null) {
            return null;
            transform(xform);
    @Override
     *
     * Add given SWT resource to the resource pool. All resources added
        this.fontsPool.get(font);
                toAwtLineJoin(this.gc.getLineJoin()));
     *

     * @param y1  the y-coordinate for the starting point.
                (org.eclipse.swt.graphics.Color)
     *
     * @param height  the height.
    @Override
    /**
    }
     * @param x  the x-coordinate.
     */
                int[] swtDashes = new int[dashes.length];
        else if (swtLineJoin == SWT.JOIN_ROUND) {
        t.translate(tx, ty);
    @Override
     *
     */
    /**
    }
    /** Save the initial clip for when the user clip is reset to null. */
     * @return A new graphics object.

     * @see #getPaint()
        setStroke(new BasicStroke());
     * is ignored.
        setPaint(bgcolor);
            return BasicStroke.CAP_ROUND;
        AffineTransform savedTransform = getTransform();
            int y) {
            throw new NullPointerException("Null 'hints' argument.");
 * An implementation of the {@code Graphics2D} API targeting an SWT graphics
        rotate(theta);
     * Returns the current stroke for this graphics context.
        drawString(iterator, (int) x, (int) y);
        }
        }
    @Override
     * @param image  the image.
    }

                this.colorsPool.get(Integer.valueOf(awtColor.getRGB()));
    public Object getRenderingHint(Key hintKey) {
    private void setRect(int x, int y, int width, int height) {
     * the specified rectangle.
     */
        if (awtLineJoin == BasicStroke.JOIN_BEVEL) {
     *
     *
     * Returns the font in form of an AWT font created
            ts = transform.createTransformedShape(s);
            Pattern pattern = fetchOrCreateSWTPattern(gp);
        if (h < 0) {
    }
        this.colorsPool.clear();
     * @param sx1  the x-coordinate for the top left of the source.
     * @return The font.
        }
     */
     *

        if (swtFont == null) {
     * @param observer  ignored here.
     * Replaces the existing hints with those contained in the specified
        fillRect(x, y, width, height);
     * @param gc  the graphics context.
     * to the resource pool will be disposed when {@link #dispose()} is called.

        if (s instanceof Line2D) {
    public Rectangle getClipBounds() {
     * @param width  the frame width.
    }
     * @see #fillOval(int, int, int, int)
            }
    private org.eclipse.swt.graphics.Rectangle swtInitialClip;
     * only recognises the {@link BasicStroke} class.
     */
        if (w < 0) {
     * {@code null} if no value is set.
    public GraphicsConfiguration getDeviceConfiguration() {
    }
            return false;
    @Override
     * @see #setColor(Color)
        return swtPattern;
        if (paint instanceof Color) {
     * @param image  the image ({@code null} permitted...method will do nothing).
    public void drawImage(BufferedImage image, BufferedImageOp op, int x,
    /**
     */
     *
    /**
        return drawImage(image, x, y, w, h, bgcolor, observer);

    /**
     * 
        setTransform(tx);
     * @param arcStart  the arc starting point, in degrees.
     * @param color  the color ({@code null} permitted but ignored).
     * @param xPoints  the x-coordinates.
 * Licensed under the Apache License, Version 2.0 (the "License");
        }

    }
     * @return {@code true} if the image has been drawn.
    }
        disposeResourcePool();
    @Override
            int arcAngle) {
        if (text == null) {
    private int toAwtLineJoin(int swtLineJoin) {
     * @param y  the y-coordinate.

     * @param y  the y-coordinate.
    public boolean drawImage(Image image, int dx1, int dy1, int dx2, int dy2,
        if (swtPattern == null) {
    /**
     *

        copy.setRenderingHints(getRenderingHints());
    @Override
     * @param sy2  the y-coordinate for the bottom right of the source.
    @Override
    /**
     * {@code Graphics2D}.
     * @param y  the y-coordinate.
    }
                    break;
     * @param bgcolor  the background color ({@code null} permitted).
        // TODO Auto-generated method stub
        if (image == null) {
            return false;
    @Override
            int sx1, int sy1, int sx2, int sy2, Color bgcolor,
        }
     * Internal method to convert a AWT color object into
    private Map colorsPool = new HashMap();
     * support, the paint used is the {@code Color} returned by
     *
    /**
                properties.put(keys[i], img.getProperty(keys[i]));
     *
    private AffineTransform toAwtTransform(Transform swtTransform) {
     * {@code observer} is ignored in this implementation.     
                        break;
    /**
     * otherwise the stroked outline of the shape).
     * @see #drawArc(int, int, int, int, int, int)
     * @param hintKey  the hint key ({@code null} permitted).
        return copy;
        copy.setColor(getColor());
    }
    @Override
            a1.intersect(a2);

    public FontMetrics getFontMetrics(Font font) {
        }
        Shape ts = this.transform.createTransformedShape(s);
     * Not implemented - see {@link Graphics#setPaintMode()}.
     * @see #getRenderingHint(RenderingHints.Key)
            this.patternsPool.put(gp, swtPattern);

     *
     * @param y  the y-coordinate.
        if (stroke == null) {
            return;
        this.gc.drawRoundRectangle(x, y, width - 1, height - 1, arcWidth,
        else {
    /**
     * Draws the specified glyph vector at the location {@code (x, y)}.

     * class uses the background color so we must switch colors.
     */
    @Override
     * Draws a string at {@code (x, y)}.  The start of the text at the
    @Override
     */
        else if (awtLineCap == BasicStroke.CAP_ROUND) {
    public void drawOval(int x, int y, int width, int height) {
    /**
                        this.gc.setAlpha(this.awtColor.getAlpha());
    private Transform getSwtTransformFromPool(AffineTransform awtTransform) {
     */

            this.gc.setLineJoin(toSwtLineJoin(bs.getLineJoin()));
    /**
     *
    private Rectangle2D rect;
    public Color getColor() {
     * Returns the background color.
import java.awt.image.renderable.RenderableImage;
    }
        return t;
     *     identity transform).
     * @param sy  the scale factor along the y-axis.
        }
            Resource resource = (Resource) it.next();
        fillRect(dx1, dy1, dx2 - dx1, dy2 - dy1);
     * Returns the clip bounds.
    public void drawLine(int x1, int y1, int x2, int y2) {
                case (PathIterator.SEG_CUBICTO):
    public boolean drawImage(Image image, AffineTransform xform,
            throw new IllegalArgumentException("AWT LineCap " + awtLineCap
     *
     * Returns the font render context.
     * @param y  the y-coordinate.
        return this.awtColor;
     * @param hintKey  the key ({@code null} not permitted).
     */
        Transform swtTransform = getSwtTransformFromPool(this.transform);
     *
        if (this.clip == null) {
        switchColors();
        PathIterator pit = shape.getPathIterator(null);
        for (Iterator it = this.resourcePool.iterator(); it.hasNext();) {
    }
     * @param observer  ignored.
        Paint saved = getPaint();
                    this.gc.setFillRule(SWT.FILL_WINDING);

        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
     *
     * Fills an arc that is part of an ellipse that fits within the specified
     * Sets the value for a rendering hint.  For now, this graphics context
        }
        drawRenderedImage(ri, xform);
    /**
     */
     * @return The font metrics.
        float[] elements = new float[6];

     * @param t  the new transform ({@code null} permitted, resets to the
            t = new Transform(this.gc.getDevice());

        return path;
        if (keys != null) {
     * @param x  the x-coordinate.
    }
     * @param dy2  the y-coordinate for the bottom right of the destination.
     *
        fill(g.getOutline(x, y));
    /** A HashMap to store the SWT transform resources. */
 * See the License for the specific language governing permissions and
        return SWTUtils.DUMMY_PANEL.getFontMetrics(font);
        this.gc.drawLine(x1, y1, x2, y2);
            Stroke stroke = getStroke();
     *
    }
     */
     * @param width  the width.
import java.awt.Color;
    }
     * {@code transform(AffineTransform.getShearInstance(shx, shy));}
            addToResourcePool(swtColor);
    public boolean drawImage(Image image, int x, int y, int width, int height,
        setClip(this.rect);
     *
            }
            return false;

    public void draw(Shape shape) {
     *         rectangle's corners.
     * @param y  the y-coordinate.
     * Fills the specified polygon.
     * @return A buffered image. 
     * @see #draw(Shape)
    public void drawString(AttributedCharacterIterator iterator, int x, int y) {
    @Override
     * Returns the font metrics.
     *
     * Applies this transform to the existing transform by concatenating it.
     * @param text  the string.
        copy.setStroke(getStroke());
			polygons[(2 * i) + 1] = yPoints[i];
        if (comp == null) {
import java.awt.Rectangle;
     * Draws a string at the specified position.
                    "Can only handle 'Basic Stroke' at present.");
     * Sets the clip region.
    @Override
     * @see #fillRect(int, int, int, int)
        if (w < 0) {
        if (image == null) {
        if (getClip() == null) {
            this.gc.setForeground(swtColor);
        // TODO Auto-generated method stub
     */
 * DBeaver - Universal Database Manager
        } else {
        if (h < 0) {
        translate((double) tx, (double) ty);
     * @return The SWT Pattern.
     *
    }
    private Paint awtPaint;
            throw new IllegalArgumentException("AWT LineJoin " + awtLineJoin
     * Draws an image with the top left corner aligned to the point (x, y),
        int height = img.getHeight();
    }

     * @param hints  the hints ({@code null} not permitted).
    private Resource addToResourcePool(Resource resource) {
     * Draws the outline of the specified shape using the current stroke and
     * @param y  the y-coordinate.
    /**
    public void addRenderingHints(Map hints) {
     * instead of creating a new one. This is used in
            return;  // we can't do anything


     */
     *
        }
        }
            switch (type) {
     * @param bgcolor  the background color ({@code null} permitted).
    }
        return drawImage(image, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, 
            this.deviceConfiguration = new SWTGraphicsConfiguration(width,
     * Adds the hints in the specified map to the graphics context, replacing
     * @param color  the color.
    /**
     * @param op  the operation ({@code null} permitted).
     */
    private Map transformsPool = new HashMap();
     * @param awtLineCap  the AWT line cap.
            addToResourcePool(t);
            return;
    @Override
import java.awt.FontMetrics;
        }
     *
        org.eclipse.swt.graphics.Rectangle bounds = im.getBounds();
     * @param x  the x-coordinate.
    /**
     */
        }
     */    

            // apply dash style if any
     * @return The clip bounds (possibly {@code null)}.

    @Override
     * <br><br>
     */
        im.dispose();
     * @param tx  the x-translation.
        this.hints = new RenderingHints(hints);
     * @return {@code true} if the image has been drawn.
    /**
    }
     * @return The font render context.
 *
     */
     * {@code (dx1, dy1, dx2, dy2)}.  The destination rectangle is first
    }
     * @see #draw(Shape)
                        break;
     */
        if (t == null) {
 * Unless required by applicable law or agreed to in writing, software
        }
     */
     * instance is already in the pool, it will be used
        copy.setClip(getClip());
     * @return The SWT font instance.
            Path2D p2d = (Path2D) shape;
     * @see #setComposite(Composite)
        copy.setFont(getFont());
     * Fills the specified shape using the current paint.
     * @return The AWT line join.
        org.eclipse.swt.graphics.Color swtColor =
    /**
            addToResourcePool(swtFont);
     * @param x2  the x-coordinate for the ending point.
        }

     * @param width  the frame width.
    private Pattern fetchOrCreateSWTPattern(GradientPaint gp) {
        }
     *
        else {
        Paint saved = getPaint();

            swtColor = SWTUtils.toSwtColor(this.gc.getDevice(), awtColor);
    /**
                    path.quadTo(coords[0], coords[1], coords[2], coords[3]);
     * @return The current stroke.
    @Override
        }
    @Override
     * @see #getStroke()

     * Sets the stroke for this graphics context.  For now, this implementation
     * @param arcWidth  the width of the arc defining the roundedness of the
     * Returns the SWT line join corresponding to the specified AWT line join.
        Path path = toSwtPath(shape);
     * @param yPoints  the y-coordinates.
			final int[] polylines = new int[npoints * 2];
     * @param ty  the y-translation.
        }

    public FontRenderContext getFontRenderContext() {
        }
        }
            }
     * @param image  the image ({@code null} permitted...draws nothing).
    /**
    }

     * @param width  the width.
    @Override
    public Stroke getStroke() {
    private AffineTransform transform;
        if (onStroke) {
    /**
     * @param x  the x-coordinate.
        img.copyData(raster);
    /**
            this.gc.setClipping(swtInitialClip);
     * @see #draw(Shape)
     *
        this.transformsPool.clear();
     *
     *
     */
    /**
     * composite.
     *
            setClip(new Path2D.Double(a1));
     * @return The current composite.
    @Override
        try {
        float[] coords = new float[6];
    /**
     */
     */
        copy.setPaint(getPaint());
     * @param shape  the shape ({@code null} not permitted).
    private Color backgroundColor;
     * @param yPoints  the y-coordinates.
     *
     * Draws part of an image (defined by the source rectangle 
     * @param x  the x-coordinate.
     * @param x  the x-coordinate.
     * must dispose of the 'GC' passed to the constructor).
     *
     *
                + " not recognised");
                }
            return SWT.CAP_FLAT;
                    break;
    public void setPaint(Paint paint) {
    /**
        }
    @Override
        this.resourcePool.add(resource);
     *
     * @param x  the x-coordinate.

     * framing rectangle.


     * @param swtLineCap  the SWT line cap.

        } else {
    }
                    getSwtColorFromPool(gp.getColor2()));
     *
        SWTGraphics2D copy = new SWTGraphics2D(this.gc);
    @Override
            return BasicStroke.CAP_BUTT;

    /**
        if (!ts.intersects(this.clip.getBounds2D())) {
                BufferedImage.TYPE_INT_ARGB);
     * @param y  the y-coordinate.
        } catch (NoninvertibleTransformException ex) {

     *
     * @param x  the x-coordinate.
     */
    /**
     * Not implemented - see {@link Graphics#copyArea(int, int, int, int, int,
            this.fontsPool.put(font, swtFont);
            // set the line style to solid by default
            throw new IllegalArgumentException("SWT LineJoin " + swtLineJoin
        Paint saved = getPaint();
            return;
        for (int i = 0; i < numChars; i++) {
    /** A HashMap to store the SWT color resources. */
import java.awt.*;

     * @return The AWT line cap.

     * @see #drawRoundRect(int, int, int, int, int, int)
     */
                    path.moveTo(coords[0], coords[1]);
        this.backgroundColor = color;
            awtTransform.getMatrix(matrix);
        }
     * @param comp  the composite ({@code null} not permitted).
        }
    @Override
    @Override
    @Override
     * @see #getStroke()
     * 
     * @see #addRenderingHints(Map)
     * @see #fillArc(int, int, int, int, int, int)
     * @param arcHeight the height of the arc defining the roundedness of the
        if (!rect.getBounds2D().intersects(ts.getBounds2D())) {
     * any existing hints.  For now, this graphics context ignores all hints.
    private org.eclipse.swt.graphics.Font getSwtFontFromPool(Font font) {
        this.gc.fillRectangle(x, y, width, height);
    public void drawRenderedImage(RenderedImage image, AffineTransform xform) {
     * Fetches an SWT Pattern matching the supplied gradient paint, or creates one, and returns it.
     */
package org.jfree.swt;
    public Graphics create() {
        this.gc.drawPath(path);
    @Override
        else if (swtLineCap == SWT.CAP_ROUND) {
     * Creates a new instance.
        }
     * 
        }
        }
     * @param swtTransform  the SWT transform.
    }
            return false;
     * @param y  the y-coordinate.
    /**
    }
     * and paint settings.
     * The device configuration (this is lazily instantiated in the
     */
     * @param x  the x-coordinate.
     * @param awtColor The AWT color to convert.
            MultipleGradientPaint mgp = (MultipleGradientPaint) paint;
        fillRect(x, y, width, height);
/*
     *
     * @return {@code true} if the image is drawn. 
     * @param x1  the x-coordinate for the starting point.
    /**
        setTransform(t);
     * Fill a rectangle area on the SWT graphic composite.
        if (this.deviceConfiguration == null) {
     * @param iterator  the string.
     * framing rectangle.

     * The rendering hints.  For now, these are not used, but at least the
        AffineTransform t = getTransform();
     */

     * Draws the renderable image.
     *
     * @param image  the image.

 */
                default:
    /**
    }
            return BasicStroke.JOIN_ROUND;
     * @param awtLineJoin  the AWT line join.
        }
    }
     */
     * @param x  the x-coordinate.
    /**
    @Override
     * @return A boolean. 
     * @param y  the y-coordinate.
     *
    /**
        this.switchColors();
        this.gc.fillRoundRectangle(x, y, width - 1, height - 1, arcWidth,
     *
        }
            this.gc.setLineStyle(SWT.LINE_SOLID);
    /**

            return inv.createTransformedShape(this.clip);
    public Color getBackground() {
    private Font awtFont;
    @Override
     */
        this.transform = new AffineTransform();
        setRect(x, y, width, height);
            AffineTransform inv = this.transform.createInverse();
                    break;
     * int)}.
        }
        }
     * @return A SWT transform instance.

     * @param iterator  the string.
     *
                case (PathIterator.SEG_LINETO):
        setTransform(t);

     * @param dx1  the x-coordinate for the top left of the destination.
        char c = iterator.first();
        if (t == null) {
				polylines[i * 2] = xPoints[i];
    @Override
     * @param image  the image ({@code null} permitted...draws nothing).

            return;  // to be consistent with other Graphics2D implementations
        this.patternsPool.clear();
     * @param arcStart  the arc starting point, in degrees.
    /**
        return true;
        else {
    /**
    }
     * with the parameters of the font of the SWT graphic
    /** A HashMap to store the SWT font resources. */
    public void drawGlyphVector(GlyphVector g, float x, float y) {
    public void setStroke(Stroke stroke) {
     * @param x  the x-coordinate.
     * 
import java.util.*;
    @Override
     *
     * due to the poor compositing interface of the SWT toolkit. 
     * {@link #setFont(Font)} for instance.
     * Draws a string at the specified position.
            return BasicStroke.CAP_SQUARE;

     * @param xform  the transform.
    /**
     */
                    break;
        Graphics2D g2 = img2.createGraphics();
            int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
     * 
     *
     * @param y  the y-coordinate.
		if (npoints > 1) {
     * @param resource the resource to add to the pool.
        if (swtLineJoin == SWT.JOIN_BEVEL) {
        if (xform != null) {
        if (xform != null) {
    @Override

    public void copyArea(int x, int y, int width, int height, int dx, int dy) {
    }
     * @param y  the y-coordinate.
     *
     *
     * @param s  the shape for the clip.
    }
            this.gc.setForegroundPattern(pattern);
     * @see java.awt.Graphics#getFont()

        this.hints.put(hintKey, hintValue);
                    SWTUtils.toSwtFontData(this.gc.getDevice(), font, true));
    }
        t.scale(sx, sy);
     * <a href="http://www.jguru.com/faq/view.jsp?EID=114602">
        }
     * instead of creating a new one. This is used in
    /**
    
        }
     * @return The current color.
    /**
            this.rect.setRect(x, y, width, height);
        AffineTransform t = getTransform();
     */
     * @param gp  the gradient paint.
    /** The SWT graphic composite */
		for (int i = 0; i < npoints; i++) {

        this.gc.setBackground(fg);


        return getClip().getBounds();
     * @return The SWT line join.
    }
     * @param arcAngle  the extent of the arc.
    }
    @Override
                arcHeight);

     * @see #drawString(java.lang.String, float, float) 
     * @param sx2  the x-coordinate for the bottom right of the source.
     * @param width  the frame width.
        else {
     * @see #setStroke(Stroke)
     *
        this.gc.fillOval(x, y, width - 1, height - 1);
     *
	}
     * 
        this.gc.fillPolygon(pointArray);
    public void setColor(Color color) {
     *
    public void setBackground(Color color) {

     *
        ColorModel cm = img.getColorModel();
    public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
     * 
                    this.gc.setFillRule(SWT.FILL_EVEN_ODD);
        copy.setComposite(getComposite());
    private void disposeResourcePool() {
     * The {@code fillRectangle} method of the {@code GC}
    public void transform(AffineTransform t) {
     *
        }
        else if (swtLineCap == SWT.CAP_SQUARE) {
        drawString(text, (float) x, (float) y);
        if (swtColor == null) {
     */
     * @param g  the glyph vector ({@code null} not permitted).

     *
    }
    public void setClip(Shape region) {
     * @see java.awt.Graphics#dispose()
     *
			for (int i = 0; i < npoints; i++) {
            if (this.composite instanceof AlphaComposite) {

        FontRenderContext fontRenderContext = new FontRenderContext(
     */
        // colors
        switchColors();
     * 
     * @param x  the x-coordinate.
    public boolean drawImage(Image image, int x, int y, Color bgcolor,
    /**
     *
            return SWT.JOIN_BEVEL;
            return null;
     */
        org.eclipse.swt.graphics.Color fg = this.gc.getForeground();
    }
import java.awt.image.*;
     * Releases resources held by this instance (but note that the caller
        return resource;
                    // not recognised
            sb.append(c);
     * 
        org.eclipse.swt.graphics.Image im = new org.eclipse.swt.graphics.Image(
     * Draws a rectangle with rounded corners that fits within the specified
     * Converts an AWT {@code Shape} into a SWT {@code Path}.
        boolean result = drawImage(image, 0, 0, obs);
    public void clip(Shape s) {
    }
     */
     * @param height  the frame height.
     * @param paint  the paint ({@code null} permitted, ignored).
     * Sets the attributes of the reusable {@link Rectangle2D} object.
                + " not recognised");
import java.awt.font.GlyphVector;
     * @param dx2  the x-coordinate for the bottom right of the destination.
    public void scale(double sx, double sy) {
			gc.drawPolyline(polylines);
     *         rectangle's corners.
 * distributed under the License is distributed on an "AS IS" BASIS,
        Color bgcolor = getBackground();
        Transform t = (Transform) this.transformsPool.get(awtTransform);
    private Color awtColor;
     * to the specified image at the location {@code (x, y)}.

			}
     * @param sx  the scale factor along the x-axis.
     * @param xform  the transform.
    /**
        AffineTransform transform = getTransform();
        drawImage(imageToDraw, new AffineTransform(1f, 0f, 0f, 1f, x, y), null);
     */
     */
    /**
        this.gc.drawOval(x, y, width - 1, height - 1);
    @Override
     */
			polygons[i * 2] = xPoints[i];
     *
    @Override
     *
     * @param y  the y-coordinate.
		final int[] polygons = new int[npoints * 2];
     * @param stroke  the stroke ({@code null} not permitted).
    public boolean drawImage(Image image, int x, int y, int width, int height,
     * Sets the paint for this graphics context.  For now, this graphics

        while (!pit.isDone()) {
     * @param y  the y-coordinate.
 * You may obtain a copy of the License at
     * Sets the clipping to the intersection of the current clip region and
        if (this.gc.getForegroundPattern() == null) {
     * @param theta  the rotation angle (in radians).
     * Draws the image resulting from applying the {@code BufferedImageOp}
        else {
 * context.
     * Creates a new graphics object that is a copy of this graphics object.
            s = s.getBounds2D();
import org.eclipse.swt.SWT;
        else if (awtLineJoin == BasicStroke.JOIN_ROUND) {

     *
        if (image == null) {
     * Draws part of an image (defined by the source rectangle 
     * Draws an image with the top left corner aligned to the point (x, y).
    /**
        this.hints.putAll(hints);
                default:
     * Draws an oval that fits within the specified rectangular region.
        else if (awtLineCap == BasicStroke.CAP_SQUARE) {
     * does nothing.

            throw new RuntimeException("Can only handle 'Color' and 'GradientPaint' at present.");
     * @see #drawOval(int, int, int, int)
    }
            setClip(s);
        this.gc.drawArc(x, y, width - 1, height - 1, arcStart, arcAngle);
     * @param sx1  the x-coordinate for the top left of the source.
                arcHeight);
        return drawImage(image, x, y, width, height, observer);
    /**
    public void drawRoundRect(int x, int y, int width, int height,
    public void translate(double tx, double ty) {
                + " not recognised");
                        this.gc.setAlpha((int) (this.awtColor.getAlpha() * acomp.getAlpha()));
     *
        return drawImage(image, x, y, w, h, observer);
                    swtDashes[i] = (int) dashes[i];
    @Override
    /**
     *
     * @param height  the height.
    public Composite getComposite() {
    }
    @Override
            throw new IllegalArgumentException("Null 'stroke' argument.");
     * instance is already in the pool, it will be used
     * @param xPoints  the x-coordinates.
     * instead of creating a new one. This is used in
    /**
    }
     */
     * Draws an image.

     * @return The user clipping region (possibly {@code null}).
    }
     * @param image  the renderable image.
            switchColors();
     *
     *
     * @param height  the frame height.
     * 
     */
    /**

                AlphaComposite acomp = (AlphaComposite) this.composite;
    public void fillRoundRect(int x, int y, int width, int height,

    /**
        }
     */

            return (BufferedImage) img;	
    /**
            GradientPaint gp = (GradientPaint) paint;
        this.gc.drawImage(im, 0, 0, bounds.width, bounds.height, x, y, width,
     *
        return swtColor;
    /**
        }

        if (op != null) {
    @Override
     * @param width  the frame width.
    public void setXORMode(Color color) {
     * @param hints  the hints ({@code null} not permitted).
    private int toSwtLineCap(int awtLineCap) {
    }
    }
        }
     */
            return SWT.CAP_ROUND;
     * the AWT behaviour, and is required notably for the
     * @param width  the width.

     */
        Area a2 = new Area(ts);
     *
    private GraphicsConfiguration deviceConfiguration;
    public void drawString(String text, int x, int y) {
		}
     * a SWT color resource. If a corresponding SWT color
            float[] dashes = bs.getDashArray();
    private Shape clip;
    }
        setRect(x, y, width, height);
	}
            if (dashes != null) {
        }
        return this.awtPaint;
        int w = dx2 - dx1;
        }
    /**
     */
     * @param x  the x-coordinate.
     * @see #setClip(java.awt.Shape)
                this.gc.getDevice(), data);
            AlphaComposite acomp = (AlphaComposite) comp;

     * @param y  the y-coordinate.
                observer);
        this.gc.drawImage(image, x, y);
        float fm = this.gc.getFontMetrics().getAscent();
            ImageObserver observer) {
            return true;
     * basic mechanism is present.
        this.gc.setForeground(bg);
    public void setPaintMode() {
    private java.awt.Composite composite;
     * @param y  the y-coordinate for the rectangle.

     * @param tx  the x-translation.
     * @param image  the image.
     * @param swtLineJoin  the SWT line join.
    }
    public void setClip(int x, int y, int width, int height) {
     * @return {@code true} if the image is drawn. 
     * @return A boolean.
    @Override
        switchColors();
        StringBuffer sb = new StringBuffer();
        return this.hints.get(hintKey);
     * @param npoints  the number of points in the polygon.
        translate(-x, -y);
        if (shape instanceof Path2D) {
            setTransform(savedTransform);
     * framing rectangle.
    /**
     *
        Area a1 = new Area(rect);

                this.gc.setLineDash(swtDashes);
     * @see java.awt.Graphics#fillRect(int, int, int, int)
     * Returns a copy of the hints collection for this graphics context.

     * Applies a shear transformation. This is equivalent to the following
        int h = dy2 - dy1;
        this.gc = gc;
    /** A pool for storing SWT pattern resources. */
        setPaint(bgcolor);
    @Override
     * the current paint and stroke settings.
                    path.cubicTo(coords[0], coords[1], coords[2],
        }
     * instance is already in the pool, it will be used
