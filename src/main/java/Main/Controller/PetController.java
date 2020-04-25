package Main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Main.Model.Pet;

@Controller
public class PetController {

	  @GetMapping("/")
	  public String petForm(Model model) {
	    model.addAttribute("pet", new Pet());
	    return "petForm";
	  }

	 @PostMapping("/")
	  public String petSubmit(@ModelAttribute Pet pet) {
	    return "petDetails";
	  }


}
