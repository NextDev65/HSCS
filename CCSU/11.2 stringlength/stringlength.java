class StringLength
{
  public static void main ( String[] args )
  {
    String str;
    int    len;

    str = new String( "  Elementary, m,./y dear Watson!  " );

    len = str.length();

    System.out.println("The length is: " + len );

  }
}