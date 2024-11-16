package in.priya.main.services;

import in.priya.main.entities.User;

public interface UserService 
{
	public boolean registerUser(User user);
    public User loginUser(String email,String password);
}
