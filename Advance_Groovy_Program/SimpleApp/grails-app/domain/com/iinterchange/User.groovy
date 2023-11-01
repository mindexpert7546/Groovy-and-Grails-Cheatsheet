package com.iinterchange
import groovy.transform.EqualsAndHashCode;
@EqualsAndHashCode(includes='username');

class User  implements Serializable {
    String userName;

    String password;

    boolean enable = true;

    boolean isAccountExpired;

    boolean isAccountLocked;

    boolean isPasswordExpired;

    Set<Role> getAuthorities(){
      
    }

    static constraints = {
        password nullable:false, blank:false;
        userName nullable:false, blank:false;

    }

    static mappings = {
      password column: '`password`'
    }
}
