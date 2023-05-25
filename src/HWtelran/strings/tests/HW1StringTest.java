package HWtelran.strings.tests;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;

class HW1StringTest  {

	@Test
	void compareToTest() {
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		String myStr3 = "Hello Yuriy";
		assertEquals(0, myStr1.compareTo(myStr2));
		assertEquals(-6, myStr1.compareTo(myStr3));
		assertEquals(6, myStr3.compareTo(myStr2));
	}
	@Test
	void   charAtTest() {
		String myStr4 = "HelloW";
		assertEquals('l',myStr4.charAt(2));
		assertEquals('H',myStr4.charAt(0));
	}
	@Test
	void   codePointAtTest() {
		String myStr4 = "HelloW";
		assertEquals(101,myStr4.charAt(1));
		assertEquals(72,myStr4.codePointAt(0));
	}
	@Test
	void   codePointBeforeTest() {
		String myStr4 = "HelloW";
		assertEquals(72,myStr4.codePointBefore(1));
	}
	@Test
	void   codePointCountTest() {
		String myStr4 = "HelloW";
		assertEquals(5,myStr4.codePointCount(0, 5));
		assertEquals(4,myStr4.codePointCount(1, 5));
		assertEquals(0,myStr4.codePointCount(0, 0));
		
	}
	@Test
	void   compareToIgnoreCaseTest() {
		String myStr6 = "helloWord";
		String myStr5 = "HELLO";
		String myStr7 = "hello";
		assertEquals(0,myStr5.compareToIgnoreCase(myStr7));
		assertEquals(-4,myStr5.compareToIgnoreCase(myStr6));
		assertEquals(4,myStr6.compareToIgnoreCase(myStr5));
	}
	@Test
	void   concatTest() {
		String firstName = "Oxana ";
		String lastName = "Spivak";
		assertEquals("Oxana Spivak",firstName.concat(lastName));
	}
	@Test
	void   containsTest() {
		String myStr = "HELLO Word";
		assertEquals(true, myStr.contains("HE"));
		assertEquals(false, myStr.contains("He"));
		assertEquals(true, myStr.contains(" W"));
		assertTrue(myStr.contains("H"));
		assertFalse(myStr.contains("h"));
		assertTrue(myStr.contains("ELLO"));
		assertFalse(myStr.contains("lelo"));
		//assertFalse("not contains ", myStr.contains("Hi"));
	}
	@Test
	void   contentEqualsTest()  {
		String str = "java";
		assertTrue(str.contentEquals("java"));
		assertFalse(str.contentEquals("JAVA"));
		assertFalse(str.contentEquals("h"));
	}
	@Test
	void copyValueOfTest()  {
		char[] str1 = {'H', 'e', 'l', 'l', 'o'};
		String str2 = "New messege from str1";
		assertEquals("Hel", str2.copyValueOf(str1, 0, 3));
		assertEquals("Hello", str2.copyValueOf(str1, 0, 5));
		assertEquals("", str2.copyValueOf(str1, 0, 0));
	}
	@Test
	void endsWithTest() {
	String str3 = "javaHello";
	assertTrue(str3.endsWith("ello"));
	assertFalse(str3.endsWith("lello"));
	}
	@Test
	void  equalsTest() {
		String tstr = "java";
		String str  = "java";
		String fstr = "Java";
		assertTrue(str.equals(tstr));
		assertFalse(str.equals(fstr));
	}
	@Test
	void equalsIgnoreCaseTest() {
		String str  = "java";
		String tstr = "Java";
		String tstr1 = "JAVA";
		assertTrue(str.equalsIgnoreCase(tstr));
		assertTrue(str.equalsIgnoreCase(tstr1));
	}
//	@Test
//	void  formatTest() {
//		assertEquals("5.678",format("value is %f",5.678));
//		assertEquals("5.678000",format("value is %5.6f",5.678));
//	}
//	only int for HW
	@Test
	void  hashCodeTest() {
		String astr = "a";
		String str = "abs d";
		assertEquals(97,astr.hashCode());
		assertEquals(92612662,str.hashCode());
	}
	@Test
	void indexOfTest() {
		String myStr = "Hello planet earth, you are a great planet.";
		assertEquals(6, myStr.indexOf("planet"));
		assertEquals(1, myStr.indexOf("e")); // eq 125
		assertTrue(1==myStr.indexOf("e"));   // eq 124
	}
	@Test
	void  isEmptyTest() {
		String str = "a";
		String str1 = "";
		String str2 = "   ";
		assertTrue(str1.isEmpty());
		assertFalse(str.isEmpty());
		assertFalse(str2.isEmpty());
	}
	@Test
	void lastIndexOfTest() {
		String myStr = "Hello planet earth, you are a great planet.";
		assertEquals(36, myStr.lastIndexOf("planet"));
		assertEquals(40, myStr.lastIndexOf("e")); // eq 141
		assertTrue(40==myStr.lastIndexOf("e"));   // eq 140
	}
	@Test
	void lengthTest() {
		String myStr = "Hello planet earth, you are a great planet.";
		String str  = "java";
		String str1  = "java   ";
		assertEquals(43, myStr.length());
		assertEquals(4, str.length());
		assertEquals(7, str1.length());
		//assertEquals(4, length("kuku")); /not type for HW
	}
	@Test
	void  matchesTest() {
		String regText = "aaaatrue !!!!";
		String reg = "12N-4321";
		assertTrue(reg.matches("^\\d{2}N-\\d{4}$"));
		assertTrue(regText.matches("(.*)true(.*)"));
	}
	@Test
	void  regionMatchesTest() {
		String regText1 = "kukuaaatrue-lyalya!!!!";
		String regText2 = "kukuaaaTRUE-lyalya!!!!";
		assertTrue(regText1.regionMatches(true, 0, regText2, 0, 22));
		assertFalse(regText1.regionMatches( 0, regText2, 0, 22));
	}
	@Test
	void startsWithTest() {
		String str = "javaHello";
		assertTrue(str.startsWith("java"));
		assertFalse(str.startsWith("ava"));
		assertFalse(str.startsWith("Java"));
	}
	@Test
	void trimTest() {
		String str = "     javaHello  ";
		assertEquals("javaHello", str.trim());
	}
}
