package ak.patel.piersquere.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "curd API for Signup User")
@RestController
public class SignUpController {

	@GetMapping("/api/register")
	@Operation(summary="This api is used to create new user",description="use Api to register new user")
	public String registerUser() {
		return "user register Success";
	}

}
