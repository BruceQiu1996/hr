package com.microsoft.Recurite.util.SMSUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import sun.misc.BASE64Encoder;

public class TokenProccessor {
	private TokenProccessor() {};
	private static final  TokenProccessor INSTANCE=new TokenProccessor();
	public static TokenProccessor getInstance() {
		return INSTANCE;
	}
	public String makeToken() {
		String tokenString=System.currentTimeMillis()+new Random().nextInt(999999)+"";
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("md5");
			byte[] bytes=digest.digest(tokenString.getBytes());
			BASE64Encoder encoder = new BASE64Encoder();
			return encoder.encode(bytes);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}
}
