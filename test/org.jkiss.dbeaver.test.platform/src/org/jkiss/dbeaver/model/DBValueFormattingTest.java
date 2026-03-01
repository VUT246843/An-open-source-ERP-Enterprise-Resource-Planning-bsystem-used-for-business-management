
	}
}
 *
	private DBSObject objectProcedure;
        Assert.assertNotNull(image);
	
 * Copyright (C) 2010-2024 DBeaver Corp and others
package org.jkiss.dbeaver.model;
	@Test
 * distributed under the License is distributed on an "AS IS" BASIS,
	
 * limitations under the License.
        Assert.assertNull(image);
import org.junit.Test;
	public void testGetObjectImageAssociation() {
	}
        Assert.assertTrue(objectProcedure instanceof DBPObject);

 * Licensed under the Apache License, Version 2.0 (the "License");
	@Before
	
		object = mock(DBPObject.class);
	@Test

import org.junit.Assert;
        
	public void testGetObjectImagePackage() {
	}

	private DBPObject objectTrigger;

	
		objectProcedure =  mock(DBSProcedure.class);
        Assert.assertNotNull(image);
	
	
        Assert.assertNotNull(image);
        DBPImage image = DBValueFormatting.getObjectImage(objectTrigger, true);
	public void testGetObjectImage() {
        
		objectAssociation =  mock(DBSEntityAssociation.class);
import org.jkiss.dbeaver.model.struct.DBSEntity;
 * you may not use this file except in compliance with the License.
/*
        DBPImage image = DBValueFormatting.getObjectImage(object, true);
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
import org.jkiss.dbeaver.model.struct.rdb.DBSTrigger;
        DBPImage image = DBValueFormatting.getObjectImage(objectEntity, true);
 */
	@Test
        Assert.assertEquals(DBIcon.TYPE_OBJECT,image);
        DBPImage image = DBValueFormatting.getObjectImage(object, false);
		objectTrigger = mock(DBSTrigger.class);		
 * Unless required by applicable law or agreed to in writing, software
	@Test
        Assert.assertEquals(DBIcon.TREE_TRIGGER,image);
	}
import org.jkiss.dbeaver.model.struct.rdb.DBSProcedure;
        Assert.assertNotNull(image);
	public void setUpAssociationObject() {
	}
        
 * You may obtain a copy of the License at
        
	private DBSEntity objectEntity;
        Assert.assertTrue(objectTrigger instanceof DBPObject);
import static org.mockito.Mockito.mock;
        Assert.assertTrue(objectAssociation instanceof DBPObject);
        Assert.assertNotNull(image);
import org.jkiss.dbeaver.model.struct.DBSEntityAssociation;
        Assert.assertEquals(DBIcon.TREE_PROCEDURE,image);

        Assert.assertTrue(objectAssociation instanceof DBSEntityAssociation);
	@Test
        DBPImage image = DBValueFormatting.getObjectImage(objectProcedure, true);
        Assert.assertEquals(DBIcon.TREE_ASSOCIATION,image);        
 * DBeaver - Universal Database Manager
        Assert.assertTrue(object instanceof DBPObject);
	public void testGetObjectImageEntity() {
        DBPImage image = DBValueFormatting.getObjectImage(objectAssociation, true);
 *     http://www.apache.org/licenses/LICENSE-2.0
	private DBSObject objectAssociation;
	public void testGetObjectReturnsNull() {
	public void testGetObjectImageTrigger() {
	}	
        Assert.assertEquals(DBIcon.TREE_PACKAGE,image);
	}
	}
import org.jkiss.dbeaver.model.struct.rdb.DBSPackage;
 *
	private DBPObject object;
        Assert.assertEquals(DBIcon.TREE_TABLE,image);
	private DBPObject objectPackage;
import org.junit.Before;
	@Test
        Assert.assertTrue(objectEntity instanceof DBPObject);
 * See the License for the specific language governing permissions and
	public void testGetObjectImageProcedure() {
	@Test
		objectEntity = mock(DBSEntity.class);

        DBPImage image = DBValueFormatting.getObjectImage(objectPackage, true);

 *
		objectPackage = mock(DBSPackage.class);
        Assert.assertTrue(objectProcedure instanceof DBSProcedure);
public class DBValueFormattingTest extends DBeaverUnitTest {
        Assert.assertNotNull(image);
import org.jkiss.junit.DBeaverUnitTest;
import org.jkiss.dbeaver.model.struct.DBSObject;
	
        Assert.assertTrue(objectPackage instanceof DBPObject);

