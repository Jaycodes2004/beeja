package com.beeja.api.filemanagement.utils;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class UserContextTest {

  @Test
  void testSetLoggedInUser() {
    String email = "abc@example.com";
    String name = "abc";
    String employeeId = "123456";

    Set<String> permissions = new HashSet<>();
    permissions.add("READ_EMPLOYEE");

    UserContext.setLoggedInUser(email, name, employeeId, new HashMap<>(), permissions);

    assertEquals(email, UserContext.getLoggedInUserEmail());
    assertEquals(name, UserContext.getLoggedInUserName());

    assertEquals(employeeId, UserContext.getLoggedInEmployeeId());

    assertEquals(permissions, UserContext.getLoggedInUserPermissions());
  }
}
