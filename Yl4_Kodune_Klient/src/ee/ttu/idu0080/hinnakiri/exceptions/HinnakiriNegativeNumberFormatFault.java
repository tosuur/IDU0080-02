package ee.ttu.idu0080.hinnakiri.exceptions;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HinnakiriNegativeNumberFault")
public class HinnakiriNegativeNumberFormatFault {
	private String message;

    public HinnakiriNegativeNumberFormatFault() { }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}