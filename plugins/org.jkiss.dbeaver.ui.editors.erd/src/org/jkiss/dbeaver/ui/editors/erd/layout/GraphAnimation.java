        }
			initialStates.put(connection, points);
			double current1 = 1.0;
		viewport.validate();
		PointList points2 = conn.getPoints().getCopy();


				child.setBounds(new Rectangle((int) Math.round(progress * rect2.x + (1 - progress) * rect1.x),

public class GraphAnimation
	static boolean RECORDING;
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
		}
		finalStates = new HashMap<>();

		for (IFigure child : children) {
			rect1.x = rect2.x;
			return false;

	static double progress;
			//Nothing layed out, so abort the animation
			PointList points = conn.getPoints();
		if (!iter.hasNext())
					p.y = (int) (((q.y * (current1 - current2) + p.y * (prev2 - current1)) / (prev2 - current2)));
			int i2 = size2;
		if (!PLAYBACK)
			rect2 = (Rectangle) finalStates.get(child);
		if (points1 != null && points1.size() != points2.size())
		if (list1 == null)
			root = root.getParent();
		}
		}
	{
/*
 * DBeaver - Universal Database Manager
		PLAYBACK = true;
					prev1 = current1;
					prev2 = current2;
	static Viewport viewport;
	public static boolean step()
		progress = (double) (current - start) / (finish - start);
 * You may obtain a copy of the License at

					current1 = (double) i1 / size1;
	{

		progress = Math.min(progress, 0.999);
	public static boolean captureLayout(IFigure root)
				{
	{

					current1 = (double) i1 / size1;
			if (rect2.width > rect1.width || rect2.height > rect1.height) {
		while (!(root instanceof Viewport))
 * Copyright (C) 2010-2025 DBeaver Corp and others
					current2 = (double) i2 / size2;
		viewport = null;
					p.x = (int) (((q.x * (current1 - current2) + p.x * (prev2 - current1)) / (prev2 - current2)));
		Map<IFigure, Object> temp = finalStates;
					// current1 < current2 < prev1

		RECORDING = true;
				&& points.getPoint(1).equals(Point.SINGLETON.setLocation(100, 100)))
			RECORDING = false;
				points.addPoint(pt1);

		current = start + 20;
import org.eclipse.draw2d.geometry.Point;
			recordFinalState(iter.next());
			double prev1 = 1.0;

	}
	public static boolean playbackState(Connection conn)
	}
		}
	}
 */
	static Map<IFigure, Object> initialStates;
{

		if (points.size() == 2 && points.getPoint(0).equals(Point.SINGLETON.setLocation(0, 0))
        for (IFigure f : initialStates.keySet()) {
		Rectangle rect1, rect2;

		}
 * See the License for the specific language governing permissions and
		if (list1.size() == list2.size())
		for (IFigure child : children) {

		PointList list2 = (PointList) finalStates.get(conn);
 * state figure bounds is greater, then the rectangle during animation is shown
	{
			rect1.width = rect2.width;

			} else {
		Rectangle rect2 = child.getBounds().getCopy();
				}
 * GraphAnimation class lifted directly from the .gef flow example. The only
	static final long DURATION = 400;
			recordFinalState((Connection) child);


	}
			return true;
		if (rect1.isEmpty())
				}

			points.removeAllPoints();


		{
		{
		List<? extends IFigure> children = container.getChildren();
					//1 needs to catch up
		//$TODO instead of performing a final normal layout, what about setting
	public static void end()
            f.revalidate();
import org.eclipse.draw2d.geometry.PointList;

		finish = start + DURATION;
			conn.setPoints(points);
			return;
		}
					points1.getPoint(p, i1);
		List<? extends IFigure> children = container.getChildren();
		if (child instanceof Connection)
		//	loc.translate(trackMe.getBounds().getLocation().getDifference(trackLocation));
		{
		return true;
	}
				child.setBounds(new Rectangle((int) Math.round(progress * rect2.x + (1 - progress) * rect1.x),
					i2--;
			root = root.getParent();
		root.validate();
					points1.getPoint(q, i1 + 1);
				continue;
	{
				list2.getPoint(pt1, i);
	public static void recordFinalState(Connection conn)

import java.util.List;
					//2 needs to catch up
 *
		return current < finish;
		//	Point loc = viewport.getViewLocation();
	}
		finalStates = initialStates;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
		//	viewport.setViewLocation(loc);
		initialStates = null;
 * @author hudsonr Created on Apr 28, 2003

		{
			initialStates.put(child, child.getBounds().getCopy());
            f.revalidate();

		if (!RECORDING)
import org.eclipse.draw2d.geometry.Rectangle;
			return;


 * Created on Jul 16, 2004

	{
		initialStates = new HashMap<>();
	{
		viewport = (Viewport) root;
					i2--;
		// progress=1.0?

			int size1 = points1.size() - 1;
	static long current;
	}
		//	trackLocation = trackMe.getBounds().getLocation();
		}
		Rectangle rect1 = (Rectangle) initialStates.get(child);
			for (int i = 0; i < list1.size(); i++)
        for (IFigure f : initialStates.keySet()) {
		initialStates = temp;
import org.eclipse.draw2d.IFigure;


		finalStates.put(conn, points2);

import org.eclipse.draw2d.Viewport;
					prev2 = prev1 = current1;
		start = System.currentTimeMillis();
					(int) Math.round(progress * rect2.y + (1 - progress) * rect1.y), (int) Math.round(progress

		{
 */
 *     http://www.apache.org/licenses/LICENSE-2.0

	public static void recordInitialState(Connection connection)
		PLAYBACK = false;
		//	showMe = null;

					* rect2.width + (1 - progress) * rect1.width), (int) Math.round(progress * rect2.height
		return true;
				{
		//This part records all layout results.
				else if (current1 < current2)
import java.util.HashMap;
		//$TODO
			if (rect2 == null)
			return;
	}
					// current2< current1 < prev2

				pt1.y = (int) Math.round(pt1.y * progress + (1 - progress) * pt2.y);
					+ (1 - progress) * rect1.height)));
		if (!PLAYBACK)
		while (root.getParent() != null)
		PointList list1 = (PointList) initialStates.get(conn);
			}
import java.util.Iterator;

					current2 = (double) i2 / size2;
	public static void recordFinalState(IFigure child)
	public static void swap()
 * you may not use this file except in compliance with the License.
			}
 * limitations under the License.

		{
	static long start = -1;
			{
				else
/**
        }
		RECORDING = false;
 * as the final size from the outset
					(int) Math.round(progress * rect2.y + (1 - progress) * rect1.y), rect2.width, rect2.height));
	}

			Point p = new Point(), q = new Point();
	static Map<IFigure, Object> finalStates;
			{

			conn.setVisible(false);
					points2.getPoint(p, i2);
 * Unless required by applicable law or agreed to in writing, software
	{
import org.eclipse.draw2d.Connection;
			return false;
 * 
					points2.getPoint(q, i2 + 1);
		if (!RECORDING)
            f.setVisible(true);
package org.jkiss.dbeaver.ui.editors.erd.layout;
 *
					points2.insertPoint(p, i2 + 1);
		Iterator<IFigure> iter = initialStates.keySet().iterator();
 * modification is in playBackState(): if either the width of height of a final
			while (i1 > 0 || i2 > 0)
 *
			double prev2 = 1.0;
			int i1 = size1;
		finalStates.put(child, rect2);
}				list1.getPoint(pt2, i);
import java.util.Map;
	{
		PointList points = connection.getPoints().getCopy();
		else
					p.x = (int) (((q.x * (current2 - current1) + p.x * (prev1 - current2)) / (prev1 - current1)));
		}

		PointList points1 = (PointList) initialStates.get(conn);
			initialStates.put(connection, null);
		//	trackMe = null;

 * distributed under the License is distributed on an "AS IS" BASIS,
					points1.insertPoint(p, i1 + 1);
	static boolean PLAYBACK;
	public static boolean playbackState(IFigure container)
			int size2 = points2.size() - 1;
	public static void recordInitialState(IFigure container)
					p.y = (int) (((q.y * (current2 - current1) + p.y * (prev1 - current2)) / (prev1 - current1)));
					//Both points are the same, use them and go on;
				{
			rect1 = (Rectangle) initialStates.get(child);
					i1--;
			return false;
				pt1.x = (int) Math.round(pt1.x * progress + (1 - progress) * pt2.x);
			Point pt1 = new Point(), pt2 = new Point();
			rect1.y = rect2.y;

		current = System.currentTimeMillis() + 30;
				if (Math.abs(current1 - current2) < 0.1 && i1 > 0 && i2 > 0)
					prev1 = prev2 = current2;
			}
	static long finish;
		return true;

	{
					i1--;

	}
		finalStates = null;

				}
 */
			double current2 = 1.0;

		while (iter.hasNext())
