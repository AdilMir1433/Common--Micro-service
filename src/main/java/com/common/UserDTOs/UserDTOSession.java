package com.common.UserDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class UserDTOSession {
    private UserDTO user;
    public void removeSessionData(){
        this.user = null;
    }
}
