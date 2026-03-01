		template = o;
		catch (Exception e)
 * See the License for the specific language governing permissions and
	 * Creates a new FlowElementFactory with the given template object
 *
    public Object getObjectType()
 * distributed under the License is distributed on an "AS IS" BASIS,

		}
 * Factory for creating instances of new objects from a palette
/**
			return null;
 * Created on Jul 14, 2004
{
 *     http://www.apache.org/licenses/LICENSE-2.0
		return template;
 * Unless required by applicable law or agreed to in writing, software
 */
	 * @param o
	private Object template;
	public DataElementFactory(Object o)
public class DataElementFactory implements CreationFactory
	/**
 * DBeaver - Universal Database Manager
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.eclipse.gef.requests.CreationFactory;


		try
	 */
 */
	/**
	}
	 * @see org.eclipse.gef.requests.CreationFactory#getObjectType()
	@Override

		{
package org.jkiss.dbeaver.ui.editors.erd.dnd;
		{
	{

			return ((Class<?>) template).getConstructor().newInstance();
 *
/*
	/**
	{
	}
 * @author Serge Rider
 * Copyright (C) 2010-2025 DBeaver Corp and others
 * Licensed under the Apache License, Version 2.0 (the "License");
	 * @see org.eclipse.gef.requests.CreationFactory#getNewObject()
    public Object getNewObject()
	 */
	{
	 *            the template
/*
 * You may obtain a copy of the License at
 */
}	 */
	}
	@Override
 * you may not use this file except in compliance with the License.
 *
		}
	 * 


 * limitations under the License.
