package com.apps.projection;

import com.apps.entity.Employee;
import com.apps.entity.Location;
import java.sql.Date;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "inlineLocation", types = {Employee.class})
public interface InlineLocation {
    
    Integer getId();
    String getFirstName();
    String getSubDivision();
    String getLastName();
    String getStatus();
    String getGender();
    Date getSuspendDate();
    Date getDob();
    Date getHiredDate();
    String getNationality();
    String getGrade();
    String getMaritalStatus();
    String getDivision();
    String getPhone();
    String getEmail();
    Location getLocation();
    String getImagePath();

}
