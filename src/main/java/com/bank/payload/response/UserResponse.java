package com.bank.payload.response;

import com.bank.dao.UserDAO;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {

    List<UserDAO> users;
}
