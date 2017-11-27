
package com.bootcamp.jpa.repositories;

import com.bootcamp.jpa.entities.User;


public class UserRepository extends BaseRepository<User>{
  
    public UserRepository(String unitPersistence) {
        super(unitPersistence, User.class);
    }
}
