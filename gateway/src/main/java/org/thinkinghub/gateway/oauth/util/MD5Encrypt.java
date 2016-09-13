package org.thinkinghub.gateway.oauth.util;

import java.security.MessageDigest;

public class MD5Encrypt {
	public MD5Encrypt() {
	}

	/**
	 * ת���ֽ�����Ϊ16�����ִ�
	 * 
	 * @param b
	 *            �ֽ�����
	 * @return 16�����ִ�
	 */
	public static String byteArrayToString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			// resultSb.append(byteToHexString(b[i]));//��ʹ�ñ�����ת����ɵõ����ܽ����16���Ʊ�ʾ����������ĸ��ϵ���ʽ
			resultSb.append(byteToNumString(b[i]));// ʹ�ñ������򷵻ؼ��ܽ����10���������ִ�����ȫ������ʽ
		}
		return resultSb.toString();
	}

	private static String byteToNumString(byte b) {

		int _b = b;
		if (_b < 0) {
			_b = 256 + _b;
		}

		return String.valueOf(_b);
	}

	public static String MD5Encode(String origin) {
		String resultString = null;

		try {
			resultString = new String(origin);
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToString(md.digest(resultString.getBytes()));
		} catch (Exception ex) {

		}
		return resultString;
	}
	public static void main(String[] args){
		String str = "eyJuaWNrbmFtZSI6Inp5eWV0dGllIiwiaGVhZEltYWdlIjoiaHR0cDovL3R2YTMuc2luYWltZy5j%20%20bi9jcm9wLjcuNy4xMTIuMTEyLjUwLzU0MmVlMDZmancxZXg2dHFxbHdvN2oyMDNjMDNjZ2xsLmpw%20%20ZyIsInNlcnZpY2UiOiJXRUlCTyIsInJldHVybl9jb2RlIjowLCJ1aWQiOiIxNDEyMzU4MjU1Iiwi%20%20ZXJyb3JfY29kZSI6MH0=";
		System.out.println(MD5Encode(str));
	}
}