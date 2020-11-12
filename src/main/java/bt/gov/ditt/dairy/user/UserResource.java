//package bt.gov.ditt.dairy.user;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import bt.gov.ditt.dairy.model.AuthenticationResponse;
//import bt.gov.ditt.dairy.model.User;
//
//@RestController
//public class UserResource {
//	@Autowired
//	private AuthenticationManager authenticationManager;
//	
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	@Autowired
//	private JwtUtil jwtTokenUtil;
//	
//	
//	@RequestMapping(value="/authenticate", method = RequestMethod.POST)
//	public ResponseEntity<?> CreateAuthenticationToken(@RequestBody User user) throws Exception{
//		try {
//			authenticationManager.authenticate(
//					new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword())
//					);
//		}
//		catch(BadCredentialsException e){
//			throw new Exception("Incorrect username and password", e);
//		}
//		
//		
//		final UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUserName());
//		final String jwt = jwtTokenUtil.generateToken(userDetails);
//		return ResponseEntity.ok(new AuthenticationResponse(jwt));
//	}
//	
//
//}
