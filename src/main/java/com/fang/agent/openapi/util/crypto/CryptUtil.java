package com.fang.agent.openapi.util.crypto;

import java.math.BigInteger;
import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import org.apache.commons.codec.binary.Base64;

/**
 * 加密工具类
 */
public final class CryptUtil {
	
	/**
	 * DES加密
	 *
	 */
	public static String EncryptDES(String encryptString, String encryptKey) throws Exception
    {
    	byte[] key = encryptKey.getBytes("UTF-8");
        DESKeySpec dks = new DESKeySpec(key);

        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey securekey = keyFactory.generateSecret(dks);

        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");

        IvParameterSpec iv = new IvParameterSpec(encryptKey.getBytes("UTF-8"));
        cipher.init(Cipher.ENCRYPT_MODE, securekey, iv);

        byte[] src = encryptString.getBytes("UTF-8");
        src = cipher.doFinal(src); 
        
        Base64 base64 = new Base64();  
        return new String(base64.encode(src));
    }
	
	/**
	 * MD5加密
	 *
	 */
	public static String Md5Encrypt(String encryptStr) {
		try{
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.reset();
			m.update(encryptStr.getBytes());
			byte[] digest = m.digest();
			BigInteger bigInt = new BigInteger(1,digest);
			String hashtext = bigInt.toString(16);
			while(hashtext.length() < 32 ){
			  hashtext = "0" + hashtext;
			}
			
			return hashtext;
		}
		catch (Exception e) {
			return null;
		}
	}

}
