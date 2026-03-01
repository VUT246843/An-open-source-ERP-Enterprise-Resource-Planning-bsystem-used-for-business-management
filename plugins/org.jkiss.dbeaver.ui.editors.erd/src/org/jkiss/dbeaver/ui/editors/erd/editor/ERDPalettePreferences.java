 *
		ERDUIActivator.getDefault().getPreferenceStore().setValue(PALETTE_DOCK_LOCATION, location);
 *     http://www.apache.org/licenses/LICENSE-2.0
{
	@Override
		ERDUIActivator.getDefault().getPreferenceStore().setValue(PALETTE_STATE, state);
 *
 * Copyright (C) 2010-2025 DBeaver Corp and others
    public void setPaletteWidth(int width)
		int location = ERDUIActivator.getDefault().getPreferenceStore().getInt(PALETTE_DOCK_LOCATION);
/**
    public int getDockLocation()
 * @author Serge Rider
	}
	{
    public int getPaletteWidth()
	@Override

 * Licensed under the Apache License, Version 2.0 (the "License");
 * See the License for the specific language governing permissions and
	protected static final String PALETTE_SIZE = "Palette Size";
	{
/*
		{

 * you may not use this file except in compliance with the License.
		}
 */

	}
	}
		int width = ERDUIActivator.getDefault().getPreferenceStore().getInt(PALETTE_SIZE);
 * Contains the preferences for the palette flyout
import org.jkiss.dbeaver.ui.editors.erd.internal.ERDUIActivator;
 * Created on Aug 12, 2004

	}


		if (width == 0)
	@Override
    public void setDockLocation(int location)
	protected static final String PALETTE_DOCK_LOCATION = "Dock location";

/*
	}

import org.eclipse.draw2d.PositionConstants;
 */
	{
import org.eclipse.gef.ui.palette.FlyoutPaletteComposite.FlyoutPreferences;
	protected static final String PALETTE_STATE = "Palette state";
public class ERDPalettePreferences implements FlyoutPreferences
		return location;
    public int getPaletteState()

	}
 */
		if (location == 0)
 * limitations under the License.
	public static final int DEFAULT_PALETTE_WIDTH = 150;

 * Unless required by applicable law or agreed to in writing, software
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
			return DEFAULT_PALETTE_WIDTH;
 * You may obtain a copy of the License at
	@Override
		return width;
	{

	@Override
	{
 * DBeaver - Universal Database Manager

package org.jkiss.dbeaver.ui.editors.erd.editor;
	{
    public void setPaletteState(int state)
 * distributed under the License is distributed on an "AS IS" BASIS,
}	@Override
		ERDUIActivator.getDefault().getPreferenceStore().setValue(PALETTE_SIZE, width);
		return ERDUIActivator.getDefault().getPreferenceStore().getInt(PALETTE_STATE);
			return PositionConstants.EAST;
 *
