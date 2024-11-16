package in.priya.main.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.priya.main.entities.User;
import in.priya.main.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	private UserRepository usr;

	@Override
	public boolean registerUser(User user)
	{
		try
		{
			usr.save(user);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
		
		
	}

	@Override
	public User loginUser(String email, String password) {
	User validuser=	usr.findByEmail(email);
	if(validuser!=null && validuser.getPassword().equals(password))
	{
		return validuser;
	}
	else
	{
		return null;
	}
		
	}
	

}
