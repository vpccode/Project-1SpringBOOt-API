package com.jpaspring.jpaspring.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jpaspring.jpaspring.Model.UserModel;

public interface UserResponse extends JpaRepository <UserModel,Integer>
{
    
}
