package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel { 

    @Value("12345") // Direct value injection
    private Integer hotelid; 
    
    @Value("${hotel.name}")
    private String hotelName;
    
    @Value("${hotel.address}") 
    private String hotelAddrs;
    
    @Value("${hotel.contactno}")
    private String mobileNo; // Ensure this matches data type
    
    @Value("${customer.name}")
    private String custName;
    
    @Value("#{${menu.idlyrate} + ${menu.dosarate}}") // SpEL(Spring Expression Language for Arithmatic Operation
    private Float billAmount;
    
    @Value("${os.name}")
    private String osName;
    
    @Value("${user.name}")
    private String windowUser;
    
    @Value("${path}")
    private String pathDate;

    @Override
    public String toString() {
        return "Hotel [hotelid=" + hotelid + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", mobileNo="
                + mobileNo + ", custName=" + custName + ", billAmount=" + billAmount + ", osName=" + osName
                + ", windowUser=" + windowUser + ", pathDate=" + pathDate + "]";
    }
}
