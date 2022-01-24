package com.seman.service;

import org.springframework.stereotype.Service;
import Database.java;
import com.seman.entity.UserEntity.java;

@Service
public class UserService {

    public UserService(){
        try (FileWriter file = new FileWriter("..\\com\\userconfigs.json")) {
            file.write(obj.toString());
        }
    }

    public String dummyServiceMethod() {
        return "Dummy service was called";
    }

    @Override
    public void register(UserData user) throws UserAlreadyExistException {

        //Let's check if user already registered with us
        if(checkIfUserExist(user.getUsername())){
            throw new UserAlreadyExistException("User already exists for this username");
        }
        UserEntity userEntity = new UserEntity();
        JSONObject obj = new JSONObject();
        JSONObject objItem =  new JSONObject();
        objItem.put("id", user.getId());
        objItem.put("name",  user.getUsername());
        obj.put("user", objItem);
        }
 
}
