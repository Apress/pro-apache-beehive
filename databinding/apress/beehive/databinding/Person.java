package apress.beehive.databinding;

import java.io.Serializable;

public class Person implements Serializable
{
	public Person()
	{
	}

	public Person(String id, String fname, String lname, String phone, String email,String state)
	{
		this.id=id;
		this.firstName=fname;
		this.lastName=lname;
		this.phone=phone;
		this.email=email;
		this.state=state;
	}

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

     public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getState()
	    {
	        return state;
	    }

	    public void setState(String state)
	    {
	        this.state = state;
    }


public String getStateName(String acronym)
	{
		if(acronym.equalsIgnoreCase("ca"))
		{
			return "California";
		}
		else if(acronym.equalsIgnoreCase("NY"))
		{
			return "New York";
		}
		else {
			return "Unknown";
		}

	}

    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String state;

}
