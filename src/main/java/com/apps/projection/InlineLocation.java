/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apps.projection;

import com.apps.entity.Employee;
import com.apps.entity.Location;
import java.sql.Date;
import org.springframework.data.rest.core.config.Projection;

/**
 *
 * @author machine
 */
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
