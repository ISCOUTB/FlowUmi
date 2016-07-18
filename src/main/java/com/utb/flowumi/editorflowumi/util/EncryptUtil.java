/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utb.flowumi.editorflowumi.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author iabaños
 */
public class EncryptUtil {

    public static String encryptPassword(String data) throws NoSuchAlgorithmException {
        if (data == null) {
            return null;
        }
        MessageDigest md = MessageDigest.getInstance("SHA1");
        md.update(data.getBytes());
        byte[] digest = md.digest();
        StringBuilder buf = new StringBuilder();
        for (byte b : digest) {
            buf.append((Character.forDigit((b & 0xF0) >> 4, 16)));
            buf.append((Character.forDigit((b & 0xF), 16)));
        }
        return buf.toString();
    }

    public static boolean comparePassword(String password, String encryptedPassword) throws NoSuchAlgorithmException {
        return encryptedPassword.equals(encryptPassword(password));
    }
}
