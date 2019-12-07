package ca.uqac.alterra.types;

import ca.uqac.alterra.database.AuthMethod;

public class AlterraUser {

    private String mUID;
    private String mEmail;
    private AuthMethod mAuthMethod;


    public AlterraUser(String UID, String email, AuthMethod authMethod){
        mUID = UID;
        mEmail = email;
        mAuthMethod = authMethod;
    }

    public String getUID(){
        return mUID;
    }

    public String getEmail(){
        return mEmail;
    }

    public AuthMethod getAuthMethod(){
        return mAuthMethod;
    }
}
