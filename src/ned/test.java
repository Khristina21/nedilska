public class StringUtilsJUnit3Test extends TestCase {
  private final Map toHexStringData = new HashMap();

  protected void setUp() throws Exception {
    toHexStringData.put("", new byte[0]);
    toHexStringData.put("01020d112d7f", new byte[] { 1, 2, 13, 17, 45, 127 });
    toHexStringData.put("00fff21180", new byte[] { 0, -1, -14, 17, -128 });
    //...
  }

  protected void tearDown() throws Exception {
    toHexStringData.clear();
  }

  public void testToHexString() {
    for (Iterator iterator = toHexStringData.keySet().iterator(); iterator.hasNext();) {
      final String expected = (String) iterator.next();
      final byte[] testData = (byte[]) toHexStringData.get(expected);
      final String actual = StringUtils.toHexString(testData);
      assertEquals(expected, actual);
    }
  }

  //...
}
