package io.mutexware.ihome.throwable;

/**
 * Created by tymur on 8/11/16.
 */
public class DuplicateUserException extends RuntimeException {

    public DuplicateUserException(String message) {
        super(message);
    }

}
