package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.ws.WebFault;

@WebFault(name = "HinnakiriNegativeNumberFault")
public class HinnakiriNegativeNumberFormatException extends Exception {
    
	private HinnakiriNegativeNumberFormatFault faultInfo;
	
	public HinnakiriNegativeNumberFormatException() {
		this("Number is negative");
	}

    public HinnakiriNegativeNumberFormatException(String message) {
        super(message);
        
        // Set fault message
        faultInfo = new HinnakiriNegativeNumberFormatFault();
        faultInfo.setMessage(message);
    }
    
    public HinnakiriNegativeNumberFormatException(String message, 
    		HinnakiriNegativeNumberFormatFault faultInfo) {
    	super(message);
    	
    	this.faultInfo = faultInfo;
    }

    public HinnakiriNegativeNumberFormatFault getFaultInfo() {
        return faultInfo;
    }
}