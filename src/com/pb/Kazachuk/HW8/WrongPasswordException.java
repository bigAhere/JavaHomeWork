package com.pb.Kazachuk.HW8;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(){ super(); }

    public WrongPasswordException(String message){ super(message); }
}
