
import org.jkiss.junit.DBeaverUnitTest;
 * Unless required by applicable law or agreed to in writing, software
	private Map<String, Object> map;
 * limitations under the License.
 *     http://www.apache.org/licenses/LICENSE-2.0


package org.jkiss.dbeaver.model.data.json;
		map2 = new HashMap<>();
		Assert.assertTrue(actualMessage.contains(expectedMessage));

	@Before
	public void getStringTest() {
		Assert.assertEquals(new Date(((Number) Long.MAX_VALUE).longValue()), JSONUtils.parseDate(Long.MAX_VALUE));
		Assert.assertEquals(list, JSONUtils.getObjectList(map3, "Location"));

 * You may obtain a copy of the License at

	private Map<String, Object> nestedMap2;
		nestedMap2.put("Apple", "iPhone");
 * Licensed under the Apache License, Version 2.0 (the "License");
		nestedMap1 = new HashMap<>();
 *
 * See the License for the specific language governing permissions and
	private Map<String, Object> nestedMap1;
		list.add(nestedMap1);
		list = new ArrayList<>();
		map3.put("Time", 10);
}
		list.add(nestedMap4);
		Assert.assertEquals(null, JSONUtils.getString(map, "Time"));
		Map<String, Object> nestedMap4 = new HashMap<>();


		map.put("Time", null);
	@Test
		String actualMessage = exception.getMessage();
import org.junit.Test;
		nestedMap2 = new HashMap<>();
		Assert.assertEquals(Collections.emptyList(), JSONUtils.getObjectList(map3, "Time"));
import org.junit.Before;
	@Test

		nestedMap1.put("US", "New York");
		Assert.assertEquals(nestedMap2, JSONUtils.getObject(map2, "Product"));

 * Copyright (C) 2010-2024 DBeaver Corp and others
		Assert.assertEquals("London", JSONUtils.getString(map, "Location"));
		list.add(nestedMap3);
	public void getObjectListTest() {
	@Test
		Map<String, Object> nestedMap3 = new HashMap<>();
	}

		map = new HashMap<>();
		Assert.assertEquals(new LinkedHashMap<>(), JSONUtils.getObject(map2, "Time"));
		});
 * you may not use this file except in compliance with the License.
	private List<Map<String, Object>> list;
		Assert.assertEquals(null, JSONUtils.parseDate(null));
 *
		map2.put("Time", null);
		map3.put("Location", list);
public class JSONUtilsTest extends DBeaverUnitTest {
		map.put("Location", "London");


import org.junit.Assert;
		map3 = new HashMap<>();

	public void parseDateTest() {
		nestedMap3.put("UK", "London");
	}
		Exception exception = Assert.assertThrows(IllegalArgumentException.class, () -> {
		map2.put("Product", nestedMap2);
 */
	public void getObjectTest() {
 * distributed under the License is distributed on an "AS IS" BASIS,
	private Map<String, Object> map2;

 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	}
		String expectedMessage = "Cannot parse date from value '99.88'";
	public void setUp() {
import java.util.*;
	@Test

	private Map<String, Object> map3;
 *
		Assert.assertEquals(new Date(((Number) 22).longValue()), JSONUtils.parseDate(((Number) 22)));
/*
		nestedMap4.put("FR", "Paris");
 * DBeaver - Universal Database Manager
		Assert.assertEquals(nestedMap1, JSONUtils.getObject(map2, "Location"));
		map2.put("Location", nestedMap1);
	}
			JSONUtils.parseDate(((Number) 99.88));
	}

