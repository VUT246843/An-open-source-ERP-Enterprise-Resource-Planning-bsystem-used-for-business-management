
 */
  public void testGenerateRandomLong() throws Exception {
  public void testGeneratePassword() throws Exception {
  @PrepareForTest(SecurityUtils.class)
//@RunWith(PowerMockRunner.class)
  public void testGenerateUniqueId() throws Exception {
 * limitations under the License.
    Assert.assertArrayEquals(new byte[]{(byte)0, (byte)0, (byte)0}, SecurityUtils.generateRandomBytes(3));
    final InetAddress inetAddress = PowerMockito.mock(InetAddress.class); 
    Assert.assertEquals(0L, SecurityUtils.generateRandomLong());


  public void testGenerateRandomBytes() throws Exception {
  @Test
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(0, 1, 2, 3, 4, 5, 6, 7);
    final SecureRandom random = PowerMockito.mock(SecureRandom.class);
    PowerMockito.mockStatic(MessageDigest.class);
    final SecureRandom random = PowerMockito.mock(SecureRandom.class);

  }
 * DBeaver - Universal Database Manager
  @Test

  @PrepareForTest(SecurityUtils.class)
    PowerMockito.whenNew(Random.class).withParameterTypes(long.class).withArguments(anyLong()).thenReturn(random);
  }
    PowerMockito.when(random.nextLong()).thenReturn(0L);

    Assert.assertEquals("6AtQFwmJUPxYqtg8jBSXjg==", SecurityUtils.makeDigest("abc", "def"));
    PowerMockito.spy(System.class);

    Assert.assertEquals("kAFQmDzST7DWlj99KOF/cg==", SecurityUtils.makeDigest("abc"));
/*
    Assert.assertEquals("2sdukq4l", SecurityUtils.generateUniqueId());
 * Unless required by applicable law or agreed to in writing, software
    final SecureRandom random = PowerMockito.mock(SecureRandom.class);
    PowerMockito.doAnswer((i) -> { return null; }).when(random).nextBytes(any(byte[].class));
    PowerMockito.whenNew(SecureRandom.class).withNoArguments().thenReturn(random);
    Assert.assertEquals("kAFQmDzST7DWlj99KOF/cg==", SecurityUtils.makeDigest("abc", null));
    PowerMockito.mockStatic(InetAddress.class); 

    final Random random = PowerMockito.mock(Random.class);
  @PrepareForTest(SecurityUtils.class) 
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(-1);

    Assert.assertEquals(new Random(0L), SecurityUtils.getRandom());
  @Test
public class SecurityUtilsTest extends DBeaverUnitTest {
    PowerMockito.when(MessageDigest.getInstance(anyString())).thenThrow(new NoSuchAlgorithmException());
  }
    final SecureRandom secureRand = PowerMockito.mock(SecureRandom.class);
  }

    Assert.assertEquals("ABCDEFGH", SecurityUtils.generatePassword());
    PowerMockito.whenNew(SecureRandom.class).withNoArguments().thenReturn(secureRand);

    Assert.assertEquals("E4983893-E6DF-7079-B59B-6888EBD6ADC1", SecurityUtils.generateGUID(true));
}
    }
    Assert.assertEquals("*", SecurityUtils.makeDigest("abc", "def"));
  @Test
 * See the License for the specific language governing permissions and
    Assert.assertEquals("*", SecurityUtils.makeDigest("abc"));
    final SecureRandom random = PowerMockito.mock(SecureRandom.class);
    PowerMockito.when(secureRand.nextLong()).thenReturn(0L);

    PowerMockito.whenNew(SecureRandom.class).withNoArguments().thenReturn(random);
import org.junit.Test;
  public void testGetRandom() throws Exception {
    PowerMockito.when(System.currentTimeMillis()).thenReturn(100L);
 *
 * You may obtain a copy of the License at
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  @Test
    Assert.assertEquals("214F4B5E-FA60-A781-43E1-E58F9EF1808C", SecurityUtils.generateGUID(false));
 * distributed under the License is distributed on an "AS IS" BASIS,
    PowerMockito.when(inetAddress.getHostName()).thenReturn("localhost"); 
  }

    Assert.assertEquals("826ACF9F-7283-7548-3C25-044D0AC2477B", SecurityUtils.generateGUID(true));
 * you may not use this file except in compliance with the License.
    PowerMockito.when(inetAddress.getLocalHost()).thenThrow(new UnknownHostException());

 *
    PowerMockito.whenNew(SecureRandom.class).withNoArguments().thenReturn(random);
 * Licensed under the Apache License, Version 2.0 (the "License");
/*
  }
    PowerMockito.mockStatic(System.class);

  public void testGenerateGUID() throws Exception {
    PowerMockito.when(MessageDigest.getInstance(anyString())).thenThrow(new NoSuchAlgorithmException());
  @PrepareForTest(SecurityUtils.class) 
    @Test

  @Test

    PowerMockito.whenNew(SecureRandom.class).withNoArguments().thenReturn(random);
package org.jkiss.utils;
  @PrepareForTest(SecurityUtils.class)
    Assert.assertEquals("2sk6q0t3", SecurityUtils.generateUniqueId());
    PowerMockito.when(System.currentTimeMillis()).thenReturn(100L);
  @Test
  @PrepareForTest(SecurityUtils.class) 
  }
  @PrepareForTest(SecurityUtils.class) 
    PowerMockito.mockStatic(MessageDigest.class);

 *     http://www.apache.org/licenses/LICENSE-2.0
    public void dummyTest() throws Exception {
*/

    PowerMockito.when(random.nextLong()).thenReturn(0L);
 * Copyright (C) 2010-2024 DBeaver Corp and others
    PowerMockito.when(InetAddress.getLocalHost()).thenReturn(inetAddress); 
  public void testMakeDigest() throws Exception {
    final Random random = PowerMockito.mock(Random.class);
    PowerMockito.when(random.nextInt(anyInt())).thenReturn(1);

import org.jkiss.junit.DBeaverUnitTest;
    PowerMockito.doAnswer((i) -> { return null; }).when(random).nextBytes(any(byte[].class));
 *
