package com.pb.Kazachuk.HW8;

import java.util.Objects;

public class Auth {

    protected String loginSaved;
    protected String passwordSaved;

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if(login.length() < 5 && login.length() > 20){
            throw new WrongLoginException("Your login should contain from 5 to 20 symbols");
        }

        if(login.matches("\\W+") || login.contains("_")){
            throw new WrongLoginException("Your login should contain only latin letters and numbers");
        }
        if(password.length() <= 5){
            throw new WrongPasswordException("Password should contain more that 5 characters");
        }
        if(password.matches("\\W+")){
            throw new WrongPasswordException();
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("ConfirmPassword isn't equal to you password");
        };

        loginSaved = login;
        passwordSaved = password;
    }

    public void signIn(String login, String password) throws WrongLoginException{
        if(!login.equals(loginSaved) || !password.equals(passwordSaved)){
            throw new WrongLoginException("Your login or password is incorrect, please, try again");
        }
    }
}
