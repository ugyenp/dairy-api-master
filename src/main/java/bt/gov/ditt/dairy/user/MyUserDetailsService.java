//package bt.gov.ditt.dairy.user;
//
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import bt.gov.ditt.dairy.model.User;
//import bt.gov.ditt.dairy.repository.UserRepository;
//
//@Service
//public class MyUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	UserRepository userRepository;
//	
//	@Override
//	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
//		Optional<User> user = userRepository.findByUserName(userName);
//		
//		user.orElseThrow(() -> new UsernameNotFoundException("Not found:" + userName));
//		return user.map(MyUserDetails::new).get();
//	}
//
//}
