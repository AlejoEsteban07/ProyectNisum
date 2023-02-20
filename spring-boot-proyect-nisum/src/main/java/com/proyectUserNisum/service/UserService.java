package com.proyectUserNisum.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectUserNisum.model.User;
import com.proyectUserNisum.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public Map<String, Object> userRegistration(User user){
		User userResponse = new User();
		Map<String, Object> response = new HashMap<>();
		try {
			if(validateEmail(user)) {
				response.put("mensaje", "El correo ya se encuentra registrado");	
				return response;				
			}
			else {
				
				// Patron para validar el email
		        Pattern pattern = Pattern
		                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");				
		        Matcher mather = pattern.matcher(user.getEmail());
		        if (mather.find() == true) {
		        	// Patron para validar password. Contraseña de 4 a 8 caracteres y debe contener números, letras minúsculas y mayúsculas
		            String PASSWORD_VALIDATE =  "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";
		            Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_VALIDATE);
		         // Validar una contraseña
		            if (PASSWORD_PATTERN.matcher(user.getPassword()).matches()) {
						LocalDateTime now = LocalDateTime.now();
						userResponse = userRepository.save(user);	
						userResponse.setCreatedUser(now);
						userResponse.setModifiedUser(now);
						userResponse.setLastLogin(now);
						userResponse.setToken("12345asfdghhjgh");
						//Activo = 1, Inactivo = 0
						userResponse.setIsActive(1);
						response.put("mensaje", userResponse);	
						return response;
		            }
		            else {
		            	response.put("mensaje", "La contraseña debe ser de 4 a 8 caracteres y debe contener números, letras minúsculas y mayúsculas");	
						return response;
		            }		        			        	
		        } else {
		        	response.put("mensaje", "El email ingresado es inválido");	
					return response;
		        }															
			}					
		} catch (Exception e) {
			response.put("mensaje", "Error registrando Usuario");
			return response;
		}
				
	}
	
	public Boolean validateEmail(User user) {
		List<User> userEmail;
		userEmail = userRepository.findByEmail(user.getEmail());
		if(userEmail.isEmpty()) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	

}
