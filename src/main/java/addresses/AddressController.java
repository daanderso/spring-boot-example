package addresses;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {

	// creating map
	Map<String, AddressBook> address = new HashMap<String, AddressBook>();

	public AddressController() {
		// constructing address book objects to place into the map
		AddressBook smith = new AddressBook("Smith", "4321 One Way Ln.", "123-456-789");
		AddressBook jackson = new AddressBook("Jackson","2400 Jackson St", "614-987-6544");
		
		//inserting into addresses map
		address.put("Smith", smith);
		address.put("Jackson", jackson);
	}
	
	@RequestMapping("/addresses")
	public String fetchAddr(Model model) {
		model.addAttribute("addressAsMap", address);
		model.addAttribute("addressAsCollection", address.values());
		return "addresses";
	}
	
	
	
}