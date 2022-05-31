package com.example.AlbumException.exception;

public class RestrictedInfoException extends Exception{
    @Override
    public String getMessage() {
        return "Error : Classified Info";
    }
}
