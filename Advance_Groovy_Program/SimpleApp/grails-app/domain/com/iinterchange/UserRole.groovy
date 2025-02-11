package com.iinterchange
import grails.gorm.MultiTenant

class UserRole implements MultiTenant<Plan> {

   String roleName;
   String userName;
}
