public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;

	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary


    	return "";
    }

    public int toDecimal()
    {
    	//Convert the binary value to decimal

    	return 0;
    }


}