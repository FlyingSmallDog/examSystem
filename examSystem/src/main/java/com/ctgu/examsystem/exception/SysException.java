package com.ctgu.examsystem.exception;


public class SysException extends Exception {
    public SysException(){

    }
    public SysException(String message){
        super(message);
    }
    public SysException(String message, Throwable cause){
        super(message,cause);
    }
    public SysException(Throwable cause){
        super(cause);
    }
}
