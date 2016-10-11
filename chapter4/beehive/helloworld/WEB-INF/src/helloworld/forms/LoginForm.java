package helloworld.forms;

import org.apache.beehive.netui.pageflow.FormData;

public class LoginForm extends FormData
{

    private String username;
    private String password;

    public void setUsername(String name)
    {
        this.username = name;
    }

    public String getUsername()
    {
        return this.username;
    }

    public void setPassword(String password)
    {
        this.password= password;
    }

    public String getPassword()
    {
        return this.password;
    }
}