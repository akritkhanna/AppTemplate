package com.example.akritapp.api;

public class Resources<T> {
       private final T data;
       private final States state;
       private final String errorMessage;
       private final int requestCode;


       public Resources(T data, States state, String errorMessage, int requestCode) {
              this.data = data;
              this.state = state;
              this.errorMessage = errorMessage;
              this.requestCode = requestCode;
       }

       public int getRequestCode() {
              return requestCode;
       }

       public T getData() {
              return data;
       }

       public States getState() {
              return state;
       }

       public String getErrorMessage() {
              return errorMessage;
       }

}
