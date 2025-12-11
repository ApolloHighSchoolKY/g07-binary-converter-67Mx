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
    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public int getValue()
    {
    	return value;
    }

    public void setBinary(String newBinary)
    {
        binaryValue=newBinary;
    }

    public String getBinary()
    {
        return binaryValue;
    }

    public String toBinary()
    {
    	//Convert the integer value to binary
        String totalBin="";
        for (int i=7; i>-1; i--)
        {
            if (value-Math.pow(2, i)>-1)
            {
                value-=Math.pow(2, i);
                totalBin+="1";
            }
            else
            {
                totalBin+="0";
            }
        }

    	return totalBin;
    }

    public int toDecimal()
    {
    	//Convert the binary value to decimal
        int decVal=0;
        for (int i=0; i<binaryValue.length(); i++)
        {
            if (binaryValue.charAt(i)=='1')
                decVal+=Math.pow(2, 7-i);
        }
    	return decVal;
    }

    public String toString()
    {
        return "" + "The binary value of " + getValue() + " is " + toBinary() + "\n"
                  + "The decimal value of " + getBinary() + " is " + toDecimal();
    }

}