package com.zhuxinhong.utils;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexUtils {
	private static final String URL_REGEX = "(\"|')([a-zA-z]+://[^\\s]*)(\"|')";
	private static final String A_HREF_REGEX = "href[ \\s]*=[ \\s]*+\"([^\"]*)\"";
	private static final String A_DOWN_REGEX = "href[ \\s]*=[ \\s]*+\"([^\"]*\\.(?:exe|7z|gzip|zip|msi|rar|sis))[ \\s]*\"";

	public static boolean wildMatch(String pattern, String str) {
		pattern = toJavaPattern(pattern);
		return Pattern.matches(pattern, str);
	}

	public static String getMatchString(String wildcard, String str) {
		String javaPattern = toJavaPattern(wildcard);
		Pattern pattern = Pattern.compile(javaPattern);
		Matcher m = pattern.matcher(str);
		if (m.find()) {
			return m.group(0).trim();
		}
		return "";
	}

	public static Set<String> getMatchUrl(String str) {
		Set<String> urls = new HashSet<String>();

		if (str == null) {
			return urls;
		}

		Pattern pattern = Pattern.compile(A_HREF_REGEX);
		Matcher m = pattern.matcher(str);
		while (m.find()) {
			urls.add(m.group(2).trim());
		}
		return urls;
	}

	public static Set<String> getMatchDownloadUrl(String str) {
		Set<String> urls = new HashSet<String>();

		if (str == null) {
			return urls;
		}

		Pattern pattern = Pattern.compile(A_DOWN_REGEX);
		Matcher m = pattern.matcher(str);
		while (m.find()) {
			urls.add(m.group(1).trim());
		}
		return urls;
	}

	/**
	 * 做了最简单的通配符,正则表达式转换
	 * 
	 * @param pattern
	 * @return
	 */
	private static String toJavaPattern(String pattern) {
		// pattern=pattern.replace('?','.');
		pattern = pattern.replace("*", ".*");
		return pattern;
	}

	/**
	 * 取url相对路径,获得页面上可能出现的下载地址
	 * 
	 * @param url
	 * @return
	 */
	public static String getUrlPattern(String url) {
		if (url.indexOf("/") > 0) {
			url = url.replace(url.substring(0, url.lastIndexOf("/") + 1), ".*");
		}
		return url;
	}

	/**
	 * 取url的http根
	 * 
	 * @param url
	 * @return
	 */
	public static String getHttpRoot(String url) {
		String newUrl = "";
		newUrl = url.substring(0, url.indexOf("/", 7));
		return newUrl;
	}

	public static Integer getInteger(String str){


		Pattern pattern = Pattern.compile("[^0-9]");
		Matcher matcher = pattern.matcher(str);
		String all = matcher.replaceAll("");
		return Integer.valueOf(all);
	}


}
