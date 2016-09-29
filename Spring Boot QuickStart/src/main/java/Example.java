import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
/**
 * @author KENNY
 *
 */
@RestController
@EnableAutoConfiguration
public class Example 
{
	@RequestMapping("/")
	String home()
	{
		return "Hello World!";
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SpringApplication.run(Example.class,args);

	}

}
