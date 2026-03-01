            System.out.println(e.getMessage());
            e.printStackTrace();
                tmp = _chiperCrypt.doFinal(tmp);
            return "";
            _chiperCrypt = javax.crypto.Cipher.getInstance("Blowfish/ECB/NoPadding");
                byte[] tmp = Arrays.copyOfRange(inData, rounded * 8, (rounded * 8) + left);
                for (int j = 0; j < tmp.length; j++) {
 *
    {
                xorBytes(tmp, CV);
            _chiperCrypt.init(javax.crypto.Cipher.ENCRYPT_MODE, keySpec);

            keySpec = new SecretKeySpec(key, "Blowfish");
    }
            }
 * Copyright (C) 2010-2025 DBeaver Corp and others
            }
 * limitations under the License.
        } catch (Exception e) {

import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
    private void xorBytes(byte[] a, byte[] b, int l)
                for (int j = 0; j < CV.length; j++) {
            }
                    ret[rounded * 8 + j] = tmp[j];

        } catch (Exception e) {
            return null;
            md.update(NAVICAT_CODE.getBytes("US-ASCII"), 0, NAVICAT_CODE.length());
        }
                    CV[j] = (byte) (CV[j] ^ inData[i * 8 + j]);
/*
                CV = _chiperCrypt.doFinal(CV);
            int rounded = Math.floorDiv(inData.length, 8);
    {
            return new String(outData);
        for (int i = 0; i < l; i++) {
            byte[] initVec = CommonUtils.parseHexString("FFFFFFFFFFFFFFFF");
 * Unless required by applicable law or agreed to in writing, software
                tmp = _chiperDecrypt.doFinal(tmp);
            byte[] outData = encrypt(inData);
            e.printStackTrace();
            byte[] ret = new byte[inData.length];
 * Licensed under the Apache License, Version 2.0 (the "License");
    {
        try {

        try {
            _chiperDecrypt = javax.crypto.Cipher.getInstance("Blowfish/ECB/NoPadding");
            byte[] CV = Arrays.copyOf(_iv, _iv.length);
            if (left != 0) {
                for (int j = 0; j < tmp.length; j++) {

            byte[] key = md.digest();
            byte[] inData = CommonUtils.parseHexString(hexString);
                }
    }
 * DBeaver - Universal Database Manager
    {
            MessageDigest md = MessageDigest.getInstance("SHA1");
        }
            System.out.println(e.getMessage());
            for (int i = 0; i < rounded; i++) {

        try {

                }
            a[i] = (byte) (aVal ^ bVal); // xor aVal and bVal and typecast to
        }
    }
    private byte[] encrypt(byte[] inData)

            byte[] CV = Arrays.copyOf(_iv, _iv.length);

}

            int bVal = b[i] & 0xff;
                                         // byte
    private static final String NAVICAT_CODE = "3DC5CA39";
            byte[] ret = new byte[inData.length];
        try {
public class NavicatEncrypt {
                }
        for (int i = 0; i < (a.length); i++) {

    }
                xorBytes(tmp, CV, left);
 *
    }
            int aVal = a[i] & 0xff; // convert byte to integer
            int left = inData.length % 8;

    private void initChiperDecrypt()
            System.out.println(e.getMessage());

    private SecretKeySpec keySpec;
 * See the License for the specific language governing permissions and
            System.out.println(e.getMessage());
            System.out.println(e.getMessage());
        try {
    public NavicatEncrypt()
            a[i] = (byte) (aVal ^ bVal); // xor aVal and bVal and typecast to
            e.printStackTrace();
 *
    private byte[] _iv;
            if (left != 0) {
 * You may obtain a copy of the License at
        try {
        }
            // Must use NoPadding
                for (int j = 0; j < tmp.length; j++) {
                }
                    ret[rounded * 8 + j] = tmp[j];
 * you may not use this file except in compliance with the License.
    private javax.crypto.Cipher _chiperCrypt;
    {
        } catch (Exception e) {

            _chiperDecrypt.init(javax.crypto.Cipher.DECRYPT_MODE, keySpec);
        initIV();

    {
            byte[] outData = decrypt(inData);
    {
            System.out.println(e.getMessage());

    }
            byte[] inData = inputString.getBytes("US-ASCII");
    private void initIV()
            return CommonUtils.toHexString(outData);
    }

            int aVal = a[i] & 0xff; // convert byte to integer
                byte[] tmp = Arrays.copyOfRange(inData, i * 8, (i * 8) + 8);


        initChiperDecrypt();

    private byte[] decrypt(byte[] inData)
    }

package org.jkiss.dbeaver.ui.config.migration.wizards.navicat;
        } catch (Exception e) {

            // Must use NoPadding
import java.util.Arrays;
            for (int i = 0; i < rounded; i++) {
    private javax.crypto.Cipher _chiperDecrypt;
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
            }
    }
                xorBytes(tmp, CV);
        try {
    {
        }
        }
    {
            System.out.println(e.getMessage());
    private void initChiperEncrypt()
        } catch (Exception e) {
    public String encrypt(String inputString)
 */
        }
                CV = _chiperDecrypt.doFinal(CV);
            e.printStackTrace();
            e.printStackTrace();
            System.out.println(e.getMessage());


                }
                                         // byte
                for (int j = 0; j < tmp.length; j++) {
    private void xorBytes(byte[] a, byte[] b)
    public String decrypt(String hexString)
 *     http://www.apache.org/licenses/LICENSE-2.0
        } catch (Exception e) {
 * distributed under the License is distributed on an "AS IS" BASIS,
            e.printStackTrace();

        }
            int rounded = Math.floorDiv(inData.length, 8);
        try {
    private void initKey()

        }
            e.printStackTrace();
        } catch (Exception e) {
        }

import org.jkiss.utils.CommonUtils;
                byte[] tmp = Arrays.copyOfRange(inData, rounded * 8, (rounded * 8) + left);
                byte[] tmp = Arrays.copyOfRange(inData, i * 8, (i * 8) + 8);
            return "";
                    ret[i * 8 + j] = tmp[j];
            e.printStackTrace();
            int bVal = b[i] & 0xff;



    {
                    ret[(i * 8) + j] = tmp[j];
                xorBytes(CV, tmp);
            return ret;
            int left = inData.length % 8;
        } catch (Exception e) {

                xorBytes(tmp, CV, left);
    }
            return ret;
            return null;


    {
        initChiperEncrypt();
            _iv = _chiperCrypt.doFinal(initVec);
    }
        initKey();
