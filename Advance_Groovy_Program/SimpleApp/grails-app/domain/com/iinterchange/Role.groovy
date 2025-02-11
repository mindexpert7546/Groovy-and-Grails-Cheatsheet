package com.iinterchange;
import grails.gorm.MultiTenant;
import groovy.transform.EqualsAndHashCode;

@EqualsAndHashCode(includes='rolename');

class Role implements Serializable{

    String roleName;

    static constraints = {
        roleName nullable:false, blank:false,unique:true;

    }

    static mappings = {
      cache true;
    }
}
