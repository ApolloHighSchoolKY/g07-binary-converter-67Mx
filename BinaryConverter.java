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

    public String getBinary()
    {
        return binaryValue;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary
        int halfIt=128;
        String totalBin="";
        for (int i=0; i<8; i++)
        {
            if (value-halfIt>-1)
            {
                value-=halfIt;
                totalBin+="1";
            }
            else if (value-halfIt<0)
            {
                totalBin+="0";
            }
            halfIt/=2;
        }

    	return totalBin + " toBin";
    }

    public int toDecimal()
    {
    	//Convert the binary value to decimal
        int decVal=0;
        int decNum=128;
        for (int i=0; i<binaryValue.length(); i++)
        {
            if (binaryValue.charAt(i)=='1')
                decVal+=decNum;
            decNum/=2;
        }
    	return decVal;
    }


}