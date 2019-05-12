package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    @Test
    void cheackEmail() {
        assertFalse(UserValidator.cheackEmail("hwd@jefe"));
        assertFalse(UserValidator.cheackEmail("efwfwqdqw.com"));
        assertFalse(UserValidator.cheackEmail("a@e.com"));
        assertFalse(UserValidator.cheackEmail("asdasd @dqw.com"));
        assertTrue(UserValidator.cheackEmail("fhgyg@dwe.com"));
    }

    @Test
    void cheackPassword() {
        assertFalse(UserValidator.cheackPassword("w@wd1@>"));
        assertFalse(UserValidator.cheackPassword("wdqdwqihqwd1@wqdkwqbdigiwqidgwigdigwdigqiw>"));
        assertFalse(UserValidator.cheackPassword("wdqdwqqwd1@>"));
        assertFalse(UserValidator.cheackPassword("wdqdwqASDi wd1@"));
        assertFalse(UserValidator.cheackPassword("wdqdwqihqwd(?SA"));
        assertFalse(UserValidator.cheackPassword("wdqdFehqwd1"));
        assertFalse(UserValidator.cheackPassword("wdqdSWqывwd1@>"));
        assertTrue(UserValidator.cheackPassword("asdefyFG12(?}"));
    }
}