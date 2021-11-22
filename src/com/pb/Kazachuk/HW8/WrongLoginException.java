package com.pb.Kazachuk.HW8;

public class WrongLoginException extends Exception {

    public WrongLoginException(){ super(); }

    public WrongLoginException(String message){ super(message); }
}
