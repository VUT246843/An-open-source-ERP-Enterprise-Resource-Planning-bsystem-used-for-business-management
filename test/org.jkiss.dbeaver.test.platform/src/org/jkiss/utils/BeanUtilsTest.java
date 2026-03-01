    public void testIsGetterName() {
        Assert.assertEquals(false,
        ));

                "valueOf", new Class<?>[]{int.class}, new Object[]{0}));

    @Test
        Assert.assertNull(BeanUtils.getPropertyNameFromGetter("foobar"));
            public Type[] getLowerBounds() {
        WildcardType wildcardType = new WildcardType() {

                BeanUtils.getSetMethod(String.class, "length", true));

    }
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        Assert.assertTrue(BeanUtils.isGetterName("is"));
    public void testInvokeObjectMethod() throws Throwable {

            @Override
    public void testMethodNameToPropertyName() {
    }
    public final ExpectedException thrown = ExpectedException.none();
            @Override
            child,
    @Test
        Assert.assertEquals(0, BeanUtils.invokeObjectDeclaredMethod(
                BeanUtils.getDefaultPrimitiveValue(Character.TYPE));
            public Type[] getActualTypeArguments() {
            public Type getRawType() {
                BeanUtils.getDefaultPrimitiveValue(Long.TYPE));
            @Override
    @Test
 *


                BeanUtils.getGetMethod(String.class, "length", false));


    @Test

                return null;
            new Class[0],
    }
                return new Type[]{wildcardType};
        Assert.assertFalse(BeanUtils.isBooleanType(String.class));
        };
 *

    @Test
            private int getValueA() {

    @Test

 * distributed under the License is distributed on an "AS IS" BASIS,
}
                BeanUtils.getDefaultPrimitiveValue(Short.TYPE));
            "getValueC",
        Assert.assertEquals("length",
            "getValueD",
                BeanUtils.getGetMethod(String.class, "length", true));

                "valueOf", new Class<?>[]{int.class}, new Object[]{0}));

            public Type[] getLowerBounds() {
        Assert.assertFalse(BeanUtils.isGetterName(""));
        WildcardType wildcardType = new WildcardType() {
        Assert.assertEquals("setbar", BeanUtils.getSetterName("getbar"));
    }
            }
                BeanUtils.methodNameToPropertyName("setlength"));
 */
        Assert.assertEquals("bar",
            }
    public void testIsArrayType() {
            public Type[] getUpperBounds() {
        ));
        };
    public void testIsNumericType() {
        Assert.assertEquals("g", BeanUtils.methodNameToPropertyName("G"));
/*
        Assert.assertEquals(0,
                BeanUtils.propertyNameToMethodName("length"));
                return new Type[]{String.class};
        Assert.assertEquals("Length",
            @Override
            public Type getOwnerType() {
    }
        Assert.assertEquals("setbar", BeanUtils.getSetterName("isbar"));
    public void testGetGetMethod() {
    @Test
    public void testIsCollectionType() {
        Assert.assertTrue(BeanUtils.isNumericType(Short.class));

public class BeanUtilsTest {

    }
                BeanUtils.getCollectionType(parameterizedType));
            public Type[] getActualTypeArguments() {
        Assert.assertEquals(0.0,
        };
        Assert.assertThrows(NoSuchMethodException.class, () -> BeanUtils.invokeObjectDeclaredMethod(
            new Object[0]
                BeanUtils.readObjectProperty(String.class, "."));
    public void testGetPropertyNameFromGetter() {
                return 0;
    }

        Assert.assertNull(

        Assert.assertNull(
            public Type getOwnerType() {

        Assert.assertEquals("empty",
                BeanUtils.methodNameToPropertyName("isEmpty"));

    @Test
                return null;
 * Copyright (C) 2010-2025 DBeaver Corp and others


import java.lang.reflect.ParameterizedType;
    @Test
        Assert.assertEquals(String.class,

                BeanUtils.getCollectionType(parameterizedType));
        Assert.assertNull(BeanUtils.getCollectionType(null));
    }
            }
            public Type[] getActualTypeArguments() {
                BeanUtils.invokeObjectMethod("String", "length"));
    }
 * DBeaver - Universal Database Manager
            protected int getValueC() {

            public Type[] getUpperBounds() {
    }
            }
                return 789;
        Assert.assertEquals(6,

        Assert.assertEquals(String.class,
    @SuppressWarnings("unused")
                BeanUtils.getDefaultPrimitiveValue(Byte.TYPE));
        Assert.assertEquals(456, BeanUtils.invokeObjectDeclaredMethod(
import java.lang.reflect.WildcardType;
    }
        Assert.assertFalse(BeanUtils.isBooleanType(null));
            }
    @Test
        class DummyClass {
 * You may obtain a copy of the License at
        final DummyChild child = new DummyChild();
            @Override
            "getValueB",


                return new Type[0];
            new Object[0]
        Assert.assertFalse(BeanUtils.isNumericType(String.class));
    public void testGetSetMethod() {
        Assert.assertTrue(BeanUtils.isNumericType(Byte.TYPE));
                BeanUtils.getDefaultPrimitiveValue(Integer.TYPE));

        Assert.assertEquals((byte) 0,
                return new Type[]{String.class, Integer.class};
        BeanUtils.getDefaultPrimitiveValue(String.class);
        Assert.assertNull(BeanUtils.getSetMethod(String.class, "length"));
        Assert.assertEquals("length",
    }
            new Class[0],
            child,

            new Class[0],
        Assert.assertFalse(BeanUtils.isCollectionType(String.class));
            public Type getRawType() {
        Assert.assertEquals("LENGTH",
                BeanUtils.getSetMethod(String.class, "length", false));
        Assert.assertNull(BeanUtils.getSetMethod(String.class, "size"));
 * you may not use this file except in compliance with the License.
        ParameterizedType parameterizedType = new ParameterizedType() {
    @Test
            }
    public void testIsBooleanType() {
 * Unless required by applicable law or agreed to in writing, software
    public void testGetSetterName() {
            public Type getOwnerType() {
        Assert.assertEquals("get", BeanUtils.methodNameToPropertyName("Get"));
    @Test
        Assert.assertTrue(BeanUtils.isBooleanType(Boolean.TYPE));
            @Override
            @Override
        Assert.assertTrue(BeanUtils.isNumericType(Float.TYPE));
        Assert.assertNull(BeanUtils.readObjectProperty(String.class, "bar"));
            child,

    }
            }
        Assert.assertNull(BeanUtils.readObjectProperty(null, ".length"));
            public Type getRawType() {
        Assert.assertEquals("0", BeanUtils.invokeObjectMethod("String",
    @Test
        Assert.assertEquals(0L,
                return null;
                return 456;
        ParameterizedType parameterizedType = new ParameterizedType() {

    public void testGetCollectionType3() {
                BeanUtils.getDefaultPrimitiveValue(Boolean.TYPE));
            @Override

 * Licensed under the Apache License, Version 2.0 (the "License");
    @Rule
        Assert.assertTrue(BeanUtils.isBooleanType(Boolean.class));
        Assert.assertEquals((char) 0,
        }
                BeanUtils.getCollectionType(parameterizedType));
            @Override
                return null;
                return null;
            new Object[0]
        ));
            new Class[0],
    }
            "getValueA",
            new Object[0]
        Assert.assertTrue(BeanUtils.isNumericType(Double.TYPE));
        ParameterizedType parameterizedType = new ParameterizedType() {

    public void testPropertyNameToMethodName() {
        Assert.assertNull(
        Assert.assertEquals("LENGTH",

    public void testInvokeStaticMethod() throws Throwable {
        class DummyChild extends DummyClass {
    public void testGetDefaultPrimitiveValue() {
            }


        Assert.assertEquals(0.0f,
    @Test
import org.junit.Assert;

                BeanUtils.getDefaultPrimitiveValue(Double.TYPE));

import java.lang.reflect.InvocationTargetException;
            }
            }
        Assert.assertNull(BeanUtils.methodNameToPropertyName(""));
    }
                BeanUtils.getPropertyNameFromGetter("hasbar"));
        Assert.assertNull(BeanUtils.getGetMethod(String.class, "size"));
    @Test
            child,
                BeanUtils.getDefaultPrimitiveValue(Float.TYPE));

                return new Type[]{String.class, Integer.class};
    }
        Assert.assertNull(BeanUtils.readObjectProperty(String.class, ".length"));
        Assert.assertTrue(BeanUtils.isNumericType(Long.TYPE));
    @Test

        Assert.assertEquals(String.class,
            @Override
            protected int getValueB() {
                return 123;
            }
 *
            }
        }
 *     http://www.apache.org/licenses/LICENSE-2.0
import org.junit.Test;
        Assert.assertTrue(BeanUtils.isGetterName("get"));
                BeanUtils.propertyNameToMethodName("LENGTH"));
        Assert.assertEquals("bar",
        Assert.assertNull(BeanUtils.getGetMethod(String.class, "length"));
            @Override
    public void testInvokeObjectDeclaredMethod() throws Throwable {

        Assert.assertTrue(BeanUtils.isNumericType(Short.TYPE));
                return new Type[]{wildcardType};
        Assert.assertTrue(BeanUtils.isNumericType(Integer.TYPE));

        Assert.assertEquals("bar",

        Assert.assertEquals("setbar", BeanUtils.getSetterName("hasbar"));
                BeanUtils.propertyNameToMethodName("lENGTH"));
                BeanUtils.propertyNameToMethodName("Length"));
            }

        Assert.assertFalse(BeanUtils.isArrayType(String.class));





    }
        thrown.expect(IllegalArgumentException.class);
            protected int getValueC() {
 * See the License for the specific language governing permissions and
    }
    @Test
                BeanUtils.getPropertyNameFromGetter("isbar"));
    public void testReadObjectProperty()
            @Override



    @Test
            }
import org.junit.rules.ExpectedException;
            }
        };
        Assert.assertNull(BeanUtils.getSetterName("foobar"));
        ));
import org.junit.Rule;
import java.lang.reflect.Type;
        Assert.assertTrue(BeanUtils.isGetterName("has"));
        Assert.assertEquals((short) 0,
                BeanUtils.methodNameToPropertyName("getlength"));
                return new Type[0];
        Assert.assertFalse(BeanUtils.isGetterName("foo"));
        Assert.assertEquals(String.class,
            }
    }
        };
            @Override
            throws InvocationTargetException, IllegalAccessException {
        Assert.assertEquals("Length",
            }
                return null;
    @Test
 * limitations under the License.
    public void testGetCollectionType1() {
        Assert.assertNull(
                BeanUtils.getPropertyNameFromGetter("getbar"));
        Assert.assertEquals("0", BeanUtils.invokeStaticMethod(String.class,
            @Override
        Assert.assertEquals(123, BeanUtils.invokeObjectDeclaredMethod(
    public void testGetCollectionType2() {
package org.jkiss.utils;
